/**
 * Copyright 2024 Ant Group CO., Ltd.
 */

import type * as ts from "ohos-typescript";
import { SyntaxKind } from "ohos-typescript";

import type { CorefClause } from "../../../model/coref";
import * as util from "../../util";

export function extractClause(
  id: bigint,
  node: ts.Node,
  corefClause: CorefClause,
) {
  const kind = node.kind;

  // HeritageClauses
  if (
    util.isClassLikeDeclarationKind(kind) ||
    kind === SyntaxKind.InterfaceDeclaration
  ) {
    (
      node as ts.ClassLikeDeclaration | ts.InterfaceDeclaration
    ).heritageClauses?.forEach((heritageClause, index) => {
      const heritageClauseId =
        util.getCorefIdFromTsNodeInSameFile(heritageClause);
      corefClause.heritageClauses.push({
        id: heritageClauseId,
        parent_id: id,
        index,
        token_id: util.getCorefIdFromTsNodeInSameFile(
          heritageClause.getChildAt(0),
        ),
      });

      heritageClause.types.forEach((typeNode, index) => {
        corefClause.heritageClauseTypeNodes.push({
          type_node_id: util.getCorefIdFromTsNodeInSameFile(typeNode),
          heritage_clause_id: heritageClauseId,
          index,
        });
      });
    });

    return;
  }

  switch (kind) {
    case SyntaxKind.CaseClause:
      corefClause.caseClauses.push({
        id,
        expression_id: util.getCorefIdFromTsNodeInSameFile(
          (node as ts.CaseClause).expression,
        ),
      });
      (node as ts.CaseClause).statements.forEach((statement, index) => {
        corefClause.caseClauseStatements.push({
          statement_id: util.getCorefIdFromTsNodeInSameFile(statement),
          case_clause_id: id,
          index,
        });
      });
      return;

    case SyntaxKind.DefaultClause:
      corefClause.defaultClauses.push({ id });
      (node as ts.DefaultClause).statements.forEach((statement, index) => {
        corefClause.defaultClauseStatements.push({
          statement_id: util.getCorefIdFromTsNodeInSameFile(statement),
          default_clause_id: id,
          index,
        });
      });
      return;

    case SyntaxKind.CatchClause: {
      const catchClause = node as ts.CatchClause;
      corefClause.catchClauses.push({
        id,
        parent_id: util.getCorefIdFromTsNodeInSameFile(catchClause.parent),
        block_id: util.getCorefIdFromTsNodeInSameFile(catchClause.block),
      });

      if (catchClause.variableDeclaration) {
        corefClause.catchClauseVariableDeclarations.push({
          catch_clause_id: id,
          variable_declaration_id: util.getCorefIdFromTsNodeInSameFile(
            catchClause.variableDeclaration,
          ),
        });
      }

      return;
    }
  }
}
