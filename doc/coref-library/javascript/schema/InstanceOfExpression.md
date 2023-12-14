# InstanceOfExpression

Primary key: `id: int`

```rust
schema InstanceOfExpression {
  @primary id: int,
}
```
## InstanceOfExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: InstanceOfExpression) -> Symbol;
```
## InstanceOfExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: InstanceOfExpression) -> *Decorator;
```
## InstanceOfExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: InstanceOfExpression) -> *Comment;
```
## InstanceOfExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: InstanceOfExpression) -> *Node;
```
## InstanceOfExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: InstanceOfExpression) -> int;
```
## InstanceOfExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: InstanceOfExpression) -> *Comment;
```
## InstanceOfExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: InstanceOfExpression) -> *Comment;
```
## InstanceOfExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: InstanceOfExpression) -> Node;
```
## InstanceOfExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: InstanceOfExpression) -> *Node;
```
## InstanceOfExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: InstanceOfExpression, i: int) -> Decorator;
```
## InstanceOfExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: InstanceOfExpression) -> TopLevelDO;
```
## InstanceOfExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: InstanceOfExpression, i: int) -> Node;
```
## InstanceOfExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: InstanceOfExpression) -> int;
```
## InstanceOfExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: InstanceOfExpression, level: int) -> *Node;
```
## InstanceOfExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: InstanceOfExpression) -> *FunctionLikeDeclaration;
```
## InstanceOfExpression::getLeftOperand

```rust
/**
     * Get the left operand of this binary expression.
     */
```
```rust
pub fn getLeftOperand(self: InstanceOfExpression) -> Expression;
```
## InstanceOfExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: InstanceOfExpression, level: int) -> Node;
```
## InstanceOfExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: InstanceOfExpression) -> File;
```
## InstanceOfExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: InstanceOfExpression) -> string;
```
## InstanceOfExpression::getAnOperand

```rust
pub fn getAnOperand(self: InstanceOfExpression) -> *Expression;
```
## InstanceOfExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: InstanceOfExpression, i: int) -> Modifier;
```
## InstanceOfExpression::getRightOperand

```rust
/**
     * Get the right operand of this binary expression.
     */
```
```rust
pub fn getRightOperand(self: InstanceOfExpression) -> Expression;
```
## InstanceOfExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: InstanceOfExpression) -> int;
```
## InstanceOfExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: InstanceOfExpression) -> string;
```
## InstanceOfExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *InstanceOfExpression;
```
## InstanceOfExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: InstanceOfExpression) -> Location;
```
## InstanceOfExpression::getOperator

```rust
/**
     * Get the operator of this binary expression.
     */
```
```rust
pub fn getOperator(self: InstanceOfExpression) -> BinaryOperator;
```
## InstanceOfExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: InstanceOfExpression) -> *Node;
```
## InstanceOfExpression::getLeft

```rust
/**
     * Get the left operand of this binary expression. An alias of `getLeftOperand`.
     */
```
```rust
pub fn getLeft(self: InstanceOfExpression) -> Expression;
```
## InstanceOfExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: InstanceOfExpression) -> int;
```
## InstanceOfExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: InstanceOfExpression) -> *Modifier;
```
## InstanceOfExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: InstanceOfExpression) -> int;
```
## InstanceOfExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: InstanceOfExpression) -> Node;
```
## InstanceOfExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: InstanceOfExpression) -> FunctionLikeDeclaration;
```
## InstanceOfExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: InstanceOfExpression) -> int;
```
## InstanceOfExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: InstanceOfExpression) -> int;
```
## InstanceOfExpression::getIndex

```rust
pub fn getIndex(self: InstanceOfExpression) -> int;
```
## InstanceOfExpression::getRight

```rust
/**
     * Get the right operand of this binary expression. An alias of `getRightOperand`
     */
```
```rust
pub fn getRight(self: InstanceOfExpression) -> Expression;
```
## InstanceOfExpression::is\<T\>

```rust
pub fn is<T>(self: InstanceOfExpression) -> bool;
```
## InstanceOfExpression::to\<T\>

```rust
pub fn to<T>(self: InstanceOfExpression) -> <any>;
```
## InstanceOfExpression::key\_neq

```rust
pub fn key_neq(self: InstanceOfExpression, object: <any>) -> bool;
```
## InstanceOfExpression::key\_eq

```rust
pub fn key_eq(self: InstanceOfExpression, object: <any>) -> bool;
```
## InstanceOfExpression::to\_set

```rust
pub fn to_set(self: InstanceOfExpression) -> *InstanceOfExpression;
```
