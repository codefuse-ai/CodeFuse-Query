#! npx ts-node

/**
 * Copyright 2024 Ant Group CO., Ltd.
 *
 * @file The main file.
 */

import { Command, InvalidArgumentError } from "commander";

import { version } from "../package.json";
import { extract } from "./core/index";
import type { ExtractOptions } from "./types";

const program = new Command();

const DEFAULT_DB_FILE_PATH = "coref_javascript_src.db";
const DEFAULT_FILE_SIZE_LIMIT = 1024;

/**
 * Custom float options or arguments parser
 *
 * @param value
 * @param previous
 * @returns
 */
// eslint-disable-next-line @typescript-eslint/no-unused-vars
function customParseFloat(value: string, previous: number): number {
  const parsedValue = parseFloat(value);

  if (isNaN(parsedValue)) {
    throw new InvalidArgumentError("Not a number.");
  }

  return parsedValue;
}

/**
 * Parse file size limit
 *
 * @param value
 * @param previous
 * @returns
 */
function parseFileSizeLimit(value: string, previous: number): number {
  const parsedValue = customParseFloat(value, previous);
  if (parsedValue <= 0) {
    throw new InvalidArgumentError(
      "The 'fileSizeLimit' should be greater than 0.",
    );
  }

  return parsedValue;
}

program.name("coref-js-src-extractor").version(version);

program
  .command("extract")
  .alias("e")
  .requiredOption("-s --src <srcPath>", "the source path to extract")
  .option("-d --db <dbPath>", "the db file path", DEFAULT_DB_FILE_PATH)
  .option(
    "-b --blacklist <blacklist...>",
    "the source path blacklist, which will be ignored when extracting",
  )
  .option("--use-gitignore", "use the gitignore file to filter source files")
  .option("--extract-text", "extract the text of all AST nodes")
  .option("--extract-dist", "extract dist files")
  .option("--extract-deps", "extract dependencies")
  .option(
    "-dep --dependency <dependency...>",
    "source code dependency directory, which will be extracted when necessary",
  )
  .option(
    "--file-size-limit <fileSizeLimit>",
    "the source file size limit in KB",
    parseFileSizeLimit,
    DEFAULT_FILE_SIZE_LIMIT,
  )
  .option("--paths <paths>", "json file path, used as tsc paths re-map info")
  .option(
    "--package-manager-type <packageManagerType>",
    "packageManagerType in compilerOptions",
  )
  .option("--debug", "enable debug mode")
  .action((options: ExtractOptions) => {
    extract(options.src, options.db, options);
  });

program.parse(process.argv);
