# TypeAssertionExpression

Primary key: `id: int`

```rust
schema TypeAssertionExpression {
  @primary id: int,
}
```
## TypeAssertionExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: TypeAssertionExpression) -> *Node;
```
## TypeAssertionExpression::getIndex

```rust
pub fn getIndex(self: TypeAssertionExpression) -> int;
```
## TypeAssertionExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: TypeAssertionExpression) -> int;
```
## TypeAssertionExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: TypeAssertionExpression, level: int) -> Node;
```
## TypeAssertionExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: TypeAssertionExpression) -> File;
```
## TypeAssertionExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: TypeAssertionExpression) -> FunctionLikeDeclaration;
```
## TypeAssertionExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: TypeAssertionExpression) -> int;
```
## TypeAssertionExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: TypeAssertionExpression) -> Node;
```
## TypeAssertionExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: TypeAssertionExpression) -> *Comment;
```
## TypeAssertionExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: TypeAssertionExpression) -> *Comment;
```
## TypeAssertionExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: TypeAssertionExpression) -> *FunctionLikeDeclaration;
```
## TypeAssertionExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: TypeAssertionExpression, level: int) -> *Node;
```
## TypeAssertionExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: TypeAssertionExpression) -> int;
```
## TypeAssertionExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: TypeAssertionExpression) -> *Modifier;
```
## TypeAssertionExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: TypeAssertionExpression) -> int;
```
## TypeAssertionExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: TypeAssertionExpression) -> int;
```
## TypeAssertionExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: TypeAssertionExpression, i: int) -> Node;
```
## TypeAssertionExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: TypeAssertionExpression, i: int) -> Decorator;
```
## TypeAssertionExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: TypeAssertionExpression) -> TopLevelDO;
```
## TypeAssertionExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: TypeAssertionExpression) -> int;
```
## TypeAssertionExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: TypeAssertionExpression) -> Node;
```
## TypeAssertionExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: TypeAssertionExpression) -> *Node;
```
## TypeAssertionExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: TypeAssertionExpression) -> *Node;
```
## TypeAssertionExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: TypeAssertionExpression) -> *Comment;
```
## TypeAssertionExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *TypeAssertionExpression;
```
## TypeAssertionExpression::getType

```rust
pub fn getType(self: TypeAssertionExpression) -> TypeNode;
```
## TypeAssertionExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: TypeAssertionExpression) -> Symbol;
```
## TypeAssertionExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: TypeAssertionExpression) -> *Decorator;
```
## TypeAssertionExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: TypeAssertionExpression, i: int) -> Modifier;
```
## TypeAssertionExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: TypeAssertionExpression) -> string;
```
## TypeAssertionExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: TypeAssertionExpression) -> Location;
```
## TypeAssertionExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: TypeAssertionExpression) -> int;
```
## TypeAssertionExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: TypeAssertionExpression) -> string;
```
## TypeAssertionExpression::getExpression

```rust
pub fn getExpression(self: TypeAssertionExpression) -> UnaryExpression;
```
## TypeAssertionExpression::is\<T\>

```rust
pub fn is<T>(self: TypeAssertionExpression) -> bool;
```
## TypeAssertionExpression::to\<T\>

```rust
pub fn to<T>(self: TypeAssertionExpression) -> <any>;
```
## TypeAssertionExpression::key\_neq

```rust
pub fn key_neq(self: TypeAssertionExpression, object: <any>) -> bool;
```
## TypeAssertionExpression::key\_eq

```rust
pub fn key_eq(self: TypeAssertionExpression, object: <any>) -> bool;
```
## TypeAssertionExpression::to\_set

```rust
pub fn to_set(self: TypeAssertionExpression) -> *TypeAssertionExpression;
```
