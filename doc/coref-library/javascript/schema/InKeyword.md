# InKeyword

Primary key: `id: int`

```rust
schema InKeyword {
  @primary id: int,
}
```
## InKeyword::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: InKeyword) -> Location;
```
## InKeyword::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: InKeyword) -> Symbol;
```
## InKeyword::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: InKeyword) -> *Decorator;
```
## InKeyword::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: InKeyword) -> string;
```
## InKeyword::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: InKeyword, i: int) -> Modifier;
```
## InKeyword::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: InKeyword) -> *Comment;
```
## InKeyword::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: InKeyword) -> *Node;
```
## InKeyword::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: InKeyword) -> *Node;
```
## InKeyword::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: InKeyword) -> Node;
```
## InKeyword::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: InKeyword) -> int;
```
## InKeyword::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: InKeyword) -> TopLevelDO;
```
## InKeyword::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: InKeyword, i: int) -> Decorator;
```
## InKeyword::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: InKeyword) -> int;
```
## InKeyword::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: InKeyword) -> *Modifier;
```
## InKeyword::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: InKeyword) -> int;
```
## InKeyword::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: InKeyword, i: int) -> Node;
```
## InKeyword::getStartLineNumber

```rust
pub fn getStartLineNumber(self: InKeyword) -> int;
```
## InKeyword::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: InKeyword) -> *FunctionLikeDeclaration;
```
## InKeyword::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: InKeyword, level: int) -> *Node;
```
## InKeyword::getEndLineNumber

```rust
pub fn getEndLineNumber(self: InKeyword) -> int;
```
## InKeyword::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: InKeyword) -> string;
```
## InKeyword::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: InKeyword, level: int) -> Node;
```
## InKeyword::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: InKeyword) -> File;
```
## InKeyword::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: InKeyword) -> *Comment;
```
## InKeyword::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: InKeyword) -> *Comment;
```
## InKeyword::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: InKeyword) -> Node;
```
## InKeyword::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: InKeyword) -> FunctionLikeDeclaration;
```
## InKeyword::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: InKeyword) -> int;
```
## InKeyword::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: InKeyword) -> int;
```
## InKeyword::getIndex

```rust
pub fn getIndex(self: InKeyword) -> int;
```
## InKeyword::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: InKeyword) -> *Node;
```
## InKeyword::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *InKeyword;
```
## InKeyword::is\<T\>

```rust
pub fn is<T>(self: InKeyword) -> bool;
```
## InKeyword::to\<T\>

```rust
pub fn to<T>(self: InKeyword) -> <any>;
```
## InKeyword::key\_neq

```rust
pub fn key_neq(self: InKeyword, object: <any>) -> bool;
```
## InKeyword::key\_eq

```rust
pub fn key_eq(self: InKeyword, object: <any>) -> bool;
```
## InKeyword::to\_set

```rust
pub fn to_set(self: InKeyword) -> *InKeyword;
```
