# LeftShiftAssignmentExpression

Primary key: `id: int`

```rust
schema LeftShiftAssignmentExpression {
  @primary id: int,
}
```
## LeftShiftAssignmentExpression::getRight

```rust
/**
     * Get the right operand of this binary expression. An alias of `getRightOperand`
     */
```
```rust
pub fn getRight(self: LeftShiftAssignmentExpression) -> Expression;
```
## LeftShiftAssignmentExpression::getIndex

```rust
pub fn getIndex(self: LeftShiftAssignmentExpression) -> int;
```
## LeftShiftAssignmentExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: LeftShiftAssignmentExpression) -> int;
```
## LeftShiftAssignmentExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: LeftShiftAssignmentExpression) -> int;
```
## LeftShiftAssignmentExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: LeftShiftAssignmentExpression) -> FunctionLikeDeclaration;
```
## LeftShiftAssignmentExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: LeftShiftAssignmentExpression) -> Node;
```
## LeftShiftAssignmentExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: LeftShiftAssignmentExpression) -> int;
```
## LeftShiftAssignmentExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: LeftShiftAssignmentExpression) -> *Modifier;
```
## LeftShiftAssignmentExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: LeftShiftAssignmentExpression) -> int;
```
## LeftShiftAssignmentExpression::getLeft

```rust
/**
     * Get the left operand of this binary expression. An alias of `getLeftOperand`.
     */
```
```rust
pub fn getLeft(self: LeftShiftAssignmentExpression) -> Expression;
```
## LeftShiftAssignmentExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: LeftShiftAssignmentExpression) -> *Node;
```
## LeftShiftAssignmentExpression::getOperator

```rust
/**
     * Get the operator of this binary expression.
     */
```
```rust
pub fn getOperator(self: LeftShiftAssignmentExpression) -> BinaryOperator;
```
## LeftShiftAssignmentExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: LeftShiftAssignmentExpression) -> Location;
```
## LeftShiftAssignmentExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: LeftShiftAssignmentExpression) -> string;
```
## LeftShiftAssignmentExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: LeftShiftAssignmentExpression) -> int;
```
## LeftShiftAssignmentExpression::getAnOperand

```rust
pub fn getAnOperand(self: LeftShiftAssignmentExpression) -> *Expression;
```
## LeftShiftAssignmentExpression::getRightOperand

```rust
/**
     * Get the right operand of this binary expression.
     */
```
```rust
pub fn getRightOperand(self: LeftShiftAssignmentExpression) -> Expression;
```
## LeftShiftAssignmentExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: LeftShiftAssignmentExpression, i: int) -> Modifier;
```
## LeftShiftAssignmentExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: LeftShiftAssignmentExpression) -> string;
```
## LeftShiftAssignmentExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: LeftShiftAssignmentExpression) -> File;
```
## LeftShiftAssignmentExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: LeftShiftAssignmentExpression, level: int) -> Node;
```
## LeftShiftAssignmentExpression::getLeftOperand

```rust
/**
     * Get the left operand of this binary expression.
     */
```
```rust
pub fn getLeftOperand(self: LeftShiftAssignmentExpression) -> Expression;
```
## LeftShiftAssignmentExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: LeftShiftAssignmentExpression, level: int) -> *Node;
```
## LeftShiftAssignmentExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: LeftShiftAssignmentExpression) -> *FunctionLikeDeclaration;
```
## LeftShiftAssignmentExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: LeftShiftAssignmentExpression) -> int;
```
## LeftShiftAssignmentExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: LeftShiftAssignmentExpression, i: int) -> Node;
```
## LeftShiftAssignmentExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: LeftShiftAssignmentExpression) -> TopLevelDO;
```
## LeftShiftAssignmentExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: LeftShiftAssignmentExpression, i: int) -> Decorator;
```
## LeftShiftAssignmentExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: LeftShiftAssignmentExpression) -> *Node;
```
## LeftShiftAssignmentExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: LeftShiftAssignmentExpression) -> *Comment;
```
## LeftShiftAssignmentExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: LeftShiftAssignmentExpression) -> Node;
```
## LeftShiftAssignmentExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: LeftShiftAssignmentExpression) -> *Node;
```
## LeftShiftAssignmentExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: LeftShiftAssignmentExpression) -> *Comment;
```
## LeftShiftAssignmentExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: LeftShiftAssignmentExpression) -> *Comment;
```
## LeftShiftAssignmentExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: LeftShiftAssignmentExpression) -> int;
```
## LeftShiftAssignmentExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: LeftShiftAssignmentExpression) -> *Decorator;
```
## LeftShiftAssignmentExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: LeftShiftAssignmentExpression) -> Symbol;
```
## LeftShiftAssignmentExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *LeftShiftAssignmentExpression;
```
## LeftShiftAssignmentExpression::is\<T\>

```rust
pub fn is<T>(self: LeftShiftAssignmentExpression) -> bool;
```
## LeftShiftAssignmentExpression::to\<T\>

```rust
pub fn to<T>(self: LeftShiftAssignmentExpression) -> <any>;
```
## LeftShiftAssignmentExpression::key\_neq

```rust
pub fn key_neq(self: LeftShiftAssignmentExpression, object: <any>) -> bool;
```
## LeftShiftAssignmentExpression::key\_eq

```rust
pub fn key_eq(self: LeftShiftAssignmentExpression, object: <any>) -> bool;
```
## LeftShiftAssignmentExpression::to\_set

```rust
pub fn to_set(self: LeftShiftAssignmentExpression) -> *LeftShiftAssignmentExpression;
```
