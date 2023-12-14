# LogicalAndExpression

Primary key: `id: int`

```rust
schema LogicalAndExpression {
  @primary id: int,
}
```
## LogicalAndExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: LogicalAndExpression) -> Symbol;
```
## LogicalAndExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: LogicalAndExpression) -> *Decorator;
```
## LogicalAndExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: LogicalAndExpression) -> *Comment;
```
## LogicalAndExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: LogicalAndExpression) -> *Node;
```
## LogicalAndExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: LogicalAndExpression) -> int;
```
## LogicalAndExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: LogicalAndExpression) -> *Comment;
```
## LogicalAndExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: LogicalAndExpression) -> *Comment;
```
## LogicalAndExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: LogicalAndExpression) -> Node;
```
## LogicalAndExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: LogicalAndExpression) -> *Node;
```
## LogicalAndExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: LogicalAndExpression, i: int) -> Decorator;
```
## LogicalAndExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: LogicalAndExpression) -> TopLevelDO;
```
## LogicalAndExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: LogicalAndExpression, i: int) -> Node;
```
## LogicalAndExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: LogicalAndExpression) -> int;
```
## LogicalAndExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: LogicalAndExpression, level: int) -> *Node;
```
## LogicalAndExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: LogicalAndExpression) -> *FunctionLikeDeclaration;
```
## LogicalAndExpression::getLeftOperand

```rust
/**
     * Get the left operand of this binary expression.
     */
```
```rust
pub fn getLeftOperand(self: LogicalAndExpression) -> Expression;
```
## LogicalAndExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: LogicalAndExpression, level: int) -> Node;
```
## LogicalAndExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: LogicalAndExpression) -> File;
```
## LogicalAndExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: LogicalAndExpression) -> string;
```
## LogicalAndExpression::getAnOperand

```rust
pub fn getAnOperand(self: LogicalAndExpression) -> *Expression;
```
## LogicalAndExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: LogicalAndExpression, i: int) -> Modifier;
```
## LogicalAndExpression::getRightOperand

```rust
/**
     * Get the right operand of this binary expression.
     */
```
```rust
pub fn getRightOperand(self: LogicalAndExpression) -> Expression;
```
## LogicalAndExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: LogicalAndExpression) -> int;
```
## LogicalAndExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: LogicalAndExpression) -> string;
```
## LogicalAndExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *LogicalAndExpression;
```
## LogicalAndExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: LogicalAndExpression) -> Location;
```
## LogicalAndExpression::getOperator

```rust
/**
     * Get the operator of this binary expression.
     */
```
```rust
pub fn getOperator(self: LogicalAndExpression) -> BinaryOperator;
```
## LogicalAndExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: LogicalAndExpression) -> *Node;
```
## LogicalAndExpression::getLeft

```rust
/**
     * Get the left operand of this binary expression. An alias of `getLeftOperand`.
     */
```
```rust
pub fn getLeft(self: LogicalAndExpression) -> Expression;
```
## LogicalAndExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: LogicalAndExpression) -> int;
```
## LogicalAndExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: LogicalAndExpression) -> *Modifier;
```
## LogicalAndExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: LogicalAndExpression) -> int;
```
## LogicalAndExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: LogicalAndExpression) -> Node;
```
## LogicalAndExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: LogicalAndExpression) -> FunctionLikeDeclaration;
```
## LogicalAndExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: LogicalAndExpression) -> int;
```
## LogicalAndExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: LogicalAndExpression) -> int;
```
## LogicalAndExpression::getIndex

```rust
pub fn getIndex(self: LogicalAndExpression) -> int;
```
## LogicalAndExpression::getRight

```rust
/**
     * Get the right operand of this binary expression. An alias of `getRightOperand`
     */
```
```rust
pub fn getRight(self: LogicalAndExpression) -> Expression;
```
## LogicalAndExpression::is\<T\>

```rust
pub fn is<T>(self: LogicalAndExpression) -> bool;
```
## LogicalAndExpression::to\<T\>

```rust
pub fn to<T>(self: LogicalAndExpression) -> <any>;
```
## LogicalAndExpression::key\_neq

```rust
pub fn key_neq(self: LogicalAndExpression, object: <any>) -> bool;
```
## LogicalAndExpression::key\_eq

```rust
pub fn key_eq(self: LogicalAndExpression, object: <any>) -> bool;
```
## LogicalAndExpression::to\_set

```rust
pub fn to_set(self: LogicalAndExpression) -> *LogicalAndExpression;
```
