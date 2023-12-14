# MergeDeclarationMarker

Primary key: `id: int`

```rust
schema MergeDeclarationMarker {
  @primary id: int,
}
```
## MergeDeclarationMarker::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: MergeDeclarationMarker) -> Location;
```
## MergeDeclarationMarker::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: MergeDeclarationMarker) -> Symbol;
```
## MergeDeclarationMarker::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: MergeDeclarationMarker) -> *Decorator;
```
## MergeDeclarationMarker::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: MergeDeclarationMarker) -> string;
```
## MergeDeclarationMarker::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: MergeDeclarationMarker, i: int) -> Modifier;
```
## MergeDeclarationMarker::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: MergeDeclarationMarker) -> *Comment;
```
## MergeDeclarationMarker::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: MergeDeclarationMarker) -> *Node;
```
## MergeDeclarationMarker::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: MergeDeclarationMarker) -> *Node;
```
## MergeDeclarationMarker::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: MergeDeclarationMarker) -> Node;
```
## MergeDeclarationMarker::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: MergeDeclarationMarker) -> int;
```
## MergeDeclarationMarker::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: MergeDeclarationMarker) -> TopLevelDO;
```
## MergeDeclarationMarker::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: MergeDeclarationMarker, i: int) -> Decorator;
```
## MergeDeclarationMarker::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: MergeDeclarationMarker) -> int;
```
## MergeDeclarationMarker::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: MergeDeclarationMarker) -> *Modifier;
```
## MergeDeclarationMarker::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: MergeDeclarationMarker) -> int;
```
## MergeDeclarationMarker::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: MergeDeclarationMarker, i: int) -> Node;
```
## MergeDeclarationMarker::getStartLineNumber

```rust
pub fn getStartLineNumber(self: MergeDeclarationMarker) -> int;
```
## MergeDeclarationMarker::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: MergeDeclarationMarker) -> *FunctionLikeDeclaration;
```
## MergeDeclarationMarker::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: MergeDeclarationMarker, level: int) -> *Node;
```
## MergeDeclarationMarker::getEndLineNumber

```rust
pub fn getEndLineNumber(self: MergeDeclarationMarker) -> int;
```
## MergeDeclarationMarker::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: MergeDeclarationMarker) -> string;
```
## MergeDeclarationMarker::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: MergeDeclarationMarker, level: int) -> Node;
```
## MergeDeclarationMarker::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: MergeDeclarationMarker) -> File;
```
## MergeDeclarationMarker::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: MergeDeclarationMarker) -> *Comment;
```
## MergeDeclarationMarker::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: MergeDeclarationMarker) -> *Comment;
```
## MergeDeclarationMarker::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: MergeDeclarationMarker) -> Node;
```
## MergeDeclarationMarker::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: MergeDeclarationMarker) -> FunctionLikeDeclaration;
```
## MergeDeclarationMarker::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: MergeDeclarationMarker) -> int;
```
## MergeDeclarationMarker::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: MergeDeclarationMarker) -> int;
```
## MergeDeclarationMarker::getIndex

```rust
pub fn getIndex(self: MergeDeclarationMarker) -> int;
```
## MergeDeclarationMarker::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: MergeDeclarationMarker) -> *Node;
```
## MergeDeclarationMarker::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *MergeDeclarationMarker;
```
## MergeDeclarationMarker::is\<T\>

```rust
pub fn is<T>(self: MergeDeclarationMarker) -> bool;
```
## MergeDeclarationMarker::to\<T\>

```rust
pub fn to<T>(self: MergeDeclarationMarker) -> <any>;
```
## MergeDeclarationMarker::key\_neq

```rust
pub fn key_neq(self: MergeDeclarationMarker, object: <any>) -> bool;
```
## MergeDeclarationMarker::key\_eq

```rust
pub fn key_eq(self: MergeDeclarationMarker, object: <any>) -> bool;
```
## MergeDeclarationMarker::to\_set

```rust
pub fn to_set(self: MergeDeclarationMarker) -> *MergeDeclarationMarker;
```
