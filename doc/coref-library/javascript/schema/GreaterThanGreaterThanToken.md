# GreaterThanGreaterThanToken

Primary key: `id: int`

```rust
schema GreaterThanGreaterThanToken {
  @primary id: int,
}
```
## GreaterThanGreaterThanToken::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: GreaterThanGreaterThanToken) -> Location;
```
## GreaterThanGreaterThanToken::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: GreaterThanGreaterThanToken) -> Symbol;
```
## GreaterThanGreaterThanToken::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: GreaterThanGreaterThanToken) -> *Decorator;
```
## GreaterThanGreaterThanToken::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: GreaterThanGreaterThanToken) -> string;
```
## GreaterThanGreaterThanToken::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: GreaterThanGreaterThanToken, i: int) -> Modifier;
```
## GreaterThanGreaterThanToken::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: GreaterThanGreaterThanToken) -> *Comment;
```
## GreaterThanGreaterThanToken::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: GreaterThanGreaterThanToken) -> *Node;
```
## GreaterThanGreaterThanToken::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: GreaterThanGreaterThanToken) -> *Node;
```
## GreaterThanGreaterThanToken::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: GreaterThanGreaterThanToken) -> Node;
```
## GreaterThanGreaterThanToken::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: GreaterThanGreaterThanToken) -> int;
```
## GreaterThanGreaterThanToken::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: GreaterThanGreaterThanToken) -> TopLevelDO;
```
## GreaterThanGreaterThanToken::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: GreaterThanGreaterThanToken, i: int) -> Decorator;
```
## GreaterThanGreaterThanToken::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: GreaterThanGreaterThanToken) -> int;
```
## GreaterThanGreaterThanToken::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: GreaterThanGreaterThanToken) -> *Modifier;
```
## GreaterThanGreaterThanToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: GreaterThanGreaterThanToken) -> int;
```
## GreaterThanGreaterThanToken::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: GreaterThanGreaterThanToken, i: int) -> Node;
```
## GreaterThanGreaterThanToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: GreaterThanGreaterThanToken) -> int;
```
## GreaterThanGreaterThanToken::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: GreaterThanGreaterThanToken) -> *FunctionLikeDeclaration;
```
## GreaterThanGreaterThanToken::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: GreaterThanGreaterThanToken, level: int) -> *Node;
```
## GreaterThanGreaterThanToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: GreaterThanGreaterThanToken) -> int;
```
## GreaterThanGreaterThanToken::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: GreaterThanGreaterThanToken) -> string;
```
## GreaterThanGreaterThanToken::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: GreaterThanGreaterThanToken, level: int) -> Node;
```
## GreaterThanGreaterThanToken::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: GreaterThanGreaterThanToken) -> File;
```
## GreaterThanGreaterThanToken::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: GreaterThanGreaterThanToken) -> *Comment;
```
## GreaterThanGreaterThanToken::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: GreaterThanGreaterThanToken) -> *Comment;
```
## GreaterThanGreaterThanToken::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: GreaterThanGreaterThanToken) -> Node;
```
## GreaterThanGreaterThanToken::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: GreaterThanGreaterThanToken) -> FunctionLikeDeclaration;
```
## GreaterThanGreaterThanToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: GreaterThanGreaterThanToken) -> int;
```
## GreaterThanGreaterThanToken::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: GreaterThanGreaterThanToken) -> int;
```
## GreaterThanGreaterThanToken::getIndex

```rust
pub fn getIndex(self: GreaterThanGreaterThanToken) -> int;
```
## GreaterThanGreaterThanToken::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: GreaterThanGreaterThanToken) -> *Node;
```
## GreaterThanGreaterThanToken::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *GreaterThanGreaterThanToken;
```
## GreaterThanGreaterThanToken::is\<T\>

```rust
pub fn is<T>(self: GreaterThanGreaterThanToken) -> bool;
```
## GreaterThanGreaterThanToken::to\<T\>

```rust
pub fn to<T>(self: GreaterThanGreaterThanToken) -> <any>;
```
## GreaterThanGreaterThanToken::key\_neq

```rust
pub fn key_neq(self: GreaterThanGreaterThanToken, object: <any>) -> bool;
```
## GreaterThanGreaterThanToken::key\_eq

```rust
pub fn key_eq(self: GreaterThanGreaterThanToken, object: <any>) -> bool;
```
## GreaterThanGreaterThanToken::to\_set

```rust
pub fn to_set(self: GreaterThanGreaterThanToken) -> *GreaterThanGreaterThanToken;
```
