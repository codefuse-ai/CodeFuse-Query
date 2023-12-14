# StrictEqualityTestExpression

Primary key: `id: int`

```rust
schema StrictEqualityTestExpression {
  @primary id: int,
}
```
## StrictEqualityTestExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: StrictEqualityTestExpression) -> Symbol;
```
## StrictEqualityTestExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: StrictEqualityTestExpression) -> *Decorator;
```
## StrictEqualityTestExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: StrictEqualityTestExpression) -> *Comment;
```
## StrictEqualityTestExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: StrictEqualityTestExpression) -> *Node;
```
## StrictEqualityTestExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: StrictEqualityTestExpression) -> int;
```
## StrictEqualityTestExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: StrictEqualityTestExpression) -> *Comment;
```
## StrictEqualityTestExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: StrictEqualityTestExpression) -> *Comment;
```
## StrictEqualityTestExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: StrictEqualityTestExpression) -> Node;
```
## StrictEqualityTestExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: StrictEqualityTestExpression) -> *Node;
```
## StrictEqualityTestExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: StrictEqualityTestExpression, i: int) -> Decorator;
```
## StrictEqualityTestExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: StrictEqualityTestExpression) -> TopLevelDO;
```
## StrictEqualityTestExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: StrictEqualityTestExpression, i: int) -> Node;
```
## StrictEqualityTestExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: StrictEqualityTestExpression) -> int;
```
## StrictEqualityTestExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: StrictEqualityTestExpression, level: int) -> *Node;
```
## StrictEqualityTestExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: StrictEqualityTestExpression) -> *FunctionLikeDeclaration;
```
## StrictEqualityTestExpression::getLeftOperand

```rust
/**
     * Get the left operand of this binary expression.
     */
```
```rust
pub fn getLeftOperand(self: StrictEqualityTestExpression) -> Expression;
```
## StrictEqualityTestExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: StrictEqualityTestExpression, level: int) -> Node;
```
## StrictEqualityTestExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: StrictEqualityTestExpression) -> File;
```
## StrictEqualityTestExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: StrictEqualityTestExpression) -> string;
```
## StrictEqualityTestExpression::getAnOperand

```rust
pub fn getAnOperand(self: StrictEqualityTestExpression) -> *Expression;
```
## StrictEqualityTestExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: StrictEqualityTestExpression, i: int) -> Modifier;
```
## StrictEqualityTestExpression::getRightOperand

```rust
/**
     * Get the right operand of this binary expression.
     */
```
```rust
pub fn getRightOperand(self: StrictEqualityTestExpression) -> Expression;
```
## StrictEqualityTestExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: StrictEqualityTestExpression) -> int;
```
## StrictEqualityTestExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: StrictEqualityTestExpression) -> string;
```
## StrictEqualityTestExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *StrictEqualityTestExpression;
```
## StrictEqualityTestExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: StrictEqualityTestExpression) -> Location;
```
## StrictEqualityTestExpression::getOperator

```rust
/**
     * Get the operator of this binary expression.
     */
```
```rust
pub fn getOperator(self: StrictEqualityTestExpression) -> BinaryOperator;
```
## StrictEqualityTestExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: StrictEqualityTestExpression) -> *Node;
```
## StrictEqualityTestExpression::getLeft

```rust
/**
     * Get the left operand of this binary expression. An alias of `getLeftOperand`.
     */
```
```rust
pub fn getLeft(self: StrictEqualityTestExpression) -> Expression;
```
## StrictEqualityTestExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: StrictEqualityTestExpression) -> int;
```
## StrictEqualityTestExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: StrictEqualityTestExpression) -> *Modifier;
```
## StrictEqualityTestExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: StrictEqualityTestExpression) -> int;
```
## StrictEqualityTestExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: StrictEqualityTestExpression) -> Node;
```
## StrictEqualityTestExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: StrictEqualityTestExpression) -> FunctionLikeDeclaration;
```
## StrictEqualityTestExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: StrictEqualityTestExpression) -> int;
```
## StrictEqualityTestExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: StrictEqualityTestExpression) -> int;
```
## StrictEqualityTestExpression::getIndex

```rust
pub fn getIndex(self: StrictEqualityTestExpression) -> int;
```
## StrictEqualityTestExpression::getRight

```rust
/**
     * Get the right operand of this binary expression. An alias of `getRightOperand`
     */
```
```rust
pub fn getRight(self: StrictEqualityTestExpression) -> Expression;
```
## StrictEqualityTestExpression::is\<T\>

```rust
pub fn is<T>(self: StrictEqualityTestExpression) -> bool;
```
## StrictEqualityTestExpression::to\<T\>

```rust
pub fn to<T>(self: StrictEqualityTestExpression) -> <any>;
```
## StrictEqualityTestExpression::key\_neq

```rust
pub fn key_neq(self: StrictEqualityTestExpression, object: <any>) -> bool;
```
## StrictEqualityTestExpression::key\_eq

```rust
pub fn key_eq(self: StrictEqualityTestExpression, object: <any>) -> bool;
```
## StrictEqualityTestExpression::to\_set

```rust
pub fn to_set(self: StrictEqualityTestExpression) -> *StrictEqualityTestExpression;
```
