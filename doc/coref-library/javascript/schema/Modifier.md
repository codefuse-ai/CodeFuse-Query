# Modifier

Primary key: `id: int`

```rust
schema Modifier {
  @primary id: int,
}
```
## Modifier::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: Modifier) -> Location;
```
## Modifier::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: Modifier) -> Symbol;
```
## Modifier::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: Modifier) -> *Decorator;
```
## Modifier::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: Modifier) -> string;
```
## Modifier::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: Modifier, i: int) -> Modifier;
```
## Modifier::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: Modifier) -> *Comment;
```
## Modifier::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: Modifier) -> *Node;
```
## Modifier::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: Modifier) -> *Node;
```
## Modifier::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: Modifier) -> Node;
```
## Modifier::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: Modifier) -> int;
```
## Modifier::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: Modifier) -> TopLevelDO;
```
## Modifier::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: Modifier, i: int) -> Decorator;
```
## Modifier::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: Modifier) -> int;
```
## Modifier::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: Modifier) -> *Modifier;
```
## Modifier::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: Modifier) -> int;
```
## Modifier::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: Modifier, i: int) -> Node;
```
## Modifier::getStartLineNumber

```rust
pub fn getStartLineNumber(self: Modifier) -> int;
```
## Modifier::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: Modifier) -> *FunctionLikeDeclaration;
```
## Modifier::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: Modifier, level: int) -> *Node;
```
## Modifier::getEndLineNumber

```rust
pub fn getEndLineNumber(self: Modifier) -> int;
```
## Modifier::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: Modifier) -> string;
```
## Modifier::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: Modifier, level: int) -> Node;
```
## Modifier::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: Modifier) -> File;
```
## Modifier::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: Modifier) -> *Comment;
```
## Modifier::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: Modifier) -> *Comment;
```
## Modifier::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: Modifier) -> Node;
```
## Modifier::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: Modifier) -> FunctionLikeDeclaration;
```
## Modifier::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: Modifier) -> int;
```
## Modifier::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: Modifier) -> int;
```
## Modifier::getIndex

```rust
pub fn getIndex(self: Modifier) -> int;
```
## Modifier::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: Modifier) -> *Node;
```
## Modifier::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *Modifier;
```
## Modifier::is\<T\>

```rust
pub fn is<T>(self: Modifier) -> bool;
```
## Modifier::to\<T\>

```rust
pub fn to<T>(self: Modifier) -> <any>;
```
## Modifier::key\_neq

```rust
pub fn key_neq(self: Modifier, object: <any>) -> bool;
```
## Modifier::key\_eq

```rust
pub fn key_eq(self: Modifier, object: <any>) -> bool;
```
## Modifier::to\_set

```rust
pub fn to_set(self: Modifier) -> *Modifier;
```
