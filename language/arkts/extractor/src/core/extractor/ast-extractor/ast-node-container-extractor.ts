/**
 * Copyright 2024 Ant Group CO., Ltd.
 */

import type * as ts from "ohos-typescript";
import { SyntaxKind } from "ohos-typescript";

import {
  CorefAstNodeContainer,
  createCfgEntryNode,
  createCfgExitNode,
} from "../../../model/coref";
import * as util from "../../util";
import { hashToInt64 } from "../../../util";

export function isAstNodeContainerKind(kind: SyntaxKind) {
  switch (kind) {
    case SyntaxKind.ModuleDeclaration:
    case SyntaxKind.SourceFile:
      return true;
  }

  return util.isFunctionLikeDeclarationKind(kind);
}

export function extractAstNodeContainerRelation(
  containerId: bigint,
  container: ts.Node,
  corefAstNodeContainer: CorefAstNodeContainer,
) {
  const containerKind = container.kind;
  if (!isAstNodeContainerKind(containerKind)) {
    return;
  }

  // AST node and container relations
  util.forEachNode(container, (node) => {
    // Do not process the container itself
    if (node === container) {
      return;
    }

    corefAstNodeContainer.astNodeContainerRelations.push({
      ast_node_id: util.getCorefIdFromTsNodeInSameFile(node),
      container_id: containerId,
    });

    // Do not process a descendant container
    if (isAstNodeContainerKind(node.kind)) {
      return false;
    }
  });

  // Synthetic CFG Nodes
  corefAstNodeContainer.cfgEntryNodes.push(createCfgEntryNode(containerId));
  corefAstNodeContainer.cfgExitNodes.push(createCfgExitNode(containerId));
}
