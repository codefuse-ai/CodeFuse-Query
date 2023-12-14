# ThisKeyword

Primary key: `id: int`

```rust
schema ThisKeyword {
  @primary id: int,
}
```
## ThisKeyword::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: ThisKeyword) -> Location;
```
## ThisKeyword::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: ThisKeyword) -> Symbol;
```
## ThisKeyword::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: ThisKeyword) -> *Decorator;
```
## ThisKeyword::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: ThisKeyword) -> string;
```
## ThisKeyword::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: ThisKeyword, i: int) -> Modifier;
```
## ThisKeyword::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: ThisKeyword) -> *Comment;
```
## ThisKeyword::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: ThisKeyword) -> *Node;
```
## ThisKeyword::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: ThisKeyword) -> *Node;
```
## ThisKeyword::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: ThisKeyword) -> Node;
```
## ThisKeyword::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: ThisKeyword) -> int;
```
## ThisKeyword::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: ThisKeyword) -> TopLevelDO;
```
## ThisKeyword::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: ThisKeyword, i: int) -> Decorator;
```
## ThisKeyword::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: ThisKeyword) -> int;
```
## ThisKeyword::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: ThisKeyword) -> *Modifier;
```
## ThisKeyword::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ThisKeyword) -> int;
```
## ThisKeyword::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: ThisKeyword, i: int) -> Node;
```
## ThisKeyword::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ThisKeyword) -> int;
```
## ThisKeyword::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ThisKeyword) -> *FunctionLikeDeclaration;
```
## ThisKeyword::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: ThisKeyword, level: int) -> *Node;
```
## ThisKeyword::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ThisKeyword) -> int;
```
## ThisKeyword::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: ThisKeyword) -> string;
```
## ThisKeyword::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: ThisKeyword, level: int) -> Node;
```
## ThisKeyword::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: ThisKeyword) -> File;
```
## ThisKeyword::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: ThisKeyword) -> *Comment;
```
## ThisKeyword::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: ThisKeyword) -> *Comment;
```
## ThisKeyword::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: ThisKeyword) -> Node;
```
## ThisKeyword::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: ThisKeyword) -> FunctionLikeDeclaration;
```
## ThisKeyword::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ThisKeyword) -> int;
```
## ThisKeyword::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: ThisKeyword) -> int;
```
## ThisKeyword::getIndex

```rust
pub fn getIndex(self: ThisKeyword) -> int;
```
## ThisKeyword::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: ThisKeyword) -> *Node;
```
## ThisKeyword::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *ThisKeyword;
```
## ThisKeyword::is\<T\>

```rust
pub fn is<T>(self: ThisKeyword) -> bool;
```
## ThisKeyword::to\<T\>

```rust
pub fn to<T>(self: ThisKeyword) -> <any>;
```
## ThisKeyword::key\_neq

```rust
pub fn key_neq(self: ThisKeyword, object: <any>) -> bool;
```
## ThisKeyword::key\_eq

```rust
pub fn key_eq(self: ThisKeyword, object: <any>) -> bool;
```
## ThisKeyword::to\_set

```rust
pub fn to_set(self: ThisKeyword) -> *ThisKeyword;
```
