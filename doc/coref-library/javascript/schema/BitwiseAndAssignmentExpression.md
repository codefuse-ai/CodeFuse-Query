# BitwiseAndAssignmentExpression

Primary key: `id: int`

```rust
schema BitwiseAndAssignmentExpression {
  @primary id: int,
}
```
## BitwiseAndAssignmentExpression::getRight

```rust
/**
     * Get the right operand of this binary expression. An alias of `getRightOperand`
     */
```
```rust
pub fn getRight(self: BitwiseAndAssignmentExpression) -> Expression;
```
## BitwiseAndAssignmentExpression::getIndex

```rust
pub fn getIndex(self: BitwiseAndAssignmentExpression) -> int;
```
## BitwiseAndAssignmentExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: BitwiseAndAssignmentExpression) -> int;
```
## BitwiseAndAssignmentExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: BitwiseAndAssignmentExpression) -> int;
```
## BitwiseAndAssignmentExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: BitwiseAndAssignmentExpression) -> FunctionLikeDeclaration;
```
## BitwiseAndAssignmentExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: BitwiseAndAssignmentExpression) -> Node;
```
## BitwiseAndAssignmentExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: BitwiseAndAssignmentExpression) -> int;
```
## BitwiseAndAssignmentExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: BitwiseAndAssignmentExpression) -> *Modifier;
```
## BitwiseAndAssignmentExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: BitwiseAndAssignmentExpression) -> int;
```
## BitwiseAndAssignmentExpression::getLeft

```rust
/**
     * Get the left operand of this binary expression. An alias of `getLeftOperand`.
     */
```
```rust
pub fn getLeft(self: BitwiseAndAssignmentExpression) -> Expression;
```
## BitwiseAndAssignmentExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: BitwiseAndAssignmentExpression) -> *Node;
```
## BitwiseAndAssignmentExpression::getOperator

```rust
/**
     * Get the operator of this binary expression.
     */
```
```rust
pub fn getOperator(self: BitwiseAndAssignmentExpression) -> BinaryOperator;
```
## BitwiseAndAssignmentExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: BitwiseAndAssignmentExpression) -> Location;
```
## BitwiseAndAssignmentExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: BitwiseAndAssignmentExpression) -> string;
```
## BitwiseAndAssignmentExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: BitwiseAndAssignmentExpression) -> int;
```
## BitwiseAndAssignmentExpression::getAnOperand

```rust
pub fn getAnOperand(self: BitwiseAndAssignmentExpression) -> *Expression;
```
## BitwiseAndAssignmentExpression::getRightOperand

```rust
/**
     * Get the right operand of this binary expression.
     */
```
```rust
pub fn getRightOperand(self: BitwiseAndAssignmentExpression) -> Expression;
```
## BitwiseAndAssignmentExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: BitwiseAndAssignmentExpression, i: int) -> Modifier;
```
## BitwiseAndAssignmentExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: BitwiseAndAssignmentExpression) -> string;
```
## BitwiseAndAssignmentExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: BitwiseAndAssignmentExpression) -> File;
```
## BitwiseAndAssignmentExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: BitwiseAndAssignmentExpression, level: int) -> Node;
```
## BitwiseAndAssignmentExpression::getLeftOperand

```rust
/**
     * Get the left operand of this binary expression.
     */
```
```rust
pub fn getLeftOperand(self: BitwiseAndAssignmentExpression) -> Expression;
```
## BitwiseAndAssignmentExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: BitwiseAndAssignmentExpression, level: int) -> *Node;
```
## BitwiseAndAssignmentExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: BitwiseAndAssignmentExpression) -> *FunctionLikeDeclaration;
```
## BitwiseAndAssignmentExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: BitwiseAndAssignmentExpression) -> int;
```
## BitwiseAndAssignmentExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: BitwiseAndAssignmentExpression, i: int) -> Node;
```
## BitwiseAndAssignmentExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: BitwiseAndAssignmentExpression) -> TopLevelDO;
```
## BitwiseAndAssignmentExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: BitwiseAndAssignmentExpression, i: int) -> Decorator;
```
## BitwiseAndAssignmentExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: BitwiseAndAssignmentExpression) -> *Node;
```
## BitwiseAndAssignmentExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: BitwiseAndAssignmentExpression) -> *Comment;
```
## BitwiseAndAssignmentExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: BitwiseAndAssignmentExpression) -> Node;
```
## BitwiseAndAssignmentExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: BitwiseAndAssignmentExpression) -> *Node;
```
## BitwiseAndAssignmentExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: BitwiseAndAssignmentExpression) -> *Comment;
```
## BitwiseAndAssignmentExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: BitwiseAndAssignmentExpression) -> *Comment;
```
## BitwiseAndAssignmentExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: BitwiseAndAssignmentExpression) -> int;
```
## BitwiseAndAssignmentExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: BitwiseAndAssignmentExpression) -> *Decorator;
```
## BitwiseAndAssignmentExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: BitwiseAndAssignmentExpression) -> Symbol;
```
## BitwiseAndAssignmentExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *BitwiseAndAssignmentExpression;
```
## BitwiseAndAssignmentExpression::is\<T\>

```rust
pub fn is<T>(self: BitwiseAndAssignmentExpression) -> bool;
```
## BitwiseAndAssignmentExpression::to\<T\>

```rust
pub fn to<T>(self: BitwiseAndAssignmentExpression) -> <any>;
```
## BitwiseAndAssignmentExpression::key\_neq

```rust
pub fn key_neq(self: BitwiseAndAssignmentExpression, object: <any>) -> bool;
```
## BitwiseAndAssignmentExpression::key\_eq

```rust
pub fn key_eq(self: BitwiseAndAssignmentExpression, object: <any>) -> bool;
```
## BitwiseAndAssignmentExpression::to\_set

```rust
pub fn to_set(self: BitwiseAndAssignmentExpression) -> *BitwiseAndAssignmentExpression;
```
