# BarEqualsToken

Primary key: `id: int`

```rust
schema BarEqualsToken {
  @primary id: int,
}
```
## BarEqualsToken::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: BarEqualsToken) -> Location;
```
## BarEqualsToken::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: BarEqualsToken) -> Symbol;
```
## BarEqualsToken::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: BarEqualsToken) -> *Decorator;
```
## BarEqualsToken::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: BarEqualsToken) -> string;
```
## BarEqualsToken::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: BarEqualsToken, i: int) -> Modifier;
```
## BarEqualsToken::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: BarEqualsToken) -> *Comment;
```
## BarEqualsToken::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: BarEqualsToken) -> *Node;
```
## BarEqualsToken::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: BarEqualsToken) -> *Node;
```
## BarEqualsToken::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: BarEqualsToken) -> Node;
```
## BarEqualsToken::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: BarEqualsToken) -> int;
```
## BarEqualsToken::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: BarEqualsToken) -> TopLevelDO;
```
## BarEqualsToken::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: BarEqualsToken, i: int) -> Decorator;
```
## BarEqualsToken::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: BarEqualsToken) -> int;
```
## BarEqualsToken::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: BarEqualsToken) -> *Modifier;
```
## BarEqualsToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: BarEqualsToken) -> int;
```
## BarEqualsToken::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: BarEqualsToken, i: int) -> Node;
```
## BarEqualsToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: BarEqualsToken) -> int;
```
## BarEqualsToken::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: BarEqualsToken) -> *FunctionLikeDeclaration;
```
## BarEqualsToken::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: BarEqualsToken, level: int) -> *Node;
```
## BarEqualsToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: BarEqualsToken) -> int;
```
## BarEqualsToken::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: BarEqualsToken) -> string;
```
## BarEqualsToken::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: BarEqualsToken, level: int) -> Node;
```
## BarEqualsToken::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: BarEqualsToken) -> File;
```
## BarEqualsToken::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: BarEqualsToken) -> *Comment;
```
## BarEqualsToken::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: BarEqualsToken) -> *Comment;
```
## BarEqualsToken::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: BarEqualsToken) -> Node;
```
## BarEqualsToken::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: BarEqualsToken) -> FunctionLikeDeclaration;
```
## BarEqualsToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: BarEqualsToken) -> int;
```
## BarEqualsToken::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: BarEqualsToken) -> int;
```
## BarEqualsToken::getIndex

```rust
pub fn getIndex(self: BarEqualsToken) -> int;
```
## BarEqualsToken::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: BarEqualsToken) -> *Node;
```
## BarEqualsToken::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *BarEqualsToken;
```
## BarEqualsToken::is\<T\>

```rust
pub fn is<T>(self: BarEqualsToken) -> bool;
```
## BarEqualsToken::to\<T\>

```rust
pub fn to<T>(self: BarEqualsToken) -> <any>;
```
## BarEqualsToken::key\_neq

```rust
pub fn key_neq(self: BarEqualsToken, object: <any>) -> bool;
```
## BarEqualsToken::key\_eq

```rust
pub fn key_eq(self: BarEqualsToken, object: <any>) -> bool;
```
## BarEqualsToken::to\_set

```rust
pub fn to_set(self: BarEqualsToken) -> *BarEqualsToken;
```
