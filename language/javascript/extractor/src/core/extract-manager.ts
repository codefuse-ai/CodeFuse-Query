/* eslint-disable @typescript-eslint/no-explicit-any */
import * as fs from 'fs';
import * as os from 'os';
import * as path from 'path';

import { range } from 'lodash';
import * as shell from 'shelljs';
import { Pool, Worker, spawn } from 'threads';
import * as ts from 'typescript';

import * as framework from './framework';
import * as extractor from './extractor';
import * as util from './util';
import * as dal from '../dal/db';
import { createPrismaClient } from '../dal/db/prisma-client';
import { coref, extendedTs } from '../model';
import { version } from '../../package.json';

// Default DB file name
export const DEFAULT_DB_FILE_NAME = 'coref_javascript_src.db';

export const compilerOptions: ts.CompilerOptions = {
  allowJs: true,
  experimentalDecorators: true,
  experimentalAsyncFunctions: true,
  jsx: ts.JsxEmit.Preserve,
  noResolve: true,
  allowNonTsExtensions: true
};

const DEFAULT_BLACKLIST = ['.git'];

const CUSTOM_HANDLE_FILE_EXTENSIONS = [".ets"];

interface ExtractOptions {
  blacklist?: string[];
  useGitignore?: boolean;
  extractDist?: boolean;
  extractDeps?: boolean;
  fileSizeLimit?: number;
}

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
  let blacklist = DEFAULT_BLACKLIST;
  if (options?.blacklist) {
    blacklist = blacklist.concat(options.blacklist);
  }
  // TODO: Load or download dependencies if they don't exist.
  if (!options?.extractDeps) {
    blacklist.push('node_modules');
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
    const gitignorePath = path.join(extractedPath, '.gitignore');
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
  if (path.basename(rootPath) === 'dist') {
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

  const initDbPath = path.join(rootPath, 'init.db');

  // Create the directory of db file if it doesn't exist.
  const dbDirPath = path.dirname(dbPath);
  const mkdirReturnValue = shell.mkdir('-p', dbDirPath);
  if (mkdirReturnValue.code !== 0) {
    console.error(mkdirReturnValue.stderr);
    console.error(`Cannot create db file directory: ${dbDirPath}`);
    process.exit(1);
  }

  const cpReturnValue = shell.cp(initDbPath, dbPath);
  if (cpReturnValue.code !== 0) {
    console.error(cpReturnValue.stderr);
    console.error(`Cannot create sqlite db file: ${dbPath}`);
    process.exit(1);
  }

  const prismaClient = createPrismaClient(dbPath);

  // ATTENTION: Write data with prisma in the main thread first to avoid data racing
  // when loading the prisma native addon by pkg.
  await dal.createMetadata(prismaClient, {
    oid: 0n,
    version,
    created_time: new Date(),
  });

  // Due to the limitation of IO, higher concurrency does not necessarily improve performance.
  // The highest concurrency is set to 6.
  const cpuCount = os.cpus().length;
  const threadCount = cpuCount < 6 ? cpuCount : 6;

  const tmpDbDirPath = path.join(dbDirPath, 'tmp');
  const mkTmpDbdirReturnValue = shell.mkdir('-p', tmpDbDirPath);
  if (mkTmpDbdirReturnValue.code !== 0) {
    console.error(mkdirReturnValue.stderr);
    console.error(`Cannot create tmp db file directory: ${tmpDbDirPath}`);
    process.exit(1);
  }

  const tmpDbPaths = range(0, threadCount).map(id =>
    path.join(tmpDbDirPath, `${id}.db`),
  );

  // Initialize all workers first,
  // since lazy initialization may cause timeout when spawning threads.
  const workers = await Promise.all(
    range(0, threadCount).map(async i => {
      const tmpDbPath = tmpDbPaths[i];
      const worker = await spawn(new Worker('./worker'));
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

  const extractedPathStat = fs.statSync(extractedPath);
  let extractedFilePaths: string[] = [];
  let ignoredPaths: coref.IgnoredPath[] = [];
  let projectPath: string | undefined;
  if (extractedPathStat.isDirectory()) {
    try {
      let fileExtensions: string[] = Object.values<string>(ts.Extension).concat(CUSTOM_HANDLE_FILE_EXTENSIONS);
      const ignoreFunctions = initIgnoreFunctions(extractedPath, options);
      ({ filePaths: extractedFilePaths, ignoredPaths } = util.listAllFiles(
        extractedPath,
        /*extensions*/ fileExtensions,
        ignoreFunctions,
      ));
    } catch (e) {
      console.error(e);
      console.error(
        `Fail to list files in the extracted directory: ${extractedPath}`,
      );
      process.exit(1);
    }

    const ignoredPathCreations = dal.createIgnoredPaths(
      prismaClient,
      ignoredPaths,
    );
    await dal.transaction(prismaClient, ignoredPathCreations);

    projectPath = extractedPath;
  } else {
    extractedFilePaths = [extractedPath];
    projectPath = undefined;
  }

  const program = ts.createProgram(extractedFilePaths, compilerOptions);
  // 使用 getTypeChecker 确保 Node 中的属性都初始化
  program.getTypeChecker();

  // eslint-disable-next-line @typescript-eslint/no-explicit-any
  // let creations: PrismaPromise<any>[] = [];
  const projectSymbolOidSet = new Set<bigint>();
  const projectNodeSymbolOidSet = new Set<bigint>();
  const projectCallSiteOidSet = new Set<bigint>();

  function extractFileTask(
    filePath: string,
    enabledFrameworkExtractors: framework.FrameworkExtractorBase[],
  ): dal.Coref | undefined {
    let dalCoref: dal.Coref | undefined;

    const sourceFile = program.getSourceFile(filePath) as extendedTs.SourceFile;
    if (!sourceFile) {
      return dalCoref;
    }

    console.log(`Extracting ${filePath}...`);

    let success = true;
    try {
      const corefData = extractor.extractFile(sourceFile, program, projectPath);
      const frameworkCorefData = extractor.extractFileFrameworks(
        enabledFrameworkExtractors,
        sourceFile,
        program,
        projectPath,
      );

      // creations 中加入抽取本文件后所有的数据创建，等达到一定数量后一起提交
      // const corefCreations = dal.createCoref(prismaClient, corefData);

      // Collect new symbols
      const symbols: coref.Symbol[] = [];
      const symbolMap = new Map([
        ...corefData.symbolMap,
        ...frameworkCorefData.symbolMap,
      ]);
      symbolMap.forEach((symbol, oid) => {
        if (!projectSymbolOidSet.has(oid)) {
          symbols.push(symbol);
          projectSymbolOidSet.add(oid);
        }
      });

      const nodeSymbolMap = new Map(
        [
          ...corefData.nodeSymbolMap,
          ...frameworkCorefData.nodeSymbolMap,
        ].filter(
          // No need to update projectNodeSymbolOidSet,
          // since the node_oids in the nodeSymbolMaps of different files wouldn't be duplicate.
          ([node_oid]) => !projectNodeSymbolOidSet.has(node_oid),
        ),
      );

      const callSiteMap = new Map(
        [...corefData.callSiteMap, ...frameworkCorefData.callSiteMap].filter(
          // No need to update projectCallSiteOidSet,
          // since the invoke_expression_oid in the callSiteMaps of different files wouldn't be duplicate.
          ([invoke_expression_oid]) =>
            !projectCallSiteOidSet.has(invoke_expression_oid),
        ),
      );

      dalCoref = {
        topLevels: corefData.topLevels.map(topLevel => ({
          oid: topLevel.oid,
          kind: topLevel.kind,
          location_oid: topLevel.location.oid,
        })),
        nodes: corefData.nodes.map(node => ({
          oid: node.oid,
          kind: node.kind,
          parent_oid: node.parent_oid as bigint,
          index: node.index as number,
          location_oid: node.location.oid,
        })),
        comments: corefData.comments.map(comment => ({
          oid: comment.oid,
          kind: comment.commentKind,
          location_oid: comment.location.oid,
        })),
        nodeComments: corefData.nodeComments.map(nodeComment => ({
          oid: nodeComment.oid,
          node_oid: nodeComment.nodeOid,
          comment_oid: nodeComment.commentOid,
          type: nodeComment.type,
        })),
        bindingElementPropertyNames: corefData.bindingElements
          .filter(
            bindingElement => bindingElement.propertyNameOid !== undefined,
          )
          .map(bindingElement => ({
            oid: bindingElement.oid,
            property_name_oid: bindingElement.propertyNameOid as bigint,
          })),
        bindingElementNames: corefData.bindingElements.map(bindingElement => ({
          oid: bindingElement.oid,
          name_oid: bindingElement.nameOid,
        })),
        bindingElementInitializers: corefData.bindingElements
          .filter(bindingElement => bindingElement.initializerOid !== undefined)
          .map(bindingElement => ({
            oid: bindingElement.oid,
            initializer_oid: bindingElement.initializerOid as bigint,
          })),
        classLikeDeclarations: corefData.classLikeDeclarations.map(
          classLikeDeclaration => ({
            oid: classLikeDeclaration.oid,
            kind: classLikeDeclaration.kind,
            name: classLikeDeclaration.name as string,
          }),
        ),
        functionLikeDeclarations: corefData.functionLikeDeclarations.map(
          functionLikeDeclaration => ({
            oid: functionLikeDeclaration.oid,
            kind: functionLikeDeclaration.kind,
            name: functionLikeDeclaration.name as string,
          }),
        ),
        functionEnclosingNodes: corefData.functionEnclosingNodes.map(
          functionEnclosingNode => ({
            node_oid: functionEnclosingNode.nodeOid,
            function_oid: functionEnclosingNode.functionOid,
          }),
        ),
        literals: corefData.literals.map(literal => ({
          oid: literal.oid,
          value: literal.value,
        })),
        modifiers: corefData.modifiers.map(modifier => ({
          oid: modifier.oid,
          index: modifier.modifierIndex,
        })),
        cfgEntryNodes: corefData.cfgEntryNodes.map(({ oid, astNodeOid }) => ({
          oid,
          ast_node_oid: astNodeOid,
        })),
        cfgExitNodes: corefData.cfgExitNodes.map(({ oid, astNodeOid }) => ({
          oid,
          ast_node_oid: astNodeOid,
        })),
        locations: corefData.locations.map(location => ({
          oid: location.oid,
          file_oid: location.file.oid,
          start_line_number: location.start.line,
          start_column_number: location.start.column,
          end_line_number: location.end.line,
          end_column_number: location.end.column,
          text: location.text,
        })),
        files: corefData.files.map(file => ({
          oid: file.oid,
          name: file.name,
          extension: file.extension,
          relative_path: file.relativePath,
          location_oid: file.locationOid as bigint,
        })),
        numbersOfLines: corefData.numbersOfLines.map(numberOfLines => ({
          location_oid: numberOfLines.locationOid,
          lines: numberOfLines.lines,
          code_lines: numberOfLines.codeLines,
          comment_lines: numberOfLines.commentLines,
        })),
        symbols,
        nodeSymbols: Array.from(nodeSymbolMap.entries()).map(
          ([node_oid, symbol_oid]) => ({ node_oid, symbol_oid }),
        ),
        shorthandAssignmentValueSymbols: Array.from(
          corefData.shorthandAssignmentValueSymbolMap.entries(),
        ).map(([node_oid, symbol_oid]) => ({ node_oid, symbol_oid })),
        callSites: Array.from(callSiteMap.entries()).map(
          ([invoke_expression_oid, callee_oid]) => ({
            invoke_expression_oid,
            callee_oid,
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

  const enabledFrameworkExtractors = projectPath
    ? await framework.getEnabledFrameworkExtractors(
        framework.frameworkExtractors,
        projectPath,
      )
    : [];

  let projectDalCoref: dal.Coref | undefined;

  // Extract project COREF from frameworks.
  if (projectPath && enabledFrameworkExtractors) {
    const frameworkCoref = extractor.extractProjectFrameworks(
      enabledFrameworkExtractors,
      program,
      projectPath,
    );

    if (frameworkCoref) {
      for (const oid of frameworkCoref.symbolMap.keys()) {
        projectSymbolOidSet.add(oid);
      }
      for (const node_oid of frameworkCoref.nodeSymbolMap.keys()) {
        projectNodeSymbolOidSet.add(node_oid);
      }
      for (const invoke_expression_oid of frameworkCoref.callSiteMap.keys()) {
        projectCallSiteOidSet.add(invoke_expression_oid);
      }

      projectDalCoref = {
        symbols: Array.from(frameworkCoref.symbolMap.values()),
        nodeSymbols: Array.from(frameworkCoref.nodeSymbolMap.entries()).map(
          ([node_oid, symbol_oid]) => ({ node_oid, symbol_oid }),
        ),
        callSites: Array.from(frameworkCoref.callSiteMap.entries()).map(
          ([invoke_expression_oid, callee_oid]) => ({
            invoke_expression_oid,
            callee_oid,
          }),
        ),
      };
    }
  }

  const executingTasks: Promise<any>[] = [];

  async function submitPersistTasks(dalCoref: dal.Coref | undefined) {
    const splitCorefs = dalCoref ? dal.splitCoref(dalCoref) : [];
    for (const splitCoref of splitCorefs) {
      while (executingTasks.length >= threadCount) {
        await Promise.race(executingTasks);
      }

      const task = pool.queue(worker => {
        return worker.persistCoref(splitCoref);
      });
      executingTasks.push(task as any);
      task.then(() =>
        executingTasks.splice(executingTasks.indexOf(task as any), 1),
      );
    }
  }

  if (projectDalCoref) {
    await submitPersistTasks(projectDalCoref);
  }

  for (const filePath of extractedFilePaths) {
    const dalCoref = extractFileTask(filePath, enabledFrameworkExtractors);
    await submitPersistTasks(dalCoref);
  }

  await pool.settled(true);
  await pool.terminate();

  // Merge db files
  console.log('Merging db files...');
  for (const tmpDbPath of tmpDbPaths) {
    await dal.mergeDb(prismaClient, tmpDbPath);
  }

  // Remove the tmp db directory
  await fs.promises.rm(tmpDbDirPath, { recursive: true, force: true });
}
