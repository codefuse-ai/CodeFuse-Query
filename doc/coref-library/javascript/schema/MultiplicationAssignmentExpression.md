# MultiplicationAssignmentExpression

Inherit from [CompoundAssignmentExpression](./CompoundAssignmentExpression.md)

Primary key: `id: int`

```rust
schema MultiplicationAssignmentExpression extends CompoundAssignmentExpression {
  @primary id: int
}
```
## MultiplicationAssignmentExpression::getRight

```java
/**
* Get the right operand of this binary expression. An alias of `getRightOperand`
*/
```
```rust
pub fn getRight(self: MultiplicationAssignmentExpression) -> Expression;
```
## MultiplicationAssignmentExpression::getIndex

```rust
pub fn getIndex(self: MultiplicationAssignmentExpression) -> int;
```
## MultiplicationAssignmentExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: MultiplicationAssignmentExpression) -> int;
```
## MultiplicationAssignmentExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: MultiplicationAssignmentExpression) -> int;
```
## MultiplicationAssignmentExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: MultiplicationAssignmentExpression) -> FunctionLikeDeclaration;
```
## MultiplicationAssignmentExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: MultiplicationAssignmentExpression) -> Node;
```
## MultiplicationAssignmentExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: MultiplicationAssignmentExpression) -> int;
```
## MultiplicationAssignmentExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: MultiplicationAssignmentExpression) -> *Modifier;
```
## MultiplicationAssignmentExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: MultiplicationAssignmentExpression) -> int;
```
## MultiplicationAssignmentExpression::getLeft

```java
/**
* Get the left operand of this binary expression. An alias of `getLeftOperand`.
*/
```
```rust
pub fn getLeft(self: MultiplicationAssignmentExpression) -> Expression;
```
## MultiplicationAssignmentExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: MultiplicationAssignmentExpression) -> *Node;
```
## MultiplicationAssignmentExpression::getOperator

```java
/**
* Get the operator of this binary expression.
*/
```
```rust
pub fn getOperator(self: MultiplicationAssignmentExpression) -> BinaryOperator;
```
## MultiplicationAssignmentExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: MultiplicationAssignmentExpression) -> Location;
```
## MultiplicationAssignmentExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: MultiplicationAssignmentExpression) -> string;
```
## MultiplicationAssignmentExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: MultiplicationAssignmentExpression) -> int;
```
## MultiplicationAssignmentExpression::getAnOperand

```rust
pub fn getAnOperand(self: MultiplicationAssignmentExpression) -> *Expression;
```
## MultiplicationAssignmentExpression::getRightOperand

```java
/**
* Get the right operand of this binary expression.
*/
```
```rust
pub fn getRightOperand(self: MultiplicationAssignmentExpression) -> Expression;
```
## MultiplicationAssignmentExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: MultiplicationAssignmentExpression, i: int) -> Modifier;
```
## MultiplicationAssignmentExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: MultiplicationAssignmentExpression) -> string;
```
## MultiplicationAssignmentExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: MultiplicationAssignmentExpression) -> File;
```
## MultiplicationAssignmentExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: MultiplicationAssignmentExpression, level: int) -> Node;
```
## MultiplicationAssignmentExpression::getLeftOperand

```java
/**
* Get the left operand of this binary expression.
*/
```
```rust
pub fn getLeftOperand(self: MultiplicationAssignmentExpression) -> Expression;
```
## MultiplicationAssignmentExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: MultiplicationAssignmentExpression, level: int) -> *Node;
```
## MultiplicationAssignmentExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: MultiplicationAssignmentExpression) -> *FunctionLikeDeclaration;
```
## MultiplicationAssignmentExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: MultiplicationAssignmentExpression) -> int;
```
## MultiplicationAssignmentExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: MultiplicationAssignmentExpression, i: int) -> Node;
```
## MultiplicationAssignmentExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: MultiplicationAssignmentExpression) -> TopLevelDO;
```
## MultiplicationAssignmentExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: MultiplicationAssignmentExpression, i: int) -> Decorator;
```
## MultiplicationAssignmentExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: MultiplicationAssignmentExpression) -> *Node;
```
## MultiplicationAssignmentExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: MultiplicationAssignmentExpression) -> *Comment;
```
## MultiplicationAssignmentExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: MultiplicationAssignmentExpression) -> Node;
```
## MultiplicationAssignmentExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: MultiplicationAssignmentExpression) -> *Node;
```
## MultiplicationAssignmentExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: MultiplicationAssignmentExpression) -> *Comment;
```
## MultiplicationAssignmentExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: MultiplicationAssignmentExpression) -> *Comment;
```
## MultiplicationAssignmentExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: MultiplicationAssignmentExpression) -> int;
```
## MultiplicationAssignmentExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: MultiplicationAssignmentExpression) -> *Decorator;
```
## MultiplicationAssignmentExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: MultiplicationAssignmentExpression) -> Symbol;
```
## MultiplicationAssignmentExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *MultiplicationAssignmentExpression;
```
