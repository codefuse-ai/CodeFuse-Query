# YieldExpression

Primary key: `id: int`

```rust
schema YieldExpression {
  @primary id: int,
}
```
## YieldExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: YieldExpression) -> Location;
```
## YieldExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: YieldExpression) -> Symbol;
```
## YieldExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: YieldExpression) -> *Decorator;
```
## YieldExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: YieldExpression) -> string;
```
## YieldExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: YieldExpression, i: int) -> Modifier;
```
## YieldExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: YieldExpression) -> *Comment;
```
## YieldExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: YieldExpression) -> *Node;
```
## YieldExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: YieldExpression) -> *Node;
```
## YieldExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: YieldExpression) -> Node;
```
## YieldExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: YieldExpression) -> *Comment;
```
## YieldExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: YieldExpression) -> *Comment;
```
## YieldExpression::isDelegating

```rust
pub fn isDelegating(self: YieldExpression) -> bool;
```
## YieldExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: YieldExpression) -> int;
```
## YieldExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: YieldExpression) -> TopLevelDO;
```
## YieldExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: YieldExpression, i: int) -> Decorator;
```
## YieldExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: YieldExpression) -> int;
```
## YieldExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: YieldExpression) -> *Modifier;
```
## YieldExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: YieldExpression) -> int;
```
## YieldExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: YieldExpression, i: int) -> Node;
```
## YieldExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: YieldExpression) -> int;
```
## YieldExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: YieldExpression) -> *FunctionLikeDeclaration;
```
## YieldExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: YieldExpression, level: int) -> *Node;
```
## YieldExpression::getExpression

```rust
pub fn getExpression(self: YieldExpression) -> Expression;
```
## YieldExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: YieldExpression) -> int;
```
## YieldExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: YieldExpression) -> string;
```
## YieldExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: YieldExpression) -> Node;
```
## YieldExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: YieldExpression) -> int;
```
## YieldExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: YieldExpression) -> FunctionLikeDeclaration;
```
## YieldExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: YieldExpression) -> File;
```
## YieldExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: YieldExpression, level: int) -> Node;
```
## YieldExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: YieldExpression) -> int;
```
## YieldExpression::getIndex

```rust
pub fn getIndex(self: YieldExpression) -> int;
```
## YieldExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: YieldExpression) -> *Node;
```
## YieldExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *YieldExpression;
```
## YieldExpression::is\<T\>

```rust
pub fn is<T>(self: YieldExpression) -> bool;
```
## YieldExpression::to\<T\>

```rust
pub fn to<T>(self: YieldExpression) -> <any>;
```
## YieldExpression::key\_neq

```rust
pub fn key_neq(self: YieldExpression, object: <any>) -> bool;
```
## YieldExpression::key\_eq

```rust
pub fn key_eq(self: YieldExpression, object: <any>) -> bool;
```
## YieldExpression::to\_set

```rust
pub fn to_set(self: YieldExpression) -> *YieldExpression;
```
