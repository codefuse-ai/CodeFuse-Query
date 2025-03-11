/**
 * Copyright 2024 Ant Group CO., Ltd.
 */

import { SyntaxKind } from "ohos-typescript";

import { hashToInt64 } from "../../util";
import { Locatable } from "./locatable";

export type CommentKind =
  | SyntaxKind.SingleLineCommentTrivia
  | SyntaxKind.MultiLineCommentTrivia;

export interface Comment extends Locatable {
  kind: CommentKind;
}

export enum NodeCommentKind {
  LEADING = 0,
  TRAILING = 1,
}

export interface NodeComment {
  id: bigint;
  ast_node_id: bigint;
  index: number;
  comment_id: bigint;
  kind: NodeCommentKind;
}

export function computeCommentId(location_id: bigint) {
  const uri = `Comment:${location_id}`;
  return hashToInt64(uri);
}

export function createComment(kind: CommentKind, locationId: bigint): Comment {
  const id = computeCommentId(locationId);
  return {
    id,
    kind,
    location_id: locationId,
  };
}

export function createNodeComment(
  nodeId: bigint,
  commentId: bigint,
  index: number,
  kind: NodeCommentKind,
): NodeComment {
  const uri = `NodeComment:${nodeId}:${commentId}:${kind}`;
  const id = hashToInt64(uri);
  return {
    id,
    ast_node_id: nodeId,
    comment_id: commentId,
    index,
    kind,
  };
}
