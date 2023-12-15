# RightShiftAssignmentExpression

Inherit from [CompoundAssignmentExpression](./CompoundAssignmentExpression.md)

Primary key: `id: int`

```rust
schema RightShiftAssignmentExpression extends CompoundAssignmentExpression {
  @primary id: int
}
```
## RightShiftAssignmentExpression::getRight

```java
/**
* Get the right operand of this binary expression. An alias of `getRightOperand`
*/
```
```rust
pub fn getRight(self: RightShiftAssignmentExpression) -> Expression;
```
## RightShiftAssignmentExpression::getIndex

```rust
pub fn getIndex(self: RightShiftAssignmentExpression) -> int;
```
## RightShiftAssignmentExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: RightShiftAssignmentExpression) -> int;
```
## RightShiftAssignmentExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: RightShiftAssignmentExpression) -> int;
```
## RightShiftAssignmentExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: RightShiftAssignmentExpression) -> FunctionLikeDeclaration;
```
## RightShiftAssignmentExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: RightShiftAssignmentExpression) -> Node;
```
## RightShiftAssignmentExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: RightShiftAssignmentExpression) -> int;
```
## RightShiftAssignmentExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: RightShiftAssignmentExpression) -> *Modifier;
```
## RightShiftAssignmentExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: RightShiftAssignmentExpression) -> int;
```
## RightShiftAssignmentExpression::getLeft

```java
/**
* Get the left operand of this binary expression. An alias of `getLeftOperand`.
*/
```
```rust
pub fn getLeft(self: RightShiftAssignmentExpression) -> Expression;
```
## RightShiftAssignmentExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: RightShiftAssignmentExpression) -> *Node;
```
## RightShiftAssignmentExpression::getOperator

```java
/**
* Get the operator of this binary expression.
*/
```
```rust
pub fn getOperator(self: RightShiftAssignmentExpression) -> BinaryOperator;
```
## RightShiftAssignmentExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: RightShiftAssignmentExpression) -> Location;
```
## RightShiftAssignmentExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: RightShiftAssignmentExpression) -> string;
```
## RightShiftAssignmentExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: RightShiftAssignmentExpression) -> int;
```
## RightShiftAssignmentExpression::getAnOperand

```rust
pub fn getAnOperand(self: RightShiftAssignmentExpression) -> *Expression;
```
## RightShiftAssignmentExpression::getRightOperand

```java
/**
* Get the right operand of this binary expression.
*/
```
```rust
pub fn getRightOperand(self: RightShiftAssignmentExpression) -> Expression;
```
## RightShiftAssignmentExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: RightShiftAssignmentExpression, i: int) -> Modifier;
```
## RightShiftAssignmentExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: RightShiftAssignmentExpression) -> string;
```
## RightShiftAssignmentExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: RightShiftAssignmentExpression) -> File;
```
## RightShiftAssignmentExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: RightShiftAssignmentExpression, level: int) -> Node;
```
## RightShiftAssignmentExpression::getLeftOperand

```java
/**
* Get the left operand of this binary expression.
*/
```
```rust
pub fn getLeftOperand(self: RightShiftAssignmentExpression) -> Expression;
```
## RightShiftAssignmentExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: RightShiftAssignmentExpression, level: int) -> *Node;
```
## RightShiftAssignmentExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: RightShiftAssignmentExpression) -> *FunctionLikeDeclaration;
```
## RightShiftAssignmentExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: RightShiftAssignmentExpression) -> int;
```
## RightShiftAssignmentExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: RightShiftAssignmentExpression, i: int) -> Node;
```
## RightShiftAssignmentExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: RightShiftAssignmentExpression) -> TopLevelDO;
```
## RightShiftAssignmentExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: RightShiftAssignmentExpression, i: int) -> Decorator;
```
## RightShiftAssignmentExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: RightShiftAssignmentExpression) -> *Node;
```
## RightShiftAssignmentExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: RightShiftAssignmentExpression) -> *Comment;
```
## RightShiftAssignmentExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: RightShiftAssignmentExpression) -> Node;
```
## RightShiftAssignmentExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: RightShiftAssignmentExpression) -> *Node;
```
## RightShiftAssignmentExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: RightShiftAssignmentExpression) -> *Comment;
```
## RightShiftAssignmentExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: RightShiftAssignmentExpression) -> *Comment;
```
## RightShiftAssignmentExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: RightShiftAssignmentExpression) -> int;
```
## RightShiftAssignmentExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: RightShiftAssignmentExpression) -> *Decorator;
```
## RightShiftAssignmentExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: RightShiftAssignmentExpression) -> Symbol;
```
## RightShiftAssignmentExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *RightShiftAssignmentExpression;
```
