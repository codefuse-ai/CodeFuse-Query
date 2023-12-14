# AmpersandToken

Primary key: `id: int`

```rust
schema AmpersandToken {
  @primary id: int,
}
```
## AmpersandToken::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: AmpersandToken) -> Location;
```
## AmpersandToken::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: AmpersandToken) -> Symbol;
```
## AmpersandToken::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: AmpersandToken) -> *Decorator;
```
## AmpersandToken::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: AmpersandToken) -> string;
```
## AmpersandToken::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: AmpersandToken, i: int) -> Modifier;
```
## AmpersandToken::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: AmpersandToken) -> *Comment;
```
## AmpersandToken::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: AmpersandToken) -> *Node;
```
## AmpersandToken::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: AmpersandToken) -> *Node;
```
## AmpersandToken::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: AmpersandToken) -> Node;
```
## AmpersandToken::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: AmpersandToken) -> int;
```
## AmpersandToken::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: AmpersandToken) -> TopLevelDO;
```
## AmpersandToken::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: AmpersandToken, i: int) -> Decorator;
```
## AmpersandToken::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: AmpersandToken) -> int;
```
## AmpersandToken::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: AmpersandToken) -> *Modifier;
```
## AmpersandToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: AmpersandToken) -> int;
```
## AmpersandToken::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: AmpersandToken, i: int) -> Node;
```
## AmpersandToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: AmpersandToken) -> int;
```
## AmpersandToken::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: AmpersandToken) -> *FunctionLikeDeclaration;
```
## AmpersandToken::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: AmpersandToken, level: int) -> *Node;
```
## AmpersandToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: AmpersandToken) -> int;
```
## AmpersandToken::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: AmpersandToken) -> string;
```
## AmpersandToken::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: AmpersandToken, level: int) -> Node;
```
## AmpersandToken::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: AmpersandToken) -> File;
```
## AmpersandToken::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: AmpersandToken) -> *Comment;
```
## AmpersandToken::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: AmpersandToken) -> *Comment;
```
## AmpersandToken::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: AmpersandToken) -> Node;
```
## AmpersandToken::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: AmpersandToken) -> FunctionLikeDeclaration;
```
## AmpersandToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: AmpersandToken) -> int;
```
## AmpersandToken::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: AmpersandToken) -> int;
```
## AmpersandToken::getIndex

```rust
pub fn getIndex(self: AmpersandToken) -> int;
```
## AmpersandToken::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: AmpersandToken) -> *Node;
```
## AmpersandToken::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *AmpersandToken;
```
## AmpersandToken::is\<T\>

```rust
pub fn is<T>(self: AmpersandToken) -> bool;
```
## AmpersandToken::to\<T\>

```rust
pub fn to<T>(self: AmpersandToken) -> <any>;
```
## AmpersandToken::key\_neq

```rust
pub fn key_neq(self: AmpersandToken, object: <any>) -> bool;
```
## AmpersandToken::key\_eq

```rust
pub fn key_eq(self: AmpersandToken, object: <any>) -> bool;
```
## AmpersandToken::to\_set

```rust
pub fn to_set(self: AmpersandToken) -> *AmpersandToken;
```
