# DotDotDotToken

Primary key: `id: int`

```rust
schema DotDotDotToken {
  @primary id: int,
}
```
## DotDotDotToken::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: DotDotDotToken) -> Location;
```
## DotDotDotToken::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: DotDotDotToken) -> Symbol;
```
## DotDotDotToken::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: DotDotDotToken) -> *Decorator;
```
## DotDotDotToken::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: DotDotDotToken) -> string;
```
## DotDotDotToken::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: DotDotDotToken, i: int) -> Modifier;
```
## DotDotDotToken::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: DotDotDotToken) -> *Comment;
```
## DotDotDotToken::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: DotDotDotToken) -> *Node;
```
## DotDotDotToken::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: DotDotDotToken) -> *Node;
```
## DotDotDotToken::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: DotDotDotToken) -> Node;
```
## DotDotDotToken::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: DotDotDotToken) -> int;
```
## DotDotDotToken::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: DotDotDotToken) -> TopLevelDO;
```
## DotDotDotToken::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: DotDotDotToken, i: int) -> Decorator;
```
## DotDotDotToken::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: DotDotDotToken) -> int;
```
## DotDotDotToken::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: DotDotDotToken) -> *Modifier;
```
## DotDotDotToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: DotDotDotToken) -> int;
```
## DotDotDotToken::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: DotDotDotToken, i: int) -> Node;
```
## DotDotDotToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: DotDotDotToken) -> int;
```
## DotDotDotToken::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: DotDotDotToken) -> *FunctionLikeDeclaration;
```
## DotDotDotToken::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: DotDotDotToken, level: int) -> *Node;
```
## DotDotDotToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: DotDotDotToken) -> int;
```
## DotDotDotToken::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: DotDotDotToken) -> string;
```
## DotDotDotToken::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: DotDotDotToken, level: int) -> Node;
```
## DotDotDotToken::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: DotDotDotToken) -> File;
```
## DotDotDotToken::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: DotDotDotToken) -> *Comment;
```
## DotDotDotToken::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: DotDotDotToken) -> *Comment;
```
## DotDotDotToken::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: DotDotDotToken) -> Node;
```
## DotDotDotToken::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: DotDotDotToken) -> FunctionLikeDeclaration;
```
## DotDotDotToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: DotDotDotToken) -> int;
```
## DotDotDotToken::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: DotDotDotToken) -> int;
```
## DotDotDotToken::getIndex

```rust
pub fn getIndex(self: DotDotDotToken) -> int;
```
## DotDotDotToken::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: DotDotDotToken) -> *Node;
```
## DotDotDotToken::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *DotDotDotToken;
```
## DotDotDotToken::is\<T\>

```rust
pub fn is<T>(self: DotDotDotToken) -> bool;
```
## DotDotDotToken::to\<T\>

```rust
pub fn to<T>(self: DotDotDotToken) -> <any>;
```
## DotDotDotToken::key\_neq

```rust
pub fn key_neq(self: DotDotDotToken, object: <any>) -> bool;
```
## DotDotDotToken::key\_eq

```rust
pub fn key_eq(self: DotDotDotToken, object: <any>) -> bool;
```
## DotDotDotToken::to\_set

```rust
pub fn to_set(self: DotDotDotToken) -> *DotDotDotToken;
```
