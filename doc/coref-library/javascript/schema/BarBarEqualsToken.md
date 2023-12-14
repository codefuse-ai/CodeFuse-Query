# BarBarEqualsToken

Primary key: `id: int`

```rust
schema BarBarEqualsToken {
  @primary id: int,
}
```
## BarBarEqualsToken::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: BarBarEqualsToken) -> Location;
```
## BarBarEqualsToken::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: BarBarEqualsToken) -> Symbol;
```
## BarBarEqualsToken::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: BarBarEqualsToken) -> *Decorator;
```
## BarBarEqualsToken::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: BarBarEqualsToken) -> string;
```
## BarBarEqualsToken::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: BarBarEqualsToken, i: int) -> Modifier;
```
## BarBarEqualsToken::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: BarBarEqualsToken) -> *Comment;
```
## BarBarEqualsToken::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: BarBarEqualsToken) -> *Node;
```
## BarBarEqualsToken::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: BarBarEqualsToken) -> *Node;
```
## BarBarEqualsToken::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: BarBarEqualsToken) -> Node;
```
## BarBarEqualsToken::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: BarBarEqualsToken) -> int;
```
## BarBarEqualsToken::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: BarBarEqualsToken) -> TopLevelDO;
```
## BarBarEqualsToken::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: BarBarEqualsToken, i: int) -> Decorator;
```
## BarBarEqualsToken::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: BarBarEqualsToken) -> int;
```
## BarBarEqualsToken::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: BarBarEqualsToken) -> *Modifier;
```
## BarBarEqualsToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: BarBarEqualsToken) -> int;
```
## BarBarEqualsToken::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: BarBarEqualsToken, i: int) -> Node;
```
## BarBarEqualsToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: BarBarEqualsToken) -> int;
```
## BarBarEqualsToken::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: BarBarEqualsToken) -> *FunctionLikeDeclaration;
```
## BarBarEqualsToken::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: BarBarEqualsToken, level: int) -> *Node;
```
## BarBarEqualsToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: BarBarEqualsToken) -> int;
```
## BarBarEqualsToken::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: BarBarEqualsToken) -> string;
```
## BarBarEqualsToken::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: BarBarEqualsToken, level: int) -> Node;
```
## BarBarEqualsToken::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: BarBarEqualsToken) -> File;
```
## BarBarEqualsToken::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: BarBarEqualsToken) -> *Comment;
```
## BarBarEqualsToken::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: BarBarEqualsToken) -> *Comment;
```
## BarBarEqualsToken::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: BarBarEqualsToken) -> Node;
```
## BarBarEqualsToken::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: BarBarEqualsToken) -> FunctionLikeDeclaration;
```
## BarBarEqualsToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: BarBarEqualsToken) -> int;
```
## BarBarEqualsToken::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: BarBarEqualsToken) -> int;
```
## BarBarEqualsToken::getIndex

```rust
pub fn getIndex(self: BarBarEqualsToken) -> int;
```
## BarBarEqualsToken::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: BarBarEqualsToken) -> *Node;
```
## BarBarEqualsToken::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *BarBarEqualsToken;
```
## BarBarEqualsToken::is\<T\>

```rust
pub fn is<T>(self: BarBarEqualsToken) -> bool;
```
## BarBarEqualsToken::to\<T\>

```rust
pub fn to<T>(self: BarBarEqualsToken) -> <any>;
```
## BarBarEqualsToken::key\_neq

```rust
pub fn key_neq(self: BarBarEqualsToken, object: <any>) -> bool;
```
## BarBarEqualsToken::key\_eq

```rust
pub fn key_eq(self: BarBarEqualsToken, object: <any>) -> bool;
```
## BarBarEqualsToken::to\_set

```rust
pub fn to_set(self: BarBarEqualsToken) -> *BarBarEqualsToken;
```
