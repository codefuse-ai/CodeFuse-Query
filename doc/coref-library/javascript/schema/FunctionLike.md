# FunctionLike

Primary key: `id: int`

```rust
schema FunctionLike {
  @primary id: int,
}
```
## FunctionLike::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: FunctionLike) -> *Node;
```
## FunctionLike::getIndex

```rust
pub fn getIndex(self: FunctionLike) -> int;
```
## FunctionLike::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: FunctionLike) -> int;
```
## FunctionLike::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: FunctionLike) -> int;
```
## FunctionLike::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: FunctionLike) -> Node;
```
## FunctionLike::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: FunctionLike) -> FunctionLikeDeclaration;
```
## FunctionLike::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: FunctionLike) -> File;
```
## FunctionLike::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: FunctionLike, level: int) -> Node;
```
## FunctionLike::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: FunctionLike) -> string;
```
## FunctionLike::getEndLineNumber

```rust
pub fn getEndLineNumber(self: FunctionLike) -> int;
```
## FunctionLike::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: FunctionLike) -> *FunctionLikeDeclaration;
```
## FunctionLike::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: FunctionLike, level: int) -> *Node;
```
## FunctionLike::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: FunctionLike) -> int;
```
## FunctionLike::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: FunctionLike) -> *Modifier;
```
## FunctionLike::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: FunctionLike) -> int;
```
## FunctionLike::getStartLineNumber

```rust
pub fn getStartLineNumber(self: FunctionLike) -> int;
```
## FunctionLike::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: FunctionLike, i: int) -> Node;
```
## FunctionLike::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: FunctionLike, i: int) -> Decorator;
```
## FunctionLike::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: FunctionLike) -> TopLevelDO;
```
## FunctionLike::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: FunctionLike) -> int;
```
## FunctionLike::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: FunctionLike) -> *Comment;
```
## FunctionLike::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: FunctionLike) -> *Comment;
```
## FunctionLike::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: FunctionLike) -> Node;
```
## FunctionLike::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: FunctionLike) -> *Node;
```
## FunctionLike::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: FunctionLike) -> *Node;
```
## FunctionLike::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: FunctionLike) -> *Comment;
```
## FunctionLike::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: FunctionLike, i: int) -> Modifier;
```
## FunctionLike::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: FunctionLike) -> string;
```
## FunctionLike::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: FunctionLike) -> *Decorator;
```
## FunctionLike::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: FunctionLike) -> Symbol;
```
## FunctionLike::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: FunctionLike) -> Location;
```
## FunctionLike::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *FunctionLike;
```
## FunctionLike::is\<T\>

```rust
pub fn is<T>(self: FunctionLike) -> bool;
```
## FunctionLike::to\<T\>

```rust
pub fn to<T>(self: FunctionLike) -> <any>;
```
## FunctionLike::key\_neq

```rust
pub fn key_neq(self: FunctionLike, object: <any>) -> bool;
```
## FunctionLike::key\_eq

```rust
pub fn key_eq(self: FunctionLike, object: <any>) -> bool;
```
## FunctionLike::to\_set

```rust
pub fn to_set(self: FunctionLike) -> *FunctionLike;
```
