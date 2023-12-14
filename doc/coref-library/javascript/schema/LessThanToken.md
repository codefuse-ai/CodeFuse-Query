# LessThanToken

Primary key: `id: int`

```rust
schema LessThanToken {
  @primary id: int,
}
```
## LessThanToken::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: LessThanToken) -> Location;
```
## LessThanToken::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: LessThanToken) -> Symbol;
```
## LessThanToken::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: LessThanToken) -> *Decorator;
```
## LessThanToken::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: LessThanToken) -> string;
```
## LessThanToken::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: LessThanToken, i: int) -> Modifier;
```
## LessThanToken::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: LessThanToken) -> *Comment;
```
## LessThanToken::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: LessThanToken) -> *Node;
```
## LessThanToken::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: LessThanToken) -> *Node;
```
## LessThanToken::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: LessThanToken) -> Node;
```
## LessThanToken::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: LessThanToken) -> int;
```
## LessThanToken::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: LessThanToken) -> TopLevelDO;
```
## LessThanToken::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: LessThanToken, i: int) -> Decorator;
```
## LessThanToken::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: LessThanToken) -> int;
```
## LessThanToken::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: LessThanToken) -> *Modifier;
```
## LessThanToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: LessThanToken) -> int;
```
## LessThanToken::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: LessThanToken, i: int) -> Node;
```
## LessThanToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: LessThanToken) -> int;
```
## LessThanToken::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: LessThanToken) -> *FunctionLikeDeclaration;
```
## LessThanToken::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: LessThanToken, level: int) -> *Node;
```
## LessThanToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: LessThanToken) -> int;
```
## LessThanToken::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: LessThanToken) -> string;
```
## LessThanToken::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: LessThanToken, level: int) -> Node;
```
## LessThanToken::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: LessThanToken) -> File;
```
## LessThanToken::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: LessThanToken) -> *Comment;
```
## LessThanToken::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: LessThanToken) -> *Comment;
```
## LessThanToken::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: LessThanToken) -> Node;
```
## LessThanToken::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: LessThanToken) -> FunctionLikeDeclaration;
```
## LessThanToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: LessThanToken) -> int;
```
## LessThanToken::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: LessThanToken) -> int;
```
## LessThanToken::getIndex

```rust
pub fn getIndex(self: LessThanToken) -> int;
```
## LessThanToken::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: LessThanToken) -> *Node;
```
## LessThanToken::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *LessThanToken;
```
## LessThanToken::is\<T\>

```rust
pub fn is<T>(self: LessThanToken) -> bool;
```
## LessThanToken::to\<T\>

```rust
pub fn to<T>(self: LessThanToken) -> <any>;
```
## LessThanToken::key\_neq

```rust
pub fn key_neq(self: LessThanToken, object: <any>) -> bool;
```
## LessThanToken::key\_eq

```rust
pub fn key_eq(self: LessThanToken, object: <any>) -> bool;
```
## LessThanToken::to\_set

```rust
pub fn to_set(self: LessThanToken) -> *LessThanToken;
```
