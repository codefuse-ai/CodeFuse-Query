# BitwiseNotExpression

Primary key: `id: int`

```rust
schema BitwiseNotExpression {
  @primary id: int,
}
```
## BitwiseNotExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: BitwiseNotExpression) -> int;
```
## BitwiseNotExpression::getOperand

```rust
pub fn getOperand(self: BitwiseNotExpression) -> UnaryExpression;
```
## BitwiseNotExpression::getIndex

```rust
pub fn getIndex(self: BitwiseNotExpression) -> int;
```
## BitwiseNotExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: BitwiseNotExpression) -> *Node;
```
## BitwiseNotExpression::getOperator

```rust
pub fn getOperator(self: BitwiseNotExpression) -> PrefixUnaryOperator;
```
## BitwiseNotExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: BitwiseNotExpression) -> Location;
```
## BitwiseNotExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: BitwiseNotExpression) -> string;
```
## BitwiseNotExpression::getExpression

```rust
pub fn getExpression(self: BitwiseNotExpression) -> Expression;
```
## BitwiseNotExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: BitwiseNotExpression) -> int;
```
## BitwiseNotExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: BitwiseNotExpression) -> File;
```
## BitwiseNotExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: BitwiseNotExpression, level: int) -> Node;
```
## BitwiseNotExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: BitwiseNotExpression) -> FunctionLikeDeclaration;
```
## BitwiseNotExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: BitwiseNotExpression) -> *Comment;
```
## BitwiseNotExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: BitwiseNotExpression) -> *Comment;
```
## BitwiseNotExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: BitwiseNotExpression) -> *FunctionLikeDeclaration;
```
## BitwiseNotExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: BitwiseNotExpression, level: int) -> *Node;
```
## BitwiseNotExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: BitwiseNotExpression) -> int;
```
## BitwiseNotExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: BitwiseNotExpression) -> *Modifier;
```
## BitwiseNotExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: BitwiseNotExpression) -> int;
```
## BitwiseNotExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: BitwiseNotExpression) -> int;
```
## BitwiseNotExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: BitwiseNotExpression, i: int) -> Node;
```
## BitwiseNotExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: BitwiseNotExpression) -> TopLevelDO;
```
## BitwiseNotExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: BitwiseNotExpression, i: int) -> Decorator;
```
## BitwiseNotExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: BitwiseNotExpression) -> int;
```
## BitwiseNotExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: BitwiseNotExpression) -> *Node;
```
## BitwiseNotExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: BitwiseNotExpression) -> Node;
```
## BitwiseNotExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: BitwiseNotExpression) -> Node;
```
## BitwiseNotExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: BitwiseNotExpression) -> int;
```
## BitwiseNotExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: BitwiseNotExpression) -> *Node;
```
## BitwiseNotExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: BitwiseNotExpression) -> *Comment;
```
## BitwiseNotExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: BitwiseNotExpression) -> Symbol;
```
## BitwiseNotExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: BitwiseNotExpression) -> *Decorator;
```
## BitwiseNotExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *BitwiseNotExpression;
```
## BitwiseNotExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: BitwiseNotExpression, i: int) -> Modifier;
```
## BitwiseNotExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: BitwiseNotExpression) -> string;
```
## BitwiseNotExpression::is\<T\>

```rust
pub fn is<T>(self: BitwiseNotExpression) -> bool;
```
## BitwiseNotExpression::to\<T\>

```rust
pub fn to<T>(self: BitwiseNotExpression) -> <any>;
```
## BitwiseNotExpression::key\_neq

```rust
pub fn key_neq(self: BitwiseNotExpression, object: <any>) -> bool;
```
## BitwiseNotExpression::key\_eq

```rust
pub fn key_eq(self: BitwiseNotExpression, object: <any>) -> bool;
```
## BitwiseNotExpression::to\_set

```rust
pub fn to_set(self: BitwiseNotExpression) -> *BitwiseNotExpression;
```
