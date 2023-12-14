# MultiplicationExpression

Inherit from [MultiplicativeExpression](./MultiplicativeExpression.md)

Primary key: `id: int`

```rust
schema MultiplicationExpression extends MultiplicativeExpression {
  @primary id: int,
}
```
## MultiplicationExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: MultiplicationExpression) -> Symbol;
```
## MultiplicationExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: MultiplicationExpression) -> *Decorator;
```
## MultiplicationExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: MultiplicationExpression) -> *Comment;
```
## MultiplicationExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: MultiplicationExpression) -> *Node;
```
## MultiplicationExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: MultiplicationExpression) -> int;
```
## MultiplicationExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: MultiplicationExpression) -> *Comment;
```
## MultiplicationExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: MultiplicationExpression) -> *Comment;
```
## MultiplicationExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: MultiplicationExpression) -> Node;
```
## MultiplicationExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: MultiplicationExpression) -> *Node;
```
## MultiplicationExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: MultiplicationExpression, i: int) -> Decorator;
```
## MultiplicationExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: MultiplicationExpression) -> TopLevelDO;
```
## MultiplicationExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: MultiplicationExpression, i: int) -> Node;
```
## MultiplicationExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: MultiplicationExpression) -> int;
```
## MultiplicationExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: MultiplicationExpression, level: int) -> *Node;
```
## MultiplicationExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: MultiplicationExpression) -> *FunctionLikeDeclaration;
```
## MultiplicationExpression::getLeftOperand

```java
/**
* Get the left operand of this binary expression.
*/
```
```rust
pub fn getLeftOperand(self: MultiplicationExpression) -> Expression;
```
## MultiplicationExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: MultiplicationExpression, level: int) -> Node;
```
## MultiplicationExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: MultiplicationExpression) -> File;
```
## MultiplicationExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: MultiplicationExpression) -> string;
```
## MultiplicationExpression::getAnOperand

```rust
pub fn getAnOperand(self: MultiplicationExpression) -> *Expression;
```
## MultiplicationExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: MultiplicationExpression, i: int) -> Modifier;
```
## MultiplicationExpression::getRightOperand

```java
/**
* Get the right operand of this binary expression.
*/
```
```rust
pub fn getRightOperand(self: MultiplicationExpression) -> Expression;
```
## MultiplicationExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: MultiplicationExpression) -> int;
```
## MultiplicationExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: MultiplicationExpression) -> string;
```
## MultiplicationExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *MultiplicationExpression;
```
## MultiplicationExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: MultiplicationExpression) -> Location;
```
## MultiplicationExpression::getOperator

```java
/**
* Get the operator of this binary expression.
*/
```
```rust
pub fn getOperator(self: MultiplicationExpression) -> BinaryOperator;
```
## MultiplicationExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: MultiplicationExpression) -> *Node;
```
## MultiplicationExpression::getLeft

```java
/**
* Get the left operand of this binary expression. An alias of `getLeftOperand`.
*/
```
```rust
pub fn getLeft(self: MultiplicationExpression) -> Expression;
```
## MultiplicationExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: MultiplicationExpression) -> int;
```
## MultiplicationExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: MultiplicationExpression) -> *Modifier;
```
## MultiplicationExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: MultiplicationExpression) -> int;
```
## MultiplicationExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: MultiplicationExpression) -> Node;
```
## MultiplicationExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: MultiplicationExpression) -> FunctionLikeDeclaration;
```
## MultiplicationExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: MultiplicationExpression) -> int;
```
## MultiplicationExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: MultiplicationExpression) -> int;
```
## MultiplicationExpression::getIndex

```rust
pub fn getIndex(self: MultiplicationExpression) -> int;
```
## MultiplicationExpression::getRight

```java
/**
* Get the right operand of this binary expression. An alias of `getRightOperand`
*/
```
```rust
pub fn getRight(self: MultiplicationExpression) -> Expression;
```
