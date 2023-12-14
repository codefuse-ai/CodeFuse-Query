# BinaryLogicalOperator

Primary key: `id: int`

```rust
schema BinaryLogicalOperator {
  @primary id: int,
}
```
## BinaryLogicalOperator::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: BinaryLogicalOperator) -> Location;
```
## BinaryLogicalOperator::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: BinaryLogicalOperator) -> Symbol;
```
## BinaryLogicalOperator::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: BinaryLogicalOperator) -> *Decorator;
```
## BinaryLogicalOperator::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: BinaryLogicalOperator) -> string;
```
## BinaryLogicalOperator::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: BinaryLogicalOperator, i: int) -> Modifier;
```
## BinaryLogicalOperator::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: BinaryLogicalOperator) -> *Comment;
```
## BinaryLogicalOperator::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: BinaryLogicalOperator) -> *Node;
```
## BinaryLogicalOperator::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: BinaryLogicalOperator) -> *Node;
```
## BinaryLogicalOperator::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: BinaryLogicalOperator) -> Node;
```
## BinaryLogicalOperator::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: BinaryLogicalOperator) -> int;
```
## BinaryLogicalOperator::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: BinaryLogicalOperator) -> TopLevelDO;
```
## BinaryLogicalOperator::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: BinaryLogicalOperator, i: int) -> Decorator;
```
## BinaryLogicalOperator::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: BinaryLogicalOperator) -> int;
```
## BinaryLogicalOperator::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: BinaryLogicalOperator) -> *Modifier;
```
## BinaryLogicalOperator::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: BinaryLogicalOperator) -> int;
```
## BinaryLogicalOperator::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: BinaryLogicalOperator, i: int) -> Node;
```
## BinaryLogicalOperator::getStartLineNumber

```rust
pub fn getStartLineNumber(self: BinaryLogicalOperator) -> int;
```
## BinaryLogicalOperator::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: BinaryLogicalOperator) -> *FunctionLikeDeclaration;
```
## BinaryLogicalOperator::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: BinaryLogicalOperator, level: int) -> *Node;
```
## BinaryLogicalOperator::getEndLineNumber

```rust
pub fn getEndLineNumber(self: BinaryLogicalOperator) -> int;
```
## BinaryLogicalOperator::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: BinaryLogicalOperator) -> string;
```
## BinaryLogicalOperator::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: BinaryLogicalOperator, level: int) -> Node;
```
## BinaryLogicalOperator::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: BinaryLogicalOperator) -> File;
```
## BinaryLogicalOperator::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: BinaryLogicalOperator) -> *Comment;
```
## BinaryLogicalOperator::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: BinaryLogicalOperator) -> *Comment;
```
## BinaryLogicalOperator::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: BinaryLogicalOperator) -> Node;
```
## BinaryLogicalOperator::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: BinaryLogicalOperator) -> FunctionLikeDeclaration;
```
## BinaryLogicalOperator::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: BinaryLogicalOperator) -> int;
```
## BinaryLogicalOperator::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: BinaryLogicalOperator) -> int;
```
## BinaryLogicalOperator::getIndex

```rust
pub fn getIndex(self: BinaryLogicalOperator) -> int;
```
## BinaryLogicalOperator::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: BinaryLogicalOperator) -> *Node;
```
## BinaryLogicalOperator::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *BinaryLogicalOperator;
```
## BinaryLogicalOperator::is\<T\>

```rust
pub fn is<T>(self: BinaryLogicalOperator) -> bool;
```
## BinaryLogicalOperator::to\<T\>

```rust
pub fn to<T>(self: BinaryLogicalOperator) -> <any>;
```
## BinaryLogicalOperator::key\_neq

```rust
pub fn key_neq(self: BinaryLogicalOperator, object: <any>) -> bool;
```
## BinaryLogicalOperator::key\_eq

```rust
pub fn key_eq(self: BinaryLogicalOperator, object: <any>) -> bool;
```
## BinaryLogicalOperator::to\_set

```rust
pub fn to_set(self: BinaryLogicalOperator) -> *BinaryLogicalOperator;
```
