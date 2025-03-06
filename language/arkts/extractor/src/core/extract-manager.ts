/* eslint-disable @typescript-eslint/no-explicit-any */
/**
 * Copyright 2024 Ant Group CO., Ltd.
 */

import * as fs from "fs";
import * as os from "os";
import * as path from "path";

import { range } from "lodash";
import * as ts from "ohos-typescript";
import { Pool, Worker, spawn } from "threads";

import { version } from "../../package.json";
import * as dal from "../dal/db";
import { createPrismaClient } from "../dal/db/prisma-client";
import { coref, extendedTs } from "../model";
import type { ExtractOptions } from "../types";
import { extendArray } from "../util";
import * as extractor from "./extractor/file-extractor";
import * as util from "./util";

// Default DB file name
export const DEFAULT_DB_FILE_NAME = "coref_arkts_src.db";

const compilerOptions: ts.CompilerOptions = {
  allowJs: true,
  experimentalDecorators: true,
  jsx: ts.JsxEmit.Preserve,
  noResolve: false,
};

const DEFAULT_BLACKLIST: readonly string[] = [".git"];

/**
 * Init ignore functions
 *
 * @param extractedPath
 * @param options
 * @returns
 */
function initIgnoreFunctions(
  extractedPath: string,
  options?: ExtractOptions,
): ((fileOrDirPath: string) => coref.IgnoredPath | null)[] {
  const ignoreFunctions = [];

  // use blacklist to ignore files
  const blacklist: string[] = [];
  extendArray(blacklist, DEFAULT_BLACKLIST);

  if (options?.blacklist && options.blacklist.length > 0) {
    extendArray(blacklist, options.blacklist);
  }
  // TODO: Load or download dependencies if they don't exist.
  if (!options?.extractDeps) {
    blacklist.push("node_modules", "oh_modules");
  }

  if (blacklist.length > 0) {
    ignoreFunctions.push(
      util.createIgnoreFunctionByBlacklist(extractedPath, blacklist),
    );
  }

  if (options?.useGitignore) {
    // use ".gitignore" to ignore files
    // TODO: most repos only have one ".gitignore" in the root directory, thus currently only the root ".gitignore" is used.
    // However, there may be more than one ".gitignore".
    // ref：https://git-scm.com/docs/gitignore
    const gitignorePath = path.join(extractedPath, ".gitignore");
    ignoreFunctions.push(util.createIgnoreFunctionByGitignore(gitignorePath));
  }

  if (!options?.extractDist) {
    // ignore files for distribution or minified files
    ignoreFunctions.push(util.distIgnoreFunction);
  }

  // ignore super big files
  ignoreFunctions.push(
    util.createFileSizeIgnoreFunction(options?.fileSizeLimit),
  );

  return ignoreFunctions;
}

