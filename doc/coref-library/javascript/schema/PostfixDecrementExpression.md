# PostfixDecrementExpression

Primary key: `id: int`

```rust
schema PostfixDecrementExpression {
  @primary id: int,
}
```
## PostfixDecrementExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: PostfixDecrementExpression) -> int;
```
## PostfixDecrementExpression::getOperand

```rust
pub fn getOperand(self: PostfixDecrementExpression) -> LeftHandSideExpression;
```
## PostfixDecrementExpression::getIndex

```rust
pub fn getIndex(self: PostfixDecrementExpression) -> int;
```
## PostfixDecrementExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: PostfixDecrementExpression) -> *Node;
```
## PostfixDecrementExpression::getOperator

```rust
pub fn getOperator(self: PostfixDecrementExpression) -> PostfixUnaryOperator;
```
## PostfixDecrementExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: PostfixDecrementExpression) -> Location;
```
## PostfixDecrementExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: PostfixDecrementExpression) -> string;
```
## PostfixDecrementExpression::getExpression

```rust
pub fn getExpression(self: PostfixDecrementExpression) -> Expression;
```
## PostfixDecrementExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: PostfixDecrementExpression) -> int;
```
## PostfixDecrementExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: PostfixDecrementExpression) -> File;
```
## PostfixDecrementExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: PostfixDecrementExpression, level: int) -> Node;
```
## PostfixDecrementExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: PostfixDecrementExpression) -> FunctionLikeDeclaration;
```
## PostfixDecrementExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: PostfixDecrementExpression) -> *Comment;
```
## PostfixDecrementExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: PostfixDecrementExpression) -> *Comment;
```
## PostfixDecrementExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: PostfixDecrementExpression) -> *FunctionLikeDeclaration;
```
## PostfixDecrementExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: PostfixDecrementExpression, level: int) -> *Node;
```
## PostfixDecrementExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: PostfixDecrementExpression) -> int;
```
## PostfixDecrementExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: PostfixDecrementExpression) -> *Modifier;
```
## PostfixDecrementExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: PostfixDecrementExpression) -> int;
```
## PostfixDecrementExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: PostfixDecrementExpression) -> int;
```
## PostfixDecrementExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: PostfixDecrementExpression, i: int) -> Node;
```
## PostfixDecrementExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: PostfixDecrementExpression) -> TopLevelDO;
```
## PostfixDecrementExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: PostfixDecrementExpression, i: int) -> Decorator;
```
## PostfixDecrementExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: PostfixDecrementExpression) -> int;
```
## PostfixDecrementExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: PostfixDecrementExpression) -> *Node;
```
## PostfixDecrementExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: PostfixDecrementExpression) -> Node;
```
## PostfixDecrementExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: PostfixDecrementExpression) -> Node;
```
## PostfixDecrementExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: PostfixDecrementExpression) -> int;
```
## PostfixDecrementExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: PostfixDecrementExpression) -> *Node;
```
## PostfixDecrementExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: PostfixDecrementExpression) -> *Comment;
```
## PostfixDecrementExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: PostfixDecrementExpression) -> Symbol;
```
## PostfixDecrementExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: PostfixDecrementExpression) -> *Decorator;
```
## PostfixDecrementExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *PostfixDecrementExpression;
```
## PostfixDecrementExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: PostfixDecrementExpression, i: int) -> Modifier;
```
## PostfixDecrementExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: PostfixDecrementExpression) -> string;
```
## PostfixDecrementExpression::is\<T\>

```rust
pub fn is<T>(self: PostfixDecrementExpression) -> bool;
```
## PostfixDecrementExpression::to\<T\>

```rust
pub fn to<T>(self: PostfixDecrementExpression) -> <any>;
```
## PostfixDecrementExpression::key\_neq

```rust
pub fn key_neq(self: PostfixDecrementExpression, object: <any>) -> bool;
```
## PostfixDecrementExpression::key\_eq

```rust
pub fn key_eq(self: PostfixDecrementExpression, object: <any>) -> bool;
```
## PostfixDecrementExpression::to\_set

```rust
pub fn to_set(self: PostfixDecrementExpression) -> *PostfixDecrementExpression;
```
