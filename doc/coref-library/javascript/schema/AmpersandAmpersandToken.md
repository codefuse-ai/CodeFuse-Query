# AmpersandAmpersandToken

Primary key: `id: int`

```rust
schema AmpersandAmpersandToken {
  @primary id: int,
}
```
## AmpersandAmpersandToken::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: AmpersandAmpersandToken) -> Location;
```
## AmpersandAmpersandToken::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: AmpersandAmpersandToken) -> Symbol;
```
## AmpersandAmpersandToken::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: AmpersandAmpersandToken) -> *Decorator;
```
## AmpersandAmpersandToken::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: AmpersandAmpersandToken) -> string;
```
## AmpersandAmpersandToken::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: AmpersandAmpersandToken, i: int) -> Modifier;
```
## AmpersandAmpersandToken::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: AmpersandAmpersandToken) -> *Comment;
```
## AmpersandAmpersandToken::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: AmpersandAmpersandToken) -> *Node;
```
## AmpersandAmpersandToken::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: AmpersandAmpersandToken) -> *Node;
```
## AmpersandAmpersandToken::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: AmpersandAmpersandToken) -> Node;
```
## AmpersandAmpersandToken::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: AmpersandAmpersandToken) -> int;
```
## AmpersandAmpersandToken::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: AmpersandAmpersandToken) -> TopLevelDO;
```
## AmpersandAmpersandToken::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: AmpersandAmpersandToken, i: int) -> Decorator;
```
## AmpersandAmpersandToken::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: AmpersandAmpersandToken) -> int;
```
## AmpersandAmpersandToken::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: AmpersandAmpersandToken) -> *Modifier;
```
## AmpersandAmpersandToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: AmpersandAmpersandToken) -> int;
```
## AmpersandAmpersandToken::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: AmpersandAmpersandToken, i: int) -> Node;
```
## AmpersandAmpersandToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: AmpersandAmpersandToken) -> int;
```
## AmpersandAmpersandToken::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: AmpersandAmpersandToken) -> *FunctionLikeDeclaration;
```
## AmpersandAmpersandToken::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: AmpersandAmpersandToken, level: int) -> *Node;
```
## AmpersandAmpersandToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: AmpersandAmpersandToken) -> int;
```
## AmpersandAmpersandToken::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: AmpersandAmpersandToken) -> string;
```
## AmpersandAmpersandToken::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: AmpersandAmpersandToken, level: int) -> Node;
```
## AmpersandAmpersandToken::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: AmpersandAmpersandToken) -> File;
```
## AmpersandAmpersandToken::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: AmpersandAmpersandToken) -> *Comment;
```
## AmpersandAmpersandToken::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: AmpersandAmpersandToken) -> *Comment;
```
## AmpersandAmpersandToken::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: AmpersandAmpersandToken) -> Node;
```
## AmpersandAmpersandToken::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: AmpersandAmpersandToken) -> FunctionLikeDeclaration;
```
## AmpersandAmpersandToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: AmpersandAmpersandToken) -> int;
```
## AmpersandAmpersandToken::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: AmpersandAmpersandToken) -> int;
```
## AmpersandAmpersandToken::getIndex

```rust
pub fn getIndex(self: AmpersandAmpersandToken) -> int;
```
## AmpersandAmpersandToken::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: AmpersandAmpersandToken) -> *Node;
```
## AmpersandAmpersandToken::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *AmpersandAmpersandToken;
```
## AmpersandAmpersandToken::is\<T\>

```rust
pub fn is<T>(self: AmpersandAmpersandToken) -> bool;
```
## AmpersandAmpersandToken::to\<T\>

```rust
pub fn to<T>(self: AmpersandAmpersandToken) -> <any>;
```
## AmpersandAmpersandToken::key\_neq

```rust
pub fn key_neq(self: AmpersandAmpersandToken, object: <any>) -> bool;
```
## AmpersandAmpersandToken::key\_eq

```rust
pub fn key_eq(self: AmpersandAmpersandToken, object: <any>) -> bool;
```
## AmpersandAmpersandToken::to\_set

```rust
pub fn to_set(self: AmpersandAmpersandToken) -> *AmpersandAmpersandToken;
```
