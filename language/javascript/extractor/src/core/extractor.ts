

import * as path from 'path';

import { range } from 'lodash';
import * as ts from 'typescript';

import * as framework from './framework';
import * as util from './util';
import { coref, extendedTs } from '../model';

export const compilerOptions: ts.CompilerOptions = {
  allowJs: true,
  experimentalDecorators: true,
  experimentalAsyncFunctions: true,
  jsx: ts.JsxEmit.Preserve,
  noResolve: true,
};

// Default DB file name
export const DEFAULT_DB_FILE_NAME = 'coref_javascript_src.db';

type ReScanFunction = () => ts.SyntaxKind;

interface ReScanItem {
  pos: number;
  callback: ReScanFunction;
}

/**
 * 抽取 Tokens 和 Comments
 * 因为抽取的 AST 中 不包含 Tokens 和 Comments 信息，因此需要使用 Scanner 重新解析代码来抽取
 *
 * @param tsSourceFile
 */
function extractTokensAndComments(tsSourceFile: extendedTs.SourceFile) {
  const code = tsSourceFile.text;
  const scanner = ts.createScanner(
    ts.ScriptTarget.Latest,
    /*skipTrivia*/ false,
    ts.LanguageVariant.JSX,
    code,
  );
  const reScanGreaterToken: ReScanFunction =
    scanner.reScanGreaterToken.bind(scanner);
  const reScanSlashToken: ReScanFunction =
    scanner.reScanSlashToken.bind(scanner);
  const reScanTemplateToken: ReScanFunction = scanner.reScanTemplateToken.bind(
    scanner,
  ) as ReScanFunction;

  const reScanItems: ReScanItem[] = [];

  if (
    !tsSourceFile.parseDiagnostics ||
    tsSourceFile.parseDiagnostics.length === 0
  ) {
    util.forEachNode(tsSourceFile, node => {
      if (util.shouldReScanGreaterThanToken(node)) {
        reScanItems.push({
          pos: node.getStart(tsSourceFile, false),
          callback: reScanGreaterToken,
        });
      } else if (util.shouldReScanSlashToken(node)) {
        reScanItems.push({
          pos: node.getStart(tsSourceFile, false),
          callback: reScanSlashToken,
        });
      } else if (util.shouldReScanTemplateToken(node)) {
        reScanItems.push({
          pos: node.getStart(tsSourceFile, false),
          callback: reScanTemplateToken,
        });
      }
    });
  }

  const tokens: coref.Token[] = [];
  const comments: coref.Comment[] = [];
  const locationMap = new Map<bigint, coref.Location>();

  let tokenSyntaxKind: ts.SyntaxKind;
  let reScanItemIndex = 0;
  do {
    tokenSyntaxKind = scanner.scan();
    if (scanner.getTokenPos() === reScanItems[reScanItemIndex]?.pos) {
      reScanItems[reScanItemIndex].callback();
      reScanItemIndex++;
    }

    const startPos = scanner.getTokenPos();
    const text = scanner.getTokenText();
    const width = text.length;
    const endPos = startPos + width;

    // skip broken token
    if (width === 0) {
      continue;
    }

    const location = util.createLocationByPosition(
      tsSourceFile,
      startPos,
      endPos,
      text,
    );

    // 暂时只将 comment 入库，只记录 comment 的 location 到 locationMap
    if (util.isCommentSyntaxKind(tokenSyntaxKind)) {
      // 处理 comments
      const comment = coref.createComment(
        tokenSyntaxKind as coref.CommentSyntaxKind,
        location,
      );
      comments.push(comment);

      locationMap.set(location.oid, location);
    } else if (ts.isTokenKind(tokenSyntaxKind)) {
      // 处理 tokens，除了 comments ( comments 也属于 tokens )
      const token = coref.createToken(
        tokenSyntaxKind as ts.TokenSyntaxKind,
        location,
      );
      tokens.push(token);
    }
  } while (tokenSyntaxKind !== ts.SyntaxKind.EndOfFileToken);

  return {
    tokens,
    comments,
    locationMap,
  };
}

/**
 * 访问 sourceFile 节点，并返回对应的 TopLevel 对象
 *
 * @param tsSourceFile
 * @returns TopLevel 对象
 */
function visitTopLevel(tsSourceFile: extendedTs.SourceFile): coref.TopLevel {
  return util.ensureCorefAstNode(tsSourceFile) as coref.TopLevel;
}

