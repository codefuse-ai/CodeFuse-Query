# PostfixIncrementExpression

Primary key: `id: int`

```rust
schema PostfixIncrementExpression {
  @primary id: int,
}
```
## PostfixIncrementExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: PostfixIncrementExpression) -> int;
```
## PostfixIncrementExpression::getOperand

```rust
pub fn getOperand(self: PostfixIncrementExpression) -> LeftHandSideExpression;
```
## PostfixIncrementExpression::getIndex

```rust
pub fn getIndex(self: PostfixIncrementExpression) -> int;
```
## PostfixIncrementExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: PostfixIncrementExpression) -> *Node;
```
## PostfixIncrementExpression::getOperator

```rust
pub fn getOperator(self: PostfixIncrementExpression) -> PostfixUnaryOperator;
```
## PostfixIncrementExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: PostfixIncrementExpression) -> Location;
```
## PostfixIncrementExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: PostfixIncrementExpression) -> string;
```
## PostfixIncrementExpression::getExpression

```rust
pub fn getExpression(self: PostfixIncrementExpression) -> Expression;
```
## PostfixIncrementExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: PostfixIncrementExpression) -> int;
```
## PostfixIncrementExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: PostfixIncrementExpression) -> File;
```
## PostfixIncrementExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: PostfixIncrementExpression, level: int) -> Node;
```
## PostfixIncrementExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: PostfixIncrementExpression) -> FunctionLikeDeclaration;
```
## PostfixIncrementExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: PostfixIncrementExpression) -> *Comment;
```
## PostfixIncrementExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: PostfixIncrementExpression) -> *Comment;
```
## PostfixIncrementExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: PostfixIncrementExpression) -> *FunctionLikeDeclaration;
```
## PostfixIncrementExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: PostfixIncrementExpression, level: int) -> *Node;
```
## PostfixIncrementExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: PostfixIncrementExpression) -> int;
```
## PostfixIncrementExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: PostfixIncrementExpression) -> *Modifier;
```
## PostfixIncrementExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: PostfixIncrementExpression) -> int;
```
## PostfixIncrementExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: PostfixIncrementExpression) -> int;
```
## PostfixIncrementExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: PostfixIncrementExpression, i: int) -> Node;
```
## PostfixIncrementExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: PostfixIncrementExpression) -> TopLevelDO;
```
## PostfixIncrementExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: PostfixIncrementExpression, i: int) -> Decorator;
```
## PostfixIncrementExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: PostfixIncrementExpression) -> int;
```
## PostfixIncrementExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: PostfixIncrementExpression) -> *Node;
```
## PostfixIncrementExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: PostfixIncrementExpression) -> Node;
```
## PostfixIncrementExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: PostfixIncrementExpression) -> Node;
```
## PostfixIncrementExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: PostfixIncrementExpression) -> int;
```
## PostfixIncrementExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: PostfixIncrementExpression) -> *Node;
```
## PostfixIncrementExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: PostfixIncrementExpression) -> *Comment;
```
## PostfixIncrementExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: PostfixIncrementExpression) -> Symbol;
```
## PostfixIncrementExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: PostfixIncrementExpression) -> *Decorator;
```
## PostfixIncrementExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *PostfixIncrementExpression;
```
## PostfixIncrementExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: PostfixIncrementExpression, i: int) -> Modifier;
```
## PostfixIncrementExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: PostfixIncrementExpression) -> string;
```
## PostfixIncrementExpression::is\<T\>

```rust
pub fn is<T>(self: PostfixIncrementExpression) -> bool;
```
## PostfixIncrementExpression::to\<T\>

```rust
pub fn to<T>(self: PostfixIncrementExpression) -> <any>;
```
## PostfixIncrementExpression::key\_neq

```rust
pub fn key_neq(self: PostfixIncrementExpression, object: <any>) -> bool;
```
## PostfixIncrementExpression::key\_eq

```rust
pub fn key_eq(self: PostfixIncrementExpression, object: <any>) -> bool;
```
## PostfixIncrementExpression::to\_set

```rust
pub fn to_set(self: PostfixIncrementExpression) -> *PostfixIncrementExpression;
```
