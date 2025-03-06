/**
 * Copyright 2024 Ant Group CO., Ltd.
 */

import type * as prisma from "@prisma/client";
import * as ts from "ohos-typescript";
import { SyntaxKind } from "ohos-typescript";

import { hashToInt64 } from "../../util";
import * as util from "../util";

function computeCallSiteDeclarationId(
  callSiteId: bigint,
  declarationId: bigint,
) {
  const uri = `CallSiteDeclaration:${callSiteId}:${declarationId}`;
  return hashToInt64(uri);
}

function computeCallSiteImplementationId(
  callSiteId: bigint,
  implementationId: bigint,
) {
  const uri = `CallSiteImplementation:${callSiteId}:${implementationId}`;
  return hashToInt64(uri);
}

function isSignatureDeclarationKind(kind: SyntaxKind): boolean {
  switch (kind) {
    case SyntaxKind.CallSignature:
    case SyntaxKind.ConstructSignature:
    case SyntaxKind.MethodSignature:
    case SyntaxKind.IndexSignature:
    case SyntaxKind.FunctionType:
    case SyntaxKind.ConstructorType:
    case SyntaxKind.JSDocFunctionType:
    case SyntaxKind.FunctionDeclaration:
    case SyntaxKind.MethodDeclaration:
    case SyntaxKind.Constructor:
    case SyntaxKind.GetAccessor:
    case SyntaxKind.SetAccessor:
    case SyntaxKind.FunctionExpression:
    case SyntaxKind.ArrowFunction:
      return true;
  }

  return false;
}

function isSignatureDeclaration(
  node: ts.Node | undefined,
): node is ts.SignatureDeclaration {
  return node ? isSignatureDeclarationKind(node.kind) : false;
}

const emptyArray: never[] = [] as never[];

/**
 * Customized version of ts.GoToDefinition.getDefinitionAtPosition
 *
 * @param program
 * @param sourceFile
 * @param invokedExpression
 * @returns
 */
function getDefinitions(
  program: ts.Program,
  mayInvokeExpression: ts.CallLikeExpression | ts.AccessExpression,
): readonly ts.Declaration[] | undefined {
  const invokedExpression = getInvokedExpression(mayInvokeExpression);
  if (!invokedExpression) {
    return;
  }
  const { parent } = invokedExpression;
  const typeChecker = program.getTypeChecker();

  let { symbol, failedAliasResolution } = getSymbol(
    invokedExpression,
    typeChecker,
    /*stopAtAlias*/ false,
  );

  // Could not find a symbol e.g. node is string or number keyword,
  // or the symbol was an internal symbol and does not have a declaration e.g. undefined symbol
  if (!symbol) {
    return getDefinitionInfoForIndexSignatures(invokedExpression, typeChecker);
  }

  if (
    parent.kind === SyntaxKind.CallExpression ||
    (parent.kind === SyntaxKind.EtsComponentExpression &&
      (ts as any).isCalledStructDeclaration(symbol.getDeclarations()))
  ) {
    const declarations = symbol.getDeclarations();
    if (
      declarations?.length &&
      declarations[0].kind === SyntaxKind.StructDeclaration
    ) {
      return getDefinitionFromSymbol(typeChecker, symbol, invokedExpression);
    }
  }

  const calledDeclaration = tryGetSignatureDeclaration(
    typeChecker,
    invokedExpression,
  );
  const compilerOptions = program.getCompilerOptions();
  // Don't go to the component constructor definition for a JSX element, just go to the component definition.
  if (
    calledDeclaration &&
    !(
      ts.isJsxOpeningLikeElement(invokedExpression.parent) &&
      isConstructorLike(calledDeclaration)
    ) &&
    !(ts as any).isVirtualConstructor(
      typeChecker,
      calledDeclaration.symbol,
      calledDeclaration,
    )
  ) {
    // For a function, if this is the original function definition, return just sigInfo.
    // If this is the original constructor definition, parent is the class.
    if (
      typeChecker
        .getRootSymbols(symbol)
        .some((s) => symbolMatchesSignature(s, calledDeclaration))
    ) {
      return [calledDeclaration];
    } else if (
      ts.isIdentifier(invokedExpression) &&
      ts.isNewExpression(parent) &&
      compilerOptions.ets?.components.some(
        (component) => component === invokedExpression.escapedText.toString(),
      )
    ) {
      return [calledDeclaration];
    } else {
      const defs =
        getDefinitionFromSymbol(
          typeChecker,
          symbol,
          invokedExpression,
          failedAliasResolution,
          calledDeclaration,
        ) || emptyArray;
      if (
        ts.isIdentifier(invokedExpression) &&
        ts.isEtsComponentExpression(parent)
      ) {
        return [...defs];
      }
      // For a 'super()' call, put the signature first, else put the variable first.
      return invokedExpression.kind === SyntaxKind.SuperKeyword
        ? [calledDeclaration, ...defs]
        : [...defs, calledDeclaration];
    }
  }

  return getDefinitionFromSymbol(
    typeChecker,
    symbol,
    invokedExpression,
    failedAliasResolution,
  );
}

