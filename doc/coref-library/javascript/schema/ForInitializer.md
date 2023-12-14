# ForInitializer

Primary key: `id: int`

```rust
schema ForInitializer {
  @primary id: int,
}
```
## ForInitializer::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: ForInitializer) -> *Node;
```
## ForInitializer::getIndex

```rust
pub fn getIndex(self: ForInitializer) -> int;
```
## ForInitializer::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: ForInitializer) -> int;
```
## ForInitializer::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ForInitializer) -> int;
```
## ForInitializer::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: ForInitializer) -> Node;
```
## ForInitializer::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: ForInitializer) -> FunctionLikeDeclaration;
```
## ForInitializer::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: ForInitializer) -> File;
```
## ForInitializer::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: ForInitializer, level: int) -> Node;
```
## ForInitializer::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: ForInitializer) -> string;
```
## ForInitializer::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ForInitializer) -> int;
```
## ForInitializer::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ForInitializer) -> *FunctionLikeDeclaration;
```
## ForInitializer::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: ForInitializer, level: int) -> *Node;
```
## ForInitializer::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: ForInitializer) -> int;
```
## ForInitializer::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: ForInitializer) -> *Modifier;
```
## ForInitializer::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ForInitializer) -> int;
```
## ForInitializer::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ForInitializer) -> int;
```
## ForInitializer::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: ForInitializer, i: int) -> Node;
```
## ForInitializer::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: ForInitializer, i: int) -> Decorator;
```
## ForInitializer::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: ForInitializer) -> TopLevelDO;
```
## ForInitializer::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: ForInitializer) -> int;
```
## ForInitializer::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: ForInitializer) -> *Comment;
```
## ForInitializer::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: ForInitializer) -> *Comment;
```
## ForInitializer::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: ForInitializer) -> Node;
```
## ForInitializer::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: ForInitializer) -> *Node;
```
## ForInitializer::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: ForInitializer) -> *Node;
```
## ForInitializer::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: ForInitializer) -> *Comment;
```
## ForInitializer::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: ForInitializer, i: int) -> Modifier;
```
## ForInitializer::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: ForInitializer) -> string;
```
## ForInitializer::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: ForInitializer) -> *Decorator;
```
## ForInitializer::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: ForInitializer) -> Symbol;
```
## ForInitializer::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: ForInitializer) -> Location;
```
## ForInitializer::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *ForInitializer;
```
## ForInitializer::is\<T\>

```rust
pub fn is<T>(self: ForInitializer) -> bool;
```
## ForInitializer::to\<T\>

```rust
pub fn to<T>(self: ForInitializer) -> <any>;
```
## ForInitializer::key\_neq

```rust
pub fn key_neq(self: ForInitializer, object: <any>) -> bool;
```
## ForInitializer::key\_eq

```rust
pub fn key_eq(self: ForInitializer, object: <any>) -> bool;
```
## ForInitializer::to\_set

```rust
pub fn to_set(self: ForInitializer) -> *ForInitializer;
```
