/**
 * Copyright 2024 Ant Group CO., Ltd.
 */

import * as ts from "ohos-typescript";

import { coref } from "../../model";
import * as util from "../util";

/**
 * Extract symbols and node symbol relations
 *
 * @param tsSourceFile
 * @param projectPath
 */
export function extractSymbols(
  tsSourceFile: ts.SourceFile,
  typeChecker: ts.TypeChecker,
  projectPath?: string | undefined,
) {
  const symbolMap = new Map<bigint, coref.Symbol>();
  const nodeSymbolMap = new Map<bigint, bigint>();
  const shorthandAssignmentValueSymbolMap = new Map<bigint, bigint>();

  util.forEachNode(tsSourceFile, (tsNode: ts.Node) => {
    const symbol = util.createSymbol(tsNode, typeChecker, projectPath);
    if (symbol === undefined) {
      return;
    }

    const astNodeId = util.getCorefIdFromTsNodeInSameFile(tsNode);

    symbolMap.set(symbol.id, symbol);
    nodeSymbolMap.set(astNodeId, symbol.id);

    if (tsNode.kind === ts.SyntaxKind.ShorthandPropertyAssignment) {
      const valueSymbolId = util.getShortHandAssignmentValueSymbolId(
        tsNode,
        typeChecker,
        projectPath,
      );
      if (valueSymbolId !== undefined) {
        shorthandAssignmentValueSymbolMap.set(astNodeId, valueSymbolId);
      }
    }
  });

  return {
    symbolMap,
    nodeSymbolMap,
    shorthandAssignmentValueSymbolMap,
  };
}
