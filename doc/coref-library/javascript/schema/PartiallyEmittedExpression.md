# PartiallyEmittedExpression

Primary key: `id: int`

```rust
schema PartiallyEmittedExpression {
  @primary id: int,
}
```
## PartiallyEmittedExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: PartiallyEmittedExpression) -> *Node;
```
## PartiallyEmittedExpression::getIndex

```rust
pub fn getIndex(self: PartiallyEmittedExpression) -> int;
```
## PartiallyEmittedExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: PartiallyEmittedExpression) -> int;
```
## PartiallyEmittedExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: PartiallyEmittedExpression, level: int) -> Node;
```
## PartiallyEmittedExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: PartiallyEmittedExpression) -> File;
```
## PartiallyEmittedExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: PartiallyEmittedExpression) -> int;
```
## PartiallyEmittedExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: PartiallyEmittedExpression) -> FunctionLikeDeclaration;
```
## PartiallyEmittedExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: PartiallyEmittedExpression) -> *Comment;
```
## PartiallyEmittedExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: PartiallyEmittedExpression) -> *Comment;
```
## PartiallyEmittedExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: PartiallyEmittedExpression) -> *FunctionLikeDeclaration;
```
## PartiallyEmittedExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: PartiallyEmittedExpression, level: int) -> *Node;
```
## PartiallyEmittedExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: PartiallyEmittedExpression) -> int;
```
## PartiallyEmittedExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: PartiallyEmittedExpression) -> *Modifier;
```
## PartiallyEmittedExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: PartiallyEmittedExpression) -> int;
```
## PartiallyEmittedExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: PartiallyEmittedExpression) -> int;
```
## PartiallyEmittedExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: PartiallyEmittedExpression, i: int) -> Node;
```
## PartiallyEmittedExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: PartiallyEmittedExpression, i: int) -> Decorator;
```
## PartiallyEmittedExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: PartiallyEmittedExpression) -> TopLevelDO;
```
## PartiallyEmittedExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: PartiallyEmittedExpression) -> int;
```
## PartiallyEmittedExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: PartiallyEmittedExpression) -> Node;
```
## PartiallyEmittedExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: PartiallyEmittedExpression) -> *Node;
```
## PartiallyEmittedExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: PartiallyEmittedExpression) -> *Node;
```
## PartiallyEmittedExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: PartiallyEmittedExpression) -> *Comment;
```
## PartiallyEmittedExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: PartiallyEmittedExpression) -> Symbol;
```
## PartiallyEmittedExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: PartiallyEmittedExpression) -> *Decorator;
```
## PartiallyEmittedExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: PartiallyEmittedExpression) -> int;
```
## PartiallyEmittedExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: PartiallyEmittedExpression) -> string;
```
## PartiallyEmittedExpression::getExpression

```rust
pub fn getExpression(self: PartiallyEmittedExpression) -> Expression;
```
## PartiallyEmittedExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: PartiallyEmittedExpression) -> Location;
```
## PartiallyEmittedExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *PartiallyEmittedExpression;
```
## PartiallyEmittedExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: PartiallyEmittedExpression, i: int) -> Modifier;
```
## PartiallyEmittedExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: PartiallyEmittedExpression) -> string;
```
## PartiallyEmittedExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: PartiallyEmittedExpression) -> Node;
```
## PartiallyEmittedExpression::is\<T\>

```rust
pub fn is<T>(self: PartiallyEmittedExpression) -> bool;
```
## PartiallyEmittedExpression::to\<T\>

```rust
pub fn to<T>(self: PartiallyEmittedExpression) -> <any>;
```
## PartiallyEmittedExpression::key\_neq

```rust
pub fn key_neq(self: PartiallyEmittedExpression, object: <any>) -> bool;
```
## PartiallyEmittedExpression::key\_eq

```rust
pub fn key_eq(self: PartiallyEmittedExpression, object: <any>) -> bool;
```
## PartiallyEmittedExpression::to\_set

```rust
pub fn to_set(self: PartiallyEmittedExpression) -> *PartiallyEmittedExpression;
```
