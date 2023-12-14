# FalseLiteral

Primary key: `id: int`

```rust
schema FalseLiteral {
  @primary id: int,
}
```
## FalseLiteral::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: FalseLiteral) -> *Node;
```
## FalseLiteral::getEndLineNumber

```rust
pub fn getEndLineNumber(self: FalseLiteral) -> int;
```
## FalseLiteral::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: FalseLiteral) -> string;
```
## FalseLiteral::getExpression

```rust
pub fn getExpression(self: FalseLiteral) -> Expression;
```
## FalseLiteral::getIndex

```rust
pub fn getIndex(self: FalseLiteral) -> int;
```
## FalseLiteral::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: FalseLiteral) -> int;
```
## FalseLiteral::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: FalseLiteral, level: int) -> Node;
```
## FalseLiteral::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: FalseLiteral) -> File;
```
## FalseLiteral::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: FalseLiteral) -> int;
```
## FalseLiteral::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: FalseLiteral) -> FunctionLikeDeclaration;
```
## FalseLiteral::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: FalseLiteral) -> *Comment;
```
## FalseLiteral::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: FalseLiteral) -> *Comment;
```
## FalseLiteral::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: FalseLiteral) -> *FunctionLikeDeclaration;
```
## FalseLiteral::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: FalseLiteral, level: int) -> *Node;
```
## FalseLiteral::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: FalseLiteral) -> int;
```
## FalseLiteral::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: FalseLiteral) -> *Modifier;
```
## FalseLiteral::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: FalseLiteral) -> int;
```
## FalseLiteral::getStartLineNumber

```rust
pub fn getStartLineNumber(self: FalseLiteral) -> int;
```
## FalseLiteral::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: FalseLiteral, i: int) -> Node;
```
## FalseLiteral::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: FalseLiteral, i: int) -> Decorator;
```
## FalseLiteral::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: FalseLiteral) -> TopLevelDO;
```
## FalseLiteral::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: FalseLiteral) -> int;
```
## FalseLiteral::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: FalseLiteral) -> Node;
```
## FalseLiteral::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: FalseLiteral) -> Node;
```
## FalseLiteral::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: FalseLiteral) -> *Node;
```
## FalseLiteral::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: FalseLiteral) -> *Node;
```
## FalseLiteral::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: FalseLiteral) -> *Comment;
```
## FalseLiteral::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *FalseLiteral;
```
## FalseLiteral::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: FalseLiteral) -> Location;
```
## FalseLiteral::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: FalseLiteral) -> Symbol;
```
## FalseLiteral::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: FalseLiteral) -> *Decorator;
```
## FalseLiteral::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: FalseLiteral, i: int) -> Modifier;
```
## FalseLiteral::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: FalseLiteral) -> string;
```
## FalseLiteral::is\<T\>

```rust
pub fn is<T>(self: FalseLiteral) -> bool;
```
## FalseLiteral::to\<T\>

```rust
pub fn to<T>(self: FalseLiteral) -> <any>;
```
## FalseLiteral::key\_neq

```rust
pub fn key_neq(self: FalseLiteral, object: <any>) -> bool;
```
## FalseLiteral::key\_eq

```rust
pub fn key_eq(self: FalseLiteral, object: <any>) -> bool;
```
## FalseLiteral::to\_set

```rust
pub fn to_set(self: FalseLiteral) -> *FalseLiteral;
```
