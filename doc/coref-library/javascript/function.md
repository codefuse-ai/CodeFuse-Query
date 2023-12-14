# Global Function of coref.javascript.gdl

## isOverrideKeyword

```java
/**
* Determines whether a node is an `override` keyword.
*/
```
```rust
pub fn isOverrideKeyword(node: Node) -> bool;
```
## isReadonlyKeyword

```java
/**
* Determines whether a node is a `readonly` keyword.
*/
```
```rust
pub fn isReadonlyKeyword(node: Node) -> bool;
```
## isDeclareKeyword

```java
/**
* Determines whether a node is a `declare` keyword.
*/
```
```rust
pub fn isDeclareKeyword(node: Node) -> bool;
```
## isStaticKeyword

```java
/**
* Determines whether a node is a `static` keyword.
*/
```
```rust
pub fn isStaticKeyword(node: Node) -> bool;
```
## isPrivateKeyword

```java
/**
* Determines whether a node is a `private` keyword.
*/
```
```rust
pub fn isPrivateKeyword(node: Node) -> bool;
```
## isExportKeyword

```java
/**
* Determines whether a node is an `export` keyword.
*/
```
```rust
pub fn isExportKeyword(node: Node) -> bool;
```
## isDefaultKeyword

```java
/**
* Determines whether a node is a `default` keyword.
*/
```
```rust
pub fn isDefaultKeyword(node: Node) -> bool;
```
## isConstKeyword

```java
/**
* Determines whether a node is a `const` keyword.
*/
```
```rust
pub fn isConstKeyword(node: Node) -> bool;
```
## isModifier

```java
/**
* Determines whether a node is a modifier.
*/
```
```rust
pub fn isModifier(node: Node) -> bool;
```
## isJsxExpression

```java
/**
* Determines whether a node is a JSX closing fragment.
*/
```
```rust
pub fn isJsxExpression(node: Node) -> bool;
```
## isJsxSpreadAttribute

```java
/**
* Determines whether a node is a JSX spread attribute.
*/
```
```rust
pub fn isJsxSpreadAttribute(node: Node) -> bool;
```
## isJsxAttributes

```java
/**
* Determines whether a node is a JSX attributes.
*/
```
```rust
pub fn isJsxAttributes(node: Node) -> bool;
```
## isJsxAttribute

```java
/**
* Determines whether a node is a JSX attribute.
*/
```
```rust
pub fn isJsxAttribute(node: Node) -> bool;
```
## isJsxClosingFragment

```java
/**
* Determines whether a node is a JSX closing fragment.
*/
```
```rust
pub fn isJsxClosingFragment(node: Node) -> bool;
```
## isJsxOpeningFragment

```java
/**
* Determines whether a node is a JSX opening fragment.
*/
```
```rust
pub fn isJsxOpeningFragment(node: Node) -> bool;
```
## isJsxFragment

```java
/**
* Determines whether a node is a JSX fragment.
*/
```
```rust
pub fn isJsxFragment(node: Node) -> bool;
```
## isJsxClosingElement

```java
/**
* Determines whether a node is a JSX closing element.
*/
```
```rust
pub fn isJsxClosingElement(node: Node) -> bool;
```
## isJsxElement

```java
/**
* Determines whether a node is a JSX element.
*/
```
```rust
pub fn isJsxElement(node: Node) -> bool;
```
## isPropertyName

```java
/**
* Determines whether a node is a property name.
*/
```
```rust
pub fn isPropertyName(node: Node) -> bool;
```
## isComputedPropertyName

```java
/**
* Determines whether a node is a computed property name.
*/
```
```rust
pub fn isComputedPropertyName(node: Node) -> bool;
```
## isObjectLiteralElement

```java
/**
* Determines whether a node is an object literal element.
*/
```
```rust
pub fn isObjectLiteralElement(node: Node) -> bool;
```
## isSpreadAssignment

```java
/**
* Determines whether a node is a spread assignment.
*/
```
```rust
pub fn isSpreadAssignment(node: Node) -> bool;
```
## isShorthandPropertyAssignment

```java
/**
* Determines whether a node is a shorthand property assignment.
*/
```
```rust
pub fn isShorthandPropertyAssignment(node: Node) -> bool;
```
## isStatementKindButNotDeclarationKind

```java
/**
* Determines whether a node kind is a statement kind, but not a declaration kind
*/
```
```rust
pub fn isStatementKindButNotDeclarationKind(kind: int) -> bool;
```
## isIterationStatementKind

```java
/**
* Determines whether a node kind is an iteration statement kind,
* including `while`, `do`-`while`, `for` and enhanced `for` (`for`-`in`, `for`-`of`) statements.
*/
```
```rust
pub fn isIterationStatementKind(kind: int) -> bool;
```
## isEndOfDeclarationMarker

```java
/**
* Determines whether a node is an end-of-declaration marker.
*/
```
```rust
pub fn isEndOfDeclarationMarker(node: Node) -> bool;
```
## isMergeDeclarationMarker

```java
/**
* Determines whether a node is a merge-declaration marker.
*/
```
```rust
pub fn isMergeDeclarationMarker(node: Node) -> bool;
```
## isNotEmittedStatement

```java
/**
* Determines whether a node is a not-emmitted statement.
*/
```
```rust
pub fn isNotEmittedStatement(node: Node) -> bool;
```
## isDebuggerStatement

```java
/**
* Determines whether a node is a `debugger` statement.
*/
```
```rust
pub fn isDebuggerStatement(node: Node) -> bool;
```
## isThrowStatement

```java
/**
* Determines whether a node is a `throw` statement
*/
```
```rust
pub fn isThrowStatement(node: Node) -> bool;
```
## isSwitchStatement

```java
/**
* Determines whether a node is an `switch` statement
*/
```
```rust
pub fn isSwitchStatement(node: Node) -> bool;
```
## isCaseBlock

```java
/**
* Determines whether a node is a `switch`-`case` block.
*/
```
```rust
pub fn isCaseBlock(node: Node) -> bool;
```
## isCatchClause

```java
/**
* Determines whether a node is an `catch` clause
*/
```
```rust
pub fn isCatchClause(node: Node) -> bool;
```
## isDefaultClause

```java
/**
* Determines whether a node is an `default` clause
*/
```
```rust
pub fn isDefaultClause(node: Node) -> bool;
```
## isCaseClause

```java
/**
* Determines whether a node is an `case` clause
*/
```
```rust
pub fn isCaseClause(node: Node) -> bool;
```
## isMissingDeclaration

```java
/**
* Determines whether a node is a missing declaration.
*/
```
```rust
pub fn isMissingDeclaration(node: Node) -> bool;
```
## isExportDeclaration

```java
/**
* Determines whether a node is an export declaration.
*/
```
```rust
pub fn isExportDeclaration(node: Node) -> bool;
```
## isModuleDeclaration

```java
/**
* Determines whether a node is a module declaration.
*/
```
```rust
pub fn isModuleDeclaration(node: Node) -> bool;
```
## isFunctionDeclaration

```java
/**
* Determines whether a node is a function declaration.
*/
```
```rust
pub fn isFunctionDeclaration(node: Node) -> bool;
```
## isWithStatement

```java
/**
* Determines whether a node is a `with` statement
*/
```
```rust
pub fn isWithStatement(node: Node) -> bool;
```
## isReturnStatement

```java
/**
* Determines whether a node is a `return` statement
*/
```
```rust
pub fn isReturnStatement(node: Node) -> bool;
```
## isEnhancedForStatement

```java
/**
* Determines whether a node is a `for`-`in` or `for`-`of` statement
*/
```
```rust
pub fn isEnhancedForStatement(node: Node) -> bool;
```
## isForInitializer

```java
/**
* Determines whether a node is a initializer of for statement or enhanced for statement.
*/
```
```rust
pub fn isForInitializer(node: Node) -> bool;
```
## isRelationalOperator

```java
/**
* Determines whether a node is a relational operator `<`, `<=`, `>`, `>=`, `instanceof` or `in`.
*/
```
```rust
pub fn isRelationalOperator(node: Node) -> bool;
```
## postDominanceFrontier

