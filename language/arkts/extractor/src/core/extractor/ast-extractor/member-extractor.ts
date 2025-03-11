/**
 * Copyright 2024 Ant Group CO., Ltd.
 */

import type * as ts from "ohos-typescript";
import { SyntaxKind } from "ohos-typescript";

import type { CorefMember, HasKind } from "../../../model/coref";
import * as util from "../../util";

export function isObjectLiteralElementKind(kind: SyntaxKind): boolean {
  switch (kind) {
    case SyntaxKind.PropertyAssignment:
    case SyntaxKind.ShorthandPropertyAssignment:
    case SyntaxKind.SpreadAssignment:
    case SyntaxKind.MethodDeclaration:
    case SyntaxKind.GetAccessor:
    case SyntaxKind.SetAccessor:
      return true;
  }

  return false;
}

export function isClassElementKind(kind: SyntaxKind): boolean {
  switch (kind) {
    case SyntaxKind.PropertyDeclaration:
    case SyntaxKind.MethodDeclaration:
    case SyntaxKind.Constructor:
    case SyntaxKind.SemicolonClassElement:
    case SyntaxKind.GetAccessor:
    case SyntaxKind.SetAccessor:
    case SyntaxKind.IndexSignature:
    case SyntaxKind.ClassStaticBlockDeclaration:
      return true;
  }

  return false;
}

export function isTypeElementKind(kind: SyntaxKind): boolean {
  switch (kind) {
    case SyntaxKind.CallSignature:
    case SyntaxKind.ConstructSignature:
    case SyntaxKind.PropertySignature:
    case SyntaxKind.MethodSignature:
    case SyntaxKind.GetAccessor:
    case SyntaxKind.SetAccessor:
    case SyntaxKind.IndexSignature:
      return true;
  }

  return false;
}

