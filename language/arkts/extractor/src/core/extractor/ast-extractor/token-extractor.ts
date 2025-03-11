/**
 * Copyright 2024 Ant Group CO., Ltd.
 */

import { HasModifiers, Node, SyntaxKind } from "ohos-typescript";

import type { CorefToken } from "../../../model/coref";
import * as util from "../../util";

export function canHaveModifiersKind(kind: number) {
  switch (kind) {
    case SyntaxKind.TypeParameter:
    case SyntaxKind.Parameter:
    case SyntaxKind.ConstructorType:
    case SyntaxKind.PropertySignature:
    case SyntaxKind.PropertyDeclaration:
    case SyntaxKind.MethodSignature:
    case SyntaxKind.MethodDeclaration:
    case SyntaxKind.Constructor:
    case SyntaxKind.GetAccessor:
    case SyntaxKind.SetAccessor:
    case SyntaxKind.IndexSignature:
    case SyntaxKind.FunctionExpression:
    case SyntaxKind.ArrowFunction:
    case SyntaxKind.ClassExpression:
    case SyntaxKind.VariableStatement:
    case SyntaxKind.FunctionDeclaration:
    case SyntaxKind.ClassDeclaration:
    case SyntaxKind.StructDeclaration:
    case SyntaxKind.InterfaceDeclaration:
    case SyntaxKind.TypeAliasDeclaration:
    case SyntaxKind.EnumDeclaration:
    case SyntaxKind.ModuleDeclaration:
    case SyntaxKind.ImportEqualsDeclaration:
    case SyntaxKind.ImportDeclaration:
    case SyntaxKind.ExportAssignment:
    case SyntaxKind.ExportDeclaration:
      return true;
  }

  return false;
}