```java
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

```java
/**
* Determines whether a node is a `for` statement
*/
```
```rust
pub fn isForStatement(node: Node) -> bool;
```
## isDoWhileStatement

```java
/**
* Determines whether a node is a `do`-`while` statement
*/
```
```rust
pub fn isDoWhileStatement(node: Node) -> bool;
```
## isIfStatement

```java
/**
* Determines whether a node is an `if` statement
*/
```
```rust
pub fn isIfStatement(node: Node) -> bool;
```
## isExpressionStatement

```java
/**
* Determines whether a node is an expression statement
*/
```
```rust
pub fn isExpressionStatement(node: Node) -> bool;
```
## isStatement

```java
/**
* Determines whether a node is a statement
*/
```
```rust
pub fn isStatement(node: Node) -> bool;
```
## isStatementButNotDeclaration

```java
/**
* Determines whether a node is a statement, but not a declaration
*/
```
```rust
pub fn isStatementButNotDeclaration(node: Node) -> bool;
```
## isBitwiseOrAssignmentExpression

```java
/**
* Determines whether a node is a bitwise OR assignment expression using `|=`.
*/
```
```rust
pub fn isBitwiseOrAssignmentExpression(node: Node) -> bool;
```
## isDeclarationStatement

```java
/**
* Determines whether a node is a declaration statement
*/
```
```rust
pub fn isDeclarationStatement(node: Node) -> bool;
```
## isRelationalOperatorOrHigher

```java
/**
* Determines whether a node is a relational operator or higher.
*/
```
```rust
pub fn isRelationalOperatorOrHigher(node: Node) -> bool;
```
## isAnyKeyword

```java
/**
* Determines whether a node is an `any` keyword.
*/
```
```rust
pub fn isAnyKeyword(node: Node) -> bool;
```
## isAmpersandToken

```java
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

```java
/**
* Determines whether a node is a `/` token.
*/
```
```rust
pub fn isSlashToken(node: Node) -> bool;
```
## isBigIntLiteral

```java
/**
* Determines whether a node is a big-int literal.
*/
```
```rust
pub fn isBigIntLiteral(node: Node) -> bool;
```
## defLValue

```java
/**
* The relation of definitions and lvalues
*/
```
```rust
pub fn defLValue(def: ControlFlowNode, lValue: RefExpr) -> bool;
```
## isImportClause

```java
/**
* Determines whether a node is an import clause.
*/
```
```rust
pub fn isImportClause(node: Node) -> bool;
```
## isBindingName

```java
/**
* Determines whether a node is a binding name.
*/
```
```rust
pub fn isBindingName(node: Node) -> bool;
```
## isArrayBindingElement

```java
/**
* Determines whether a node is an array binding element.
*/
```
```rust
pub fn isArrayBindingElement(node: Node) -> bool;
```
## isExpressionWithTypeArguments

```java
/**
* Determines whether a node is an expression with type arguments.
*/
```
```rust
pub fn isExpressionWithTypeArguments(node: Node) -> bool;
```
## isBindingElement

```java
/**
* Determines whether a node is a binding element.
*/
```
```rust
pub fn isBindingElement(node: Node) -> bool;
```
## isMemberName

```java
/**
* Determines whether a node is a member name.
*/
```
```rust
pub fn isMemberName(node: Node) -> bool;
```
## isVariableDeclaration

```java
/**
* Determines whether a node is a variable declaration
*/
```
```rust
pub fn isVariableDeclaration(node: Node) -> bool;
```
## isParameter

```java
/**
* Determines whether a node kind is a parameter.
*/
```
```rust
pub fn isParameter(node: Node) -> bool;
```
## isTypeParameter

```java
/**
* Determines whether a node is a type parameter.
*/
```
```rust
pub fn isTypeParameter(node: Node) -> bool;
```
## isVariableDeclarationListKind

```java
/**
* Determines whether a node kind is a variable declaration list kind
*/
```
```rust
pub fn isVariableDeclarationListKind(kind: int) -> bool;
```
## isObjectKeyword

```java
/**
* Determines whether a node is an `object` keyword.
*/
```
```rust
pub fn isObjectKeyword(node: Node) -> bool;
```
## isExternalModuleReference

```java
/**
* Determines whether a node is an external module reference.
*/
```
```rust
pub fn isExternalModuleReference(node: Node) -> bool;
```
## isNamedExports

```java
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

```java
/**
* Determines whether a node is a literal type.
*/
```
```rust
pub fn isLiteralType(node: Node) -> bool;
```
## isImportSpecifier

```java
/**
* Determines whether a node is an import specifier.
*/
```
```rust
pub fn isImportSpecifier(node: Node) -> bool;
```
## isNamespaceImport

```java
/**
* Determines whether a node is a namespace import.
*/
```
```rust
pub fn isNamespaceImport(node: Node) -> bool;
```
## isTypeNode

```java
/**
* Determines whether a node is a type node.
*/
```
```rust
pub fn isTypeNode(node: Node) -> bool;
```
## isMetaProperty

```java
/**
* Determines whether a node is a meta property.
*/
```
```rust
pub fn isMetaProperty(node: Node) -> bool;
```
## isQualifiedName

```java
/**
* Determines whether a node is a qualified name.
*/
```
```rust
pub fn isQualifiedName(node: Node) -> bool;
```
## isObjectLiteralExpression

```java
/**
* Determines whether a node is an object literal expression.
*/
```
```rust
pub fn isObjectLiteralExpression(node: Node) -> bool;
```
## isTemplateLiteralLikeNode

```java
/**
* Determines whether a node is a template literal-like node, which is a no-substitution template literal, template head, template middle or template tail.
*/
```
```rust
pub fn isTemplateLiteralLikeNode(node: Node) -> bool;
```
## isFunctionLikeKind

```java
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

```java
/**
* Determines whether a node is a `false` keyword.
*/
```
```rust
pub fn isFalseKeyword(node: Node) -> bool;
```
## isBlockStatement

```java
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

```java
/**
* Determines whether a node is an equality operator `==`, `!=`, `===` or `!==`.
*/
```
```rust
pub fn isEqualityOperator(node: Node) -> bool;
```
## isUpdateOperator

```java
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

```java
/**
* Hold if npdomBB don't post dominates bb.
* the relation is same as not dominates relation but apply to Reverse-CFG.
*/
```
```rust
pub fn bbNotPostDominates(npdomBB: BasicBlock, bb: BasicBlock) -> bool;
```
## bbStrictDominates

```java
/**
* Hold if sdomBB strictly dominates bb.
*/
```
```rust
pub fn bbStrictDominates(sdomBB: BasicBlock, bb: BasicBlock) -> bool;
```
## bbDominates

```java
/**
* Hold if domBB dominates bb.
*/
```
```rust
pub fn bbDominates(domBB: BasicBlock, bb: BasicBlock) -> bool;
```
## bbNotDominates

```java
/**
* Hold if ndomBB don't dominates bb.
*/
```
```rust
pub fn bbNotDominates(ndomBB: BasicBlock, bb: BasicBlock) -> bool;
```
## entryBBReachableBB

```java
/**
* Hold the entry BB and it's all reachable BBs.
*/
```
```rust
pub fn entryBBReachableBB(entryBB: BasicBlock, reachableBB: BasicBlock) -> bool;
```
## isForOfStatement

```java
/**
* Determines whether a node is a `for`-`of` statement
*/
```
```rust
pub fn isForOfStatement(node: Node) -> bool;
```
## bbStrictPostDominates

```java
/**
* Hold if spdom strictly post dominates bb.
*/
```
```rust
pub fn bbStrictPostDominates(spdomBB: BasicBlock, bb: BasicBlock) -> bool;
```
## nodeInSameCFG

```java
/**
* Hold if two control flow nodes are in same CFG.
*/
```
```rust
pub fn nodeInSameCFG(cfn1: ControlFlowNode, cfn2: ControlFlowNode) -> bool;
```
## isStrictInequalityExpression

```java
/**
* Determines whether a node is a strict inequality expression using `!==`.
*/
```
```rust
pub fn isStrictInequalityExpression(node: Node) -> bool;
```
## isConditionalExpression

```java
/**
* Determines whether a node is a conditional expression.
*/
```
```rust
pub fn isConditionalExpression(node: Node) -> bool;
```
## isExportSpecifier

```java
/**
* Determines whether a node is an export specifier.
*/
```
```rust
pub fn isExportSpecifier(node: Node) -> bool;
```
## isLogicalAndAssignmentExpression

```java
/**
* Determines whether a node is a logical AND assignment expression using `&&=`.
*/
```
```rust
pub fn isLogicalAndAssignmentExpression(node: Node) -> bool;
```
## isPublicKeyword

```java
/**
* Determines whether a node is a `public` keyword.
*/
```
```rust
pub fn isPublicKeyword(node: Node) -> bool;
```
## isClassElementKind

```java
/**
* Determines whether a node kind is a ClassElement kind
*/
```
```rust
pub fn isClassElementKind(kind: int) -> bool;
```
## isClassLikeDeclarationKind

```java
/**
* Determines whether a node kind is a ClassLikeDeclaration kind
*/
```
```rust
pub fn isClassLikeDeclarationKind(kind: int) -> bool;
```
## isClassLikeDeclaration

