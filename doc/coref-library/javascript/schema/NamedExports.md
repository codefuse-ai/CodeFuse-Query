# NamedExports

Primary key: `id: int`

```rust
schema NamedExports {
  @primary id: int,
}
```
## NamedExports::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: NamedExports) -> *Node;
```
## NamedExports::getIndex

```rust
pub fn getIndex(self: NamedExports) -> int;
```
## NamedExports::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: NamedExports) -> int;
```
## NamedExports::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: NamedExports) -> int;
```
## NamedExports::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: NamedExports) -> Node;
```
## NamedExports::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: NamedExports) -> FunctionLikeDeclaration;
```
## NamedExports::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: NamedExports) -> File;
```
## NamedExports::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: NamedExports, level: int) -> Node;
```
## NamedExports::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: NamedExports) -> string;
```
## NamedExports::getEndLineNumber

```rust
pub fn getEndLineNumber(self: NamedExports) -> int;
```
## NamedExports::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: NamedExports) -> *FunctionLikeDeclaration;
```
## NamedExports::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: NamedExports, level: int) -> *Node;
```
## NamedExports::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: NamedExports) -> int;
```
## NamedExports::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: NamedExports) -> *Modifier;
```
## NamedExports::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: NamedExports) -> int;
```
## NamedExports::getStartLineNumber

```rust
pub fn getStartLineNumber(self: NamedExports) -> int;
```
## NamedExports::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: NamedExports, i: int) -> Node;
```
## NamedExports::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: NamedExports, i: int) -> Decorator;
```
## NamedExports::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: NamedExports) -> TopLevelDO;
```
## NamedExports::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: NamedExports) -> int;
```
## NamedExports::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: NamedExports) -> *Comment;
```
## NamedExports::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: NamedExports) -> *Comment;
```
## NamedExports::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: NamedExports) -> Node;
```
## NamedExports::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: NamedExports) -> *Node;
```
## NamedExports::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: NamedExports) -> *Node;
```
## NamedExports::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: NamedExports) -> *Comment;
```
## NamedExports::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: NamedExports, i: int) -> Modifier;
```
## NamedExports::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: NamedExports) -> string;
```
## NamedExports::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: NamedExports) -> *Decorator;
```
## NamedExports::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: NamedExports) -> Symbol;
```
## NamedExports::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: NamedExports) -> Location;
```
## NamedExports::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *NamedExports;
```
## NamedExports::is\<T\>

```rust
pub fn is<T>(self: NamedExports) -> bool;
```
## NamedExports::to\<T\>

```rust
pub fn to<T>(self: NamedExports) -> <any>;
```
## NamedExports::key\_neq

```rust
pub fn key_neq(self: NamedExports, object: <any>) -> bool;
```
## NamedExports::key\_eq

```rust
pub fn key_eq(self: NamedExports, object: <any>) -> bool;
```
## NamedExports::to\_set

```rust
pub fn to_set(self: NamedExports) -> *NamedExports;
```
