# BitwiseOrExpression

Inherit from [BinaryBitwiseExpression](./BinaryBitwiseExpression.md)

Primary key: `id: int`

```rust
schema BitwiseOrExpression extends BinaryBitwiseExpression {
  @primary id: int
}
```
## BitwiseOrExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: BitwiseOrExpression) -> Symbol;
```
## BitwiseOrExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: BitwiseOrExpression) -> *Decorator;
```
## BitwiseOrExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: BitwiseOrExpression) -> *Comment;
```
## BitwiseOrExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: BitwiseOrExpression) -> *Node;
```
## BitwiseOrExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: BitwiseOrExpression) -> int;
```
## BitwiseOrExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: BitwiseOrExpression) -> *Comment;
```
## BitwiseOrExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: BitwiseOrExpression) -> *Comment;
```
## BitwiseOrExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: BitwiseOrExpression) -> Node;
```
## BitwiseOrExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: BitwiseOrExpression) -> *Node;
```
## BitwiseOrExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: BitwiseOrExpression, i: int) -> Decorator;
```
## BitwiseOrExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: BitwiseOrExpression) -> TopLevelDO;
```
## BitwiseOrExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: BitwiseOrExpression, i: int) -> Node;
```
## BitwiseOrExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: BitwiseOrExpression) -> int;
```
## BitwiseOrExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: BitwiseOrExpression, level: int) -> *Node;
```
## BitwiseOrExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: BitwiseOrExpression) -> *FunctionLikeDeclaration;
```
## BitwiseOrExpression::getLeftOperand

```java
/**
* Get the left operand of this binary expression.
*/
```
```rust
pub fn getLeftOperand(self: BitwiseOrExpression) -> Expression;
```
## BitwiseOrExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: BitwiseOrExpression, level: int) -> Node;
```
## BitwiseOrExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: BitwiseOrExpression) -> File;
```
## BitwiseOrExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: BitwiseOrExpression) -> string;
```
## BitwiseOrExpression::getAnOperand

```rust
pub fn getAnOperand(self: BitwiseOrExpression) -> *Expression;
```
## BitwiseOrExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: BitwiseOrExpression, i: int) -> Modifier;
```
## BitwiseOrExpression::getRightOperand

```java
/**
* Get the right operand of this binary expression.
*/
```
```rust
pub fn getRightOperand(self: BitwiseOrExpression) -> Expression;
```
## BitwiseOrExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: BitwiseOrExpression) -> int;
```
## BitwiseOrExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: BitwiseOrExpression) -> string;
```
## BitwiseOrExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *BitwiseOrExpression;
```
## BitwiseOrExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: BitwiseOrExpression) -> Location;
```
## BitwiseOrExpression::getOperator

```java
/**
* Get the operator of this binary expression.
*/
```
```rust
pub fn getOperator(self: BitwiseOrExpression) -> BinaryOperator;
```
## BitwiseOrExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: BitwiseOrExpression) -> *Node;
```
## BitwiseOrExpression::getLeft

```java
/**
* Get the left operand of this binary expression. An alias of `getLeftOperand`.
*/
```
```rust
pub fn getLeft(self: BitwiseOrExpression) -> Expression;
```
## BitwiseOrExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: BitwiseOrExpression) -> int;
```
## BitwiseOrExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: BitwiseOrExpression) -> *Modifier;
```
## BitwiseOrExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: BitwiseOrExpression) -> int;
```
## BitwiseOrExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: BitwiseOrExpression) -> Node;
```
## BitwiseOrExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: BitwiseOrExpression) -> FunctionLikeDeclaration;
```
## BitwiseOrExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: BitwiseOrExpression) -> int;
```
## BitwiseOrExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: BitwiseOrExpression) -> int;
```
## BitwiseOrExpression::getIndex

```rust
pub fn getIndex(self: BitwiseOrExpression) -> int;
```
## BitwiseOrExpression::getRight

```java
/**
* Get the right operand of this binary expression. An alias of `getRightOperand`
*/
```
```rust
pub fn getRight(self: BitwiseOrExpression) -> Expression;
```
