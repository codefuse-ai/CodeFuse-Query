# CommaToken

Primary key: `id: int`

```rust
schema CommaToken {
  @primary id: int,
}
```
## CommaToken::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: CommaToken) -> Location;
```
## CommaToken::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: CommaToken) -> Symbol;
```
## CommaToken::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: CommaToken) -> *Decorator;
```
## CommaToken::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: CommaToken) -> string;
```
## CommaToken::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: CommaToken, i: int) -> Modifier;
```
## CommaToken::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: CommaToken) -> *Comment;
```
## CommaToken::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: CommaToken) -> *Node;
```
## CommaToken::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: CommaToken) -> *Node;
```
## CommaToken::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: CommaToken) -> Node;
```
## CommaToken::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: CommaToken) -> int;
```
## CommaToken::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: CommaToken) -> TopLevelDO;
```
## CommaToken::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: CommaToken, i: int) -> Decorator;
```
## CommaToken::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: CommaToken) -> int;
```
## CommaToken::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: CommaToken) -> *Modifier;
```
## CommaToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: CommaToken) -> int;
```
## CommaToken::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: CommaToken, i: int) -> Node;
```
## CommaToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: CommaToken) -> int;
```
## CommaToken::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: CommaToken) -> *FunctionLikeDeclaration;
```
## CommaToken::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: CommaToken, level: int) -> *Node;
```
## CommaToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: CommaToken) -> int;
```
## CommaToken::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: CommaToken) -> string;
```
## CommaToken::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: CommaToken, level: int) -> Node;
```
## CommaToken::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: CommaToken) -> File;
```
## CommaToken::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: CommaToken) -> *Comment;
```
## CommaToken::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: CommaToken) -> *Comment;
```
## CommaToken::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: CommaToken) -> Node;
```
## CommaToken::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: CommaToken) -> FunctionLikeDeclaration;
```
## CommaToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: CommaToken) -> int;
```
## CommaToken::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: CommaToken) -> int;
```
## CommaToken::getIndex

```rust
pub fn getIndex(self: CommaToken) -> int;
```
## CommaToken::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: CommaToken) -> *Node;
```
## CommaToken::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *CommaToken;
```
## CommaToken::is\<T\>

```rust
pub fn is<T>(self: CommaToken) -> bool;
```
## CommaToken::to\<T\>

```rust
pub fn to<T>(self: CommaToken) -> <any>;
```
## CommaToken::key\_neq

```rust
pub fn key_neq(self: CommaToken, object: <any>) -> bool;
```
## CommaToken::key\_eq

```rust
pub fn key_eq(self: CommaToken, object: <any>) -> bool;
```
## CommaToken::to\_set

```rust
pub fn to_set(self: CommaToken) -> *CommaToken;
```
