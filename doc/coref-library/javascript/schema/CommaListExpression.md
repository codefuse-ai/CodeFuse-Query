# CommaListExpression

Primary key: `id: int`

```rust
schema CommaListExpression {
  @primary id: int,
}
```
## CommaListExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: CommaListExpression) -> Location;
```
## CommaListExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: CommaListExpression) -> Symbol;
```
## CommaListExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: CommaListExpression) -> *Decorator;
```
## CommaListExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: CommaListExpression) -> string;
```
## CommaListExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: CommaListExpression, i: int) -> Modifier;
```
## CommaListExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: CommaListExpression) -> *Comment;
```
## CommaListExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: CommaListExpression) -> *Node;
```
## CommaListExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: CommaListExpression) -> *Node;
```
## CommaListExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: CommaListExpression) -> Node;
```
## CommaListExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: CommaListExpression) -> *Comment;
```
## CommaListExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: CommaListExpression) -> *Comment;
```
## CommaListExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: CommaListExpression) -> int;
```
## CommaListExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: CommaListExpression) -> TopLevelDO;
```
## CommaListExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: CommaListExpression, i: int) -> Decorator;
```
## CommaListExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: CommaListExpression) -> int;
```
## CommaListExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: CommaListExpression) -> *Modifier;
```
## CommaListExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: CommaListExpression) -> int;
```
## CommaListExpression::getAExpression

```rust
/**
     * Get a child expression of the CommaListExpression.
     */
```
```rust
pub fn getAExpression(self: CommaListExpression) -> *Expression;
```
## CommaListExpression::getExpressionCount

```rust
/**
     * Get the count of the child expressions.
     */
```
```rust
pub fn getExpressionCount(self: CommaListExpression) -> int;
```
## CommaListExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: CommaListExpression, i: int) -> Node;
```
## CommaListExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: CommaListExpression) -> int;
```
## CommaListExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: CommaListExpression) -> *FunctionLikeDeclaration;
```
## CommaListExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: CommaListExpression, level: int) -> *Node;
```
## CommaListExpression::getExpression

```rust
/**
     * Gets the `i`th child expression of CommaListExpression.
     */
```
```rust
pub fn getExpression(self: CommaListExpression, i: int) -> Expression;
```
## CommaListExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: CommaListExpression) -> int;
```
## CommaListExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: CommaListExpression) -> string;
```
## CommaListExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: CommaListExpression) -> Node;
```
## CommaListExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: CommaListExpression) -> FunctionLikeDeclaration;
```
## CommaListExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: CommaListExpression) -> int;
```
## CommaListExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: CommaListExpression) -> int;
```
## CommaListExpression::getIndex

```rust
pub fn getIndex(self: CommaListExpression) -> int;
```
## CommaListExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: CommaListExpression) -> *Node;
```
## CommaListExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: CommaListExpression, level: int) -> Node;
```
## CommaListExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: CommaListExpression) -> File;
```
## CommaListExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *CommaListExpression;
```
## CommaListExpression::is\<T\>

```rust
pub fn is<T>(self: CommaListExpression) -> bool;
```
## CommaListExpression::to\<T\>

```rust
pub fn to<T>(self: CommaListExpression) -> <any>;
```
## CommaListExpression::key\_neq

```rust
pub fn key_neq(self: CommaListExpression, object: <any>) -> bool;
```
## CommaListExpression::key\_eq

```rust
pub fn key_eq(self: CommaListExpression, object: <any>) -> bool;
```
## CommaListExpression::to\_set

```rust
pub fn to_set(self: CommaListExpression) -> *CommaListExpression;
```
