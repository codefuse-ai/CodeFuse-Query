# NamespaceExport

Primary key: `id: int`

```rust
schema NamespaceExport {
  @primary id: int,
}
```
## NamespaceExport::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: NamespaceExport) -> *Node;
```
## NamespaceExport::getIndex

```rust
pub fn getIndex(self: NamespaceExport) -> int;
```
## NamespaceExport::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: NamespaceExport) -> int;
```
## NamespaceExport::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: NamespaceExport) -> int;
```
## NamespaceExport::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: NamespaceExport) -> Node;
```
## NamespaceExport::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: NamespaceExport) -> FunctionLikeDeclaration;
```
## NamespaceExport::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: NamespaceExport) -> File;
```
## NamespaceExport::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: NamespaceExport, level: int) -> Node;
```
## NamespaceExport::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: NamespaceExport) -> string;
```
## NamespaceExport::getEndLineNumber

```rust
pub fn getEndLineNumber(self: NamespaceExport) -> int;
```
## NamespaceExport::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: NamespaceExport) -> *FunctionLikeDeclaration;
```
## NamespaceExport::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: NamespaceExport, level: int) -> *Node;
```
## NamespaceExport::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: NamespaceExport) -> int;
```
## NamespaceExport::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: NamespaceExport) -> *Modifier;
```
## NamespaceExport::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: NamespaceExport) -> int;
```
## NamespaceExport::getStartLineNumber

```rust
pub fn getStartLineNumber(self: NamespaceExport) -> int;
```
## NamespaceExport::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: NamespaceExport, i: int) -> Node;
```
## NamespaceExport::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: NamespaceExport, i: int) -> Decorator;
```
## NamespaceExport::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: NamespaceExport) -> TopLevelDO;
```
## NamespaceExport::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: NamespaceExport) -> int;
```
## NamespaceExport::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: NamespaceExport) -> *Comment;
```
## NamespaceExport::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: NamespaceExport) -> *Comment;
```
## NamespaceExport::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: NamespaceExport) -> Node;
```
## NamespaceExport::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: NamespaceExport) -> *Node;
```
## NamespaceExport::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: NamespaceExport) -> *Node;
```
## NamespaceExport::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: NamespaceExport) -> *Comment;
```
## NamespaceExport::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: NamespaceExport, i: int) -> Modifier;
```
## NamespaceExport::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: NamespaceExport) -> string;
```
## NamespaceExport::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: NamespaceExport) -> *Decorator;
```
## NamespaceExport::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: NamespaceExport) -> Symbol;
```
## NamespaceExport::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: NamespaceExport) -> Location;
```
## NamespaceExport::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *NamespaceExport;
```
## NamespaceExport::is\<T\>

```rust
pub fn is<T>(self: NamespaceExport) -> bool;
```
## NamespaceExport::to\<T\>

```rust
pub fn to<T>(self: NamespaceExport) -> <any>;
```
## NamespaceExport::key\_neq

```rust
pub fn key_neq(self: NamespaceExport, object: <any>) -> bool;
```
## NamespaceExport::key\_eq

```rust
pub fn key_eq(self: NamespaceExport, object: <any>) -> bool;
```
## NamespaceExport::to\_set

```rust
pub fn to_set(self: NamespaceExport) -> *NamespaceExport;
```
