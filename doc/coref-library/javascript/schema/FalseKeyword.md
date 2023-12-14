# FalseKeyword

Primary key: `id: int`

```rust
schema FalseKeyword {
  @primary id: int,
}
```
## FalseKeyword::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: FalseKeyword) -> Location;
```
## FalseKeyword::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: FalseKeyword) -> Symbol;
```
## FalseKeyword::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: FalseKeyword) -> *Decorator;
```
## FalseKeyword::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: FalseKeyword) -> string;
```
## FalseKeyword::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: FalseKeyword, i: int) -> Modifier;
```
## FalseKeyword::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: FalseKeyword) -> *Comment;
```
## FalseKeyword::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: FalseKeyword) -> *Node;
```
## FalseKeyword::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: FalseKeyword) -> *Node;
```
## FalseKeyword::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: FalseKeyword) -> Node;
```
## FalseKeyword::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: FalseKeyword) -> int;
```
## FalseKeyword::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: FalseKeyword) -> TopLevelDO;
```
## FalseKeyword::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: FalseKeyword, i: int) -> Decorator;
```
## FalseKeyword::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: FalseKeyword) -> int;
```
## FalseKeyword::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: FalseKeyword) -> *Modifier;
```
## FalseKeyword::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: FalseKeyword) -> int;
```
## FalseKeyword::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: FalseKeyword, i: int) -> Node;
```
## FalseKeyword::getStartLineNumber

```rust
pub fn getStartLineNumber(self: FalseKeyword) -> int;
```
## FalseKeyword::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: FalseKeyword) -> *FunctionLikeDeclaration;
```
## FalseKeyword::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: FalseKeyword, level: int) -> *Node;
```
## FalseKeyword::getEndLineNumber

```rust
pub fn getEndLineNumber(self: FalseKeyword) -> int;
```
## FalseKeyword::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: FalseKeyword) -> string;
```
## FalseKeyword::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: FalseKeyword, level: int) -> Node;
```
## FalseKeyword::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: FalseKeyword) -> File;
```
## FalseKeyword::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: FalseKeyword) -> *Comment;
```
## FalseKeyword::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: FalseKeyword) -> *Comment;
```
## FalseKeyword::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: FalseKeyword) -> Node;
```
## FalseKeyword::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: FalseKeyword) -> FunctionLikeDeclaration;
```
## FalseKeyword::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: FalseKeyword) -> int;
```
## FalseKeyword::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: FalseKeyword) -> int;
```
## FalseKeyword::getIndex

```rust
pub fn getIndex(self: FalseKeyword) -> int;
```
## FalseKeyword::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: FalseKeyword) -> *Node;
```
## FalseKeyword::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *FalseKeyword;
```
## FalseKeyword::is\<T\>

```rust
pub fn is<T>(self: FalseKeyword) -> bool;
```
## FalseKeyword::to\<T\>

```rust
pub fn to<T>(self: FalseKeyword) -> <any>;
```
## FalseKeyword::key\_neq

```rust
pub fn key_neq(self: FalseKeyword, object: <any>) -> bool;
```
## FalseKeyword::key\_eq

```rust
pub fn key_eq(self: FalseKeyword, object: <any>) -> bool;
```
## FalseKeyword::to\_set

```rust
pub fn to_set(self: FalseKeyword) -> *FalseKeyword;
```
