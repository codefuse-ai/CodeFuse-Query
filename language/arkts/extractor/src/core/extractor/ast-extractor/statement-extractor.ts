/**
 * Copyright 2024 Ant Group CO., Ltd.
 */

import type * as ts from "ohos-typescript";
import { SyntaxKind } from "ohos-typescript";

import type { CorefStatement } from "../../../model/coref";
import * as util from "../../util";

export function isDeclarationStatementKind(kind: SyntaxKind): boolean {
  switch (kind) {
    case SyntaxKind.FunctionDeclaration:
    case SyntaxKind.MissingDeclaration:
    case SyntaxKind.ClassDeclaration:
    case SyntaxKind.StructDeclaration:
    case SyntaxKind.InterfaceDeclaration:
    case SyntaxKind.TypeAliasDeclaration:
    case SyntaxKind.EnumDeclaration:
    case SyntaxKind.ModuleDeclaration:
    case SyntaxKind.ImportDeclaration:
    case SyntaxKind.ImportEqualsDeclaration:
    case SyntaxKind.ExportDeclaration:
    case SyntaxKind.ExportAssignment:
    case SyntaxKind.NamespaceExportDeclaration:
      return true;
  }

  return false;
}

export function isStatementKind(kind: SyntaxKind): boolean {
  switch (kind) {
    case SyntaxKind.Block:
    case SyntaxKind.BreakStatement:
    case SyntaxKind.ContinueStatement:
    case SyntaxKind.DebuggerStatement:
    case SyntaxKind.DoStatement:
    case SyntaxKind.ExpressionStatement:
    case SyntaxKind.EmptyStatement:
    case SyntaxKind.ForInStatement:
    case SyntaxKind.ForOfStatement:
    case SyntaxKind.ForStatement:
    case SyntaxKind.IfStatement:
    case SyntaxKind.LabeledStatement:
    case SyntaxKind.ReturnStatement:
    case SyntaxKind.SwitchStatement:
    case SyntaxKind.ThrowStatement:
    case SyntaxKind.TryStatement:
    case SyntaxKind.VariableStatement:
    case SyntaxKind.WhileStatement:
    case SyntaxKind.WithStatement:
    case SyntaxKind.ModuleBlock:
    case SyntaxKind.CaseBlock:
      return true;
  }

  return isDeclarationStatementKind(kind);
}

export function isIterationStatementKind(kind: SyntaxKind): boolean {
  switch (kind) {
    case SyntaxKind.ForStatement:
    case SyntaxKind.ForInStatement:
    case SyntaxKind.ForOfStatement:
    case SyntaxKind.DoStatement:
    case SyntaxKind.WhileStatement:
      return true;
  }

  return false;
}

