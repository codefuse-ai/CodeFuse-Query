/**
 * Copyright 2024 Ant Group CO., Ltd.
 */

import type * as ts from "ohos-typescript";
import { SyntaxKind } from "ohos-typescript";

import type { CorefDeclaration } from "../../../model/coref";
import * as util from "../../util";

export function isSignatureDeclarationKind(kind: SyntaxKind) {
  switch (kind) {
    case SyntaxKind.CallSignature:
    case SyntaxKind.ConstructSignature:
    case SyntaxKind.MethodSignature:
    case SyntaxKind.IndexSignature:
    case SyntaxKind.FunctionType:
    case SyntaxKind.ConstructorType:
    case SyntaxKind.JSDocFunctionType:
      return true;
  }
  return util.isFunctionLikeDeclarationKind(kind);
}

export function isDeclarationKind(kind: SyntaxKind) {
  switch (kind) {
    case SyntaxKind.ArrowFunction:
    case SyntaxKind.BinaryExpression:
    case SyntaxKind.BindingElement:
    case SyntaxKind.CallExpression:
    case SyntaxKind.CallSignature:
    case SyntaxKind.ClassDeclaration:
    case SyntaxKind.ClassExpression:
    case SyntaxKind.ClassStaticBlockDeclaration:
    case SyntaxKind.Constructor:
    case SyntaxKind.ConstructorType:
    case SyntaxKind.ConstructSignature:
    case SyntaxKind.EnumDeclaration:
    case SyntaxKind.EnumMember:
    case SyntaxKind.EtsComponentExpression:
    case SyntaxKind.ExportDeclaration:
    case SyntaxKind.ExportSpecifier:
    case SyntaxKind.FunctionDeclaration:
    case SyntaxKind.FunctionExpression:
    case SyntaxKind.FunctionType:
    case SyntaxKind.GetAccessor:
    case SyntaxKind.Identifier:
    case SyntaxKind.ImportClause:
    case SyntaxKind.ImportDeclaration:
    case SyntaxKind.ImportEqualsDeclaration:
    case SyntaxKind.ImportSpecifier:
    case SyntaxKind.IndexSignature:
    case SyntaxKind.InterfaceDeclaration:
    case SyntaxKind.JSDocCallbackTag:
    case SyntaxKind.JSDocEnumTag:
    case SyntaxKind.JSDocFunctionType:
    case SyntaxKind.JSDocParameterTag:
    case SyntaxKind.JSDocPropertyTag:
    case SyntaxKind.JSDocSignature:
    case SyntaxKind.JSDocTypedefTag:
    case SyntaxKind.JsxAttribute:
    case SyntaxKind.MappedType:
    case SyntaxKind.MethodDeclaration:
    case SyntaxKind.MethodSignature:
    case SyntaxKind.ModuleDeclaration:
    case SyntaxKind.NamedTupleMember:
    case SyntaxKind.NamespaceExport:
    case SyntaxKind.NamespaceExportDeclaration:
    case SyntaxKind.NamespaceImport:
    case SyntaxKind.NewExpression:
    case SyntaxKind.NoSubstitutionTemplateLiteral:
    case SyntaxKind.NumericLiteral:
    case SyntaxKind.ObjectLiteralExpression:
    case SyntaxKind.Parameter:
    case SyntaxKind.PropertyAssignment:
    case SyntaxKind.PropertyDeclaration:
    case SyntaxKind.PropertySignature:
    case SyntaxKind.SetAccessor:
    case SyntaxKind.ShorthandPropertyAssignment:
    case SyntaxKind.SourceFile:
    case SyntaxKind.StringLiteral:
    case SyntaxKind.StructDeclaration:
    case SyntaxKind.TypeAliasDeclaration:
    case SyntaxKind.TypeLiteral:
    case SyntaxKind.TypeParameter:
    case SyntaxKind.VariableDeclaration:
      return true;
  }
  return false;
}

