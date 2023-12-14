# BigIntLiteral

Primary key: `id: int`

```rust
schema BigIntLiteral {
  @primary id: int,
}
```
## BigIntLiteral::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: BigIntLiteral) -> Node;
```
## BigIntLiteral::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: BigIntLiteral) -> string;
```
## BigIntLiteral::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: BigIntLiteral, i: int) -> Modifier;
```
## BigIntLiteral::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: BigIntLiteral) -> Location;
```
## BigIntLiteral::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: BigIntLiteral) -> *Decorator;
```
## BigIntLiteral::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: BigIntLiteral) -> Symbol;
```
## BigIntLiteral::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: BigIntLiteral) -> *Comment;
```
## BigIntLiteral::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: BigIntLiteral) -> *Node;
```
## BigIntLiteral::getValue

```rust
/**
     * Gets the value of this literal, as a string.
     */
```
```rust
pub fn getValue(self: BigIntLiteral) -> string;
```
## BigIntLiteral::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: BigIntLiteral) -> *Node;
```
## BigIntLiteral::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: BigIntLiteral) -> Node;
```
## BigIntLiteral::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: BigIntLiteral) -> int;
```
## BigIntLiteral::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: BigIntLiteral) -> TopLevelDO;
```
## BigIntLiteral::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: BigIntLiteral, i: int) -> Decorator;
```
## BigIntLiteral::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: BigIntLiteral) -> int;
```
## BigIntLiteral::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: BigIntLiteral) -> int;
```
## BigIntLiteral::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: BigIntLiteral) -> *Modifier;
```
## BigIntLiteral::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: BigIntLiteral, i: int) -> Node;
```
## BigIntLiteral::getStartLineNumber

```rust
pub fn getStartLineNumber(self: BigIntLiteral) -> int;
```
## BigIntLiteral::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: BigIntLiteral, level: int) -> *Node;
```
## BigIntLiteral::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: BigIntLiteral) -> *FunctionLikeDeclaration;
```
## BigIntLiteral::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: BigIntLiteral) -> *Comment;
```
## BigIntLiteral::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: BigIntLiteral) -> *Comment;
```
## BigIntLiteral::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: BigIntLiteral) -> FunctionLikeDeclaration;
```
## BigIntLiteral::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: BigIntLiteral) -> int;
```
## BigIntLiteral::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: BigIntLiteral) -> File;
```
## BigIntLiteral::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: BigIntLiteral, level: int) -> Node;
```
## BigIntLiteral::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: BigIntLiteral) -> int;
```
## BigIntLiteral::getIndex

```rust
pub fn getIndex(self: BigIntLiteral) -> int;
```
## BigIntLiteral::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *BigIntLiteral;
```
## BigIntLiteral::getExpression

```rust
pub fn getExpression(self: BigIntLiteral) -> Expression;
```
## BigIntLiteral::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: BigIntLiteral) -> string;
```
## BigIntLiteral::getEndLineNumber

```rust
pub fn getEndLineNumber(self: BigIntLiteral) -> int;
```
## BigIntLiteral::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: BigIntLiteral) -> *Node;
```
## BigIntLiteral::is\<T\>

```rust
pub fn is<T>(self: BigIntLiteral) -> bool;
```
## BigIntLiteral::to\<T\>

```rust
pub fn to<T>(self: BigIntLiteral) -> <any>;
```
## BigIntLiteral::key\_neq

```rust
pub fn key_neq(self: BigIntLiteral, object: <any>) -> bool;
```
## BigIntLiteral::key\_eq

```rust
pub fn key_eq(self: BigIntLiteral, object: <any>) -> bool;
```
## BigIntLiteral::to\_set

```rust
pub fn to_set(self: BigIntLiteral) -> *BigIntLiteral;
```
