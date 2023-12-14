# AdditiveExpression

Primary key: `id: int`

```rust
schema AdditiveExpression {
  @primary id: int,
}
```
## AdditiveExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: AdditiveExpression) -> int;
```
## AdditiveExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: AdditiveExpression) -> int;
```
## AdditiveExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: AdditiveExpression) -> Node;
```
## AdditiveExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: AdditiveExpression) -> FunctionLikeDeclaration;
```
## AdditiveExpression::getLeft

```rust
/**
     * Get the left operand of this binary expression. An alias of `getLeftOperand`.
     */
```
```rust
pub fn getLeft(self: AdditiveExpression) -> Expression;
```
## AdditiveExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: AdditiveExpression) -> *Node;
```
## AdditiveExpression::getOperator

```rust
/**
     * Get the operator of this binary expression.
     */
```
```rust
pub fn getOperator(self: AdditiveExpression) -> BinaryOperator;
```
## AdditiveExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: AdditiveExpression) -> Location;
```
## AdditiveExpression::getRight

```rust
/**
     * Get the right operand of this binary expression. An alias of `getRightOperand`
     */
```
```rust
pub fn getRight(self: AdditiveExpression) -> Expression;
```
## AdditiveExpression::getIndex

```rust
pub fn getIndex(self: AdditiveExpression) -> int;
```
## AdditiveExpression::getAnOperand

```rust
pub fn getAnOperand(self: AdditiveExpression) -> *Expression;
```
## AdditiveExpression::getRightOperand

```rust
/**
     * Get the right operand of this binary expression.
     */
```
```rust
pub fn getRightOperand(self: AdditiveExpression) -> Expression;
```
## AdditiveExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: AdditiveExpression, i: int) -> Modifier;
```
## AdditiveExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: AdditiveExpression) -> string;
```
## AdditiveExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: AdditiveExpression) -> string;
```
## AdditiveExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: AdditiveExpression) -> int;
```
## AdditiveExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: AdditiveExpression) -> File;
```
## AdditiveExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: AdditiveExpression, level: int) -> Node;
```
## AdditiveExpression::getLeftOperand

```rust
/**
     * Get the left operand of this binary expression.
     */
```
```rust
pub fn getLeftOperand(self: AdditiveExpression) -> Expression;
```
## AdditiveExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: AdditiveExpression) -> *FunctionLikeDeclaration;
```
## AdditiveExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: AdditiveExpression, level: int) -> *Node;
```
## AdditiveExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: AdditiveExpression) -> int;
```
## AdditiveExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: AdditiveExpression) -> *Modifier;
```
## AdditiveExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: AdditiveExpression) -> int;
```
## AdditiveExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: AdditiveExpression) -> int;
```
## AdditiveExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: AdditiveExpression, i: int) -> Node;
```
## AdditiveExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: AdditiveExpression) -> TopLevelDO;
```
## AdditiveExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: AdditiveExpression, i: int) -> Decorator;
```
## AdditiveExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: AdditiveExpression) -> *Node;
```
## AdditiveExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: AdditiveExpression) -> Node;
```
## AdditiveExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: AdditiveExpression) -> *Comment;
```
## AdditiveExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: AdditiveExpression) -> *Comment;
```
## AdditiveExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: AdditiveExpression) -> int;
```
## AdditiveExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: AdditiveExpression) -> *Node;
```
## AdditiveExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: AdditiveExpression) -> *Comment;
```
## AdditiveExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: AdditiveExpression) -> *Decorator;
```
## AdditiveExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: AdditiveExpression) -> Symbol;
```
## AdditiveExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *AdditiveExpression;
```
## AdditiveExpression::is\<T\>

```rust
pub fn is<T>(self: AdditiveExpression) -> bool;
```
## AdditiveExpression::to\<T\>

```rust
pub fn to<T>(self: AdditiveExpression) -> <any>;
```
## AdditiveExpression::key\_neq

```rust
pub fn key_neq(self: AdditiveExpression, object: <any>) -> bool;
```
## AdditiveExpression::key\_eq

```rust
pub fn key_eq(self: AdditiveExpression, object: <any>) -> bool;
```
## AdditiveExpression::to\_set

```rust
pub fn to_set(self: AdditiveExpression) -> *AdditiveExpression;
```
