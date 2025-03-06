/**
 * Copyright 2024 Ant Group CO., Ltd.
 */
/* eslint-disable @typescript-eslint/ban-types */
/* eslint-disable @typescript-eslint/no-explicit-any */

import type * as prisma from "@prisma/client";

export interface Coref {
  files?: prisma.file[];
  locations?: prisma.location[];
  numberOfLinesList?: prisma.number_of_lines[];
  texts?: prisma.text[];

  astNodes?: prisma.ast_node[];
  comments?: prisma.comment[];
  astNodeComments?: prisma.ast_node_comment[];

  // Literals
  nullLiterals?: prisma.null_literal[];
  trueLiterals?: prisma.true_literal[];
  falseLiterals?: prisma.false_literal[];
  literalLikeNodes?: prisma.literal_like_node[];
  literalExpressions?: prisma.literal_expression[];
  numericLiterals?: prisma.numeric_literal[];
  bigIntLiterals?: prisma.big_int_literal[];
  stringLiterals?: prisma.string_literal[];
  regularExpressionLiterals?: prisma.regular_expression_literal[];
  templateLiteralLikeNodes?: prisma.template_literal_like_node[];
  noSubstitutionTemplateLiterals?: prisma.no_substitution_template_literal[];
  templateHeads?: prisma.template_head[];
  templateMiddles?: prisma.template_middle[];
  templateTails?: prisma.template_tail[];
  templateSpans?: prisma.template_span[];

  // Tokens
  modifiers?: prisma.modifier[];

  dotTokens?: prisma.dot_token[];
  dotDotDotTokens?: prisma.dot_dot_dot_token[];
  commaTokens?: prisma.comma_token[];
  questionDotTokens?: prisma.question_dot_token[];
  lessThanTokens?: prisma.less_than_token[];
  greaterThanTokens?: prisma.greater_than_token[];
  lessThanEqualsTokens?: prisma.less_than_equals_token[];
  greaterThanEqualsTokens?: prisma.greater_than_equals_token[];
  equalsEqualsTokens?: prisma.equals_equals_token[];
  exclamationEqualsTokens?: prisma.exclamation_equals_token[];
  equalsEqualsEqualsTokens?: prisma.equals_equals_equals_token[];
  exclamationEqualsEqualsTokens?: prisma.exclamation_equals_equals_token[];
  equalsGreaterThanTokens?: prisma.equals_greater_than_token[];
  plusTokens?: prisma.plus_token[];
  minusTokens?: prisma.minus_token[];
  asteriskTokens?: prisma.asterisk_token[];
  asteriskAsteriskTokens?: prisma.asterisk_asterisk_token[];
  slashTokens?: prisma.slash_token[];
  percentTokens?: prisma.percent_token[];
  plusPlusTokens?: prisma.plus_plus_token[];
  minusMinusTokens?: prisma.minus_minus_token[];
  lessThanLessThanTokens?: prisma.less_than_less_than_token[];
  greaterThanGreaterThanTokens?: prisma.greater_than_greater_than_token[];
  greaterThanGreaterThanGreaterThanTokens?: prisma.greater_than_greater_than_greater_than_token[];
  ampersandTokens?: prisma.ampersand_token[];
  barTokens?: prisma.bar_token[];
  caretTokens?: prisma.caret_token[];
  exclamationTokens?: prisma.exclamation_token[];
  tildeTokens?: prisma.tilde_token[];
  ampersandAmpersandTokens?: prisma.ampersand_ampersand_token[];
  barBarTokens?: prisma.bar_bar_token[];
  questionTokens?: prisma.question_token[];
  colonTokens?: prisma.colon_token[];
  questionQuestionTokens?: prisma.question_question_token[];
  equalsTokens?: prisma.equals_token[];
  plusEqualsTokens?: prisma.plus_equals_token[];
  minusEqualsTokens?: prisma.minus_equals_token[];
  asteriskEqualsTokens?: prisma.asterisk_equals_token[];
  asteriskAsteriskEqualsTokens?: prisma.asterisk_asterisk_equals_token[];
  slashEqualsTokens?: prisma.slash_equals_token[];
  percentEqualsTokens?: prisma.percent_equals_token[];
  lessThanLessThanEqualsTokens?: prisma.less_than_less_than_equals_token[];
  greaterThanGreaterThanEqualsTokens?: prisma.greater_than_greater_than_equals_token[];
  greaterThanGreaterThanGreaterThanEqualsTokens?: prisma.greater_than_greater_than_greater_than_equals_token[];
  ampersandEqualsTokens?: prisma.ampersand_equals_token[];
  barEqualsTokens?: prisma.bar_equals_token[];
  barBarEqualsTokens?: prisma.bar_bar_equals_token[];
  ampersandAmpersandEqualsTokens?: prisma.ampersand_ampersand_equals_token[];
  questionQuestionEqualsTokens?: prisma.question_question_equals_token[];
  caretEqualsTokens?: prisma.caret_equals_token[];
  constKeywords?: prisma.const_keyword[];
  defaultKeywords?: prisma.default_keyword[];
  exportKeywords?: prisma.export_keyword[];
  extendsKeywords?: prisma.extends_keyword[];
  importKeywords?: prisma.import_keyword[];
  inKeywords?: prisma.in_keyword[];
  instanceOfKeywords?: prisma.instance_of_keyword[];
  newKeywords?: prisma.new_keyword[];
  implementsKeywords?: prisma.implements_keyword[];
  privateKeywords?: prisma.private_keyword[];
  protectedKeywords?: prisma.protected_keyword[];
  publicKeywords?: prisma.public_keyword[];
  staticKeywords?: prisma.static_keyword[];
  abstractKeywords?: prisma.abstract_keyword[];
  accessorKeywords?: prisma.accessor_keyword[];
  assertsKeywords?: prisma.asserts_keyword[];
  assertKeywords?: prisma.assert_keyword[];
  asyncKeywords?: prisma.async_keyword[];
  awaitKeywords?: prisma.await_keyword[];
  declareKeywords?: prisma.declare_keyword[];
  keyOfKeywords?: prisma.key_of_keyword[];
  outKeywords?: prisma.out_keyword[];
  readonlyKeywords?: prisma.readonly_keyword[];
  uniqueKeywords?: prisma.unique_keyword[];
  overrideKeywords?: prisma.override_keyword[];