/**
 * 处理普通节点的子节点，记录子节点的父节点，index 等信息
 * 按子节点顺序记录 index
 *
 * @param tsNode 父节点
 * @returns 子节点数组
 */
function processCommonChildNodes(tsNode: extendedTs.Node): coref.Node[] {
  const node = util.ensureCorefAstNode(tsNode);

  let index = 0;
  const childNodes: coref.Node[] = [];
  util.forEachChild(tsNode, (childTsNode: extendedTs.Node) => {
    const childNode = childTsNode.$corefModel as coref.Node;
    childNode.parent_oid = node.oid;
    childNode.index = index;
    childNodes.push(childNode);
    index++;
  });

  return childNodes;
}

/**
 * 收集 COREF 子节点
 * 如果该子节点存在，则保存到 childNodes 中
 *
 * @param childNodes COREF 子节点数组
 * @param tsNode extendedTs 子节点
 * @param extra_desc 子节点额外的信息
 * @returns
 */
function collectChildNodes(
  childNodes: coref.Node[],
  tsNode: extendedTs.Node | undefined,
  extra_desc: { parent_oid: bigint; index: number },
) {
  const node = tsNode?.$corefModel as coref.Node | undefined;
  if (node) {
    childNodes.push({ ...node, ...extra_desc });
  }

  return childNodes;
}

/**
 * 处理 ForStatement 的子节点，记录子节点的父节点，index 等信息
 * 4 种子节点 initializer, condition, incrementor 和 statement 的 index 固定为 0, 1, 2, 3,
 * 以便在 Godel 库中可以区分。
 *
 * @param tsForStatement
 * @returns
 */
function processForStatementChildNodes(
  tsForStatement: extendedTs.ForStatement,
): coref.Node[] {
  const node = util.ensureCorefAstNode(tsForStatement);

  const childNodes: coref.Node[] = [];

  collectChildNodes(childNodes, tsForStatement.initializer, {
    parent_oid: node.oid,
    index: 0,
  });
  collectChildNodes(childNodes, tsForStatement.condition, {
    parent_oid: node.oid,
    index: 1,
  });
  collectChildNodes(childNodes, tsForStatement.incrementor, {
    parent_oid: node.oid,
    index: 2,
  });
  collectChildNodes(childNodes, tsForStatement.statement, {
    parent_oid: node.oid,
    index: 3,
  });

  return childNodes;
}

/**
 * 访问一个 AST Node 节点，记录其所有子节点与之的父子关系，并返回全部子节点
 *
 * @param tsNode AST Node 节点，增加了自定义属性的 ts.Node 对象
 * @returns 该节点所有直接子节点对应的 COREF 对象
 */
function visitNode(tsNode: extendedTs.Node): coref.Node[] {
  switch (tsNode.kind) {
    case ts.SyntaxKind.ForStatement:
      return processForStatementChildNodes(tsNode as extendedTs.ForStatement);
    default:
      return processCommonChildNodes(tsNode);
  }
}

/**
 * 访问 ClassLikeDeclaration 节点，返回对应的 COREF 对象
 *
 * @param tsClassLikeDeclaration extendedTs.ClassLikeDeclaration 节点，增加了自定义属性的 ts.ClassLikeDeclaration 对象
 * @returns COREF ClassLikeDeclaration 对象
 *
 * @todo 处理 classLikeDeclaration 的 members, modifiers, heritageClauses, decorators, typeParameters 等
 */
function visitClassLikeDeclaration(
  tsClassLikeDeclaration: extendedTs.ClassLikeDeclaration,
): coref.ClassLikeDeclaration {
  const classLikeDeclaration = util.ensureCorefAstNode(
    tsClassLikeDeclaration,
  ) as coref.ClassLikeDeclaration;
  classLikeDeclaration.name = tsClassLikeDeclaration.name?.text || '';
  return classLikeDeclaration;
}

/**
 * 访问 FunctionLikeDeclaration 节点，返回对应的 COREF 对象
 * @param tsFunctionLikeDeclaration extendedTs.FunctionLikeDeclaration 节点，增加了自定义属性的 ts.FunctionLikeDeclaration 对象
 * @returns COREF FunctionLikeDeclaration 对象
 *
 * @todo 处理除了 name，其他的 FunctionLikeDeclaration 的属性
 */
