# ShiftExpression

Primary key: `id: int`

```rust
schema ShiftExpression {
  @primary id: int,
}
```
## ShiftExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: ShiftExpression) -> int;
```
## ShiftExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ShiftExpression) -> int;
```
## ShiftExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: ShiftExpression) -> Node;
```
## ShiftExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: ShiftExpression) -> FunctionLikeDeclaration;
```
## ShiftExpression::getLeft

```rust
/**
     * Get the left operand of this binary expression. An alias of `getLeftOperand`.
     */
```
```rust
pub fn getLeft(self: ShiftExpression) -> Expression;
```
## ShiftExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: ShiftExpression) -> *Node;
```
## ShiftExpression::getOperator

```rust
/**
     * Get the operator of this binary expression.
     */
```
```rust
pub fn getOperator(self: ShiftExpression) -> BinaryOperator;
```
## ShiftExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: ShiftExpression) -> Location;
```
## ShiftExpression::getRight

```rust
/**
     * Get the right operand of this binary expression. An alias of `getRightOperand`
     */
```
```rust
pub fn getRight(self: ShiftExpression) -> Expression;
```
## ShiftExpression::getIndex

```rust
pub fn getIndex(self: ShiftExpression) -> int;
```
## ShiftExpression::getAnOperand

```rust
pub fn getAnOperand(self: ShiftExpression) -> *Expression;
```
## ShiftExpression::getRightOperand

```rust
/**
     * Get the right operand of this binary expression.
     */
```
```rust
pub fn getRightOperand(self: ShiftExpression) -> Expression;
```
## ShiftExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: ShiftExpression, i: int) -> Modifier;
```
## ShiftExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: ShiftExpression) -> string;
```
## ShiftExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: ShiftExpression) -> string;
```
## ShiftExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ShiftExpression) -> int;
```
## ShiftExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: ShiftExpression) -> File;
```
## ShiftExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: ShiftExpression, level: int) -> Node;
```
## ShiftExpression::getLeftOperand

```rust
/**
     * Get the left operand of this binary expression.
     */
```
```rust
pub fn getLeftOperand(self: ShiftExpression) -> Expression;
```
## ShiftExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ShiftExpression) -> *FunctionLikeDeclaration;
```
## ShiftExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: ShiftExpression, level: int) -> *Node;
```
## ShiftExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: ShiftExpression) -> int;
```
## ShiftExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: ShiftExpression) -> *Modifier;
```
## ShiftExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ShiftExpression) -> int;
```
## ShiftExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ShiftExpression) -> int;
```
## ShiftExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: ShiftExpression, i: int) -> Node;
```
## ShiftExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: ShiftExpression) -> TopLevelDO;
```
## ShiftExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: ShiftExpression, i: int) -> Decorator;
```
## ShiftExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: ShiftExpression) -> *Node;
```
## ShiftExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: ShiftExpression) -> Node;
```
## ShiftExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: ShiftExpression) -> *Comment;
```
## ShiftExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: ShiftExpression) -> *Comment;
```
## ShiftExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: ShiftExpression) -> int;
```
## ShiftExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: ShiftExpression) -> *Node;
```
## ShiftExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: ShiftExpression) -> *Comment;
```
## ShiftExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: ShiftExpression) -> *Decorator;
```
## ShiftExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: ShiftExpression) -> Symbol;
```
## ShiftExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *ShiftExpression;
```
## ShiftExpression::is\<T\>

```rust
pub fn is<T>(self: ShiftExpression) -> bool;
```
## ShiftExpression::to\<T\>

```rust
pub fn to<T>(self: ShiftExpression) -> <any>;
```
## ShiftExpression::key\_neq

```rust
pub fn key_neq(self: ShiftExpression, object: <any>) -> bool;
```
## ShiftExpression::key\_eq

```rust
pub fn key_eq(self: ShiftExpression, object: <any>) -> bool;
```
## ShiftExpression::to\_set

```rust
pub fn to_set(self: ShiftExpression) -> *ShiftExpression;
```
