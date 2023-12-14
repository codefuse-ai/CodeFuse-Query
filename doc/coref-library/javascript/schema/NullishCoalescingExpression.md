# NullishCoalescingExpression

Primary key: `id: int`

```rust
schema NullishCoalescingExpression {
  @primary id: int,
}
```
## NullishCoalescingExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: NullishCoalescingExpression) -> Symbol;
```
## NullishCoalescingExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: NullishCoalescingExpression) -> *Decorator;
```
## NullishCoalescingExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: NullishCoalescingExpression) -> *Comment;
```
## NullishCoalescingExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: NullishCoalescingExpression) -> *Node;
```
## NullishCoalescingExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: NullishCoalescingExpression) -> int;
```
## NullishCoalescingExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: NullishCoalescingExpression) -> *Comment;
```
## NullishCoalescingExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: NullishCoalescingExpression) -> *Comment;
```
## NullishCoalescingExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: NullishCoalescingExpression) -> Node;
```
## NullishCoalescingExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: NullishCoalescingExpression) -> *Node;
```
## NullishCoalescingExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: NullishCoalescingExpression, i: int) -> Decorator;
```
## NullishCoalescingExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: NullishCoalescingExpression) -> TopLevelDO;
```
## NullishCoalescingExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: NullishCoalescingExpression, i: int) -> Node;
```
## NullishCoalescingExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: NullishCoalescingExpression) -> int;
```
## NullishCoalescingExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: NullishCoalescingExpression, level: int) -> *Node;
```
## NullishCoalescingExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: NullishCoalescingExpression) -> *FunctionLikeDeclaration;
```
## NullishCoalescingExpression::getLeftOperand

```rust
/**
     * Get the left operand of this binary expression.
     */
```
```rust
pub fn getLeftOperand(self: NullishCoalescingExpression) -> Expression;
```
## NullishCoalescingExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: NullishCoalescingExpression, level: int) -> Node;
```
## NullishCoalescingExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: NullishCoalescingExpression) -> File;
```
## NullishCoalescingExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: NullishCoalescingExpression) -> string;
```
## NullishCoalescingExpression::getAnOperand

```rust
pub fn getAnOperand(self: NullishCoalescingExpression) -> *Expression;
```
## NullishCoalescingExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: NullishCoalescingExpression, i: int) -> Modifier;
```
## NullishCoalescingExpression::getRightOperand

```rust
/**
     * Get the right operand of this binary expression.
     */
```
```rust
pub fn getRightOperand(self: NullishCoalescingExpression) -> Expression;
```
## NullishCoalescingExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: NullishCoalescingExpression) -> int;
```
## NullishCoalescingExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: NullishCoalescingExpression) -> string;
```
## NullishCoalescingExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *NullishCoalescingExpression;
```
## NullishCoalescingExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: NullishCoalescingExpression) -> Location;
```
## NullishCoalescingExpression::getOperator

```rust
/**
     * Get the operator of this binary expression.
     */
```
```rust
pub fn getOperator(self: NullishCoalescingExpression) -> BinaryOperator;
```
## NullishCoalescingExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: NullishCoalescingExpression) -> *Node;
```
## NullishCoalescingExpression::getLeft

```rust
/**
     * Get the left operand of this binary expression. An alias of `getLeftOperand`.
     */
```
```rust
pub fn getLeft(self: NullishCoalescingExpression) -> Expression;
```
## NullishCoalescingExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: NullishCoalescingExpression) -> int;
```
## NullishCoalescingExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: NullishCoalescingExpression) -> *Modifier;
```
## NullishCoalescingExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: NullishCoalescingExpression) -> int;
```
## NullishCoalescingExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: NullishCoalescingExpression) -> Node;
```
## NullishCoalescingExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: NullishCoalescingExpression) -> FunctionLikeDeclaration;
```
## NullishCoalescingExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: NullishCoalescingExpression) -> int;
```
## NullishCoalescingExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: NullishCoalescingExpression) -> int;
```
## NullishCoalescingExpression::getIndex

```rust
pub fn getIndex(self: NullishCoalescingExpression) -> int;
```
## NullishCoalescingExpression::getRight

```rust
/**
     * Get the right operand of this binary expression. An alias of `getRightOperand`
     */
```
```rust
pub fn getRight(self: NullishCoalescingExpression) -> Expression;
```
## NullishCoalescingExpression::is\<T\>

```rust
pub fn is<T>(self: NullishCoalescingExpression) -> bool;
```
## NullishCoalescingExpression::to\<T\>

```rust
pub fn to<T>(self: NullishCoalescingExpression) -> <any>;
```
## NullishCoalescingExpression::key\_neq

```rust
pub fn key_neq(self: NullishCoalescingExpression, object: <any>) -> bool;
```
## NullishCoalescingExpression::key\_eq

```rust
pub fn key_eq(self: NullishCoalescingExpression, object: <any>) -> bool;
```
## NullishCoalescingExpression::to\_set

```rust
pub fn to_set(self: NullishCoalescingExpression) -> *NullishCoalescingExpression;
```
