# MinusToken

Primary key: `id: int`

```rust
schema MinusToken {
  @primary id: int,
}
```
## MinusToken::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: MinusToken) -> Location;
```
## MinusToken::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: MinusToken) -> Symbol;
```
## MinusToken::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: MinusToken) -> *Decorator;
```
## MinusToken::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: MinusToken) -> string;
```
## MinusToken::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: MinusToken, i: int) -> Modifier;
```
## MinusToken::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: MinusToken) -> *Comment;
```
## MinusToken::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: MinusToken) -> *Node;
```
## MinusToken::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: MinusToken) -> *Node;
```
## MinusToken::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: MinusToken) -> Node;
```
## MinusToken::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: MinusToken) -> int;
```
## MinusToken::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: MinusToken) -> TopLevelDO;
```
## MinusToken::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: MinusToken, i: int) -> Decorator;
```
## MinusToken::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: MinusToken) -> int;
```
## MinusToken::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: MinusToken) -> *Modifier;
```
## MinusToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: MinusToken) -> int;
```
## MinusToken::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: MinusToken, i: int) -> Node;
```
## MinusToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: MinusToken) -> int;
```
## MinusToken::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: MinusToken) -> *FunctionLikeDeclaration;
```
## MinusToken::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: MinusToken, level: int) -> *Node;
```
## MinusToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: MinusToken) -> int;
```
## MinusToken::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: MinusToken) -> string;
```
## MinusToken::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: MinusToken, level: int) -> Node;
```
## MinusToken::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: MinusToken) -> File;
```
## MinusToken::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: MinusToken) -> *Comment;
```
## MinusToken::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: MinusToken) -> *Comment;
```
## MinusToken::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: MinusToken) -> Node;
```
## MinusToken::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: MinusToken) -> FunctionLikeDeclaration;
```
## MinusToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: MinusToken) -> int;
```
## MinusToken::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: MinusToken) -> int;
```
## MinusToken::getIndex

```rust
pub fn getIndex(self: MinusToken) -> int;
```
## MinusToken::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: MinusToken) -> *Node;
```
## MinusToken::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *MinusToken;
```
## MinusToken::is\<T\>

```rust
pub fn is<T>(self: MinusToken) -> bool;
```
## MinusToken::to\<T\>

```rust
pub fn to<T>(self: MinusToken) -> <any>;
```
## MinusToken::key\_neq

```rust
pub fn key_neq(self: MinusToken, object: <any>) -> bool;
```
## MinusToken::key\_eq

```rust
pub fn key_eq(self: MinusToken, object: <any>) -> bool;
```
## MinusToken::to\_set

```rust
pub fn to_set(self: MinusToken) -> *MinusToken;
```
