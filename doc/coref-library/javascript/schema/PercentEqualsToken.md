# PercentEqualsToken

Primary key: `id: int`

```rust
schema PercentEqualsToken {
  @primary id: int,
}
```
## PercentEqualsToken::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: PercentEqualsToken) -> Location;
```
## PercentEqualsToken::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: PercentEqualsToken) -> Symbol;
```
## PercentEqualsToken::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: PercentEqualsToken) -> *Decorator;
```
## PercentEqualsToken::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: PercentEqualsToken) -> string;
```
## PercentEqualsToken::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: PercentEqualsToken, i: int) -> Modifier;
```
## PercentEqualsToken::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: PercentEqualsToken) -> *Comment;
```
## PercentEqualsToken::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: PercentEqualsToken) -> *Node;
```
## PercentEqualsToken::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: PercentEqualsToken) -> *Node;
```
## PercentEqualsToken::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: PercentEqualsToken) -> Node;
```
## PercentEqualsToken::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: PercentEqualsToken) -> int;
```
## PercentEqualsToken::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: PercentEqualsToken) -> TopLevelDO;
```
## PercentEqualsToken::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: PercentEqualsToken, i: int) -> Decorator;
```
## PercentEqualsToken::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: PercentEqualsToken) -> int;
```
## PercentEqualsToken::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: PercentEqualsToken) -> *Modifier;
```
## PercentEqualsToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: PercentEqualsToken) -> int;
```
## PercentEqualsToken::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: PercentEqualsToken, i: int) -> Node;
```
## PercentEqualsToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: PercentEqualsToken) -> int;
```
## PercentEqualsToken::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: PercentEqualsToken) -> *FunctionLikeDeclaration;
```
## PercentEqualsToken::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: PercentEqualsToken, level: int) -> *Node;
```
## PercentEqualsToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: PercentEqualsToken) -> int;
```
## PercentEqualsToken::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: PercentEqualsToken) -> string;
```
## PercentEqualsToken::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: PercentEqualsToken, level: int) -> Node;
```
## PercentEqualsToken::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: PercentEqualsToken) -> File;
```
## PercentEqualsToken::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: PercentEqualsToken) -> *Comment;
```
## PercentEqualsToken::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: PercentEqualsToken) -> *Comment;
```
## PercentEqualsToken::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: PercentEqualsToken) -> Node;
```
## PercentEqualsToken::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: PercentEqualsToken) -> FunctionLikeDeclaration;
```
## PercentEqualsToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: PercentEqualsToken) -> int;
```
## PercentEqualsToken::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: PercentEqualsToken) -> int;
```
## PercentEqualsToken::getIndex

```rust
pub fn getIndex(self: PercentEqualsToken) -> int;
```
## PercentEqualsToken::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: PercentEqualsToken) -> *Node;
```
## PercentEqualsToken::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *PercentEqualsToken;
```
## PercentEqualsToken::is\<T\>

```rust
pub fn is<T>(self: PercentEqualsToken) -> bool;
```
## PercentEqualsToken::to\<T\>

```rust
pub fn to<T>(self: PercentEqualsToken) -> <any>;
```
## PercentEqualsToken::key\_neq

```rust
pub fn key_neq(self: PercentEqualsToken, object: <any>) -> bool;
```
## PercentEqualsToken::key\_eq

```rust
pub fn key_eq(self: PercentEqualsToken, object: <any>) -> bool;
```
## PercentEqualsToken::to\_set

```rust
pub fn to_set(self: PercentEqualsToken) -> *PercentEqualsToken;
```
