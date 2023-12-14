# SyntheticExpression

Primary key: `id: int`

```rust
schema SyntheticExpression {
  @primary id: int,
}
```
## SyntheticExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: SyntheticExpression) -> Location;
```
## SyntheticExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: SyntheticExpression) -> Symbol;
```
## SyntheticExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: SyntheticExpression) -> *Decorator;
```
## SyntheticExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: SyntheticExpression) -> string;
```
## SyntheticExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: SyntheticExpression, i: int) -> Modifier;
```
## SyntheticExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: SyntheticExpression) -> *Comment;
```
## SyntheticExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: SyntheticExpression) -> *Node;
```
## SyntheticExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: SyntheticExpression) -> *Node;
```
## SyntheticExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: SyntheticExpression) -> Node;
```
## SyntheticExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: SyntheticExpression) -> int;
```
## SyntheticExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: SyntheticExpression) -> TopLevelDO;
```
## SyntheticExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: SyntheticExpression, i: int) -> Decorator;
```
## SyntheticExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: SyntheticExpression) -> int;
```
## SyntheticExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: SyntheticExpression) -> *Modifier;
```
## SyntheticExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: SyntheticExpression) -> int;
```
## SyntheticExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: SyntheticExpression, i: int) -> Node;
```
## SyntheticExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: SyntheticExpression) -> int;
```
## SyntheticExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: SyntheticExpression) -> *FunctionLikeDeclaration;
```
## SyntheticExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: SyntheticExpression, level: int) -> *Node;
```
## SyntheticExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: SyntheticExpression) -> int;
```
## SyntheticExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: SyntheticExpression) -> string;
```
## SyntheticExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: SyntheticExpression, level: int) -> Node;
```
## SyntheticExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: SyntheticExpression) -> File;
```
## SyntheticExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: SyntheticExpression) -> *Comment;
```
## SyntheticExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: SyntheticExpression) -> *Comment;
```
## SyntheticExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: SyntheticExpression) -> Node;
```
## SyntheticExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: SyntheticExpression) -> FunctionLikeDeclaration;
```
## SyntheticExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: SyntheticExpression) -> int;
```
## SyntheticExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: SyntheticExpression) -> int;
```
## SyntheticExpression::getIndex

```rust
pub fn getIndex(self: SyntheticExpression) -> int;
```
## SyntheticExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: SyntheticExpression) -> *Node;
```
## SyntheticExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *SyntheticExpression;
```
## SyntheticExpression::is\<T\>

```rust
pub fn is<T>(self: SyntheticExpression) -> bool;
```
## SyntheticExpression::to\<T\>

```rust
pub fn to<T>(self: SyntheticExpression) -> <any>;
```
## SyntheticExpression::key\_neq

```rust
pub fn key_neq(self: SyntheticExpression, object: <any>) -> bool;
```
## SyntheticExpression::key\_eq

```rust
pub fn key_eq(self: SyntheticExpression, object: <any>) -> bool;
```
## SyntheticExpression::to\_set

```rust
pub fn to_set(self: SyntheticExpression) -> *SyntheticExpression;
```
