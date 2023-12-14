# UnsignedRightShiftAssignmentExpression

Primary key: `id: int`

```rust
schema UnsignedRightShiftAssignmentExpression {
  @primary id: int,
}
```
## UnsignedRightShiftAssignmentExpression::getRight

```java
/**
* Get the right operand of this binary expression. An alias of `getRightOperand`
*/
```
```rust
pub fn getRight(self: UnsignedRightShiftAssignmentExpression) -> Expression;
```
## UnsignedRightShiftAssignmentExpression::getIndex

```rust
pub fn getIndex(self: UnsignedRightShiftAssignmentExpression) -> int;
```
## UnsignedRightShiftAssignmentExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: UnsignedRightShiftAssignmentExpression) -> int;
```
## UnsignedRightShiftAssignmentExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: UnsignedRightShiftAssignmentExpression) -> int;
```
## UnsignedRightShiftAssignmentExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: UnsignedRightShiftAssignmentExpression) -> FunctionLikeDeclaration;
```
## UnsignedRightShiftAssignmentExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: UnsignedRightShiftAssignmentExpression) -> Node;
```
## UnsignedRightShiftAssignmentExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: UnsignedRightShiftAssignmentExpression) -> int;
```
## UnsignedRightShiftAssignmentExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: UnsignedRightShiftAssignmentExpression) -> *Modifier;
```
## UnsignedRightShiftAssignmentExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: UnsignedRightShiftAssignmentExpression) -> int;
```
## UnsignedRightShiftAssignmentExpression::getLeft

```java
/**
* Get the left operand of this binary expression. An alias of `getLeftOperand`.
*/
```
```rust
pub fn getLeft(self: UnsignedRightShiftAssignmentExpression) -> Expression;
```
## UnsignedRightShiftAssignmentExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: UnsignedRightShiftAssignmentExpression) -> *Node;
```
## UnsignedRightShiftAssignmentExpression::getOperator

```java
/**
* Get the operator of this binary expression.
*/
```
```rust
pub fn getOperator(self: UnsignedRightShiftAssignmentExpression) -> BinaryOperator;
```
## UnsignedRightShiftAssignmentExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: UnsignedRightShiftAssignmentExpression) -> Location;
```
## UnsignedRightShiftAssignmentExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: UnsignedRightShiftAssignmentExpression) -> string;
```
## UnsignedRightShiftAssignmentExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: UnsignedRightShiftAssignmentExpression) -> int;
```
## UnsignedRightShiftAssignmentExpression::getAnOperand

```rust
pub fn getAnOperand(self: UnsignedRightShiftAssignmentExpression) -> *Expression;
```
## UnsignedRightShiftAssignmentExpression::getRightOperand

```java
/**
* Get the right operand of this binary expression.
*/
```
```rust
pub fn getRightOperand(self: UnsignedRightShiftAssignmentExpression) -> Expression;
```
## UnsignedRightShiftAssignmentExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: UnsignedRightShiftAssignmentExpression, i: int) -> Modifier;
```
## UnsignedRightShiftAssignmentExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: UnsignedRightShiftAssignmentExpression) -> string;
```
## UnsignedRightShiftAssignmentExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: UnsignedRightShiftAssignmentExpression) -> File;
```
## UnsignedRightShiftAssignmentExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: UnsignedRightShiftAssignmentExpression, level: int) -> Node;
```
## UnsignedRightShiftAssignmentExpression::getLeftOperand

```java
/**
* Get the left operand of this binary expression.
*/
```
```rust
pub fn getLeftOperand(self: UnsignedRightShiftAssignmentExpression) -> Expression;
```
## UnsignedRightShiftAssignmentExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: UnsignedRightShiftAssignmentExpression, level: int) -> *Node;
```
## UnsignedRightShiftAssignmentExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: UnsignedRightShiftAssignmentExpression) -> *FunctionLikeDeclaration;
```
## UnsignedRightShiftAssignmentExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: UnsignedRightShiftAssignmentExpression) -> int;
```
## UnsignedRightShiftAssignmentExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: UnsignedRightShiftAssignmentExpression, i: int) -> Node;
```
## UnsignedRightShiftAssignmentExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: UnsignedRightShiftAssignmentExpression) -> TopLevelDO;
```
## UnsignedRightShiftAssignmentExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: UnsignedRightShiftAssignmentExpression, i: int) -> Decorator;
```
## UnsignedRightShiftAssignmentExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: UnsignedRightShiftAssignmentExpression) -> *Node;
```
## UnsignedRightShiftAssignmentExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: UnsignedRightShiftAssignmentExpression) -> *Comment;
```
## UnsignedRightShiftAssignmentExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: UnsignedRightShiftAssignmentExpression) -> Node;
```
## UnsignedRightShiftAssignmentExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: UnsignedRightShiftAssignmentExpression) -> *Node;
```
## UnsignedRightShiftAssignmentExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: UnsignedRightShiftAssignmentExpression) -> *Comment;
```
## UnsignedRightShiftAssignmentExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: UnsignedRightShiftAssignmentExpression) -> *Comment;
```
## UnsignedRightShiftAssignmentExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: UnsignedRightShiftAssignmentExpression) -> int;
```
## UnsignedRightShiftAssignmentExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: UnsignedRightShiftAssignmentExpression) -> *Decorator;
```
## UnsignedRightShiftAssignmentExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: UnsignedRightShiftAssignmentExpression) -> Symbol;
```
## UnsignedRightShiftAssignmentExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *UnsignedRightShiftAssignmentExpression;
```
