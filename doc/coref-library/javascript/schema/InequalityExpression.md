# InequalityExpression

Primary key: `id: int`

```rust
schema InequalityExpression {
  @primary id: int,
}
```
## InequalityExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: InequalityExpression) -> Symbol;
```
## InequalityExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: InequalityExpression) -> *Decorator;
```
## InequalityExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: InequalityExpression) -> *Comment;
```
## InequalityExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: InequalityExpression) -> *Node;
```
## InequalityExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: InequalityExpression) -> int;
```
## InequalityExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: InequalityExpression) -> *Comment;
```
## InequalityExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: InequalityExpression) -> *Comment;
```
## InequalityExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: InequalityExpression) -> Node;
```
## InequalityExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: InequalityExpression) -> *Node;
```
## InequalityExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: InequalityExpression, i: int) -> Decorator;
```
## InequalityExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: InequalityExpression) -> TopLevelDO;
```
## InequalityExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: InequalityExpression, i: int) -> Node;
```
## InequalityExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: InequalityExpression) -> int;
```
## InequalityExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: InequalityExpression, level: int) -> *Node;
```
## InequalityExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: InequalityExpression) -> *FunctionLikeDeclaration;
```
## InequalityExpression::getLeftOperand

```rust
/**
     * Get the left operand of this binary expression.
     */
```
```rust
pub fn getLeftOperand(self: InequalityExpression) -> Expression;
```
## InequalityExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: InequalityExpression, level: int) -> Node;
```
## InequalityExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: InequalityExpression) -> File;
```
## InequalityExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: InequalityExpression) -> string;
```
## InequalityExpression::getAnOperand

```rust
pub fn getAnOperand(self: InequalityExpression) -> *Expression;
```
## InequalityExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: InequalityExpression, i: int) -> Modifier;
```
## InequalityExpression::getRightOperand

```rust
/**
     * Get the right operand of this binary expression.
     */
```
```rust
pub fn getRightOperand(self: InequalityExpression) -> Expression;
```
## InequalityExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: InequalityExpression) -> int;
```
## InequalityExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: InequalityExpression) -> string;
```
## InequalityExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *InequalityExpression;
```
## InequalityExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: InequalityExpression) -> Location;
```
## InequalityExpression::getOperator

```rust
/**
     * Get the operator of this binary expression.
     */
```
```rust
pub fn getOperator(self: InequalityExpression) -> BinaryOperator;
```
## InequalityExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: InequalityExpression) -> *Node;
```
## InequalityExpression::getLeft

```rust
/**
     * Get the left operand of this binary expression. An alias of `getLeftOperand`.
     */
```
```rust
pub fn getLeft(self: InequalityExpression) -> Expression;
```
## InequalityExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: InequalityExpression) -> int;
```
## InequalityExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: InequalityExpression) -> *Modifier;
```
## InequalityExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: InequalityExpression) -> int;
```
## InequalityExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: InequalityExpression) -> Node;
```
## InequalityExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: InequalityExpression) -> FunctionLikeDeclaration;
```
## InequalityExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: InequalityExpression) -> int;
```
## InequalityExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: InequalityExpression) -> int;
```
## InequalityExpression::getIndex

```rust
pub fn getIndex(self: InequalityExpression) -> int;
```
## InequalityExpression::getRight

```rust
/**
     * Get the right operand of this binary expression. An alias of `getRightOperand`
     */
```
```rust
pub fn getRight(self: InequalityExpression) -> Expression;
```
## InequalityExpression::is\<T\>

```rust
pub fn is<T>(self: InequalityExpression) -> bool;
```
## InequalityExpression::to\<T\>

```rust
pub fn to<T>(self: InequalityExpression) -> <any>;
```
## InequalityExpression::key\_neq

```rust
pub fn key_neq(self: InequalityExpression, object: <any>) -> bool;
```
## InequalityExpression::key\_eq

```rust
pub fn key_eq(self: InequalityExpression, object: <any>) -> bool;
```
## InequalityExpression::to\_set

```rust
pub fn to_set(self: InequalityExpression) -> *InequalityExpression;
```
