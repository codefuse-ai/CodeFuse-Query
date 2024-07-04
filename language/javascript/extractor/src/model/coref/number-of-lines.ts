

export interface NumberOfLines {
  locationOid: bigint;
  lines: number;
  codeLines: number;
  commentLines: number;
}

export function createNumberOfLines(
  locationOid: bigint,
  lines: number,
  codeLines: number,
  commentLines: number,
): NumberOfLines {
  return {
    locationOid,
    lines,
    codeLines,
    commentLines,
  };
}
