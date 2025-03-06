/**
 * Copyright 2024 Ant Group CO., Ltd.
 */

/* eslint-disable @typescript-eslint/no-explicit-any */

import * as fs from "fs";
import * as path from "path";

import ignore from "ignore";
import * as ts from "ohos-typescript";
import { SyntaxKind } from "ohos-typescript";

import { coref, extendedTs } from "../model";

export function isKeywordSyntaxKind(
  syntaxKind: ts.SyntaxKind,
): syntaxKind is ts.KeywordSyntaxKind {
  return (
    ts.SyntaxKind.FirstKeyword <= syntaxKind &&
    syntaxKind <= ts.SyntaxKind.LastKeyword
  );
}

export function isCommentSyntaxKind(
  syntaxKind: SyntaxKind,
): syntaxKind is
  | SyntaxKind.SingleLineCommentTrivia
  | SyntaxKind.MultiLineCommentTrivia {
  return (
    syntaxKind === ts.SyntaxKind.SingleLineCommentTrivia ||
    syntaxKind === ts.SyntaxKind.MultiLineCommentTrivia
  );
}

export function isTriviaSyntaxKind(
  syntaxKind: ts.SyntaxKind,
): syntaxKind is ts.TriviaSyntaxKind {
  return (
    ts.SyntaxKind.FirstTriviaToken <= syntaxKind &&
    syntaxKind <= ts.SyntaxKind.LastTriviaToken
  );
}

export function isNonCodeTokenSyntaxKind(syntaxKind: ts.SyntaxKind) {
  return (
    syntaxKind === ts.SyntaxKind.Unknown ||
    syntaxKind === ts.SyntaxKind.EndOfFileToken ||
    isTriviaSyntaxKind(syntaxKind)
  );
}

export function isInvalidNode(node: ts.Node | undefined) {
  return !node || node.getWidth() === 0;
}

export function getLeadingCommentRangesOfNode(
  node: ts.Node,
  sourceFileOfNode: ts.SourceFile,
): ts.CommentRange[] | undefined {
  return node.kind !== ts.SyntaxKind.JsxText
    ? ts.getLeadingCommentRanges(sourceFileOfNode.text, node.pos)
    : undefined;
}

export function getTrailingCommentRangesOfNode(
  node: ts.Node,
  sourceFileOfNode: ts.SourceFile,
): ts.CommentRange[] | undefined {
  return node.kind !== ts.SyntaxKind.JsxText
    ? ts.getTrailingCommentRanges(sourceFileOfNode.text, node.end)
    : undefined;
}

export function shouldReScanGreaterThanToken(node: ts.Node): boolean {
  switch (node.kind) {
    case ts.SyntaxKind.GreaterThanEqualsToken:
    case ts.SyntaxKind.GreaterThanGreaterThanEqualsToken:
    case ts.SyntaxKind.GreaterThanGreaterThanGreaterThanEqualsToken:
    case ts.SyntaxKind.GreaterThanGreaterThanGreaterThanToken:
    case ts.SyntaxKind.GreaterThanGreaterThanToken:
      return true;
  }

  return false;
}

export function shouldReScanSlashToken(container: ts.Node): boolean {
  return container.kind === ts.SyntaxKind.RegularExpressionLiteral;
}

export function shouldReScanTemplateToken(container: ts.Node): boolean {
  return (
    container.kind === ts.SyntaxKind.TemplateMiddle ||
    container.kind === ts.SyntaxKind.TemplateTail
  );
}

export function fileExtensionIs(path: string, extension: string): boolean {
  return path.endsWith(extension);
}

export function fileExtensionIsOneOf(
  path: string,
  extensions: readonly string[],
): boolean {
  for (const extension of extensions) {
    if (fileExtensionIs(path, extension)) {
      return true;
    }
  }

  return false;
}

export function isJsOrTsFile(path: string): boolean {
  return fileExtensionIsOneOf(path, /*extensions*/ Object.values(ts.Extension));
}

/**
 * 根据 .gitignore 文件生成一个函数作为 listAllFiles 的 ignoreFunction
 *
 * @param gitignorePath .gitignore 文件绝对路径
 * @returns ignoreFunction
 */
export function createIgnoreFunctionByGitignore(
  gitignorePath: string,
): (fileOrDirPath: string) => coref.IgnoredPath | null {
  const rootPath = path.resolve(path.dirname(gitignorePath));

  if (!fs.existsSync(gitignorePath)) {
    // 不忽略任何文件
    return () => null;
  }

  const gitignoreContent = fs.readFileSync(gitignorePath, "utf-8");
  const ig = ignore().add(gitignoreContent);

  return (fileOrDirPath: string) => {
    let relativePath = path.relative(rootPath, fileOrDirPath);
    const isDirectory = fs.statSync(fileOrDirPath).isDirectory();
    if (isDirectory) {
      relativePath = relativePath + path.sep;
    }

    if (ig.test(relativePath).ignored) {
      return coref.createIgnoredPath(
        isDirectory ? coref.PathKind.DIRECTORY : coref.PathKind.FILE,
        fileOrDirPath,
        coref.IgnoreKind.DOT_GITIGNORE,
      );
    } else {
      return null;
    }
  };
}

/**
 * 一个 listAllFiles 的 ignoreFunction，根据路径是否是用于发布的压缩后的 js 文件或放置这类 js 文件的目录来判断是否需要忽略
 * @param fileOrDirPath 文件/目录路径
 * @returns 忽略的路径对象或 null（代表不被忽略）
 */
export function distIgnoreFunction(
  fileOrDirPath: string,
): coref.IgnoredPath | null {
  const stat = fs.statSync(fileOrDirPath);
  const name = path.basename(fileOrDirPath);
  if (stat.isDirectory()) {
    const dirDenylist = ["dist"];
    if (dirDenylist.includes(name)) {
      return coref.createIgnoredPath(
        coref.PathKind.DIRECTORY,
        fileOrDirPath,
        coref.IgnoreKind.DIST_DIR,
      );
    }
  } else if (stat.isFile()) {
    if (name.endsWith(".min.js")) {
      return coref.createIgnoredPath(
        coref.PathKind.DIRECTORY,
        fileOrDirPath,
        coref.IgnoreKind.DIST_FILE,
      );
    }
  }
  return null;
}

/**
 * Create an ignoreFunction for listAllFiles, which ignore files according to the specified `fileSizeLimit`
 *
 * @param fileSizeLimitInKb file size limit in KB
 * @returns ignoreFunction
 */
export function createFileSizeIgnoreFunction(
  fileSizeLimitInKb: number | undefined,
): (fileOrDirPath: string) => coref.IgnoredPath | null {
  const sizeLimit =
    fileSizeLimitInKb && fileSizeLimitInKb > 0
      ? fileSizeLimitInKb * 1024
      : 1048576; /* 1MB */
  return (fileOrDirPath: string) => {
    const direntStat = fs.statSync(fileOrDirPath);
    // 目录的 size 不可能超过 sizeLimit
    return direntStat.size > sizeLimit
      ? coref.createIgnoredPath(
          coref.PathKind.FILE,
          fileOrDirPath,
          coref.IgnoreKind.FILE_SIZE_LIMIT,
        )
      : null;
  };
}

/**
 * 根据 blacklist 列表过滤文件
 *
 * @param gitignorePath .gitignore 文件绝对路径
 * @returns ignoreFunction
 */
export function createIgnoreFunctionByBlacklist(
  rootPath: string,
  blacklist: string[] | undefined,
): (fileOrDirPath: string) => coref.IgnoredPath | null {
  if (!blacklist || blacklist.length == 0) {
    // 不忽略任何文件
    return () => null;
  }

  const ig = ignore();
  for (const item of blacklist) {
    ig.add(item);
  }

  return (fileOrDirPath: string) => {
    let relativePath = path.relative(rootPath, fileOrDirPath);
    if (path.isAbsolute(relativePath)) {
      return null;
    }
    const isDirectory = fs.statSync(fileOrDirPath).isDirectory();
    if (isDirectory) {
      relativePath = relativePath + path.sep;
    }

    if (ig.test(relativePath).ignored) {
      return coref.createIgnoredPath(
        isDirectory ? coref.PathKind.DIRECTORY : coref.PathKind.FILE,
        fileOrDirPath,
        coref.IgnoreKind.BLACK_LIST,
      );
    }

    return null;
  };
}

/**
 * 遍历目录下的全部文件，返回一个文件列表。过滤掉由于链接失效等原因导致的不存在的文件。
 *
 * @param dirPath 目录
 * @param extensions 文件后缀列表
 * @param ignoreFunctions 忽略函数列表
 * @returns 该目录下全部文件的列表
 */
export function listAllFiles(
  dirPath: string,
  extensions?: readonly string[],
  ignoreFunctions?: readonly ((
    fileOrDirPath: string,
  ) => coref.IgnoredPath | null)[],
): { filePaths: string[]; ignoredPaths: coref.IgnoredPath[] } {
  const filePaths: string[] = [];
  const ignoredPaths: coref.IgnoredPath[] = [];

  dirPath = path.resolve(dirPath);
  const queue: string[] = [dirPath];
  const visitedDirSet = new Set();

  while (queue.length !== 0) {
    dirPath = queue.shift() as string;

    const realPath = fs.realpathSync(dirPath);
    // 避免循环链接
    if (visitedDirSet.has(realPath)) {
      continue;
    }
    visitedDirSet.add(realPath);

    for (const name of fs.readdirSync(dirPath)) {
      const direntPath = path.join(dirPath, name);

      if (!fs.existsSync(direntPath)) {
        continue;
      }

      if (ignoreFunctions) {
        let ignoredPath: coref.IgnoredPath | null = null;
        for (const ignoreFunction of ignoreFunctions) {
          ignoredPath = ignoreFunction(direntPath);
          if (ignoredPath) {
            break;
          }
        }

        if (ignoredPath) {
          console.log(`Ignore ${direntPath}`);
          ignoredPaths.push(ignoredPath);
          continue;
        }
      }

      const direntStat = fs.statSync(direntPath);
      if (direntStat.isFile()) {
        if (extensions && extensions.length > 0) {
          // 如果指定了 extensions，判断该文件是否符合指定的 extensions
          if (fileExtensionIsOneOf(direntPath, extensions)) {
            filePaths.push(direntPath);
          }
        } else {
          // 否则直接加入 filePaths 中
          filePaths.push(direntPath);
        }
      } else if (direntStat.isDirectory()) {
        queue.push(direntPath);
      }
    }
  }

  return {
    filePaths,
    ignoredPaths,
  };
}

/**
 * Iterates through 'array' by index and performs the callback on each element of array until the callback
 * returns a truthy value, then returns that value.
 * If no such value is found, the callback is applied to each element of array and undefined is returned.
 */
export function forEach<T, U>(
  array: readonly T[] | undefined,
  callback: (element: T, index: number) => U | undefined,
): U | undefined {
  if (array) {
    for (let i = 0; i < array.length; i++) {
      const result = callback(array[i], i);
      if (result) {
        return result;
      }
    }
  }
  return undefined;
}

function visitNode<T>(
  cbNode: (node: ts.Node) => T,
  node: ts.Node | undefined,
): T | undefined {
  return node && cbNode(node);
}

function visitNodes<T>(
  cbNode: (node: ts.Node) => T,
  cbNodes: ((node: ts.NodeArray<ts.Node>) => T | undefined) | undefined,
  nodes: ts.NodeArray<ts.Node> | undefined,
): T | undefined {
  if (nodes) {
    if (cbNodes) {
      return cbNodes(nodes);
    }
    for (const node of nodes) {
      const result = cbNode(node);
      if (result) {
        return result;
      }
    }
  }
}

