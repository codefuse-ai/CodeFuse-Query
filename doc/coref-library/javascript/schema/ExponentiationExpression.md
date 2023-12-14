# ExponentiationExpression

Primary key: `id: int`

```rust
schema ExponentiationExpression {
  @primary id: int,
}
```
## ExponentiationExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: ExponentiationExpression) -> int;
```
## ExponentiationExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ExponentiationExpression) -> int;
```
## ExponentiationExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: ExponentiationExpression) -> Node;
```
## ExponentiationExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: ExponentiationExpression) -> FunctionLikeDeclaration;
```
## ExponentiationExpression::getLeft

```rust
/**
     * Get the left operand of this binary expression. An alias of `getLeftOperand`.
     */
```
```rust
pub fn getLeft(self: ExponentiationExpression) -> Expression;
```
## ExponentiationExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: ExponentiationExpression) -> *Node;
```
## ExponentiationExpression::getOperator

```rust
/**
     * Get the operator of this binary expression.
     */
```
```rust
pub fn getOperator(self: ExponentiationExpression) -> BinaryOperator;
```
## ExponentiationExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: ExponentiationExpression) -> Location;
```
## ExponentiationExpression::getRight

```rust
/**
     * Get the right operand of this binary expression. An alias of `getRightOperand`
     */
```
```rust
pub fn getRight(self: ExponentiationExpression) -> Expression;
```
## ExponentiationExpression::getIndex

```rust
pub fn getIndex(self: ExponentiationExpression) -> int;
```
## ExponentiationExpression::getAnOperand

```rust
pub fn getAnOperand(self: ExponentiationExpression) -> *Expression;
```
## ExponentiationExpression::getRightOperand

```rust
/**
     * Get the right operand of this binary expression.
     */
```
```rust
pub fn getRightOperand(self: ExponentiationExpression) -> Expression;
```
## ExponentiationExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: ExponentiationExpression, i: int) -> Modifier;
```
## ExponentiationExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: ExponentiationExpression) -> string;
```
## ExponentiationExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: ExponentiationExpression) -> string;
```
## ExponentiationExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ExponentiationExpression) -> int;
```
## ExponentiationExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: ExponentiationExpression) -> File;
```
## ExponentiationExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: ExponentiationExpression, level: int) -> Node;
```
## ExponentiationExpression::getLeftOperand

```rust
/**
     * Get the left operand of this binary expression.
     */
```
```rust
pub fn getLeftOperand(self: ExponentiationExpression) -> Expression;
```
## ExponentiationExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ExponentiationExpression) -> *FunctionLikeDeclaration;
```
## ExponentiationExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: ExponentiationExpression, level: int) -> *Node;
```
## ExponentiationExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: ExponentiationExpression) -> int;
```
## ExponentiationExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: ExponentiationExpression) -> *Modifier;
```
## ExponentiationExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ExponentiationExpression) -> int;
```
## ExponentiationExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ExponentiationExpression) -> int;
```
## ExponentiationExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: ExponentiationExpression, i: int) -> Node;
```
## ExponentiationExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: ExponentiationExpression) -> TopLevelDO;
```
## ExponentiationExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: ExponentiationExpression, i: int) -> Decorator;
```
## ExponentiationExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: ExponentiationExpression) -> *Node;
```
## ExponentiationExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: ExponentiationExpression) -> Node;
```
## ExponentiationExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: ExponentiationExpression) -> *Comment;
```
## ExponentiationExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: ExponentiationExpression) -> *Comment;
```
## ExponentiationExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: ExponentiationExpression) -> int;
```
## ExponentiationExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: ExponentiationExpression) -> *Node;
```
## ExponentiationExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: ExponentiationExpression) -> *Comment;
```
## ExponentiationExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: ExponentiationExpression) -> *Decorator;
```
## ExponentiationExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: ExponentiationExpression) -> Symbol;
```
## ExponentiationExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *ExponentiationExpression;
```
## ExponentiationExpression::is\<T\>

```rust
pub fn is<T>(self: ExponentiationExpression) -> bool;
```
## ExponentiationExpression::to\<T\>

```rust
pub fn to<T>(self: ExponentiationExpression) -> <any>;
```
## ExponentiationExpression::key\_neq

```rust
pub fn key_neq(self: ExponentiationExpression, object: <any>) -> bool;
```
## ExponentiationExpression::key\_eq

```rust
pub fn key_eq(self: ExponentiationExpression, object: <any>) -> bool;
```
## ExponentiationExpression::to\_set

```rust
pub fn to_set(self: ExponentiationExpression) -> *ExponentiationExpression;
```
