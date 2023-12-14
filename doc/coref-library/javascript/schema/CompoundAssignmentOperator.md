# CompoundAssignmentOperator

Primary key: `id: int`

```rust
schema CompoundAssignmentOperator {
  @primary id: int,
}
```
## CompoundAssignmentOperator::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: CompoundAssignmentOperator) -> Location;
```
## CompoundAssignmentOperator::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: CompoundAssignmentOperator) -> Symbol;
```
## CompoundAssignmentOperator::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: CompoundAssignmentOperator) -> *Decorator;
```
## CompoundAssignmentOperator::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: CompoundAssignmentOperator) -> string;
```
## CompoundAssignmentOperator::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: CompoundAssignmentOperator, i: int) -> Modifier;
```
## CompoundAssignmentOperator::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: CompoundAssignmentOperator) -> *Comment;
```
## CompoundAssignmentOperator::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: CompoundAssignmentOperator) -> *Node;
```
## CompoundAssignmentOperator::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: CompoundAssignmentOperator) -> *Node;
```
## CompoundAssignmentOperator::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: CompoundAssignmentOperator) -> Node;
```
## CompoundAssignmentOperator::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: CompoundAssignmentOperator) -> int;
```
## CompoundAssignmentOperator::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: CompoundAssignmentOperator) -> TopLevelDO;
```
## CompoundAssignmentOperator::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: CompoundAssignmentOperator, i: int) -> Decorator;
```
## CompoundAssignmentOperator::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: CompoundAssignmentOperator) -> int;
```
## CompoundAssignmentOperator::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: CompoundAssignmentOperator) -> *Modifier;
```
## CompoundAssignmentOperator::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: CompoundAssignmentOperator) -> int;
```
## CompoundAssignmentOperator::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: CompoundAssignmentOperator, i: int) -> Node;
```
## CompoundAssignmentOperator::getStartLineNumber

```rust
pub fn getStartLineNumber(self: CompoundAssignmentOperator) -> int;
```
## CompoundAssignmentOperator::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: CompoundAssignmentOperator) -> *FunctionLikeDeclaration;
```
## CompoundAssignmentOperator::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: CompoundAssignmentOperator, level: int) -> *Node;
```
## CompoundAssignmentOperator::getEndLineNumber

```rust
pub fn getEndLineNumber(self: CompoundAssignmentOperator) -> int;
```
## CompoundAssignmentOperator::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: CompoundAssignmentOperator) -> string;
```
## CompoundAssignmentOperator::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: CompoundAssignmentOperator, level: int) -> Node;
```
## CompoundAssignmentOperator::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: CompoundAssignmentOperator) -> File;
```
## CompoundAssignmentOperator::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: CompoundAssignmentOperator) -> *Comment;
```
## CompoundAssignmentOperator::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: CompoundAssignmentOperator) -> *Comment;
```
## CompoundAssignmentOperator::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: CompoundAssignmentOperator) -> Node;
```
## CompoundAssignmentOperator::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: CompoundAssignmentOperator) -> FunctionLikeDeclaration;
```
## CompoundAssignmentOperator::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: CompoundAssignmentOperator) -> int;
```
## CompoundAssignmentOperator::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: CompoundAssignmentOperator) -> int;
```
## CompoundAssignmentOperator::getIndex

```rust
pub fn getIndex(self: CompoundAssignmentOperator) -> int;
```
## CompoundAssignmentOperator::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: CompoundAssignmentOperator) -> *Node;
```
## CompoundAssignmentOperator::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *CompoundAssignmentOperator;
```
## CompoundAssignmentOperator::is\<T\>

```rust
pub fn is<T>(self: CompoundAssignmentOperator) -> bool;
```
## CompoundAssignmentOperator::to\<T\>

```rust
pub fn to<T>(self: CompoundAssignmentOperator) -> <any>;
```
## CompoundAssignmentOperator::key\_neq

```rust
pub fn key_neq(self: CompoundAssignmentOperator, object: <any>) -> bool;
```
## CompoundAssignmentOperator::key\_eq

```rust
pub fn key_eq(self: CompoundAssignmentOperator, object: <any>) -> bool;
```
## CompoundAssignmentOperator::to\_set

```rust
pub fn to_set(self: CompoundAssignmentOperator) -> *CompoundAssignmentOperator;
```
