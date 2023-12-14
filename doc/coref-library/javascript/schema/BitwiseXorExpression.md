# BitwiseXorExpression

Primary key: `id: int`

```rust
schema BitwiseXorExpression {
  @primary id: int,
}
```
## BitwiseXorExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: BitwiseXorExpression) -> Symbol;
```
## BitwiseXorExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: BitwiseXorExpression) -> *Decorator;
```
## BitwiseXorExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: BitwiseXorExpression) -> *Comment;
```
## BitwiseXorExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: BitwiseXorExpression) -> *Node;
```
## BitwiseXorExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: BitwiseXorExpression) -> int;
```
## BitwiseXorExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: BitwiseXorExpression) -> *Comment;
```
## BitwiseXorExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: BitwiseXorExpression) -> *Comment;
```
## BitwiseXorExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: BitwiseXorExpression) -> Node;
```
## BitwiseXorExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: BitwiseXorExpression) -> *Node;
```
## BitwiseXorExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: BitwiseXorExpression, i: int) -> Decorator;
```
## BitwiseXorExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: BitwiseXorExpression) -> TopLevelDO;
```
## BitwiseXorExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: BitwiseXorExpression, i: int) -> Node;
```
## BitwiseXorExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: BitwiseXorExpression) -> int;
```
## BitwiseXorExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: BitwiseXorExpression, level: int) -> *Node;
```
## BitwiseXorExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: BitwiseXorExpression) -> *FunctionLikeDeclaration;
```
## BitwiseXorExpression::getLeftOperand

```rust
/**
     * Get the left operand of this binary expression.
     */
```
```rust
pub fn getLeftOperand(self: BitwiseXorExpression) -> Expression;
```
## BitwiseXorExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: BitwiseXorExpression, level: int) -> Node;
```
## BitwiseXorExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: BitwiseXorExpression) -> File;
```
## BitwiseXorExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: BitwiseXorExpression) -> string;
```
## BitwiseXorExpression::getAnOperand

```rust
pub fn getAnOperand(self: BitwiseXorExpression) -> *Expression;
```
## BitwiseXorExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: BitwiseXorExpression, i: int) -> Modifier;
```
## BitwiseXorExpression::getRightOperand

```rust
/**
     * Get the right operand of this binary expression.
     */
```
```rust
pub fn getRightOperand(self: BitwiseXorExpression) -> Expression;
```
## BitwiseXorExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: BitwiseXorExpression) -> int;
```
## BitwiseXorExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: BitwiseXorExpression) -> string;
```
## BitwiseXorExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *BitwiseXorExpression;
```
## BitwiseXorExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: BitwiseXorExpression) -> Location;
```
## BitwiseXorExpression::getOperator

```rust
/**
     * Get the operator of this binary expression.
     */
```
```rust
pub fn getOperator(self: BitwiseXorExpression) -> BinaryOperator;
```
## BitwiseXorExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: BitwiseXorExpression) -> *Node;
```
## BitwiseXorExpression::getLeft

```rust
/**
     * Get the left operand of this binary expression. An alias of `getLeftOperand`.
     */
```
```rust
pub fn getLeft(self: BitwiseXorExpression) -> Expression;
```
## BitwiseXorExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: BitwiseXorExpression) -> int;
```
## BitwiseXorExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: BitwiseXorExpression) -> *Modifier;
```
## BitwiseXorExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: BitwiseXorExpression) -> int;
```
## BitwiseXorExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: BitwiseXorExpression) -> Node;
```
## BitwiseXorExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: BitwiseXorExpression) -> FunctionLikeDeclaration;
```
## BitwiseXorExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: BitwiseXorExpression) -> int;
```
## BitwiseXorExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: BitwiseXorExpression) -> int;
```
## BitwiseXorExpression::getIndex

```rust
pub fn getIndex(self: BitwiseXorExpression) -> int;
```
## BitwiseXorExpression::getRight

```rust
/**
     * Get the right operand of this binary expression. An alias of `getRightOperand`
     */
```
```rust
pub fn getRight(self: BitwiseXorExpression) -> Expression;
```
## BitwiseXorExpression::is\<T\>

```rust
pub fn is<T>(self: BitwiseXorExpression) -> bool;
```
## BitwiseXorExpression::to\<T\>

```rust
pub fn to<T>(self: BitwiseXorExpression) -> <any>;
```
## BitwiseXorExpression::key\_neq

```rust
pub fn key_neq(self: BitwiseXorExpression, object: <any>) -> bool;
```
## BitwiseXorExpression::key\_eq

```rust
pub fn key_eq(self: BitwiseXorExpression, object: <any>) -> bool;
```
## BitwiseXorExpression::to\_set

```rust
pub fn to_set(self: BitwiseXorExpression) -> *BitwiseXorExpression;
```
