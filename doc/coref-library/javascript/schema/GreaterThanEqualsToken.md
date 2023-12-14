# GreaterThanEqualsToken

Primary key: `id: int`

```rust
schema GreaterThanEqualsToken {
  @primary id: int,
}
```
## GreaterThanEqualsToken::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: GreaterThanEqualsToken) -> Location;
```
## GreaterThanEqualsToken::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: GreaterThanEqualsToken) -> Symbol;
```
## GreaterThanEqualsToken::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: GreaterThanEqualsToken) -> *Decorator;
```
## GreaterThanEqualsToken::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: GreaterThanEqualsToken) -> string;
```
## GreaterThanEqualsToken::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: GreaterThanEqualsToken, i: int) -> Modifier;
```
## GreaterThanEqualsToken::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: GreaterThanEqualsToken) -> *Comment;
```
## GreaterThanEqualsToken::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: GreaterThanEqualsToken) -> *Node;
```
## GreaterThanEqualsToken::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: GreaterThanEqualsToken) -> *Node;
```
## GreaterThanEqualsToken::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: GreaterThanEqualsToken) -> Node;
```
## GreaterThanEqualsToken::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: GreaterThanEqualsToken) -> int;
```
## GreaterThanEqualsToken::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: GreaterThanEqualsToken) -> TopLevelDO;
```
## GreaterThanEqualsToken::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: GreaterThanEqualsToken, i: int) -> Decorator;
```
## GreaterThanEqualsToken::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: GreaterThanEqualsToken) -> int;
```
## GreaterThanEqualsToken::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: GreaterThanEqualsToken) -> *Modifier;
```
## GreaterThanEqualsToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: GreaterThanEqualsToken) -> int;
```
## GreaterThanEqualsToken::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: GreaterThanEqualsToken, i: int) -> Node;
```
## GreaterThanEqualsToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: GreaterThanEqualsToken) -> int;
```
## GreaterThanEqualsToken::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: GreaterThanEqualsToken) -> *FunctionLikeDeclaration;
```
## GreaterThanEqualsToken::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: GreaterThanEqualsToken, level: int) -> *Node;
```
## GreaterThanEqualsToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: GreaterThanEqualsToken) -> int;
```
## GreaterThanEqualsToken::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: GreaterThanEqualsToken) -> string;
```
## GreaterThanEqualsToken::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: GreaterThanEqualsToken, level: int) -> Node;
```
## GreaterThanEqualsToken::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: GreaterThanEqualsToken) -> File;
```
## GreaterThanEqualsToken::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: GreaterThanEqualsToken) -> *Comment;
```
## GreaterThanEqualsToken::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: GreaterThanEqualsToken) -> *Comment;
```
## GreaterThanEqualsToken::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: GreaterThanEqualsToken) -> Node;
```
## GreaterThanEqualsToken::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: GreaterThanEqualsToken) -> FunctionLikeDeclaration;
```
## GreaterThanEqualsToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: GreaterThanEqualsToken) -> int;
```
## GreaterThanEqualsToken::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: GreaterThanEqualsToken) -> int;
```
## GreaterThanEqualsToken::getIndex

```rust
pub fn getIndex(self: GreaterThanEqualsToken) -> int;
```
## GreaterThanEqualsToken::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: GreaterThanEqualsToken) -> *Node;
```
## GreaterThanEqualsToken::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *GreaterThanEqualsToken;
```
## GreaterThanEqualsToken::is\<T\>

```rust
pub fn is<T>(self: GreaterThanEqualsToken) -> bool;
```
## GreaterThanEqualsToken::to\<T\>

```rust
pub fn to<T>(self: GreaterThanEqualsToken) -> <any>;
```
## GreaterThanEqualsToken::key\_neq

```rust
pub fn key_neq(self: GreaterThanEqualsToken, object: <any>) -> bool;
```
## GreaterThanEqualsToken::key\_eq

```rust
pub fn key_eq(self: GreaterThanEqualsToken, object: <any>) -> bool;
```
## GreaterThanEqualsToken::to\_set

```rust
pub fn to_set(self: GreaterThanEqualsToken) -> *GreaterThanEqualsToken;
```
