# ExclamationEqualsToken

Primary key: `id: int`

```rust
schema ExclamationEqualsToken {
  @primary id: int,
}
```
## ExclamationEqualsToken::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: ExclamationEqualsToken) -> Location;
```
## ExclamationEqualsToken::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: ExclamationEqualsToken) -> Symbol;
```
## ExclamationEqualsToken::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: ExclamationEqualsToken) -> *Decorator;
```
## ExclamationEqualsToken::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: ExclamationEqualsToken) -> string;
```
## ExclamationEqualsToken::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: ExclamationEqualsToken, i: int) -> Modifier;
```
## ExclamationEqualsToken::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: ExclamationEqualsToken) -> *Comment;
```
## ExclamationEqualsToken::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: ExclamationEqualsToken) -> *Node;
```
## ExclamationEqualsToken::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: ExclamationEqualsToken) -> *Node;
```
## ExclamationEqualsToken::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: ExclamationEqualsToken) -> Node;
```
## ExclamationEqualsToken::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: ExclamationEqualsToken) -> int;
```
## ExclamationEqualsToken::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: ExclamationEqualsToken) -> TopLevelDO;
```
## ExclamationEqualsToken::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: ExclamationEqualsToken, i: int) -> Decorator;
```
## ExclamationEqualsToken::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: ExclamationEqualsToken) -> int;
```
## ExclamationEqualsToken::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: ExclamationEqualsToken) -> *Modifier;
```
## ExclamationEqualsToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ExclamationEqualsToken) -> int;
```
## ExclamationEqualsToken::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: ExclamationEqualsToken, i: int) -> Node;
```
## ExclamationEqualsToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ExclamationEqualsToken) -> int;
```
## ExclamationEqualsToken::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ExclamationEqualsToken) -> *FunctionLikeDeclaration;
```
## ExclamationEqualsToken::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: ExclamationEqualsToken, level: int) -> *Node;
```
## ExclamationEqualsToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ExclamationEqualsToken) -> int;
```
## ExclamationEqualsToken::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: ExclamationEqualsToken) -> string;
```
## ExclamationEqualsToken::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: ExclamationEqualsToken, level: int) -> Node;
```
## ExclamationEqualsToken::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: ExclamationEqualsToken) -> File;
```
## ExclamationEqualsToken::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: ExclamationEqualsToken) -> *Comment;
```
## ExclamationEqualsToken::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: ExclamationEqualsToken) -> *Comment;
```
## ExclamationEqualsToken::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: ExclamationEqualsToken) -> Node;
```
## ExclamationEqualsToken::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: ExclamationEqualsToken) -> FunctionLikeDeclaration;
```
## ExclamationEqualsToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ExclamationEqualsToken) -> int;
```
## ExclamationEqualsToken::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: ExclamationEqualsToken) -> int;
```
## ExclamationEqualsToken::getIndex

```rust
pub fn getIndex(self: ExclamationEqualsToken) -> int;
```
## ExclamationEqualsToken::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: ExclamationEqualsToken) -> *Node;
```
## ExclamationEqualsToken::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *ExclamationEqualsToken;
```
## ExclamationEqualsToken::is\<T\>

```rust
pub fn is<T>(self: ExclamationEqualsToken) -> bool;
```
## ExclamationEqualsToken::to\<T\>

```rust
pub fn to<T>(self: ExclamationEqualsToken) -> <any>;
```
## ExclamationEqualsToken::key\_neq

```rust
pub fn key_neq(self: ExclamationEqualsToken, object: <any>) -> bool;
```
## ExclamationEqualsToken::key\_eq

```rust
pub fn key_eq(self: ExclamationEqualsToken, object: <any>) -> bool;
```
## ExclamationEqualsToken::to\_set

```rust
pub fn to_set(self: ExclamationEqualsToken) -> *ExclamationEqualsToken;
```
