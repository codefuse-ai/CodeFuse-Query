# BinaryLogicalExpression

Primary key: `id: int`

```rust
schema BinaryLogicalExpression {
  @primary id: int,
}
```
## BinaryLogicalExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: BinaryLogicalExpression) -> int;
```
## BinaryLogicalExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: BinaryLogicalExpression) -> int;
```
## BinaryLogicalExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: BinaryLogicalExpression) -> Node;
```
## BinaryLogicalExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: BinaryLogicalExpression) -> FunctionLikeDeclaration;
```
## BinaryLogicalExpression::getLeft

```rust
/**
     * Get the left operand of this binary expression. An alias of `getLeftOperand`.
     */
```
```rust
pub fn getLeft(self: BinaryLogicalExpression) -> Expression;
```
## BinaryLogicalExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: BinaryLogicalExpression) -> *Node;
```
## BinaryLogicalExpression::getOperator

```rust
/**
     * Get the operator of this binary expression.
     */
```
```rust
pub fn getOperator(self: BinaryLogicalExpression) -> BinaryOperator;
```
## BinaryLogicalExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: BinaryLogicalExpression) -> Location;
```
## BinaryLogicalExpression::getRight

```rust
/**
     * Get the right operand of this binary expression. An alias of `getRightOperand`
     */
```
```rust
pub fn getRight(self: BinaryLogicalExpression) -> Expression;
```
## BinaryLogicalExpression::getIndex

```rust
pub fn getIndex(self: BinaryLogicalExpression) -> int;
```
## BinaryLogicalExpression::getAnOperand

```rust
pub fn getAnOperand(self: BinaryLogicalExpression) -> *Expression;
```
## BinaryLogicalExpression::getRightOperand

```rust
/**
     * Get the right operand of this binary expression.
     */
```
```rust
pub fn getRightOperand(self: BinaryLogicalExpression) -> Expression;
```
## BinaryLogicalExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: BinaryLogicalExpression, i: int) -> Modifier;
```
## BinaryLogicalExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: BinaryLogicalExpression) -> string;
```
## BinaryLogicalExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: BinaryLogicalExpression) -> string;
```
## BinaryLogicalExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: BinaryLogicalExpression) -> int;
```
## BinaryLogicalExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: BinaryLogicalExpression) -> File;
```
## BinaryLogicalExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: BinaryLogicalExpression, level: int) -> Node;
```
## BinaryLogicalExpression::getLeftOperand

```rust
/**
     * Get the left operand of this binary expression.
     */
```
```rust
pub fn getLeftOperand(self: BinaryLogicalExpression) -> Expression;
```
## BinaryLogicalExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: BinaryLogicalExpression) -> *FunctionLikeDeclaration;
```
## BinaryLogicalExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: BinaryLogicalExpression, level: int) -> *Node;
```
## BinaryLogicalExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: BinaryLogicalExpression) -> int;
```
## BinaryLogicalExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: BinaryLogicalExpression) -> *Modifier;
```
## BinaryLogicalExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: BinaryLogicalExpression) -> int;
```
## BinaryLogicalExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: BinaryLogicalExpression) -> int;
```
## BinaryLogicalExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: BinaryLogicalExpression, i: int) -> Node;
```
## BinaryLogicalExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: BinaryLogicalExpression) -> TopLevelDO;
```
## BinaryLogicalExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: BinaryLogicalExpression, i: int) -> Decorator;
```
## BinaryLogicalExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: BinaryLogicalExpression) -> *Node;
```
## BinaryLogicalExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: BinaryLogicalExpression) -> Node;
```
## BinaryLogicalExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: BinaryLogicalExpression) -> *Comment;
```
## BinaryLogicalExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: BinaryLogicalExpression) -> *Comment;
```
## BinaryLogicalExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: BinaryLogicalExpression) -> int;
```
## BinaryLogicalExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: BinaryLogicalExpression) -> *Node;
```
## BinaryLogicalExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: BinaryLogicalExpression) -> *Comment;
```
## BinaryLogicalExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: BinaryLogicalExpression) -> *Decorator;
```
## BinaryLogicalExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: BinaryLogicalExpression) -> Symbol;
```
## BinaryLogicalExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *BinaryLogicalExpression;
```
## BinaryLogicalExpression::is\<T\>

```rust
pub fn is<T>(self: BinaryLogicalExpression) -> bool;
```
## BinaryLogicalExpression::to\<T\>

```rust
pub fn to<T>(self: BinaryLogicalExpression) -> <any>;
```
## BinaryLogicalExpression::key\_neq

```rust
pub fn key_neq(self: BinaryLogicalExpression, object: <any>) -> bool;
```
## BinaryLogicalExpression::key\_eq

```rust
pub fn key_eq(self: BinaryLogicalExpression, object: <any>) -> bool;
```
## BinaryLogicalExpression::to\_set

```rust
pub fn to_set(self: BinaryLogicalExpression) -> *BinaryLogicalExpression;
```