export type ForEachChildNodes =
  | HasChildren
  | ts.MissingDeclaration
  | ts.JSDocTypeExpression
  | ts.JSDocNonNullableType
  | ts.JSDocNullableType
  | ts.JSDocOptionalType
  | ts.JSDocVariadicType
  | ts.JSDocFunctionType
  | ts.JSDoc
  | ts.JSDocSeeTag
  | ts.JSDocNameReference
  | ts.JSDocMemberName
  | ts.JSDocParameterTag
  | ts.JSDocPropertyTag
  | ts.JSDocAuthorTag
  | ts.JSDocImplementsTag
  | ts.JSDocAugmentsTag
  | ts.JSDocTemplateTag
  | ts.JSDocTypedefTag
  | ts.JSDocCallbackTag
  | ts.JSDocReturnTag
  | ts.JSDocTypeTag
  | ts.JSDocThisTag
  | ts.JSDocEnumTag
  | ts.JSDocSignature
  | ts.JSDocLink
  | ts.JSDocLinkCode
  | ts.JSDocLinkPlain
  | ts.JSDocTypeLiteral
  | ts.JSDocUnknownTag
  | ts.JSDocClassTag
  | ts.JSDocPublicTag
  | ts.JSDocPrivateTag
  | ts.JSDocProtectedTag
  | ts.JSDocReadonlyTag
  | ts.JSDocDeprecatedTag
  | ts.JSDocOverrideTag;

export type VisitEachChildNodes = HasChildren | ts.Identifier;

export type HasChildren =
  | ts.QualifiedName
  | ts.ComputedPropertyName
  | ts.TypeParameterDeclaration
  | ts.ParameterDeclaration
  | ts.Decorator
  | ts.PropertySignature
  | ts.PropertyDeclaration
  | ts.MethodSignature
  | ts.MethodDeclaration
  | ts.ConstructorDeclaration
  | ts.GetAccessorDeclaration
  | ts.SetAccessorDeclaration
  | ts.ClassStaticBlockDeclaration
  | ts.CallSignatureDeclaration
  | ts.ConstructSignatureDeclaration
  | ts.IndexSignatureDeclaration
  | ts.TypePredicateNode
  | ts.TypeReferenceNode
  | ts.FunctionTypeNode
  | ts.ConstructorTypeNode
  | ts.TypeQueryNode
  | ts.TypeLiteralNode
  | ts.ArrayTypeNode
  | ts.TupleTypeNode
  | ts.OptionalTypeNode
  | ts.RestTypeNode
  | ts.UnionTypeNode
  | ts.IntersectionTypeNode
  | ts.ConditionalTypeNode
  | ts.InferTypeNode
  | ts.ImportTypeNode
  | ts.ImportTypeAssertionContainer
  | ts.NamedTupleMember
  | ts.ParenthesizedTypeNode
  | ts.TypeOperatorNode
  | ts.IndexedAccessTypeNode
  | ts.MappedTypeNode
  | ts.LiteralTypeNode
  | ts.TemplateLiteralTypeNode
  | ts.TemplateLiteralTypeSpan
  | ts.ObjectBindingPattern
  | ts.ArrayBindingPattern
  | ts.BindingElement
  | ts.ArrayLiteralExpression
  | ts.ObjectLiteralExpression
  | ts.PropertyAccessExpression
  | ts.ElementAccessExpression
  | ts.CallExpression
  | ts.EtsComponentExpression
  | ts.NewExpression
  | ts.TaggedTemplateExpression
  | ts.TypeAssertion
  | ts.ParenthesizedExpression
  | ts.FunctionExpression
  | ts.ArrowFunction
  | ts.DeleteExpression
  | ts.TypeOfExpression
  | ts.VoidExpression
  | ts.AwaitExpression
  | ts.PrefixUnaryExpression
  | ts.PostfixUnaryExpression
  | ts.BinaryExpression
  | ts.ConditionalExpression
  | ts.TemplateExpression
  | ts.YieldExpression
  | ts.SpreadElement
  | ts.ClassExpression
  | ts.ExpressionWithTypeArguments
  | ts.AsExpression
  | ts.NonNullExpression
  | ts.SatisfiesExpression
  | ts.MetaProperty
  | ts.TemplateSpan
  | ts.Block
  | ts.VariableStatement
  | ts.ExpressionStatement
  | ts.IfStatement
  | ts.DoStatement
  | ts.WhileStatement
  | ts.ForStatement
  | ts.ForInStatement
  | ts.ForOfStatement
  | ts.ContinueStatement
  | ts.BreakStatement
  | ts.ReturnStatement
  | ts.WithStatement
  | ts.SwitchStatement
  | ts.LabeledStatement
  | ts.ThrowStatement
  | ts.TryStatement
  | ts.VariableDeclaration
  | ts.VariableDeclarationList
  | ts.FunctionDeclaration
  | ts.ClassDeclaration
  | ts.StructDeclaration
  | ts.InterfaceDeclaration
  | ts.TypeAliasDeclaration
  | ts.EnumDeclaration
  | ts.ModuleDeclaration
  | ts.ModuleBlock
  | ts.CaseBlock
  | ts.NamespaceExportDeclaration
  | ts.ImportEqualsDeclaration
  | ts.ImportDeclaration
  | ts.AssertClause
  | ts.AssertEntry
  | ts.ImportClause
  | ts.NamespaceImport
  | ts.NamespaceExport
  | ts.NamedImports
  | ts.ImportSpecifier
  | ts.ExportAssignment
  | ts.ExportDeclaration
  | ts.NamedExports
  | ts.ExportSpecifier
  | ts.ExternalModuleReference
  | ts.JsxElement
  | ts.JsxSelfClosingElement
  | ts.JsxOpeningElement
  | ts.JsxClosingElement
  | ts.JsxFragment
  | ts.JsxAttribute
  | ts.JsxAttributes
  | ts.JsxSpreadAttribute
  | ts.JsxExpression
  | ts.CaseClause
  | ts.DefaultClause
  | ts.HeritageClause
  | ts.CatchClause
  | ts.PropertyAssignment
  | ts.ShorthandPropertyAssignment
  | ts.SpreadAssignment
  | ts.EnumMember
  | ts.SourceFile
  | ts.PartiallyEmittedExpression
  | ts.CommaListExpression;

function forEachChildInCallOrConstructSignature<T>(
  node: ts.CallSignatureDeclaration | ts.ConstructSignatureDeclaration,
  cbNode: (node: ts.Node) => T | undefined,
  cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
): T | undefined {
  return (
    visitNodes(cbNode, cbNodes, node.typeParameters) ||
    visitNodes(cbNode, cbNodes, node.parameters) ||
    visitNode(cbNode, node.type)
  );
}

function forEachChildInUnionOrIntersectionType<T>(
  node: ts.UnionTypeNode | ts.IntersectionTypeNode,
  cbNode: (node: ts.Node) => T | undefined,
  cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
): T | undefined {
  return visitNodes(cbNode, cbNodes, node.types);
}

function forEachChildInParenthesizedTypeOrTypeOperator<T>(
  node: ts.ParenthesizedTypeNode | ts.TypeOperatorNode,
  cbNode: (node: ts.Node) => T | undefined,
  _cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
): T | undefined {
  return visitNode(cbNode, node.type);
}

function forEachChildInObjectOrArrayBindingPattern<T>(
  node: ts.BindingPattern,
  cbNode: (node: ts.Node) => T | undefined,
  cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
): T | undefined {
  return visitNodes(cbNode, cbNodes, node.elements);
}

function forEachChildInCallOrNewExpression<T>(
  node: ts.CallExpression | ts.NewExpression,
  cbNode: (node: ts.Node) => T | undefined,
  cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
): T | undefined {
  return (
    visitNode(cbNode, node.expression) ||
    // TODO: should we separate these branches out?
    visitNode(cbNode, (node as ts.CallExpression).questionDotToken) ||
    visitNodes(cbNode, cbNodes, node.typeArguments) ||
    visitNodes(cbNode, cbNodes, node.arguments)
  );
}

function forEachChildInBlock<T>(
  node: ts.Block | ts.ModuleBlock,
  cbNode: (node: ts.Node) => T | undefined,
  cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
): T | undefined {
  return visitNodes(cbNode, cbNodes, node.statements);
}

function forEachChildInContinueOrBreakStatement<T>(
  node: ts.ContinueStatement | ts.BreakStatement,
  cbNode: (node: ts.Node) => T | undefined,
  _cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
): T | undefined {
  return visitNode(cbNode, node.label);
}

function forEachChildInClassDeclarationOrExpression<T>(
  node: ts.ClassDeclaration | ts.ClassExpression | ts.StructDeclaration,
  cbNode: (node: ts.Node) => T | undefined,
  cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
): T | undefined {
  return (
    visitNodes(cbNode, cbNodes, node.modifiers) ||
    visitNode(cbNode, node.name) ||
    visitNodes(cbNode, cbNodes, node.typeParameters) ||
    visitNodes(cbNode, cbNodes, node.heritageClauses) ||
    visitNodes(cbNode, cbNodes, node.members)
  );
}

function forEachChildInNamedImportsOrExports<T>(
  node: ts.NamedImports | ts.NamedExports,
  cbNode: (node: ts.Node) => T | undefined,
  cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
): T | undefined {
  return visitNodes(cbNode, cbNodes, node.elements);
}

function forEachChildInImportOrExportSpecifier<T>(
  node: ts.ImportSpecifier | ts.ExportSpecifier,
  cbNode: (node: ts.Node) => T | undefined,
  _cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
): T | undefined {
  return visitNode(cbNode, node.propertyName) || visitNode(cbNode, node.name);
}

function forEachChildInJsxOpeningOrSelfClosingElement<T>(
  node: ts.JsxOpeningLikeElement,
  cbNode: (node: ts.Node) => T | undefined,
  cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
): T | undefined {
  return (
    visitNode(cbNode, node.tagName) ||
    visitNodes(cbNode, cbNodes, node.typeArguments) ||
    visitNode(cbNode, node.attributes)
  );
}

function forEachChildInOptionalRestOrJSDocParameterModifier<T>(
  node:
    | ts.OptionalTypeNode
    | ts.RestTypeNode
    | ts.JSDocTypeExpression
    | ts.JSDocNullableType
    | ts.JSDocNonNullableType
    | ts.JSDocOptionalType
    | ts.JSDocVariadicType,
  cbNode: (node: ts.Node) => T | undefined,
  _cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
): T | undefined {
  return visitNode(cbNode, node.type);
}

function forEachChildInJSDocParameterOrPropertyTag<T>(
  node: ts.JSDocParameterTag | ts.JSDocPropertyTag,
  cbNode: (node: ts.Node) => T | undefined,
  cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
): T | undefined {
  return (
    visitNode(cbNode, node.tagName) ||
    (node.isNameFirst
      ? visitNode(cbNode, node.name) || visitNode(cbNode, node.typeExpression)
      : visitNode(cbNode, node.typeExpression) ||
        visitNode(cbNode, node.name)) ||
    (typeof node.comment === "string"
      ? undefined
      : visitNodes(cbNode, cbNodes, node.comment))
  );
}

function forEachChildInJSDocReturnTag<T>(
  node: ts.JSDocReturnTag | ts.JSDocTypeTag | ts.JSDocThisTag | ts.JSDocEnumTag,
  cbNode: (node: ts.Node) => T | undefined,
  cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
): T | undefined {
  return (
    visitNode(cbNode, node.tagName) ||
    visitNode(cbNode, node.typeExpression) ||
    (typeof node.comment === "string"
      ? undefined
      : visitNodes(cbNode, cbNodes, node.comment))
  );
}

function forEachChildInJSDocLinkCodeOrPlain<T>(
  node: ts.JSDocLink | ts.JSDocLinkCode | ts.JSDocLinkPlain,
  cbNode: (node: ts.Node) => T | undefined,
  _cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
): T | undefined {
  return visitNode(cbNode, node.name);
}

function forEachChildInJSDocTag<T>(
  node:
    | ts.JSDocUnknownTag
    | ts.JSDocClassTag
    | ts.JSDocPublicTag
    | ts.JSDocPrivateTag
    | ts.JSDocProtectedTag
    | ts.JSDocReadonlyTag
    | ts.JSDocDeprecatedTag
    | ts.JSDocOverrideTag,
  cbNode: (node: ts.Node) => T | undefined,
  cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
): T | undefined {
  return (
    visitNode(cbNode, node.tagName) ||
    (typeof node.comment === "string"
      ? undefined
      : visitNodes(cbNode, cbNodes, node.comment))
  );
}

function forEachChildInPartiallyEmittedExpression<T>(
  node: ts.PartiallyEmittedExpression,
  cbNode: (node: ts.Node) => T | undefined,
  _cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
): T | undefined {
  return visitNode(cbNode, node.expression);
}

