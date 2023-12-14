# DivisionExpression

Inherit from [MultiplicativeExpression](./MultiplicativeExpression.md)

Primary key: `id: int`

```rust
schema DivisionExpression extends MultiplicativeExpression {
  @primary id: int,
}
```
## DivisionExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: DivisionExpression) -> Symbol;
```
## DivisionExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: DivisionExpression) -> *Decorator;
```
## DivisionExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: DivisionExpression) -> *Comment;
```
## DivisionExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: DivisionExpression) -> *Node;
```
## DivisionExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: DivisionExpression) -> int;
```
## DivisionExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: DivisionExpression) -> *Comment;
```
## DivisionExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: DivisionExpression) -> *Comment;
```
## DivisionExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: DivisionExpression) -> Node;
```
## DivisionExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: DivisionExpression) -> *Node;
```
## DivisionExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: DivisionExpression, i: int) -> Decorator;
```
## DivisionExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: DivisionExpression) -> TopLevelDO;
```
## DivisionExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: DivisionExpression, i: int) -> Node;
```
## DivisionExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: DivisionExpression) -> int;
```
## DivisionExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: DivisionExpression, level: int) -> *Node;
```
## DivisionExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: DivisionExpression) -> *FunctionLikeDeclaration;
```
## DivisionExpression::getLeftOperand

```java
/**
* Get the left operand of this binary expression.
*/
```
```rust
pub fn getLeftOperand(self: DivisionExpression) -> Expression;
```
## DivisionExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: DivisionExpression, level: int) -> Node;
```
## DivisionExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: DivisionExpression) -> File;
```
## DivisionExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: DivisionExpression) -> string;
```
## DivisionExpression::getAnOperand

```rust
pub fn getAnOperand(self: DivisionExpression) -> *Expression;
```
## DivisionExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: DivisionExpression, i: int) -> Modifier;
```
## DivisionExpression::getRightOperand

```java
/**
* Get the right operand of this binary expression.
*/
```
```rust
pub fn getRightOperand(self: DivisionExpression) -> Expression;
```
## DivisionExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: DivisionExpression) -> int;
```
## DivisionExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: DivisionExpression) -> string;
```
## DivisionExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *DivisionExpression;
```
## DivisionExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: DivisionExpression) -> Location;
```
## DivisionExpression::getOperator

```java
/**
* Get the operator of this binary expression.
*/
```
```rust
pub fn getOperator(self: DivisionExpression) -> BinaryOperator;
```
## DivisionExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: DivisionExpression) -> *Node;
```
## DivisionExpression::getLeft

```java
/**
* Get the left operand of this binary expression. An alias of `getLeftOperand`.
*/
```
```rust
pub fn getLeft(self: DivisionExpression) -> Expression;
```
## DivisionExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: DivisionExpression) -> int;
```
## DivisionExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: DivisionExpression) -> *Modifier;
```
## DivisionExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: DivisionExpression) -> int;
```
## DivisionExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: DivisionExpression) -> Node;
```
## DivisionExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: DivisionExpression) -> FunctionLikeDeclaration;
```
## DivisionExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: DivisionExpression) -> int;
```
## DivisionExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: DivisionExpression) -> int;
```
## DivisionExpression::getIndex

```rust
pub fn getIndex(self: DivisionExpression) -> int;
```
## DivisionExpression::getRight

```java
/**
* Get the right operand of this binary expression. An alias of `getRightOperand`
*/
```
```rust
pub fn getRight(self: DivisionExpression) -> Expression;
```
