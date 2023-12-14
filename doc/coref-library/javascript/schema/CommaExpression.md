# CommaExpression

Primary key: `id: int`

```rust
schema CommaExpression {
  @primary id: int,
}
```
## CommaExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: CommaExpression) -> int;
```
## CommaExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: CommaExpression) -> int;
```
## CommaExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: CommaExpression) -> Node;
```
## CommaExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: CommaExpression) -> FunctionLikeDeclaration;
```
## CommaExpression::getLeft

```rust
/**
     * Get the left operand of this binary expression. An alias of `getLeftOperand`.
     */
```
```rust
pub fn getLeft(self: CommaExpression) -> Expression;
```
## CommaExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: CommaExpression) -> *Node;
```
## CommaExpression::getOperator

```rust
/**
     * Get the operator of this binary expression.
     */
```
```rust
pub fn getOperator(self: CommaExpression) -> BinaryOperator;
```
## CommaExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: CommaExpression) -> Location;
```
## CommaExpression::getRight

```rust
/**
     * Get the right operand of this binary expression. An alias of `getRightOperand`
     */
```
```rust
pub fn getRight(self: CommaExpression) -> Expression;
```
## CommaExpression::getIndex

```rust
pub fn getIndex(self: CommaExpression) -> int;
```
## CommaExpression::getAnOperand

```rust
pub fn getAnOperand(self: CommaExpression) -> *Expression;
```
## CommaExpression::getRightOperand

```rust
/**
     * Get the right operand of this binary expression.
     */
```
```rust
pub fn getRightOperand(self: CommaExpression) -> Expression;
```
## CommaExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: CommaExpression, i: int) -> Modifier;
```
## CommaExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: CommaExpression) -> string;
```
## CommaExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: CommaExpression) -> string;
```
## CommaExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: CommaExpression) -> int;
```
## CommaExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: CommaExpression) -> File;
```
## CommaExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: CommaExpression, level: int) -> Node;
```
## CommaExpression::getLeftOperand

```rust
/**
     * Get the left operand of this binary expression.
     */
```
```rust
pub fn getLeftOperand(self: CommaExpression) -> Expression;
```
## CommaExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: CommaExpression) -> *FunctionLikeDeclaration;
```
## CommaExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: CommaExpression, level: int) -> *Node;
```
## CommaExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: CommaExpression) -> int;
```
## CommaExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: CommaExpression) -> *Modifier;
```
## CommaExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: CommaExpression) -> int;
```
## CommaExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: CommaExpression) -> int;
```
## CommaExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: CommaExpression, i: int) -> Node;
```
## CommaExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: CommaExpression) -> TopLevelDO;
```
## CommaExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: CommaExpression, i: int) -> Decorator;
```
## CommaExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: CommaExpression) -> *Node;
```
## CommaExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: CommaExpression) -> Node;
```
## CommaExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: CommaExpression) -> *Comment;
```
## CommaExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: CommaExpression) -> *Comment;
```
## CommaExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: CommaExpression) -> int;
```
## CommaExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: CommaExpression) -> *Node;
```
## CommaExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: CommaExpression) -> *Comment;
```
## CommaExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: CommaExpression) -> *Decorator;
```
## CommaExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: CommaExpression) -> Symbol;
```
## CommaExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *CommaExpression;
```
## CommaExpression::is\<T\>

```rust
pub fn is<T>(self: CommaExpression) -> bool;
```
## CommaExpression::to\<T\>

```rust
pub fn to<T>(self: CommaExpression) -> <any>;
```
## CommaExpression::key\_neq

```rust
pub fn key_neq(self: CommaExpression, object: <any>) -> bool;
```
## CommaExpression::key\_eq

```rust
pub fn key_eq(self: CommaExpression, object: <any>) -> bool;
```
## CommaExpression::to\_set

```rust
pub fn to_set(self: CommaExpression) -> *CommaExpression;
```
