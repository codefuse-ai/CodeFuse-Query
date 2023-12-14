# GreaterThanExpression

Primary key: `id: int`

```rust
schema GreaterThanExpression {
  @primary id: int,
}
```
## GreaterThanExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: GreaterThanExpression) -> Symbol;
```
## GreaterThanExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: GreaterThanExpression) -> *Decorator;
```
## GreaterThanExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: GreaterThanExpression) -> *Comment;
```
## GreaterThanExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: GreaterThanExpression) -> *Node;
```
## GreaterThanExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: GreaterThanExpression) -> int;
```
## GreaterThanExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: GreaterThanExpression) -> *Comment;
```
## GreaterThanExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: GreaterThanExpression) -> *Comment;
```
## GreaterThanExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: GreaterThanExpression) -> Node;
```
## GreaterThanExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: GreaterThanExpression) -> *Node;
```
## GreaterThanExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: GreaterThanExpression, i: int) -> Decorator;
```
## GreaterThanExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: GreaterThanExpression) -> TopLevelDO;
```
## GreaterThanExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: GreaterThanExpression, i: int) -> Node;
```
## GreaterThanExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: GreaterThanExpression) -> int;
```
## GreaterThanExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: GreaterThanExpression, level: int) -> *Node;
```
## GreaterThanExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: GreaterThanExpression) -> *FunctionLikeDeclaration;
```
## GreaterThanExpression::getLeftOperand

```rust
/**
     * Get the left operand of this binary expression.
     */
```
```rust
pub fn getLeftOperand(self: GreaterThanExpression) -> Expression;
```
## GreaterThanExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: GreaterThanExpression, level: int) -> Node;
```
## GreaterThanExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: GreaterThanExpression) -> File;
```
## GreaterThanExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: GreaterThanExpression) -> string;
```
## GreaterThanExpression::getAnOperand

```rust
pub fn getAnOperand(self: GreaterThanExpression) -> *Expression;
```
## GreaterThanExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: GreaterThanExpression, i: int) -> Modifier;
```
## GreaterThanExpression::getRightOperand

```rust
/**
     * Get the right operand of this binary expression.
     */
```
```rust
pub fn getRightOperand(self: GreaterThanExpression) -> Expression;
```
## GreaterThanExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: GreaterThanExpression) -> int;
```
## GreaterThanExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: GreaterThanExpression) -> string;
```
## GreaterThanExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *GreaterThanExpression;
```
## GreaterThanExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: GreaterThanExpression) -> Location;
```
## GreaterThanExpression::getOperator

```rust
/**
     * Get the operator of this binary expression.
     */
```
```rust
pub fn getOperator(self: GreaterThanExpression) -> BinaryOperator;
```
## GreaterThanExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: GreaterThanExpression) -> *Node;
```
## GreaterThanExpression::getLeft

```rust
/**
     * Get the left operand of this binary expression. An alias of `getLeftOperand`.
     */
```
```rust
pub fn getLeft(self: GreaterThanExpression) -> Expression;
```
## GreaterThanExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: GreaterThanExpression) -> int;
```
## GreaterThanExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: GreaterThanExpression) -> *Modifier;
```
## GreaterThanExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: GreaterThanExpression) -> int;
```
## GreaterThanExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: GreaterThanExpression) -> Node;
```
## GreaterThanExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: GreaterThanExpression) -> FunctionLikeDeclaration;
```
## GreaterThanExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: GreaterThanExpression) -> int;
```
## GreaterThanExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: GreaterThanExpression) -> int;
```
## GreaterThanExpression::getIndex

```rust
pub fn getIndex(self: GreaterThanExpression) -> int;
```
## GreaterThanExpression::getRight

```rust
/**
     * Get the right operand of this binary expression. An alias of `getRightOperand`
     */
```
```rust
pub fn getRight(self: GreaterThanExpression) -> Expression;
```
## GreaterThanExpression::is\<T\>

```rust
pub fn is<T>(self: GreaterThanExpression) -> bool;
```
## GreaterThanExpression::to\<T\>

```rust
pub fn to<T>(self: GreaterThanExpression) -> <any>;
```
## GreaterThanExpression::key\_neq

```rust
pub fn key_neq(self: GreaterThanExpression, object: <any>) -> bool;
```
## GreaterThanExpression::key\_eq

```rust
pub fn key_eq(self: GreaterThanExpression, object: <any>) -> bool;
```
## GreaterThanExpression::to\_set

```rust
pub fn to_set(self: GreaterThanExpression) -> *GreaterThanExpression;
```
