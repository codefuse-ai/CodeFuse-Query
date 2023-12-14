# ExternalModuleReference

Primary key: `id: int`

```rust
schema ExternalModuleReference {
  @primary id: int,
}
```
## ExternalModuleReference::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: ExternalModuleReference) -> *Node;
```
## ExternalModuleReference::getIndex

```rust
pub fn getIndex(self: ExternalModuleReference) -> int;
```
## ExternalModuleReference::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: ExternalModuleReference) -> int;
```
## ExternalModuleReference::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ExternalModuleReference) -> int;
```
## ExternalModuleReference::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: ExternalModuleReference) -> Node;
```
## ExternalModuleReference::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: ExternalModuleReference) -> FunctionLikeDeclaration;
```
## ExternalModuleReference::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: ExternalModuleReference) -> File;
```
## ExternalModuleReference::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: ExternalModuleReference, level: int) -> Node;
```
## ExternalModuleReference::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: ExternalModuleReference) -> string;
```
## ExternalModuleReference::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ExternalModuleReference) -> int;
```
## ExternalModuleReference::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ExternalModuleReference) -> *FunctionLikeDeclaration;
```
## ExternalModuleReference::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: ExternalModuleReference, level: int) -> *Node;
```
## ExternalModuleReference::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: ExternalModuleReference) -> int;
```
## ExternalModuleReference::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: ExternalModuleReference) -> *Modifier;
```
## ExternalModuleReference::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ExternalModuleReference) -> int;
```
## ExternalModuleReference::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ExternalModuleReference) -> int;
```
## ExternalModuleReference::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: ExternalModuleReference, i: int) -> Node;
```
## ExternalModuleReference::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: ExternalModuleReference, i: int) -> Decorator;
```
## ExternalModuleReference::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: ExternalModuleReference) -> TopLevelDO;
```
## ExternalModuleReference::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: ExternalModuleReference) -> int;
```
## ExternalModuleReference::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: ExternalModuleReference) -> *Comment;
```
## ExternalModuleReference::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: ExternalModuleReference) -> *Comment;
```
## ExternalModuleReference::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: ExternalModuleReference) -> Node;
```
## ExternalModuleReference::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: ExternalModuleReference) -> *Node;
```
## ExternalModuleReference::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: ExternalModuleReference) -> *Node;
```
## ExternalModuleReference::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: ExternalModuleReference) -> *Comment;
```
## ExternalModuleReference::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: ExternalModuleReference, i: int) -> Modifier;
```
## ExternalModuleReference::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: ExternalModuleReference) -> string;
```
## ExternalModuleReference::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: ExternalModuleReference) -> *Decorator;
```
## ExternalModuleReference::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: ExternalModuleReference) -> Symbol;
```
## ExternalModuleReference::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: ExternalModuleReference) -> Location;
```
## ExternalModuleReference::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *ExternalModuleReference;
```
## ExternalModuleReference::is\<T\>

```rust
pub fn is<T>(self: ExternalModuleReference) -> bool;
```
## ExternalModuleReference::to\<T\>

```rust
pub fn to<T>(self: ExternalModuleReference) -> <any>;
```
## ExternalModuleReference::key\_neq

```rust
pub fn key_neq(self: ExternalModuleReference, object: <any>) -> bool;
```
## ExternalModuleReference::key\_eq

```rust
pub fn key_eq(self: ExternalModuleReference, object: <any>) -> bool;
```
## ExternalModuleReference::to\_set

```rust
pub fn to_set(self: ExternalModuleReference) -> *ExternalModuleReference;
```
