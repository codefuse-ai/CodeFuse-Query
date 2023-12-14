# AdditiveOperator

Primary key: `id: int`

```rust
schema AdditiveOperator {
  @primary id: int,
}
```
## AdditiveOperator::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: AdditiveOperator) -> Location;
```
## AdditiveOperator::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: AdditiveOperator) -> Symbol;
```
## AdditiveOperator::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: AdditiveOperator) -> *Decorator;
```
## AdditiveOperator::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: AdditiveOperator) -> string;
```
## AdditiveOperator::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: AdditiveOperator, i: int) -> Modifier;
```
## AdditiveOperator::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: AdditiveOperator) -> *Comment;
```
## AdditiveOperator::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: AdditiveOperator) -> *Node;
```
## AdditiveOperator::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: AdditiveOperator) -> *Node;
```
## AdditiveOperator::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: AdditiveOperator) -> Node;
```
## AdditiveOperator::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: AdditiveOperator) -> int;
```
## AdditiveOperator::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: AdditiveOperator) -> TopLevelDO;
```
## AdditiveOperator::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: AdditiveOperator, i: int) -> Decorator;
```
## AdditiveOperator::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: AdditiveOperator) -> int;
```
## AdditiveOperator::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: AdditiveOperator) -> *Modifier;
```
## AdditiveOperator::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: AdditiveOperator) -> int;
```
## AdditiveOperator::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: AdditiveOperator, i: int) -> Node;
```
## AdditiveOperator::getStartLineNumber

```rust
pub fn getStartLineNumber(self: AdditiveOperator) -> int;
```
## AdditiveOperator::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: AdditiveOperator) -> *FunctionLikeDeclaration;
```
## AdditiveOperator::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: AdditiveOperator, level: int) -> *Node;
```
## AdditiveOperator::getEndLineNumber

```rust
pub fn getEndLineNumber(self: AdditiveOperator) -> int;
```
## AdditiveOperator::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: AdditiveOperator) -> string;
```
## AdditiveOperator::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: AdditiveOperator, level: int) -> Node;
```
## AdditiveOperator::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: AdditiveOperator) -> File;
```
## AdditiveOperator::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: AdditiveOperator) -> *Comment;
```
## AdditiveOperator::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: AdditiveOperator) -> *Comment;
```
## AdditiveOperator::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: AdditiveOperator) -> Node;
```
## AdditiveOperator::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: AdditiveOperator) -> FunctionLikeDeclaration;
```
## AdditiveOperator::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: AdditiveOperator) -> int;
```
## AdditiveOperator::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: AdditiveOperator) -> int;
```
## AdditiveOperator::getIndex

```rust
pub fn getIndex(self: AdditiveOperator) -> int;
```
## AdditiveOperator::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: AdditiveOperator) -> *Node;
```
## AdditiveOperator::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *AdditiveOperator;
```
## AdditiveOperator::is\<T\>

```rust
pub fn is<T>(self: AdditiveOperator) -> bool;
```
## AdditiveOperator::to\<T\>

```rust
pub fn to<T>(self: AdditiveOperator) -> <any>;
```
## AdditiveOperator::key\_neq

```rust
pub fn key_neq(self: AdditiveOperator, object: <any>) -> bool;
```
## AdditiveOperator::key\_eq

```rust
pub fn key_eq(self: AdditiveOperator, object: <any>) -> bool;
```
## AdditiveOperator::to\_set

```rust
pub fn to_set(self: AdditiveOperator) -> *AdditiveOperator;
```
