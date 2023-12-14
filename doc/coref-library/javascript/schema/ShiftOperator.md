# ShiftOperator

Primary key: `id: int`

```rust
schema ShiftOperator {
  @primary id: int,
}
```
## ShiftOperator::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: ShiftOperator) -> Location;
```
## ShiftOperator::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: ShiftOperator) -> Symbol;
```
## ShiftOperator::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: ShiftOperator) -> *Decorator;
```
## ShiftOperator::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: ShiftOperator) -> string;
```
## ShiftOperator::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: ShiftOperator, i: int) -> Modifier;
```
## ShiftOperator::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: ShiftOperator) -> *Comment;
```
## ShiftOperator::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: ShiftOperator) -> *Node;
```
## ShiftOperator::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: ShiftOperator) -> *Node;
```
## ShiftOperator::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: ShiftOperator) -> Node;
```
## ShiftOperator::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: ShiftOperator) -> int;
```
## ShiftOperator::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: ShiftOperator) -> TopLevelDO;
```
## ShiftOperator::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: ShiftOperator, i: int) -> Decorator;
```
## ShiftOperator::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: ShiftOperator) -> int;
```
## ShiftOperator::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: ShiftOperator) -> *Modifier;
```
## ShiftOperator::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ShiftOperator) -> int;
```
## ShiftOperator::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: ShiftOperator, i: int) -> Node;
```
## ShiftOperator::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ShiftOperator) -> int;
```
## ShiftOperator::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ShiftOperator) -> *FunctionLikeDeclaration;
```
## ShiftOperator::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: ShiftOperator, level: int) -> *Node;
```
## ShiftOperator::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ShiftOperator) -> int;
```
## ShiftOperator::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: ShiftOperator) -> string;
```
## ShiftOperator::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: ShiftOperator, level: int) -> Node;
```
## ShiftOperator::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: ShiftOperator) -> File;
```
## ShiftOperator::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: ShiftOperator) -> *Comment;
```
## ShiftOperator::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: ShiftOperator) -> *Comment;
```
## ShiftOperator::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: ShiftOperator) -> Node;
```
## ShiftOperator::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: ShiftOperator) -> FunctionLikeDeclaration;
```
## ShiftOperator::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ShiftOperator) -> int;
```
## ShiftOperator::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: ShiftOperator) -> int;
```
## ShiftOperator::getIndex

```rust
pub fn getIndex(self: ShiftOperator) -> int;
```
## ShiftOperator::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: ShiftOperator) -> *Node;
```
## ShiftOperator::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *ShiftOperator;
```
## ShiftOperator::is\<T\>

```rust
pub fn is<T>(self: ShiftOperator) -> bool;
```
## ShiftOperator::to\<T\>

```rust
pub fn to<T>(self: ShiftOperator) -> <any>;
```
## ShiftOperator::key\_neq

```rust
pub fn key_neq(self: ShiftOperator, object: <any>) -> bool;
```
## ShiftOperator::key\_eq

```rust
pub fn key_eq(self: ShiftOperator, object: <any>) -> bool;
```
## ShiftOperator::to\_set

```rust
pub fn to_set(self: ShiftOperator) -> *ShiftOperator;
```
