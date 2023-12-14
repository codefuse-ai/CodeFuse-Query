# StringKeyword

Primary key: `id: int`

```rust
schema StringKeyword {
  @primary id: int,
}
```
## StringKeyword::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: StringKeyword) -> Location;
```
## StringKeyword::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: StringKeyword) -> Symbol;
```
## StringKeyword::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: StringKeyword) -> *Decorator;
```
## StringKeyword::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: StringKeyword) -> string;
```
## StringKeyword::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: StringKeyword, i: int) -> Modifier;
```
## StringKeyword::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: StringKeyword) -> *Comment;
```
## StringKeyword::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: StringKeyword) -> *Node;
```
## StringKeyword::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: StringKeyword) -> *Node;
```
## StringKeyword::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: StringKeyword) -> Node;
```
## StringKeyword::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: StringKeyword) -> int;
```
## StringKeyword::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: StringKeyword) -> TopLevelDO;
```
## StringKeyword::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: StringKeyword, i: int) -> Decorator;
```
## StringKeyword::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: StringKeyword) -> int;
```
## StringKeyword::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: StringKeyword) -> *Modifier;
```
## StringKeyword::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: StringKeyword) -> int;
```
## StringKeyword::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: StringKeyword, i: int) -> Node;
```
## StringKeyword::getStartLineNumber

```rust
pub fn getStartLineNumber(self: StringKeyword) -> int;
```
## StringKeyword::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: StringKeyword) -> *FunctionLikeDeclaration;
```
## StringKeyword::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: StringKeyword, level: int) -> *Node;
```
## StringKeyword::getEndLineNumber

```rust
pub fn getEndLineNumber(self: StringKeyword) -> int;
```
## StringKeyword::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: StringKeyword) -> string;
```
## StringKeyword::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: StringKeyword, level: int) -> Node;
```
## StringKeyword::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: StringKeyword) -> File;
```
## StringKeyword::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: StringKeyword) -> *Comment;
```
## StringKeyword::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: StringKeyword) -> *Comment;
```
## StringKeyword::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: StringKeyword) -> Node;
```
## StringKeyword::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: StringKeyword) -> FunctionLikeDeclaration;
```
## StringKeyword::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: StringKeyword) -> int;
```
## StringKeyword::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: StringKeyword) -> int;
```
## StringKeyword::getIndex

```rust
pub fn getIndex(self: StringKeyword) -> int;
```
## StringKeyword::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: StringKeyword) -> *Node;
```
## StringKeyword::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *StringKeyword;
```
## StringKeyword::is\<T\>

```rust
pub fn is<T>(self: StringKeyword) -> bool;
```
## StringKeyword::to\<T\>

```rust
pub fn to<T>(self: StringKeyword) -> <any>;
```
## StringKeyword::key\_neq

```rust
pub fn key_neq(self: StringKeyword, object: <any>) -> bool;
```
## StringKeyword::key\_eq

```rust
pub fn key_eq(self: StringKeyword, object: <any>) -> bool;
```
## StringKeyword::to\_set

```rust
pub fn to_set(self: StringKeyword) -> *StringKeyword;
```
