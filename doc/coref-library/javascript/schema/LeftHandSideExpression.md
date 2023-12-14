# LeftHandSideExpression

Primary key: `id: int`

```rust
schema LeftHandSideExpression {
  @primary id: int,
}
```
## LeftHandSideExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: LeftHandSideExpression) -> Location;
```
## LeftHandSideExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: LeftHandSideExpression) -> string;
```
## LeftHandSideExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: LeftHandSideExpression, i: int) -> Modifier;
```
## LeftHandSideExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: LeftHandSideExpression) -> *Decorator;
```
## LeftHandSideExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: LeftHandSideExpression) -> Symbol;
```
## LeftHandSideExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: LeftHandSideExpression) -> *Comment;
```
## LeftHandSideExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: LeftHandSideExpression) -> *Node;
```
## LeftHandSideExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: LeftHandSideExpression) -> *Node;
```
## LeftHandSideExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: LeftHandSideExpression) -> Node;
```
## LeftHandSideExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: LeftHandSideExpression) -> Node;
```
## LeftHandSideExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: LeftHandSideExpression) -> int;
```
## LeftHandSideExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: LeftHandSideExpression) -> TopLevelDO;
```
## LeftHandSideExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: LeftHandSideExpression, i: int) -> Decorator;
```
## LeftHandSideExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: LeftHandSideExpression) -> int;
```
## LeftHandSideExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: LeftHandSideExpression) -> *Modifier;
```
## LeftHandSideExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: LeftHandSideExpression) -> int;
```
## LeftHandSideExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: LeftHandSideExpression, i: int) -> Node;
```
## LeftHandSideExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: LeftHandSideExpression) -> int;
```
## LeftHandSideExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: LeftHandSideExpression, level: int) -> *Node;
```
## LeftHandSideExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: LeftHandSideExpression) -> *FunctionLikeDeclaration;
```
## LeftHandSideExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: LeftHandSideExpression) -> *Comment;
```
## LeftHandSideExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: LeftHandSideExpression) -> *Comment;
```
## LeftHandSideExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: LeftHandSideExpression) -> FunctionLikeDeclaration;
```
## LeftHandSideExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: LeftHandSideExpression) -> int;
```
## LeftHandSideExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: LeftHandSideExpression) -> File;
```
## LeftHandSideExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: LeftHandSideExpression, level: int) -> Node;
```
## LeftHandSideExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: LeftHandSideExpression) -> int;
```
## LeftHandSideExpression::getIndex

```rust
pub fn getIndex(self: LeftHandSideExpression) -> int;
```
## LeftHandSideExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *LeftHandSideExpression;
```
## LeftHandSideExpression::getExpression

```rust
pub fn getExpression(self: LeftHandSideExpression) -> Expression;
```
## LeftHandSideExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: LeftHandSideExpression) -> string;
```
## LeftHandSideExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: LeftHandSideExpression) -> int;
```
## LeftHandSideExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: LeftHandSideExpression) -> *Node;
```
## LeftHandSideExpression::is\<T\>

```rust
pub fn is<T>(self: LeftHandSideExpression) -> bool;
```
## LeftHandSideExpression::to\<T\>

```rust
pub fn to<T>(self: LeftHandSideExpression) -> <any>;
```
## LeftHandSideExpression::key\_neq

```rust
pub fn key_neq(self: LeftHandSideExpression, object: <any>) -> bool;
```
## LeftHandSideExpression::key\_eq

```rust
pub fn key_eq(self: LeftHandSideExpression, object: <any>) -> bool;
```
## LeftHandSideExpression::to\_set

```rust
pub fn to_set(self: LeftHandSideExpression) -> *LeftHandSideExpression;
```
