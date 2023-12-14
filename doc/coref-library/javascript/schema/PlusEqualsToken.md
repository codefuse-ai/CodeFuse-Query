# PlusEqualsToken

Primary key: `id: int`

```rust
schema PlusEqualsToken {
  @primary id: int,
}
```
## PlusEqualsToken::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: PlusEqualsToken) -> Location;
```
## PlusEqualsToken::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: PlusEqualsToken) -> Symbol;
```
## PlusEqualsToken::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: PlusEqualsToken) -> *Decorator;
```
## PlusEqualsToken::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: PlusEqualsToken) -> string;
```
## PlusEqualsToken::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: PlusEqualsToken, i: int) -> Modifier;
```
## PlusEqualsToken::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: PlusEqualsToken) -> *Comment;
```
## PlusEqualsToken::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: PlusEqualsToken) -> *Node;
```
## PlusEqualsToken::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: PlusEqualsToken) -> *Node;
```
## PlusEqualsToken::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: PlusEqualsToken) -> Node;
```
## PlusEqualsToken::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: PlusEqualsToken) -> int;
```
## PlusEqualsToken::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: PlusEqualsToken) -> TopLevelDO;
```
## PlusEqualsToken::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: PlusEqualsToken, i: int) -> Decorator;
```
## PlusEqualsToken::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: PlusEqualsToken) -> int;
```
## PlusEqualsToken::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: PlusEqualsToken) -> *Modifier;
```
## PlusEqualsToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: PlusEqualsToken) -> int;
```
## PlusEqualsToken::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: PlusEqualsToken, i: int) -> Node;
```
## PlusEqualsToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: PlusEqualsToken) -> int;
```
## PlusEqualsToken::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: PlusEqualsToken) -> *FunctionLikeDeclaration;
```
## PlusEqualsToken::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: PlusEqualsToken, level: int) -> *Node;
```
## PlusEqualsToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: PlusEqualsToken) -> int;
```
## PlusEqualsToken::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: PlusEqualsToken) -> string;
```
## PlusEqualsToken::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: PlusEqualsToken, level: int) -> Node;
```
## PlusEqualsToken::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: PlusEqualsToken) -> File;
```
## PlusEqualsToken::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: PlusEqualsToken) -> *Comment;
```
## PlusEqualsToken::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: PlusEqualsToken) -> *Comment;
```
## PlusEqualsToken::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: PlusEqualsToken) -> Node;
```
## PlusEqualsToken::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: PlusEqualsToken) -> FunctionLikeDeclaration;
```
## PlusEqualsToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: PlusEqualsToken) -> int;
```
## PlusEqualsToken::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: PlusEqualsToken) -> int;
```
## PlusEqualsToken::getIndex

```rust
pub fn getIndex(self: PlusEqualsToken) -> int;
```
## PlusEqualsToken::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: PlusEqualsToken) -> *Node;
```
## PlusEqualsToken::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *PlusEqualsToken;
```
## PlusEqualsToken::is\<T\>

```rust
pub fn is<T>(self: PlusEqualsToken) -> bool;
```
## PlusEqualsToken::to\<T\>

```rust
pub fn to<T>(self: PlusEqualsToken) -> <any>;
```
## PlusEqualsToken::key\_neq

```rust
pub fn key_neq(self: PlusEqualsToken, object: <any>) -> bool;
```
## PlusEqualsToken::key\_eq

```rust
pub fn key_eq(self: PlusEqualsToken, object: <any>) -> bool;
```
## PlusEqualsToken::to\_set

```rust
pub fn to_set(self: PlusEqualsToken) -> *PlusEqualsToken;
```
