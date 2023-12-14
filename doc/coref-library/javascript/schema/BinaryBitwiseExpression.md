# BinaryBitwiseExpression

Primary key: `id: int`

```rust
schema BinaryBitwiseExpression {
  @primary id: int,
}
```
## BinaryBitwiseExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: BinaryBitwiseExpression) -> int;
```
## BinaryBitwiseExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: BinaryBitwiseExpression) -> int;
```
## BinaryBitwiseExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: BinaryBitwiseExpression) -> Node;
```
## BinaryBitwiseExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: BinaryBitwiseExpression) -> FunctionLikeDeclaration;
```
## BinaryBitwiseExpression::getLeft

```rust
/**
     * Get the left operand of this binary expression. An alias of `getLeftOperand`.
     */
```
```rust
pub fn getLeft(self: BinaryBitwiseExpression) -> Expression;
```
## BinaryBitwiseExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: BinaryBitwiseExpression) -> *Node;
```
## BinaryBitwiseExpression::getOperator

```rust
/**
     * Get the operator of this binary expression.
     */
```
```rust
pub fn getOperator(self: BinaryBitwiseExpression) -> BinaryOperator;
```
## BinaryBitwiseExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: BinaryBitwiseExpression) -> Location;
```
## BinaryBitwiseExpression::getRight

```rust
/**
     * Get the right operand of this binary expression. An alias of `getRightOperand`
     */
```
```rust
pub fn getRight(self: BinaryBitwiseExpression) -> Expression;
```
## BinaryBitwiseExpression::getIndex

```rust
pub fn getIndex(self: BinaryBitwiseExpression) -> int;
```
## BinaryBitwiseExpression::getAnOperand

```rust
pub fn getAnOperand(self: BinaryBitwiseExpression) -> *Expression;
```
## BinaryBitwiseExpression::getRightOperand

```rust
/**
     * Get the right operand of this binary expression.
     */
```
```rust
pub fn getRightOperand(self: BinaryBitwiseExpression) -> Expression;
```
## BinaryBitwiseExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: BinaryBitwiseExpression, i: int) -> Modifier;
```
## BinaryBitwiseExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: BinaryBitwiseExpression) -> string;
```
## BinaryBitwiseExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: BinaryBitwiseExpression) -> string;
```
## BinaryBitwiseExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: BinaryBitwiseExpression) -> int;
```
## BinaryBitwiseExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: BinaryBitwiseExpression) -> File;
```
## BinaryBitwiseExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: BinaryBitwiseExpression, level: int) -> Node;
```
## BinaryBitwiseExpression::getLeftOperand

```rust
/**
     * Get the left operand of this binary expression.
     */
```
```rust
pub fn getLeftOperand(self: BinaryBitwiseExpression) -> Expression;
```
## BinaryBitwiseExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: BinaryBitwiseExpression) -> *FunctionLikeDeclaration;
```
## BinaryBitwiseExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: BinaryBitwiseExpression, level: int) -> *Node;
```
## BinaryBitwiseExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: BinaryBitwiseExpression) -> int;
```
## BinaryBitwiseExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: BinaryBitwiseExpression) -> *Modifier;
```
## BinaryBitwiseExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: BinaryBitwiseExpression) -> int;
```
## BinaryBitwiseExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: BinaryBitwiseExpression) -> int;
```
## BinaryBitwiseExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: BinaryBitwiseExpression, i: int) -> Node;
```
## BinaryBitwiseExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: BinaryBitwiseExpression) -> TopLevelDO;
```
## BinaryBitwiseExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: BinaryBitwiseExpression, i: int) -> Decorator;
```
## BinaryBitwiseExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: BinaryBitwiseExpression) -> *Node;
```
## BinaryBitwiseExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: BinaryBitwiseExpression) -> Node;
```
## BinaryBitwiseExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: BinaryBitwiseExpression) -> *Comment;
```
## BinaryBitwiseExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: BinaryBitwiseExpression) -> *Comment;
```
## BinaryBitwiseExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: BinaryBitwiseExpression) -> int;
```
## BinaryBitwiseExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: BinaryBitwiseExpression) -> *Node;
```
## BinaryBitwiseExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: BinaryBitwiseExpression) -> *Comment;
```
## BinaryBitwiseExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: BinaryBitwiseExpression) -> *Decorator;
```
## BinaryBitwiseExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: BinaryBitwiseExpression) -> Symbol;
```
## BinaryBitwiseExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *BinaryBitwiseExpression;
```
## BinaryBitwiseExpression::is\<T\>

```rust
pub fn is<T>(self: BinaryBitwiseExpression) -> bool;
```
## BinaryBitwiseExpression::to\<T\>

```rust
pub fn to<T>(self: BinaryBitwiseExpression) -> <any>;
```
## BinaryBitwiseExpression::key\_neq

```rust
pub fn key_neq(self: BinaryBitwiseExpression, object: <any>) -> bool;
```
## BinaryBitwiseExpression::key\_eq

```rust
pub fn key_eq(self: BinaryBitwiseExpression, object: <any>) -> bool;
```
## BinaryBitwiseExpression::to\_set

```rust
pub fn to_set(self: BinaryBitwiseExpression) -> *BinaryBitwiseExpression;
```
