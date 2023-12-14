# EnumMember

Primary key: `id: int`

```rust
schema EnumMember {
  @primary id: int,
}
```
## EnumMember::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: EnumMember) -> *Node;
```
## EnumMember::getIndex

```rust
pub fn getIndex(self: EnumMember) -> int;
```
## EnumMember::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: EnumMember) -> int;
```
## EnumMember::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: EnumMember) -> int;
```
## EnumMember::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: EnumMember) -> Node;
```
## EnumMember::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: EnumMember) -> FunctionLikeDeclaration;
```
## EnumMember::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: EnumMember) -> File;
```
## EnumMember::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: EnumMember, level: int) -> Node;
```
## EnumMember::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: EnumMember) -> Location;
```
## EnumMember::getStartLineNumber

```rust
pub fn getStartLineNumber(self: EnumMember) -> int;
```
## EnumMember::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: EnumMember) -> *FunctionLikeDeclaration;
```
## EnumMember::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: EnumMember, level: int) -> *Node;
```
## EnumMember::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: EnumMember) -> int;
```
## EnumMember::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: EnumMember) -> *Modifier;
```
## EnumMember::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: EnumMember) -> int;
```
## EnumMember::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: EnumMember, i: int) -> Node;
```
## EnumMember::getName

```rust
/**
     * Gets the name of the current EnumMember.
     */
```
```rust
pub fn getName(self: EnumMember) -> PropertyName;
```
## EnumMember::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: EnumMember) -> int;
```
## EnumMember::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: EnumMember) -> TopLevelDO;
```
## EnumMember::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: EnumMember, i: int) -> Decorator;
```
## EnumMember::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: EnumMember) -> *Comment;
```
## EnumMember::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: EnumMember) -> *Comment;
```
## EnumMember::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: EnumMember) -> *Node;
```
## EnumMember::getParent

```rust
pub fn getParent(self: EnumMember) -> EnumDeclaration;
```
## EnumMember::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: EnumMember) -> Symbol;
```
## EnumMember::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: EnumMember) -> *Decorator;
```
## EnumMember::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: EnumMember) -> string;
```
## EnumMember::getEndLineNumber

```rust
pub fn getEndLineNumber(self: EnumMember) -> int;
```
## EnumMember::getInitializer

```rust
/**
     * Gets the initializer of the current EnumMember.
     */
```
```rust
pub fn getInitializer(self: EnumMember) -> Expression;
```
## EnumMember::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: EnumMember, i: int) -> Modifier;
```
## EnumMember::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: EnumMember) -> string;
```
## EnumMember::hasInitializer

```rust
/**
     * Determine whether this EnumMember has an initializer.
     */
```
```rust
pub fn hasInitializer(self: EnumMember) -> bool;
```
## EnumMember::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: EnumMember) -> *Node;
```
## EnumMember::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: EnumMember) -> *Comment;
```
## EnumMember::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *EnumMember;
```
## EnumMember::is\<T\>

```rust
pub fn is<T>(self: EnumMember) -> bool;
```
## EnumMember::to\<T\>

```rust
pub fn to<T>(self: EnumMember) -> <any>;
```
## EnumMember::key\_neq

```rust
pub fn key_neq(self: EnumMember, object: <any>) -> bool;
```
## EnumMember::key\_eq

```rust
pub fn key_eq(self: EnumMember, object: <any>) -> bool;
```
## EnumMember::to\_set

```rust
pub fn to_set(self: EnumMember) -> *EnumMember;
```
