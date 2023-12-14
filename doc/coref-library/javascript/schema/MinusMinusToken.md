# MinusMinusToken

Primary key: `id: int`

```rust
schema MinusMinusToken {
  @primary id: int,
}
```
## MinusMinusToken::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: MinusMinusToken) -> Location;
```
## MinusMinusToken::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: MinusMinusToken) -> Symbol;
```
## MinusMinusToken::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: MinusMinusToken) -> *Decorator;
```
## MinusMinusToken::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: MinusMinusToken) -> string;
```
## MinusMinusToken::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: MinusMinusToken, i: int) -> Modifier;
```
## MinusMinusToken::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: MinusMinusToken) -> *Comment;
```
## MinusMinusToken::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: MinusMinusToken) -> *Node;
```
## MinusMinusToken::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: MinusMinusToken) -> *Node;
```
## MinusMinusToken::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: MinusMinusToken) -> Node;
```
## MinusMinusToken::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: MinusMinusToken) -> int;
```
## MinusMinusToken::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: MinusMinusToken) -> TopLevelDO;
```
## MinusMinusToken::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: MinusMinusToken, i: int) -> Decorator;
```
## MinusMinusToken::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: MinusMinusToken) -> int;
```
## MinusMinusToken::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: MinusMinusToken) -> *Modifier;
```
## MinusMinusToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: MinusMinusToken) -> int;
```
## MinusMinusToken::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: MinusMinusToken, i: int) -> Node;
```
## MinusMinusToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: MinusMinusToken) -> int;
```
## MinusMinusToken::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: MinusMinusToken) -> *FunctionLikeDeclaration;
```
## MinusMinusToken::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: MinusMinusToken, level: int) -> *Node;
```
## MinusMinusToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: MinusMinusToken) -> int;
```
## MinusMinusToken::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: MinusMinusToken) -> string;
```
## MinusMinusToken::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: MinusMinusToken, level: int) -> Node;
```
## MinusMinusToken::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: MinusMinusToken) -> File;
```
## MinusMinusToken::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: MinusMinusToken) -> *Comment;
```
## MinusMinusToken::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: MinusMinusToken) -> *Comment;
```
## MinusMinusToken::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: MinusMinusToken) -> Node;
```
## MinusMinusToken::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: MinusMinusToken) -> FunctionLikeDeclaration;
```
## MinusMinusToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: MinusMinusToken) -> int;
```
## MinusMinusToken::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: MinusMinusToken) -> int;
```
## MinusMinusToken::getIndex

```rust
pub fn getIndex(self: MinusMinusToken) -> int;
```
## MinusMinusToken::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: MinusMinusToken) -> *Node;
```
## MinusMinusToken::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *MinusMinusToken;
```
## MinusMinusToken::is\<T\>

```rust
pub fn is<T>(self: MinusMinusToken) -> bool;
```
## MinusMinusToken::to\<T\>

```rust
pub fn to<T>(self: MinusMinusToken) -> <any>;
```
## MinusMinusToken::key\_neq

```rust
pub fn key_neq(self: MinusMinusToken, object: <any>) -> bool;
```
## MinusMinusToken::key\_eq

```rust
pub fn key_eq(self: MinusMinusToken, object: <any>) -> bool;
```
## MinusMinusToken::to\_set

```rust
pub fn to_set(self: MinusMinusToken) -> *MinusMinusToken;
```
