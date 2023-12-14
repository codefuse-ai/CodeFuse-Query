# SubtractionExpression

Primary key: `id: int`

```rust
schema SubtractionExpression {
  @primary id: int,
}
```
## SubtractionExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: SubtractionExpression) -> Symbol;
```
## SubtractionExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: SubtractionExpression) -> *Decorator;
```
## SubtractionExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: SubtractionExpression) -> *Comment;
```
## SubtractionExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: SubtractionExpression) -> *Node;
```
## SubtractionExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: SubtractionExpression) -> int;
```
## SubtractionExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: SubtractionExpression) -> *Comment;
```
## SubtractionExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: SubtractionExpression) -> *Comment;
```
## SubtractionExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: SubtractionExpression) -> Node;
```
## SubtractionExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: SubtractionExpression) -> *Node;
```
## SubtractionExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: SubtractionExpression, i: int) -> Decorator;
```
## SubtractionExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: SubtractionExpression) -> TopLevelDO;
```
## SubtractionExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: SubtractionExpression, i: int) -> Node;
```
## SubtractionExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: SubtractionExpression) -> int;
```
## SubtractionExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: SubtractionExpression, level: int) -> *Node;
```
## SubtractionExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: SubtractionExpression) -> *FunctionLikeDeclaration;
```
## SubtractionExpression::getLeftOperand

```rust
/**
     * Get the left operand of this binary expression.
     */
```
```rust
pub fn getLeftOperand(self: SubtractionExpression) -> Expression;
```
## SubtractionExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: SubtractionExpression, level: int) -> Node;
```
## SubtractionExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: SubtractionExpression) -> File;
```
## SubtractionExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: SubtractionExpression) -> string;
```
## SubtractionExpression::getAnOperand

```rust
pub fn getAnOperand(self: SubtractionExpression) -> *Expression;
```
## SubtractionExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: SubtractionExpression, i: int) -> Modifier;
```
## SubtractionExpression::getRightOperand

```rust
/**
     * Get the right operand of this binary expression.
     */
```
```rust
pub fn getRightOperand(self: SubtractionExpression) -> Expression;
```
## SubtractionExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: SubtractionExpression) -> int;
```
## SubtractionExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: SubtractionExpression) -> string;
```
## SubtractionExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *SubtractionExpression;
```
## SubtractionExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: SubtractionExpression) -> Location;
```
## SubtractionExpression::getOperator

```rust
/**
     * Get the operator of this binary expression.
     */
```
```rust
pub fn getOperator(self: SubtractionExpression) -> BinaryOperator;
```
## SubtractionExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: SubtractionExpression) -> *Node;
```
## SubtractionExpression::getLeft

```rust
/**
     * Get the left operand of this binary expression. An alias of `getLeftOperand`.
     */
```
```rust
pub fn getLeft(self: SubtractionExpression) -> Expression;
```
## SubtractionExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: SubtractionExpression) -> int;
```
## SubtractionExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: SubtractionExpression) -> *Modifier;
```
## SubtractionExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: SubtractionExpression) -> int;
```
## SubtractionExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: SubtractionExpression) -> Node;
```
## SubtractionExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: SubtractionExpression) -> FunctionLikeDeclaration;
```
## SubtractionExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: SubtractionExpression) -> int;
```
## SubtractionExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: SubtractionExpression) -> int;
```
## SubtractionExpression::getIndex

```rust
pub fn getIndex(self: SubtractionExpression) -> int;
```
## SubtractionExpression::getRight

```rust
/**
     * Get the right operand of this binary expression. An alias of `getRightOperand`
     */
```
```rust
pub fn getRight(self: SubtractionExpression) -> Expression;
```
## SubtractionExpression::is\<T\>

```rust
pub fn is<T>(self: SubtractionExpression) -> bool;
```
## SubtractionExpression::to\<T\>

```rust
pub fn to<T>(self: SubtractionExpression) -> <any>;
```
## SubtractionExpression::key\_neq

```rust
pub fn key_neq(self: SubtractionExpression, object: <any>) -> bool;
```
## SubtractionExpression::key\_eq

```rust
pub fn key_eq(self: SubtractionExpression, object: <any>) -> bool;
```
## SubtractionExpression::to\_set

```rust
pub fn to_set(self: SubtractionExpression) -> *SubtractionExpression;
```
