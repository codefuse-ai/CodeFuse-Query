# RemainderAssignmentExpression

Primary key: `id: int`

```rust
schema RemainderAssignmentExpression {
  @primary id: int,
}
```
## RemainderAssignmentExpression::getRight

```rust
/**
     * Get the right operand of this binary expression. An alias of `getRightOperand`
     */
```
```rust
pub fn getRight(self: RemainderAssignmentExpression) -> Expression;
```
## RemainderAssignmentExpression::getIndex

```rust
pub fn getIndex(self: RemainderAssignmentExpression) -> int;
```
## RemainderAssignmentExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: RemainderAssignmentExpression) -> int;
```
## RemainderAssignmentExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: RemainderAssignmentExpression) -> int;
```
## RemainderAssignmentExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: RemainderAssignmentExpression) -> FunctionLikeDeclaration;
```
## RemainderAssignmentExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: RemainderAssignmentExpression) -> Node;
```
## RemainderAssignmentExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: RemainderAssignmentExpression) -> int;
```
## RemainderAssignmentExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: RemainderAssignmentExpression) -> *Modifier;
```
## RemainderAssignmentExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: RemainderAssignmentExpression) -> int;
```
## RemainderAssignmentExpression::getLeft

```rust
/**
     * Get the left operand of this binary expression. An alias of `getLeftOperand`.
     */
```
```rust
pub fn getLeft(self: RemainderAssignmentExpression) -> Expression;
```
## RemainderAssignmentExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: RemainderAssignmentExpression) -> *Node;
```
## RemainderAssignmentExpression::getOperator

```rust
/**
     * Get the operator of this binary expression.
     */
```
```rust
pub fn getOperator(self: RemainderAssignmentExpression) -> BinaryOperator;
```
## RemainderAssignmentExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: RemainderAssignmentExpression) -> Location;
```
## RemainderAssignmentExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: RemainderAssignmentExpression) -> string;
```
## RemainderAssignmentExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: RemainderAssignmentExpression) -> int;
```
## RemainderAssignmentExpression::getAnOperand

```rust
pub fn getAnOperand(self: RemainderAssignmentExpression) -> *Expression;
```
## RemainderAssignmentExpression::getRightOperand

```rust
/**
     * Get the right operand of this binary expression.
     */
```
```rust
pub fn getRightOperand(self: RemainderAssignmentExpression) -> Expression;
```
## RemainderAssignmentExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: RemainderAssignmentExpression, i: int) -> Modifier;
```
## RemainderAssignmentExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: RemainderAssignmentExpression) -> string;
```
## RemainderAssignmentExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: RemainderAssignmentExpression) -> File;
```
## RemainderAssignmentExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: RemainderAssignmentExpression, level: int) -> Node;
```
## RemainderAssignmentExpression::getLeftOperand

```rust
/**
     * Get the left operand of this binary expression.
     */
```
```rust
pub fn getLeftOperand(self: RemainderAssignmentExpression) -> Expression;
```
## RemainderAssignmentExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: RemainderAssignmentExpression, level: int) -> *Node;
```
## RemainderAssignmentExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: RemainderAssignmentExpression) -> *FunctionLikeDeclaration;
```
## RemainderAssignmentExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: RemainderAssignmentExpression) -> int;
```
## RemainderAssignmentExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: RemainderAssignmentExpression, i: int) -> Node;
```
## RemainderAssignmentExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: RemainderAssignmentExpression) -> TopLevelDO;
```
## RemainderAssignmentExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: RemainderAssignmentExpression, i: int) -> Decorator;
```
## RemainderAssignmentExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: RemainderAssignmentExpression) -> *Node;
```
## RemainderAssignmentExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: RemainderAssignmentExpression) -> *Comment;
```
## RemainderAssignmentExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: RemainderAssignmentExpression) -> Node;
```
## RemainderAssignmentExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: RemainderAssignmentExpression) -> *Node;
```
## RemainderAssignmentExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: RemainderAssignmentExpression) -> *Comment;
```
## RemainderAssignmentExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: RemainderAssignmentExpression) -> *Comment;
```
## RemainderAssignmentExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: RemainderAssignmentExpression) -> int;
```
## RemainderAssignmentExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: RemainderAssignmentExpression) -> *Decorator;
```
## RemainderAssignmentExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: RemainderAssignmentExpression) -> Symbol;
```
## RemainderAssignmentExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *RemainderAssignmentExpression;
```
## RemainderAssignmentExpression::is\<T\>

```rust
pub fn is<T>(self: RemainderAssignmentExpression) -> bool;
```
## RemainderAssignmentExpression::to\<T\>

```rust
pub fn to<T>(self: RemainderAssignmentExpression) -> <any>;
```
## RemainderAssignmentExpression::key\_neq

```rust
pub fn key_neq(self: RemainderAssignmentExpression, object: <any>) -> bool;
```
## RemainderAssignmentExpression::key\_eq

```rust
pub fn key_eq(self: RemainderAssignmentExpression, object: <any>) -> bool;
```
## RemainderAssignmentExpression::to\_set

```rust
pub fn to_set(self: RemainderAssignmentExpression) -> *RemainderAssignmentExpression;
```