type ForEachChildFunction<TNode> = <T>(
  node: TNode,
  cbNode: (node: ts.Node) => T | undefined,
  cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
) => T | undefined;
type ForEachChildTable = {
  [TNode in ForEachChildNodes as TNode["kind"]]: ForEachChildFunction<TNode>;
};
const forEachChildTable: ForEachChildTable = {
  [SyntaxKind.QualifiedName]: function forEachChildInQualifiedName<T>(
    node: ts.QualifiedName,
    cbNode: (node: ts.Node) => T | undefined,
    _cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return visitNode(cbNode, node.left) || visitNode(cbNode, node.right);
  },
  [SyntaxKind.TypeParameter]: function forEachChildInTypeParameter<T>(
    node: ts.TypeParameterDeclaration,
    cbNode: (node: ts.Node) => T | undefined,
    cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return (
      visitNodes(cbNode, cbNodes, node.modifiers) ||
      visitNode(cbNode, node.name) ||
      visitNode(cbNode, node.constraint) ||
      visitNode(cbNode, node.default) ||
      visitNode(cbNode, node.expression)
    );
  },
  [SyntaxKind.ShorthandPropertyAssignment]:
    function forEachChildInShorthandPropertyAssignment<T>(
      node: ts.ShorthandPropertyAssignment,
      cbNode: (node: ts.Node) => T | undefined,
      cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
    ): T | undefined {
      return (
        visitNodes(cbNode, cbNodes, node.modifiers) ||
        visitNode(cbNode, node.name) ||
        visitNode(cbNode, node.questionToken) ||
        visitNode(cbNode, node.exclamationToken) ||
        visitNode(cbNode, node.equalsToken) ||
        visitNode(cbNode, node.objectAssignmentInitializer)
      );
    },
  [SyntaxKind.SpreadAssignment]: function forEachChildInSpreadAssignment<T>(
    node: ts.SpreadAssignment,
    cbNode: (node: ts.Node) => T | undefined,
    _cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return visitNode(cbNode, node.expression);
  },
  [SyntaxKind.Parameter]: function forEachChildInParameter<T>(
    node: ts.ParameterDeclaration,
    cbNode: (node: ts.Node) => T | undefined,
    cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return (
      visitNodes(cbNode, cbNodes, node.modifiers) ||
      visitNode(cbNode, node.dotDotDotToken) ||
      visitNode(cbNode, node.name) ||
      visitNode(cbNode, node.questionToken) ||
      visitNode(cbNode, node.type) ||
      visitNode(cbNode, node.initializer)
    );
  },
  [SyntaxKind.PropertyDeclaration]: function forEachChildInPropertyDeclaration<
    T,
  >(
    node: ts.PropertyDeclaration,
    cbNode: (node: ts.Node) => T | undefined,
    cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return (
      visitNodes(cbNode, cbNodes, node.modifiers) ||
      visitNode(cbNode, node.name) ||
      visitNode(cbNode, node.questionToken) ||
      visitNode(cbNode, node.exclamationToken) ||
      visitNode(cbNode, node.type) ||
      visitNode(cbNode, node.initializer)
    );
  },
  [SyntaxKind.PropertySignature]: function forEachChildInPropertySignature<T>(
    node: ts.PropertySignature,
    cbNode: (node: ts.Node) => T | undefined,
    cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return (
      visitNodes(cbNode, cbNodes, node.modifiers) ||
      visitNode(cbNode, node.name) ||
      visitNode(cbNode, node.questionToken) ||
      visitNode(cbNode, node.type) ||
      visitNode(cbNode, node.initializer)
    );
  },
  [SyntaxKind.PropertyAssignment]: function forEachChildInPropertyAssignment<T>(
    node: ts.PropertyAssignment,
    cbNode: (node: ts.Node) => T | undefined,
    cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return (
      visitNodes(cbNode, cbNodes, node.modifiers) ||
      visitNode(cbNode, node.name) ||
      visitNode(cbNode, node.questionToken) ||
      visitNode(cbNode, node.exclamationToken) ||
      visitNode(cbNode, node.initializer)
    );
  },
  [SyntaxKind.VariableDeclaration]: function forEachChildInVariableDeclaration<
    T,
  >(
    node: ts.VariableDeclaration,
    cbNode: (node: ts.Node) => T | undefined,
    _cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return (
      visitNode(cbNode, node.name) ||
      visitNode(cbNode, node.exclamationToken) ||
      visitNode(cbNode, node.type) ||
      visitNode(cbNode, node.initializer)
    );
  },
  [SyntaxKind.BindingElement]: function forEachChildInBindingElement<T>(
    node: ts.BindingElement,
    cbNode: (node: ts.Node) => T | undefined,
    _cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return (
      visitNode(cbNode, node.dotDotDotToken) ||
      visitNode(cbNode, node.propertyName) ||
      visitNode(cbNode, node.name) ||
      visitNode(cbNode, node.initializer)
    );
  },
  [SyntaxKind.IndexSignature]: function forEachChildInIndexSignature<T>(
    node: ts.IndexSignatureDeclaration,
    cbNode: (node: ts.Node) => T | undefined,
    cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return (
      visitNodes(cbNode, cbNodes, node.modifiers) ||
      visitNodes(cbNode, cbNodes, node.typeParameters) ||
      visitNodes(cbNode, cbNodes, node.parameters) ||
      visitNode(cbNode, node.type)
    );
  },
  [SyntaxKind.ConstructorType]: function forEachChildInConstructorType<T>(
    node: ts.ConstructorTypeNode,
    cbNode: (node: ts.Node) => T | undefined,
    cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return (
      visitNodes(cbNode, cbNodes, node.modifiers) ||
      visitNodes(cbNode, cbNodes, node.typeParameters) ||
      visitNodes(cbNode, cbNodes, node.parameters) ||
      visitNode(cbNode, node.type)
    );
  },
  [SyntaxKind.FunctionType]: function forEachChildInFunctionType<T>(
    node: ts.FunctionTypeNode,
    cbNode: (node: ts.Node) => T | undefined,
    cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return (
      visitNodes(cbNode, cbNodes, node.modifiers) ||
      visitNodes(cbNode, cbNodes, node.typeParameters) ||
      visitNodes(cbNode, cbNodes, node.parameters) ||
      visitNode(cbNode, node.type)
    );
  },
  [SyntaxKind.CallSignature]: forEachChildInCallOrConstructSignature,
  [SyntaxKind.ConstructSignature]: forEachChildInCallOrConstructSignature,
  [SyntaxKind.EtsComponentExpression]:
    function forEachChildInEtsComponentExpression<T>(
      node: ts.EtsComponentExpression,
      cbNode: (node: ts.Node) => T | undefined,
      cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
    ): T | undefined {
      return (
        visitNode(cbNode, node.expression) ||
        visitNodes(cbNode, cbNodes, node.arguments) ||
        visitNode(cbNode, node.body)
      );
    },
  [SyntaxKind.MethodDeclaration]: function forEachChildInMethodDeclaration<T>(
    node: ts.MethodDeclaration,
    cbNode: (node: ts.Node) => T | undefined,
    cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return (
      visitNodes(cbNode, cbNodes, node.modifiers) ||
      visitNode(cbNode, node.asteriskToken) ||
      visitNode(cbNode, node.name) ||
      visitNode(cbNode, node.questionToken) ||
      visitNode(cbNode, node.exclamationToken) ||
      visitNodes(cbNode, cbNodes, node.typeParameters) ||
      visitNodes(cbNode, cbNodes, node.parameters) ||
      visitNode(cbNode, node.type) ||
      visitNode(cbNode, node.body)
    );
  },
  [SyntaxKind.MethodSignature]: function forEachChildInMethodSignature<T>(
    node: ts.MethodSignature,
    cbNode: (node: ts.Node) => T | undefined,
    cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return (
      visitNodes(cbNode, cbNodes, node.modifiers) ||
      visitNode(cbNode, node.name) ||
      visitNode(cbNode, node.questionToken) ||
      visitNodes(cbNode, cbNodes, node.typeParameters) ||
      visitNodes(cbNode, cbNodes, node.parameters) ||
      visitNode(cbNode, node.type)
    );
  },
  [SyntaxKind.Constructor]: function forEachChildInConstructor<T>(
    node: ts.ConstructorDeclaration,
    cbNode: (node: ts.Node) => T | undefined,
    cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return (
      visitNodes(cbNode, cbNodes, node.modifiers) ||
      visitNode(cbNode, node.name) ||
      visitNodes(cbNode, cbNodes, node.typeParameters) ||
      visitNodes(cbNode, cbNodes, node.parameters) ||
      visitNode(cbNode, node.type) ||
      visitNode(cbNode, node.body)
    );
  },
  [SyntaxKind.GetAccessor]: function forEachChildInGetAccessor<T>(
    node: ts.GetAccessorDeclaration,
    cbNode: (node: ts.Node) => T | undefined,
    cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return (
      visitNodes(cbNode, cbNodes, node.modifiers) ||
      visitNode(cbNode, node.name) ||
      visitNodes(cbNode, cbNodes, node.typeParameters) ||
      visitNodes(cbNode, cbNodes, node.parameters) ||
      visitNode(cbNode, node.type) ||
      visitNode(cbNode, node.body)
    );
  },
  [SyntaxKind.SetAccessor]: function forEachChildInSetAccessor<T>(
    node: ts.SetAccessorDeclaration,
    cbNode: (node: ts.Node) => T | undefined,
    cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return (
      visitNodes(cbNode, cbNodes, node.modifiers) ||
      visitNode(cbNode, node.name) ||
      visitNodes(cbNode, cbNodes, node.typeParameters) ||
      visitNodes(cbNode, cbNodes, node.parameters) ||
      visitNode(cbNode, node.type) ||
      visitNode(cbNode, node.body)
    );
  },
  [SyntaxKind.FunctionDeclaration]: function forEachChildInFunctionDeclaration<
    T,
  >(
    node: ts.FunctionDeclaration,
    cbNode: (node: ts.Node) => T | undefined,
    cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return (
      visitNodes(cbNode, cbNodes, node.modifiers) ||
      visitNode(cbNode, node.asteriskToken) ||
      visitNode(cbNode, node.name) ||
      visitNodes(cbNode, cbNodes, node.typeParameters) ||
      visitNodes(cbNode, cbNodes, node.parameters) ||
      visitNode(cbNode, node.type) ||
      visitNode(cbNode, node.body)
    );
  },
  [SyntaxKind.FunctionExpression]: function forEachChildInFunctionExpression<T>(
    node: ts.FunctionExpression,
    cbNode: (node: ts.Node) => T | undefined,
    cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return (
      visitNodes(cbNode, cbNodes, node.modifiers) ||
      visitNode(cbNode, node.asteriskToken) ||
      visitNode(cbNode, node.name) ||
      visitNodes(cbNode, cbNodes, node.typeParameters) ||
      visitNodes(cbNode, cbNodes, node.parameters) ||
      visitNode(cbNode, node.type) ||
      visitNode(cbNode, node.body)
    );
  },
  [SyntaxKind.ArrowFunction]: function forEachChildInArrowFunction<T>(
    node: ts.ArrowFunction,
    cbNode: (node: ts.Node) => T | undefined,
    cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return (
      visitNodes(cbNode, cbNodes, node.modifiers) ||
      visitNodes(cbNode, cbNodes, node.typeParameters) ||
      visitNodes(cbNode, cbNodes, node.parameters) ||
      visitNode(cbNode, node.type) ||
      visitNode(cbNode, node.equalsGreaterThanToken) ||
      visitNode(cbNode, node.body)
    );
  },
  [SyntaxKind.ClassStaticBlockDeclaration]:
    function forEachChildInClassStaticBlockDeclaration<T>(
      node: ts.ClassStaticBlockDeclaration,
      cbNode: (node: ts.Node) => T | undefined,
      cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
    ): T | undefined {
      return (
        visitNodes(cbNode, cbNodes, node.modifiers) ||
        visitNode(cbNode, node.body)
      );
    },
  [SyntaxKind.TypeReference]: function forEachChildInTypeReference<T>(
    node: ts.TypeReferenceNode,
    cbNode: (node: ts.Node) => T | undefined,
    cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return (
      visitNode(cbNode, node.typeName) ||
      visitNodes(cbNode, cbNodes, node.typeArguments)
    );
  },
  [SyntaxKind.TypePredicate]: function forEachChildInTypePredicate<T>(
    node: ts.TypePredicateNode,
    cbNode: (node: ts.Node) => T | undefined,
    _cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return (
      visitNode(cbNode, node.assertsModifier) ||
      visitNode(cbNode, node.parameterName) ||
      visitNode(cbNode, node.type)
    );
  },
  [SyntaxKind.TypeQuery]: function forEachChildInTypeQuery<T>(
    node: ts.TypeQueryNode,
    cbNode: (node: ts.Node) => T | undefined,
    cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return (
      visitNode(cbNode, node.exprName) ||
      visitNodes(cbNode, cbNodes, node.typeArguments)
    );
  },
  [SyntaxKind.TypeLiteral]: function forEachChildInTypeLiteral<T>(
    node: ts.TypeLiteralNode,
    cbNode: (node: ts.Node) => T | undefined,
    cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return visitNodes(cbNode, cbNodes, node.members);
  },
  [SyntaxKind.ArrayType]: function forEachChildInArrayType<T>(
    node: ts.ArrayTypeNode,
    cbNode: (node: ts.Node) => T | undefined,
    _cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return visitNode(cbNode, node.elementType);
  },
  [SyntaxKind.TupleType]: function forEachChildInTupleType<T>(
    node: ts.TupleTypeNode,
    cbNode: (node: ts.Node) => T | undefined,
    cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return visitNodes(cbNode, cbNodes, node.elements);
  },
  [SyntaxKind.UnionType]: forEachChildInUnionOrIntersectionType,
  [SyntaxKind.IntersectionType]: forEachChildInUnionOrIntersectionType,
  [SyntaxKind.ConditionalType]: function forEachChildInConditionalType<T>(
    node: ts.ConditionalTypeNode,
    cbNode: (node: ts.Node) => T | undefined,
    _cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return (
      visitNode(cbNode, node.checkType) ||
      visitNode(cbNode, node.extendsType) ||
      visitNode(cbNode, node.trueType) ||
      visitNode(cbNode, node.falseType)
    );
  },
  [SyntaxKind.InferType]: function forEachChildInInferType<T>(
    node: ts.InferTypeNode,
    cbNode: (node: ts.Node) => T | undefined,
    _cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return visitNode(cbNode, node.typeParameter);
  },
  [SyntaxKind.ImportType]: function forEachChildInImportType<T>(
    node: ts.ImportTypeNode,
    cbNode: (node: ts.Node) => T | undefined,
    cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return (
      visitNode(cbNode, node.argument) ||
      visitNode(cbNode, node.assertions) ||
      visitNode(cbNode, node.qualifier) ||
      visitNodes(cbNode, cbNodes, node.typeArguments)
    );
  },
  [SyntaxKind.ImportTypeAssertionContainer]:
    function forEachChildInImportTypeAssertionContainer<T>(
      node: ts.ImportTypeAssertionContainer,
      cbNode: (node: ts.Node) => T | undefined,
      _cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
    ): T | undefined {
      return visitNode(cbNode, node.assertClause);
    },
  [SyntaxKind.ParenthesizedType]: forEachChildInParenthesizedTypeOrTypeOperator,
  [SyntaxKind.TypeOperator]: function forEachChildInTypeOperator<T>(
    node: ts.TypeOperatorNode,
    cbNode: (node: ts.Node) => T | undefined,
    _cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    // Add the visit to the `operator` of this `TypeOperator`
    return (
      /* operator */ visitNode(cbNode, node.getChildAt(0)) ||
      visitNode(cbNode, node.type)
    );
  },
  [SyntaxKind.IndexedAccessType]: function forEachChildInIndexedAccessType<T>(
    node: ts.IndexedAccessTypeNode,
    cbNode: (node: ts.Node) => T | undefined,
    _cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return (
      visitNode(cbNode, node.objectType) || visitNode(cbNode, node.indexType)
    );
  },
  [SyntaxKind.MappedType]: function forEachChildInMappedType<T>(
    node: ts.MappedTypeNode,
    cbNode: (node: ts.Node) => T | undefined,
    cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return (
      visitNode(cbNode, node.readonlyToken) ||
      visitNode(cbNode, node.typeParameter) ||
      visitNode(cbNode, node.nameType) ||
      visitNode(cbNode, node.questionToken) ||
      visitNode(cbNode, node.type) ||
      visitNodes(cbNode, cbNodes, node.members)
    );
  },
  [SyntaxKind.LiteralType]: function forEachChildInLiteralType<T>(
    node: ts.LiteralTypeNode,
    cbNode: (node: ts.Node) => T | undefined,
    _cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return visitNode(cbNode, node.literal);
  },
  [SyntaxKind.NamedTupleMember]: function forEachChildInNamedTupleMember<T>(
    node: ts.NamedTupleMember,
    cbNode: (node: ts.Node) => T | undefined,
    _cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return (
      visitNode(cbNode, node.dotDotDotToken) ||
      visitNode(cbNode, node.name) ||
      visitNode(cbNode, node.questionToken) ||
      visitNode(cbNode, node.type)
    );
  },
  [SyntaxKind.ObjectBindingPattern]: forEachChildInObjectOrArrayBindingPattern,
  [SyntaxKind.ArrayBindingPattern]: forEachChildInObjectOrArrayBindingPattern,
  [SyntaxKind.ArrayLiteralExpression]:
    function forEachChildInArrayLiteralExpression<T>(
      node: ts.ArrayLiteralExpression,
      cbNode: (node: ts.Node) => T | undefined,
      cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
    ): T | undefined {
      return visitNodes(cbNode, cbNodes, node.elements);
    },
  [SyntaxKind.ObjectLiteralExpression]:
    function forEachChildInObjectLiteralExpression<T>(
      node: ts.ObjectLiteralExpression,
      cbNode: (node: ts.Node) => T | undefined,
      cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
    ): T | undefined {
      return visitNodes(cbNode, cbNodes, node.properties);
    },
  [SyntaxKind.PropertyAccessExpression]:
    function forEachChildInPropertyAccessExpression<T>(
      node: ts.PropertyAccessExpression,
      cbNode: (node: ts.Node) => T | undefined,
      _cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
    ): T | undefined {
      return (
        visitNode(cbNode, node.expression) ||
        visitNode(cbNode, node.questionDotToken) ||
        visitNode(cbNode, node.name)
      );
    },
  [SyntaxKind.ElementAccessExpression]:
    function forEachChildInElementAccessExpression<T>(
      node: ts.ElementAccessExpression,
      cbNode: (node: ts.Node) => T | undefined,
      _cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
    ): T | undefined {
      return (
        visitNode(cbNode, node.expression) ||
        visitNode(cbNode, node.questionDotToken) ||
        visitNode(cbNode, node.argumentExpression)
      );
    },
  [SyntaxKind.CallExpression]: forEachChildInCallOrNewExpression,
  [SyntaxKind.NewExpression]: forEachChildInCallOrNewExpression,
  [SyntaxKind.TaggedTemplateExpression]:
    function forEachChildInTaggedTemplateExpression<T>(
      node: ts.TaggedTemplateExpression,
      cbNode: (node: ts.Node) => T | undefined,
      cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
    ): T | undefined {
      return (
        visitNode(cbNode, node.tag) ||
        // Remove the visit to the `questionDotToken` of this `TaggedTemplateExpression`
        // visitNode(cbNode, node.questionDotToken) ||
        visitNodes(cbNode, cbNodes, node.typeArguments) ||
        visitNode(cbNode, node.template)
      );
    },
  [SyntaxKind.TypeAssertionExpression]:
    function forEachChildInTypeAssertionExpression<T>(
      node: ts.TypeAssertion,
      cbNode: (node: ts.Node) => T | undefined,
      _cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
    ): T | undefined {
      return visitNode(cbNode, node.type) || visitNode(cbNode, node.expression);
    },
  [SyntaxKind.ParenthesizedExpression]:
    function forEachChildInParenthesizedExpression<T>(
      node: ts.ParenthesizedExpression,
      cbNode: (node: ts.Node) => T | undefined,
      _cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
    ): T | undefined {
      return visitNode(cbNode, node.expression);
    },
  [SyntaxKind.DeleteExpression]: function forEachChildInDeleteExpression<T>(
    node: ts.DeleteExpression,
    cbNode: (node: ts.Node) => T | undefined,
    _cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return visitNode(cbNode, node.expression);
  },
  [SyntaxKind.TypeOfExpression]: function forEachChildInTypeOfExpression<T>(
    node: ts.TypeOfExpression,
    cbNode: (node: ts.Node) => T | undefined,
    _cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return visitNode(cbNode, node.expression);
  },
  [SyntaxKind.VoidExpression]: function forEachChildInVoidExpression<T>(
    node: ts.VoidExpression,
    cbNode: (node: ts.Node) => T | undefined,
    _cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return visitNode(cbNode, node.expression);
  },
  [SyntaxKind.PrefixUnaryExpression]:
    function forEachChildInPrefixUnaryExpression<T>(
      node: ts.PrefixUnaryExpression,
      cbNode: (node: ts.Node) => T | undefined,
      _cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
    ): T | undefined {
      // Add the visit to the `operator` of this `PrefixUnaryExpression`
      return (
        /* operator */ visitNode(cbNode, node.getChildAt(0)) ||
        visitNode(cbNode, node.operand)
      );
    },
  [SyntaxKind.YieldExpression]: function forEachChildInYieldExpression<T>(
    node: ts.YieldExpression,
    cbNode: (node: ts.Node) => T | undefined,
    _cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return (
      visitNode(cbNode, node.asteriskToken) ||
      visitNode(cbNode, node.expression)
    );
  },
  [SyntaxKind.AwaitExpression]: function forEachChildInAwaitExpression<T>(
    node: ts.AwaitExpression,
    cbNode: (node: ts.Node) => T | undefined,
    _cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return visitNode(cbNode, node.expression);
  },
  [SyntaxKind.PostfixUnaryExpression]:
    function forEachChildInPostfixUnaryExpression<T>(
      node: ts.PostfixUnaryExpression,
      cbNode: (node: ts.Node) => T | undefined,
      _cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
    ): T | undefined {
      // Add the visit to the `operator` of this `PostfixUnaryExpression`
      return (
        visitNode(cbNode, node.operand) ||
        /* operator */ visitNode(cbNode, node.getChildAt(1))
      );
    },
  [SyntaxKind.BinaryExpression]: function forEachChildInBinaryExpression<T>(
    node: ts.BinaryExpression,
    cbNode: (node: ts.Node) => T | undefined,
    _cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return (
      visitNode(cbNode, node.left) ||
      visitNode(cbNode, node.operatorToken) ||
      visitNode(cbNode, node.right)
    );
  },
  [SyntaxKind.AsExpression]: function forEachChildInAsExpression<T>(
    node: ts.AsExpression,
    cbNode: (node: ts.Node) => T | undefined,
    _cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return visitNode(cbNode, node.expression) || visitNode(cbNode, node.type);
  },
  [SyntaxKind.NonNullExpression]: function forEachChildInNonNullExpression<T>(
    node: ts.NonNullExpression,
    cbNode: (node: ts.Node) => T | undefined,
    _cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return visitNode(cbNode, node.expression);
  },
  [SyntaxKind.SatisfiesExpression]: function forEachChildInSatisfiesExpression<
    T,
  >(
    node: ts.SatisfiesExpression,
    cbNode: (node: ts.Node) => T | undefined,
    _cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return visitNode(cbNode, node.expression) || visitNode(cbNode, node.type);
  },
  [SyntaxKind.MetaProperty]: function forEachChildInMetaProperty<T>(
    node: ts.MetaProperty,
    cbNode: (node: ts.Node) => T | undefined,
    _cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    // Add the visit to the `keyword` of this `MetaProperty`, which may be a `NewKeyword` or `ImportKeyword`.
    return (
      /* keyword */ visitNode(cbNode, node.getChildAt(0)) ||
      visitNode(cbNode, node.name)
    );
  },
  [SyntaxKind.ConditionalExpression]:
    function forEachChildInConditionalExpression<T>(
      node: ts.ConditionalExpression,
      cbNode: (node: ts.Node) => T | undefined,
      _cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
    ): T | undefined {
      return (
        visitNode(cbNode, node.condition) ||
        visitNode(cbNode, node.questionToken) ||
        visitNode(cbNode, node.whenTrue) ||
        visitNode(cbNode, node.colonToken) ||
        visitNode(cbNode, node.whenFalse)
      );
    },
  [SyntaxKind.SpreadElement]: function forEachChildInSpreadElement<T>(
    node: ts.SpreadElement,
    cbNode: (node: ts.Node) => T | undefined,
    _cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return visitNode(cbNode, node.expression);
  },
  [SyntaxKind.Block]: forEachChildInBlock,
  [SyntaxKind.ModuleBlock]: forEachChildInBlock,
  [SyntaxKind.SourceFile]: function forEachChildInSourceFile<T>(
    node: ts.SourceFile,
    cbNode: (node: ts.Node) => T | undefined,
    cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return (
      visitNodes(cbNode, cbNodes, node.statements) ||
      visitNode(cbNode, node.endOfFileToken)
    );
  },
  [SyntaxKind.VariableStatement]: function forEachChildInVariableStatement<T>(
    node: ts.VariableStatement,
    cbNode: (node: ts.Node) => T | undefined,
    cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return (
      visitNodes(cbNode, cbNodes, node.modifiers) ||
      visitNode(cbNode, node.declarationList)
    );
  },
  [SyntaxKind.VariableDeclarationList]:
    function forEachChildInVariableDeclarationList<T>(
      node: ts.VariableDeclarationList,
      cbNode: (node: ts.Node) => T | undefined,
      cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
    ): T | undefined {
      return visitNodes(cbNode, cbNodes, node.declarations);
    },
  [SyntaxKind.ExpressionStatement]: function forEachChildInExpressionStatement<
    T,
  >(
    node: ts.ExpressionStatement,
    cbNode: (node: ts.Node) => T | undefined,
    _cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return visitNode(cbNode, node.expression);
  },
  [SyntaxKind.IfStatement]: function forEachChildInIfStatement<T>(
    node: ts.IfStatement,
    cbNode: (node: ts.Node) => T | undefined,
    _cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return (
      visitNode(cbNode, node.expression) ||
      visitNode(cbNode, node.thenStatement) ||
      visitNode(cbNode, node.elseStatement)
    );
  },
  [SyntaxKind.DoStatement]: function forEachChildInDoStatement<T>(
    node: ts.DoStatement,
    cbNode: (node: ts.Node) => T | undefined,
    _cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return (
      visitNode(cbNode, node.statement) || visitNode(cbNode, node.expression)
    );
  },
  [SyntaxKind.WhileStatement]: function forEachChildInWhileStatement<T>(
    node: ts.WhileStatement,
    cbNode: (node: ts.Node) => T | undefined,
    _cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return (
      visitNode(cbNode, node.expression) || visitNode(cbNode, node.statement)
    );
  },
  [SyntaxKind.ForStatement]: function forEachChildInForStatement<T>(
    node: ts.ForStatement,
    cbNode: (node: ts.Node) => T | undefined,
    _cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return (
      visitNode(cbNode, node.initializer) ||
      visitNode(cbNode, node.condition) ||
      visitNode(cbNode, node.incrementor) ||
      visitNode(cbNode, node.statement)
    );
  },
  [SyntaxKind.ForInStatement]: function forEachChildInForInStatement<T>(
    node: ts.ForInStatement,
    cbNode: (node: ts.Node) => T | undefined,
    _cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return (
      visitNode(cbNode, node.initializer) ||
      visitNode(cbNode, node.expression) ||
      visitNode(cbNode, node.statement)
    );
  },
  [SyntaxKind.ForOfStatement]: function forEachChildInForOfStatement<T>(
    node: ts.ForOfStatement,
    cbNode: (node: ts.Node) => T | undefined,
    _cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return (
      visitNode(cbNode, node.awaitModifier) ||
      visitNode(cbNode, node.initializer) ||
      visitNode(cbNode, node.expression) ||
      visitNode(cbNode, node.statement)
    );
  },
  [SyntaxKind.ContinueStatement]: forEachChildInContinueOrBreakStatement,
  [SyntaxKind.BreakStatement]: forEachChildInContinueOrBreakStatement,
  [SyntaxKind.ReturnStatement]: function forEachChildInReturnStatement<T>(
    node: ts.ReturnStatement,
    cbNode: (node: ts.Node) => T | undefined,
    _cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return visitNode(cbNode, node.expression);
  },
  [SyntaxKind.WithStatement]: function forEachChildInWithStatement<T>(
    node: ts.WithStatement,
    cbNode: (node: ts.Node) => T | undefined,
    _cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return (
      visitNode(cbNode, node.expression) || visitNode(cbNode, node.statement)
    );
  },
  [SyntaxKind.SwitchStatement]: function forEachChildInSwitchStatement<T>(
    node: ts.SwitchStatement,
    cbNode: (node: ts.Node) => T | undefined,
    _cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return (
      visitNode(cbNode, node.expression) || visitNode(cbNode, node.caseBlock)
    );
  },
  [SyntaxKind.CaseBlock]: function forEachChildInCaseBlock<T>(
    node: ts.CaseBlock,
    cbNode: (node: ts.Node) => T | undefined,
    cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return visitNodes(cbNode, cbNodes, node.clauses);
  },
  [SyntaxKind.CaseClause]: function forEachChildInCaseClause<T>(
    node: ts.CaseClause,
    cbNode: (node: ts.Node) => T | undefined,
    cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return (
      visitNode(cbNode, node.expression) ||
      visitNodes(cbNode, cbNodes, node.statements)
    );
  },
  [SyntaxKind.DefaultClause]: function forEachChildInDefaultClause<T>(
    node: ts.DefaultClause,
    cbNode: (node: ts.Node) => T | undefined,
    cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return visitNodes(cbNode, cbNodes, node.statements);
  },
  [SyntaxKind.LabeledStatement]: function forEachChildInLabeledStatement<T>(
    node: ts.LabeledStatement,
    cbNode: (node: ts.Node) => T | undefined,
    _cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return visitNode(cbNode, node.label) || visitNode(cbNode, node.statement);
  },
  [SyntaxKind.ThrowStatement]: function forEachChildInThrowStatement<T>(
    node: ts.ThrowStatement,
    cbNode: (node: ts.Node) => T | undefined,
    _cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return visitNode(cbNode, node.expression);
  },
  [SyntaxKind.TryStatement]: function forEachChildInTryStatement<T>(
    node: ts.TryStatement,
    cbNode: (node: ts.Node) => T | undefined,
    _cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return (
      visitNode(cbNode, node.tryBlock) ||
      visitNode(cbNode, node.catchClause) ||
      visitNode(cbNode, node.finallyBlock)
    );
  },
  [SyntaxKind.CatchClause]: function forEachChildInCatchClause<T>(
    node: ts.CatchClause,
    cbNode: (node: ts.Node) => T | undefined,
    _cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return (
      visitNode(cbNode, node.variableDeclaration) ||
      visitNode(cbNode, node.block)
    );
  },
  [SyntaxKind.Decorator]: function forEachChildInDecorator<T>(
    node: ts.Decorator,
    cbNode: (node: ts.Node) => T | undefined,
    _cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return visitNode(cbNode, node.expression);
  },
  [SyntaxKind.ClassDeclaration]: forEachChildInClassDeclarationOrExpression,
  [SyntaxKind.ClassExpression]: forEachChildInClassDeclarationOrExpression,
  [SyntaxKind.StructDeclaration]: forEachChildInClassDeclarationOrExpression,
  [SyntaxKind.InterfaceDeclaration]:
    function forEachChildInInterfaceDeclaration<T>(
      node: ts.InterfaceDeclaration,
      cbNode: (node: ts.Node) => T | undefined,
      cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
    ): T | undefined {
      return (
        visitNodes(cbNode, cbNodes, node.modifiers) ||
        visitNode(cbNode, node.name) ||
        visitNodes(cbNode, cbNodes, node.typeParameters) ||
        visitNodes(cbNode, cbNodes, node.heritageClauses) ||
        visitNodes(cbNode, cbNodes, node.members)
      );
    },
  [SyntaxKind.TypeAliasDeclaration]:
    function forEachChildInTypeAliasDeclaration<T>(
      node: ts.TypeAliasDeclaration,
      cbNode: (node: ts.Node) => T | undefined,
      cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
    ): T | undefined {
      return (
        visitNodes(cbNode, cbNodes, node.modifiers) ||
        visitNode(cbNode, node.name) ||
        visitNodes(cbNode, cbNodes, node.typeParameters) ||
        visitNode(cbNode, node.type)
      );
    },
  [SyntaxKind.EnumDeclaration]: function forEachChildInEnumDeclaration<T>(
    node: ts.EnumDeclaration,
    cbNode: (node: ts.Node) => T | undefined,
    cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return (
      visitNodes(cbNode, cbNodes, node.modifiers) ||
      visitNode(cbNode, node.name) ||
      visitNodes(cbNode, cbNodes, node.members)
    );
  },
  [SyntaxKind.EnumMember]: function forEachChildInEnumMember<T>(
    node: ts.EnumMember,
    cbNode: (node: ts.Node) => T | undefined,
    _cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return visitNode(cbNode, node.name) || visitNode(cbNode, node.initializer);
  },
  [SyntaxKind.ModuleDeclaration]: function forEachChildInModuleDeclaration<T>(
    node: ts.ModuleDeclaration,
    cbNode: (node: ts.Node) => T | undefined,
    cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return (
      visitNodes(cbNode, cbNodes, node.modifiers) ||
      visitNode(cbNode, node.name) ||
      visitNode(cbNode, node.body)
    );
  },
  [SyntaxKind.ImportEqualsDeclaration]:
    function forEachChildInImportEqualsDeclaration<T>(
      node: ts.ImportEqualsDeclaration,
      cbNode: (node: ts.Node) => T | undefined,
      cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
    ): T | undefined {
      return (
        visitNodes(cbNode, cbNodes, node.modifiers) ||
        visitNode(cbNode, node.name) ||
        visitNode(cbNode, node.moduleReference)
      );
    },
  [SyntaxKind.ImportDeclaration]: function forEachChildInImportDeclaration<T>(
    node: ts.ImportDeclaration,
    cbNode: (node: ts.Node) => T | undefined,
    cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return (
      visitNodes(cbNode, cbNodes, node.modifiers) ||
      visitNode(cbNode, node.importClause) ||
      visitNode(cbNode, node.moduleSpecifier) ||
      visitNode(cbNode, node.assertClause)
    );
  },
  [SyntaxKind.ImportClause]: function forEachChildInImportClause<T>(
    node: ts.ImportClause,
    cbNode: (node: ts.Node) => T | undefined,
    _cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return (
      visitNode(cbNode, node.name) || visitNode(cbNode, node.namedBindings)
    );
  },
  [SyntaxKind.AssertClause]: function forEachChildInAssertClause<T>(
    node: ts.AssertClause,
    cbNode: (node: ts.Node) => T | undefined,
    cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return visitNodes(cbNode, cbNodes, node.elements);
  },
  [SyntaxKind.AssertEntry]: function forEachChildInAssertEntry<T>(
    node: ts.AssertEntry,
    cbNode: (node: ts.Node) => T | undefined,
    _cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return visitNode(cbNode, node.name) || visitNode(cbNode, node.value);
  },
  [SyntaxKind.NamespaceExportDeclaration]:
    function forEachChildInNamespaceExportDeclaration<T>(
      node: ts.NamespaceExportDeclaration,
      cbNode: (node: ts.Node) => T | undefined,
      cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
    ): T | undefined {
      return visitNode(cbNode, node.name);
    },
  [SyntaxKind.NamespaceImport]: function forEachChildInNamespaceImport<T>(
    node: ts.NamespaceImport,
    cbNode: (node: ts.Node) => T | undefined,
    _cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return visitNode(cbNode, node.name);
  },
  [SyntaxKind.NamespaceExport]: function forEachChildInNamespaceExport<T>(
    node: ts.NamespaceExport,
    cbNode: (node: ts.Node) => T | undefined,
    _cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return visitNode(cbNode, node.name);
  },
  [SyntaxKind.NamedImports]: forEachChildInNamedImportsOrExports,
  [SyntaxKind.NamedExports]: forEachChildInNamedImportsOrExports,
  [SyntaxKind.ExportDeclaration]: function forEachChildInExportDeclaration<T>(
    node: ts.ExportDeclaration,
    cbNode: (node: ts.Node) => T | undefined,
    cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return (
      visitNodes(cbNode, cbNodes, node.modifiers) ||
      visitNode(cbNode, node.exportClause) ||
      visitNode(cbNode, node.moduleSpecifier) ||
      visitNode(cbNode, node.assertClause)
    );
  },
  [SyntaxKind.ImportSpecifier]: forEachChildInImportOrExportSpecifier,
  [SyntaxKind.ExportSpecifier]: forEachChildInImportOrExportSpecifier,
  [SyntaxKind.ExportAssignment]: function forEachChildInExportAssignment<T>(
    node: ts.ExportAssignment,
    cbNode: (node: ts.Node) => T | undefined,
    cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return (
      visitNodes(cbNode, cbNodes, node.modifiers) ||
      visitNode(cbNode, node.expression)
    );
  },
  [SyntaxKind.TemplateExpression]: function forEachChildInTemplateExpression<T>(
    node: ts.TemplateExpression,
    cbNode: (node: ts.Node) => T | undefined,
    cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return (
      visitNode(cbNode, node.head) ||
      visitNodes(cbNode, cbNodes, node.templateSpans)
    );
  },
  [SyntaxKind.TemplateSpan]: function forEachChildInTemplateSpan<T>(
    node: ts.TemplateSpan,
    cbNode: (node: ts.Node) => T | undefined,
    _cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return (
      visitNode(cbNode, node.expression) || visitNode(cbNode, node.literal)
    );
  },
  [SyntaxKind.TemplateLiteralType]: function forEachChildInTemplateLiteralType<
    T,
  >(
    node: ts.TemplateLiteralTypeNode,
    cbNode: (node: ts.Node) => T | undefined,
    cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return (
      visitNode(cbNode, node.head) ||
      visitNodes(cbNode, cbNodes, node.templateSpans)
    );
  },
  [SyntaxKind.TemplateLiteralTypeSpan]:
    function forEachChildInTemplateLiteralTypeSpan<T>(
      node: ts.TemplateLiteralTypeSpan,
      cbNode: (node: ts.Node) => T | undefined,
      _cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
    ): T | undefined {
      return visitNode(cbNode, node.type) || visitNode(cbNode, node.literal);
    },
  [SyntaxKind.ComputedPropertyName]:
    function forEachChildInComputedPropertyName<T>(
      node: ts.ComputedPropertyName,
      cbNode: (node: ts.Node) => T | undefined,
      _cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
    ): T | undefined {
      return visitNode(cbNode, node.expression);
    },
  [SyntaxKind.HeritageClause]: function forEachChildInHeritageClause<T>(
    node: ts.HeritageClause,
    cbNode: (node: ts.Node) => T | undefined,
    cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return (
      /* token */ visitNode(cbNode, node.getChildAt(0)) ||
      visitNodes(cbNode, cbNodes, node.types)
    );
  },
  [SyntaxKind.ExpressionWithTypeArguments]:
    function forEachChildInExpressionWithTypeArguments<T>(
      node: ts.ExpressionWithTypeArguments,
      cbNode: (node: ts.Node) => T | undefined,
      cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
    ): T | undefined {
      return (
        visitNode(cbNode, node.expression) ||
        visitNodes(cbNode, cbNodes, node.typeArguments)
      );
    },
  [SyntaxKind.ExternalModuleReference]:
    function forEachChildInExternalModuleReference<T>(
      node: ts.ExternalModuleReference,
      cbNode: (node: ts.Node) => T | undefined,
      _cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
    ): T | undefined {
      return visitNode(cbNode, node.expression);
    },
  [SyntaxKind.MissingDeclaration]: function forEachChildInMissingDeclaration<T>(
    node: ts.MissingDeclaration,
    cbNode: (node: ts.Node) => T | undefined,
    cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return visitNodes(cbNode, cbNodes, node.modifiers);
  },
  [SyntaxKind.CommaListExpression]: function forEachChildInCommaListExpression<
    T,
  >(
    node: ts.CommaListExpression,
    cbNode: (node: ts.Node) => T | undefined,
    cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return visitNodes(cbNode, cbNodes, node.elements);
  },
  [SyntaxKind.JsxElement]: function forEachChildInJsxElement<T>(
    node: ts.JsxElement,
    cbNode: (node: ts.Node) => T | undefined,
    cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return (
      visitNode(cbNode, node.openingElement) ||
      visitNodes(cbNode, cbNodes, node.children) ||
      visitNode(cbNode, node.closingElement)
    );
  },
  [SyntaxKind.JsxFragment]: function forEachChildInJsxFragment<T>(
    node: ts.JsxFragment,
    cbNode: (node: ts.Node) => T | undefined,
    cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return (
      visitNode(cbNode, node.openingFragment) ||
      visitNodes(cbNode, cbNodes, node.children) ||
      visitNode(cbNode, node.closingFragment)
    );
  },
  [SyntaxKind.JsxSelfClosingElement]:
    forEachChildInJsxOpeningOrSelfClosingElement,
  [SyntaxKind.JsxOpeningElement]: forEachChildInJsxOpeningOrSelfClosingElement,
  [SyntaxKind.JsxAttributes]: function forEachChildInJsxAttributes<T>(
    node: ts.JsxAttributes,
    cbNode: (node: ts.Node) => T | undefined,
    cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return visitNodes(cbNode, cbNodes, node.properties);
  },
  [SyntaxKind.JsxAttribute]: function forEachChildInJsxAttribute<T>(
    node: ts.JsxAttribute,
    cbNode: (node: ts.Node) => T | undefined,
    _cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return visitNode(cbNode, node.name) || visitNode(cbNode, node.initializer);
  },
  [SyntaxKind.JsxSpreadAttribute]: function forEachChildInJsxSpreadAttribute<T>(
    node: ts.JsxSpreadAttribute,
    cbNode: (node: ts.Node) => T | undefined,
    _cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return visitNode(cbNode, node.expression);
  },
  [SyntaxKind.JsxExpression]: function forEachChildInJsxExpression<T>(
    node: ts.JsxExpression,
    cbNode: (node: ts.Node) => T | undefined,
    _cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return (
      visitNode(cbNode, node.dotDotDotToken) ||
      visitNode(cbNode, node.expression)
    );
  },
  [SyntaxKind.JsxClosingElement]: function forEachChildInJsxClosingElement<T>(
    node: ts.JsxClosingElement,
    cbNode: (node: ts.Node) => T | undefined,
    _cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return visitNode(cbNode, node.tagName);
  },
  [SyntaxKind.OptionalType]: forEachChildInOptionalRestOrJSDocParameterModifier,
  [SyntaxKind.RestType]: forEachChildInOptionalRestOrJSDocParameterModifier,
  [SyntaxKind.JSDocTypeExpression]:
    forEachChildInOptionalRestOrJSDocParameterModifier,
  [SyntaxKind.JSDocNonNullableType]:
    forEachChildInOptionalRestOrJSDocParameterModifier,
  [SyntaxKind.JSDocNullableType]:
    forEachChildInOptionalRestOrJSDocParameterModifier,
  [SyntaxKind.JSDocOptionalType]:
    forEachChildInOptionalRestOrJSDocParameterModifier,
  [SyntaxKind.JSDocVariadicType]:
    forEachChildInOptionalRestOrJSDocParameterModifier,
  [SyntaxKind.JSDocFunctionType]: function forEachChildInJSDocFunctionType<T>(
    node: ts.JSDocFunctionType,
    cbNode: (node: ts.Node) => T | undefined,
    cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return (
      visitNodes(cbNode, cbNodes, node.parameters) ||
      visitNode(cbNode, node.type)
    );
  },
  [SyntaxKind.JSDoc]: function forEachChildInJSDoc<T>(
    node: ts.JSDoc,
    cbNode: (node: ts.Node) => T | undefined,
    cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return (
      (typeof node.comment === "string"
        ? undefined
        : visitNodes(cbNode, cbNodes, node.comment)) ||
      visitNodes(cbNode, cbNodes, node.tags)
    );
  },
  [SyntaxKind.JSDocSeeTag]: function forEachChildInJSDocSeeTag<T>(
    node: ts.JSDocSeeTag,
    cbNode: (node: ts.Node) => T | undefined,
    cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return (
      visitNode(cbNode, node.tagName) ||
      visitNode(cbNode, node.name) ||
      (typeof node.comment === "string"
        ? undefined
        : visitNodes(cbNode, cbNodes, node.comment))
    );
  },
  [SyntaxKind.JSDocNameReference]: function forEachChildInJSDocNameReference<T>(
    node: ts.JSDocNameReference,
    cbNode: (node: ts.Node) => T | undefined,
    _cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return visitNode(cbNode, node.name);
  },
  [SyntaxKind.JSDocMemberName]: function forEachChildInJSDocMemberName<T>(
    node: ts.JSDocMemberName,
    cbNode: (node: ts.Node) => T | undefined,
    _cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return visitNode(cbNode, node.left) || visitNode(cbNode, node.right);
  },
  [SyntaxKind.JSDocParameterTag]: forEachChildInJSDocParameterOrPropertyTag,
  [SyntaxKind.JSDocPropertyTag]: forEachChildInJSDocParameterOrPropertyTag,
  [SyntaxKind.JSDocAuthorTag]: function forEachChildInJSDocAuthorTag<T>(
    node: ts.JSDocAuthorTag,
    cbNode: (node: ts.Node) => T | undefined,
    cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return (
      visitNode(cbNode, node.tagName) ||
      (typeof node.comment === "string"
        ? undefined
        : visitNodes(cbNode, cbNodes, node.comment))
    );
  },
  [SyntaxKind.JSDocImplementsTag]: function forEachChildInJSDocImplementsTag<T>(
    node: ts.JSDocImplementsTag,
    cbNode: (node: ts.Node) => T | undefined,
    cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return (
      visitNode(cbNode, node.tagName) ||
      visitNode(cbNode, node.class) ||
      (typeof node.comment === "string"
        ? undefined
        : visitNodes(cbNode, cbNodes, node.comment))
    );
  },
  [SyntaxKind.JSDocAugmentsTag]: function forEachChildInJSDocAugmentsTag<T>(
    node: ts.JSDocAugmentsTag,
    cbNode: (node: ts.Node) => T | undefined,
    cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return (
      visitNode(cbNode, node.tagName) ||
      visitNode(cbNode, node.class) ||
      (typeof node.comment === "string"
        ? undefined
        : visitNodes(cbNode, cbNodes, node.comment))
    );
  },
  [SyntaxKind.JSDocTemplateTag]: function forEachChildInJSDocTemplateTag<T>(
    node: ts.JSDocTemplateTag,
    cbNode: (node: ts.Node) => T | undefined,
    cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return (
      visitNode(cbNode, node.tagName) ||
      visitNode(cbNode, node.constraint) ||
      visitNodes(cbNode, cbNodes, node.typeParameters) ||
      (typeof node.comment === "string"
        ? undefined
        : visitNodes(cbNode, cbNodes, node.comment))
    );
  },
  [SyntaxKind.JSDocTypedefTag]: function forEachChildInJSDocTypedefTag<T>(
    node: ts.JSDocTypedefTag,
    cbNode: (node: ts.Node) => T | undefined,
    cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return (
      visitNode(cbNode, node.tagName) ||
      (node.typeExpression &&
      node.typeExpression.kind === SyntaxKind.JSDocTypeExpression
        ? visitNode(cbNode, node.typeExpression) ||
          visitNode(cbNode, node.fullName) ||
          (typeof node.comment === "string"
            ? undefined
            : visitNodes(cbNode, cbNodes, node.comment))
        : visitNode(cbNode, node.fullName) ||
          visitNode(cbNode, node.typeExpression) ||
          (typeof node.comment === "string"
            ? undefined
            : visitNodes(cbNode, cbNodes, node.comment)))
    );
  },
  [SyntaxKind.JSDocCallbackTag]: function forEachChildInJSDocCallbackTag<T>(
    node: ts.JSDocCallbackTag,
    cbNode: (node: ts.Node) => T | undefined,
    cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return (
      visitNode(cbNode, node.tagName) ||
      visitNode(cbNode, node.fullName) ||
      visitNode(cbNode, node.typeExpression) ||
      (typeof node.comment === "string"
        ? undefined
        : visitNodes(cbNode, cbNodes, node.comment))
    );
  },
  [SyntaxKind.JSDocReturnTag]: forEachChildInJSDocReturnTag,
  [SyntaxKind.JSDocTypeTag]: forEachChildInJSDocReturnTag,
  [SyntaxKind.JSDocThisTag]: forEachChildInJSDocReturnTag,
  [SyntaxKind.JSDocEnumTag]: forEachChildInJSDocReturnTag,
  [SyntaxKind.JSDocSignature]: function forEachChildInJSDocSignature<T>(
    node: ts.JSDocSignature,
    cbNode: (node: ts.Node) => T | undefined,
    _cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return (
      forEach(node.typeParameters, cbNode) ||
      forEach(node.parameters, cbNode) ||
      visitNode(cbNode, node.type)
    );
  },
  [SyntaxKind.JSDocLink]: forEachChildInJSDocLinkCodeOrPlain,
  [SyntaxKind.JSDocLinkCode]: forEachChildInJSDocLinkCodeOrPlain,
  [SyntaxKind.JSDocLinkPlain]: forEachChildInJSDocLinkCodeOrPlain,
  [SyntaxKind.JSDocTypeLiteral]: function forEachChildInJSDocTypeLiteral<T>(
    node: ts.JSDocTypeLiteral,
    cbNode: (node: ts.Node) => T | undefined,
    _cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
  ): T | undefined {
    return forEach(node.jsDocPropertyTags, cbNode);
  },
  [SyntaxKind.JSDocTag]: forEachChildInJSDocTag,
  [SyntaxKind.JSDocClassTag]: forEachChildInJSDocTag,
  [SyntaxKind.JSDocPublicTag]: forEachChildInJSDocTag,
  [SyntaxKind.JSDocPrivateTag]: forEachChildInJSDocTag,
  [SyntaxKind.JSDocProtectedTag]: forEachChildInJSDocTag,
  [SyntaxKind.JSDocReadonlyTag]: forEachChildInJSDocTag,
  [SyntaxKind.JSDocDeprecatedTag]: forEachChildInJSDocTag,
  [SyntaxKind.JSDocOverrideTag]: forEachChildInJSDocTag,
  [SyntaxKind.PartiallyEmittedExpression]:
    forEachChildInPartiallyEmittedExpression,
};

