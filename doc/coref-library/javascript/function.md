# Global Function of coref.javascript.gdl

## isOverrideKeyword

```rust
/**
 * Determines whether a node is an `override` keyword.
 */
```
```rust
pub fn isOverrideKeyword(node: Node) -> bool;
```
## isReadonlyKeyword

```rust
/**
 * Determines whether a node is a `readonly` keyword.
 */
```
```rust
pub fn isReadonlyKeyword(node: Node) -> bool;
```
## isDeclareKeyword

```rust
/**
 * Determines whether a node is a `declare` keyword.
 */
```
```rust
pub fn isDeclareKeyword(node: Node) -> bool;
```
## isStaticKeyword

```rust
/**
 * Determines whether a node is a `static` keyword.
 */
```
```rust
pub fn isStaticKeyword(node: Node) -> bool;
```
## isPrivateKeyword

```rust
/**
 * Determines whether a node is a `private` keyword.
 */
```
```rust
pub fn isPrivateKeyword(node: Node) -> bool;
```
## isExportKeyword

```rust
/**
 * Determines whether a node is an `export` keyword.
 */
```
```rust
pub fn isExportKeyword(node: Node) -> bool;
```
## isDefaultKeyword

```rust
/**
 * Determines whether a node is a `default` keyword.
 */
```
```rust
pub fn isDefaultKeyword(node: Node) -> bool;
```
## isConstKeyword

```rust
/**
 * Determines whether a node is a `const` keyword.
 */
```
```rust
pub fn isConstKeyword(node: Node) -> bool;
```
## isModifier

```rust
/**
 * Determines whether a node is a modifier.
 */
```
```rust
pub fn isModifier(node: Node) -> bool;
```
## isJsxExpression

```rust
/**
 * Determines whether a node is a JSX closing fragment.
 */
```
```rust
pub fn isJsxExpression(node: Node) -> bool;
```
## isJsxSpreadAttribute

```rust
/**
 * Determines whether a node is a JSX spread attribute.
 */
```
```rust
pub fn isJsxSpreadAttribute(node: Node) -> bool;
```
## isJsxAttributes

```rust
/**
 * Determines whether a node is a JSX attributes.
 */
```
```rust
pub fn isJsxAttributes(node: Node) -> bool;
```
## isJsxAttribute

```rust
/**
 * Determines whether a node is a JSX attribute.
 */
```
```rust
pub fn isJsxAttribute(node: Node) -> bool;
```
## isJsxClosingFragment

```rust
/**
 * Determines whether a node is a JSX closing fragment.
 */
```
```rust
pub fn isJsxClosingFragment(node: Node) -> bool;
```
## isJsxOpeningFragment

```rust
/**
 * Determines whether a node is a JSX opening fragment.
 */
```
```rust
pub fn isJsxOpeningFragment(node: Node) -> bool;
```
## isJsxFragment

```rust
/**
 * Determines whether a node is a JSX fragment.
 */
```
```rust
pub fn isJsxFragment(node: Node) -> bool;
```
## isJsxClosingElement

```rust
/**
 * Determines whether a node is a JSX closing element.
 */
```
```rust
pub fn isJsxClosingElement(node: Node) -> bool;
```
## isJsxElement

```rust
/**
 * Determines whether a node is a JSX element.
 */
```
```rust
pub fn isJsxElement(node: Node) -> bool;
```
## isPropertyName

```rust
/**
 * Determines whether a node is a property name.
 */
```
```rust
pub fn isPropertyName(node: Node) -> bool;
```
## isComputedPropertyName

```rust
/**
 * Determines whether a node is a computed property name.
 */
```
```rust
pub fn isComputedPropertyName(node: Node) -> bool;
```
## isObjectLiteralElement

```rust
/**
 * Determines whether a node is an object literal element.
 */
```
```rust
pub fn isObjectLiteralElement(node: Node) -> bool;
```
## isSpreadAssignment

```rust
/**
 * Determines whether a node is a spread assignment.
 */
```
```rust
pub fn isSpreadAssignment(node: Node) -> bool;
```
## isShorthandPropertyAssignment

```rust
/**
 * Determines whether a node is a shorthand property assignment.
 */
```
```rust
pub fn isShorthandPropertyAssignment(node: Node) -> bool;
```
## isStatementKindButNotDeclarationKind

```rust
/**
 * Determines whether a node kind is a statement kind, but not a declaration kind
 */
```
```rust
pub fn isStatementKindButNotDeclarationKind(kind: int) -> bool;
```
## isIterationStatementKind

```rust
/**
 * Determines whether a node kind is an iteration statement kind,
 * including `while`, `do`-`while`, `for` and enhanced `for` (`for`-`in`, `for`-`of`) statements.
 */
```
```rust
pub fn isIterationStatementKind(kind: int) -> bool;
```
## isEndOfDeclarationMarker

```rust
/**
 * Determines whether a node is an end-of-declaration marker.
 */
```
```rust
pub fn isEndOfDeclarationMarker(node: Node) -> bool;
```
## isMergeDeclarationMarker

```rust
/**
 * Determines whether a node is a merge-declaration marker.
 */
```
```rust
pub fn isMergeDeclarationMarker(node: Node) -> bool;
```
## isNotEmittedStatement

```rust
/**
 * Determines whether a node is a not-emmitted statement.
 */
```
```rust
pub fn isNotEmittedStatement(node: Node) -> bool;
```
## isDebuggerStatement

```rust
/**
 * Determines whether a node is a `debugger` statement.
 */
```
```rust
pub fn isDebuggerStatement(node: Node) -> bool;
```
## isThrowStatement

```rust
/**
 * Determines whether a node is a `throw` statement
 */
```
```rust
pub fn isThrowStatement(node: Node) -> bool;
```
## isSwitchStatement

```rust
/**
 * Determines whether a node is an `switch` statement
 */
```
```rust
pub fn isSwitchStatement(node: Node) -> bool;
```
## isCaseBlock

```rust
/**
 * Determines whether a node is a `switch`-`case` block.
 */
```
```rust
pub fn isCaseBlock(node: Node) -> bool;
```
## isCatchClause

```rust
/**
 * Determines whether a node is an `catch` clause
 */
```
```rust
pub fn isCatchClause(node: Node) -> bool;
```
## isDefaultClause

```rust
/**
 * Determines whether a node is an `default` clause
 */
```
```rust
pub fn isDefaultClause(node: Node) -> bool;
```
## isCaseClause

```rust
/**
 * Determines whether a node is an `case` clause
 */
```
```rust
pub fn isCaseClause(node: Node) -> bool;
```
## isMissingDeclaration

```rust
/**
 * Determines whether a node is a missing declaration.
 */
```
```rust
pub fn isMissingDeclaration(node: Node) -> bool;
```
## isExportDeclaration

```rust
/**
 * Determines whether a node is an export declaration.
 */
```
```rust
pub fn isExportDeclaration(node: Node) -> bool;
```
## isModuleDeclaration

```rust
/**
 * Determines whether a node is a module declaration.
 */
```
```rust
pub fn isModuleDeclaration(node: Node) -> bool;
```
## isFunctionDeclaration

```rust
/**
 * Determines whether a node is a function declaration.
 */
```
```rust
pub fn isFunctionDeclaration(node: Node) -> bool;
```
## isWithStatement

```rust
/**
 * Determines whether a node is a `with` statement
 */
```
```rust
pub fn isWithStatement(node: Node) -> bool;
```
## isReturnStatement

```rust
/**
 * Determines whether a node is a `return` statement
 */
```
```rust
pub fn isReturnStatement(node: Node) -> bool;
```
## isEnhancedForStatement

```rust
/**
 * Determines whether a node is a `for`-`in` or `for`-`of` statement
 */
```
```rust
pub fn isEnhancedForStatement(node: Node) -> bool;
```
## isForInitializer

```rust
/**
 * Determines whether a node is a initializer of for statement or enhanced for statement.
 */
```
```rust
pub fn isForInitializer(node: Node) -> bool;
```
## isRelationalOperator

```rust
/**
 * Determines whether a node is a relational operator `<`, `<=`, `>`, `>=`, `instanceof` or `in`.
 */
```
```rust
pub fn isRelationalOperator(node: Node) -> bool;
```
## postDominanceFrontier

```rust
/**
 * Hold bb's post dominance frontier.
 * bb post dominates at least one of pdf's successor,
 * but bb don't strictly post dominates pdf.
 */
```
```rust
pub fn postDominanceFrontier(bb: BasicBlock, pdf: BasicBlock) -> bool;
```
## isForStatement

```rust
/**
 * Determines whether a node is a `for` statement
 */
```
```rust
pub fn isForStatement(node: Node) -> bool;
```
## isDoWhileStatement

```rust
/**
 * Determines whether a node is a `do`-`while` statement
 */
```
```rust
pub fn isDoWhileStatement(node: Node) -> bool;
```
## isIfStatement

```rust
/**
 * Determines whether a node is an `if` statement
 */
```
```rust
pub fn isIfStatement(node: Node) -> bool;
```
## isExpressionStatement

```rust
/**
 * Determines whether a node is an expression statement
 */
```
```rust
pub fn isExpressionStatement(node: Node) -> bool;
```
## isStatement

```rust
/**
 * Determines whether a node is a statement
 */
```
```rust
pub fn isStatement(node: Node) -> bool;
```
## isStatementButNotDeclaration

```rust
/**
 * Determines whether a node is a statement, but not a declaration
 */
```
```rust
pub fn isStatementButNotDeclaration(node: Node) -> bool;
```
## isBitwiseOrAssignmentExpression

```rust
/**
 * Determines whether a node is a bitwise OR assignment expression using `|=`.
 */
```
```rust
pub fn isBitwiseOrAssignmentExpression(node: Node) -> bool;
```
## isDeclarationStatement

```rust
/**
 * Determines whether a node is a declaration statement
 */
```
```rust
pub fn isDeclarationStatement(node: Node) -> bool;
```
## isRelationalOperatorOrHigher

