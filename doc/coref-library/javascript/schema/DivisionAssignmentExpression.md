# DivisionAssignmentExpression

Primary key: `id: int`

```rust
schema DivisionAssignmentExpression {
  @primary id: int,
}
```
## DivisionAssignmentExpression::getRight

```rust
/**
     * Get the right operand of this binary expression. An alias of `getRightOperand`
     */
```
```rust
pub fn getRight(self: DivisionAssignmentExpression) -> Expression;
```
## DivisionAssignmentExpression::getIndex

```rust
pub fn getIndex(self: DivisionAssignmentExpression) -> int;
```
## DivisionAssignmentExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: DivisionAssignmentExpression) -> int;
```
## DivisionAssignmentExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: DivisionAssignmentExpression) -> int;
```
## DivisionAssignmentExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: DivisionAssignmentExpression) -> FunctionLikeDeclaration;
```
## DivisionAssignmentExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: DivisionAssignmentExpression) -> Node;
```
## DivisionAssignmentExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: DivisionAssignmentExpression) -> int;
```
## DivisionAssignmentExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: DivisionAssignmentExpression) -> *Modifier;
```
## DivisionAssignmentExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: DivisionAssignmentExpression) -> int;
```
## DivisionAssignmentExpression::getLeft

```rust
/**
     * Get the left operand of this binary expression. An alias of `getLeftOperand`.
     */
```
```rust
pub fn getLeft(self: DivisionAssignmentExpression) -> Expression;
```
## DivisionAssignmentExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: DivisionAssignmentExpression) -> *Node;
```
## DivisionAssignmentExpression::getOperator

```rust
/**
     * Get the operator of this binary expression.
     */
```
```rust
pub fn getOperator(self: DivisionAssignmentExpression) -> BinaryOperator;
```
## DivisionAssignmentExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: DivisionAssignmentExpression) -> Location;
```
## DivisionAssignmentExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: DivisionAssignmentExpression) -> string;
```
## DivisionAssignmentExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: DivisionAssignmentExpression) -> int;
```
## DivisionAssignmentExpression::getAnOperand

```rust
pub fn getAnOperand(self: DivisionAssignmentExpression) -> *Expression;
```
## DivisionAssignmentExpression::getRightOperand

```rust
/**
     * Get the right operand of this binary expression.
     */
```
```rust
pub fn getRightOperand(self: DivisionAssignmentExpression) -> Expression;
```
## DivisionAssignmentExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: DivisionAssignmentExpression, i: int) -> Modifier;
```
## DivisionAssignmentExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: DivisionAssignmentExpression) -> string;
```
## DivisionAssignmentExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: DivisionAssignmentExpression) -> File;
```
## DivisionAssignmentExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: DivisionAssignmentExpression, level: int) -> Node;
```
## DivisionAssignmentExpression::getLeftOperand

```rust
/**
     * Get the left operand of this binary expression.
     */
```
```rust
pub fn getLeftOperand(self: DivisionAssignmentExpression) -> Expression;
```
## DivisionAssignmentExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: DivisionAssignmentExpression, level: int) -> *Node;
```
## DivisionAssignmentExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: DivisionAssignmentExpression) -> *FunctionLikeDeclaration;
```
## DivisionAssignmentExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: DivisionAssignmentExpression) -> int;
```
## DivisionAssignmentExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: DivisionAssignmentExpression, i: int) -> Node;
```
## DivisionAssignmentExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: DivisionAssignmentExpression) -> TopLevelDO;
```
## DivisionAssignmentExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: DivisionAssignmentExpression, i: int) -> Decorator;
```
## DivisionAssignmentExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: DivisionAssignmentExpression) -> *Node;
```
## DivisionAssignmentExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: DivisionAssignmentExpression) -> *Comment;
```
## DivisionAssignmentExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: DivisionAssignmentExpression) -> Node;
```
## DivisionAssignmentExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: DivisionAssignmentExpression) -> *Node;
```
## DivisionAssignmentExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: DivisionAssignmentExpression) -> *Comment;
```
## DivisionAssignmentExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: DivisionAssignmentExpression) -> *Comment;
```
## DivisionAssignmentExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: DivisionAssignmentExpression) -> int;
```
## DivisionAssignmentExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: DivisionAssignmentExpression) -> *Decorator;
```
## DivisionAssignmentExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: DivisionAssignmentExpression) -> Symbol;
```
## DivisionAssignmentExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *DivisionAssignmentExpression;
```
## DivisionAssignmentExpression::is\<T\>

```rust
pub fn is<T>(self: DivisionAssignmentExpression) -> bool;
```
## DivisionAssignmentExpression::to\<T\>

```rust
pub fn to<T>(self: DivisionAssignmentExpression) -> <any>;
```
## DivisionAssignmentExpression::key\_neq

```rust
pub fn key_neq(self: DivisionAssignmentExpression, object: <any>) -> bool;
```
## DivisionAssignmentExpression::key\_eq

```rust
pub fn key_eq(self: DivisionAssignmentExpression, object: <any>) -> bool;
```
## DivisionAssignmentExpression::to\_set

```rust
pub fn to_set(self: DivisionAssignmentExpression) -> *DivisionAssignmentExpression;
```