```java
/**
* Determines whether a node is a ClassLikeDeclaration
*/
```
```rust
pub fn isClassLikeDeclaration(node: Node) -> bool;
```
## isMappedType

```java
/**
* Determines whether a node is a mapped type.
*/
```
```rust
pub fn isMappedType(node: Node) -> bool;
```
## isSameRefExpr

```java
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

```java
/**
* Gets the LValue nodes live at the exit of BB.
*/
```
```rust
pub fn defLiveAtBBExit(bb: BasicBlock) -> LValue;
```
## defLiveAtBBEntry

```java
/**
* Gets the LValue nodes live at the entry of BB.
*/
```
```rust
pub fn defLiveAtBBEntry(bb: BasicBlock) -> LValue;
```
## killedByBB

```java
/**
* Determine whether the lvalue is killed by bb.
*/
```
```rust
pub fn killedByBB(bb: BasicBlock, lvalue: LValue) -> bool;
```
## killedByBBWithKiller

```java
/**
* Gets the killers in BB that kill the given lvalue, with BB index.
*/
```
```rust
pub fn killedByBBWithKiller(bb: BasicBlock, lvalue: LValue, killer: LValue, index: int) -> bool;
```
## useAtBB

```java
/**
* Gets the VarUse used in bb, with bb index
*/
```
```rust
pub fn useAtBB(bb: BasicBlock, varUse: VarUse, index: int) -> bool;
```
## defAtBB

```java
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

```java
/**
* Determines whether a node is a CallLikeExpression or AccessExpression that may invoke a FunctionLikeDeclaration.
*/
```
```rust
pub fn isMayInvokeExpression(node: Node) -> bool;
```
## isNamedImports

```java
/**
* Determines whether a node is a named imports.
*/
```
```rust
pub fn isNamedImports(node: Node) -> bool;
```
## isDecorator

```java
/**
* Determines whether a node is a decorator.
*/
```
```rust
pub fn isDecorator(node: Node) -> bool;
```
## isDecrementExpression

```java
/**
* Determines whether a node is a decrement expression using `--`.
*/
```
```rust
pub fn isDecrementExpression(node: Node) -> bool;
```
## isIncrementExpression

```java
/**
* Determines whether a node is an increment expression using `++`.
*/
```
```rust
pub fn isIncrementExpression(node: Node) -> bool;
```
## isPostfixIncrementExpression

```java
/**
* Determines whether a node is a postfix increment expression using `++`.
*/
```
```rust
pub fn isPostfixIncrementExpression(node: Node) -> bool;
```
## isLogicalNotExpression

```java
/**
* Determines whether a node is a logical NOT expression using `!`.
*/
```
```rust
pub fn isLogicalNotExpression(node: Node) -> bool;
```
## postDominates

```java
/**
* Hold if pdom post dominates cfn.
*/
```
```rust
pub fn postDominates(pdom: ControlFlowNode, cfn: ControlFlowNode) -> bool;
```
## isUnaryMinusExpression

```java
/**
* Determines whether a node is an unary minus (also known as negation) expression using `-`.
*/
```
```rust
pub fn isUnaryMinusExpression(node: Node) -> bool;
```
## isUnaryPlusExpression

```java
/**
* Determines whether a node is an unary plus expression using `+`.
*/
```
```rust
pub fn isUnaryPlusExpression(node: Node) -> bool;
```
## isPrefixIncrementExpression

```java
/**
* Determines whether a node is a prefix increment expression using `++`.
*/
```
```rust
pub fn isPrefixIncrementExpression(node: Node) -> bool;
```
## succ

```java
/**
* Gets the control flow successor node of a control flow node,
* and with the Completion information.
*/
```
```rust
pub fn succ(n: ControlFlowNode, c: Completion) -> *ControlFlowNode;
```
## isRightShiftAssignmentExpression

```java
/**
* Determines whether a node is a right shift assignment expression using `>>=`.
*/
```
```rust
pub fn isRightShiftAssignmentExpression(node: Node) -> bool;
```
## isBitwiseXorAssignmentExpression

```java
/**
* Determines whether a node is a bitwise XOR assignment expression using `^=`.
*/
```
```rust
pub fn isBitwiseXorAssignmentExpression(node: Node) -> bool;
```
## isBitwiseNotExpression

```java
/**
* Determines whether a node is a bitwise NOT expression using `~`.
*/
```
```rust
pub fn isBitwiseNotExpression(node: Node) -> bool;
```
## isDivisionAssignmentExpression

```java
/**
* Determines whether a node is a division assignment expression using `/=`.
*/
```
```rust
pub fn isDivisionAssignmentExpression(node: Node) -> bool;
```
## isMultiplicationAssignmentExpression

```java
/**
* Determines whether a node is a multiplication assignment expression using `*=`.
*/
```
```rust
pub fn isMultiplicationAssignmentExpression(node: Node) -> bool;
```
## isExponentiationAssignmentExpression

```java
/**
* Determines whether a node is an exponentiation assignment expression using `**=`.
*/
```
```rust
pub fn isExponentiationAssignmentExpression(node: Node) -> bool;
```
## isEmptyStatement

```java
/**
* Determines whether a node is an empty statement.
*/
```
```rust
pub fn isEmptyStatement(node: Node) -> bool;
```
## isSubtractionAssignmentExpression

```java
/**
* Determines whether a node is a subtraction assignment expression using `-=`.
*/
```
```rust
pub fn isSubtractionAssignmentExpression(node: Node) -> bool;
```
## isAdditionAssignmentExpression

```java
/**
* Determines whether a node is an addition assignment expression using `+=`.
*/
```
```rust
pub fn isAdditionAssignmentExpression(node: Node) -> bool;
```
## isRightShiftExpression

```java
/**
* Determines whether a node is a signed right-shift expression using `>>`.
*/
```
```rust
pub fn isRightShiftExpression(node: Node) -> bool;
```
## isAssignmentExpression

```java
/**
* Determines whether a node is an assignment expression, either compound or simple.
*/
```
```rust
pub fn isAssignmentExpression(node: Node) -> bool;
```
## isNullishCoalescingExpression

```java
/**
* Determines whether a node is a nullish coalescing expression using `??`.
*/
```
```rust
pub fn isNullishCoalescingExpression(node: Node) -> bool;
```
## isLogicalOrExpression

```java
/**
* Determines whether a node is a logical OR expression using `||`.
*/
```
```rust
pub fn isLogicalOrExpression(node: Node) -> bool;
```
## isLogicalAndExpression

```java
/**
* Determines whether a node is a logical AND expression using `&&`.
*/
```
```rust
pub fn isLogicalAndExpression(node: Node) -> bool;
```
## continues

```java
/**
* If the body of loop finishes with completion,
* the loop will continue executing.
*/
```
```rust
pub fn continues(c: Completion, loop: IterationStatement) -> bool;
```
## isBinaryLogicalExpression

```java
/**
* Determines whether a node is a binary logical expression using
* `&&`, `||` or `??`.
*/
```
```rust
pub fn isBinaryLogicalExpression(node: Node) -> bool;
```
## isBitwiseXorExpression

```java
/**
* Determines whether a node is a bitwise XOR expression using `^`.
*/
```
```rust
pub fn isBitwiseXorExpression(node: Node) -> bool;
```
## isBitwiseAndExpression

```java
/**
* Determines whether a node is a bitwise AND expression using `&`.
*/
```
```rust
pub fn isBitwiseAndExpression(node: Node) -> bool;
```
## isNonStrictEqualityTestExpression

```java
/**
* Determines whether a node is a non-strict equality test expression using
* `==` or `!=`.
*/
```
```rust
pub fn isNonStrictEqualityTestExpression(node: Node) -> bool;
```
## isInequalityExpression

```java
/**
* Determines whether a node is an inequality expression using `!=`.
*/
```
```rust
pub fn isInequalityExpression(node: Node) -> bool;
```
## isEqualityExpression

```java
/**
* Determines whether a node is an equality expression using `==`.
*/
```
```rust
pub fn isEqualityExpression(node: Node) -> bool;
```
## isGreaterThanEqualsToken

```java
/**
* Determines whether a node is a `>=` token.
*/
```
```rust
pub fn isGreaterThanEqualsToken(node: Node) -> bool;
```
## isInstanceOfExpression

```java
/**
* Determines whether a node is an `instanceof` expression.
*/
```
```rust
pub fn isInstanceOfExpression(node: Node) -> bool;
```
## isClassElement

```java
/**
* Determines whether a node is a ClassElement
*/
```
```rust
pub fn isClassElement(node: Node) -> bool;
```
## isPostfixUnaryOperator

```java
/**
* Determines whether a node is a postfix unary operator.
*/
```
```rust
pub fn isPostfixUnaryOperator(node: Node) -> bool;
```
## isLessThanExpression

