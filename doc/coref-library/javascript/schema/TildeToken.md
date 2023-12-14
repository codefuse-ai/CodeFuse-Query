# TildeToken

Primary key: `id: int`

```rust
schema TildeToken {
  @primary id: int,
}
```
## TildeToken::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: TildeToken) -> Location;
```
## TildeToken::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: TildeToken) -> Symbol;
```
## TildeToken::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: TildeToken) -> *Decorator;
```
## TildeToken::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: TildeToken) -> string;
```
## TildeToken::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: TildeToken, i: int) -> Modifier;
```
## TildeToken::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: TildeToken) -> *Comment;
```
## TildeToken::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: TildeToken) -> *Node;
```
## TildeToken::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: TildeToken) -> *Node;
```
## TildeToken::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: TildeToken) -> Node;
```
## TildeToken::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: TildeToken) -> int;
```
## TildeToken::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: TildeToken) -> TopLevelDO;
```
## TildeToken::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: TildeToken, i: int) -> Decorator;
```
## TildeToken::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: TildeToken) -> int;
```
## TildeToken::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: TildeToken) -> *Modifier;
```
## TildeToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: TildeToken) -> int;
```
## TildeToken::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: TildeToken, i: int) -> Node;
```
## TildeToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: TildeToken) -> int;
```
## TildeToken::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: TildeToken) -> *FunctionLikeDeclaration;
```
## TildeToken::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: TildeToken, level: int) -> *Node;
```
## TildeToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: TildeToken) -> int;
```
## TildeToken::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: TildeToken) -> string;
```
## TildeToken::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: TildeToken, level: int) -> Node;
```
## TildeToken::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: TildeToken) -> File;
```
## TildeToken::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: TildeToken) -> *Comment;
```
## TildeToken::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: TildeToken) -> *Comment;
```
## TildeToken::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: TildeToken) -> Node;
```
## TildeToken::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: TildeToken) -> FunctionLikeDeclaration;
```
## TildeToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: TildeToken) -> int;
```
## TildeToken::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: TildeToken) -> int;
```
## TildeToken::getIndex

```rust
pub fn getIndex(self: TildeToken) -> int;
```
## TildeToken::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: TildeToken) -> *Node;
```
## TildeToken::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *TildeToken;
```
## TildeToken::is\<T\>

```rust
pub fn is<T>(self: TildeToken) -> bool;
```
## TildeToken::to\<T\>

```rust
pub fn to<T>(self: TildeToken) -> <any>;
```
## TildeToken::key\_neq

```rust
pub fn key_neq(self: TildeToken, object: <any>) -> bool;
```
## TildeToken::key\_eq

```rust
pub fn key_eq(self: TildeToken, object: <any>) -> bool;
```
## TildeToken::to\_set

```rust
pub fn to_set(self: TildeToken) -> *TildeToken;
```
