# UnsignedRightShiftExpression

Primary key: `id: int`

```rust
schema UnsignedRightShiftExpression {
  @primary id: int,
}
```
## UnsignedRightShiftExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: UnsignedRightShiftExpression) -> Symbol;
```
## UnsignedRightShiftExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: UnsignedRightShiftExpression) -> *Decorator;
```
## UnsignedRightShiftExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: UnsignedRightShiftExpression) -> *Comment;
```
## UnsignedRightShiftExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: UnsignedRightShiftExpression) -> *Node;
```
## UnsignedRightShiftExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: UnsignedRightShiftExpression) -> int;
```
## UnsignedRightShiftExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: UnsignedRightShiftExpression) -> *Comment;
```
## UnsignedRightShiftExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: UnsignedRightShiftExpression) -> *Comment;
```
## UnsignedRightShiftExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: UnsignedRightShiftExpression) -> Node;
```
## UnsignedRightShiftExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: UnsignedRightShiftExpression) -> *Node;
```
## UnsignedRightShiftExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: UnsignedRightShiftExpression, i: int) -> Decorator;
```
## UnsignedRightShiftExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: UnsignedRightShiftExpression) -> TopLevelDO;
```
## UnsignedRightShiftExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: UnsignedRightShiftExpression, i: int) -> Node;
```
## UnsignedRightShiftExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: UnsignedRightShiftExpression) -> int;
```
## UnsignedRightShiftExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: UnsignedRightShiftExpression, level: int) -> *Node;
```
## UnsignedRightShiftExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: UnsignedRightShiftExpression) -> *FunctionLikeDeclaration;
```
## UnsignedRightShiftExpression::getLeftOperand

```java
/**
* Get the left operand of this binary expression.
*/
```
```rust
pub fn getLeftOperand(self: UnsignedRightShiftExpression) -> Expression;
```
## UnsignedRightShiftExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: UnsignedRightShiftExpression, level: int) -> Node;
```
## UnsignedRightShiftExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: UnsignedRightShiftExpression) -> File;
```
## UnsignedRightShiftExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: UnsignedRightShiftExpression) -> string;
```
## UnsignedRightShiftExpression::getAnOperand

```rust
pub fn getAnOperand(self: UnsignedRightShiftExpression) -> *Expression;
```
## UnsignedRightShiftExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: UnsignedRightShiftExpression, i: int) -> Modifier;
```
## UnsignedRightShiftExpression::getRightOperand

```java
/**
* Get the right operand of this binary expression.
*/
```
```rust
pub fn getRightOperand(self: UnsignedRightShiftExpression) -> Expression;
```
## UnsignedRightShiftExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: UnsignedRightShiftExpression) -> int;
```
## UnsignedRightShiftExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: UnsignedRightShiftExpression) -> string;
```
## UnsignedRightShiftExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *UnsignedRightShiftExpression;
```
## UnsignedRightShiftExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: UnsignedRightShiftExpression) -> Location;
```
## UnsignedRightShiftExpression::getOperator

```java
/**
* Get the operator of this binary expression.
*/
```
```rust
pub fn getOperator(self: UnsignedRightShiftExpression) -> BinaryOperator;
```
## UnsignedRightShiftExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: UnsignedRightShiftExpression) -> *Node;
```
## UnsignedRightShiftExpression::getLeft

```java
/**
* Get the left operand of this binary expression. An alias of `getLeftOperand`.
*/
```
```rust
pub fn getLeft(self: UnsignedRightShiftExpression) -> Expression;
```
## UnsignedRightShiftExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: UnsignedRightShiftExpression) -> int;
```
## UnsignedRightShiftExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: UnsignedRightShiftExpression) -> *Modifier;
```
## UnsignedRightShiftExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: UnsignedRightShiftExpression) -> int;
```
## UnsignedRightShiftExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: UnsignedRightShiftExpression) -> Node;
```
## UnsignedRightShiftExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: UnsignedRightShiftExpression) -> FunctionLikeDeclaration;
```
## UnsignedRightShiftExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: UnsignedRightShiftExpression) -> int;
```
## UnsignedRightShiftExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: UnsignedRightShiftExpression) -> int;
```
## UnsignedRightShiftExpression::getIndex

```rust
pub fn getIndex(self: UnsignedRightShiftExpression) -> int;
```
## UnsignedRightShiftExpression::getRight

```java
/**
* Get the right operand of this binary expression. An alias of `getRightOperand`
*/
```
```rust
pub fn getRight(self: UnsignedRightShiftExpression) -> Expression;
```
