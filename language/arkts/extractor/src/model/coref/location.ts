/**
 * Copyright 2024 Ant Group CO., Ltd.
 */

import { hashToInt64 } from "../../util";
import { extendedTs } from "..";
import { assert } from "console";
import type { location } from "@prisma/client";

export type Location = location;

/**
 * 根据源码 string 的位置 index 获取行号
 *
 * @param pos 在源码 string 中的 index
 * @param lineStarts 每行代码开始的 index
 * @returns 行号
 */
function getLineFromPos(pos: number, lineStarts: readonly number[]): number {
  let low = 0,
    high = lineStarts.length - 1;
  while (low < high) {
    const mid = high - ((high - low) >> 1); // Get middle, rounding up.
    const startOfLine = lineStarts[mid];
    if (startOfLine <= pos) {
      low = mid;
    } else {
      high = mid - 1;
    }
  }
  return low;
}

function getLineAndColumnFromPos(pos: number, lineStarts: readonly number[]) {
  const line = getLineFromPos(pos, lineStarts) + 1;
  const column = pos - lineStarts[line - 1] + 1;

  return {
    line,
    column,
  };
}

export function computeLocationId(fileId: bigint, start: number, end: number) {
  const uri = `Location:${fileId}:(${start}-${end})`;
  return hashToInt64(uri);
}

export function createLocation(
  sourceFile: extendedTs.SourceFile,
  start: number,
  end: number,
): Location {
  const lineStarts = sourceFile.getLineStarts();
  const { line: startLine, column: startColumn } = getLineAndColumnFromPos(
    start,
    lineStarts,
  );
  const { line: endLine, column: endColumn } = getLineAndColumnFromPos(
    end,
    lineStarts,
  );

  const file = sourceFile.$corefFile;
  assert(file !== undefined);

  const fileId = file.id;
  const id = computeLocationId(fileId, start, end);

  return {
    id,
    file_id: fileId,
    start: start,
    start_line: startLine,
    start_column: startColumn,
    end: end,
    end_line: endLine,
    end_column: endColumn,
  };
}
