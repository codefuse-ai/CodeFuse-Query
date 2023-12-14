# NumericLiteral

Primary key: `id: int`

```rust
schema NumericLiteral {
  @primary id: int,
}
```
## NumericLiteral::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: NumericLiteral) -> Node;
```
## NumericLiteral::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: NumericLiteral) -> string;
```
## NumericLiteral::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: NumericLiteral, i: int) -> Modifier;
```
## NumericLiteral::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: NumericLiteral) -> Location;
```
## NumericLiteral::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: NumericLiteral) -> *Decorator;
```
## NumericLiteral::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: NumericLiteral) -> Symbol;
```
## NumericLiteral::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: NumericLiteral) -> *Comment;
```
## NumericLiteral::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: NumericLiteral) -> *Node;
```
## NumericLiteral::getValue

```rust
/**
     * Gets the value of this literal, as a string.
     */
```
```rust
pub fn getValue(self: NumericLiteral) -> string;
```
## NumericLiteral::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: NumericLiteral) -> *Node;
```
## NumericLiteral::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: NumericLiteral) -> Node;
```
## NumericLiteral::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: NumericLiteral) -> int;
```
## NumericLiteral::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: NumericLiteral) -> TopLevelDO;
```
## NumericLiteral::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: NumericLiteral, i: int) -> Decorator;
```
## NumericLiteral::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: NumericLiteral) -> int;
```
## NumericLiteral::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: NumericLiteral) -> int;
```
## NumericLiteral::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: NumericLiteral) -> *Modifier;
```
## NumericLiteral::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: NumericLiteral, i: int) -> Node;
```
## NumericLiteral::getStartLineNumber

```rust
pub fn getStartLineNumber(self: NumericLiteral) -> int;
```
## NumericLiteral::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: NumericLiteral, level: int) -> *Node;
```
## NumericLiteral::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: NumericLiteral) -> *FunctionLikeDeclaration;
```
## NumericLiteral::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: NumericLiteral) -> *Comment;
```
## NumericLiteral::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: NumericLiteral) -> *Comment;
```
## NumericLiteral::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: NumericLiteral) -> FunctionLikeDeclaration;
```
## NumericLiteral::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: NumericLiteral) -> int;
```
## NumericLiteral::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: NumericLiteral) -> File;
```
## NumericLiteral::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: NumericLiteral, level: int) -> Node;
```
## NumericLiteral::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: NumericLiteral) -> int;
```
## NumericLiteral::getIndex

```rust
pub fn getIndex(self: NumericLiteral) -> int;
```
## NumericLiteral::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *NumericLiteral;
```
## NumericLiteral::getExpression

```rust
pub fn getExpression(self: NumericLiteral) -> Expression;
```
## NumericLiteral::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: NumericLiteral) -> string;
```
## NumericLiteral::getEndLineNumber

```rust
pub fn getEndLineNumber(self: NumericLiteral) -> int;
```
## NumericLiteral::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: NumericLiteral) -> *Node;
```
## NumericLiteral::is\<T\>

```rust
pub fn is<T>(self: NumericLiteral) -> bool;
```
## NumericLiteral::to\<T\>

```rust
pub fn to<T>(self: NumericLiteral) -> <any>;
```
## NumericLiteral::key\_neq

```rust
pub fn key_neq(self: NumericLiteral, object: <any>) -> bool;
```
## NumericLiteral::key\_eq

```rust
pub fn key_eq(self: NumericLiteral, object: <any>) -> bool;
```
## NumericLiteral::to\_set

```rust
pub fn to_set(self: NumericLiteral) -> *NumericLiteral;
```
