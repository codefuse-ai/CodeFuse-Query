/**
 * Copyright 2024 Ant Group CO., Ltd.
 */

import type { number_of_lines } from "@prisma/client";

export type NumberOfLines = number_of_lines;

export function createNumberOfLines(
  id: bigint,
  lines: number,
  codeLines: number,
  commentLines: number,
): NumberOfLines {
  return {
    id,
    lines,
    code_lines: codeLines,
    comment_lines: commentLines,
  };
}
