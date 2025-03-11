/**
 * Copyright 2024 Ant Group CO., Ltd.
 */

import type * as ts from "ohos-typescript";
import { SyntaxKind } from "ohos-typescript";

import type { CorefOtherAstNode } from "../../../model/coref";
import * as util from "../../util";

export function extractOtherAstNode(
  id: bigint,
  node: ts.Node,
  corefOtherAstNode: CorefOtherAstNode,
) {
  const kind = node.kind;

  switch (kind) {
    case SyntaxKind.Decorator:
      corefOtherAstNode.decorators.push({
        id,
        expression_id: util.getCorefIdFromTsNodeInSameFile(
          (node as ts.Decorator).expression,
        ),
      });
      return;

    case SyntaxKind.VariableDeclarationList:
      corefOtherAstNode.variableDeclarationLists.push({ id });
      (node as ts.VariableDeclarationList).declarations.forEach(
        (declaration, index) => {
          corefOtherAstNode.variableDeclarationListDeclarations.push({
            declaration_id: util.getCorefIdFromTsNodeInSameFile(declaration),
            variable_declaration_list_id: id,
            index,
          });
        },
      );
      return;

    case SyntaxKind.NamedImports:
      corefOtherAstNode.namedImportsList.push({ id });
      return;

    case SyntaxKind.NamedExports:
      corefOtherAstNode.namedExportsList.push({ id });
      return;

    case SyntaxKind.ExternalModuleReference:
      corefOtherAstNode.externalModuleReferences.push({
        id,
        expression_id: util.getCorefIdFromTsNodeInSameFile(
          (node as ts.ExternalModuleReference).expression,
        ),
      });
      return;

    // AssertClause and AssertEntrys
    case SyntaxKind.AssertClause:
      corefOtherAstNode.assertClauses.push({ id });

      // AssertEntry
      (node as ts.AssertClause).elements.forEach((element, index) => {
        corefOtherAstNode.assertEntrys.push({
          id: util.getCorefIdFromTsNodeInSameFile(element),
          parent_id: id,
          index,
          name_node_id: util.getCorefIdFromTsNodeInSameFile(element.name),
          value_node_id: util.getCorefIdFromTsNodeInSameFile(element.value),
        });
      });

      return;

    case SyntaxKind.ImportTypeAssertionContainer:
      corefOtherAstNode.importTypeAssertionContainers.push({
        id,
        parent_id: util.getCorefIdFromTsNodeInSameFile(node.parent),
        assert_clause_id: util.getCorefIdFromTsNodeInSameFile(
          (node as ts.ImportTypeAssertionContainer).assertClause,
        ),
      });

      return;
  }
}
