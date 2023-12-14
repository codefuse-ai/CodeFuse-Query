# MultiplicationAssignmentExpression

Primary key: `id: int`

```rust
schema MultiplicationAssignmentExpression {
  @primary id: int,
}
```
## MultiplicationAssignmentExpression::getRight

```rust
/**
     * Get the right operand of this binary expression. An alias of `getRightOperand`
     */
```
```rust
pub fn getRight(self: MultiplicationAssignmentExpression) -> Expression;
```
## MultiplicationAssignmentExpression::getIndex

```rust
pub fn getIndex(self: MultiplicationAssignmentExpression) -> int;
```
## MultiplicationAssignmentExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: MultiplicationAssignmentExpression) -> int;
```
## MultiplicationAssignmentExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: MultiplicationAssignmentExpression) -> int;
```
## MultiplicationAssignmentExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: MultiplicationAssignmentExpression) -> FunctionLikeDeclaration;
```
## MultiplicationAssignmentExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: MultiplicationAssignmentExpression) -> Node;
```
## MultiplicationAssignmentExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: MultiplicationAssignmentExpression) -> int;
```
## MultiplicationAssignmentExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: MultiplicationAssignmentExpression) -> *Modifier;
```
## MultiplicationAssignmentExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: MultiplicationAssignmentExpression) -> int;
```
## MultiplicationAssignmentExpression::getLeft

```rust
/**
     * Get the left operand of this binary expression. An alias of `getLeftOperand`.
     */
```
```rust
pub fn getLeft(self: MultiplicationAssignmentExpression) -> Expression;
```
## MultiplicationAssignmentExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: MultiplicationAssignmentExpression) -> *Node;
```
## MultiplicationAssignmentExpression::getOperator

```rust
/**
     * Get the operator of this binary expression.
     */
```
```rust
pub fn getOperator(self: MultiplicationAssignmentExpression) -> BinaryOperator;
```
## MultiplicationAssignmentExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: MultiplicationAssignmentExpression) -> Location;
```
## MultiplicationAssignmentExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: MultiplicationAssignmentExpression) -> string;
```
## MultiplicationAssignmentExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: MultiplicationAssignmentExpression) -> int;
```
## MultiplicationAssignmentExpression::getAnOperand

```rust
pub fn getAnOperand(self: MultiplicationAssignmentExpression) -> *Expression;
```
## MultiplicationAssignmentExpression::getRightOperand

```rust
/**
     * Get the right operand of this binary expression.
     */
```
```rust
pub fn getRightOperand(self: MultiplicationAssignmentExpression) -> Expression;
```
## MultiplicationAssignmentExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: MultiplicationAssignmentExpression, i: int) -> Modifier;
```
## MultiplicationAssignmentExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: MultiplicationAssignmentExpression) -> string;
```
## MultiplicationAssignmentExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: MultiplicationAssignmentExpression) -> File;
```
## MultiplicationAssignmentExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: MultiplicationAssignmentExpression, level: int) -> Node;
```
## MultiplicationAssignmentExpression::getLeftOperand

```rust
/**
     * Get the left operand of this binary expression.
     */
```
```rust
pub fn getLeftOperand(self: MultiplicationAssignmentExpression) -> Expression;
```
## MultiplicationAssignmentExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: MultiplicationAssignmentExpression, level: int) -> *Node;
```
## MultiplicationAssignmentExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: MultiplicationAssignmentExpression) -> *FunctionLikeDeclaration;
```
## MultiplicationAssignmentExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: MultiplicationAssignmentExpression) -> int;
```
## MultiplicationAssignmentExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: MultiplicationAssignmentExpression, i: int) -> Node;
```
## MultiplicationAssignmentExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: MultiplicationAssignmentExpression) -> TopLevelDO;
```
## MultiplicationAssignmentExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: MultiplicationAssignmentExpression, i: int) -> Decorator;
```
## MultiplicationAssignmentExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: MultiplicationAssignmentExpression) -> *Node;
```
## MultiplicationAssignmentExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: MultiplicationAssignmentExpression) -> *Comment;
```
## MultiplicationAssignmentExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: MultiplicationAssignmentExpression) -> Node;
```
## MultiplicationAssignmentExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: MultiplicationAssignmentExpression) -> *Node;
```
## MultiplicationAssignmentExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: MultiplicationAssignmentExpression) -> *Comment;
```
## MultiplicationAssignmentExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: MultiplicationAssignmentExpression) -> *Comment;
```
## MultiplicationAssignmentExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: MultiplicationAssignmentExpression) -> int;
```
## MultiplicationAssignmentExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: MultiplicationAssignmentExpression) -> *Decorator;
```
## MultiplicationAssignmentExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: MultiplicationAssignmentExpression) -> Symbol;
```
## MultiplicationAssignmentExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *MultiplicationAssignmentExpression;
```
## MultiplicationAssignmentExpression::is\<T\>

```rust
pub fn is<T>(self: MultiplicationAssignmentExpression) -> bool;
```
## MultiplicationAssignmentExpression::to\<T\>

```rust
pub fn to<T>(self: MultiplicationAssignmentExpression) -> <any>;
```
## MultiplicationAssignmentExpression::key\_neq

```rust
pub fn key_neq(self: MultiplicationAssignmentExpression, object: <any>) -> bool;
```
## MultiplicationAssignmentExpression::key\_eq

```rust
pub fn key_eq(self: MultiplicationAssignmentExpression, object: <any>) -> bool;
```
## MultiplicationAssignmentExpression::to\_set

```rust
pub fn to_set(self: MultiplicationAssignmentExpression) -> *MultiplicationAssignmentExpression;
```
