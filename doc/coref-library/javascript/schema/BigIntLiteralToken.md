# BigIntLiteralToken

Primary key: `id: int`

```rust
schema BigIntLiteralToken {
  @primary id: int,
}
```
## BigIntLiteralToken::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: BigIntLiteralToken) -> Location;
```
## BigIntLiteralToken::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: BigIntLiteralToken) -> Symbol;
```
## BigIntLiteralToken::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: BigIntLiteralToken) -> *Decorator;
```
## BigIntLiteralToken::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: BigIntLiteralToken) -> string;
```
## BigIntLiteralToken::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: BigIntLiteralToken, i: int) -> Modifier;
```
## BigIntLiteralToken::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: BigIntLiteralToken) -> *Comment;
```
## BigIntLiteralToken::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: BigIntLiteralToken) -> *Node;
```
## BigIntLiteralToken::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: BigIntLiteralToken) -> *Node;
```
## BigIntLiteralToken::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: BigIntLiteralToken) -> Node;
```
## BigIntLiteralToken::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: BigIntLiteralToken) -> int;
```
## BigIntLiteralToken::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: BigIntLiteralToken) -> TopLevelDO;
```
## BigIntLiteralToken::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: BigIntLiteralToken, i: int) -> Decorator;
```
## BigIntLiteralToken::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: BigIntLiteralToken) -> int;
```
## BigIntLiteralToken::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: BigIntLiteralToken) -> *Modifier;
```
## BigIntLiteralToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: BigIntLiteralToken) -> int;
```
## BigIntLiteralToken::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: BigIntLiteralToken, i: int) -> Node;
```
## BigIntLiteralToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: BigIntLiteralToken) -> int;
```
## BigIntLiteralToken::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: BigIntLiteralToken) -> *FunctionLikeDeclaration;
```
## BigIntLiteralToken::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: BigIntLiteralToken, level: int) -> *Node;
```
## BigIntLiteralToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: BigIntLiteralToken) -> int;
```
## BigIntLiteralToken::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: BigIntLiteralToken) -> string;
```
## BigIntLiteralToken::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: BigIntLiteralToken, level: int) -> Node;
```
## BigIntLiteralToken::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: BigIntLiteralToken) -> File;
```
## BigIntLiteralToken::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: BigIntLiteralToken) -> *Comment;
```
## BigIntLiteralToken::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: BigIntLiteralToken) -> *Comment;
```
## BigIntLiteralToken::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: BigIntLiteralToken) -> Node;
```
## BigIntLiteralToken::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: BigIntLiteralToken) -> FunctionLikeDeclaration;
```
## BigIntLiteralToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: BigIntLiteralToken) -> int;
```
## BigIntLiteralToken::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: BigIntLiteralToken) -> int;
```
## BigIntLiteralToken::getIndex

```rust
pub fn getIndex(self: BigIntLiteralToken) -> int;
```
## BigIntLiteralToken::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: BigIntLiteralToken) -> *Node;
```
## BigIntLiteralToken::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *BigIntLiteralToken;
```
## BigIntLiteralToken::is\<T\>

```rust
pub fn is<T>(self: BigIntLiteralToken) -> bool;
```
## BigIntLiteralToken::to\<T\>

```rust
pub fn to<T>(self: BigIntLiteralToken) -> <any>;
```
## BigIntLiteralToken::key\_neq

```rust
pub fn key_neq(self: BigIntLiteralToken, object: <any>) -> bool;
```
## BigIntLiteralToken::key\_eq

```rust
pub fn key_eq(self: BigIntLiteralToken, object: <any>) -> bool;
```
## BigIntLiteralToken::to\_set

```rust
pub fn to_set(self: BigIntLiteralToken) -> *BigIntLiteralToken;
```
