# PrimaryExpression

Primary key: `id: int`

```rust
schema PrimaryExpression {
  @primary id: int,
}
```
## PrimaryExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: PrimaryExpression) -> string;
```
## PrimaryExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: PrimaryExpression, i: int) -> Modifier;
```
## PrimaryExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: PrimaryExpression) -> Location;
```
## PrimaryExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: PrimaryExpression) -> *Decorator;
```
## PrimaryExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: PrimaryExpression) -> Symbol;
```
## PrimaryExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: PrimaryExpression) -> *Comment;
```
## PrimaryExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: PrimaryExpression) -> *Node;
```
## PrimaryExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: PrimaryExpression) -> *Node;
```
## PrimaryExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: PrimaryExpression) -> Node;
```
## PrimaryExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: PrimaryExpression) -> Node;
```
## PrimaryExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: PrimaryExpression) -> int;
```
## PrimaryExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: PrimaryExpression) -> TopLevelDO;
```
## PrimaryExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: PrimaryExpression, i: int) -> Decorator;
```
## PrimaryExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: PrimaryExpression) -> int;
```
## PrimaryExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: PrimaryExpression) -> *Modifier;
```
## PrimaryExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: PrimaryExpression) -> int;
```
## PrimaryExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: PrimaryExpression, i: int) -> Node;
```
## PrimaryExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: PrimaryExpression) -> int;
```
## PrimaryExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: PrimaryExpression, level: int) -> *Node;
```
## PrimaryExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: PrimaryExpression) -> *FunctionLikeDeclaration;
```
## PrimaryExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: PrimaryExpression) -> *Comment;
```
## PrimaryExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: PrimaryExpression) -> *Comment;
```
## PrimaryExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: PrimaryExpression) -> FunctionLikeDeclaration;
```
## PrimaryExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: PrimaryExpression) -> int;
```
## PrimaryExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: PrimaryExpression) -> File;
```
## PrimaryExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: PrimaryExpression, level: int) -> Node;
```
## PrimaryExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: PrimaryExpression) -> int;
```
## PrimaryExpression::getIndex

```rust
pub fn getIndex(self: PrimaryExpression) -> int;
```
## PrimaryExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *PrimaryExpression;
```
## PrimaryExpression::getExpression

```rust
pub fn getExpression(self: PrimaryExpression) -> Expression;
```
## PrimaryExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: PrimaryExpression) -> string;
```
## PrimaryExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: PrimaryExpression) -> int;
```
## PrimaryExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: PrimaryExpression) -> *Node;
```
## PrimaryExpression::is\<T\>

```rust
pub fn is<T>(self: PrimaryExpression) -> bool;
```
## PrimaryExpression::to\<T\>

```rust
pub fn to<T>(self: PrimaryExpression) -> <any>;
```
## PrimaryExpression::key\_neq

```rust
pub fn key_neq(self: PrimaryExpression, object: <any>) -> bool;
```
## PrimaryExpression::key\_eq

```rust
pub fn key_eq(self: PrimaryExpression, object: <any>) -> bool;
```
## PrimaryExpression::to\_set

```rust
pub fn to_set(self: PrimaryExpression) -> *PrimaryExpression;
```
