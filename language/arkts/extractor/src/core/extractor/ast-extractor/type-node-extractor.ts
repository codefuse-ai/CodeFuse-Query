/**
 * Copyright 2024 Ant Group CO., Ltd.
 */

import type * as ts from "ohos-typescript";
import { SyntaxKind } from "ohos-typescript";

import type { CorefTypeNode } from "../../../model/coref";
import * as util from "../../util";

export function isTypeNodeKind(kind: SyntaxKind) {
  switch (kind) {
    case SyntaxKind.AnyKeyword:
    case SyntaxKind.BigIntKeyword:
    case SyntaxKind.BooleanKeyword:
    case SyntaxKind.IntrinsicKeyword:
    case SyntaxKind.NeverKeyword:
    case SyntaxKind.NumberKeyword:
    case SyntaxKind.ObjectKeyword:
    case SyntaxKind.StringKeyword:
    case SyntaxKind.SymbolKeyword:
    case SyntaxKind.UndefinedKeyword:
    case SyntaxKind.UnknownKeyword:
    case SyntaxKind.VoidKeyword:

    case SyntaxKind.TypePredicate:
    case SyntaxKind.TypeReference:
    case SyntaxKind.FunctionType:
    case SyntaxKind.ConstructorType:
    case SyntaxKind.TypeQuery:
    case SyntaxKind.TypeLiteral:
    case SyntaxKind.ArrayType:
    case SyntaxKind.TupleType:
    case SyntaxKind.NamedTupleMember:
    case SyntaxKind.OptionalType:
    case SyntaxKind.RestType:
    case SyntaxKind.UnionType:
    case SyntaxKind.IntersectionType:
    case SyntaxKind.ConditionalType:
    case SyntaxKind.InferType:
    case SyntaxKind.ParenthesizedType:
    case SyntaxKind.ThisType:
    case SyntaxKind.TypeOperator:
    case SyntaxKind.IndexedAccessType:
    case SyntaxKind.MappedType:
    case SyntaxKind.LiteralType:
    case SyntaxKind.TemplateLiteralType:
    case SyntaxKind.TemplateLiteralTypeSpan:
    case SyntaxKind.ImportType:
    case SyntaxKind.ExpressionWithTypeArguments:
    case SyntaxKind.JSDocTypeExpression:
    case SyntaxKind.JSDocAllType:
    case SyntaxKind.JSDocUnknownType:
    case SyntaxKind.JSDocNonNullableType:
    case SyntaxKind.JSDocNullableType:
    case SyntaxKind.JSDocOptionalType:
    case SyntaxKind.JSDocFunctionType:
    case SyntaxKind.JSDocVariadicType:
    case SyntaxKind.JSDocNamepathType:
    case SyntaxKind.JSDocSignature:
    case SyntaxKind.JSDocTypeLiteral:
      return true;
  }

  return false;
}

export function isNodeWithTypeArgumentsKind(kind: SyntaxKind) {
  switch (kind) {
    case SyntaxKind.TypeReference:
    case SyntaxKind.TypeQuery:
    case SyntaxKind.ExpressionWithTypeArguments:
    case SyntaxKind.ImportType:
      return true;
  }

  return false;
}

