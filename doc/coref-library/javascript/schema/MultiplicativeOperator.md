# MultiplicativeOperator

Primary key: `id: int`

```rust
schema MultiplicativeOperator {
  @primary id: int,
}
```
## MultiplicativeOperator::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: MultiplicativeOperator) -> Location;
```
## MultiplicativeOperator::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: MultiplicativeOperator) -> Symbol;
```
## MultiplicativeOperator::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: MultiplicativeOperator) -> *Decorator;
```
## MultiplicativeOperator::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: MultiplicativeOperator) -> string;
```
## MultiplicativeOperator::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: MultiplicativeOperator, i: int) -> Modifier;
```
## MultiplicativeOperator::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: MultiplicativeOperator) -> *Comment;
```
## MultiplicativeOperator::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: MultiplicativeOperator) -> *Node;
```
## MultiplicativeOperator::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: MultiplicativeOperator) -> *Node;
```
## MultiplicativeOperator::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: MultiplicativeOperator) -> Node;
```
## MultiplicativeOperator::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: MultiplicativeOperator) -> int;
```
## MultiplicativeOperator::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: MultiplicativeOperator) -> TopLevelDO;
```
## MultiplicativeOperator::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: MultiplicativeOperator, i: int) -> Decorator;
```
## MultiplicativeOperator::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: MultiplicativeOperator) -> int;
```
## MultiplicativeOperator::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: MultiplicativeOperator) -> *Modifier;
```
## MultiplicativeOperator::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: MultiplicativeOperator) -> int;
```
## MultiplicativeOperator::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: MultiplicativeOperator, i: int) -> Node;
```
## MultiplicativeOperator::getStartLineNumber

```rust
pub fn getStartLineNumber(self: MultiplicativeOperator) -> int;
```
## MultiplicativeOperator::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: MultiplicativeOperator) -> *FunctionLikeDeclaration;
```
## MultiplicativeOperator::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: MultiplicativeOperator, level: int) -> *Node;
```
## MultiplicativeOperator::getEndLineNumber

```rust
pub fn getEndLineNumber(self: MultiplicativeOperator) -> int;
```
## MultiplicativeOperator::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: MultiplicativeOperator) -> string;
```
## MultiplicativeOperator::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: MultiplicativeOperator, level: int) -> Node;
```
## MultiplicativeOperator::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: MultiplicativeOperator) -> File;
```
## MultiplicativeOperator::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: MultiplicativeOperator) -> *Comment;
```
## MultiplicativeOperator::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: MultiplicativeOperator) -> *Comment;
```
## MultiplicativeOperator::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: MultiplicativeOperator) -> Node;
```
## MultiplicativeOperator::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: MultiplicativeOperator) -> FunctionLikeDeclaration;
```
## MultiplicativeOperator::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: MultiplicativeOperator) -> int;
```
## MultiplicativeOperator::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: MultiplicativeOperator) -> int;
```
## MultiplicativeOperator::getIndex

```rust
pub fn getIndex(self: MultiplicativeOperator) -> int;
```
## MultiplicativeOperator::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: MultiplicativeOperator) -> *Node;
```
## MultiplicativeOperator::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *MultiplicativeOperator;
```
## MultiplicativeOperator::is\<T\>

```rust
pub fn is<T>(self: MultiplicativeOperator) -> bool;
```
## MultiplicativeOperator::to\<T\>

```rust
pub fn to<T>(self: MultiplicativeOperator) -> <any>;
```
## MultiplicativeOperator::key\_neq

```rust
pub fn key_neq(self: MultiplicativeOperator, object: <any>) -> bool;
```
## MultiplicativeOperator::key\_eq

```rust
pub fn key_eq(self: MultiplicativeOperator, object: <any>) -> bool;
```
## MultiplicativeOperator::to\_set

```rust
pub fn to_set(self: MultiplicativeOperator) -> *MultiplicativeOperator;
```
