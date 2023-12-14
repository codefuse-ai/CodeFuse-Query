# UndefinedKeyword

Primary key: `id: int`

```rust
schema UndefinedKeyword {
  @primary id: int,
}
```
## UndefinedKeyword::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: UndefinedKeyword) -> Location;
```
## UndefinedKeyword::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: UndefinedKeyword) -> Symbol;
```
## UndefinedKeyword::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: UndefinedKeyword) -> *Decorator;
```
## UndefinedKeyword::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: UndefinedKeyword) -> string;
```
## UndefinedKeyword::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: UndefinedKeyword, i: int) -> Modifier;
```
## UndefinedKeyword::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: UndefinedKeyword) -> *Comment;
```
## UndefinedKeyword::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: UndefinedKeyword) -> *Node;
```
## UndefinedKeyword::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: UndefinedKeyword) -> *Node;
```
## UndefinedKeyword::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: UndefinedKeyword) -> Node;
```
## UndefinedKeyword::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: UndefinedKeyword) -> int;
```
## UndefinedKeyword::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: UndefinedKeyword) -> TopLevelDO;
```
## UndefinedKeyword::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: UndefinedKeyword, i: int) -> Decorator;
```
## UndefinedKeyword::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: UndefinedKeyword) -> int;
```
## UndefinedKeyword::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: UndefinedKeyword) -> *Modifier;
```
## UndefinedKeyword::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: UndefinedKeyword) -> int;
```
## UndefinedKeyword::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: UndefinedKeyword, i: int) -> Node;
```
## UndefinedKeyword::getStartLineNumber

```rust
pub fn getStartLineNumber(self: UndefinedKeyword) -> int;
```
## UndefinedKeyword::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: UndefinedKeyword) -> *FunctionLikeDeclaration;
```
## UndefinedKeyword::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: UndefinedKeyword, level: int) -> *Node;
```
## UndefinedKeyword::getEndLineNumber

```rust
pub fn getEndLineNumber(self: UndefinedKeyword) -> int;
```
## UndefinedKeyword::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: UndefinedKeyword) -> string;
```
## UndefinedKeyword::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: UndefinedKeyword, level: int) -> Node;
```
## UndefinedKeyword::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: UndefinedKeyword) -> File;
```
## UndefinedKeyword::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: UndefinedKeyword) -> *Comment;
```
## UndefinedKeyword::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: UndefinedKeyword) -> *Comment;
```
## UndefinedKeyword::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: UndefinedKeyword) -> Node;
```
## UndefinedKeyword::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: UndefinedKeyword) -> FunctionLikeDeclaration;
```
## UndefinedKeyword::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: UndefinedKeyword) -> int;
```
## UndefinedKeyword::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: UndefinedKeyword) -> int;
```
## UndefinedKeyword::getIndex

```rust
pub fn getIndex(self: UndefinedKeyword) -> int;
```
## UndefinedKeyword::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: UndefinedKeyword) -> *Node;
```
## UndefinedKeyword::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *UndefinedKeyword;
```
## UndefinedKeyword::is\<T\>

```rust
pub fn is<T>(self: UndefinedKeyword) -> bool;
```
## UndefinedKeyword::to\<T\>

```rust
pub fn to<T>(self: UndefinedKeyword) -> <any>;
```
## UndefinedKeyword::key\_neq

```rust
pub fn key_neq(self: UndefinedKeyword, object: <any>) -> bool;
```
## UndefinedKeyword::key\_eq

```rust
pub fn key_eq(self: UndefinedKeyword, object: <any>) -> bool;
```
## UndefinedKeyword::to\_set

```rust
pub fn to_set(self: UndefinedKeyword) -> *UndefinedKeyword;
```
