/**
 * Copyright 2024 Ant Group CO., Ltd.
 */
/* eslint-disable @typescript-eslint/ban-types */
/* eslint-disable @typescript-eslint/no-explicit-any */

import { Coref } from "./model";

import { PrismaClient, PrismaPromise } from "@prisma/client";

// Prisma.ModelName;

/**
 * Persist the coref data
 *
 * @param prismaClient
 * @param coref
 * @returns
 */
export function persistCoref(prismaClient: PrismaClient, coref: Coref) {
  let creations: PrismaPromise<any>[] = [];

  if (coref.files && coref.files.length > 0) {
    creations.push(
      prismaClient.file.createMany({
        data: coref.files,
      }),
    );
  }

  if (coref.locations && coref.locations.length > 0) {
    creations.push(
      prismaClient.location.createMany({
        data: coref.locations,
      }),
    );
  }

  if (coref.numberOfLinesList && coref.numberOfLinesList.length > 0) {
    creations.push(
      prismaClient.number_of_lines.createMany({
        data: coref.numberOfLinesList,
      }),
    );
  }

  if (coref.texts && coref.texts.length > 0) {
    creations.push(
      prismaClient.text.createMany({
        data: coref.texts,
      }),
    );
  }

  // AST Nodes
  if (coref.astNodes && coref.astNodes.length > 0) {
    creations.push(
      prismaClient.ast_node.createMany({
        data: coref.astNodes,
      }),
    );
  }

  // Comments
  if (coref.comments && coref.comments.length > 0) {
    creations.push(
      prismaClient.comment.createMany({
        data: coref.comments,
      }),
    );
  }

  if (coref.astNodeComments && coref.astNodeComments.length > 0) {
    creations.push(
      prismaClient.ast_node_comment.createMany({
        data: coref.astNodeComments,
      }),
    );
  }

  // Literals
  if (coref.nullLiterals && coref.nullLiterals.length > 0) {
    creations.push(
      prismaClient.null_literal.createMany({
        data: coref.nullLiterals,
      }),
    );
  }

  if (coref.trueLiterals && coref.trueLiterals.length > 0) {
    creations.push(
      prismaClient.true_literal.createMany({
        data: coref.trueLiterals,
      }),
    );
  }

  if (coref.falseLiterals && coref.falseLiterals.length > 0) {
    creations.push(
      prismaClient.false_literal.createMany({
        data: coref.falseLiterals,
      }),
    );
  }

  if (coref.literalLikeNodes && coref.literalLikeNodes.length > 0) {
    creations.push(
      prismaClient.literal_like_node.createMany({
        data: coref.literalLikeNodes,
      }),
    );
  }

  if (coref.literalExpressions && coref.literalExpressions.length > 0) {
    creations.push(
      prismaClient.literal_expression.createMany({
        data: coref.literalExpressions,
      }),
    );
  }

  if (coref.numericLiterals && coref.numericLiterals.length > 0) {
    creations.push(
      prismaClient.numeric_literal.createMany({
        data: coref.numericLiterals,
      }),
    );
  }

  if (coref.bigIntLiterals && coref.bigIntLiterals.length > 0) {
    creations.push(
      prismaClient.big_int_literal.createMany({
        data: coref.bigIntLiterals,
      }),
    );
  }

  if (coref.stringLiterals && coref.stringLiterals.length > 0) {
    creations.push(
      prismaClient.string_literal.createMany({
        data: coref.stringLiterals,
      }),
    );
  }

  if (
    coref.regularExpressionLiterals &&
    coref.regularExpressionLiterals.length > 0
  ) {
    creations.push(
      prismaClient.regular_expression_literal.createMany({
        data: coref.regularExpressionLiterals,
      }),
    );
  }

  if (
    coref.templateLiteralLikeNodes &&
    coref.templateLiteralLikeNodes.length > 0
  ) {
    creations.push(
      prismaClient.template_literal_like_node.createMany({
        data: coref.templateLiteralLikeNodes,
      }),
    );
  }

  if (
    coref.noSubstitutionTemplateLiterals &&
    coref.noSubstitutionTemplateLiterals.length > 0
  ) {
    creations.push(
      prismaClient.no_substitution_template_literal.createMany({
        data: coref.noSubstitutionTemplateLiterals,
      }),
    );
  }

  if (coref.templateHeads && coref.templateHeads.length > 0) {
    creations.push(
      prismaClient.template_head.createMany({
        data: coref.templateHeads,
      }),
    );
  }

  if (coref.templateMiddles && coref.templateMiddles.length > 0) {
    creations.push(
      prismaClient.template_middle.createMany({
        data: coref.templateMiddles,
      }),
    );
  }

  if (coref.templateTails && coref.templateTails.length > 0) {
    creations.push(
      prismaClient.template_tail.createMany({
        data: coref.templateTails,
      }),
    );
  }

  if (coref.templateSpans && coref.templateSpans.length > 0) {
    creations.push(
      prismaClient.template_span.createMany({
        data: coref.templateSpans,
      }),
    );
  }

  // Tokens
  if (coref.modifiers && coref.modifiers.length > 0) {
    creations.push(
      prismaClient.modifier.createMany({
        data: coref.modifiers,
      }),
    );
  }

  if (coref.dotTokens && coref.dotTokens.length > 0) {
    creations.push(
      prismaClient.dot_token.createMany({
        data: coref.dotTokens,
      }),
    );
  }

  if (coref.dotDotDotTokens && coref.dotDotDotTokens.length > 0) {
    creations.push(
      prismaClient.dot_dot_dot_token.createMany({
        data: coref.dotDotDotTokens,
      }),
    );
  }

  if (coref.commaTokens && coref.commaTokens.length > 0) {
    creations.push(
      prismaClient.comma_token.createMany({
        data: coref.commaTokens,
      }),
    );
  }

  if (coref.questionDotTokens && coref.questionDotTokens.length > 0) {
    creations.push(
      prismaClient.question_dot_token.createMany({
        data: coref.questionDotTokens,
      }),
    );
  }

  if (coref.lessThanTokens && coref.lessThanTokens.length > 0) {
    creations.push(
      prismaClient.less_than_token.createMany({
        data: coref.lessThanTokens,
      }),
    );
  }

  if (coref.greaterThanTokens && coref.greaterThanTokens.length > 0) {
    creations.push(
      prismaClient.greater_than_token.createMany({
        data: coref.greaterThanTokens,
      }),
    );
  }

  if (coref.lessThanEqualsTokens && coref.lessThanEqualsTokens.length > 0) {
    creations.push(
      prismaClient.less_than_equals_token.createMany({
        data: coref.lessThanEqualsTokens,
      }),
    );
  }

  if (
    coref.greaterThanEqualsTokens &&
    coref.greaterThanEqualsTokens.length > 0
  ) {
    creations.push(
      prismaClient.greater_than_equals_token.createMany({
        data: coref.greaterThanEqualsTokens,
      }),
    );
  }

  if (coref.equalsEqualsTokens && coref.equalsEqualsTokens.length > 0) {
    creations.push(
      prismaClient.equals_equals_token.createMany({
        data: coref.equalsEqualsTokens,
      }),
    );
  }

  if (
    coref.exclamationEqualsTokens &&
    coref.exclamationEqualsTokens.length > 0
  ) {
    creations.push(
      prismaClient.exclamation_equals_token.createMany({
        data: coref.exclamationEqualsTokens,
      }),
    );
  }

  if (
    coref.equalsEqualsEqualsTokens &&
    coref.equalsEqualsEqualsTokens.length > 0
  ) {
    creations.push(
      prismaClient.equals_equals_equals_token.createMany({
        data: coref.equalsEqualsEqualsTokens,
      }),
    );
  }

  if (
    coref.exclamationEqualsEqualsTokens &&
    coref.exclamationEqualsEqualsTokens.length > 0
  ) {
    creations.push(
      prismaClient.exclamation_equals_equals_token.createMany({
        data: coref.exclamationEqualsEqualsTokens,
      }),
    );
  }

  if (
    coref.equalsGreaterThanTokens &&
    coref.equalsGreaterThanTokens.length > 0
  ) {
    creations.push(
      prismaClient.equals_greater_than_token.createMany({
        data: coref.equalsGreaterThanTokens,
      }),
    );
  }

  if (coref.plusTokens && coref.plusTokens.length > 0) {
    creations.push(
      prismaClient.plus_token.createMany({
        data: coref.plusTokens,
      }),
    );
  }

  if (coref.minusTokens && coref.minusTokens.length > 0) {
    creations.push(
      prismaClient.minus_token.createMany({
        data: coref.minusTokens,
      }),
    );
  }

  if (coref.asteriskTokens && coref.asteriskTokens.length > 0) {
    creations.push(
      prismaClient.asterisk_token.createMany({
        data: coref.asteriskTokens,
      }),
    );
  }

  if (coref.asteriskAsteriskTokens && coref.asteriskAsteriskTokens.length > 0) {
    creations.push(
      prismaClient.asterisk_asterisk_token.createMany({
        data: coref.asteriskAsteriskTokens,
      }),
    );
  }

  if (coref.slashTokens && coref.slashTokens.length > 0) {
    creations.push(
      prismaClient.slash_token.createMany({
        data: coref.slashTokens,
      }),
    );
  }

  if (coref.percentTokens && coref.percentTokens.length > 0) {
    creations.push(
      prismaClient.percent_token.createMany({
        data: coref.percentTokens,
      }),
    );
  }

  if (coref.plusPlusTokens && coref.plusPlusTokens.length > 0) {
    creations.push(
      prismaClient.plus_plus_token.createMany({
        data: coref.plusPlusTokens,
      }),
    );
  }

  if (coref.minusMinusTokens && coref.minusMinusTokens.length > 0) {
    creations.push(
      prismaClient.minus_minus_token.createMany({
        data: coref.minusMinusTokens,
      }),
    );
  }

  if (coref.lessThanLessThanTokens && coref.lessThanLessThanTokens.length > 0) {
    creations.push(
      prismaClient.less_than_less_than_token.createMany({
        data: coref.lessThanLessThanTokens,
      }),
    );
  }

  if (
    coref.greaterThanGreaterThanTokens &&
    coref.greaterThanGreaterThanTokens.length > 0
  ) {
    creations.push(
      prismaClient.greater_than_greater_than_token.createMany({
        data: coref.greaterThanGreaterThanTokens,
      }),
    );
  }

  if (
    coref.greaterThanGreaterThanGreaterThanTokens &&
    coref.greaterThanGreaterThanGreaterThanTokens.length > 0
  ) {
    creations.push(
      prismaClient.greater_than_greater_than_greater_than_token.createMany({
        data: coref.greaterThanGreaterThanGreaterThanTokens,
      }),
    );
  }

  if (coref.ampersandTokens && coref.ampersandTokens.length > 0) {
    creations.push(
      prismaClient.ampersand_token.createMany({
        data: coref.ampersandTokens,
      }),
    );
  }

  if (coref.barTokens && coref.barTokens.length > 0) {
    creations.push(
      prismaClient.bar_token.createMany({
        data: coref.barTokens,
      }),
    );
  }

  if (coref.caretTokens && coref.caretTokens.length > 0) {
    creations.push(
      prismaClient.caret_token.createMany({
        data: coref.caretTokens,
      }),
    );
  }

  if (coref.exclamationTokens && coref.exclamationTokens.length > 0) {
    creations.push(
      prismaClient.exclamation_token.createMany({
        data: coref.exclamationTokens,
      }),
    );
  }

  if (coref.tildeTokens && coref.tildeTokens.length > 0) {
    creations.push(
      prismaClient.tilde_token.createMany({
        data: coref.tildeTokens,
      }),
    );
  }

  if (
    coref.ampersandAmpersandTokens &&
    coref.ampersandAmpersandTokens.length > 0
  ) {
    creations.push(
      prismaClient.ampersand_ampersand_token.createMany({
        data: coref.ampersandAmpersandTokens,
      }),
    );
  }

  if (coref.barBarTokens && coref.barBarTokens.length > 0) {
    creations.push(
      prismaClient.bar_bar_token.createMany({
        data: coref.barBarTokens,
      }),
    );
  }

  if (coref.questionTokens && coref.questionTokens.length > 0) {
    creations.push(
      prismaClient.question_token.createMany({
        data: coref.questionTokens,
      }),
    );
  }

  if (coref.colonTokens && coref.colonTokens.length > 0) {
    creations.push(
      prismaClient.colon_token.createMany({
        data: coref.colonTokens,
      }),
    );
  }

  if (coref.questionQuestionTokens && coref.questionQuestionTokens.length > 0) {
    creations.push(
      prismaClient.question_question_token.createMany({
        data: coref.questionQuestionTokens,
      }),
    );
  }

  if (coref.equalsTokens && coref.equalsTokens.length > 0) {
    creations.push(
      prismaClient.equals_token.createMany({
        data: coref.equalsTokens,
      }),
    );
  }

  if (coref.plusEqualsTokens && coref.plusEqualsTokens.length > 0) {
    creations.push(
      prismaClient.plus_equals_token.createMany({
        data: coref.plusEqualsTokens,
      }),
    );
  }

  if (coref.minusEqualsTokens && coref.minusEqualsTokens.length > 0) {
    creations.push(
      prismaClient.minus_equals_token.createMany({
        data: coref.minusEqualsTokens,
      }),
    );
  }

  if (coref.asteriskEqualsTokens && coref.asteriskEqualsTokens.length > 0) {
    creations.push(
      prismaClient.asterisk_equals_token.createMany({
        data: coref.asteriskEqualsTokens,
      }),
    );
  }

  if (
    coref.asteriskAsteriskEqualsTokens &&
    coref.asteriskAsteriskEqualsTokens.length > 0
  ) {
    creations.push(
      prismaClient.asterisk_asterisk_equals_token.createMany({
        data: coref.asteriskAsteriskEqualsTokens,
      }),
    );
  }

  if (coref.slashEqualsTokens && coref.slashEqualsTokens.length > 0) {
    creations.push(
      prismaClient.slash_equals_token.createMany({
        data: coref.slashEqualsTokens,
      }),
    );
  }

  if (coref.percentEqualsTokens && coref.percentEqualsTokens.length > 0) {
    creations.push(
      prismaClient.percent_equals_token.createMany({
        data: coref.percentEqualsTokens,
      }),
    );
  }

  if (
    coref.lessThanLessThanEqualsTokens &&
    coref.lessThanLessThanEqualsTokens.length > 0
  ) {
    creations.push(
      prismaClient.less_than_less_than_equals_token.createMany({
        data: coref.lessThanLessThanEqualsTokens,
      }),
    );
  }

  if (
    coref.greaterThanGreaterThanEqualsTokens &&
    coref.greaterThanGreaterThanEqualsTokens.length > 0
  ) {
    creations.push(
      prismaClient.greater_than_greater_than_equals_token.createMany({
        data: coref.greaterThanGreaterThanEqualsTokens,
      }),
    );
  }

  if (
    coref.greaterThanGreaterThanGreaterThanEqualsTokens &&
    coref.greaterThanGreaterThanGreaterThanEqualsTokens.length > 0
  ) {
    creations.push(
      prismaClient.greater_than_greater_than_greater_than_equals_token.createMany(
        {
          data: coref.greaterThanGreaterThanGreaterThanEqualsTokens,
        },
      ),
    );
  }

  if (coref.ampersandEqualsTokens && coref.ampersandEqualsTokens.length > 0) {
    creations.push(
      prismaClient.ampersand_equals_token.createMany({
        data: coref.ampersandEqualsTokens,
      }),
    );
  }

  if (coref.barEqualsTokens && coref.barEqualsTokens.length > 0) {
    creations.push(
      prismaClient.bar_equals_token.createMany({
        data: coref.barEqualsTokens,
      }),
    );
  }

  if (coref.barBarEqualsTokens && coref.barBarEqualsTokens.length > 0) {
    creations.push(
      prismaClient.bar_bar_equals_token.createMany({
        data: coref.barBarEqualsTokens,
      }),
    );
  }

  if (
    coref.ampersandAmpersandEqualsTokens &&
    coref.ampersandAmpersandEqualsTokens.length > 0
  ) {
    creations.push(
      prismaClient.ampersand_ampersand_equals_token.createMany({
        data: coref.ampersandAmpersandEqualsTokens,
      }),
    );
  }

  if (
    coref.questionQuestionEqualsTokens &&
    coref.questionQuestionEqualsTokens.length > 0
  ) {
    creations.push(
      prismaClient.question_question_equals_token.createMany({
        data: coref.questionQuestionEqualsTokens,
      }),
    );
  }

  if (coref.caretEqualsTokens && coref.caretEqualsTokens.length > 0) {
    creations.push(
      prismaClient.caret_equals_token.createMany({
        data: coref.caretEqualsTokens,
      }),
    );
  }

  if (coref.constKeywords && coref.constKeywords.length > 0) {
    creations.push(
      prismaClient.const_keyword.createMany({
        data: coref.constKeywords,
      }),
    );
  }

  if (coref.defaultKeywords && coref.defaultKeywords.length > 0) {
    creations.push(
      prismaClient.default_keyword.createMany({
        data: coref.defaultKeywords,
      }),
    );
  }

  if (coref.exportKeywords && coref.exportKeywords.length > 0) {
    creations.push(
      prismaClient.export_keyword.createMany({
        data: coref.exportKeywords,
      }),
    );
  }

  if (coref.extendsKeywords && coref.extendsKeywords.length > 0) {
    creations.push(
      prismaClient.extends_keyword.createMany({
        data: coref.extendsKeywords,
      }),
    );
  }

  if (coref.importKeywords && coref.importKeywords.length > 0) {
    creations.push(
      prismaClient.import_keyword.createMany({
        data: coref.importKeywords,
      }),
    );
  }

  if (coref.inKeywords && coref.inKeywords.length > 0) {
    creations.push(
      prismaClient.in_keyword.createMany({
        data: coref.inKeywords,
      }),
    );
  }

  if (coref.instanceOfKeywords && coref.instanceOfKeywords.length > 0) {
    creations.push(
      prismaClient.instance_of_keyword.createMany({
        data: coref.instanceOfKeywords,
      }),
    );
  }

  if (coref.newKeywords && coref.newKeywords.length > 0) {
    creations.push(
      prismaClient.new_keyword.createMany({
        data: coref.newKeywords,
      }),
    );
  }

  if (coref.implementsKeywords && coref.implementsKeywords.length > 0) {
    creations.push(
      prismaClient.implements_keyword.createMany({
        data: coref.implementsKeywords,
      }),
    );
  }

  if (coref.privateKeywords && coref.privateKeywords.length > 0) {
    creations.push(
      prismaClient.private_keyword.createMany({
        data: coref.privateKeywords,
      }),
    );
  }

  if (coref.protectedKeywords && coref.protectedKeywords.length > 0) {
    creations.push(
      prismaClient.protected_keyword.createMany({
        data: coref.protectedKeywords,
      }),
    );
  }

  if (coref.publicKeywords && coref.publicKeywords.length > 0) {
    creations.push(
      prismaClient.public_keyword.createMany({
        data: coref.publicKeywords,
      }),
    );
  }

  if (coref.staticKeywords && coref.staticKeywords.length > 0) {
    creations.push(
      prismaClient.static_keyword.createMany({
        data: coref.staticKeywords,
      }),
    );
  }

  if (coref.abstractKeywords && coref.abstractKeywords.length > 0) {
    creations.push(
      prismaClient.abstract_keyword.createMany({
        data: coref.abstractKeywords,
      }),
    );
  }

  if (coref.accessorKeywords && coref.accessorKeywords.length > 0) {
    creations.push(
      prismaClient.accessor_keyword.createMany({
        data: coref.accessorKeywords,
      }),
    );
  }

  if (coref.assertsKeywords && coref.assertsKeywords.length > 0) {
    creations.push(
      prismaClient.asserts_keyword.createMany({
        data: coref.assertsKeywords,
      }),
    );
  }

  if (coref.assertKeywords && coref.assertKeywords.length > 0) {
    creations.push(
      prismaClient.assert_keyword.createMany({
        data: coref.assertKeywords,
      }),
    );
  }

  if (coref.asyncKeywords && coref.asyncKeywords.length > 0) {
    creations.push(
      prismaClient.async_keyword.createMany({
        data: coref.asyncKeywords,
      }),
    );
  }

  if (coref.awaitKeywords && coref.awaitKeywords.length > 0) {
    creations.push(
      prismaClient.await_keyword.createMany({
        data: coref.awaitKeywords,
      }),
    );
  }

  if (coref.declareKeywords && coref.declareKeywords.length > 0) {
    creations.push(
      prismaClient.declare_keyword.createMany({
        data: coref.declareKeywords,
      }),
    );
  }

  if (coref.keyOfKeywords && coref.keyOfKeywords.length > 0) {
    creations.push(
      prismaClient.key_of_keyword.createMany({
        data: coref.keyOfKeywords,
      }),
    );
  }

  if (coref.outKeywords && coref.outKeywords.length > 0) {
    creations.push(
      prismaClient.out_keyword.createMany({
        data: coref.outKeywords,
      }),
    );
  }

  if (coref.readonlyKeywords && coref.readonlyKeywords.length > 0) {
    creations.push(
      prismaClient.readonly_keyword.createMany({
        data: coref.readonlyKeywords,
      }),
    );
  }

  if (coref.uniqueKeywords && coref.uniqueKeywords.length > 0) {
    creations.push(
      prismaClient.unique_keyword.createMany({
        data: coref.uniqueKeywords,
      }),
    );
  }

  if (coref.overrideKeywords && coref.overrideKeywords.length > 0) {
    creations.push(
      prismaClient.override_keyword.createMany({
        data: coref.overrideKeywords,
      }),
    );
  }

  // Names
  if (coref.identifiers && coref.identifiers.length > 0) {
    creations.push(
      prismaClient.identifier.createMany({
        data: coref.identifiers,
      }),
    );
  }

  if (coref.privateIdentifiers && coref.privateIdentifiers.length > 0) {
    creations.push(
      prismaClient.private_identifier.createMany({
        data: coref.privateIdentifiers,
      }),
    );
  }

  if (coref.qualifiedNames && coref.qualifiedNames.length > 0) {
    creations.push(
      prismaClient.qualified_name.createMany({
        data: coref.qualifiedNames,
      }),
    );
  }

  if (coref.computedPropertyNames && coref.computedPropertyNames.length > 0) {
    creations.push(
      prismaClient.computed_property_name.createMany({
        data: coref.computedPropertyNames,
      }),
    );
  }

  // Type Nodes
  if (coref.typeNodes && coref.typeNodes.length > 0) {
    creations.push(
      prismaClient.type_node.createMany({
        data: coref.typeNodes,
      }),
    );
  }

  if (
    coref.nodeWithTypeArgumentsList &&
    coref.nodeWithTypeArgumentsList.length > 0
  ) {
    creations.push(
      prismaClient.node_with_type_arguments.createMany({
        data: coref.nodeWithTypeArgumentsList,
      }),
    );
  }

  if (
    coref.nodeWithTypeArgumentsTypeArguments &&
    coref.nodeWithTypeArgumentsTypeArguments.length > 0
  ) {
    creations.push(
      prismaClient.node_with_type_arguments_type_argument.createMany({
        data: coref.nodeWithTypeArgumentsTypeArguments,
      }),
    );
  }

  if (
    coref.functionOrConstructorTypes &&
    coref.functionOrConstructorTypes.length > 0
  ) {
    creations.push(
      prismaClient.function_or_constructor_type.createMany({
        data: coref.functionOrConstructorTypes,
      }),
    );
  }

  if (coref.anyTypes && coref.anyTypes.length > 0) {
    creations.push(
      prismaClient.any_type.createMany({
        data: coref.anyTypes,
      }),
    );
  }

  if (coref.bigIntTypes && coref.bigIntTypes.length > 0) {
    creations.push(
      prismaClient.big_int_type.createMany({
        data: coref.bigIntTypes,
      }),
    );
  }

  if (coref.booleanTypes && coref.booleanTypes.length > 0) {
    creations.push(
      prismaClient.boolean_type.createMany({
        data: coref.booleanTypes,
      }),
    );
  }

  if (coref.intrinsicTypes && coref.intrinsicTypes.length > 0) {
    creations.push(
      prismaClient.intrinsic_type.createMany({
        data: coref.intrinsicTypes,
      }),
    );
  }

  if (coref.neverTypes && coref.neverTypes.length > 0) {
    creations.push(
      prismaClient.never_type.createMany({
        data: coref.neverTypes,
      }),
    );
  }

  if (coref.numberTypes && coref.numberTypes.length > 0) {
    creations.push(
      prismaClient.number_type.createMany({
        data: coref.numberTypes,
      }),
    );
  }

  if (coref.objectTypes && coref.objectTypes.length > 0) {
    creations.push(
      prismaClient.object_type.createMany({
        data: coref.objectTypes,
      }),
    );
  }

  if (coref.stringTypes && coref.stringTypes.length > 0) {
    creations.push(
      prismaClient.string_type.createMany({
        data: coref.stringTypes,
      }),
    );
  }

  if (coref.symbolTypes && coref.symbolTypes.length > 0) {
    creations.push(
      prismaClient.symbol_type.createMany({
        data: coref.symbolTypes,
      }),
    );
  }

  if (coref.undefinedTypes && coref.undefinedTypes.length > 0) {
    creations.push(
      prismaClient.undefined_type.createMany({
        data: coref.undefinedTypes,
      }),
    );
  }

  if (coref.unknownTypes && coref.unknownTypes.length > 0) {
    creations.push(
      prismaClient.unknown_type.createMany({
        data: coref.unknownTypes,
      }),
    );
  }

  if (coref.voidTypes && coref.voidTypes.length > 0) {
    creations.push(
      prismaClient.void_type.createMany({
        data: coref.voidTypes,
      }),
    );
  }

  if (coref.thisTypes && coref.thisTypes.length > 0) {
    creations.push(
      prismaClient.this_type.createMany({
        data: coref.thisTypes,
      }),
    );
  }

  if (coref.typePredicates && coref.typePredicates.length > 0) {
    creations.push(
      prismaClient.type_predicate.createMany({
        data: coref.typePredicates,
      }),
    );
  }

  if (
    coref.typePredicateAssertsModifiers &&
    coref.typePredicateAssertsModifiers.length > 0
  ) {
    creations.push(
      prismaClient.type_predicate_asserts_modifier.createMany({
        data: coref.typePredicateAssertsModifiers,
      }),
    );
  }

  if (coref.typePredicateTypeNodes && coref.typePredicateTypeNodes.length > 0) {
    creations.push(
      prismaClient.type_predicate_type_node.createMany({
        data: coref.typePredicateTypeNodes,
      }),
    );
  }

  if (coref.typeReferences && coref.typeReferences.length > 0) {
    creations.push(
      prismaClient.type_reference.createMany({
        data: coref.typeReferences,
      }),
    );
  }

  if (coref.functionTypes && coref.functionTypes.length > 0) {
    creations.push(
      prismaClient.function_type.createMany({
        data: coref.functionTypes,
      }),
    );
  }

  if (coref.constructorTypes && coref.constructorTypes.length > 0) {
    creations.push(
      prismaClient.constructor_type.createMany({
        data: coref.constructorTypes,
      }),
    );
  }

  if (coref.typeQueries && coref.typeQueries.length > 0) {
    creations.push(
      prismaClient.type_query.createMany({
        data: coref.typeQueries,
      }),
    );
  }

  if (coref.typeLiterals && coref.typeLiterals.length > 0) {
    creations.push(
      prismaClient.type_literal.createMany({
        data: coref.typeLiterals,
      }),
    );
  }

  if (coref.typeLiteralMembers && coref.typeLiteralMembers.length > 0) {
    creations.push(
      prismaClient.type_literal_member.createMany({
        data: coref.typeLiteralMembers,
      }),
    );
  }

  if (coref.arrayTypes && coref.arrayTypes.length > 0) {
    creations.push(
      prismaClient.array_type.createMany({
        data: coref.arrayTypes,
      }),
    );
  }

  if (coref.tupleTypes && coref.tupleTypes.length > 0) {
    creations.push(
      prismaClient.tuple_type.createMany({
        data: coref.tupleTypes,
      }),
    );
  }

  if (coref.tupleTypeElements && coref.tupleTypeElements.length > 0) {
    creations.push(
      prismaClient.tuple_type_element.createMany({
        data: coref.tupleTypeElements,
      }),
    );
  }

  if (coref.optionalTypes && coref.optionalTypes.length > 0) {
    creations.push(
      prismaClient.optional_type.createMany({
        data: coref.optionalTypes,
      }),
    );
  }

  if (coref.restTypes && coref.restTypes.length > 0) {
    creations.push(
      prismaClient.rest_type.createMany({
        data: coref.restTypes,
      }),
    );
  }

  if (coref.unionTypes && coref.unionTypes.length > 0) {
    creations.push(
      prismaClient.union_type.createMany({
        data: coref.unionTypes,
      }),
    );
  }

  if (coref.unionTypeTypeNodes && coref.unionTypeTypeNodes.length > 0) {
    creations.push(
      prismaClient.union_type_type_node.createMany({
        data: coref.unionTypeTypeNodes,
      }),
    );
  }

  if (coref.intersectionTypes && coref.intersectionTypes.length > 0) {
    creations.push(
      prismaClient.intersection_type.createMany({
        data: coref.intersectionTypes,
      }),
    );
  }

  if (
    coref.intersectionTypeTypeNodes &&
    coref.intersectionTypeTypeNodes.length > 0
  ) {
    creations.push(
      prismaClient.intersection_type_type_node.createMany({
        data: coref.intersectionTypeTypeNodes,
      }),
    );
  }

  if (coref.conditionalTypes && coref.conditionalTypes.length > 0) {
    creations.push(
      prismaClient.conditional_type.createMany({
        data: coref.conditionalTypes,
      }),
    );
  }

  if (coref.inferTypes && coref.inferTypes.length > 0) {
    creations.push(
      prismaClient.infer_type.createMany({
        data: coref.inferTypes,
      }),
    );
  }

  if (coref.parenthesizedTypes && coref.parenthesizedTypes.length > 0) {
    creations.push(
      prismaClient.parenthesized_type.createMany({
        data: coref.parenthesizedTypes,
      }),
    );
  }

  if (coref.typeOperators && coref.typeOperators.length > 0) {
    creations.push(
      prismaClient.type_operator.createMany({
        data: coref.typeOperators,
      }),
    );
  }

  if (coref.indexedAccessTypes && coref.indexedAccessTypes.length > 0) {
    creations.push(
      prismaClient.indexed_access_type.createMany({
        data: coref.indexedAccessTypes,
      }),
    );
  }

  if (coref.mappedTypes && coref.mappedTypes.length > 0) {
    creations.push(
      prismaClient.mapped_type.createMany({
        data: coref.mappedTypes,
      }),
    );
  }

  if (
    coref.mappedTypeReadonlyTokens &&
    coref.mappedTypeReadonlyTokens.length > 0
  ) {
    creations.push(
      prismaClient.mapped_type_readonly_token.createMany({
        data: coref.mappedTypeReadonlyTokens,
      }),
    );
  }

  if (
    coref.mappedTypeNameTypeNodes &&
    coref.mappedTypeNameTypeNodes.length > 0
  ) {
    creations.push(
      prismaClient.mapped_type_name_type_node.createMany({
        data: coref.mappedTypeNameTypeNodes,
      }),
    );
  }

  if (
    coref.mappedTypeQuestionTokens &&
    coref.mappedTypeQuestionTokens.length > 0
  ) {
    creations.push(
      prismaClient.mapped_type_question_token.createMany({
        data: coref.mappedTypeQuestionTokens,
      }),
    );
  }

  if (coref.mappedTypeTypeNodes && coref.mappedTypeTypeNodes.length > 0) {
    creations.push(
      prismaClient.mapped_type_type_node.createMany({
        data: coref.mappedTypeTypeNodes,
      }),
    );
  }

  if (coref.literalTypes && coref.literalTypes.length > 0) {
    creations.push(
      prismaClient.literal_type.createMany({
        data: coref.literalTypes,
      }),
    );
  }

  if (coref.namedTupleMembers && coref.namedTupleMembers.length > 0) {
    creations.push(
      prismaClient.named_tuple_member.createMany({
        data: coref.namedTupleMembers,
      }),
    );
  }

  if (
    coref.namedTupleMemberDotDotDotTokens &&
    coref.namedTupleMemberDotDotDotTokens.length > 0
  ) {
    creations.push(
      prismaClient.named_tuple_member_dot_dot_dot_token.createMany({
        data: coref.namedTupleMemberDotDotDotTokens,
      }),
    );
  }

  if (
    coref.namedTupleMemberQuestionTokens &&
    coref.namedTupleMemberQuestionTokens.length > 0
  ) {
    creations.push(
      prismaClient.named_tuple_member_question_token.createMany({
        data: coref.namedTupleMemberQuestionTokens,
      }),
    );
  }

  if (
    coref.templateLiteralTypeSpans &&
    coref.templateLiteralTypeSpans.length > 0
  ) {
    creations.push(
      prismaClient.template_literal_type_span.createMany({
        data: coref.templateLiteralTypeSpans,
      }),
    );
  }

  if (coref.templateLiteralTypes && coref.templateLiteralTypes.length > 0) {
    creations.push(
      prismaClient.template_literal_type.createMany({
        data: coref.templateLiteralTypes,
      }),
    );
  }

  if (coref.importTypes && coref.importTypes.length > 0) {
    creations.push(
      prismaClient.import_type.createMany({
        data: coref.importTypes,
      }),
    );
  }

  if (coref.importTypeQualifiers && coref.importTypeQualifiers.length > 0) {
    creations.push(
      prismaClient.import_type_qualifier.createMany({
        data: coref.importTypeQualifiers,
      }),
    );
  }

  // Members
  if (coref.objectLiteralElements && coref.objectLiteralElements.length > 0) {
    creations.push(
      prismaClient.object_literal_element.createMany({
        data: coref.objectLiteralElements,
      }),
    );
  }

  if (
    coref.objectLiteralElementNameNodes &&
    coref.objectLiteralElementNameNodes.length > 0
  ) {
    creations.push(
      prismaClient.object_literal_element_name_node.createMany({
        data: coref.objectLiteralElementNameNodes,
      }),
    );
  }

  if (coref.classElements && coref.classElements.length > 0) {
    creations.push(
      prismaClient.class_element.createMany({
        data: coref.classElements,
      }),
    );
  }

  if (coref.classElementNameNodes && coref.classElementNameNodes.length > 0) {
    creations.push(
      prismaClient.class_element_name_node.createMany({
        data: coref.classElementNameNodes,
      }),
    );
  }

  if (coref.typeElements && coref.typeElements.length > 0) {
    creations.push(
      prismaClient.type_element.createMany({
        data: coref.typeElements,
      }),
    );
  }

  if (coref.typeElementNameNodes && coref.typeElementNameNodes.length > 0) {
    creations.push(
      prismaClient.type_element_name_node.createMany({
        data: coref.typeElementNameNodes,
      }),
    );
  }

  if (
    coref.typeElementQuestionTokens &&
    coref.typeElementQuestionTokens.length > 0
  ) {
    creations.push(
      prismaClient.type_element_question_token.createMany({
        data: coref.typeElementQuestionTokens,
      }),
    );
  }

  if (coref.propertySignatures && coref.propertySignatures.length > 0) {
    creations.push(
      prismaClient.property_signature.createMany({
        data: coref.propertySignatures,
      }),
    );
  }

  if (
    coref.propertySignatureQuestionTokens &&
    coref.propertySignatureQuestionTokens.length > 0
  ) {
    creations.push(
      prismaClient.property_signature_question_token.createMany({
        data: coref.propertySignatureQuestionTokens,
      }),
    );
  }

  if (
    coref.propertySignatureTypeNodes &&
    coref.propertySignatureTypeNodes.length > 0
  ) {
    creations.push(
      prismaClient.property_signature_type_node.createMany({
        data: coref.propertySignatureTypeNodes,
      }),
    );
  }

  if (coref.propertyDeclarations && coref.propertyDeclarations.length > 0) {
    creations.push(
      prismaClient.property_declaration.createMany({
        data: coref.propertyDeclarations,
      }),
    );
  }

  if (
    coref.propertyDeclarationQuestionTokens &&
    coref.propertyDeclarationQuestionTokens.length > 0
  ) {
    creations.push(
      prismaClient.property_declaration_question_token.createMany({
        data: coref.propertyDeclarationQuestionTokens,
      }),
    );
  }

  if (
    coref.propertyDeclarationExclamationTokens &&
    coref.propertyDeclarationExclamationTokens.length > 0
  ) {
    creations.push(
      prismaClient.property_declaration_exclamation_token.createMany({
        data: coref.propertyDeclarationExclamationTokens,
      }),
    );
  }

  if (
    coref.propertyDeclarationTypeNodes &&
    coref.propertyDeclarationTypeNodes.length > 0
  ) {
    creations.push(
      prismaClient.property_declaration_type_node.createMany({
        data: coref.propertyDeclarationTypeNodes,
      }),
    );
  }

  if (
    coref.propertyDeclarationInitializers &&
    coref.propertyDeclarationInitializers.length > 0
  ) {
    creations.push(
      prismaClient.property_declaration_initializer.createMany({
        data: coref.propertyDeclarationInitializers,
      }),
    );
  }

  if (coref.methodSignatures && coref.methodSignatures.length > 0) {
    creations.push(
      prismaClient.method_signature.createMany({
        data: coref.methodSignatures,
      }),
    );
  }

  if (coref.methodDeclarations && coref.methodDeclarations.length > 0) {
    creations.push(
      prismaClient.method_declaration.createMany({
        data: coref.methodDeclarations,
      }),
    );
  }

  if (
    coref.methodDeclarationBodies &&
    coref.methodDeclarationBodies.length > 0
  ) {
    creations.push(
      prismaClient.method_declaration_body.createMany({
        data: coref.methodDeclarationBodies,
      }),
    );
  }

  if (
    coref.classStaticBlockDeclarations &&
    coref.classStaticBlockDeclarations.length > 0
  ) {
    creations.push(
      prismaClient.class_static_block_declaration.createMany({
        data: coref.classStaticBlockDeclarations,
      }),
    );
  }

  if (coref.constructors && coref.constructors.length > 0) {
    creations.push(
      prismaClient.constructor.createMany({
        data: coref.constructors,
      }),
    );
  }

  if (coref.constructorBodies && coref.constructorBodies.length > 0) {
    creations.push(
      prismaClient.constructor_body.createMany({
        data: coref.constructorBodies,
      }),
    );
  }

  if (coref.getAccessors && coref.getAccessors.length > 0) {
    creations.push(
      prismaClient.get_accessor.createMany({
        data: coref.getAccessors,
      }),
    );
  }

  if (coref.getAccessorBodies && coref.getAccessorBodies.length > 0) {
    creations.push(
      prismaClient.get_accessor_body.createMany({
        data: coref.getAccessorBodies,
      }),
    );
  }

  if (coref.setAccessors && coref.setAccessors.length > 0) {
    creations.push(
      prismaClient.set_accessor.createMany({
        data: coref.setAccessors,
      }),
    );
  }

  if (coref.setAccessorBodies && coref.setAccessorBodies.length > 0) {
    creations.push(
      prismaClient.set_accessor_body.createMany({
        data: coref.setAccessorBodies,
      }),
    );
  }

  if (coref.callSignatures && coref.callSignatures.length > 0) {
    creations.push(
      prismaClient.call_signature.createMany({
        data: coref.callSignatures,
      }),
    );
  }

  if (coref.constructSignatures && coref.constructSignatures.length > 0) {
    creations.push(
      prismaClient.construct_signature.createMany({
        data: coref.constructSignatures,
      }),
    );
  }

  if (coref.indexSignatures && coref.indexSignatures.length > 0) {
    creations.push(
      prismaClient.index_signature.createMany({
        data: coref.indexSignatures,
      }),
    );
  }

  if (coref.semicolonClassElements && coref.semicolonClassElements.length > 0) {
    creations.push(
      prismaClient.semicolon_class_element.createMany({
        data: coref.semicolonClassElements,
      }),
    );
  }

  if (coref.propertyAssignments && coref.propertyAssignments.length > 0) {
    creations.push(
      prismaClient.property_assignment.createMany({
        data: coref.propertyAssignments,
      }),
    );
  }

  if (
    coref.shorthandPropertyAssignments &&
    coref.shorthandPropertyAssignments.length > 0
  ) {
    creations.push(
      prismaClient.shorthand_property_assignment.createMany({
        data: coref.shorthandPropertyAssignments,
      }),
    );
  }

  if (coref.spreadAssignments && coref.spreadAssignments.length > 0) {
    creations.push(
      prismaClient.spread_assignment.createMany({
        data: coref.spreadAssignments,
      }),
    );
  }

  if (coref.enumMembers && coref.enumMembers.length > 0) {
    creations.push(
      prismaClient.enum_member.createMany({
        data: coref.enumMembers,
      }),
    );
  }

  if (coref.enumMemberInitializers && coref.enumMemberInitializers.length > 0) {
    creations.push(
      prismaClient.enum_member_initializer.createMany({
        data: coref.enumMemberInitializers,
      }),
    );
  }

  // Binding Patterns
  if (coref.bindingElements && coref.bindingElements.length > 0) {
    creations.push(
      prismaClient.binding_element.createMany({
        data: coref.bindingElements,
      }),
    );
  }

  if (
    coref.bindingElementPropertyNameNodes &&
    coref.bindingElementPropertyNameNodes.length > 0
  ) {
    creations.push(
      prismaClient.binding_element_property_name_node.createMany({
        data: coref.bindingElementPropertyNameNodes,
      }),
    );
  }

  if (
    coref.bindingElementDotDotDotTokens &&
    coref.bindingElementDotDotDotTokens.length > 0
  ) {
    creations.push(
      prismaClient.binding_element_dot_dot_dot_token.createMany({
        data: coref.bindingElementDotDotDotTokens,
      }),
    );
  }

  if (
    coref.bindingElementInitializers &&
    coref.bindingElementInitializers.length > 0
  ) {
    creations.push(
      prismaClient.binding_element_initializer.createMany({
        data: coref.bindingElementInitializers,
      }),
    );
  }

  if (coref.objectBindingPatterns && coref.objectBindingPatterns.length > 0) {
    creations.push(
      prismaClient.object_binding_pattern.createMany({
        data: coref.objectBindingPatterns,
      }),
    );
  }

  if (
    coref.objectBindingPatternElements &&
    coref.objectBindingPatternElements.length > 0
  ) {
    creations.push(
      prismaClient.object_binding_pattern_element.createMany({
        data: coref.objectBindingPatternElements,
      }),
    );
  }

  if (coref.arrayBindingPatterns && coref.arrayBindingPatterns.length > 0) {
    creations.push(
      prismaClient.array_binding_pattern.createMany({
        data: coref.arrayBindingPatterns,
      }),
    );
  }

  if (
    coref.arrayBindingPatternElements &&
    coref.arrayBindingPatternElements.length > 0
  ) {
    creations.push(
      prismaClient.array_binding_pattern_element.createMany({
        data: coref.arrayBindingPatternElements,
      }),
    );
  }

  // Declarations
  if (coref.declarations && coref.declarations.length > 0) {
    creations.push(
      prismaClient.declaration.createMany({
        data: coref.declarations,
      }),
    );
  }

  if (coref.declarationNameNodes && coref.declarationNameNodes.length > 0) {
    creations.push(
      prismaClient.declaration_name_node.createMany({
        data: coref.declarationNameNodes,
      }),
    );
  }

  if (coref.signatureDeclarations && coref.signatureDeclarations.length > 0) {
    creations.push(
      prismaClient.signature_declaration.createMany({
        data: coref.signatureDeclarations,
      }),
    );
  }

  if (
    coref.signatureDeclarationNameNodes &&
    coref.signatureDeclarationNameNodes.length > 0
  ) {
    creations.push(
      prismaClient.signature_declaration_name_node.createMany({
        data: coref.signatureDeclarationNameNodes,
      }),
    );
  }

  if (
    coref.signatureDeclarationTypeParameters &&
    coref.signatureDeclarationTypeParameters.length > 0
  ) {
    creations.push(
      prismaClient.signature_declaration_type_parameter.createMany({
        data: coref.signatureDeclarationTypeParameters,
      }),
    );
  }

  if (
    coref.signatureDeclarationParameters &&
    coref.signatureDeclarationParameters.length > 0
  ) {
    creations.push(
      prismaClient.signature_declaration_parameter.createMany({
        data: coref.signatureDeclarationParameters,
      }),
    );
  }

  if (
    coref.signatureDeclarationTypeNodes &&
    coref.signatureDeclarationTypeNodes.length > 0
  ) {
    creations.push(
      prismaClient.signature_declaration_type_node.createMany({
        data: coref.signatureDeclarationTypeNodes,
      }),
    );
  }

  if (
    coref.functionLikeDeclarations &&
    coref.functionLikeDeclarations.length > 0
  ) {
    creations.push(
      prismaClient.function_like_declaration.createMany({
        data: coref.functionLikeDeclarations,
      }),
    );
  }

  if (
    coref.functionLikeDeclarationAsteriskTokens &&
    coref.functionLikeDeclarationAsteriskTokens.length > 0
  ) {
    creations.push(
      prismaClient.function_like_declaration_asterisk_token.createMany({
        data: coref.functionLikeDeclarationAsteriskTokens,
      }),
    );
  }

  if (
    coref.functionLikeDeclarationQuestionTokens &&
    coref.functionLikeDeclarationQuestionTokens.length > 0
  ) {
    creations.push(
      prismaClient.function_like_declaration_question_token.createMany({
        data: coref.functionLikeDeclarationQuestionTokens,
      }),
    );
  }

  if (
    coref.functionLikeDeclarationExclamationTokens &&
    coref.functionLikeDeclarationExclamationTokens.length > 0
  ) {
    creations.push(
      prismaClient.function_like_declaration_exclamation_token.createMany({
        data: coref.functionLikeDeclarationExclamationTokens,
      }),
    );
  }

  if (
    coref.functionLikeDeclarationBodies &&
    coref.functionLikeDeclarationBodies.length > 0
  ) {
    creations.push(
      prismaClient.function_like_declaration_body.createMany({
        data: coref.functionLikeDeclarationBodies,
      }),
    );
  }

  if (coref.classLikeDeclarations && coref.classLikeDeclarations.length > 0) {
    creations.push(
      prismaClient.class_like_declaration.createMany({
        data: coref.classLikeDeclarations,
      }),
    );
  }

  if (
    coref.classLikeDeclarationNameNodes &&
    coref.classLikeDeclarationNameNodes.length > 0
  ) {
    creations.push(
      prismaClient.class_like_declaration_name_node.createMany({
        data: coref.classLikeDeclarationNameNodes,
      }),
    );
  }

  if (
    coref.classLikeDeclarationTypeParameters &&
    coref.classLikeDeclarationTypeParameters.length > 0
  ) {
    creations.push(
      prismaClient.class_like_declaration_type_parameter.createMany({
        data: coref.classLikeDeclarationTypeParameters,
      }),
    );
  }

  if (
    coref.classLikeDeclarationMembers &&
    coref.classLikeDeclarationMembers.length > 0
  ) {
    creations.push(
      prismaClient.class_like_declaration_member.createMany({
        data: coref.classLikeDeclarationMembers,
      }),
    );
  }

  if (coref.typeParameters && coref.typeParameters.length > 0) {
    creations.push(
      prismaClient.type_parameter.createMany({
        data: coref.typeParameters,
      }),
    );
  }

  if (
    coref.typeParameterConstraints &&
    coref.typeParameterConstraints.length > 0
  ) {
    creations.push(
      prismaClient.type_parameter_constraint.createMany({
        data: coref.typeParameterConstraints,
      }),
    );
  }

  if (coref.typeParameterDefaults && coref.typeParameterDefaults.length > 0) {
    creations.push(
      prismaClient.type_parameter_default.createMany({
        data: coref.typeParameterDefaults,
      }),
    );
  }

  if (coref.parameters && coref.parameters.length > 0) {
    creations.push(
      prismaClient.parameter.createMany({
        data: coref.parameters,
      }),
    );
  }

  if (
    coref.parameterDotDotDotTokens &&
    coref.parameterDotDotDotTokens.length > 0
  ) {
    creations.push(
      prismaClient.parameter_dot_dot_dot_token.createMany({
        data: coref.parameterDotDotDotTokens,
      }),
    );
  }

  if (
    coref.parameterQuestionTokens &&
    coref.parameterQuestionTokens.length > 0
  ) {
    creations.push(
      prismaClient.parameter_question_token.createMany({
        data: coref.parameterQuestionTokens,
      }),
    );
  }

  if (coref.parameterTypeNodes && coref.parameterTypeNodes.length > 0) {
    creations.push(
      prismaClient.parameter_type_node.createMany({
        data: coref.parameterTypeNodes,
      }),
    );
  }

  if (coref.parameterInitializers && coref.parameterInitializers.length > 0) {
    creations.push(
      prismaClient.parameter_initializer.createMany({
        data: coref.parameterInitializers,
      }),
    );
  }

  if (coref.variableDeclarations && coref.variableDeclarations.length > 0) {
    creations.push(
      prismaClient.variable_declaration.createMany({
        data: coref.variableDeclarations,
      }),
    );
  }

  if (
    coref.variableDeclarationExclamationTokens &&
    coref.variableDeclarationExclamationTokens.length > 0
  ) {
    creations.push(
      prismaClient.variable_declaration_exclamation_token.createMany({
        data: coref.variableDeclarationExclamationTokens,
      }),
    );
  }

  if (
    coref.variableDeclarationTypeNodes &&
    coref.variableDeclarationTypeNodes.length > 0
  ) {
    creations.push(
      prismaClient.variable_declaration_type_node.createMany({
        data: coref.variableDeclarationTypeNodes,
      }),
    );
  }

  if (
    coref.variableDeclarationInitializers &&
    coref.variableDeclarationInitializers.length > 0
  ) {
    creations.push(
      prismaClient.variable_declaration_initializer.createMany({
        data: coref.variableDeclarationInitializers,
      }),
    );
  }

  if (coref.importClauses && coref.importClauses.length > 0) {
    creations.push(
      prismaClient.import_clause.createMany({
        data: coref.importClauses,
      }),
    );
  }

  if (coref.importClauseNameNodes && coref.importClauseNameNodes.length > 0) {
    creations.push(
      prismaClient.import_clause_name_node.createMany({
        data: coref.importClauseNameNodes,
      }),
    );
  }

  if (
    coref.importClauseNamedBindingsList &&
    coref.importClauseNamedBindingsList.length > 0
  ) {
    creations.push(
      prismaClient.import_clause_named_bindings.createMany({
        data: coref.importClauseNamedBindingsList,
      }),
    );
  }

  if (coref.namespaceImports && coref.namespaceImports.length > 0) {
    creations.push(
      prismaClient.namespace_import.createMany({
        data: coref.namespaceImports,
      }),
    );
  }

  if (coref.importSpecifiers && coref.importSpecifiers.length > 0) {
    creations.push(
      prismaClient.import_specifier.createMany({
        data: coref.importSpecifiers,
      }),
    );
  }

  if (
    coref.importSpecifierPropertyNameNodes &&
    coref.importSpecifierPropertyNameNodes.length > 0
  ) {
    creations.push(
      prismaClient.import_specifier_property_name_node.createMany({
        data: coref.importSpecifierPropertyNameNodes,
      }),
    );
  }

  if (coref.namespaceExports && coref.namespaceExports.length > 0) {
    creations.push(
      prismaClient.namespace_export.createMany({
        data: coref.namespaceExports,
      }),
    );
  }

  if (coref.exportSpecifiers && coref.exportSpecifiers.length > 0) {
    creations.push(
      prismaClient.export_specifier.createMany({
        data: coref.exportSpecifiers,
      }),
    );
  }

  if (
    coref.exportSpecifierPropertyNameNodes &&
    coref.exportSpecifierPropertyNameNodes.length > 0
  ) {
    creations.push(
      prismaClient.export_specifier_property_name_node.createMany({
        data: coref.exportSpecifierPropertyNameNodes,
      }),
    );
  }

  // Expressions
  if (coref.expressions && coref.expressions.length > 0) {
    creations.push(
      prismaClient.expression.createMany({
        data: coref.expressions,
      }),
    );
  }

  if (coref.unaryExpressions && coref.unaryExpressions.length > 0) {
    creations.push(
      prismaClient.unary_expression.createMany({
        data: coref.unaryExpressions,
      }),
    );
  }

  if (coref.updateExpressions && coref.updateExpressions.length > 0) {
    creations.push(
      prismaClient.update_expression.createMany({
        data: coref.updateExpressions,
      }),
    );
  }

  if (coref.leftHandSideExpression && coref.leftHandSideExpression.length > 0) {
    creations.push(
      prismaClient.left_hand_side_expression.createMany({
        data: coref.leftHandSideExpression,
      }),
    );
  }

  if (coref.memberExpressions && coref.memberExpressions.length > 0) {
    creations.push(
      prismaClient.member_expression.createMany({
        data: coref.memberExpressions,
      }),
    );
  }

  if (coref.primaryExpressions && coref.primaryExpressions.length > 0) {
    creations.push(
      prismaClient.primary_expression.createMany({
        data: coref.primaryExpressions,
      }),
    );
  }

  if (coref.thisExpressions && coref.thisExpressions.length > 0) {
    creations.push(
      prismaClient.this_expression.createMany({
        data: coref.thisExpressions,
      }),
    );
  }

  if (coref.superExpressions && coref.superExpressions.length > 0) {
    creations.push(
      prismaClient.super_expression.createMany({
        data: coref.superExpressions,
      }),
    );
  }

  if (coref.importExpressions && coref.importExpressions.length > 0) {
    creations.push(
      prismaClient.import_expression.createMany({
        data: coref.importExpressions,
      }),
    );
  }

  if (
    coref.arrayLiteralExpressions &&
    coref.arrayLiteralExpressions.length > 0
  ) {
    creations.push(
      prismaClient.array_literal_expression.createMany({
        data: coref.arrayLiteralExpressions,
      }),
    );
  }

  if (
    coref.arrayLiteralExpressionElements &&
    coref.arrayLiteralExpressionElements.length > 0
  ) {
    creations.push(
      prismaClient.array_literal_expression_element.createMany({
        data: coref.arrayLiteralExpressionElements,
      }),
    );
  }

  if (
    coref.objectLiteralExpressions &&
    coref.objectLiteralExpressions.length > 0
  ) {
    creations.push(
      prismaClient.object_literal_expression.createMany({
        data: coref.objectLiteralExpressions,
      }),
    );
  }

  if (
    coref.objectLiteralExpressionProperties &&
    coref.objectLiteralExpressionProperties.length > 0
  ) {
    creations.push(
      prismaClient.object_literal_expression_property.createMany({
        data: coref.objectLiteralExpressionProperties,
      }),
    );
  }

  if (
    coref.propertyAccessExpressions &&
    coref.propertyAccessExpressions.length > 0
  ) {
    creations.push(
      prismaClient.property_access_expression.createMany({
        data: coref.propertyAccessExpressions,
      }),
    );
  }

  if (
    coref.propertyAccessExpressionQuestionDotTokens &&
    coref.propertyAccessExpressionQuestionDotTokens.length > 0
  ) {
    creations.push(
      prismaClient.property_access_expression_question_dot_token.createMany({
        data: coref.propertyAccessExpressionQuestionDotTokens,
      }),
    );
  }

  if (
    coref.elementAccessExpressions &&
    coref.elementAccessExpressions.length > 0
  ) {
    creations.push(
      prismaClient.element_access_expression.createMany({
        data: coref.elementAccessExpressions,
      }),
    );
  }

  if (
    coref.elementAccessExpressionQuestionDotTokens &&
    coref.elementAccessExpressionQuestionDotTokens.length > 0
  ) {
    creations.push(
      prismaClient.element_access_expression_question_dot_token.createMany({
        data: coref.elementAccessExpressionQuestionDotTokens,
      }),
    );
  }

  if (coref.callExpressions && coref.callExpressions.length > 0) {
    creations.push(
      prismaClient.call_expression.createMany({
        data: coref.callExpressions,
      }),
    );
  }

  if (
    coref.callExpressionQuestionDotTokens &&
    coref.callExpressionQuestionDotTokens.length > 0
  ) {
    creations.push(
      prismaClient.call_expression_question_dot_token.createMany({
        data: coref.callExpressionQuestionDotTokens,
      }),
    );
  }

  if (
    coref.callExpressionTypeArguments &&
    coref.callExpressionTypeArguments.length > 0
  ) {
    creations.push(
      prismaClient.call_expression_type_argument.createMany({
        data: coref.callExpressionTypeArguments,
      }),
    );
  }

  if (
    coref.callExpressionArguments &&
    coref.callExpressionArguments.length > 0
  ) {
    creations.push(
      prismaClient.call_expression_argument.createMany({
        data: coref.callExpressionArguments,
      }),
    );
  }

  if (coref.newExpressions && coref.newExpressions.length > 0) {
    creations.push(
      prismaClient.new_expression.createMany({
        data: coref.newExpressions,
      }),
    );
  }

  if (
    coref.newExpressionTypeArguments &&
    coref.newExpressionTypeArguments.length > 0
  ) {
    creations.push(
      prismaClient.new_expression_type_argument.createMany({
        data: coref.newExpressionTypeArguments,
      }),
    );
  }

  if (coref.newExpressionArguments && coref.newExpressionArguments.length > 0) {
    creations.push(
      prismaClient.new_expression_argument.createMany({
        data: coref.newExpressionArguments,
      }),
    );
  }

  if (coref.templateExpressions && coref.templateExpressions.length > 0) {
    creations.push(
      prismaClient.template_expression.createMany({
        data: coref.templateExpressions,
      }),
    );
  }

  if (
    coref.taggedTemplateExpressions &&
    coref.taggedTemplateExpressions.length > 0
  ) {
    creations.push(
      prismaClient.tagged_template_expression.createMany({
        data: coref.taggedTemplateExpressions,
      }),
    );
  }

  if (
    coref.taggedTemplateExpressionTypeArguments &&
    coref.taggedTemplateExpressionTypeArguments.length > 0
  ) {
    creations.push(
      prismaClient.tagged_template_expression_type_argument.createMany({
        data: coref.taggedTemplateExpressionTypeArguments,
      }),
    );
  }

  if (
    coref.typeAssertionExpressions &&
    coref.typeAssertionExpressions.length > 0
  ) {
    creations.push(
      prismaClient.type_assertion_expression.createMany({
        data: coref.typeAssertionExpressions,
      }),
    );
  }

  if (
    coref.parenthesizedExpressions &&
    coref.parenthesizedExpressions.length > 0
  ) {
    creations.push(
      prismaClient.parenthesized_expression.createMany({
        data: coref.parenthesizedExpressions,
      }),
    );
  }

  if (coref.functionExpressions && coref.functionExpressions.length > 0) {
    creations.push(
      prismaClient.function_expression.createMany({
        data: coref.functionExpressions,
      }),
    );
  }

  if (
    coref.functionExpressionNameNodes &&
    coref.functionExpressionNameNodes.length > 0
  ) {
    creations.push(
      prismaClient.function_expression_name_node.createMany({
        data: coref.functionExpressionNameNodes,
      }),
    );
  }

  if (coref.arrowFunctions && coref.arrowFunctions.length > 0) {
    creations.push(
      prismaClient.arrow_function.createMany({
        data: coref.arrowFunctions,
      }),
    );
  }

  if (
    coref.etsComponentExpressions &&
    coref.etsComponentExpressions.length > 0
  ) {
    creations.push(
      prismaClient.ets_component_expression.createMany({
        data: coref.etsComponentExpressions,
      }),
    );
  }

  if (
    coref.etsComponentExpressionTypeArguments &&
    coref.etsComponentExpressionTypeArguments.length > 0
  ) {
    creations.push(
      prismaClient.ets_component_expression_type_argument.createMany({
        data: coref.etsComponentExpressionTypeArguments,
      }),
    );
  }

  if (
    coref.etsComponentExpressionArguments &&
    coref.etsComponentExpressionArguments.length > 0
  ) {
    creations.push(
      prismaClient.ets_component_expression_argument.createMany({
        data: coref.etsComponentExpressionArguments,
      }),
    );
  }

  if (
    coref.etsComponentExpressionBodies &&
    coref.etsComponentExpressionBodies.length > 0
  ) {
    creations.push(
      prismaClient.ets_component_expression_body.createMany({
        data: coref.etsComponentExpressionBodies,
      }),
    );
  }

  if (coref.deleteExpressions && coref.deleteExpressions.length > 0) {
    creations.push(
      prismaClient.delete_expression.createMany({
        data: coref.deleteExpressions,
      }),
    );
  }

  if (coref.typeOfExpressions && coref.typeOfExpressions.length > 0) {
    creations.push(
      prismaClient.type_of_expression.createMany({
        data: coref.typeOfExpressions,
      }),
    );
  }

  if (coref.voidExpressions && coref.voidExpressions.length > 0) {
    creations.push(
      prismaClient.void_expression.createMany({
        data: coref.voidExpressions,
      }),
    );
  }

  if (coref.awaitExpressions && coref.awaitExpressions.length > 0) {
    creations.push(
      prismaClient.await_expression.createMany({
        data: coref.awaitExpressions,
      }),
    );
  }

  if (coref.prefixUnaryExpressions && coref.prefixUnaryExpressions.length > 0) {
    creations.push(
      prismaClient.prefix_unary_expression.createMany({
        data: coref.prefixUnaryExpressions,
      }),
    );
  }

  if (
    coref.postfixUnaryExpressions &&
    coref.postfixUnaryExpressions.length > 0
  ) {
    creations.push(
      prismaClient.postfix_unary_expression.createMany({
        data: coref.postfixUnaryExpressions,
      }),
    );
  }

  if (coref.binaryExpressions && coref.binaryExpressions.length > 0) {
    creations.push(
      prismaClient.binary_expression.createMany({
        data: coref.binaryExpressions,
      }),
    );
  }

  if (coref.conditionalExpressions && coref.conditionalExpressions.length > 0) {
    creations.push(
      prismaClient.conditional_expression.createMany({
        data: coref.conditionalExpressions,
      }),
    );
  }

  if (coref.yieldExpressions && coref.yieldExpressions.length > 0) {
    creations.push(
      prismaClient.yield_expression.createMany({
        data: coref.yieldExpressions,
      }),
    );
  }

  if (
    coref.yieldExpressionAsteriskTokens &&
    coref.yieldExpressionAsteriskTokens.length > 0
  ) {
    creations.push(
      prismaClient.yield_expression_asterisk_token.createMany({
        data: coref.yieldExpressionAsteriskTokens,
      }),
    );
  }

  if (
    coref.yieldExpressionExpressions &&
    coref.yieldExpressionExpressions.length > 0
  ) {
    creations.push(
      prismaClient.yield_expression_expression.createMany({
        data: coref.yieldExpressionExpressions,
      }),
    );
  }

  if (coref.spreadElements && coref.spreadElements.length > 0) {
    creations.push(
      prismaClient.spread_element.createMany({
        data: coref.spreadElements,
      }),
    );
  }

  if (coref.classExpressions && coref.classExpressions.length > 0) {
    creations.push(
      prismaClient.class_expression.createMany({
        data: coref.classExpressions,
      }),
    );
  }

  if (coref.omittedExpressions && coref.omittedExpressions.length > 0) {
    creations.push(
      prismaClient.omitted_expression.createMany({
        data: coref.omittedExpressions,
      }),
    );
  }

  if (
    coref.expressionWithTypeArgumentsList &&
    coref.expressionWithTypeArgumentsList.length > 0
  ) {
    creations.push(
      prismaClient.expression_with_type_arguments.createMany({
        data: coref.expressionWithTypeArgumentsList,
      }),
    );
  }

  if (coref.asExpressions && coref.asExpressions.length > 0) {
    creations.push(
      prismaClient.as_expression.createMany({
        data: coref.asExpressions,
      }),
    );
  }

  if (coref.nonNullExpressions && coref.nonNullExpressions.length > 0) {
    creations.push(
      prismaClient.non_null_expression.createMany({
        data: coref.nonNullExpressions,
      }),
    );
  }

  if (coref.metaProperties && coref.metaProperties.length > 0) {
    creations.push(
      prismaClient.meta_property.createMany({
        data: coref.metaProperties,
      }),
    );
  }

  if (coref.satisfiesExpressions && coref.satisfiesExpressions.length > 0) {
    creations.push(
      prismaClient.satisfies_expression.createMany({
        data: coref.satisfiesExpressions,
      }),
    );
  }

  // Statements
  if (coref.statements && coref.statements.length > 0) {
    creations.push(
      prismaClient.statement.createMany({
        data: coref.statements,
      }),
    );
  }

  if (coref.declarationStatements && coref.declarationStatements.length > 0) {
    creations.push(
      prismaClient.declaration_statement.createMany({
        data: coref.declarationStatements,
      }),
    );
  }

  if (
    coref.declarationStatementNameNodes &&
    coref.declarationStatementNameNodes.length > 0
  ) {
    creations.push(
      prismaClient.declaration_statement_name_node.createMany({
        data: coref.declarationStatementNameNodes,
      }),
    );
  }

  if (coref.blocks && coref.blocks.length > 0) {
    creations.push(
      prismaClient.block.createMany({
        data: coref.blocks,
      }),
    );
  }

  if (coref.blockStatements && coref.blockStatements.length > 0) {
    creations.push(
      prismaClient.block_statement.createMany({
        data: coref.blockStatements,
      }),
    );
  }

  if (coref.emptyStatements && coref.emptyStatements.length > 0) {
    creations.push(
      prismaClient.empty_statement.createMany({
        data: coref.emptyStatements,
      }),
    );
  }

  if (coref.variableStatements && coref.variableStatements.length > 0) {
    creations.push(
      prismaClient.variable_statement.createMany({
        data: coref.variableStatements,
      }),
    );
  }

  if (coref.expressionStatements && coref.expressionStatements.length > 0) {
    creations.push(
      prismaClient.expression_statement.createMany({
        data: coref.expressionStatements,
      }),
    );
  }

  if (coref.ifStatements && coref.ifStatements.length > 0) {
    creations.push(
      prismaClient.if_statement.createMany({
        data: coref.ifStatements,
      }),
    );
  }

  if (
    coref.ifStatementElseStatements &&
    coref.ifStatementElseStatements.length > 0
  ) {
    creations.push(
      prismaClient.if_statement_else_statement.createMany({
        data: coref.ifStatementElseStatements,
      }),
    );
  }

  if (coref.iterationStatements && coref.iterationStatements.length > 0) {
    creations.push(
      prismaClient.iteration_statement.createMany({
        data: coref.iterationStatements,
      }),
    );
  }

  if (coref.doStatements && coref.doStatements.length > 0) {
    creations.push(
      prismaClient.do_statement.createMany({
        data: coref.doStatements,
      }),
    );
  }

  if (coref.whileStatements && coref.whileStatements.length > 0) {
    creations.push(
      prismaClient.while_statement.createMany({
        data: coref.whileStatements,
      }),
    );
  }

  if (coref.forStatements && coref.forStatements.length > 0) {
    creations.push(
      prismaClient.for_statement.createMany({
        data: coref.forStatements,
      }),
    );
  }

  if (
    coref.forStatementInitializers &&
    coref.forStatementInitializers.length > 0
  ) {
    creations.push(
      prismaClient.for_statement_initializer.createMany({
        data: coref.forStatementInitializers,
      }),
    );
  }

  if (coref.forStatementConditions && coref.forStatementConditions.length > 0) {
    creations.push(
      prismaClient.for_statement_condition.createMany({
        data: coref.forStatementConditions,
      }),
    );
  }

  if (
    coref.forStatementIncrementors &&
    coref.forStatementIncrementors.length > 0
  ) {
    creations.push(
      prismaClient.for_statement_incrementor.createMany({
        data: coref.forStatementIncrementors,
      }),
    );
  }

  if (coref.forInStatements && coref.forInStatements.length > 0) {
    creations.push(
      prismaClient.for_in_statement.createMany({
        data: coref.forInStatements,
      }),
    );
  }

  if (coref.forOfStatements && coref.forOfStatements.length > 0) {
    creations.push(
      prismaClient.for_of_statement.createMany({
        data: coref.forOfStatements,
      }),
    );
  }

  if (
    coref.forOfStatementAwaitModifiers &&
    coref.forOfStatementAwaitModifiers.length > 0
  ) {
    creations.push(
      prismaClient.for_of_statement_await_modifier.createMany({
        data: coref.forOfStatementAwaitModifiers,
      }),
    );
  }

  if (coref.continueStatements && coref.continueStatements.length > 0) {
    creations.push(
      prismaClient.continue_statement.createMany({
        data: coref.continueStatements,
      }),
    );
  }

  if (
    coref.continueStatementLabels &&
    coref.continueStatementLabels.length > 0
  ) {
    creations.push(
      prismaClient.continue_statement_label.createMany({
        data: coref.continueStatementLabels,
      }),
    );
  }

  if (coref.breakStatements && coref.breakStatements.length > 0) {
    creations.push(
      prismaClient.break_statement.createMany({
        data: coref.breakStatements,
      }),
    );
  }

  if (coref.breakStatementLabels && coref.breakStatementLabels.length > 0) {
    creations.push(
      prismaClient.break_statement_label.createMany({
        data: coref.breakStatementLabels,
      }),
    );
  }

  if (coref.returnStatements && coref.returnStatements.length > 0) {
    creations.push(
      prismaClient.return_statement.createMany({
        data: coref.returnStatements,
      }),
    );
  }

  if (
    coref.returnStatementExpressions &&
    coref.returnStatementExpressions.length > 0
  ) {
    creations.push(
      prismaClient.return_statement_expression.createMany({
        data: coref.returnStatementExpressions,
      }),
    );
  }

  if (coref.withStatements && coref.withStatements.length > 0) {
    creations.push(
      prismaClient.with_statement.createMany({
        data: coref.withStatements,
      }),
    );
  }

  if (coref.caseBlocks && coref.caseBlocks.length > 0) {
    creations.push(
      prismaClient.case_block.createMany({
        data: coref.caseBlocks,
      }),
    );
  }

  if (coref.caseBlockClauses && coref.caseBlockClauses.length > 0) {
    creations.push(
      prismaClient.case_block_clause.createMany({
        data: coref.caseBlockClauses,
      }),
    );
  }

  if (coref.switchStatements && coref.switchStatements.length > 0) {
    creations.push(
      prismaClient.switch_statement.createMany({
        data: coref.switchStatements,
      }),
    );
  }

  if (coref.labeledStatements && coref.labeledStatements.length > 0) {
    creations.push(
      prismaClient.labeled_statement.createMany({
        data: coref.labeledStatements,
      }),
    );
  }

  if (coref.throwStatements && coref.throwStatements.length > 0) {
    creations.push(
      prismaClient.throw_statement.createMany({
        data: coref.throwStatements,
      }),
    );
  }

  if (coref.tryStatements && coref.tryStatements.length > 0) {
    creations.push(
      prismaClient.try_statement.createMany({
        data: coref.tryStatements,
      }),
    );
  }

  if (
    coref.tryStatementFinallyBlocks &&
    coref.tryStatementFinallyBlocks.length > 0
  ) {
    creations.push(
      prismaClient.try_statement_finally_block.createMany({
        data: coref.tryStatementFinallyBlocks,
      }),
    );
  }

  if (coref.debuggerStatements && coref.debuggerStatements.length > 0) {
    creations.push(
      prismaClient.debugger_statement.createMany({
        data: coref.debuggerStatements,
      }),
    );
  }

  if (coref.functionDeclarations && coref.functionDeclarations.length > 0) {
    creations.push(
      prismaClient.function_declaration.createMany({
        data: coref.functionDeclarations,
      }),
    );
  }

  if (
    coref.functionDeclarationNameNodes &&
    coref.functionDeclarationNameNodes.length > 0
  ) {
    creations.push(
      prismaClient.function_declaration_name_node.createMany({
        data: coref.functionDeclarationNameNodes,
      }),
    );
  }

  if (
    coref.functionDeclarationBodies &&
    coref.functionDeclarationBodies.length > 0
  ) {
    creations.push(
      prismaClient.function_declaration_body.createMany({
        data: coref.functionDeclarationBodies,
      }),
    );
  }

  if (coref.classDeclarations && coref.classDeclarations.length > 0) {
    creations.push(
      prismaClient.class_declaration.createMany({
        data: coref.classDeclarations,
      }),
    );
  }

  if (
    coref.classDeclarationNameNodes &&
    coref.classDeclarationNameNodes.length > 0
  ) {
    creations.push(
      prismaClient.class_declaration_name_node.createMany({
        data: coref.classDeclarationNameNodes,
      }),
    );
  }

  if (coref.structDeclarations && coref.structDeclarations.length > 0) {
    creations.push(
      prismaClient.struct_declaration.createMany({
        data: coref.structDeclarations,
      }),
    );
  }

  if (
    coref.structDeclarationNameNodes &&
    coref.structDeclarationNameNodes.length > 0
  ) {
    creations.push(
      prismaClient.struct_declaration_name_node.createMany({
        data: coref.structDeclarationNameNodes,
      }),
    );
  }

  if (coref.interfaceDeclarations && coref.interfaceDeclarations.length > 0) {
    creations.push(
      prismaClient.interface_declaration.createMany({
        data: coref.interfaceDeclarations,
      }),
    );
  }

  if (
    coref.interfaceDeclarationTypeParameters &&
    coref.interfaceDeclarationTypeParameters.length > 0
  ) {
    creations.push(
      prismaClient.interface_declaration_type_parameter.createMany({
        data: coref.interfaceDeclarationTypeParameters,
      }),
    );
  }

  if (
    coref.interfaceDeclarationMembers &&
    coref.interfaceDeclarationMembers.length > 0
  ) {
    creations.push(
      prismaClient.interface_declaration_member.createMany({
        data: coref.interfaceDeclarationMembers,
      }),
    );
  }

  if (coref.typeAliasDeclarations && coref.typeAliasDeclarations.length > 0) {
    creations.push(
      prismaClient.type_alias_declaration.createMany({
        data: coref.typeAliasDeclarations,
      }),
    );
  }

  if (
    coref.typeAliasDeclarationTypeParameters &&
    coref.typeAliasDeclarationTypeParameters.length > 0
  ) {
    creations.push(
      prismaClient.type_alias_declaration_type_parameter.createMany({
        data: coref.typeAliasDeclarationTypeParameters,
      }),
    );
  }

  if (coref.enumDeclarations && coref.enumDeclarations.length > 0) {
    creations.push(
      prismaClient.enum_declaration.createMany({
        data: coref.enumDeclarations,
      }),
    );
  }

  if (coref.moduleDeclarations && coref.moduleDeclarations.length > 0) {
    creations.push(
      prismaClient.module_declaration.createMany({
        data: coref.moduleDeclarations,
      }),
    );
  }

  if (
    coref.moduleDeclarationBodies &&
    coref.moduleDeclarationBodies.length > 0
  ) {
    creations.push(
      prismaClient.module_declaration_body.createMany({
        data: coref.moduleDeclarationBodies,
      }),
    );
  }

  if (coref.moduleBlocks && coref.moduleBlocks.length > 0) {
    creations.push(
      prismaClient.module_block.createMany({
        data: coref.moduleBlocks,
      }),
    );
  }

  if (coref.moduleBlockStatements && coref.moduleBlockStatements.length > 0) {
    creations.push(
      prismaClient.module_block_statement.createMany({
        data: coref.moduleBlockStatements,
      }),
    );
  }

  if (
    coref.namespaceExportDeclarations &&
    coref.namespaceExportDeclarations.length > 0
  ) {
    creations.push(
      prismaClient.namespace_export_declaration.createMany({
        data: coref.namespaceExportDeclarations,
      }),
    );
  }

  if (
    coref.importEqualsDeclarations &&
    coref.importEqualsDeclarations.length > 0
  ) {
    creations.push(
      prismaClient.import_equals_declaration.createMany({
        data: coref.importEqualsDeclarations,
      }),
    );
  }

  if (coref.importDeclarations && coref.importDeclarations.length > 0) {
    creations.push(
      prismaClient.import_declaration.createMany({
        data: coref.importDeclarations,
      }),
    );
  }

  if (
    coref.importDeclarationAssertClauses &&
    coref.importDeclarationAssertClauses.length > 0
  ) {
    creations.push(
      prismaClient.import_declaration_assert_clause.createMany({
        data: coref.importDeclarationAssertClauses,
      }),
    );
  }

  if (coref.exportAssignments && coref.exportAssignments.length > 0) {
    creations.push(
      prismaClient.export_assignment.createMany({
        data: coref.exportAssignments,
      }),
    );
  }

  if (coref.exportDeclarations && coref.exportDeclarations.length > 0) {
    creations.push(
      prismaClient.export_declaration.createMany({
        data: coref.exportDeclarations,
      }),
    );
  }

  if (
    coref.exportDeclarationExportClauses &&
    coref.exportDeclarationExportClauses.length > 0
  ) {
    creations.push(
      prismaClient.export_declaration_export_clause.createMany({
        data: coref.exportDeclarationExportClauses,
      }),
    );
  }

  if (
    coref.exportDeclarationModuleSpecifiers &&
    coref.exportDeclarationModuleSpecifiers.length > 0
  ) {
    creations.push(
      prismaClient.export_declaration_module_specifier.createMany({
        data: coref.exportDeclarationModuleSpecifiers,
      }),
    );
  }

  if (
    coref.exportDeclarationAssertClauses &&
    coref.exportDeclarationAssertClauses.length > 0
  ) {
    creations.push(
      prismaClient.export_declaration_assert_clause.createMany({
        data: coref.exportDeclarationAssertClauses,
      }),
    );
  }

  // Clauses
  if (coref.caseClauses && coref.caseClauses.length > 0) {
    creations.push(
      prismaClient.case_clause.createMany({
        data: coref.caseClauses,
      }),
    );
  }

  if (coref.caseClauseStatements && coref.caseClauseStatements.length > 0) {
    creations.push(
      prismaClient.case_clause_statement.createMany({
        data: coref.caseClauseStatements,
      }),
    );
  }

  if (coref.defaultClauses && coref.defaultClauses.length > 0) {
    creations.push(
      prismaClient.default_clause.createMany({
        data: coref.defaultClauses,
      }),
    );
  }

  if (
    coref.defaultClauseStatements &&
    coref.defaultClauseStatements.length > 0
  ) {
    creations.push(
      prismaClient.default_clause_statement.createMany({
        data: coref.defaultClauseStatements,
      }),
    );
  }

  if (coref.heritageClauses && coref.heritageClauses.length > 0) {
    creations.push(
      prismaClient.heritage_clause.createMany({
        data: coref.heritageClauses,
      }),
    );
  }

  if (
    coref.heritageClauseTypeNodes &&
    coref.heritageClauseTypeNodes.length > 0
  ) {
    creations.push(
      prismaClient.heritage_clause_type_node.createMany({
        data: coref.heritageClauseTypeNodes,
      }),
    );
  }

  if (coref.catchClauses && coref.catchClauses.length > 0) {
    creations.push(
      prismaClient.catch_clause.createMany({
        data: coref.catchClauses,
      }),
    );
  }

  if (
    coref.catchClauseVariableDeclarations &&
    coref.catchClauseVariableDeclarations.length > 0
  ) {
    creations.push(
      prismaClient.catch_clause_variable_declaration.createMany({
        data: coref.catchClauseVariableDeclarations,
      }),
    );
  }

  // Other AST Nodes
  if (coref.decorators && coref.decorators.length > 0) {
    creations.push(
      prismaClient.decorator.createMany({
        data: coref.decorators,
      }),
    );
  }

  if (
    coref.variableDeclarationLists &&
    coref.variableDeclarationLists.length > 0
  ) {
    creations.push(
      prismaClient.variable_declaration_list.createMany({
        data: coref.variableDeclarationLists,
      }),
    );
  }

  if (
    coref.variableDeclarationListDeclarations &&
    coref.variableDeclarationListDeclarations.length > 0
  ) {
    creations.push(
      prismaClient.variable_declaration_list_declaration.createMany({
        data: coref.variableDeclarationListDeclarations,
      }),
    );
  }

  if (coref.namedImportsList && coref.namedImportsList.length > 0) {
    creations.push(
      prismaClient.named_imports.createMany({
        data: coref.namedImportsList,
      }),
    );
  }

  if (coref.namedExportsList && coref.namedExportsList.length > 0) {
    creations.push(
      prismaClient.named_exports.createMany({
        data: coref.namedExportsList,
      }),
    );
  }

  if (
    coref.externalModuleReferences &&
    coref.externalModuleReferences.length > 0
  ) {
    creations.push(
      prismaClient.external_module_reference.createMany({
        data: coref.externalModuleReferences,
      }),
    );
  }

  if (coref.assertClauses && coref.assertClauses.length > 0) {
    creations.push(
      prismaClient.assert_clause.createMany({
        data: coref.assertClauses,
      }),
    );
  }

  if (coref.assertEntries && coref.assertEntries.length > 0) {
    creations.push(
      prismaClient.assert_entry.createMany({
        data: coref.assertEntries,
      }),
    );
  }

  if (
    coref.importTypeAssertionContainers &&
    coref.importTypeAssertionContainers.length > 0
  ) {
    creations.push(
      prismaClient.import_type_assertion_container.createMany({
        data: coref.importTypeAssertionContainers,
      }),
    );
  }

  // Top-Levels
  if (coref.topLevels && coref.topLevels.length > 0) {
    creations.push(
      prismaClient.top_level.createMany({
        data: coref.topLevels,
      }),
    );
  }

  if (coref.topLevelStatements && coref.topLevelStatements.length > 0) {
    creations.push(
      prismaClient.top_level_statement.createMany({
        data: coref.topLevelStatements,
      }),
    );
  }

  // AST Node and Container Relations
  if (
    coref.astNodeContainerRelations &&
    coref.astNodeContainerRelations.length > 0
  ) {
    creations.push(
      prismaClient.ast_node_container_relation.createMany({
        data: coref.astNodeContainerRelations,
      }),
    );
  }

  // Synthetic CFG Nodes
  if (coref.cfgEntryNodes && coref.cfgEntryNodes.length > 0) {
    creations.push(
      prismaClient.cfg_entry_node.createMany({
        data: coref.cfgEntryNodes,
      }),
    );
  }

  if (coref.cfgExitNodes && coref.cfgExitNodes.length > 0) {
    creations.push(
      prismaClient.cfg_exit_node.createMany({
        data: coref.cfgExitNodes,
      }),
    );
  }

  // Symbols
  if (coref.symbols && coref.symbols.length > 0) {
    creations.push(
      prismaClient.symbol_.createMany({
        data: coref.symbols,
      }),
    );
  }

  if (coref.astNodeSymbols && coref.astNodeSymbols.length > 0) {
    creations.push(
      prismaClient.ast_node_symbol.createMany({
        data: coref.astNodeSymbols,
      }),
    );
  }

  if (
    coref.shorthandPropertyAssignmentValueSymbols &&
    coref.shorthandPropertyAssignmentValueSymbols.length > 0
  ) {
    creations.push(
      prismaClient.shorthand_property_assignment_value_symbol.createMany({
        data: coref.shorthandPropertyAssignmentValueSymbols,
      }),
    );
  }

  if (coref.callSiteDeclarations && coref.callSiteDeclarations.length > 0) {
    creations.push(
      prismaClient.call_site_declaration.createMany({
        data: coref.callSiteDeclarations,
      }),
    );
  }

  if (
    coref.callSiteImplementations &&
    coref.callSiteImplementations.length > 0
  ) {
    creations.push(
      prismaClient.call_site_implementation.createMany({
        data: coref.callSiteImplementations,
      }),
    );
  }

  if (coref.types && coref.types.length > 0) {
    creations.push(
      prismaClient.type_.createMany({
        data: coref.types,
      }),
    );
  }

  if (coref.astNodeTypes && coref.astNodeTypes.length > 0) {
    creations.push(
      prismaClient.ast_node_type.createMany({
        data: coref.astNodeTypes,
      }),
    );
  }

  return creations;
}