  // Names
  identifiers?: prisma.identifier[];
  privateIdentifiers?: prisma.private_identifier[];
  qualifiedNames?: prisma.qualified_name[];
  computedPropertyNames?: prisma.computed_property_name[];

  // Type Nodes
  typeNodes?: prisma.type_node[];
  nodeWithTypeArgumentsList?: prisma.node_with_type_arguments[];
  nodeWithTypeArgumentsTypeArguments?: prisma.node_with_type_arguments_type_argument[];
  functionOrConstructorTypes?: prisma.function_or_constructor_type[];

  anyTypes?: prisma.any_type[];
  bigIntTypes?: prisma.big_int_type[];
  booleanTypes?: prisma.boolean_type[];
  intrinsicTypes?: prisma.intrinsic_type[];
  neverTypes?: prisma.never_type[];
  numberTypes?: prisma.number_type[];
  objectTypes?: prisma.object_type[];
  stringTypes?: prisma.string_type[];
  symbolTypes?: prisma.symbol_type[];
  undefinedTypes?: prisma.undefined_type[];
  unknownTypes?: prisma.unknown_type[];
  voidTypes?: prisma.void_type[];
  thisTypes?: prisma.this_type[];
  typePredicates?: prisma.type_predicate[];
  typePredicateAssertsModifiers?: prisma.type_predicate_asserts_modifier[];
  typePredicateTypeNodes?: prisma.type_predicate_type_node[];
  typeReferences?: prisma.type_reference[];
  functionTypes?: prisma.function_type[];
  constructorTypes?: prisma.constructor_type[];
  typeQueries?: prisma.type_query[];
  typeLiterals?: prisma.type_literal[];
  typeLiteralMembers?: prisma.type_literal_member[];
  arrayTypes?: prisma.array_type[];
  tupleTypes?: prisma.tuple_type[];
  tupleTypeElements?: prisma.tuple_type_element[];
  optionalTypes?: prisma.optional_type[];
  restTypes?: prisma.rest_type[];
  unionTypes?: prisma.union_type[];
  unionTypeTypeNodes?: prisma.union_type_type_node[];
  intersectionTypes?: prisma.intersection_type[];
  intersectionTypeTypeNodes?: prisma.intersection_type_type_node[];
  conditionalTypes?: prisma.conditional_type[];
  inferTypes?: prisma.infer_type[];
  parenthesizedTypes?: prisma.parenthesized_type[];
  typeOperators?: prisma.type_operator[];
  indexedAccessTypes?: prisma.indexed_access_type[];
  mappedTypes?: prisma.mapped_type[];
  mappedTypeReadonlyTokens?: prisma.mapped_type_readonly_token[];
  mappedTypeNameTypeNodes?: prisma.mapped_type_name_type_node[];
  mappedTypeQuestionTokens?: prisma.mapped_type_question_token[];
  mappedTypeTypeNodes?: prisma.mapped_type_type_node[];
  literalTypes?: prisma.literal_type[];
  namedTupleMembers?: prisma.named_tuple_member[];
  namedTupleMemberDotDotDotTokens?: prisma.named_tuple_member_dot_dot_dot_token[];
  namedTupleMemberQuestionTokens?: prisma.named_tuple_member_question_token[];
  templateLiteralTypeSpans?: prisma.template_literal_type_span[];
  templateLiteralTypes?: prisma.template_literal_type[];
  importTypes?: prisma.import_type[];
  importTypeQualifiers?: prisma.import_type_qualifier[];