```rust
/**
 * Determines whether a node is a relational operator or higher.
 */
```
```rust
pub fn isRelationalOperatorOrHigher(node: Node) -> bool;
```
## isAnyKeyword

```rust
/**
 * Determines whether a node is an `any` keyword.
 */
```
```rust
pub fn isAnyKeyword(node: Node) -> bool;
```
## isAmpersandToken

```rust
/**
 * Determines whether a node is a `&` token.
 */
```
```rust
pub fn isAmpersandToken(node: Node) -> bool;
```
## lvalueFlowEdge

```rust
pub fn lvalueFlowEdge(predecessor: DataFlowNode, successor: DataFlowNode) -> bool;
```
## isSlashToken

```rust
/**
 * Determines whether a node is a `/` token.
 */
```
```rust
pub fn isSlashToken(node: Node) -> bool;
```
## isBigIntLiteral

```rust
/**
 * Determines whether a node is a big-int literal.
 */
```
```rust
pub fn isBigIntLiteral(node: Node) -> bool;
```
## defLValue

```rust
/**
 * The relation of definitions and lvalues
 */
```
```rust
pub fn defLValue(def: ControlFlowNode, lValue: RefExpr) -> bool;
```
## isImportClause

```rust
/**
 * Determines whether a node is an import clause.
 */
```
```rust
pub fn isImportClause(node: Node) -> bool;
```
## isBindingName

```rust
/**
 * Determines whether a node is a binding name.
 */
```
```rust
pub fn isBindingName(node: Node) -> bool;
```
## isArrayBindingElement

```rust
/**
 * Determines whether a node is an array binding element.
 */
```
```rust
pub fn isArrayBindingElement(node: Node) -> bool;
```
## isExpressionWithTypeArguments

```rust
/**
 * Determines whether a node is an expression with type arguments.
 */
```
```rust
pub fn isExpressionWithTypeArguments(node: Node) -> bool;
```
## isBindingElement

```rust
/**
 * Determines whether a node is a binding element.
 */
```
```rust
pub fn isBindingElement(node: Node) -> bool;
```
## isMemberName

```rust
/**
 * Determines whether a node is a member name.
 */
```
```rust
pub fn isMemberName(node: Node) -> bool;
```
## isVariableDeclaration

```rust
/**
 * Determines whether a node is a variable declaration
 */
```
```rust
pub fn isVariableDeclaration(node: Node) -> bool;
```
## isParameter

```rust
/**
 * Determines whether a node kind is a parameter.
 */
```
```rust
pub fn isParameter(node: Node) -> bool;
```
## isTypeParameter

```rust
/**
 * Determines whether a node is a type parameter.
 */
```
```rust
pub fn isTypeParameter(node: Node) -> bool;
```
## isVariableDeclarationListKind

```rust
/**
 * Determines whether a node kind is a variable declaration list kind
 */
```
```rust
pub fn isVariableDeclarationListKind(kind: int) -> bool;
```
## isObjectKeyword

```rust
/**
 * Determines whether a node is an `object` keyword.
 */
```
```rust
pub fn isObjectKeyword(node: Node) -> bool;
```
## isExternalModuleReference

```rust
/**
 * Determines whether a node is an external module reference.
 */
```
```rust
pub fn isExternalModuleReference(node: Node) -> bool;
```
## isNamedExports

```rust
/**
 * Determines whether a node is a named exports.
 */
```
```rust
pub fn isNamedExports(node: Node) -> bool;
```
## immediateFlowEdge

```rust
pub fn immediateFlowEdge(predecessor: DataFlowNode, successor: DataFlowNode) -> bool;
```
## isLiteralType

```rust
/**
 * Determines whether a node is a literal type.
 */
```
```rust
pub fn isLiteralType(node: Node) -> bool;
```
## isImportSpecifier

```rust
/**
 * Determines whether a node is an import specifier.
 */
```
```rust
pub fn isImportSpecifier(node: Node) -> bool;
```
## isNamespaceImport

```rust
/**
 * Determines whether a node is a namespace import.
 */
```
```rust
pub fn isNamespaceImport(node: Node) -> bool;
```
## isTypeNode

```rust
/**
 * Determines whether a node is a type node.
 */
```
```rust
pub fn isTypeNode(node: Node) -> bool;
```
## isMetaProperty

```rust
/**
 * Determines whether a node is a meta property.
 */
```
```rust
pub fn isMetaProperty(node: Node) -> bool;
```
## isQualifiedName

```rust
/**
 * Determines whether a node is a qualified name.
 */
```
```rust
pub fn isQualifiedName(node: Node) -> bool;
```
## isObjectLiteralExpression

```rust
/**
 * Determines whether a node is an object literal expression.
 */
```
```rust
pub fn isObjectLiteralExpression(node: Node) -> bool;
```
## isTemplateLiteralLikeNode

```rust
/**
 * Determines whether a node is a template literal-like node, which is a no-substitution template literal, template head, template middle or template tail.
 */
```
```rust
pub fn isTemplateLiteralLikeNode(node: Node) -> bool;
```
## isFunctionLikeKind

```rust
/**
 * Determines whether a node kind is a FunctionLike kind
 */
```
```rust
pub fn isFunctionLikeKind(kind: int) -> bool;
```
## completion

```rust
pub fn completion(id: int, name: string) -> bool;
```
## isFalseKeyword

```rust
/**
 * Determines whether a node is a `false` keyword.
 */
```
```rust
pub fn isFalseKeyword(node: Node) -> bool;
```
## isBlockStatement

```rust
/**
 * Determines whether a node is a block statement
 */
```
```rust
pub fn isBlockStatement(node: Node) -> bool;
```
## isContinueCompletion

```rust
pub fn isContinueCompletion(c: Completion) -> bool;
```
## isYieldCompletion

```rust
pub fn isYieldCompletion(c: Completion) -> bool;
```
## isEqualityOperator

```rust
/**
 * Determines whether a node is an equality operator `==`, `!=`, `===` or `!==`.
 */
```
```rust
pub fn isEqualityOperator(node: Node) -> bool;
```
## isUpdateOperator

```rust
/**
 * Determines whether a node is an update operator.
 */
```
```rust
pub fn isUpdateOperator(node: Node) -> bool;
```
## isTrueBooleanCompletion

```rust
pub fn isTrueBooleanCompletion(c: Completion) -> bool;
```
## isNormalCompletion

```rust
pub fn isNormalCompletion(c: Completion) -> bool;
```
## bbNotPostDominates

```rust
/**
 * Hold if npdomBB don't post dominates bb.
 * the relation is same as not dominates relation but apply to Reverse-CFG.
 */
```
```rust
pub fn bbNotPostDominates(npdomBB: BasicBlock, bb: BasicBlock) -> bool;
```
## bbStrictDominates

```rust
/**
 * Hold if sdomBB strictly dominates bb.
 */
```
```rust
pub fn bbStrictDominates(sdomBB: BasicBlock, bb: BasicBlock) -> bool;
```
## bbDominates

```rust
/**
 * Hold if domBB dominates bb.
 */
```
```rust
pub fn bbDominates(domBB: BasicBlock, bb: BasicBlock) -> bool;
```
## bbNotDominates

```rust
/**
 * Hold if ndomBB don't dominates bb.
 */
```
```rust
pub fn bbNotDominates(ndomBB: BasicBlock, bb: BasicBlock) -> bool;
```
## entryBBReachableBB

```rust
/**
 * Hold the entry BB and it's all reachable BBs.
 */
```
```rust
pub fn entryBBReachableBB(entryBB: BasicBlock, reachableBB: BasicBlock) -> bool;
```
## isForOfStatement

```rust
/**
 * Determines whether a node is a `for`-`of` statement
 */
```
```rust
pub fn isForOfStatement(node: Node) -> bool;
```
## bbStrictPostDominates

```rust
/**
 * Hold if spdom strictly post dominates bb.
 */
```
```rust
pub fn bbStrictPostDominates(spdomBB: BasicBlock, bb: BasicBlock) -> bool;
```
## nodeInSameCFG

```rust
/**
 * Hold if two control flow nodes are in same CFG.
 */
```
```rust
pub fn nodeInSameCFG(cfn1: ControlFlowNode, cfn2: ControlFlowNode) -> bool;
```
## isStrictInequalityExpression

```rust
/**
 * Determines whether a node is a strict inequality expression using `!==`.
 */
```
```rust
pub fn isStrictInequalityExpression(node: Node) -> bool;
```
## isConditionalExpression

```rust
/**
 * Determines whether a node is a conditional expression.
 */
```
```rust
pub fn isConditionalExpression(node: Node) -> bool;
```
## isExportSpecifier

```rust
/**
 * Determines whether a node is an export specifier.
 */
```
```rust
pub fn isExportSpecifier(node: Node) -> bool;
```
## isLogicalAndAssignmentExpression

```rust
/**
 * Determines whether a node is a logical AND assignment expression using `&&=`.
 */
```
```rust
pub fn isLogicalAndAssignmentExpression(node: Node) -> bool;
```
## isPublicKeyword

```rust
/**
 * Determines whether a node is a `public` keyword.
 */
```
```rust
pub fn isPublicKeyword(node: Node) -> bool;
```
## isClassElementKind

```rust
/**
 * Determines whether a node kind is a ClassElement kind
 */
```
```rust
pub fn isClassElementKind(kind: int) -> bool;
```
## isClassLikeDeclarationKind

```rust
/**
 * Determines whether a node kind is a ClassLikeDeclaration kind
 */
```
```rust
pub fn isClassLikeDeclarationKind(kind: int) -> bool;
```
## isClassLikeDeclaration

```rust
/**
 * Determines whether a node is a ClassLikeDeclaration
 */
```
```rust
pub fn isClassLikeDeclaration(node: Node) -> bool;
```
## isMappedType

```rust
/**
 * Determines whether a node is a mapped type.
 */
```
```rust
pub fn isMappedType(node: Node) -> bool;
```
## isSameRefExpr

```rust
/**
 * Determine whether 2 RefExpr with same "symbol".
 * Actually we want to determine 2 written locations have alias.
 * Current we depend on symbol information calculated by tsc, should
 * improve this predicated if needed.
 */
```
```rust
pub fn isSameRefExpr(refExpr1: RefExpr, refExpr2: RefExpr) -> bool;
```
## defLiveAtBBExit

