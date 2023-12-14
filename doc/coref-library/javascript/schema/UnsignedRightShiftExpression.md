# UnsignedRightShiftExpression

Primary key: `id: int`

```rust
schema UnsignedRightShiftExpression {
  @primary id: int,
}
```
## UnsignedRightShiftExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: UnsignedRightShiftExpression) -> Symbol;
```
## UnsignedRightShiftExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: UnsignedRightShiftExpression) -> *Decorator;
```
## UnsignedRightShiftExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: UnsignedRightShiftExpression) -> *Comment;
```
## UnsignedRightShiftExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: UnsignedRightShiftExpression) -> *Node;
```
## UnsignedRightShiftExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: UnsignedRightShiftExpression) -> int;
```
## UnsignedRightShiftExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: UnsignedRightShiftExpression) -> *Comment;
```
## UnsignedRightShiftExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: UnsignedRightShiftExpression) -> *Comment;
```
## UnsignedRightShiftExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: UnsignedRightShiftExpression) -> Node;
```
## UnsignedRightShiftExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: UnsignedRightShiftExpression) -> *Node;
```
## UnsignedRightShiftExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: UnsignedRightShiftExpression, i: int) -> Decorator;
```
## UnsignedRightShiftExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: UnsignedRightShiftExpression) -> TopLevelDO;
```
## UnsignedRightShiftExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: UnsignedRightShiftExpression, i: int) -> Node;
```
## UnsignedRightShiftExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: UnsignedRightShiftExpression) -> int;
```
## UnsignedRightShiftExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: UnsignedRightShiftExpression, level: int) -> *Node;
```
## UnsignedRightShiftExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: UnsignedRightShiftExpression) -> *FunctionLikeDeclaration;
```
## UnsignedRightShiftExpression::getLeftOperand

```rust
/**
     * Get the left operand of this binary expression.
     */
```
```rust
pub fn getLeftOperand(self: UnsignedRightShiftExpression) -> Expression;
```
## UnsignedRightShiftExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: UnsignedRightShiftExpression, level: int) -> Node;
```
## UnsignedRightShiftExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: UnsignedRightShiftExpression) -> File;
```
## UnsignedRightShiftExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: UnsignedRightShiftExpression) -> string;
```
## UnsignedRightShiftExpression::getAnOperand

```rust
pub fn getAnOperand(self: UnsignedRightShiftExpression) -> *Expression;
```
## UnsignedRightShiftExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: UnsignedRightShiftExpression, i: int) -> Modifier;
```
## UnsignedRightShiftExpression::getRightOperand

```rust
/**
     * Get the right operand of this binary expression.
     */
```
```rust
pub fn getRightOperand(self: UnsignedRightShiftExpression) -> Expression;
```
## UnsignedRightShiftExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: UnsignedRightShiftExpression) -> int;
```
## UnsignedRightShiftExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: UnsignedRightShiftExpression) -> string;
```
## UnsignedRightShiftExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *UnsignedRightShiftExpression;
```
## UnsignedRightShiftExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: UnsignedRightShiftExpression) -> Location;
```
## UnsignedRightShiftExpression::getOperator

```rust
/**
     * Get the operator of this binary expression.
     */
```
```rust
pub fn getOperator(self: UnsignedRightShiftExpression) -> BinaryOperator;
```
## UnsignedRightShiftExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: UnsignedRightShiftExpression) -> *Node;
```
## UnsignedRightShiftExpression::getLeft

```rust
/**
     * Get the left operand of this binary expression. An alias of `getLeftOperand`.
     */
```
```rust
pub fn getLeft(self: UnsignedRightShiftExpression) -> Expression;
```
## UnsignedRightShiftExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: UnsignedRightShiftExpression) -> int;
```
## UnsignedRightShiftExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: UnsignedRightShiftExpression) -> *Modifier;
```
## UnsignedRightShiftExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: UnsignedRightShiftExpression) -> int;
```
## UnsignedRightShiftExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: UnsignedRightShiftExpression) -> Node;
```
## UnsignedRightShiftExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: UnsignedRightShiftExpression) -> FunctionLikeDeclaration;
```
## UnsignedRightShiftExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: UnsignedRightShiftExpression) -> int;
```
## UnsignedRightShiftExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: UnsignedRightShiftExpression) -> int;
```
## UnsignedRightShiftExpression::getIndex

```rust
pub fn getIndex(self: UnsignedRightShiftExpression) -> int;
```
## UnsignedRightShiftExpression::getRight

```rust
/**
     * Get the right operand of this binary expression. An alias of `getRightOperand`
     */
```
```rust
pub fn getRight(self: UnsignedRightShiftExpression) -> Expression;
```
## UnsignedRightShiftExpression::is\<T\>

```rust
pub fn is<T>(self: UnsignedRightShiftExpression) -> bool;
```
## UnsignedRightShiftExpression::to\<T\>

```rust
pub fn to<T>(self: UnsignedRightShiftExpression) -> <any>;
```
## UnsignedRightShiftExpression::key\_neq

```rust
pub fn key_neq(self: UnsignedRightShiftExpression, object: <any>) -> bool;
```
## UnsignedRightShiftExpression::key\_eq

```rust
pub fn key_eq(self: UnsignedRightShiftExpression, object: <any>) -> bool;
```
## UnsignedRightShiftExpression::to\_set

```rust
pub fn to_set(self: UnsignedRightShiftExpression) -> *UnsignedRightShiftExpression;
```
