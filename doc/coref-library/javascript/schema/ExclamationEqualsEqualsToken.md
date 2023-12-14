# ExclamationEqualsEqualsToken

Primary key: `id: int`

```rust
schema ExclamationEqualsEqualsToken {
  @primary id: int,
}
```
## ExclamationEqualsEqualsToken::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: ExclamationEqualsEqualsToken) -> Location;
```
## ExclamationEqualsEqualsToken::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: ExclamationEqualsEqualsToken) -> Symbol;
```
## ExclamationEqualsEqualsToken::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: ExclamationEqualsEqualsToken) -> *Decorator;
```
## ExclamationEqualsEqualsToken::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: ExclamationEqualsEqualsToken) -> string;
```
## ExclamationEqualsEqualsToken::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: ExclamationEqualsEqualsToken, i: int) -> Modifier;
```
## ExclamationEqualsEqualsToken::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: ExclamationEqualsEqualsToken) -> *Comment;
```
## ExclamationEqualsEqualsToken::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: ExclamationEqualsEqualsToken) -> *Node;
```
## ExclamationEqualsEqualsToken::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: ExclamationEqualsEqualsToken) -> *Node;
```
## ExclamationEqualsEqualsToken::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: ExclamationEqualsEqualsToken) -> Node;
```
## ExclamationEqualsEqualsToken::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: ExclamationEqualsEqualsToken) -> int;
```
## ExclamationEqualsEqualsToken::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: ExclamationEqualsEqualsToken) -> TopLevelDO;
```
## ExclamationEqualsEqualsToken::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: ExclamationEqualsEqualsToken, i: int) -> Decorator;
```
## ExclamationEqualsEqualsToken::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: ExclamationEqualsEqualsToken) -> int;
```
## ExclamationEqualsEqualsToken::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: ExclamationEqualsEqualsToken) -> *Modifier;
```
## ExclamationEqualsEqualsToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ExclamationEqualsEqualsToken) -> int;
```
## ExclamationEqualsEqualsToken::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: ExclamationEqualsEqualsToken, i: int) -> Node;
```
## ExclamationEqualsEqualsToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ExclamationEqualsEqualsToken) -> int;
```
## ExclamationEqualsEqualsToken::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ExclamationEqualsEqualsToken) -> *FunctionLikeDeclaration;
```
## ExclamationEqualsEqualsToken::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: ExclamationEqualsEqualsToken, level: int) -> *Node;
```
## ExclamationEqualsEqualsToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ExclamationEqualsEqualsToken) -> int;
```
## ExclamationEqualsEqualsToken::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: ExclamationEqualsEqualsToken) -> string;
```
## ExclamationEqualsEqualsToken::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: ExclamationEqualsEqualsToken, level: int) -> Node;
```
## ExclamationEqualsEqualsToken::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: ExclamationEqualsEqualsToken) -> File;
```
## ExclamationEqualsEqualsToken::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: ExclamationEqualsEqualsToken) -> *Comment;
```
## ExclamationEqualsEqualsToken::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: ExclamationEqualsEqualsToken) -> *Comment;
```
## ExclamationEqualsEqualsToken::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: ExclamationEqualsEqualsToken) -> Node;
```
## ExclamationEqualsEqualsToken::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: ExclamationEqualsEqualsToken) -> FunctionLikeDeclaration;
```
## ExclamationEqualsEqualsToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ExclamationEqualsEqualsToken) -> int;
```
## ExclamationEqualsEqualsToken::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: ExclamationEqualsEqualsToken) -> int;
```
## ExclamationEqualsEqualsToken::getIndex

```rust
pub fn getIndex(self: ExclamationEqualsEqualsToken) -> int;
```
## ExclamationEqualsEqualsToken::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: ExclamationEqualsEqualsToken) -> *Node;
```
## ExclamationEqualsEqualsToken::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *ExclamationEqualsEqualsToken;
```
## ExclamationEqualsEqualsToken::is\<T\>

```rust
pub fn is<T>(self: ExclamationEqualsEqualsToken) -> bool;
```
## ExclamationEqualsEqualsToken::to\<T\>

```rust
pub fn to<T>(self: ExclamationEqualsEqualsToken) -> <any>;
```
## ExclamationEqualsEqualsToken::key\_neq

```rust
pub fn key_neq(self: ExclamationEqualsEqualsToken, object: <any>) -> bool;
```
## ExclamationEqualsEqualsToken::key\_eq

```rust
pub fn key_eq(self: ExclamationEqualsEqualsToken, object: <any>) -> bool;
```
## ExclamationEqualsEqualsToken::to\_set

```rust
pub fn to_set(self: ExclamationEqualsEqualsToken) -> *ExclamationEqualsEqualsToken;
```