/**
 * Invokes a callback for each child of the given node. The 'cbNode' callback is invoked for all child nodes
 * stored in properties. If a 'cbNodes' callback is specified, it is invoked for embedded arrays; otherwise,
 * embedded arrays are flattened and the 'cbNode' callback is invoked for each element. If a callback returns
 * a truthy value, iteration stops and that value is returned. Otherwise, undefined is returned.
 *
 * @param node a given node to visit its children
 * @param cbNode a callback to be invoked for all child nodes
 * @param cbNodes a callback to be invoked for embedded array
 *
 * @remarks `forEachChild` must visit the children of a node in the order
 * that they appear in the source code. The language service depends on this property to locate nodes by position.
 */
export function forEachChild<T>(
  node: ts.Node,
  cbNode: (node: ts.Node) => T | undefined,
  cbNodes?: (nodes: ts.NodeArray<ts.Node>) => T | undefined,
): T | undefined {
  if (node === undefined || node.kind <= ts.SyntaxKind.LastToken) {
    return;
  }
  const fn = (
    forEachChildTable as Record<SyntaxKind, ForEachChildFunction<any>>
  )[node.kind];
  return fn === undefined ? undefined : fn(node, cbNode, cbNodes);
}

/**
 * Traverse all child nodes on the AST and call the callback
 *
 * @param ast Typescript AST
 * @param callback The callback function executed during traversal. If `childFirst` is false (the parent node is traversed first), and callback returns false, then the child nodes of the current node will no longer be traversed
 * @param childFirst Determine whether to traverse child nodes first, the default is true.
 */
