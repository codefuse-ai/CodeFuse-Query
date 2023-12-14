# ClassExpression

Primary key: `id: int`

```rust
schema ClassExpression {
  @primary id: int,
}
```
## ClassExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: ClassExpression) -> *Node;
```
## ClassExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ClassExpression) -> int;
```
## ClassExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: ClassExpression) -> string;
```
## ClassExpression::getExpression

```rust
pub fn getExpression(self: ClassExpression) -> Expression;
```
## ClassExpression::getIndex

```rust
pub fn getIndex(self: ClassExpression) -> int;
```
## ClassExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: ClassExpression) -> int;
```
## ClassExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: ClassExpression, level: int) -> Node;
```
## ClassExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: ClassExpression) -> File;
```
## ClassExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ClassExpression) -> int;
```
## ClassExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: ClassExpression) -> FunctionLikeDeclaration;
```
## ClassExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: ClassExpression) -> *Comment;
```
## ClassExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: ClassExpression) -> *Comment;
```
## ClassExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ClassExpression) -> *FunctionLikeDeclaration;
```
## ClassExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: ClassExpression, level: int) -> *Node;
```
## ClassExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: ClassExpression) -> int;
```
## ClassExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: ClassExpression) -> *Modifier;
```
## ClassExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ClassExpression) -> int;
```
## ClassExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ClassExpression) -> int;
```
## ClassExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: ClassExpression, i: int) -> Node;
```
## ClassExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: ClassExpression, i: int) -> Decorator;
```
## ClassExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: ClassExpression) -> TopLevelDO;
```
## ClassExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: ClassExpression) -> int;
```
## ClassExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: ClassExpression) -> Node;
```
## ClassExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: ClassExpression) -> Node;
```
## ClassExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: ClassExpression) -> *Node;
```
## ClassExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: ClassExpression) -> *Node;
```
## ClassExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: ClassExpression) -> *Comment;
```
## ClassExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *ClassExpression;
```
## ClassExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: ClassExpression) -> Location;
```
## ClassExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: ClassExpression) -> Symbol;
```
## ClassExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: ClassExpression) -> *Decorator;
```
## ClassExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: ClassExpression, i: int) -> Modifier;
```
## ClassExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: ClassExpression) -> string;
```
## ClassExpression::is\<T\>

```rust
pub fn is<T>(self: ClassExpression) -> bool;
```
## ClassExpression::to\<T\>

```rust
pub fn to<T>(self: ClassExpression) -> <any>;
```
## ClassExpression::key\_neq

```rust
pub fn key_neq(self: ClassExpression, object: <any>) -> bool;
```
## ClassExpression::key\_eq

```rust
pub fn key_eq(self: ClassExpression, object: <any>) -> bool;
```
## ClassExpression::to\_set

```rust
pub fn to_set(self: ClassExpression) -> *ClassExpression;
```
