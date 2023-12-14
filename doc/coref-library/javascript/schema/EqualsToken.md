# EqualsToken

Primary key: `id: int`

```rust
schema EqualsToken {
  @primary id: int,
}
```
## EqualsToken::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: EqualsToken) -> Location;
```
## EqualsToken::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: EqualsToken) -> Symbol;
```
## EqualsToken::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: EqualsToken) -> *Decorator;
```
## EqualsToken::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: EqualsToken) -> string;
```
## EqualsToken::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: EqualsToken, i: int) -> Modifier;
```
## EqualsToken::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: EqualsToken) -> *Comment;
```
## EqualsToken::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: EqualsToken) -> *Node;
```
## EqualsToken::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: EqualsToken) -> *Node;
```
## EqualsToken::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: EqualsToken) -> Node;
```
## EqualsToken::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: EqualsToken) -> int;
```
## EqualsToken::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: EqualsToken) -> TopLevelDO;
```
## EqualsToken::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: EqualsToken, i: int) -> Decorator;
```
## EqualsToken::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: EqualsToken) -> int;
```
## EqualsToken::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: EqualsToken) -> *Modifier;
```
## EqualsToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: EqualsToken) -> int;
```
## EqualsToken::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: EqualsToken, i: int) -> Node;
```
## EqualsToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: EqualsToken) -> int;
```
## EqualsToken::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: EqualsToken) -> *FunctionLikeDeclaration;
```
## EqualsToken::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: EqualsToken, level: int) -> *Node;
```
## EqualsToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: EqualsToken) -> int;
```
## EqualsToken::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: EqualsToken) -> string;
```
## EqualsToken::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: EqualsToken, level: int) -> Node;
```
## EqualsToken::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: EqualsToken) -> File;
```
## EqualsToken::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: EqualsToken) -> *Comment;
```
## EqualsToken::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: EqualsToken) -> *Comment;
```
## EqualsToken::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: EqualsToken) -> Node;
```
## EqualsToken::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: EqualsToken) -> FunctionLikeDeclaration;
```
## EqualsToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: EqualsToken) -> int;
```
## EqualsToken::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: EqualsToken) -> int;
```
## EqualsToken::getIndex

```rust
pub fn getIndex(self: EqualsToken) -> int;
```
## EqualsToken::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: EqualsToken) -> *Node;
```
## EqualsToken::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *EqualsToken;
```
## EqualsToken::is\<T\>

```rust
pub fn is<T>(self: EqualsToken) -> bool;
```
## EqualsToken::to\<T\>

```rust
pub fn to<T>(self: EqualsToken) -> <any>;
```
## EqualsToken::key\_neq

```rust
pub fn key_neq(self: EqualsToken, object: <any>) -> bool;
```
## EqualsToken::key\_eq

```rust
pub fn key_eq(self: EqualsToken, object: <any>) -> bool;
```
## EqualsToken::to\_set

```rust
pub fn to_set(self: EqualsToken) -> *EqualsToken;
```