  // Members
  objectLiteralElements?: prisma.object_literal_element[];
  objectLiteralElementNameNodes?: prisma.object_literal_element_name_node[];
  classElements?: prisma.class_element[];
  classElementNameNodes?: prisma.class_element_name_node[];
  typeElements?: prisma.type_element[];
  typeElementNameNodes?: prisma.type_element_name_node[];
  typeElementQuestionTokens?: prisma.type_element_question_token[];

  propertySignatures?: prisma.property_signature[];
  propertySignatureQuestionTokens?: prisma.property_signature_question_token[];
  propertySignatureTypeNodes?: prisma.property_signature_type_node[];
  propertyDeclarations?: prisma.property_declaration[];
  propertyDeclarationQuestionTokens?: prisma.property_declaration_question_token[];
  propertyDeclarationExclamationTokens?: prisma.property_declaration_exclamation_token[];
  propertyDeclarationTypeNodes?: prisma.property_declaration_type_node[];
  propertyDeclarationInitializers?: prisma.property_declaration_initializer[];
  methodSignatures?: prisma.method_signature[];
  methodDeclarations?: prisma.method_declaration[];
  methodDeclarationBodies?: prisma.method_declaration_body[];
  classStaticBlockDeclarations?: prisma.class_static_block_declaration[];
  constructors?: { id: bigint }[];
  constructorBodies?: prisma.constructor_body[];
  getAccessors?: prisma.get_accessor[];
  getAccessorBodies?: prisma.get_accessor_body[];
  setAccessors?: prisma.set_accessor[];
  setAccessorBodies?: prisma.set_accessor_body[];
  callSignatures?: prisma.call_signature[];
  constructSignatures?: prisma.construct_signature[];
  indexSignatures?: prisma.index_signature[];
  semicolonClassElements?: prisma.semicolon_class_element[];
  propertyAssignments?: prisma.property_assignment[];
  shorthandPropertyAssignments?: prisma.shorthand_property_assignment[];
  spreadAssignments?: prisma.spread_assignment[];
  enumMembers?: prisma.enum_member[];
  enumMemberInitializers?: prisma.enum_member_initializer[];

  // Binding Patterns
  bindingElements?: prisma.binding_element[];
  bindingElementPropertyNameNodes?: prisma.binding_element_property_name_node[];
  bindingElementDotDotDotTokens?: prisma.binding_element_dot_dot_dot_token[];
  bindingElementInitializers?: prisma.binding_element_initializer[];
  objectBindingPatterns?: prisma.object_binding_pattern[];
  objectBindingPatternElements?: prisma.object_binding_pattern_element[];
  arrayBindingPatterns?: prisma.array_binding_pattern[];
  arrayBindingPatternElements?: prisma.array_binding_pattern_element[];

