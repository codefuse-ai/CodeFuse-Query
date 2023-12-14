# DeclareKeyword

Primary key: `id: int`

```rust
schema DeclareKeyword {
  @primary id: int,
}
```
## DeclareKeyword::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: DeclareKeyword) -> *Node;
```
## DeclareKeyword::getIndex

```rust
pub fn getIndex(self: DeclareKeyword) -> int;
```
## DeclareKeyword::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: DeclareKeyword) -> int;
```
## DeclareKeyword::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: DeclareKeyword) -> int;
```
## DeclareKeyword::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: DeclareKeyword) -> FunctionLikeDeclaration;
```
## DeclareKeyword::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: DeclareKeyword) -> Node;
```
## DeclareKeyword::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: DeclareKeyword) -> *Comment;
```
## DeclareKeyword::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: DeclareKeyword) -> *Comment;
```
## DeclareKeyword::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: DeclareKeyword) -> File;
```
## DeclareKeyword::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: DeclareKeyword, level: int) -> Node;
```
## DeclareKeyword::getEndLineNumber

```rust
pub fn getEndLineNumber(self: DeclareKeyword) -> int;
```
## DeclareKeyword::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: DeclareKeyword) -> string;
```
## DeclareKeyword::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: DeclareKeyword) -> *FunctionLikeDeclaration;
```
## DeclareKeyword::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: DeclareKeyword, level: int) -> *Node;
```
## DeclareKeyword::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: DeclareKeyword) -> int;
```
## DeclareKeyword::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: DeclareKeyword) -> *Modifier;
```
## DeclareKeyword::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: DeclareKeyword) -> int;
```
## DeclareKeyword::getStartLineNumber

```rust
pub fn getStartLineNumber(self: DeclareKeyword) -> int;
```
## DeclareKeyword::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: DeclareKeyword, i: int) -> Node;
```
## DeclareKeyword::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: DeclareKeyword, i: int) -> Decorator;
```
## DeclareKeyword::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: DeclareKeyword) -> TopLevelDO;
```
## DeclareKeyword::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: DeclareKeyword) -> int;
```
## DeclareKeyword::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: DeclareKeyword) -> Node;
```
## DeclareKeyword::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: DeclareKeyword) -> *Node;
```
## DeclareKeyword::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: DeclareKeyword) -> *Node;
```
## DeclareKeyword::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: DeclareKeyword) -> *Comment;
```
## DeclareKeyword::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: DeclareKeyword) -> Symbol;
```
## DeclareKeyword::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: DeclareKeyword) -> *Decorator;
```
## DeclareKeyword::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: DeclareKeyword, i: int) -> Modifier;
```
## DeclareKeyword::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: DeclareKeyword) -> string;
```
## DeclareKeyword::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *DeclareKeyword;
```
## DeclareKeyword::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: DeclareKeyword) -> Location;
```
## DeclareKeyword::is\<T\>

```rust
pub fn is<T>(self: DeclareKeyword) -> bool;
```
## DeclareKeyword::to\<T\>

```rust
pub fn to<T>(self: DeclareKeyword) -> <any>;
```
## DeclareKeyword::key\_neq

```rust
pub fn key_neq(self: DeclareKeyword, object: <any>) -> bool;
```
## DeclareKeyword::key\_eq

```rust
pub fn key_eq(self: DeclareKeyword, object: <any>) -> bool;
```
## DeclareKeyword::to\_set

```rust
pub fn to_set(self: DeclareKeyword) -> *DeclareKeyword;
```
