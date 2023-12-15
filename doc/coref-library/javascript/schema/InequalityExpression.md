# InequalityExpression

Inherit from [EqualityTestExpression](./EqualityTestExpression.md)

Primary key: `id: int`

```rust
schema InequalityExpression extends EqualityTestExpression {
  @primary id: int
}
```
## InequalityExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: InequalityExpression) -> Symbol;
```
## InequalityExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: InequalityExpression) -> *Decorator;
```
## InequalityExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: InequalityExpression) -> *Comment;
```
## InequalityExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: InequalityExpression) -> *Node;
```
## InequalityExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: InequalityExpression) -> int;
```
## InequalityExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: InequalityExpression) -> *Comment;
```
## InequalityExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: InequalityExpression) -> *Comment;
```
## InequalityExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: InequalityExpression) -> Node;
```
## InequalityExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: InequalityExpression) -> *Node;
```
## InequalityExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: InequalityExpression, i: int) -> Decorator;
```
## InequalityExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: InequalityExpression) -> TopLevelDO;
```
## InequalityExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: InequalityExpression, i: int) -> Node;
```
## InequalityExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: InequalityExpression) -> int;
```
## InequalityExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: InequalityExpression, level: int) -> *Node;
```
## InequalityExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: InequalityExpression) -> *FunctionLikeDeclaration;
```
## InequalityExpression::getLeftOperand

```java
/**
* Get the left operand of this binary expression.
*/
```
```rust
pub fn getLeftOperand(self: InequalityExpression) -> Expression;
```
## InequalityExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: InequalityExpression, level: int) -> Node;
```
## InequalityExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: InequalityExpression) -> File;
```
## InequalityExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: InequalityExpression) -> string;
```
## InequalityExpression::getAnOperand

```rust
pub fn getAnOperand(self: InequalityExpression) -> *Expression;
```
## InequalityExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: InequalityExpression, i: int) -> Modifier;
```
## InequalityExpression::getRightOperand

```java
/**
* Get the right operand of this binary expression.
*/
```
```rust
pub fn getRightOperand(self: InequalityExpression) -> Expression;
```
## InequalityExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: InequalityExpression) -> int;
```
## InequalityExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: InequalityExpression) -> string;
```
## InequalityExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *InequalityExpression;
```
## InequalityExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: InequalityExpression) -> Location;
```
## InequalityExpression::getOperator

```java
/**
* Get the operator of this binary expression.
*/
```
```rust
pub fn getOperator(self: InequalityExpression) -> BinaryOperator;
```
## InequalityExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: InequalityExpression) -> *Node;
```
## InequalityExpression::getLeft

```java
/**
* Get the left operand of this binary expression. An alias of `getLeftOperand`.
*/
```
```rust
pub fn getLeft(self: InequalityExpression) -> Expression;
```
## InequalityExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: InequalityExpression) -> int;
```
## InequalityExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: InequalityExpression) -> *Modifier;
```
## InequalityExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: InequalityExpression) -> int;
```
## InequalityExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: InequalityExpression) -> Node;
```
## InequalityExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: InequalityExpression) -> FunctionLikeDeclaration;
```
## InequalityExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: InequalityExpression) -> int;
```
## InequalityExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: InequalityExpression) -> int;
```
## InequalityExpression::getIndex

```rust
pub fn getIndex(self: InequalityExpression) -> int;
```
## InequalityExpression::getRight

```java
/**
* Get the right operand of this binary expression. An alias of `getRightOperand`
*/
```
```rust
pub fn getRight(self: InequalityExpression) -> Expression;
```
