# NumericLiteralToken

Primary key: `id: int`

```rust
schema NumericLiteralToken {
  @primary id: int,
}
```
## NumericLiteralToken::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: NumericLiteralToken) -> Location;
```
## NumericLiteralToken::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: NumericLiteralToken) -> Symbol;
```
## NumericLiteralToken::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: NumericLiteralToken) -> *Decorator;
```
## NumericLiteralToken::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: NumericLiteralToken) -> string;
```
## NumericLiteralToken::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: NumericLiteralToken, i: int) -> Modifier;
```
## NumericLiteralToken::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: NumericLiteralToken) -> *Comment;
```
## NumericLiteralToken::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: NumericLiteralToken) -> *Node;
```
## NumericLiteralToken::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: NumericLiteralToken) -> *Node;
```
## NumericLiteralToken::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: NumericLiteralToken) -> Node;
```
## NumericLiteralToken::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: NumericLiteralToken) -> int;
```
## NumericLiteralToken::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: NumericLiteralToken) -> TopLevelDO;
```
## NumericLiteralToken::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: NumericLiteralToken, i: int) -> Decorator;
```
## NumericLiteralToken::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: NumericLiteralToken) -> int;
```
## NumericLiteralToken::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: NumericLiteralToken) -> *Modifier;
```
## NumericLiteralToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: NumericLiteralToken) -> int;
```
## NumericLiteralToken::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: NumericLiteralToken, i: int) -> Node;
```
## NumericLiteralToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: NumericLiteralToken) -> int;
```
## NumericLiteralToken::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: NumericLiteralToken) -> *FunctionLikeDeclaration;
```
## NumericLiteralToken::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: NumericLiteralToken, level: int) -> *Node;
```
## NumericLiteralToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: NumericLiteralToken) -> int;
```
## NumericLiteralToken::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: NumericLiteralToken) -> string;
```
## NumericLiteralToken::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: NumericLiteralToken, level: int) -> Node;
```
## NumericLiteralToken::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: NumericLiteralToken) -> File;
```
## NumericLiteralToken::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: NumericLiteralToken) -> *Comment;
```
## NumericLiteralToken::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: NumericLiteralToken) -> *Comment;
```
## NumericLiteralToken::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: NumericLiteralToken) -> Node;
```
## NumericLiteralToken::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: NumericLiteralToken) -> FunctionLikeDeclaration;
```
## NumericLiteralToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: NumericLiteralToken) -> int;
```
## NumericLiteralToken::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: NumericLiteralToken) -> int;
```
## NumericLiteralToken::getIndex

```rust
pub fn getIndex(self: NumericLiteralToken) -> int;
```
## NumericLiteralToken::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: NumericLiteralToken) -> *Node;
```
## NumericLiteralToken::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *NumericLiteralToken;
```
## NumericLiteralToken::is\<T\>

```rust
pub fn is<T>(self: NumericLiteralToken) -> bool;
```
## NumericLiteralToken::to\<T\>

```rust
pub fn to<T>(self: NumericLiteralToken) -> <any>;
```
## NumericLiteralToken::key\_neq

```rust
pub fn key_neq(self: NumericLiteralToken, object: <any>) -> bool;
```
## NumericLiteralToken::key\_eq

```rust
pub fn key_eq(self: NumericLiteralToken, object: <any>) -> bool;
```
## NumericLiteralToken::to\_set

```rust
pub fn to_set(self: NumericLiteralToken) -> *NumericLiteralToken;
```
