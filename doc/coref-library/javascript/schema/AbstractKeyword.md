# AbstractKeyword

Primary key: `id: int`

```rust
schema AbstractKeyword {
  @primary id: int,
}
```
## AbstractKeyword::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: AbstractKeyword) -> *Node;
```
## AbstractKeyword::getIndex

```rust
pub fn getIndex(self: AbstractKeyword) -> int;
```
## AbstractKeyword::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: AbstractKeyword) -> int;
```
## AbstractKeyword::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: AbstractKeyword) -> int;
```
## AbstractKeyword::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: AbstractKeyword) -> FunctionLikeDeclaration;
```
## AbstractKeyword::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: AbstractKeyword) -> Node;
```
## AbstractKeyword::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: AbstractKeyword) -> *Comment;
```
## AbstractKeyword::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: AbstractKeyword) -> *Comment;
```
## AbstractKeyword::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: AbstractKeyword) -> File;
```
## AbstractKeyword::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: AbstractKeyword, level: int) -> Node;
```
## AbstractKeyword::getEndLineNumber

```rust
pub fn getEndLineNumber(self: AbstractKeyword) -> int;
```
## AbstractKeyword::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: AbstractKeyword) -> string;
```
## AbstractKeyword::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: AbstractKeyword) -> *FunctionLikeDeclaration;
```
## AbstractKeyword::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: AbstractKeyword, level: int) -> *Node;
```
## AbstractKeyword::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: AbstractKeyword) -> int;
```
## AbstractKeyword::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: AbstractKeyword) -> *Modifier;
```
## AbstractKeyword::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: AbstractKeyword) -> int;
```
## AbstractKeyword::getStartLineNumber

```rust
pub fn getStartLineNumber(self: AbstractKeyword) -> int;
```
## AbstractKeyword::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: AbstractKeyword, i: int) -> Node;
```
## AbstractKeyword::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: AbstractKeyword, i: int) -> Decorator;
```
## AbstractKeyword::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: AbstractKeyword) -> TopLevelDO;
```
## AbstractKeyword::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: AbstractKeyword) -> int;
```
## AbstractKeyword::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: AbstractKeyword) -> Node;
```
## AbstractKeyword::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: AbstractKeyword) -> *Node;
```
## AbstractKeyword::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: AbstractKeyword) -> *Node;
```
## AbstractKeyword::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: AbstractKeyword) -> *Comment;
```
## AbstractKeyword::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: AbstractKeyword) -> Symbol;
```
## AbstractKeyword::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: AbstractKeyword) -> *Decorator;
```
## AbstractKeyword::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: AbstractKeyword, i: int) -> Modifier;
```
## AbstractKeyword::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: AbstractKeyword) -> string;
```
## AbstractKeyword::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *AbstractKeyword;
```
## AbstractKeyword::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: AbstractKeyword) -> Location;
```
## AbstractKeyword::is\<T\>

```rust
pub fn is<T>(self: AbstractKeyword) -> bool;
```
## AbstractKeyword::to\<T\>

```rust
pub fn to<T>(self: AbstractKeyword) -> <any>;
```
## AbstractKeyword::key\_neq

```rust
pub fn key_neq(self: AbstractKeyword, object: <any>) -> bool;
```
## AbstractKeyword::key\_eq

```rust
pub fn key_eq(self: AbstractKeyword, object: <any>) -> bool;
```
## AbstractKeyword::to\_set

```rust
pub fn to_set(self: AbstractKeyword) -> *AbstractKeyword;
```
