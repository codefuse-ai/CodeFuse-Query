# BitwiseOrExpression

Primary key: `id: int`

```rust
schema BitwiseOrExpression {
  @primary id: int,
}
```
## BitwiseOrExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: BitwiseOrExpression) -> Symbol;
```
## BitwiseOrExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: BitwiseOrExpression) -> *Decorator;
```
## BitwiseOrExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: BitwiseOrExpression) -> *Comment;
```
## BitwiseOrExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: BitwiseOrExpression) -> *Node;
```
## BitwiseOrExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: BitwiseOrExpression) -> int;
```
## BitwiseOrExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: BitwiseOrExpression) -> *Comment;
```
## BitwiseOrExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: BitwiseOrExpression) -> *Comment;
```
## BitwiseOrExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: BitwiseOrExpression) -> Node;
```
## BitwiseOrExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: BitwiseOrExpression) -> *Node;
```
## BitwiseOrExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: BitwiseOrExpression, i: int) -> Decorator;
```
## BitwiseOrExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: BitwiseOrExpression) -> TopLevelDO;
```
## BitwiseOrExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: BitwiseOrExpression, i: int) -> Node;
```
## BitwiseOrExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: BitwiseOrExpression) -> int;
```
## BitwiseOrExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: BitwiseOrExpression, level: int) -> *Node;
```
## BitwiseOrExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: BitwiseOrExpression) -> *FunctionLikeDeclaration;
```
## BitwiseOrExpression::getLeftOperand

```rust
/**
     * Get the left operand of this binary expression.
     */
```
```rust
pub fn getLeftOperand(self: BitwiseOrExpression) -> Expression;
```
## BitwiseOrExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: BitwiseOrExpression, level: int) -> Node;
```
## BitwiseOrExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: BitwiseOrExpression) -> File;
```
## BitwiseOrExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: BitwiseOrExpression) -> string;
```
## BitwiseOrExpression::getAnOperand

```rust
pub fn getAnOperand(self: BitwiseOrExpression) -> *Expression;
```
## BitwiseOrExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: BitwiseOrExpression, i: int) -> Modifier;
```
## BitwiseOrExpression::getRightOperand

```rust
/**
     * Get the right operand of this binary expression.
     */
```
```rust
pub fn getRightOperand(self: BitwiseOrExpression) -> Expression;
```
## BitwiseOrExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: BitwiseOrExpression) -> int;
```
## BitwiseOrExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: BitwiseOrExpression) -> string;
```
## BitwiseOrExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *BitwiseOrExpression;
```
## BitwiseOrExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: BitwiseOrExpression) -> Location;
```
## BitwiseOrExpression::getOperator

```rust
/**
     * Get the operator of this binary expression.
     */
```
```rust
pub fn getOperator(self: BitwiseOrExpression) -> BinaryOperator;
```
## BitwiseOrExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: BitwiseOrExpression) -> *Node;
```
## BitwiseOrExpression::getLeft

```rust
/**
     * Get the left operand of this binary expression. An alias of `getLeftOperand`.
     */
```
```rust
pub fn getLeft(self: BitwiseOrExpression) -> Expression;
```
## BitwiseOrExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: BitwiseOrExpression) -> int;
```
## BitwiseOrExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: BitwiseOrExpression) -> *Modifier;
```
## BitwiseOrExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: BitwiseOrExpression) -> int;
```
## BitwiseOrExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: BitwiseOrExpression) -> Node;
```
## BitwiseOrExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: BitwiseOrExpression) -> FunctionLikeDeclaration;
```
## BitwiseOrExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: BitwiseOrExpression) -> int;
```
## BitwiseOrExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: BitwiseOrExpression) -> int;
```
## BitwiseOrExpression::getIndex

```rust
pub fn getIndex(self: BitwiseOrExpression) -> int;
```
## BitwiseOrExpression::getRight

```rust
/**
     * Get the right operand of this binary expression. An alias of `getRightOperand`
     */
```
```rust
pub fn getRight(self: BitwiseOrExpression) -> Expression;
```
## BitwiseOrExpression::is\<T\>

```rust
pub fn is<T>(self: BitwiseOrExpression) -> bool;
```
## BitwiseOrExpression::to\<T\>

```rust
pub fn to<T>(self: BitwiseOrExpression) -> <any>;
```
## BitwiseOrExpression::key\_neq

```rust
pub fn key_neq(self: BitwiseOrExpression, object: <any>) -> bool;
```
## BitwiseOrExpression::key\_eq

```rust
pub fn key_eq(self: BitwiseOrExpression, object: <any>) -> bool;
```
## BitwiseOrExpression::to\_set

```rust
pub fn to_set(self: BitwiseOrExpression) -> *BitwiseOrExpression;
```
