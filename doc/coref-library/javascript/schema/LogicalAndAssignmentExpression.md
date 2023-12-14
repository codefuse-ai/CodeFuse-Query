# LogicalAndAssignmentExpression

Inherit from [CompoundAssignmentExpression](./CompoundAssignmentExpression.md)

Primary key: `id: int`

```rust
schema LogicalAndAssignmentExpression extends CompoundAssignmentExpression {
  @primary id: int,
}
```
## LogicalAndAssignmentExpression::getRight

```java
/**
* Get the right operand of this binary expression. An alias of `getRightOperand`
*/
```
```rust
pub fn getRight(self: LogicalAndAssignmentExpression) -> Expression;
```
## LogicalAndAssignmentExpression::getIndex

```rust
pub fn getIndex(self: LogicalAndAssignmentExpression) -> int;
```
## LogicalAndAssignmentExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: LogicalAndAssignmentExpression) -> int;
```
## LogicalAndAssignmentExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: LogicalAndAssignmentExpression) -> int;
```
## LogicalAndAssignmentExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: LogicalAndAssignmentExpression) -> FunctionLikeDeclaration;
```
## LogicalAndAssignmentExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: LogicalAndAssignmentExpression) -> Node;
```
## LogicalAndAssignmentExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: LogicalAndAssignmentExpression) -> int;
```
## LogicalAndAssignmentExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: LogicalAndAssignmentExpression) -> *Modifier;
```
## LogicalAndAssignmentExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: LogicalAndAssignmentExpression) -> int;
```
## LogicalAndAssignmentExpression::getLeft

```java
/**
* Get the left operand of this binary expression. An alias of `getLeftOperand`.
*/
```
```rust
pub fn getLeft(self: LogicalAndAssignmentExpression) -> Expression;
```
## LogicalAndAssignmentExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: LogicalAndAssignmentExpression) -> *Node;
```
## LogicalAndAssignmentExpression::getOperator

```java
/**
* Get the operator of this binary expression.
*/
```
```rust
pub fn getOperator(self: LogicalAndAssignmentExpression) -> BinaryOperator;
```
## LogicalAndAssignmentExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: LogicalAndAssignmentExpression) -> Location;
```
## LogicalAndAssignmentExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: LogicalAndAssignmentExpression) -> string;
```
## LogicalAndAssignmentExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: LogicalAndAssignmentExpression) -> int;
```
## LogicalAndAssignmentExpression::getAnOperand

```rust
pub fn getAnOperand(self: LogicalAndAssignmentExpression) -> *Expression;
```
## LogicalAndAssignmentExpression::getRightOperand

```java
/**
* Get the right operand of this binary expression.
*/
```
```rust
pub fn getRightOperand(self: LogicalAndAssignmentExpression) -> Expression;
```
## LogicalAndAssignmentExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: LogicalAndAssignmentExpression, i: int) -> Modifier;
```
## LogicalAndAssignmentExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: LogicalAndAssignmentExpression) -> string;
```
## LogicalAndAssignmentExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: LogicalAndAssignmentExpression) -> File;
```
## LogicalAndAssignmentExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: LogicalAndAssignmentExpression, level: int) -> Node;
```
## LogicalAndAssignmentExpression::getLeftOperand

```java
/**
* Get the left operand of this binary expression.
*/
```
```rust
pub fn getLeftOperand(self: LogicalAndAssignmentExpression) -> Expression;
```
## LogicalAndAssignmentExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: LogicalAndAssignmentExpression, level: int) -> *Node;
```
## LogicalAndAssignmentExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: LogicalAndAssignmentExpression) -> *FunctionLikeDeclaration;
```
## LogicalAndAssignmentExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: LogicalAndAssignmentExpression) -> int;
```
## LogicalAndAssignmentExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: LogicalAndAssignmentExpression, i: int) -> Node;
```
## LogicalAndAssignmentExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: LogicalAndAssignmentExpression) -> TopLevelDO;
```
## LogicalAndAssignmentExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: LogicalAndAssignmentExpression, i: int) -> Decorator;
```
## LogicalAndAssignmentExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: LogicalAndAssignmentExpression) -> *Node;
```
## LogicalAndAssignmentExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: LogicalAndAssignmentExpression) -> *Comment;
```
## LogicalAndAssignmentExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: LogicalAndAssignmentExpression) -> Node;
```
## LogicalAndAssignmentExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: LogicalAndAssignmentExpression) -> *Node;
```
## LogicalAndAssignmentExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: LogicalAndAssignmentExpression) -> *Comment;
```
## LogicalAndAssignmentExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: LogicalAndAssignmentExpression) -> *Comment;
```
## LogicalAndAssignmentExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: LogicalAndAssignmentExpression) -> int;
```
## LogicalAndAssignmentExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: LogicalAndAssignmentExpression) -> *Decorator;
```
## LogicalAndAssignmentExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: LogicalAndAssignmentExpression) -> Symbol;
```
## LogicalAndAssignmentExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *LogicalAndAssignmentExpression;
```
