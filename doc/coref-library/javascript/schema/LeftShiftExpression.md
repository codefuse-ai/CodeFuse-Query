# LeftShiftExpression

Primary key: `id: int`

```rust
schema LeftShiftExpression {
  @primary id: int,
}
```
## LeftShiftExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: LeftShiftExpression) -> Symbol;
```
## LeftShiftExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: LeftShiftExpression) -> *Decorator;
```
## LeftShiftExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: LeftShiftExpression) -> *Comment;
```
## LeftShiftExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: LeftShiftExpression) -> *Node;
```
## LeftShiftExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: LeftShiftExpression) -> int;
```
## LeftShiftExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: LeftShiftExpression) -> *Comment;
```
## LeftShiftExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: LeftShiftExpression) -> *Comment;
```
## LeftShiftExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: LeftShiftExpression) -> Node;
```
## LeftShiftExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: LeftShiftExpression) -> *Node;
```
## LeftShiftExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: LeftShiftExpression, i: int) -> Decorator;
```
## LeftShiftExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: LeftShiftExpression) -> TopLevelDO;
```
## LeftShiftExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: LeftShiftExpression, i: int) -> Node;
```
## LeftShiftExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: LeftShiftExpression) -> int;
```
## LeftShiftExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: LeftShiftExpression, level: int) -> *Node;
```
## LeftShiftExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: LeftShiftExpression) -> *FunctionLikeDeclaration;
```
## LeftShiftExpression::getLeftOperand

```rust
/**
     * Get the left operand of this binary expression.
     */
```
```rust
pub fn getLeftOperand(self: LeftShiftExpression) -> Expression;
```
## LeftShiftExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: LeftShiftExpression, level: int) -> Node;
```
## LeftShiftExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: LeftShiftExpression) -> File;
```
## LeftShiftExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: LeftShiftExpression) -> string;
```
## LeftShiftExpression::getAnOperand

```rust
pub fn getAnOperand(self: LeftShiftExpression) -> *Expression;
```
## LeftShiftExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: LeftShiftExpression, i: int) -> Modifier;
```
## LeftShiftExpression::getRightOperand

```rust
/**
     * Get the right operand of this binary expression.
     */
```
```rust
pub fn getRightOperand(self: LeftShiftExpression) -> Expression;
```
## LeftShiftExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: LeftShiftExpression) -> int;
```
## LeftShiftExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: LeftShiftExpression) -> string;
```
## LeftShiftExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *LeftShiftExpression;
```
## LeftShiftExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: LeftShiftExpression) -> Location;
```
## LeftShiftExpression::getOperator

```rust
/**
     * Get the operator of this binary expression.
     */
```
```rust
pub fn getOperator(self: LeftShiftExpression) -> BinaryOperator;
```
## LeftShiftExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: LeftShiftExpression) -> *Node;
```
## LeftShiftExpression::getLeft

```rust
/**
     * Get the left operand of this binary expression. An alias of `getLeftOperand`.
     */
```
```rust
pub fn getLeft(self: LeftShiftExpression) -> Expression;
```
## LeftShiftExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: LeftShiftExpression) -> int;
```
## LeftShiftExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: LeftShiftExpression) -> *Modifier;
```
## LeftShiftExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: LeftShiftExpression) -> int;
```
## LeftShiftExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: LeftShiftExpression) -> Node;
```
## LeftShiftExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: LeftShiftExpression) -> FunctionLikeDeclaration;
```
## LeftShiftExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: LeftShiftExpression) -> int;
```
## LeftShiftExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: LeftShiftExpression) -> int;
```
## LeftShiftExpression::getIndex

```rust
pub fn getIndex(self: LeftShiftExpression) -> int;
```
## LeftShiftExpression::getRight

```rust
/**
     * Get the right operand of this binary expression. An alias of `getRightOperand`
     */
```
```rust
pub fn getRight(self: LeftShiftExpression) -> Expression;
```
## LeftShiftExpression::is\<T\>

```rust
pub fn is<T>(self: LeftShiftExpression) -> bool;
```
## LeftShiftExpression::to\<T\>

```rust
pub fn to<T>(self: LeftShiftExpression) -> <any>;
```
## LeftShiftExpression::key\_neq

```rust
pub fn key_neq(self: LeftShiftExpression, object: <any>) -> bool;
```
## LeftShiftExpression::key\_eq

```rust
pub fn key_eq(self: LeftShiftExpression, object: <any>) -> bool;
```
## LeftShiftExpression::to\_set

```rust
pub fn to_set(self: LeftShiftExpression) -> *LeftShiftExpression;
```
