# LeftShiftExpression

Inherit from [ShiftExpression](./ShiftExpression.md)

Primary key: `id: int`

```rust
schema LeftShiftExpression extends ShiftExpression {
  @primary id: int
}
```
## LeftShiftExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: LeftShiftExpression) -> Symbol;
```
## LeftShiftExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: LeftShiftExpression) -> *Decorator;
```
## LeftShiftExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: LeftShiftExpression) -> *Comment;
```
## LeftShiftExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: LeftShiftExpression) -> *Node;
```
## LeftShiftExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: LeftShiftExpression) -> int;
```
## LeftShiftExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: LeftShiftExpression) -> *Comment;
```
## LeftShiftExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: LeftShiftExpression) -> *Comment;
```
## LeftShiftExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: LeftShiftExpression) -> Node;
```
## LeftShiftExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: LeftShiftExpression) -> *Node;
```
## LeftShiftExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: LeftShiftExpression, i: int) -> Decorator;
```
## LeftShiftExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: LeftShiftExpression) -> TopLevelDO;
```
## LeftShiftExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: LeftShiftExpression, i: int) -> Node;
```
## LeftShiftExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: LeftShiftExpression) -> int;
```
## LeftShiftExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: LeftShiftExpression, level: int) -> *Node;
```
## LeftShiftExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: LeftShiftExpression) -> *FunctionLikeDeclaration;
```
## LeftShiftExpression::getLeftOperand

```java
/**
* Get the left operand of this binary expression.
*/
```
```rust
pub fn getLeftOperand(self: LeftShiftExpression) -> Expression;
```
## LeftShiftExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: LeftShiftExpression, level: int) -> Node;
```
## LeftShiftExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: LeftShiftExpression) -> File;
```
## LeftShiftExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: LeftShiftExpression) -> string;
```
## LeftShiftExpression::getAnOperand

```rust
pub fn getAnOperand(self: LeftShiftExpression) -> *Expression;
```
## LeftShiftExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: LeftShiftExpression, i: int) -> Modifier;
```
## LeftShiftExpression::getRightOperand

```java
/**
* Get the right operand of this binary expression.
*/
```
```rust
pub fn getRightOperand(self: LeftShiftExpression) -> Expression;
```
## LeftShiftExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: LeftShiftExpression) -> int;
```
## LeftShiftExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: LeftShiftExpression) -> string;
```
## LeftShiftExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *LeftShiftExpression;
```
## LeftShiftExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: LeftShiftExpression) -> Location;
```
## LeftShiftExpression::getOperator

```java
/**
* Get the operator of this binary expression.
*/
```
```rust
pub fn getOperator(self: LeftShiftExpression) -> BinaryOperator;
```
## LeftShiftExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: LeftShiftExpression) -> *Node;
```
## LeftShiftExpression::getLeft

```java
/**
* Get the left operand of this binary expression. An alias of `getLeftOperand`.
*/
```
```rust
pub fn getLeft(self: LeftShiftExpression) -> Expression;
```
## LeftShiftExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: LeftShiftExpression) -> int;
```
## LeftShiftExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: LeftShiftExpression) -> *Modifier;
```
## LeftShiftExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: LeftShiftExpression) -> int;
```
## LeftShiftExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: LeftShiftExpression) -> Node;
```
## LeftShiftExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: LeftShiftExpression) -> FunctionLikeDeclaration;
```
## LeftShiftExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: LeftShiftExpression) -> int;
```
## LeftShiftExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: LeftShiftExpression) -> int;
```
## LeftShiftExpression::getIndex

```rust
pub fn getIndex(self: LeftShiftExpression) -> int;
```
## LeftShiftExpression::getRight

```java
/**
* Get the right operand of this binary expression. An alias of `getRightOperand`
*/
```
```rust
pub fn getRight(self: LeftShiftExpression) -> Expression;
```
