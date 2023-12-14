# UnaryExpression

Primary key: `id: int`

```rust
schema UnaryExpression {
  @primary id: int,
}
```
## UnaryExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: UnaryExpression) -> Location;
```
## UnaryExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: UnaryExpression) -> Symbol;
```
## UnaryExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: UnaryExpression) -> *Decorator;
```
## UnaryExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: UnaryExpression) -> string;
```
## UnaryExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: UnaryExpression, i: int) -> Modifier;
```
## UnaryExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: UnaryExpression) -> *Comment;
```
## UnaryExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: UnaryExpression) -> *Node;
```
## UnaryExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: UnaryExpression) -> *Node;
```
## UnaryExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: UnaryExpression) -> Node;
```
## UnaryExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: UnaryExpression) -> int;
```
## UnaryExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: UnaryExpression) -> TopLevelDO;
```
## UnaryExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: UnaryExpression, i: int) -> Decorator;
```
## UnaryExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: UnaryExpression) -> int;
```
## UnaryExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: UnaryExpression) -> *Modifier;
```
## UnaryExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: UnaryExpression) -> int;
```
## UnaryExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: UnaryExpression, i: int) -> Node;
```
## UnaryExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: UnaryExpression) -> int;
```
## UnaryExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: UnaryExpression, level: int) -> *Node;
```
## UnaryExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: UnaryExpression) -> *FunctionLikeDeclaration;
```
## UnaryExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: UnaryExpression) -> *Comment;
```
## UnaryExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: UnaryExpression) -> *Comment;
```
## UnaryExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: UnaryExpression) -> Node;
```
## UnaryExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: UnaryExpression) -> int;
```
## UnaryExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: UnaryExpression) -> FunctionLikeDeclaration;
```
## UnaryExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: UnaryExpression) -> File;
```
## UnaryExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: UnaryExpression, level: int) -> Node;
```
## UnaryExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: UnaryExpression) -> int;
```
## UnaryExpression::getIndex

```rust
pub fn getIndex(self: UnaryExpression) -> int;
```
## UnaryExpression::getExpression

```rust
pub fn getExpression(self: UnaryExpression) -> Expression;
```
## UnaryExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: UnaryExpression) -> string;
```
## UnaryExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: UnaryExpression) -> int;
```
## UnaryExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: UnaryExpression) -> *Node;
```
## UnaryExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *UnaryExpression;
```
## UnaryExpression::is\<T\>

```rust
pub fn is<T>(self: UnaryExpression) -> bool;
```
## UnaryExpression::to\<T\>

```rust
pub fn to<T>(self: UnaryExpression) -> <any>;
```
## UnaryExpression::key\_neq

```rust
pub fn key_neq(self: UnaryExpression, object: <any>) -> bool;
```
## UnaryExpression::key\_eq

```rust
pub fn key_eq(self: UnaryExpression, object: <any>) -> bool;
```
## UnaryExpression::to\_set

```rust
pub fn to_set(self: UnaryExpression) -> *UnaryExpression;
```
