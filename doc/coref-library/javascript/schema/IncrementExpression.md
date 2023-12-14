# IncrementExpression

Primary key: `id: int`

```rust
schema IncrementExpression {
  @primary id: int,
}
```
## IncrementExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: IncrementExpression) -> Location;
```
## IncrementExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: IncrementExpression) -> string;
```
## IncrementExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: IncrementExpression, i: int) -> Modifier;
```
## IncrementExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: IncrementExpression) -> *Decorator;
```
## IncrementExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: IncrementExpression) -> Symbol;
```
## IncrementExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: IncrementExpression) -> *Comment;
```
## IncrementExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: IncrementExpression) -> *Node;
```
## IncrementExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: IncrementExpression) -> *Node;
```
## IncrementExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: IncrementExpression) -> Node;
```
## IncrementExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: IncrementExpression) -> Node;
```
## IncrementExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: IncrementExpression) -> int;
```
## IncrementExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: IncrementExpression) -> TopLevelDO;
```
## IncrementExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: IncrementExpression, i: int) -> Decorator;
```
## IncrementExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: IncrementExpression) -> int;
```
## IncrementExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: IncrementExpression) -> *Modifier;
```
## IncrementExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: IncrementExpression) -> int;
```
## IncrementExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: IncrementExpression, i: int) -> Node;
```
## IncrementExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: IncrementExpression) -> int;
```
## IncrementExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: IncrementExpression, level: int) -> *Node;
```
## IncrementExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: IncrementExpression) -> *FunctionLikeDeclaration;
```
## IncrementExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: IncrementExpression) -> *Comment;
```
## IncrementExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: IncrementExpression) -> *Comment;
```
## IncrementExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: IncrementExpression) -> FunctionLikeDeclaration;
```
## IncrementExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: IncrementExpression) -> int;
```
## IncrementExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: IncrementExpression) -> File;
```
## IncrementExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: IncrementExpression, level: int) -> Node;
```
## IncrementExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: IncrementExpression) -> int;
```
## IncrementExpression::getIndex

```rust
pub fn getIndex(self: IncrementExpression) -> int;
```
## IncrementExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *IncrementExpression;
```
## IncrementExpression::getExpression

```rust
pub fn getExpression(self: IncrementExpression) -> Expression;
```
## IncrementExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: IncrementExpression) -> string;
```
## IncrementExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: IncrementExpression) -> int;
```
## IncrementExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: IncrementExpression) -> *Node;
```
## IncrementExpression::is\<T\>

```rust
pub fn is<T>(self: IncrementExpression) -> bool;
```
## IncrementExpression::to\<T\>

```rust
pub fn to<T>(self: IncrementExpression) -> <any>;
```
## IncrementExpression::key\_neq

```rust
pub fn key_neq(self: IncrementExpression, object: <any>) -> bool;
```
## IncrementExpression::key\_eq

```rust
pub fn key_eq(self: IncrementExpression, object: <any>) -> bool;
```
## IncrementExpression::to\_set

```rust
pub fn to_set(self: IncrementExpression) -> *IncrementExpression;
```
