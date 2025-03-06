/**
 * Copyright 2024 Ant Group CO., Ltd.
 */

import { SyntaxKind } from "ohos-typescript";

import { HasKind } from "./base-model";
import { Locatable } from "./locatable";
import { hashToInt64 } from "../../util";

export interface AstNode extends HasKind, Locatable {
  parent_id?: bigint;
  parent_kind?: number;
  index?: number;
}

export function computeAstNodeId(kind: SyntaxKind, locationId: bigint) {
  const uri = `AstNode:${kind}:${locationId}`;
  return hashToInt64(uri);
}

export function createAstNode(kind: SyntaxKind, locationId: bigint): AstNode {
  const id = computeAstNodeId(kind, locationId);
  return {
    id,
    kind,
    location_id: locationId,
  };
}