function getCallSiteDeclarations(
  callSite: ts.CallLikeExpression | ts.AccessExpression,
  program: ts.Program,
) {
  const declarations = getDefinitions(program, callSite);
  if (util.isAccessExpression(callSite)) {
    return declarations?.filter((declaration) => ts.isAccessor(declaration));
  } else {
    return declarations?.filter((declaration) =>
      isSignatureDeclaration(declaration) || ts.isClassDeclaration(declaration),
    );
  }
}

function getDefinitionFromSymbol(
  typeChecker: ts.TypeChecker,
  symbol: ts.Symbol,
  node: ts.Node,
  failedAliasResolution?: boolean,
  excludeDeclaration?: ts.Node,
): ts.Declaration[] | undefined {
  const filteredDeclarations = (ts as any).filter(
    symbol.declarations,
    (d: ts.Declaration) => d !== excludeDeclaration,
  );
  const withoutExpandos = (ts as any).filter(
    filteredDeclarations,
    (d: ts.Declaration) => !isExpandoDeclaration(d),
  );
  const results: ts.Declaration[] | undefined = (ts as any).some(
    withoutExpandos,
  )
    ? withoutExpandos
    : filteredDeclarations;
  return (
    getConstructSignatureDefinition() || getCallSignatureDefinition() || results
  );

  function getConstructSignatureDefinition(): ts.Declaration[] | undefined {
    // Applicable only if we are in a new expression, or we are on a constructor declaration
    // and in either case the symbol has a construct signature definition, i.e. class
    if (
      symbol.flags & ts.SymbolFlags.Class &&
      !(symbol.flags & (ts.SymbolFlags.Function | ts.SymbolFlags.Variable)) &&
      ((ts as any).isNewExpressionTarget(node) ||
        node.kind === SyntaxKind.ConstructorKeyword)
    ) {
      const cls =
        (ts as any).find(filteredDeclarations, ts.isClassLike) ||
        (ts as any).Debug.fail(
          "Expected declaration to have at least one class-like declaration",
        );
      return getSignatureDefinition(cls.members, /*selectConstructors*/ true);
    }
  }

  function getCallSignatureDefinition(): ts.Declaration[] | undefined {
    return (ts as any).isCallOrNewExpressionTarget(node) ||
      (ts as any).isNameOfFunctionDeclaration(node)
      ? getSignatureDefinition(
          filteredDeclarations,
          /*selectConstructors*/ false,
        )
      : undefined;
  }

  function getSignatureDefinition(
    declarations: readonly ts.Declaration[] | undefined,
    selectConstructors: boolean,
  ): ts.Declaration[] | undefined {
    if (!declarations) {
      return undefined;
    }
    const filteredDeclarations = declarations.filter(
      selectConstructors ? (ts.isConstructorDeclaration || ts.isClassDeclaration): ts.isFunctionLike,
    );
    const declarationsWithBody = filteredDeclarations.filter(
      (d) => !!(d as ts.FunctionLikeDeclaration).body,
    );

    // declarations defined on the global scope can be defined on multiple files. Get all of them.
    return filteredDeclarations.length
      ? declarationsWithBody.length !== 0
        ? declarationsWithBody
        : [(ts as any).last(filteredDeclarations)]
      : undefined;
  }
}

