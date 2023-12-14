# EqualsEqualsEqualsToken

Primary key: `id: int`

```rust
schema EqualsEqualsEqualsToken {
  @primary id: int,
}
```
## EqualsEqualsEqualsToken::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: EqualsEqualsEqualsToken) -> Location;
```
## EqualsEqualsEqualsToken::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: EqualsEqualsEqualsToken) -> Symbol;
```
## EqualsEqualsEqualsToken::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: EqualsEqualsEqualsToken) -> *Decorator;
```
## EqualsEqualsEqualsToken::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: EqualsEqualsEqualsToken) -> string;
```
## EqualsEqualsEqualsToken::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: EqualsEqualsEqualsToken, i: int) -> Modifier;
```
## EqualsEqualsEqualsToken::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: EqualsEqualsEqualsToken) -> *Comment;
```
## EqualsEqualsEqualsToken::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: EqualsEqualsEqualsToken) -> *Node;
```
## EqualsEqualsEqualsToken::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: EqualsEqualsEqualsToken) -> *Node;
```
## EqualsEqualsEqualsToken::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: EqualsEqualsEqualsToken) -> Node;
```
## EqualsEqualsEqualsToken::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: EqualsEqualsEqualsToken) -> int;
```
## EqualsEqualsEqualsToken::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: EqualsEqualsEqualsToken) -> TopLevelDO;
```
## EqualsEqualsEqualsToken::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: EqualsEqualsEqualsToken, i: int) -> Decorator;
```
## EqualsEqualsEqualsToken::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: EqualsEqualsEqualsToken) -> int;
```
## EqualsEqualsEqualsToken::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: EqualsEqualsEqualsToken) -> *Modifier;
```
## EqualsEqualsEqualsToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: EqualsEqualsEqualsToken) -> int;
```
## EqualsEqualsEqualsToken::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: EqualsEqualsEqualsToken, i: int) -> Node;
```
## EqualsEqualsEqualsToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: EqualsEqualsEqualsToken) -> int;
```
## EqualsEqualsEqualsToken::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: EqualsEqualsEqualsToken) -> *FunctionLikeDeclaration;
```
## EqualsEqualsEqualsToken::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: EqualsEqualsEqualsToken, level: int) -> *Node;
```
## EqualsEqualsEqualsToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: EqualsEqualsEqualsToken) -> int;
```
## EqualsEqualsEqualsToken::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: EqualsEqualsEqualsToken) -> string;
```
## EqualsEqualsEqualsToken::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: EqualsEqualsEqualsToken, level: int) -> Node;
```
## EqualsEqualsEqualsToken::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: EqualsEqualsEqualsToken) -> File;
```
## EqualsEqualsEqualsToken::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: EqualsEqualsEqualsToken) -> *Comment;
```
## EqualsEqualsEqualsToken::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: EqualsEqualsEqualsToken) -> *Comment;
```
## EqualsEqualsEqualsToken::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: EqualsEqualsEqualsToken) -> Node;
```
## EqualsEqualsEqualsToken::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: EqualsEqualsEqualsToken) -> FunctionLikeDeclaration;
```
## EqualsEqualsEqualsToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: EqualsEqualsEqualsToken) -> int;
```
## EqualsEqualsEqualsToken::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: EqualsEqualsEqualsToken) -> int;
```
## EqualsEqualsEqualsToken::getIndex

```rust
pub fn getIndex(self: EqualsEqualsEqualsToken) -> int;
```
## EqualsEqualsEqualsToken::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: EqualsEqualsEqualsToken) -> *Node;
```
## EqualsEqualsEqualsToken::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *EqualsEqualsEqualsToken;
```
## EqualsEqualsEqualsToken::is\<T\>

```rust
pub fn is<T>(self: EqualsEqualsEqualsToken) -> bool;
```
## EqualsEqualsEqualsToken::to\<T\>

```rust
pub fn to<T>(self: EqualsEqualsEqualsToken) -> <any>;
```
## EqualsEqualsEqualsToken::key\_neq

```rust
pub fn key_neq(self: EqualsEqualsEqualsToken, object: <any>) -> bool;
```
## EqualsEqualsEqualsToken::key\_eq

```rust
pub fn key_eq(self: EqualsEqualsEqualsToken, object: <any>) -> bool;
```
## EqualsEqualsEqualsToken::to\_set

```rust
pub fn to_set(self: EqualsEqualsEqualsToken) -> *EqualsEqualsEqualsToken;
```
