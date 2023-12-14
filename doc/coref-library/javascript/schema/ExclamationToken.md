# ExclamationToken

Primary key: `id: int`

```rust
schema ExclamationToken {
  @primary id: int,
}
```
## ExclamationToken::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: ExclamationToken) -> Location;
```
## ExclamationToken::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: ExclamationToken) -> Symbol;
```
## ExclamationToken::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: ExclamationToken) -> *Decorator;
```
## ExclamationToken::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: ExclamationToken) -> string;
```
## ExclamationToken::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: ExclamationToken, i: int) -> Modifier;
```
## ExclamationToken::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: ExclamationToken) -> *Comment;
```
## ExclamationToken::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: ExclamationToken) -> *Node;
```
## ExclamationToken::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: ExclamationToken) -> *Node;
```
## ExclamationToken::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: ExclamationToken) -> Node;
```
## ExclamationToken::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: ExclamationToken) -> int;
```
## ExclamationToken::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: ExclamationToken) -> TopLevelDO;
```
## ExclamationToken::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: ExclamationToken, i: int) -> Decorator;
```
## ExclamationToken::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: ExclamationToken) -> int;
```
## ExclamationToken::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: ExclamationToken) -> *Modifier;
```
## ExclamationToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ExclamationToken) -> int;
```
## ExclamationToken::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: ExclamationToken, i: int) -> Node;
```
## ExclamationToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ExclamationToken) -> int;
```
## ExclamationToken::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ExclamationToken) -> *FunctionLikeDeclaration;
```
## ExclamationToken::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: ExclamationToken, level: int) -> *Node;
```
## ExclamationToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ExclamationToken) -> int;
```
## ExclamationToken::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: ExclamationToken) -> string;
```
## ExclamationToken::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: ExclamationToken, level: int) -> Node;
```
## ExclamationToken::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: ExclamationToken) -> File;
```
## ExclamationToken::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: ExclamationToken) -> *Comment;
```
## ExclamationToken::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: ExclamationToken) -> *Comment;
```
## ExclamationToken::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: ExclamationToken) -> Node;
```
## ExclamationToken::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: ExclamationToken) -> FunctionLikeDeclaration;
```
## ExclamationToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ExclamationToken) -> int;
```
## ExclamationToken::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: ExclamationToken) -> int;
```
## ExclamationToken::getIndex

```rust
pub fn getIndex(self: ExclamationToken) -> int;
```
## ExclamationToken::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: ExclamationToken) -> *Node;
```
## ExclamationToken::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *ExclamationToken;
```
## ExclamationToken::is\<T\>

```rust
pub fn is<T>(self: ExclamationToken) -> bool;
```
## ExclamationToken::to\<T\>

```rust
pub fn to<T>(self: ExclamationToken) -> <any>;
```
## ExclamationToken::key\_neq

```rust
pub fn key_neq(self: ExclamationToken, object: <any>) -> bool;
```
## ExclamationToken::key\_eq

```rust
pub fn key_eq(self: ExclamationToken, object: <any>) -> bool;
```
## ExclamationToken::to\_set

```rust
pub fn to_set(self: ExclamationToken) -> *ExclamationToken;
```