export function forEachNode(
  ast: ts.Node,
  callback: (node: ts.Node) => void | boolean,
  childFirst = false,
) {
  function visit(node: ts.Node) {
    if (isInvalidNode(node)) {
      return false;
    }

    let returnValue = undefined;
    if (!childFirst) {
      returnValue = callback(node);
    }
    if (returnValue !== false) {
      forEachChild(node, visit);
    }
    if (childFirst) {
      callback(node);
    }
  }

  visit(ast);
}

/**
 * 调用 TypeScript 内部函数 GoToDefinition.getDefinitionAtPosition，根据位置获取定义
 *
 * 参考: https://github.com/microsoft/TypeScript/blob/v4.5.5/src/services/goToDefinition.ts#L3
 *
 * @param program
 * @param sourceFile
 * @param position
 * @returns DefinitionInfo 数组
 */
export function getDefinitionAtPosition(
  program: ts.Program,
  sourceFile: ts.SourceFile,
  position: number,
): readonly ts.DefinitionInfo[] | undefined {
  try {
    return (ts as any).GoToDefinition.getDefinitionAtPosition(
      program,
      sourceFile,
      position,
    );
  } catch (err) {
    const filePath = sourceFile.fileName;
    const message = `message: ${err}\nfile: ${filePath}\noffset: ${position}`;

    console.log("Get definition failed:\n%s", message);
  }
}

