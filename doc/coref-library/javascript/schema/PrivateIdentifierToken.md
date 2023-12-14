# PrivateIdentifierToken

Primary key: `id: int`

```rust
schema PrivateIdentifierToken {
  @primary id: int,
}
```
## PrivateIdentifierToken::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: PrivateIdentifierToken) -> Location;
```
## PrivateIdentifierToken::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: PrivateIdentifierToken) -> Symbol;
```
## PrivateIdentifierToken::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: PrivateIdentifierToken) -> *Decorator;
```
## PrivateIdentifierToken::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: PrivateIdentifierToken) -> string;
```
## PrivateIdentifierToken::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: PrivateIdentifierToken, i: int) -> Modifier;
```
## PrivateIdentifierToken::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: PrivateIdentifierToken) -> *Comment;
```
## PrivateIdentifierToken::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: PrivateIdentifierToken) -> *Node;
```
## PrivateIdentifierToken::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: PrivateIdentifierToken) -> *Node;
```
## PrivateIdentifierToken::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: PrivateIdentifierToken) -> Node;
```
## PrivateIdentifierToken::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: PrivateIdentifierToken) -> int;
```
## PrivateIdentifierToken::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: PrivateIdentifierToken) -> TopLevelDO;
```
## PrivateIdentifierToken::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: PrivateIdentifierToken, i: int) -> Decorator;
```
## PrivateIdentifierToken::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: PrivateIdentifierToken) -> int;
```
## PrivateIdentifierToken::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: PrivateIdentifierToken) -> *Modifier;
```
## PrivateIdentifierToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: PrivateIdentifierToken) -> int;
```
## PrivateIdentifierToken::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: PrivateIdentifierToken, i: int) -> Node;
```
## PrivateIdentifierToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: PrivateIdentifierToken) -> int;
```
## PrivateIdentifierToken::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: PrivateIdentifierToken) -> *FunctionLikeDeclaration;
```
## PrivateIdentifierToken::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: PrivateIdentifierToken, level: int) -> *Node;
```
## PrivateIdentifierToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: PrivateIdentifierToken) -> int;
```
## PrivateIdentifierToken::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: PrivateIdentifierToken) -> string;
```
## PrivateIdentifierToken::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: PrivateIdentifierToken, level: int) -> Node;
```
## PrivateIdentifierToken::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: PrivateIdentifierToken) -> File;
```
## PrivateIdentifierToken::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: PrivateIdentifierToken) -> *Comment;
```
## PrivateIdentifierToken::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: PrivateIdentifierToken) -> *Comment;
```
## PrivateIdentifierToken::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: PrivateIdentifierToken) -> Node;
```
## PrivateIdentifierToken::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: PrivateIdentifierToken) -> FunctionLikeDeclaration;
```
## PrivateIdentifierToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: PrivateIdentifierToken) -> int;
```
## PrivateIdentifierToken::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: PrivateIdentifierToken) -> int;
```
## PrivateIdentifierToken::getIndex

```rust
pub fn getIndex(self: PrivateIdentifierToken) -> int;
```
## PrivateIdentifierToken::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: PrivateIdentifierToken) -> *Node;
```
## PrivateIdentifierToken::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *PrivateIdentifierToken;
```
## PrivateIdentifierToken::is\<T\>

```rust
pub fn is<T>(self: PrivateIdentifierToken) -> bool;
```
## PrivateIdentifierToken::to\<T\>

```rust
pub fn to<T>(self: PrivateIdentifierToken) -> <any>;
```
## PrivateIdentifierToken::key\_neq

```rust
pub fn key_neq(self: PrivateIdentifierToken, object: <any>) -> bool;
```
## PrivateIdentifierToken::key\_eq

```rust
pub fn key_eq(self: PrivateIdentifierToken, object: <any>) -> bool;
```
## PrivateIdentifierToken::to\_set

```rust
pub fn to_set(self: PrivateIdentifierToken) -> *PrivateIdentifierToken;
```
