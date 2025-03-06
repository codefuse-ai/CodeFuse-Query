/**
 * Copyright 2024 Ant Group CO., Ltd.
 */

import type * as ts from "ohos-typescript";
import { SyntaxKind } from "ohos-typescript";

import { CorefLiteral } from "../../../model/coref";
import * as util from "../../util";

export function isLiteralLikeNodeKind(kind: SyntaxKind): boolean {
  switch (kind) {
    case SyntaxKind.NumericLiteral:
    case SyntaxKind.BigIntLiteral:
    case SyntaxKind.StringLiteral:
    case SyntaxKind.RegularExpressionLiteral:
    case SyntaxKind.NoSubstitutionTemplateLiteral:
    case SyntaxKind.TemplateHead:
    case SyntaxKind.TemplateMiddle:
    case SyntaxKind.TemplateTail:
      return true;
    default:
      return false;
  }
}

export function isLiteralExpressionKind(kind: SyntaxKind): boolean {
  switch (kind) {
    case SyntaxKind.NumericLiteral:
    case SyntaxKind.BigIntLiteral:
    case SyntaxKind.StringLiteral:
    case SyntaxKind.RegularExpressionLiteral:
    case SyntaxKind.NoSubstitutionTemplateLiteral:
      return true;
    default:
      return false;
  }
}

export function isTemplateLiteralLikeNodeKind(kind: SyntaxKind): boolean {
  switch (kind) {
    case SyntaxKind.NoSubstitutionTemplateLiteral:
    case SyntaxKind.TemplateHead:
    case SyntaxKind.TemplateMiddle:
    case SyntaxKind.TemplateTail:
      return true;
    default:
      return false;
  }
}

export function extractLiteral(
  id: bigint,
  node: ts.Node,
  corefLiteral: CorefLiteral,
) {
  const kind = node.kind;

  switch (kind) {
    case SyntaxKind.NullKeyword:
      corefLiteral.nullLiterals.push({ id });
      return;
    case SyntaxKind.TrueKeyword:
      corefLiteral.trueLiterals.push({ id });
      return;
    case SyntaxKind.FalseKeyword:
      corefLiteral.falseLiterals.push({ id });
      return;
    case SyntaxKind.TemplateExpression:
      (node as ts.TemplateExpression).templateSpans.forEach(
        (templateSpan, index) => {
          corefLiteral.templateSpans.push({
            id: util.getCorefIdFromTsNodeInSameFile(templateSpan),
            parent_id: id,
            index,
            expression_id: util.getCorefIdFromTsNodeInSameFile(
              templateSpan.expression,
            ),
            literal_id: util.getCorefIdFromTsNodeInSameFile(
              templateSpan.literal,
            ),
          });
        },
      );
      return;
  }

  if (isLiteralLikeNodeKind(kind)) {
    corefLiteral.literalLikeNodes.push({
      id,
      kind,
      value: (node as ts.LiteralLikeNode).text,
    });

    if (isLiteralExpressionKind(kind)) {
      corefLiteral.literalExpressions.push({
        id,
        kind,
      });

      switch (kind) {
        case SyntaxKind.NumericLiteral:
          corefLiteral.numericLiterals.push({
            id,
            flags: (node as any).numericLiteralFlags as ts.TokenFlags,
          });
          return;
        case SyntaxKind.BigIntLiteral:
          corefLiteral.bigIntLiterals.push({ id });
          return;
        case SyntaxKind.StringLiteral:
          corefLiteral.stringLiterals.push({
            id,
            single_quote: node.getText()[0] === "'",
          });
          return;
        case SyntaxKind.RegularExpressionLiteral:
          corefLiteral.regularExpressionLiterals.push({ id });
          return;
      }
    }

    if (isTemplateLiteralLikeNodeKind(kind)) {
      corefLiteral.templateLiteralLikeNodes.push({
        id,
        kind,
        raw_text: (node as ts.TemplateLiteralLikeNode).rawText ?? "",
      });

      switch (kind) {
        case SyntaxKind.NoSubstitutionTemplateLiteral:
          // A NoSubstitutionTemplateLiteral is also a LiteralExpression.
          corefLiteral.noSubstitutionTemplateLiterals.push({ id });
          return;
        case SyntaxKind.TemplateHead:
          corefLiteral.templateHeads.push({ id });
          return;
        case SyntaxKind.TemplateMiddle:
          corefLiteral.templateMiddles.push({ id });
          return;
        case SyntaxKind.TemplateTail:
          corefLiteral.templateTails.push({ id });
          return;
      }
    }
  }
}
