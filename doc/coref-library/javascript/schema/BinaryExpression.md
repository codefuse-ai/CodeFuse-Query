# BinaryExpression

Inherit from [Expression](./Expression.md)

Primary key: `id: int`

```rust
schema BinaryExpression extends Expression {
  @primary id: int,
}
```
## BinaryExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: BinaryExpression) -> Symbol;
```
## BinaryExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: BinaryExpression) -> *Decorator;
```
## BinaryExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: BinaryExpression) -> *Comment;
```
## BinaryExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: BinaryExpression) -> *Node;
```
## BinaryExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: BinaryExpression) -> *Node;
```
## BinaryExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: BinaryExpression) -> Node;
```
## BinaryExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: BinaryExpression) -> *Comment;
```
## BinaryExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: BinaryExpression) -> *Comment;
```
## BinaryExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: BinaryExpression) -> int;
```
## BinaryExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: BinaryExpression) -> TopLevelDO;
```
## BinaryExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: BinaryExpression, i: int) -> Decorator;
```
## BinaryExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: BinaryExpression, i: int) -> Node;
```
## BinaryExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: BinaryExpression) -> int;
```
## BinaryExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: BinaryExpression) -> *Modifier;
```
## BinaryExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: BinaryExpression) -> int;
```
## BinaryExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: BinaryExpression) -> int;
```
## BinaryExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: BinaryExpression, level: int) -> *Node;
```
## BinaryExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: BinaryExpression) -> *FunctionLikeDeclaration;
```
## BinaryExpression::getLeftOperand

```java
/**
* Get the left operand of this binary expression.
*/
```
```rust
pub fn getLeftOperand(self: BinaryExpression) -> Expression;
```
## BinaryExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: BinaryExpression, level: int) -> Node;
```
## BinaryExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: BinaryExpression) -> File;
```
## BinaryExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: BinaryExpression) -> int;
```
## BinaryExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: BinaryExpression) -> string;
```
## BinaryExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: BinaryExpression) -> string;
```
## BinaryExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: BinaryExpression, i: int) -> Modifier;
```
## BinaryExpression::getRightOperand

```java
/**
* Get the right operand of this binary expression.
*/
```
```rust
pub fn getRightOperand(self: BinaryExpression) -> Expression;
```
## BinaryExpression::getAnOperand

```rust
pub fn getAnOperand(self: BinaryExpression) -> *Expression;
```
## BinaryExpression::getIndex

```rust
pub fn getIndex(self: BinaryExpression) -> int;
```
## BinaryExpression::getRight

```java
/**
* Get the right operand of this binary expression. An alias of `getRightOperand`
*/
```
```rust
pub fn getRight(self: BinaryExpression) -> Expression;
```
## BinaryExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: BinaryExpression) -> Location;
```
## BinaryExpression::getOperator

```java
/**
* Get the operator of this binary expression.
*/
```
```rust
pub fn getOperator(self: BinaryExpression) -> BinaryOperator;
```
## BinaryExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: BinaryExpression) -> *Node;
```
## BinaryExpression::getLeft

```java
/**
* Get the left operand of this binary expression. An alias of `getLeftOperand`.
*/
```
```rust
pub fn getLeft(self: BinaryExpression) -> Expression;
```
## BinaryExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: BinaryExpression) -> FunctionLikeDeclaration;
```
## BinaryExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: BinaryExpression) -> Node;
```
## BinaryExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: BinaryExpression) -> int;
```
## BinaryExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: BinaryExpression) -> int;
```
## BinaryExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *BinaryExpression;
```
