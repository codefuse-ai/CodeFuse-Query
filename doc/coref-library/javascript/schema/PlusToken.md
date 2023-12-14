# PlusToken

Primary key: `id: int`

```rust
schema PlusToken {
  @primary id: int,
}
```
## PlusToken::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: PlusToken) -> Location;
```
## PlusToken::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: PlusToken) -> Symbol;
```
## PlusToken::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: PlusToken) -> *Decorator;
```
## PlusToken::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: PlusToken) -> string;
```
## PlusToken::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: PlusToken, i: int) -> Modifier;
```
## PlusToken::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: PlusToken) -> *Comment;
```
## PlusToken::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: PlusToken) -> *Node;
```
## PlusToken::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: PlusToken) -> *Node;
```
## PlusToken::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: PlusToken) -> Node;
```
## PlusToken::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: PlusToken) -> int;
```
## PlusToken::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: PlusToken) -> TopLevelDO;
```
## PlusToken::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: PlusToken, i: int) -> Decorator;
```
## PlusToken::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: PlusToken) -> int;
```
## PlusToken::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: PlusToken) -> *Modifier;
```
## PlusToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: PlusToken) -> int;
```
## PlusToken::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: PlusToken, i: int) -> Node;
```
## PlusToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: PlusToken) -> int;
```
## PlusToken::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: PlusToken) -> *FunctionLikeDeclaration;
```
## PlusToken::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: PlusToken, level: int) -> *Node;
```
## PlusToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: PlusToken) -> int;
```
## PlusToken::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: PlusToken) -> string;
```
## PlusToken::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: PlusToken, level: int) -> Node;
```
## PlusToken::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: PlusToken) -> File;
```
## PlusToken::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: PlusToken) -> *Comment;
```
## PlusToken::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: PlusToken) -> *Comment;
```
## PlusToken::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: PlusToken) -> Node;
```
## PlusToken::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: PlusToken) -> FunctionLikeDeclaration;
```
## PlusToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: PlusToken) -> int;
```
## PlusToken::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: PlusToken) -> int;
```
## PlusToken::getIndex

```rust
pub fn getIndex(self: PlusToken) -> int;
```
## PlusToken::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: PlusToken) -> *Node;
```
## PlusToken::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *PlusToken;
```
## PlusToken::is\<T\>

```rust
pub fn is<T>(self: PlusToken) -> bool;
```
## PlusToken::to\<T\>

```rust
pub fn to<T>(self: PlusToken) -> <any>;
```
## PlusToken::key\_neq

```rust
pub fn key_neq(self: PlusToken, object: <any>) -> bool;
```
## PlusToken::key\_eq

```rust
pub fn key_eq(self: PlusToken, object: <any>) -> bool;
```
## PlusToken::to\_set

```rust
pub fn to_set(self: PlusToken) -> *PlusToken;
```