export function extractMember(
  id: bigint,
  node: ts.Node,
  corefMember: CorefMember,
) {
  const kind = node.kind;

  // Extract EnumMember
  if (kind === SyntaxKind.EnumDeclaration) {
    (node as ts.EnumDeclaration).members.forEach((enumMember, index) => {
      const memberId = util.getCorefIdFromTsNodeInSameFile(enumMember);
      corefMember.enumMembers.push({
        id: memberId,
        parent_id: id,
        index,
        name_node_id: util.getCorefIdFromTsNodeInSameFile(enumMember.name),
      });

      if (enumMember.initializer) {
        corefMember.enumMemberInitializers.push({
          enum_member_id: memberId,
          initializer_id: util.getCorefIdFromTsNodeInSameFile(
            enumMember.initializer,
          ),
        });
      }
    });

    return;
  }

  if (
    !(
      isObjectLiteralElementKind(kind) ||
      isClassElementKind(kind) ||
      isTypeElementKind(kind)
    )
  ) {
    return;
  }

  const member: HasKind = {
    id,
    kind,
  };

  let nameNodeId: bigint | undefined;
  const nameNode = (node as ts.NamedDeclaration).name;
  if (nameNode) {
    nameNodeId = util.getCorefIdFromTsNodeInSameFile(nameNode);
  }

  if (isObjectLiteralElementKind(kind)) {
    corefMember.objectLiteralElements.push(member);

    if (nameNodeId) {
      corefMember.objectLiteralElementNameNodes.push({
        object_literal_element_id: id,
        name_node_id: nameNodeId,
      });
    }
  }

  if (isClassElementKind(kind)) {
    corefMember.classElements.push(member);

    if (nameNodeId) {
      corefMember.classElementNameNodes.push({
        class_element_id: id,
        name_node_id: nameNodeId,
      });
    }
  }

  if (isTypeElementKind(kind)) {
    corefMember.typeElements.push(member);

    if (nameNodeId) {
      corefMember.typeElementNameNodes.push({
        type_element_id: id,
        name_node_id: nameNodeId,
      });
    }

    const questionToken = (node as ts.TypeElement).questionToken;
    if (questionToken) {
      corefMember.typeElementQuestionTokens.push({
        type_element_id: id,
        question_token_id: util.getCorefIdFromTsNodeInSameFile(questionToken),
      });
    }
  }

  switch (node.kind) {
    case SyntaxKind.PropertySignature: {
      const propertySignature = node as ts.PropertySignature;
      corefMember.propertySignatures.push({
        id,
        name_node_id: nameNodeId as bigint,
      });

      if (propertySignature.questionToken) {
        corefMember.propertySignatureQuestionTokens.push({
          property_signature_id: id,
          question_token_id: util.getCorefIdFromTsNodeInSameFile(
            propertySignature.questionToken,
          ),
        });
      }

      if (propertySignature.type) {
        corefMember.propertySignatureTypeNodes.push({
          property_signature_id: id,
          type_node_id: util.getCorefIdFromTsNodeInSameFile(
            propertySignature.type,
          ),
        });
      }

      return;
    }

    case SyntaxKind.PropertyDeclaration: {
      const propertyDeclaration = node as ts.PropertyDeclaration;
      corefMember.propertyDeclarations.push({
        id,
        name_node_id: nameNodeId as bigint,
      });

      if (propertyDeclaration.questionToken) {
        corefMember.propertyDeclarationQuestionTokens.push({
          property_declaration_id: id,
          question_token_id: util.getCorefIdFromTsNodeInSameFile(
            propertyDeclaration.questionToken,
          ),
        });
      }

      if (propertyDeclaration.exclamationToken) {
        corefMember.propertyDeclarationExclamationTokens.push({
          property_declaration_id: id,
          exclamation_token_id: util.getCorefIdFromTsNodeInSameFile(
            propertyDeclaration.exclamationToken,
          ),
        });
      }

      if (propertyDeclaration.type) {
        corefMember.propertyDeclarationTypeNodes.push({
          property_declaration_id: id,
          type_node_id: util.getCorefIdFromTsNodeInSameFile(
            propertyDeclaration.type,
          ),
        });
      }

      if (propertyDeclaration.initializer) {
        corefMember.propertyDeclarationInitializers.push({
          property_declaration_id: id,
          initializer_id: util.getCorefIdFromTsNodeInSameFile(
            propertyDeclaration.initializer,
          ),
        });
      }

      return;
    }

    case SyntaxKind.MethodSignature:
      corefMember.methodSignatures.push({
        id,
        name_node_id: nameNodeId as bigint,
      });
      return;

    case SyntaxKind.MethodDeclaration: {
      corefMember.methodDeclarations.push({
        id,
        name_node_id: nameNodeId as bigint,
      });

      const body = (node as ts.MethodDeclaration).body;
      if (body) {
        corefMember.methodDeclarationBodies.push({
          method_declaration_id: id,
          body_id: util.getCorefIdFromTsNodeInSameFile(body),
        });
      }

      return;
    }

    case SyntaxKind.ClassStaticBlockDeclaration:
      corefMember.classStaticBlockDeclarations.push({
        id,
        body_id: util.getCorefIdFromTsNodeInSameFile(
          (node as ts.ClassStaticBlockDeclaration).body,
        ),
      });
      return;

    case SyntaxKind.Constructor: {
      corefMember.constructors.push({
        id,
      });

      const body = (node as ts.ConstructorDeclaration).body;
      if (body) {
        corefMember.constructorBodies.push({
          constructor_id: id,
          body_id: util.getCorefIdFromTsNodeInSameFile(body),
        });
      }

      return;
    }

    case SyntaxKind.GetAccessor: {
      corefMember.getAccessors.push({
        id,
        name_node_id: nameNodeId as bigint,
      });

      const body = (node as ts.GetAccessorDeclaration).body;
      if (body) {
        corefMember.getAccessorBodies.push({
          get_accessor_id: id,
          body_id: util.getCorefIdFromTsNodeInSameFile(body),
        });
      }

      return;
    }
    case SyntaxKind.SetAccessor: {
      corefMember.setAccessors.push({
        id,
        name_node_id: nameNodeId as bigint,
      });

      const body = (node as ts.SetAccessorDeclaration).body;
      if (body) {
        corefMember.setAccessorBodies.push({
          set_accessor_id: id,
          body_id: util.getCorefIdFromTsNodeInSameFile(body),
        });
      }

      return;
    }
    case SyntaxKind.CallSignature:
      corefMember.callSignatures.push({ id });
      return;
    case SyntaxKind.ConstructSignature:
      corefMember.constructSignatures.push({ id });
      return;
    case SyntaxKind.IndexSignature:
      corefMember.indexSignatures.push({
        id,
        type_node_id: util.getCorefIdFromTsNodeInSameFile(
          (node as ts.IndexSignatureDeclaration).type,
        ),
      });
      return;
    case SyntaxKind.SemicolonClassElement:
      corefMember.semicolonClassElements.push({ id });
      return;
    case SyntaxKind.PropertyAssignment:
      corefMember.propertyAssignments.push({
        id,
        name_node_id: nameNodeId as bigint,
        initializer_id: util.getCorefIdFromTsNodeInSameFile(
          (node as ts.PropertyAssignment).initializer,
        ),
      });
      return;
    case SyntaxKind.ShorthandPropertyAssignment:
      corefMember.shorthandPropertyAssignments.push({
        id,
        name_node_id: nameNodeId as bigint,
      });
      return;
    case SyntaxKind.SpreadAssignment:
      corefMember.spreadAssignments.push({
        id,
        expression_id: util.getCorefIdFromTsNodeInSameFile(
          (node as ts.SpreadAssignment).expression,
        ),
      });
      return;
  }
}
