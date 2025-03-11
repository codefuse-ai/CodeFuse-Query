/**
 * Copyright 2024 Ant Group CO., Ltd.
 */

import { range } from "lodash";

import * as coref from "../../model/coref";

/**
 * 抽取每个 Location 对应的行数，代码行数和注释行数
 *
 * @param tokens
 * @param comments
 * @param locations
 * @returns NumberOfLines 对象数组
 */
export function extractNumberOfLines(
  locations: coref.Location[],
  codeTokenLocations: coref.Location[],
  commentLocations: coref.Location[],
): coref.NumberOfLines[] {
  const numberOfLinesList: coref.NumberOfLines[] = [];
  const codeLineSet = new Set<number>();
  const commentLineSet = new Set<number>();

  // 使用 tokens 统计代码行数，因为上层的 AST node 可能包含一整行的内容只存在非代码的 Token
  for (const codeTokenLocation of codeTokenLocations) {
    // 除了非代码的Token，如果一行存在 Token，则认为该行为代码行
    range(codeTokenLocation.start_line, codeTokenLocation.end_line + 1).forEach(
      (value) => {
        codeLineSet.add(value);
      },
    );
  }

  // 使用 comments 统计代码行数，如果一行存在 comment，则认为该行为注释行
  for (const commentLocation of commentLocations) {
    range(commentLocation.start_line, commentLocation.end_line + 1).forEach(
      (value) => {
        commentLineSet.add(value);
      },
    );
  }

  for (const location of locations) {
    const startLine = location.start_line;
    const endLine = location.end_line;

    const lines = endLine - startLine + 1;

    const codeLines = range(startLine, endLine + 1).reduce(
      (previousValue, currentValue) => {
        return codeLineSet.has(currentValue)
          ? previousValue + 1
          : previousValue;
      },
      0,
    );

    const commentLines = range(startLine, endLine + 1).reduce(
      (previousValue, currentValue) => {
        return commentLineSet.has(currentValue)
          ? previousValue + 1
          : previousValue;
      },
      0,
    );

    numberOfLinesList.push({
      id: location.id,
      lines,
      code_lines: codeLines,
      comment_lines: commentLines,
    });
  }

  return numberOfLinesList;
}
