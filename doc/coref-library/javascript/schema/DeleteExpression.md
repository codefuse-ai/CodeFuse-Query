# DeleteExpression

Primary key: `id: int`

```rust
schema DeleteExpression {
  @primary id: int,
}
```
## DeleteExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: DeleteExpression) -> *Node;
```
## DeleteExpression::getIndex

```rust
pub fn getIndex(self: DeleteExpression) -> int;
```
## DeleteExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: DeleteExpression) -> int;
```
## DeleteExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: DeleteExpression, level: int) -> Node;
```
## DeleteExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: DeleteExpression) -> File;
```
## DeleteExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: DeleteExpression) -> FunctionLikeDeclaration;
```
## DeleteExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: DeleteExpression) -> int;
```
## DeleteExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: DeleteExpression) -> Node;
```
## DeleteExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: DeleteExpression) -> *Comment;
```
## DeleteExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: DeleteExpression) -> *Comment;
```
## DeleteExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: DeleteExpression) -> *FunctionLikeDeclaration;
```
## DeleteExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: DeleteExpression, level: int) -> *Node;
```
## DeleteExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: DeleteExpression) -> int;
```
## DeleteExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: DeleteExpression) -> *Modifier;
```
## DeleteExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: DeleteExpression) -> int;
```
## DeleteExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: DeleteExpression) -> int;
```
## DeleteExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: DeleteExpression, i: int) -> Node;
```
## DeleteExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: DeleteExpression, i: int) -> Decorator;
```
## DeleteExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: DeleteExpression) -> TopLevelDO;
```
## DeleteExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: DeleteExpression) -> int;
```
## DeleteExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: DeleteExpression) -> Node;
```
## DeleteExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: DeleteExpression) -> *Node;
```
## DeleteExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: DeleteExpression) -> *Node;
```
## DeleteExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: DeleteExpression) -> *Comment;
```
## DeleteExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: DeleteExpression) -> Symbol;
```
## DeleteExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: DeleteExpression) -> *Decorator;
```
## DeleteExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: DeleteExpression, i: int) -> Modifier;
```
## DeleteExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: DeleteExpression) -> string;
```
## DeleteExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *DeleteExpression;
```
## DeleteExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: DeleteExpression) -> int;
```
## DeleteExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: DeleteExpression) -> string;
```
## DeleteExpression::getExpression

```rust
pub fn getExpression(self: DeleteExpression) -> UnaryExpression;
```
## DeleteExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: DeleteExpression) -> Location;
```
## DeleteExpression::is\<T\>

```rust
pub fn is<T>(self: DeleteExpression) -> bool;
```
## DeleteExpression::to\<T\>

```rust
pub fn to<T>(self: DeleteExpression) -> <any>;
```
## DeleteExpression::key\_neq

```rust
pub fn key_neq(self: DeleteExpression, object: <any>) -> bool;
```
## DeleteExpression::key\_eq

```rust
pub fn key_eq(self: DeleteExpression, object: <any>) -> bool;
```
## DeleteExpression::to\_set

```rust
pub fn to_set(self: DeleteExpression) -> *DeleteExpression;
```
