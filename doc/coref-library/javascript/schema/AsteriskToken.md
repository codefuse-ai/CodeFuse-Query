# AsteriskToken

Primary key: `id: int`

```rust
schema AsteriskToken {
  @primary id: int,
}
```
## AsteriskToken::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: AsteriskToken) -> Location;
```
## AsteriskToken::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: AsteriskToken) -> Symbol;
```
## AsteriskToken::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: AsteriskToken) -> *Decorator;
```
## AsteriskToken::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: AsteriskToken) -> string;
```
## AsteriskToken::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: AsteriskToken, i: int) -> Modifier;
```
## AsteriskToken::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: AsteriskToken) -> *Comment;
```
## AsteriskToken::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: AsteriskToken) -> *Node;
```
## AsteriskToken::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: AsteriskToken) -> *Node;
```
## AsteriskToken::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: AsteriskToken) -> Node;
```
## AsteriskToken::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: AsteriskToken) -> int;
```
## AsteriskToken::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: AsteriskToken) -> TopLevelDO;
```
## AsteriskToken::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: AsteriskToken, i: int) -> Decorator;
```
## AsteriskToken::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: AsteriskToken) -> int;
```
## AsteriskToken::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: AsteriskToken) -> *Modifier;
```
## AsteriskToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: AsteriskToken) -> int;
```
## AsteriskToken::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: AsteriskToken, i: int) -> Node;
```
## AsteriskToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: AsteriskToken) -> int;
```
## AsteriskToken::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: AsteriskToken) -> *FunctionLikeDeclaration;
```
## AsteriskToken::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: AsteriskToken, level: int) -> *Node;
```
## AsteriskToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: AsteriskToken) -> int;
```
## AsteriskToken::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: AsteriskToken) -> string;
```
## AsteriskToken::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: AsteriskToken, level: int) -> Node;
```
## AsteriskToken::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: AsteriskToken) -> File;
```
## AsteriskToken::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: AsteriskToken) -> *Comment;
```
## AsteriskToken::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: AsteriskToken) -> *Comment;
```
## AsteriskToken::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: AsteriskToken) -> Node;
```
## AsteriskToken::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: AsteriskToken) -> FunctionLikeDeclaration;
```
## AsteriskToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: AsteriskToken) -> int;
```
## AsteriskToken::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: AsteriskToken) -> int;
```
## AsteriskToken::getIndex

```rust
pub fn getIndex(self: AsteriskToken) -> int;
```
## AsteriskToken::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: AsteriskToken) -> *Node;
```
## AsteriskToken::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *AsteriskToken;
```
## AsteriskToken::is\<T\>

```rust
pub fn is<T>(self: AsteriskToken) -> bool;
```
## AsteriskToken::to\<T\>

```rust
pub fn to<T>(self: AsteriskToken) -> <any>;
```
## AsteriskToken::key\_neq

```rust
pub fn key_neq(self: AsteriskToken, object: <any>) -> bool;
```
## AsteriskToken::key\_eq

```rust
pub fn key_eq(self: AsteriskToken, object: <any>) -> bool;
```
## AsteriskToken::to\_set

```rust
pub fn to_set(self: AsteriskToken) -> *AsteriskToken;
```