export function extractTypeNode(
  id: bigint,
  node: ts.Node,
  corefTypeNode: CorefTypeNode,
) {
  const kind = node.kind;

  if (!isTypeNodeKind(kind)) {
    return;
  }

  corefTypeNode.typeNodes.push({
    id,
    kind,
  });

  if (isNodeWithTypeArgumentsKind(kind)) {
    corefTypeNode.nodeWithTypeArgumentsList.push({
      id,
      kind,
    });

    (node as ts.NodeWithTypeArguments).typeArguments?.forEach(
      (typeArgument, index) => {
        corefTypeNode.nodeWithTypeArgumentsTypeArguments.push({
          type_argument_id: util.getCorefIdFromTsNodeInSameFile(typeArgument),
          node_with_type_arguments_id: id,
          index,
        });
      },
    );
  }

  if (kind === SyntaxKind.FunctionType || kind === SyntaxKind.ConstructorType) {
    corefTypeNode.functionOrConstructorTypes.push({
      id,
      kind,
      type_node_id: util.getCorefIdFromTsNodeInSameFile(
        (node as ts.FunctionOrConstructorTypeNode).type,
      ),
    });
  }

  switch (kind) {
    case SyntaxKind.AnyKeyword:
      corefTypeNode.anyTypes.push({ id });
      return;

    case SyntaxKind.BigIntKeyword:
      corefTypeNode.bigIntTypes.push({ id });
      return;

    case SyntaxKind.BooleanKeyword:
      corefTypeNode.booleanTypes.push({ id });
      return;

    case SyntaxKind.IntrinsicKeyword:
      corefTypeNode.intrinsicTypes.push({ id });
      return;

    case SyntaxKind.NeverKeyword:
      corefTypeNode.neverTypes.push({ id });
      return;

    case SyntaxKind.NumberKeyword:
      corefTypeNode.numberTypes.push({ id });
      return;

    case SyntaxKind.ObjectKeyword:
      corefTypeNode.objectTypes.push({ id });
      return;

    case SyntaxKind.StringKeyword:
      corefTypeNode.stringTypes.push({ id });
      return;

    case SyntaxKind.SymbolKeyword:
      corefTypeNode.symbolTypes.push({ id });
      return;

    case SyntaxKind.UndefinedKeyword:
      corefTypeNode.undefinedTypes.push({ id });
      return;

    case SyntaxKind.UnknownKeyword:
      corefTypeNode.unknownTypes.push({ id });
      return;

    case SyntaxKind.VoidKeyword:
      corefTypeNode.voidTypes.push({ id });
      return;

    case SyntaxKind.ThisType:
      corefTypeNode.thisTypes.push({ id });
      return;

    case SyntaxKind.TypePredicate: {
      const typePredicate = node as ts.TypePredicateNode;
      corefTypeNode.typePredicates.push({
        id,
        parameter_name_node_id: util.getCorefIdFromTsNodeInSameFile(
          typePredicate.parameterName,
        ),
      });

      if (typePredicate.assertsModifier) {
        corefTypeNode.typePredicateAssertsModifiers.push({
          type_predicate_id: id,
          asserts_modifier_id: util.getCorefIdFromTsNodeInSameFile(
            typePredicate.assertsModifier,
          ),
        });
      }

      if (typePredicate.type) {
        corefTypeNode.typePredicateTypeNodes.push({
          type_predicate_id: id,
          type_node_id: util.getCorefIdFromTsNodeInSameFile(typePredicate.type),
        });
      }

      return;
    }

    case SyntaxKind.TypeReference:
      corefTypeNode.typeReferences.push({
        id,
        type_name_node_id: util.getCorefIdFromTsNodeInSameFile(
          (node as ts.TypeReferenceNode).typeName,
        ),
      });
      return;

    case SyntaxKind.FunctionType:
      corefTypeNode.functionTypes.push({ id });
      return;

    case SyntaxKind.ConstructorType:
      corefTypeNode.constructorTypes.push({ id });
      return;

    case SyntaxKind.TypeQuery:
      corefTypeNode.typeQueries.push({
        id,
        expression_name_node_id: util.getCorefIdFromTsNodeInSameFile(
          (node as ts.TypeQueryNode).exprName,
        ),
      });
      return;

    case SyntaxKind.TypeLiteral:
      corefTypeNode.typeLiterals.push({ id });

      (node as ts.TypeLiteralNode).members.forEach((member, index) => {
        corefTypeNode.typeLiteralMembers.push({
          member_id: util.getCorefIdFromTsNodeInSameFile(member),
          type_literal_id: id,
          index,
        });
      });

      return;

    case SyntaxKind.ArrayType:
      corefTypeNode.arrayTypes.push({
        id,
        element_type_node_id: util.getCorefIdFromTsNodeInSameFile(
          (node as ts.ArrayTypeNode).elementType,
        ),
      });
      return;

    case SyntaxKind.TupleType:
      corefTypeNode.tupleTypes.push({ id });

      (node as ts.TupleTypeNode).elements.forEach((element, index) => {
        corefTypeNode.tupleTypeElements.push({
          element_id: util.getCorefIdFromTsNodeInSameFile(element),
          tuple_type_id: id,
          index,
        });
      });

      return;

    case SyntaxKind.OptionalType:
      corefTypeNode.optionalTypes.push({
        id,
        type_node_id: util.getCorefIdFromTsNodeInSameFile(
          (node as ts.OptionalTypeNode).type,
        ),
      });
      return;

    case SyntaxKind.RestType:
      corefTypeNode.restTypes.push({
        id,
        type_node_id: util.getCorefIdFromTsNodeInSameFile(
          (node as ts.RestTypeNode).type,
        ),
      });
      return;

    case SyntaxKind.UnionType:
      corefTypeNode.unionTypes.push({ id });

      (node as ts.UnionTypeNode).types.forEach((typeNode, index) => {
        corefTypeNode.unionTypeTypeNodes.push({
          type_node_id: util.getCorefIdFromTsNodeInSameFile(typeNode),
          union_type_id: id,
          index,
        });
      });

      return;

    case SyntaxKind.IntersectionType:
      corefTypeNode.intersectionTypes.push({ id });

      (node as ts.IntersectionTypeNode).types.forEach((typeNode, index) => {
        corefTypeNode.intersectionTypeTypeNodes.push({
          type_node_id: util.getCorefIdFromTsNodeInSameFile(typeNode),
          intersection_type_id: id,
          index,
        });
      });

      return;

    case SyntaxKind.ConditionalType:
      corefTypeNode.conditionalTypes.push({
        id,
        check_type_node_id: util.getCorefIdFromTsNodeInSameFile(
          (node as ts.ConditionalTypeNode).checkType,
        ),
        extends_type_node_id: util.getCorefIdFromTsNodeInSameFile(
          (node as ts.ConditionalTypeNode).extendsType,
        ),
        then_type_node_id: util.getCorefIdFromTsNodeInSameFile(
          (node as ts.ConditionalTypeNode).trueType,
        ),
        else_type_node_id: util.getCorefIdFromTsNodeInSameFile(
          (node as ts.ConditionalTypeNode).falseType,
        ),
      });
      return;

    case SyntaxKind.InferType:
      corefTypeNode.inferTypes.push({
        id,
        type_parameter_id: util.getCorefIdFromTsNodeInSameFile(
          (node as ts.InferTypeNode).typeParameter,
        ),
      });
      return;

    case SyntaxKind.ParenthesizedType:
      corefTypeNode.parenthesizedTypes.push({
        id,
        type_node_id: util.getCorefIdFromTsNodeInSameFile(
          (node as ts.ParenthesizedTypeNode).type,
        ),
      });
      return;

    case SyntaxKind.TypeOperator:
      corefTypeNode.typeOperators.push({
        id,
        operator_id: util.getCorefIdFromTsNodeInSameFile(node.getChildAt(0)),
        type_node_id: util.getCorefIdFromTsNodeInSameFile(
          (node as ts.TypeOperatorNode).type,
        ),
      });
      return;

    case SyntaxKind.IndexedAccessType:
      corefTypeNode.indexedAccessTypes.push({
        id,
        object_type_node_id: util.getCorefIdFromTsNodeInSameFile(
          (node as ts.IndexedAccessTypeNode).objectType,
        ),
        index_type_node_id: util.getCorefIdFromTsNodeInSameFile(
          (node as ts.IndexedAccessTypeNode).indexType,
        ),
      });
      return;

    case SyntaxKind.MappedType: {
      const mappedType = node as ts.MappedTypeNode;
      corefTypeNode.mappedTypes.push({
        id,
        type_parameter_id: util.getCorefIdFromTsNodeInSameFile(
          mappedType.typeParameter,
        ),
      });

      if (mappedType.readonlyToken) {
        corefTypeNode.mappedTypeReadonlyTokens.push({
          mapped_type_id: id,
          readonly_token_id: util.getCorefIdFromTsNodeInSameFile(
            mappedType.readonlyToken,
          ),
        });
      }

      if (mappedType.nameType) {
        corefTypeNode.mappedTypeNameTypeNodes.push({
          mapped_type_id: id,
          name_type_node_id: util.getCorefIdFromTsNodeInSameFile(
            mappedType.nameType,
          ),
        });
      }

      if (mappedType.questionToken) {
        corefTypeNode.mappedTypeQuestionTokens.push({
          mapped_type_id: id,
          question_token_id: util.getCorefIdFromTsNodeInSameFile(
            mappedType.questionToken,
          ),
        });
      }

      if (mappedType.type) {
        corefTypeNode.mappedTypeTypeNodes.push({
          mapped_type_id: id,
          type_node_id: util.getCorefIdFromTsNodeInSameFile(mappedType.type),
        });
      }

      return;
    }

    case SyntaxKind.LiteralType:
      corefTypeNode.literalTypes.push({
        id,
        literal_id: util.getCorefIdFromTsNodeInSameFile(
          (node as ts.LiteralTypeNode).literal,
        ),
      });
      return;

    case SyntaxKind.NamedTupleMember: {
      const namedTupleMember = node as ts.NamedTupleMember;
      corefTypeNode.namedTupleMembers.push({
        id,
        name_node_id: util.getCorefIdFromTsNodeInSameFile(
          namedTupleMember.name,
        ),
        type_node_id: util.getCorefIdFromTsNodeInSameFile(
          namedTupleMember.type,
        ),
      });

      if (namedTupleMember.dotDotDotToken) {
        corefTypeNode.namedTupleMemberDotDotDotTokens.push({
          named_tuple_member_id: id,
          dot_dot_dot_token_id: util.getCorefIdFromTsNodeInSameFile(
            namedTupleMember.dotDotDotToken,
          ),
        });
      }

      if (namedTupleMember.questionToken) {
        corefTypeNode.namedTupleMemberQuestionTokens.push({
          named_tuple_member_id: id,
          question_token_id: util.getCorefIdFromTsNodeInSameFile(
            namedTupleMember.questionToken,
          ),
        });
      }

      return;
    }

    // TemplateLiteralType & TemplateLiteralTypeSpan
    case SyntaxKind.TemplateLiteralType:
      // TemplateLiteralType
      corefTypeNode.templateLiteralTypes.push({
        id,
        head_id: util.getCorefIdFromTsNodeInSameFile(
          (node as ts.TemplateLiteralTypeNode).head,
        ),
      });

      // TemplateLiteralTypeSpan
      (node as ts.TemplateLiteralTypeNode).templateSpans.forEach(
        (templateLiteralTypeSpan, index) => {
          corefTypeNode.templateLiteralTypeSpans.push({
            id: util.getCorefIdFromTsNodeInSameFile(templateLiteralTypeSpan),
            parent_id: id,
            index,
            type_node_id: util.getCorefIdFromTsNodeInSameFile(
              templateLiteralTypeSpan.type,
            ),
            literal_id: util.getCorefIdFromTsNodeInSameFile(
              templateLiteralTypeSpan.literal,
            ),
          });
        },
      );

      return;

    case SyntaxKind.ImportType: {
      const importType = node as ts.ImportTypeNode;
      corefTypeNode.importTypes.push({
        id,
        is_type_of: importType.isTypeOf,
        argument_id: util.getCorefIdFromTsNodeInSameFile(importType.argument),
      });

      if (importType.qualifier) {
        corefTypeNode.importTypeQualifiers.push({
          import_type_id: id,
          qualifier_id: util.getCorefIdFromTsNodeInSameFile(
            importType.qualifier,
          ),
        });
      }

      return;
    }
  }
}