function visitFunctionLikeDeclaration(
  tsFunctionLikeDeclaration: extendedTs.FunctionLikeDeclaration,
) {
  const functionLikeDeclaration = util.ensureCorefAstNode(
    tsFunctionLikeDeclaration,
  ) as coref.FunctionLikeDeclaration;

  switch (functionLikeDeclaration.kind) {
    case ts.SyntaxKind.FunctionDeclaration:
      functionLikeDeclaration.name =
        (tsFunctionLikeDeclaration as extendedTs.FunctionDeclaration).name
          ?.text || '';
      break;
    case ts.SyntaxKind.Constructor:
      functionLikeDeclaration.name = '';
      break;
    case ts.SyntaxKind.MethodDeclaration:
    case ts.SyntaxKind.GetAccessor:
    case ts.SyntaxKind.SetAccessor:
      functionLikeDeclaration.name = (
        tsFunctionLikeDeclaration as
          | extendedTs.MethodDeclaration
          | extendedTs.GetAccessorDeclaration
          | extendedTs.SetAccessorDeclaration
      ).name.getText();
      break;
    case ts.SyntaxKind.FunctionExpression:
      functionLikeDeclaration.name =
        (tsFunctionLikeDeclaration as extendedTs.FunctionExpression).name
          ?.text || '';
      break;
    case ts.SyntaxKind.ArrowFunction:
      functionLikeDeclaration.name = '';
      break;
  }

  const functionEnclosingNodes: coref.FunctionEnclosingNode[] = [];
  // 不遍历 tsFunctionLikeDeclaration 本身
  util.forEachChild(tsFunctionLikeDeclaration, childNode => {
    util.forEachNode(
      childNode,
      (tsNode: extendedTs.Node) => {
        const node = util.ensureCorefAstNode(tsNode);
        functionEnclosingNodes.push({
          nodeOid: node.oid,
          functionOid: functionLikeDeclaration.oid,
        });

        if (util.isFunctionLikeDeclaration(tsNode)) {
          // 不再遍历 FunctionLikeDeclaration 的子节点
          return false;
        }
      },
      /*childFirst*/ false,
    );
  });

  return {
    functionLikeDeclaration,
    functionEnclosingNodes,
  };
}

function visitMayInvokeExpression(
  program: ts.Program,
  mayInvokeExpression: extendedTs.MayInvokeExpression,
  projectPath?: string,
): coref.CallSite | undefined {
  const callee = util.getCallee(program, mayInvokeExpression);

  function createCallSite(
    caller: extendedTs.Node,
    callee: extendedTs.Node,
  ): coref.CallSite {
    const corefCaller = util.ensureCorefAstNode(caller);
    const calleeSourceFile = callee.getSourceFile();
    // 初始化 callee 所在的 sourceFile 对应的 COREF file
    util.ensureCorefFile(
      calleeSourceFile as extendedTs.SourceFile,
      projectPath,
    );
    const corefCallee = util.ensureCorefAstNode(callee);
    return coref.createCallSite(
      corefCaller as coref.Node,
      corefCallee as coref.Node,
    );
  }

  let isValidCallSite = false;
  if (callee) {
    const calleeFileName = callee.getSourceFile().fileName;
    if (projectPath == undefined) {
      // 抽取单文件
      if (calleeFileName === mayInvokeExpression.getSourceFile().fileName) {
        // 只抽取调用本文件函数的 call site
        isValidCallSite = true;
      }
    } else {
      // 抽取项目
      if (calleeFileName.startsWith(projectPath + path.sep)) {
        // 只抽取调用本项目函数的 call site
        isValidCallSite = true;
      }
    }
  }

  return isValidCallSite
    ? createCallSite(mayInvokeExpression, callee as util.Callee)
    : undefined;
}

/**
 * 抽取节点与注释的关系
 *
 * @todo 目前有一种特殊情况没有抽取：一行行内的多行注释，而且该注释不在所在行的开头或结尾。
 * 原因是，通过 typescript API (ts.getLeadingCommentRanges 和 ts.getTrailingCommentRanges)
 * 获取 AST 节点与注释的关系，这种特殊类型的注释会关联到一些只有语法意义的 Token 节点上
 * (如 PunctuationToken标点符号, keyword 等)，后续应把注释关联到他们前后更有意义的节点上，
 * 如 Identifier，Expression等。
 *
 * @param tsNode TsNode 节点，增加了自定义属性的 ts.Node 对象
 * @returns 节点与注释关系的 NodeComment 数组
 */
