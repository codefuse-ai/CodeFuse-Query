# NamedTupleMember

Primary key: `id: int`

```rust
schema NamedTupleMember {
  @primary id: int,
}
```
## NamedTupleMember::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: NamedTupleMember) -> Location;
```
## NamedTupleMember::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: NamedTupleMember) -> Symbol;
```
## NamedTupleMember::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: NamedTupleMember) -> *Decorator;
```
## NamedTupleMember::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: NamedTupleMember) -> string;
```
## NamedTupleMember::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: NamedTupleMember, i: int) -> Modifier;
```
## NamedTupleMember::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: NamedTupleMember) -> *Comment;
```
## NamedTupleMember::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: NamedTupleMember) -> *Node;
```
## NamedTupleMember::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: NamedTupleMember) -> *Node;
```
## NamedTupleMember::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: NamedTupleMember) -> Node;
```
## NamedTupleMember::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: NamedTupleMember) -> int;
```
## NamedTupleMember::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: NamedTupleMember) -> TopLevelDO;
```
## NamedTupleMember::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: NamedTupleMember, i: int) -> Decorator;
```
## NamedTupleMember::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: NamedTupleMember) -> int;
```
## NamedTupleMember::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: NamedTupleMember) -> *Modifier;
```
## NamedTupleMember::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: NamedTupleMember) -> int;
```
## NamedTupleMember::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: NamedTupleMember, i: int) -> Node;
```
## NamedTupleMember::getStartLineNumber

```rust
pub fn getStartLineNumber(self: NamedTupleMember) -> int;
```
## NamedTupleMember::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: NamedTupleMember) -> *FunctionLikeDeclaration;
```
## NamedTupleMember::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: NamedTupleMember, level: int) -> *Node;
```
## NamedTupleMember::getEndLineNumber

```rust
pub fn getEndLineNumber(self: NamedTupleMember) -> int;
```
## NamedTupleMember::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: NamedTupleMember) -> string;
```
## NamedTupleMember::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: NamedTupleMember, level: int) -> Node;
```
## NamedTupleMember::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: NamedTupleMember) -> File;
```
## NamedTupleMember::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: NamedTupleMember) -> *Comment;
```
## NamedTupleMember::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: NamedTupleMember) -> *Comment;
```
## NamedTupleMember::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: NamedTupleMember) -> Node;
```
## NamedTupleMember::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: NamedTupleMember) -> FunctionLikeDeclaration;
```
## NamedTupleMember::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: NamedTupleMember) -> int;
```
## NamedTupleMember::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: NamedTupleMember) -> int;
```
## NamedTupleMember::getIndex

```rust
pub fn getIndex(self: NamedTupleMember) -> int;
```
## NamedTupleMember::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: NamedTupleMember) -> *Node;
```
## NamedTupleMember::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *NamedTupleMember;
```
## NamedTupleMember::is\<T\>

```rust
pub fn is<T>(self: NamedTupleMember) -> bool;
```
## NamedTupleMember::to\<T\>

```rust
pub fn to<T>(self: NamedTupleMember) -> <any>;
```
## NamedTupleMember::key\_neq

```rust
pub fn key_neq(self: NamedTupleMember, object: <any>) -> bool;
```
## NamedTupleMember::key\_eq

```rust
pub fn key_eq(self: NamedTupleMember, object: <any>) -> bool;
```
## NamedTupleMember::to\_set

```rust
pub fn to_set(self: NamedTupleMember) -> *NamedTupleMember;
```
