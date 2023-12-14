# HeritageToken

Primary key: `id: int`

```rust
schema HeritageToken {
  @primary id: int,
}
```
## HeritageToken::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: HeritageToken) -> *Node;
```
## HeritageToken::getIndex

```rust
pub fn getIndex(self: HeritageToken) -> int;
```
## HeritageToken::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: HeritageToken) -> int;
```
## HeritageToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: HeritageToken) -> int;
```
## HeritageToken::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: HeritageToken) -> Node;
```
## HeritageToken::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: HeritageToken) -> FunctionLikeDeclaration;
```
## HeritageToken::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: HeritageToken) -> File;
```
## HeritageToken::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: HeritageToken, level: int) -> Node;
```
## HeritageToken::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: HeritageToken) -> string;
```
## HeritageToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: HeritageToken) -> int;
```
## HeritageToken::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: HeritageToken) -> *FunctionLikeDeclaration;
```
## HeritageToken::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: HeritageToken, level: int) -> *Node;
```
## HeritageToken::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: HeritageToken) -> int;
```
## HeritageToken::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: HeritageToken) -> *Modifier;
```
## HeritageToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: HeritageToken) -> int;
```
## HeritageToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: HeritageToken) -> int;
```
## HeritageToken::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: HeritageToken, i: int) -> Node;
```
## HeritageToken::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: HeritageToken, i: int) -> Decorator;
```
## HeritageToken::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: HeritageToken) -> TopLevelDO;
```
## HeritageToken::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: HeritageToken) -> int;
```
## HeritageToken::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: HeritageToken) -> *Comment;
```
## HeritageToken::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: HeritageToken) -> *Comment;
```
## HeritageToken::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: HeritageToken) -> Node;
```
## HeritageToken::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: HeritageToken) -> *Node;
```
## HeritageToken::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: HeritageToken) -> *Node;
```
## HeritageToken::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: HeritageToken) -> *Comment;
```
## HeritageToken::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: HeritageToken, i: int) -> Modifier;
```
## HeritageToken::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: HeritageToken) -> string;
```
## HeritageToken::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: HeritageToken) -> *Decorator;
```
## HeritageToken::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: HeritageToken) -> Symbol;
```
## HeritageToken::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: HeritageToken) -> Location;
```
## HeritageToken::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *HeritageToken;
```
## HeritageToken::is\<T\>

```rust
pub fn is<T>(self: HeritageToken) -> bool;
```
## HeritageToken::to\<T\>

```rust
pub fn to<T>(self: HeritageToken) -> <any>;
```
## HeritageToken::key\_neq

```rust
pub fn key_neq(self: HeritageToken, object: <any>) -> bool;
```
## HeritageToken::key\_eq

```rust
pub fn key_eq(self: HeritageToken, object: <any>) -> bool;
```
## HeritageToken::to\_set

```rust
pub fn to_set(self: HeritageToken) -> *HeritageToken;
```