/**
 * ```ts
 * function f() {}
 * f.foo = 0;
 * ```
 *
 * Here, `f` has two declarations: the function declaration, and the identifier in the next line.
 * The latter is a declaration for `f` because it gives `f` the `SymbolFlags.Namespace` meaning so
 * it can contain `foo`. However, that declaration is pretty uninteresting and not intuitively a
 * "definition" for `f`. Ideally, the question we'd like to answer is "what SymbolFlags does this
 * declaration contribute to the symbol for `f`?" If the answer is just `Namespace` and the
 * declaration looks like an assignment, that declaration is in no sense a definition for `f`.
 * But that information is totally lost during binding and/or symbol merging, so we need to do
 * our best to reconstruct it or use other heuristics. This function (and the logic around its
 * calling) covers our tests but feels like a hack, and it would be great if someone could come
 * up with a more precise definition of what counts as a definition.
 */
function isExpandoDeclaration(node: ts.Declaration): boolean {
  if (!(ts as any).isAssignmentDeclaration(node)) return false;
  const containingAssignment = ts.findAncestor(node, (p) => {
    if ((ts as any).isAssignmentExpression(p)) return true;
    if (!(ts as any).isAssignmentDeclaration(p as ts.Declaration))
      return "quit";
    return false;
  }) as ts.AssignmentExpression<ts.AssignmentOperatorToken> | undefined;
  return (
    !!containingAssignment &&
    (ts as any).getAssignmentDeclarationKind(containingAssignment) ===
      (ts as any).AssignmentDeclarationKind.Property
  );
}

function getSymbol(
  node: ts.Node,
  checker: ts.TypeChecker,
  stopAtAlias: boolean | undefined,
) {
  const symbol = checker.getSymbolAtLocation(node);
  // If this is an alias, and the request came at the declaration location
  // get the aliased symbol instead. This allows for goto def on an import e.g.
  //   import {A, B} from "mod";
  // to jump to the implementation directly.
  let failedAliasResolution = false;
  if (
    symbol?.declarations &&
    symbol.flags & ts.SymbolFlags.Alias &&
    !stopAtAlias &&
    shouldSkipAlias(node, symbol.declarations[0])
  ) {
    const aliased = checker.getAliasedSymbol(symbol);
    if (aliased.declarations) {
      return { symbol: aliased };
    } else {
      failedAliasResolution = true;
    }
  }
  return { symbol, failedAliasResolution };
}

// Go to the original declaration for cases:
//
//   (1) when the aliased symbol was declared in the location(parent).
//   (2) when the aliased symbol is originating from an import.
//
function shouldSkipAlias(node: ts.Node, declaration: ts.Node): boolean {
  if (node.kind !== SyntaxKind.Identifier) {
    return false;
  }
  if (node.parent === declaration) {
    return true;
  }
  if (declaration.kind === SyntaxKind.NamespaceImport) {
    return false;
  }
  return true;
}

// At 'x.foo', see if the type of 'x' has an index signature, and if so find its declarations.
function getDefinitionInfoForIndexSignatures(
  node: ts.Node,
  checker: ts.TypeChecker,
): ts.Declaration[] | undefined {
  return (ts as any).mapDefined(
    (checker as any).getIndexInfosAtLocation(node),
    (info: ts.IndexInfo) => info.declaration,
  );
}

/** Returns a CallLikeExpression where `node` is the target being invoked. */
function getAncestorCallLikeExpression(
  node: ts.Node,
): ts.CallLikeExpression | undefined {
  const target = ts.findAncestor(
    node,
    (n) => !(ts as any).isRightSideOfPropertyAccess(n),
  );
  const callLike = target?.parent;
  return callLike &&
    ts.isCallLikeExpression(callLike) &&
    (ts as any).getInvokedExpression(callLike) === target
    ? callLike
    : undefined;
}

