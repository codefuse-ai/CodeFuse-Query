# AmpersandEqualsToken

Primary key: `id: int`

```rust
schema AmpersandEqualsToken {
  @primary id: int,
}
```
## AmpersandEqualsToken::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: AmpersandEqualsToken) -> Location;
```
## AmpersandEqualsToken::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: AmpersandEqualsToken) -> Symbol;
```
## AmpersandEqualsToken::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: AmpersandEqualsToken) -> *Decorator;
```
## AmpersandEqualsToken::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: AmpersandEqualsToken) -> string;
```
## AmpersandEqualsToken::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: AmpersandEqualsToken, i: int) -> Modifier;
```
## AmpersandEqualsToken::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: AmpersandEqualsToken) -> *Comment;
```
## AmpersandEqualsToken::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: AmpersandEqualsToken) -> *Node;
```
## AmpersandEqualsToken::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: AmpersandEqualsToken) -> *Node;
```
## AmpersandEqualsToken::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: AmpersandEqualsToken) -> Node;
```
## AmpersandEqualsToken::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: AmpersandEqualsToken) -> int;
```
## AmpersandEqualsToken::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: AmpersandEqualsToken) -> TopLevelDO;
```
## AmpersandEqualsToken::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: AmpersandEqualsToken, i: int) -> Decorator;
```
## AmpersandEqualsToken::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: AmpersandEqualsToken) -> int;
```
## AmpersandEqualsToken::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: AmpersandEqualsToken) -> *Modifier;
```
## AmpersandEqualsToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: AmpersandEqualsToken) -> int;
```
## AmpersandEqualsToken::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: AmpersandEqualsToken, i: int) -> Node;
```
## AmpersandEqualsToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: AmpersandEqualsToken) -> int;
```
## AmpersandEqualsToken::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: AmpersandEqualsToken) -> *FunctionLikeDeclaration;
```
## AmpersandEqualsToken::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: AmpersandEqualsToken, level: int) -> *Node;
```
## AmpersandEqualsToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: AmpersandEqualsToken) -> int;
```
## AmpersandEqualsToken::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: AmpersandEqualsToken) -> string;
```
## AmpersandEqualsToken::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: AmpersandEqualsToken, level: int) -> Node;
```
## AmpersandEqualsToken::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: AmpersandEqualsToken) -> File;
```
## AmpersandEqualsToken::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: AmpersandEqualsToken) -> *Comment;
```
## AmpersandEqualsToken::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: AmpersandEqualsToken) -> *Comment;
```
## AmpersandEqualsToken::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: AmpersandEqualsToken) -> Node;
```
## AmpersandEqualsToken::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: AmpersandEqualsToken) -> FunctionLikeDeclaration;
```
## AmpersandEqualsToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: AmpersandEqualsToken) -> int;
```
## AmpersandEqualsToken::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: AmpersandEqualsToken) -> int;
```
## AmpersandEqualsToken::getIndex

```rust
pub fn getIndex(self: AmpersandEqualsToken) -> int;
```
## AmpersandEqualsToken::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: AmpersandEqualsToken) -> *Node;
```
## AmpersandEqualsToken::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *AmpersandEqualsToken;
```
## AmpersandEqualsToken::is\<T\>

```rust
pub fn is<T>(self: AmpersandEqualsToken) -> bool;
```
## AmpersandEqualsToken::to\<T\>

```rust
pub fn to<T>(self: AmpersandEqualsToken) -> <any>;
```
## AmpersandEqualsToken::key\_neq

```rust
pub fn key_neq(self: AmpersandEqualsToken, object: <any>) -> bool;
```
## AmpersandEqualsToken::key\_eq

```rust
pub fn key_eq(self: AmpersandEqualsToken, object: <any>) -> bool;
```
## AmpersandEqualsToken::to\_set

```rust
pub fn to_set(self: AmpersandEqualsToken) -> *AmpersandEqualsToken;
```
