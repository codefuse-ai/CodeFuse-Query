# AwaitKeyword

Primary key: `id: int`

```rust
schema AwaitKeyword {
  @primary id: int,
}
```
## AwaitKeyword::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: AwaitKeyword) -> Location;
```
## AwaitKeyword::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: AwaitKeyword) -> Symbol;
```
## AwaitKeyword::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: AwaitKeyword) -> *Decorator;
```
## AwaitKeyword::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: AwaitKeyword) -> string;
```
## AwaitKeyword::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: AwaitKeyword, i: int) -> Modifier;
```
## AwaitKeyword::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: AwaitKeyword) -> *Comment;
```
## AwaitKeyword::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: AwaitKeyword) -> *Node;
```
## AwaitKeyword::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: AwaitKeyword) -> *Node;
```
## AwaitKeyword::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: AwaitKeyword) -> Node;
```
## AwaitKeyword::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: AwaitKeyword) -> int;
```
## AwaitKeyword::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: AwaitKeyword) -> TopLevelDO;
```
## AwaitKeyword::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: AwaitKeyword, i: int) -> Decorator;
```
## AwaitKeyword::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: AwaitKeyword) -> int;
```
## AwaitKeyword::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: AwaitKeyword) -> *Modifier;
```
## AwaitKeyword::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: AwaitKeyword) -> int;
```
## AwaitKeyword::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: AwaitKeyword, i: int) -> Node;
```
## AwaitKeyword::getStartLineNumber

```rust
pub fn getStartLineNumber(self: AwaitKeyword) -> int;
```
## AwaitKeyword::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: AwaitKeyword) -> *FunctionLikeDeclaration;
```
## AwaitKeyword::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: AwaitKeyword, level: int) -> *Node;
```
## AwaitKeyword::getEndLineNumber

```rust
pub fn getEndLineNumber(self: AwaitKeyword) -> int;
```
## AwaitKeyword::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: AwaitKeyword) -> string;
```
## AwaitKeyword::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: AwaitKeyword, level: int) -> Node;
```
## AwaitKeyword::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: AwaitKeyword) -> File;
```
## AwaitKeyword::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: AwaitKeyword) -> *Comment;
```
## AwaitKeyword::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: AwaitKeyword) -> *Comment;
```
## AwaitKeyword::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: AwaitKeyword) -> Node;
```
## AwaitKeyword::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: AwaitKeyword) -> FunctionLikeDeclaration;
```
## AwaitKeyword::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: AwaitKeyword) -> int;
```
## AwaitKeyword::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: AwaitKeyword) -> int;
```
## AwaitKeyword::getIndex

```rust
pub fn getIndex(self: AwaitKeyword) -> int;
```
## AwaitKeyword::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: AwaitKeyword) -> *Node;
```
## AwaitKeyword::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *AwaitKeyword;
```
## AwaitKeyword::is\<T\>

```rust
pub fn is<T>(self: AwaitKeyword) -> bool;
```
## AwaitKeyword::to\<T\>

```rust
pub fn to<T>(self: AwaitKeyword) -> <any>;
```
## AwaitKeyword::key\_neq

```rust
pub fn key_neq(self: AwaitKeyword, object: <any>) -> bool;
```
## AwaitKeyword::key\_eq

```rust
pub fn key_eq(self: AwaitKeyword, object: <any>) -> bool;
```
## AwaitKeyword::to\_set

```rust
pub fn to_set(self: AwaitKeyword) -> *AwaitKeyword;
```
