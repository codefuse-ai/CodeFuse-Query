# PrefixUnaryOperator

Primary key: `id: int`

```rust
schema PrefixUnaryOperator {
  @primary id: int,
}
```
## PrefixUnaryOperator::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: PrefixUnaryOperator) -> Location;
```
## PrefixUnaryOperator::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: PrefixUnaryOperator) -> Symbol;
```
## PrefixUnaryOperator::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: PrefixUnaryOperator) -> *Decorator;
```
## PrefixUnaryOperator::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: PrefixUnaryOperator) -> string;
```
## PrefixUnaryOperator::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: PrefixUnaryOperator, i: int) -> Modifier;
```
## PrefixUnaryOperator::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: PrefixUnaryOperator) -> *Comment;
```
## PrefixUnaryOperator::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: PrefixUnaryOperator) -> *Node;
```
## PrefixUnaryOperator::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: PrefixUnaryOperator) -> *Node;
```
## PrefixUnaryOperator::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: PrefixUnaryOperator) -> Node;
```
## PrefixUnaryOperator::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: PrefixUnaryOperator) -> int;
```
## PrefixUnaryOperator::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: PrefixUnaryOperator) -> TopLevelDO;
```
## PrefixUnaryOperator::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: PrefixUnaryOperator, i: int) -> Decorator;
```
## PrefixUnaryOperator::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: PrefixUnaryOperator) -> int;
```
## PrefixUnaryOperator::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: PrefixUnaryOperator) -> *Modifier;
```
## PrefixUnaryOperator::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: PrefixUnaryOperator) -> int;
```
## PrefixUnaryOperator::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: PrefixUnaryOperator, i: int) -> Node;
```
## PrefixUnaryOperator::getStartLineNumber

```rust
pub fn getStartLineNumber(self: PrefixUnaryOperator) -> int;
```
## PrefixUnaryOperator::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: PrefixUnaryOperator) -> *FunctionLikeDeclaration;
```
## PrefixUnaryOperator::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: PrefixUnaryOperator, level: int) -> *Node;
```
## PrefixUnaryOperator::getEndLineNumber

```rust
pub fn getEndLineNumber(self: PrefixUnaryOperator) -> int;
```
## PrefixUnaryOperator::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: PrefixUnaryOperator) -> string;
```
## PrefixUnaryOperator::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: PrefixUnaryOperator, level: int) -> Node;
```
## PrefixUnaryOperator::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: PrefixUnaryOperator) -> File;
```
## PrefixUnaryOperator::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: PrefixUnaryOperator) -> *Comment;
```
## PrefixUnaryOperator::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: PrefixUnaryOperator) -> *Comment;
```
## PrefixUnaryOperator::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: PrefixUnaryOperator) -> Node;
```
## PrefixUnaryOperator::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: PrefixUnaryOperator) -> FunctionLikeDeclaration;
```
## PrefixUnaryOperator::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: PrefixUnaryOperator) -> int;
```
## PrefixUnaryOperator::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: PrefixUnaryOperator) -> int;
```
## PrefixUnaryOperator::getIndex

```rust
pub fn getIndex(self: PrefixUnaryOperator) -> int;
```
## PrefixUnaryOperator::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: PrefixUnaryOperator) -> *Node;
```
## PrefixUnaryOperator::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *PrefixUnaryOperator;
```
## PrefixUnaryOperator::is\<T\>

```rust
pub fn is<T>(self: PrefixUnaryOperator) -> bool;
```
## PrefixUnaryOperator::to\<T\>

```rust
pub fn to<T>(self: PrefixUnaryOperator) -> <any>;
```
## PrefixUnaryOperator::key\_neq

```rust
pub fn key_neq(self: PrefixUnaryOperator, object: <any>) -> bool;
```
## PrefixUnaryOperator::key\_eq

```rust
pub fn key_eq(self: PrefixUnaryOperator, object: <any>) -> bool;
```
## PrefixUnaryOperator::to\_set

```rust
pub fn to_set(self: PrefixUnaryOperator) -> *PrefixUnaryOperator;
```
