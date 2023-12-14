# NullKeyword

Primary key: `id: int`

```rust
schema NullKeyword {
  @primary id: int,
}
```
## NullKeyword::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: NullKeyword) -> Location;
```
## NullKeyword::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: NullKeyword) -> Symbol;
```
## NullKeyword::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: NullKeyword) -> *Decorator;
```
## NullKeyword::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: NullKeyword) -> string;
```
## NullKeyword::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: NullKeyword, i: int) -> Modifier;
```
## NullKeyword::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: NullKeyword) -> *Comment;
```
## NullKeyword::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: NullKeyword) -> *Node;
```
## NullKeyword::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: NullKeyword) -> *Node;
```
## NullKeyword::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: NullKeyword) -> Node;
```
## NullKeyword::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: NullKeyword) -> int;
```
## NullKeyword::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: NullKeyword) -> TopLevelDO;
```
## NullKeyword::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: NullKeyword, i: int) -> Decorator;
```
## NullKeyword::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: NullKeyword) -> int;
```
## NullKeyword::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: NullKeyword) -> *Modifier;
```
## NullKeyword::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: NullKeyword) -> int;
```
## NullKeyword::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: NullKeyword, i: int) -> Node;
```
## NullKeyword::getStartLineNumber

```rust
pub fn getStartLineNumber(self: NullKeyword) -> int;
```
## NullKeyword::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: NullKeyword) -> *FunctionLikeDeclaration;
```
## NullKeyword::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: NullKeyword, level: int) -> *Node;
```
## NullKeyword::getEndLineNumber

```rust
pub fn getEndLineNumber(self: NullKeyword) -> int;
```
## NullKeyword::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: NullKeyword) -> string;
```
## NullKeyword::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: NullKeyword, level: int) -> Node;
```
## NullKeyword::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: NullKeyword) -> File;
```
## NullKeyword::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: NullKeyword) -> *Comment;
```
## NullKeyword::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: NullKeyword) -> *Comment;
```
## NullKeyword::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: NullKeyword) -> Node;
```
## NullKeyword::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: NullKeyword) -> FunctionLikeDeclaration;
```
## NullKeyword::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: NullKeyword) -> int;
```
## NullKeyword::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: NullKeyword) -> int;
```
## NullKeyword::getIndex

```rust
pub fn getIndex(self: NullKeyword) -> int;
```
## NullKeyword::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: NullKeyword) -> *Node;
```
## NullKeyword::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *NullKeyword;
```
## NullKeyword::is\<T\>

```rust
pub fn is<T>(self: NullKeyword) -> bool;
```
## NullKeyword::to\<T\>

```rust
pub fn to<T>(self: NullKeyword) -> <any>;
```
## NullKeyword::key\_neq

```rust
pub fn key_neq(self: NullKeyword, object: <any>) -> bool;
```
## NullKeyword::key\_eq

```rust
pub fn key_eq(self: NullKeyword, object: <any>) -> bool;
```
## NullKeyword::to\_set

```rust
pub fn to_set(self: NullKeyword) -> *NullKeyword;
```
