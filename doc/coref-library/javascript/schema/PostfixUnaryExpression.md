# PostfixUnaryExpression

Primary key: `id: int`

```rust
schema PostfixUnaryExpression {
  @primary id: int,
}
```
## PostfixUnaryExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: PostfixUnaryExpression) -> string;
```
## PostfixUnaryExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: PostfixUnaryExpression, i: int) -> Modifier;
```
## PostfixUnaryExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: PostfixUnaryExpression) -> *Decorator;
```
## PostfixUnaryExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: PostfixUnaryExpression) -> Symbol;
```
## PostfixUnaryExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: PostfixUnaryExpression) -> *Comment;
```
## PostfixUnaryExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: PostfixUnaryExpression) -> *Node;
```
## PostfixUnaryExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: PostfixUnaryExpression) -> *Node;
```
## PostfixUnaryExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: PostfixUnaryExpression) -> Node;
```
## PostfixUnaryExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: PostfixUnaryExpression) -> Node;
```
## PostfixUnaryExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: PostfixUnaryExpression) -> int;
```
## PostfixUnaryExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: PostfixUnaryExpression) -> TopLevelDO;
```
## PostfixUnaryExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: PostfixUnaryExpression, i: int) -> Decorator;
```
## PostfixUnaryExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: PostfixUnaryExpression) -> int;
```
## PostfixUnaryExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: PostfixUnaryExpression) -> *Modifier;
```
## PostfixUnaryExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: PostfixUnaryExpression) -> int;
```
## PostfixUnaryExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: PostfixUnaryExpression, i: int) -> Node;
```
## PostfixUnaryExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: PostfixUnaryExpression) -> int;
```
## PostfixUnaryExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: PostfixUnaryExpression, level: int) -> *Node;
```
## PostfixUnaryExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: PostfixUnaryExpression) -> *FunctionLikeDeclaration;
```
## PostfixUnaryExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: PostfixUnaryExpression) -> *Comment;
```
## PostfixUnaryExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: PostfixUnaryExpression) -> *Comment;
```
## PostfixUnaryExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: PostfixUnaryExpression) -> int;
```
## PostfixUnaryExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: PostfixUnaryExpression) -> FunctionLikeDeclaration;
```
## PostfixUnaryExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: PostfixUnaryExpression, level: int) -> Node;
```
## PostfixUnaryExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: PostfixUnaryExpression) -> File;
```
## PostfixUnaryExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *PostfixUnaryExpression;
```
## PostfixUnaryExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: PostfixUnaryExpression) -> int;
```
## PostfixUnaryExpression::getExpression

```rust
pub fn getExpression(self: PostfixUnaryExpression) -> Expression;
```
## PostfixUnaryExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: PostfixUnaryExpression) -> string;
```
## PostfixUnaryExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: PostfixUnaryExpression) -> Location;
```
## PostfixUnaryExpression::getOperator

```rust
pub fn getOperator(self: PostfixUnaryExpression) -> PostfixUnaryOperator;
```
## PostfixUnaryExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: PostfixUnaryExpression) -> *Node;
```
## PostfixUnaryExpression::getIndex

```rust
pub fn getIndex(self: PostfixUnaryExpression) -> int;
```
## PostfixUnaryExpression::getOperand

```rust
pub fn getOperand(self: PostfixUnaryExpression) -> LeftHandSideExpression;
```
## PostfixUnaryExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: PostfixUnaryExpression) -> int;
```
## PostfixUnaryExpression::is\<T\>

```rust
pub fn is<T>(self: PostfixUnaryExpression) -> bool;
```
## PostfixUnaryExpression::to\<T\>

```rust
pub fn to<T>(self: PostfixUnaryExpression) -> <any>;
```
## PostfixUnaryExpression::key\_neq

```rust
pub fn key_neq(self: PostfixUnaryExpression, object: <any>) -> bool;
```
## PostfixUnaryExpression::key\_eq

```rust
pub fn key_eq(self: PostfixUnaryExpression, object: <any>) -> bool;
```
## PostfixUnaryExpression::to\_set

```rust
pub fn to_set(self: PostfixUnaryExpression) -> *PostfixUnaryExpression;
```