function visitNodeComments(tsNode: extendedTs.Node): coref.NodeComment[] {
  const sourceFile = tsNode.getSourceFile();
  const node = tsNode.$corefModel as coref.Node;
  const leadingCommentRanges = util.getLeadingCommentRangesOfNode(
    tsNode,
    sourceFile,
  );
  const trailingCommentRanges = util.getTrailingCommentRangesOfNode(
    tsNode,
    sourceFile,
  );
  const nodeComments: coref.NodeComment[] = [];

  /**
   * 根据 ts.CommentRange 和 NodeCommentType 创建 NodeComment 对象
   *
   * @param commentRange ts.CommentRange 对象
   * @param nodeCommentType 节点注释关联类型 NodeCommentType.LEADING 或 NodeCommentType.TRAILING
   * @returns NodeComment 对象
   */
  function createNodeComment(
    commentRange: ts.CommentRange,
    nodeCommentType: coref.NodeCommentType,
  ): coref.NodeComment {
    const commentStartPos = commentRange.pos;
    const commentEndPos = commentRange.end;
    const commentText = sourceFile.text.substring(
      commentStartPos,
      commentEndPos,
    );
    const commentLocation = util.createLocationByPosition(
      sourceFile,
      commentStartPos,
      commentEndPos,
      commentText,
    );
    const commentOid = coref.computeNodeOid(commentRange.kind, commentLocation);
    return coref.createNodeComment(node.oid, commentOid, nodeCommentType);
  }

  leadingCommentRanges?.forEach(commentRange => {
    const nodeComment = createNodeComment(
      commentRange,
      coref.NodeCommentType.LEADING,
    );
    nodeComments.push(nodeComment);
  });

  trailingCommentRanges?.forEach(commentRange => {
    const nodeComment = createNodeComment(
      commentRange,
      coref.NodeCommentType.TRAILING,
    );
    nodeComments.push(nodeComment);
  });

  return nodeComments;
}

/**
 * 访问 TypeScript literal-like node
 * @param literalLikeNode literal-like node
 * @returns 该 literal-like node 对应的 coref.Literal 对象
 */
function visitLiteralLikeNode(literalLikeNode: extendedTs.Node): coref.Literal {
  const literal = literalLikeNode.$corefModel as coref.Literal;

  /**
   * 如果 literal 的值中存在未成对的 UTF-16 代理对（Surrogate Pair）范围的字符，
   * 则这些字符是非法字符，不对应任何 Unicode 标准中的字符，插入数据库时会报错，需保存转译后的值
   */

  /**
   * 找到单独出现代理字符的正则表达式，
   * 即后面没有 [\uDC00-\uDFFF] 的 [\uD800-\uDBFF] ，
   * 或前面没有 [\uD800-\uDBFF] 的 [\uDC00-\uDFFF]
   */
  const singleSurrogateRegex =
    /[\uD800-\uDBFF](?![\uDC00-\uDFFF])|(?<![\uD800-\uDBFF])[\uDC00-\uDFFF]/;

  const value = (literalLikeNode as ts.LiteralLikeNode).text;
  literal.value =
    value.search(singleSurrogateRegex) === -1
      ? value // 不存在非法字符，使用 literal 的实际值
      : literalLikeNode.getText(); // 存在非法字符，使用原始文本

  return literal;
}

/**
 * Extract a BindingElement
 *
 * @param tsBindingElement
 * @returns coref.BindingElement
 */
function extractBindingElement(
  tsBindingElement: extendedTs.BindingElement,
): coref.BindingElement {
  const bindingElement = util.ensureCorefAstNode(
    tsBindingElement,
  ) as coref.BindingElement;
  bindingElement.propertyNameOid = (
    tsBindingElement.propertyName as extendedTs.Node | undefined
  )?.$corefModel?.oid;
  bindingElement.nameOid = (tsBindingElement.name as extendedTs.Node)
    .$corefModel?.oid as bigint;
  bindingElement.initializerOid = (
    tsBindingElement.initializer as extendedTs.Node
  )?.$corefModel?.oid;
  return bindingElement;
}

/**
 * Extract modifiers
 *
 * @param tsNode
 * @returns COREF modifiers
 */
