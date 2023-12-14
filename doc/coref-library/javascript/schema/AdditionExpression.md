# AdditionExpression

Primary key: `id: int`

```rust
schema AdditionExpression {
  @primary id: int,
}
```
## AdditionExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: AdditionExpression) -> Symbol;
```
## AdditionExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: AdditionExpression) -> *Decorator;
```
## AdditionExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: AdditionExpression) -> *Comment;
```
## AdditionExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: AdditionExpression) -> *Node;
```
## AdditionExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: AdditionExpression) -> int;
```
## AdditionExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: AdditionExpression) -> *Comment;
```
## AdditionExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: AdditionExpression) -> *Comment;
```
## AdditionExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: AdditionExpression) -> Node;
```
## AdditionExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: AdditionExpression) -> *Node;
```
## AdditionExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: AdditionExpression, i: int) -> Decorator;
```
## AdditionExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: AdditionExpression) -> TopLevelDO;
```
## AdditionExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: AdditionExpression, i: int) -> Node;
```
## AdditionExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: AdditionExpression) -> int;
```
## AdditionExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: AdditionExpression, level: int) -> *Node;
```
## AdditionExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: AdditionExpression) -> *FunctionLikeDeclaration;
```
## AdditionExpression::getLeftOperand

```rust
/**
     * Get the left operand of this binary expression.
     */
```
```rust
pub fn getLeftOperand(self: AdditionExpression) -> Expression;
```
## AdditionExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: AdditionExpression, level: int) -> Node;
```
## AdditionExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: AdditionExpression) -> File;
```
## AdditionExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: AdditionExpression) -> string;
```
## AdditionExpression::getAnOperand

```rust
pub fn getAnOperand(self: AdditionExpression) -> *Expression;
```
## AdditionExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: AdditionExpression, i: int) -> Modifier;
```
## AdditionExpression::getRightOperand

```rust
/**
     * Get the right operand of this binary expression.
     */
```
```rust
pub fn getRightOperand(self: AdditionExpression) -> Expression;
```
## AdditionExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: AdditionExpression) -> int;
```
## AdditionExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: AdditionExpression) -> string;
```
## AdditionExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *AdditionExpression;
```
## AdditionExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: AdditionExpression) -> Location;
```
## AdditionExpression::getOperator

```rust
/**
     * Get the operator of this binary expression.
     */
```
```rust
pub fn getOperator(self: AdditionExpression) -> BinaryOperator;
```
## AdditionExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: AdditionExpression) -> *Node;
```
## AdditionExpression::getLeft

```rust
/**
     * Get the left operand of this binary expression. An alias of `getLeftOperand`.
     */
```
```rust
pub fn getLeft(self: AdditionExpression) -> Expression;
```
## AdditionExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: AdditionExpression) -> int;
```
## AdditionExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: AdditionExpression) -> *Modifier;
```
## AdditionExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: AdditionExpression) -> int;
```
## AdditionExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: AdditionExpression) -> Node;
```
## AdditionExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: AdditionExpression) -> FunctionLikeDeclaration;
```
## AdditionExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: AdditionExpression) -> int;
```
## AdditionExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: AdditionExpression) -> int;
```
## AdditionExpression::getIndex

```rust
pub fn getIndex(self: AdditionExpression) -> int;
```
## AdditionExpression::getRight

```rust
/**
     * Get the right operand of this binary expression. An alias of `getRightOperand`
     */
```
```rust
pub fn getRight(self: AdditionExpression) -> Expression;
```
## AdditionExpression::is\<T\>

```rust
pub fn is<T>(self: AdditionExpression) -> bool;
```
## AdditionExpression::to\<T\>

```rust
pub fn to<T>(self: AdditionExpression) -> <any>;
```
## AdditionExpression::key\_neq

```rust
pub fn key_neq(self: AdditionExpression, object: <any>) -> bool;
```
## AdditionExpression::key\_eq

```rust
pub fn key_eq(self: AdditionExpression, object: <any>) -> bool;
```
## AdditionExpression::to\_set

```rust
pub fn to_set(self: AdditionExpression) -> *AdditionExpression;
```
