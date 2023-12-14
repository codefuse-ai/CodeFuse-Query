# AsteriskAsteriskEqualsToken

Primary key: `id: int`

```rust
schema AsteriskAsteriskEqualsToken {
  @primary id: int,
}
```
## AsteriskAsteriskEqualsToken::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: AsteriskAsteriskEqualsToken) -> Location;
```
## AsteriskAsteriskEqualsToken::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: AsteriskAsteriskEqualsToken) -> Symbol;
```
## AsteriskAsteriskEqualsToken::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: AsteriskAsteriskEqualsToken) -> *Decorator;
```
## AsteriskAsteriskEqualsToken::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: AsteriskAsteriskEqualsToken) -> string;
```
## AsteriskAsteriskEqualsToken::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: AsteriskAsteriskEqualsToken, i: int) -> Modifier;
```
## AsteriskAsteriskEqualsToken::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: AsteriskAsteriskEqualsToken) -> *Comment;
```
## AsteriskAsteriskEqualsToken::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: AsteriskAsteriskEqualsToken) -> *Node;
```
## AsteriskAsteriskEqualsToken::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: AsteriskAsteriskEqualsToken) -> *Node;
```
## AsteriskAsteriskEqualsToken::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: AsteriskAsteriskEqualsToken) -> Node;
```
## AsteriskAsteriskEqualsToken::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: AsteriskAsteriskEqualsToken) -> int;
```
## AsteriskAsteriskEqualsToken::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: AsteriskAsteriskEqualsToken) -> TopLevelDO;
```
## AsteriskAsteriskEqualsToken::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: AsteriskAsteriskEqualsToken, i: int) -> Decorator;
```
## AsteriskAsteriskEqualsToken::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: AsteriskAsteriskEqualsToken) -> int;
```
## AsteriskAsteriskEqualsToken::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: AsteriskAsteriskEqualsToken) -> *Modifier;
```
## AsteriskAsteriskEqualsToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: AsteriskAsteriskEqualsToken) -> int;
```
## AsteriskAsteriskEqualsToken::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: AsteriskAsteriskEqualsToken, i: int) -> Node;
```
## AsteriskAsteriskEqualsToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: AsteriskAsteriskEqualsToken) -> int;
```
## AsteriskAsteriskEqualsToken::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: AsteriskAsteriskEqualsToken) -> *FunctionLikeDeclaration;
```
## AsteriskAsteriskEqualsToken::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: AsteriskAsteriskEqualsToken, level: int) -> *Node;
```
## AsteriskAsteriskEqualsToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: AsteriskAsteriskEqualsToken) -> int;
```
## AsteriskAsteriskEqualsToken::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: AsteriskAsteriskEqualsToken) -> string;
```
## AsteriskAsteriskEqualsToken::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: AsteriskAsteriskEqualsToken, level: int) -> Node;
```
## AsteriskAsteriskEqualsToken::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: AsteriskAsteriskEqualsToken) -> File;
```
## AsteriskAsteriskEqualsToken::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: AsteriskAsteriskEqualsToken) -> *Comment;
```
## AsteriskAsteriskEqualsToken::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: AsteriskAsteriskEqualsToken) -> *Comment;
```
## AsteriskAsteriskEqualsToken::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: AsteriskAsteriskEqualsToken) -> Node;
```
## AsteriskAsteriskEqualsToken::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: AsteriskAsteriskEqualsToken) -> FunctionLikeDeclaration;
```
## AsteriskAsteriskEqualsToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: AsteriskAsteriskEqualsToken) -> int;
```
## AsteriskAsteriskEqualsToken::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: AsteriskAsteriskEqualsToken) -> int;
```
## AsteriskAsteriskEqualsToken::getIndex

```rust
pub fn getIndex(self: AsteriskAsteriskEqualsToken) -> int;
```
## AsteriskAsteriskEqualsToken::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: AsteriskAsteriskEqualsToken) -> *Node;
```
## AsteriskAsteriskEqualsToken::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *AsteriskAsteriskEqualsToken;
```
## AsteriskAsteriskEqualsToken::is\<T\>

```rust
pub fn is<T>(self: AsteriskAsteriskEqualsToken) -> bool;
```
## AsteriskAsteriskEqualsToken::to\<T\>

```rust
pub fn to<T>(self: AsteriskAsteriskEqualsToken) -> <any>;
```
## AsteriskAsteriskEqualsToken::key\_neq

```rust
pub fn key_neq(self: AsteriskAsteriskEqualsToken, object: <any>) -> bool;
```
## AsteriskAsteriskEqualsToken::key\_eq

```rust
pub fn key_eq(self: AsteriskAsteriskEqualsToken, object: <any>) -> bool;
```
## AsteriskAsteriskEqualsToken::to\_set

```rust
pub fn to_set(self: AsteriskAsteriskEqualsToken) -> *AsteriskAsteriskEqualsToken;
```
