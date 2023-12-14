# PrivateKeyword

Primary key: `id: int`

```rust
schema PrivateKeyword {
  @primary id: int,
}
```
## PrivateKeyword::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: PrivateKeyword) -> *Node;
```
## PrivateKeyword::getIndex

```rust
pub fn getIndex(self: PrivateKeyword) -> int;
```
## PrivateKeyword::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: PrivateKeyword) -> int;
```
## PrivateKeyword::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: PrivateKeyword) -> int;
```
## PrivateKeyword::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: PrivateKeyword) -> FunctionLikeDeclaration;
```
## PrivateKeyword::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: PrivateKeyword) -> Node;
```
## PrivateKeyword::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: PrivateKeyword) -> *Comment;
```
## PrivateKeyword::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: PrivateKeyword) -> *Comment;
```
## PrivateKeyword::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: PrivateKeyword) -> File;
```
## PrivateKeyword::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: PrivateKeyword, level: int) -> Node;
```
## PrivateKeyword::getEndLineNumber

```rust
pub fn getEndLineNumber(self: PrivateKeyword) -> int;
```
## PrivateKeyword::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: PrivateKeyword) -> string;
```
## PrivateKeyword::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: PrivateKeyword) -> *FunctionLikeDeclaration;
```
## PrivateKeyword::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: PrivateKeyword, level: int) -> *Node;
```
## PrivateKeyword::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: PrivateKeyword) -> int;
```
## PrivateKeyword::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: PrivateKeyword) -> *Modifier;
```
## PrivateKeyword::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: PrivateKeyword) -> int;
```
## PrivateKeyword::getStartLineNumber

```rust
pub fn getStartLineNumber(self: PrivateKeyword) -> int;
```
## PrivateKeyword::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: PrivateKeyword, i: int) -> Node;
```
## PrivateKeyword::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: PrivateKeyword, i: int) -> Decorator;
```
## PrivateKeyword::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: PrivateKeyword) -> TopLevelDO;
```
## PrivateKeyword::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: PrivateKeyword) -> int;
```
## PrivateKeyword::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: PrivateKeyword) -> Node;
```
## PrivateKeyword::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: PrivateKeyword) -> *Node;
```
## PrivateKeyword::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: PrivateKeyword) -> *Node;
```
## PrivateKeyword::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: PrivateKeyword) -> *Comment;
```
## PrivateKeyword::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: PrivateKeyword) -> Symbol;
```
## PrivateKeyword::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: PrivateKeyword) -> *Decorator;
```
## PrivateKeyword::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: PrivateKeyword, i: int) -> Modifier;
```
## PrivateKeyword::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: PrivateKeyword) -> string;
```
## PrivateKeyword::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *PrivateKeyword;
```
## PrivateKeyword::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: PrivateKeyword) -> Location;
```
## PrivateKeyword::is\<T\>

```rust
pub fn is<T>(self: PrivateKeyword) -> bool;
```
## PrivateKeyword::to\<T\>

```rust
pub fn to<T>(self: PrivateKeyword) -> <any>;
```
## PrivateKeyword::key\_neq

```rust
pub fn key_neq(self: PrivateKeyword, object: <any>) -> bool;
```
## PrivateKeyword::key\_eq

```rust
pub fn key_eq(self: PrivateKeyword, object: <any>) -> bool;
```
## PrivateKeyword::to\_set

```rust
pub fn to_set(self: PrivateKeyword) -> *PrivateKeyword;
```
