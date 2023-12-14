# EqualityExpression

Primary key: `id: int`

```rust
schema EqualityExpression {
  @primary id: int,
}
```
## EqualityExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: EqualityExpression) -> Symbol;
```
## EqualityExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: EqualityExpression) -> *Decorator;
```
## EqualityExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: EqualityExpression) -> *Comment;
```
## EqualityExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: EqualityExpression) -> *Node;
```
## EqualityExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: EqualityExpression) -> int;
```
## EqualityExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: EqualityExpression) -> *Comment;
```
## EqualityExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: EqualityExpression) -> *Comment;
```
## EqualityExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: EqualityExpression) -> Node;
```
## EqualityExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: EqualityExpression) -> *Node;
```
## EqualityExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: EqualityExpression, i: int) -> Decorator;
```
## EqualityExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: EqualityExpression) -> TopLevelDO;
```
## EqualityExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: EqualityExpression, i: int) -> Node;
```
## EqualityExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: EqualityExpression) -> int;
```
## EqualityExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: EqualityExpression, level: int) -> *Node;
```
## EqualityExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: EqualityExpression) -> *FunctionLikeDeclaration;
```
## EqualityExpression::getLeftOperand

```rust
/**
     * Get the left operand of this binary expression.
     */
```
```rust
pub fn getLeftOperand(self: EqualityExpression) -> Expression;
```
## EqualityExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: EqualityExpression, level: int) -> Node;
```
## EqualityExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: EqualityExpression) -> File;
```
## EqualityExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: EqualityExpression) -> string;
```
## EqualityExpression::getAnOperand

```rust
pub fn getAnOperand(self: EqualityExpression) -> *Expression;
```
## EqualityExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: EqualityExpression, i: int) -> Modifier;
```
## EqualityExpression::getRightOperand

```rust
/**
     * Get the right operand of this binary expression.
     */
```
```rust
pub fn getRightOperand(self: EqualityExpression) -> Expression;
```
## EqualityExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: EqualityExpression) -> int;
```
## EqualityExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: EqualityExpression) -> string;
```
## EqualityExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *EqualityExpression;
```
## EqualityExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: EqualityExpression) -> Location;
```
## EqualityExpression::getOperator

```rust
/**
     * Get the operator of this binary expression.
     */
```
```rust
pub fn getOperator(self: EqualityExpression) -> BinaryOperator;
```
## EqualityExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: EqualityExpression) -> *Node;
```
## EqualityExpression::getLeft

```rust
/**
     * Get the left operand of this binary expression. An alias of `getLeftOperand`.
     */
```
```rust
pub fn getLeft(self: EqualityExpression) -> Expression;
```
## EqualityExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: EqualityExpression) -> int;
```
## EqualityExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: EqualityExpression) -> *Modifier;
```
## EqualityExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: EqualityExpression) -> int;
```
## EqualityExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: EqualityExpression) -> Node;
```
## EqualityExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: EqualityExpression) -> FunctionLikeDeclaration;
```
## EqualityExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: EqualityExpression) -> int;
```
## EqualityExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: EqualityExpression) -> int;
```
## EqualityExpression::getIndex

```rust
pub fn getIndex(self: EqualityExpression) -> int;
```
## EqualityExpression::getRight

```rust
/**
     * Get the right operand of this binary expression. An alias of `getRightOperand`
     */
```
```rust
pub fn getRight(self: EqualityExpression) -> Expression;
```
## EqualityExpression::is\<T\>

```rust
pub fn is<T>(self: EqualityExpression) -> bool;
```
## EqualityExpression::to\<T\>

```rust
pub fn to<T>(self: EqualityExpression) -> <any>;
```
## EqualityExpression::key\_neq

```rust
pub fn key_neq(self: EqualityExpression, object: <any>) -> bool;
```
## EqualityExpression::key\_eq

```rust
pub fn key_eq(self: EqualityExpression, object: <any>) -> bool;
```
## EqualityExpression::to\_set

```rust
pub fn to_set(self: EqualityExpression) -> *EqualityExpression;
```