function extractModifiers(tsNode: util.HasModifiers): coref.Modifier[] {
  return tsNode.modifiers
    ? tsNode.modifiers.map((tsModifier, modifierIndex) => {
        const modifier = (tsModifier as extendedTs.Modifier).$corefModel;
        modifier.modifierIndex = modifierIndex;
        return modifier;
      })
    : [];
}

/**
 * 抽取 AST 节点数据
 *
 * @param tsSourceFile
 * @returns 一个 SourceFile 中 AST 相关的数据
 */
function extractAstNodes(tsSourceFile: extendedTs.SourceFile) {
  let nodes: coref.Node[] = [];
  let nodeComments: coref.NodeComment[] = [];
  const bindingElements: coref.BindingElement[] = [];
  const classLikeDeclarations: coref.ClassLikeDeclaration[] = [];
  const functionLikeDeclarations: coref.FunctionLikeDeclaration[] = [];
  let functionEnclosingNodes: coref.FunctionEnclosingNode[] = [];
  const topLevel = visitTopLevel(tsSourceFile);
  const literals: coref.Literal[] = [];
  let modifiers: coref.Modifier[] = [];
  const cfgEntryNodes: coref.SyntheticCfgNode[] = [
    coref.createCfgEntryNode(topLevel.oid),
  ];
  const cfgExitNodes: coref.SyntheticCfgNode[] = [
    coref.createCfgExitNode(topLevel.oid),
  ];

  util.forEachNode(tsSourceFile, (tsNode: extendedTs.Node) => {
    const childNodes = visitNode(tsNode);
    nodes = nodes.concat(childNodes);

    const currentNodeComments = visitNodeComments(tsNode);
    nodeComments = nodeComments.concat(currentNodeComments);

    if (tsNode.kind === ts.SyntaxKind.BindingElement) {
      bindingElements.push(
        extractBindingElement(tsNode as extendedTs.BindingElement),
      );
    } else if (ts.isClassLike(tsNode)) {
      const classLikeDeclaration = visitClassLikeDeclaration(tsNode);
      classLikeDeclarations.push(classLikeDeclaration);
    } else if (ts.isFunctionLike(tsNode)) {
      if (util.isFunctionLikeDeclaration(tsNode)) {
        const {
          functionLikeDeclaration,
          functionEnclosingNodes: currentFunctionEnclosingNodes,
        } = visitFunctionLikeDeclaration(tsNode);
        functionEnclosingNodes = functionEnclosingNodes.concat(
          currentFunctionEnclosingNodes,
        );
        functionLikeDeclarations.push(functionLikeDeclaration);

        cfgEntryNodes.push(
          coref.createCfgEntryNode(functionLikeDeclaration.oid),
        );
        cfgExitNodes.push(coref.createCfgExitNode(functionLikeDeclaration.oid));
      }
    } else if (util.isLiteralLikeNode(tsNode)) {
      const literal = visitLiteralLikeNode(tsNode);
      literals.push(literal);
    }

    if (util.canHaveModifiers(tsNode)) {
      const extractedModifiers = extractModifiers(tsNode);
      if (extractedModifiers.length > 0) {
        modifiers = modifiers.concat(extractedModifiers);
      }
    }
  });

  const locationMap = new Map<bigint, coref.Location>();
  // TopLevel 的范围不包含文件开头的注释，因此其 location 信息需要单独记录
  locationMap.set(topLevel.location.oid, topLevel.location);
  nodes.forEach(node => {
    const location = node.location;
    locationMap.set(location.oid, location);
  });

  return {
    topLevel,
    nodes,
    nodeComments,
    bindingElements,
    classLikeDeclarations,
    functionLikeDeclarations,
    functionEnclosingNodes,
    literals,
    modifiers,
    cfgEntryNodes,
    cfgExitNodes,
    locationMap,
  };
}

/**
 * Extract symbols and node symbol relations
 *
 * @param tsSourceFile
 * @param projectPath
 * @returns { symbolMap, nodeSymbols }
 */
