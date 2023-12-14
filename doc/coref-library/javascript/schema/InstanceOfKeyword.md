# InstanceOfKeyword

Primary key: `id: int`

```rust
schema InstanceOfKeyword {
  @primary id: int,
}
```
## InstanceOfKeyword::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: InstanceOfKeyword) -> Location;
```
## InstanceOfKeyword::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: InstanceOfKeyword) -> Symbol;
```
## InstanceOfKeyword::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: InstanceOfKeyword) -> *Decorator;
```
## InstanceOfKeyword::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: InstanceOfKeyword) -> string;
```
## InstanceOfKeyword::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: InstanceOfKeyword, i: int) -> Modifier;
```
## InstanceOfKeyword::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: InstanceOfKeyword) -> *Comment;
```
## InstanceOfKeyword::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: InstanceOfKeyword) -> *Node;
```
## InstanceOfKeyword::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: InstanceOfKeyword) -> *Node;
```
## InstanceOfKeyword::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: InstanceOfKeyword) -> Node;
```
## InstanceOfKeyword::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: InstanceOfKeyword) -> int;
```
## InstanceOfKeyword::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: InstanceOfKeyword) -> TopLevelDO;
```
## InstanceOfKeyword::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: InstanceOfKeyword, i: int) -> Decorator;
```
## InstanceOfKeyword::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: InstanceOfKeyword) -> int;
```
## InstanceOfKeyword::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: InstanceOfKeyword) -> *Modifier;
```
## InstanceOfKeyword::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: InstanceOfKeyword) -> int;
```
## InstanceOfKeyword::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: InstanceOfKeyword, i: int) -> Node;
```
## InstanceOfKeyword::getStartLineNumber

```rust
pub fn getStartLineNumber(self: InstanceOfKeyword) -> int;
```
## InstanceOfKeyword::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: InstanceOfKeyword) -> *FunctionLikeDeclaration;
```
## InstanceOfKeyword::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: InstanceOfKeyword, level: int) -> *Node;
```
## InstanceOfKeyword::getEndLineNumber

```rust
pub fn getEndLineNumber(self: InstanceOfKeyword) -> int;
```
## InstanceOfKeyword::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: InstanceOfKeyword) -> string;
```
## InstanceOfKeyword::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: InstanceOfKeyword, level: int) -> Node;
```
## InstanceOfKeyword::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: InstanceOfKeyword) -> File;
```
## InstanceOfKeyword::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: InstanceOfKeyword) -> *Comment;
```
## InstanceOfKeyword::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: InstanceOfKeyword) -> *Comment;
```
## InstanceOfKeyword::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: InstanceOfKeyword) -> Node;
```
## InstanceOfKeyword::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: InstanceOfKeyword) -> FunctionLikeDeclaration;
```
## InstanceOfKeyword::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: InstanceOfKeyword) -> int;
```
## InstanceOfKeyword::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: InstanceOfKeyword) -> int;
```
## InstanceOfKeyword::getIndex

```rust
pub fn getIndex(self: InstanceOfKeyword) -> int;
```
## InstanceOfKeyword::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: InstanceOfKeyword) -> *Node;
```
## InstanceOfKeyword::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *InstanceOfKeyword;
```
## InstanceOfKeyword::is\<T\>

```rust
pub fn is<T>(self: InstanceOfKeyword) -> bool;
```
## InstanceOfKeyword::to\<T\>

```rust
pub fn to<T>(self: InstanceOfKeyword) -> <any>;
```
## InstanceOfKeyword::key\_neq

```rust
pub fn key_neq(self: InstanceOfKeyword, object: <any>) -> bool;
```
## InstanceOfKeyword::key\_eq

```rust
pub fn key_eq(self: InstanceOfKeyword, object: <any>) -> bool;
```
## InstanceOfKeyword::to\_set

```rust
pub fn to_set(self: InstanceOfKeyword) -> *InstanceOfKeyword;
```
