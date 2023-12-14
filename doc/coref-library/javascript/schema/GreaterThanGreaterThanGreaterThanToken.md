# GreaterThanGreaterThanGreaterThanToken

Primary key: `id: int`

```rust
schema GreaterThanGreaterThanGreaterThanToken {
  @primary id: int,
}
```
## GreaterThanGreaterThanGreaterThanToken::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: GreaterThanGreaterThanGreaterThanToken) -> Location;
```
## GreaterThanGreaterThanGreaterThanToken::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: GreaterThanGreaterThanGreaterThanToken) -> Symbol;
```
## GreaterThanGreaterThanGreaterThanToken::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: GreaterThanGreaterThanGreaterThanToken) -> *Decorator;
```
## GreaterThanGreaterThanGreaterThanToken::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: GreaterThanGreaterThanGreaterThanToken) -> string;
```
## GreaterThanGreaterThanGreaterThanToken::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: GreaterThanGreaterThanGreaterThanToken, i: int) -> Modifier;
```
## GreaterThanGreaterThanGreaterThanToken::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: GreaterThanGreaterThanGreaterThanToken) -> *Comment;
```
## GreaterThanGreaterThanGreaterThanToken::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: GreaterThanGreaterThanGreaterThanToken) -> *Node;
```
## GreaterThanGreaterThanGreaterThanToken::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: GreaterThanGreaterThanGreaterThanToken) -> *Node;
```
## GreaterThanGreaterThanGreaterThanToken::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: GreaterThanGreaterThanGreaterThanToken) -> Node;
```
## GreaterThanGreaterThanGreaterThanToken::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: GreaterThanGreaterThanGreaterThanToken) -> int;
```
## GreaterThanGreaterThanGreaterThanToken::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: GreaterThanGreaterThanGreaterThanToken) -> TopLevelDO;
```
## GreaterThanGreaterThanGreaterThanToken::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: GreaterThanGreaterThanGreaterThanToken, i: int) -> Decorator;
```
## GreaterThanGreaterThanGreaterThanToken::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: GreaterThanGreaterThanGreaterThanToken) -> int;
```
## GreaterThanGreaterThanGreaterThanToken::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: GreaterThanGreaterThanGreaterThanToken) -> *Modifier;
```
## GreaterThanGreaterThanGreaterThanToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: GreaterThanGreaterThanGreaterThanToken) -> int;
```
## GreaterThanGreaterThanGreaterThanToken::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: GreaterThanGreaterThanGreaterThanToken, i: int) -> Node;
```
## GreaterThanGreaterThanGreaterThanToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: GreaterThanGreaterThanGreaterThanToken) -> int;
```
## GreaterThanGreaterThanGreaterThanToken::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: GreaterThanGreaterThanGreaterThanToken) -> *FunctionLikeDeclaration;
```
## GreaterThanGreaterThanGreaterThanToken::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: GreaterThanGreaterThanGreaterThanToken, level: int) -> *Node;
```
## GreaterThanGreaterThanGreaterThanToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: GreaterThanGreaterThanGreaterThanToken) -> int;
```
## GreaterThanGreaterThanGreaterThanToken::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: GreaterThanGreaterThanGreaterThanToken) -> string;
```
## GreaterThanGreaterThanGreaterThanToken::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: GreaterThanGreaterThanGreaterThanToken, level: int) -> Node;
```
## GreaterThanGreaterThanGreaterThanToken::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: GreaterThanGreaterThanGreaterThanToken) -> File;
```
## GreaterThanGreaterThanGreaterThanToken::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: GreaterThanGreaterThanGreaterThanToken) -> *Comment;
```
## GreaterThanGreaterThanGreaterThanToken::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: GreaterThanGreaterThanGreaterThanToken) -> *Comment;
```
## GreaterThanGreaterThanGreaterThanToken::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: GreaterThanGreaterThanGreaterThanToken) -> Node;
```
## GreaterThanGreaterThanGreaterThanToken::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: GreaterThanGreaterThanGreaterThanToken) -> FunctionLikeDeclaration;
```
## GreaterThanGreaterThanGreaterThanToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: GreaterThanGreaterThanGreaterThanToken) -> int;
```
## GreaterThanGreaterThanGreaterThanToken::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: GreaterThanGreaterThanGreaterThanToken) -> int;
```
## GreaterThanGreaterThanGreaterThanToken::getIndex

```rust
pub fn getIndex(self: GreaterThanGreaterThanGreaterThanToken) -> int;
```
## GreaterThanGreaterThanGreaterThanToken::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: GreaterThanGreaterThanGreaterThanToken) -> *Node;
```
## GreaterThanGreaterThanGreaterThanToken::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *GreaterThanGreaterThanGreaterThanToken;
```
## GreaterThanGreaterThanGreaterThanToken::is\<T\>

```rust
pub fn is<T>(self: GreaterThanGreaterThanGreaterThanToken) -> bool;
```
## GreaterThanGreaterThanGreaterThanToken::to\<T\>

```rust
pub fn to<T>(self: GreaterThanGreaterThanGreaterThanToken) -> <any>;
```
## GreaterThanGreaterThanGreaterThanToken::key\_neq

```rust
pub fn key_neq(self: GreaterThanGreaterThanGreaterThanToken, object: <any>) -> bool;
```
## GreaterThanGreaterThanGreaterThanToken::key\_eq

```rust
pub fn key_eq(self: GreaterThanGreaterThanGreaterThanToken, object: <any>) -> bool;
```
## GreaterThanGreaterThanGreaterThanToken::to\_set

```rust
pub fn to_set(self: GreaterThanGreaterThanGreaterThanToken) -> *GreaterThanGreaterThanGreaterThanToken;
```
