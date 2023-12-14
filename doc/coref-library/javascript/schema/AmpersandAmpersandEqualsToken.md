# AmpersandAmpersandEqualsToken

Primary key: `id: int`

```rust
schema AmpersandAmpersandEqualsToken {
  @primary id: int,
}
```
## AmpersandAmpersandEqualsToken::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: AmpersandAmpersandEqualsToken) -> Location;
```
## AmpersandAmpersandEqualsToken::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: AmpersandAmpersandEqualsToken) -> Symbol;
```
## AmpersandAmpersandEqualsToken::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: AmpersandAmpersandEqualsToken) -> *Decorator;
```
## AmpersandAmpersandEqualsToken::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: AmpersandAmpersandEqualsToken) -> string;
```
## AmpersandAmpersandEqualsToken::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: AmpersandAmpersandEqualsToken, i: int) -> Modifier;
```
## AmpersandAmpersandEqualsToken::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: AmpersandAmpersandEqualsToken) -> *Comment;
```
## AmpersandAmpersandEqualsToken::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: AmpersandAmpersandEqualsToken) -> *Node;
```
## AmpersandAmpersandEqualsToken::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: AmpersandAmpersandEqualsToken) -> *Node;
```
## AmpersandAmpersandEqualsToken::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: AmpersandAmpersandEqualsToken) -> Node;
```
## AmpersandAmpersandEqualsToken::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: AmpersandAmpersandEqualsToken) -> int;
```
## AmpersandAmpersandEqualsToken::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: AmpersandAmpersandEqualsToken) -> TopLevelDO;
```
## AmpersandAmpersandEqualsToken::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: AmpersandAmpersandEqualsToken, i: int) -> Decorator;
```
## AmpersandAmpersandEqualsToken::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: AmpersandAmpersandEqualsToken) -> int;
```
## AmpersandAmpersandEqualsToken::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: AmpersandAmpersandEqualsToken) -> *Modifier;
```
## AmpersandAmpersandEqualsToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: AmpersandAmpersandEqualsToken) -> int;
```
## AmpersandAmpersandEqualsToken::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: AmpersandAmpersandEqualsToken, i: int) -> Node;
```
## AmpersandAmpersandEqualsToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: AmpersandAmpersandEqualsToken) -> int;
```
## AmpersandAmpersandEqualsToken::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: AmpersandAmpersandEqualsToken) -> *FunctionLikeDeclaration;
```
## AmpersandAmpersandEqualsToken::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: AmpersandAmpersandEqualsToken, level: int) -> *Node;
```
## AmpersandAmpersandEqualsToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: AmpersandAmpersandEqualsToken) -> int;
```
## AmpersandAmpersandEqualsToken::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: AmpersandAmpersandEqualsToken) -> string;
```
## AmpersandAmpersandEqualsToken::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: AmpersandAmpersandEqualsToken, level: int) -> Node;
```
## AmpersandAmpersandEqualsToken::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: AmpersandAmpersandEqualsToken) -> File;
```
## AmpersandAmpersandEqualsToken::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: AmpersandAmpersandEqualsToken) -> *Comment;
```
## AmpersandAmpersandEqualsToken::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: AmpersandAmpersandEqualsToken) -> *Comment;
```
## AmpersandAmpersandEqualsToken::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: AmpersandAmpersandEqualsToken) -> Node;
```
## AmpersandAmpersandEqualsToken::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: AmpersandAmpersandEqualsToken) -> FunctionLikeDeclaration;
```
## AmpersandAmpersandEqualsToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: AmpersandAmpersandEqualsToken) -> int;
```
## AmpersandAmpersandEqualsToken::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: AmpersandAmpersandEqualsToken) -> int;
```
## AmpersandAmpersandEqualsToken::getIndex

```rust
pub fn getIndex(self: AmpersandAmpersandEqualsToken) -> int;
```
## AmpersandAmpersandEqualsToken::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: AmpersandAmpersandEqualsToken) -> *Node;
```
## AmpersandAmpersandEqualsToken::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *AmpersandAmpersandEqualsToken;
```
## AmpersandAmpersandEqualsToken::is\<T\>

```rust
pub fn is<T>(self: AmpersandAmpersandEqualsToken) -> bool;
```
## AmpersandAmpersandEqualsToken::to\<T\>

```rust
pub fn to<T>(self: AmpersandAmpersandEqualsToken) -> <any>;
```
## AmpersandAmpersandEqualsToken::key\_neq

```rust
pub fn key_neq(self: AmpersandAmpersandEqualsToken, object: <any>) -> bool;
```
## AmpersandAmpersandEqualsToken::key\_eq

```rust
pub fn key_eq(self: AmpersandAmpersandEqualsToken, object: <any>) -> bool;
```
## AmpersandAmpersandEqualsToken::to\_set

```rust
pub fn to_set(self: AmpersandAmpersandEqualsToken) -> *AmpersandAmpersandEqualsToken;
```
