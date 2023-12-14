# CaretEqualsToken

Primary key: `id: int`

```rust
schema CaretEqualsToken {
  @primary id: int,
}
```
## CaretEqualsToken::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: CaretEqualsToken) -> Location;
```
## CaretEqualsToken::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: CaretEqualsToken) -> Symbol;
```
## CaretEqualsToken::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: CaretEqualsToken) -> *Decorator;
```
## CaretEqualsToken::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: CaretEqualsToken) -> string;
```
## CaretEqualsToken::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: CaretEqualsToken, i: int) -> Modifier;
```
## CaretEqualsToken::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: CaretEqualsToken) -> *Comment;
```
## CaretEqualsToken::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: CaretEqualsToken) -> *Node;
```
## CaretEqualsToken::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: CaretEqualsToken) -> *Node;
```
## CaretEqualsToken::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: CaretEqualsToken) -> Node;
```
## CaretEqualsToken::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: CaretEqualsToken) -> int;
```
## CaretEqualsToken::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: CaretEqualsToken) -> TopLevelDO;
```
## CaretEqualsToken::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: CaretEqualsToken, i: int) -> Decorator;
```
## CaretEqualsToken::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: CaretEqualsToken) -> int;
```
## CaretEqualsToken::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: CaretEqualsToken) -> *Modifier;
```
## CaretEqualsToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: CaretEqualsToken) -> int;
```
## CaretEqualsToken::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: CaretEqualsToken, i: int) -> Node;
```
## CaretEqualsToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: CaretEqualsToken) -> int;
```
## CaretEqualsToken::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: CaretEqualsToken) -> *FunctionLikeDeclaration;
```
## CaretEqualsToken::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: CaretEqualsToken, level: int) -> *Node;
```
## CaretEqualsToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: CaretEqualsToken) -> int;
```
## CaretEqualsToken::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: CaretEqualsToken) -> string;
```
## CaretEqualsToken::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: CaretEqualsToken, level: int) -> Node;
```
## CaretEqualsToken::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: CaretEqualsToken) -> File;
```
## CaretEqualsToken::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: CaretEqualsToken) -> *Comment;
```
## CaretEqualsToken::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: CaretEqualsToken) -> *Comment;
```
## CaretEqualsToken::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: CaretEqualsToken) -> Node;
```
## CaretEqualsToken::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: CaretEqualsToken) -> FunctionLikeDeclaration;
```
## CaretEqualsToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: CaretEqualsToken) -> int;
```
## CaretEqualsToken::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: CaretEqualsToken) -> int;
```
## CaretEqualsToken::getIndex

```rust
pub fn getIndex(self: CaretEqualsToken) -> int;
```
## CaretEqualsToken::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: CaretEqualsToken) -> *Node;
```
## CaretEqualsToken::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *CaretEqualsToken;
```
## CaretEqualsToken::is\<T\>

```rust
pub fn is<T>(self: CaretEqualsToken) -> bool;
```
## CaretEqualsToken::to\<T\>

```rust
pub fn to<T>(self: CaretEqualsToken) -> <any>;
```
## CaretEqualsToken::key\_neq

```rust
pub fn key_neq(self: CaretEqualsToken, object: <any>) -> bool;
```
## CaretEqualsToken::key\_eq

```rust
pub fn key_eq(self: CaretEqualsToken, object: <any>) -> bool;
```
## CaretEqualsToken::to\_set

```rust
pub fn to_set(self: CaretEqualsToken) -> *CaretEqualsToken;
```
