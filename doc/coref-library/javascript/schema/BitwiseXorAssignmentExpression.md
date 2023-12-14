# BitwiseXorAssignmentExpression

Primary key: `id: int`

```rust
schema BitwiseXorAssignmentExpression {
  @primary id: int,
}
```
## BitwiseXorAssignmentExpression::getRight

```rust
/**
     * Get the right operand of this binary expression. An alias of `getRightOperand`
     */
```
```rust
pub fn getRight(self: BitwiseXorAssignmentExpression) -> Expression;
```
## BitwiseXorAssignmentExpression::getIndex

```rust
pub fn getIndex(self: BitwiseXorAssignmentExpression) -> int;
```
## BitwiseXorAssignmentExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: BitwiseXorAssignmentExpression) -> int;
```
## BitwiseXorAssignmentExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: BitwiseXorAssignmentExpression) -> int;
```
## BitwiseXorAssignmentExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: BitwiseXorAssignmentExpression) -> FunctionLikeDeclaration;
```
## BitwiseXorAssignmentExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: BitwiseXorAssignmentExpression) -> Node;
```
## BitwiseXorAssignmentExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: BitwiseXorAssignmentExpression) -> int;
```
## BitwiseXorAssignmentExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: BitwiseXorAssignmentExpression) -> *Modifier;
```
## BitwiseXorAssignmentExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: BitwiseXorAssignmentExpression) -> int;
```
## BitwiseXorAssignmentExpression::getLeft

```rust
/**
     * Get the left operand of this binary expression. An alias of `getLeftOperand`.
     */
```
```rust
pub fn getLeft(self: BitwiseXorAssignmentExpression) -> Expression;
```
## BitwiseXorAssignmentExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: BitwiseXorAssignmentExpression) -> *Node;
```
## BitwiseXorAssignmentExpression::getOperator

```rust
/**
     * Get the operator of this binary expression.
     */
```
```rust
pub fn getOperator(self: BitwiseXorAssignmentExpression) -> BinaryOperator;
```
## BitwiseXorAssignmentExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: BitwiseXorAssignmentExpression) -> Location;
```
## BitwiseXorAssignmentExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: BitwiseXorAssignmentExpression) -> string;
```
## BitwiseXorAssignmentExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: BitwiseXorAssignmentExpression) -> int;
```
## BitwiseXorAssignmentExpression::getAnOperand

```rust
pub fn getAnOperand(self: BitwiseXorAssignmentExpression) -> *Expression;
```
## BitwiseXorAssignmentExpression::getRightOperand

```rust
/**
     * Get the right operand of this binary expression.
     */
```
```rust
pub fn getRightOperand(self: BitwiseXorAssignmentExpression) -> Expression;
```
## BitwiseXorAssignmentExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: BitwiseXorAssignmentExpression, i: int) -> Modifier;
```
## BitwiseXorAssignmentExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: BitwiseXorAssignmentExpression) -> string;
```
## BitwiseXorAssignmentExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: BitwiseXorAssignmentExpression) -> File;
```
## BitwiseXorAssignmentExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: BitwiseXorAssignmentExpression, level: int) -> Node;
```
## BitwiseXorAssignmentExpression::getLeftOperand

```rust
/**
     * Get the left operand of this binary expression.
     */
```
```rust
pub fn getLeftOperand(self: BitwiseXorAssignmentExpression) -> Expression;
```
## BitwiseXorAssignmentExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: BitwiseXorAssignmentExpression, level: int) -> *Node;
```
## BitwiseXorAssignmentExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: BitwiseXorAssignmentExpression) -> *FunctionLikeDeclaration;
```
## BitwiseXorAssignmentExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: BitwiseXorAssignmentExpression) -> int;
```
## BitwiseXorAssignmentExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: BitwiseXorAssignmentExpression, i: int) -> Node;
```
## BitwiseXorAssignmentExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: BitwiseXorAssignmentExpression) -> TopLevelDO;
```
## BitwiseXorAssignmentExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: BitwiseXorAssignmentExpression, i: int) -> Decorator;
```
## BitwiseXorAssignmentExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: BitwiseXorAssignmentExpression) -> *Node;
```
## BitwiseXorAssignmentExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: BitwiseXorAssignmentExpression) -> *Comment;
```
## BitwiseXorAssignmentExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: BitwiseXorAssignmentExpression) -> Node;
```
## BitwiseXorAssignmentExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: BitwiseXorAssignmentExpression) -> *Node;
```
## BitwiseXorAssignmentExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: BitwiseXorAssignmentExpression) -> *Comment;
```
## BitwiseXorAssignmentExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: BitwiseXorAssignmentExpression) -> *Comment;
```
## BitwiseXorAssignmentExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: BitwiseXorAssignmentExpression) -> int;
```
## BitwiseXorAssignmentExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: BitwiseXorAssignmentExpression) -> *Decorator;
```
## BitwiseXorAssignmentExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: BitwiseXorAssignmentExpression) -> Symbol;
```
## BitwiseXorAssignmentExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *BitwiseXorAssignmentExpression;
```
## BitwiseXorAssignmentExpression::is\<T\>

```rust
pub fn is<T>(self: BitwiseXorAssignmentExpression) -> bool;
```
## BitwiseXorAssignmentExpression::to\<T\>

```rust
pub fn to<T>(self: BitwiseXorAssignmentExpression) -> <any>;
```
## BitwiseXorAssignmentExpression::key\_neq

```rust
pub fn key_neq(self: BitwiseXorAssignmentExpression, object: <any>) -> bool;
```
## BitwiseXorAssignmentExpression::key\_eq

```rust
pub fn key_eq(self: BitwiseXorAssignmentExpression, object: <any>) -> bool;
```
## BitwiseXorAssignmentExpression::to\_set

```rust
pub fn to_set(self: BitwiseXorAssignmentExpression) -> *BitwiseXorAssignmentExpression;
```
