# MultiplicationExpression

Primary key: `id: int`

```rust
schema MultiplicationExpression {
  @primary id: int,
}
```
## MultiplicationExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: MultiplicationExpression) -> Symbol;
```
## MultiplicationExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: MultiplicationExpression) -> *Decorator;
```
## MultiplicationExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: MultiplicationExpression) -> *Comment;
```
## MultiplicationExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: MultiplicationExpression) -> *Node;
```
## MultiplicationExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: MultiplicationExpression) -> int;
```
## MultiplicationExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: MultiplicationExpression) -> *Comment;
```
## MultiplicationExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: MultiplicationExpression) -> *Comment;
```
## MultiplicationExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: MultiplicationExpression) -> Node;
```
## MultiplicationExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: MultiplicationExpression) -> *Node;
```
## MultiplicationExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: MultiplicationExpression, i: int) -> Decorator;
```
## MultiplicationExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: MultiplicationExpression) -> TopLevelDO;
```
## MultiplicationExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: MultiplicationExpression, i: int) -> Node;
```
## MultiplicationExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: MultiplicationExpression) -> int;
```
## MultiplicationExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: MultiplicationExpression, level: int) -> *Node;
```
## MultiplicationExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: MultiplicationExpression) -> *FunctionLikeDeclaration;
```
## MultiplicationExpression::getLeftOperand

```rust
/**
     * Get the left operand of this binary expression.
     */
```
```rust
pub fn getLeftOperand(self: MultiplicationExpression) -> Expression;
```
## MultiplicationExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: MultiplicationExpression, level: int) -> Node;
```
## MultiplicationExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: MultiplicationExpression) -> File;
```
## MultiplicationExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: MultiplicationExpression) -> string;
```
## MultiplicationExpression::getAnOperand

```rust
pub fn getAnOperand(self: MultiplicationExpression) -> *Expression;
```
## MultiplicationExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: MultiplicationExpression, i: int) -> Modifier;
```
## MultiplicationExpression::getRightOperand

```rust
/**
     * Get the right operand of this binary expression.
     */
```
```rust
pub fn getRightOperand(self: MultiplicationExpression) -> Expression;
```
## MultiplicationExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: MultiplicationExpression) -> int;
```
## MultiplicationExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: MultiplicationExpression) -> string;
```
## MultiplicationExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *MultiplicationExpression;
```
## MultiplicationExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: MultiplicationExpression) -> Location;
```
## MultiplicationExpression::getOperator

```rust
/**
     * Get the operator of this binary expression.
     */
```
```rust
pub fn getOperator(self: MultiplicationExpression) -> BinaryOperator;
```
## MultiplicationExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: MultiplicationExpression) -> *Node;
```
## MultiplicationExpression::getLeft

```rust
/**
     * Get the left operand of this binary expression. An alias of `getLeftOperand`.
     */
```
```rust
pub fn getLeft(self: MultiplicationExpression) -> Expression;
```
## MultiplicationExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: MultiplicationExpression) -> int;
```
## MultiplicationExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: MultiplicationExpression) -> *Modifier;
```
## MultiplicationExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: MultiplicationExpression) -> int;
```
## MultiplicationExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: MultiplicationExpression) -> Node;
```
## MultiplicationExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: MultiplicationExpression) -> FunctionLikeDeclaration;
```
## MultiplicationExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: MultiplicationExpression) -> int;
```
## MultiplicationExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: MultiplicationExpression) -> int;
```
## MultiplicationExpression::getIndex

```rust
pub fn getIndex(self: MultiplicationExpression) -> int;
```
## MultiplicationExpression::getRight

```rust
/**
     * Get the right operand of this binary expression. An alias of `getRightOperand`
     */
```
```rust
pub fn getRight(self: MultiplicationExpression) -> Expression;
```
## MultiplicationExpression::is\<T\>

```rust
pub fn is<T>(self: MultiplicationExpression) -> bool;
```
## MultiplicationExpression::to\<T\>

```rust
pub fn to<T>(self: MultiplicationExpression) -> <any>;
```
## MultiplicationExpression::key\_neq

```rust
pub fn key_neq(self: MultiplicationExpression, object: <any>) -> bool;
```
## MultiplicationExpression::key\_eq

```rust
pub fn key_eq(self: MultiplicationExpression, object: <any>) -> bool;
```
## MultiplicationExpression::to\_set

```rust
pub fn to_set(self: MultiplicationExpression) -> *MultiplicationExpression;
```
