/**
 * Copyright 2024 Ant Group CO., Ltd.
 */

import type * as ts from "ohos-typescript";

import { coref, extendedTs } from "../../../model";
import { extendArray } from "../../../util";
import * as util from "../../util";
import { extractNodeComments } from "../node-comment-extractor";
import { extractAstNodeContainerRelation } from "./ast-node-container-extractor";
import { extractBindingPattern } from "./binding-pattern-extractor";
import { extractChildNodes } from "./child-node-extractor";
import { extractClause } from "./clause-extractor";
import { extractDeclaration } from "./declaration-extractor";
import { extractExpression } from "./expression-extractor";
import { extractLiteral } from "./literal-extractor";
import { extractMember } from "./member-extractor";
import { extractName } from "./name-extractor";
import { extractOtherAstNode } from "./other-ast-node-extractor";
import { extractStatement } from "./statement-extractor";
import { extractToken } from "./token-extractor";
import { extractTopLevel } from "./top-level-extractor";
import { extractTypeNode } from "./type-node-extractor";

/**
 * 抽取 AST 节点数据
 *
 * @param tsSourceFile
 * @returns 一个 SourceFile 中 AST 相关的数据
 */
export function extractAstNodes(tsSourceFile: extendedTs.SourceFile) {
  const corefLiteral: coref.CorefLiteral = {
    nullLiterals: [],
    trueLiterals: [],
    falseLiterals: [],
    literalLikeNodes: [],
    literalExpressions: [],
    numericLiterals: [],
    bigIntLiterals: [],
    stringLiterals: [],
    regularExpressionLiterals: [],
    templateLiteralLikeNodes: [],
    noSubstitutionTemplateLiterals: [],
    templateHeads: [],
    templateMiddles: [],
    templateTails: [],
    templateSpans: [],
  };

  const corefToken: coref.CorefToken = {
    modifiers: [],
    dotTokens: [],
    dotDotDotTokens: [],
    commaTokens: [],
    questionDotTokens: [],
    lessThanTokens: [],
    greaterThanTokens: [],
    lessThanEqualsTokens: [],
    greaterThanEqualsTokens: [],
    equalsEqualsTokens: [],
    exclamationEqualsTokens: [],
    equalsEqualsEqualsTokens: [],
    exclamationEqualsEqualsTokens: [],
    equalsGreaterThanTokens: [],
    plusTokens: [],
    minusTokens: [],
    asteriskTokens: [],
    asteriskAsteriskTokens: [],
    slashTokens: [],
    percentTokens: [],
    plusPlusTokens: [],
    minusMinusTokens: [],
    lessThanLessThanTokens: [],
    greaterThanGreaterThanTokens: [],
    greaterThanGreaterThanGreaterThanTokens: [],
    ampersandTokens: [],
    barTokens: [],
    caretTokens: [],
    exclamationTokens: [],
    tildeTokens: [],
    ampersandAmpersandTokens: [],
    barBarTokens: [],
    questionTokens: [],
    colonTokens: [],
    questionQuestionTokens: [],
    equalsTokens: [],
    plusEqualsTokens: [],
    minusEqualsTokens: [],
    asteriskEqualsTokens: [],
    asteriskAsteriskEqualsTokens: [],
    slashEqualsTokens: [],
    percentEqualsTokens: [],
    lessThanLessThanEqualsTokens: [],
    greaterThanGreaterThanEqualsTokens: [],
    greaterThanGreaterThanGreaterThanEqualsTokens: [],
    ampersandEqualsTokens: [],
    barEqualsTokens: [],
    barBarEqualsTokens: [],
    ampersandAmpersandEqualsTokens: [],
    questionQuestionEqualsTokens: [],
    caretEqualsTokens: [],
    constKeywords: [],
    defaultKeywords: [],
    exportKeywords: [],
    extendsKeywords: [],
    importKeywords: [],
    inKeywords: [],
    instanceOfKeywords: [],
    newKeywords: [],
    implementsKeywords: [],
    privateKeywords: [],
    protectedKeywords: [],
    publicKeywords: [],
    staticKeywords: [],
    abstractKeywords: [],
    accessorKeywords: [],
    assertsKeywords: [],
    assertKeywords: [],
    asyncKeywords: [],
    awaitKeywords: [],
    declareKeywords: [],
    keyOfKeywords: [],
    outKeywords: [],
    readonlyKeywords: [],
    uniqueKeywords: [],
    overrideKeywords: [],
  };

  const corefName: coref.CorefName = {
    identifiers: [],
    privateIdentifiers: [],
    qualifiedNames: [],
    computedPropertyNames: [],
  };

  const corefTypeNode: coref.CorefTypeNode = {
    typeNodes: [],
    nodeWithTypeArgumentsList: [],
    nodeWithTypeArgumentsTypeArguments: [],
    functionOrConstructorTypes: [],
    anyTypes: [],
    bigIntTypes: [],
    booleanTypes: [],
    intrinsicTypes: [],
    neverTypes: [],
    numberTypes: [],
    objectTypes: [],
    stringTypes: [],
    symbolTypes: [],
    undefinedTypes: [],
    unknownTypes: [],
    voidTypes: [],
    thisTypes: [],
    typePredicates: [],
    typePredicateAssertsModifiers: [],
    typePredicateTypeNodes: [],
    typeReferences: [],
    functionTypes: [],
    constructorTypes: [],
    typeQueries: [],
    typeLiterals: [],
    typeLiteralMembers: [],
    arrayTypes: [],
    tupleTypes: [],
    tupleTypeElements: [],
    optionalTypes: [],
    restTypes: [],
    unionTypes: [],
    unionTypeTypeNodes: [],
    intersectionTypes: [],
    intersectionTypeTypeNodes: [],
    conditionalTypes: [],
    inferTypes: [],
    parenthesizedTypes: [],
    typeOperators: [],
    indexedAccessTypes: [],
    mappedTypes: [],
    mappedTypeReadonlyTokens: [],
    mappedTypeNameTypeNodes: [],
    mappedTypeQuestionTokens: [],
    mappedTypeTypeNodes: [],
    literalTypes: [],
    namedTupleMembers: [],
    namedTupleMemberDotDotDotTokens: [],
    namedTupleMemberQuestionTokens: [],
    templateLiteralTypeSpans: [],
    templateLiteralTypes: [],
    importTypes: [],
    importTypeQualifiers: [],
  };

  const corefMember: coref.CorefMember = {
    objectLiteralElements: [],
    objectLiteralElementNameNodes: [],
    classElements: [],
    classElementNameNodes: [],
    typeElements: [],
    typeElementNameNodes: [],
    typeElementQuestionTokens: [],
    propertySignatures: [],
    propertySignatureQuestionTokens: [],
    propertySignatureTypeNodes: [],
    propertyDeclarations: [],
    propertyDeclarationQuestionTokens: [],
    propertyDeclarationExclamationTokens: [],
    propertyDeclarationTypeNodes: [],
    propertyDeclarationInitializers: [],
    methodSignatures: [],
    methodDeclarations: [],
    methodDeclarationBodies: [],
    classStaticBlockDeclarations: [],
    constructors: [],
    constructorBodies: [],
    getAccessors: [],
    getAccessorBodies: [],
    setAccessors: [],
    setAccessorBodies: [],
    callSignatures: [],
    constructSignatures: [],
    indexSignatures: [],
    semicolonClassElements: [],
    propertyAssignments: [],
    shorthandPropertyAssignments: [],
    spreadAssignments: [],
    enumMembers: [],
    enumMemberInitializers: [],
  };

  const corefBindingPattern: coref.CorefBindingPattern = {
    bindingElements: [],
    bindingElementPropertyNameNodes: [],
    bindingElementDotDotDotTokens: [],
    bindingElementInitializers: [],
    objectBindingPatterns: [],
    objectBindingPatternElements: [],
    arrayBindingPatterns: [],
    arrayBindingPatternElements: [],
  };

  const corefDeclaration: coref.CorefDeclaration = {
    declarations: [],
    declarationNameNodes: [],
    signatureDeclarations: [],
    signatureDeclarationNameNodes: [],
    signatureDeclarationTypeParameters: [],
    signatureDeclarationParameters: [],
    signatureDeclarationTypeNodes: [],
    functionLikeDeclarations: [],
    functionLikeDeclarationAsteriskTokens: [],
    functionLikeDeclarationQuestionTokens: [],
    functionLikeDeclarationExclamationTokens: [],
    functionLikeDeclarationBodies: [],
    classLikeDeclarations: [],
    classLikeDeclarationNameNodes: [],
    classLikeDeclarationTypeParameters: [],
    classLikeDeclarationMembers: [],
    typeParameters: [],
    typeParameterConstraints: [],
    typeParameterDefaults: [],
    parameters: [],
    parameterDotDotDotTokens: [],
    parameterQuestionTokens: [],
    parameterTypeNodes: [],
    parameterInitializers: [],
    variableDeclarations: [],
    variableDeclarationExclamationTokens: [],
    variableDeclarationTypeNodes: [],
    variableDeclarationInitializers: [],
    importClauses: [],
    importClauseNameNodes: [],
    importClauseNamedBindingsList: [],
    namespaceImports: [],
    importSpecifiers: [],
    importSpecifierPropertyNameNodes: [],
    namespaceExports: [],
    exportSpecifiers: [],
    exportSpecifierPropertyNameNodes: [],
  };

  const corefExpression: coref.CorefExpression = {
    expressions: [],
    unaryExpressions: [],
    updateExpressions: [],
    leftHandSideExpression: [],
    memberExpressions: [],
    primaryExpressions: [],
    thisExpressions: [],
    superExpressions: [],
    importExpressions: [],
    arrayLiteralExpressions: [],
    arrayLiteralExpressionElements: [],
    objectLiteralExpressions: [],
    objectLiteralExpressionProperties: [],
    propertyAccessExpressions: [],
    propertyAccessExpressionQuestionDotTokens: [],
    elementAccessExpressions: [],
    elementAccessExpressionQuestionDotTokens: [],
    callExpressions: [],
    callExpressionQuestionDotTokens: [],
    callExpressionTypeArguments: [],
    callExpressionArguments: [],
    newExpressions: [],
    newExpressionTypeArguments: [],
    newExpressionArguments: [],
    templateExpressions: [],
    taggedTemplateExpressions: [],
    taggedTemplateExpressionTypeArguments: [],
    typeAssertionExpressions: [],
    parenthesizedExpressions: [],
    functionExpressions: [],
    functionExpressionNameNodes: [],
    arrowFunctions: [],
    etsComponentExpressions: [],
    etsComponentExpressionTypeArguments: [],
    etsComponentExpressionArguments: [],
    etsComponentExpressionBodies: [],
    deleteExpressions: [],
    typeOfExpressions: [],
    voidExpressions: [],
    awaitExpressions: [],
    prefixUnaryExpressions: [],
    postfixUnaryExpressions: [],
    binaryExpressions: [],
    conditionalExpressions: [],
    yieldExpressions: [],
    yieldExpressionAsteriskTokens: [],
    yieldExpressionExpressions: [],
    spreadElements: [],
    classExpressions: [],
    omittedExpressions: [],
    expressionWithTypeArgumentsList: [],
    asExpressions: [],
    nonNullExpressions: [],
    metaProperties: [],
    satisfiesExpressions: [],
  };

  const corefStatement: coref.CorefStatement = {
    statements: [],
    declarationStatements: [],
    declarationStatementNameNodes: [],
    blocks: [],
    blockStatements: [],
    emptyStatements: [],
    variableStatements: [],
    expressionStatements: [],
    ifStatements: [],
    ifStatementElseStatements: [],
    iterationStatements: [],
    doStatements: [],
    whileStatements: [],
    forStatements: [],
    forStatementInitializers: [],
    forStatementConditions: [],
    forStatementIncrementors: [],
    forInStatements: [],
    forOfStatements: [],
    forOfStatementAwaitModifiers: [],
    continueStatements: [],
    continueStatementLabels: [],
    breakStatements: [],
    breakStatementLabels: [],
    returnStatements: [],
    returnStatementExpressions: [],
    withStatements: [],
    caseBlocks: [],
    caseBlockClauses: [],
    switchStatements: [],
    labeledStatements: [],
    throwStatements: [],
    tryStatements: [],
    tryStatementFinallyBlocks: [],
    debuggerStatements: [],
    functionDeclarations: [],
    functionDeclarationNameNodes: [],
    functionDeclarationBodies: [],
    classDeclarations: [],
    classDeclarationNameNodes: [],
    structDeclarations: [],
    structDeclarationNameNodes: [],
    interfaceDeclarations: [],
    interfaceDeclarationTypeParameters: [],
    interfaceDeclarationMembers: [],
    typeAliasDeclarations: [],
    typeAliasDeclarationTypeParameters: [],
    enumDeclarations: [],
    moduleDeclarations: [],
    moduleDeclarationBodies: [],
    moduleBlocks: [],
    moduleBlockStatements: [],
    namespaceExportDeclarations: [],
    importEqualsDeclarations: [],
    importDeclarations: [],
    importDeclarationAssertClauses: [],
    exportAssignments: [],
    exportDeclarations: [],
    exportDeclarationExportClauses: [],
    exportDeclarationModuleSpecifiers: [],
    exportDeclarationAssertClauses: [],
  };

  const corefClause: coref.CorefClause = {
    caseClauses: [],
    caseClauseStatements: [],
    defaultClauses: [],
    defaultClauseStatements: [],
    heritageClauses: [],
    heritageClauseTypeNodes: [],
    catchClauses: [],
    catchClauseVariableDeclarations: [],
  };

  const corefOtherAstNode: coref.CorefOtherAstNode = {
    decorators: [],
    variableDeclarationLists: [],
    variableDeclarationListDeclarations: [],
    namedImportsList: [],
    namedExportsList: [],
    externalModuleReferences: [],
    assertClauses: [],
    assertEntrys: [],
    importTypeAssertionContainers: [],
  };

  const corefTopLevel: coref.CorefTopLevel = {
    topLevels: [],
    topLevelStatements: [],
  };

  const corefAstNodeContainer: coref.CorefAstNodeContainer = {
    astNodeContainerRelations: [],
    cfgEntryNodes: [],
    cfgExitNodes: [],
  };

  const corefAst: coref.CorefAst = {
    astNodes: [],
    astNodeComments: [],
    ...corefLiteral,
    ...corefToken,
    ...corefName,
    ...corefTypeNode,
    ...corefMember,
    ...corefBindingPattern,
    ...corefDeclaration,
    ...corefExpression,
    ...corefStatement,
    ...corefClause,
    ...corefOtherAstNode,
    ...corefTopLevel,
    ...corefAstNodeContainer,
  };

  const locationMap = new Map<bigint, coref.Location>();

  extractTopLevel(tsSourceFile, corefTopLevel);

  util.forEachNode(tsSourceFile, (tsNode: ts.Node) => {
    const id = util.getCorefIdFromTsNodeInSameFile(tsNode);

    const { childNodes, childNodeLocations } = extractChildNodes(id, tsNode);
    extendArray(corefAst.astNodes, childNodes);
    childNodeLocations.forEach((location) => {
      locationMap.set(location.id, location);
    });

    extendArray(corefAst.astNodeComments, extractNodeComments(id, tsNode));

    extractLiteral(id, tsNode, corefLiteral);
    extractToken(id, tsNode, corefToken);
    extractName(id, tsNode, corefName);
    extractTypeNode(id, tsNode, corefTypeNode);
    extractMember(id, tsNode, corefMember);
    extractBindingPattern(id, tsNode, corefBindingPattern);
    extractDeclaration(id, tsNode, corefDeclaration);
    extractExpression(id, tsNode, corefExpression);
    extractStatement(id, tsNode, corefStatement);
    extractClause(id, tsNode, corefClause);
    extractOtherAstNode(id, tsNode, corefOtherAstNode);

    extractAstNodeContainerRelation(id, tsNode, corefAstNodeContainer);
  });

  return {
    locationMap,
    ...corefAst,
  };
}
