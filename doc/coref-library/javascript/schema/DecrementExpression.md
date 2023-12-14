# DecrementExpression

Primary key: `id: int`

```rust
schema DecrementExpression {
  @primary id: int,
}
```
## DecrementExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: DecrementExpression) -> Location;
```
## DecrementExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: DecrementExpression) -> string;
```
## DecrementExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: DecrementExpression, i: int) -> Modifier;
```
## DecrementExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: DecrementExpression) -> *Decorator;
```
## DecrementExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: DecrementExpression) -> Symbol;
```
## DecrementExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: DecrementExpression) -> *Comment;
```
## DecrementExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: DecrementExpression) -> *Node;
```
## DecrementExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: DecrementExpression) -> *Node;
```
## DecrementExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: DecrementExpression) -> Node;
```
## DecrementExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: DecrementExpression) -> Node;
```
## DecrementExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: DecrementExpression) -> int;
```
## DecrementExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: DecrementExpression) -> TopLevelDO;
```
## DecrementExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: DecrementExpression, i: int) -> Decorator;
```
## DecrementExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: DecrementExpression) -> int;
```
## DecrementExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: DecrementExpression) -> *Modifier;
```
## DecrementExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: DecrementExpression) -> int;
```
## DecrementExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: DecrementExpression, i: int) -> Node;
```
## DecrementExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: DecrementExpression) -> int;
```
## DecrementExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: DecrementExpression, level: int) -> *Node;
```
## DecrementExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: DecrementExpression) -> *FunctionLikeDeclaration;
```
## DecrementExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: DecrementExpression) -> *Comment;
```
## DecrementExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: DecrementExpression) -> *Comment;
```
## DecrementExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: DecrementExpression) -> FunctionLikeDeclaration;
```
## DecrementExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: DecrementExpression) -> int;
```
## DecrementExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: DecrementExpression) -> File;
```
## DecrementExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: DecrementExpression, level: int) -> Node;
```
## DecrementExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: DecrementExpression) -> int;
```
## DecrementExpression::getIndex

```rust
pub fn getIndex(self: DecrementExpression) -> int;
```
## DecrementExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *DecrementExpression;
```
## DecrementExpression::getExpression

```rust
pub fn getExpression(self: DecrementExpression) -> Expression;
```
## DecrementExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: DecrementExpression) -> string;
```
## DecrementExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: DecrementExpression) -> int;
```
## DecrementExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: DecrementExpression) -> *Node;
```
## DecrementExpression::is\<T\>

```rust
pub fn is<T>(self: DecrementExpression) -> bool;
```
## DecrementExpression::to\<T\>

```rust
pub fn to<T>(self: DecrementExpression) -> <any>;
```
## DecrementExpression::key\_neq

```rust
pub fn key_neq(self: DecrementExpression, object: <any>) -> bool;
```
## DecrementExpression::key\_eq

```rust
pub fn key_eq(self: DecrementExpression, object: <any>) -> bool;
```
## DecrementExpression::to\_set

```rust
pub fn to_set(self: DecrementExpression) -> *DecrementExpression;
```