function tryGetSignatureDeclaration(
  typeChecker: ts.TypeChecker,
  node: ts.Node,
): ts.SignatureDeclaration | undefined {
  const callLike = getAncestorCallLikeExpression(node);
  const signature = callLike && typeChecker.getResolvedSignature(callLike);
  // Don't go to a function type, go to the value having that type.
  return (ts as any).tryCast(
    signature && signature.declaration,
    (d: ts.SignatureDeclaration): d is ts.SignatureDeclaration =>
      ts.isFunctionLike(d) && !ts.isFunctionTypeNode(d),
  );
}

function isConstructorLike(node: ts.Node): boolean {
  switch (node.kind) {
    case SyntaxKind.Constructor:
    case SyntaxKind.ConstructorType:
    case SyntaxKind.ConstructSignature:
      return true;
    default:
      return false;
  }
}

/**
 * True if we should not add definitions for both the signature symbol and the definition symbol.
 * True for `const |f = |() => 0`, false for `function |f() {} const |g = f;`.
 * Also true for any assignment RHS.
 */
function symbolMatchesSignature(
  s: ts.Symbol,
  calledDeclaration: ts.SignatureDeclaration,
) {
  return (
    s === calledDeclaration.symbol ||
    s === (calledDeclaration.symbol as any).parent ||
    (ts as any).isAssignmentExpression(calledDeclaration.parent) ||
    (!ts.isCallLikeExpression(calledDeclaration.parent) &&
      s === calledDeclaration.parent.symbol)
  );
}

interface ContextWithStartAndEndNode {
  start: ts.Node;
  end: ts.Node;
}

type ContextNode = ts.Node | ContextWithStartAndEndNode;
interface NodeEntry {
  // readonly kind: NodeEntryKind;
  readonly node: ts.Node;
  readonly context?: ContextNode;
}

/**
 * Customized version of ts.FindAllReferences.getImplementationsAtPosition
 *
 * @param program
 * @param mayInvokeExpression
 * @returns
 */
function getImplementations(
  program: ts.Program,
  mayInvokeExpression: ts.CallLikeExpression | ts.AccessExpression,
): ts.Node[] | undefined {
  const invokedExpression = getInvokedExpression(mayInvokeExpression);
  if (!invokedExpression) {
    return;
  }

  let referenceEntries: NodeEntry[] | undefined;
  const position = invokedExpression.getStart();
  const entries = getImplementationReferenceEntries(
    program,
    cancellationToken,
    program.getSourceFiles(),
    invokedExpression,
    position,
  );

  if (
    invokedExpression.parent.kind === SyntaxKind.PropertyAccessExpression ||
    invokedExpression.parent.kind === SyntaxKind.BindingElement ||
    invokedExpression.parent.kind === SyntaxKind.ElementAccessExpression ||
    invokedExpression.kind === SyntaxKind.SuperKeyword
  ) {
    referenceEntries = entries && [...entries];
  } else if (entries) {
    const queue = (ts as any).createQueue(entries);
    const seenNodes = new Map<number, true>();
    while (!queue.isEmpty()) {
      const entry = queue.dequeue() as NodeEntry;
      if (
        !(ts as any).addToSeen(seenNodes, (ts as any).getNodeId(entry.node))
      ) {
        continue;
      }
      referenceEntries = (ts as any).append(referenceEntries, entry);
      const entries = getImplementationReferenceEntries(
        program,
        cancellationToken,
        program.getSourceFiles(),
        entry.node,
        entry.node.pos,
      );
      if (entries) {
        queue.enqueue(...entries);
      }
    }
  }

  const implementations: ts.Node[] = [];
  referenceEntries?.forEach((entry) => {
    const entryNode = entry.node;
    const parent = entryNode.parent;

    let signatureDeclaration = isSignatureDeclaration(entryNode)
      ? entryNode
      : isSignatureDeclaration(parent)
        ? parent
        : undefined;

    let valueNode: ts.Expression | undefined;
    if (!signatureDeclaration) {
      switch (parent.kind) {
        case SyntaxKind.VariableDeclaration:
          valueNode = (parent as ts.VariableDeclaration).initializer;
          break;

        case SyntaxKind.BinaryExpression:
          valueNode = (parent as ts.BinaryExpression).right;
          break;
      }

      if (isSignatureDeclaration(valueNode)) {
        signatureDeclaration = valueNode;
      }
    }

    // If the call site is a NewExpression, try to get the Constructor with body or the best matching constructor.
    if (!signatureDeclaration && ts.isNewExpression(mayInvokeExpression)) {
      const classLikeDeclaration = ts.isClassLike(parent)
        ? parent
        : valueNode && ts.isClassLike(valueNode)
          ? valueNode
          : undefined;

      signatureDeclaration = classLikeDeclaration?.members.find(
        (member) => ts.isConstructorDeclaration(member) && !!member.body,
      ) as ts.ConstructorDeclaration | undefined;

      // mayInvokeExpression maybe new class instance with no arg. eg. new SomeClass().
      // then its declaration is ClassDeclaration
      if (!signatureDeclaration) {
        const classDeclaration = ts.isClassDeclaration(parent)
          ? parent
          : valueNode && ts.isClassDeclaration(valueNode)
          ? valueNode
          : undefined;
        if (classDeclaration) {
          implementations.push(classDeclaration);
        }
      }
      
      if (!signatureDeclaration) {
        signatureDeclaration = tryGetSignatureDeclaration(
          program.getTypeChecker(),
          invokedExpression,
        );
      }

      
    }

    if (signatureDeclaration) {
      if (util.isAccessExpression(mayInvokeExpression)) {
        if (ts.isAccessor(signatureDeclaration)) {
          implementations.push(signatureDeclaration);
        }
      } else {
        implementations.push(signatureDeclaration);
      }
    }
  });

  return implementations;
}

