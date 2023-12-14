# ProtectedKeyword

Primary key: `id: int`

```rust
schema ProtectedKeyword {
  @primary id: int,
}
```
## ProtectedKeyword::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: ProtectedKeyword) -> *Node;
```
## ProtectedKeyword::getIndex

```rust
pub fn getIndex(self: ProtectedKeyword) -> int;
```
## ProtectedKeyword::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: ProtectedKeyword) -> int;
```
## ProtectedKeyword::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ProtectedKeyword) -> int;
```
## ProtectedKeyword::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: ProtectedKeyword) -> FunctionLikeDeclaration;
```
## ProtectedKeyword::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: ProtectedKeyword) -> Node;
```
## ProtectedKeyword::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: ProtectedKeyword) -> *Comment;
```
## ProtectedKeyword::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: ProtectedKeyword) -> *Comment;
```
## ProtectedKeyword::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: ProtectedKeyword) -> File;
```
## ProtectedKeyword::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: ProtectedKeyword, level: int) -> Node;
```
## ProtectedKeyword::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ProtectedKeyword) -> int;
```
## ProtectedKeyword::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: ProtectedKeyword) -> string;
```
## ProtectedKeyword::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ProtectedKeyword) -> *FunctionLikeDeclaration;
```
## ProtectedKeyword::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: ProtectedKeyword, level: int) -> *Node;
```
## ProtectedKeyword::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: ProtectedKeyword) -> int;
```
## ProtectedKeyword::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: ProtectedKeyword) -> *Modifier;
```
## ProtectedKeyword::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ProtectedKeyword) -> int;
```
## ProtectedKeyword::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ProtectedKeyword) -> int;
```
## ProtectedKeyword::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: ProtectedKeyword, i: int) -> Node;
```
## ProtectedKeyword::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: ProtectedKeyword, i: int) -> Decorator;
```
## ProtectedKeyword::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: ProtectedKeyword) -> TopLevelDO;
```
## ProtectedKeyword::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: ProtectedKeyword) -> int;
```
## ProtectedKeyword::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: ProtectedKeyword) -> Node;
```
## ProtectedKeyword::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: ProtectedKeyword) -> *Node;
```
## ProtectedKeyword::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: ProtectedKeyword) -> *Node;
```
## ProtectedKeyword::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: ProtectedKeyword) -> *Comment;
```
## ProtectedKeyword::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: ProtectedKeyword) -> Symbol;
```
## ProtectedKeyword::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: ProtectedKeyword) -> *Decorator;
```
## ProtectedKeyword::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: ProtectedKeyword, i: int) -> Modifier;
```
## ProtectedKeyword::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: ProtectedKeyword) -> string;
```
## ProtectedKeyword::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *ProtectedKeyword;
```
## ProtectedKeyword::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: ProtectedKeyword) -> Location;
```
## ProtectedKeyword::is\<T\>

```rust
pub fn is<T>(self: ProtectedKeyword) -> bool;
```
## ProtectedKeyword::to\<T\>

```rust
pub fn to<T>(self: ProtectedKeyword) -> <any>;
```
## ProtectedKeyword::key\_neq

```rust
pub fn key_neq(self: ProtectedKeyword, object: <any>) -> bool;
```
## ProtectedKeyword::key\_eq

```rust
pub fn key_eq(self: ProtectedKeyword, object: <any>) -> bool;
```
## ProtectedKeyword::to\_set

```rust
pub fn to_set(self: ProtectedKeyword) -> *ProtectedKeyword;
```
