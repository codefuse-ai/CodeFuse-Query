# LessThanLessThanToken

Primary key: `id: int`

```rust
schema LessThanLessThanToken {
  @primary id: int,
}
```
## LessThanLessThanToken::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: LessThanLessThanToken) -> Location;
```
## LessThanLessThanToken::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: LessThanLessThanToken) -> Symbol;
```
## LessThanLessThanToken::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: LessThanLessThanToken) -> *Decorator;
```
## LessThanLessThanToken::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: LessThanLessThanToken) -> string;
```
## LessThanLessThanToken::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: LessThanLessThanToken, i: int) -> Modifier;
```
## LessThanLessThanToken::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: LessThanLessThanToken) -> *Comment;
```
## LessThanLessThanToken::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: LessThanLessThanToken) -> *Node;
```
## LessThanLessThanToken::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: LessThanLessThanToken) -> *Node;
```
## LessThanLessThanToken::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: LessThanLessThanToken) -> Node;
```
## LessThanLessThanToken::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: LessThanLessThanToken) -> int;
```
## LessThanLessThanToken::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: LessThanLessThanToken) -> TopLevelDO;
```
## LessThanLessThanToken::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: LessThanLessThanToken, i: int) -> Decorator;
```
## LessThanLessThanToken::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: LessThanLessThanToken) -> int;
```
## LessThanLessThanToken::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: LessThanLessThanToken) -> *Modifier;
```
## LessThanLessThanToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: LessThanLessThanToken) -> int;
```
## LessThanLessThanToken::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: LessThanLessThanToken, i: int) -> Node;
```
## LessThanLessThanToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: LessThanLessThanToken) -> int;
```
## LessThanLessThanToken::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: LessThanLessThanToken) -> *FunctionLikeDeclaration;
```
## LessThanLessThanToken::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: LessThanLessThanToken, level: int) -> *Node;
```
## LessThanLessThanToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: LessThanLessThanToken) -> int;
```
## LessThanLessThanToken::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: LessThanLessThanToken) -> string;
```
## LessThanLessThanToken::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: LessThanLessThanToken, level: int) -> Node;
```
## LessThanLessThanToken::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: LessThanLessThanToken) -> File;
```
## LessThanLessThanToken::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: LessThanLessThanToken) -> *Comment;
```
## LessThanLessThanToken::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: LessThanLessThanToken) -> *Comment;
```
## LessThanLessThanToken::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: LessThanLessThanToken) -> Node;
```
## LessThanLessThanToken::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: LessThanLessThanToken) -> FunctionLikeDeclaration;
```
## LessThanLessThanToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: LessThanLessThanToken) -> int;
```
## LessThanLessThanToken::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: LessThanLessThanToken) -> int;
```
## LessThanLessThanToken::getIndex

```rust
pub fn getIndex(self: LessThanLessThanToken) -> int;
```
## LessThanLessThanToken::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: LessThanLessThanToken) -> *Node;
```
## LessThanLessThanToken::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *LessThanLessThanToken;
```
## LessThanLessThanToken::is\<T\>

```rust
pub fn is<T>(self: LessThanLessThanToken) -> bool;
```
## LessThanLessThanToken::to\<T\>

```rust
pub fn to<T>(self: LessThanLessThanToken) -> <any>;
```
## LessThanLessThanToken::key\_neq

```rust
pub fn key_neq(self: LessThanLessThanToken, object: <any>) -> bool;
```
## LessThanLessThanToken::key\_eq

```rust
pub fn key_eq(self: LessThanLessThanToken, object: <any>) -> bool;
```
## LessThanLessThanToken::to\_set

```rust
pub fn to_set(self: LessThanLessThanToken) -> *LessThanLessThanToken;
```
