# AwaitExpression

Primary key: `id: int`

```rust
schema AwaitExpression {
  @primary id: int,
}
```
## AwaitExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: AwaitExpression) -> *Node;
```
## AwaitExpression::getIndex

```rust
pub fn getIndex(self: AwaitExpression) -> int;
```
## AwaitExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: AwaitExpression) -> int;
```
## AwaitExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: AwaitExpression, level: int) -> Node;
```
## AwaitExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: AwaitExpression) -> File;
```
## AwaitExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: AwaitExpression) -> FunctionLikeDeclaration;
```
## AwaitExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: AwaitExpression) -> int;
```
## AwaitExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: AwaitExpression) -> Node;
```
## AwaitExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: AwaitExpression) -> *Comment;
```
## AwaitExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: AwaitExpression) -> *Comment;
```
## AwaitExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: AwaitExpression) -> *FunctionLikeDeclaration;
```
## AwaitExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: AwaitExpression, level: int) -> *Node;
```
## AwaitExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: AwaitExpression) -> int;
```
## AwaitExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: AwaitExpression) -> *Modifier;
```
## AwaitExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: AwaitExpression) -> int;
```
## AwaitExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: AwaitExpression) -> int;
```
## AwaitExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: AwaitExpression, i: int) -> Node;
```
## AwaitExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: AwaitExpression, i: int) -> Decorator;
```
## AwaitExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: AwaitExpression) -> TopLevelDO;
```
## AwaitExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: AwaitExpression) -> int;
```
## AwaitExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: AwaitExpression) -> Node;
```
## AwaitExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: AwaitExpression) -> *Node;
```
## AwaitExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: AwaitExpression) -> *Node;
```
## AwaitExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: AwaitExpression) -> *Comment;
```
## AwaitExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: AwaitExpression) -> Symbol;
```
## AwaitExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: AwaitExpression) -> *Decorator;
```
## AwaitExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: AwaitExpression, i: int) -> Modifier;
```
## AwaitExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: AwaitExpression) -> string;
```
## AwaitExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *AwaitExpression;
```
## AwaitExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: AwaitExpression) -> int;
```
## AwaitExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: AwaitExpression) -> string;
```
## AwaitExpression::getExpression

```rust
pub fn getExpression(self: AwaitExpression) -> UnaryExpression;
```
## AwaitExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: AwaitExpression) -> Location;
```
## AwaitExpression::is\<T\>

```rust
pub fn is<T>(self: AwaitExpression) -> bool;
```
## AwaitExpression::to\<T\>

```rust
pub fn to<T>(self: AwaitExpression) -> <any>;
```
## AwaitExpression::key\_neq

```rust
pub fn key_neq(self: AwaitExpression, object: <any>) -> bool;
```
## AwaitExpression::key\_eq

```rust
pub fn key_eq(self: AwaitExpression, object: <any>) -> bool;
```
## AwaitExpression::to\_set

```rust
pub fn to_set(self: AwaitExpression) -> *AwaitExpression;
```
