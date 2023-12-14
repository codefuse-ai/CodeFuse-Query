# BarToken

Primary key: `id: int`

```rust
schema BarToken {
  @primary id: int,
}
```
## BarToken::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: BarToken) -> Location;
```
## BarToken::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: BarToken) -> Symbol;
```
## BarToken::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: BarToken) -> *Decorator;
```
## BarToken::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: BarToken) -> string;
```
## BarToken::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: BarToken, i: int) -> Modifier;
```
## BarToken::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: BarToken) -> *Comment;
```
## BarToken::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: BarToken) -> *Node;
```
## BarToken::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: BarToken) -> *Node;
```
## BarToken::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: BarToken) -> Node;
```
## BarToken::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: BarToken) -> int;
```
## BarToken::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: BarToken) -> TopLevelDO;
```
## BarToken::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: BarToken, i: int) -> Decorator;
```
## BarToken::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: BarToken) -> int;
```
## BarToken::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: BarToken) -> *Modifier;
```
## BarToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: BarToken) -> int;
```
## BarToken::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: BarToken, i: int) -> Node;
```
## BarToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: BarToken) -> int;
```
## BarToken::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: BarToken) -> *FunctionLikeDeclaration;
```
## BarToken::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: BarToken, level: int) -> *Node;
```
## BarToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: BarToken) -> int;
```
## BarToken::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: BarToken) -> string;
```
## BarToken::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: BarToken, level: int) -> Node;
```
## BarToken::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: BarToken) -> File;
```
## BarToken::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: BarToken) -> *Comment;
```
## BarToken::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: BarToken) -> *Comment;
```
## BarToken::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: BarToken) -> Node;
```
## BarToken::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: BarToken) -> FunctionLikeDeclaration;
```
## BarToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: BarToken) -> int;
```
## BarToken::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: BarToken) -> int;
```
## BarToken::getIndex

```rust
pub fn getIndex(self: BarToken) -> int;
```
## BarToken::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: BarToken) -> *Node;
```
## BarToken::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *BarToken;
```
## BarToken::is\<T\>

```rust
pub fn is<T>(self: BarToken) -> bool;
```
## BarToken::to\<T\>

```rust
pub fn to<T>(self: BarToken) -> <any>;
```
## BarToken::key\_neq

```rust
pub fn key_neq(self: BarToken, object: <any>) -> bool;
```
## BarToken::key\_eq

```rust
pub fn key_eq(self: BarToken, object: <any>) -> bool;
```
## BarToken::to\_set

```rust
pub fn to_set(self: BarToken) -> *BarToken;
```
