# UnaryMinusExpression

Primary key: `id: int`

```rust
schema UnaryMinusExpression {
  @primary id: int,
}
```
## UnaryMinusExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: UnaryMinusExpression) -> int;
```
## UnaryMinusExpression::getOperand

```rust
pub fn getOperand(self: UnaryMinusExpression) -> UnaryExpression;
```
## UnaryMinusExpression::getIndex

```rust
pub fn getIndex(self: UnaryMinusExpression) -> int;
```
## UnaryMinusExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: UnaryMinusExpression) -> *Node;
```
## UnaryMinusExpression::getOperator

```rust
pub fn getOperator(self: UnaryMinusExpression) -> PrefixUnaryOperator;
```
## UnaryMinusExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: UnaryMinusExpression) -> Location;
```
## UnaryMinusExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: UnaryMinusExpression) -> string;
```
## UnaryMinusExpression::getExpression

```rust
pub fn getExpression(self: UnaryMinusExpression) -> Expression;
```
## UnaryMinusExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: UnaryMinusExpression) -> int;
```
## UnaryMinusExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: UnaryMinusExpression) -> File;
```
## UnaryMinusExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: UnaryMinusExpression, level: int) -> Node;
```
## UnaryMinusExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: UnaryMinusExpression) -> FunctionLikeDeclaration;
```
## UnaryMinusExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: UnaryMinusExpression) -> *Comment;
```
## UnaryMinusExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: UnaryMinusExpression) -> *Comment;
```
## UnaryMinusExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: UnaryMinusExpression) -> *FunctionLikeDeclaration;
```
## UnaryMinusExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: UnaryMinusExpression, level: int) -> *Node;
```
## UnaryMinusExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: UnaryMinusExpression) -> int;
```
## UnaryMinusExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: UnaryMinusExpression) -> *Modifier;
```
## UnaryMinusExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: UnaryMinusExpression) -> int;
```
## UnaryMinusExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: UnaryMinusExpression) -> int;
```
## UnaryMinusExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: UnaryMinusExpression, i: int) -> Node;
```
## UnaryMinusExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: UnaryMinusExpression) -> TopLevelDO;
```
## UnaryMinusExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: UnaryMinusExpression, i: int) -> Decorator;
```
## UnaryMinusExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: UnaryMinusExpression) -> int;
```
## UnaryMinusExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: UnaryMinusExpression) -> *Node;
```
## UnaryMinusExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: UnaryMinusExpression) -> Node;
```
## UnaryMinusExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: UnaryMinusExpression) -> Node;
```
## UnaryMinusExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: UnaryMinusExpression) -> int;
```
## UnaryMinusExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: UnaryMinusExpression) -> *Node;
```
## UnaryMinusExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: UnaryMinusExpression) -> *Comment;
```
## UnaryMinusExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: UnaryMinusExpression) -> Symbol;
```
## UnaryMinusExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: UnaryMinusExpression) -> *Decorator;
```
## UnaryMinusExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *UnaryMinusExpression;
```
## UnaryMinusExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: UnaryMinusExpression, i: int) -> Modifier;
```
## UnaryMinusExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: UnaryMinusExpression) -> string;
```
## UnaryMinusExpression::is\<T\>

```rust
pub fn is<T>(self: UnaryMinusExpression) -> bool;
```
## UnaryMinusExpression::to\<T\>

```rust
pub fn to<T>(self: UnaryMinusExpression) -> <any>;
```
## UnaryMinusExpression::key\_neq

```rust
pub fn key_neq(self: UnaryMinusExpression, object: <any>) -> bool;
```
## UnaryMinusExpression::key\_eq

```rust
pub fn key_eq(self: UnaryMinusExpression, object: <any>) -> bool;
```
## UnaryMinusExpression::to\_set

```rust
pub fn to_set(self: UnaryMinusExpression) -> *UnaryMinusExpression;
```
