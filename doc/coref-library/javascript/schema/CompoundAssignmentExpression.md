# CompoundAssignmentExpression

Primary key: `id: int`

```rust
schema CompoundAssignmentExpression {
  @primary id: int,
}
```
## CompoundAssignmentExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: CompoundAssignmentExpression) -> Symbol;
```
## CompoundAssignmentExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: CompoundAssignmentExpression) -> *Decorator;
```
## CompoundAssignmentExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: CompoundAssignmentExpression) -> *Comment;
```
## CompoundAssignmentExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: CompoundAssignmentExpression) -> *Node;
```
## CompoundAssignmentExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: CompoundAssignmentExpression) -> int;
```
## CompoundAssignmentExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: CompoundAssignmentExpression) -> *Comment;
```
## CompoundAssignmentExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: CompoundAssignmentExpression) -> *Comment;
```
## CompoundAssignmentExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: CompoundAssignmentExpression) -> Node;
```
## CompoundAssignmentExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: CompoundAssignmentExpression) -> *Node;
```
## CompoundAssignmentExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: CompoundAssignmentExpression, i: int) -> Decorator;
```
## CompoundAssignmentExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: CompoundAssignmentExpression) -> TopLevelDO;
```
## CompoundAssignmentExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: CompoundAssignmentExpression, i: int) -> Node;
```
## CompoundAssignmentExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: CompoundAssignmentExpression) -> int;
```
## CompoundAssignmentExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: CompoundAssignmentExpression, level: int) -> *Node;
```
## CompoundAssignmentExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: CompoundAssignmentExpression) -> *FunctionLikeDeclaration;
```
## CompoundAssignmentExpression::getLeftOperand

```rust
/**
     * Get the left operand of this binary expression.
     */
```
```rust
pub fn getLeftOperand(self: CompoundAssignmentExpression) -> Expression;
```
## CompoundAssignmentExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: CompoundAssignmentExpression, level: int) -> Node;
```
## CompoundAssignmentExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: CompoundAssignmentExpression) -> File;
```
## CompoundAssignmentExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: CompoundAssignmentExpression) -> string;
```
## CompoundAssignmentExpression::getAnOperand

```rust
pub fn getAnOperand(self: CompoundAssignmentExpression) -> *Expression;
```
## CompoundAssignmentExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: CompoundAssignmentExpression, i: int) -> Modifier;
```
## CompoundAssignmentExpression::getRightOperand

```rust
/**
     * Get the right operand of this binary expression.
     */
```
```rust
pub fn getRightOperand(self: CompoundAssignmentExpression) -> Expression;
```
## CompoundAssignmentExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: CompoundAssignmentExpression) -> int;
```
## CompoundAssignmentExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: CompoundAssignmentExpression) -> string;
```
## CompoundAssignmentExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *CompoundAssignmentExpression;
```
## CompoundAssignmentExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: CompoundAssignmentExpression) -> Location;
```
## CompoundAssignmentExpression::getOperator

```rust
/**
     * Get the operator of this binary expression.
     */
```
```rust
pub fn getOperator(self: CompoundAssignmentExpression) -> BinaryOperator;
```
## CompoundAssignmentExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: CompoundAssignmentExpression) -> *Node;
```
## CompoundAssignmentExpression::getLeft

```rust
/**
     * Get the left operand of this binary expression. An alias of `getLeftOperand`.
     */
```
```rust
pub fn getLeft(self: CompoundAssignmentExpression) -> Expression;
```
## CompoundAssignmentExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: CompoundAssignmentExpression) -> int;
```
## CompoundAssignmentExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: CompoundAssignmentExpression) -> *Modifier;
```
## CompoundAssignmentExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: CompoundAssignmentExpression) -> int;
```
## CompoundAssignmentExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: CompoundAssignmentExpression) -> Node;
```
## CompoundAssignmentExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: CompoundAssignmentExpression) -> FunctionLikeDeclaration;
```
## CompoundAssignmentExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: CompoundAssignmentExpression) -> int;
```
## CompoundAssignmentExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: CompoundAssignmentExpression) -> int;
```
## CompoundAssignmentExpression::getIndex

```rust
pub fn getIndex(self: CompoundAssignmentExpression) -> int;
```
## CompoundAssignmentExpression::getRight

```rust
/**
     * Get the right operand of this binary expression. An alias of `getRightOperand`
     */
```
```rust
pub fn getRight(self: CompoundAssignmentExpression) -> Expression;
```
## CompoundAssignmentExpression::is\<T\>

```rust
pub fn is<T>(self: CompoundAssignmentExpression) -> bool;
```
## CompoundAssignmentExpression::to\<T\>

```rust
pub fn to<T>(self: CompoundAssignmentExpression) -> <any>;
```
## CompoundAssignmentExpression::key\_neq

```rust
pub fn key_neq(self: CompoundAssignmentExpression, object: <any>) -> bool;
```
## CompoundAssignmentExpression::key\_eq

```rust
pub fn key_eq(self: CompoundAssignmentExpression, object: <any>) -> bool;
```
## CompoundAssignmentExpression::to\_set

```rust
pub fn to_set(self: CompoundAssignmentExpression) -> *CompoundAssignmentExpression;
```
