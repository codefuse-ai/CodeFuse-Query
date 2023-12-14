# StrictEqualityExpression

Primary key: `id: int`

```rust
schema StrictEqualityExpression {
  @primary id: int,
}
```
## StrictEqualityExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: StrictEqualityExpression) -> Symbol;
```
## StrictEqualityExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: StrictEqualityExpression) -> *Decorator;
```
## StrictEqualityExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: StrictEqualityExpression) -> *Comment;
```
## StrictEqualityExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: StrictEqualityExpression) -> *Node;
```
## StrictEqualityExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: StrictEqualityExpression) -> int;
```
## StrictEqualityExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: StrictEqualityExpression) -> *Comment;
```
## StrictEqualityExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: StrictEqualityExpression) -> *Comment;
```
## StrictEqualityExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: StrictEqualityExpression) -> Node;
```
## StrictEqualityExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: StrictEqualityExpression) -> *Node;
```
## StrictEqualityExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: StrictEqualityExpression, i: int) -> Decorator;
```
## StrictEqualityExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: StrictEqualityExpression) -> TopLevelDO;
```
## StrictEqualityExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: StrictEqualityExpression, i: int) -> Node;
```
## StrictEqualityExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: StrictEqualityExpression) -> int;
```
## StrictEqualityExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: StrictEqualityExpression, level: int) -> *Node;
```
## StrictEqualityExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: StrictEqualityExpression) -> *FunctionLikeDeclaration;
```
## StrictEqualityExpression::getLeftOperand

```java
/**
* Get the left operand of this binary expression.
*/
```
```rust
pub fn getLeftOperand(self: StrictEqualityExpression) -> Expression;
```
## StrictEqualityExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: StrictEqualityExpression, level: int) -> Node;
```
## StrictEqualityExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: StrictEqualityExpression) -> File;
```
## StrictEqualityExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: StrictEqualityExpression) -> string;
```
## StrictEqualityExpression::getAnOperand

```rust
pub fn getAnOperand(self: StrictEqualityExpression) -> *Expression;
```
## StrictEqualityExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: StrictEqualityExpression, i: int) -> Modifier;
```
## StrictEqualityExpression::getRightOperand

```java
/**
* Get the right operand of this binary expression.
*/
```
```rust
pub fn getRightOperand(self: StrictEqualityExpression) -> Expression;
```
## StrictEqualityExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: StrictEqualityExpression) -> int;
```
## StrictEqualityExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: StrictEqualityExpression) -> string;
```
## StrictEqualityExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *StrictEqualityExpression;
```
## StrictEqualityExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: StrictEqualityExpression) -> Location;
```
## StrictEqualityExpression::getOperator

```java
/**
* Get the operator of this binary expression.
*/
```
```rust
pub fn getOperator(self: StrictEqualityExpression) -> BinaryOperator;
```
## StrictEqualityExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: StrictEqualityExpression) -> *Node;
```
## StrictEqualityExpression::getLeft

```java
/**
* Get the left operand of this binary expression. An alias of `getLeftOperand`.
*/
```
```rust
pub fn getLeft(self: StrictEqualityExpression) -> Expression;
```
## StrictEqualityExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: StrictEqualityExpression) -> int;
```
## StrictEqualityExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: StrictEqualityExpression) -> *Modifier;
```
## StrictEqualityExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: StrictEqualityExpression) -> int;
```
## StrictEqualityExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: StrictEqualityExpression) -> Node;
```
## StrictEqualityExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: StrictEqualityExpression) -> FunctionLikeDeclaration;
```
## StrictEqualityExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: StrictEqualityExpression) -> int;
```
## StrictEqualityExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: StrictEqualityExpression) -> int;
```
## StrictEqualityExpression::getIndex

```rust
pub fn getIndex(self: StrictEqualityExpression) -> int;
```
## StrictEqualityExpression::getRight

```java
/**
* Get the right operand of this binary expression. An alias of `getRightOperand`
*/
```
```rust
pub fn getRight(self: StrictEqualityExpression) -> Expression;
```
