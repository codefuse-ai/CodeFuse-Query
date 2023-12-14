# Token

Primary key: `id: int`

```rust
schema Token {
  @primary id: int,
}
```
## Token::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: Token) -> *Node;
```
## Token::getIndex

```rust
pub fn getIndex(self: Token) -> int;
```
## Token::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: Token) -> int;
```
## Token::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: Token) -> int;
```
## Token::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: Token) -> Node;
```
## Token::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: Token) -> FunctionLikeDeclaration;
```
## Token::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: Token) -> File;
```
## Token::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: Token, level: int) -> Node;
```
## Token::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: Token) -> string;
```
## Token::getEndLineNumber

```rust
pub fn getEndLineNumber(self: Token) -> int;
```
## Token::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: Token) -> *FunctionLikeDeclaration;
```
## Token::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: Token, level: int) -> *Node;
```
## Token::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: Token) -> int;
```
## Token::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: Token) -> *Modifier;
```
## Token::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: Token) -> int;
```
## Token::getStartLineNumber

```rust
pub fn getStartLineNumber(self: Token) -> int;
```
## Token::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: Token, i: int) -> Node;
```
## Token::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: Token, i: int) -> Decorator;
```
## Token::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: Token) -> TopLevelDO;
```
## Token::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: Token) -> int;
```
## Token::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: Token) -> *Comment;
```
## Token::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: Token) -> *Comment;
```
## Token::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: Token) -> Node;
```
## Token::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: Token) -> *Node;
```
## Token::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: Token) -> *Node;
```
## Token::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: Token) -> *Comment;
```
## Token::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: Token, i: int) -> Modifier;
```
## Token::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: Token) -> string;
```
## Token::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: Token) -> *Decorator;
```
## Token::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: Token) -> Symbol;
```
## Token::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: Token) -> Location;
```
## Token::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *Token;
```
## Token::is\<T\>

```rust
pub fn is<T>(self: Token) -> bool;
```
## Token::to\<T\>

```rust
pub fn to<T>(self: Token) -> <any>;
```
## Token::key\_neq

```rust
pub fn key_neq(self: Token, object: <any>) -> bool;
```
## Token::key\_eq

```rust
pub fn key_eq(self: Token, object: <any>) -> bool;
```
## Token::to\_set

```rust
pub fn to_set(self: Token) -> *Token;
```
