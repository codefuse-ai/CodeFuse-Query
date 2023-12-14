# ThisExpression

Primary key: `id: int`

```rust
schema ThisExpression {
  @primary id: int,
}
```
## ThisExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: ThisExpression) -> *Node;
```
## ThisExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ThisExpression) -> int;
```
## ThisExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: ThisExpression) -> string;
```
## ThisExpression::getExpression

```rust
pub fn getExpression(self: ThisExpression) -> Expression;
```
## ThisExpression::getIndex

```rust
pub fn getIndex(self: ThisExpression) -> int;
```
## ThisExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: ThisExpression) -> int;
```
## ThisExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: ThisExpression, level: int) -> Node;
```
## ThisExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: ThisExpression) -> File;
```
## ThisExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ThisExpression) -> int;
```
## ThisExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: ThisExpression) -> FunctionLikeDeclaration;
```
## ThisExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: ThisExpression) -> *Comment;
```
## ThisExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: ThisExpression) -> *Comment;
```
## ThisExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ThisExpression) -> *FunctionLikeDeclaration;
```
## ThisExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: ThisExpression, level: int) -> *Node;
```
## ThisExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: ThisExpression) -> int;
```
## ThisExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: ThisExpression) -> *Modifier;
```
## ThisExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ThisExpression) -> int;
```
## ThisExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ThisExpression) -> int;
```
## ThisExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: ThisExpression, i: int) -> Node;
```
## ThisExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: ThisExpression, i: int) -> Decorator;
```
## ThisExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: ThisExpression) -> TopLevelDO;
```
## ThisExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: ThisExpression) -> int;
```
## ThisExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: ThisExpression) -> Node;
```
## ThisExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: ThisExpression) -> Node;
```
## ThisExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: ThisExpression) -> *Node;
```
## ThisExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: ThisExpression) -> *Node;
```
## ThisExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: ThisExpression) -> *Comment;
```
## ThisExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *ThisExpression;
```
## ThisExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: ThisExpression) -> Location;
```
## ThisExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: ThisExpression) -> Symbol;
```
## ThisExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: ThisExpression) -> *Decorator;
```
## ThisExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: ThisExpression, i: int) -> Modifier;
```
## ThisExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: ThisExpression) -> string;
```
## ThisExpression::is\<T\>

```rust
pub fn is<T>(self: ThisExpression) -> bool;
```
## ThisExpression::to\<T\>

```rust
pub fn to<T>(self: ThisExpression) -> <any>;
```
## ThisExpression::key\_neq

```rust
pub fn key_neq(self: ThisExpression, object: <any>) -> bool;
```
## ThisExpression::key\_eq

```rust
pub fn key_eq(self: ThisExpression, object: <any>) -> bool;
```
## ThisExpression::to\_set

```rust
pub fn to_set(self: ThisExpression) -> *ThisExpression;
```
