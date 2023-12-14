# AsteriskEqualsToken

Primary key: `id: int`

```rust
schema AsteriskEqualsToken {
  @primary id: int,
}
```
## AsteriskEqualsToken::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: AsteriskEqualsToken) -> Location;
```
## AsteriskEqualsToken::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: AsteriskEqualsToken) -> Symbol;
```
## AsteriskEqualsToken::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: AsteriskEqualsToken) -> *Decorator;
```
## AsteriskEqualsToken::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: AsteriskEqualsToken) -> string;
```
## AsteriskEqualsToken::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: AsteriskEqualsToken, i: int) -> Modifier;
```
## AsteriskEqualsToken::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: AsteriskEqualsToken) -> *Comment;
```
## AsteriskEqualsToken::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: AsteriskEqualsToken) -> *Node;
```
## AsteriskEqualsToken::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: AsteriskEqualsToken) -> *Node;
```
## AsteriskEqualsToken::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: AsteriskEqualsToken) -> Node;
```
## AsteriskEqualsToken::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: AsteriskEqualsToken) -> int;
```
## AsteriskEqualsToken::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: AsteriskEqualsToken) -> TopLevelDO;
```
## AsteriskEqualsToken::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: AsteriskEqualsToken, i: int) -> Decorator;
```
## AsteriskEqualsToken::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: AsteriskEqualsToken) -> int;
```
## AsteriskEqualsToken::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: AsteriskEqualsToken) -> *Modifier;
```
## AsteriskEqualsToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: AsteriskEqualsToken) -> int;
```
## AsteriskEqualsToken::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: AsteriskEqualsToken, i: int) -> Node;
```
## AsteriskEqualsToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: AsteriskEqualsToken) -> int;
```
## AsteriskEqualsToken::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: AsteriskEqualsToken) -> *FunctionLikeDeclaration;
```
## AsteriskEqualsToken::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: AsteriskEqualsToken, level: int) -> *Node;
```
## AsteriskEqualsToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: AsteriskEqualsToken) -> int;
```
## AsteriskEqualsToken::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: AsteriskEqualsToken) -> string;
```
## AsteriskEqualsToken::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: AsteriskEqualsToken, level: int) -> Node;
```
## AsteriskEqualsToken::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: AsteriskEqualsToken) -> File;
```
## AsteriskEqualsToken::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: AsteriskEqualsToken) -> *Comment;
```
## AsteriskEqualsToken::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: AsteriskEqualsToken) -> *Comment;
```
## AsteriskEqualsToken::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: AsteriskEqualsToken) -> Node;
```
## AsteriskEqualsToken::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: AsteriskEqualsToken) -> FunctionLikeDeclaration;
```
## AsteriskEqualsToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: AsteriskEqualsToken) -> int;
```
## AsteriskEqualsToken::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: AsteriskEqualsToken) -> int;
```
## AsteriskEqualsToken::getIndex

```rust
pub fn getIndex(self: AsteriskEqualsToken) -> int;
```
## AsteriskEqualsToken::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: AsteriskEqualsToken) -> *Node;
```
## AsteriskEqualsToken::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *AsteriskEqualsToken;
```
## AsteriskEqualsToken::is\<T\>

```rust
pub fn is<T>(self: AsteriskEqualsToken) -> bool;
```
## AsteriskEqualsToken::to\<T\>

```rust
pub fn to<T>(self: AsteriskEqualsToken) -> <any>;
```
## AsteriskEqualsToken::key\_neq

```rust
pub fn key_neq(self: AsteriskEqualsToken, object: <any>) -> bool;
```
## AsteriskEqualsToken::key\_eq

```rust
pub fn key_eq(self: AsteriskEqualsToken, object: <any>) -> bool;
```
## AsteriskEqualsToken::to\_set

```rust
pub fn to_set(self: AsteriskEqualsToken) -> *AsteriskEqualsToken;
```
