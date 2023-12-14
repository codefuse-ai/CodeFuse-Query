# VoidKeyword

Primary key: `id: int`

```rust
schema VoidKeyword {
  @primary id: int,
}
```
## VoidKeyword::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: VoidKeyword) -> Location;
```
## VoidKeyword::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: VoidKeyword) -> Symbol;
```
## VoidKeyword::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: VoidKeyword) -> *Decorator;
```
## VoidKeyword::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: VoidKeyword) -> string;
```
## VoidKeyword::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: VoidKeyword, i: int) -> Modifier;
```
## VoidKeyword::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: VoidKeyword) -> *Comment;
```
## VoidKeyword::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: VoidKeyword) -> *Node;
```
## VoidKeyword::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: VoidKeyword) -> *Node;
```
## VoidKeyword::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: VoidKeyword) -> Node;
```
## VoidKeyword::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: VoidKeyword) -> int;
```
## VoidKeyword::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: VoidKeyword) -> TopLevelDO;
```
## VoidKeyword::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: VoidKeyword, i: int) -> Decorator;
```
## VoidKeyword::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: VoidKeyword) -> int;
```
## VoidKeyword::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: VoidKeyword) -> *Modifier;
```
## VoidKeyword::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: VoidKeyword) -> int;
```
## VoidKeyword::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: VoidKeyword, i: int) -> Node;
```
## VoidKeyword::getStartLineNumber

```rust
pub fn getStartLineNumber(self: VoidKeyword) -> int;
```
## VoidKeyword::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: VoidKeyword) -> *FunctionLikeDeclaration;
```
## VoidKeyword::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: VoidKeyword, level: int) -> *Node;
```
## VoidKeyword::getEndLineNumber

```rust
pub fn getEndLineNumber(self: VoidKeyword) -> int;
```
## VoidKeyword::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: VoidKeyword) -> string;
```
## VoidKeyword::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: VoidKeyword, level: int) -> Node;
```
## VoidKeyword::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: VoidKeyword) -> File;
```
## VoidKeyword::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: VoidKeyword) -> *Comment;
```
## VoidKeyword::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: VoidKeyword) -> *Comment;
```
## VoidKeyword::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: VoidKeyword) -> Node;
```
## VoidKeyword::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: VoidKeyword) -> FunctionLikeDeclaration;
```
## VoidKeyword::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: VoidKeyword) -> int;
```
## VoidKeyword::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: VoidKeyword) -> int;
```
## VoidKeyword::getIndex

```rust
pub fn getIndex(self: VoidKeyword) -> int;
```
## VoidKeyword::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: VoidKeyword) -> *Node;
```
## VoidKeyword::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *VoidKeyword;
```
## VoidKeyword::is\<T\>

```rust
pub fn is<T>(self: VoidKeyword) -> bool;
```
## VoidKeyword::to\<T\>

```rust
pub fn to<T>(self: VoidKeyword) -> <any>;
```
## VoidKeyword::key\_neq

```rust
pub fn key_neq(self: VoidKeyword, object: <any>) -> bool;
```
## VoidKeyword::key\_eq

```rust
pub fn key_eq(self: VoidKeyword, object: <any>) -> bool;
```
## VoidKeyword::to\_set

```rust
pub fn to_set(self: VoidKeyword) -> *VoidKeyword;
```