```rust
/**
 * Gets the LValue nodes live at the exit of BB.
 */
```
```rust
pub fn defLiveAtBBExit(bb: BasicBlock) -> LValue;
```
## defLiveAtBBEntry

```rust
/**
 * Gets the LValue nodes live at the entry of BB.
 */
```
```rust
pub fn defLiveAtBBEntry(bb: BasicBlock) -> LValue;
```
## killedByBB

```rust
/**
 * Determine whether the lvalue is killed by bb.
 */
```
```rust
pub fn killedByBB(bb: BasicBlock, lvalue: LValue) -> bool;
```
## killedByBBWithKiller

```rust
/**
 * Gets the killers in BB that kill the given lvalue, with BB index.
 */
```
```rust
pub fn killedByBBWithKiller(bb: BasicBlock, lvalue: LValue, killer: LValue, index: int) -> bool;
```
## useAtBB

```rust
/**
 * Gets the VarUse used in bb, with bb index
 */
```
```rust
pub fn useAtBB(bb: BasicBlock, varUse: VarUse, index: int) -> bool;
```
## defAtBB

```rust
/**
 * Gets the lvalue defined in bb, with bb index
 */
```
```rust
pub fn defAtBB(bb: BasicBlock, lvalue: LValue, index: int) -> bool;
```
## defnWithRhs

```rust
pub fn defnWithRhs(def: ControlFlowNode, lhs: Expression, rhs: Expression) -> bool;
```
## isMayInvokeExpression

```rust
/**
 * Determines whether a node is a CallLikeExpression or AccessExpression that may invoke a FunctionLikeDeclaration.
 */
```
```rust
pub fn isMayInvokeExpression(node: Node) -> bool;
```
## isNamedImports

```rust
/**
 * Determines whether a node is a named imports.
 */
```
```rust
pub fn isNamedImports(node: Node) -> bool;
```
## isDecorator

```rust
/**
 * Determines whether a node is a decorator.
 */
```
```rust
pub fn isDecorator(node: Node) -> bool;
```
## isDecrementExpression

```rust
/**
 * Determines whether a node is a decrement expression using `--`.
 */
```
```rust
pub fn isDecrementExpression(node: Node) -> bool;
```
## isIncrementExpression

```rust
/**
 * Determines whether a node is an increment expression using `++`.
 */
```
```rust
pub fn isIncrementExpression(node: Node) -> bool;
```
## isPostfixIncrementExpression

```rust
/**
 * Determines whether a node is a postfix increment expression using `++`.
 */
```
```rust
pub fn isPostfixIncrementExpression(node: Node) -> bool;
```
## isLogicalNotExpression

```rust
/**
 * Determines whether a node is a logical NOT expression using `!`.
 */
```
```rust
pub fn isLogicalNotExpression(node: Node) -> bool;
```
## postDominates

```rust
/**
 * Hold if pdom post dominates cfn.
 */
```
```rust
pub fn postDominates(pdom: ControlFlowNode, cfn: ControlFlowNode) -> bool;
```
## isUnaryMinusExpression

```rust
/**
 * Determines whether a node is an unary minus (also known as negation) expression using `-`.
 */
```
```rust
pub fn isUnaryMinusExpression(node: Node) -> bool;
```
## isUnaryPlusExpression

```rust
/**
 * Determines whether a node is an unary plus expression using `+`.
 */
```
```rust
pub fn isUnaryPlusExpression(node: Node) -> bool;
```
## isPrefixIncrementExpression

```rust
/**
 * Determines whether a node is a prefix increment expression using `++`.
 */
```
```rust
pub fn isPrefixIncrementExpression(node: Node) -> bool;
```
## succ

```rust
/**
 * Gets the control flow successor node of a control flow node,
 * and with the Completion information.
 */
```
```rust
pub fn succ(n: ControlFlowNode, c: Completion) -> *ControlFlowNode;
```
## isRightShiftAssignmentExpression

```rust
/**
 * Determines whether a node is a right shift assignment expression using `>>=`.
 */
```
```rust
pub fn isRightShiftAssignmentExpression(node: Node) -> bool;
```
## isBitwiseXorAssignmentExpression

```rust
/**
 * Determines whether a node is a bitwise XOR assignment expression using `^=`.
 */
```
```rust
pub fn isBitwiseXorAssignmentExpression(node: Node) -> bool;
```
## isBitwiseNotExpression

```rust
/**
 * Determines whether a node is a bitwise NOT expression using `~`.
 */
```
```rust
pub fn isBitwiseNotExpression(node: Node) -> bool;
```
## isDivisionAssignmentExpression

```rust
/**
 * Determines whether a node is a division assignment expression using `/=`.
 */
```
```rust
pub fn isDivisionAssignmentExpression(node: Node) -> bool;
```
## isMultiplicationAssignmentExpression

```rust
/**
 * Determines whether a node is a multiplication assignment expression using `*=`.
 */
```
```rust
pub fn isMultiplicationAssignmentExpression(node: Node) -> bool;
```
## isExponentiationAssignmentExpression

```rust
/**
 * Determines whether a node is an exponentiation assignment expression using `**=`.
 */
```
```rust
pub fn isExponentiationAssignmentExpression(node: Node) -> bool;
```
## isEmptyStatement

```rust
/**
 * Determines whether a node is an empty statement.
 */
```
```rust
pub fn isEmptyStatement(node: Node) -> bool;
```
## isSubtractionAssignmentExpression

```rust
/**
 * Determines whether a node is a subtraction assignment expression using `-=`.
 */
```
```rust
pub fn isSubtractionAssignmentExpression(node: Node) -> bool;
```
## isAdditionAssignmentExpression

```rust
/**
 * Determines whether a node is an addition assignment expression using `+=`.
 */
```
```rust
pub fn isAdditionAssignmentExpression(node: Node) -> bool;
```
## isRightShiftExpression

```rust
/**
 * Determines whether a node is a signed right-shift expression using `>>`.
 */
```
```rust
pub fn isRightShiftExpression(node: Node) -> bool;
```
## isAssignmentExpression

```rust
/**
 * Determines whether a node is an assignment expression, either compound or simple.
 */
```
```rust
pub fn isAssignmentExpression(node: Node) -> bool;
```
## isNullishCoalescingExpression

```rust
/**
 * Determines whether a node is a nullish coalescing expression using `??`.
 */
```
```rust
pub fn isNullishCoalescingExpression(node: Node) -> bool;
```
## isLogicalOrExpression

```rust
/**
 * Determines whether a node is a logical OR expression using `||`.
 */
```
```rust
pub fn isLogicalOrExpression(node: Node) -> bool;
```
## isLogicalAndExpression

```rust
/**
 * Determines whether a node is a logical AND expression using `&&`.
 */
```
```rust
pub fn isLogicalAndExpression(node: Node) -> bool;
```
## continues

```rust
/**
 * If the body of loop finishes with completion,
 * the loop will continue executing.
 */
```
```rust
pub fn continues(c: Completion, loop: IterationStatement) -> bool;
```
## isBinaryLogicalExpression

```rust
/**
 * Determines whether a node is a binary logical expression using
 * `&&`, `||` or `??`.
 */
```
```rust
pub fn isBinaryLogicalExpression(node: Node) -> bool;
```
## isBitwiseXorExpression

```rust
/**
 * Determines whether a node is a bitwise XOR expression using `^`.
 */
```
```rust
pub fn isBitwiseXorExpression(node: Node) -> bool;
```
## isBitwiseAndExpression

```rust
/**
 * Determines whether a node is a bitwise AND expression using `&`.
 */
```
```rust
pub fn isBitwiseAndExpression(node: Node) -> bool;
```
## isNonStrictEqualityTestExpression

```rust
/**
 * Determines whether a node is a non-strict equality test expression using
 * `==` or `!=`.
 */
```
```rust
pub fn isNonStrictEqualityTestExpression(node: Node) -> bool;
```
## isInequalityExpression

```rust
/**
 * Determines whether a node is an inequality expression using `!=`.
 */
```
```rust
pub fn isInequalityExpression(node: Node) -> bool;
```
## isEqualityExpression

```rust
/**
 * Determines whether a node is an equality expression using `==`.
 */
```
```rust
pub fn isEqualityExpression(node: Node) -> bool;
```
## isGreaterThanEqualsToken

```rust
/**
 * Determines whether a node is a `>=` token.
 */
```
```rust
pub fn isGreaterThanEqualsToken(node: Node) -> bool;
```
## isInstanceOfExpression

```rust
/**
 * Determines whether a node is an `instanceof` expression.
 */
```
```rust
pub fn isInstanceOfExpression(node: Node) -> bool;
```
## isClassElement

```rust
/**
 * Determines whether a node is a ClassElement
 */
```
```rust
pub fn isClassElement(node: Node) -> bool;
```
## isPostfixUnaryOperator

```rust
/**
 * Determines whether a node is a postfix unary operator.
 */
```
```rust
pub fn isPostfixUnaryOperator(node: Node) -> bool;
```
## isLessThanExpression

```rust
/**
 * Determines whether a node is a less-than expression using `<`.
 */
```
```rust
pub fn isLessThanExpression(node: Node) -> bool;
```
## isRelationalExpression

```rust
/**
 * Determines whether a node is a relational expression using `<`, `<=`, `>`, `>=`, `instanceof` or `in`.
 */
```
```rust
pub fn isRelationalExpression(node: Node) -> bool;
```
## isUnsignedRightShiftAssignmentExpression

```rust
/**
 * Determines whether a node is an unsigned right shift assignment expression using `>>>=`.
 */
```
```rust
pub fn isUnsignedRightShiftAssignmentExpression(node: Node) -> bool;
```
## isShiftExpression

```rust
/**
 * Determines whether a node is a shift expression using `<<`, `>>` or `>>>`.
 */
```
```rust
pub fn isShiftExpression(node: Node) -> bool;
```
## defn

