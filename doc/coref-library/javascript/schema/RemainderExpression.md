# RemainderExpression

Primary key: `id: int`

```rust
schema RemainderExpression {
  @primary id: int,
}
```
## RemainderExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: RemainderExpression) -> Symbol;
```
## RemainderExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: RemainderExpression) -> *Decorator;
```
## RemainderExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: RemainderExpression) -> *Comment;
```
## RemainderExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: RemainderExpression) -> *Node;
```
## RemainderExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: RemainderExpression) -> int;
```
## RemainderExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: RemainderExpression) -> *Comment;
```
## RemainderExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: RemainderExpression) -> *Comment;
```
## RemainderExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: RemainderExpression) -> Node;
```
## RemainderExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: RemainderExpression) -> *Node;
```
## RemainderExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: RemainderExpression, i: int) -> Decorator;
```
## RemainderExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: RemainderExpression) -> TopLevelDO;
```
## RemainderExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: RemainderExpression, i: int) -> Node;
```
## RemainderExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: RemainderExpression) -> int;
```
## RemainderExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: RemainderExpression, level: int) -> *Node;
```
## RemainderExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: RemainderExpression) -> *FunctionLikeDeclaration;
```
## RemainderExpression::getLeftOperand

```rust
/**
     * Get the left operand of this binary expression.
     */
```
```rust
pub fn getLeftOperand(self: RemainderExpression) -> Expression;
```
## RemainderExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: RemainderExpression, level: int) -> Node;
```
## RemainderExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: RemainderExpression) -> File;
```
## RemainderExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: RemainderExpression) -> string;
```
## RemainderExpression::getAnOperand

```rust
pub fn getAnOperand(self: RemainderExpression) -> *Expression;
```
## RemainderExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: RemainderExpression, i: int) -> Modifier;
```
## RemainderExpression::getRightOperand

```rust
/**
     * Get the right operand of this binary expression.
     */
```
```rust
pub fn getRightOperand(self: RemainderExpression) -> Expression;
```
## RemainderExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: RemainderExpression) -> int;
```
## RemainderExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: RemainderExpression) -> string;
```
## RemainderExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *RemainderExpression;
```
## RemainderExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: RemainderExpression) -> Location;
```
## RemainderExpression::getOperator

```rust
/**
     * Get the operator of this binary expression.
     */
```
```rust
pub fn getOperator(self: RemainderExpression) -> BinaryOperator;
```
## RemainderExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: RemainderExpression) -> *Node;
```
## RemainderExpression::getLeft

```rust
/**
     * Get the left operand of this binary expression. An alias of `getLeftOperand`.
     */
```
```rust
pub fn getLeft(self: RemainderExpression) -> Expression;
```
## RemainderExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: RemainderExpression) -> int;
```
## RemainderExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: RemainderExpression) -> *Modifier;
```
## RemainderExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: RemainderExpression) -> int;
```
## RemainderExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: RemainderExpression) -> Node;
```
## RemainderExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: RemainderExpression) -> FunctionLikeDeclaration;
```
## RemainderExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: RemainderExpression) -> int;
```
## RemainderExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: RemainderExpression) -> int;
```
## RemainderExpression::getIndex

```rust
pub fn getIndex(self: RemainderExpression) -> int;
```
## RemainderExpression::getRight

```rust
/**
     * Get the right operand of this binary expression. An alias of `getRightOperand`
     */
```
```rust
pub fn getRight(self: RemainderExpression) -> Expression;
```
## RemainderExpression::is\<T\>

```rust
pub fn is<T>(self: RemainderExpression) -> bool;
```
## RemainderExpression::to\<T\>

```rust
pub fn to<T>(self: RemainderExpression) -> <any>;
```
## RemainderExpression::key\_neq

```rust
pub fn key_neq(self: RemainderExpression, object: <any>) -> bool;
```
## RemainderExpression::key\_eq

```rust
pub fn key_eq(self: RemainderExpression, object: <any>) -> bool;
```
## RemainderExpression::to\_set

```rust
pub fn to_set(self: RemainderExpression) -> *RemainderExpression;
```