export function extractDeclaration(
  id: bigint,
  node: ts.Node,
  corefDeclaration: CorefDeclaration,
): void {
  const kind = node.kind;

  // For ImportSpecifiers and ExportSpecifiers.
  // Their parents NamedImports and NamedExports are not declarations.
  switch (kind) {
    // ImportSpecifiers
    case SyntaxKind.NamedImports:
      (node as ts.NamedImports).elements.forEach((element, index) => {
        const importSpecifierId = util.getCorefIdFromTsNodeInSameFile(element);
        corefDeclaration.importSpecifiers.push({
          id: importSpecifierId,
          parent_id: id,
          index,
          name_node_id: util.getCorefIdFromTsNodeInSameFile(element.name),
          is_type_only: element.isTypeOnly,
        });

        if (element.propertyName) {
          corefDeclaration.importSpecifierPropertyNameNodes.push({
            import_specifier_id: importSpecifierId,
            property_name_node_id: util.getCorefIdFromTsNodeInSameFile(
              element.propertyName,
            ),
          });
        }
      });

      return;

    // ExportSpecifiers
    case SyntaxKind.NamedExports:
      (node as ts.NamedExports).elements.forEach((element, index) => {
        const exportSpecifierId = util.getCorefIdFromTsNodeInSameFile(element);
        corefDeclaration.exportSpecifiers.push({
          id: exportSpecifierId,
          parent_id: id,
          index,
          is_type_only: element.isTypeOnly,
          name_node_id: util.getCorefIdFromTsNodeInSameFile(element.name),
        });

        if (element.propertyName) {
          corefDeclaration.exportSpecifierPropertyNameNodes.push({
            export_specifier_id: exportSpecifierId,
            property_name_node_id: util.getCorefIdFromTsNodeInSameFile(
              element.propertyName,
            ),
          });
        }
      });

      return;
  }

  if (!isDeclarationKind(kind)) {
    return;
  }

  corefDeclaration.declarations.push({
    id,
    kind,
  });

  const namedDeclaration = node as ts.NamedDeclaration;
  if (namedDeclaration.name) {
    corefDeclaration.declarationNameNodes.push({
      declaration_id: id,
      name_node_id: util.getCorefIdFromTsNodeInSameFile(namedDeclaration.name),
    });
  }

  // SignatureDeclaration
  if (isSignatureDeclarationKind(kind)) {
    const signatureDeclaration = node as ts.SignatureDeclaration;

    corefDeclaration.signatureDeclarations.push({
      id,
      kind,
    });

    if (signatureDeclaration.name) {
      corefDeclaration.signatureDeclarationNameNodes.push({
        signature_declaration_id: id,
        name_node_id: util.getCorefIdFromTsNodeInSameFile(
          signatureDeclaration.name,
        ),
      });
    }

    signatureDeclaration.typeParameters?.forEach((typeParameter, index) => {
      corefDeclaration.signatureDeclarationTypeParameters.push({
        type_parameter_id: util.getCorefIdFromTsNodeInSameFile(typeParameter),
        signature_declaration_id: id,
        index,
      });
    });

    signatureDeclaration.parameters.forEach((parameter, index) => {
      corefDeclaration.signatureDeclarationParameters.push({
        parameter_id: util.getCorefIdFromTsNodeInSameFile(parameter),
        signature_declaration_id: id,
        index,
      });
    });

    if (signatureDeclaration.type) {
      corefDeclaration.signatureDeclarationTypeNodes.push({
        signature_declaration_id: id,
        type_node_id: util.getCorefIdFromTsNodeInSameFile(
          signatureDeclaration.type,
        ),
      });
    }

    // FunctionLikeDeclaration
    if (util.isFunctionLikeDeclarationKind(kind)) {
      const functionLikeDeclaration = node as ts.FunctionLikeDeclaration;

      corefDeclaration.functionLikeDeclarations.push({
        id,
        kind,
      });

      if (functionLikeDeclaration.asteriskToken) {
        corefDeclaration.functionLikeDeclarationAsteriskTokens.push({
          function_like_declaration_id: id,
          asterisk_token_id: util.getCorefIdFromTsNodeInSameFile(
            functionLikeDeclaration.asteriskToken,
          ),
        });
      }

      if (functionLikeDeclaration.questionToken) {
        corefDeclaration.functionLikeDeclarationQuestionTokens.push({
          function_like_declaration_id: id,
          question_token_id: util.getCorefIdFromTsNodeInSameFile(
            functionLikeDeclaration.questionToken,
          ),
        });
      }

      if (functionLikeDeclaration.exclamationToken) {
        corefDeclaration.functionLikeDeclarationExclamationTokens.push({
          function_like_declaration_id: id,
          exclamation_token_id: util.getCorefIdFromTsNodeInSameFile(
            functionLikeDeclaration.exclamationToken,
          ),
        });
      }

      if (functionLikeDeclaration.body) {
        corefDeclaration.functionLikeDeclarationBodies.push({
          function_like_declaration_id: id,
          body_id: util.getCorefIdFromTsNodeInSameFile(
            functionLikeDeclaration.body,
          ),
        });
      }
    }
  }

  // ClassLikeDeclaration
  if (util.isClassLikeDeclarationKind(kind)) {
    const classLikeDeclaration = node as ts.ClassLikeDeclaration;

    corefDeclaration.classLikeDeclarations.push({
      id,
      kind,
    });

    if (classLikeDeclaration.name) {
      corefDeclaration.classLikeDeclarationNameNodes.push({
        class_like_declaration_id: id,
        name_node_id: util.getCorefIdFromTsNodeInSameFile(
          classLikeDeclaration.name,
        ),
      });
    }

    classLikeDeclaration.typeParameters?.forEach((typeParameter, index) => {
      corefDeclaration.classLikeDeclarationTypeParameters.push({
        type_parameter_id: util.getCorefIdFromTsNodeInSameFile(typeParameter),
        class_like_declaration_id: id,
        index,
      });
    });

    classLikeDeclaration.members.forEach((member, index) => {
      corefDeclaration.classLikeDeclarationMembers.push({
        member_id: util.getCorefIdFromTsNodeInSameFile(member),
        class_like_declaration_id: id,
        index,
      });
    });
  }

  switch (kind) {
    case SyntaxKind.TypeParameter: {
      const typeParameter = node as ts.TypeParameterDeclaration;
      corefDeclaration.typeParameters.push({
        id,
        name_node_id: util.getCorefIdFromTsNodeInSameFile(typeParameter.name),
      });

      if (typeParameter.constraint) {
        corefDeclaration.typeParameterConstraints.push({
          type_parameter_id: id,
          constraint_id: util.getCorefIdFromTsNodeInSameFile(
            typeParameter.constraint,
          ),
        });
      }

      if (typeParameter.default) {
        corefDeclaration.typeParameterDefaults.push({
          type_parameter_id: id,
          default_id: util.getCorefIdFromTsNodeInSameFile(
            typeParameter.default,
          ),
        });
      }

      return;
    }

    case SyntaxKind.Parameter: {
      const parameter = node as ts.ParameterDeclaration;
      corefDeclaration.parameters.push({
        id,
        name_node_id: util.getCorefIdFromTsNodeInSameFile(parameter.name),
      });

      if (parameter.dotDotDotToken) {
        corefDeclaration.parameterDotDotDotTokens.push({
          parameter_id: id,
          dot_dot_dot_token_id: util.getCorefIdFromTsNodeInSameFile(
            parameter.dotDotDotToken,
          ),
        });
      }

      if (parameter.questionToken) {
        corefDeclaration.parameterQuestionTokens.push({
          parameter_id: id,
          question_token_id: util.getCorefIdFromTsNodeInSameFile(
            parameter.questionToken,
          ),
        });
      }

      if (parameter.type) {
        corefDeclaration.parameterTypeNodes.push({
          parameter_id: id,
          type_node_id: util.getCorefIdFromTsNodeInSameFile(parameter.type),
        });
      }

      if (parameter.initializer) {
        corefDeclaration.parameterInitializers.push({
          parameter_id: id,
          initializer_id: util.getCorefIdFromTsNodeInSameFile(
            parameter.initializer,
          ),
        });
      }

      return;
    }

    case SyntaxKind.VariableDeclaration: {
      const variableDeclaration = node as ts.VariableDeclaration;
      corefDeclaration.variableDeclarations.push({
        id,
        name_node_id: util.getCorefIdFromTsNodeInSameFile(
          variableDeclaration.name,
        ),
      });

      if (variableDeclaration.exclamationToken) {
        corefDeclaration.variableDeclarationExclamationTokens.push({
          variable_declaration_id: id,
          exclamation_token_id: util.getCorefIdFromTsNodeInSameFile(
            variableDeclaration.exclamationToken,
          ),
        });
      }

      if (variableDeclaration.type) {
        corefDeclaration.variableDeclarationTypeNodes.push({
          variable_declaration_id: id,
          type_node_id: util.getCorefIdFromTsNodeInSameFile(
            variableDeclaration.type,
          ),
        });
      }

      if (variableDeclaration.initializer) {
        corefDeclaration.variableDeclarationInitializers.push({
          variable_declaration_id: id,
          initializer_id: util.getCorefIdFromTsNodeInSameFile(
            variableDeclaration.initializer,
          ),
        });
      }

      return;
    }

    case SyntaxKind.ImportClause: {
      const importClause = node as ts.ImportClause;
      corefDeclaration.importClauses.push({
        id,
        parent_id: util.getCorefIdFromTsNodeInSameFile(importClause.parent),
        is_type_only: importClause.isTypeOnly,
      });

      if (importClause.name) {
        corefDeclaration.importClauseNameNodes.push({
          import_clause_id: id,
          name_node_id: util.getCorefIdFromTsNodeInSameFile(importClause.name),
        });
      }

      if (importClause.namedBindings) {
        corefDeclaration.importClauseNamedBindingsList.push({
          import_clause_id: id,
          named_bindings_id: util.getCorefIdFromTsNodeInSameFile(
            importClause.namedBindings,
          ),
        });
      }

      return;
    }

    case SyntaxKind.NamespaceImport:
      corefDeclaration.namespaceImports.push({
        id,
        name_node_id: util.getCorefIdFromTsNodeInSameFile(
          (node as ts.NamespaceImport).name,
        ),
      });
      return;

    case SyntaxKind.NamespaceExport:
      corefDeclaration.namespaceExports.push({
        id,
        name_node_id: util.getCorefIdFromTsNodeInSameFile(
          (node as ts.NamespaceExport).name,
        ),
      });
      return;
  }
}
