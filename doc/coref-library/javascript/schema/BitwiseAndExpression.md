# BitwiseAndExpression

Inherit from [BinaryBitwiseExpression](./BinaryBitwiseExpression.md)

Primary key: `id: int`

```rust
schema BitwiseAndExpression extends BinaryBitwiseExpression {
  @primary id: int,
}
```
## BitwiseAndExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: BitwiseAndExpression) -> Symbol;
```
## BitwiseAndExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: BitwiseAndExpression) -> *Decorator;
```
## BitwiseAndExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: BitwiseAndExpression) -> *Comment;
```
## BitwiseAndExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: BitwiseAndExpression) -> *Node;
```
## BitwiseAndExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: BitwiseAndExpression) -> int;
```
## BitwiseAndExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: BitwiseAndExpression) -> *Comment;
```
## BitwiseAndExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: BitwiseAndExpression) -> *Comment;
```
## BitwiseAndExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: BitwiseAndExpression) -> Node;
```
## BitwiseAndExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: BitwiseAndExpression) -> *Node;
```
## BitwiseAndExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: BitwiseAndExpression, i: int) -> Decorator;
```
## BitwiseAndExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: BitwiseAndExpression) -> TopLevelDO;
```
## BitwiseAndExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: BitwiseAndExpression, i: int) -> Node;
```
## BitwiseAndExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: BitwiseAndExpression) -> int;
```
## BitwiseAndExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: BitwiseAndExpression, level: int) -> *Node;
```
## BitwiseAndExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: BitwiseAndExpression) -> *FunctionLikeDeclaration;
```
## BitwiseAndExpression::getLeftOperand

```java
/**
* Get the left operand of this binary expression.
*/
```
```rust
pub fn getLeftOperand(self: BitwiseAndExpression) -> Expression;
```
## BitwiseAndExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: BitwiseAndExpression, level: int) -> Node;
```
## BitwiseAndExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: BitwiseAndExpression) -> File;
```
## BitwiseAndExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: BitwiseAndExpression) -> string;
```
## BitwiseAndExpression::getAnOperand

```rust
pub fn getAnOperand(self: BitwiseAndExpression) -> *Expression;
```
## BitwiseAndExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: BitwiseAndExpression, i: int) -> Modifier;
```
## BitwiseAndExpression::getRightOperand

```java
/**
* Get the right operand of this binary expression.
*/
```
```rust
pub fn getRightOperand(self: BitwiseAndExpression) -> Expression;
```
## BitwiseAndExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: BitwiseAndExpression) -> int;
```
## BitwiseAndExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: BitwiseAndExpression) -> string;
```
## BitwiseAndExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *BitwiseAndExpression;
```
## BitwiseAndExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: BitwiseAndExpression) -> Location;
```
## BitwiseAndExpression::getOperator

```java
/**
* Get the operator of this binary expression.
*/
```
```rust
pub fn getOperator(self: BitwiseAndExpression) -> BinaryOperator;
```
## BitwiseAndExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: BitwiseAndExpression) -> *Node;
```
## BitwiseAndExpression::getLeft

```java
/**
* Get the left operand of this binary expression. An alias of `getLeftOperand`.
*/
```
```rust
pub fn getLeft(self: BitwiseAndExpression) -> Expression;
```
## BitwiseAndExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: BitwiseAndExpression) -> int;
```
## BitwiseAndExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: BitwiseAndExpression) -> *Modifier;
```
## BitwiseAndExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: BitwiseAndExpression) -> int;
```
## BitwiseAndExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: BitwiseAndExpression) -> Node;
```
## BitwiseAndExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: BitwiseAndExpression) -> FunctionLikeDeclaration;
```
## BitwiseAndExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: BitwiseAndExpression) -> int;
```
## BitwiseAndExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: BitwiseAndExpression) -> int;
```
## BitwiseAndExpression::getIndex

```rust
pub fn getIndex(self: BitwiseAndExpression) -> int;
```
## BitwiseAndExpression::getRight

```java
/**
* Get the right operand of this binary expression. An alias of `getRightOperand`
*/
```
```rust
pub fn getRight(self: BitwiseAndExpression) -> Expression;
```
