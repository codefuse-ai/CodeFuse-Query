# BinaryOperator

Primary key: `id: int`

```rust
schema BinaryOperator {
  @primary id: int,
}
```
## BinaryOperator::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: BinaryOperator) -> Location;
```
## BinaryOperator::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: BinaryOperator) -> Symbol;
```
## BinaryOperator::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: BinaryOperator) -> *Decorator;
```
## BinaryOperator::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: BinaryOperator) -> string;
```
## BinaryOperator::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: BinaryOperator, i: int) -> Modifier;
```
## BinaryOperator::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: BinaryOperator) -> *Comment;
```
## BinaryOperator::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: BinaryOperator) -> *Node;
```
## BinaryOperator::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: BinaryOperator) -> *Node;
```
## BinaryOperator::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: BinaryOperator) -> Node;
```
## BinaryOperator::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: BinaryOperator) -> int;
```
## BinaryOperator::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: BinaryOperator) -> TopLevelDO;
```
## BinaryOperator::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: BinaryOperator, i: int) -> Decorator;
```
## BinaryOperator::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: BinaryOperator) -> int;
```
## BinaryOperator::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: BinaryOperator) -> *Modifier;
```
## BinaryOperator::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: BinaryOperator) -> int;
```
## BinaryOperator::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: BinaryOperator, i: int) -> Node;
```
## BinaryOperator::getStartLineNumber

```rust
pub fn getStartLineNumber(self: BinaryOperator) -> int;
```
## BinaryOperator::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: BinaryOperator) -> *FunctionLikeDeclaration;
```
## BinaryOperator::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: BinaryOperator, level: int) -> *Node;
```
## BinaryOperator::getEndLineNumber

```rust
pub fn getEndLineNumber(self: BinaryOperator) -> int;
```
## BinaryOperator::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: BinaryOperator) -> string;
```
## BinaryOperator::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: BinaryOperator, level: int) -> Node;
```
## BinaryOperator::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: BinaryOperator) -> File;
```
## BinaryOperator::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: BinaryOperator) -> *Comment;
```
## BinaryOperator::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: BinaryOperator) -> *Comment;
```
## BinaryOperator::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: BinaryOperator) -> Node;
```
## BinaryOperator::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: BinaryOperator) -> FunctionLikeDeclaration;
```
## BinaryOperator::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: BinaryOperator) -> int;
```
## BinaryOperator::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: BinaryOperator) -> int;
```
## BinaryOperator::getIndex

```rust
pub fn getIndex(self: BinaryOperator) -> int;
```
## BinaryOperator::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: BinaryOperator) -> *Node;
```
## BinaryOperator::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *BinaryOperator;
```
## BinaryOperator::is\<T\>

```rust
pub fn is<T>(self: BinaryOperator) -> bool;
```
## BinaryOperator::to\<T\>

```rust
pub fn to<T>(self: BinaryOperator) -> <any>;
```
## BinaryOperator::key\_neq

```rust
pub fn key_neq(self: BinaryOperator, object: <any>) -> bool;
```
## BinaryOperator::key\_eq

```rust
pub fn key_eq(self: BinaryOperator, object: <any>) -> bool;
```
## BinaryOperator::to\_set

```rust
pub fn to_set(self: BinaryOperator) -> *BinaryOperator;
```
