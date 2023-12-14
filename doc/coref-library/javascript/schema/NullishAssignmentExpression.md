# NullishAssignmentExpression

Primary key: `id: int`

```rust
schema NullishAssignmentExpression {
  @primary id: int,
}
```
## NullishAssignmentExpression::getRight

```rust
/**
     * Get the right operand of this binary expression. An alias of `getRightOperand`
     */
```
```rust
pub fn getRight(self: NullishAssignmentExpression) -> Expression;
```
## NullishAssignmentExpression::getIndex

```rust
pub fn getIndex(self: NullishAssignmentExpression) -> int;
```
## NullishAssignmentExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: NullishAssignmentExpression) -> int;
```
## NullishAssignmentExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: NullishAssignmentExpression) -> int;
```
## NullishAssignmentExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: NullishAssignmentExpression) -> FunctionLikeDeclaration;
```
## NullishAssignmentExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: NullishAssignmentExpression) -> Node;
```
## NullishAssignmentExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: NullishAssignmentExpression) -> int;
```
## NullishAssignmentExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: NullishAssignmentExpression) -> *Modifier;
```
## NullishAssignmentExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: NullishAssignmentExpression) -> int;
```
## NullishAssignmentExpression::getLeft

```rust
/**
     * Get the left operand of this binary expression. An alias of `getLeftOperand`.
     */
```
```rust
pub fn getLeft(self: NullishAssignmentExpression) -> Expression;
```
## NullishAssignmentExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: NullishAssignmentExpression) -> *Node;
```
## NullishAssignmentExpression::getOperator

```rust
/**
     * Get the operator of this binary expression.
     */
```
```rust
pub fn getOperator(self: NullishAssignmentExpression) -> BinaryOperator;
```
## NullishAssignmentExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: NullishAssignmentExpression) -> Location;
```
## NullishAssignmentExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: NullishAssignmentExpression) -> string;
```
## NullishAssignmentExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: NullishAssignmentExpression) -> int;
```
## NullishAssignmentExpression::getAnOperand

```rust
pub fn getAnOperand(self: NullishAssignmentExpression) -> *Expression;
```
## NullishAssignmentExpression::getRightOperand

```rust
/**
     * Get the right operand of this binary expression.
     */
```
```rust
pub fn getRightOperand(self: NullishAssignmentExpression) -> Expression;
```
## NullishAssignmentExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: NullishAssignmentExpression, i: int) -> Modifier;
```
## NullishAssignmentExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: NullishAssignmentExpression) -> string;
```
## NullishAssignmentExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: NullishAssignmentExpression) -> File;
```
## NullishAssignmentExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: NullishAssignmentExpression, level: int) -> Node;
```
## NullishAssignmentExpression::getLeftOperand

```rust
/**
     * Get the left operand of this binary expression.
     */
```
```rust
pub fn getLeftOperand(self: NullishAssignmentExpression) -> Expression;
```
## NullishAssignmentExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: NullishAssignmentExpression, level: int) -> *Node;
```
## NullishAssignmentExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: NullishAssignmentExpression) -> *FunctionLikeDeclaration;
```
## NullishAssignmentExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: NullishAssignmentExpression) -> int;
```
## NullishAssignmentExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: NullishAssignmentExpression, i: int) -> Node;
```
## NullishAssignmentExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: NullishAssignmentExpression) -> TopLevelDO;
```
## NullishAssignmentExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: NullishAssignmentExpression, i: int) -> Decorator;
```
## NullishAssignmentExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: NullishAssignmentExpression) -> *Node;
```
## NullishAssignmentExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: NullishAssignmentExpression) -> *Comment;
```
## NullishAssignmentExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: NullishAssignmentExpression) -> Node;
```
## NullishAssignmentExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: NullishAssignmentExpression) -> *Node;
```
## NullishAssignmentExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: NullishAssignmentExpression) -> *Comment;
```
## NullishAssignmentExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: NullishAssignmentExpression) -> *Comment;
```
## NullishAssignmentExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: NullishAssignmentExpression) -> int;
```
## NullishAssignmentExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: NullishAssignmentExpression) -> *Decorator;
```
## NullishAssignmentExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: NullishAssignmentExpression) -> Symbol;
```
## NullishAssignmentExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *NullishAssignmentExpression;
```
## NullishAssignmentExpression::is\<T\>

```rust
pub fn is<T>(self: NullishAssignmentExpression) -> bool;
```
## NullishAssignmentExpression::to\<T\>

```rust
pub fn to<T>(self: NullishAssignmentExpression) -> <any>;
```
## NullishAssignmentExpression::key\_neq

```rust
pub fn key_neq(self: NullishAssignmentExpression, object: <any>) -> bool;
```
## NullishAssignmentExpression::key\_eq

```rust
pub fn key_eq(self: NullishAssignmentExpression, object: <any>) -> bool;
```
## NullishAssignmentExpression::to\_set

```rust
pub fn to_set(self: NullishAssignmentExpression) -> *NullishAssignmentExpression;
```
