/**
 * Copyright 2024 Ant Group CO., Ltd.
 */

import * as ts from "ohos-typescript";

import { coref, extendedTs } from "../../model";
import * as util from "../util";

/**
 * 抽取节点与注释的关系
 *
 * @todo 目前有一种特殊情况没有抽取：一行行内的多行注释，而且该注释不在所在行的开头或结尾。
 * 原因是，通过 typescript API (ts.getLeadingCommentRanges 和 ts.getTrailingCommentRanges)
 * 获取 AST 节点与注释的关系，这种特殊类型的注释会关联到一些只有语法意义的 Token 节点上
 * (如 PunctuationToken标点符号, keyword 等)，后续应把注释关联到他们前后更有意义的节点上，
 * 如 Identifier，Expression等。
 *
 * @param tsNode TsNode 节点，增加了自定义属性的 ts.Node 对象
 * @returns 节点与注释关系的 NodeComment 数组
 */
export function extractNodeComments(
  nodeId: bigint,
  tsNode: ts.Node,
): coref.NodeComment[] {
  const sourceFile = tsNode.getSourceFile();
  const fileId = (sourceFile as extendedTs.SourceFile).$corefFile?.id;

  const leadingCommentRanges = util.getLeadingCommentRangesOfNode(
    tsNode,
    sourceFile,
  );
  const trailingCommentRanges = util.getTrailingCommentRangesOfNode(
    tsNode,
    sourceFile,
  );
  const nodeComments: coref.NodeComment[] = [];

  /**
   * 根据 ts.CommentRange 和 NodeCommentType 创建 NodeComment 对象
   *
   * @param commentRange ts.CommentRange 对象
   * @param nodeCommentKind 节点注释关联类型 NodeCommentType.LEADING 或 NodeCommentType.TRAILING
   * @returns NodeComment 对象
   */
  function createNodeComment(
    commentRange: ts.CommentRange,
    index: number,
    nodeCommentKind: coref.NodeCommentKind,
  ): coref.NodeComment {
    const commentStart = commentRange.pos;
    const commentEnd = commentRange.end;

    const commentLocationId = coref.computeLocationId(
      fileId,
      commentStart,
      commentEnd,
    );
    const commentId = coref.computeCommentId(commentLocationId);

    return coref.createNodeComment(nodeId, commentId, index, nodeCommentKind);
  }

  leadingCommentRanges?.forEach((commentRange, index) => {
    const nodeComment = createNodeComment(
      commentRange,
      index,
      coref.NodeCommentKind.LEADING,
    );
    nodeComments.push(nodeComment);
  });

  trailingCommentRanges?.forEach((commentRange, index) => {
    const nodeComment = createNodeComment(
      commentRange,
      index,
      coref.NodeCommentKind.TRAILING,
    );
    nodeComments.push(nodeComment);
  });

  return nodeComments;
}
