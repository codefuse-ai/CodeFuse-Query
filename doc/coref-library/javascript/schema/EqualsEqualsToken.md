# EqualsEqualsToken

Primary key: `id: int`

```rust
schema EqualsEqualsToken {
  @primary id: int,
}
```
## EqualsEqualsToken::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: EqualsEqualsToken) -> Location;
```
## EqualsEqualsToken::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: EqualsEqualsToken) -> Symbol;
```
## EqualsEqualsToken::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: EqualsEqualsToken) -> *Decorator;
```
## EqualsEqualsToken::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: EqualsEqualsToken) -> string;
```
## EqualsEqualsToken::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: EqualsEqualsToken, i: int) -> Modifier;
```
## EqualsEqualsToken::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: EqualsEqualsToken) -> *Comment;
```
## EqualsEqualsToken::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: EqualsEqualsToken) -> *Node;
```
## EqualsEqualsToken::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: EqualsEqualsToken) -> *Node;
```
## EqualsEqualsToken::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: EqualsEqualsToken) -> Node;
```
## EqualsEqualsToken::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: EqualsEqualsToken) -> int;
```
## EqualsEqualsToken::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: EqualsEqualsToken) -> TopLevelDO;
```
## EqualsEqualsToken::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: EqualsEqualsToken, i: int) -> Decorator;
```
## EqualsEqualsToken::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: EqualsEqualsToken) -> int;
```
## EqualsEqualsToken::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: EqualsEqualsToken) -> *Modifier;
```
## EqualsEqualsToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: EqualsEqualsToken) -> int;
```
## EqualsEqualsToken::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: EqualsEqualsToken, i: int) -> Node;
```
## EqualsEqualsToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: EqualsEqualsToken) -> int;
```
## EqualsEqualsToken::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: EqualsEqualsToken) -> *FunctionLikeDeclaration;
```
## EqualsEqualsToken::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: EqualsEqualsToken, level: int) -> *Node;
```
## EqualsEqualsToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: EqualsEqualsToken) -> int;
```
## EqualsEqualsToken::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: EqualsEqualsToken) -> string;
```
## EqualsEqualsToken::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: EqualsEqualsToken, level: int) -> Node;
```
## EqualsEqualsToken::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: EqualsEqualsToken) -> File;
```
## EqualsEqualsToken::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: EqualsEqualsToken) -> *Comment;
```
## EqualsEqualsToken::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: EqualsEqualsToken) -> *Comment;
```
## EqualsEqualsToken::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: EqualsEqualsToken) -> Node;
```
## EqualsEqualsToken::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: EqualsEqualsToken) -> FunctionLikeDeclaration;
```
## EqualsEqualsToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: EqualsEqualsToken) -> int;
```
## EqualsEqualsToken::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: EqualsEqualsToken) -> int;
```
## EqualsEqualsToken::getIndex

```rust
pub fn getIndex(self: EqualsEqualsToken) -> int;
```
## EqualsEqualsToken::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: EqualsEqualsToken) -> *Node;
```
## EqualsEqualsToken::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *EqualsEqualsToken;
```
## EqualsEqualsToken::is\<T\>

```rust
pub fn is<T>(self: EqualsEqualsToken) -> bool;
```
## EqualsEqualsToken::to\<T\>

```rust
pub fn to<T>(self: EqualsEqualsToken) -> <any>;
```
## EqualsEqualsToken::key\_neq

```rust
pub fn key_neq(self: EqualsEqualsToken, object: <any>) -> bool;
```
## EqualsEqualsToken::key\_eq

```rust
pub fn key_eq(self: EqualsEqualsToken, object: <any>) -> bool;
```
## EqualsEqualsToken::to\_set

```rust
pub fn to_set(self: EqualsEqualsToken) -> *EqualsEqualsToken;
```
