# RightShiftExpression

Primary key: `id: int`

```rust
schema RightShiftExpression {
  @primary id: int,
}
```
## RightShiftExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: RightShiftExpression) -> Symbol;
```
## RightShiftExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: RightShiftExpression) -> *Decorator;
```
## RightShiftExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: RightShiftExpression) -> *Comment;
```
## RightShiftExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: RightShiftExpression) -> *Node;
```
## RightShiftExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: RightShiftExpression) -> int;
```
## RightShiftExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: RightShiftExpression) -> *Comment;
```
## RightShiftExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: RightShiftExpression) -> *Comment;
```
## RightShiftExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: RightShiftExpression) -> Node;
```
## RightShiftExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: RightShiftExpression) -> *Node;
```
## RightShiftExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: RightShiftExpression, i: int) -> Decorator;
```
## RightShiftExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: RightShiftExpression) -> TopLevelDO;
```
## RightShiftExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: RightShiftExpression, i: int) -> Node;
```
## RightShiftExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: RightShiftExpression) -> int;
```
## RightShiftExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: RightShiftExpression, level: int) -> *Node;
```
## RightShiftExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: RightShiftExpression) -> *FunctionLikeDeclaration;
```
## RightShiftExpression::getLeftOperand

```java
/**
* Get the left operand of this binary expression.
*/
```
```rust
pub fn getLeftOperand(self: RightShiftExpression) -> Expression;
```
## RightShiftExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: RightShiftExpression, level: int) -> Node;
```
## RightShiftExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: RightShiftExpression) -> File;
```
## RightShiftExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: RightShiftExpression) -> string;
```
## RightShiftExpression::getAnOperand

```rust
pub fn getAnOperand(self: RightShiftExpression) -> *Expression;
```
## RightShiftExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: RightShiftExpression, i: int) -> Modifier;
```
## RightShiftExpression::getRightOperand

```java
/**
* Get the right operand of this binary expression.
*/
```
```rust
pub fn getRightOperand(self: RightShiftExpression) -> Expression;
```
## RightShiftExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: RightShiftExpression) -> int;
```
## RightShiftExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: RightShiftExpression) -> string;
```
## RightShiftExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *RightShiftExpression;
```
## RightShiftExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: RightShiftExpression) -> Location;
```
## RightShiftExpression::getOperator

```java
/**
* Get the operator of this binary expression.
*/
```
```rust
pub fn getOperator(self: RightShiftExpression) -> BinaryOperator;
```
## RightShiftExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: RightShiftExpression) -> *Node;
```
## RightShiftExpression::getLeft

```java
/**
* Get the left operand of this binary expression. An alias of `getLeftOperand`.
*/
```
```rust
pub fn getLeft(self: RightShiftExpression) -> Expression;
```
## RightShiftExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: RightShiftExpression) -> int;
```
## RightShiftExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: RightShiftExpression) -> *Modifier;
```
## RightShiftExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: RightShiftExpression) -> int;
```
## RightShiftExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: RightShiftExpression) -> Node;
```
## RightShiftExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: RightShiftExpression) -> FunctionLikeDeclaration;
```
## RightShiftExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: RightShiftExpression) -> int;
```
## RightShiftExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: RightShiftExpression) -> int;
```
## RightShiftExpression::getIndex

```rust
pub fn getIndex(self: RightShiftExpression) -> int;
```
## RightShiftExpression::getRight

```java
/**
* Get the right operand of this binary expression. An alias of `getRightOperand`
*/
```
```rust
pub fn getRight(self: RightShiftExpression) -> Expression;
```
