# AsteriskAsteriskToken

Primary key: `id: int`

```rust
schema AsteriskAsteriskToken {
  @primary id: int,
}
```
## AsteriskAsteriskToken::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: AsteriskAsteriskToken) -> Location;
```
## AsteriskAsteriskToken::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: AsteriskAsteriskToken) -> Symbol;
```
## AsteriskAsteriskToken::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: AsteriskAsteriskToken) -> *Decorator;
```
## AsteriskAsteriskToken::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: AsteriskAsteriskToken) -> string;
```
## AsteriskAsteriskToken::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: AsteriskAsteriskToken, i: int) -> Modifier;
```
## AsteriskAsteriskToken::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: AsteriskAsteriskToken) -> *Comment;
```
## AsteriskAsteriskToken::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: AsteriskAsteriskToken) -> *Node;
```
## AsteriskAsteriskToken::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: AsteriskAsteriskToken) -> *Node;
```
## AsteriskAsteriskToken::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: AsteriskAsteriskToken) -> Node;
```
## AsteriskAsteriskToken::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: AsteriskAsteriskToken) -> int;
```
## AsteriskAsteriskToken::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: AsteriskAsteriskToken) -> TopLevelDO;
```
## AsteriskAsteriskToken::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: AsteriskAsteriskToken, i: int) -> Decorator;
```
## AsteriskAsteriskToken::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: AsteriskAsteriskToken) -> int;
```
## AsteriskAsteriskToken::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: AsteriskAsteriskToken) -> *Modifier;
```
## AsteriskAsteriskToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: AsteriskAsteriskToken) -> int;
```
## AsteriskAsteriskToken::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: AsteriskAsteriskToken, i: int) -> Node;
```
## AsteriskAsteriskToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: AsteriskAsteriskToken) -> int;
```
## AsteriskAsteriskToken::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: AsteriskAsteriskToken) -> *FunctionLikeDeclaration;
```
## AsteriskAsteriskToken::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: AsteriskAsteriskToken, level: int) -> *Node;
```
## AsteriskAsteriskToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: AsteriskAsteriskToken) -> int;
```
## AsteriskAsteriskToken::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: AsteriskAsteriskToken) -> string;
```
## AsteriskAsteriskToken::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: AsteriskAsteriskToken, level: int) -> Node;
```
## AsteriskAsteriskToken::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: AsteriskAsteriskToken) -> File;
```
## AsteriskAsteriskToken::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: AsteriskAsteriskToken) -> *Comment;
```
## AsteriskAsteriskToken::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: AsteriskAsteriskToken) -> *Comment;
```
## AsteriskAsteriskToken::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: AsteriskAsteriskToken) -> Node;
```
## AsteriskAsteriskToken::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: AsteriskAsteriskToken) -> FunctionLikeDeclaration;
```
## AsteriskAsteriskToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: AsteriskAsteriskToken) -> int;
```
## AsteriskAsteriskToken::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: AsteriskAsteriskToken) -> int;
```
## AsteriskAsteriskToken::getIndex

```rust
pub fn getIndex(self: AsteriskAsteriskToken) -> int;
```
## AsteriskAsteriskToken::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: AsteriskAsteriskToken) -> *Node;
```
## AsteriskAsteriskToken::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *AsteriskAsteriskToken;
```
## AsteriskAsteriskToken::is\<T\>

```rust
pub fn is<T>(self: AsteriskAsteriskToken) -> bool;
```
## AsteriskAsteriskToken::to\<T\>

```rust
pub fn to<T>(self: AsteriskAsteriskToken) -> <any>;
```
## AsteriskAsteriskToken::key\_neq

```rust
pub fn key_neq(self: AsteriskAsteriskToken, object: <any>) -> bool;
```
## AsteriskAsteriskToken::key\_eq

```rust
pub fn key_eq(self: AsteriskAsteriskToken, object: <any>) -> bool;
```
## AsteriskAsteriskToken::to\_set

```rust
pub fn to_set(self: AsteriskAsteriskToken) -> *AsteriskAsteriskToken;
```
