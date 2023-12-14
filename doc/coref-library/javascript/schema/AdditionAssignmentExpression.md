# AdditionAssignmentExpression

Primary key: `id: int`

```rust
schema AdditionAssignmentExpression {
  @primary id: int,
}
```
## AdditionAssignmentExpression::getRight

```rust
/**
     * Get the right operand of this binary expression. An alias of `getRightOperand`
     */
```
```rust
pub fn getRight(self: AdditionAssignmentExpression) -> Expression;
```
## AdditionAssignmentExpression::getIndex

```rust
pub fn getIndex(self: AdditionAssignmentExpression) -> int;
```
## AdditionAssignmentExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: AdditionAssignmentExpression) -> int;
```
## AdditionAssignmentExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: AdditionAssignmentExpression) -> int;
```
## AdditionAssignmentExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: AdditionAssignmentExpression) -> FunctionLikeDeclaration;
```
## AdditionAssignmentExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: AdditionAssignmentExpression) -> Node;
```
## AdditionAssignmentExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: AdditionAssignmentExpression) -> int;
```
## AdditionAssignmentExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: AdditionAssignmentExpression) -> *Modifier;
```
## AdditionAssignmentExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: AdditionAssignmentExpression) -> int;
```
## AdditionAssignmentExpression::getLeft

```rust
/**
     * Get the left operand of this binary expression. An alias of `getLeftOperand`.
     */
```
```rust
pub fn getLeft(self: AdditionAssignmentExpression) -> Expression;
```
## AdditionAssignmentExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: AdditionAssignmentExpression) -> *Node;
```
## AdditionAssignmentExpression::getOperator

```rust
/**
     * Get the operator of this binary expression.
     */
```
```rust
pub fn getOperator(self: AdditionAssignmentExpression) -> BinaryOperator;
```
## AdditionAssignmentExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: AdditionAssignmentExpression) -> Location;
```
## AdditionAssignmentExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: AdditionAssignmentExpression) -> string;
```
## AdditionAssignmentExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: AdditionAssignmentExpression) -> int;
```
## AdditionAssignmentExpression::getAnOperand

```rust
pub fn getAnOperand(self: AdditionAssignmentExpression) -> *Expression;
```
## AdditionAssignmentExpression::getRightOperand

```rust
/**
     * Get the right operand of this binary expression.
     */
```
```rust
pub fn getRightOperand(self: AdditionAssignmentExpression) -> Expression;
```
## AdditionAssignmentExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: AdditionAssignmentExpression, i: int) -> Modifier;
```
## AdditionAssignmentExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: AdditionAssignmentExpression) -> string;
```
## AdditionAssignmentExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: AdditionAssignmentExpression) -> File;
```
## AdditionAssignmentExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: AdditionAssignmentExpression, level: int) -> Node;
```
## AdditionAssignmentExpression::getLeftOperand

```rust
/**
     * Get the left operand of this binary expression.
     */
```
```rust
pub fn getLeftOperand(self: AdditionAssignmentExpression) -> Expression;
```
## AdditionAssignmentExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: AdditionAssignmentExpression, level: int) -> *Node;
```
## AdditionAssignmentExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: AdditionAssignmentExpression) -> *FunctionLikeDeclaration;
```
## AdditionAssignmentExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: AdditionAssignmentExpression) -> int;
```
## AdditionAssignmentExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: AdditionAssignmentExpression, i: int) -> Node;
```
## AdditionAssignmentExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: AdditionAssignmentExpression) -> TopLevelDO;
```
## AdditionAssignmentExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: AdditionAssignmentExpression, i: int) -> Decorator;
```
## AdditionAssignmentExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: AdditionAssignmentExpression) -> *Node;
```
## AdditionAssignmentExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: AdditionAssignmentExpression) -> *Comment;
```
## AdditionAssignmentExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: AdditionAssignmentExpression) -> Node;
```
## AdditionAssignmentExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: AdditionAssignmentExpression) -> *Node;
```
## AdditionAssignmentExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: AdditionAssignmentExpression) -> *Comment;
```
## AdditionAssignmentExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: AdditionAssignmentExpression) -> *Comment;
```
## AdditionAssignmentExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: AdditionAssignmentExpression) -> int;
```
## AdditionAssignmentExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: AdditionAssignmentExpression) -> *Decorator;
```
## AdditionAssignmentExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: AdditionAssignmentExpression) -> Symbol;
```
## AdditionAssignmentExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *AdditionAssignmentExpression;
```
## AdditionAssignmentExpression::is\<T\>

```rust
pub fn is<T>(self: AdditionAssignmentExpression) -> bool;
```
## AdditionAssignmentExpression::to\<T\>

```rust
pub fn to<T>(self: AdditionAssignmentExpression) -> <any>;
```
## AdditionAssignmentExpression::key\_neq

```rust
pub fn key_neq(self: AdditionAssignmentExpression, object: <any>) -> bool;
```
## AdditionAssignmentExpression::key\_eq

```rust
pub fn key_eq(self: AdditionAssignmentExpression, object: <any>) -> bool;
```
## AdditionAssignmentExpression::to\_set

```rust
pub fn to_set(self: AdditionAssignmentExpression) -> *AdditionAssignmentExpression;
```
