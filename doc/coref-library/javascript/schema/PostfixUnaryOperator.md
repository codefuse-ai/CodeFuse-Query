# PostfixUnaryOperator

Primary key: `id: int`

```rust
schema PostfixUnaryOperator {
  @primary id: int,
}
```
## PostfixUnaryOperator::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: PostfixUnaryOperator) -> Location;
```
## PostfixUnaryOperator::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: PostfixUnaryOperator) -> Symbol;
```
## PostfixUnaryOperator::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: PostfixUnaryOperator) -> *Decorator;
```
## PostfixUnaryOperator::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: PostfixUnaryOperator) -> string;
```
## PostfixUnaryOperator::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: PostfixUnaryOperator, i: int) -> Modifier;
```
## PostfixUnaryOperator::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: PostfixUnaryOperator) -> *Comment;
```
## PostfixUnaryOperator::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: PostfixUnaryOperator) -> *Node;
```
## PostfixUnaryOperator::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: PostfixUnaryOperator) -> *Node;
```
## PostfixUnaryOperator::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: PostfixUnaryOperator) -> Node;
```
## PostfixUnaryOperator::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: PostfixUnaryOperator) -> int;
```
## PostfixUnaryOperator::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: PostfixUnaryOperator) -> TopLevelDO;
```
## PostfixUnaryOperator::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: PostfixUnaryOperator, i: int) -> Decorator;
```
## PostfixUnaryOperator::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: PostfixUnaryOperator) -> int;
```
## PostfixUnaryOperator::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: PostfixUnaryOperator) -> *Modifier;
```
## PostfixUnaryOperator::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: PostfixUnaryOperator) -> int;
```
## PostfixUnaryOperator::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: PostfixUnaryOperator, i: int) -> Node;
```
## PostfixUnaryOperator::getStartLineNumber

```rust
pub fn getStartLineNumber(self: PostfixUnaryOperator) -> int;
```
## PostfixUnaryOperator::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: PostfixUnaryOperator) -> *FunctionLikeDeclaration;
```
## PostfixUnaryOperator::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: PostfixUnaryOperator, level: int) -> *Node;
```
## PostfixUnaryOperator::getEndLineNumber

```rust
pub fn getEndLineNumber(self: PostfixUnaryOperator) -> int;
```
## PostfixUnaryOperator::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: PostfixUnaryOperator) -> string;
```
## PostfixUnaryOperator::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: PostfixUnaryOperator, level: int) -> Node;
```
## PostfixUnaryOperator::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: PostfixUnaryOperator) -> File;
```
## PostfixUnaryOperator::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: PostfixUnaryOperator) -> *Comment;
```
## PostfixUnaryOperator::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: PostfixUnaryOperator) -> *Comment;
```
## PostfixUnaryOperator::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: PostfixUnaryOperator) -> Node;
```
## PostfixUnaryOperator::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: PostfixUnaryOperator) -> FunctionLikeDeclaration;
```
## PostfixUnaryOperator::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: PostfixUnaryOperator) -> int;
```
## PostfixUnaryOperator::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: PostfixUnaryOperator) -> int;
```
## PostfixUnaryOperator::getIndex

```rust
pub fn getIndex(self: PostfixUnaryOperator) -> int;
```
## PostfixUnaryOperator::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: PostfixUnaryOperator) -> *Node;
```
## PostfixUnaryOperator::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *PostfixUnaryOperator;
```
## PostfixUnaryOperator::is\<T\>

```rust
pub fn is<T>(self: PostfixUnaryOperator) -> bool;
```
## PostfixUnaryOperator::to\<T\>

```rust
pub fn to<T>(self: PostfixUnaryOperator) -> <any>;
```
## PostfixUnaryOperator::key\_neq

```rust
pub fn key_neq(self: PostfixUnaryOperator, object: <any>) -> bool;
```
## PostfixUnaryOperator::key\_eq

```rust
pub fn key_eq(self: PostfixUnaryOperator, object: <any>) -> bool;
```
## PostfixUnaryOperator::to\_set

```rust
pub fn to_set(self: PostfixUnaryOperator) -> *PostfixUnaryOperator;
```
