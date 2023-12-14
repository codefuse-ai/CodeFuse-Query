# TrueLiteral

Primary key: `id: int`

```rust
schema TrueLiteral {
  @primary id: int,
}
```
## TrueLiteral::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: TrueLiteral) -> *Node;
```
## TrueLiteral::getEndLineNumber

```rust
pub fn getEndLineNumber(self: TrueLiteral) -> int;
```
## TrueLiteral::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: TrueLiteral) -> string;
```
## TrueLiteral::getExpression

```rust
pub fn getExpression(self: TrueLiteral) -> Expression;
```
## TrueLiteral::getIndex

```rust
pub fn getIndex(self: TrueLiteral) -> int;
```
## TrueLiteral::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: TrueLiteral) -> int;
```
## TrueLiteral::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: TrueLiteral, level: int) -> Node;
```
## TrueLiteral::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: TrueLiteral) -> File;
```
## TrueLiteral::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: TrueLiteral) -> int;
```
## TrueLiteral::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: TrueLiteral) -> FunctionLikeDeclaration;
```
## TrueLiteral::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: TrueLiteral) -> *Comment;
```
## TrueLiteral::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: TrueLiteral) -> *Comment;
```
## TrueLiteral::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: TrueLiteral) -> *FunctionLikeDeclaration;
```
## TrueLiteral::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: TrueLiteral, level: int) -> *Node;
```
## TrueLiteral::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: TrueLiteral) -> int;
```
## TrueLiteral::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: TrueLiteral) -> *Modifier;
```
## TrueLiteral::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: TrueLiteral) -> int;
```
## TrueLiteral::getStartLineNumber

```rust
pub fn getStartLineNumber(self: TrueLiteral) -> int;
```
## TrueLiteral::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: TrueLiteral, i: int) -> Node;
```
## TrueLiteral::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: TrueLiteral, i: int) -> Decorator;
```
## TrueLiteral::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: TrueLiteral) -> TopLevelDO;
```
## TrueLiteral::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: TrueLiteral) -> int;
```
## TrueLiteral::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: TrueLiteral) -> Node;
```
## TrueLiteral::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: TrueLiteral) -> Node;
```
## TrueLiteral::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: TrueLiteral) -> *Node;
```
## TrueLiteral::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: TrueLiteral) -> *Node;
```
## TrueLiteral::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: TrueLiteral) -> *Comment;
```
## TrueLiteral::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *TrueLiteral;
```
## TrueLiteral::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: TrueLiteral) -> Location;
```
## TrueLiteral::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: TrueLiteral) -> Symbol;
```
## TrueLiteral::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: TrueLiteral) -> *Decorator;
```
## TrueLiteral::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: TrueLiteral, i: int) -> Modifier;
```
## TrueLiteral::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: TrueLiteral) -> string;
```
## TrueLiteral::is\<T\>

```rust
pub fn is<T>(self: TrueLiteral) -> bool;
```
## TrueLiteral::to\<T\>

```rust
pub fn to<T>(self: TrueLiteral) -> <any>;
```
## TrueLiteral::key\_neq

```rust
pub fn key_neq(self: TrueLiteral, object: <any>) -> bool;
```
## TrueLiteral::key\_eq

```rust
pub fn key_eq(self: TrueLiteral, object: <any>) -> bool;
```
## TrueLiteral::to\_set

```rust
pub fn to_set(self: TrueLiteral) -> *TrueLiteral;
```
