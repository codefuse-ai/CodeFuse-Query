# GreaterThanToken

Primary key: `id: int`

```rust
schema GreaterThanToken {
  @primary id: int,
}
```
## GreaterThanToken::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: GreaterThanToken) -> Location;
```
## GreaterThanToken::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: GreaterThanToken) -> Symbol;
```
## GreaterThanToken::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: GreaterThanToken) -> *Decorator;
```
## GreaterThanToken::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: GreaterThanToken) -> string;
```
## GreaterThanToken::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: GreaterThanToken, i: int) -> Modifier;
```
## GreaterThanToken::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: GreaterThanToken) -> *Comment;
```
## GreaterThanToken::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: GreaterThanToken) -> *Node;
```
## GreaterThanToken::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: GreaterThanToken) -> *Node;
```
## GreaterThanToken::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: GreaterThanToken) -> Node;
```
## GreaterThanToken::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: GreaterThanToken) -> int;
```
## GreaterThanToken::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: GreaterThanToken) -> TopLevelDO;
```
## GreaterThanToken::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: GreaterThanToken, i: int) -> Decorator;
```
## GreaterThanToken::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: GreaterThanToken) -> int;
```
## GreaterThanToken::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: GreaterThanToken) -> *Modifier;
```
## GreaterThanToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: GreaterThanToken) -> int;
```
## GreaterThanToken::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: GreaterThanToken, i: int) -> Node;
```
## GreaterThanToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: GreaterThanToken) -> int;
```
## GreaterThanToken::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: GreaterThanToken) -> *FunctionLikeDeclaration;
```
## GreaterThanToken::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: GreaterThanToken, level: int) -> *Node;
```
## GreaterThanToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: GreaterThanToken) -> int;
```
## GreaterThanToken::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: GreaterThanToken) -> string;
```
## GreaterThanToken::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: GreaterThanToken, level: int) -> Node;
```
## GreaterThanToken::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: GreaterThanToken) -> File;
```
## GreaterThanToken::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: GreaterThanToken) -> *Comment;
```
## GreaterThanToken::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: GreaterThanToken) -> *Comment;
```
## GreaterThanToken::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: GreaterThanToken) -> Node;
```
## GreaterThanToken::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: GreaterThanToken) -> FunctionLikeDeclaration;
```
## GreaterThanToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: GreaterThanToken) -> int;
```
## GreaterThanToken::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: GreaterThanToken) -> int;
```
## GreaterThanToken::getIndex

```rust
pub fn getIndex(self: GreaterThanToken) -> int;
```
## GreaterThanToken::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: GreaterThanToken) -> *Node;
```
## GreaterThanToken::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *GreaterThanToken;
```
## GreaterThanToken::is\<T\>

```rust
pub fn is<T>(self: GreaterThanToken) -> bool;
```
## GreaterThanToken::to\<T\>

```rust
pub fn to<T>(self: GreaterThanToken) -> <any>;
```
## GreaterThanToken::key\_neq

```rust
pub fn key_neq(self: GreaterThanToken, object: <any>) -> bool;
```
## GreaterThanToken::key\_eq

```rust
pub fn key_eq(self: GreaterThanToken, object: <any>) -> bool;
```
## GreaterThanToken::to\_set

```rust
pub fn to_set(self: GreaterThanToken) -> *GreaterThanToken;
```
