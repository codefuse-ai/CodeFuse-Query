/**
 * Copyright 2024 Ant Group CO., Ltd.
 */

import type * as ts from "ohos-typescript";
import { SyntaxKind } from "ohos-typescript";

import { CorefExpression } from "../../../model/coref";
import * as util from "../../util";

export function extractExpression(
  id: bigint,
  node: ts.Node,
  corefExpression: CorefExpression,
) {
  const kind = node.kind;
  const expression = {
    id,
    kind,
  };

  switch (kind) {
    case SyntaxKind.Identifier:
    case SyntaxKind.PrivateIdentifier: // technically this is only an Expression if it's in a `#field in expr` BinaryExpression
    case SyntaxKind.NullKeyword:
    case SyntaxKind.TrueKeyword:
    case SyntaxKind.FalseKeyword:
    case SyntaxKind.ThisKeyword:
    case SyntaxKind.SuperKeyword:
    case SyntaxKind.ImportKeyword: // technically this is only an Expression if it's in a CallExpression
    case SyntaxKind.FunctionExpression:
    case SyntaxKind.EtsComponentExpression:
    case SyntaxKind.ClassExpression:
    case SyntaxKind.StringLiteral:
    case SyntaxKind.RegularExpressionLiteral:
    case SyntaxKind.NoSubstitutionTemplateLiteral:
    case SyntaxKind.NumericLiteral:
    case SyntaxKind.BigIntLiteral:
    case SyntaxKind.TemplateExpression:
    case SyntaxKind.ParenthesizedExpression:
    case SyntaxKind.ArrayLiteralExpression:
    case SyntaxKind.ObjectLiteralExpression:
    case SyntaxKind.NewExpression:
    case SyntaxKind.MetaProperty:
    case SyntaxKind.JsxElement:
    case SyntaxKind.JsxSelfClosingElement:
    case SyntaxKind.JsxFragment:
      // Add the expression to primaryExpressions and following expression arrays
      corefExpression.primaryExpressions.push(expression);
    case SyntaxKind.PropertyAccessExpression:
    case SyntaxKind.ElementAccessExpression:
    case SyntaxKind.ExpressionWithTypeArguments:
    case SyntaxKind.TaggedTemplateExpression:
      // Add the expression to memberExpressions and following expression arrays
      corefExpression.memberExpressions.push(expression);
    case SyntaxKind.CallExpression:
    case SyntaxKind.NonNullExpression:
      // Add the expression to leftHandSideExpressions and following expression arrays
      corefExpression.leftHandSideExpression.push(expression);
    case SyntaxKind.PrefixUnaryExpression:
    case SyntaxKind.PostfixUnaryExpression:
      // Add the expression to updateExpressions and following expression arrays
      corefExpression.updateExpressions.push(expression);
    case SyntaxKind.DeleteExpression:
    case SyntaxKind.TypeOfExpression:
    case SyntaxKind.VoidExpression:
    case SyntaxKind.AwaitExpression:
    case SyntaxKind.TypeAssertionExpression:
      // Add the expression to unaryExpressions and expressions
      corefExpression.unaryExpressions.push(expression);
    case SyntaxKind.ConditionalExpression:
    case SyntaxKind.YieldExpression:
    case SyntaxKind.ArrowFunction:
    case SyntaxKind.BinaryExpression:
    case SyntaxKind.SpreadElement:
    case SyntaxKind.AsExpression:
    case SyntaxKind.OmittedExpression:
    case SyntaxKind.CommaListExpression:
    case SyntaxKind.PartiallyEmittedExpression:
    case SyntaxKind.SatisfiesExpression:
      // Add the expression to expressions
      corefExpression.expressions.push(expression);
  }

  switch (kind) {
    case SyntaxKind.ThisKeyword:
      corefExpression.thisExpressions.push({ id });
      return;

    case SyntaxKind.SuperKeyword:
      corefExpression.superExpressions.push({ id });
      return;

    case SyntaxKind.ImportKeyword:
      corefExpression.importExpressions.push({ id });
      return;

    case SyntaxKind.ArrayLiteralExpression:
      corefExpression.arrayLiteralExpressions.push({ id });

      (node as ts.ArrayLiteralExpression).elements.forEach((element, index) => {
        corefExpression.arrayLiteralExpressionElements.push({
          element_id: util.getCorefIdFromTsNodeInSameFile(element),
          array_literal_expression_id: id,
          index,
        });
      });

      return;

    case SyntaxKind.ObjectLiteralExpression:
      corefExpression.objectLiteralExpressions.push({ id });

      (node as ts.ObjectLiteralExpression).properties.forEach(
        (property, index) => {
          corefExpression.objectLiteralExpressionProperties.push({
            property_id: util.getCorefIdFromTsNodeInSameFile(property),
            object_literal_expression_id: id,
            index,
          });
        },
      );

      return;

    case SyntaxKind.PropertyAccessExpression: {
      const propertyAccessExpression = node as ts.PropertyAccessExpression;
      corefExpression.propertyAccessExpressions.push({
        id,
        expression_id: util.getCorefIdFromTsNodeInSameFile(
          propertyAccessExpression.expression,
        ),
        name_node_id: util.getCorefIdFromTsNodeInSameFile(
          propertyAccessExpression.name,
        ),
      });

      if (propertyAccessExpression.questionDotToken) {
        corefExpression.propertyAccessExpressionQuestionDotTokens.push({
          property_access_expression_id: id,
          question_dot_token_id: util.getCorefIdFromTsNodeInSameFile(
            propertyAccessExpression.questionDotToken,
          ),
        });
      }

      return;
    }

    case SyntaxKind.ElementAccessExpression: {
      const elementAccessExpression = node as ts.ElementAccessExpression;
      corefExpression.elementAccessExpressions.push({
        id,
        expression_id: util.getCorefIdFromTsNodeInSameFile(
          elementAccessExpression.expression,
        ),
        argument_expression_id: util.getCorefIdFromTsNodeInSameFile(
          elementAccessExpression.argumentExpression,
        ),
      });

      if (elementAccessExpression.questionDotToken) {
        corefExpression.elementAccessExpressionQuestionDotTokens.push({
          element_access_expression_id: id,
          question_dot_token_id: util.getCorefIdFromTsNodeInSameFile(
            elementAccessExpression.questionDotToken,
          ),
        });
      }

      return;
    }

    case SyntaxKind.CallExpression: {
      const callExpression = node as ts.CallExpression;
      corefExpression.callExpressions.push({
        id,
        expression_id: util.getCorefIdFromTsNodeInSameFile(
          callExpression.expression,
        ),
      });

      if (callExpression.questionDotToken) {
        corefExpression.callExpressionQuestionDotTokens.push({
          call_expression_id: id,
          question_dot_token_id: util.getCorefIdFromTsNodeInSameFile(
            callExpression.questionDotToken,
          ),
        });
      }

      callExpression.typeArguments?.forEach((typeArgument, index) => {
        corefExpression.callExpressionTypeArguments.push({
          type_argument_id: util.getCorefIdFromTsNodeInSameFile(typeArgument),
          call_expression_id: id,
          index,
        });
      });

      callExpression.arguments.forEach((argument, index) => {
        corefExpression.callExpressionArguments.push({
          argument_id: util.getCorefIdFromTsNodeInSameFile(argument),
          call_expression_id: id,
          index,
        });
      });

      return;
    }

    case SyntaxKind.NewExpression:
      corefExpression.newExpressions.push({
        id,
        expression_id: util.getCorefIdFromTsNodeInSameFile(
          (node as ts.NewExpression).expression,
        ),
      });

      (node as ts.NewExpression).typeArguments?.forEach(
        (typeArgument, index) => {
          corefExpression.newExpressionTypeArguments.push({
            type_argument_id: util.getCorefIdFromTsNodeInSameFile(typeArgument),
            new_expression_id: id,
            index,
          });
        },
      );

      (node as ts.NewExpression).arguments?.forEach((argument, index) => {
        corefExpression.newExpressionArguments.push({
          argument_id: util.getCorefIdFromTsNodeInSameFile(argument),
          new_expression_id: id,
          index,
        });
      });

      return;

    case SyntaxKind.TemplateExpression:
      corefExpression.templateExpressions.push({
        id,
        head_id: util.getCorefIdFromTsNodeInSameFile(
          (node as ts.TemplateExpression).head,
        ),
      });
      return;

    case SyntaxKind.TaggedTemplateExpression:
      corefExpression.taggedTemplateExpressions.push({
        id,
        tag_id: util.getCorefIdFromTsNodeInSameFile(
          (node as ts.TaggedTemplateExpression).tag,
        ),
        template_id: util.getCorefIdFromTsNodeInSameFile(
          (node as ts.TaggedTemplateExpression).template,
        ),
      });

      (node as ts.TaggedTemplateExpression).typeArguments?.forEach(
        (typeArgument, index) => {
          corefExpression.taggedTemplateExpressionTypeArguments.push({
            type_argument_id: util.getCorefIdFromTsNodeInSameFile(typeArgument),
            tagged_template_expression_id: id,
            index,
          });
        },
      );

      return;

    case SyntaxKind.TypeAssertionExpression:
      corefExpression.typeAssertionExpressions.push({
        id,
        type_node_id: util.getCorefIdFromTsNodeInSameFile(
          (node as ts.TypeAssertion).type,
        ),
        expression_id: util.getCorefIdFromTsNodeInSameFile(
          (node as ts.TypeAssertion).expression,
        ),
      });
      return;

    case SyntaxKind.ParenthesizedExpression:
      corefExpression.parenthesizedExpressions.push({
        id,
        expression_id: util.getCorefIdFromTsNodeInSameFile(
          (node as ts.ParenthesizedExpression).expression,
        ),
      });
      return;

    case SyntaxKind.FunctionExpression: {
      const functionExpression = node as ts.FunctionExpression;
      corefExpression.functionExpressions.push({
        id,
        body_id: util.getCorefIdFromTsNodeInSameFile(functionExpression.body),
      });

      if (functionExpression.name) {
        corefExpression.functionExpressionNameNodes.push({
          function_expression_id: id,
          name_node_id: util.getCorefIdFromTsNodeInSameFile(
            functionExpression.name,
          ),
        });
      }

      return;
    }

    case SyntaxKind.ArrowFunction:
      corefExpression.arrowFunctions.push({
        id,
        equals_greater_than_token_id: util.getCorefIdFromTsNodeInSameFile(
          (node as ts.ArrowFunction).equalsGreaterThanToken,
        ),
        body_id: util.getCorefIdFromTsNodeInSameFile(
          (node as ts.ArrowFunction).body,
        ),
      });

      return;

    case SyntaxKind.EtsComponentExpression: {
      const etsComponentExpression = node as ts.EtsComponentExpression;

      corefExpression.etsComponentExpressions.push({
        id,
        expression_id: util.getCorefIdFromTsNodeInSameFile(
          etsComponentExpression.expression,
        ),
      });

      etsComponentExpression.typeArguments?.forEach((typeArgument, index) => {
        corefExpression.etsComponentExpressionTypeArguments.push({
          type_argument_id: util.getCorefIdFromTsNodeInSameFile(typeArgument),
          ets_component_expression_id: id,
          index,
        });
      });

      etsComponentExpression.arguments.forEach((argument, index) => {
        corefExpression.etsComponentExpressionArguments.push({
          argument_id: util.getCorefIdFromTsNodeInSameFile(argument),
          ets_component_expression_id: id,
          index,
        });
      });

      if (etsComponentExpression.body) {
        corefExpression.etsComponentExpressionBodies.push({
          ets_component_expression_id: id,
          body_id: util.getCorefIdFromTsNodeInSameFile(
            etsComponentExpression.body,
          ),
        });
      }

      return;
    }

    case SyntaxKind.DeleteExpression:
      corefExpression.deleteExpressions.push({
        id,
        expression_id: util.getCorefIdFromTsNodeInSameFile(
          (node as ts.DeleteExpression).expression,
        ),
      });
      return;

    case SyntaxKind.TypeOfExpression:
      corefExpression.typeOfExpressions.push({
        id,
        expression_id: util.getCorefIdFromTsNodeInSameFile(
          (node as ts.TypeOfExpression).expression,
        ),
      });
      return;

    case SyntaxKind.VoidExpression:
      corefExpression.voidExpressions.push({
        id,
        expression_id: util.getCorefIdFromTsNodeInSameFile(
          (node as ts.VoidExpression).expression,
        ),
      });
      return;

    case SyntaxKind.AwaitExpression:
      corefExpression.awaitExpressions.push({
        id,
        expression_id: util.getCorefIdFromTsNodeInSameFile(
          (node as ts.AwaitExpression).expression,
        ),
      });
      return;

    case SyntaxKind.PrefixUnaryExpression:
      try {
        corefExpression.prefixUnaryExpressions.push({
          id,
          operator_id: util.getCorefIdFromTsNodeInSameFile(node.getChildAt(0)),
          operand_id: util.getCorefIdFromTsNodeInSameFile(
            (node as ts.PrefixUnaryExpression).operand,
          ),
        });
      } catch (e) {
        console.error(e);
      }

      return;

    case SyntaxKind.PostfixUnaryExpression:
      try {
        corefExpression.postfixUnaryExpressions.push({
          id,
          operand_id: util.getCorefIdFromTsNodeInSameFile(
            (node as ts.PostfixUnaryExpression).operand,
          ),
          operator_id: util.getCorefIdFromTsNodeInSameFile(node.getChildAt(1)),
        });
      } catch (e) {
        console.error(e);
      }

      return;

    case SyntaxKind.BinaryExpression:
      corefExpression.binaryExpressions.push({
        id,
        left_id: util.getCorefIdFromTsNodeInSameFile(
          (node as ts.BinaryExpression).left,
        ),
        operator_id: util.getCorefIdFromTsNodeInSameFile(
          (node as ts.BinaryExpression).operatorToken,
        ),
        right_id: util.getCorefIdFromTsNodeInSameFile(
          (node as ts.BinaryExpression).right,
        ),
      });
      return;

    case SyntaxKind.ConditionalExpression:
      corefExpression.conditionalExpressions.push({
        id,
        condition_id: util.getCorefIdFromTsNodeInSameFile(
          (node as ts.ConditionalExpression).condition,
        ),
        question_token_id: util.getCorefIdFromTsNodeInSameFile(
          (node as ts.ConditionalExpression).questionToken,
        ),
        then_expression_id: util.getCorefIdFromTsNodeInSameFile(
          (node as ts.ConditionalExpression).whenTrue,
        ),
        colon_token_id: util.getCorefIdFromTsNodeInSameFile(
          (node as ts.ConditionalExpression).colonToken,
        ),
        else_expression_id: util.getCorefIdFromTsNodeInSameFile(
          (node as ts.ConditionalExpression).whenFalse,
        ),
      });
      return;

    case SyntaxKind.YieldExpression: {
      const yieldExpression = node as ts.YieldExpression;
      corefExpression.yieldExpressions.push({ id });

      if (yieldExpression.asteriskToken) {
        corefExpression.yieldExpressionAsteriskTokens.push({
          yield_expression_id: id,
          asterisk_token_id: util.getCorefIdFromTsNodeInSameFile(
            yieldExpression.asteriskToken,
          ),
        });
      }

      if (yieldExpression.expression) {
        corefExpression.yieldExpressionExpressions.push({
          yield_expression_id: id,
          expression_id: util.getCorefIdFromTsNodeInSameFile(
            yieldExpression.expression,
          ),
        });
      }

      return;
    }

    case SyntaxKind.SpreadElement:
      corefExpression.spreadElements.push({
        id,
        expression_id: util.getCorefIdFromTsNodeInSameFile(
          (node as ts.SpreadElement).expression,
        ),
      });
      return;

    case SyntaxKind.ClassExpression:
      corefExpression.classExpressions.push({ id });
      return;

    case SyntaxKind.OmittedExpression:
      corefExpression.omittedExpressions.push({ id });
      return;

    case SyntaxKind.ExpressionWithTypeArguments:
      corefExpression.expressionWithTypeArgumentsList.push({
        id,
        expression_id: util.getCorefIdFromTsNodeInSameFile(
          (node as ts.ExpressionWithTypeArguments).expression,
        ),
      });
      return;

    case SyntaxKind.AsExpression:
      corefExpression.asExpressions.push({
        id,
        expression_id: util.getCorefIdFromTsNodeInSameFile(
          (node as ts.AsExpression).expression,
        ),
        type_node_id: util.getCorefIdFromTsNodeInSameFile(
          (node as ts.AsExpression).type,
        ),
      });
      return;

    case SyntaxKind.NonNullExpression:
      corefExpression.nonNullExpressions.push({
        id,
        expression_id: util.getCorefIdFromTsNodeInSameFile(
          (node as ts.NonNullExpression).expression,
        ),
      });
      return;

    case SyntaxKind.MetaProperty:
      corefExpression.metaProperties.push({
        id,
        keyword_token_id: util.getCorefIdFromTsNodeInSameFile(
          node.getChildAt(0),
        ),
        name_node_id: util.getCorefIdFromTsNodeInSameFile(
          (node as ts.MetaProperty).name,
        ),
      });
      return;

    case SyntaxKind.SatisfiesExpression:
      corefExpression.satisfiesExpressions.push({
        id,
        expression_id: util.getCorefIdFromTsNodeInSameFile(
          (node as ts.SatisfiesExpression).expression,
        ),
        type_node_id: util.getCorefIdFromTsNodeInSameFile(
          (node as ts.SatisfiesExpression).type,
        ),
      });
      return;
  }
}
