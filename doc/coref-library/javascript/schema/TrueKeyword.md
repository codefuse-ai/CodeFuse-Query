# TrueKeyword

Primary key: `id: int`

```rust
schema TrueKeyword {
  @primary id: int,
}
```
## TrueKeyword::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: TrueKeyword) -> Location;
```
## TrueKeyword::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: TrueKeyword) -> Symbol;
```
## TrueKeyword::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: TrueKeyword) -> *Decorator;
```
## TrueKeyword::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: TrueKeyword) -> string;
```
## TrueKeyword::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: TrueKeyword, i: int) -> Modifier;
```
## TrueKeyword::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: TrueKeyword) -> *Comment;
```
## TrueKeyword::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: TrueKeyword) -> *Node;
```
## TrueKeyword::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: TrueKeyword) -> *Node;
```
## TrueKeyword::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: TrueKeyword) -> Node;
```
## TrueKeyword::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: TrueKeyword) -> int;
```
## TrueKeyword::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: TrueKeyword) -> TopLevelDO;
```
## TrueKeyword::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: TrueKeyword, i: int) -> Decorator;
```
## TrueKeyword::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: TrueKeyword) -> int;
```
## TrueKeyword::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: TrueKeyword) -> *Modifier;
```
## TrueKeyword::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: TrueKeyword) -> int;
```
## TrueKeyword::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: TrueKeyword, i: int) -> Node;
```
## TrueKeyword::getStartLineNumber

```rust
pub fn getStartLineNumber(self: TrueKeyword) -> int;
```
## TrueKeyword::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: TrueKeyword) -> *FunctionLikeDeclaration;
```
## TrueKeyword::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: TrueKeyword, level: int) -> *Node;
```
## TrueKeyword::getEndLineNumber

```rust
pub fn getEndLineNumber(self: TrueKeyword) -> int;
```
## TrueKeyword::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: TrueKeyword) -> string;
```
## TrueKeyword::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: TrueKeyword, level: int) -> Node;
```
## TrueKeyword::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: TrueKeyword) -> File;
```
## TrueKeyword::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: TrueKeyword) -> *Comment;
```
## TrueKeyword::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: TrueKeyword) -> *Comment;
```
## TrueKeyword::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: TrueKeyword) -> Node;
```
## TrueKeyword::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: TrueKeyword) -> FunctionLikeDeclaration;
```
## TrueKeyword::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: TrueKeyword) -> int;
```
## TrueKeyword::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: TrueKeyword) -> int;
```
## TrueKeyword::getIndex

```rust
pub fn getIndex(self: TrueKeyword) -> int;
```
## TrueKeyword::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: TrueKeyword) -> *Node;
```
## TrueKeyword::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *TrueKeyword;
```
## TrueKeyword::is\<T\>

```rust
pub fn is<T>(self: TrueKeyword) -> bool;
```
## TrueKeyword::to\<T\>

```rust
pub fn to<T>(self: TrueKeyword) -> <any>;
```
## TrueKeyword::key\_neq

```rust
pub fn key_neq(self: TrueKeyword, object: <any>) -> bool;
```
## TrueKeyword::key\_eq

```rust
pub fn key_eq(self: TrueKeyword, object: <any>) -> bool;
```
## TrueKeyword::to\_set

```rust
pub fn to_set(self: TrueKeyword) -> *TrueKeyword;
```
