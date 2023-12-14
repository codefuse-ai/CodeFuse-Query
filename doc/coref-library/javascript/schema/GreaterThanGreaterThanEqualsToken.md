# GreaterThanGreaterThanEqualsToken

Primary key: `id: int`

```rust
schema GreaterThanGreaterThanEqualsToken {
  @primary id: int,
}
```
## GreaterThanGreaterThanEqualsToken::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: GreaterThanGreaterThanEqualsToken) -> Location;
```
## GreaterThanGreaterThanEqualsToken::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: GreaterThanGreaterThanEqualsToken) -> Symbol;
```
## GreaterThanGreaterThanEqualsToken::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: GreaterThanGreaterThanEqualsToken) -> *Decorator;
```
## GreaterThanGreaterThanEqualsToken::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: GreaterThanGreaterThanEqualsToken) -> string;
```
## GreaterThanGreaterThanEqualsToken::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: GreaterThanGreaterThanEqualsToken, i: int) -> Modifier;
```
## GreaterThanGreaterThanEqualsToken::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: GreaterThanGreaterThanEqualsToken) -> *Comment;
```
## GreaterThanGreaterThanEqualsToken::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: GreaterThanGreaterThanEqualsToken) -> *Node;
```
## GreaterThanGreaterThanEqualsToken::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: GreaterThanGreaterThanEqualsToken) -> *Node;
```
## GreaterThanGreaterThanEqualsToken::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: GreaterThanGreaterThanEqualsToken) -> Node;
```
## GreaterThanGreaterThanEqualsToken::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: GreaterThanGreaterThanEqualsToken) -> int;
```
## GreaterThanGreaterThanEqualsToken::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: GreaterThanGreaterThanEqualsToken) -> TopLevelDO;
```
## GreaterThanGreaterThanEqualsToken::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: GreaterThanGreaterThanEqualsToken, i: int) -> Decorator;
```
## GreaterThanGreaterThanEqualsToken::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: GreaterThanGreaterThanEqualsToken) -> int;
```
## GreaterThanGreaterThanEqualsToken::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: GreaterThanGreaterThanEqualsToken) -> *Modifier;
```
## GreaterThanGreaterThanEqualsToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: GreaterThanGreaterThanEqualsToken) -> int;
```
## GreaterThanGreaterThanEqualsToken::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: GreaterThanGreaterThanEqualsToken, i: int) -> Node;
```
## GreaterThanGreaterThanEqualsToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: GreaterThanGreaterThanEqualsToken) -> int;
```
## GreaterThanGreaterThanEqualsToken::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: GreaterThanGreaterThanEqualsToken) -> *FunctionLikeDeclaration;
```
## GreaterThanGreaterThanEqualsToken::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: GreaterThanGreaterThanEqualsToken, level: int) -> *Node;
```
## GreaterThanGreaterThanEqualsToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: GreaterThanGreaterThanEqualsToken) -> int;
```
## GreaterThanGreaterThanEqualsToken::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: GreaterThanGreaterThanEqualsToken) -> string;
```
## GreaterThanGreaterThanEqualsToken::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: GreaterThanGreaterThanEqualsToken, level: int) -> Node;
```
## GreaterThanGreaterThanEqualsToken::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: GreaterThanGreaterThanEqualsToken) -> File;
```
## GreaterThanGreaterThanEqualsToken::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: GreaterThanGreaterThanEqualsToken) -> *Comment;
```
## GreaterThanGreaterThanEqualsToken::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: GreaterThanGreaterThanEqualsToken) -> *Comment;
```
## GreaterThanGreaterThanEqualsToken::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: GreaterThanGreaterThanEqualsToken) -> Node;
```
## GreaterThanGreaterThanEqualsToken::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: GreaterThanGreaterThanEqualsToken) -> FunctionLikeDeclaration;
```
## GreaterThanGreaterThanEqualsToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: GreaterThanGreaterThanEqualsToken) -> int;
```
## GreaterThanGreaterThanEqualsToken::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: GreaterThanGreaterThanEqualsToken) -> int;
```
## GreaterThanGreaterThanEqualsToken::getIndex

```rust
pub fn getIndex(self: GreaterThanGreaterThanEqualsToken) -> int;
```
## GreaterThanGreaterThanEqualsToken::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: GreaterThanGreaterThanEqualsToken) -> *Node;
```
## GreaterThanGreaterThanEqualsToken::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *GreaterThanGreaterThanEqualsToken;
```
## GreaterThanGreaterThanEqualsToken::is\<T\>

```rust
pub fn is<T>(self: GreaterThanGreaterThanEqualsToken) -> bool;
```
## GreaterThanGreaterThanEqualsToken::to\<T\>

```rust
pub fn to<T>(self: GreaterThanGreaterThanEqualsToken) -> <any>;
```
## GreaterThanGreaterThanEqualsToken::key\_neq

```rust
pub fn key_neq(self: GreaterThanGreaterThanEqualsToken, object: <any>) -> bool;
```
## GreaterThanGreaterThanEqualsToken::key\_eq

```rust
pub fn key_eq(self: GreaterThanGreaterThanEqualsToken, object: <any>) -> bool;
```
## GreaterThanGreaterThanEqualsToken::to\_set

```rust
pub fn to_set(self: GreaterThanGreaterThanEqualsToken) -> *GreaterThanGreaterThanEqualsToken;
```
