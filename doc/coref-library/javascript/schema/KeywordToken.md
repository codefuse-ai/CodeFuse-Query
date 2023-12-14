# KeywordToken

Primary key: `id: int`

```rust
schema KeywordToken {
  @primary id: int,
}
```
## KeywordToken::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: KeywordToken) -> Location;
```
## KeywordToken::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: KeywordToken) -> Symbol;
```
## KeywordToken::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: KeywordToken) -> *Decorator;
```
## KeywordToken::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: KeywordToken) -> string;
```
## KeywordToken::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: KeywordToken, i: int) -> Modifier;
```
## KeywordToken::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: KeywordToken) -> *Comment;
```
## KeywordToken::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: KeywordToken) -> *Node;
```
## KeywordToken::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: KeywordToken) -> *Node;
```
## KeywordToken::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: KeywordToken) -> Node;
```
## KeywordToken::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: KeywordToken) -> int;
```
## KeywordToken::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: KeywordToken) -> TopLevelDO;
```
## KeywordToken::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: KeywordToken, i: int) -> Decorator;
```
## KeywordToken::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: KeywordToken) -> int;
```
## KeywordToken::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: KeywordToken) -> *Modifier;
```
## KeywordToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: KeywordToken) -> int;
```
## KeywordToken::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: KeywordToken, i: int) -> Node;
```
## KeywordToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: KeywordToken) -> int;
```
## KeywordToken::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: KeywordToken) -> *FunctionLikeDeclaration;
```
## KeywordToken::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: KeywordToken, level: int) -> *Node;
```
## KeywordToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: KeywordToken) -> int;
```
## KeywordToken::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: KeywordToken) -> string;
```
## KeywordToken::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: KeywordToken, level: int) -> Node;
```
## KeywordToken::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: KeywordToken) -> File;
```
## KeywordToken::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: KeywordToken) -> *Comment;
```
## KeywordToken::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: KeywordToken) -> *Comment;
```
## KeywordToken::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: KeywordToken) -> Node;
```
## KeywordToken::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: KeywordToken) -> FunctionLikeDeclaration;
```
## KeywordToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: KeywordToken) -> int;
```
## KeywordToken::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: KeywordToken) -> int;
```
## KeywordToken::getIndex

```rust
pub fn getIndex(self: KeywordToken) -> int;
```
## KeywordToken::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: KeywordToken) -> *Node;
```
## KeywordToken::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *KeywordToken;
```
## KeywordToken::is\<T\>

```rust
pub fn is<T>(self: KeywordToken) -> bool;
```
## KeywordToken::to\<T\>

```rust
pub fn to<T>(self: KeywordToken) -> <any>;
```
## KeywordToken::key\_neq

```rust
pub fn key_neq(self: KeywordToken, object: <any>) -> bool;
```
## KeywordToken::key\_eq

```rust
pub fn key_eq(self: KeywordToken, object: <any>) -> bool;
```
## KeywordToken::to\_set

```rust
pub fn to_set(self: KeywordToken) -> *KeywordToken;
```
