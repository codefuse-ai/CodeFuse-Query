# LessThanLessThanEqualsToken

Primary key: `id: int`

```rust
schema LessThanLessThanEqualsToken {
  @primary id: int,
}
```
## LessThanLessThanEqualsToken::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: LessThanLessThanEqualsToken) -> Location;
```
## LessThanLessThanEqualsToken::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: LessThanLessThanEqualsToken) -> Symbol;
```
## LessThanLessThanEqualsToken::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: LessThanLessThanEqualsToken) -> *Decorator;
```
## LessThanLessThanEqualsToken::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: LessThanLessThanEqualsToken) -> string;
```
## LessThanLessThanEqualsToken::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: LessThanLessThanEqualsToken, i: int) -> Modifier;
```
## LessThanLessThanEqualsToken::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: LessThanLessThanEqualsToken) -> *Comment;
```
## LessThanLessThanEqualsToken::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: LessThanLessThanEqualsToken) -> *Node;
```
## LessThanLessThanEqualsToken::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: LessThanLessThanEqualsToken) -> *Node;
```
## LessThanLessThanEqualsToken::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: LessThanLessThanEqualsToken) -> Node;
```
## LessThanLessThanEqualsToken::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: LessThanLessThanEqualsToken) -> int;
```
## LessThanLessThanEqualsToken::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: LessThanLessThanEqualsToken) -> TopLevelDO;
```
## LessThanLessThanEqualsToken::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: LessThanLessThanEqualsToken, i: int) -> Decorator;
```
## LessThanLessThanEqualsToken::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: LessThanLessThanEqualsToken) -> int;
```
## LessThanLessThanEqualsToken::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: LessThanLessThanEqualsToken) -> *Modifier;
```
## LessThanLessThanEqualsToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: LessThanLessThanEqualsToken) -> int;
```
## LessThanLessThanEqualsToken::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: LessThanLessThanEqualsToken, i: int) -> Node;
```
## LessThanLessThanEqualsToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: LessThanLessThanEqualsToken) -> int;
```
## LessThanLessThanEqualsToken::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: LessThanLessThanEqualsToken) -> *FunctionLikeDeclaration;
```
## LessThanLessThanEqualsToken::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: LessThanLessThanEqualsToken, level: int) -> *Node;
```
## LessThanLessThanEqualsToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: LessThanLessThanEqualsToken) -> int;
```
## LessThanLessThanEqualsToken::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: LessThanLessThanEqualsToken) -> string;
```
## LessThanLessThanEqualsToken::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: LessThanLessThanEqualsToken, level: int) -> Node;
```
## LessThanLessThanEqualsToken::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: LessThanLessThanEqualsToken) -> File;
```
## LessThanLessThanEqualsToken::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: LessThanLessThanEqualsToken) -> *Comment;
```
## LessThanLessThanEqualsToken::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: LessThanLessThanEqualsToken) -> *Comment;
```
## LessThanLessThanEqualsToken::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: LessThanLessThanEqualsToken) -> Node;
```
## LessThanLessThanEqualsToken::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: LessThanLessThanEqualsToken) -> FunctionLikeDeclaration;
```
## LessThanLessThanEqualsToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: LessThanLessThanEqualsToken) -> int;
```
## LessThanLessThanEqualsToken::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: LessThanLessThanEqualsToken) -> int;
```
## LessThanLessThanEqualsToken::getIndex

```rust
pub fn getIndex(self: LessThanLessThanEqualsToken) -> int;
```
## LessThanLessThanEqualsToken::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: LessThanLessThanEqualsToken) -> *Node;
```
## LessThanLessThanEqualsToken::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *LessThanLessThanEqualsToken;
```
## LessThanLessThanEqualsToken::is\<T\>

```rust
pub fn is<T>(self: LessThanLessThanEqualsToken) -> bool;
```
## LessThanLessThanEqualsToken::to\<T\>

```rust
pub fn to<T>(self: LessThanLessThanEqualsToken) -> <any>;
```
## LessThanLessThanEqualsToken::key\_neq

```rust
pub fn key_neq(self: LessThanLessThanEqualsToken, object: <any>) -> bool;
```
## LessThanLessThanEqualsToken::key\_eq

```rust
pub fn key_eq(self: LessThanLessThanEqualsToken, object: <any>) -> bool;
```
## LessThanLessThanEqualsToken::to\_set

```rust
pub fn to_set(self: LessThanLessThanEqualsToken) -> *LessThanLessThanEqualsToken;
```