function getImplementationReferenceEntries(
  program: ts.Program,
  cancellationToken: ts.CancellationToken,
  sourceFiles: readonly ts.SourceFile[],
  node: ts.Node,
  position: number,
): readonly NodeEntry[] | undefined {
  if (node.kind === SyntaxKind.SourceFile) {
    return undefined;
  }

  const checker = program.getTypeChecker();
  // If invoked directly on a shorthand property assignment, then return
  // the declaration of the symbol being assigned (not the symbol being assigned to).
  if (node.parent.kind === SyntaxKind.ShorthandPropertyAssignment) {
    const result: NodeEntry[] = [];
    (
      ts as any
    ).FindAllReferences.Core.getReferenceEntriesForShorthandPropertyAssignment(
      node,
      checker,
      (node: ts.Node) => {
        result.push((ts as any).FindAllReferences.nodeEntry(node));
      },
    );
    return result;
  } else if (
    node.kind === SyntaxKind.SuperKeyword ||
    (ts as any).isSuperProperty(node.parent)
  ) {
    // References to and accesses on the super keyword only have one possible implementation, so no
    // need to "Find all References"
    const symbol = checker.getSymbolAtLocation(node);
    return (
      symbol &&
      symbol.valueDeclaration && [
        (ts as any).FindAllReferences.nodeEntry(symbol.valueDeclaration),
      ]
    );
  } else {
    // Perform "Find all References" and retrieve only those that are implementations
    return (ts as any).FindAllReferences.getReferenceEntriesForNode(
      position,
      node,
      program,
      sourceFiles,
      cancellationToken,
      {
        implementations: true,
        use: (ts as any).FindAllReferences.FindReferencesUse.References,
      },
    );
  }
}

