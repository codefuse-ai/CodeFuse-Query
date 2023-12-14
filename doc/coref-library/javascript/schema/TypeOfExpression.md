# TypeOfExpression

Primary key: `id: int`

```rust
schema TypeOfExpression {
  @primary id: int,
}
```
## TypeOfExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: TypeOfExpression) -> *Node;
```
## TypeOfExpression::getIndex

```rust
pub fn getIndex(self: TypeOfExpression) -> int;
```
## TypeOfExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: TypeOfExpression) -> int;
```
## TypeOfExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: TypeOfExpression, level: int) -> Node;
```
## TypeOfExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: TypeOfExpression) -> File;
```
## TypeOfExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: TypeOfExpression) -> FunctionLikeDeclaration;
```
## TypeOfExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: TypeOfExpression) -> int;
```
## TypeOfExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: TypeOfExpression) -> Node;
```
## TypeOfExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: TypeOfExpression) -> *Comment;
```
## TypeOfExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: TypeOfExpression) -> *Comment;
```
## TypeOfExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: TypeOfExpression) -> *FunctionLikeDeclaration;
```
## TypeOfExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: TypeOfExpression, level: int) -> *Node;
```
## TypeOfExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: TypeOfExpression) -> int;
```
## TypeOfExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: TypeOfExpression) -> *Modifier;
```
## TypeOfExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: TypeOfExpression) -> int;
```
## TypeOfExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: TypeOfExpression) -> int;
```
## TypeOfExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: TypeOfExpression, i: int) -> Node;
```
## TypeOfExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: TypeOfExpression, i: int) -> Decorator;
```
## TypeOfExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: TypeOfExpression) -> TopLevelDO;
```
## TypeOfExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: TypeOfExpression) -> int;
```
## TypeOfExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: TypeOfExpression) -> Node;
```
## TypeOfExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: TypeOfExpression) -> *Node;
```
## TypeOfExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: TypeOfExpression) -> *Node;
```
## TypeOfExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: TypeOfExpression) -> *Comment;
```
## TypeOfExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: TypeOfExpression) -> Symbol;
```
## TypeOfExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: TypeOfExpression) -> *Decorator;
```
## TypeOfExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: TypeOfExpression, i: int) -> Modifier;
```
## TypeOfExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: TypeOfExpression) -> string;
```
## TypeOfExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *TypeOfExpression;
```
## TypeOfExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: TypeOfExpression) -> int;
```
## TypeOfExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: TypeOfExpression) -> string;
```
## TypeOfExpression::getExpression

```rust
pub fn getExpression(self: TypeOfExpression) -> UnaryExpression;
```
## TypeOfExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: TypeOfExpression) -> Location;
```
## TypeOfExpression::is\<T\>

```rust
pub fn is<T>(self: TypeOfExpression) -> bool;
```
## TypeOfExpression::to\<T\>

```rust
pub fn to<T>(self: TypeOfExpression) -> <any>;
```
## TypeOfExpression::key\_neq

```rust
pub fn key_neq(self: TypeOfExpression, object: <any>) -> bool;
```
## TypeOfExpression::key\_eq

```rust
pub fn key_eq(self: TypeOfExpression, object: <any>) -> bool;
```
## TypeOfExpression::to\_set

```rust
pub fn to_set(self: TypeOfExpression) -> *TypeOfExpression;
```
