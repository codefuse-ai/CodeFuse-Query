# PrefixUnaryExpression

Primary key: `id: int`

```rust
schema PrefixUnaryExpression {
  @primary id: int,
}
```
## PrefixUnaryExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: PrefixUnaryExpression) -> string;
```
## PrefixUnaryExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: PrefixUnaryExpression, i: int) -> Modifier;
```
## PrefixUnaryExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: PrefixUnaryExpression) -> *Decorator;
```
## PrefixUnaryExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: PrefixUnaryExpression) -> Symbol;
```
## PrefixUnaryExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: PrefixUnaryExpression) -> *Comment;
```
## PrefixUnaryExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: PrefixUnaryExpression) -> *Node;
```
## PrefixUnaryExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: PrefixUnaryExpression) -> *Node;
```
## PrefixUnaryExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: PrefixUnaryExpression) -> Node;
```
## PrefixUnaryExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: PrefixUnaryExpression) -> Node;
```
## PrefixUnaryExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: PrefixUnaryExpression) -> int;
```
## PrefixUnaryExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: PrefixUnaryExpression) -> TopLevelDO;
```
## PrefixUnaryExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: PrefixUnaryExpression, i: int) -> Decorator;
```
## PrefixUnaryExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: PrefixUnaryExpression) -> int;
```
## PrefixUnaryExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: PrefixUnaryExpression) -> *Modifier;
```
## PrefixUnaryExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: PrefixUnaryExpression) -> int;
```
## PrefixUnaryExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: PrefixUnaryExpression, i: int) -> Node;
```
## PrefixUnaryExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: PrefixUnaryExpression) -> int;
```
## PrefixUnaryExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: PrefixUnaryExpression, level: int) -> *Node;
```
## PrefixUnaryExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: PrefixUnaryExpression) -> *FunctionLikeDeclaration;
```
## PrefixUnaryExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: PrefixUnaryExpression) -> *Comment;
```
## PrefixUnaryExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: PrefixUnaryExpression) -> *Comment;
```
## PrefixUnaryExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: PrefixUnaryExpression) -> int;
```
## PrefixUnaryExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: PrefixUnaryExpression) -> FunctionLikeDeclaration;
```
## PrefixUnaryExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: PrefixUnaryExpression, level: int) -> Node;
```
## PrefixUnaryExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: PrefixUnaryExpression) -> File;
```
## PrefixUnaryExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *PrefixUnaryExpression;
```
## PrefixUnaryExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: PrefixUnaryExpression) -> int;
```
## PrefixUnaryExpression::getExpression

```rust
pub fn getExpression(self: PrefixUnaryExpression) -> Expression;
```
## PrefixUnaryExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: PrefixUnaryExpression) -> string;
```
## PrefixUnaryExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: PrefixUnaryExpression) -> Location;
```
## PrefixUnaryExpression::getOperator

```rust
pub fn getOperator(self: PrefixUnaryExpression) -> PrefixUnaryOperator;
```
## PrefixUnaryExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: PrefixUnaryExpression) -> *Node;
```
## PrefixUnaryExpression::getIndex

```rust
pub fn getIndex(self: PrefixUnaryExpression) -> int;
```
## PrefixUnaryExpression::getOperand

```rust
pub fn getOperand(self: PrefixUnaryExpression) -> UnaryExpression;
```
## PrefixUnaryExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: PrefixUnaryExpression) -> int;
```
## PrefixUnaryExpression::is\<T\>

```rust
pub fn is<T>(self: PrefixUnaryExpression) -> bool;
```
## PrefixUnaryExpression::to\<T\>

```rust
pub fn to<T>(self: PrefixUnaryExpression) -> <any>;
```
## PrefixUnaryExpression::key\_neq

```rust
pub fn key_neq(self: PrefixUnaryExpression, object: <any>) -> bool;
```
## PrefixUnaryExpression::key\_eq

```rust
pub fn key_eq(self: PrefixUnaryExpression, object: <any>) -> bool;
```
## PrefixUnaryExpression::to\_set

```rust
pub fn to_set(self: PrefixUnaryExpression) -> *PrefixUnaryExpression;
```
