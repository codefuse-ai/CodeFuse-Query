# ParenthesizedExpression

Primary key: `id: int`

```rust
schema ParenthesizedExpression {
  @primary id: int,
}
```
## ParenthesizedExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: ParenthesizedExpression) -> *Node;
```
## ParenthesizedExpression::getIndex

```rust
pub fn getIndex(self: ParenthesizedExpression) -> int;
```
## ParenthesizedExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: ParenthesizedExpression) -> int;
```
## ParenthesizedExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: ParenthesizedExpression, level: int) -> Node;
```
## ParenthesizedExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: ParenthesizedExpression) -> File;
```
## ParenthesizedExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ParenthesizedExpression) -> int;
```
## ParenthesizedExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: ParenthesizedExpression) -> FunctionLikeDeclaration;
```
## ParenthesizedExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: ParenthesizedExpression) -> *Comment;
```
## ParenthesizedExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: ParenthesizedExpression) -> *Comment;
```
## ParenthesizedExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ParenthesizedExpression) -> *FunctionLikeDeclaration;
```
## ParenthesizedExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: ParenthesizedExpression, level: int) -> *Node;
```
## ParenthesizedExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: ParenthesizedExpression) -> int;
```
## ParenthesizedExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: ParenthesizedExpression) -> *Modifier;
```
## ParenthesizedExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ParenthesizedExpression) -> int;
```
## ParenthesizedExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ParenthesizedExpression) -> int;
```
## ParenthesizedExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: ParenthesizedExpression, i: int) -> Node;
```
## ParenthesizedExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: ParenthesizedExpression, i: int) -> Decorator;
```
## ParenthesizedExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: ParenthesizedExpression) -> TopLevelDO;
```
## ParenthesizedExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: ParenthesizedExpression) -> int;
```
## ParenthesizedExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: ParenthesizedExpression) -> Node;
```
## ParenthesizedExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: ParenthesizedExpression) -> *Node;
```
## ParenthesizedExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: ParenthesizedExpression) -> *Node;
```
## ParenthesizedExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: ParenthesizedExpression) -> *Comment;
```
## ParenthesizedExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: ParenthesizedExpression) -> Symbol;
```
## ParenthesizedExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: ParenthesizedExpression) -> *Decorator;
```
## ParenthesizedExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ParenthesizedExpression) -> int;
```
## ParenthesizedExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: ParenthesizedExpression) -> string;
```
## ParenthesizedExpression::getExpression

```rust
pub fn getExpression(self: ParenthesizedExpression) -> Expression;
```
## ParenthesizedExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: ParenthesizedExpression) -> Location;
```
## ParenthesizedExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *ParenthesizedExpression;
```
## ParenthesizedExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: ParenthesizedExpression, i: int) -> Modifier;
```
## ParenthesizedExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: ParenthesizedExpression) -> string;
```
## ParenthesizedExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: ParenthesizedExpression) -> Node;
```
## ParenthesizedExpression::is\<T\>

```rust
pub fn is<T>(self: ParenthesizedExpression) -> bool;
```
## ParenthesizedExpression::to\<T\>

```rust
pub fn to<T>(self: ParenthesizedExpression) -> <any>;
```
## ParenthesizedExpression::key\_neq

```rust
pub fn key_neq(self: ParenthesizedExpression, object: <any>) -> bool;
```
## ParenthesizedExpression::key\_eq

```rust
pub fn key_eq(self: ParenthesizedExpression, object: <any>) -> bool;
```
## ParenthesizedExpression::to\_set

```rust
pub fn to_set(self: ParenthesizedExpression) -> *ParenthesizedExpression;
```