/**
 * TypeScript 内部函数 getTouchingPropertyName
 *
 * Gets the token whose text has range [start, end) and
 * position >= start and (position < end or (position === end && token is literal or keyword or identifier))
 *
 * 参考: https://github.com/microsoft/TypeScript/blob/v4.5.5/src/services/utilities.ts#L1107
 *
 * @param sourceFile
 * @param position
 * @returns 该位置对应的 node
 */
export function getTouchingPropertyName(
  sourceFile: ts.SourceFile,
  position: number,
): ts.Node {
  return (ts as any).getTouchingPropertyName(sourceFile, position);
}

/**
 * Get the invoked expression of a CallLikeExpression.
 *
 * @param node
 * @returns the invoked expression
 */
export function getInvokedExpression(
  node: ts.CallLikeExpression,
): ts.Expression {
  switch (node.kind) {
    case ts.SyntaxKind.TaggedTemplateExpression:
      return node.tag;
    case ts.SyntaxKind.JsxOpeningElement:
    case ts.SyntaxKind.JsxSelfClosingElement:
      return node.tagName;
    default:
      return node.expression;
  }
}

export type NamedExpression =
  | (ts.ClassExpression & { name: ts.Identifier })
  | (ts.FunctionExpression & { name: ts.Identifier });

/**
 * 判断一个节点是否是 NamedDeclaration
 * @param node
 * @returns 该 node 是否为 NamedDeclaration
 */
