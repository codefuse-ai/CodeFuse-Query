# EqualityExpression

Primary key: `id: int`

```rust
schema EqualityExpression {
  @primary id: int,
}
```
## EqualityExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: EqualityExpression) -> Symbol;
```
## EqualityExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: EqualityExpression) -> *Decorator;
```
## EqualityExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: EqualityExpression) -> *Comment;
```
## EqualityExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: EqualityExpression) -> *Node;
```
## EqualityExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: EqualityExpression) -> int;
```
## EqualityExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: EqualityExpression) -> *Comment;
```
## EqualityExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: EqualityExpression) -> *Comment;
```
## EqualityExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: EqualityExpression) -> Node;
```
## EqualityExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: EqualityExpression) -> *Node;
```
## EqualityExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: EqualityExpression, i: int) -> Decorator;
```
## EqualityExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: EqualityExpression) -> TopLevelDO;
```
## EqualityExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: EqualityExpression, i: int) -> Node;
```
## EqualityExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: EqualityExpression) -> int;
```
## EqualityExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: EqualityExpression, level: int) -> *Node;
```
## EqualityExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: EqualityExpression) -> *FunctionLikeDeclaration;
```
## EqualityExpression::getLeftOperand

```java
/**
* Get the left operand of this binary expression.
*/
```
```rust
pub fn getLeftOperand(self: EqualityExpression) -> Expression;
```
## EqualityExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: EqualityExpression, level: int) -> Node;
```
## EqualityExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: EqualityExpression) -> File;
```
## EqualityExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: EqualityExpression) -> string;
```
## EqualityExpression::getAnOperand

```rust
pub fn getAnOperand(self: EqualityExpression) -> *Expression;
```
## EqualityExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: EqualityExpression, i: int) -> Modifier;
```
## EqualityExpression::getRightOperand

```java
/**
* Get the right operand of this binary expression.
*/
```
```rust
pub fn getRightOperand(self: EqualityExpression) -> Expression;
```
## EqualityExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: EqualityExpression) -> int;
```
## EqualityExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: EqualityExpression) -> string;
```
## EqualityExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *EqualityExpression;
```
## EqualityExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: EqualityExpression) -> Location;
```
## EqualityExpression::getOperator

```java
/**
* Get the operator of this binary expression.
*/
```
```rust
pub fn getOperator(self: EqualityExpression) -> BinaryOperator;
```
## EqualityExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: EqualityExpression) -> *Node;
```
## EqualityExpression::getLeft

```java
/**
* Get the left operand of this binary expression. An alias of `getLeftOperand`.
*/
```
```rust
pub fn getLeft(self: EqualityExpression) -> Expression;
```
## EqualityExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: EqualityExpression) -> int;
```
## EqualityExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: EqualityExpression) -> *Modifier;
```
## EqualityExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: EqualityExpression) -> int;
```
## EqualityExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: EqualityExpression) -> Node;
```
## EqualityExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: EqualityExpression) -> FunctionLikeDeclaration;
```
## EqualityExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: EqualityExpression) -> int;
```
## EqualityExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: EqualityExpression) -> int;
```
## EqualityExpression::getIndex

```rust
pub fn getIndex(self: EqualityExpression) -> int;
```
## EqualityExpression::getRight

```java
/**
* Get the right operand of this binary expression. An alias of `getRightOperand`
*/
```
```rust
pub fn getRight(self: EqualityExpression) -> Expression;
```