export async function extract(
  extractedPath: string,
  dbPath: string,
  options?: ExtractOptions,
) {
  let rootPath = path.dirname(path.dirname(require.main?.filename as string));
  // 编译为 js 后代码在 dist 目录下，因此项目根目录是 dist 的父目录
  if (path.basename(rootPath) === "dist") {
    rootPath = path.dirname(rootPath);
  }

  // dbPath 默认为工作目录下的 coref_js_src.db
  if (!dbPath) {
    dbPath = DEFAULT_DB_FILE_NAME;
  }
  dbPath = path.resolve(dbPath);

  if (!fs.existsSync(extractedPath)) {
    console.error("The extracted path doesn't exist.");
    process.exit(1);
  }
  extractedPath = path.resolve(extractedPath);

  const initDbPath = path.join(rootPath, "init.db");

  // Create the directory of db file if it doesn't exist.
  const dbDirPath = path.dirname(dbPath);
  await fs.promises.mkdir(dbDirPath, { recursive: true });
  // const mkdirReturnValue = shell.mkdir("-p", dbDirPath);
  // if (mkdirReturnValue.code !== 0) {
  //   console.error(mkdirReturnValue.stderr);
  //   console.error(`Cannot create db file directory: ${dbDirPath}`);
  //   process.exit(1);
  // }

  await fs.promises.cp(initDbPath, dbPath);
  // const cpReturnValue = shell.cp(initDbPath, dbPath);
  // if (cpReturnValue.code !== 0) {
  //   console.error(cpReturnValue.stderr);
  //   console.error(`Cannot create sqlite db file: ${dbPath}`);
  //   process.exit(1);
  // }

  const prismaClient = createPrismaClient(dbPath);

  // ATTENTION: Write data with prisma in the main thread first to avoid data racing
  // when loading the prisma native addon by pkg.
  await prismaClient.metadata.create({
    data: {
      id: 0n,
      version,
      created_time: new Date(),
    },
  });

  // Due to the limitation of IO, higher concurrency does not necessarily improve performance.
  // The highest concurrency is set to 6.
  const cpuCount = os.cpus().length;
  const threadCount = options?.debug ? 1 : cpuCount < 6 ? cpuCount : 6;

  const tmpDbDirPath = path.join(dbDirPath, "tmp");
  await fs.promises.mkdir(tmpDbDirPath, { recursive: true });
  // const mkTmpDbdirReturnValue = shell.mkdir("-p", tmpDbDirPath);
  // if (mkTmpDbdirReturnValue.code !== 0) {
  //   console.error(mkTmpDbdirReturnValue.stderr);
  //   console.error(`Cannot create tmp db file directory: ${tmpDbDirPath}`);
  //   process.exit(1);
  // }

  const tmpDbPaths = range(0, threadCount).map((id) =>
    path.join(tmpDbDirPath, `${id}.db`),
  );

  // Initialize all workers first,
  // since lazy initialization may cause timeout when spawning threads.
  const workers = await Promise.all(
    range(0, threadCount).map(async (i) => {
      const tmpDbPath = tmpDbPaths[i];
      const worker = await spawn(new Worker("./worker"));
      // A worker can only be used after initializing the prisma client
      await fs.promises.copyFile(initDbPath, tmpDbPath);
      await worker.initPrismaClient(tmpDbPath);
      return worker;
    }),
  );

  /**
   * Create the spawn-worker function
   *
   * @returns the spawn-worker function
   */
  function createSpawnWorkerFunction() {
    let i = 0;
    return async () => workers[i++];
  }

  // Pool size must be the same with the count of tmp db files.
  const pool = Pool(createSpawnWorkerFunction(), threadCount);

  const extractedPathStat = await fs.promises.stat(extractedPath);
  let extractedFilePaths: string[] = [];
  let ignoredPaths: coref.IgnoredPath[] = [];
  let projectPath: string | undefined;
  if (extractedPathStat.isDirectory()) {
    try {
      const ignoreFunctions = initIgnoreFunctions(extractedPath, options);
      ({ filePaths: extractedFilePaths, ignoredPaths } = util.listAllFiles(
        extractedPath,
        /*extensions*/ Object.values(ts.Extension),
        ignoreFunctions,
      ));
    } catch (e) {
      console.error(e);
      console.error(
        `Fail to list files in the extracted directory: ${extractedPath}`,
      );
      process.exit(1);
    }

    await prismaClient.ignored_path.createMany({
      data: ignoredPaths.map(({ id, ignoreKind, path, pathKind }) => ({
        id,
        ignore_kind: ignoreKind,
        path,
        path_kind: pathKind,
      })),
    });

    projectPath = extractedPath;
  } else {
    extractedFilePaths = [extractedPath];
    projectPath = undefined;
  }

  // Set packageManagerType
  compilerOptions.packageManagerType = options?.packageManagerType
    ? options.packageManagerType
    : "ohpm";

  const pathsFilePath = options?.paths
    ? options.paths
    : path.join(rootPath, "paths.json");
  try {
    let pathsConfig: { [key: string]: string[] } = JSON.parse(
      await fs.promises.readFile(pathsFilePath, "utf-8"),
    );

    if (!options?.paths) {
      // Convert the relative paths in paths.json to absolute paths.
      pathsConfig = Object.fromEntries(
        Object.entries(pathsConfig).map(([module, paths]) => [
          module,
          paths.map((modulePath) => path.join(rootPath, modulePath)),
        ]),
      );
    }

    compilerOptions.paths = pathsConfig;
  } catch (e) {
    console.error(e);
  }

  const typescriptLibPath = path.join(rootPath, "sdk", "typescript")
  let typescriptLibFiles: string[] = [];
  ({ filePaths: typescriptLibFiles, ignoredPaths } = util.listAllFiles(
    typescriptLibPath,
    /*extensions*/ Object.values(ts.Extension),
  ));
  console.log("ts lib add")
  // actualAnalysisFilePaths is real ts program includes extractedFilePaths + ts native lib + dependency
  let actualAnalysisFilePaths: string[] = [];
  actualAnalysisFilePaths.push(...extractedFilePaths);
  actualAnalysisFilePaths.push(...typescriptLibFiles);
  

  let dependencyPaths: string[] = [];
  if (options?.dependency && options.dependency.length > 0) {
    console.log("dep add")
    options.dependency.forEach( (inputPath) => {
      inputPath = path.resolve(extractedPath, inputPath)
      if (fs.existsSync(inputPath) && fs.lstatSync(inputPath).isDirectory()) {
        let tmp: string[] = [];
        ({ filePaths: tmp, ignoredPaths } = util.listAllFiles(
          inputPath,
          /*extensions*/ Object.values(ts.Extension),
        ));
        dependencyPaths.push(...tmp);
      } else {
        dependencyPaths.push(inputPath);
      }
    })
  }

  actualAnalysisFilePaths.push(...dependencyPaths);

  const program = ts.createProgram(actualAnalysisFilePaths, compilerOptions);
  // 使用 getTypeChecker 确保 Node 中的属性都初始化
  program.getTypeChecker();

  const projectSymbolIdSet = new Set<bigint>();
  const projectTypeIdSet = new Set<bigint>();

  function extractFileTask(
    filePath: string,
    // enabledFrameworkExtractors: framework.FrameworkExtractorBase[],
  ): dal.Coref | undefined {
    let dalCoref: dal.Coref | undefined;

    const sourceFile = program.getSourceFile(filePath) as extendedTs.SourceFile;
    if (!sourceFile) {
      return dalCoref;
    }

    console.log(`Extracting ${filePath}...`);

    let success = true;
    try {
      const {
        symbolMap,
        nodeSymbolMap,
        shorthandAssignmentValueSymbolMap,
        typeMap,
        nodeTypeMap,
        ...otherCoref
      } = extractor.extractFile(sourceFile, program, projectPath, options);

      // Collect new symbols
      const symbols: coref.Symbol[] = [];
      symbolMap.forEach((symbol, id) => {
        if (!projectSymbolIdSet.has(id)) {
          symbols.push(symbol);
          projectSymbolIdSet.add(id);
        }
      });

      // Collect new types
      const types: dal.Coref["types"] = [];
      typeMap.forEach((type, id) => {
        if (!projectTypeIdSet.has(id)) {
          types.push(type);
          projectTypeIdSet.add(id);
        }
      });

      dalCoref = {
        ...otherCoref,

        symbols,
        astNodeSymbols: Array.from(nodeSymbolMap.entries()).map(
          ([ast_node_id, symbol_id]) => ({ ast_node_id, symbol_id }),
        ),
        shorthandPropertyAssignmentValueSymbols: Array.from(
          shorthandAssignmentValueSymbolMap.entries(),
        ).map(([shorthand_property_assignment_id, symbol_id]) => ({
          shorthand_property_assignment_id,
          symbol_id,
        })),
        types,
        astNodeTypes: Array.from(nodeTypeMap.entries()).map(
          ([ast_node_id, type_id]) => ({
            ast_node_id,
            type_id,
          }),
        ),
      };
    } catch (e) {
      console.error(e);
      success = false;
    }

    if (success) {
      console.log(`Finished ${filePath}`);
    } else {
      console.error(`Fail to extract ${filePath}`);
    }

    return dalCoref;
  }

  const executingTasks: Promise<any>[] = [];

  async function submitPersistTasks(dalCoref: dal.Coref | undefined) {
    const splitCorefs = dalCoref ? dal.splitCoref(dalCoref) : [];
    for (const splitCoref of splitCorefs) {
      while (executingTasks.length >= threadCount) {
        await Promise.race(executingTasks);
      }

      const task = pool.queue((worker) => {
        return worker.persistCoref(splitCoref);
      });
      executingTasks.push(task as any);
      task.then(() =>
        executingTasks.splice(executingTasks.indexOf(task as any), 1),
      );
    }
  }

  const extractedFileIds = new Set<bigint>();

  for (const filePath of extractedFilePaths) {
    const dalCoref = extractFileTask(filePath);
    // try deleting files that will submit to the database in this loop
    dalCoref?.files?.forEach((file) => {
      extractedFileIds.add(file.id);
    });
    await submitPersistTasks(dalCoref);
  }

  // Extract the referenced files
  console.log("Extracting the referenced files...");
  // reference map maybe changed during extraction
  // we only need depth=1 reference, so we store depth=1 reference here
  const files = Array.from(util.referencedCorefFileMap.values()).filter(
    (file) => !extractedFileIds.has(file.id),
  );

  // extract referenced files
  for (const file of files) {
    const dalCoref = extractFileTask(file.relative_path);
    await submitPersistTasks(dalCoref);
  }
  if (extractedFilePaths.length > 0) {
    await pool.settled();
    await pool.terminate(true);
  } else {
    console.log("No files to extract, please check extracting path");
    await pool.terminate(true);
  }
  // Merge db files
  console.log("Merging db files...");
  for (const tmpDbPath of tmpDbPaths) {
    await dal.mergeDb(prismaClient, tmpDbPath);
  }

  // Remove the tmp db directory
  await fs.promises.rm(tmpDbDirPath, { recursive: true, force: true });
}
