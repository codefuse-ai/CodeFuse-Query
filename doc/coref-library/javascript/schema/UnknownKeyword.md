# UnknownKeyword

Primary key: `id: int`

```rust
schema UnknownKeyword {
  @primary id: int,
}
```
## UnknownKeyword::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: UnknownKeyword) -> Location;
```
## UnknownKeyword::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: UnknownKeyword) -> Symbol;
```
## UnknownKeyword::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: UnknownKeyword) -> *Decorator;
```
## UnknownKeyword::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: UnknownKeyword) -> string;
```
## UnknownKeyword::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: UnknownKeyword, i: int) -> Modifier;
```
## UnknownKeyword::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: UnknownKeyword) -> *Comment;
```
## UnknownKeyword::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: UnknownKeyword) -> *Node;
```
## UnknownKeyword::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: UnknownKeyword) -> *Node;
```
## UnknownKeyword::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: UnknownKeyword) -> Node;
```
## UnknownKeyword::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: UnknownKeyword) -> int;
```
## UnknownKeyword::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: UnknownKeyword) -> TopLevelDO;
```
## UnknownKeyword::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: UnknownKeyword, i: int) -> Decorator;
```
## UnknownKeyword::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: UnknownKeyword) -> int;
```
## UnknownKeyword::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: UnknownKeyword) -> *Modifier;
```
## UnknownKeyword::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: UnknownKeyword) -> int;
```
## UnknownKeyword::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: UnknownKeyword, i: int) -> Node;
```
## UnknownKeyword::getStartLineNumber

```rust
pub fn getStartLineNumber(self: UnknownKeyword) -> int;
```
## UnknownKeyword::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: UnknownKeyword) -> *FunctionLikeDeclaration;
```
## UnknownKeyword::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: UnknownKeyword, level: int) -> *Node;
```
## UnknownKeyword::getEndLineNumber

```rust
pub fn getEndLineNumber(self: UnknownKeyword) -> int;
```
## UnknownKeyword::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: UnknownKeyword) -> string;
```
## UnknownKeyword::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: UnknownKeyword, level: int) -> Node;
```
## UnknownKeyword::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: UnknownKeyword) -> File;
```
## UnknownKeyword::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: UnknownKeyword) -> *Comment;
```
## UnknownKeyword::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: UnknownKeyword) -> *Comment;
```
## UnknownKeyword::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: UnknownKeyword) -> Node;
```
## UnknownKeyword::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: UnknownKeyword) -> FunctionLikeDeclaration;
```
## UnknownKeyword::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: UnknownKeyword) -> int;
```
## UnknownKeyword::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: UnknownKeyword) -> int;
```
## UnknownKeyword::getIndex

```rust
pub fn getIndex(self: UnknownKeyword) -> int;
```
## UnknownKeyword::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: UnknownKeyword) -> *Node;
```
## UnknownKeyword::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *UnknownKeyword;
```
## UnknownKeyword::is\<T\>

```rust
pub fn is<T>(self: UnknownKeyword) -> bool;
```
## UnknownKeyword::to\<T\>

```rust
pub fn to<T>(self: UnknownKeyword) -> <any>;
```
## UnknownKeyword::key\_neq

```rust
pub fn key_neq(self: UnknownKeyword, object: <any>) -> bool;
```
## UnknownKeyword::key\_eq

```rust
pub fn key_eq(self: UnknownKeyword, object: <any>) -> bool;
```
## UnknownKeyword::to\_set

```rust
pub fn to_set(self: UnknownKeyword) -> *UnknownKeyword;
```
