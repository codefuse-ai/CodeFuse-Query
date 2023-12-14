# EndOfFileToken

Primary key: `id: int`

```rust
schema EndOfFileToken {
  @primary id: int,
}
```
## EndOfFileToken::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: EndOfFileToken) -> Location;
```
## EndOfFileToken::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: EndOfFileToken) -> Symbol;
```
## EndOfFileToken::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: EndOfFileToken) -> *Decorator;
```
## EndOfFileToken::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: EndOfFileToken) -> string;
```
## EndOfFileToken::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: EndOfFileToken, i: int) -> Modifier;
```
## EndOfFileToken::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: EndOfFileToken) -> *Comment;
```
## EndOfFileToken::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: EndOfFileToken) -> *Node;
```
## EndOfFileToken::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: EndOfFileToken) -> *Node;
```
## EndOfFileToken::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: EndOfFileToken) -> Node;
```
## EndOfFileToken::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: EndOfFileToken) -> int;
```
## EndOfFileToken::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: EndOfFileToken) -> TopLevelDO;
```
## EndOfFileToken::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: EndOfFileToken, i: int) -> Decorator;
```
## EndOfFileToken::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: EndOfFileToken) -> int;
```
## EndOfFileToken::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: EndOfFileToken) -> *Modifier;
```
## EndOfFileToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: EndOfFileToken) -> int;
```
## EndOfFileToken::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: EndOfFileToken, i: int) -> Node;
```
## EndOfFileToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: EndOfFileToken) -> int;
```
## EndOfFileToken::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: EndOfFileToken) -> *FunctionLikeDeclaration;
```
## EndOfFileToken::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: EndOfFileToken, level: int) -> *Node;
```
## EndOfFileToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: EndOfFileToken) -> int;
```
## EndOfFileToken::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: EndOfFileToken) -> string;
```
## EndOfFileToken::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: EndOfFileToken, level: int) -> Node;
```
## EndOfFileToken::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: EndOfFileToken) -> File;
```
## EndOfFileToken::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: EndOfFileToken) -> *Comment;
```
## EndOfFileToken::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: EndOfFileToken) -> *Comment;
```
## EndOfFileToken::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: EndOfFileToken) -> Node;
```
## EndOfFileToken::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: EndOfFileToken) -> FunctionLikeDeclaration;
```
## EndOfFileToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: EndOfFileToken) -> int;
```
## EndOfFileToken::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: EndOfFileToken) -> int;
```
## EndOfFileToken::getIndex

```rust
pub fn getIndex(self: EndOfFileToken) -> int;
```
## EndOfFileToken::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: EndOfFileToken) -> *Node;
```
## EndOfFileToken::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *EndOfFileToken;
```
## EndOfFileToken::is\<T\>

```rust
pub fn is<T>(self: EndOfFileToken) -> bool;
```
## EndOfFileToken::to\<T\>

```rust
pub fn to<T>(self: EndOfFileToken) -> <any>;
```
## EndOfFileToken::key\_neq

```rust
pub fn key_neq(self: EndOfFileToken, object: <any>) -> bool;
```
## EndOfFileToken::key\_eq

```rust
pub fn key_eq(self: EndOfFileToken, object: <any>) -> bool;
```
## EndOfFileToken::to\_set

```rust
pub fn to_set(self: EndOfFileToken) -> *EndOfFileToken;
```
