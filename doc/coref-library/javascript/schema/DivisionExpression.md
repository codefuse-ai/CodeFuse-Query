# DivisionExpression

Primary key: `id: int`

```rust
schema DivisionExpression {
  @primary id: int,
}
```
## DivisionExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: DivisionExpression) -> Symbol;
```
## DivisionExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: DivisionExpression) -> *Decorator;
```
## DivisionExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: DivisionExpression) -> *Comment;
```
## DivisionExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: DivisionExpression) -> *Node;
```
## DivisionExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: DivisionExpression) -> int;
```
## DivisionExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: DivisionExpression) -> *Comment;
```
## DivisionExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: DivisionExpression) -> *Comment;
```
## DivisionExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: DivisionExpression) -> Node;
```
## DivisionExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: DivisionExpression) -> *Node;
```
## DivisionExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: DivisionExpression, i: int) -> Decorator;
```
## DivisionExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: DivisionExpression) -> TopLevelDO;
```
## DivisionExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: DivisionExpression, i: int) -> Node;
```
## DivisionExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: DivisionExpression) -> int;
```
## DivisionExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: DivisionExpression, level: int) -> *Node;
```
## DivisionExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: DivisionExpression) -> *FunctionLikeDeclaration;
```
## DivisionExpression::getLeftOperand

```rust
/**
     * Get the left operand of this binary expression.
     */
```
```rust
pub fn getLeftOperand(self: DivisionExpression) -> Expression;
```
## DivisionExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: DivisionExpression, level: int) -> Node;
```
## DivisionExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: DivisionExpression) -> File;
```
## DivisionExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: DivisionExpression) -> string;
```
## DivisionExpression::getAnOperand

```rust
pub fn getAnOperand(self: DivisionExpression) -> *Expression;
```
## DivisionExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: DivisionExpression, i: int) -> Modifier;
```
## DivisionExpression::getRightOperand

```rust
/**
     * Get the right operand of this binary expression.
     */
```
```rust
pub fn getRightOperand(self: DivisionExpression) -> Expression;
```
## DivisionExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: DivisionExpression) -> int;
```
## DivisionExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: DivisionExpression) -> string;
```
## DivisionExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *DivisionExpression;
```
## DivisionExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: DivisionExpression) -> Location;
```
## DivisionExpression::getOperator

```rust
/**
     * Get the operator of this binary expression.
     */
```
```rust
pub fn getOperator(self: DivisionExpression) -> BinaryOperator;
```
## DivisionExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: DivisionExpression) -> *Node;
```
## DivisionExpression::getLeft

```rust
/**
     * Get the left operand of this binary expression. An alias of `getLeftOperand`.
     */
```
```rust
pub fn getLeft(self: DivisionExpression) -> Expression;
```
## DivisionExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: DivisionExpression) -> int;
```
## DivisionExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: DivisionExpression) -> *Modifier;
```
## DivisionExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: DivisionExpression) -> int;
```
## DivisionExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: DivisionExpression) -> Node;
```
## DivisionExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: DivisionExpression) -> FunctionLikeDeclaration;
```
## DivisionExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: DivisionExpression) -> int;
```
## DivisionExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: DivisionExpression) -> int;
```
## DivisionExpression::getIndex

```rust
pub fn getIndex(self: DivisionExpression) -> int;
```
## DivisionExpression::getRight

```rust
/**
     * Get the right operand of this binary expression. An alias of `getRightOperand`
     */
```
```rust
pub fn getRight(self: DivisionExpression) -> Expression;
```
## DivisionExpression::is\<T\>

```rust
pub fn is<T>(self: DivisionExpression) -> bool;
```
## DivisionExpression::to\<T\>

```rust
pub fn to<T>(self: DivisionExpression) -> <any>;
```
## DivisionExpression::key\_neq

```rust
pub fn key_neq(self: DivisionExpression, object: <any>) -> bool;
```
## DivisionExpression::key\_eq

```rust
pub fn key_eq(self: DivisionExpression, object: <any>) -> bool;
```
## DivisionExpression::to\_set

```rust
pub fn to_set(self: DivisionExpression) -> *DivisionExpression;
```
