# NamespaceExportDeclaration

Primary key: `id: int`

```rust
schema NamespaceExportDeclaration {
  @primary id: int,
}
```
## NamespaceExportDeclaration::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: NamespaceExportDeclaration) -> *Node;
```
## NamespaceExportDeclaration::getIndex

```rust
pub fn getIndex(self: NamespaceExportDeclaration) -> int;
```
## NamespaceExportDeclaration::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: NamespaceExportDeclaration) -> int;
```
## NamespaceExportDeclaration::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: NamespaceExportDeclaration) -> int;
```
## NamespaceExportDeclaration::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: NamespaceExportDeclaration) -> FunctionLikeDeclaration;
```
## NamespaceExportDeclaration::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: NamespaceExportDeclaration) -> Node;
```
## NamespaceExportDeclaration::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: NamespaceExportDeclaration) -> *Comment;
```
## NamespaceExportDeclaration::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: NamespaceExportDeclaration) -> *Comment;
```
## NamespaceExportDeclaration::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: NamespaceExportDeclaration) -> File;
```
## NamespaceExportDeclaration::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: NamespaceExportDeclaration, level: int) -> Node;
```
## NamespaceExportDeclaration::getEndLineNumber

```rust
pub fn getEndLineNumber(self: NamespaceExportDeclaration) -> int;
```
## NamespaceExportDeclaration::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: NamespaceExportDeclaration) -> string;
```
## NamespaceExportDeclaration::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: NamespaceExportDeclaration) -> *FunctionLikeDeclaration;
```
## NamespaceExportDeclaration::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: NamespaceExportDeclaration, level: int) -> *Node;
```
## NamespaceExportDeclaration::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: NamespaceExportDeclaration) -> int;
```
## NamespaceExportDeclaration::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: NamespaceExportDeclaration) -> *Modifier;
```
## NamespaceExportDeclaration::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: NamespaceExportDeclaration) -> int;
```
## NamespaceExportDeclaration::getStartLineNumber

```rust
pub fn getStartLineNumber(self: NamespaceExportDeclaration) -> int;
```
## NamespaceExportDeclaration::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: NamespaceExportDeclaration, i: int) -> Node;
```
## NamespaceExportDeclaration::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: NamespaceExportDeclaration, i: int) -> Decorator;
```
## NamespaceExportDeclaration::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: NamespaceExportDeclaration) -> TopLevelDO;
```
## NamespaceExportDeclaration::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: NamespaceExportDeclaration) -> int;
```
## NamespaceExportDeclaration::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: NamespaceExportDeclaration) -> Node;
```
## NamespaceExportDeclaration::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: NamespaceExportDeclaration) -> *Node;
```
## NamespaceExportDeclaration::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: NamespaceExportDeclaration) -> *Node;
```
## NamespaceExportDeclaration::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: NamespaceExportDeclaration) -> *Comment;
```
## NamespaceExportDeclaration::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: NamespaceExportDeclaration) -> Symbol;
```
## NamespaceExportDeclaration::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: NamespaceExportDeclaration) -> *Decorator;
```
## NamespaceExportDeclaration::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: NamespaceExportDeclaration, i: int) -> Modifier;
```
## NamespaceExportDeclaration::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: NamespaceExportDeclaration) -> string;
```
## NamespaceExportDeclaration::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *NamespaceExportDeclaration;
```
## NamespaceExportDeclaration::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: NamespaceExportDeclaration) -> Location;
```
## NamespaceExportDeclaration::is\<T\>

```rust
pub fn is<T>(self: NamespaceExportDeclaration) -> bool;
```
## NamespaceExportDeclaration::to\<T\>

```rust
pub fn to<T>(self: NamespaceExportDeclaration) -> <any>;
```
## NamespaceExportDeclaration::key\_neq

```rust
pub fn key_neq(self: NamespaceExportDeclaration, object: <any>) -> bool;
```
## NamespaceExportDeclaration::key\_eq

```rust
pub fn key_eq(self: NamespaceExportDeclaration, object: <any>) -> bool;
```
## NamespaceExportDeclaration::to\_set

```rust
pub fn to_set(self: NamespaceExportDeclaration) -> *NamespaceExportDeclaration;
```