```java
/**
* Determines whether a node is a less-than expression using `<`.
*/
```
```rust
pub fn isLessThanExpression(node: Node) -> bool;
```
## isRelationalExpression

```java
/**
* Determines whether a node is a relational expression using `<`, `<=`, `>`, `>=`, `instanceof` or `in`.
*/
```
```rust
pub fn isRelationalExpression(node: Node) -> bool;
```
## isUnsignedRightShiftAssignmentExpression

```java
/**
* Determines whether a node is an unsigned right shift assignment expression using `>>>=`.
*/
```
```rust
pub fn isUnsignedRightShiftAssignmentExpression(node: Node) -> bool;
```
## isShiftExpression

```java
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

```java
/**
* Determines whether a node is a subtraction expression using `-`.
*/
```
```rust
pub fn isSubtractionExpression(node: Node) -> bool;
```
## isAwaitKeyword

```java
/**
* Determines whether a node is an `await` keyword.
*/
```
```rust
pub fn isAwaitKeyword(node: Node) -> bool;
```
## isAdditionExpression

```java
/**
* Determines whether a node is an addition expression using `+`.
*/
```
```rust
pub fn isAdditionExpression(node: Node) -> bool;
```
## dominates

```java
/**
* Hold if dom dominates cfn.
*/
```
```rust
pub fn dominates(dom: ControlFlowNode, cfn: ControlFlowNode) -> bool;
```
## isDivisionExpression

```java
/**
* Determines whether a node is a division expression using `/`.
*/
```
```rust
pub fn isDivisionExpression(node: Node) -> bool;
```
## isMultiplicationExpression

```java
/**
* Determines whether a node is a multiplication expression using `*`.
*/
```
```rust
pub fn isMultiplicationExpression(node: Node) -> bool;
```
## isMultiplicativeExpression

```java
/**
* Determines whether a node is a multiplicative expression using `*`, `/` or `%`.
*/
```
```rust
pub fn isMultiplicativeExpression(node: Node) -> bool;
```
## isNullishAssignmentExpression

```java
/**
* Determines whether a node is a nullish assignment expression using `??=`.
*/
```
```rust
pub fn isNullishAssignmentExpression(node: Node) -> bool;
```
## isPrimaryExpression

```java
/**
* Determines whether a node is a primary expression.
*/
```
```rust
pub fn isPrimaryExpression(node: Node) -> bool;
```
## isImportExpression

```java
/**
* Determines whether a node is an `import` expression.
*/
```
```rust
pub fn isImportExpression(node: Node) -> bool;
```
## isCommaListExpression

```java
/**
* Determines whether a node is a comma list expression.
*/
```
```rust
pub fn isCommaListExpression(node: Node) -> bool;
```
## isNonNullExpression

```java
/**
* Determines whether a node is a non-null expression.
*/
```
```rust
pub fn isNonNullExpression(node: Node) -> bool;
```
## isEqualsEqualsToken

```java
/**
* Determines whether a node is an `==` token.
*/
```
```rust
pub fn isEqualsEqualsToken(node: Node) -> bool;
```
## isLeftHandSideExpression

```java
/**
* Determines whether a node is a left-hand-side expression.
*/
```
```rust
pub fn isLeftHandSideExpression(node: Node) -> bool;
```
## isCommaToken

```java
/**
* Determines whether a node is a `,` token.
*/
```
```rust
pub fn isCommaToken(node: Node) -> bool;
```
## isSpreadElement

```java
/**
* Determines whether a node is a spread element.
*/
```
```rust
pub fn isSpreadElement(node: Node) -> bool;
```
## first

```java
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

```java
/**
* Determines whether a node is an `as` expression.
*/
```
```rust
pub fn isAsExpression(node: Node) -> bool;
```
## isPrefixUnaryExpression

```java
/**
* Determines whether a node is a prefix unary expression.
*/
```
```rust
pub fn isPrefixUnaryExpression(node: Node) -> bool;
```
## isVoidExpression

```java
/**
* Determines whether a node is a `void` expression.
*/
```
```rust
pub fn isVoidExpression(node: Node) -> bool;
```
## isTemplateSpan

```java
/**
* Determines whether a node is a template span.
*/
```
```rust
pub fn isTemplateSpan(node: Node) -> bool;
```
## isTypeOfExpression

```java
/**
* Determines whether a node is a `typeof` expression.
*/
```
```rust
pub fn isTypeOfExpression(node: Node) -> bool;
```
## isArrowFunction

```java
/**
* Determines whether a node is an arrow function
*/
```
```rust
pub fn isArrowFunction(node: Node) -> bool;
```
## isParenthesizedExpression

```java
/**
* Determines whether a node is a parenthesized expression.
*/
```
```rust
pub fn isParenthesizedExpression(node: Node) -> bool;
```
## isBinaryBitwiseExpression

```java
/**
* Determines whether a node is a binary bitwise expression using
* `&`, `|` or `^`.
*/
```
```rust
pub fn isBinaryBitwiseExpression(node: Node) -> bool;
```
## isNewExpression

```java
/**
* Determines whether a node is a new expression.
*/
```
```rust
pub fn isNewExpression(node: Node) -> bool;
```
## isPropertyAssignment

```java
/**
* Determines whether a node is a property assignment.
*/
```
```rust
pub fn isPropertyAssignment(node: Node) -> bool;
```
## isCallExpression

```java
/**
* Determines whether a node is a call expression.
*/
```
```rust
pub fn isCallExpression(node: Node) -> bool;
```
## isElementAccessExpression

```java
/**
* Determines whether a node is an element access expression.
*/
```
```rust
pub fn isElementAccessExpression(node: Node) -> bool;
```
## isPercentEqualsToken

```java
/**
* Determines whether a node is a `%=` token.
*/
```
```rust
pub fn isPercentEqualsToken(node: Node) -> bool;
```
## isTaggedTemplateExpression

```java
/**
* Determines whether a node is a tagged template expression.
*/
```
```rust
pub fn isTaggedTemplateExpression(node: Node) -> bool;
```
## isBooleanLiteral

```java
/**
* Determines whether a node is a boolean literal.
*/
```
```rust
pub fn isBooleanLiteral(node: Node) -> bool;
```
## isArrayLiteralExpression

```java
/**
* Determines whether a node is an array literal expression.
*/
```
```rust
pub fn isArrayLiteralExpression(node: Node) -> bool;
```
## isNoSubstitutionTemplateLiteral

```java
/**
* Determines whether a node is a no-substitution template literal.
*/
```
```rust
pub fn isNoSubstitutionTemplateLiteral(node: Node) -> bool;
```
## isFunctionTypeOrSignatureKind

```java
/**
* Determines whether a node kind is a FunctionTypeOrSignature kind
*/
```
```rust
pub fn isFunctionTypeOrSignatureKind(kind: int) -> bool;
```
## isThisType

```java
/**
* Determines whether a node is a this type.
*/
```
```rust
pub fn isThisType(node: Node) -> bool;
```
## isLessThanEqualsExpression

```java
/**
* Determines whether a node is a less-than-or-equal expression using `<=`.
*/
```
```rust
pub fn isLessThanEqualsExpression(node: Node) -> bool;
```
## isTypeReference

```java
/**
* Determines whether a node is a type reference.
*/
```
```rust
pub fn isTypeReference(node: Node) -> bool;
```
## isVariableDeclarationList

```java
/**
* Determines whether a node is a variable declaration list
*/
```
```rust
pub fn isVariableDeclarationList(node: Node) -> bool;
```
## isGreaterThanEqualsExpression

```java
/**
* Determines whether a node is a greater-than-or-equal expression using `>=`.
*/
```
```rust
pub fn isGreaterThanEqualsExpression(node: Node) -> bool;
```
## isAccessExpression

```java
/**
* Determines whether a node is an access expression.
*/
```
```rust
pub fn isAccessExpression(node: Node) -> bool;
```
## isPrefixUnaryOperator

