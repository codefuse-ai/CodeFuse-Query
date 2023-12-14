# OverrideKeyword

Primary key: `id: int`

```rust
schema OverrideKeyword {
  @primary id: int,
}
```
## OverrideKeyword::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: OverrideKeyword) -> *Node;
```
## OverrideKeyword::getIndex

```rust
pub fn getIndex(self: OverrideKeyword) -> int;
```
## OverrideKeyword::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: OverrideKeyword) -> int;
```
## OverrideKeyword::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: OverrideKeyword) -> int;
```
## OverrideKeyword::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: OverrideKeyword) -> FunctionLikeDeclaration;
```
## OverrideKeyword::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: OverrideKeyword) -> Node;
```
## OverrideKeyword::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: OverrideKeyword) -> *Comment;
```
## OverrideKeyword::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: OverrideKeyword) -> *Comment;
```
## OverrideKeyword::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: OverrideKeyword) -> File;
```
## OverrideKeyword::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: OverrideKeyword, level: int) -> Node;
```
## OverrideKeyword::getEndLineNumber

```rust
pub fn getEndLineNumber(self: OverrideKeyword) -> int;
```
## OverrideKeyword::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: OverrideKeyword) -> string;
```
## OverrideKeyword::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: OverrideKeyword) -> *FunctionLikeDeclaration;
```
## OverrideKeyword::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: OverrideKeyword, level: int) -> *Node;
```
## OverrideKeyword::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: OverrideKeyword) -> int;
```
## OverrideKeyword::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: OverrideKeyword) -> *Modifier;
```
## OverrideKeyword::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: OverrideKeyword) -> int;
```
## OverrideKeyword::getStartLineNumber

```rust
pub fn getStartLineNumber(self: OverrideKeyword) -> int;
```
## OverrideKeyword::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: OverrideKeyword, i: int) -> Node;
```
## OverrideKeyword::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: OverrideKeyword, i: int) -> Decorator;
```
## OverrideKeyword::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: OverrideKeyword) -> TopLevelDO;
```
## OverrideKeyword::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: OverrideKeyword) -> int;
```
## OverrideKeyword::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: OverrideKeyword) -> Node;
```
## OverrideKeyword::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: OverrideKeyword) -> *Node;
```
## OverrideKeyword::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: OverrideKeyword) -> *Node;
```
## OverrideKeyword::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: OverrideKeyword) -> *Comment;
```
## OverrideKeyword::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: OverrideKeyword) -> Symbol;
```
## OverrideKeyword::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: OverrideKeyword) -> *Decorator;
```
## OverrideKeyword::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: OverrideKeyword, i: int) -> Modifier;
```
## OverrideKeyword::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: OverrideKeyword) -> string;
```
## OverrideKeyword::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *OverrideKeyword;
```
## OverrideKeyword::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: OverrideKeyword) -> Location;
```
## OverrideKeyword::is\<T\>

```rust
pub fn is<T>(self: OverrideKeyword) -> bool;
```
## OverrideKeyword::to\<T\>

```rust
pub fn to<T>(self: OverrideKeyword) -> <any>;
```
## OverrideKeyword::key\_neq

```rust
pub fn key_neq(self: OverrideKeyword, object: <any>) -> bool;
```
## OverrideKeyword::key\_eq

```rust
pub fn key_eq(self: OverrideKeyword, object: <any>) -> bool;
```
## OverrideKeyword::to\_set

```rust
pub fn to_set(self: OverrideKeyword) -> *OverrideKeyword;
```
