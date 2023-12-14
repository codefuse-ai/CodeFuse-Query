# BinaryBitwiseExpression

Inherit from [BinaryExpression](./BinaryExpression.md)

Primary key: `id: int`

```rust
schema BinaryBitwiseExpression extends BinaryExpression {
  @primary id: int,
}
```
## BinaryBitwiseExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: BinaryBitwiseExpression) -> int;
```
## BinaryBitwiseExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: BinaryBitwiseExpression) -> int;
```
## BinaryBitwiseExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: BinaryBitwiseExpression) -> Node;
```
## BinaryBitwiseExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: BinaryBitwiseExpression) -> FunctionLikeDeclaration;
```
## BinaryBitwiseExpression::getLeft

```java
/**
* Get the left operand of this binary expression. An alias of `getLeftOperand`.
*/
```
```rust
pub fn getLeft(self: BinaryBitwiseExpression) -> Expression;
```
## BinaryBitwiseExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: BinaryBitwiseExpression) -> *Node;
```
## BinaryBitwiseExpression::getOperator

```java
/**
* Get the operator of this binary expression.
*/
```
```rust
pub fn getOperator(self: BinaryBitwiseExpression) -> BinaryOperator;
```
## BinaryBitwiseExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: BinaryBitwiseExpression) -> Location;
```
## BinaryBitwiseExpression::getRight

```java
/**
* Get the right operand of this binary expression. An alias of `getRightOperand`
*/
```
```rust
pub fn getRight(self: BinaryBitwiseExpression) -> Expression;
```
## BinaryBitwiseExpression::getIndex

```rust
pub fn getIndex(self: BinaryBitwiseExpression) -> int;
```
## BinaryBitwiseExpression::getAnOperand

```rust
pub fn getAnOperand(self: BinaryBitwiseExpression) -> *Expression;
```
## BinaryBitwiseExpression::getRightOperand

```java
/**
* Get the right operand of this binary expression.
*/
```
```rust
pub fn getRightOperand(self: BinaryBitwiseExpression) -> Expression;
```
## BinaryBitwiseExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: BinaryBitwiseExpression, i: int) -> Modifier;
```
## BinaryBitwiseExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: BinaryBitwiseExpression) -> string;
```
## BinaryBitwiseExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: BinaryBitwiseExpression) -> string;
```
## BinaryBitwiseExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: BinaryBitwiseExpression) -> int;
```
## BinaryBitwiseExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: BinaryBitwiseExpression) -> File;
```
## BinaryBitwiseExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: BinaryBitwiseExpression, level: int) -> Node;
```
## BinaryBitwiseExpression::getLeftOperand

```java
/**
* Get the left operand of this binary expression.
*/
```
```rust
pub fn getLeftOperand(self: BinaryBitwiseExpression) -> Expression;
```
## BinaryBitwiseExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: BinaryBitwiseExpression) -> *FunctionLikeDeclaration;
```
## BinaryBitwiseExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: BinaryBitwiseExpression, level: int) -> *Node;
```
## BinaryBitwiseExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: BinaryBitwiseExpression) -> int;
```
## BinaryBitwiseExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: BinaryBitwiseExpression) -> *Modifier;
```
## BinaryBitwiseExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: BinaryBitwiseExpression) -> int;
```
## BinaryBitwiseExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: BinaryBitwiseExpression) -> int;
```
## BinaryBitwiseExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: BinaryBitwiseExpression, i: int) -> Node;
```
## BinaryBitwiseExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: BinaryBitwiseExpression) -> TopLevelDO;
```
## BinaryBitwiseExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: BinaryBitwiseExpression, i: int) -> Decorator;
```
## BinaryBitwiseExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: BinaryBitwiseExpression) -> *Node;
```
## BinaryBitwiseExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: BinaryBitwiseExpression) -> Node;
```
## BinaryBitwiseExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: BinaryBitwiseExpression) -> *Comment;
```
## BinaryBitwiseExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: BinaryBitwiseExpression) -> *Comment;
```
## BinaryBitwiseExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: BinaryBitwiseExpression) -> int;
```
## BinaryBitwiseExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: BinaryBitwiseExpression) -> *Node;
```
## BinaryBitwiseExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: BinaryBitwiseExpression) -> *Comment;
```
## BinaryBitwiseExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: BinaryBitwiseExpression) -> *Decorator;
```
## BinaryBitwiseExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: BinaryBitwiseExpression) -> Symbol;
```
## BinaryBitwiseExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *BinaryBitwiseExpression;
```
