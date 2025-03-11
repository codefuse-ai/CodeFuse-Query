/**
 * Copyright 2024 Ant Group CO., Ltd.
 */

import { hashToInt64 } from "../../util";

export interface SyntheticCfgNode {
  id: bigint;
  ast_node_id: bigint;
}

export const enum SyntheticCfgNodeKind {
  Entry,
  Exit,
}

/**
 * Create a synthetic CFG node, which is a entry or exit node.
 */
function createSyntheticCfgNode(
  astNodeId: bigint,
  kind: SyntheticCfgNodeKind,
): SyntheticCfgNode {
  const uri = `SyntheticCfgNode:${kind}:${astNodeId}`;
  const id = hashToInt64(uri);
  return {
    id,
    ast_node_id: astNodeId,
  };
}

/**
 * Create a CFG entry node
 */
export function createCfgEntryNode(astNodeId: bigint) {
  return createSyntheticCfgNode(astNodeId, SyntheticCfgNodeKind.Entry);
}

/**
 * Create a CFG exit node
 */
export function createCfgExitNode(astNodeId: bigint) {
  return createSyntheticCfgNode(astNodeId, SyntheticCfgNodeKind.Exit);
}
