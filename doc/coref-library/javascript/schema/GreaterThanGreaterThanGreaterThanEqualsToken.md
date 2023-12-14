# GreaterThanGreaterThanGreaterThanEqualsToken

Primary key: `id: int`

```rust
schema GreaterThanGreaterThanGreaterThanEqualsToken {
  @primary id: int,
}
```
## GreaterThanGreaterThanGreaterThanEqualsToken::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: GreaterThanGreaterThanGreaterThanEqualsToken) -> Location;
```
## GreaterThanGreaterThanGreaterThanEqualsToken::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: GreaterThanGreaterThanGreaterThanEqualsToken) -> Symbol;
```
## GreaterThanGreaterThanGreaterThanEqualsToken::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: GreaterThanGreaterThanGreaterThanEqualsToken) -> *Decorator;
```
## GreaterThanGreaterThanGreaterThanEqualsToken::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: GreaterThanGreaterThanGreaterThanEqualsToken) -> string;
```
## GreaterThanGreaterThanGreaterThanEqualsToken::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: GreaterThanGreaterThanGreaterThanEqualsToken, i: int) -> Modifier;
```
## GreaterThanGreaterThanGreaterThanEqualsToken::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: GreaterThanGreaterThanGreaterThanEqualsToken) -> *Comment;
```
## GreaterThanGreaterThanGreaterThanEqualsToken::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: GreaterThanGreaterThanGreaterThanEqualsToken) -> *Node;
```
## GreaterThanGreaterThanGreaterThanEqualsToken::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: GreaterThanGreaterThanGreaterThanEqualsToken) -> *Node;
```
## GreaterThanGreaterThanGreaterThanEqualsToken::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: GreaterThanGreaterThanGreaterThanEqualsToken) -> Node;
```
## GreaterThanGreaterThanGreaterThanEqualsToken::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: GreaterThanGreaterThanGreaterThanEqualsToken) -> int;
```
## GreaterThanGreaterThanGreaterThanEqualsToken::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: GreaterThanGreaterThanGreaterThanEqualsToken) -> TopLevelDO;
```
## GreaterThanGreaterThanGreaterThanEqualsToken::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: GreaterThanGreaterThanGreaterThanEqualsToken, i: int) -> Decorator;
```
## GreaterThanGreaterThanGreaterThanEqualsToken::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: GreaterThanGreaterThanGreaterThanEqualsToken) -> int;
```
## GreaterThanGreaterThanGreaterThanEqualsToken::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: GreaterThanGreaterThanGreaterThanEqualsToken) -> *Modifier;
```
## GreaterThanGreaterThanGreaterThanEqualsToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: GreaterThanGreaterThanGreaterThanEqualsToken) -> int;
```
## GreaterThanGreaterThanGreaterThanEqualsToken::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: GreaterThanGreaterThanGreaterThanEqualsToken, i: int) -> Node;
```
## GreaterThanGreaterThanGreaterThanEqualsToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: GreaterThanGreaterThanGreaterThanEqualsToken) -> int;
```
## GreaterThanGreaterThanGreaterThanEqualsToken::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: GreaterThanGreaterThanGreaterThanEqualsToken) -> *FunctionLikeDeclaration;
```
## GreaterThanGreaterThanGreaterThanEqualsToken::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: GreaterThanGreaterThanGreaterThanEqualsToken, level: int) -> *Node;
```
## GreaterThanGreaterThanGreaterThanEqualsToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: GreaterThanGreaterThanGreaterThanEqualsToken) -> int;
```
## GreaterThanGreaterThanGreaterThanEqualsToken::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: GreaterThanGreaterThanGreaterThanEqualsToken) -> string;
```
## GreaterThanGreaterThanGreaterThanEqualsToken::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: GreaterThanGreaterThanGreaterThanEqualsToken, level: int) -> Node;
```
## GreaterThanGreaterThanGreaterThanEqualsToken::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: GreaterThanGreaterThanGreaterThanEqualsToken) -> File;
```
## GreaterThanGreaterThanGreaterThanEqualsToken::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: GreaterThanGreaterThanGreaterThanEqualsToken) -> *Comment;
```
## GreaterThanGreaterThanGreaterThanEqualsToken::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: GreaterThanGreaterThanGreaterThanEqualsToken) -> *Comment;
```
## GreaterThanGreaterThanGreaterThanEqualsToken::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: GreaterThanGreaterThanGreaterThanEqualsToken) -> Node;
```
## GreaterThanGreaterThanGreaterThanEqualsToken::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: GreaterThanGreaterThanGreaterThanEqualsToken) -> FunctionLikeDeclaration;
```
## GreaterThanGreaterThanGreaterThanEqualsToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: GreaterThanGreaterThanGreaterThanEqualsToken) -> int;
```
## GreaterThanGreaterThanGreaterThanEqualsToken::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: GreaterThanGreaterThanGreaterThanEqualsToken) -> int;
```
## GreaterThanGreaterThanGreaterThanEqualsToken::getIndex

```rust
pub fn getIndex(self: GreaterThanGreaterThanGreaterThanEqualsToken) -> int;
```
## GreaterThanGreaterThanGreaterThanEqualsToken::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: GreaterThanGreaterThanGreaterThanEqualsToken) -> *Node;
```
## GreaterThanGreaterThanGreaterThanEqualsToken::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *GreaterThanGreaterThanGreaterThanEqualsToken;
```
## GreaterThanGreaterThanGreaterThanEqualsToken::is\<T\>

```rust
pub fn is<T>(self: GreaterThanGreaterThanGreaterThanEqualsToken) -> bool;
```
## GreaterThanGreaterThanGreaterThanEqualsToken::to\<T\>

```rust
pub fn to<T>(self: GreaterThanGreaterThanGreaterThanEqualsToken) -> <any>;
```
## GreaterThanGreaterThanGreaterThanEqualsToken::key\_neq

```rust
pub fn key_neq(self: GreaterThanGreaterThanGreaterThanEqualsToken, object: <any>) -> bool;
```
## GreaterThanGreaterThanGreaterThanEqualsToken::key\_eq

```rust
pub fn key_eq(self: GreaterThanGreaterThanGreaterThanEqualsToken, object: <any>) -> bool;
```
## GreaterThanGreaterThanGreaterThanEqualsToken::to\_set

```rust
pub fn to_set(self: GreaterThanGreaterThanGreaterThanEqualsToken) -> *GreaterThanGreaterThanGreaterThanEqualsToken;
```
