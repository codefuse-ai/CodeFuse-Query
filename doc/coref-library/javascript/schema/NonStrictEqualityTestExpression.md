# NonStrictEqualityTestExpression

Primary key: `id: int`

```rust
schema NonStrictEqualityTestExpression {
  @primary id: int,
}
```
## NonStrictEqualityTestExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: NonStrictEqualityTestExpression) -> Symbol;
```
## NonStrictEqualityTestExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: NonStrictEqualityTestExpression) -> *Decorator;
```
## NonStrictEqualityTestExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: NonStrictEqualityTestExpression) -> *Comment;
```
## NonStrictEqualityTestExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: NonStrictEqualityTestExpression) -> *Node;
```
## NonStrictEqualityTestExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: NonStrictEqualityTestExpression) -> int;
```
## NonStrictEqualityTestExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: NonStrictEqualityTestExpression) -> *Comment;
```
## NonStrictEqualityTestExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: NonStrictEqualityTestExpression) -> *Comment;
```
## NonStrictEqualityTestExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: NonStrictEqualityTestExpression) -> Node;
```
## NonStrictEqualityTestExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: NonStrictEqualityTestExpression) -> *Node;
```
## NonStrictEqualityTestExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: NonStrictEqualityTestExpression, i: int) -> Decorator;
```
## NonStrictEqualityTestExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: NonStrictEqualityTestExpression) -> TopLevelDO;
```
## NonStrictEqualityTestExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: NonStrictEqualityTestExpression, i: int) -> Node;
```
## NonStrictEqualityTestExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: NonStrictEqualityTestExpression) -> int;
```
## NonStrictEqualityTestExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: NonStrictEqualityTestExpression, level: int) -> *Node;
```
## NonStrictEqualityTestExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: NonStrictEqualityTestExpression) -> *FunctionLikeDeclaration;
```
## NonStrictEqualityTestExpression::getLeftOperand

```rust
/**
     * Get the left operand of this binary expression.
     */
```
```rust
pub fn getLeftOperand(self: NonStrictEqualityTestExpression) -> Expression;
```
## NonStrictEqualityTestExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: NonStrictEqualityTestExpression, level: int) -> Node;
```
## NonStrictEqualityTestExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: NonStrictEqualityTestExpression) -> File;
```
## NonStrictEqualityTestExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: NonStrictEqualityTestExpression) -> string;
```
## NonStrictEqualityTestExpression::getAnOperand

```rust
pub fn getAnOperand(self: NonStrictEqualityTestExpression) -> *Expression;
```
## NonStrictEqualityTestExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: NonStrictEqualityTestExpression, i: int) -> Modifier;
```
## NonStrictEqualityTestExpression::getRightOperand

```rust
/**
     * Get the right operand of this binary expression.
     */
```
```rust
pub fn getRightOperand(self: NonStrictEqualityTestExpression) -> Expression;
```
## NonStrictEqualityTestExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: NonStrictEqualityTestExpression) -> int;
```
## NonStrictEqualityTestExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: NonStrictEqualityTestExpression) -> string;
```
## NonStrictEqualityTestExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *NonStrictEqualityTestExpression;
```
## NonStrictEqualityTestExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: NonStrictEqualityTestExpression) -> Location;
```
## NonStrictEqualityTestExpression::getOperator

```rust
/**
     * Get the operator of this binary expression.
     */
```
```rust
pub fn getOperator(self: NonStrictEqualityTestExpression) -> BinaryOperator;
```
## NonStrictEqualityTestExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: NonStrictEqualityTestExpression) -> *Node;
```
## NonStrictEqualityTestExpression::getLeft

```rust
/**
     * Get the left operand of this binary expression. An alias of `getLeftOperand`.
     */
```
```rust
pub fn getLeft(self: NonStrictEqualityTestExpression) -> Expression;
```
## NonStrictEqualityTestExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: NonStrictEqualityTestExpression) -> int;
```
## NonStrictEqualityTestExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: NonStrictEqualityTestExpression) -> *Modifier;
```
## NonStrictEqualityTestExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: NonStrictEqualityTestExpression) -> int;
```
## NonStrictEqualityTestExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: NonStrictEqualityTestExpression) -> Node;
```
## NonStrictEqualityTestExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: NonStrictEqualityTestExpression) -> FunctionLikeDeclaration;
```
## NonStrictEqualityTestExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: NonStrictEqualityTestExpression) -> int;
```
## NonStrictEqualityTestExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: NonStrictEqualityTestExpression) -> int;
```
## NonStrictEqualityTestExpression::getIndex

```rust
pub fn getIndex(self: NonStrictEqualityTestExpression) -> int;
```
## NonStrictEqualityTestExpression::getRight

```rust
/**
     * Get the right operand of this binary expression. An alias of `getRightOperand`
     */
```
```rust
pub fn getRight(self: NonStrictEqualityTestExpression) -> Expression;
```
## NonStrictEqualityTestExpression::is\<T\>

```rust
pub fn is<T>(self: NonStrictEqualityTestExpression) -> bool;
```
## NonStrictEqualityTestExpression::to\<T\>

```rust
pub fn to<T>(self: NonStrictEqualityTestExpression) -> <any>;
```
## NonStrictEqualityTestExpression::key\_neq

```rust
pub fn key_neq(self: NonStrictEqualityTestExpression, object: <any>) -> bool;
```
## NonStrictEqualityTestExpression::key\_eq

```rust
pub fn key_eq(self: NonStrictEqualityTestExpression, object: <any>) -> bool;
```
## NonStrictEqualityTestExpression::to\_set

```rust
pub fn to_set(self: NonStrictEqualityTestExpression) -> *NonStrictEqualityTestExpression;
```
