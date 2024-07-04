

/* eslint-disable @typescript-eslint/no-explicit-any */

import * as fs from 'fs';
import * as path from 'path';

import ignore from 'ignore';
import * as ts from 'typescript';

import { coref, extendedTs } from '../model';

export function isKeywordSyntaxKind(
  syntaxKind: ts.SyntaxKind,
): syntaxKind is ts.KeywordSyntaxKind {
  return (
    ts.SyntaxKind.FirstKeyword <= syntaxKind &&
    syntaxKind <= ts.SyntaxKind.LastKeyword
  );
}

export function isCommentSyntaxKind(syntaxKind: ts.SyntaxKind): boolean {
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

export function isBrokenNode(node: ts.Node | undefined) {
  return !node || node.getStart() === node.getEnd();
}

export function isExpression(node: ts.Node | coref.Node) {
  return (
    (ts.SyntaxKind.Identifier <= node.kind &&
      node.kind <= ts.SyntaxKind.PrivateIdentifier) ||
    (ts.SyntaxKind.QualifiedName <= node.kind &&
      node.kind <= ts.SyntaxKind.SyntheticExpression)
  );
}

export function isInvokeExpression(node: ts.Node) {
  return (
    node.kind === ts.SyntaxKind.CallExpression ||
    node.kind === ts.SyntaxKind.NewExpression
  );
}

export function isStatement(node: ts.Node | coref.Node) {
  return (
    ts.SyntaxKind.Block <= node.kind &&
    node.kind <= ts.SyntaxKind.MissingDeclaration
  );
}

export function isLiteralLikeNode(node: ts.Node) {
  return (
    (ts.SyntaxKind.FirstLiteralToken <= node.kind &&
      node.kind <= ts.SyntaxKind.LastLiteralToken) ||
    (ts.SyntaxKind.FirstTemplateToken <= node.kind &&
      node.kind <= ts.SyntaxKind.LastTemplateToken)
  );
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

/**
 * 根据源码 string 的位置 index 获取行号
 *
 * @param pos 在源码 string 中的 index
 * @param lineStarts 每行代码开始的 index
 * @returns 行号
 */
function getLineFromPos(pos: number, lineStarts: readonly number[]): number {
  let low = 0,
    high = lineStarts.length - 1;
  while (low < high) {
    const mid = high - ((high - low) >> 1); // Get middle, rounding up.
    const startOfLine = lineStarts[mid];
    if (startOfLine <= pos) {
      low = mid;
    } else {
      high = mid - 1;
    }
  }
  return low;
}

function getColumnFromLinePos(
  line: number,
  pos: number,
  lineStarts: readonly number[],
): number {
  return pos - lineStarts[line];
}

export function getPosition(
  pos: number,
  lineStarts: readonly number[],
): coref.Position {
  const line = getLineFromPos(pos, lineStarts);
  const column = getColumnFromLinePos(line, pos, lineStarts);
  return {
    line: line + 1,
    column: column + 1,
    offset: pos,
  };
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

function isFunctionLikeDeclarationKind(kind: ts.SyntaxKind): boolean {
  switch (kind) {
    case ts.SyntaxKind.FunctionDeclaration:
    case ts.SyntaxKind.MethodDeclaration:
    case ts.SyntaxKind.Constructor:
    case ts.SyntaxKind.GetAccessor:
    case ts.SyntaxKind.SetAccessor:
    case ts.SyntaxKind.FunctionExpression:
    case ts.SyntaxKind.ArrowFunction:
      return true;
    default:
      return false;
  }
}

export function isFunctionLikeDeclaration(
  node: ts.Node,
): node is ts.FunctionLikeDeclaration {
  return node && isFunctionLikeDeclarationKind(node.kind);
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

  const gitignoreContent = fs.readFileSync(gitignorePath, 'utf-8');
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
    const dirDenylist = ['dist'];
    if (dirDenylist.includes(name)) {
      return coref.createIgnoredPath(
        coref.PathKind.DIRECTORY,
        fileOrDirPath,
        coref.IgnoreKind.DIST_DIR,
      );
    }
  } else if (stat.isFile()) {
    if (name.endsWith('.min.js')) {
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
 * typescript 内部方法 visitNode
 *
 * 参考: https://github.com/microsoft/TypeScript/blob/v4.5.5/src/compiler/parser.ts#L38
 */
function visitNode<T>(
  cbNode: (node: ts.Node) => T,
  node: ts.Node | undefined,
): T | undefined {
  if (isBrokenNode(node)) {
    return;
  }
  return node && cbNode(node);
}

/**
 * typescript 内部方法 visitNodes
 *
 * 参考: https://github.com/microsoft/TypeScript/blob/v4.5.5/src/compiler/parser.ts#L42
 */
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

/**
 * typescript 内部方法 forEach
 *
 * Iterates through 'array' by index and performs the callback on each element of array until the callback
 * returns a truthy value, then returns that value.
 * If no such value is found, the callback is applied to each element of array and undefined is returned.
 *
 * 参考: https://github.com/microsoft/TypeScript/blob/v4.5.5/src/compiler/core.ts#L63
 */
function forEach<T, U>(
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

/**
 * 根据 TypeScript 原生的 forEachChild 方法，自定义了需要遍历的 AST 节点
 * 参考: https://github.com/microsoft/TypeScript/blob/v4.5.5/src/compiler/parser.ts#L76
 *
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
  if (!node || node.kind <= ts.SyntaxKind.LastToken) {
    return;
  }
  switch (node.kind) {
    case ts.SyntaxKind.QualifiedName:
      return (
        visitNode(cbNode, (node as ts.QualifiedName).left) ||
        visitNode(cbNode, (node as ts.QualifiedName).right)
      );
    case ts.SyntaxKind.TypeParameter:
      return (
        visitNode(cbNode, (node as ts.TypeParameterDeclaration).name) ||
        visitNode(cbNode, (node as ts.TypeParameterDeclaration).constraint) ||
        visitNode(cbNode, (node as ts.TypeParameterDeclaration).default) ||
        visitNode(cbNode, (node as ts.TypeParameterDeclaration).expression)
      );
    case ts.SyntaxKind.ShorthandPropertyAssignment:
      return (
        visitNodes(cbNode, cbNodes, node.decorators) ||
        visitNodes(cbNode, cbNodes, node.modifiers) ||
        visitNode(cbNode, (node as ts.ShorthandPropertyAssignment).name) ||
        visitNode(
          cbNode,
          (node as ts.ShorthandPropertyAssignment).questionToken,
        ) ||
        visitNode(
          cbNode,
          (node as ts.ShorthandPropertyAssignment).exclamationToken,
        ) ||
        visitNode(
          cbNode,
          (node as ts.ShorthandPropertyAssignment).equalsToken,
        ) ||
        visitNode(
          cbNode,
          (node as ts.ShorthandPropertyAssignment).objectAssignmentInitializer,
        )
      );
    case ts.SyntaxKind.SpreadAssignment:
      return visitNode(cbNode, (node as ts.SpreadAssignment).expression);
    case ts.SyntaxKind.Parameter:
      return (
        visitNodes(cbNode, cbNodes, node.decorators) ||
        visitNodes(cbNode, cbNodes, node.modifiers) ||
        visitNode(cbNode, (node as ts.ParameterDeclaration).dotDotDotToken) ||
        visitNode(cbNode, (node as ts.ParameterDeclaration).name) ||
        visitNode(cbNode, (node as ts.ParameterDeclaration).questionToken) ||
        visitNode(cbNode, (node as ts.ParameterDeclaration).type) ||
        visitNode(cbNode, (node as ts.ParameterDeclaration).initializer)
      );
    case ts.SyntaxKind.PropertyDeclaration:
      return (
        visitNodes(cbNode, cbNodes, node.decorators) ||
        visitNodes(cbNode, cbNodes, node.modifiers) ||
        visitNode(cbNode, (node as ts.PropertyDeclaration).name) ||
        visitNode(cbNode, (node as ts.PropertyDeclaration).questionToken) ||
        visitNode(cbNode, (node as ts.PropertyDeclaration).exclamationToken) ||
        visitNode(cbNode, (node as ts.PropertyDeclaration).type) ||
        visitNode(cbNode, (node as ts.PropertyDeclaration).initializer)
      );
    case ts.SyntaxKind.PropertySignature:
      return (
        visitNodes(cbNode, cbNodes, node.decorators) ||
        visitNodes(cbNode, cbNodes, node.modifiers) ||
        visitNode(cbNode, (node as ts.PropertySignature).name) ||
        visitNode(cbNode, (node as ts.PropertySignature).questionToken) ||
        visitNode(cbNode, (node as ts.PropertySignature).type) ||
        visitNode(cbNode, (node as ts.PropertySignature).initializer)
      );
    case ts.SyntaxKind.PropertyAssignment:
      return (
        visitNodes(cbNode, cbNodes, node.decorators) ||
        visitNodes(cbNode, cbNodes, node.modifiers) ||
        visitNode(cbNode, (node as ts.PropertyAssignment).name) ||
        visitNode(cbNode, (node as ts.PropertyAssignment).questionToken) ||
        visitNode(cbNode, (node as ts.PropertyAssignment).initializer)
      );
    case ts.SyntaxKind.VariableDeclaration:
      return (
        visitNodes(cbNode, cbNodes, node.decorators) ||
        visitNodes(cbNode, cbNodes, node.modifiers) ||
        visitNode(cbNode, (node as ts.VariableDeclaration).name) ||
        visitNode(cbNode, (node as ts.VariableDeclaration).exclamationToken) ||
        visitNode(cbNode, (node as ts.VariableDeclaration).type) ||
        visitNode(cbNode, (node as ts.VariableDeclaration).initializer)
      );
    case ts.SyntaxKind.BindingElement:
      return (
        visitNodes(cbNode, cbNodes, node.decorators) ||
        visitNodes(cbNode, cbNodes, node.modifiers) ||
        visitNode(cbNode, (node as ts.BindingElement).dotDotDotToken) ||
        visitNode(cbNode, (node as ts.BindingElement).propertyName) ||
        visitNode(cbNode, (node as ts.BindingElement).name) ||
        visitNode(cbNode, (node as ts.BindingElement).initializer)
      );
    case ts.SyntaxKind.FunctionType:
    case ts.SyntaxKind.ConstructorType:
    case ts.SyntaxKind.CallSignature:
    case ts.SyntaxKind.ConstructSignature:
    case ts.SyntaxKind.IndexSignature:
      return (
        visitNodes(cbNode, cbNodes, node.decorators) ||
        visitNodes(cbNode, cbNodes, node.modifiers) ||
        visitNodes(
          cbNode,
          cbNodes,
          (node as ts.SignatureDeclaration).typeParameters,
        ) ||
        visitNodes(
          cbNode,
          cbNodes,
          (node as ts.SignatureDeclaration).parameters,
        ) ||
        visitNode(cbNode, (node as ts.SignatureDeclaration).type)
      );
    case ts.SyntaxKind.MethodDeclaration:
    case ts.SyntaxKind.MethodSignature:
    case ts.SyntaxKind.Constructor:
    case ts.SyntaxKind.GetAccessor:
    case ts.SyntaxKind.SetAccessor:
    case ts.SyntaxKind.FunctionExpression:
    case ts.SyntaxKind.FunctionDeclaration:
    case ts.SyntaxKind.ArrowFunction:
      return (
        visitNodes(cbNode, cbNodes, node.decorators) ||
        visitNodes(cbNode, cbNodes, node.modifiers) ||
        visitNode(cbNode, (node as ts.FunctionLikeDeclaration).asteriskToken) ||
        visitNode(cbNode, (node as ts.FunctionLikeDeclaration).name) ||
        visitNode(cbNode, (node as ts.FunctionLikeDeclaration).questionToken) ||
        visitNode(
          cbNode,
          (node as ts.FunctionLikeDeclaration).exclamationToken,
        ) ||
        visitNodes(
          cbNode,
          cbNodes,
          (node as ts.FunctionLikeDeclaration).typeParameters,
        ) ||
        visitNodes(
          cbNode,
          cbNodes,
          (node as ts.FunctionLikeDeclaration).parameters,
        ) ||
        visitNode(cbNode, (node as ts.FunctionLikeDeclaration).type) ||
        // No need to traverse equalsGreaterThanToken
        // visitNode(cbNode, (node as ts.ArrowFunction).equalsGreaterThanToken) ||
        visitNode(cbNode, (node as ts.FunctionLikeDeclaration).body)
      );
    case ts.SyntaxKind.ClassStaticBlockDeclaration:
      return (
        visitNodes(cbNode, cbNodes, node.decorators) ||
        visitNodes(cbNode, cbNodes, node.modifiers) ||
        visitNode(cbNode, (node as ts.ClassStaticBlockDeclaration).body)
      );
    case ts.SyntaxKind.TypeReference:
      return (
        visitNode(cbNode, (node as ts.TypeReferenceNode).typeName) ||
        visitNodes(
          cbNode,
          cbNodes,
          (node as ts.TypeReferenceNode).typeArguments,
        )
      );
    case ts.SyntaxKind.TypePredicate:
      return (
        visitNode(cbNode, (node as ts.TypePredicateNode).assertsModifier) ||
        visitNode(cbNode, (node as ts.TypePredicateNode).parameterName) ||
        visitNode(cbNode, (node as ts.TypePredicateNode).type)
      );
    case ts.SyntaxKind.TypeQuery:
      return visitNode(cbNode, (node as ts.TypeQueryNode).exprName);
    case ts.SyntaxKind.TypeLiteral:
      return visitNodes(cbNode, cbNodes, (node as ts.TypeLiteralNode).members);
    case ts.SyntaxKind.ArrayType:
      return visitNode(cbNode, (node as ts.ArrayTypeNode).elementType);
    case ts.SyntaxKind.TupleType:
      return visitNodes(cbNode, cbNodes, (node as ts.TupleTypeNode).elements);
    case ts.SyntaxKind.UnionType:
    case ts.SyntaxKind.IntersectionType:
      return visitNodes(
        cbNode,
        cbNodes,
        (node as ts.UnionOrIntersectionTypeNode).types,
      );
    case ts.SyntaxKind.ConditionalType:
      return (
        visitNode(cbNode, (node as ts.ConditionalTypeNode).checkType) ||
        visitNode(cbNode, (node as ts.ConditionalTypeNode).extendsType) ||
        visitNode(cbNode, (node as ts.ConditionalTypeNode).trueType) ||
        visitNode(cbNode, (node as ts.ConditionalTypeNode).falseType)
      );
    case ts.SyntaxKind.InferType:
      return visitNode(cbNode, (node as ts.InferTypeNode).typeParameter);
    case ts.SyntaxKind.ImportType:
      return (
        visitNode(cbNode, (node as ts.ImportTypeNode).argument) ||
        visitNode(cbNode, (node as ts.ImportTypeNode).qualifier) ||
        visitNodes(cbNode, cbNodes, (node as ts.ImportTypeNode).typeArguments)
      );
    case ts.SyntaxKind.ParenthesizedType:
      return visitNode(cbNode, (node as ts.ParenthesizedTypeNode).type);
    case ts.SyntaxKind.TypeOperator:
      // 增加了对 operator 的遍历
      return forEach(node.getChildren(), cbNode);
    case ts.SyntaxKind.IndexedAccessType:
      return (
        visitNode(cbNode, (node as ts.IndexedAccessTypeNode).objectType) ||
        visitNode(cbNode, (node as ts.IndexedAccessTypeNode).indexType)
      );
    case ts.SyntaxKind.MappedType:
      return (
        visitNode(cbNode, (node as ts.MappedTypeNode).readonlyToken) ||
        visitNode(cbNode, (node as ts.MappedTypeNode).typeParameter) ||
        visitNode(cbNode, (node as ts.MappedTypeNode).nameType) ||
        visitNode(cbNode, (node as ts.MappedTypeNode).questionToken) ||
        visitNode(cbNode, (node as ts.MappedTypeNode).type) ||
        visitNodes(cbNode, cbNodes, (node as ts.MappedTypeNode).members)
      );
    case ts.SyntaxKind.LiteralType:
      return visitNode(cbNode, (node as ts.LiteralTypeNode).literal);
    case ts.SyntaxKind.NamedTupleMember:
      return (
        visitNode(cbNode, (node as ts.NamedTupleMember).dotDotDotToken) ||
        visitNode(cbNode, (node as ts.NamedTupleMember).name) ||
        visitNode(cbNode, (node as ts.NamedTupleMember).questionToken) ||
        visitNode(cbNode, (node as ts.NamedTupleMember).type)
      );
    case ts.SyntaxKind.ObjectBindingPattern:
    case ts.SyntaxKind.ArrayBindingPattern:
      return visitNodes(cbNode, cbNodes, (node as ts.BindingPattern).elements);
    case ts.SyntaxKind.ArrayLiteralExpression:
      return visitNodes(
        cbNode,
        cbNodes,
        (node as ts.ArrayLiteralExpression).elements,
      );
    case ts.SyntaxKind.ObjectLiteralExpression:
      return visitNodes(
        cbNode,
        cbNodes,
        (node as ts.ObjectLiteralExpression).properties,
      );
    case ts.SyntaxKind.PropertyAccessExpression:
      return (
        visitNode(cbNode, (node as ts.PropertyAccessExpression).expression) ||
        visitNode(
          cbNode,
          (node as ts.PropertyAccessExpression).questionDotToken,
        ) ||
        visitNode(cbNode, (node as ts.PropertyAccessExpression).name)
      );
    case ts.SyntaxKind.ElementAccessExpression:
      return (
        visitNode(cbNode, (node as ts.ElementAccessExpression).expression) ||
        visitNode(
          cbNode,
          (node as ts.ElementAccessExpression).questionDotToken,
        ) ||
        visitNode(
          cbNode,
          (node as ts.ElementAccessExpression).argumentExpression,
        )
      );
    case ts.SyntaxKind.CallExpression:
    case ts.SyntaxKind.NewExpression:
      return (
        visitNode(cbNode, (node as ts.CallExpression).expression) ||
        visitNode(cbNode, (node as ts.CallExpression).questionDotToken) ||
        visitNodes(
          cbNode,
          cbNodes,
          (node as ts.CallExpression).typeArguments,
        ) ||
        visitNodes(cbNode, cbNodes, (node as ts.CallExpression).arguments)
      );
    case ts.SyntaxKind.TaggedTemplateExpression:
      return (
        visitNode(cbNode, (node as ts.TaggedTemplateExpression).tag) ||
        // visitNode(cbNode, (node as ts.TaggedTemplateExpression).questionDotToken) ||
        // 此处不需要遍历 questionDotToken, questionDotToken 是 TaggedTemplateExpression 内部属性，而且也是不合法的语法
        visitNodes(
          cbNode,
          cbNodes,
          (node as ts.TaggedTemplateExpression).typeArguments,
        ) ||
        visitNode(cbNode, (node as ts.TaggedTemplateExpression).template)
      );
    case ts.SyntaxKind.TypeAssertionExpression:
      return (
        visitNode(cbNode, (node as ts.TypeAssertion).type) ||
        visitNode(cbNode, (node as ts.TypeAssertion).expression)
      );
    case ts.SyntaxKind.ParenthesizedExpression:
      return visitNode(cbNode, (node as ts.ParenthesizedExpression).expression);
    case ts.SyntaxKind.DeleteExpression:
      return visitNode(cbNode, (node as ts.DeleteExpression).expression);
    case ts.SyntaxKind.TypeOfExpression:
      return visitNode(cbNode, (node as ts.TypeOfExpression).expression);
    case ts.SyntaxKind.VoidExpression:
      return visitNode(cbNode, (node as ts.VoidExpression).expression);
    case ts.SyntaxKind.PrefixUnaryExpression:
      // 除了原本对 operand 的遍历，增加了对 operator 的遍历
      return forEach(node.getChildren(), cbNode);
    case ts.SyntaxKind.YieldExpression:
      return (
        visitNode(cbNode, (node as ts.YieldExpression).asteriskToken) ||
        visitNode(cbNode, (node as ts.YieldExpression).expression)
      );
    case ts.SyntaxKind.AwaitExpression:
      return visitNode(cbNode, (node as ts.AwaitExpression).expression);
    case ts.SyntaxKind.PostfixUnaryExpression:
      // 除了原本对 operand 的遍历，增加了对 operator 的遍历
      return forEach(node.getChildren(), cbNode);
    case ts.SyntaxKind.BinaryExpression:
      return (
        visitNode(cbNode, (node as ts.BinaryExpression).left) ||
        visitNode(cbNode, (node as ts.BinaryExpression).operatorToken) ||
        visitNode(cbNode, (node as ts.BinaryExpression).right)
      );
    case ts.SyntaxKind.AsExpression:
      return (
        visitNode(cbNode, (node as ts.AsExpression).expression) ||
        visitNode(cbNode, (node as ts.AsExpression).type)
      );
    case ts.SyntaxKind.NonNullExpression:
      return visitNode(cbNode, (node as ts.NonNullExpression).expression);
    case ts.SyntaxKind.MetaProperty:
      return (
        // 增加了对第 0 个子节点 keyword 的遍历，可能是 NewKeyword 或 ImportKeyword
        visitNode(cbNode, (node as ts.MetaProperty).getChildAt(0)) ||
        visitNode(cbNode, (node as ts.MetaProperty).name)
      );
    case ts.SyntaxKind.ConditionalExpression:
      return (
        visitNode(cbNode, (node as ts.ConditionalExpression).condition) ||
        visitNode(cbNode, (node as ts.ConditionalExpression).questionToken) ||
        visitNode(cbNode, (node as ts.ConditionalExpression).whenTrue) ||
        visitNode(cbNode, (node as ts.ConditionalExpression).colonToken) ||
        visitNode(cbNode, (node as ts.ConditionalExpression).whenFalse)
      );
    case ts.SyntaxKind.SpreadElement:
      return visitNode(cbNode, (node as ts.SpreadElement).expression);
    case ts.SyntaxKind.Block:
    case ts.SyntaxKind.ModuleBlock:
      return visitNodes(cbNode, cbNodes, (node as ts.Block).statements);
    case ts.SyntaxKind.SourceFile:
      return (
        visitNodes(cbNode, cbNodes, (node as ts.SourceFile).statements) ||
        visitNode(cbNode, (node as ts.SourceFile).endOfFileToken)
      );
    case ts.SyntaxKind.VariableStatement:
      return (
        visitNodes(cbNode, cbNodes, node.decorators) ||
        visitNodes(cbNode, cbNodes, node.modifiers) ||
        visitNode(cbNode, (node as ts.VariableStatement).declarationList)
      );
    case ts.SyntaxKind.VariableDeclarationList:
      return visitNodes(
        cbNode,
        cbNodes,
        (node as ts.VariableDeclarationList).declarations,
      );
    case ts.SyntaxKind.ExpressionStatement:
      return visitNode(cbNode, (node as ts.ExpressionStatement).expression);
    case ts.SyntaxKind.IfStatement:
      return (
        visitNode(cbNode, (node as ts.IfStatement).expression) ||
        visitNode(cbNode, (node as ts.IfStatement).thenStatement) ||
        visitNode(cbNode, (node as ts.IfStatement).elseStatement)
      );
    case ts.SyntaxKind.DoStatement:
      return (
        visitNode(cbNode, (node as ts.DoStatement).statement) ||
        visitNode(cbNode, (node as ts.DoStatement).expression)
      );
    case ts.SyntaxKind.WhileStatement:
      return (
        visitNode(cbNode, (node as ts.WhileStatement).expression) ||
        visitNode(cbNode, (node as ts.WhileStatement).statement)
      );
    case ts.SyntaxKind.ForStatement:
      return (
        visitNode(cbNode, (node as ts.ForStatement).initializer) ||
        visitNode(cbNode, (node as ts.ForStatement).condition) ||
        visitNode(cbNode, (node as ts.ForStatement).incrementor) ||
        visitNode(cbNode, (node as ts.ForStatement).statement)
      );
    case ts.SyntaxKind.ForInStatement:
      return (
        visitNode(cbNode, (node as ts.ForInStatement).initializer) ||
        visitNode(cbNode, (node as ts.ForInStatement).expression) ||
        visitNode(cbNode, (node as ts.ForInStatement).statement)
      );
    case ts.SyntaxKind.ForOfStatement:
      return (
        visitNode(cbNode, (node as ts.ForOfStatement).awaitModifier) ||
        visitNode(cbNode, (node as ts.ForOfStatement).initializer) ||
        visitNode(cbNode, (node as ts.ForOfStatement).expression) ||
        visitNode(cbNode, (node as ts.ForOfStatement).statement)
      );
    case ts.SyntaxKind.ContinueStatement:
    case ts.SyntaxKind.BreakStatement:
      return visitNode(cbNode, (node as ts.BreakOrContinueStatement).label);
    case ts.SyntaxKind.ReturnStatement:
      return visitNode(cbNode, (node as ts.ReturnStatement).expression);
    case ts.SyntaxKind.WithStatement:
      return (
        visitNode(cbNode, (node as ts.WithStatement).expression) ||
        visitNode(cbNode, (node as ts.WithStatement).statement)
      );
    case ts.SyntaxKind.SwitchStatement:
      return (
        visitNode(cbNode, (node as ts.SwitchStatement).expression) ||
        visitNode(cbNode, (node as ts.SwitchStatement).caseBlock)
      );
    case ts.SyntaxKind.CaseBlock:
      return visitNodes(cbNode, cbNodes, (node as ts.CaseBlock).clauses);
    case ts.SyntaxKind.CaseClause:
      return (
        visitNode(cbNode, (node as ts.CaseClause).expression) ||
        visitNodes(cbNode, cbNodes, (node as ts.CaseClause).statements)
      );
    case ts.SyntaxKind.DefaultClause:
      return visitNodes(cbNode, cbNodes, (node as ts.DefaultClause).statements);
    case ts.SyntaxKind.LabeledStatement:
      return (
        visitNode(cbNode, (node as ts.LabeledStatement).label) ||
        visitNode(cbNode, (node as ts.LabeledStatement).statement)
      );
    case ts.SyntaxKind.ThrowStatement:
      return visitNode(cbNode, (node as ts.ThrowStatement).expression);
    case ts.SyntaxKind.TryStatement:
      return (
        visitNode(cbNode, (node as ts.TryStatement).tryBlock) ||
        visitNode(cbNode, (node as ts.TryStatement).catchClause) ||
        visitNode(cbNode, (node as ts.TryStatement).finallyBlock)
      );
    case ts.SyntaxKind.CatchClause:
      return (
        visitNode(cbNode, (node as ts.CatchClause).variableDeclaration) ||
        visitNode(cbNode, (node as ts.CatchClause).block)
      );
    case ts.SyntaxKind.Decorator:
      return visitNode(cbNode, (node as ts.Decorator).expression);
    case ts.SyntaxKind.ClassDeclaration:
    case ts.SyntaxKind.ClassExpression:
      return (
        visitNodes(cbNode, cbNodes, node.decorators) ||
        visitNodes(cbNode, cbNodes, node.modifiers) ||
        visitNode(cbNode, (node as ts.ClassLikeDeclaration).name) ||
        visitNodes(
          cbNode,
          cbNodes,
          (node as ts.ClassLikeDeclaration).typeParameters,
        ) ||
        visitNodes(
          cbNode,
          cbNodes,
          (node as ts.ClassLikeDeclaration).heritageClauses,
        ) ||
        visitNodes(cbNode, cbNodes, (node as ts.ClassLikeDeclaration).members)
      );
    case ts.SyntaxKind.InterfaceDeclaration:
      return (
        visitNodes(cbNode, cbNodes, node.decorators) ||
        visitNodes(cbNode, cbNodes, node.modifiers) ||
        visitNode(cbNode, (node as ts.InterfaceDeclaration).name) ||
        visitNodes(
          cbNode,
          cbNodes,
          (node as ts.InterfaceDeclaration).typeParameters,
        ) ||
        visitNodes(
          cbNode,
          cbNodes,
          (node as ts.ClassDeclaration).heritageClauses,
        ) ||
        visitNodes(cbNode, cbNodes, (node as ts.InterfaceDeclaration).members)
      );
    case ts.SyntaxKind.TypeAliasDeclaration:
      return (
        visitNodes(cbNode, cbNodes, node.decorators) ||
        visitNodes(cbNode, cbNodes, node.modifiers) ||
        visitNode(cbNode, (node as ts.TypeAliasDeclaration).name) ||
        visitNodes(
          cbNode,
          cbNodes,
          (node as ts.TypeAliasDeclaration).typeParameters,
        ) ||
        visitNode(cbNode, (node as ts.TypeAliasDeclaration).type)
      );
    case ts.SyntaxKind.EnumDeclaration:
      return (
        visitNodes(cbNode, cbNodes, node.decorators) ||
        visitNodes(cbNode, cbNodes, node.modifiers) ||
        visitNode(cbNode, (node as ts.EnumDeclaration).name) ||
        visitNodes(cbNode, cbNodes, (node as ts.EnumDeclaration).members)
      );
    case ts.SyntaxKind.EnumMember:
      return (
        visitNode(cbNode, (node as ts.EnumMember).name) ||
        visitNode(cbNode, (node as ts.EnumMember).initializer)
      );
    case ts.SyntaxKind.ModuleDeclaration:
      return (
        visitNodes(cbNode, cbNodes, node.decorators) ||
        visitNodes(cbNode, cbNodes, node.modifiers) ||
        visitNode(cbNode, (node as ts.ModuleDeclaration).name) ||
        visitNode(cbNode, (node as ts.ModuleDeclaration).body)
      );
    case ts.SyntaxKind.ImportEqualsDeclaration:
      return (
        visitNodes(cbNode, cbNodes, node.decorators) ||
        visitNodes(cbNode, cbNodes, node.modifiers) ||
        visitNode(cbNode, (node as ts.ImportEqualsDeclaration).name) ||
        visitNode(cbNode, (node as ts.ImportEqualsDeclaration).moduleReference)
      );
    case ts.SyntaxKind.ImportDeclaration:
      return (
        visitNodes(cbNode, cbNodes, node.decorators) ||
        visitNodes(cbNode, cbNodes, node.modifiers) ||
        visitNode(cbNode, (node as ts.ImportDeclaration).importClause) ||
        visitNode(cbNode, (node as ts.ImportDeclaration).moduleSpecifier) ||
        visitNode(cbNode, (node as ts.ImportDeclaration).assertClause)
      );
    case ts.SyntaxKind.ImportClause:
      return (
        visitNode(cbNode, (node as ts.ImportClause).name) ||
        visitNode(cbNode, (node as ts.ImportClause).namedBindings)
      );
    case ts.SyntaxKind.AssertClause:
      return visitNodes(cbNode, cbNodes, (node as ts.AssertClause).elements);
    case ts.SyntaxKind.AssertEntry:
      return (
        visitNode(cbNode, (node as ts.AssertEntry).name) ||
        visitNode(cbNode, (node as ts.AssertEntry).value)
      );
    case ts.SyntaxKind.NamespaceExportDeclaration:
      return visitNode(cbNode, (node as ts.NamespaceExportDeclaration).name);
    case ts.SyntaxKind.NamespaceImport:
      return visitNode(cbNode, (node as ts.NamespaceImport).name);
    case ts.SyntaxKind.NamespaceExport:
      return visitNode(cbNode, (node as ts.NamespaceExport).name);
    case ts.SyntaxKind.NamedImports:
    case ts.SyntaxKind.NamedExports:
      return visitNodes(
        cbNode,
        cbNodes,
        (node as ts.NamedImportsOrExports).elements,
      );
    case ts.SyntaxKind.ExportDeclaration:
      return (
        visitNodes(cbNode, cbNodes, node.decorators) ||
        visitNodes(cbNode, cbNodes, node.modifiers) ||
        visitNode(cbNode, (node as ts.ExportDeclaration).exportClause) ||
        visitNode(cbNode, (node as ts.ExportDeclaration).moduleSpecifier) ||
        visitNode(cbNode, (node as ts.ExportDeclaration).assertClause)
      );
    case ts.SyntaxKind.ImportSpecifier:
    case ts.SyntaxKind.ExportSpecifier:
      return (
        visitNode(cbNode, (node as ts.ImportOrExportSpecifier).propertyName) ||
        visitNode(cbNode, (node as ts.ImportOrExportSpecifier).name)
      );
    case ts.SyntaxKind.ExportAssignment:
      return (
        visitNodes(cbNode, cbNodes, node.decorators) ||
        visitNodes(cbNode, cbNodes, node.modifiers) ||
        visitNode(cbNode, (node as ts.ExportAssignment).expression)
      );
    case ts.SyntaxKind.TemplateExpression:
      return (
        visitNode(cbNode, (node as ts.TemplateExpression).head) ||
        visitNodes(
          cbNode,
          cbNodes,
          (node as ts.TemplateExpression).templateSpans,
        )
      );
    case ts.SyntaxKind.TemplateSpan:
      return (
        visitNode(cbNode, (node as ts.TemplateSpan).expression) ||
        visitNode(cbNode, (node as ts.TemplateSpan).literal)
      );
    case ts.SyntaxKind.TemplateLiteralType:
      return (
        visitNode(cbNode, (node as ts.TemplateLiteralTypeNode).head) ||
        visitNodes(
          cbNode,
          cbNodes,
          (node as ts.TemplateLiteralTypeNode).templateSpans,
        )
      );
    case ts.SyntaxKind.TemplateLiteralTypeSpan:
      return (
        visitNode(cbNode, (node as ts.TemplateLiteralTypeSpan).type) ||
        visitNode(cbNode, (node as ts.TemplateLiteralTypeSpan).literal)
      );
    case ts.SyntaxKind.ComputedPropertyName:
      return visitNode(cbNode, (node as ts.ComputedPropertyName).expression);
    case ts.SyntaxKind.HeritageClause:
      return (
        // ExtendsKeyword or ImplementsKeyword
        visitNode(cbNode, node.getChildAt(0)) ||
        visitNodes(cbNode, cbNodes, (node as ts.HeritageClause).types)
      );
    case ts.SyntaxKind.ExpressionWithTypeArguments:
      return (
        visitNode(
          cbNode,
          (node as ts.ExpressionWithTypeArguments).expression,
        ) ||
        visitNodes(
          cbNode,
          cbNodes,
          (node as ts.ExpressionWithTypeArguments).typeArguments,
        )
      );
    case ts.SyntaxKind.ExternalModuleReference:
      return visitNode(cbNode, (node as ts.ExternalModuleReference).expression);
    case ts.SyntaxKind.MissingDeclaration:
      return visitNodes(cbNode, cbNodes, node.decorators);
    case ts.SyntaxKind.CommaListExpression:
      return visitNodes(
        cbNode,
        cbNodes,
        (node as ts.CommaListExpression).elements,
      );

    case ts.SyntaxKind.JsxElement:
      return (
        visitNode(cbNode, (node as ts.JsxElement).openingElement) ||
        visitNodes(cbNode, cbNodes, (node as ts.JsxElement).children) ||
        visitNode(cbNode, (node as ts.JsxElement).closingElement)
      );
    case ts.SyntaxKind.JsxFragment:
      return (
        visitNode(cbNode, (node as ts.JsxFragment).openingFragment) ||
        visitNodes(cbNode, cbNodes, (node as ts.JsxFragment).children) ||
        visitNode(cbNode, (node as ts.JsxFragment).closingFragment)
      );
    case ts.SyntaxKind.JsxSelfClosingElement:
    case ts.SyntaxKind.JsxOpeningElement:
      return (
        visitNode(cbNode, (node as ts.JsxOpeningLikeElement).tagName) ||
        visitNodes(
          cbNode,
          cbNodes,
          (node as ts.JsxOpeningLikeElement).typeArguments,
        ) ||
        visitNode(cbNode, (node as ts.JsxOpeningLikeElement).attributes)
      );
    case ts.SyntaxKind.JsxAttributes:
      return visitNodes(cbNode, cbNodes, (node as ts.JsxAttributes).properties);
    case ts.SyntaxKind.JsxAttribute:
      return (
        visitNode(cbNode, (node as ts.JsxAttribute).name) ||
        visitNode(cbNode, (node as ts.JsxAttribute).initializer)
      );
    case ts.SyntaxKind.JsxSpreadAttribute:
      return visitNode(cbNode, (node as ts.JsxSpreadAttribute).expression);
    case ts.SyntaxKind.JsxExpression:
      return (
        visitNode(cbNode, (node as ts.JsxExpression).dotDotDotToken) ||
        visitNode(cbNode, (node as ts.JsxExpression).expression)
      );
    case ts.SyntaxKind.JsxClosingElement:
      return visitNode(cbNode, (node as ts.JsxClosingElement).tagName);

    case ts.SyntaxKind.OptionalType:
    case ts.SyntaxKind.RestType:
    case ts.SyntaxKind.JSDocTypeExpression:
    case ts.SyntaxKind.JSDocNonNullableType:
    case ts.SyntaxKind.JSDocNullableType:
    case ts.SyntaxKind.JSDocOptionalType:
    case ts.SyntaxKind.JSDocVariadicType:
      return visitNode(
        cbNode,
        (
          node as
            | ts.OptionalTypeNode
            | ts.RestTypeNode
            | ts.JSDocTypeExpression
            | ts.JSDocTypeReferencingNode
        ).type,
      );
    case ts.SyntaxKind.JSDocFunctionType:
      return (
        visitNodes(
          cbNode,
          cbNodes,
          (node as ts.JSDocFunctionType).parameters,
        ) || visitNode(cbNode, (node as ts.JSDocFunctionType).type)
      );
    case ts.SyntaxKind.JSDocComment:
      return (
        (typeof (node as ts.JSDoc).comment === 'string'
          ? undefined
          : visitNodes(
              cbNode,
              cbNodes,
              (node as ts.JSDoc).comment as
                | ts.NodeArray<ts.JSDocComment>
                | undefined,
            )) || visitNodes(cbNode, cbNodes, (node as ts.JSDoc).tags)
      );
    case ts.SyntaxKind.JSDocSeeTag:
      return (
        visitNode(cbNode, (node as ts.JSDocSeeTag).tagName) ||
        visitNode(cbNode, (node as ts.JSDocSeeTag).name) ||
        (typeof (node as ts.JSDoc).comment === 'string'
          ? undefined
          : visitNodes(
              cbNode,
              cbNodes,
              (node as ts.JSDoc).comment as
                | ts.NodeArray<ts.JSDocComment>
                | undefined,
            ))
      );
    case ts.SyntaxKind.JSDocNameReference:
      return visitNode(cbNode, (node as ts.JSDocNameReference).name);
    case ts.SyntaxKind.JSDocMemberName:
      return (
        visitNode(cbNode, (node as ts.JSDocMemberName).left) ||
        visitNode(cbNode, (node as ts.JSDocMemberName).right)
      );
    case ts.SyntaxKind.JSDocParameterTag:
    case ts.SyntaxKind.JSDocPropertyTag:
      return (
        visitNode(cbNode, (node as ts.JSDocTag).tagName) ||
        ((node as ts.JSDocPropertyLikeTag).isNameFirst
          ? visitNode(cbNode, (node as ts.JSDocPropertyLikeTag).name) ||
            visitNode(
              cbNode,
              (node as ts.JSDocPropertyLikeTag).typeExpression,
            ) ||
            (typeof (node as ts.JSDoc).comment === 'string'
              ? undefined
              : visitNodes(
                  cbNode,
                  cbNodes,
                  (node as ts.JSDoc).comment as
                    | ts.NodeArray<ts.JSDocComment>
                    | undefined,
                ))
          : visitNode(
              cbNode,
              (node as ts.JSDocPropertyLikeTag).typeExpression,
            ) ||
            visitNode(cbNode, (node as ts.JSDocPropertyLikeTag).name) ||
            (typeof (node as ts.JSDoc).comment === 'string'
              ? undefined
              : visitNodes(
                  cbNode,
                  cbNodes,
                  (node as ts.JSDoc).comment as
                    | ts.NodeArray<ts.JSDocComment>
                    | undefined,
                )))
      );
    case ts.SyntaxKind.JSDocAuthorTag:
      return (
        visitNode(cbNode, (node as ts.JSDocTag).tagName) ||
        (typeof (node as ts.JSDoc).comment === 'string'
          ? undefined
          : visitNodes(
              cbNode,
              cbNodes,
              (node as ts.JSDoc).comment as
                | ts.NodeArray<ts.JSDocComment>
                | undefined,
            ))
      );
    case ts.SyntaxKind.JSDocImplementsTag:
      return (
        visitNode(cbNode, (node as ts.JSDocTag).tagName) ||
        visitNode(cbNode, (node as ts.JSDocImplementsTag).class) ||
        (typeof (node as ts.JSDoc).comment === 'string'
          ? undefined
          : visitNodes(
              cbNode,
              cbNodes,
              (node as ts.JSDoc).comment as
                | ts.NodeArray<ts.JSDocComment>
                | undefined,
            ))
      );
    case ts.SyntaxKind.JSDocAugmentsTag:
      return (
        visitNode(cbNode, (node as ts.JSDocTag).tagName) ||
        visitNode(cbNode, (node as ts.JSDocAugmentsTag).class) ||
        (typeof (node as ts.JSDoc).comment === 'string'
          ? undefined
          : visitNodes(
              cbNode,
              cbNodes,
              (node as ts.JSDoc).comment as
                | ts.NodeArray<ts.JSDocComment>
                | undefined,
            ))
      );
    case ts.SyntaxKind.JSDocTemplateTag:
      return (
        visitNode(cbNode, (node as ts.JSDocTag).tagName) ||
        visitNode(cbNode, (node as ts.JSDocTemplateTag).constraint) ||
        visitNodes(
          cbNode,
          cbNodes,
          (node as ts.JSDocTemplateTag).typeParameters,
        ) ||
        (typeof (node as ts.JSDoc).comment === 'string'
          ? undefined
          : visitNodes(
              cbNode,
              cbNodes,
              (node as ts.JSDoc).comment as
                | ts.NodeArray<ts.JSDocComment>
                | undefined,
            ))
      );
    case ts.SyntaxKind.JSDocTypedefTag:
      return (
        visitNode(cbNode, (node as ts.JSDocTag).tagName) ||
        ((node as ts.JSDocTypedefTag).typeExpression &&
        (node as ts.JSDocTypedefTag).typeExpression?.kind ===
          ts.SyntaxKind.JSDocTypeExpression
          ? visitNode(cbNode, (node as ts.JSDocTypedefTag).typeExpression) ||
            visitNode(cbNode, (node as ts.JSDocTypedefTag).fullName) ||
            (typeof (node as ts.JSDoc).comment === 'string'
              ? undefined
              : visitNodes(
                  cbNode,
                  cbNodes,
                  (node as ts.JSDoc).comment as
                    | ts.NodeArray<ts.JSDocComment>
                    | undefined,
                ))
          : visitNode(cbNode, (node as ts.JSDocTypedefTag).fullName) ||
            visitNode(cbNode, (node as ts.JSDocTypedefTag).typeExpression) ||
            (typeof (node as ts.JSDoc).comment === 'string'
              ? undefined
              : visitNodes(
                  cbNode,
                  cbNodes,
                  (node as ts.JSDoc).comment as
                    | ts.NodeArray<ts.JSDocComment>
                    | undefined,
                )))
      );
    case ts.SyntaxKind.JSDocCallbackTag:
      return (
        visitNode(cbNode, (node as ts.JSDocTag).tagName) ||
        visitNode(cbNode, (node as ts.JSDocCallbackTag).fullName) ||
        visitNode(cbNode, (node as ts.JSDocCallbackTag).typeExpression) ||
        (typeof (node as ts.JSDoc).comment === 'string'
          ? undefined
          : visitNodes(
              cbNode,
              cbNodes,
              (node as ts.JSDoc).comment as
                | ts.NodeArray<ts.JSDocComment>
                | undefined,
            ))
      );
    case ts.SyntaxKind.JSDocReturnTag:
    case ts.SyntaxKind.JSDocTypeTag:
    case ts.SyntaxKind.JSDocThisTag:
    case ts.SyntaxKind.JSDocEnumTag:
      return (
        visitNode(cbNode, (node as ts.JSDocTag).tagName) ||
        visitNode(
          cbNode,
          (
            node as
              | ts.JSDocReturnTag
              | ts.JSDocTypeTag
              | ts.JSDocThisTag
              | ts.JSDocEnumTag
          ).typeExpression,
        ) ||
        (typeof (node as ts.JSDoc).comment === 'string'
          ? undefined
          : visitNodes(
              cbNode,
              cbNodes,
              (node as ts.JSDoc).comment as
                | ts.NodeArray<ts.JSDocComment>
                | undefined,
            ))
      );
    case ts.SyntaxKind.JSDocSignature:
      return (
        forEach((node as ts.JSDocSignature).typeParameters, cbNode) ||
        forEach((node as ts.JSDocSignature).parameters, cbNode) ||
        visitNode(cbNode, (node as ts.JSDocSignature).type)
      );
    case ts.SyntaxKind.JSDocLink:
    case ts.SyntaxKind.JSDocLinkCode:
    case ts.SyntaxKind.JSDocLinkPlain:
      return visitNode(
        cbNode,
        (node as ts.JSDocLink | ts.JSDocLinkCode | ts.JSDocLinkPlain).name,
      );
    case ts.SyntaxKind.JSDocTypeLiteral:
      return forEach((node as ts.JSDocTypeLiteral).jsDocPropertyTags, cbNode);
    case ts.SyntaxKind.JSDocTag:
    case ts.SyntaxKind.JSDocClassTag:
    case ts.SyntaxKind.JSDocPublicTag:
    case ts.SyntaxKind.JSDocPrivateTag:
    case ts.SyntaxKind.JSDocProtectedTag:
    case ts.SyntaxKind.JSDocReadonlyTag:
    case ts.SyntaxKind.JSDocDeprecatedTag:
      return (
        visitNode(cbNode, (node as ts.JSDocTag).tagName) ||
        (typeof (node as ts.JSDoc).comment === 'string'
          ? undefined
          : visitNodes(
              cbNode,
              cbNodes,
              (node as ts.JSDoc).comment as
                | ts.NodeArray<ts.JSDocComment>
                | undefined,
            ))
      );
    case ts.SyntaxKind.PartiallyEmittedExpression:
      return visitNode(
        cbNode,
        (node as ts.PartiallyEmittedExpression).expression,
      );
  }
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
  childFirst = true,
) {
  function visit(node: ts.Node) {
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

    console.log('Get definition failed:\n%s', message);
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
  if (!sourceFile.$file) {
    const relativePath = getRelativePath(sourceFile.fileName, projectPath);
    sourceFile.$file = coref.createFile(relativePath);
  }

  return sourceFile.$file;
}

/**
 * Create location by position.
 *
 * @param sourceFile
 * @param startPos
 * @param endPos
 * @param text
 * @returns
 */
export function createLocationByPosition(
  sourceFile: extendedTs.SourceFile,
  startPos: number,
  endPos: number,
  text: string,
) {
  const lineStarts = sourceFile.getLineStarts();
  const start = getPosition(startPos, lineStarts);
  const end = getPosition(endPos, lineStarts);
  return coref.createLocation(sourceFile.$file as coref.File, start, end, text);
}

/**
 * 根据 AST Node 创建对应的 COREF Location 对象
 *
 * @param tsNode AST Node 节点
 * @returns 该 AST Node 对应的 COREF Location 对象
 */
export function createNodeLocation(tsNode: extendedTs.Node): coref.Location {
  const sourceFile = tsNode.getSourceFile();
  const startPos = tsNode.getStart();
  const endPos = tsNode.end;
  const text = tsNode.getText();

  return createLocationByPosition(
    sourceFile as extendedTs.SourceFile,
    startPos,
    endPos,
    text,
  );
}

/**
 * Ensure the extendedTs.Node has the $corefModel property, and return it. Generate the $corefModel if not exists.
 *
 * @param tsNode extendedTs.Node
 * @returns the $corefModel of this node
 */
export function ensureCorefAstNode(tsNode: extendedTs.Node): coref.BaseModel {
  if (!tsNode.$corefModel) {
    const location = createNodeLocation(tsNode);

    tsNode.$corefModel =
      tsNode.kind === ts.SyntaxKind.SourceFile
        ? coref.createTopLevel(coref.TopLevelKind.SCRIPT, location)
        : coref.createNode(tsNode.kind, location);
  }

  return tsNode.$corefModel;
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
  return (
    (node as extendedTs.Node).symbol ?? typeChecker.getSymbolAtLocation(node)
  );
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
  } catch (e) {
    console.log(e);
    return '';
  }
}

/**
 * Get the COREF node oid from the typescript node.
 *
 * @param node
 * @param projectPath
 * @returns
 */
export function getOidFromTsNode(
  node: extendedTs.Node,
  projectPath?: string | undefined,
) {
  ensureCorefFile(node.getSourceFile() as extendedTs.SourceFile, projectPath);
  return ensureCorefAstNode(node).oid;
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
  const declaration: extendedTs.Node | undefined =
    getSymbolDeclaration(tsSymbol);

  // Do not extract the symbol if there is no associated declaration
  if (declaration === undefined) {
    return undefined;
  }

  // Use the oid of the first declaration node as the symbol oid
  const oid = getOidFromTsNode(declaration, projectPath);
  const description = getSymbolDescription(declaration, tsSymbol, typeChecker);
  return coref.createSymbol(oid, tsSymbol, description);
}

/**
 * Create symbol
 *
 * @param tsNode
 * @param projectPath
 * @returns COREF symbol
 */
export function createSymbol(
  tsNode: extendedTs.Node,
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
export function getShortHandAssignmentValueSymbolOid(
  tsNode: extendedTs.Node,
  typeChecker: ts.TypeChecker,
  projectPath?: string | undefined,
): bigint | undefined {
  const tsSymbol = typeChecker.getShorthandAssignmentValueSymbol(tsNode);
  const declaration = tsSymbol && getSymbolDeclaration(tsSymbol);
  return declaration && getOidFromTsNode(declaration, projectPath);
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
    throw new Error('Invalid accessExpression');
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
  return getAccessExpressionNames(node).join('.');
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

  return getAccessExpressionText(expression.left) === 'module.exports';
}

/**
 * Ref: https://github.com/microsoft/TypeScript/blob/v4.5.5/src/compiler/types.ts#L981
 */
export type HasModifiers =
  | ts.ParameterDeclaration
  | ts.PropertySignature
  | ts.PropertyDeclaration
  | ts.MethodSignature
  | ts.MethodDeclaration
  | ts.ConstructorDeclaration
  | ts.GetAccessorDeclaration
  | ts.SetAccessorDeclaration
  | ts.IndexSignatureDeclaration
  | ts.FunctionExpression
  | ts.ArrowFunction
  | ts.ClassExpression
  | ts.VariableStatement
  | ts.FunctionDeclaration
  | ts.ClassDeclaration
  | ts.InterfaceDeclaration
  | ts.TypeAliasDeclaration
  | ts.EnumDeclaration
  | ts.ModuleDeclaration
  | ts.ImportEqualsDeclaration
  | ts.ImportDeclaration
  | ts.ExportAssignment
  | ts.ExportDeclaration;

/**
 * Determine whether a node can have modifiers.
 *
 * Ref: https://github.com/microsoft/TypeScript/blob/v4.5.5/src/compiler/factory/utilities.ts#L868
 *
 * @param node
 * @returns node is HasModifiers
 */
export function canHaveModifiers(node: ts.Node): node is HasModifiers {
  const kind = node.kind;
  return (
    kind === ts.SyntaxKind.Parameter ||
    kind === ts.SyntaxKind.PropertySignature ||
    kind === ts.SyntaxKind.PropertyDeclaration ||
    kind === ts.SyntaxKind.MethodSignature ||
    kind === ts.SyntaxKind.MethodDeclaration ||
    kind === ts.SyntaxKind.Constructor ||
    kind === ts.SyntaxKind.GetAccessor ||
    kind === ts.SyntaxKind.SetAccessor ||
    kind === ts.SyntaxKind.IndexSignature ||
    kind === ts.SyntaxKind.FunctionExpression ||
    kind === ts.SyntaxKind.ArrowFunction ||
    kind === ts.SyntaxKind.ClassExpression ||
    kind === ts.SyntaxKind.VariableStatement ||
    kind === ts.SyntaxKind.FunctionDeclaration ||
    kind === ts.SyntaxKind.ClassDeclaration ||
    kind === ts.SyntaxKind.InterfaceDeclaration ||
    kind === ts.SyntaxKind.TypeAliasDeclaration ||
    kind === ts.SyntaxKind.EnumDeclaration ||
    kind === ts.SyntaxKind.ModuleDeclaration ||
    kind === ts.SyntaxKind.ImportEqualsDeclaration ||
    kind === ts.SyntaxKind.ImportDeclaration ||
    kind === ts.SyntaxKind.ExportAssignment ||
    kind === ts.SyntaxKind.ExportDeclaration
  );
}
