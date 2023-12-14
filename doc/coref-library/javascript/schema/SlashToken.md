# SlashToken

Primary key: `id: int`

```rust
schema SlashToken {
  @primary id: int,
}
```
## SlashToken::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: SlashToken) -> Location;
```
## SlashToken::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: SlashToken) -> Symbol;
```
## SlashToken::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: SlashToken) -> *Decorator;
```
## SlashToken::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: SlashToken) -> string;
```
## SlashToken::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: SlashToken, i: int) -> Modifier;
```
## SlashToken::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: SlashToken) -> *Comment;
```
## SlashToken::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: SlashToken) -> *Node;
```
## SlashToken::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: SlashToken) -> *Node;
```
## SlashToken::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: SlashToken) -> Node;
```
## SlashToken::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: SlashToken) -> int;
```
## SlashToken::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: SlashToken) -> TopLevelDO;
```
## SlashToken::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: SlashToken, i: int) -> Decorator;
```
## SlashToken::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: SlashToken) -> int;
```
## SlashToken::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: SlashToken) -> *Modifier;
```
## SlashToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: SlashToken) -> int;
```
## SlashToken::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: SlashToken, i: int) -> Node;
```
## SlashToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: SlashToken) -> int;
```
## SlashToken::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: SlashToken) -> *FunctionLikeDeclaration;
```
## SlashToken::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: SlashToken, level: int) -> *Node;
```
## SlashToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: SlashToken) -> int;
```
## SlashToken::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: SlashToken) -> string;
```
## SlashToken::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: SlashToken, level: int) -> Node;
```
## SlashToken::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: SlashToken) -> File;
```
## SlashToken::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: SlashToken) -> *Comment;
```
## SlashToken::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: SlashToken) -> *Comment;
```
## SlashToken::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: SlashToken) -> Node;
```
## SlashToken::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: SlashToken) -> FunctionLikeDeclaration;
```
## SlashToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: SlashToken) -> int;
```
## SlashToken::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: SlashToken) -> int;
```
## SlashToken::getIndex

```rust
pub fn getIndex(self: SlashToken) -> int;
```
## SlashToken::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: SlashToken) -> *Node;
```
## SlashToken::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *SlashToken;
```
## SlashToken::is\<T\>

```rust
pub fn is<T>(self: SlashToken) -> bool;
```
## SlashToken::to\<T\>

```rust
pub fn to<T>(self: SlashToken) -> <any>;
```
## SlashToken::key\_neq

```rust
pub fn key_neq(self: SlashToken, object: <any>) -> bool;
```
## SlashToken::key\_eq

```rust
pub fn key_eq(self: SlashToken, object: <any>) -> bool;
```
## SlashToken::to\_set

```rust
pub fn to_set(self: SlashToken) -> *SlashToken;
```