  // Declarations
  declarations?: prisma.declaration[];
  declarationNameNodes?: prisma.declaration_name_node[];
  signatureDeclarations?: prisma.signature_declaration[];
  signatureDeclarationNameNodes?: prisma.signature_declaration_name_node[];
  signatureDeclarationTypeParameters?: prisma.signature_declaration_type_parameter[];
  signatureDeclarationParameters?: prisma.signature_declaration_parameter[];
  signatureDeclarationTypeNodes?: prisma.signature_declaration_type_node[];
  functionLikeDeclarations?: prisma.function_like_declaration[];
  functionLikeDeclarationAsteriskTokens?: prisma.function_like_declaration_asterisk_token[];
  functionLikeDeclarationQuestionTokens?: prisma.function_like_declaration_question_token[];
  functionLikeDeclarationExclamationTokens?: prisma.function_like_declaration_exclamation_token[];
  functionLikeDeclarationBodies?: prisma.function_like_declaration_body[];
  classLikeDeclarations?: prisma.class_like_declaration[];
  classLikeDeclarationNameNodes?: prisma.class_like_declaration_name_node[];
  classLikeDeclarationTypeParameters?: prisma.class_like_declaration_type_parameter[];
  classLikeDeclarationMembers?: prisma.class_like_declaration_member[];

  typeParameters?: prisma.type_parameter[];
  typeParameterConstraints?: prisma.type_parameter_constraint[];
  typeParameterDefaults?: prisma.type_parameter_default[];
  parameters?: prisma.parameter[];
  parameterDotDotDotTokens?: prisma.parameter_dot_dot_dot_token[];
  parameterQuestionTokens?: prisma.parameter_question_token[];
  parameterTypeNodes?: prisma.parameter_type_node[];
  parameterInitializers?: prisma.parameter_initializer[];
  variableDeclarations?: prisma.variable_declaration[];
  variableDeclarationExclamationTokens?: prisma.variable_declaration_exclamation_token[];
  variableDeclarationTypeNodes?: prisma.variable_declaration_type_node[];
  variableDeclarationInitializers?: prisma.variable_declaration_initializer[];
  importClauses?: prisma.import_clause[];
  importClauseNameNodes?: prisma.import_clause_name_node[];
  importClauseNamedBindingsList?: prisma.import_clause_named_bindings[];
  namespaceImports?: prisma.namespace_import[];
  importSpecifiers?: prisma.import_specifier[];
  importSpecifierPropertyNameNodes?: prisma.import_specifier_property_name_node[];
  namespaceExports?: prisma.namespace_export[];
  exportSpecifiers?: prisma.export_specifier[];
  exportSpecifierPropertyNameNodes?: prisma.export_specifier_property_name_node[];

  // Expressions
  expressions?: prisma.expression[];
  unaryExpressions?: prisma.unary_expression[];
  updateExpressions?: prisma.update_expression[];
  leftHandSideExpression?: prisma.left_hand_side_expression[];
  memberExpressions?: prisma.member_expression[];
  primaryExpressions?: prisma.primary_expression[];

  thisExpressions?: prisma.this_expression[];
  superExpressions?: prisma.super_expression[];
  importExpressions?: prisma.import_expression[];
  arrayLiteralExpressions?: prisma.array_literal_expression[];
  arrayLiteralExpressionElements?: prisma.array_literal_expression_element[];
  objectLiteralExpressions?: prisma.object_literal_expression[];
  objectLiteralExpressionProperties?: prisma.object_literal_expression_property[];
  propertyAccessExpressions?: prisma.property_access_expression[];
  propertyAccessExpressionQuestionDotTokens?: prisma.property_access_expression_question_dot_token[];
  elementAccessExpressions?: prisma.element_access_expression[];
  elementAccessExpressionQuestionDotTokens?: prisma.element_access_expression_question_dot_token[];
  callExpressions?: prisma.call_expression[];
  callExpressionQuestionDotTokens?: prisma.call_expression_question_dot_token[];
  callExpressionTypeArguments?: prisma.call_expression_type_argument[];
  callExpressionArguments?: prisma.call_expression_argument[];
  newExpressions?: prisma.new_expression[];
  newExpressionTypeArguments?: prisma.new_expression_type_argument[];
  newExpressionArguments?: prisma.new_expression_argument[];
  templateExpressions?: prisma.template_expression[];
  taggedTemplateExpressions?: prisma.tagged_template_expression[];
  taggedTemplateExpressionTypeArguments?: prisma.tagged_template_expression_type_argument[];
  typeAssertionExpressions?: prisma.type_assertion_expression[];
  parenthesizedExpressions?: prisma.parenthesized_expression[];
  functionExpressions?: prisma.function_expression[];
  functionExpressionNameNodes?: prisma.function_expression_name_node[];
  arrowFunctions?: prisma.arrow_function[];
  etsComponentExpressions?: prisma.ets_component_expression[];
  etsComponentExpressionTypeArguments?: prisma.ets_component_expression_type_argument[];
  etsComponentExpressionArguments?: prisma.ets_component_expression_argument[];
  etsComponentExpressionBodies?: prisma.ets_component_expression_body[];
  deleteExpressions?: prisma.delete_expression[];
  typeOfExpressions?: prisma.type_of_expression[];
  voidExpressions?: prisma.void_expression[];
  awaitExpressions?: prisma.await_expression[];
  prefixUnaryExpressions?: prisma.prefix_unary_expression[];
  postfixUnaryExpressions?: prisma.postfix_unary_expression[];
  binaryExpressions?: prisma.binary_expression[];
  conditionalExpressions?: prisma.conditional_expression[];
  yieldExpressions?: prisma.yield_expression[];
  yieldExpressionAsteriskTokens?: prisma.yield_expression_asterisk_token[];
  yieldExpressionExpressions?: prisma.yield_expression_expression[];
  spreadElements?: prisma.spread_element[];
  classExpressions?: prisma.class_expression[];
  omittedExpressions?: prisma.omitted_expression[];
  expressionWithTypeArgumentsList?: prisma.expression_with_type_arguments[];
  asExpressions?: prisma.as_expression[];
  nonNullExpressions?: prisma.non_null_expression[];
  metaProperties?: prisma.meta_property[];
  satisfiesExpressions?: prisma.satisfies_expression[];