function extractSymbols(
  tsSourceFile: extendedTs.SourceFile,
  typeChecker: ts.TypeChecker,
  projectPath?: string | undefined,
) {
  const symbolMap = new Map<bigint, coref.Symbol>();
  const nodeSymbolMap = new Map<bigint, bigint>();
  const shorthandAssignmentValueSymbolMap = new Map<bigint, bigint>();

  util.forEachNode(tsSourceFile, (tsNode: extendedTs.Node) => {
    const symbol = util.createSymbol(tsNode, typeChecker, projectPath);
    if (symbol === undefined) {
      return;
    }

    symbolMap.set(symbol.oid, symbol);
    nodeSymbolMap.set((tsNode.$corefModel as coref.Node).oid, symbol.oid);

    if (tsNode.kind === ts.SyntaxKind.ShorthandPropertyAssignment) {
      const valueSymbolOid = util.getShortHandAssignmentValueSymbolOid(
        tsNode,
        typeChecker,
        projectPath,
      );
      if (valueSymbolOid !== undefined) {
        shorthandAssignmentValueSymbolMap.set(
          (tsNode.$corefModel as coref.Node).oid,
          valueSymbolOid,
        );
      }
    }
  });

  return {
    symbolMap,
    nodeSymbolMap,
    shorthandAssignmentValueSymbolMap,
  };
}

/**
 * Extract call sites and the corresponding callees
 */
function extractCallSites(
  program: ts.Program,
  tsSourceFile: extendedTs.SourceFile,
  projectPath?: string | undefined,
) {
  const callSiteMap = new Map<bigint, bigint>();

  util.forEachNode(tsSourceFile, (tsNode: extendedTs.Node) => {
    if (util.isMayInvokeExpression(tsNode)) {
      const callSite = visitMayInvokeExpression(
        program,
        tsNode as extendedTs.MayInvokeExpression,
        projectPath,
      );
      if (callSite) {
        callSiteMap.set(callSite.invokeExpression.oid, callSite.callee.oid);
      }
    }
  });

  return callSiteMap;
}

/**
 * 抽取每个 Location 对应的行数，代码行数和注释行数
 *
 * @param tokens
 * @param comments
 * @param locations
 * @returns NumberOfLines 对象数组
 */
function extractNumberOfLines(
  tokens: coref.Token[],
  comments: coref.Comment[],
  locations: coref.Location[],
): coref.NumberOfLines[] {
  const numberOfLinesArray: coref.NumberOfLines[] = [];
  const codeLineSet = new Set<number>();
  const commentLineSet = new Set<number>();

  // 使用 tokens 统计代码行数，因为上层的 AST node 可能包含一整行的内容只存在非代码的 Token
  for (const token of tokens) {
    // 非代码的 Token
    if (util.isNonCodeTokenSyntaxKind(token.kind)) {
      continue;
    }

    // 除了非代码的Token，如果一行存在 Token，则认为该行为代码行
    const startLine = token.location.start.line;
    const endLine = token.location.end.line;
    range(startLine, endLine + 1).forEach(value => {
      codeLineSet.add(value);
    });
  }

  // 使用 comments 统计代码行数，如果一行存在 comment，则认为该行为注释行
  for (const comment of comments) {
    const startLine = comment.location.start.line;
    const endLine = comment.location.end.line;
    range(startLine, endLine + 1).forEach(value => {
      commentLineSet.add(value);
    });
  }

  for (const location of locations) {
    const startLine = location.start.line;
    const endLine = location.end.line;

    const lines = endLine - startLine + 1;

    const codeLines = range(startLine, endLine + 1).reduce(
      (previousValue, currentValue) => {
        return codeLineSet.has(currentValue)
          ? previousValue + 1
          : previousValue;
      },
      0,
    );

    const commentLines = range(startLine, endLine + 1).reduce(
      (previousValue, currentValue) => {
        return commentLineSet.has(currentValue)
          ? previousValue + 1
          : previousValue;
      },
      0,
    );

    numberOfLinesArray.push({
      locationOid: location.oid,
      lines,
      codeLines,
      commentLines,
    });
  }

  return numberOfLinesArray;
}

/**
 * 抽取一个文件的信息
 *
 * @param program
 * @param filePath
 * @param projectPath
 * @returns 该文件的 Coref 数据
 */
