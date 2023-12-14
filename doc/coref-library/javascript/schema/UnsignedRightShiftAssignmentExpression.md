# UnsignedRightShiftAssignmentExpression

Primary key: `id: int`

```rust
schema UnsignedRightShiftAssignmentExpression {
  @primary id: int,
}
```
## UnsignedRightShiftAssignmentExpression::getRight

```rust
/**
     * Get the right operand of this binary expression. An alias of `getRightOperand`
     */
```
```rust
pub fn getRight(self: UnsignedRightShiftAssignmentExpression) -> Expression;
```
## UnsignedRightShiftAssignmentExpression::getIndex

```rust
pub fn getIndex(self: UnsignedRightShiftAssignmentExpression) -> int;
```
## UnsignedRightShiftAssignmentExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: UnsignedRightShiftAssignmentExpression) -> int;
```
## UnsignedRightShiftAssignmentExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: UnsignedRightShiftAssignmentExpression) -> int;
```
## UnsignedRightShiftAssignmentExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: UnsignedRightShiftAssignmentExpression) -> FunctionLikeDeclaration;
```
## UnsignedRightShiftAssignmentExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: UnsignedRightShiftAssignmentExpression) -> Node;
```
## UnsignedRightShiftAssignmentExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: UnsignedRightShiftAssignmentExpression) -> int;
```
## UnsignedRightShiftAssignmentExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: UnsignedRightShiftAssignmentExpression) -> *Modifier;
```
## UnsignedRightShiftAssignmentExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: UnsignedRightShiftAssignmentExpression) -> int;
```
## UnsignedRightShiftAssignmentExpression::getLeft

```rust
/**
     * Get the left operand of this binary expression. An alias of `getLeftOperand`.
     */
```
```rust
pub fn getLeft(self: UnsignedRightShiftAssignmentExpression) -> Expression;
```
## UnsignedRightShiftAssignmentExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: UnsignedRightShiftAssignmentExpression) -> *Node;
```
## UnsignedRightShiftAssignmentExpression::getOperator

```rust
/**
     * Get the operator of this binary expression.
     */
```
```rust
pub fn getOperator(self: UnsignedRightShiftAssignmentExpression) -> BinaryOperator;
```
## UnsignedRightShiftAssignmentExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: UnsignedRightShiftAssignmentExpression) -> Location;
```
## UnsignedRightShiftAssignmentExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: UnsignedRightShiftAssignmentExpression) -> string;
```
## UnsignedRightShiftAssignmentExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: UnsignedRightShiftAssignmentExpression) -> int;
```
## UnsignedRightShiftAssignmentExpression::getAnOperand

```rust
pub fn getAnOperand(self: UnsignedRightShiftAssignmentExpression) -> *Expression;
```
## UnsignedRightShiftAssignmentExpression::getRightOperand

```rust
/**
     * Get the right operand of this binary expression.
     */
```
```rust
pub fn getRightOperand(self: UnsignedRightShiftAssignmentExpression) -> Expression;
```
## UnsignedRightShiftAssignmentExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: UnsignedRightShiftAssignmentExpression, i: int) -> Modifier;
```
## UnsignedRightShiftAssignmentExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: UnsignedRightShiftAssignmentExpression) -> string;
```
## UnsignedRightShiftAssignmentExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: UnsignedRightShiftAssignmentExpression) -> File;
```
## UnsignedRightShiftAssignmentExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: UnsignedRightShiftAssignmentExpression, level: int) -> Node;
```
## UnsignedRightShiftAssignmentExpression::getLeftOperand

```rust
/**
     * Get the left operand of this binary expression.
     */
```
```rust
pub fn getLeftOperand(self: UnsignedRightShiftAssignmentExpression) -> Expression;
```
## UnsignedRightShiftAssignmentExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: UnsignedRightShiftAssignmentExpression, level: int) -> *Node;
```
## UnsignedRightShiftAssignmentExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: UnsignedRightShiftAssignmentExpression) -> *FunctionLikeDeclaration;
```
## UnsignedRightShiftAssignmentExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: UnsignedRightShiftAssignmentExpression) -> int;
```
## UnsignedRightShiftAssignmentExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: UnsignedRightShiftAssignmentExpression, i: int) -> Node;
```
## UnsignedRightShiftAssignmentExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: UnsignedRightShiftAssignmentExpression) -> TopLevelDO;
```
## UnsignedRightShiftAssignmentExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: UnsignedRightShiftAssignmentExpression, i: int) -> Decorator;
```
## UnsignedRightShiftAssignmentExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: UnsignedRightShiftAssignmentExpression) -> *Node;
```
## UnsignedRightShiftAssignmentExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: UnsignedRightShiftAssignmentExpression) -> *Comment;
```
## UnsignedRightShiftAssignmentExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: UnsignedRightShiftAssignmentExpression) -> Node;
```
## UnsignedRightShiftAssignmentExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: UnsignedRightShiftAssignmentExpression) -> *Node;
```
## UnsignedRightShiftAssignmentExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: UnsignedRightShiftAssignmentExpression) -> *Comment;
```
## UnsignedRightShiftAssignmentExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: UnsignedRightShiftAssignmentExpression) -> *Comment;
```
## UnsignedRightShiftAssignmentExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: UnsignedRightShiftAssignmentExpression) -> int;
```
## UnsignedRightShiftAssignmentExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: UnsignedRightShiftAssignmentExpression) -> *Decorator;
```
## UnsignedRightShiftAssignmentExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: UnsignedRightShiftAssignmentExpression) -> Symbol;
```
## UnsignedRightShiftAssignmentExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *UnsignedRightShiftAssignmentExpression;
```
## UnsignedRightShiftAssignmentExpression::is\<T\>

```rust
pub fn is<T>(self: UnsignedRightShiftAssignmentExpression) -> bool;
```
## UnsignedRightShiftAssignmentExpression::to\<T\>

```rust
pub fn to<T>(self: UnsignedRightShiftAssignmentExpression) -> <any>;
```
## UnsignedRightShiftAssignmentExpression::key\_neq

```rust
pub fn key_neq(self: UnsignedRightShiftAssignmentExpression, object: <any>) -> bool;
```
## UnsignedRightShiftAssignmentExpression::key\_eq

```rust
pub fn key_eq(self: UnsignedRightShiftAssignmentExpression, object: <any>) -> bool;
```
## UnsignedRightShiftAssignmentExpression::to\_set

```rust
pub fn to_set(self: UnsignedRightShiftAssignmentExpression) -> *UnsignedRightShiftAssignmentExpression;
```
