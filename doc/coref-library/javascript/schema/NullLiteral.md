# NullLiteral

Primary key: `id: int`

```rust
schema NullLiteral {
  @primary id: int,
}
```
## NullLiteral::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: NullLiteral) -> *Node;
```
## NullLiteral::getEndLineNumber

```rust
pub fn getEndLineNumber(self: NullLiteral) -> int;
```
## NullLiteral::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: NullLiteral) -> string;
```
## NullLiteral::getExpression

```rust
pub fn getExpression(self: NullLiteral) -> Expression;
```
## NullLiteral::getIndex

```rust
pub fn getIndex(self: NullLiteral) -> int;
```
## NullLiteral::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: NullLiteral) -> int;
```
## NullLiteral::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: NullLiteral, level: int) -> Node;
```
## NullLiteral::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: NullLiteral) -> File;
```
## NullLiteral::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: NullLiteral) -> int;
```
## NullLiteral::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: NullLiteral) -> FunctionLikeDeclaration;
```
## NullLiteral::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: NullLiteral) -> *Comment;
```
## NullLiteral::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: NullLiteral) -> *Comment;
```
## NullLiteral::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: NullLiteral) -> *FunctionLikeDeclaration;
```
## NullLiteral::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: NullLiteral, level: int) -> *Node;
```
## NullLiteral::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: NullLiteral) -> int;
```
## NullLiteral::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: NullLiteral) -> *Modifier;
```
## NullLiteral::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: NullLiteral) -> int;
```
## NullLiteral::getStartLineNumber

```rust
pub fn getStartLineNumber(self: NullLiteral) -> int;
```
## NullLiteral::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: NullLiteral, i: int) -> Node;
```
## NullLiteral::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: NullLiteral, i: int) -> Decorator;
```
## NullLiteral::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: NullLiteral) -> TopLevelDO;
```
## NullLiteral::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: NullLiteral) -> int;
```
## NullLiteral::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: NullLiteral) -> Node;
```
## NullLiteral::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: NullLiteral) -> Node;
```
## NullLiteral::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: NullLiteral) -> *Node;
```
## NullLiteral::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: NullLiteral) -> *Node;
```
## NullLiteral::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: NullLiteral) -> *Comment;
```
## NullLiteral::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *NullLiteral;
```
## NullLiteral::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: NullLiteral) -> Location;
```
## NullLiteral::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: NullLiteral) -> Symbol;
```
## NullLiteral::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: NullLiteral) -> *Decorator;
```
## NullLiteral::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: NullLiteral, i: int) -> Modifier;
```
## NullLiteral::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: NullLiteral) -> string;
```
## NullLiteral::is\<T\>

```rust
pub fn is<T>(self: NullLiteral) -> bool;
```
## NullLiteral::to\<T\>

```rust
pub fn to<T>(self: NullLiteral) -> <any>;
```
## NullLiteral::key\_neq

```rust
pub fn key_neq(self: NullLiteral, object: <any>) -> bool;
```
## NullLiteral::key\_eq

```rust
pub fn key_eq(self: NullLiteral, object: <any>) -> bool;
```
## NullLiteral::to\_set

```rust
pub fn to_set(self: NullLiteral) -> *NullLiteral;
```
