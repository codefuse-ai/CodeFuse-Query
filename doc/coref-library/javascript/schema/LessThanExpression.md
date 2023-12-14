# LessThanExpression

Primary key: `id: int`

```rust
schema LessThanExpression {
  @primary id: int,
}
```
## LessThanExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: LessThanExpression) -> Symbol;
```
## LessThanExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: LessThanExpression) -> *Decorator;
```
## LessThanExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: LessThanExpression) -> *Comment;
```
## LessThanExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: LessThanExpression) -> *Node;
```
## LessThanExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: LessThanExpression) -> int;
```
## LessThanExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: LessThanExpression) -> *Comment;
```
## LessThanExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: LessThanExpression) -> *Comment;
```
## LessThanExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: LessThanExpression) -> Node;
```
## LessThanExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: LessThanExpression) -> *Node;
```
## LessThanExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: LessThanExpression, i: int) -> Decorator;
```
## LessThanExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: LessThanExpression) -> TopLevelDO;
```
## LessThanExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: LessThanExpression, i: int) -> Node;
```
## LessThanExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: LessThanExpression) -> int;
```
## LessThanExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: LessThanExpression, level: int) -> *Node;
```
## LessThanExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: LessThanExpression) -> *FunctionLikeDeclaration;
```
## LessThanExpression::getLeftOperand

```rust
/**
     * Get the left operand of this binary expression.
     */
```
```rust
pub fn getLeftOperand(self: LessThanExpression) -> Expression;
```
## LessThanExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: LessThanExpression, level: int) -> Node;
```
## LessThanExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: LessThanExpression) -> File;
```
## LessThanExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: LessThanExpression) -> string;
```
## LessThanExpression::getAnOperand

```rust
pub fn getAnOperand(self: LessThanExpression) -> *Expression;
```
## LessThanExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: LessThanExpression, i: int) -> Modifier;
```
## LessThanExpression::getRightOperand

```rust
/**
     * Get the right operand of this binary expression.
     */
```
```rust
pub fn getRightOperand(self: LessThanExpression) -> Expression;
```
## LessThanExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: LessThanExpression) -> int;
```
## LessThanExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: LessThanExpression) -> string;
```
## LessThanExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *LessThanExpression;
```
## LessThanExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: LessThanExpression) -> Location;
```
## LessThanExpression::getOperator

```rust
/**
     * Get the operator of this binary expression.
     */
```
```rust
pub fn getOperator(self: LessThanExpression) -> BinaryOperator;
```
## LessThanExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: LessThanExpression) -> *Node;
```
## LessThanExpression::getLeft

```rust
/**
     * Get the left operand of this binary expression. An alias of `getLeftOperand`.
     */
```
```rust
pub fn getLeft(self: LessThanExpression) -> Expression;
```
## LessThanExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: LessThanExpression) -> int;
```
## LessThanExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: LessThanExpression) -> *Modifier;
```
## LessThanExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: LessThanExpression) -> int;
```
## LessThanExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: LessThanExpression) -> Node;
```
## LessThanExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: LessThanExpression) -> FunctionLikeDeclaration;
```
## LessThanExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: LessThanExpression) -> int;
```
## LessThanExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: LessThanExpression) -> int;
```
## LessThanExpression::getIndex

```rust
pub fn getIndex(self: LessThanExpression) -> int;
```
## LessThanExpression::getRight

```rust
/**
     * Get the right operand of this binary expression. An alias of `getRightOperand`
     */
```
```rust
pub fn getRight(self: LessThanExpression) -> Expression;
```
## LessThanExpression::is\<T\>

```rust
pub fn is<T>(self: LessThanExpression) -> bool;
```
## LessThanExpression::to\<T\>

```rust
pub fn to<T>(self: LessThanExpression) -> <any>;
```
## LessThanExpression::key\_neq

```rust
pub fn key_neq(self: LessThanExpression, object: <any>) -> bool;
```
## LessThanExpression::key\_eq

```rust
pub fn key_eq(self: LessThanExpression, object: <any>) -> bool;
```
## LessThanExpression::to\_set

```rust
pub fn to_set(self: LessThanExpression) -> *LessThanExpression;
```
