# LogicalOrExpression

Primary key: `id: int`

```rust
schema LogicalOrExpression {
  @primary id: int,
}
```
## LogicalOrExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: LogicalOrExpression) -> Symbol;
```
## LogicalOrExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: LogicalOrExpression) -> *Decorator;
```
## LogicalOrExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: LogicalOrExpression) -> *Comment;
```
## LogicalOrExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: LogicalOrExpression) -> *Node;
```
## LogicalOrExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: LogicalOrExpression) -> int;
```
## LogicalOrExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: LogicalOrExpression) -> *Comment;
```
## LogicalOrExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: LogicalOrExpression) -> *Comment;
```
## LogicalOrExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: LogicalOrExpression) -> Node;
```
## LogicalOrExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: LogicalOrExpression) -> *Node;
```
## LogicalOrExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: LogicalOrExpression, i: int) -> Decorator;
```
## LogicalOrExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: LogicalOrExpression) -> TopLevelDO;
```
## LogicalOrExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: LogicalOrExpression, i: int) -> Node;
```
## LogicalOrExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: LogicalOrExpression) -> int;
```
## LogicalOrExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: LogicalOrExpression, level: int) -> *Node;
```
## LogicalOrExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: LogicalOrExpression) -> *FunctionLikeDeclaration;
```
## LogicalOrExpression::getLeftOperand

```rust
/**
     * Get the left operand of this binary expression.
     */
```
```rust
pub fn getLeftOperand(self: LogicalOrExpression) -> Expression;
```
## LogicalOrExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: LogicalOrExpression, level: int) -> Node;
```
## LogicalOrExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: LogicalOrExpression) -> File;
```
## LogicalOrExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: LogicalOrExpression) -> string;
```
## LogicalOrExpression::getAnOperand

```rust
pub fn getAnOperand(self: LogicalOrExpression) -> *Expression;
```
## LogicalOrExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: LogicalOrExpression, i: int) -> Modifier;
```
## LogicalOrExpression::getRightOperand

```rust
/**
     * Get the right operand of this binary expression.
     */
```
```rust
pub fn getRightOperand(self: LogicalOrExpression) -> Expression;
```
## LogicalOrExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: LogicalOrExpression) -> int;
```
## LogicalOrExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: LogicalOrExpression) -> string;
```
## LogicalOrExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *LogicalOrExpression;
```
## LogicalOrExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: LogicalOrExpression) -> Location;
```
## LogicalOrExpression::getOperator

```rust
/**
     * Get the operator of this binary expression.
     */
```
```rust
pub fn getOperator(self: LogicalOrExpression) -> BinaryOperator;
```
## LogicalOrExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: LogicalOrExpression) -> *Node;
```
## LogicalOrExpression::getLeft

```rust
/**
     * Get the left operand of this binary expression. An alias of `getLeftOperand`.
     */
```
```rust
pub fn getLeft(self: LogicalOrExpression) -> Expression;
```
## LogicalOrExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: LogicalOrExpression) -> int;
```
## LogicalOrExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: LogicalOrExpression) -> *Modifier;
```
## LogicalOrExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: LogicalOrExpression) -> int;
```
## LogicalOrExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: LogicalOrExpression) -> Node;
```
## LogicalOrExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: LogicalOrExpression) -> FunctionLikeDeclaration;
```
## LogicalOrExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: LogicalOrExpression) -> int;
```
## LogicalOrExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: LogicalOrExpression) -> int;
```
## LogicalOrExpression::getIndex

```rust
pub fn getIndex(self: LogicalOrExpression) -> int;
```
## LogicalOrExpression::getRight

```rust
/**
     * Get the right operand of this binary expression. An alias of `getRightOperand`
     */
```
```rust
pub fn getRight(self: LogicalOrExpression) -> Expression;
```
## LogicalOrExpression::is\<T\>

```rust
pub fn is<T>(self: LogicalOrExpression) -> bool;
```
## LogicalOrExpression::to\<T\>

```rust
pub fn to<T>(self: LogicalOrExpression) -> <any>;
```
## LogicalOrExpression::key\_neq

```rust
pub fn key_neq(self: LogicalOrExpression, object: <any>) -> bool;
```
## LogicalOrExpression::key\_eq

```rust
pub fn key_eq(self: LogicalOrExpression, object: <any>) -> bool;
```
## LogicalOrExpression::to\_set

```rust
pub fn to_set(self: LogicalOrExpression) -> *LogicalOrExpression;
```
