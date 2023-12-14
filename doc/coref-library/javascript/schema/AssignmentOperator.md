# AssignmentOperator

Primary key: `id: int`

```rust
schema AssignmentOperator {
  @primary id: int,
}
```
## AssignmentOperator::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: AssignmentOperator) -> Location;
```
## AssignmentOperator::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: AssignmentOperator) -> Symbol;
```
## AssignmentOperator::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: AssignmentOperator) -> *Decorator;
```
## AssignmentOperator::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: AssignmentOperator) -> string;
```
## AssignmentOperator::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: AssignmentOperator, i: int) -> Modifier;
```
## AssignmentOperator::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: AssignmentOperator) -> *Comment;
```
## AssignmentOperator::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: AssignmentOperator) -> *Node;
```
## AssignmentOperator::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: AssignmentOperator) -> *Node;
```
## AssignmentOperator::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: AssignmentOperator) -> Node;
```
## AssignmentOperator::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: AssignmentOperator) -> int;
```
## AssignmentOperator::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: AssignmentOperator) -> TopLevelDO;
```
## AssignmentOperator::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: AssignmentOperator, i: int) -> Decorator;
```
## AssignmentOperator::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: AssignmentOperator) -> int;
```
## AssignmentOperator::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: AssignmentOperator) -> *Modifier;
```
## AssignmentOperator::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: AssignmentOperator) -> int;
```
## AssignmentOperator::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: AssignmentOperator, i: int) -> Node;
```
## AssignmentOperator::getStartLineNumber

```rust
pub fn getStartLineNumber(self: AssignmentOperator) -> int;
```
## AssignmentOperator::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: AssignmentOperator) -> *FunctionLikeDeclaration;
```
## AssignmentOperator::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: AssignmentOperator, level: int) -> *Node;
```
## AssignmentOperator::getEndLineNumber

```rust
pub fn getEndLineNumber(self: AssignmentOperator) -> int;
```
## AssignmentOperator::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: AssignmentOperator) -> string;
```
## AssignmentOperator::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: AssignmentOperator, level: int) -> Node;
```
## AssignmentOperator::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: AssignmentOperator) -> File;
```
## AssignmentOperator::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: AssignmentOperator) -> *Comment;
```
## AssignmentOperator::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: AssignmentOperator) -> *Comment;
```
## AssignmentOperator::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: AssignmentOperator) -> Node;
```
## AssignmentOperator::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: AssignmentOperator) -> FunctionLikeDeclaration;
```
## AssignmentOperator::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: AssignmentOperator) -> int;
```
## AssignmentOperator::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: AssignmentOperator) -> int;
```
## AssignmentOperator::getIndex

```rust
pub fn getIndex(self: AssignmentOperator) -> int;
```
## AssignmentOperator::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: AssignmentOperator) -> *Node;
```
## AssignmentOperator::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *AssignmentOperator;
```
## AssignmentOperator::is\<T\>

```rust
pub fn is<T>(self: AssignmentOperator) -> bool;
```
## AssignmentOperator::to\<T\>

```rust
pub fn to<T>(self: AssignmentOperator) -> <any>;
```
## AssignmentOperator::key\_neq

```rust
pub fn key_neq(self: AssignmentOperator, object: <any>) -> bool;
```
## AssignmentOperator::key\_eq

```rust
pub fn key_eq(self: AssignmentOperator, object: <any>) -> bool;
```
## AssignmentOperator::to\_set

```rust
pub fn to_set(self: AssignmentOperator) -> *AssignmentOperator;
```