```rust
pub fn defn(def: ControlFlowNode, lhs: Expression) -> bool;
```
## isSubtractionExpression

```rust
/**
 * Determines whether a node is a subtraction expression using `-`.
 */
```
```rust
pub fn isSubtractionExpression(node: Node) -> bool;
```
## isAwaitKeyword

```rust
/**
 * Determines whether a node is an `await` keyword.
 */
```
```rust
pub fn isAwaitKeyword(node: Node) -> bool;
```
## isAdditionExpression

```rust
/**
 * Determines whether a node is an addition expression using `+`.
 */
```
```rust
pub fn isAdditionExpression(node: Node) -> bool;
```
## dominates

```rust
/**
 * Hold if dom dominates cfn.
 */
```
```rust
pub fn dominates(dom: ControlFlowNode, cfn: ControlFlowNode) -> bool;
```
## isDivisionExpression

```rust
/**
 * Determines whether a node is a division expression using `/`.
 */
```
```rust
pub fn isDivisionExpression(node: Node) -> bool;
```
## isMultiplicationExpression

```rust
/**
 * Determines whether a node is a multiplication expression using `*`.
 */
```
```rust
pub fn isMultiplicationExpression(node: Node) -> bool;
```
## isMultiplicativeExpression

```rust
/**
 * Determines whether a node is a multiplicative expression using `*`, `/` or `%`.
 */
```
```rust
pub fn isMultiplicativeExpression(node: Node) -> bool;
```
## isNullishAssignmentExpression

```rust
/**
 * Determines whether a node is a nullish assignment expression using `??=`.
 */
```
```rust
pub fn isNullishAssignmentExpression(node: Node) -> bool;
```
## isPrimaryExpression

```rust
/**
 * Determines whether a node is a primary expression.
 */
```
```rust
pub fn isPrimaryExpression(node: Node) -> bool;
```
## isImportExpression

```rust
/**
 * Determines whether a node is an `import` expression.
 */
```
```rust
pub fn isImportExpression(node: Node) -> bool;
```
## isCommaListExpression

```rust
/**
 * Determines whether a node is a comma list expression.
 */
```
```rust
pub fn isCommaListExpression(node: Node) -> bool;
```
## isNonNullExpression

```rust
/**
 * Determines whether a node is a non-null expression.
 */
```
```rust
pub fn isNonNullExpression(node: Node) -> bool;
```
## isEqualsEqualsToken

```rust
/**
 * Determines whether a node is an `==` token.
 */
```
```rust
pub fn isEqualsEqualsToken(node: Node) -> bool;
```
## isLeftHandSideExpression

```rust
/**
 * Determines whether a node is a left-hand-side expression.
 */
```
```rust
pub fn isLeftHandSideExpression(node: Node) -> bool;
```
## isCommaToken

```rust
/**
 * Determines whether a node is a `,` token.
 */
```
```rust
pub fn isCommaToken(node: Node) -> bool;
```
## isSpreadElement

```rust
/**
 * Determines whether a node is a spread element.
 */
```
```rust
pub fn isSpreadElement(node: Node) -> bool;
```
## first

```rust
/**
 * Get the node that should be visited first,
 * selected from the node and it's descendants.
 * Every control flow node must have and only have 1 first node.
 */
```
```rust
pub fn first(n: ControlFlowNode) -> ControlFlowNode;
```
## isAsExpression

```rust
/**
 * Determines whether a node is an `as` expression.
 */
```
```rust
pub fn isAsExpression(node: Node) -> bool;
```
## isPrefixUnaryExpression

```rust
/**
 * Determines whether a node is a prefix unary expression.
 */
```
```rust
pub fn isPrefixUnaryExpression(node: Node) -> bool;
```
## isVoidExpression

```rust
/**
 * Determines whether a node is a `void` expression.
 */
```
```rust
pub fn isVoidExpression(node: Node) -> bool;
```
## isTemplateSpan

```rust
/**
 * Determines whether a node is a template span.
 */
```
```rust
pub fn isTemplateSpan(node: Node) -> bool;
```
## isTypeOfExpression

```rust
/**
 * Determines whether a node is a `typeof` expression.
 */
```
```rust
pub fn isTypeOfExpression(node: Node) -> bool;
```
## isArrowFunction

```rust
/**
 * Determines whether a node is an arrow function
 */
```
```rust
pub fn isArrowFunction(node: Node) -> bool;
```
## isParenthesizedExpression

```rust
/**
 * Determines whether a node is a parenthesized expression.
 */
```
```rust
pub fn isParenthesizedExpression(node: Node) -> bool;
```
## isBinaryBitwiseExpression

```rust
/**
 * Determines whether a node is a binary bitwise expression using
 * `&`, `|` or `^`.
 */
```
```rust
pub fn isBinaryBitwiseExpression(node: Node) -> bool;
```
## isNewExpression

```rust
/**
 * Determines whether a node is a new expression.
 */
```
```rust
pub fn isNewExpression(node: Node) -> bool;
```
## isPropertyAssignment

```rust
/**
 * Determines whether a node is a property assignment.
 */
```
```rust
pub fn isPropertyAssignment(node: Node) -> bool;
```
## isCallExpression

```rust
/**
 * Determines whether a node is a call expression.
 */
```
```rust
pub fn isCallExpression(node: Node) -> bool;
```
## isElementAccessExpression

```rust
/**
 * Determines whether a node is an element access expression.
 */
```
```rust
pub fn isElementAccessExpression(node: Node) -> bool;
```
## isPercentEqualsToken

```rust
/**
 * Determines whether a node is a `%=` token.
 */
```
```rust
pub fn isPercentEqualsToken(node: Node) -> bool;
```
## isTaggedTemplateExpression

```rust
/**
 * Determines whether a node is a tagged template expression.
 */
```
```rust
pub fn isTaggedTemplateExpression(node: Node) -> bool;
```
## isBooleanLiteral

```rust
/**
 * Determines whether a node is a boolean literal.
 */
```
```rust
pub fn isBooleanLiteral(node: Node) -> bool;
```
## isArrayLiteralExpression

```rust
/**
 * Determines whether a node is an array literal expression.
 */
```
```rust
pub fn isArrayLiteralExpression(node: Node) -> bool;
```
## isNoSubstitutionTemplateLiteral

```rust
/**
 * Determines whether a node is a no-substitution template literal.
 */
```
```rust
pub fn isNoSubstitutionTemplateLiteral(node: Node) -> bool;
```
## isFunctionTypeOrSignatureKind

```rust
/**
 * Determines whether a node kind is a FunctionTypeOrSignature kind
 */
```
```rust
pub fn isFunctionTypeOrSignatureKind(kind: int) -> bool;
```
## isThisType

```rust
/**
 * Determines whether a node is a this type.
 */
```
```rust
pub fn isThisType(node: Node) -> bool;
```
## isLessThanEqualsExpression

```rust
/**
 * Determines whether a node is a less-than-or-equal expression using `<=`.
 */
```
```rust
pub fn isLessThanEqualsExpression(node: Node) -> bool;
```
## isTypeReference

```rust
/**
 * Determines whether a node is a type reference.
 */
```
```rust
pub fn isTypeReference(node: Node) -> bool;
```
## isVariableDeclarationList

```rust
/**
 * Determines whether a node is a variable declaration list
 */
```
```rust
pub fn isVariableDeclarationList(node: Node) -> bool;
```
## isGreaterThanEqualsExpression

```rust
/**
 * Determines whether a node is a greater-than-or-equal expression using `>=`.
 */
```
```rust
pub fn isGreaterThanEqualsExpression(node: Node) -> bool;
```
## isAccessExpression

```rust
/**
 * Determines whether a node is an access expression.
 */
```
```rust
pub fn isAccessExpression(node: Node) -> bool;
```
## isPrefixUnaryOperator

```rust
/**
 * Determines whether a node is a prefix unary operator.
 */
```
```rust
pub fn isPrefixUnaryOperator(node: Node) -> bool;
```
## isReturnCompletion

```rust
pub fn isReturnCompletion(c: Completion) -> bool;
```
## isObjectBindingPattern

```rust
/**
 * Determines whether a node is an object binding pattern.
 */
```
```rust
pub fn isObjectBindingPattern(node: Node) -> bool;
```
## isUpdateExpression

```rust
/**
 * Determines whether a node is an update expression.
 */
```
```rust
pub fn isUpdateExpression(node: Node) -> bool;
```
## isPostfixUnaryExpression

```rust
/**
 * Determines whether a node is a postfix unary expression.
 */
```
```rust
pub fn isPostfixUnaryExpression(node: Node) -> bool;
```
## isBarBarToken

```rust
/**
 * Determines whether a node is a `||` token.
 */
```
```rust
pub fn isBarBarToken(node: Node) -> bool;
```
## isUnknownKeyword

```rust
/**
 * Determines whether a node is an `unknown` keyword.
 */
```
```rust
pub fn isUnknownKeyword(node: Node) -> bool;
```
## isControlNode

```rust
/**
 * Determines whether a node is a control Node
 */
```
```rust
pub fn isControlNode(node: Node) -> bool;
```
## isGreaterThanGreaterThanGreaterThanToken

```rust
/**
 * Determines whether a node is a `>>>` token.
 */
```
```rust
pub fn isGreaterThanGreaterThanGreaterThanToken(node: Node) -> bool;
```
## isPostfixDecrementExpression

```rust
/**
 * Determines whether a node is a postfix decrement expression using `--`.
 */
```
```rust
pub fn isPostfixDecrementExpression(node: Node) -> bool;
```
## isLessThanToken

```rust
/**
 * Determines whether a node is a `<` token.
 */
```
```rust
pub fn isLessThanToken(node: Node) -> bool;
```
## isAccessor

```rust
/**
 * Determines whether a node is an Accessor
 */
```
```rust
pub fn isAccessor(node: Node) -> bool;
```
## isDeclarationStatementKind

```rust
/**
 * Determines whether a node kind is a declaration statement kind
 */
```
```rust
pub fn isDeclarationStatementKind(kind: int) -> bool;
```
## isSuperKeyword