```java
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

```java
/**
* Determines whether a node is an object binding pattern.
*/
```
```rust
pub fn isObjectBindingPattern(node: Node) -> bool;
```
## isUpdateExpression

```java
/**
* Determines whether a node is an update expression.
*/
```
```rust
pub fn isUpdateExpression(node: Node) -> bool;
```
## isPostfixUnaryExpression

```java
/**
* Determines whether a node is a postfix unary expression.
*/
```
```rust
pub fn isPostfixUnaryExpression(node: Node) -> bool;
```
## isBarBarToken

```java
/**
* Determines whether a node is a `||` token.
*/
```
```rust
pub fn isBarBarToken(node: Node) -> bool;
```
## isUnknownKeyword

```java
/**
* Determines whether a node is an `unknown` keyword.
*/
```
```rust
pub fn isUnknownKeyword(node: Node) -> bool;
```
## isControlNode

```java
/**
* Determines whether a node is a control Node
*/
```
```rust
pub fn isControlNode(node: Node) -> bool;
```
## isGreaterThanGreaterThanGreaterThanToken

```java
/**
* Determines whether a node is a `>>>` token.
*/
```
```rust
pub fn isGreaterThanGreaterThanGreaterThanToken(node: Node) -> bool;
```
## isPostfixDecrementExpression

```java
/**
* Determines whether a node is a postfix decrement expression using `--`.
*/
```
```rust
pub fn isPostfixDecrementExpression(node: Node) -> bool;
```
## isLessThanToken

```java
/**
* Determines whether a node is a `<` token.
*/
```
```rust
pub fn isLessThanToken(node: Node) -> bool;
```
## isAccessor

```java
/**
* Determines whether a node is an Accessor
*/
```
```rust
pub fn isAccessor(node: Node) -> bool;
```
## isDeclarationStatementKind

```java
/**
* Determines whether a node kind is a declaration statement kind
*/
```
```rust
pub fn isDeclarationStatementKind(kind: int) -> bool;
```
## isSuperKeyword

```java
/**
* Determines whether a node is a `super` keyword.
*/
```
```rust
pub fn isSuperKeyword(node: Node) -> bool;
```
## isStringLiteral

```java
/**
* Determines whether a node is a string literal.
*/
```
```rust
pub fn isStringLiteral(node: Node) -> bool;
```
## isMultiplicativeOperatorOrHigher

```java
/**
* Determines whether a node is a multiplicative operator or higher.
*/
```
```rust
pub fn isMultiplicativeOperatorOrHigher(node: Node) -> bool;
```
## isGetAccessor

```java
/**
* Determines whether a node is a `get` accessor
*/
```
```rust
pub fn isGetAccessor(node: Node) -> bool;
```
## isBinaryBitwiseOperator

```java
/**
* Determines whether a node is a binary bitwise operator `&`, `|` or `^`.
*/
```
```rust
pub fn isBinaryBitwiseOperator(node: Node) -> bool;
```
## isTemplateMiddle

```java
/**
* Determines whether a node is a template middle.
*/
```
```rust
pub fn isTemplateMiddle(node: Node) -> bool;
```
## isBigIntKeyword

```java
/**
* Determines whether a node is a `bigint` keyword.
*/
```
```rust
pub fn isBigIntKeyword(node: Node) -> bool;
```
## isSyntheticReferenceExpression

```java
/**
* Determines whether a node is a synthetic reference expression.
*/
```
```rust
pub fn isSyntheticReferenceExpression(node: Node) -> bool;
```
## isStrictEqualityExpression

```java
/**
* Determines whether a node is a strict equality expression using `===`.
*/
```
```rust
pub fn isStrictEqualityExpression(node: Node) -> bool;
```
## inBooleanContext

```java
/**
* a node that occur in a context in which their value affect control flow.
*/
```
```rust
pub fn inBooleanContext(n: ControlFlowNode) -> bool;
```
## isTypeLiteral

```java
/**
* Determines whether a node is a type literal.
*/
```
```rust
pub fn isTypeLiteral(node: Node) -> bool;
```
## isToken

```java
/**
* Determines whether a node is a token.
*/
```
```rust
pub fn isToken(node: Node) -> bool;
```
## isAsyncKeyword

```java
/**
* Determines whether a node is an `async` keyword.
*/
```
```rust
pub fn isAsyncKeyword(node: Node) -> bool;
```
## isStringKeyword

```java
/**
* Determines whether a node is a `string` keyword.
*/
```
```rust
pub fn isStringKeyword(node: Node) -> bool;
```
## isLiteralExpression

```java
/**
* Determines whether a node is a literal expression.
*/
```
```rust
pub fn isLiteralExpression(node: Node) -> bool;
```
## isMethodSignature

```java
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

```java
/**
* Determines whether a node is a node with type arguments.
*/
```
```rust
pub fn isNodeWithTypeArguments(node: Node) -> bool;
```
## isAssignmentOperatorOrHigher

```java
/**
* Determines whether a node is an assignment operator or higher.
*/
```
```rust
pub fn isAssignmentOperatorOrHigher(node: Node) -> bool;
```
## isAssignmentOperator

```java
/**
* Determines whether a node is a simple assignment operator `=` or a compound
* assignment operator.
*/
```
```rust
pub fn isAssignmentOperator(node: Node) -> bool;
```
## isBinaryLogicalOperatorOrHigher

```java
/**
* Determines whether a node is a logical operator or higher.
*/
```
```rust
pub fn isBinaryLogicalOperatorOrHigher(node: Node) -> bool;
```
## isEqualityOperatorOrHigher

```java
/**
* Determines whether a node is an equality operator or higher.
*/
```
```rust
pub fn isEqualityOperatorOrHigher(node: Node) -> bool;
```
## isShiftOperatorOrHigher

```java
/**
* Determines whether a node is a shift operator or higher.
*/
```
```rust
pub fn isShiftOperatorOrHigher(node: Node) -> bool;
```
## isShiftOperator

```java
/**
* Determines whether a node is a shift operator `<<`, `>>` or `>>>`.
*/
```
```rust
pub fn isShiftOperator(node: Node) -> bool;
```
## isAdditiveOperatorOrHigher

```java
/**
* Determines whether a node is an additive operator or higher.
*/
```
```rust
pub fn isAdditiveOperatorOrHigher(node: Node) -> bool;
```
## isPropertyAccessExpression

```java
/**
* Determines whether a node is a property access expression.
*/
```
```rust
pub fn isPropertyAccessExpression(node: Node) -> bool;
```
## isAdditiveOperator

```java
/**
* Determines whether a node is an additive operator `+` or `-`.
*/
```
```rust
pub fn isAdditiveOperator(node: Node) -> bool;
```
## isTemplateTail

```java
/**
* Determines whether a node is a template tail.
*/
```
```rust
pub fn isTemplateTail(node: Node) -> bool;
```
## isTypeElement

```java
/**
* Determines whether a node is a type element.
*/
```
```rust
pub fn isTypeElement(node: Node) -> bool;
```
## isExponentiationOperator

```java
/**
* Determines whether a node is an exponentiation operator `**`.
*/
```
```rust
pub fn isExponentiationOperator(node: Node) -> bool;
```
## isLeftShiftAssignmentExpression

```java
/**
* Determines whether a node is a left shift assignment expression using `<<=`.
*/
```
```rust
pub fn isLeftShiftAssignmentExpression(node: Node) -> bool;
```
## isAdditiveExpression

```java
/**
* Determines whether a node is an additive expression using `+` or `-`.
*/
```
```rust
pub fn isAdditiveExpression(node: Node) -> bool;
```
## isExponentiationExpression

```java
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

```java
/**
* Determines whether a node is a yield expression.
*/
```
```rust
pub fn isYieldExpression(node: Node) -> bool;
```
## isTryStatement

```java
/**
* Determines whether a node is a `try` statement
*/
```
```rust
pub fn isTryStatement(node: Node) -> bool;
```
## isCompoundAssignmentOperator

```java
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

```java
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

```java
/**
* Determines whether a node is a `++` token.
*/
```
```rust
pub fn isPlusPlusToken(node: Node) -> bool;
```
## isNumberKeyword

```java
/**
* Determines whether a node is a `number` keyword.
*/
```
```rust
pub fn isNumberKeyword(node: Node) -> bool;
```
## isBitwiseOrExpression

```java
/**
* Determines whether a node is a bitwise OR expression using `|`.
*/
```
```rust
pub fn isBitwiseOrExpression(node: Node) -> bool;
```
## isNeverKeyword

```java
/**
* Determines whether a node is a `never` keyword.
*/
```
```rust
pub fn isNeverKeyword(node: Node) -> bool;
```
## isAsteriskAsteriskToken

```java
/**
* Determines whether a node is a `**` token.
*/
```
```rust
pub fn isAsteriskAsteriskToken(node: Node) -> bool;
```
## isMultiplicativeOperator

```java
/**
* Determines whether a node is a multiplicative operator `*`, `/` or `%`.
*/
```
```rust
pub fn isMultiplicativeOperator(node: Node) -> bool;
```
## isRemainderAssignmentExpression

```java
/**
* Determines whether a node is a remainder assignment expression using `%=`.
*/
```
```rust
pub fn isRemainderAssignmentExpression(node: Node) -> bool;
```
## isAmpersandAmpersandEqualsToken

```java
/**
* Determines whether a node is an `&&=` token.
*/
```
```rust
pub fn isAmpersandAmpersandEqualsToken(node: Node) -> bool;
```
## isImplementsKeyword

```java
/**
* Determines whether a node is an `implements` keyword.
*/
```
```rust
pub fn isImplementsKeyword(node: Node) -> bool;
```
## isQuestionToken

```java
/**
* Determines whether a node is a `?` token.
*/
```
```rust
pub fn isQuestionToken(node: Node) -> bool;
```
## isModifierKind

```java
/**
* Determines whether a node kind is a modifier kind.
*/
```
```rust
pub fn isModifierKind(kind: int) -> bool;
```
## isThisKeyword

```java
/**
* Determines whether a node is a `this` keyword.
*/
```
```rust
pub fn isThisKeyword(node: Node) -> bool;
```
## isNullKeyword

```java
/**
* Determines whether a node is a `null` keyword.
*/
```
```rust
pub fn isNullKeyword(node: Node) -> bool;
```
## isInstanceOfKeyword

```java
/**
* Determines whether a node is an `instanceof` keyword.
*/
```
```rust
pub fn isInstanceOfKeyword(node: Node) -> bool;
```
## isInKeyword

```java
/**
* Determines whether a node is an `in` keyword.
*/
```
```rust
pub fn isInKeyword(node: Node) -> bool;
```
## isTemplateHead

```java
/**
* Determines whether a node is a template head.
*/
```
```rust
pub fn isTemplateHead(node: Node) -> bool;
```
## bbIDominates

```java
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