export function isNamedDeclaration(
  node: ts.Node,
): node is ts.NamedDeclaration & { name: ts.DeclarationName } {
  return !!(node as ts.NamedDeclaration).name; // A 'name' property should always be a DeclarationName.
}

/**
 * Indicates whether a node is named function or class expression.
 *
 * @param node
 * @returns whether a node is NamedExpression
 */
export function isNamedExpression(node: ts.Node): node is NamedExpression {
  return (
    (ts.isFunctionExpression(node) || ts.isClassExpression(node)) &&
    isNamedDeclaration(node)
  );
}

export type ConstNamedExpression =
  | (ts.ClassExpression & {
      name: undefined;
      parent: ts.VariableDeclaration & { name: ts.Identifier };
    })
  | (ts.FunctionExpression & {
      name: undefined;
      parent: ts.VariableDeclaration & { name: ts.Identifier };
    })
  | (ts.ArrowFunction & {
      name: undefined;
      parent: ts.VariableDeclaration & { name: ts.Identifier };
    });

export type CallHierarchyDeclaration =
  | ts.SourceFile
  | (ts.ModuleDeclaration & { name: ts.Identifier })
  | ts.FunctionDeclaration
  | ts.ClassDeclaration
  | ts.ClassStaticBlockDeclaration
  | ts.MethodDeclaration
  | ts.GetAccessorDeclaration
  | ts.SetAccessorDeclaration
  | NamedExpression
  | ConstNamedExpression;

export type Callee =
  | ts.FunctionDeclaration
  | ts.ClassDeclaration
  | ts.MethodDeclaration
  | ts.GetAccessorDeclaration
  | ts.SetAccessorDeclaration
  | NamedExpression
  | ConstNamedExpression;

/**
 * TypeScript 内部函数 CallHierarchy.resolveCallHierarchyDeclaration
 *
 * Resolves the call hierarchy declaration for a node.
 *
 * 参考: https://github.com/microsoft/TypeScript/blob/v4.5.5/src/services/callHierarchy.ts#L225
 */
export function resolveCallHierarchyDeclaration(
  program: ts.Program,
  location: ts.Node,
): CallHierarchyDeclaration | CallHierarchyDeclaration[] | undefined {
  return (ts as any).CallHierarchy.resolveCallHierarchyDeclaration(
    program,
    location,
  );
}

type MayInvokeExpression = ts.CallLikeExpression | ts.AccessExpression;

/**
 * 判断一个节点是否为 AccessExpression
 *
 * @param node
 * @returns 该 node 是否是 AccessExpression
 */
export function isAccessExpression(node: ts.Node): node is ts.AccessExpression {
  return (
    node?.kind === ts.SyntaxKind.PropertyAccessExpression ||
    node?.kind === ts.SyntaxKind.ElementAccessExpression
  );
}

/**
 * 判断一个节点是否是“可能调用了函数”的表达式，可以是 CallLikeExpression 或 AccessExpression。其中：
 * CallLikeExpression: 一定会调用一个函数
 * AccessExpression: 有可能调用一个 GetAccessor 或 SetAccessor
 *
 * @param node
 * @returns 该 node 是否为 MayInvokeExpression
 */
export function isMayInvokeExpression(
  node: ts.Node,
): node is MayInvokeExpression {
  return ts.isCallLikeExpression(node) || isAccessExpression(node);
}

/**
 * 判断一个值是否为数组.
 */
export function isArray(value: any): value is readonly any[] {
  return Array.isArray ? Array.isArray(value) : value instanceof Array;
}

/**
 * 根据可能的调用表达式获取被调用的函数
 *
 * @param program
 * @param node
 * @returns 被调用的函数，如果没有则返回 undefined
 */
export function getCallee(
  program: ts.Program,
  node: MayInvokeExpression,
): Callee | undefined {
  const target = ts.isCallLikeExpression(node)
    ? getInvokedExpression(node)
    : node;

  // 调用 TypeScript 内部 API resolveCallHierarchyDeclaration 函数，resolve 出被调用的函数
  const declaration = resolveCallHierarchyDeclaration(program, target);
  // 如果 declaration 是数组，说明没有 resolve 出实现，只有声明，这里认为没有 resolve 出 callee
  return isArray(declaration) ? undefined : (declaration as Callee | undefined);
}

/**
 * Get relative path by project path.
 * If there is no project path, the relative path is the basename of file path.
 *
 * @param filePath file absolute path
 * @param projectPath project path
 * @returns relative path
 */
export function getRelativePath(
  filePath: string,
  projectPath?: string | undefined,
): string {
  return projectPath
    ? filePath.startsWith(projectPath + path.sep)
      ? path.relative(projectPath, filePath)
      : filePath
    : path.basename(filePath);
}

/**
 * Store all the referenced files
 */
export const referencedCorefFileMap: Map<bigint, coref.File> = new Map();
/**
 * Ensure the sourceFile has $file property, which is the COREF File object.
 *
 * @param sourceFile
 * @param projectPath
 * @returns the COREF file object
 */
