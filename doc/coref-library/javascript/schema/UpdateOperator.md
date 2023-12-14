# UpdateOperator

Primary key: `id: int`

```rust
schema UpdateOperator {
  @primary id: int,
}
```
## UpdateOperator::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: UpdateOperator) -> Location;
```
## UpdateOperator::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: UpdateOperator) -> Symbol;
```
## UpdateOperator::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: UpdateOperator) -> *Decorator;
```
## UpdateOperator::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: UpdateOperator) -> string;
```
## UpdateOperator::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: UpdateOperator, i: int) -> Modifier;
```
## UpdateOperator::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: UpdateOperator) -> *Comment;
```
## UpdateOperator::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: UpdateOperator) -> *Node;
```
## UpdateOperator::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: UpdateOperator) -> *Node;
```
## UpdateOperator::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: UpdateOperator) -> Node;
```
## UpdateOperator::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: UpdateOperator) -> int;
```
## UpdateOperator::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: UpdateOperator) -> TopLevelDO;
```
## UpdateOperator::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: UpdateOperator, i: int) -> Decorator;
```
## UpdateOperator::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: UpdateOperator) -> int;
```
## UpdateOperator::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: UpdateOperator) -> *Modifier;
```
## UpdateOperator::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: UpdateOperator) -> int;
```
## UpdateOperator::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: UpdateOperator, i: int) -> Node;
```
## UpdateOperator::getStartLineNumber

```rust
pub fn getStartLineNumber(self: UpdateOperator) -> int;
```
## UpdateOperator::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: UpdateOperator) -> *FunctionLikeDeclaration;
```
## UpdateOperator::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: UpdateOperator, level: int) -> *Node;
```
## UpdateOperator::getEndLineNumber

```rust
pub fn getEndLineNumber(self: UpdateOperator) -> int;
```
## UpdateOperator::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: UpdateOperator) -> string;
```
## UpdateOperator::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: UpdateOperator, level: int) -> Node;
```
## UpdateOperator::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: UpdateOperator) -> File;
```
## UpdateOperator::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: UpdateOperator) -> *Comment;
```
## UpdateOperator::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: UpdateOperator) -> *Comment;
```
## UpdateOperator::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: UpdateOperator) -> Node;
```
## UpdateOperator::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: UpdateOperator) -> FunctionLikeDeclaration;
```
## UpdateOperator::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: UpdateOperator) -> int;
```
## UpdateOperator::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: UpdateOperator) -> int;
```
## UpdateOperator::getIndex

```rust
pub fn getIndex(self: UpdateOperator) -> int;
```
## UpdateOperator::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: UpdateOperator) -> *Node;
```
## UpdateOperator::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *UpdateOperator;
```
## UpdateOperator::is\<T\>

```rust
pub fn is<T>(self: UpdateOperator) -> bool;
```
## UpdateOperator::to\<T\>

```rust
pub fn to<T>(self: UpdateOperator) -> <any>;
```
## UpdateOperator::key\_neq

```rust
pub fn key_neq(self: UpdateOperator, object: <any>) -> bool;
```
## UpdateOperator::key\_eq

```rust
pub fn key_eq(self: UpdateOperator, object: <any>) -> bool;
```
## UpdateOperator::to\_set

```rust
pub fn to_set(self: UpdateOperator) -> *UpdateOperator;
```
