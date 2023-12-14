# MinusEqualsToken

Primary key: `id: int`

```rust
schema MinusEqualsToken {
  @primary id: int,
}
```
## MinusEqualsToken::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: MinusEqualsToken) -> Location;
```
## MinusEqualsToken::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: MinusEqualsToken) -> Symbol;
```
## MinusEqualsToken::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: MinusEqualsToken) -> *Decorator;
```
## MinusEqualsToken::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: MinusEqualsToken) -> string;
```
## MinusEqualsToken::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: MinusEqualsToken, i: int) -> Modifier;
```
## MinusEqualsToken::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: MinusEqualsToken) -> *Comment;
```
## MinusEqualsToken::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: MinusEqualsToken) -> *Node;
```
## MinusEqualsToken::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: MinusEqualsToken) -> *Node;
```
## MinusEqualsToken::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: MinusEqualsToken) -> Node;
```
## MinusEqualsToken::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: MinusEqualsToken) -> int;
```
## MinusEqualsToken::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: MinusEqualsToken) -> TopLevelDO;
```
## MinusEqualsToken::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: MinusEqualsToken, i: int) -> Decorator;
```
## MinusEqualsToken::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: MinusEqualsToken) -> int;
```
## MinusEqualsToken::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: MinusEqualsToken) -> *Modifier;
```
## MinusEqualsToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: MinusEqualsToken) -> int;
```
## MinusEqualsToken::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: MinusEqualsToken, i: int) -> Node;
```
## MinusEqualsToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: MinusEqualsToken) -> int;
```
## MinusEqualsToken::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: MinusEqualsToken) -> *FunctionLikeDeclaration;
```
## MinusEqualsToken::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: MinusEqualsToken, level: int) -> *Node;
```
## MinusEqualsToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: MinusEqualsToken) -> int;
```
## MinusEqualsToken::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: MinusEqualsToken) -> string;
```
## MinusEqualsToken::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: MinusEqualsToken, level: int) -> Node;
```
## MinusEqualsToken::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: MinusEqualsToken) -> File;
```
## MinusEqualsToken::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: MinusEqualsToken) -> *Comment;
```
## MinusEqualsToken::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: MinusEqualsToken) -> *Comment;
```
## MinusEqualsToken::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: MinusEqualsToken) -> Node;
```
## MinusEqualsToken::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: MinusEqualsToken) -> FunctionLikeDeclaration;
```
## MinusEqualsToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: MinusEqualsToken) -> int;
```
## MinusEqualsToken::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: MinusEqualsToken) -> int;
```
## MinusEqualsToken::getIndex

```rust
pub fn getIndex(self: MinusEqualsToken) -> int;
```
## MinusEqualsToken::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: MinusEqualsToken) -> *Node;
```
## MinusEqualsToken::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *MinusEqualsToken;
```
## MinusEqualsToken::is\<T\>

```rust
pub fn is<T>(self: MinusEqualsToken) -> bool;
```
## MinusEqualsToken::to\<T\>

```rust
pub fn to<T>(self: MinusEqualsToken) -> <any>;
```
## MinusEqualsToken::key\_neq

```rust
pub fn key_neq(self: MinusEqualsToken, object: <any>) -> bool;
```
## MinusEqualsToken::key\_eq

```rust
pub fn key_eq(self: MinusEqualsToken, object: <any>) -> bool;
```
## MinusEqualsToken::to\_set

```rust
pub fn to_set(self: MinusEqualsToken) -> *MinusEqualsToken;
```
