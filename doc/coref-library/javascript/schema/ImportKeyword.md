# ImportKeyword

Primary key: `id: int`

```rust
schema ImportKeyword {
  @primary id: int,
}
```
## ImportKeyword::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: ImportKeyword) -> Location;
```
## ImportKeyword::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: ImportKeyword) -> Symbol;
```
## ImportKeyword::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: ImportKeyword) -> *Decorator;
```
## ImportKeyword::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: ImportKeyword) -> string;
```
## ImportKeyword::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: ImportKeyword, i: int) -> Modifier;
```
## ImportKeyword::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: ImportKeyword) -> *Comment;
```
## ImportKeyword::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: ImportKeyword) -> *Node;
```
## ImportKeyword::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: ImportKeyword) -> *Node;
```
## ImportKeyword::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: ImportKeyword) -> Node;
```
## ImportKeyword::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: ImportKeyword) -> int;
```
## ImportKeyword::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: ImportKeyword) -> TopLevelDO;
```
## ImportKeyword::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: ImportKeyword, i: int) -> Decorator;
```
## ImportKeyword::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: ImportKeyword) -> int;
```
## ImportKeyword::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: ImportKeyword) -> *Modifier;
```
## ImportKeyword::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ImportKeyword) -> int;
```
## ImportKeyword::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: ImportKeyword, i: int) -> Node;
```
## ImportKeyword::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ImportKeyword) -> int;
```
## ImportKeyword::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ImportKeyword) -> *FunctionLikeDeclaration;
```
## ImportKeyword::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: ImportKeyword, level: int) -> *Node;
```
## ImportKeyword::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ImportKeyword) -> int;
```
## ImportKeyword::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: ImportKeyword) -> string;
```
## ImportKeyword::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: ImportKeyword, level: int) -> Node;
```
## ImportKeyword::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: ImportKeyword) -> File;
```
## ImportKeyword::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: ImportKeyword) -> *Comment;
```
## ImportKeyword::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: ImportKeyword) -> *Comment;
```
## ImportKeyword::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: ImportKeyword) -> Node;
```
## ImportKeyword::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: ImportKeyword) -> FunctionLikeDeclaration;
```
## ImportKeyword::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ImportKeyword) -> int;
```
## ImportKeyword::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: ImportKeyword) -> int;
```
## ImportKeyword::getIndex

```rust
pub fn getIndex(self: ImportKeyword) -> int;
```
## ImportKeyword::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: ImportKeyword) -> *Node;
```
## ImportKeyword::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *ImportKeyword;
```
## ImportKeyword::is\<T\>

```rust
pub fn is<T>(self: ImportKeyword) -> bool;
```
## ImportKeyword::to\<T\>

```rust
pub fn to<T>(self: ImportKeyword) -> <any>;
```
## ImportKeyword::key\_neq

```rust
pub fn key_neq(self: ImportKeyword, object: <any>) -> bool;
```
## ImportKeyword::key\_eq

```rust
pub fn key_eq(self: ImportKeyword, object: <any>) -> bool;
```
## ImportKeyword::to\_set

```rust
pub fn to_set(self: ImportKeyword) -> *ImportKeyword;
```
