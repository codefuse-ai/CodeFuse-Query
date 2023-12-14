# StringLiteralToken

Primary key: `id: int`

```rust
schema StringLiteralToken {
  @primary id: int,
}
```
## StringLiteralToken::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: StringLiteralToken) -> Location;
```
## StringLiteralToken::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: StringLiteralToken) -> Symbol;
```
## StringLiteralToken::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: StringLiteralToken) -> *Decorator;
```
## StringLiteralToken::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: StringLiteralToken) -> string;
```
## StringLiteralToken::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: StringLiteralToken, i: int) -> Modifier;
```
## StringLiteralToken::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: StringLiteralToken) -> *Comment;
```
## StringLiteralToken::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: StringLiteralToken) -> *Node;
```
## StringLiteralToken::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: StringLiteralToken) -> *Node;
```
## StringLiteralToken::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: StringLiteralToken) -> Node;
```
## StringLiteralToken::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: StringLiteralToken) -> int;
```
## StringLiteralToken::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: StringLiteralToken) -> TopLevelDO;
```
## StringLiteralToken::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: StringLiteralToken, i: int) -> Decorator;
```
## StringLiteralToken::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: StringLiteralToken) -> int;
```
## StringLiteralToken::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: StringLiteralToken) -> *Modifier;
```
## StringLiteralToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: StringLiteralToken) -> int;
```
## StringLiteralToken::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: StringLiteralToken, i: int) -> Node;
```
## StringLiteralToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: StringLiteralToken) -> int;
```
## StringLiteralToken::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: StringLiteralToken) -> *FunctionLikeDeclaration;
```
## StringLiteralToken::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: StringLiteralToken, level: int) -> *Node;
```
## StringLiteralToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: StringLiteralToken) -> int;
```
## StringLiteralToken::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: StringLiteralToken) -> string;
```
## StringLiteralToken::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: StringLiteralToken, level: int) -> Node;
```
## StringLiteralToken::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: StringLiteralToken) -> File;
```
## StringLiteralToken::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: StringLiteralToken) -> *Comment;
```
## StringLiteralToken::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: StringLiteralToken) -> *Comment;
```
## StringLiteralToken::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: StringLiteralToken) -> Node;
```
## StringLiteralToken::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: StringLiteralToken) -> FunctionLikeDeclaration;
```
## StringLiteralToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: StringLiteralToken) -> int;
```
## StringLiteralToken::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: StringLiteralToken) -> int;
```
## StringLiteralToken::getIndex

```rust
pub fn getIndex(self: StringLiteralToken) -> int;
```
## StringLiteralToken::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: StringLiteralToken) -> *Node;
```
## StringLiteralToken::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *StringLiteralToken;
```
## StringLiteralToken::is\<T\>

```rust
pub fn is<T>(self: StringLiteralToken) -> bool;
```
## StringLiteralToken::to\<T\>

```rust
pub fn to<T>(self: StringLiteralToken) -> <any>;
```
## StringLiteralToken::key\_neq

```rust
pub fn key_neq(self: StringLiteralToken, object: <any>) -> bool;
```
## StringLiteralToken::key\_eq

```rust
pub fn key_eq(self: StringLiteralToken, object: <any>) -> bool;
```
## StringLiteralToken::to\_set

```rust
pub fn to_set(self: StringLiteralToken) -> *StringLiteralToken;
```
