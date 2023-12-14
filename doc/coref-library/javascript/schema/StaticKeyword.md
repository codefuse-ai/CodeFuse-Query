# StaticKeyword

Primary key: `id: int`

```rust
schema StaticKeyword {
  @primary id: int,
}
```
## StaticKeyword::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: StaticKeyword) -> *Node;
```
## StaticKeyword::getIndex

```rust
pub fn getIndex(self: StaticKeyword) -> int;
```
## StaticKeyword::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: StaticKeyword) -> int;
```
## StaticKeyword::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: StaticKeyword) -> int;
```
## StaticKeyword::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: StaticKeyword) -> FunctionLikeDeclaration;
```
## StaticKeyword::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: StaticKeyword) -> Node;
```
## StaticKeyword::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: StaticKeyword) -> *Comment;
```
## StaticKeyword::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: StaticKeyword) -> *Comment;
```
## StaticKeyword::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: StaticKeyword) -> File;
```
## StaticKeyword::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: StaticKeyword, level: int) -> Node;
```
## StaticKeyword::getEndLineNumber

```rust
pub fn getEndLineNumber(self: StaticKeyword) -> int;
```
## StaticKeyword::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: StaticKeyword) -> string;
```
## StaticKeyword::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: StaticKeyword) -> *FunctionLikeDeclaration;
```
## StaticKeyword::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: StaticKeyword, level: int) -> *Node;
```
## StaticKeyword::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: StaticKeyword) -> int;
```
## StaticKeyword::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: StaticKeyword) -> *Modifier;
```
## StaticKeyword::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: StaticKeyword) -> int;
```
## StaticKeyword::getStartLineNumber

```rust
pub fn getStartLineNumber(self: StaticKeyword) -> int;
```
## StaticKeyword::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: StaticKeyword, i: int) -> Node;
```
## StaticKeyword::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: StaticKeyword, i: int) -> Decorator;
```
## StaticKeyword::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: StaticKeyword) -> TopLevelDO;
```
## StaticKeyword::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: StaticKeyword) -> int;
```
## StaticKeyword::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: StaticKeyword) -> Node;
```
## StaticKeyword::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: StaticKeyword) -> *Node;
```
## StaticKeyword::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: StaticKeyword) -> *Node;
```
## StaticKeyword::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: StaticKeyword) -> *Comment;
```
## StaticKeyword::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: StaticKeyword) -> Symbol;
```
## StaticKeyword::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: StaticKeyword) -> *Decorator;
```
## StaticKeyword::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: StaticKeyword, i: int) -> Modifier;
```
## StaticKeyword::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: StaticKeyword) -> string;
```
## StaticKeyword::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *StaticKeyword;
```
## StaticKeyword::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: StaticKeyword) -> Location;
```
## StaticKeyword::is\<T\>

```rust
pub fn is<T>(self: StaticKeyword) -> bool;
```
## StaticKeyword::to\<T\>

```rust
pub fn to<T>(self: StaticKeyword) -> <any>;
```
## StaticKeyword::key\_neq

```rust
pub fn key_neq(self: StaticKeyword, object: <any>) -> bool;
```
## StaticKeyword::key\_eq

```rust
pub fn key_eq(self: StaticKeyword, object: <any>) -> bool;
```
## StaticKeyword::to\_set

```rust
pub fn to_set(self: StaticKeyword) -> *StaticKeyword;
```
