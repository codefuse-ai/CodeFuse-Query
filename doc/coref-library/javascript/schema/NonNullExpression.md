# NonNullExpression

Primary key: `id: int`

```rust
schema NonNullExpression {
  @primary id: int,
}
```
## NonNullExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: NonNullExpression) -> *Node;
```
## NonNullExpression::getIndex

```rust
pub fn getIndex(self: NonNullExpression) -> int;
```
## NonNullExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: NonNullExpression) -> int;
```
## NonNullExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: NonNullExpression, level: int) -> Node;
```
## NonNullExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: NonNullExpression) -> File;
```
## NonNullExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: NonNullExpression) -> int;
```
## NonNullExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: NonNullExpression) -> FunctionLikeDeclaration;
```
## NonNullExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: NonNullExpression) -> *Comment;
```
## NonNullExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: NonNullExpression) -> *Comment;
```
## NonNullExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: NonNullExpression) -> *FunctionLikeDeclaration;
```
## NonNullExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: NonNullExpression, level: int) -> *Node;
```
## NonNullExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: NonNullExpression) -> int;
```
## NonNullExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: NonNullExpression) -> *Modifier;
```
## NonNullExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: NonNullExpression) -> int;
```
## NonNullExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: NonNullExpression) -> int;
```
## NonNullExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: NonNullExpression, i: int) -> Node;
```
## NonNullExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: NonNullExpression, i: int) -> Decorator;
```
## NonNullExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: NonNullExpression) -> TopLevelDO;
```
## NonNullExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: NonNullExpression) -> int;
```
## NonNullExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: NonNullExpression) -> Node;
```
## NonNullExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: NonNullExpression) -> *Node;
```
## NonNullExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: NonNullExpression) -> *Node;
```
## NonNullExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: NonNullExpression) -> *Comment;
```
## NonNullExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: NonNullExpression) -> Symbol;
```
## NonNullExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: NonNullExpression) -> *Decorator;
```
## NonNullExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: NonNullExpression) -> int;
```
## NonNullExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: NonNullExpression) -> string;
```
## NonNullExpression::getExpression

```rust
pub fn getExpression(self: NonNullExpression) -> Expression;
```
## NonNullExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: NonNullExpression) -> Location;
```
## NonNullExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *NonNullExpression;
```
## NonNullExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: NonNullExpression, i: int) -> Modifier;
```
## NonNullExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: NonNullExpression) -> string;
```
## NonNullExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: NonNullExpression) -> Node;
```
## NonNullExpression::is\<T\>

```rust
pub fn is<T>(self: NonNullExpression) -> bool;
```
## NonNullExpression::to\<T\>

```rust
pub fn to<T>(self: NonNullExpression) -> <any>;
```
## NonNullExpression::key\_neq

```rust
pub fn key_neq(self: NonNullExpression, object: <any>) -> bool;
```
## NonNullExpression::key\_eq

```rust
pub fn key_eq(self: NonNullExpression, object: <any>) -> bool;
```
## NonNullExpression::to\_set

```rust
pub fn to_set(self: NonNullExpression) -> *NonNullExpression;
```
