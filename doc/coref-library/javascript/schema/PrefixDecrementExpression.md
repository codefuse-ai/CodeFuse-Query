# PrefixDecrementExpression

Primary key: `id: int`

```rust
schema PrefixDecrementExpression {
  @primary id: int,
}
```
## PrefixDecrementExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: PrefixDecrementExpression) -> int;
```
## PrefixDecrementExpression::getOperand

```rust
pub fn getOperand(self: PrefixDecrementExpression) -> UnaryExpression;
```
## PrefixDecrementExpression::getIndex

```rust
pub fn getIndex(self: PrefixDecrementExpression) -> int;
```
## PrefixDecrementExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: PrefixDecrementExpression) -> *Node;
```
## PrefixDecrementExpression::getOperator

```rust
pub fn getOperator(self: PrefixDecrementExpression) -> PrefixUnaryOperator;
```
## PrefixDecrementExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: PrefixDecrementExpression) -> Location;
```
## PrefixDecrementExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: PrefixDecrementExpression) -> string;
```
## PrefixDecrementExpression::getExpression

```rust
pub fn getExpression(self: PrefixDecrementExpression) -> Expression;
```
## PrefixDecrementExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: PrefixDecrementExpression) -> int;
```
## PrefixDecrementExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: PrefixDecrementExpression) -> File;
```
## PrefixDecrementExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: PrefixDecrementExpression, level: int) -> Node;
```
## PrefixDecrementExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: PrefixDecrementExpression) -> FunctionLikeDeclaration;
```
## PrefixDecrementExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: PrefixDecrementExpression) -> *Comment;
```
## PrefixDecrementExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: PrefixDecrementExpression) -> *Comment;
```
## PrefixDecrementExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: PrefixDecrementExpression) -> *FunctionLikeDeclaration;
```
## PrefixDecrementExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: PrefixDecrementExpression, level: int) -> *Node;
```
## PrefixDecrementExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: PrefixDecrementExpression) -> int;
```
## PrefixDecrementExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: PrefixDecrementExpression) -> *Modifier;
```
## PrefixDecrementExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: PrefixDecrementExpression) -> int;
```
## PrefixDecrementExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: PrefixDecrementExpression) -> int;
```
## PrefixDecrementExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: PrefixDecrementExpression, i: int) -> Node;
```
## PrefixDecrementExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: PrefixDecrementExpression) -> TopLevelDO;
```
## PrefixDecrementExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: PrefixDecrementExpression, i: int) -> Decorator;
```
## PrefixDecrementExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: PrefixDecrementExpression) -> int;
```
## PrefixDecrementExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: PrefixDecrementExpression) -> *Node;
```
## PrefixDecrementExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: PrefixDecrementExpression) -> Node;
```
## PrefixDecrementExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: PrefixDecrementExpression) -> Node;
```
## PrefixDecrementExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: PrefixDecrementExpression) -> int;
```
## PrefixDecrementExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: PrefixDecrementExpression) -> *Node;
```
## PrefixDecrementExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: PrefixDecrementExpression) -> *Comment;
```
## PrefixDecrementExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: PrefixDecrementExpression) -> Symbol;
```
## PrefixDecrementExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: PrefixDecrementExpression) -> *Decorator;
```
## PrefixDecrementExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *PrefixDecrementExpression;
```
## PrefixDecrementExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: PrefixDecrementExpression, i: int) -> Modifier;
```
## PrefixDecrementExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: PrefixDecrementExpression) -> string;
```
## PrefixDecrementExpression::is\<T\>

```rust
pub fn is<T>(self: PrefixDecrementExpression) -> bool;
```
## PrefixDecrementExpression::to\<T\>

```rust
pub fn to<T>(self: PrefixDecrementExpression) -> <any>;
```
## PrefixDecrementExpression::key\_neq

```rust
pub fn key_neq(self: PrefixDecrementExpression, object: <any>) -> bool;
```
## PrefixDecrementExpression::key\_eq

```rust
pub fn key_eq(self: PrefixDecrementExpression, object: <any>) -> bool;
```
## PrefixDecrementExpression::to\_set

```rust
pub fn to_set(self: PrefixDecrementExpression) -> *PrefixDecrementExpression;
```
