# BinaryBitwiseOperator

Primary key: `id: int`

```rust
schema BinaryBitwiseOperator {
  @primary id: int,
}
```
## BinaryBitwiseOperator::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: BinaryBitwiseOperator) -> Location;
```
## BinaryBitwiseOperator::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: BinaryBitwiseOperator) -> Symbol;
```
## BinaryBitwiseOperator::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: BinaryBitwiseOperator) -> *Decorator;
```
## BinaryBitwiseOperator::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: BinaryBitwiseOperator) -> string;
```
## BinaryBitwiseOperator::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: BinaryBitwiseOperator, i: int) -> Modifier;
```
## BinaryBitwiseOperator::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: BinaryBitwiseOperator) -> *Comment;
```
## BinaryBitwiseOperator::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: BinaryBitwiseOperator) -> *Node;
```
## BinaryBitwiseOperator::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: BinaryBitwiseOperator) -> *Node;
```
## BinaryBitwiseOperator::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: BinaryBitwiseOperator) -> Node;
```
## BinaryBitwiseOperator::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: BinaryBitwiseOperator) -> int;
```
## BinaryBitwiseOperator::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: BinaryBitwiseOperator) -> TopLevelDO;
```
## BinaryBitwiseOperator::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: BinaryBitwiseOperator, i: int) -> Decorator;
```
## BinaryBitwiseOperator::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: BinaryBitwiseOperator) -> int;
```
## BinaryBitwiseOperator::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: BinaryBitwiseOperator) -> *Modifier;
```
## BinaryBitwiseOperator::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: BinaryBitwiseOperator) -> int;
```
## BinaryBitwiseOperator::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: BinaryBitwiseOperator, i: int) -> Node;
```
## BinaryBitwiseOperator::getStartLineNumber

```rust
pub fn getStartLineNumber(self: BinaryBitwiseOperator) -> int;
```
## BinaryBitwiseOperator::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: BinaryBitwiseOperator) -> *FunctionLikeDeclaration;
```
## BinaryBitwiseOperator::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: BinaryBitwiseOperator, level: int) -> *Node;
```
## BinaryBitwiseOperator::getEndLineNumber

```rust
pub fn getEndLineNumber(self: BinaryBitwiseOperator) -> int;
```
## BinaryBitwiseOperator::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: BinaryBitwiseOperator) -> string;
```
## BinaryBitwiseOperator::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: BinaryBitwiseOperator, level: int) -> Node;
```
## BinaryBitwiseOperator::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: BinaryBitwiseOperator) -> File;
```
## BinaryBitwiseOperator::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: BinaryBitwiseOperator) -> *Comment;
```
## BinaryBitwiseOperator::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: BinaryBitwiseOperator) -> *Comment;
```
## BinaryBitwiseOperator::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: BinaryBitwiseOperator) -> Node;
```
## BinaryBitwiseOperator::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: BinaryBitwiseOperator) -> FunctionLikeDeclaration;
```
## BinaryBitwiseOperator::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: BinaryBitwiseOperator) -> int;
```
## BinaryBitwiseOperator::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: BinaryBitwiseOperator) -> int;
```
## BinaryBitwiseOperator::getIndex

```rust
pub fn getIndex(self: BinaryBitwiseOperator) -> int;
```
## BinaryBitwiseOperator::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: BinaryBitwiseOperator) -> *Node;
```
## BinaryBitwiseOperator::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *BinaryBitwiseOperator;
```
## BinaryBitwiseOperator::is\<T\>

```rust
pub fn is<T>(self: BinaryBitwiseOperator) -> bool;
```
## BinaryBitwiseOperator::to\<T\>

```rust
pub fn to<T>(self: BinaryBitwiseOperator) -> <any>;
```
## BinaryBitwiseOperator::key\_neq

```rust
pub fn key_neq(self: BinaryBitwiseOperator, object: <any>) -> bool;
```
## BinaryBitwiseOperator::key\_eq

```rust
pub fn key_eq(self: BinaryBitwiseOperator, object: <any>) -> bool;
```
## BinaryBitwiseOperator::to\_set

```rust
pub fn to_set(self: BinaryBitwiseOperator) -> *BinaryBitwiseOperator;
```