export function extractStatement(
  id: bigint,
  node: ts.Node,
  corefStatement: CorefStatement,
) {
  const kind = node.kind;

  if (!isStatementKind(kind)) {
    return;
  }

  const statement = { id, kind };
  corefStatement.statements.push(statement);

  // DeclarationStatement
  if (isDeclarationStatementKind(kind)) {
    corefStatement.declarationStatements.push(statement);

    const declarationStatement = node as ts.DeclarationStatement;
    if (declarationStatement.name) {
      corefStatement.declarationStatementNameNodes.push({
        declaration_statement_id: id,
        name_node_id: util.getCorefIdFromTsNodeInSameFile(
          declarationStatement.name,
        ),
      });
    }
  }

  if (isIterationStatementKind(kind)) {
    corefStatement.iterationStatements.push({
      id,
      kind,
      statement_id: util.getCorefIdFromTsNodeInSameFile(
        (node as ts.IterationStatement).statement,
      ),
    });
  }

  switch (kind) {
    case SyntaxKind.Block:
      corefStatement.blocks.push({ id });

      (node as ts.Block).statements.forEach((statement, index) => {
        corefStatement.blockStatements.push({
          statement_id: util.getCorefIdFromTsNodeInSameFile(statement),
          block_id: id,
          index,
        });
      });

      return;

    case SyntaxKind.EmptyStatement:
      corefStatement.emptyStatements.push({ id });
      return;

    case SyntaxKind.VariableStatement:
      corefStatement.variableStatements.push({
        id,
        declaration_list_id: util.getCorefIdFromTsNodeInSameFile(
          (node as ts.VariableStatement).declarationList,
        ),
      });
      return;

    case SyntaxKind.ExpressionStatement:
      corefStatement.expressionStatements.push({
        id,
        expression_id: util.getCorefIdFromTsNodeInSameFile(
          (node as ts.ExpressionStatement).expression,
        ),
      });
      return;

    case SyntaxKind.IfStatement: {
      const ifStatement = node as ts.IfStatement;
      corefStatement.ifStatements.push({
        id,
        condition_id: util.getCorefIdFromTsNodeInSameFile(
          ifStatement.expression,
        ),
        then_statement_id: util.getCorefIdFromTsNodeInSameFile(
          ifStatement.thenStatement,
        ),
      });

      if (ifStatement.elseStatement) {
        corefStatement.ifStatementElseStatements.push({
          if_statement_id: id,
          else_statement_id: util.getCorefIdFromTsNodeInSameFile(
            ifStatement.elseStatement,
          ),
        });
      }

      return;
    }

    case SyntaxKind.DoStatement:
      corefStatement.doStatements.push({
        id,
        expression_id: util.getCorefIdFromTsNodeInSameFile(
          (node as ts.DoStatement).expression,
        ),
      });
      return;

    case SyntaxKind.WhileStatement:
      corefStatement.whileStatements.push({
        id,
        expression_id: util.getCorefIdFromTsNodeInSameFile(
          (node as ts.WhileStatement).expression,
        ),
      });
      return;

    case SyntaxKind.ForStatement: {
      const forStatement = node as ts.ForStatement;
      corefStatement.forStatements.push({ id });

      if (forStatement.initializer) {
        corefStatement.forStatementInitializers.push({
          for_statement_id: id,
          initializer_id: util.getCorefIdFromTsNodeInSameFile(
            forStatement.initializer,
          ),
        });
      }

      if (forStatement.condition) {
        corefStatement.forStatementConditions.push({
          for_statement_id: id,
          condition_id: util.getCorefIdFromTsNodeInSameFile(
            forStatement.condition,
          ),
        });
      }

      if (forStatement.incrementor) {
        corefStatement.forStatementIncrementors.push({
          for_statement_id: id,
          incrementor_id: util.getCorefIdFromTsNodeInSameFile(
            forStatement.incrementor,
          ),
        });
      }

      return;
    }

    case SyntaxKind.ForInStatement:
      corefStatement.forInStatements.push({
        id,
        initializer_id: util.getCorefIdFromTsNodeInSameFile(
          (node as ts.ForInStatement).initializer,
        ),
        expression_id: util.getCorefIdFromTsNodeInSameFile(
          (node as ts.ForInStatement).expression,
        ),
      });
      return;

    case SyntaxKind.ForOfStatement: {
      const forOfStatement = node as ts.ForOfStatement;
      corefStatement.forOfStatements.push({
        id,
        initializer_id: util.getCorefIdFromTsNodeInSameFile(
          forOfStatement.initializer,
        ),
        expression_id: util.getCorefIdFromTsNodeInSameFile(
          forOfStatement.expression,
        ),
      });

      if (forOfStatement.awaitModifier) {
        corefStatement.forOfStatementAwaitModifiers.push({
          for_of_statement_id: id,
          await_modifier_id: util.getCorefIdFromTsNodeInSameFile(
            forOfStatement.awaitModifier,
          ),
        });
      }

      return;
    }

    case SyntaxKind.ContinueStatement: {
      const continueStatement = node as ts.ContinueStatement;
      corefStatement.continueStatements.push({ id });

      if (continueStatement.label) {
        corefStatement.continueStatementLabels.push({
          continue_statement_id: id,
          label_id: util.getCorefIdFromTsNodeInSameFile(
            continueStatement.label,
          ),
        });
      }

      return;
    }

    case SyntaxKind.BreakStatement: {
      const breakStatement = node as ts.BreakStatement;
      corefStatement.breakStatements.push({ id });

      if (breakStatement.label) {
        corefStatement.breakStatementLabels.push({
          break_statement_id: id,
          label_id: util.getCorefIdFromTsNodeInSameFile(breakStatement.label),
        });
      }

      return;
    }

    case SyntaxKind.ReturnStatement: {
      const returnStatement = node as ts.ReturnStatement;
      corefStatement.returnStatements.push({ id });

      if (returnStatement.expression) {
        corefStatement.returnStatementExpressions.push({
          return_statement_id: id,
          expression_id: util.getCorefIdFromTsNodeInSameFile(
            returnStatement.expression,
          ),
        });
      }

      return;
    }

    case SyntaxKind.WithStatement:
      corefStatement.withStatements.push({
        id,
        expression_id: util.getCorefIdFromTsNodeInSameFile(
          (node as ts.WithStatement).expression,
        ),
        statement_id: util.getCorefIdFromTsNodeInSameFile(
          (node as ts.WithStatement).statement,
        ),
      });
      return;

    case SyntaxKind.CaseBlock:
      corefStatement.caseBlocks.push({ id });
      (node as ts.CaseBlock).clauses.forEach((clause, index) => {
        corefStatement.caseBlockClauses.push({
          clause_id: util.getCorefIdFromTsNodeInSameFile(clause),
          case_block_id: id,
          index,
        });
      });
      return;

    case SyntaxKind.SwitchStatement:
      corefStatement.switchStatements.push({
        id,
        expression_id: util.getCorefIdFromTsNodeInSameFile(
          (node as ts.SwitchStatement).expression,
        ),
        case_block_id: util.getCorefIdFromTsNodeInSameFile(
          (node as ts.SwitchStatement).caseBlock,
        ),
      });
      return;

    case SyntaxKind.LabeledStatement:
      corefStatement.labeledStatements.push({
        id,
        label_id: util.getCorefIdFromTsNodeInSameFile(
          (node as ts.LabeledStatement).label,
        ),
        statement_id: util.getCorefIdFromTsNodeInSameFile(
          (node as ts.LabeledStatement).statement,
        ),
      });
      return;

    case SyntaxKind.ThrowStatement:
      corefStatement.throwStatements.push({
        id,
        expression_id: util.getCorefIdFromTsNodeInSameFile(
          (node as ts.ThrowStatement).expression,
        ),
      });
      return;

    case SyntaxKind.TryStatement: {
      const tryStatement = node as ts.TryStatement;
      corefStatement.tryStatements.push({
        id,
        try_block_id: util.getCorefIdFromTsNodeInSameFile(
          tryStatement.tryBlock,
        ),
      });

      if (tryStatement.finallyBlock) {
        corefStatement.tryStatementFinallyBlocks.push({
          try_statement_id: id,
          finally_block_id: util.getCorefIdFromTsNodeInSameFile(
            tryStatement.finallyBlock,
          ),
        });
      }

      return;
    }

    case SyntaxKind.DebuggerStatement:
      corefStatement.debuggerStatements.push({ id });
      return;

    case SyntaxKind.FunctionDeclaration: {
      const functionDeclaration = node as ts.FunctionDeclaration;
      corefStatement.functionDeclarations.push({ id });

      if (functionDeclaration.name) {
        corefStatement.functionDeclarationNameNodes.push({
          function_declaration_id: id,
          name_node_id: util.getCorefIdFromTsNodeInSameFile(
            functionDeclaration.name,
          ),
        });
      }

      if (functionDeclaration.body) {
        corefStatement.functionDeclarationBodies.push({
          function_declaration_id: id,
          body_id: util.getCorefIdFromTsNodeInSameFile(
            functionDeclaration.body,
          ),
        });
      }

      return;
    }

    case SyntaxKind.ClassDeclaration: {
      const classDeclaration = node as ts.ClassDeclaration;
      corefStatement.classDeclarations.push({ id });

      if (classDeclaration.name) {
        corefStatement.classDeclarationNameNodes.push({
          class_declaration_id: id,
          name_node_id: util.getCorefIdFromTsNodeInSameFile(
            classDeclaration.name,
          ),
        });
      }

      return;
    }

    case SyntaxKind.StructDeclaration: {
      const structDeclaration = node as ts.StructDeclaration;
      corefStatement.structDeclarations.push({ id });

      if (structDeclaration.name) {
        corefStatement.structDeclarationNameNodes.push({
          struct_declaration_id: id,
          name_node_id: util.getCorefIdFromTsNodeInSameFile(
            structDeclaration.name,
          ),
        });
      }

      return;
    }

    case SyntaxKind.InterfaceDeclaration:
      corefStatement.interfaceDeclarations.push({
        id,
        name_node_id: util.getCorefIdFromTsNodeInSameFile(
          (node as ts.InterfaceDeclaration).name,
        ),
      });

      (node as ts.InterfaceDeclaration).typeParameters?.forEach(
        (typeParameter, index) => {
          corefStatement.interfaceDeclarationTypeParameters.push({
            type_parameter_id:
              util.getCorefIdFromTsNodeInSameFile(typeParameter),
            interface_declaration_id: id,
            index,
          });
        },
      );

      (node as ts.InterfaceDeclaration).members?.forEach((member, index) => {
        corefStatement.interfaceDeclarationMembers.push({
          member_id: util.getCorefIdFromTsNodeInSameFile(member),
          interface_declaration_id: id,
          index,
        });
      });

      return;

    case SyntaxKind.TypeAliasDeclaration:
      corefStatement.typeAliasDeclarations.push({
        id,
        name_node_id: util.getCorefIdFromTsNodeInSameFile(
          (node as ts.TypeAliasDeclaration).name,
        ),
        type_node_id: util.getCorefIdFromTsNodeInSameFile(
          (node as ts.TypeAliasDeclaration).type,
        ),
      });

      (node as ts.TypeAliasDeclaration).typeParameters?.forEach(
        (typeParameter, index) => {
          corefStatement.typeAliasDeclarationTypeParameters.push({
            type_parameter_id:
              util.getCorefIdFromTsNodeInSameFile(typeParameter),
            type_alias_declaration_id: id,
            index,
          });
        },
      );

      return;

    case SyntaxKind.EnumDeclaration:
      corefStatement.enumDeclarations.push({
        id,
        name_node_id: util.getCorefIdFromTsNodeInSameFile(
          (node as ts.EnumDeclaration).name,
        ),
      });
      return;

    case SyntaxKind.ModuleDeclaration: {
      const moduleDeclaration = node as ts.ModuleDeclaration;
      corefStatement.moduleDeclarations.push({
        id,
        name_node_id: util.getCorefIdFromTsNodeInSameFile(
          moduleDeclaration.name,
        ),
      });

      if (moduleDeclaration.body) {
        corefStatement.moduleDeclarationBodies.push({
          module_declaration_id: id,
          body_id: util.getCorefIdFromTsNodeInSameFile(moduleDeclaration.body),
        });
      }

      return;
    }

    case SyntaxKind.ModuleBlock:
      corefStatement.moduleBlocks.push({ id });

      (node as ts.ModuleBlock).statements.forEach((statement, index) => {
        corefStatement.moduleBlockStatements.push({
          statement_id: util.getCorefIdFromTsNodeInSameFile(statement),
          module_block_id: id,
          index,
        });
      });

      return;

    case SyntaxKind.NamespaceExportDeclaration:
      corefStatement.namespaceExportDeclarations.push({
        id,
        name_node_id: util.getCorefIdFromTsNodeInSameFile(
          (node as ts.NamespaceExportDeclaration).name,
        ),
      });
      return;

    case SyntaxKind.ImportEqualsDeclaration:
      corefStatement.importEqualsDeclarations.push({
        id,
        name_node_id: util.getCorefIdFromTsNodeInSameFile(
          (node as ts.ImportEqualsDeclaration).name,
        ),
        is_type_only: (node as ts.ImportEqualsDeclaration).isTypeOnly,
        module_reference_id: util.getCorefIdFromTsNodeInSameFile(
          (node as ts.ImportEqualsDeclaration).moduleReference,
        ),
      });
      return;

    case SyntaxKind.ImportDeclaration: {
      const importDeclaration = node as ts.ImportDeclaration;
      corefStatement.importDeclarations.push({
        id,
        module_specifier_id: util.getCorefIdFromTsNodeInSameFile(
          importDeclaration.moduleSpecifier,
        ),
      });

      if (importDeclaration.assertClause) {
        corefStatement.importDeclarationAssertClauses.push({
          import_declaration_id: id,
          assert_clause_id: util.getCorefIdFromTsNodeInSameFile(
            importDeclaration.assertClause,
          ),
        });
      }

      return;
    }

    case SyntaxKind.ExportAssignment:
      corefStatement.exportAssignments.push({
        id,
        is_export_equals: (node as ts.ExportAssignment).isExportEquals ?? false,
        expression_id: util.getCorefIdFromTsNodeInSameFile(
          (node as ts.ExportAssignment).expression,
        ),
      });
      return;

    case SyntaxKind.ExportDeclaration: {
      const exportDeclaration = node as ts.ExportDeclaration;
      corefStatement.exportDeclarations.push({
        id,
        is_type_only: exportDeclaration.isTypeOnly,
      });

      if (exportDeclaration.exportClause) {
        corefStatement.exportDeclarationExportClauses.push({
          export_declaration_id: id,
          export_clause_id: util.getCorefIdFromTsNodeInSameFile(
            exportDeclaration.exportClause,
          ),
        });
      }

      if (exportDeclaration.moduleSpecifier) {
        corefStatement.exportDeclarationModuleSpecifiers.push({
          export_declaration_id: id,
          module_specifier_id: util.getCorefIdFromTsNodeInSameFile(
            exportDeclaration.moduleSpecifier,
          ),
        });
      }

      if (exportDeclaration.assertClause) {
        corefStatement.exportDeclarationAssertClauses.push({
          export_declaration_id: id,
          assert_clause_id: util.getCorefIdFromTsNodeInSameFile(
            exportDeclaration.assertClause,
          ),
        });
      }

      return;
    }
  }
}
