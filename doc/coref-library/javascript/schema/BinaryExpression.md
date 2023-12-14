# BinaryExpression

Primary key: `id: int`

```rust
schema BinaryExpression {
  @primary id: int,
}
```
## BinaryExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: BinaryExpression) -> Symbol;
```
## BinaryExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: BinaryExpression) -> *Decorator;
```
## BinaryExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: BinaryExpression) -> *Comment;
```
## BinaryExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: BinaryExpression) -> *Node;
```
## BinaryExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: BinaryExpression) -> *Node;
```
## BinaryExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: BinaryExpression) -> Node;
```
## BinaryExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: BinaryExpression) -> *Comment;
```
## BinaryExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: BinaryExpression) -> *Comment;
```
## BinaryExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: BinaryExpression) -> int;
```
## BinaryExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: BinaryExpression) -> TopLevelDO;
```
## BinaryExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: BinaryExpression, i: int) -> Decorator;
```
## BinaryExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: BinaryExpression, i: int) -> Node;
```
## BinaryExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: BinaryExpression) -> int;
```
## BinaryExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: BinaryExpression) -> *Modifier;
```
## BinaryExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: BinaryExpression) -> int;
```
## BinaryExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: BinaryExpression) -> int;
```
## BinaryExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: BinaryExpression, level: int) -> *Node;
```
## BinaryExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: BinaryExpression) -> *FunctionLikeDeclaration;
```
## BinaryExpression::getLeftOperand

```rust
/**
     * Get the left operand of this binary expression.
     */
```
```rust
pub fn getLeftOperand(self: BinaryExpression) -> Expression;
```
## BinaryExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: BinaryExpression, level: int) -> Node;
```
## BinaryExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: BinaryExpression) -> File;
```
## BinaryExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: BinaryExpression) -> int;
```
## BinaryExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: BinaryExpression) -> string;
```
## BinaryExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: BinaryExpression) -> string;
```
## BinaryExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: BinaryExpression, i: int) -> Modifier;
```
## BinaryExpression::getRightOperand

```rust
/**
     * Get the right operand of this binary expression.
     */
```
```rust
pub fn getRightOperand(self: BinaryExpression) -> Expression;
```
## BinaryExpression::getAnOperand

```rust
pub fn getAnOperand(self: BinaryExpression) -> *Expression;
```
## BinaryExpression::getIndex

```rust
pub fn getIndex(self: BinaryExpression) -> int;
```
## BinaryExpression::getRight

```rust
/**
     * Get the right operand of this binary expression. An alias of `getRightOperand`
     */
```
```rust
pub fn getRight(self: BinaryExpression) -> Expression;
```
## BinaryExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: BinaryExpression) -> Location;
```
## BinaryExpression::getOperator

```rust
/**
     * Get the operator of this binary expression.
     */
```
```rust
pub fn getOperator(self: BinaryExpression) -> BinaryOperator;
```
## BinaryExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: BinaryExpression) -> *Node;
```
## BinaryExpression::getLeft

```rust
/**
     * Get the left operand of this binary expression. An alias of `getLeftOperand`.
     */
```
```rust
pub fn getLeft(self: BinaryExpression) -> Expression;
```
## BinaryExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: BinaryExpression) -> FunctionLikeDeclaration;
```
## BinaryExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: BinaryExpression) -> Node;
```
## BinaryExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: BinaryExpression) -> int;
```
## BinaryExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: BinaryExpression) -> int;
```
## BinaryExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *BinaryExpression;
```
## BinaryExpression::is\<T\>

```rust
pub fn is<T>(self: BinaryExpression) -> bool;
```
## BinaryExpression::to\<T\>

```rust
pub fn to<T>(self: BinaryExpression) -> <any>;
```
## BinaryExpression::key\_neq

```rust
pub fn key_neq(self: BinaryExpression, object: <any>) -> bool;
```
## BinaryExpression::key\_eq

```rust
pub fn key_eq(self: BinaryExpression, object: <any>) -> bool;
```
## BinaryExpression::to\_set

```rust
pub fn to_set(self: BinaryExpression) -> *BinaryExpression;
```
