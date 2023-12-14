# BarBarToken

Primary key: `id: int`

```rust
schema BarBarToken {
  @primary id: int,
}
```
## BarBarToken::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: BarBarToken) -> Location;
```
## BarBarToken::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: BarBarToken) -> Symbol;
```
## BarBarToken::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: BarBarToken) -> *Decorator;
```
## BarBarToken::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: BarBarToken) -> string;
```
## BarBarToken::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: BarBarToken, i: int) -> Modifier;
```
## BarBarToken::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: BarBarToken) -> *Comment;
```
## BarBarToken::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: BarBarToken) -> *Node;
```
## BarBarToken::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: BarBarToken) -> *Node;
```
## BarBarToken::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: BarBarToken) -> Node;
```
## BarBarToken::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: BarBarToken) -> int;
```
## BarBarToken::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: BarBarToken) -> TopLevelDO;
```
## BarBarToken::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: BarBarToken, i: int) -> Decorator;
```
## BarBarToken::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: BarBarToken) -> int;
```
## BarBarToken::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: BarBarToken) -> *Modifier;
```
## BarBarToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: BarBarToken) -> int;
```
## BarBarToken::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: BarBarToken, i: int) -> Node;
```
## BarBarToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: BarBarToken) -> int;
```
## BarBarToken::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: BarBarToken) -> *FunctionLikeDeclaration;
```
## BarBarToken::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: BarBarToken, level: int) -> *Node;
```
## BarBarToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: BarBarToken) -> int;
```
## BarBarToken::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: BarBarToken) -> string;
```
## BarBarToken::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: BarBarToken, level: int) -> Node;
```
## BarBarToken::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: BarBarToken) -> File;
```
## BarBarToken::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: BarBarToken) -> *Comment;
```
## BarBarToken::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: BarBarToken) -> *Comment;
```
## BarBarToken::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: BarBarToken) -> Node;
```
## BarBarToken::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: BarBarToken) -> FunctionLikeDeclaration;
```
## BarBarToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: BarBarToken) -> int;
```
## BarBarToken::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: BarBarToken) -> int;
```
## BarBarToken::getIndex

```rust
pub fn getIndex(self: BarBarToken) -> int;
```
## BarBarToken::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: BarBarToken) -> *Node;
```
## BarBarToken::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *BarBarToken;
```
## BarBarToken::is\<T\>

```rust
pub fn is<T>(self: BarBarToken) -> bool;
```
## BarBarToken::to\<T\>

```rust
pub fn to<T>(self: BarBarToken) -> <any>;
```
## BarBarToken::key\_neq

```rust
pub fn key_neq(self: BarBarToken, object: <any>) -> bool;
```
## BarBarToken::key\_eq

```rust
pub fn key_eq(self: BarBarToken, object: <any>) -> bool;
```
## BarBarToken::to\_set

```rust
pub fn to_set(self: BarBarToken) -> *BarBarToken;
```
