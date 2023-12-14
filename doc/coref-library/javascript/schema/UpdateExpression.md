# UpdateExpression

Primary key: `id: int`

```rust
schema UpdateExpression {
  @primary id: int,
}
```
## UpdateExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: UpdateExpression) -> *Node;
```
## UpdateExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: UpdateExpression) -> int;
```
## UpdateExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: UpdateExpression) -> string;
```
## UpdateExpression::getExpression

```rust
pub fn getExpression(self: UpdateExpression) -> Expression;
```
## UpdateExpression::getIndex

```rust
pub fn getIndex(self: UpdateExpression) -> int;
```
## UpdateExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: UpdateExpression) -> int;
```
## UpdateExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: UpdateExpression, level: int) -> Node;
```
## UpdateExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: UpdateExpression) -> File;
```
## UpdateExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: UpdateExpression) -> FunctionLikeDeclaration;
```
## UpdateExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: UpdateExpression) -> int;
```
## UpdateExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: UpdateExpression) -> *Comment;
```
## UpdateExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: UpdateExpression) -> *Comment;
```
## UpdateExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: UpdateExpression) -> *FunctionLikeDeclaration;
```
## UpdateExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: UpdateExpression, level: int) -> *Node;
```
## UpdateExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: UpdateExpression) -> int;
```
## UpdateExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: UpdateExpression) -> *Modifier;
```
## UpdateExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: UpdateExpression) -> int;
```
## UpdateExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: UpdateExpression) -> int;
```
## UpdateExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: UpdateExpression, i: int) -> Node;
```
## UpdateExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: UpdateExpression, i: int) -> Decorator;
```
## UpdateExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: UpdateExpression) -> TopLevelDO;
```
## UpdateExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: UpdateExpression) -> int;
```
## UpdateExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: UpdateExpression) -> Node;
```
## UpdateExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: UpdateExpression) -> Node;
```
## UpdateExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: UpdateExpression) -> *Node;
```
## UpdateExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: UpdateExpression) -> *Node;
```
## UpdateExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: UpdateExpression) -> *Comment;
```
## UpdateExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: UpdateExpression) -> Symbol;
```
## UpdateExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: UpdateExpression) -> *Decorator;
```
## UpdateExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: UpdateExpression, i: int) -> Modifier;
```
## UpdateExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: UpdateExpression) -> string;
```
## UpdateExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *UpdateExpression;
```
## UpdateExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: UpdateExpression) -> Location;
```
## UpdateExpression::is\<T\>

```rust
pub fn is<T>(self: UpdateExpression) -> bool;
```
## UpdateExpression::to\<T\>

```rust
pub fn to<T>(self: UpdateExpression) -> <any>;
```
## UpdateExpression::key\_neq

```rust
pub fn key_neq(self: UpdateExpression, object: <any>) -> bool;
```
## UpdateExpression::key\_eq

```rust
pub fn key_eq(self: UpdateExpression, object: <any>) -> bool;
```
## UpdateExpression::to\_set

```rust
pub fn to_set(self: UpdateExpression) -> *UpdateExpression;
```
