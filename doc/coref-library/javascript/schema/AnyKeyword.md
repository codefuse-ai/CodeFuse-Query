# AnyKeyword

Primary key: `id: int`

```rust
schema AnyKeyword {
  @primary id: int,
}
```
## AnyKeyword::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: AnyKeyword) -> Location;
```
## AnyKeyword::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: AnyKeyword) -> Symbol;
```
## AnyKeyword::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: AnyKeyword) -> *Decorator;
```
## AnyKeyword::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: AnyKeyword) -> string;
```
## AnyKeyword::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: AnyKeyword, i: int) -> Modifier;
```
## AnyKeyword::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: AnyKeyword) -> *Comment;
```
## AnyKeyword::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: AnyKeyword) -> *Node;
```
## AnyKeyword::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: AnyKeyword) -> *Node;
```
## AnyKeyword::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: AnyKeyword) -> Node;
```
## AnyKeyword::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: AnyKeyword) -> int;
```
## AnyKeyword::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: AnyKeyword) -> TopLevelDO;
```
## AnyKeyword::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: AnyKeyword, i: int) -> Decorator;
```
## AnyKeyword::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: AnyKeyword) -> int;
```
## AnyKeyword::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: AnyKeyword) -> *Modifier;
```
## AnyKeyword::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: AnyKeyword) -> int;
```
## AnyKeyword::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: AnyKeyword, i: int) -> Node;
```
## AnyKeyword::getStartLineNumber

```rust
pub fn getStartLineNumber(self: AnyKeyword) -> int;
```
## AnyKeyword::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: AnyKeyword) -> *FunctionLikeDeclaration;
```
## AnyKeyword::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: AnyKeyword, level: int) -> *Node;
```
## AnyKeyword::getEndLineNumber

```rust
pub fn getEndLineNumber(self: AnyKeyword) -> int;
```
## AnyKeyword::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: AnyKeyword) -> string;
```
## AnyKeyword::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: AnyKeyword, level: int) -> Node;
```
## AnyKeyword::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: AnyKeyword) -> File;
```
## AnyKeyword::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: AnyKeyword) -> *Comment;
```
## AnyKeyword::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: AnyKeyword) -> *Comment;
```
## AnyKeyword::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: AnyKeyword) -> Node;
```
## AnyKeyword::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: AnyKeyword) -> FunctionLikeDeclaration;
```
## AnyKeyword::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: AnyKeyword) -> int;
```
## AnyKeyword::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: AnyKeyword) -> int;
```
## AnyKeyword::getIndex

```rust
pub fn getIndex(self: AnyKeyword) -> int;
```
## AnyKeyword::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: AnyKeyword) -> *Node;
```
## AnyKeyword::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *AnyKeyword;
```
## AnyKeyword::is\<T\>

```rust
pub fn is<T>(self: AnyKeyword) -> bool;
```
## AnyKeyword::to\<T\>

```rust
pub fn to<T>(self: AnyKeyword) -> <any>;
```
## AnyKeyword::key\_neq

```rust
pub fn key_neq(self: AnyKeyword, object: <any>) -> bool;
```
## AnyKeyword::key\_eq

```rust
pub fn key_eq(self: AnyKeyword, object: <any>) -> bool;
```
## AnyKeyword::to\_set

```rust
pub fn to_set(self: AnyKeyword) -> *AnyKeyword;
```
