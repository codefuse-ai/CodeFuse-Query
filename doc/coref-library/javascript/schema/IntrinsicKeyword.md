# IntrinsicKeyword

Primary key: `id: int`

```rust
schema IntrinsicKeyword {
  @primary id: int,
}
```
## IntrinsicKeyword::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: IntrinsicKeyword) -> Location;
```
## IntrinsicKeyword::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: IntrinsicKeyword) -> Symbol;
```
## IntrinsicKeyword::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: IntrinsicKeyword) -> *Decorator;
```
## IntrinsicKeyword::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: IntrinsicKeyword) -> string;
```
## IntrinsicKeyword::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: IntrinsicKeyword, i: int) -> Modifier;
```
## IntrinsicKeyword::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: IntrinsicKeyword) -> *Comment;
```
## IntrinsicKeyword::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: IntrinsicKeyword) -> *Node;
```
## IntrinsicKeyword::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: IntrinsicKeyword) -> *Node;
```
## IntrinsicKeyword::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: IntrinsicKeyword) -> Node;
```
## IntrinsicKeyword::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: IntrinsicKeyword) -> int;
```
## IntrinsicKeyword::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: IntrinsicKeyword) -> TopLevelDO;
```
## IntrinsicKeyword::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: IntrinsicKeyword, i: int) -> Decorator;
```
## IntrinsicKeyword::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: IntrinsicKeyword) -> int;
```
## IntrinsicKeyword::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: IntrinsicKeyword) -> *Modifier;
```
## IntrinsicKeyword::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: IntrinsicKeyword) -> int;
```
## IntrinsicKeyword::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: IntrinsicKeyword, i: int) -> Node;
```
## IntrinsicKeyword::getStartLineNumber

```rust
pub fn getStartLineNumber(self: IntrinsicKeyword) -> int;
```
## IntrinsicKeyword::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: IntrinsicKeyword) -> *FunctionLikeDeclaration;
```
## IntrinsicKeyword::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: IntrinsicKeyword, level: int) -> *Node;
```
## IntrinsicKeyword::getEndLineNumber

```rust
pub fn getEndLineNumber(self: IntrinsicKeyword) -> int;
```
## IntrinsicKeyword::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: IntrinsicKeyword) -> string;
```
## IntrinsicKeyword::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: IntrinsicKeyword, level: int) -> Node;
```
## IntrinsicKeyword::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: IntrinsicKeyword) -> File;
```
## IntrinsicKeyword::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: IntrinsicKeyword) -> *Comment;
```
## IntrinsicKeyword::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: IntrinsicKeyword) -> *Comment;
```
## IntrinsicKeyword::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: IntrinsicKeyword) -> Node;
```
## IntrinsicKeyword::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: IntrinsicKeyword) -> FunctionLikeDeclaration;
```
## IntrinsicKeyword::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: IntrinsicKeyword) -> int;
```
## IntrinsicKeyword::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: IntrinsicKeyword) -> int;
```
## IntrinsicKeyword::getIndex

```rust
pub fn getIndex(self: IntrinsicKeyword) -> int;
```
## IntrinsicKeyword::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: IntrinsicKeyword) -> *Node;
```
## IntrinsicKeyword::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *IntrinsicKeyword;
```
## IntrinsicKeyword::is\<T\>

```rust
pub fn is<T>(self: IntrinsicKeyword) -> bool;
```
## IntrinsicKeyword::to\<T\>

```rust
pub fn to<T>(self: IntrinsicKeyword) -> <any>;
```
## IntrinsicKeyword::key\_neq

```rust
pub fn key_neq(self: IntrinsicKeyword, object: <any>) -> bool;
```
## IntrinsicKeyword::key\_eq

```rust
pub fn key_eq(self: IntrinsicKeyword, object: <any>) -> bool;
```
## IntrinsicKeyword::to\_set

```rust
pub fn to_set(self: IntrinsicKeyword) -> *IntrinsicKeyword;
```
