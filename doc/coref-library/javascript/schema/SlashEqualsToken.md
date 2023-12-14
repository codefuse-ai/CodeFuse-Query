# SlashEqualsToken

Primary key: `id: int`

```rust
schema SlashEqualsToken {
  @primary id: int,
}
```
## SlashEqualsToken::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: SlashEqualsToken) -> Location;
```
## SlashEqualsToken::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: SlashEqualsToken) -> Symbol;
```
## SlashEqualsToken::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: SlashEqualsToken) -> *Decorator;
```
## SlashEqualsToken::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: SlashEqualsToken) -> string;
```
## SlashEqualsToken::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: SlashEqualsToken, i: int) -> Modifier;
```
## SlashEqualsToken::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: SlashEqualsToken) -> *Comment;
```
## SlashEqualsToken::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: SlashEqualsToken) -> *Node;
```
## SlashEqualsToken::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: SlashEqualsToken) -> *Node;
```
## SlashEqualsToken::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: SlashEqualsToken) -> Node;
```
## SlashEqualsToken::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: SlashEqualsToken) -> int;
```
## SlashEqualsToken::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: SlashEqualsToken) -> TopLevelDO;
```
## SlashEqualsToken::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: SlashEqualsToken, i: int) -> Decorator;
```
## SlashEqualsToken::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: SlashEqualsToken) -> int;
```
## SlashEqualsToken::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: SlashEqualsToken) -> *Modifier;
```
## SlashEqualsToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: SlashEqualsToken) -> int;
```
## SlashEqualsToken::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: SlashEqualsToken, i: int) -> Node;
```
## SlashEqualsToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: SlashEqualsToken) -> int;
```
## SlashEqualsToken::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: SlashEqualsToken) -> *FunctionLikeDeclaration;
```
## SlashEqualsToken::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: SlashEqualsToken, level: int) -> *Node;
```
## SlashEqualsToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: SlashEqualsToken) -> int;
```
## SlashEqualsToken::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: SlashEqualsToken) -> string;
```
## SlashEqualsToken::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: SlashEqualsToken, level: int) -> Node;
```
## SlashEqualsToken::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: SlashEqualsToken) -> File;
```
## SlashEqualsToken::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: SlashEqualsToken) -> *Comment;
```
## SlashEqualsToken::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: SlashEqualsToken) -> *Comment;
```
## SlashEqualsToken::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: SlashEqualsToken) -> Node;
```
## SlashEqualsToken::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: SlashEqualsToken) -> FunctionLikeDeclaration;
```
## SlashEqualsToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: SlashEqualsToken) -> int;
```
## SlashEqualsToken::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: SlashEqualsToken) -> int;
```
## SlashEqualsToken::getIndex

```rust
pub fn getIndex(self: SlashEqualsToken) -> int;
```
## SlashEqualsToken::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: SlashEqualsToken) -> *Node;
```
## SlashEqualsToken::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *SlashEqualsToken;
```
## SlashEqualsToken::is\<T\>

```rust
pub fn is<T>(self: SlashEqualsToken) -> bool;
```
## SlashEqualsToken::to\<T\>

```rust
pub fn to<T>(self: SlashEqualsToken) -> <any>;
```
## SlashEqualsToken::key\_neq

```rust
pub fn key_neq(self: SlashEqualsToken, object: <any>) -> bool;
```
## SlashEqualsToken::key\_eq

```rust
pub fn key_eq(self: SlashEqualsToken, object: <any>) -> bool;
```
## SlashEqualsToken::to\_set

```rust
pub fn to_set(self: SlashEqualsToken) -> *SlashEqualsToken;
```
