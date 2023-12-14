# CaretToken

Primary key: `id: int`

```rust
schema CaretToken {
  @primary id: int,
}
```
## CaretToken::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: CaretToken) -> Location;
```
## CaretToken::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: CaretToken) -> Symbol;
```
## CaretToken::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: CaretToken) -> *Decorator;
```
## CaretToken::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: CaretToken) -> string;
```
## CaretToken::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: CaretToken, i: int) -> Modifier;
```
## CaretToken::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: CaretToken) -> *Comment;
```
## CaretToken::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: CaretToken) -> *Node;
```
## CaretToken::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: CaretToken) -> *Node;
```
## CaretToken::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: CaretToken) -> Node;
```
## CaretToken::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: CaretToken) -> int;
```
## CaretToken::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: CaretToken) -> TopLevelDO;
```
## CaretToken::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: CaretToken, i: int) -> Decorator;
```
## CaretToken::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: CaretToken) -> int;
```
## CaretToken::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: CaretToken) -> *Modifier;
```
## CaretToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: CaretToken) -> int;
```
## CaretToken::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: CaretToken, i: int) -> Node;
```
## CaretToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: CaretToken) -> int;
```
## CaretToken::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: CaretToken) -> *FunctionLikeDeclaration;
```
## CaretToken::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: CaretToken, level: int) -> *Node;
```
## CaretToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: CaretToken) -> int;
```
## CaretToken::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: CaretToken) -> string;
```
## CaretToken::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: CaretToken, level: int) -> Node;
```
## CaretToken::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: CaretToken) -> File;
```
## CaretToken::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: CaretToken) -> *Comment;
```
## CaretToken::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: CaretToken) -> *Comment;
```
## CaretToken::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: CaretToken) -> Node;
```
## CaretToken::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: CaretToken) -> FunctionLikeDeclaration;
```
## CaretToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: CaretToken) -> int;
```
## CaretToken::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: CaretToken) -> int;
```
## CaretToken::getIndex

```rust
pub fn getIndex(self: CaretToken) -> int;
```
## CaretToken::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: CaretToken) -> *Node;
```
## CaretToken::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *CaretToken;
```
## CaretToken::is\<T\>

```rust
pub fn is<T>(self: CaretToken) -> bool;
```
## CaretToken::to\<T\>

```rust
pub fn to<T>(self: CaretToken) -> <any>;
```
## CaretToken::key\_neq

```rust
pub fn key_neq(self: CaretToken, object: <any>) -> bool;
```
## CaretToken::key\_eq

```rust
pub fn key_eq(self: CaretToken, object: <any>) -> bool;
```
## CaretToken::to\_set

```rust
pub fn to_set(self: CaretToken) -> *CaretToken;
```
