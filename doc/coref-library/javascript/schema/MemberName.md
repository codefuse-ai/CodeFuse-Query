# MemberName

Primary key: `id: int`

```rust
schema MemberName {
  @primary id: int,
}
```
## MemberName::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: MemberName) -> *Node;
```
## MemberName::getIndex

```rust
pub fn getIndex(self: MemberName) -> int;
```
## MemberName::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: MemberName) -> int;
```
## MemberName::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: MemberName) -> int;
```
## MemberName::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: MemberName) -> Node;
```
## MemberName::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: MemberName) -> FunctionLikeDeclaration;
```
## MemberName::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: MemberName) -> File;
```
## MemberName::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: MemberName, level: int) -> Node;
```
## MemberName::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: MemberName) -> string;
```
## MemberName::getEndLineNumber

```rust
pub fn getEndLineNumber(self: MemberName) -> int;
```
## MemberName::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: MemberName) -> *FunctionLikeDeclaration;
```
## MemberName::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: MemberName, level: int) -> *Node;
```
## MemberName::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: MemberName) -> int;
```
## MemberName::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: MemberName) -> *Modifier;
```
## MemberName::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: MemberName) -> int;
```
## MemberName::getStartLineNumber

```rust
pub fn getStartLineNumber(self: MemberName) -> int;
```
## MemberName::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: MemberName, i: int) -> Node;
```
## MemberName::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: MemberName) -> TopLevelDO;
```
## MemberName::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: MemberName, i: int) -> Decorator;
```
## MemberName::getName

```rust
/**
     * Gets the name of this MemberName.
     */
```
```rust
pub fn getName(self: MemberName) -> string;
```
## MemberName::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: MemberName) -> int;
```
## MemberName::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: MemberName) -> *Comment;
```
## MemberName::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: MemberName) -> *Comment;
```
## MemberName::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: MemberName) -> *Node;
```
## MemberName::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: MemberName) -> Node;
```
## MemberName::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: MemberName, i: int) -> Modifier;
```
## MemberName::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: MemberName) -> string;
```
## MemberName::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: MemberName) -> *Decorator;
```
## MemberName::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: MemberName) -> Symbol;
```
## MemberName::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: MemberName) -> Location;
```
## MemberName::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *MemberName;
```
## MemberName::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: MemberName) -> *Node;
```
## MemberName::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: MemberName) -> *Comment;
```
## MemberName::is\<T\>

```rust
pub fn is<T>(self: MemberName) -> bool;
```
## MemberName::to\<T\>

```rust
pub fn to<T>(self: MemberName) -> <any>;
```
## MemberName::key\_neq

```rust
pub fn key_neq(self: MemberName, object: <any>) -> bool;
```
## MemberName::key\_eq

```rust
pub fn key_eq(self: MemberName, object: <any>) -> bool;
```
## MemberName::to\_set

```rust
pub fn to_set(self: MemberName) -> *MemberName;
```
