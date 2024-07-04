#! npx ts-node

/**
 * Copyright 2022-2023 Ant Group CO., Ltd.
 *
 * @file 命令行入口
 * @author 张玉 <zy249870@antgroup.com>
 */

import { Command, InvalidArgumentError } from 'commander';

import { extract } from './core/index';
import { version } from '../package.json';

const program = new Command();

const DEFAULT_DB_FILE_PATH = 'coref_javascript_src.db';
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
    throw new InvalidArgumentError('Not a number.');
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

program.name('coref-js-src-extractor').version(version);

program
  .command('extract')
  .alias('e')
  .requiredOption('-s --src <srcPath>', 'the source path to extract')
  .option('-d --db <dbPath>', 'the db file path', DEFAULT_DB_FILE_PATH)
  .option(
    '-b --blacklist <blacklist...>',
    'the source path blacklist, which will be ignored when extracting',
  )
  .option('--use-gitignore', 'use the gitignore file to filter source files')
  .option('--extract-dist', 'extract dist files')
  .option('--extract-deps', 'extract dependencies')
  .option(
    '--file-size-limit <fileSizeLimit>',
    'the source file size limit in KB',
    parseFileSizeLimit,
    DEFAULT_FILE_SIZE_LIMIT,
  )
  .action(options => {
    extract(options.src, options.db, options);
  });

program.parse(process.argv);
