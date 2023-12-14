# SyntheticReferenceExpression

Primary key: `id: int`

```rust
schema SyntheticReferenceExpression {
  @primary id: int,
}
```
## SyntheticReferenceExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: SyntheticReferenceExpression) -> *Node;
```
## SyntheticReferenceExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: SyntheticReferenceExpression) -> int;
```
## SyntheticReferenceExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: SyntheticReferenceExpression) -> string;
```
## SyntheticReferenceExpression::getExpression

```rust
pub fn getExpression(self: SyntheticReferenceExpression) -> Expression;
```
## SyntheticReferenceExpression::getIndex

```rust
pub fn getIndex(self: SyntheticReferenceExpression) -> int;
```
## SyntheticReferenceExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: SyntheticReferenceExpression) -> int;
```
## SyntheticReferenceExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: SyntheticReferenceExpression, level: int) -> Node;
```
## SyntheticReferenceExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: SyntheticReferenceExpression) -> File;
```
## SyntheticReferenceExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: SyntheticReferenceExpression) -> int;
```
## SyntheticReferenceExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: SyntheticReferenceExpression) -> FunctionLikeDeclaration;
```
## SyntheticReferenceExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: SyntheticReferenceExpression) -> *Comment;
```
## SyntheticReferenceExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: SyntheticReferenceExpression) -> *Comment;
```
## SyntheticReferenceExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: SyntheticReferenceExpression) -> *FunctionLikeDeclaration;
```
## SyntheticReferenceExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: SyntheticReferenceExpression, level: int) -> *Node;
```
## SyntheticReferenceExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: SyntheticReferenceExpression) -> int;
```
## SyntheticReferenceExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: SyntheticReferenceExpression) -> *Modifier;
```
## SyntheticReferenceExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: SyntheticReferenceExpression) -> int;
```
## SyntheticReferenceExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: SyntheticReferenceExpression) -> int;
```
## SyntheticReferenceExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: SyntheticReferenceExpression, i: int) -> Node;
```
## SyntheticReferenceExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: SyntheticReferenceExpression, i: int) -> Decorator;
```
## SyntheticReferenceExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: SyntheticReferenceExpression) -> TopLevelDO;
```
## SyntheticReferenceExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: SyntheticReferenceExpression) -> int;
```
## SyntheticReferenceExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: SyntheticReferenceExpression) -> Node;
```
## SyntheticReferenceExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: SyntheticReferenceExpression) -> Node;
```
## SyntheticReferenceExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: SyntheticReferenceExpression) -> *Node;
```
## SyntheticReferenceExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: SyntheticReferenceExpression) -> *Node;
```
## SyntheticReferenceExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: SyntheticReferenceExpression) -> *Comment;
```
## SyntheticReferenceExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: SyntheticReferenceExpression) -> Symbol;
```
## SyntheticReferenceExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: SyntheticReferenceExpression) -> *Decorator;
```
## SyntheticReferenceExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: SyntheticReferenceExpression) -> Location;
```
## SyntheticReferenceExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *SyntheticReferenceExpression;
```
## SyntheticReferenceExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: SyntheticReferenceExpression, i: int) -> Modifier;
```
## SyntheticReferenceExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: SyntheticReferenceExpression) -> string;
```
## SyntheticReferenceExpression::is\<T\>

```rust
pub fn is<T>(self: SyntheticReferenceExpression) -> bool;
```
## SyntheticReferenceExpression::to\<T\>

```rust
pub fn to<T>(self: SyntheticReferenceExpression) -> <any>;
```
## SyntheticReferenceExpression::key\_neq

```rust
pub fn key_neq(self: SyntheticReferenceExpression, object: <any>) -> bool;
```
## SyntheticReferenceExpression::key\_eq

```rust
pub fn key_eq(self: SyntheticReferenceExpression, object: <any>) -> bool;
```
## SyntheticReferenceExpression::to\_set

```rust
pub fn to_set(self: SyntheticReferenceExpression) -> *SyntheticReferenceExpression;
```