  // Statements
  statements?: prisma.statement[];
  declarationStatements?: prisma.declaration_statement[];
  declarationStatementNameNodes?: prisma.declaration_statement_name_node[];
  iterationStatements?: prisma.iteration_statement[];

  blocks?: prisma.block[];
  blockStatements?: prisma.block_statement[];
  emptyStatements?: prisma.empty_statement[];
  variableStatements?: prisma.variable_statement[];
  expressionStatements?: prisma.expression_statement[];
  ifStatements?: prisma.if_statement[];
  ifStatementElseStatements?: prisma.if_statement_else_statement[];
  doStatements?: prisma.do_statement[];
  whileStatements?: prisma.while_statement[];
  forStatements?: prisma.for_statement[];
  forStatementInitializers?: prisma.for_statement_initializer[];
  forStatementConditions?: prisma.for_statement_condition[];
  forStatementIncrementors?: prisma.for_statement_incrementor[];
  forInStatements?: prisma.for_in_statement[];
  forOfStatements?: prisma.for_of_statement[];
  forOfStatementAwaitModifiers?: prisma.for_of_statement_await_modifier[];
  continueStatements?: prisma.continue_statement[];
  continueStatementLabels?: prisma.continue_statement_label[];
  breakStatements?: prisma.break_statement[];
  breakStatementLabels?: prisma.break_statement_label[];
  returnStatements?: prisma.return_statement[];
  returnStatementExpressions?: prisma.return_statement_expression[];
  withStatements?: prisma.with_statement[];
  caseBlocks?: prisma.case_block[];
  caseBlockClauses?: prisma.case_block_clause[];
  switchStatements?: prisma.switch_statement[];
  labeledStatements?: prisma.labeled_statement[];
  throwStatements?: prisma.throw_statement[];
  tryStatements?: prisma.try_statement[];
  tryStatementFinallyBlocks?: prisma.try_statement_finally_block[];
  debuggerStatements?: prisma.debugger_statement[];
  functionDeclarations?: prisma.function_declaration[];
  functionDeclarationNameNodes?: prisma.function_declaration_name_node[];
  functionDeclarationBodies?: prisma.function_declaration_body[];
  classDeclarations?: prisma.class_declaration[];
  classDeclarationNameNodes?: prisma.class_declaration_name_node[];
  structDeclarations?: prisma.struct_declaration[];
  structDeclarationNameNodes?: prisma.struct_declaration_name_node[];
  interfaceDeclarations?: prisma.interface_declaration[];
  interfaceDeclarationTypeParameters?: prisma.interface_declaration_type_parameter[];
  interfaceDeclarationMembers?: prisma.interface_declaration_member[];
  typeAliasDeclarations?: prisma.type_alias_declaration[];
  typeAliasDeclarationTypeParameters?: prisma.type_alias_declaration_type_parameter[];
  enumDeclarations?: prisma.enum_declaration[];
  moduleDeclarations?: prisma.module_declaration[];
  moduleDeclarationBodies?: prisma.module_declaration_body[];
  moduleBlocks?: prisma.module_block[];
  moduleBlockStatements?: prisma.module_block_statement[];
  namespaceExportDeclarations?: prisma.namespace_export_declaration[];
  importEqualsDeclarations?: prisma.import_equals_declaration[];
  importDeclarations?: prisma.import_declaration[];
  importDeclarationAssertClauses?: prisma.import_declaration_assert_clause[];
  exportAssignments?: prisma.export_assignment[];
  exportDeclarations?: prisma.export_declaration[];
  exportDeclarationExportClauses?: prisma.export_declaration_export_clause[];
  exportDeclarationModuleSpecifiers?: prisma.export_declaration_module_specifier[];
  exportDeclarationAssertClauses?: prisma.export_declaration_assert_clause[];