```java
/**
* Determines whether a node is an identifier.
*/
```
```rust
pub fn isIdentifier(node: Node) -> bool;
```
## isTokenKind

```java
/**
* Determines whether a node kind is a token kind.
*/
```
```rust
pub fn isTokenKind(kind: int) -> bool;
```
## isExclamationEqualsToken

```java
/**
* Determines whether a node is a `!=` token.
*/
```
```rust
pub fn isExclamationEqualsToken(node: Node) -> bool;
```
## isGreaterThanGreaterThanEqualsToken

```java
/**
* Determines whether a node is a `>>=` token.
*/
```
```rust
pub fn isGreaterThanGreaterThanEqualsToken(node: Node) -> bool;
```
## isBinaryOperator

```java
/**
* Determines whether a node is a binary operator.
*/
```
```rust
pub fn isBinaryOperator(node: Node) -> bool;
```
## isAwaitExpression

```java
/**
* Determines whether a node is an `await` expression.
*/
```
```rust
pub fn isAwaitExpression(node: Node) -> bool;
```
## isAsteriskEqualsToken

```java
/**
* Determines whether a node is an `*=` token.
*/
```
```rust
pub fn isAsteriskEqualsToken(node: Node) -> bool;
```
## isMinusEqualsToken

```java
/**
* Determines whether a node is a `-=` token.
*/
```
```rust
pub fn isMinusEqualsToken(node: Node) -> bool;
```
## isQuestionQuestionToken

```java
/**
* Determines whether a node is a `??` token.
*/
```
```rust
pub fn isQuestionQuestionToken(node: Node) -> bool;
```
## controlDependencies

```java
/**
* Hold bb's control dependencies.
* same with postDominanceFrontier+.
*/
```
```rust
pub fn controlDependencies(bb: BasicBlock, controlDependencyBB: BasicBlock) -> bool;
```
## isAmpersandAmpersandToken

```java
/**
* Determines whether a node is an `&&` token.
*/
```
```rust
pub fn isAmpersandAmpersandToken(node: Node) -> bool;
```
## isBreakStatement

```java
/**
* Determines whether a node is a `break` statement
*/
```
```rust
pub fn isBreakStatement(node: Node) -> bool;
```
## isImportKeyword

```java
/**
* Determines whether a node is an `import` keyword.
*/
```
```rust
pub fn isImportKeyword(node: Node) -> bool;
```
## isTildeToken

```java
/**
* Determines whether a node is a `~` token.
*/
```
```rust
pub fn isTildeToken(node: Node) -> bool;
```
## getSymbol

```java
/**
* Get the corresponding symbol of a RefExpr.
* It also gets the value symbol of a ShorthandPropertyAssignment or the name node (Identifier) of it.
*/
```
```rust
pub fn getSymbol(refExpr: RefExpr) -> Symbol;
```
## isExclamationToken

```java
/**
* Determines whether a node is an `!` token.
*/
```
```rust
pub fn isExclamationToken(node: Node) -> bool;
```
## isGreaterThanGreaterThanToken

```java
/**
* Determines whether a node is a `>>` token.
*/
```
```rust
pub fn isGreaterThanGreaterThanToken(node: Node) -> bool;
```
## isArrayBindingPattern

```java
/**
* Determines whether a node is an array binding pattern.
*/
```
```rust
pub fn isArrayBindingPattern(node: Node) -> bool;
```
## isFunctionExpression

```java
/**
* Determines whether a node is a function expression
*/
```
```rust
pub fn isFunctionExpression(node: Node) -> bool;
```
## isPercentToken

```java
/**
* Determines whether a node is a `%` token.
*/
```
```rust
pub fn isPercentToken(node: Node) -> bool;
```
## isAsteriskToken

```java
/**
* Determines whether a node is a `*` token.
*/
```
```rust
pub fn isAsteriskToken(node: Node) -> bool;
```
## isMinusToken

```java
/**
* Determines whether a node is a `-` token.
*/
```
```rust
pub fn isMinusToken(node: Node) -> bool;
```
## isLessThanLessThanEqualsToken

```java
/**
* Determines whether a node is a `<<=` token.
*/
```
```rust
pub fn isLessThanLessThanEqualsToken(node: Node) -> bool;
```
## last

```java
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

```java
/**
* Determines whether a node is a `+` token.
*/
```
```rust
pub fn isPlusToken(node: Node) -> bool;
```
## isCommaExpression

```java
/**
* Determines whether a node is a comma expression using `,`.
*/
```
```rust
pub fn isCommaExpression(node: Node) -> bool;
```
## isGreaterThanToken

```java
/**
* Determines whether a node is a `>` token.
*/
```
```rust
pub fn isGreaterThanToken(node: Node) -> bool;
```
## isExclamationEqualsEqualsToken

```java
/**
* Determines whether a node is a `!==` token.
*/
```
```rust
pub fn isExclamationEqualsEqualsToken(node: Node) -> bool;
```
## isEqualsEqualsEqualsToken

```java
/**
* Determines whether a node is an `===` token.
*/
```
```rust
pub fn isEqualsEqualsEqualsToken(node: Node) -> bool;
```
## isBarBarEqualsToken

```java
/**
* Determines whether a node is a `||=` token.
*/
```
```rust
pub fn isBarBarEqualsToken(node: Node) -> bool;
```
## isExtendsKeyword

```java
/**
* Determines whether a node is an `extends` keyword.
*/
```
```rust
pub fn isExtendsKeyword(node: Node) -> bool;
```
## isDotDotDotToken

```java
/**
* Determines whether a node is a `...` token.
*/
```
```rust
pub fn isDotDotDotToken(node: Node) -> bool;
```
## isClassDeclaration

```java
/**
* Determines whether a node is a class declaration.
*/
```
```rust
pub fn isClassDeclaration(node: Node) -> bool;
```
## isIterationStatement

```java
/**
* Determine whether a node is an iteration statement, including `while`, `do`-`while`,
* `for` and enhanced `for` (`for`-`in`, `for`-`of`) statements.
*/
```
```rust
pub fn isIterationStatement(node: Node) -> bool;
```
## isJsxSelfClosingElement

```java
/**
* Determines whether a node is a JSX self closing element.
*/
```
```rust
pub fn isJsxSelfClosingElement(node: Node) -> bool;
```
## mayThrow

```java
/**
* Determine whether a control flow node throws
* an exception.
*/
```
```rust
pub fn mayThrow(cfn: ControlFlowNode) -> bool;
```
## isClassExpression

```java
/**
* Determines whether a node is a class expression.
*/
```
```rust
pub fn isClassExpression(node: Node) -> bool;
```
## isRegularExpressionLiteral

```java
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

```java
/**
* Determines whether a node is a `<=` token.
*/
```
```rust
pub fn isLessThanEqualsToken(node: Node) -> bool;
```
## isNumericLiteral

```java
/**
* Determines whether a node is a numeric literal.
*/
```
```rust
pub fn isNumericLiteral(node: Node) -> bool;
```
## isBarEqualsToken

```java
/**
* Determines whether a node is a `|=` token.
*/
```
```rust
pub fn isBarEqualsToken(node: Node) -> bool;
```
## isEndOfFileToken

```java
/**
* Determines whether a node is an end-of-file token.
*/
```
```rust
pub fn isEndOfFileToken(node: Node) -> bool;
```
## isIntrinsicKeyword

