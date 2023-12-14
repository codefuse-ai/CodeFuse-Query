# StrictInequalityExpression

Primary key: `id: int`

```rust
schema StrictInequalityExpression {
  @primary id: int,
}
```
## StrictInequalityExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: StrictInequalityExpression) -> Symbol;
```
## StrictInequalityExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: StrictInequalityExpression) -> *Decorator;
```
## StrictInequalityExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: StrictInequalityExpression) -> *Comment;
```
## StrictInequalityExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: StrictInequalityExpression) -> *Node;
```
## StrictInequalityExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: StrictInequalityExpression) -> int;
```
## StrictInequalityExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: StrictInequalityExpression) -> *Comment;
```
## StrictInequalityExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: StrictInequalityExpression) -> *Comment;
```
## StrictInequalityExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: StrictInequalityExpression) -> Node;
```
## StrictInequalityExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: StrictInequalityExpression) -> *Node;
```
## StrictInequalityExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: StrictInequalityExpression, i: int) -> Decorator;
```
## StrictInequalityExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: StrictInequalityExpression) -> TopLevelDO;
```
## StrictInequalityExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: StrictInequalityExpression, i: int) -> Node;
```
## StrictInequalityExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: StrictInequalityExpression) -> int;
```
## StrictInequalityExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: StrictInequalityExpression, level: int) -> *Node;
```
## StrictInequalityExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: StrictInequalityExpression) -> *FunctionLikeDeclaration;
```
## StrictInequalityExpression::getLeftOperand

```java
/**
* Get the left operand of this binary expression.
*/
```
```rust
pub fn getLeftOperand(self: StrictInequalityExpression) -> Expression;
```
## StrictInequalityExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: StrictInequalityExpression, level: int) -> Node;
```
## StrictInequalityExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: StrictInequalityExpression) -> File;
```
## StrictInequalityExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: StrictInequalityExpression) -> string;
```
## StrictInequalityExpression::getAnOperand

```rust
pub fn getAnOperand(self: StrictInequalityExpression) -> *Expression;
```
## StrictInequalityExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: StrictInequalityExpression, i: int) -> Modifier;
```
## StrictInequalityExpression::getRightOperand

```java
/**
* Get the right operand of this binary expression.
*/
```
```rust
pub fn getRightOperand(self: StrictInequalityExpression) -> Expression;
```
## StrictInequalityExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: StrictInequalityExpression) -> int;
```
## StrictInequalityExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: StrictInequalityExpression) -> string;
```
## StrictInequalityExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *StrictInequalityExpression;
```
## StrictInequalityExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: StrictInequalityExpression) -> Location;
```
## StrictInequalityExpression::getOperator

```java
/**
* Get the operator of this binary expression.
*/
```
```rust
pub fn getOperator(self: StrictInequalityExpression) -> BinaryOperator;
```
## StrictInequalityExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: StrictInequalityExpression) -> *Node;
```
## StrictInequalityExpression::getLeft

```java
/**
* Get the left operand of this binary expression. An alias of `getLeftOperand`.
*/
```
```rust
pub fn getLeft(self: StrictInequalityExpression) -> Expression;
```
## StrictInequalityExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: StrictInequalityExpression) -> int;
```
## StrictInequalityExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: StrictInequalityExpression) -> *Modifier;
```
## StrictInequalityExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: StrictInequalityExpression) -> int;
```
## StrictInequalityExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: StrictInequalityExpression) -> Node;
```
## StrictInequalityExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: StrictInequalityExpression) -> FunctionLikeDeclaration;
```
## StrictInequalityExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: StrictInequalityExpression) -> int;
```
## StrictInequalityExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: StrictInequalityExpression) -> int;
```
## StrictInequalityExpression::getIndex

```rust
pub fn getIndex(self: StrictInequalityExpression) -> int;
```
## StrictInequalityExpression::getRight

```java
/**
* Get the right operand of this binary expression. An alias of `getRightOperand`
*/
```
```rust
pub fn getRight(self: StrictInequalityExpression) -> Expression;
```
