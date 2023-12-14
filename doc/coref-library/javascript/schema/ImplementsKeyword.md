# ImplementsKeyword

Primary key: `id: int`

```rust
schema ImplementsKeyword {
  @primary id: int,
}
```
## ImplementsKeyword::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: ImplementsKeyword) -> Location;
```
## ImplementsKeyword::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: ImplementsKeyword) -> Symbol;
```
## ImplementsKeyword::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: ImplementsKeyword) -> *Decorator;
```
## ImplementsKeyword::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: ImplementsKeyword) -> string;
```
## ImplementsKeyword::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: ImplementsKeyword, i: int) -> Modifier;
```
## ImplementsKeyword::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: ImplementsKeyword) -> *Comment;
```
## ImplementsKeyword::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: ImplementsKeyword) -> *Node;
```
## ImplementsKeyword::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: ImplementsKeyword) -> *Node;
```
## ImplementsKeyword::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: ImplementsKeyword) -> Node;
```
## ImplementsKeyword::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: ImplementsKeyword) -> int;
```
## ImplementsKeyword::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: ImplementsKeyword) -> TopLevelDO;
```
## ImplementsKeyword::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: ImplementsKeyword, i: int) -> Decorator;
```
## ImplementsKeyword::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: ImplementsKeyword) -> int;
```
## ImplementsKeyword::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: ImplementsKeyword) -> *Modifier;
```
## ImplementsKeyword::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ImplementsKeyword) -> int;
```
## ImplementsKeyword::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: ImplementsKeyword, i: int) -> Node;
```
## ImplementsKeyword::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ImplementsKeyword) -> int;
```
## ImplementsKeyword::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ImplementsKeyword) -> *FunctionLikeDeclaration;
```
## ImplementsKeyword::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: ImplementsKeyword, level: int) -> *Node;
```
## ImplementsKeyword::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ImplementsKeyword) -> int;
```
## ImplementsKeyword::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: ImplementsKeyword) -> string;
```
## ImplementsKeyword::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: ImplementsKeyword, level: int) -> Node;
```
## ImplementsKeyword::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: ImplementsKeyword) -> File;
```
## ImplementsKeyword::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: ImplementsKeyword) -> *Comment;
```
## ImplementsKeyword::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: ImplementsKeyword) -> *Comment;
```
## ImplementsKeyword::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: ImplementsKeyword) -> Node;
```
## ImplementsKeyword::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: ImplementsKeyword) -> FunctionLikeDeclaration;
```
## ImplementsKeyword::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ImplementsKeyword) -> int;
```
## ImplementsKeyword::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: ImplementsKeyword) -> int;
```
## ImplementsKeyword::getIndex

```rust
pub fn getIndex(self: ImplementsKeyword) -> int;
```
## ImplementsKeyword::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: ImplementsKeyword) -> *Node;
```
## ImplementsKeyword::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *ImplementsKeyword;
```
## ImplementsKeyword::is\<T\>

```rust
pub fn is<T>(self: ImplementsKeyword) -> bool;
```
## ImplementsKeyword::to\<T\>

```rust
pub fn to<T>(self: ImplementsKeyword) -> <any>;
```
## ImplementsKeyword::key\_neq

```rust
pub fn key_neq(self: ImplementsKeyword, object: <any>) -> bool;
```
## ImplementsKeyword::key\_eq

```rust
pub fn key_eq(self: ImplementsKeyword, object: <any>) -> bool;
```
## ImplementsKeyword::to\_set

```rust
pub fn to_set(self: ImplementsKeyword) -> *ImplementsKeyword;
```
