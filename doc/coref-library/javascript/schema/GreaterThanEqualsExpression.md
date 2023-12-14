# GreaterThanEqualsExpression

Primary key: `id: int`

```rust
schema GreaterThanEqualsExpression {
  @primary id: int,
}
```
## GreaterThanEqualsExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: GreaterThanEqualsExpression) -> Symbol;
```
## GreaterThanEqualsExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: GreaterThanEqualsExpression) -> *Decorator;
```
## GreaterThanEqualsExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: GreaterThanEqualsExpression) -> *Comment;
```
## GreaterThanEqualsExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: GreaterThanEqualsExpression) -> *Node;
```
## GreaterThanEqualsExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: GreaterThanEqualsExpression) -> int;
```
## GreaterThanEqualsExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: GreaterThanEqualsExpression) -> *Comment;
```
## GreaterThanEqualsExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: GreaterThanEqualsExpression) -> *Comment;
```
## GreaterThanEqualsExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: GreaterThanEqualsExpression) -> Node;
```
## GreaterThanEqualsExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: GreaterThanEqualsExpression) -> *Node;
```
## GreaterThanEqualsExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: GreaterThanEqualsExpression, i: int) -> Decorator;
```
## GreaterThanEqualsExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: GreaterThanEqualsExpression) -> TopLevelDO;
```
## GreaterThanEqualsExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: GreaterThanEqualsExpression, i: int) -> Node;
```
## GreaterThanEqualsExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: GreaterThanEqualsExpression) -> int;
```
## GreaterThanEqualsExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: GreaterThanEqualsExpression, level: int) -> *Node;
```
## GreaterThanEqualsExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: GreaterThanEqualsExpression) -> *FunctionLikeDeclaration;
```
## GreaterThanEqualsExpression::getLeftOperand

```rust
/**
     * Get the left operand of this binary expression.
     */
```
```rust
pub fn getLeftOperand(self: GreaterThanEqualsExpression) -> Expression;
```
## GreaterThanEqualsExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: GreaterThanEqualsExpression, level: int) -> Node;
```
## GreaterThanEqualsExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: GreaterThanEqualsExpression) -> File;
```
## GreaterThanEqualsExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: GreaterThanEqualsExpression) -> string;
```
## GreaterThanEqualsExpression::getAnOperand

```rust
pub fn getAnOperand(self: GreaterThanEqualsExpression) -> *Expression;
```
## GreaterThanEqualsExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: GreaterThanEqualsExpression, i: int) -> Modifier;
```
## GreaterThanEqualsExpression::getRightOperand

```rust
/**
     * Get the right operand of this binary expression.
     */
```
```rust
pub fn getRightOperand(self: GreaterThanEqualsExpression) -> Expression;
```
## GreaterThanEqualsExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: GreaterThanEqualsExpression) -> int;
```
## GreaterThanEqualsExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: GreaterThanEqualsExpression) -> string;
```
## GreaterThanEqualsExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *GreaterThanEqualsExpression;
```
## GreaterThanEqualsExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: GreaterThanEqualsExpression) -> Location;
```
## GreaterThanEqualsExpression::getOperator

```rust
/**
     * Get the operator of this binary expression.
     */
```
```rust
pub fn getOperator(self: GreaterThanEqualsExpression) -> BinaryOperator;
```
## GreaterThanEqualsExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: GreaterThanEqualsExpression) -> *Node;
```
## GreaterThanEqualsExpression::getLeft

```rust
/**
     * Get the left operand of this binary expression. An alias of `getLeftOperand`.
     */
```
```rust
pub fn getLeft(self: GreaterThanEqualsExpression) -> Expression;
```
## GreaterThanEqualsExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: GreaterThanEqualsExpression) -> int;
```
## GreaterThanEqualsExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: GreaterThanEqualsExpression) -> *Modifier;
```
## GreaterThanEqualsExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: GreaterThanEqualsExpression) -> int;
```
## GreaterThanEqualsExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: GreaterThanEqualsExpression) -> Node;
```
## GreaterThanEqualsExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: GreaterThanEqualsExpression) -> FunctionLikeDeclaration;
```
## GreaterThanEqualsExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: GreaterThanEqualsExpression) -> int;
```
## GreaterThanEqualsExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: GreaterThanEqualsExpression) -> int;
```
## GreaterThanEqualsExpression::getIndex

```rust
pub fn getIndex(self: GreaterThanEqualsExpression) -> int;
```
## GreaterThanEqualsExpression::getRight

```rust
/**
     * Get the right operand of this binary expression. An alias of `getRightOperand`
     */
```
```rust
pub fn getRight(self: GreaterThanEqualsExpression) -> Expression;
```
## GreaterThanEqualsExpression::is\<T\>

```rust
pub fn is<T>(self: GreaterThanEqualsExpression) -> bool;
```
## GreaterThanEqualsExpression::to\<T\>

```rust
pub fn to<T>(self: GreaterThanEqualsExpression) -> <any>;
```
## GreaterThanEqualsExpression::key\_neq

```rust
pub fn key_neq(self: GreaterThanEqualsExpression, object: <any>) -> bool;
```
## GreaterThanEqualsExpression::key\_eq

```rust
pub fn key_eq(self: GreaterThanEqualsExpression, object: <any>) -> bool;
```
## GreaterThanEqualsExpression::to\_set

```rust
pub fn to_set(self: GreaterThanEqualsExpression) -> *GreaterThanEqualsExpression;
```
