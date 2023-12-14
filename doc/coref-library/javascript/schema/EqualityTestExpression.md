# EqualityTestExpression

Inherit from [BinaryExpression](./BinaryExpression.md)

Primary key: `id: int`

```rust
schema EqualityTestExpression extends BinaryExpression {
  @primary id: int,
}
```
## EqualityTestExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: EqualityTestExpression) -> int;
```
## EqualityTestExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: EqualityTestExpression) -> int;
```
## EqualityTestExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: EqualityTestExpression) -> Node;
```
## EqualityTestExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: EqualityTestExpression) -> FunctionLikeDeclaration;
```
## EqualityTestExpression::getLeft

```java
/**
* Get the left operand of this binary expression. An alias of `getLeftOperand`.
*/
```
```rust
pub fn getLeft(self: EqualityTestExpression) -> Expression;
```
## EqualityTestExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: EqualityTestExpression) -> *Node;
```
## EqualityTestExpression::getOperator

```java
/**
* Get the operator of this binary expression.
*/
```
```rust
pub fn getOperator(self: EqualityTestExpression) -> BinaryOperator;
```
## EqualityTestExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: EqualityTestExpression) -> Location;
```
## EqualityTestExpression::getRight

```java
/**
* Get the right operand of this binary expression. An alias of `getRightOperand`
*/
```
```rust
pub fn getRight(self: EqualityTestExpression) -> Expression;
```
## EqualityTestExpression::getIndex

```rust
pub fn getIndex(self: EqualityTestExpression) -> int;
```
## EqualityTestExpression::getAnOperand

```rust
pub fn getAnOperand(self: EqualityTestExpression) -> *Expression;
```
## EqualityTestExpression::getRightOperand

```java
/**
* Get the right operand of this binary expression.
*/
```
```rust
pub fn getRightOperand(self: EqualityTestExpression) -> Expression;
```
## EqualityTestExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: EqualityTestExpression, i: int) -> Modifier;
```
## EqualityTestExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: EqualityTestExpression) -> string;
```
## EqualityTestExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: EqualityTestExpression) -> string;
```
## EqualityTestExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: EqualityTestExpression) -> int;
```
## EqualityTestExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: EqualityTestExpression) -> File;
```
## EqualityTestExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: EqualityTestExpression, level: int) -> Node;
```
## EqualityTestExpression::getLeftOperand

```java
/**
* Get the left operand of this binary expression.
*/
```
```rust
pub fn getLeftOperand(self: EqualityTestExpression) -> Expression;
```
## EqualityTestExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: EqualityTestExpression) -> *FunctionLikeDeclaration;
```
## EqualityTestExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: EqualityTestExpression, level: int) -> *Node;
```
## EqualityTestExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: EqualityTestExpression) -> int;
```
## EqualityTestExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: EqualityTestExpression) -> *Modifier;
```
## EqualityTestExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: EqualityTestExpression) -> int;
```
## EqualityTestExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: EqualityTestExpression) -> int;
```
## EqualityTestExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: EqualityTestExpression, i: int) -> Node;
```
## EqualityTestExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: EqualityTestExpression) -> TopLevelDO;
```
## EqualityTestExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: EqualityTestExpression, i: int) -> Decorator;
```
## EqualityTestExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: EqualityTestExpression) -> *Node;
```
## EqualityTestExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: EqualityTestExpression) -> Node;
```
## EqualityTestExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: EqualityTestExpression) -> *Comment;
```
## EqualityTestExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: EqualityTestExpression) -> *Comment;
```
## EqualityTestExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: EqualityTestExpression) -> int;
```
## EqualityTestExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: EqualityTestExpression) -> *Node;
```
## EqualityTestExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: EqualityTestExpression) -> *Comment;
```
## EqualityTestExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: EqualityTestExpression) -> *Decorator;
```
## EqualityTestExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: EqualityTestExpression) -> Symbol;
```
## EqualityTestExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *EqualityTestExpression;
```
