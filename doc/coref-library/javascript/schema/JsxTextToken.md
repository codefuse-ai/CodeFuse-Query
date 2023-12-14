# JsxTextToken

Primary key: `id: int`

```rust
schema JsxTextToken {
  @primary id: int,
}
```
## JsxTextToken::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: JsxTextToken) -> Location;
```
## JsxTextToken::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: JsxTextToken) -> Symbol;
```
## JsxTextToken::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: JsxTextToken) -> *Decorator;
```
## JsxTextToken::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: JsxTextToken) -> string;
```
## JsxTextToken::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: JsxTextToken, i: int) -> Modifier;
```
## JsxTextToken::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: JsxTextToken) -> *Comment;
```
## JsxTextToken::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: JsxTextToken) -> *Node;
```
## JsxTextToken::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: JsxTextToken) -> *Node;
```
## JsxTextToken::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: JsxTextToken) -> Node;
```
## JsxTextToken::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: JsxTextToken) -> int;
```
## JsxTextToken::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: JsxTextToken) -> TopLevelDO;
```
## JsxTextToken::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: JsxTextToken, i: int) -> Decorator;
```
## JsxTextToken::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: JsxTextToken) -> int;
```
## JsxTextToken::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: JsxTextToken) -> *Modifier;
```
## JsxTextToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: JsxTextToken) -> int;
```
## JsxTextToken::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: JsxTextToken, i: int) -> Node;
```
## JsxTextToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: JsxTextToken) -> int;
```
## JsxTextToken::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: JsxTextToken) -> *FunctionLikeDeclaration;
```
## JsxTextToken::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: JsxTextToken, level: int) -> *Node;
```
## JsxTextToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: JsxTextToken) -> int;
```
## JsxTextToken::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: JsxTextToken) -> string;
```
## JsxTextToken::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: JsxTextToken, level: int) -> Node;
```
## JsxTextToken::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: JsxTextToken) -> File;
```
## JsxTextToken::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: JsxTextToken) -> *Comment;
```
## JsxTextToken::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: JsxTextToken) -> *Comment;
```
## JsxTextToken::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: JsxTextToken) -> Node;
```
## JsxTextToken::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: JsxTextToken) -> FunctionLikeDeclaration;
```
## JsxTextToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: JsxTextToken) -> int;
```
## JsxTextToken::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: JsxTextToken) -> int;
```
## JsxTextToken::getIndex

```rust
pub fn getIndex(self: JsxTextToken) -> int;
```
## JsxTextToken::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: JsxTextToken) -> *Node;
```
## JsxTextToken::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *JsxTextToken;
```
## JsxTextToken::is\<T\>

```rust
pub fn is<T>(self: JsxTextToken) -> bool;
```
## JsxTextToken::to\<T\>

```rust
pub fn to<T>(self: JsxTextToken) -> <any>;
```
## JsxTextToken::key\_neq

```rust
pub fn key_neq(self: JsxTextToken, object: <any>) -> bool;
```
## JsxTextToken::key\_eq

```rust
pub fn key_eq(self: JsxTextToken, object: <any>) -> bool;
```
## JsxTextToken::to\_set

```rust
pub fn to_set(self: JsxTextToken) -> *JsxTextToken;
```
