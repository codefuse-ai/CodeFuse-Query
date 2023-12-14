# RightShiftAssignmentExpression

Primary key: `id: int`

```rust
schema RightShiftAssignmentExpression {
  @primary id: int,
}
```
## RightShiftAssignmentExpression::getRight

```rust
/**
     * Get the right operand of this binary expression. An alias of `getRightOperand`
     */
```
```rust
pub fn getRight(self: RightShiftAssignmentExpression) -> Expression;
```
## RightShiftAssignmentExpression::getIndex

```rust
pub fn getIndex(self: RightShiftAssignmentExpression) -> int;
```
## RightShiftAssignmentExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: RightShiftAssignmentExpression) -> int;
```
## RightShiftAssignmentExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: RightShiftAssignmentExpression) -> int;
```
## RightShiftAssignmentExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: RightShiftAssignmentExpression) -> FunctionLikeDeclaration;
```
## RightShiftAssignmentExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: RightShiftAssignmentExpression) -> Node;
```
## RightShiftAssignmentExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: RightShiftAssignmentExpression) -> int;
```
## RightShiftAssignmentExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: RightShiftAssignmentExpression) -> *Modifier;
```
## RightShiftAssignmentExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: RightShiftAssignmentExpression) -> int;
```
## RightShiftAssignmentExpression::getLeft

```rust
/**
     * Get the left operand of this binary expression. An alias of `getLeftOperand`.
     */
```
```rust
pub fn getLeft(self: RightShiftAssignmentExpression) -> Expression;
```
## RightShiftAssignmentExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: RightShiftAssignmentExpression) -> *Node;
```
## RightShiftAssignmentExpression::getOperator

```rust
/**
     * Get the operator of this binary expression.
     */
```
```rust
pub fn getOperator(self: RightShiftAssignmentExpression) -> BinaryOperator;
```
## RightShiftAssignmentExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: RightShiftAssignmentExpression) -> Location;
```
## RightShiftAssignmentExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: RightShiftAssignmentExpression) -> string;
```
## RightShiftAssignmentExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: RightShiftAssignmentExpression) -> int;
```
## RightShiftAssignmentExpression::getAnOperand

```rust
pub fn getAnOperand(self: RightShiftAssignmentExpression) -> *Expression;
```
## RightShiftAssignmentExpression::getRightOperand

```rust
/**
     * Get the right operand of this binary expression.
     */
```
```rust
pub fn getRightOperand(self: RightShiftAssignmentExpression) -> Expression;
```
## RightShiftAssignmentExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: RightShiftAssignmentExpression, i: int) -> Modifier;
```
## RightShiftAssignmentExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: RightShiftAssignmentExpression) -> string;
```
## RightShiftAssignmentExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: RightShiftAssignmentExpression) -> File;
```
## RightShiftAssignmentExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: RightShiftAssignmentExpression, level: int) -> Node;
```
## RightShiftAssignmentExpression::getLeftOperand

```rust
/**
     * Get the left operand of this binary expression.
     */
```
```rust
pub fn getLeftOperand(self: RightShiftAssignmentExpression) -> Expression;
```
## RightShiftAssignmentExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: RightShiftAssignmentExpression, level: int) -> *Node;
```
## RightShiftAssignmentExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: RightShiftAssignmentExpression) -> *FunctionLikeDeclaration;
```
## RightShiftAssignmentExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: RightShiftAssignmentExpression) -> int;
```
## RightShiftAssignmentExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: RightShiftAssignmentExpression, i: int) -> Node;
```
## RightShiftAssignmentExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: RightShiftAssignmentExpression) -> TopLevelDO;
```
## RightShiftAssignmentExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: RightShiftAssignmentExpression, i: int) -> Decorator;
```
## RightShiftAssignmentExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: RightShiftAssignmentExpression) -> *Node;
```
## RightShiftAssignmentExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: RightShiftAssignmentExpression) -> *Comment;
```
## RightShiftAssignmentExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: RightShiftAssignmentExpression) -> Node;
```
## RightShiftAssignmentExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: RightShiftAssignmentExpression) -> *Node;
```
## RightShiftAssignmentExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: RightShiftAssignmentExpression) -> *Comment;
```
## RightShiftAssignmentExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: RightShiftAssignmentExpression) -> *Comment;
```
## RightShiftAssignmentExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: RightShiftAssignmentExpression) -> int;
```
## RightShiftAssignmentExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: RightShiftAssignmentExpression) -> *Decorator;
```
## RightShiftAssignmentExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: RightShiftAssignmentExpression) -> Symbol;
```
## RightShiftAssignmentExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *RightShiftAssignmentExpression;
```
## RightShiftAssignmentExpression::is\<T\>

```rust
pub fn is<T>(self: RightShiftAssignmentExpression) -> bool;
```
## RightShiftAssignmentExpression::to\<T\>

```rust
pub fn to<T>(self: RightShiftAssignmentExpression) -> <any>;
```
## RightShiftAssignmentExpression::key\_neq

```rust
pub fn key_neq(self: RightShiftAssignmentExpression, object: <any>) -> bool;
```
## RightShiftAssignmentExpression::key\_eq

```rust
pub fn key_eq(self: RightShiftAssignmentExpression, object: <any>) -> bool;
```
## RightShiftAssignmentExpression::to\_set

```rust
pub fn to_set(self: RightShiftAssignmentExpression) -> *RightShiftAssignmentExpression;
```
