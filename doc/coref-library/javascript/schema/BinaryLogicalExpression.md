# BinaryLogicalExpression

Inherit from [BinaryExpression](./BinaryExpression.md)

Primary key: `id: int`

```rust
schema BinaryLogicalExpression extends BinaryExpression {
  @primary id: int
}
```
## BinaryLogicalExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: BinaryLogicalExpression) -> int;
```
## BinaryLogicalExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: BinaryLogicalExpression) -> int;
```
## BinaryLogicalExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: BinaryLogicalExpression) -> Node;
```
## BinaryLogicalExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: BinaryLogicalExpression) -> FunctionLikeDeclaration;
```
## BinaryLogicalExpression::getLeft

```java
/**
* Get the left operand of this binary expression. An alias of `getLeftOperand`.
*/
```
```rust
pub fn getLeft(self: BinaryLogicalExpression) -> Expression;
```
## BinaryLogicalExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: BinaryLogicalExpression) -> *Node;
```
## BinaryLogicalExpression::getOperator

```java
/**
* Get the operator of this binary expression.
*/
```
```rust
pub fn getOperator(self: BinaryLogicalExpression) -> BinaryOperator;
```
## BinaryLogicalExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: BinaryLogicalExpression) -> Location;
```
## BinaryLogicalExpression::getRight

```java
/**
* Get the right operand of this binary expression. An alias of `getRightOperand`
*/
```
```rust
pub fn getRight(self: BinaryLogicalExpression) -> Expression;
```
## BinaryLogicalExpression::getIndex

```rust
pub fn getIndex(self: BinaryLogicalExpression) -> int;
```
## BinaryLogicalExpression::getAnOperand

```rust
pub fn getAnOperand(self: BinaryLogicalExpression) -> *Expression;
```
## BinaryLogicalExpression::getRightOperand

```java
/**
* Get the right operand of this binary expression.
*/
```
```rust
pub fn getRightOperand(self: BinaryLogicalExpression) -> Expression;
```
## BinaryLogicalExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: BinaryLogicalExpression, i: int) -> Modifier;
```
## BinaryLogicalExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: BinaryLogicalExpression) -> string;
```
## BinaryLogicalExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: BinaryLogicalExpression) -> string;
```
## BinaryLogicalExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: BinaryLogicalExpression) -> int;
```
## BinaryLogicalExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: BinaryLogicalExpression) -> File;
```
## BinaryLogicalExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: BinaryLogicalExpression, level: int) -> Node;
```
## BinaryLogicalExpression::getLeftOperand

```java
/**
* Get the left operand of this binary expression.
*/
```
```rust
pub fn getLeftOperand(self: BinaryLogicalExpression) -> Expression;
```
## BinaryLogicalExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: BinaryLogicalExpression) -> *FunctionLikeDeclaration;
```
## BinaryLogicalExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: BinaryLogicalExpression, level: int) -> *Node;
```
## BinaryLogicalExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: BinaryLogicalExpression) -> int;
```
## BinaryLogicalExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: BinaryLogicalExpression) -> *Modifier;
```
## BinaryLogicalExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: BinaryLogicalExpression) -> int;
```
## BinaryLogicalExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: BinaryLogicalExpression) -> int;
```
## BinaryLogicalExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: BinaryLogicalExpression, i: int) -> Node;
```
## BinaryLogicalExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: BinaryLogicalExpression) -> TopLevelDO;
```
## BinaryLogicalExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: BinaryLogicalExpression, i: int) -> Decorator;
```
## BinaryLogicalExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: BinaryLogicalExpression) -> *Node;
```
## BinaryLogicalExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: BinaryLogicalExpression) -> Node;
```
## BinaryLogicalExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: BinaryLogicalExpression) -> *Comment;
```
## BinaryLogicalExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: BinaryLogicalExpression) -> *Comment;
```
## BinaryLogicalExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: BinaryLogicalExpression) -> int;
```
## BinaryLogicalExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: BinaryLogicalExpression) -> *Node;
```
## BinaryLogicalExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: BinaryLogicalExpression) -> *Comment;
```
## BinaryLogicalExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: BinaryLogicalExpression) -> *Decorator;
```
## BinaryLogicalExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: BinaryLogicalExpression) -> Symbol;
```
## BinaryLogicalExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *BinaryLogicalExpression;
```
