# BitwiseAndExpression

Primary key: `id: int`

```rust
schema BitwiseAndExpression {
  @primary id: int,
}
```
## BitwiseAndExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: BitwiseAndExpression) -> Symbol;
```
## BitwiseAndExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: BitwiseAndExpression) -> *Decorator;
```
## BitwiseAndExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: BitwiseAndExpression) -> *Comment;
```
## BitwiseAndExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: BitwiseAndExpression) -> *Node;
```
## BitwiseAndExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: BitwiseAndExpression) -> int;
```
## BitwiseAndExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: BitwiseAndExpression) -> *Comment;
```
## BitwiseAndExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: BitwiseAndExpression) -> *Comment;
```
## BitwiseAndExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: BitwiseAndExpression) -> Node;
```
## BitwiseAndExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: BitwiseAndExpression) -> *Node;
```
## BitwiseAndExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: BitwiseAndExpression, i: int) -> Decorator;
```
## BitwiseAndExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: BitwiseAndExpression) -> TopLevelDO;
```
## BitwiseAndExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: BitwiseAndExpression, i: int) -> Node;
```
## BitwiseAndExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: BitwiseAndExpression) -> int;
```
## BitwiseAndExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: BitwiseAndExpression, level: int) -> *Node;
```
## BitwiseAndExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: BitwiseAndExpression) -> *FunctionLikeDeclaration;
```
## BitwiseAndExpression::getLeftOperand

```rust
/**
     * Get the left operand of this binary expression.
     */
```
```rust
pub fn getLeftOperand(self: BitwiseAndExpression) -> Expression;
```
## BitwiseAndExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: BitwiseAndExpression, level: int) -> Node;
```
## BitwiseAndExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: BitwiseAndExpression) -> File;
```
## BitwiseAndExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: BitwiseAndExpression) -> string;
```
## BitwiseAndExpression::getAnOperand

```rust
pub fn getAnOperand(self: BitwiseAndExpression) -> *Expression;
```
## BitwiseAndExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: BitwiseAndExpression, i: int) -> Modifier;
```
## BitwiseAndExpression::getRightOperand

```rust
/**
     * Get the right operand of this binary expression.
     */
```
```rust
pub fn getRightOperand(self: BitwiseAndExpression) -> Expression;
```
## BitwiseAndExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: BitwiseAndExpression) -> int;
```
## BitwiseAndExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: BitwiseAndExpression) -> string;
```
## BitwiseAndExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *BitwiseAndExpression;
```
## BitwiseAndExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: BitwiseAndExpression) -> Location;
```
## BitwiseAndExpression::getOperator

```rust
/**
     * Get the operator of this binary expression.
     */
```
```rust
pub fn getOperator(self: BitwiseAndExpression) -> BinaryOperator;
```
## BitwiseAndExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: BitwiseAndExpression) -> *Node;
```
## BitwiseAndExpression::getLeft

```rust
/**
     * Get the left operand of this binary expression. An alias of `getLeftOperand`.
     */
```
```rust
pub fn getLeft(self: BitwiseAndExpression) -> Expression;
```
## BitwiseAndExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: BitwiseAndExpression) -> int;
```
## BitwiseAndExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: BitwiseAndExpression) -> *Modifier;
```
## BitwiseAndExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: BitwiseAndExpression) -> int;
```
## BitwiseAndExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: BitwiseAndExpression) -> Node;
```
## BitwiseAndExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: BitwiseAndExpression) -> FunctionLikeDeclaration;
```
## BitwiseAndExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: BitwiseAndExpression) -> int;
```
## BitwiseAndExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: BitwiseAndExpression) -> int;
```
## BitwiseAndExpression::getIndex

```rust
pub fn getIndex(self: BitwiseAndExpression) -> int;
```
## BitwiseAndExpression::getRight

```rust
/**
     * Get the right operand of this binary expression. An alias of `getRightOperand`
     */
```
```rust
pub fn getRight(self: BitwiseAndExpression) -> Expression;
```
## BitwiseAndExpression::is\<T\>

```rust
pub fn is<T>(self: BitwiseAndExpression) -> bool;
```
## BitwiseAndExpression::to\<T\>

```rust
pub fn to<T>(self: BitwiseAndExpression) -> <any>;
```
## BitwiseAndExpression::key\_neq

```rust
pub fn key_neq(self: BitwiseAndExpression, object: <any>) -> bool;
```
## BitwiseAndExpression::key\_eq

```rust
pub fn key_eq(self: BitwiseAndExpression, object: <any>) -> bool;
```
## BitwiseAndExpression::to\_set

```rust
pub fn to_set(self: BitwiseAndExpression) -> *BitwiseAndExpression;
```