```java
/**
* Determines whether a node is an `intrinsic` keyword.
*/
```
```rust
pub fn isIntrinsicKeyword(node: Node) -> bool;
```
## isUnknown

```java
/**
* Determines whether a node is an unknown token.
*/
```
```rust
pub fn isUnknown(node: Node) -> bool;
```
## isCaretToken

```java
/**
* Determines whether a node is a `^` token.
*/
```
```rust
pub fn isCaretToken(node: Node) -> bool;
```
## isForInStatement

```java
/**
* Determines whether a node is a `for`-`in` statement
*/
```
```rust
pub fn isForInStatement(node: Node) -> bool;
```
## isJsxOpeningElement

```java
/**
* Determines whether a node is a JSX opening element.
*/
```
```rust
pub fn isJsxOpeningElement(node: Node) -> bool;
```
## isKeywordToken

```java
/**
* Determines whether a node is a keyword token.
*/
```
```rust
pub fn isKeywordToken(node: Node) -> bool;
```
## isAmpersandEqualsToken

```java
/**
* Determines whether a node is an `&=` token.
*/
```
```rust
pub fn isAmpersandEqualsToken(node: Node) -> bool;
```
## isLeftShiftExpression

```java
/**
* Determines whether a node is a left-shift expression using `<<`.
*/
```
```rust
pub fn isLeftShiftExpression(node: Node) -> bool;
```
## isAbstractKeyword

```java
/**
* Determines whether a node is an `abstract` keyword.
*/
```
```rust
pub fn isAbstractKeyword(node: Node) -> bool;
```
## isInferType

```java
/**
* Determines whether a node is an infer type.
*/
```
```rust
pub fn isInferType(node: Node) -> bool;
```
## isAsteriskAsteriskEqualsToken

```java
/**
* Determines whether a node is an `**=` token.
*/
```
```rust
pub fn isAsteriskAsteriskEqualsToken(node: Node) -> bool;
```
## isGreaterThanGreaterThanGreaterThanEqualsToken

```java
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

```java
/**
* Determines whether a node is an array type.
*/
```
```rust
pub fn isArrayType(node: Node) -> bool;
```
## isMethodDeclaration

```java
/**
* Determines whether a node is a MethodDeclaration
*/
```
```rust
pub fn isMethodDeclaration(node: Node) -> bool;
```
## isPropertySignature

```java
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

```java
/**
* Determines whether a node is a namespace export.
*/
```
```rust
pub fn isNamespaceExport(node: Node) -> bool;
```
## isUnsignedRightShiftExpression

```java
/**
* Determines whether a node is a unsigned right-shift expression using `>>>`.
*/
```
```rust
pub fn isUnsignedRightShiftExpression(node: Node) -> bool;
```
## isBinaryExpression

```java
/**
* Determines whether a node is a binary expression
*/
```
```rust
pub fn isBinaryExpression(node: Node) -> bool;
```
## isSuperExpression

```java
/**
* Determines whether a node is a `super` expression.
*/
```
```rust
pub fn isSuperExpression(node: Node) -> bool;
```
## isSlashEqualsToken

```java
/**
* Determines whether a node is a `/=` token.
*/
```
```rust
pub fn isSlashEqualsToken(node: Node) -> bool;
```
## isRemainderExpression

```java
/**
* Determines whether a node is a remainder expression using `%`.
*/
```
```rust
pub fn isRemainderExpression(node: Node) -> bool;
```
## isAccessorKind

```java
/**
* Determines whether a node kind is an Accessor kind
*/
```
```rust
pub fn isAccessorKind(kind: int) -> bool;
```
## isHeritageClause

```java
/**
* Determines whether a node is a heritage clause.
*/
```
```rust
pub fn isHeritageClause(node: Node) -> bool;
```
## isVariableDeclarationKind

```java
/**
* Determines whether a node kind is a variable declaration kind
*/
```
```rust
pub fn isVariableDeclarationKind(kind: int) -> bool;
```
## isCompoundAssignmentExpression

```java
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

```java
/**
* Determines whether a node is a `<<` token.
*/
```
```rust
pub fn isLessThanLessThanToken(node: Node) -> bool;
```
## isProtectedKeyword

```java
/**
* Determines whether a node is a `protected` keyword.
*/
```
```rust
pub fn isProtectedKeyword(node: Node) -> bool;
```
## isPlusEqualsToken

```java
/**
* Determines whether a node is a `+=` token.
*/
```
```rust
pub fn isPlusEqualsToken(node: Node) -> bool;
```
## isBinaryLogicalOperator

```java
/**
* Determines whether a node is a logical operator `&&`, `||` or `??`.
*/
```
```rust
pub fn isBinaryLogicalOperator(node: Node) -> bool;
```
## isTypeAliasDeclaration

```java
/**
* Determines whether a node is a type alias declaration.
*/
```
```rust
pub fn isTypeAliasDeclaration(node: Node) -> bool;
```
## isFunctionLikeDeclarationKind

```java
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

```java
/**
* Determines whether a node is a `true` keyword.
*/
```
```rust
pub fn isTrueKeyword(node: Node) -> bool;
```
## isMemberExpression

```java
/**
* Determines whether a node is a member expression.
*/
```
```rust
pub fn isMemberExpression(node: Node) -> bool;
```
## isSimpleAssignmentExpression

```java
/**
* Determines whether a node is a simple assignment expression using `=`.
*/
```
```rust
pub fn isSimpleAssignmentExpression(node: Node) -> bool;
```
## isQuestionQuestionEqualsToken

```java
/**
* Determines whether a node is a `??=` token.
*/
```
```rust
pub fn isQuestionQuestionEqualsToken(node: Node) -> bool;
```
## isCallLikeExpression

```java
/**
* Determines whether a node is a call-like expression.
*/
```
```rust
pub fn isCallLikeExpression(node: Node) -> bool;
```
## syntaxKind

```java
/**
* The predict for the value and name pairs of SyntaxKinds
*/
```
```rust
pub fn syntaxKind(kind: int, name: string) -> bool;
```
## isIndexSignature

```java
/**
* Determines whether a node is an index signature.
*/
```
```rust
pub fn isIndexSignature(node: Node) -> bool;
```
## isCaretEqualsToken

```java
/**
* Determines whether a node is a `^=` token.
*/
```
```rust
pub fn isCaretEqualsToken(node: Node) -> bool;
```
## isUnionType

```java
/**
* Determines whether a node is an union type.
*/
```
```rust
pub fn isUnionType(node: Node) -> bool;
```
## isConstructSignature

```java
/**
* Determines whether a node is a construct signature.
*/
```
```rust
pub fn isConstructSignature(node: Node) -> bool;
```
## isCallSignature

```java
/**
* Determines whether a node is a call signature.
*/
```
```rust
pub fn isCallSignature(node: Node) -> bool;
```
## isFirstOfBasicBlock

```java
/**
* Hold if the node is the first node of a basic block.
*/
```
```rust
pub fn isFirstOfBasicBlock(cfn: ControlFlowNode) -> bool;
```
## isUnaryExpression

```java
/**
* Determines whether a node is an unary expression.
*/
```
```rust
pub fn isUnaryExpression(node: Node) -> bool;
```
## isImportType

```java
/**
* Determines whether a node is an import type.
*/
```
```rust
pub fn isImportType(node: Node) -> bool;
```
## isTemplateLiteralTypeSpan

```java
/**
* Determines whether a node is a template literal type span.
*/
```
```rust
pub fn isTemplateLiteralTypeSpan(node: Node) -> bool;
```
## isNamedTupleMember

```java
/**
* Determines whether a node is a named tuple member.
*/
```
```rust
pub fn isNamedTupleMember(node: Node) -> bool;
```
## isQuestionDotToken

```java
/**
* Determines whether a node is a `?.` token.
*/
```
```rust
pub fn isQuestionDotToken(node: Node) -> bool;
```
## isNamespaceExportDeclaration

```java
/**
* Determines whether a node is a namespace export declaration.
*/
```
```rust
pub fn isNamespaceExportDeclaration(node: Node) -> bool;
```
## isLogicalOrAssignmentExpression

```java
/**
* Determines whether a node is a logical OR assignment expression using `||=`.
*/
```
```rust
pub fn isLogicalOrAssignmentExpression(node: Node) -> bool;
```
## isTypeOperator

```java
/**
* Determines whether a node is a type operator.
*/
```
```rust
pub fn isTypeOperator(node: Node) -> bool;
```
## isInExpression

```java
/**
* Determines whether a node is an `in` expression.
*/
```
```rust
pub fn isInExpression(node: Node) -> bool;
```
## isSymbolKeyword

```java
/**
* Determines whether a node is a `symbol` keyword.
*/
```
```rust
pub fn isSymbolKeyword(node: Node) -> bool;
```
## isConditionalType

