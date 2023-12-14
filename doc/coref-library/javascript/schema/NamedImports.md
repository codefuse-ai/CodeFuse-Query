# NamedImports

Primary key: `id: int`

```rust
schema NamedImports {
  @primary id: int,
}
```
## NamedImports::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: NamedImports) -> *Node;
```
## NamedImports::getIndex

```rust
pub fn getIndex(self: NamedImports) -> int;
```
## NamedImports::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: NamedImports) -> int;
```
## NamedImports::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: NamedImports) -> int;
```
## NamedImports::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: NamedImports) -> Node;
```
## NamedImports::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: NamedImports) -> FunctionLikeDeclaration;
```
## NamedImports::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: NamedImports) -> File;
```
## NamedImports::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: NamedImports, level: int) -> Node;
```
## NamedImports::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: NamedImports) -> string;
```
## NamedImports::getEndLineNumber

```rust
pub fn getEndLineNumber(self: NamedImports) -> int;
```
## NamedImports::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: NamedImports) -> *FunctionLikeDeclaration;
```
## NamedImports::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: NamedImports, level: int) -> *Node;
```
## NamedImports::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: NamedImports) -> int;
```
## NamedImports::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: NamedImports) -> *Modifier;
```
## NamedImports::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: NamedImports) -> int;
```
## NamedImports::getStartLineNumber

```rust
pub fn getStartLineNumber(self: NamedImports) -> int;
```
## NamedImports::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: NamedImports, i: int) -> Node;
```
## NamedImports::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: NamedImports, i: int) -> Decorator;
```
## NamedImports::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: NamedImports) -> TopLevelDO;
```
## NamedImports::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: NamedImports) -> int;
```
## NamedImports::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: NamedImports) -> *Comment;
```
## NamedImports::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: NamedImports) -> *Comment;
```
## NamedImports::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: NamedImports) -> Node;
```
## NamedImports::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: NamedImports) -> *Node;
```
## NamedImports::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: NamedImports) -> *Node;
```
## NamedImports::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: NamedImports) -> *Comment;
```
## NamedImports::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: NamedImports, i: int) -> Modifier;
```
## NamedImports::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: NamedImports) -> string;
```
## NamedImports::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: NamedImports) -> *Decorator;
```
## NamedImports::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: NamedImports) -> Symbol;
```
## NamedImports::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: NamedImports) -> Location;
```
## NamedImports::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *NamedImports;
```
## NamedImports::is\<T\>

```rust
pub fn is<T>(self: NamedImports) -> bool;
```
## NamedImports::to\<T\>

```rust
pub fn to<T>(self: NamedImports) -> <any>;
```
## NamedImports::key\_neq

```rust
pub fn key_neq(self: NamedImports, object: <any>) -> bool;
```
## NamedImports::key\_eq

```rust
pub fn key_eq(self: NamedImports, object: <any>) -> bool;
```
## NamedImports::to\_set

```rust
pub fn to_set(self: NamedImports) -> *NamedImports;
```
