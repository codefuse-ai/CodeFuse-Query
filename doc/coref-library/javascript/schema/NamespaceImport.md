# NamespaceImport

Primary key: `id: int`

```rust
schema NamespaceImport {
  @primary id: int,
}
```
## NamespaceImport::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: NamespaceImport) -> *Node;
```
## NamespaceImport::getIndex

```rust
pub fn getIndex(self: NamespaceImport) -> int;
```
## NamespaceImport::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: NamespaceImport) -> int;
```
## NamespaceImport::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: NamespaceImport) -> int;
```
## NamespaceImport::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: NamespaceImport) -> Node;
```
## NamespaceImport::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: NamespaceImport) -> FunctionLikeDeclaration;
```
## NamespaceImport::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: NamespaceImport) -> File;
```
## NamespaceImport::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: NamespaceImport, level: int) -> Node;
```
## NamespaceImport::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: NamespaceImport) -> string;
```
## NamespaceImport::getEndLineNumber

```rust
pub fn getEndLineNumber(self: NamespaceImport) -> int;
```
## NamespaceImport::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: NamespaceImport) -> *FunctionLikeDeclaration;
```
## NamespaceImport::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: NamespaceImport, level: int) -> *Node;
```
## NamespaceImport::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: NamespaceImport) -> int;
```
## NamespaceImport::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: NamespaceImport) -> *Modifier;
```
## NamespaceImport::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: NamespaceImport) -> int;
```
## NamespaceImport::getStartLineNumber

```rust
pub fn getStartLineNumber(self: NamespaceImport) -> int;
```
## NamespaceImport::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: NamespaceImport, i: int) -> Node;
```
## NamespaceImport::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: NamespaceImport, i: int) -> Decorator;
```
## NamespaceImport::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: NamespaceImport) -> TopLevelDO;
```
## NamespaceImport::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: NamespaceImport) -> int;
```
## NamespaceImport::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: NamespaceImport) -> *Comment;
```
## NamespaceImport::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: NamespaceImport) -> *Comment;
```
## NamespaceImport::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: NamespaceImport) -> Node;
```
## NamespaceImport::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: NamespaceImport) -> *Node;
```
## NamespaceImport::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: NamespaceImport) -> *Node;
```
## NamespaceImport::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: NamespaceImport) -> *Comment;
```
## NamespaceImport::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: NamespaceImport, i: int) -> Modifier;
```
## NamespaceImport::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: NamespaceImport) -> string;
```
## NamespaceImport::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: NamespaceImport) -> *Decorator;
```
## NamespaceImport::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: NamespaceImport) -> Symbol;
```
## NamespaceImport::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: NamespaceImport) -> Location;
```
## NamespaceImport::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *NamespaceImport;
```
## NamespaceImport::is\<T\>

```rust
pub fn is<T>(self: NamespaceImport) -> bool;
```
## NamespaceImport::to\<T\>

```rust
pub fn to<T>(self: NamespaceImport) -> <any>;
```
## NamespaceImport::key\_neq

```rust
pub fn key_neq(self: NamespaceImport, object: <any>) -> bool;
```
## NamespaceImport::key\_eq

```rust
pub fn key_eq(self: NamespaceImport, object: <any>) -> bool;
```
## NamespaceImport::to\_set

```rust
pub fn to_set(self: NamespaceImport) -> *NamespaceImport;
```