```java
/**
* Determines whether a node is a conditional type.
*/
```
```rust
pub fn isConditionalType(node: Node) -> bool;
```
## isPrivateIdentifier

```java
/**
* Determines whether a node is a private identifier.
*/
```
```rust
pub fn isPrivateIdentifier(node: Node) -> bool;
```
## isIntersectionType

```java
/**
* Determines whether a node is an intersection type.
*/
```
```rust
pub fn isIntersectionType(node: Node) -> bool;
```
## isTypeAssertionExpression

```java
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

```java
/**
* Determine whether a control flow node is a post order node.
*/
```
```rust
pub fn isPostOrderNode(controlFlowNode: ControlFlowNode) -> bool;
```
## isRestType

```java
/**
* Determines whether a node is a rest type.
*/
```
```rust
pub fn isRestType(node: Node) -> bool;
```
## isOptionalType

```java
/**
* Determines whether a node is an optional type.
*/
```
```rust
pub fn isOptionalType(node: Node) -> bool;
```
## isBitwiseAndAssignmentExpression

```java
/**
* Determines whether a node is a bitwise AND assignment expression using `&=`.
*/
```
```rust
pub fn isBitwiseAndAssignmentExpression(node: Node) -> bool;
```
## isEqualityTestExpression

```java
/**
* Determines whether a node is an equality test expression using `==`, `!=`,
* `===` or `!==`.
*/
```
```rust
pub fn isEqualityTestExpression(node: Node) -> bool;
```
## isBooleanKeyword

```java
/**
* Determines whether a node is a `boolean` keyword.
*/
```
```rust
pub fn isBooleanKeyword(node: Node) -> bool;
```
## isConstructor

```java
/**
* Determines whether a node is a Constructor
*/
```
```rust
pub fn isConstructor(node: Node) -> bool;
```
## isTupleType

```java
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

```java
/**
* Determines whether a node is a type query.
*/
```
```rust
pub fn isTypeQuery(node: Node) -> bool;
```
## isTypePredicate

```java
/**
* Determines whether a node is a type predicate.
*/
```
```rust
pub fn isTypePredicate(node: Node) -> bool;
```
## isConstructorType

```java
/**
* Determines whether a node is a constructor type.
*/
```
```rust
pub fn isConstructorType(node: Node) -> bool;
```
## isExportAssignment

```java
/**
* Determines whether a node is an export assignment.
*/
```
```rust
pub fn isExportAssignment(node: Node) -> bool;
```
## isPartiallyEmittedExpression

```java
/**
* Determines whether a node is a partially emitted expression.
*/
```
```rust
pub fn isPartiallyEmittedExpression(node: Node) -> bool;
```
## isInterfaceDeclaration

```java
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

```java
/**
* Determines whether a node is an import-equals declaration.
*/
```
```rust
pub fn isImportEqualsDeclaration(node: Node) -> bool;
```
## isWhileStatement

```java
/**
* Determines whether a node is a `while` statement
*/
```
```rust
pub fn isWhileStatement(node: Node) -> bool;
```
## isGreaterThanExpression

```java
/**
* Determines whether a node is a greater-than expression using `>`.
*/
```
```rust
pub fn isGreaterThanExpression(node: Node) -> bool;
```
## isNullLiteral

```java
/**
* Determines whether a node is a null literal.
*/
```
```rust
pub fn isNullLiteral(node: Node) -> bool;
```
## isVariableStatement

```java
/**
* Determines whether a node is a variable statement
*/
```
```rust
pub fn isVariableStatement(node: Node) -> bool;
```
## isImportDeclaration

```java
/**
* Determines whether a node is an import declaration.
*/
```
```rust
pub fn isImportDeclaration(node: Node) -> bool;
```
## isMinusMinusToken

```java
/**
* Determines whether a node is a `--` token.
*/
```
```rust
pub fn isMinusMinusToken(node: Node) -> bool;
```
## isContinueStatement

```java
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

```java
/**
* Determines whether a node is a function type.
*/
```
```rust
pub fn isFunctionType(node: Node) -> bool;
```
## isTemplateExpression

```java
/**
* Determines whether a node is a template expression.
*/
```
```rust
pub fn isTemplateExpression(node: Node) -> bool;
```
## isJsxText

```java
/**
* Determines whether a node is a JSX text.
*/
```
```rust
pub fn isJsxText(node: Node) -> bool;
```
## isParenthesizedType

```java
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

```java
/**
* Hold if pdomBB post dominates bb.
*/
```
```rust
pub fn bbPostDominates(pdomBB: BasicBlock, bb: BasicBlock) -> bool;
```
## isEnumDeclaration

```java
/**
* Determines whether a node is an enum declaration.
*/
```
```rust
pub fn isEnumDeclaration(node: Node) -> bool;
```
## isPropertyNameInPropertyAssignment

```java
/**
* Determine a PropertyName expr exists in a PropertyAssignment expr.
*/
```
```rust
pub fn isPropertyNameInPropertyAssignment(propertyName: PropertyName) -> bool;
```
## isBindingPattern

```java
/**
* Determines whether a node is a binding pattern.
*/
```
```rust
pub fn isBindingPattern(node: Node) -> bool;
```
## bbInSameCFG

```java
/**
* Hold if two bb are in same CFG.
*/
```
```rust
pub fn bbInSameCFG(bb1: BasicBlock, bb2: BasicBlock) -> bool;
```
## isOmittedExpression

```java
/**
* Determines whether a node is an omitted expression.
*/
```
```rust
pub fn isOmittedExpression(node: Node) -> bool;
```
## isBinaryBitwiseOperatorOrHigher

```java
/**
* Determines whether a node is a binary bitwise operator or higher.
*/
```
```rust
pub fn isBinaryBitwiseOperatorOrHigher(node: Node) -> bool;
```
## isFunctionLike

```java
/**
* Determines whether a node is a FunctionLike
*/
```
```rust
pub fn isFunctionLike(node: Node) -> bool;
```
## isSetAccessor

```java
/**
* Determines whether a node is a `set` accessor
*/
```
```rust
pub fn isSetAccessor(node: Node) -> bool;
```
## dominanceFrontier

```java
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

```java
/**
* Determines whether a node is a template literal type.
*/
```
```rust
pub fn isTemplateLiteralType(node: Node) -> bool;
```
## isHeritageToken

```java
/**
* Determines whether a node is a heritage token, that is an `extends` or `implements` keyword.
*/
```
```rust
pub fn isHeritageToken(node: Node) -> bool;
```
## isBarToken

```java
/**
* Determines whether a node is a `|` token.
*/
```
```rust
pub fn isBarToken(node: Node) -> bool;
```
## isPrefixDecrementExpression

```java
/**
* Determines whether a node is a prefix decrement expression using `--`.
*/
```
```rust
pub fn isPrefixDecrementExpression(node: Node) -> bool;
```
## isEnumMember

```java
/**
* Determines whether a node is an enum member.
*/
```
```rust
pub fn isEnumMember(node: Node) -> bool;
```
## isDeleteExpression

```java
/**
* Determines whether a node is a `delete` expression.
*/
```
```rust
pub fn isDeleteExpression(node: Node) -> bool;
```
## isIndexedAccessType

```java
/**
* Determines whether a node is an indexed access type.
*/
```
```rust
pub fn isIndexedAccessType(node: Node) -> bool;
```
## isVoidKeyword

```java
/**
* Determines whether a node is a `void` keyword.
*/
```
```rust
pub fn isVoidKeyword(node: Node) -> bool;
```
## isSyntheticExpression

```java
/**
* Determines whether a node is a synthetic expression.
*/
```
```rust
pub fn isSyntheticExpression(node: Node) -> bool;
```
## isKeywordTypeNode

```java
/**
* Determines whether a node is a keyword type node.
*/
```
```rust
pub fn isKeywordTypeNode(node: Node) -> bool;
```
## isFunctionBlock

```java
/**
* Determines whether a node is a FunctionBlock
*/
```
```rust
pub fn isFunctionBlock(node: Node) -> bool;
```
## isExpression

```java
/**
* Determines whether a node is an expression.
*/
```
```rust
pub fn isExpression(node: Node) -> bool;
```
## isStrictEqualityTestExpression

```java
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

```java
/**
* Determines whether a node is an `=` token.
*/
```
```rust
pub fn isEqualsToken(node: Node) -> bool;
```
## isThisExpression

```java
/**
* Determines whether a node is a `this` expression.
*/
```
```rust
pub fn isThisExpression(node: Node) -> bool;
```
## isUndefinedKeyword

```java
/**
* Determines whether a node is an `undefined` keyword.
*/
```
```rust
pub fn isUndefinedKeyword(node: Node) -> bool;
```