export function ensureCorefFile(
  sourceFile: extendedTs.SourceFile,
  projectPath?: string | undefined,
): coref.File {
  if (!sourceFile.$corefFile) {
    const relativePath = getRelativePath(sourceFile.fileName, projectPath);
    sourceFile.$corefFile = coref.createFile(relativePath);
  }

  referencedCorefFileMap.set(sourceFile.$corefFile.id, sourceFile.$corefFile);
  return sourceFile.$corefFile;
}

/**
 * Create COREF `Location` based on typescript node (including the `SourceFile` node).
 *
 * @param node Typescript node
 * @returns the COREF Location corressponding to the node
 */
export function createNodeLocation(node: ts.Node): coref.Location {
  const sourceFile = node.getSourceFile() as extendedTs.SourceFile;
  const start = node.getStart();
  const end = node.end;
  // const text = tsNode.getText();

  return coref.createLocation(sourceFile, start, end);
}

/**
 * Ensure the extendedTs.Node has the `$corefAstNode` and `$corefLocation` properties, and return them.
 *
 * @param tsNode extendedTs.Node
 * @returns the $corefModel of this node
 */
export function ensureCorefAstNodeAndLocation(tsNode: extendedTs.Node) {
  let astNode = tsNode.$corefAstNode;
  let location = tsNode.$corefLocation;

  if (!tsNode.$corefAstNode) {
    location = createNodeLocation(tsNode);
    astNode =
      tsNode.kind === SyntaxKind.SourceFile
        ? coref.createTopLevel(coref.TopLevelKind.SCRIPT, location.id)
        : coref.createAstNode(tsNode.kind, location.id);

    tsNode.$corefAstNode = astNode;
    tsNode.$corefLocation = location;
  }

  return {
    astNode,
    location,
  };
}

/**
 * Get the symbol of the node.
 *
 * @param node
 * @param typeChecker
 * @returns
 */
export function getSymbol(
  node: ts.Node,
  typeChecker: ts.TypeChecker,
): ts.Symbol | undefined {
  try {
    return (
      (node as extendedTs.Node).symbol ?? typeChecker.getSymbolAtLocation(node)
    );
  } catch {
    // TODO: record error info
    return;
  }
}

/**
 * Get the first value declaration or the first declaration of the symbol,
 * if no value declaration exists.
 *
 * @param symbol
 * @returns
 */
export function getSymbolDeclaration(
  symbol: ts.Symbol,
): ts.Declaration | undefined {
  return symbol.valueDeclaration ?? symbol.declarations?.[0];
}

/**
 * Get symbol description.
 *
 * @param node
 * @param symbol
 * @param typeChecker
 * @returns
 */
export function getSymbolDescription(
  node: ts.Node,
  symbol: ts.Symbol,
  typeChecker: ts.TypeChecker,
) {
  // `getSymbolDisplayPartsDocumentationAndSymbolKind` may throw failed assertions.
  // Return an empty string if `getSymbolDisplayPartsDocumentationAndSymbolKind` throws a failed assertion.
  try {
    const { displayParts } =
      (ts as any).SymbolDisplay.getSymbolDisplayPartsDocumentationAndSymbolKind(
        typeChecker,
        symbol,
        node.getSourceFile(),
        (ts as any).getContainerNode(node),
        node,
      ) ?? {};
    return ts.displayPartsToString(displayParts);
  } catch {
    // TODO: record error info
    return "";
  }
}

export function getCorefIdFromTsNodeInSameFile(node: ts.Node) {
  return ensureCorefAstNodeAndLocation(node as extendedTs.Node).astNode.id;
}

/**
 * Get the COREF AST node id from the ts node.
 *
 * @param node
 * @param projectPath
 * @returns
 */
export function getCorefIdFromTsNode(
  node: ts.Node,
  projectPath?: string | undefined,
) {
  ensureCorefFile(node.getSourceFile() as extendedTs.SourceFile, projectPath);

  return getCorefIdFromTsNodeInSameFile(node);
}

/**
 * Create a COREF Symbol from a typescript Symbol.
 *
 * @param tsSymbol
 * @param projectPath
 * @returns
 */
export function createSymbolFromTsSymbol(
  tsSymbol: ts.Symbol,
  typeChecker: ts.TypeChecker,
  projectPath?: string | undefined,
) {
  const declaration: ts.Declaration | undefined =
    getSymbolDeclaration(tsSymbol);

  // Do not extract the symbol if there is no associated declaration
  if (declaration === undefined) {
    return undefined;
  }

  // Use the id of the first declaration node as the symbol oid
  const id = getCorefIdFromTsNode(declaration, projectPath);
  const description = getSymbolDescription(declaration, tsSymbol, typeChecker);
  return coref.createSymbol(id, tsSymbol, description);
}

/**
 * Create symbol
 *
 * @param tsNode
 * @param projectPath
 * @returns COREF symbol
 */
export function createSymbol(
  tsNode: ts.Node,
  typeChecker: ts.TypeChecker,
  projectPath?: string | undefined,
): coref.Symbol | undefined {
  const tsSymbol = getSymbol(tsNode, typeChecker);
  return (
    tsSymbol && createSymbolFromTsSymbol(tsSymbol, typeChecker, projectPath)
  );
}

/**
 * Get the value symbol oid of the shorthand property assignment.
 *
 * @param tsNode
 * @param typeChecker
 * @param projectPath
 * @returns
 */
export function getShortHandAssignmentValueSymbolId(
  tsNode: ts.Node,
  typeChecker: ts.TypeChecker,
  projectPath?: string | undefined,
): bigint | undefined {
  const tsSymbol = typeChecker.getShorthandAssignmentValueSymbol(tsNode);
  const declaration = tsSymbol && getSymbolDeclaration(tsSymbol);
  return declaration && getCorefIdFromTsNode(declaration, projectPath);
}

/**
 * Get the property node of an access expression.
 *
 * @param accessExpression
 * @returns
 */
export function getAccessExpressionPropertyNode(
  accessExpression: ts.AccessExpression,
): ts.Expression {
  if (ts.isPropertyAccessExpression(accessExpression)) {
    return accessExpression.name;
  } else if (ts.isElementAccessExpression(accessExpression)) {
    // ts.isElementAccessExpression(accessExpression)
    return (accessExpression as ts.ElementAccessExpression).argumentExpression;
  } else {
    throw new Error("Invalid accessExpression");
  }
}

/**
 * Get the property name of a property-access expression or element-access expression.
 *
 * For element-access expressions, This function doesn't resolve the argument expression.
 * It only handle the case that the argument expression is a string literal and return the value of the string.
 * In other cases, it returns undefined.
 *
 * @param accessExpression
 * @param sourceFile
 * @returns
 */
export function getAccessExpressionPropertyName(
  accessExpression: ts.AccessExpression,
): string | undefined {
  const propertyNode = getAccessExpressionPropertyNode(accessExpression);
  if (propertyNode === undefined) {
    return undefined;
  }

  switch (propertyNode.kind) {
    case ts.SyntaxKind.Identifier:
    case ts.SyntaxKind.PrivateIdentifier:
    case ts.SyntaxKind.StringLiteral:
      return (propertyNode as ts.MemberName | ts.StringLiteral).text;
    default:
      return undefined;
  }
}

/**
 * Get names of an access expression.
 * @param node
 * @param sourceFile
 * @returns name array
 */
export function getAccessExpressionNames(node: ts.Node | undefined): string[] {
  if (node === undefined) {
    return [];
  } else if (ts.isIdentifier(node)) {
    return [node.text];
  } else if (isAccessExpression(node)) {
    const name = getAccessExpressionPropertyName(node);
    return name === undefined
      ? []
      : [...getAccessExpressionNames(node.expression), name];
  } else {
    return [];
  }
}

export function getAccessExpressionText(node: ts.Node | undefined): string {
  return getAccessExpressionNames(node).join(".");
}

/**
 * Get the class member by the name.
 *
 * ComputedPropertyName is not handled.
 *
 * @param classLikeDeclaration
 * @param name
 * @returns
 */
export function getClassMemberByName(
  classLikeDeclaration: ts.ClassLikeDeclaration,
  name: string,
): ts.ClassElement | undefined {
  const members = classLikeDeclaration.members;
  for (const member of members) {
    if (!ts.isPropertyDeclaration(member) && !ts.isMethodDeclaration(member)) {
      continue;
    }

    const nameNode = member.name;
    // Do not handle ComputedPropertyName
    if (!ts.isComputedPropertyName(nameNode) && nameNode.text === name) {
      return member;
    }
  }

  return undefined;
}

/**
 * Get the underlying ClassLikeDeclaration of an expression.
 *
 * Only handle the cases that the expression is an Identifier or ClassExpression.
 *
 * @param expression
 * @returns
 */
export function getClassOfExpression(
  expression: ts.Expression,
  typeChecker: ts.TypeChecker,
): ts.ClassLikeDeclaration | undefined {
  let classLikeDeclaration: ts.ClassLikeDeclaration | undefined = undefined;

  if (ts.isIdentifier(expression)) {
    const symbol = getSymbol(expression, typeChecker);
    const declaration = symbol && getSymbolDeclaration(symbol);
    if (declaration?.kind === ts.SyntaxKind.ClassDeclaration) {
      classLikeDeclaration = declaration as ts.ClassDeclaration;
    } else if (declaration?.kind === ts.SyntaxKind.VariableDeclaration) {
      const initializer = (declaration as ts.VariableDeclaration).initializer;
      if (initializer?.kind === ts.SyntaxKind.ClassExpression) {
        classLikeDeclaration = initializer as ts.ClassExpression;
      }
    }
  } else if (ts.isClassExpression(expression)) {
    classLikeDeclaration = expression;
  }

  return classLikeDeclaration;
}

/**
 * Get the underlying FunctionLikeDeclaration of an expression.
 *
 * @param expression
 * @returns
 */
export function getFunctionOfExpression(
  expression: ts.Expression,
  typeChecker: ts.TypeChecker,
): ts.FunctionLikeDeclaration | undefined {
  let functionLikeDeclaration: ts.FunctionLikeDeclaration | undefined =
    undefined;
  if (ts.isIdentifier(expression)) {
    const symbol = getSymbol(expression, typeChecker);
    const declaration = symbol && getSymbolDeclaration(symbol);

    if (declaration?.kind === ts.SyntaxKind.FunctionDeclaration) {
      functionLikeDeclaration = declaration as ts.FunctionDeclaration;
    } else if (declaration?.kind === ts.SyntaxKind.VariableDeclaration) {
      const initializer = (declaration as ts.VariableDeclaration).initializer;
      switch (initializer?.kind) {
        case ts.SyntaxKind.FunctionExpression:
        case ts.SyntaxKind.ArrowFunction: {
          functionLikeDeclaration = initializer as ts.FunctionLikeDeclaration;
        }
      }
    }
  } else if (
    ts.isFunctionExpression(expression) ||
    ts.isArrowFunction(expression)
  ) {
    functionLikeDeclaration = expression;
  }

  return functionLikeDeclaration;
}

export function isExportDefaultDeclaration(
  declaration: ts.FunctionDeclaration | ts.ClassDeclaration,
): boolean {
  const modifiers = declaration.modifiers;
  return (
    modifiers?.[0].kind === ts.SyntaxKind.ExportKeyword &&
    modifiers?.[1].kind === ts.SyntaxKind.DefaultKeyword
  );
}

export function isModuleExportsAssignExpression(expression: ts.Expression) {
  if (!ts.isBinaryExpression(expression)) {
    return false;
  }

  return getAccessExpressionText(expression.left) === "module.exports";
}

export function isFunctionLikeDeclarationKind(kind: SyntaxKind) {
  switch (kind) {
    case SyntaxKind.Constructor:
    case SyntaxKind.MethodDeclaration:
    case SyntaxKind.GetAccessor:
    case SyntaxKind.SetAccessor:
    case SyntaxKind.FunctionExpression:
    case SyntaxKind.ArrowFunction:
    case SyntaxKind.FunctionDeclaration:
      return true;
  }
  return false;
}

export function isClassLikeDeclarationKind(kind: SyntaxKind) {
  switch (kind) {
    case SyntaxKind.ClassDeclaration:
    case SyntaxKind.ClassExpression:
    case SyntaxKind.StructDeclaration:
      return true;
  }
  return false;
}
