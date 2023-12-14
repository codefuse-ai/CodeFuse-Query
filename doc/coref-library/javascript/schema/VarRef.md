# VarRef

Primary key: `id: int`

```rust
schema VarRef {
  @primary id: int,
}
```
## VarRef::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: VarRef) -> *Comment;
```
## VarRef::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: VarRef) -> *Node;
```
## VarRef::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: VarRef) -> Location;
```
## VarRef::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: VarRef) -> Symbol;
```
## VarRef::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: VarRef) -> *Decorator;
```
## VarRef::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: VarRef) -> string;
```
## VarRef::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: VarRef, i: int) -> Modifier;
```
## VarRef::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: VarRef) -> Node;
```
## VarRef::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: VarRef) -> *Node;
```
## VarRef::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: VarRef) -> TopLevelDO;
```
## VarRef::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: VarRef, i: int) -> Decorator;
```
## VarRef::getName

```rust
pub fn getName(self: VarRef) -> string;
```
## VarRef::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: VarRef) -> int;
```
## VarRef::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: VarRef) -> int;
```
## VarRef::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: VarRef) -> *Modifier;
```
## VarRef::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: VarRef) -> int;
```
## VarRef::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: VarRef, i: int) -> Node;
```
## VarRef::getStartLineNumber

```rust
pub fn getStartLineNumber(self: VarRef) -> int;
```
## VarRef::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: VarRef) -> *FunctionLikeDeclaration;
```
## VarRef::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: VarRef, level: int) -> *Node;
```
## VarRef::getEndLineNumber

```rust
pub fn getEndLineNumber(self: VarRef) -> int;
```
## VarRef::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: VarRef) -> string;
```
## VarRef::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: VarRef, level: int) -> Node;
```
## VarRef::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: VarRef) -> File;
```
## VarRef::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: VarRef) -> *Comment;
```
## VarRef::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: VarRef) -> *Comment;
```
## VarRef::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: VarRef) -> Node;
```
## VarRef::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: VarRef) -> FunctionLikeDeclaration;
```
## VarRef::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: VarRef) -> int;
```
## VarRef::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: VarRef) -> int;
```
## VarRef::getIndex

```rust
pub fn getIndex(self: VarRef) -> int;
```
## VarRef::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: VarRef) -> *Node;
```
## VarRef::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *VarRef;
```
## VarRef::is\<T\>

```rust
pub fn is<T>(self: VarRef) -> bool;
```
## VarRef::to\<T\>

```rust
pub fn to<T>(self: VarRef) -> <any>;
```
## VarRef::key\_neq

```rust
pub fn key_neq(self: VarRef, object: <any>) -> bool;
```
## VarRef::key\_eq

```rust
pub fn key_eq(self: VarRef, object: <any>) -> bool;
```
## VarRef::to\_set

```rust
pub fn to_set(self: VarRef) -> *VarRef;
```