```rust
/**
 * Determines whether a node is a `super` keyword.
 */
```
```rust
pub fn isSuperKeyword(node: Node) -> bool;
```
## isStringLiteral

```rust
/**
 * Determines whether a node is a string literal.
 */
```
```rust
pub fn isStringLiteral(node: Node) -> bool;
```
## isMultiplicativeOperatorOrHigher

```rust
/**
 * Determines whether a node is a multiplicative operator or higher.
 */
```
```rust
pub fn isMultiplicativeOperatorOrHigher(node: Node) -> bool;
```
## isGetAccessor

```rust
/**
 * Determines whether a node is a `get` accessor
 */
```
```rust
pub fn isGetAccessor(node: Node) -> bool;
```
## isBinaryBitwiseOperator

```rust
/**
 * Determines whether a node is a binary bitwise operator `&`, `|` or `^`.
 */
```
```rust
pub fn isBinaryBitwiseOperator(node: Node) -> bool;
```
## isTemplateMiddle

```rust
/**
 * Determines whether a node is a template middle.
 */
```
```rust
pub fn isTemplateMiddle(node: Node) -> bool;
```
## isBigIntKeyword

```rust
/**
 * Determines whether a node is a `bigint` keyword.
 */
```
```rust
pub fn isBigIntKeyword(node: Node) -> bool;
```
## isSyntheticReferenceExpression

```rust
/**
 * Determines whether a node is a synthetic reference expression.
 */
```
```rust
pub fn isSyntheticReferenceExpression(node: Node) -> bool;
```
## isStrictEqualityExpression

```rust
/**
 * Determines whether a node is a strict equality expression using `===`.
 */
```
```rust
pub fn isStrictEqualityExpression(node: Node) -> bool;
```
## inBooleanContext

```rust
/**
 * a node that occur in a context in which their value affect control flow.
 */
```
```rust
pub fn inBooleanContext(n: ControlFlowNode) -> bool;
```
## isTypeLiteral

```rust
/**
 * Determines whether a node is a type literal.
 */
```
```rust
pub fn isTypeLiteral(node: Node) -> bool;
```
## isToken

```rust
/**
 * Determines whether a node is a token.
 */
```
```rust
pub fn isToken(node: Node) -> bool;
```
## isAsyncKeyword

```rust
/**
 * Determines whether a node is an `async` keyword.
 */
```
```rust
pub fn isAsyncKeyword(node: Node) -> bool;
```
## isStringKeyword

```rust
/**
 * Determines whether a node is a `string` keyword.
 */
```
```rust
pub fn isStringKeyword(node: Node) -> bool;
```
## isLiteralExpression

```rust
/**
 * Determines whether a node is a literal expression.
 */
```
```rust
pub fn isLiteralExpression(node: Node) -> bool;
```
## isMethodSignature

```rust
/**
 * Determines whether a node is a method signature.
 */
```
```rust
pub fn isMethodSignature(node: Node) -> bool;
```
## isPropertyExpressionInAccessExpression

```rust
pub fn isPropertyExpressionInAccessExpression(propertyExpression: Expression) -> bool;
```
## isNodeWithTypeArguments

```rust
/**
 * Determines whether a node is a node with type arguments.
 */
```
```rust
pub fn isNodeWithTypeArguments(node: Node) -> bool;
```
## isAssignmentOperatorOrHigher

```rust
/**
 * Determines whether a node is an assignment operator or higher.
 */
```
```rust
pub fn isAssignmentOperatorOrHigher(node: Node) -> bool;
```
## isAssignmentOperator

```rust
/**
 * Determines whether a node is a simple assignment operator `=` or a compound
 * assignment operator.
 */
```
```rust
pub fn isAssignmentOperator(node: Node) -> bool;
```
## isBinaryLogicalOperatorOrHigher

```rust
/**
 * Determines whether a node is a logical operator or higher.
 */
```
```rust
pub fn isBinaryLogicalOperatorOrHigher(node: Node) -> bool;
```
## isEqualityOperatorOrHigher

```rust
/**
 * Determines whether a node is an equality operator or higher.
 */
```
```rust
pub fn isEqualityOperatorOrHigher(node: Node) -> bool;
```
## isShiftOperatorOrHigher

```rust
/**
 * Determines whether a node is a shift operator or higher.
 */
```
```rust
pub fn isShiftOperatorOrHigher(node: Node) -> bool;
```
## isShiftOperator

```rust
/**
 * Determines whether a node is a shift operator `<<`, `>>` or `>>>`.
 */
```
```rust
pub fn isShiftOperator(node: Node) -> bool;
```
## isAdditiveOperatorOrHigher

```rust
/**
 * Determines whether a node is an additive operator or higher.
 */
```
```rust
pub fn isAdditiveOperatorOrHigher(node: Node) -> bool;
```
## isPropertyAccessExpression

```rust
/**
 * Determines whether a node is a property access expression.
 */
```
```rust
pub fn isPropertyAccessExpression(node: Node) -> bool;
```
## isAdditiveOperator

```rust
/**
 * Determines whether a node is an additive operator `+` or `-`.
 */
```
```rust
pub fn isAdditiveOperator(node: Node) -> bool;
```
## isTemplateTail

```rust
/**
 * Determines whether a node is a template tail.
 */
```
```rust
pub fn isTemplateTail(node: Node) -> bool;
```
## isTypeElement

```rust
/**
 * Determines whether a node is a type element.
 */
```
```rust
pub fn isTypeElement(node: Node) -> bool;
```
## isExponentiationOperator

```rust
/**
 * Determines whether a node is an exponentiation operator `**`.
 */
```
```rust
pub fn isExponentiationOperator(node: Node) -> bool;
```
## isLeftShiftAssignmentExpression

```rust
/**
 * Determines whether a node is a left shift assignment expression using `<<=`.
 */
```
```rust
pub fn isLeftShiftAssignmentExpression(node: Node) -> bool;
```
## isAdditiveExpression

```rust
/**
 * Determines whether a node is an additive expression using `+` or `-`.
 */
```
```rust
pub fn isAdditiveExpression(node: Node) -> bool;
```
## isExponentiationExpression

```rust
/**
 * Determines whether a node is a exponentiation expression using `**`.
 */
```
```rust
pub fn isExponentiationExpression(node: Node) -> bool;
```
## isRValue

```rust
pub fn isRValue(refExpr: RefExpr) -> bool;
```
## isYieldExpression

```rust
/**
 * Determines whether a node is a yield expression.
 */
```
```rust
pub fn isYieldExpression(node: Node) -> bool;
```
## isTryStatement

```rust
/**
 * Determines whether a node is a `try` statement
 */
```
```rust
pub fn isTryStatement(node: Node) -> bool;
```
## isCompoundAssignmentOperator

```rust
/**
 * Determines whether a node is a compound assignment operator
 * `+=`, `-=`, `**=`, `*=`, `/=`, `%=`, `&=`, `|=`, `^=`, `<<=`, `>>=`, `>>>=`,
 * `&&=`, `||=` or `??=`.
 */
```
```rust
pub fn isCompoundAssignmentOperator(node: Node) -> bool;
```
## isFunctionLikeDeclaration

```rust
/**
 * Determines whether a node is a function-like declaration, including:
 *  - MethodDeclaration,
 *  - Constructor,
 *  - GetAccessor,
 *  - SetAccessor,
 *  - FunctionExpression,
 *  - ArrowFunction,
 *  - FunctionDeclaration,
 */
```
```rust
pub fn isFunctionLikeDeclaration(node: Node) -> bool;
```
## isPlusPlusToken

```rust
/**
 * Determines whether a node is a `++` token.
 */
```
```rust
pub fn isPlusPlusToken(node: Node) -> bool;
```
## isNumberKeyword

```rust
/**
 * Determines whether a node is a `number` keyword.
 */
```
```rust
pub fn isNumberKeyword(node: Node) -> bool;
```
## isBitwiseOrExpression

```rust
/**
 * Determines whether a node is a bitwise OR expression using `|`.
 */
```
```rust
pub fn isBitwiseOrExpression(node: Node) -> bool;
```
## isNeverKeyword

```rust
/**
 * Determines whether a node is a `never` keyword.
 */
```
```rust
pub fn isNeverKeyword(node: Node) -> bool;
```
## isAsteriskAsteriskToken

```rust
/**
 * Determines whether a node is a `**` token.
 */
```
```rust
pub fn isAsteriskAsteriskToken(node: Node) -> bool;
```
## isMultiplicativeOperator

```rust
/**
 * Determines whether a node is a multiplicative operator `*`, `/` or `%`.
 */
```
```rust
pub fn isMultiplicativeOperator(node: Node) -> bool;
```
## isRemainderAssignmentExpression

```rust
/**
 * Determines whether a node is a remainder assignment expression using `%=`.
 */
```
```rust
pub fn isRemainderAssignmentExpression(node: Node) -> bool;
```
## isAmpersandAmpersandEqualsToken

```rust
/**
 * Determines whether a node is an `&&=` token.
 */
```
```rust
pub fn isAmpersandAmpersandEqualsToken(node: Node) -> bool;
```
## isImplementsKeyword

```rust
/**
 * Determines whether a node is an `implements` keyword.
 */
```
```rust
pub fn isImplementsKeyword(node: Node) -> bool;
```
## isQuestionToken

```rust
/**
 * Determines whether a node is a `?` token.
 */
```
```rust
pub fn isQuestionToken(node: Node) -> bool;
```
## isModifierKind

```rust
/**
 * Determines whether a node kind is a modifier kind.
 */
```
```rust
pub fn isModifierKind(kind: int) -> bool;
```
## isThisKeyword

```rust
/**
 * Determines whether a node is a `this` keyword.
 */
```
```rust
pub fn isThisKeyword(node: Node) -> bool;
```
## isNullKeyword

```rust
/**
 * Determines whether a node is a `null` keyword.
 */
```
```rust
pub fn isNullKeyword(node: Node) -> bool;
```
## isInstanceOfKeyword

```rust
/**
 * Determines whether a node is an `instanceof` keyword.
 */
```
```rust
pub fn isInstanceOfKeyword(node: Node) -> bool;
```
## isInKeyword