function getInvokedExpression(
  node: ts.CallLikeExpression | ts.AccessExpression,
): ts.Expression | undefined {
  let expression: ts.LeftHandSideExpression;
  switch (node.kind) {
    case SyntaxKind.TaggedTemplateExpression:
      expression = node.tag;
      break;
    case SyntaxKind.JsxOpeningElement:
    case SyntaxKind.JsxSelfClosingElement:
      expression = node.tagName;
      break;
    case SyntaxKind.PropertyAccessExpression:
    case SyntaxKind.ElementAccessExpression:
      expression = node;
      break;
    case SyntaxKind.CallExpression:
    case SyntaxKind.NewExpression:
    case SyntaxKind.Decorator:
    case SyntaxKind.EtsComponentExpression:
      expression = node.expression;
      break;
  }

  switch (expression.kind) {
    case SyntaxKind.PropertyAccessExpression:
      return (expression as ts.PropertyAccessExpression).name;

    case SyntaxKind.ElementAccessExpression:
      const argumentExpression = (expression as ts.ElementAccessExpression)
        .argumentExpression;
      if (
        argumentExpression.kind === SyntaxKind.StringLiteral ||
        argumentExpression.kind === SyntaxKind.NumericLiteral
      ) {
        return argumentExpression;
      }
      break;

    case SyntaxKind.Identifier:
    case SyntaxKind.PrivateIdentifier:
    case SyntaxKind.ThisKeyword:
    case SyntaxKind.SuperKeyword:
    case SyntaxKind.ImportKeyword:
      return expression;
  }
}

const cancellationToken: ts.CancellationToken = {
  isCancellationRequested: () => false,
  throwIfCancellationRequested: () => {},
};

function extractCallSiteImplementations(
  callSite: ts.CallLikeExpression | ts.AccessExpression,
  program: ts.Program,
  projectPath?: string,
) {
  const callSiteImplementations: prisma.call_site_implementation[] = [];
  let implementations = getImplementations(program, callSite);

  if (
    implementations?.every(
      (implementation) => !(implementation as ts.FunctionLikeDeclaration).body,
    )
  ) {
    implementations = getCallSiteDeclarations(callSite, program);
  }

  const implementationIdSet = new Set<bigint>();

  implementations?.forEach((implementation) => {
    const callSiteId = util.getCorefIdFromTsNodeInSameFile(callSite);
    const implementationId = util.getCorefIdFromTsNode(
      implementation,
      projectPath,
    );

    if (implementationIdSet.has(implementationId)) {
      return;
    }

    implementationIdSet.add(implementationId);
    callSiteImplementations.push({
      id: computeCallSiteImplementationId(callSiteId, implementationId),
      call_site_id: callSiteId,
      implementation_id: implementationId,
    });
  });

  return callSiteImplementations;
}

function extractCallSiteDeclarations(
  callSite: ts.CallLikeExpression | ts.AccessExpression,
  program: ts.Program,
  projectPath?: string,
) {
  const callSiteDeclarations: prisma.call_site_declaration[] = [];
  const declarations = getCallSiteDeclarations(callSite, program);
  const declarationIdSet = new Set<bigint>();

  declarations?.forEach((declaration) => {
    const callSiteId = util.getCorefIdFromTsNodeInSameFile(callSite);
    const declarationId = util.getCorefIdFromTsNode(declaration, projectPath);

    if (declarationIdSet.has(declarationId)) {
      return;
    }

    declarationIdSet.add(declarationId);
    callSiteDeclarations.push({
      id: computeCallSiteDeclarationId(callSiteId, declarationId),
      call_site_id: callSiteId,
      declaration_id: declarationId,
    });
  });

  return callSiteDeclarations;
}

/**
 * Extract call sites and the corresponding callees
 */
export function extractCallSites(
  program: ts.Program,
  sourceFile: ts.SourceFile,
  projectPath?: string | undefined,
) {
  const callSiteDeclarations: prisma.call_site_declaration[] = [];
  const callSiteImplementations: prisma.call_site_implementation[] = [];

  util.forEachNode(sourceFile, (tsNode: ts.Node) => {
    if (!util.isMayInvokeExpression(tsNode)) {
      return;
    }

    callSiteDeclarations.push(
      ...extractCallSiteDeclarations(tsNode, program, projectPath),
    );

    callSiteImplementations.push(
      ...extractCallSiteImplementations(tsNode, program, projectPath),
    );
  });

  return {
    callSiteDeclarations,
    callSiteImplementations,
  };
}
