# DivisionAssignmentExpression

Inherit from [CompoundAssignmentExpression](./CompoundAssignmentExpression.md)

Primary key: `id: int`

```rust
schema DivisionAssignmentExpression extends CompoundAssignmentExpression {
  @primary id: int,
}
```
## DivisionAssignmentExpression::getRight

```java
/**
* Get the right operand of this binary expression. An alias of `getRightOperand`
*/
```
```rust
pub fn getRight(self: DivisionAssignmentExpression) -> Expression;
```
## DivisionAssignmentExpression::getIndex

```rust
pub fn getIndex(self: DivisionAssignmentExpression) -> int;
```
## DivisionAssignmentExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: DivisionAssignmentExpression) -> int;
```
## DivisionAssignmentExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: DivisionAssignmentExpression) -> int;
```
## DivisionAssignmentExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: DivisionAssignmentExpression) -> FunctionLikeDeclaration;
```
## DivisionAssignmentExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: DivisionAssignmentExpression) -> Node;
```
## DivisionAssignmentExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: DivisionAssignmentExpression) -> int;
```
## DivisionAssignmentExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: DivisionAssignmentExpression) -> *Modifier;
```
## DivisionAssignmentExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: DivisionAssignmentExpression) -> int;
```
## DivisionAssignmentExpression::getLeft

```java
/**
* Get the left operand of this binary expression. An alias of `getLeftOperand`.
*/
```
```rust
pub fn getLeft(self: DivisionAssignmentExpression) -> Expression;
```
## DivisionAssignmentExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: DivisionAssignmentExpression) -> *Node;
```
## DivisionAssignmentExpression::getOperator

```java
/**
* Get the operator of this binary expression.
*/
```
```rust
pub fn getOperator(self: DivisionAssignmentExpression) -> BinaryOperator;
```
## DivisionAssignmentExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: DivisionAssignmentExpression) -> Location;
```
## DivisionAssignmentExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: DivisionAssignmentExpression) -> string;
```
## DivisionAssignmentExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: DivisionAssignmentExpression) -> int;
```
## DivisionAssignmentExpression::getAnOperand

```rust
pub fn getAnOperand(self: DivisionAssignmentExpression) -> *Expression;
```
## DivisionAssignmentExpression::getRightOperand

```java
/**
* Get the right operand of this binary expression.
*/
```
```rust
pub fn getRightOperand(self: DivisionAssignmentExpression) -> Expression;
```
## DivisionAssignmentExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: DivisionAssignmentExpression, i: int) -> Modifier;
```
## DivisionAssignmentExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: DivisionAssignmentExpression) -> string;
```
## DivisionAssignmentExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: DivisionAssignmentExpression) -> File;
```
## DivisionAssignmentExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: DivisionAssignmentExpression, level: int) -> Node;
```
## DivisionAssignmentExpression::getLeftOperand

```java
/**
* Get the left operand of this binary expression.
*/
```
```rust
pub fn getLeftOperand(self: DivisionAssignmentExpression) -> Expression;
```
## DivisionAssignmentExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: DivisionAssignmentExpression, level: int) -> *Node;
```
## DivisionAssignmentExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: DivisionAssignmentExpression) -> *FunctionLikeDeclaration;
```
## DivisionAssignmentExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: DivisionAssignmentExpression) -> int;
```
## DivisionAssignmentExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: DivisionAssignmentExpression, i: int) -> Node;
```
## DivisionAssignmentExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: DivisionAssignmentExpression) -> TopLevelDO;
```
## DivisionAssignmentExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: DivisionAssignmentExpression, i: int) -> Decorator;
```
## DivisionAssignmentExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: DivisionAssignmentExpression) -> *Node;
```
## DivisionAssignmentExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: DivisionAssignmentExpression) -> *Comment;
```
## DivisionAssignmentExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: DivisionAssignmentExpression) -> Node;
```
## DivisionAssignmentExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: DivisionAssignmentExpression) -> *Node;
```
## DivisionAssignmentExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: DivisionAssignmentExpression) -> *Comment;
```
## DivisionAssignmentExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: DivisionAssignmentExpression) -> *Comment;
```
## DivisionAssignmentExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: DivisionAssignmentExpression) -> int;
```
## DivisionAssignmentExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: DivisionAssignmentExpression) -> *Decorator;
```
## DivisionAssignmentExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: DivisionAssignmentExpression) -> Symbol;
```
## DivisionAssignmentExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *DivisionAssignmentExpression;
```