```rust
/**
 * Determines whether a node is an `in` keyword.
 */
```
```rust
pub fn isInKeyword(node: Node) -> bool;
```
## isTemplateHead

```rust
/**
 * Determines whether a node is a template head.
 */
```
```rust
pub fn isTemplateHead(node: Node) -> bool;
```
## bbIDominates

```rust
/**
 * Hold if idomBB immediately dominates bb.
 * idomBB is the closest strict dominator of bb, fit the following conditions:
 * 1. idomBB strictly dominates bb
 * 2. idomBB can't dominate any other bb's strict dominator
 */
```
```rust
pub fn bbIDominates(idomBB: BasicBlock, bb: BasicBlock) -> bool;
```
## isIdentifier

```rust
/**
 * Determines whether a node is an identifier.
 */
```
```rust
pub fn isIdentifier(node: Node) -> bool;
```
## isTokenKind

```rust
/**
 * Determines whether a node kind is a token kind.
 */
```
```rust
pub fn isTokenKind(kind: int) -> bool;
```
## isExclamationEqualsToken

```rust
/**
 * Determines whether a node is a `!=` token.
 */
```
```rust
pub fn isExclamationEqualsToken(node: Node) -> bool;
```
## isGreaterThanGreaterThanEqualsToken

```rust
/**
 * Determines whether a node is a `>>=` token.
 */
```
```rust
pub fn isGreaterThanGreaterThanEqualsToken(node: Node) -> bool;
```
## isBinaryOperator

```rust
/**
 * Determines whether a node is a binary operator.
 */
```
```rust
pub fn isBinaryOperator(node: Node) -> bool;
```
## isAwaitExpression

```rust
/**
 * Determines whether a node is an `await` expression.
 */
```
```rust
pub fn isAwaitExpression(node: Node) -> bool;
```
## isAsteriskEqualsToken

```rust
/**
 * Determines whether a node is an `*=` token.
 */
```
```rust
pub fn isAsteriskEqualsToken(node: Node) -> bool;
```
## isMinusEqualsToken

```rust
/**
 * Determines whether a node is a `-=` token.
 */
```
```rust
pub fn isMinusEqualsToken(node: Node) -> bool;
```
## isQuestionQuestionToken

```rust
/**
 * Determines whether a node is a `??` token.
 */
```
```rust
pub fn isQuestionQuestionToken(node: Node) -> bool;
```
## controlDependencies

```rust
/**
 * Hold bb's control dependencies.
 * same with postDominanceFrontier+.
 */
```
```rust
pub fn controlDependencies(bb: BasicBlock, controlDependencyBB: BasicBlock) -> bool;
```
## isAmpersandAmpersandToken

```rust
/**
 * Determines whether a node is an `&&` token.
 */
```
```rust
pub fn isAmpersandAmpersandToken(node: Node) -> bool;
```
## isBreakStatement

```rust
/**
 * Determines whether a node is a `break` statement
 */
```
```rust
pub fn isBreakStatement(node: Node) -> bool;
```
## isImportKeyword

```rust
/**
 * Determines whether a node is an `import` keyword.
 */
```
```rust
pub fn isImportKeyword(node: Node) -> bool;
```
## isTildeToken

```rust
/**
 * Determines whether a node is a `~` token.
 */
```
```rust
pub fn isTildeToken(node: Node) -> bool;
```
## getSymbol

```rust
/**
 * Get the corresponding symbol of a RefExpr.
 * It also gets the value symbol of a ShorthandPropertyAssignment or the name node (Identifier) of it.
 */
```
```rust
pub fn getSymbol(refExpr: RefExpr) -> Symbol;
```
## isExclamationToken

```rust
/**
 * Determines whether a node is an `!` token.
 */
```
```rust
pub fn isExclamationToken(node: Node) -> bool;
```
## isGreaterThanGreaterThanToken

```rust
/**
 * Determines whether a node is a `>>` token.
 */
```
```rust
pub fn isGreaterThanGreaterThanToken(node: Node) -> bool;
```
## isArrayBindingPattern

```rust
/**
 * Determines whether a node is an array binding pattern.
 */
```
```rust
pub fn isArrayBindingPattern(node: Node) -> bool;
```
## isFunctionExpression

```rust
/**
 * Determines whether a node is a function expression
 */
```
```rust
pub fn isFunctionExpression(node: Node) -> bool;
```
## isPercentToken

```rust
/**
 * Determines whether a node is a `%` token.
 */
```
```rust
pub fn isPercentToken(node: Node) -> bool;
```
## isAsteriskToken

```rust
/**
 * Determines whether a node is a `*` token.
 */
```
```rust
pub fn isAsteriskToken(node: Node) -> bool;
```
## isMinusToken

```rust
/**
 * Determines whether a node is a `-` token.
 */
```
```rust
pub fn isMinusToken(node: Node) -> bool;
```
## isLessThanLessThanEqualsToken

```rust
/**
 * Determines whether a node is a `<<=` token.
 */
```
```rust
pub fn isLessThanLessThanEqualsToken(node: Node) -> bool;
```
## last

```rust
/**
 * Get the node that should be visited last,
 * selected from the node and it's descendants.
 * Every control flow node must have at least 1 last node.
 */
```
```rust
pub fn last(n: ControlFlowNode, ln: ControlFlowNode, c: Completion) -> bool;
```
## isPlusToken

```rust
/**
 * Determines whether a node is a `+` token.
 */
```
```rust
pub fn isPlusToken(node: Node) -> bool;
```
## isCommaExpression

```rust
/**
 * Determines whether a node is a comma expression using `,`.
 */
```
```rust
pub fn isCommaExpression(node: Node) -> bool;
```
## isGreaterThanToken

```rust
/**
 * Determines whether a node is a `>` token.
 */
```
```rust
pub fn isGreaterThanToken(node: Node) -> bool;
```
## isExclamationEqualsEqualsToken

```rust
/**
 * Determines whether a node is a `!==` token.
 */
```
```rust
pub fn isExclamationEqualsEqualsToken(node: Node) -> bool;
```
## isEqualsEqualsEqualsToken

```rust
/**
 * Determines whether a node is an `===` token.
 */
```
```rust
pub fn isEqualsEqualsEqualsToken(node: Node) -> bool;
```
## isBarBarEqualsToken

```rust
/**
 * Determines whether a node is a `||=` token.
 */
```
```rust
pub fn isBarBarEqualsToken(node: Node) -> bool;
```
## isExtendsKeyword

```rust
/**
 * Determines whether a node is an `extends` keyword.
 */
```
```rust
pub fn isExtendsKeyword(node: Node) -> bool;
```
## isDotDotDotToken

```rust
/**
 * Determines whether a node is a `...` token.
 */
```
```rust
pub fn isDotDotDotToken(node: Node) -> bool;
```
## isClassDeclaration

```rust
/**
 * Determines whether a node is a class declaration.
 */
```
```rust
pub fn isClassDeclaration(node: Node) -> bool;
```
## isIterationStatement

```rust
/**
 * Determine whether a node is an iteration statement, including `while`, `do`-`while`,
 * `for` and enhanced `for` (`for`-`in`, `for`-`of`) statements.
 */
```
```rust
pub fn isIterationStatement(node: Node) -> bool;
```
## isJsxSelfClosingElement

```rust
/**
 * Determines whether a node is a JSX self closing element.
 */
```
```rust
pub fn isJsxSelfClosingElement(node: Node) -> bool;
```
## mayThrow

```rust
/**
 * Determine whether a control flow node throws
 * an exception.
 */
```
```rust
pub fn mayThrow(cfn: ControlFlowNode) -> bool;
```
## isClassExpression

```rust
/**
 * Determines whether a node is a class expression.
 */
```
```rust
pub fn isClassExpression(node: Node) -> bool;
```
## isRegularExpressionLiteral

```rust
/**
 * Determines whether a node is a regular expression literal.
 */
```
```rust
pub fn isRegularExpressionLiteral(node: Node) -> bool;
```
## isDataFlowNode

```rust
pub fn isDataFlowNode(node: Node) -> bool;
```
## isLessThanEqualsToken

```rust
/**
 * Determines whether a node is a `<=` token.
 */
```
```rust
pub fn isLessThanEqualsToken(node: Node) -> bool;
```
## isNumericLiteral

```rust
/**
 * Determines whether a node is a numeric literal.
 */
```
```rust
pub fn isNumericLiteral(node: Node) -> bool;
```
## isBarEqualsToken

```rust
/**
 * Determines whether a node is a `|=` token.
 */
```
```rust
pub fn isBarEqualsToken(node: Node) -> bool;
```
## isEndOfFileToken

```rust
/**
 * Determines whether a node is an end-of-file token.
 */
```
```rust
pub fn isEndOfFileToken(node: Node) -> bool;
```
## isIntrinsicKeyword

```rust
/**
 * Determines whether a node is an `intrinsic` keyword.
 */
```
```rust
pub fn isIntrinsicKeyword(node: Node) -> bool;
```
## isUnknown

```rust
/**
 * Determines whether a node is an unknown token.
 */
```
```rust
pub fn isUnknown(node: Node) -> bool;
```
## isCaretToken

```rust
/**
 * Determines whether a node is a `^` token.
 */
```
```rust
pub fn isCaretToken(node: Node) -> bool;
```
## isForInStatement

```rust
/**
 * Determines whether a node is a `for`-`in` statement
 */
```
```rust
pub fn isForInStatement(node: Node) -> bool;
```
## isJsxOpeningElement

```rust
/**
 * Determines whether a node is a JSX opening element.
 */
```
```rust
pub fn isJsxOpeningElement(node: Node) -> bool;
```
## isKeywordToken

```rust
/**
 * Determines whether a node is a keyword token.
 */
```
```rust
pub fn isKeywordToken(node: Node) -> bool;
```
## isAmpersandEqualsToken

```rust
/**
 * Determines whether a node is an `&=` token.
 */
```
```rust
pub fn isAmpersandEqualsToken(node: Node) -> bool;
```
## isLeftShiftExpression