export function extractToken(id: bigint, node: Node, corefToken: CorefToken) {
  const kind = node.kind;

  if (canHaveModifiersKind(kind)) {
    (node as HasModifiers).modifiers?.forEach((modifier, index) => {
      corefToken.modifiers.push({
        id: util.getCorefIdFromTsNodeInSameFile(modifier),
        kind: modifier.kind,
        parent_id: id,
        parent_kind: node.kind,
        index,
      });
    });
  }

  switch (kind) {
    case SyntaxKind.DotToken:
      corefToken.dotTokens.push({ id });
      return;
    case SyntaxKind.DotDotDotToken:
      corefToken.dotDotDotTokens.push({ id });
      return;
    case SyntaxKind.CommaToken:
      corefToken.commaTokens.push({ id });
      return;
    case SyntaxKind.QuestionDotToken:
      corefToken.questionDotTokens.push({ id });
      return;
    case SyntaxKind.LessThanToken:
      corefToken.lessThanTokens.push({ id });
      return;
    case SyntaxKind.GreaterThanToken:
      corefToken.greaterThanTokens.push({ id });
      return;
    case SyntaxKind.LessThanEqualsToken:
      corefToken.lessThanEqualsTokens.push({ id });
      return;
    case SyntaxKind.GreaterThanEqualsToken:
      corefToken.greaterThanEqualsTokens.push({ id });
      return;
    case SyntaxKind.EqualsEqualsToken:
      corefToken.equalsEqualsTokens.push({ id });
      return;
    case SyntaxKind.ExclamationEqualsToken:
      corefToken.exclamationEqualsTokens.push({ id });
      return;
    case SyntaxKind.EqualsEqualsEqualsToken:
      corefToken.equalsEqualsEqualsTokens.push({ id });
      return;
    case SyntaxKind.ExclamationEqualsEqualsToken:
      corefToken.exclamationEqualsEqualsTokens.push({ id });
      return;
    case SyntaxKind.EqualsGreaterThanToken:
      corefToken.equalsGreaterThanTokens.push({ id });
      return;
    case SyntaxKind.PlusToken:
      corefToken.plusTokens.push({ id });
      return;
    case SyntaxKind.MinusToken:
      corefToken.minusTokens.push({ id });
      return;
    case SyntaxKind.AsteriskToken:
      corefToken.asteriskTokens.push({ id });
      return;
    case SyntaxKind.AsteriskAsteriskToken:
      corefToken.asteriskAsteriskTokens.push({ id });
      return;
    case SyntaxKind.SlashToken:
      corefToken.slashTokens.push({ id });
      return;
    case SyntaxKind.PercentToken:
      corefToken.percentTokens.push({ id });
      return;
    case SyntaxKind.PlusPlusToken:
      corefToken.plusPlusTokens.push({ id });
      return;
    case SyntaxKind.MinusMinusToken:
      corefToken.minusMinusTokens.push({ id });
      return;
    case SyntaxKind.LessThanLessThanToken:
      corefToken.lessThanLessThanTokens.push({ id });
      return;
    case SyntaxKind.GreaterThanGreaterThanToken:
      corefToken.greaterThanGreaterThanTokens.push({ id });
      return;
    case SyntaxKind.GreaterThanGreaterThanGreaterThanToken:
      corefToken.greaterThanGreaterThanGreaterThanTokens.push({ id });
      return;
    case SyntaxKind.AmpersandToken:
      corefToken.ampersandTokens.push({ id });
      return;
    case SyntaxKind.BarToken:
      corefToken.barTokens.push({ id });
      return;
    case SyntaxKind.CaretToken:
      corefToken.caretTokens.push({ id });
      return;
    case SyntaxKind.ExclamationToken:
      corefToken.exclamationTokens.push({ id });
      return;
    case SyntaxKind.TildeToken:
      corefToken.tildeTokens.push({ id });
      return;
    case SyntaxKind.AmpersandAmpersandToken:
      corefToken.ampersandAmpersandTokens.push({ id });
      return;
    case SyntaxKind.BarBarToken:
      corefToken.barBarTokens.push({ id });
      return;
    case SyntaxKind.QuestionToken:
      corefToken.questionTokens.push({ id });
      return;
    case SyntaxKind.ColonToken:
      corefToken.colonTokens.push({ id });
      return;
    case SyntaxKind.QuestionQuestionToken:
      corefToken.questionQuestionTokens.push({ id });
      return;
    case SyntaxKind.EqualsToken:
      corefToken.equalsTokens.push({ id });
      return;
    case SyntaxKind.PlusEqualsToken:
      corefToken.plusEqualsTokens.push({ id });
      return;
    case SyntaxKind.MinusEqualsToken:
      corefToken.minusEqualsTokens.push({ id });
      return;
    case SyntaxKind.AsteriskEqualsToken:
      corefToken.asteriskEqualsTokens.push({ id });
      return;
    case SyntaxKind.AsteriskAsteriskEqualsToken:
      corefToken.asteriskAsteriskEqualsTokens.push({ id });
      return;
    case SyntaxKind.SlashEqualsToken:
      corefToken.slashEqualsTokens.push({ id });
      return;
    case SyntaxKind.PercentEqualsToken:
      corefToken.percentEqualsTokens.push({ id });
      return;
    case SyntaxKind.LessThanLessThanEqualsToken:
      corefToken.lessThanLessThanEqualsTokens.push({ id });
      return;
    case SyntaxKind.GreaterThanGreaterThanEqualsToken:
      corefToken.greaterThanGreaterThanEqualsTokens.push({ id });
      return;
    case SyntaxKind.GreaterThanGreaterThanGreaterThanEqualsToken:
      corefToken.greaterThanGreaterThanGreaterThanEqualsTokens.push({ id });
      return;
    case SyntaxKind.AmpersandEqualsToken:
      corefToken.ampersandEqualsTokens.push({ id });
      return;
    case SyntaxKind.BarEqualsToken:
      corefToken.barEqualsTokens.push({ id });
      return;
    case SyntaxKind.BarBarEqualsToken:
      corefToken.barBarEqualsTokens.push({ id });
      return;
    case SyntaxKind.AmpersandAmpersandEqualsToken:
      corefToken.ampersandAmpersandEqualsTokens.push({ id });
      return;
    case SyntaxKind.QuestionQuestionEqualsToken:
      corefToken.questionQuestionEqualsTokens.push({ id });
      return;
    case SyntaxKind.CaretEqualsToken:
      corefToken.caretEqualsTokens.push({ id });
      return;
    case SyntaxKind.ConstKeyword:
      corefToken.constKeywords.push({ id });
      return;
    case SyntaxKind.DefaultKeyword:
      corefToken.defaultKeywords.push({ id });
      return;
    case SyntaxKind.ExportKeyword:
      corefToken.exportKeywords.push({ id });
      return;
    case SyntaxKind.ExtendsKeyword:
      corefToken.extendsKeywords.push({ id });
      return;
    case SyntaxKind.ImportKeyword:
      corefToken.importKeywords.push({ id });
      return;
    case SyntaxKind.InKeyword:
      corefToken.inKeywords.push({ id });
      return;
    case SyntaxKind.InstanceOfKeyword:
      corefToken.instanceOfKeywords.push({ id });
      return;
    case SyntaxKind.NewKeyword:
      corefToken.newKeywords.push({ id });
      return;
    case SyntaxKind.ImplementsKeyword:
      corefToken.implementsKeywords.push({ id });
      return;
    case SyntaxKind.PrivateKeyword:
      corefToken.privateKeywords.push({ id });
      return;
    case SyntaxKind.ProtectedKeyword:
      corefToken.protectedKeywords.push({ id });
      return;
    case SyntaxKind.PublicKeyword:
      corefToken.publicKeywords.push({ id });
      return;
    case SyntaxKind.StaticKeyword:
      corefToken.staticKeywords.push({ id });
      return;
    case SyntaxKind.AbstractKeyword:
      corefToken.abstractKeywords.push({ id });
      return;
    case SyntaxKind.AccessorKeyword:
      corefToken.accessorKeywords.push({ id });
      return;
    case SyntaxKind.AssertsKeyword:
      corefToken.assertsKeywords.push({ id });
      return;
    case SyntaxKind.AssertKeyword:
      corefToken.assertKeywords.push({ id });
      return;
    case SyntaxKind.AsyncKeyword:
      corefToken.asyncKeywords.push({ id });
      return;
    case SyntaxKind.AwaitKeyword:
      corefToken.awaitKeywords.push({ id });
      return;
    case SyntaxKind.DeclareKeyword:
      corefToken.declareKeywords.push({ id });
      return;
    case SyntaxKind.KeyOfKeyword:
      corefToken.keyOfKeywords.push({ id });
      return;
    case SyntaxKind.OutKeyword:
      corefToken.outKeywords.push({ id });
      return;
    case SyntaxKind.ReadonlyKeyword:
      corefToken.readonlyKeywords.push({ id });
      return;
    case SyntaxKind.UniqueKeyword:
      corefToken.uniqueKeywords.push({ id });
      return;
    case SyntaxKind.OverrideKeyword:
      corefToken.overrideKeywords.push({ id });
      return;
  }
}
