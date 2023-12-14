# BooleanKeyword

Primary key: `id: int`

```rust
schema BooleanKeyword {
  @primary id: int,
}
```
## BooleanKeyword::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: BooleanKeyword) -> Location;
```
## BooleanKeyword::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: BooleanKeyword) -> Symbol;
```
## BooleanKeyword::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: BooleanKeyword) -> *Decorator;
```
## BooleanKeyword::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: BooleanKeyword) -> string;
```
## BooleanKeyword::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: BooleanKeyword, i: int) -> Modifier;
```
## BooleanKeyword::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: BooleanKeyword) -> *Comment;
```
## BooleanKeyword::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: BooleanKeyword) -> *Node;
```
## BooleanKeyword::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: BooleanKeyword) -> *Node;
```
## BooleanKeyword::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: BooleanKeyword) -> Node;
```
## BooleanKeyword::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: BooleanKeyword) -> int;
```
## BooleanKeyword::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: BooleanKeyword) -> TopLevelDO;
```
## BooleanKeyword::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: BooleanKeyword, i: int) -> Decorator;
```
## BooleanKeyword::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: BooleanKeyword) -> int;
```
## BooleanKeyword::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: BooleanKeyword) -> *Modifier;
```
## BooleanKeyword::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: BooleanKeyword) -> int;
```
## BooleanKeyword::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: BooleanKeyword, i: int) -> Node;
```
## BooleanKeyword::getStartLineNumber

```rust
pub fn getStartLineNumber(self: BooleanKeyword) -> int;
```
## BooleanKeyword::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: BooleanKeyword) -> *FunctionLikeDeclaration;
```
## BooleanKeyword::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: BooleanKeyword, level: int) -> *Node;
```
## BooleanKeyword::getEndLineNumber

```rust
pub fn getEndLineNumber(self: BooleanKeyword) -> int;
```
## BooleanKeyword::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: BooleanKeyword) -> string;
```
## BooleanKeyword::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: BooleanKeyword, level: int) -> Node;
```
## BooleanKeyword::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: BooleanKeyword) -> File;
```
## BooleanKeyword::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: BooleanKeyword) -> *Comment;
```
## BooleanKeyword::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: BooleanKeyword) -> *Comment;
```
## BooleanKeyword::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: BooleanKeyword) -> Node;
```
## BooleanKeyword::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: BooleanKeyword) -> FunctionLikeDeclaration;
```
## BooleanKeyword::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: BooleanKeyword) -> int;
```
## BooleanKeyword::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: BooleanKeyword) -> int;
```
## BooleanKeyword::getIndex

```rust
pub fn getIndex(self: BooleanKeyword) -> int;
```
## BooleanKeyword::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: BooleanKeyword) -> *Node;
```
## BooleanKeyword::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *BooleanKeyword;
```
## BooleanKeyword::is\<T\>

```rust
pub fn is<T>(self: BooleanKeyword) -> bool;
```
## BooleanKeyword::to\<T\>

```rust
pub fn to<T>(self: BooleanKeyword) -> <any>;
```
## BooleanKeyword::key\_neq

```rust
pub fn key_neq(self: BooleanKeyword, object: <any>) -> bool;
```
## BooleanKeyword::key\_eq

```rust
pub fn key_eq(self: BooleanKeyword, object: <any>) -> bool;
```
## BooleanKeyword::to\_set

```rust
pub fn to_set(self: BooleanKeyword) -> *BooleanKeyword;
```
