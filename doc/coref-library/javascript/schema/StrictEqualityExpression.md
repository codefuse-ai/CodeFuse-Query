# StrictEqualityExpression

Primary key: `id: int`

```rust
schema StrictEqualityExpression {
  @primary id: int,
}
```
## StrictEqualityExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: StrictEqualityExpression) -> Symbol;
```
## StrictEqualityExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: StrictEqualityExpression) -> *Decorator;
```
## StrictEqualityExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: StrictEqualityExpression) -> *Comment;
```
## StrictEqualityExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: StrictEqualityExpression) -> *Node;
```
## StrictEqualityExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: StrictEqualityExpression) -> int;
```
## StrictEqualityExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: StrictEqualityExpression) -> *Comment;
```
## StrictEqualityExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: StrictEqualityExpression) -> *Comment;
```
## StrictEqualityExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: StrictEqualityExpression) -> Node;
```
## StrictEqualityExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: StrictEqualityExpression) -> *Node;
```
## StrictEqualityExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: StrictEqualityExpression, i: int) -> Decorator;
```
## StrictEqualityExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: StrictEqualityExpression) -> TopLevelDO;
```
## StrictEqualityExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: StrictEqualityExpression, i: int) -> Node;
```
## StrictEqualityExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: StrictEqualityExpression) -> int;
```
## StrictEqualityExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: StrictEqualityExpression, level: int) -> *Node;
```
## StrictEqualityExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: StrictEqualityExpression) -> *FunctionLikeDeclaration;
```
## StrictEqualityExpression::getLeftOperand

```rust
/**
     * Get the left operand of this binary expression.
     */
```
```rust
pub fn getLeftOperand(self: StrictEqualityExpression) -> Expression;
```
## StrictEqualityExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: StrictEqualityExpression, level: int) -> Node;
```
## StrictEqualityExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: StrictEqualityExpression) -> File;
```
## StrictEqualityExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: StrictEqualityExpression) -> string;
```
## StrictEqualityExpression::getAnOperand

```rust
pub fn getAnOperand(self: StrictEqualityExpression) -> *Expression;
```
## StrictEqualityExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: StrictEqualityExpression, i: int) -> Modifier;
```
## StrictEqualityExpression::getRightOperand

```rust
/**
     * Get the right operand of this binary expression.
     */
```
```rust
pub fn getRightOperand(self: StrictEqualityExpression) -> Expression;
```
## StrictEqualityExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: StrictEqualityExpression) -> int;
```
## StrictEqualityExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: StrictEqualityExpression) -> string;
```
## StrictEqualityExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *StrictEqualityExpression;
```
## StrictEqualityExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: StrictEqualityExpression) -> Location;
```
## StrictEqualityExpression::getOperator

```rust
/**
     * Get the operator of this binary expression.
     */
```
```rust
pub fn getOperator(self: StrictEqualityExpression) -> BinaryOperator;
```
## StrictEqualityExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: StrictEqualityExpression) -> *Node;
```
## StrictEqualityExpression::getLeft

```rust
/**
     * Get the left operand of this binary expression. An alias of `getLeftOperand`.
     */
```
```rust
pub fn getLeft(self: StrictEqualityExpression) -> Expression;
```
## StrictEqualityExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: StrictEqualityExpression) -> int;
```
## StrictEqualityExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: StrictEqualityExpression) -> *Modifier;
```
## StrictEqualityExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: StrictEqualityExpression) -> int;
```
## StrictEqualityExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: StrictEqualityExpression) -> Node;
```
## StrictEqualityExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: StrictEqualityExpression) -> FunctionLikeDeclaration;
```
## StrictEqualityExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: StrictEqualityExpression) -> int;
```
## StrictEqualityExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: StrictEqualityExpression) -> int;
```
## StrictEqualityExpression::getIndex

```rust
pub fn getIndex(self: StrictEqualityExpression) -> int;
```
## StrictEqualityExpression::getRight

```rust
/**
     * Get the right operand of this binary expression. An alias of `getRightOperand`
     */
```
```rust
pub fn getRight(self: StrictEqualityExpression) -> Expression;
```
## StrictEqualityExpression::is\<T\>

```rust
pub fn is<T>(self: StrictEqualityExpression) -> bool;
```
## StrictEqualityExpression::to\<T\>

```rust
pub fn to<T>(self: StrictEqualityExpression) -> <any>;
```
## StrictEqualityExpression::key\_neq

```rust
pub fn key_neq(self: StrictEqualityExpression, object: <any>) -> bool;
```
## StrictEqualityExpression::key\_eq

```rust
pub fn key_eq(self: StrictEqualityExpression, object: <any>) -> bool;
```
## StrictEqualityExpression::to\_set

```rust
pub fn to_set(self: StrictEqualityExpression) -> *StrictEqualityExpression;
```
