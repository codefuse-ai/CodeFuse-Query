# ExportDeclaration

Primary key: `id: int`

```rust
schema ExportDeclaration {
  @primary id: int,
}
```
## ExportDeclaration::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: ExportDeclaration) -> *Node;
```
## ExportDeclaration::getIndex

```rust
pub fn getIndex(self: ExportDeclaration) -> int;
```
## ExportDeclaration::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: ExportDeclaration) -> int;
```
## ExportDeclaration::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ExportDeclaration) -> int;
```
## ExportDeclaration::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: ExportDeclaration) -> FunctionLikeDeclaration;
```
## ExportDeclaration::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: ExportDeclaration) -> Node;
```
## ExportDeclaration::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: ExportDeclaration) -> *Comment;
```
## ExportDeclaration::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: ExportDeclaration) -> *Comment;
```
## ExportDeclaration::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: ExportDeclaration) -> File;
```
## ExportDeclaration::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: ExportDeclaration, level: int) -> Node;
```
## ExportDeclaration::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ExportDeclaration) -> int;
```
## ExportDeclaration::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: ExportDeclaration) -> string;
```
## ExportDeclaration::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ExportDeclaration) -> *FunctionLikeDeclaration;
```
## ExportDeclaration::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: ExportDeclaration, level: int) -> *Node;
```
## ExportDeclaration::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: ExportDeclaration) -> int;
```
## ExportDeclaration::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: ExportDeclaration) -> *Modifier;
```
## ExportDeclaration::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ExportDeclaration) -> int;
```
## ExportDeclaration::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ExportDeclaration) -> int;
```
## ExportDeclaration::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: ExportDeclaration, i: int) -> Node;
```
## ExportDeclaration::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: ExportDeclaration, i: int) -> Decorator;
```
## ExportDeclaration::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: ExportDeclaration) -> TopLevelDO;
```
## ExportDeclaration::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: ExportDeclaration) -> int;
```
## ExportDeclaration::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: ExportDeclaration) -> Node;
```
## ExportDeclaration::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: ExportDeclaration) -> *Node;
```
## ExportDeclaration::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: ExportDeclaration) -> *Node;
```
## ExportDeclaration::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: ExportDeclaration) -> *Comment;
```
## ExportDeclaration::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: ExportDeclaration) -> Symbol;
```
## ExportDeclaration::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: ExportDeclaration) -> *Decorator;
```
## ExportDeclaration::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: ExportDeclaration, i: int) -> Modifier;
```
## ExportDeclaration::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: ExportDeclaration) -> string;
```
## ExportDeclaration::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *ExportDeclaration;
```
## ExportDeclaration::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: ExportDeclaration) -> Location;
```
## ExportDeclaration::is\<T\>

```rust
pub fn is<T>(self: ExportDeclaration) -> bool;
```
## ExportDeclaration::to\<T\>

```rust
pub fn to<T>(self: ExportDeclaration) -> <any>;
```
## ExportDeclaration::key\_neq

```rust
pub fn key_neq(self: ExportDeclaration, object: <any>) -> bool;
```
## ExportDeclaration::key\_eq

```rust
pub fn key_eq(self: ExportDeclaration, object: <any>) -> bool;
```
## ExportDeclaration::to\_set

```rust
pub fn to_set(self: ExportDeclaration) -> *ExportDeclaration;
```
