/**
 * Copyright 2024 Ant Group CO., Ltd.
 */

import type * as prisma from "@prisma/client";
import * as ts from "ohos-typescript";

import { createType } from "../../model/coref/type";
import * as util from "../util";

export function extractTypes(
  sourceFile: ts.SourceFile,
  typeChecker: ts.TypeChecker,
) {
  const typeMap = new Map<bigint, prisma.type_>();
  const nodeTypeMap = new Map<bigint, bigint>();

  util.forEachNode(sourceFile, (node: ts.Node) => {
    if (node.kind === ts.SyntaxKind.SourceFile) {
      return;
    }

    let tsType: ts.Type | undefined;
    try {
      tsType = typeChecker.getTypeAtLocation(node);
    } catch {
      // TODO: record error info
      return;
    }

    const name = typeChecker.typeToString(tsType);
    const corefType = createType(name);
    typeMap.set(corefType.id, corefType);
    nodeTypeMap.set(util.getCorefIdFromTsNodeInSameFile(node), corefType.id);
  });

  return {
    typeMap,
    nodeTypeMap,
  };
}
