# EqualityTestExpression

Primary key: `id: int`

```rust
schema EqualityTestExpression {
  @primary id: int,
}
```
## EqualityTestExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: EqualityTestExpression) -> int;
```
## EqualityTestExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: EqualityTestExpression) -> int;
```
## EqualityTestExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: EqualityTestExpression) -> Node;
```
## EqualityTestExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: EqualityTestExpression) -> FunctionLikeDeclaration;
```
## EqualityTestExpression::getLeft

```rust
/**
     * Get the left operand of this binary expression. An alias of `getLeftOperand`.
     */
```
```rust
pub fn getLeft(self: EqualityTestExpression) -> Expression;
```
## EqualityTestExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: EqualityTestExpression) -> *Node;
```
## EqualityTestExpression::getOperator

```rust
/**
     * Get the operator of this binary expression.
     */
```
```rust
pub fn getOperator(self: EqualityTestExpression) -> BinaryOperator;
```
## EqualityTestExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: EqualityTestExpression) -> Location;
```
## EqualityTestExpression::getRight

```rust
/**
     * Get the right operand of this binary expression. An alias of `getRightOperand`
     */
```
```rust
pub fn getRight(self: EqualityTestExpression) -> Expression;
```
## EqualityTestExpression::getIndex

```rust
pub fn getIndex(self: EqualityTestExpression) -> int;
```
## EqualityTestExpression::getAnOperand

```rust
pub fn getAnOperand(self: EqualityTestExpression) -> *Expression;
```
## EqualityTestExpression::getRightOperand

```rust
/**
     * Get the right operand of this binary expression.
     */
```
```rust
pub fn getRightOperand(self: EqualityTestExpression) -> Expression;
```
## EqualityTestExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: EqualityTestExpression, i: int) -> Modifier;
```
## EqualityTestExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: EqualityTestExpression) -> string;
```
## EqualityTestExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: EqualityTestExpression) -> string;
```
## EqualityTestExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: EqualityTestExpression) -> int;
```
## EqualityTestExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: EqualityTestExpression) -> File;
```
## EqualityTestExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: EqualityTestExpression, level: int) -> Node;
```
## EqualityTestExpression::getLeftOperand

```rust
/**
     * Get the left operand of this binary expression.
     */
```
```rust
pub fn getLeftOperand(self: EqualityTestExpression) -> Expression;
```
## EqualityTestExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: EqualityTestExpression) -> *FunctionLikeDeclaration;
```
## EqualityTestExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: EqualityTestExpression, level: int) -> *Node;
```
## EqualityTestExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: EqualityTestExpression) -> int;
```
## EqualityTestExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: EqualityTestExpression) -> *Modifier;
```
## EqualityTestExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: EqualityTestExpression) -> int;
```
## EqualityTestExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: EqualityTestExpression) -> int;
```
## EqualityTestExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: EqualityTestExpression, i: int) -> Node;
```
## EqualityTestExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: EqualityTestExpression) -> TopLevelDO;
```
## EqualityTestExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: EqualityTestExpression, i: int) -> Decorator;
```
## EqualityTestExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: EqualityTestExpression) -> *Node;
```
## EqualityTestExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: EqualityTestExpression) -> Node;
```
## EqualityTestExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: EqualityTestExpression) -> *Comment;
```
## EqualityTestExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: EqualityTestExpression) -> *Comment;
```
## EqualityTestExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: EqualityTestExpression) -> int;
```
## EqualityTestExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: EqualityTestExpression) -> *Node;
```
## EqualityTestExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: EqualityTestExpression) -> *Comment;
```
## EqualityTestExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: EqualityTestExpression) -> *Decorator;
```
## EqualityTestExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: EqualityTestExpression) -> Symbol;
```
## EqualityTestExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *EqualityTestExpression;
```
## EqualityTestExpression::is\<T\>

```rust
pub fn is<T>(self: EqualityTestExpression) -> bool;
```
## EqualityTestExpression::to\<T\>

```rust
pub fn to<T>(self: EqualityTestExpression) -> <any>;
```
## EqualityTestExpression::key\_neq

```rust
pub fn key_neq(self: EqualityTestExpression, object: <any>) -> bool;
```
## EqualityTestExpression::key\_eq

```rust
pub fn key_eq(self: EqualityTestExpression, object: <any>) -> bool;
```
## EqualityTestExpression::to\_set

```rust
pub fn to_set(self: EqualityTestExpression) -> *EqualityTestExpression;
```
