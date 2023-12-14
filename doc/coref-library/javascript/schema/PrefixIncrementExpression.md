# PrefixIncrementExpression

Primary key: `id: int`

```rust
schema PrefixIncrementExpression {
  @primary id: int,
}
```
## PrefixIncrementExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: PrefixIncrementExpression) -> int;
```
## PrefixIncrementExpression::getOperand

```rust
pub fn getOperand(self: PrefixIncrementExpression) -> UnaryExpression;
```
## PrefixIncrementExpression::getIndex

```rust
pub fn getIndex(self: PrefixIncrementExpression) -> int;
```
## PrefixIncrementExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: PrefixIncrementExpression) -> *Node;
```
## PrefixIncrementExpression::getOperator

```rust
pub fn getOperator(self: PrefixIncrementExpression) -> PrefixUnaryOperator;
```
## PrefixIncrementExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: PrefixIncrementExpression) -> Location;
```
## PrefixIncrementExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: PrefixIncrementExpression) -> string;
```
## PrefixIncrementExpression::getExpression

```rust
pub fn getExpression(self: PrefixIncrementExpression) -> Expression;
```
## PrefixIncrementExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: PrefixIncrementExpression) -> int;
```
## PrefixIncrementExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: PrefixIncrementExpression) -> File;
```
## PrefixIncrementExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: PrefixIncrementExpression, level: int) -> Node;
```
## PrefixIncrementExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: PrefixIncrementExpression) -> FunctionLikeDeclaration;
```
## PrefixIncrementExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: PrefixIncrementExpression) -> *Comment;
```
## PrefixIncrementExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: PrefixIncrementExpression) -> *Comment;
```
## PrefixIncrementExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: PrefixIncrementExpression) -> *FunctionLikeDeclaration;
```
## PrefixIncrementExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: PrefixIncrementExpression, level: int) -> *Node;
```
## PrefixIncrementExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: PrefixIncrementExpression) -> int;
```
## PrefixIncrementExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: PrefixIncrementExpression) -> *Modifier;
```
## PrefixIncrementExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: PrefixIncrementExpression) -> int;
```
## PrefixIncrementExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: PrefixIncrementExpression) -> int;
```
## PrefixIncrementExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: PrefixIncrementExpression, i: int) -> Node;
```
## PrefixIncrementExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: PrefixIncrementExpression) -> TopLevelDO;
```
## PrefixIncrementExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: PrefixIncrementExpression, i: int) -> Decorator;
```
## PrefixIncrementExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: PrefixIncrementExpression) -> int;
```
## PrefixIncrementExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: PrefixIncrementExpression) -> *Node;
```
## PrefixIncrementExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: PrefixIncrementExpression) -> Node;
```
## PrefixIncrementExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: PrefixIncrementExpression) -> Node;
```
## PrefixIncrementExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: PrefixIncrementExpression) -> int;
```
## PrefixIncrementExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: PrefixIncrementExpression) -> *Node;
```
## PrefixIncrementExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: PrefixIncrementExpression) -> *Comment;
```
## PrefixIncrementExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: PrefixIncrementExpression) -> Symbol;
```
## PrefixIncrementExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: PrefixIncrementExpression) -> *Decorator;
```
## PrefixIncrementExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *PrefixIncrementExpression;
```
## PrefixIncrementExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: PrefixIncrementExpression, i: int) -> Modifier;
```
## PrefixIncrementExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: PrefixIncrementExpression) -> string;
```
## PrefixIncrementExpression::is\<T\>

```rust
pub fn is<T>(self: PrefixIncrementExpression) -> bool;
```
## PrefixIncrementExpression::to\<T\>

```rust
pub fn to<T>(self: PrefixIncrementExpression) -> <any>;
```
## PrefixIncrementExpression::key\_neq

```rust
pub fn key_neq(self: PrefixIncrementExpression, object: <any>) -> bool;
```
## PrefixIncrementExpression::key\_eq

```rust
pub fn key_eq(self: PrefixIncrementExpression, object: <any>) -> bool;
```
## PrefixIncrementExpression::to\_set

```rust
pub fn to_set(self: PrefixIncrementExpression) -> *PrefixIncrementExpression;
```