  // Clauses
  caseClauses?: prisma.case_clause[];
  caseClauseStatements?: prisma.case_clause_statement[];
  defaultClauses?: prisma.default_clause[];
  defaultClauseStatements?: prisma.default_clause_statement[];
  heritageClauses?: prisma.heritage_clause[];
  heritageClauseTypeNodes?: prisma.heritage_clause_type_node[];
  catchClauses?: prisma.catch_clause[];
  catchClauseVariableDeclarations?: prisma.catch_clause_variable_declaration[];

  // Other AST Nodes
  decorators?: prisma.decorator[];
  variableDeclarationLists?: prisma.variable_declaration_list[];
  variableDeclarationListDeclarations?: prisma.variable_declaration_list_declaration[];
  namedImportsList?: prisma.named_imports[];
  namedExportsList?: prisma.named_exports[];
  externalModuleReferences?: prisma.external_module_reference[];
  assertClauses?: prisma.assert_clause[];
  assertEntries?: prisma.assert_entry[];
  importTypeAssertionContainers?: prisma.import_type_assertion_container[];

  // Top-Levels
  topLevels?: prisma.top_level[];
  topLevelStatements?: prisma.top_level_statement[];

  // AST Node and Container Relations
  astNodeContainerRelations?: prisma.ast_node_container_relation[];

  // Synthetic CFG Nodes
  cfgEntryNodes?: prisma.cfg_entry_node[];
  cfgExitNodes?: prisma.cfg_exit_node[];

  symbols?: prisma.symbol_[];
  astNodeSymbols?: prisma.ast_node_symbol[];
  shorthandPropertyAssignmentValueSymbols?: prisma.shorthand_property_assignment_value_symbol[];

  callSiteDeclarations?: prisma.call_site_declaration[];
  callSiteImplementations?: prisma.call_site_implementation[];

  types?: prisma.type_[];
  astNodeTypes?: prisma.ast_node_type[];
}

type CorefProperty = keyof Coref;

const CHUNK_SIZE = 10000;

/**
 * Split one big COREF to multiple small COREFs
 *
 * @param coref the big COREF
 * @returns the split COREFs
 */
export function splitCoref(coref: Coref): Coref[] {
  const splitCorefs: Coref[] = [];
  let currentCoref: Coref = {};
  let currentLength = 0;

  for (const property of Object.keys(coref) as CorefProperty[]) {
    let corefObjects = coref[property];
    if (!(corefObjects && corefObjects.length > 0)) {
      continue;
    }

    let totalLength = currentLength + corefObjects.length;

    while (totalLength > CHUNK_SIZE) {
      let splitCoref: Coref;
      let chunkSize: number;
      if (currentLength === 0) {
        chunkSize = CHUNK_SIZE;
        splitCoref = {
          [property]: corefObjects.slice(0, chunkSize),
        };
      } else {
        splitCoref = currentCoref;
        currentCoref = {};
        currentLength = 0;

        chunkSize = CHUNK_SIZE - currentLength;
        (splitCoref[property] as any) = corefObjects.slice(0, chunkSize);
      }

      corefObjects = corefObjects.slice(chunkSize);
      splitCorefs.push(splitCoref);

      totalLength = corefObjects.length;
    }

    if (corefObjects.length > 0) {
      (currentCoref[property] as any) = corefObjects;
      currentLength = currentLength + corefObjects.length;
    }
  }

  if (currentLength > 0) {
    splitCorefs.push(currentCoref);
  }

  return splitCorefs;
}
