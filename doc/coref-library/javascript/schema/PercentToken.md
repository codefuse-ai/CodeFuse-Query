# PercentToken

Primary key: `id: int`

```rust
schema PercentToken {
  @primary id: int,
}
```
## PercentToken::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: PercentToken) -> Location;
```
## PercentToken::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: PercentToken) -> Symbol;
```
## PercentToken::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: PercentToken) -> *Decorator;
```
## PercentToken::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: PercentToken) -> string;
```
## PercentToken::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: PercentToken, i: int) -> Modifier;
```
## PercentToken::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: PercentToken) -> *Comment;
```
## PercentToken::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: PercentToken) -> *Node;
```
## PercentToken::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: PercentToken) -> *Node;
```
## PercentToken::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: PercentToken) -> Node;
```
## PercentToken::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: PercentToken) -> int;
```
## PercentToken::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: PercentToken) -> TopLevelDO;
```
## PercentToken::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: PercentToken, i: int) -> Decorator;
```
## PercentToken::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: PercentToken) -> int;
```
## PercentToken::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: PercentToken) -> *Modifier;
```
## PercentToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: PercentToken) -> int;
```
## PercentToken::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: PercentToken, i: int) -> Node;
```
## PercentToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: PercentToken) -> int;
```
## PercentToken::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: PercentToken) -> *FunctionLikeDeclaration;
```
## PercentToken::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: PercentToken, level: int) -> *Node;
```
## PercentToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: PercentToken) -> int;
```
## PercentToken::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: PercentToken) -> string;
```
## PercentToken::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: PercentToken, level: int) -> Node;
```
## PercentToken::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: PercentToken) -> File;
```
## PercentToken::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: PercentToken) -> *Comment;
```
## PercentToken::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: PercentToken) -> *Comment;
```
## PercentToken::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: PercentToken) -> Node;
```
## PercentToken::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: PercentToken) -> FunctionLikeDeclaration;
```
## PercentToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: PercentToken) -> int;
```
## PercentToken::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: PercentToken) -> int;
```
## PercentToken::getIndex

```rust
pub fn getIndex(self: PercentToken) -> int;
```
## PercentToken::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: PercentToken) -> *Node;
```
## PercentToken::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *PercentToken;
```
## PercentToken::is\<T\>

```rust
pub fn is<T>(self: PercentToken) -> bool;
```
## PercentToken::to\<T\>

```rust
pub fn to<T>(self: PercentToken) -> <any>;
```
## PercentToken::key\_neq

```rust
pub fn key_neq(self: PercentToken, object: <any>) -> bool;
```
## PercentToken::key\_eq

```rust
pub fn key_eq(self: PercentToken, object: <any>) -> bool;
```
## PercentToken::to\_set

```rust
pub fn to_set(self: PercentToken) -> *PercentToken;
```
