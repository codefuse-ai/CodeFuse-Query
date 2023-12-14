# IdentifierToken

Primary key: `id: int`

```rust
schema IdentifierToken {
  @primary id: int,
}
```
## IdentifierToken::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: IdentifierToken) -> Location;
```
## IdentifierToken::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: IdentifierToken) -> Symbol;
```
## IdentifierToken::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: IdentifierToken) -> *Decorator;
```
## IdentifierToken::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: IdentifierToken) -> string;
```
## IdentifierToken::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: IdentifierToken, i: int) -> Modifier;
```
## IdentifierToken::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: IdentifierToken) -> *Comment;
```
## IdentifierToken::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: IdentifierToken) -> *Node;
```
## IdentifierToken::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: IdentifierToken) -> *Node;
```
## IdentifierToken::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: IdentifierToken) -> Node;
```
## IdentifierToken::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: IdentifierToken) -> int;
```
## IdentifierToken::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: IdentifierToken) -> TopLevelDO;
```
## IdentifierToken::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: IdentifierToken, i: int) -> Decorator;
```
## IdentifierToken::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: IdentifierToken) -> int;
```
## IdentifierToken::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: IdentifierToken) -> *Modifier;
```
## IdentifierToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: IdentifierToken) -> int;
```
## IdentifierToken::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: IdentifierToken, i: int) -> Node;
```
## IdentifierToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: IdentifierToken) -> int;
```
## IdentifierToken::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: IdentifierToken) -> *FunctionLikeDeclaration;
```
## IdentifierToken::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: IdentifierToken, level: int) -> *Node;
```
## IdentifierToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: IdentifierToken) -> int;
```
## IdentifierToken::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: IdentifierToken) -> string;
```
## IdentifierToken::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: IdentifierToken, level: int) -> Node;
```
## IdentifierToken::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: IdentifierToken) -> File;
```
## IdentifierToken::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: IdentifierToken) -> *Comment;
```
## IdentifierToken::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: IdentifierToken) -> *Comment;
```
## IdentifierToken::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: IdentifierToken) -> Node;
```
## IdentifierToken::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: IdentifierToken) -> FunctionLikeDeclaration;
```
## IdentifierToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: IdentifierToken) -> int;
```
## IdentifierToken::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: IdentifierToken) -> int;
```
## IdentifierToken::getIndex

```rust
pub fn getIndex(self: IdentifierToken) -> int;
```
## IdentifierToken::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: IdentifierToken) -> *Node;
```
## IdentifierToken::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *IdentifierToken;
```
## IdentifierToken::is\<T\>

```rust
pub fn is<T>(self: IdentifierToken) -> bool;
```
## IdentifierToken::to\<T\>

```rust
pub fn to<T>(self: IdentifierToken) -> <any>;
```
## IdentifierToken::key\_neq

```rust
pub fn key_neq(self: IdentifierToken, object: <any>) -> bool;
```
## IdentifierToken::key\_eq

```rust
pub fn key_eq(self: IdentifierToken, object: <any>) -> bool;
```
## IdentifierToken::to\_set

```rust
pub fn to_set(self: IdentifierToken) -> *IdentifierToken;
```
