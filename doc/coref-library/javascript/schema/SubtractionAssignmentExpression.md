# SubtractionAssignmentExpression

Primary key: `id: int`

```rust
schema SubtractionAssignmentExpression {
  @primary id: int,
}
```
## SubtractionAssignmentExpression::getRight

```rust
/**
     * Get the right operand of this binary expression. An alias of `getRightOperand`
     */
```
```rust
pub fn getRight(self: SubtractionAssignmentExpression) -> Expression;
```
## SubtractionAssignmentExpression::getIndex

```rust
pub fn getIndex(self: SubtractionAssignmentExpression) -> int;
```
## SubtractionAssignmentExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: SubtractionAssignmentExpression) -> int;
```
## SubtractionAssignmentExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: SubtractionAssignmentExpression) -> int;
```
## SubtractionAssignmentExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: SubtractionAssignmentExpression) -> FunctionLikeDeclaration;
```
## SubtractionAssignmentExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: SubtractionAssignmentExpression) -> Node;
```
## SubtractionAssignmentExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: SubtractionAssignmentExpression) -> int;
```
## SubtractionAssignmentExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: SubtractionAssignmentExpression) -> *Modifier;
```
## SubtractionAssignmentExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: SubtractionAssignmentExpression) -> int;
```
## SubtractionAssignmentExpression::getLeft

```rust
/**
     * Get the left operand of this binary expression. An alias of `getLeftOperand`.
     */
```
```rust
pub fn getLeft(self: SubtractionAssignmentExpression) -> Expression;
```
## SubtractionAssignmentExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: SubtractionAssignmentExpression) -> *Node;
```
## SubtractionAssignmentExpression::getOperator

```rust
/**
     * Get the operator of this binary expression.
     */
```
```rust
pub fn getOperator(self: SubtractionAssignmentExpression) -> BinaryOperator;
```
## SubtractionAssignmentExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: SubtractionAssignmentExpression) -> Location;
```
## SubtractionAssignmentExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: SubtractionAssignmentExpression) -> string;
```
## SubtractionAssignmentExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: SubtractionAssignmentExpression) -> int;
```
## SubtractionAssignmentExpression::getAnOperand

```rust
pub fn getAnOperand(self: SubtractionAssignmentExpression) -> *Expression;
```
## SubtractionAssignmentExpression::getRightOperand

```rust
/**
     * Get the right operand of this binary expression.
     */
```
```rust
pub fn getRightOperand(self: SubtractionAssignmentExpression) -> Expression;
```
## SubtractionAssignmentExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: SubtractionAssignmentExpression, i: int) -> Modifier;
```
## SubtractionAssignmentExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: SubtractionAssignmentExpression) -> string;
```
## SubtractionAssignmentExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: SubtractionAssignmentExpression) -> File;
```
## SubtractionAssignmentExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: SubtractionAssignmentExpression, level: int) -> Node;
```
## SubtractionAssignmentExpression::getLeftOperand

```rust
/**
     * Get the left operand of this binary expression.
     */
```
```rust
pub fn getLeftOperand(self: SubtractionAssignmentExpression) -> Expression;
```
## SubtractionAssignmentExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: SubtractionAssignmentExpression, level: int) -> *Node;
```
## SubtractionAssignmentExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: SubtractionAssignmentExpression) -> *FunctionLikeDeclaration;
```
## SubtractionAssignmentExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: SubtractionAssignmentExpression) -> int;
```
## SubtractionAssignmentExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: SubtractionAssignmentExpression, i: int) -> Node;
```
## SubtractionAssignmentExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: SubtractionAssignmentExpression) -> TopLevelDO;
```
## SubtractionAssignmentExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: SubtractionAssignmentExpression, i: int) -> Decorator;
```
## SubtractionAssignmentExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: SubtractionAssignmentExpression) -> *Node;
```
## SubtractionAssignmentExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: SubtractionAssignmentExpression) -> *Comment;
```
## SubtractionAssignmentExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: SubtractionAssignmentExpression) -> Node;
```
## SubtractionAssignmentExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: SubtractionAssignmentExpression) -> *Node;
```
## SubtractionAssignmentExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: SubtractionAssignmentExpression) -> *Comment;
```
## SubtractionAssignmentExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: SubtractionAssignmentExpression) -> *Comment;
```
## SubtractionAssignmentExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: SubtractionAssignmentExpression) -> int;
```
## SubtractionAssignmentExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: SubtractionAssignmentExpression) -> *Decorator;
```
## SubtractionAssignmentExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: SubtractionAssignmentExpression) -> Symbol;
```
## SubtractionAssignmentExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *SubtractionAssignmentExpression;
```
## SubtractionAssignmentExpression::is\<T\>

```rust
pub fn is<T>(self: SubtractionAssignmentExpression) -> bool;
```
## SubtractionAssignmentExpression::to\<T\>

```rust
pub fn to<T>(self: SubtractionAssignmentExpression) -> <any>;
```
## SubtractionAssignmentExpression::key\_neq

```rust
pub fn key_neq(self: SubtractionAssignmentExpression, object: <any>) -> bool;
```
## SubtractionAssignmentExpression::key\_eq

```rust
pub fn key_eq(self: SubtractionAssignmentExpression, object: <any>) -> bool;
```
## SubtractionAssignmentExpression::to\_set

```rust
pub fn to_set(self: SubtractionAssignmentExpression) -> *SubtractionAssignmentExpression;
```
