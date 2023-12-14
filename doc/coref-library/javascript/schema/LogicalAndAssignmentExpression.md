# LogicalAndAssignmentExpression

Primary key: `id: int`

```rust
schema LogicalAndAssignmentExpression {
  @primary id: int,
}
```
## LogicalAndAssignmentExpression::getRight

```rust
/**
     * Get the right operand of this binary expression. An alias of `getRightOperand`
     */
```
```rust
pub fn getRight(self: LogicalAndAssignmentExpression) -> Expression;
```
## LogicalAndAssignmentExpression::getIndex

```rust
pub fn getIndex(self: LogicalAndAssignmentExpression) -> int;
```
## LogicalAndAssignmentExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: LogicalAndAssignmentExpression) -> int;
```
## LogicalAndAssignmentExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: LogicalAndAssignmentExpression) -> int;
```
## LogicalAndAssignmentExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: LogicalAndAssignmentExpression) -> FunctionLikeDeclaration;
```
## LogicalAndAssignmentExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: LogicalAndAssignmentExpression) -> Node;
```
## LogicalAndAssignmentExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: LogicalAndAssignmentExpression) -> int;
```
## LogicalAndAssignmentExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: LogicalAndAssignmentExpression) -> *Modifier;
```
## LogicalAndAssignmentExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: LogicalAndAssignmentExpression) -> int;
```
## LogicalAndAssignmentExpression::getLeft

```rust
/**
     * Get the left operand of this binary expression. An alias of `getLeftOperand`.
     */
```
```rust
pub fn getLeft(self: LogicalAndAssignmentExpression) -> Expression;
```
## LogicalAndAssignmentExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: LogicalAndAssignmentExpression) -> *Node;
```
## LogicalAndAssignmentExpression::getOperator

```rust
/**
     * Get the operator of this binary expression.
     */
```
```rust
pub fn getOperator(self: LogicalAndAssignmentExpression) -> BinaryOperator;
```
## LogicalAndAssignmentExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: LogicalAndAssignmentExpression) -> Location;
```
## LogicalAndAssignmentExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: LogicalAndAssignmentExpression) -> string;
```
## LogicalAndAssignmentExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: LogicalAndAssignmentExpression) -> int;
```
## LogicalAndAssignmentExpression::getAnOperand

```rust
pub fn getAnOperand(self: LogicalAndAssignmentExpression) -> *Expression;
```
## LogicalAndAssignmentExpression::getRightOperand

```rust
/**
     * Get the right operand of this binary expression.
     */
```
```rust
pub fn getRightOperand(self: LogicalAndAssignmentExpression) -> Expression;
```
## LogicalAndAssignmentExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: LogicalAndAssignmentExpression, i: int) -> Modifier;
```
## LogicalAndAssignmentExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: LogicalAndAssignmentExpression) -> string;
```
## LogicalAndAssignmentExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: LogicalAndAssignmentExpression) -> File;
```
## LogicalAndAssignmentExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: LogicalAndAssignmentExpression, level: int) -> Node;
```
## LogicalAndAssignmentExpression::getLeftOperand

```rust
/**
     * Get the left operand of this binary expression.
     */
```
```rust
pub fn getLeftOperand(self: LogicalAndAssignmentExpression) -> Expression;
```
## LogicalAndAssignmentExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: LogicalAndAssignmentExpression, level: int) -> *Node;
```
## LogicalAndAssignmentExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: LogicalAndAssignmentExpression) -> *FunctionLikeDeclaration;
```
## LogicalAndAssignmentExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: LogicalAndAssignmentExpression) -> int;
```
## LogicalAndAssignmentExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: LogicalAndAssignmentExpression, i: int) -> Node;
```
## LogicalAndAssignmentExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: LogicalAndAssignmentExpression) -> TopLevelDO;
```
## LogicalAndAssignmentExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: LogicalAndAssignmentExpression, i: int) -> Decorator;
```
## LogicalAndAssignmentExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: LogicalAndAssignmentExpression) -> *Node;
```
## LogicalAndAssignmentExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: LogicalAndAssignmentExpression) -> *Comment;
```
## LogicalAndAssignmentExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: LogicalAndAssignmentExpression) -> Node;
```
## LogicalAndAssignmentExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: LogicalAndAssignmentExpression) -> *Node;
```
## LogicalAndAssignmentExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: LogicalAndAssignmentExpression) -> *Comment;
```
## LogicalAndAssignmentExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: LogicalAndAssignmentExpression) -> *Comment;
```
## LogicalAndAssignmentExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: LogicalAndAssignmentExpression) -> int;
```
## LogicalAndAssignmentExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: LogicalAndAssignmentExpression) -> *Decorator;
```
## LogicalAndAssignmentExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: LogicalAndAssignmentExpression) -> Symbol;
```
## LogicalAndAssignmentExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *LogicalAndAssignmentExpression;
```
## LogicalAndAssignmentExpression::is\<T\>

```rust
pub fn is<T>(self: LogicalAndAssignmentExpression) -> bool;
```
## LogicalAndAssignmentExpression::to\<T\>

```rust
pub fn to<T>(self: LogicalAndAssignmentExpression) -> <any>;
```
## LogicalAndAssignmentExpression::key\_neq

```rust
pub fn key_neq(self: LogicalAndAssignmentExpression, object: <any>) -> bool;
```
## LogicalAndAssignmentExpression::key\_eq

```rust
pub fn key_eq(self: LogicalAndAssignmentExpression, object: <any>) -> bool;
```
## LogicalAndAssignmentExpression::to\_set

```rust
pub fn to_set(self: LogicalAndAssignmentExpression) -> *LogicalAndAssignmentExpression;
```
