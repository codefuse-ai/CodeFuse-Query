# PlusPlusToken

Primary key: `id: int`

```rust
schema PlusPlusToken {
  @primary id: int,
}
```
## PlusPlusToken::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: PlusPlusToken) -> Location;
```
## PlusPlusToken::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: PlusPlusToken) -> Symbol;
```
## PlusPlusToken::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: PlusPlusToken) -> *Decorator;
```
## PlusPlusToken::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: PlusPlusToken) -> string;
```
## PlusPlusToken::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: PlusPlusToken, i: int) -> Modifier;
```
## PlusPlusToken::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: PlusPlusToken) -> *Comment;
```
## PlusPlusToken::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: PlusPlusToken) -> *Node;
```
## PlusPlusToken::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: PlusPlusToken) -> *Node;
```
## PlusPlusToken::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: PlusPlusToken) -> Node;
```
## PlusPlusToken::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: PlusPlusToken) -> int;
```
## PlusPlusToken::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: PlusPlusToken) -> TopLevelDO;
```
## PlusPlusToken::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: PlusPlusToken, i: int) -> Decorator;
```
## PlusPlusToken::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: PlusPlusToken) -> int;
```
## PlusPlusToken::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: PlusPlusToken) -> *Modifier;
```
## PlusPlusToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: PlusPlusToken) -> int;
```
## PlusPlusToken::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: PlusPlusToken, i: int) -> Node;
```
## PlusPlusToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: PlusPlusToken) -> int;
```
## PlusPlusToken::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: PlusPlusToken) -> *FunctionLikeDeclaration;
```
## PlusPlusToken::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: PlusPlusToken, level: int) -> *Node;
```
## PlusPlusToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: PlusPlusToken) -> int;
```
## PlusPlusToken::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: PlusPlusToken) -> string;
```
## PlusPlusToken::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: PlusPlusToken, level: int) -> Node;
```
## PlusPlusToken::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: PlusPlusToken) -> File;
```
## PlusPlusToken::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: PlusPlusToken) -> *Comment;
```
## PlusPlusToken::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: PlusPlusToken) -> *Comment;
```
## PlusPlusToken::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: PlusPlusToken) -> Node;
```
## PlusPlusToken::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: PlusPlusToken) -> FunctionLikeDeclaration;
```
## PlusPlusToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: PlusPlusToken) -> int;
```
## PlusPlusToken::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: PlusPlusToken) -> int;
```
## PlusPlusToken::getIndex

```rust
pub fn getIndex(self: PlusPlusToken) -> int;
```
## PlusPlusToken::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: PlusPlusToken) -> *Node;
```
## PlusPlusToken::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *PlusPlusToken;
```
## PlusPlusToken::is\<T\>

```rust
pub fn is<T>(self: PlusPlusToken) -> bool;
```
## PlusPlusToken::to\<T\>

```rust
pub fn to<T>(self: PlusPlusToken) -> <any>;
```
## PlusPlusToken::key\_neq

```rust
pub fn key_neq(self: PlusPlusToken, object: <any>) -> bool;
```
## PlusPlusToken::key\_eq

```rust
pub fn key_eq(self: PlusPlusToken, object: <any>) -> bool;
```
## PlusPlusToken::to\_set

```rust
pub fn to_set(self: PlusPlusToken) -> *PlusPlusToken;
```