export function extractFile(
  sourceFile: extendedTs.SourceFile,
  program: ts.Program,
  projectPath?: string | undefined,
): coref.Coref {
  const relativePath = util.getRelativePath(sourceFile.fileName, projectPath);

  sourceFile.$file = coref.createFile(relativePath);

  const {
    tokens,
    comments,
    locationMap: tokenLocationMap,
  } = extractTokensAndComments(sourceFile);

  const {
    topLevel,
    nodes,
    nodeComments,
    bindingElements,
    classLikeDeclarations,
    functionLikeDeclarations,
    functionEnclosingNodes,
    literals,
    modifiers,
    cfgEntryNodes,
    cfgExitNodes,
    locationMap: astLocationMap,
  } = extractAstNodes(sourceFile);
  const topLevels: coref.TopLevel[] = [topLevel];

  const { symbolMap, nodeSymbolMap, shorthandAssignmentValueSymbolMap } =
    extractSymbols(sourceFile, program.getTypeChecker(), projectPath);

  const callSiteMap = extractCallSites(program, sourceFile, projectPath);

  const locationMap = new Map([...tokenLocationMap, ...astLocationMap]);

  // 增加文件对应的 Location
  const fileLocation = util.createLocationByPosition(
    sourceFile,
    0,
    sourceFile.end,
    sourceFile.text,
  );
  (sourceFile.$file as coref.File).locationOid = fileLocation.oid;
  locationMap.set(fileLocation.oid, fileLocation);

  const locations = Array.from(locationMap.values());

  const numberOfLinesArray = extractNumberOfLines(tokens, comments, locations);

  return {
    topLevels,
    tokens,
    comments,
    nodes,
    nodeComments,
    bindingElements,
    classLikeDeclarations,
    functionLikeDeclarations,
    functionEnclosingNodes,
    literals,
    modifiers,
    cfgEntryNodes,
    cfgExitNodes,
    symbolMap,
    nodeSymbolMap,
    shorthandAssignmentValueSymbolMap,
    callSiteMap,
    locations,
    numbersOfLines: numberOfLinesArray,
    files: [sourceFile.$file],
  };
}

/**
 * Extract framework coref data of the project
 *
 * @param program
 * @param projectPath
 * @returns the project framework COREF
 */
export function extractProjectFrameworks(
  enabledFrameworkExtractors: framework.FrameworkExtractorBase[],
  program: ts.Program,
  projectPath: string,
): coref.CrossFileCoref {
  let symbolMap = new Map<bigint, coref.Symbol>();
  let nodeSymbolMap = new Map<bigint, bigint>();
  let callSiteMap = new Map<bigint, bigint>();

  for (const extractor of enabledFrameworkExtractors) {
    console.log(`Extracting framework COREF: ${extractor.name}`);

    if (extractor.extractProjectCoref) {
      const frameworkCoref = extractor.extractProjectCoref(
        program,
        projectPath,
      );
      symbolMap = new Map([...symbolMap, ...frameworkCoref.symbolMap]);
      nodeSymbolMap = new Map([
        ...nodeSymbolMap,
        ...frameworkCoref.nodeSymbolMap,
      ]);
      callSiteMap = new Map([...callSiteMap, ...frameworkCoref.callSiteMap]);
    }
  }

  return {
    symbolMap,
    nodeSymbolMap,
    callSiteMap,
  };
}

/**
 * Extract the framework coref data of a file
 *
 * @param enabledFrameworkExtractors
 * @param tsSourceFile
 * @param program
 * @param projectPath
 * @returns the file framework COREF
 */
export function extractFileFrameworks(
  enabledFrameworkExtractors: framework.FrameworkExtractorBase[],
  tsSourceFile: extendedTs.SourceFile,
  program: ts.Program,
  projectPath: string | undefined,
): coref.CrossFileCoref {
  let symbolMap = new Map<bigint, coref.Symbol>();
  let nodeSymbolMap = new Map<bigint, bigint>();
  let callSiteMap = new Map<bigint, bigint>();

  for (const extractor of enabledFrameworkExtractors) {
    if (extractor.extractFileCoref) {
      const {
        symbolMap: frameworkSymbolMap,
        nodeSymbolMap: frameworkNodeSymbolMap,
        callSiteMap: frameworkCallSiteMap,
      } = extractor.extractFileCoref(tsSourceFile, program, projectPath);

      symbolMap = new Map([...symbolMap, ...frameworkSymbolMap]);
      nodeSymbolMap = new Map([...nodeSymbolMap, ...frameworkNodeSymbolMap]);
      callSiteMap = new Map([...callSiteMap, ...frameworkCallSiteMap]);
    }
  }

  return {
    symbolMap,
    nodeSymbolMap,
    callSiteMap,
  };
}
