# StrictEqualityTestExpression

Inherit from [EqualityTestExpression](./EqualityTestExpression.md)

Primary key: `id: int`

```rust
schema StrictEqualityTestExpression extends EqualityTestExpression {
  @primary id: int
}
```
## StrictEqualityTestExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: StrictEqualityTestExpression) -> Symbol;
```
## StrictEqualityTestExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: StrictEqualityTestExpression) -> *Decorator;
```
## StrictEqualityTestExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: StrictEqualityTestExpression) -> *Comment;
```
## StrictEqualityTestExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: StrictEqualityTestExpression) -> *Node;
```
## StrictEqualityTestExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: StrictEqualityTestExpression) -> int;
```
## StrictEqualityTestExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: StrictEqualityTestExpression) -> *Comment;
```
## StrictEqualityTestExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: StrictEqualityTestExpression) -> *Comment;
```
## StrictEqualityTestExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: StrictEqualityTestExpression) -> Node;
```
## StrictEqualityTestExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: StrictEqualityTestExpression) -> *Node;
```
## StrictEqualityTestExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: StrictEqualityTestExpression, i: int) -> Decorator;
```
## StrictEqualityTestExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: StrictEqualityTestExpression) -> TopLevelDO;
```
## StrictEqualityTestExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: StrictEqualityTestExpression, i: int) -> Node;
```
## StrictEqualityTestExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: StrictEqualityTestExpression) -> int;
```
## StrictEqualityTestExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: StrictEqualityTestExpression, level: int) -> *Node;
```
## StrictEqualityTestExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: StrictEqualityTestExpression) -> *FunctionLikeDeclaration;
```
## StrictEqualityTestExpression::getLeftOperand

```java
/**
* Get the left operand of this binary expression.
*/
```
```rust
pub fn getLeftOperand(self: StrictEqualityTestExpression) -> Expression;
```
## StrictEqualityTestExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: StrictEqualityTestExpression, level: int) -> Node;
```
## StrictEqualityTestExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: StrictEqualityTestExpression) -> File;
```
## StrictEqualityTestExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: StrictEqualityTestExpression) -> string;
```
## StrictEqualityTestExpression::getAnOperand

```rust
pub fn getAnOperand(self: StrictEqualityTestExpression) -> *Expression;
```
## StrictEqualityTestExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: StrictEqualityTestExpression, i: int) -> Modifier;
```
## StrictEqualityTestExpression::getRightOperand

```java
/**
* Get the right operand of this binary expression.
*/
```
```rust
pub fn getRightOperand(self: StrictEqualityTestExpression) -> Expression;
```
## StrictEqualityTestExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: StrictEqualityTestExpression) -> int;
```
## StrictEqualityTestExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: StrictEqualityTestExpression) -> string;
```
## StrictEqualityTestExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *StrictEqualityTestExpression;
```
## StrictEqualityTestExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: StrictEqualityTestExpression) -> Location;
```
## StrictEqualityTestExpression::getOperator

```java
/**
* Get the operator of this binary expression.
*/
```
```rust
pub fn getOperator(self: StrictEqualityTestExpression) -> BinaryOperator;
```
## StrictEqualityTestExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: StrictEqualityTestExpression) -> *Node;
```
## StrictEqualityTestExpression::getLeft

```java
/**
* Get the left operand of this binary expression. An alias of `getLeftOperand`.
*/
```
```rust
pub fn getLeft(self: StrictEqualityTestExpression) -> Expression;
```
## StrictEqualityTestExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: StrictEqualityTestExpression) -> int;
```
## StrictEqualityTestExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: StrictEqualityTestExpression) -> *Modifier;
```
## StrictEqualityTestExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: StrictEqualityTestExpression) -> int;
```
## StrictEqualityTestExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: StrictEqualityTestExpression) -> Node;
```
## StrictEqualityTestExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: StrictEqualityTestExpression) -> FunctionLikeDeclaration;
```
## StrictEqualityTestExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: StrictEqualityTestExpression) -> int;
```
## StrictEqualityTestExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: StrictEqualityTestExpression) -> int;
```
## StrictEqualityTestExpression::getIndex

```rust
pub fn getIndex(self: StrictEqualityTestExpression) -> int;
```
## StrictEqualityTestExpression::getRight

```java
/**
* Get the right operand of this binary expression. An alias of `getRightOperand`
*/
```
```rust
pub fn getRight(self: StrictEqualityTestExpression) -> Expression;
```
