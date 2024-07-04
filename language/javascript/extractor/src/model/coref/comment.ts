

import * as ts from 'typescript';

import { Location } from './location';
import { Node, createNode } from './node';
import { hashToInt64 } from '../../util';

export enum CommentKind {
  /** A C++-style line comment starting with two slashes. */
  LINE,

  /** A C-style block comment starting with slash-star and ending with star-slash. */
  BLOCK,

  /** The start of an HTML comment (<code>&lt;!--</code>). */
  HTML_START,

  /** The end of an HTML comment (<code>--&gt;</code>). */
  HTML_END,
}

export type CommentSyntaxKind =
  | ts.SyntaxKind.SingleLineCommentTrivia
  | ts.SyntaxKind.MultiLineCommentTrivia;

export interface Comment extends Node {
  kind: CommentSyntaxKind;
  commentKind: CommentKind;
}

export enum NodeCommentType {
  LEADING = 0,
  TRAILING = 1,
}

export interface NodeComment {
  oid: bigint;
  nodeOid: bigint;
  commentOid: bigint;
  type: NodeCommentType;
}

export function createComment(
  kind: CommentSyntaxKind,
  location: Location,
): Comment {
  const comment = createNode(kind, location) as Comment;
  comment.commentKind =
    kind === ts.SyntaxKind.SingleLineCommentTrivia
      ? CommentKind.LINE
      : CommentKind.BLOCK;
  return comment;
}

export function createNodeComment(
  nodeOid: bigint,
  commentOid: bigint,
  type: NodeCommentType,
): NodeComment {
  const uri = `${nodeOid}:${commentOid}:${type}`;
  const oid = hashToInt64(uri);
  return {
    oid,
    nodeOid,
    commentOid,
    type,
  };
}