```rust
/**
 * Determines whether a node is a left-shift expression using `<<`.
 */
```
```rust
pub fn isLeftShiftExpression(node: Node) -> bool;
```
## isAbstractKeyword

```rust
/**
 * Determines whether a node is an `abstract` keyword.
 */
```
```rust
pub fn isAbstractKeyword(node: Node) -> bool;
```
## isInferType

```rust
/**
 * Determines whether a node is an infer type.
 */
```
```rust
pub fn isInferType(node: Node) -> bool;
```
## isAsteriskAsteriskEqualsToken

```rust
/**
 * Determines whether a node is an `**=` token.
 */
```
```rust
pub fn isAsteriskAsteriskEqualsToken(node: Node) -> bool;
```
## isGreaterThanGreaterThanGreaterThanEqualsToken

```rust
/**
 * Determines whether a node is a `>>>=` token.
 */
```
```rust
pub fn isGreaterThanGreaterThanGreaterThanEqualsToken(node: Node) -> bool;
```
## isFalseBooleanCompletion

```rust
pub fn isFalseBooleanCompletion(c: Completion) -> bool;
```
## isThrowCompletion

```rust
pub fn isThrowCompletion(c: Completion) -> bool;
```
## isArrayType

```rust
/**
 * Determines whether a node is an array type.
 */
```
```rust
pub fn isArrayType(node: Node) -> bool;
```
## isMethodDeclaration

```rust
/**
 * Determines whether a node is a MethodDeclaration
 */
```
```rust
pub fn isMethodDeclaration(node: Node) -> bool;
```
## isPropertySignature

```rust
/**
 * Determines whether a node is a property signature.
 */
```
```rust
pub fn isPropertySignature(node: Node) -> bool;
```
## flowTo

```rust
pub fn flowTo(source: Node, sink: Node) -> bool;
```
## isNamespaceExport

```rust
/**
 * Determines whether a node is a namespace export.
 */
```
```rust
pub fn isNamespaceExport(node: Node) -> bool;
```
## isUnsignedRightShiftExpression

```rust
/**
 * Determines whether a node is a unsigned right-shift expression using `>>>`.
 */
```
```rust
pub fn isUnsignedRightShiftExpression(node: Node) -> bool;
```
## isBinaryExpression

```rust
/**
 * Determines whether a node is a binary expression
 */
```
```rust
pub fn isBinaryExpression(node: Node) -> bool;
```
## isSuperExpression

```rust
/**
 * Determines whether a node is a `super` expression.
 */
```
```rust
pub fn isSuperExpression(node: Node) -> bool;
```
## isSlashEqualsToken

```rust
/**
 * Determines whether a node is a `/=` token.
 */
```
```rust
pub fn isSlashEqualsToken(node: Node) -> bool;
```
## isRemainderExpression

```rust
/**
 * Determines whether a node is a remainder expression using `%`.
 */
```
```rust
pub fn isRemainderExpression(node: Node) -> bool;
```
## isAccessorKind

```rust
/**
 * Determines whether a node kind is an Accessor kind
 */
```
```rust
pub fn isAccessorKind(kind: int) -> bool;
```
## isHeritageClause

```rust
/**
 * Determines whether a node is a heritage clause.
 */
```
```rust
pub fn isHeritageClause(node: Node) -> bool;
```
## isVariableDeclarationKind

```rust
/**
 * Determines whether a node kind is a variable declaration kind
 */
```
```rust
pub fn isVariableDeclarationKind(kind: int) -> bool;
```
## isCompoundAssignmentExpression

```rust
/**
 * Determines whether a node is a compound assignment expression using
 * `+=`, `-=`, `**=`, `*=`, `/=`, `%=`, `&=`, `|=`, `^=`, `<<=`, `>>=`, `>>>=`,
 * `&&=`, `||=` or `??=`.
 */
```
```rust
pub fn isCompoundAssignmentExpression(node: Node) -> bool;
```
## isLessThanLessThanToken

```rust
/**
 * Determines whether a node is a `<<` token.
 */
```
```rust
pub fn isLessThanLessThanToken(node: Node) -> bool;
```
## isProtectedKeyword

```rust
/**
 * Determines whether a node is a `protected` keyword.
 */
```
```rust
pub fn isProtectedKeyword(node: Node) -> bool;
```
## isPlusEqualsToken

```rust
/**
 * Determines whether a node is a `+=` token.
 */
```
```rust
pub fn isPlusEqualsToken(node: Node) -> bool;
```
## isBinaryLogicalOperator

```rust
/**
 * Determines whether a node is a logical operator `&&`, `||` or `??`.
 */
```
```rust
pub fn isBinaryLogicalOperator(node: Node) -> bool;
```
## isTypeAliasDeclaration

```rust
/**
 * Determines whether a node is a type alias declaration.
 */
```
```rust
pub fn isTypeAliasDeclaration(node: Node) -> bool;
```
## isFunctionLikeDeclarationKind

```rust
/**
 * Determines whether a node kind is a FunctionLikeDeclaration kind
 */
```
```rust
pub fn isFunctionLikeDeclarationKind(kind: int) -> bool;
```
## indirectFlowEdge

```rust
pub fn indirectFlowEdge(predecessor: DataFlowNode, successor: DataFlowNode) -> bool;
```
## isTrueKeyword

```rust
/**
 * Determines whether a node is a `true` keyword.
 */
```
```rust
pub fn isTrueKeyword(node: Node) -> bool;
```
## isMemberExpression

```rust
/**
 * Determines whether a node is a member expression.
 */
```
```rust
pub fn isMemberExpression(node: Node) -> bool;
```
## isSimpleAssignmentExpression

```rust
/**
 * Determines whether a node is a simple assignment expression using `=`.
 */
```
```rust
pub fn isSimpleAssignmentExpression(node: Node) -> bool;
```
## isQuestionQuestionEqualsToken

```rust
/**
 * Determines whether a node is a `??=` token.
 */
```
```rust
pub fn isQuestionQuestionEqualsToken(node: Node) -> bool;
```
## isCallLikeExpression

```rust
/**
 * Determines whether a node is a call-like expression.
 */
```
```rust
pub fn isCallLikeExpression(node: Node) -> bool;
```
## syntaxKind

```rust
/**
 * The predict for the value and name pairs of SyntaxKinds
 */
```
```rust
pub fn syntaxKind(kind: int, name: string) -> bool;
```
## isIndexSignature

```rust
/**
 * Determines whether a node is an index signature.
 */
```
```rust
pub fn isIndexSignature(node: Node) -> bool;
```
## isCaretEqualsToken

```rust
/**
 * Determines whether a node is a `^=` token.
 */
```
```rust
pub fn isCaretEqualsToken(node: Node) -> bool;
```
## isUnionType

```rust
/**
 * Determines whether a node is an union type.
 */
```
```rust
pub fn isUnionType(node: Node) -> bool;
```
## isConstructSignature

```rust
/**
 * Determines whether a node is a construct signature.
 */
```
```rust
pub fn isConstructSignature(node: Node) -> bool;
```
## isCallSignature

```rust
/**
 * Determines whether a node is a call signature.
 */
```
```rust
pub fn isCallSignature(node: Node) -> bool;
```
## isFirstOfBasicBlock

```rust
/**
 * Hold if the node is the first node of a basic block.
 */
```
```rust
pub fn isFirstOfBasicBlock(cfn: ControlFlowNode) -> bool;
```
## isUnaryExpression

```rust
/**
 * Determines whether a node is an unary expression.
 */
```
```rust
pub fn isUnaryExpression(node: Node) -> bool;
```
## isImportType

```rust
/**
 * Determines whether a node is an import type.
 */
```
```rust
pub fn isImportType(node: Node) -> bool;
```
## isTemplateLiteralTypeSpan

```rust
/**
 * Determines whether a node is a template literal type span.
 */
```
```rust
pub fn isTemplateLiteralTypeSpan(node: Node) -> bool;
```
## isNamedTupleMember

```rust
/**
 * Determines whether a node is a named tuple member.
 */
```
```rust
pub fn isNamedTupleMember(node: Node) -> bool;
```
## isQuestionDotToken

```rust
/**
 * Determines whether a node is a `?.` token.
 */
```
```rust
pub fn isQuestionDotToken(node: Node) -> bool;
```
## isNamespaceExportDeclaration

```rust
/**
 * Determines whether a node is a namespace export declaration.
 */
```
```rust
pub fn isNamespaceExportDeclaration(node: Node) -> bool;
```
## isLogicalOrAssignmentExpression

```rust
/**
 * Determines whether a node is a logical OR assignment expression using `||=`.
 */
```
```rust
pub fn isLogicalOrAssignmentExpression(node: Node) -> bool;
```
## isTypeOperator

```rust
/**
 * Determines whether a node is a type operator.
 */
```
```rust
pub fn isTypeOperator(node: Node) -> bool;
```
## isInExpression

```rust
/**
 * Determines whether a node is an `in` expression.
 */
```
```rust
pub fn isInExpression(node: Node) -> bool;
```
## isSymbolKeyword

```rust
/**
 * Determines whether a node is a `symbol` keyword.
 */
```
```rust
pub fn isSymbolKeyword(node: Node) -> bool;
```
## isConditionalType

```rust
/**
 * Determines whether a node is a conditional type.
 */
```
```rust
pub fn isConditionalType(node: Node) -> bool;
```
## isPrivateIdentifier

```rust
/**
 * Determines whether a node is a private identifier.
 */
```
```rust
pub fn isPrivateIdentifier(node: Node) -> bool;
```
## isIntersectionType

```rust
/**
 * Determines whether a node is an intersection type.
 */
```
```rust
pub fn isIntersectionType(node: Node) -> bool;
```
## isTypeAssertionExpression

```rust
/**
 * Determines whether a node is a type assertion expression.
 */
```
```rust
pub fn isTypeAssertionExpression(node: Node) -> bool;
```
## pageRouterRule

```rust
pub fn pageRouterRule(fromPage: PageObject, toPage: PageObject, kind: RouterKind) -> bool;
```
## isPostOrderNode

