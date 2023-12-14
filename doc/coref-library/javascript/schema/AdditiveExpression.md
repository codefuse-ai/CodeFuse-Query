# AdditiveExpression

Inherit from [BinaryExpression](./BinaryExpression.md)

Primary key: `id: int`

```rust
schema AdditiveExpression extends BinaryExpression {
  @primary id: int,
}
```
## AdditiveExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: AdditiveExpression) -> int;
```
## AdditiveExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: AdditiveExpression) -> int;
```
## AdditiveExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: AdditiveExpression) -> Node;
```
## AdditiveExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: AdditiveExpression) -> FunctionLikeDeclaration;
```
## AdditiveExpression::getLeft

```java
/**
* Get the left operand of this binary expression. An alias of `getLeftOperand`.
*/
```
```rust
pub fn getLeft(self: AdditiveExpression) -> Expression;
```
## AdditiveExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: AdditiveExpression) -> *Node;
```
## AdditiveExpression::getOperator

```java
/**
* Get the operator of this binary expression.
*/
```
```rust
pub fn getOperator(self: AdditiveExpression) -> BinaryOperator;
```
## AdditiveExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: AdditiveExpression) -> Location;
```
## AdditiveExpression::getRight

```java
/**
* Get the right operand of this binary expression. An alias of `getRightOperand`
*/
```
```rust
pub fn getRight(self: AdditiveExpression) -> Expression;
```
## AdditiveExpression::getIndex

```rust
pub fn getIndex(self: AdditiveExpression) -> int;
```
## AdditiveExpression::getAnOperand

```rust
pub fn getAnOperand(self: AdditiveExpression) -> *Expression;
```
## AdditiveExpression::getRightOperand

```java
/**
* Get the right operand of this binary expression.
*/
```
```rust
pub fn getRightOperand(self: AdditiveExpression) -> Expression;
```
## AdditiveExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: AdditiveExpression, i: int) -> Modifier;
```
## AdditiveExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: AdditiveExpression) -> string;
```
## AdditiveExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: AdditiveExpression) -> string;
```
## AdditiveExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: AdditiveExpression) -> int;
```
## AdditiveExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: AdditiveExpression) -> File;
```
## AdditiveExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: AdditiveExpression, level: int) -> Node;
```
## AdditiveExpression::getLeftOperand

```java
/**
* Get the left operand of this binary expression.
*/
```
```rust
pub fn getLeftOperand(self: AdditiveExpression) -> Expression;
```
## AdditiveExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: AdditiveExpression) -> *FunctionLikeDeclaration;
```
## AdditiveExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: AdditiveExpression, level: int) -> *Node;
```
## AdditiveExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: AdditiveExpression) -> int;
```
## AdditiveExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: AdditiveExpression) -> *Modifier;
```
## AdditiveExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: AdditiveExpression) -> int;
```
## AdditiveExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: AdditiveExpression) -> int;
```
## AdditiveExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: AdditiveExpression, i: int) -> Node;
```
## AdditiveExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: AdditiveExpression) -> TopLevelDO;
```
## AdditiveExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: AdditiveExpression, i: int) -> Decorator;
```
## AdditiveExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: AdditiveExpression) -> *Node;
```
## AdditiveExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: AdditiveExpression) -> Node;
```
## AdditiveExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: AdditiveExpression) -> *Comment;
```
## AdditiveExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: AdditiveExpression) -> *Comment;
```
## AdditiveExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: AdditiveExpression) -> int;
```
## AdditiveExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: AdditiveExpression) -> *Node;
```
## AdditiveExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: AdditiveExpression) -> *Comment;
```
## AdditiveExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: AdditiveExpression) -> *Decorator;
```
## AdditiveExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: AdditiveExpression) -> Symbol;
```
## AdditiveExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *AdditiveExpression;
```
