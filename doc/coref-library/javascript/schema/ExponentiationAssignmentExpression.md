# ExponentiationAssignmentExpression

Primary key: `id: int`

```rust
schema ExponentiationAssignmentExpression {
  @primary id: int,
}
```
## ExponentiationAssignmentExpression::getRight

```rust
/**
     * Get the right operand of this binary expression. An alias of `getRightOperand`
     */
```
```rust
pub fn getRight(self: ExponentiationAssignmentExpression) -> Expression;
```
## ExponentiationAssignmentExpression::getIndex

```rust
pub fn getIndex(self: ExponentiationAssignmentExpression) -> int;
```
## ExponentiationAssignmentExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: ExponentiationAssignmentExpression) -> int;
```
## ExponentiationAssignmentExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ExponentiationAssignmentExpression) -> int;
```
## ExponentiationAssignmentExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: ExponentiationAssignmentExpression) -> FunctionLikeDeclaration;
```
## ExponentiationAssignmentExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: ExponentiationAssignmentExpression) -> Node;
```
## ExponentiationAssignmentExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: ExponentiationAssignmentExpression) -> int;
```
## ExponentiationAssignmentExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: ExponentiationAssignmentExpression) -> *Modifier;
```
## ExponentiationAssignmentExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ExponentiationAssignmentExpression) -> int;
```
## ExponentiationAssignmentExpression::getLeft

```rust
/**
     * Get the left operand of this binary expression. An alias of `getLeftOperand`.
     */
```
```rust
pub fn getLeft(self: ExponentiationAssignmentExpression) -> Expression;
```
## ExponentiationAssignmentExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: ExponentiationAssignmentExpression) -> *Node;
```
## ExponentiationAssignmentExpression::getOperator

```rust
/**
     * Get the operator of this binary expression.
     */
```
```rust
pub fn getOperator(self: ExponentiationAssignmentExpression) -> BinaryOperator;
```
## ExponentiationAssignmentExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: ExponentiationAssignmentExpression) -> Location;
```
## ExponentiationAssignmentExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: ExponentiationAssignmentExpression) -> string;
```
## ExponentiationAssignmentExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ExponentiationAssignmentExpression) -> int;
```
## ExponentiationAssignmentExpression::getAnOperand

```rust
pub fn getAnOperand(self: ExponentiationAssignmentExpression) -> *Expression;
```
## ExponentiationAssignmentExpression::getRightOperand

```rust
/**
     * Get the right operand of this binary expression.
     */
```
```rust
pub fn getRightOperand(self: ExponentiationAssignmentExpression) -> Expression;
```
## ExponentiationAssignmentExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: ExponentiationAssignmentExpression, i: int) -> Modifier;
```
## ExponentiationAssignmentExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: ExponentiationAssignmentExpression) -> string;
```
## ExponentiationAssignmentExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: ExponentiationAssignmentExpression) -> File;
```
## ExponentiationAssignmentExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: ExponentiationAssignmentExpression, level: int) -> Node;
```
## ExponentiationAssignmentExpression::getLeftOperand

```rust
/**
     * Get the left operand of this binary expression.
     */
```
```rust
pub fn getLeftOperand(self: ExponentiationAssignmentExpression) -> Expression;
```
## ExponentiationAssignmentExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: ExponentiationAssignmentExpression, level: int) -> *Node;
```
## ExponentiationAssignmentExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ExponentiationAssignmentExpression) -> *FunctionLikeDeclaration;
```
## ExponentiationAssignmentExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ExponentiationAssignmentExpression) -> int;
```
## ExponentiationAssignmentExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: ExponentiationAssignmentExpression, i: int) -> Node;
```
## ExponentiationAssignmentExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: ExponentiationAssignmentExpression) -> TopLevelDO;
```
## ExponentiationAssignmentExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: ExponentiationAssignmentExpression, i: int) -> Decorator;
```
## ExponentiationAssignmentExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: ExponentiationAssignmentExpression) -> *Node;
```
## ExponentiationAssignmentExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: ExponentiationAssignmentExpression) -> *Comment;
```
## ExponentiationAssignmentExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: ExponentiationAssignmentExpression) -> Node;
```
## ExponentiationAssignmentExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: ExponentiationAssignmentExpression) -> *Node;
```
## ExponentiationAssignmentExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: ExponentiationAssignmentExpression) -> *Comment;
```
## ExponentiationAssignmentExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: ExponentiationAssignmentExpression) -> *Comment;
```
## ExponentiationAssignmentExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: ExponentiationAssignmentExpression) -> int;
```
## ExponentiationAssignmentExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: ExponentiationAssignmentExpression) -> *Decorator;
```
## ExponentiationAssignmentExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: ExponentiationAssignmentExpression) -> Symbol;
```
## ExponentiationAssignmentExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *ExponentiationAssignmentExpression;
```
## ExponentiationAssignmentExpression::is\<T\>

```rust
pub fn is<T>(self: ExponentiationAssignmentExpression) -> bool;
```
## ExponentiationAssignmentExpression::to\<T\>

```rust
pub fn to<T>(self: ExponentiationAssignmentExpression) -> <any>;
```
## ExponentiationAssignmentExpression::key\_neq

```rust
pub fn key_neq(self: ExponentiationAssignmentExpression, object: <any>) -> bool;
```
## ExponentiationAssignmentExpression::key\_eq

```rust
pub fn key_eq(self: ExponentiationAssignmentExpression, object: <any>) -> bool;
```
## ExponentiationAssignmentExpression::to\_set

```rust
pub fn to_set(self: ExponentiationAssignmentExpression) -> *ExponentiationAssignmentExpression;
```