```rust
/**
 * Determine whether a control flow node is a post order node.
 */
```
```rust
pub fn isPostOrderNode(controlFlowNode: ControlFlowNode) -> bool;
```
## isRestType

```rust
/**
 * Determines whether a node is a rest type.
 */
```
```rust
pub fn isRestType(node: Node) -> bool;
```
## isOptionalType

```rust
/**
 * Determines whether a node is an optional type.
 */
```
```rust
pub fn isOptionalType(node: Node) -> bool;
```
## isBitwiseAndAssignmentExpression

```rust
/**
 * Determines whether a node is a bitwise AND assignment expression using `&=`.
 */
```
```rust
pub fn isBitwiseAndAssignmentExpression(node: Node) -> bool;
```
## isEqualityTestExpression

```rust
/**
 * Determines whether a node is an equality test expression using `==`, `!=`,
 * `===` or `!==`.
 */
```
```rust
pub fn isEqualityTestExpression(node: Node) -> bool;
```
## isBooleanKeyword

```rust
/**
 * Determines whether a node is a `boolean` keyword.
 */
```
```rust
pub fn isBooleanKeyword(node: Node) -> bool;
```
## isConstructor

```rust
/**
 * Determines whether a node is a Constructor
 */
```
```rust
pub fn isConstructor(node: Node) -> bool;
```
## isTupleType

```rust
/**
 * Determines whether a node is a tuple type.
 */
```
```rust
pub fn isTupleType(node: Node) -> bool;
```
## routerKindInit

```rust
pub fn routerKindInit(id: int, name: string) -> bool;
```
## isTypeQuery

```rust
/**
 * Determines whether a node is a type query.
 */
```
```rust
pub fn isTypeQuery(node: Node) -> bool;
```
## isTypePredicate

```rust
/**
 * Determines whether a node is a type predicate.
 */
```
```rust
pub fn isTypePredicate(node: Node) -> bool;
```
## isConstructorType

```rust
/**
 * Determines whether a node is a constructor type.
 */
```
```rust
pub fn isConstructorType(node: Node) -> bool;
```
## isExportAssignment

```rust
/**
 * Determines whether a node is an export assignment.
 */
```
```rust
pub fn isExportAssignment(node: Node) -> bool;
```
## isPartiallyEmittedExpression

```rust
/**
 * Determines whether a node is a partially emitted expression.
 */
```
```rust
pub fn isPartiallyEmittedExpression(node: Node) -> bool;
```
## isInterfaceDeclaration

```rust
/**
 * Determines whether a node is an interface declaration.
 */
```
```rust
pub fn isInterfaceDeclaration(node: Node) -> bool;
```
## isLValue

```rust
pub fn isLValue(refExpr: RefExpr) -> bool;
```
## isImportEqualsDeclaration

```rust
/**
 * Determines whether a node is an import-equals declaration.
 */
```
```rust
pub fn isImportEqualsDeclaration(node: Node) -> bool;
```
## isWhileStatement

```rust
/**
 * Determines whether a node is a `while` statement
 */
```
```rust
pub fn isWhileStatement(node: Node) -> bool;
```
## isGreaterThanExpression

```rust
/**
 * Determines whether a node is a greater-than expression using `>`.
 */
```
```rust
pub fn isGreaterThanExpression(node: Node) -> bool;
```
## isNullLiteral

```rust
/**
 * Determines whether a node is a null literal.
 */
```
```rust
pub fn isNullLiteral(node: Node) -> bool;
```
## isVariableStatement

```rust
/**
 * Determines whether a node is a variable statement
 */
```
```rust
pub fn isVariableStatement(node: Node) -> bool;
```
## isImportDeclaration

```rust
/**
 * Determines whether a node is an import declaration.
 */
```
```rust
pub fn isImportDeclaration(node: Node) -> bool;
```
## isMinusMinusToken

```rust
/**
 * Determines whether a node is a `--` token.
 */
```
```rust
pub fn isMinusMinusToken(node: Node) -> bool;
```
## isContinueStatement

```rust
/**
 * Determines whether a node is a `continue` statement
 */
```
```rust
pub fn isContinueStatement(node: Node) -> bool;
```
## localFlowEdge

```rust
pub fn localFlowEdge(predecessor: DataFlowNode, successor: DataFlowNode) -> bool;
```
## isFunctionType

```rust
/**
 * Determines whether a node is a function type.
 */
```
```rust
pub fn isFunctionType(node: Node) -> bool;
```
## isTemplateExpression

```rust
/**
 * Determines whether a node is a template expression.
 */
```
```rust
pub fn isTemplateExpression(node: Node) -> bool;
```
## isJsxText

```rust
/**
 * Determines whether a node is a JSX text.
 */
```
```rust
pub fn isJsxText(node: Node) -> bool;
```
## isParenthesizedType

```rust
/**
 * Determines whether a node is a parenthesized type.
 */
```
```rust
pub fn isParenthesizedType(node: Node) -> bool;
```
## isBooleanCompletion

```rust
pub fn isBooleanCompletion(c: Completion) -> bool;
```
## bbPostDominates

```rust
/**
 * Hold if pdomBB post dominates bb.
 */
```
```rust
pub fn bbPostDominates(pdomBB: BasicBlock, bb: BasicBlock) -> bool;
```
## isEnumDeclaration

```rust
/**
 * Determines whether a node is an enum declaration.
 */
```
```rust
pub fn isEnumDeclaration(node: Node) -> bool;
```
## isPropertyNameInPropertyAssignment

```rust
/**
 * Determine a PropertyName expr exists in a PropertyAssignment expr.
 */
```
```rust
pub fn isPropertyNameInPropertyAssignment(propertyName: PropertyName) -> bool;
```
## isBindingPattern

```rust
/**
 * Determines whether a node is a binding pattern.
 */
```
```rust
pub fn isBindingPattern(node: Node) -> bool;
```
## bbInSameCFG

```rust
/**
 * Hold if two bb are in same CFG.
 */
```
```rust
pub fn bbInSameCFG(bb1: BasicBlock, bb2: BasicBlock) -> bool;
```
## isOmittedExpression

```rust
/**
 * Determines whether a node is an omitted expression.
 */
```
```rust
pub fn isOmittedExpression(node: Node) -> bool;
```
## isBinaryBitwiseOperatorOrHigher

```rust
/**
 * Determines whether a node is a binary bitwise operator or higher.
 */
```
```rust
pub fn isBinaryBitwiseOperatorOrHigher(node: Node) -> bool;
```
## isFunctionLike

```rust
/**
 * Determines whether a node is a FunctionLike
 */
```
```rust
pub fn isFunctionLike(node: Node) -> bool;
```
## isSetAccessor

```rust
/**
 * Determines whether a node is a `set` accessor
 */
```
```rust
pub fn isSetAccessor(node: Node) -> bool;
```
## dominanceFrontier

```rust
/**
 * Hold bb's dominance frontier.
 * bb dominates at least one of df's predecessor,
 * but bb don't strictly dominates df.
 */
```
```rust
pub fn dominanceFrontier(bb: BasicBlock, df: BasicBlock) -> bool;
```
## isTemplateLiteralType

```rust
/**
 * Determines whether a node is a template literal type.
 */
```
```rust
pub fn isTemplateLiteralType(node: Node) -> bool;
```
## isHeritageToken

```rust
/**
 * Determines whether a node is a heritage token, that is an `extends` or `implements` keyword.
 */
```
```rust
pub fn isHeritageToken(node: Node) -> bool;
```
## isBarToken

```rust
/**
 * Determines whether a node is a `|` token.
 */
```
```rust
pub fn isBarToken(node: Node) -> bool;
```
## isPrefixDecrementExpression

```rust
/**
 * Determines whether a node is a prefix decrement expression using `--`.
 */
```
```rust
pub fn isPrefixDecrementExpression(node: Node) -> bool;
```
## isEnumMember

```rust
/**
 * Determines whether a node is an enum member.
 */
```
```rust
pub fn isEnumMember(node: Node) -> bool;
```
## isDeleteExpression

```rust
/**
 * Determines whether a node is a `delete` expression.
 */
```
```rust
pub fn isDeleteExpression(node: Node) -> bool;
```
## isIndexedAccessType

```rust
/**
 * Determines whether a node is an indexed access type.
 */
```
```rust
pub fn isIndexedAccessType(node: Node) -> bool;
```
## isVoidKeyword

```rust
/**
 * Determines whether a node is a `void` keyword.
 */
```
```rust
pub fn isVoidKeyword(node: Node) -> bool;
```
## isSyntheticExpression

```rust
/**
 * Determines whether a node is a synthetic expression.
 */
```
```rust
pub fn isSyntheticExpression(node: Node) -> bool;
```
## isKeywordTypeNode

```rust
/**
 * Determines whether a node is a keyword type node.
 */
```
```rust
pub fn isKeywordTypeNode(node: Node) -> bool;
```
## isFunctionBlock

```rust
/**
 * Determines whether a node is a FunctionBlock
 */
```
```rust
pub fn isFunctionBlock(node: Node) -> bool;
```
## isExpression

```rust
/**
 * Determines whether a node is an expression.
 */
```
```rust
pub fn isExpression(node: Node) -> bool;
```
## isStrictEqualityTestExpression

```rust
/**
 * Determines whether a node is a strict equality test expression using
 * `===` or `!==`.
 */
```
```rust
pub fn isStrictEqualityTestExpression(node: Node) -> bool;
```
## isBreakCompletion

```rust
pub fn isBreakCompletion(c: Completion) -> bool;
```
## isEqualsToken

```rust
/**
 * Determines whether a node is an `=` token.
 */
```
```rust
pub fn isEqualsToken(node: Node) -> bool;
```
## isThisExpression

```rust
/**
 * Determines whether a node is a `this` expression.
 */
```
```rust
pub fn isThisExpression(node: Node) -> bool;
```
## isUndefinedKeyword

```rust
/**
 * Determines whether a node is an `undefined` keyword.
 */
```
```rust
pub fn isUndefinedKeyword(node: Node) -> bool;
```
