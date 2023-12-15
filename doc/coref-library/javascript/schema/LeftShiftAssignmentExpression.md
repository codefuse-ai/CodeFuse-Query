# LeftShiftAssignmentExpression

Inherit from [CompoundAssignmentExpression](./CompoundAssignmentExpression.md)

Primary key: `id: int`

```rust
schema LeftShiftAssignmentExpression extends CompoundAssignmentExpression {
  @primary id: int
}
```
## LeftShiftAssignmentExpression::getRight

```java
/**
* Get the right operand of this binary expression. An alias of `getRightOperand`
*/
```
```rust
pub fn getRight(self: LeftShiftAssignmentExpression) -> Expression;
```
## LeftShiftAssignmentExpression::getIndex

```rust
pub fn getIndex(self: LeftShiftAssignmentExpression) -> int;
```
## LeftShiftAssignmentExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: LeftShiftAssignmentExpression) -> int;
```
## LeftShiftAssignmentExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: LeftShiftAssignmentExpression) -> int;
```
## LeftShiftAssignmentExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: LeftShiftAssignmentExpression) -> FunctionLikeDeclaration;
```
## LeftShiftAssignmentExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: LeftShiftAssignmentExpression) -> Node;
```
## LeftShiftAssignmentExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: LeftShiftAssignmentExpression) -> int;
```
## LeftShiftAssignmentExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: LeftShiftAssignmentExpression) -> *Modifier;
```
## LeftShiftAssignmentExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: LeftShiftAssignmentExpression) -> int;
```
## LeftShiftAssignmentExpression::getLeft

```java
/**
* Get the left operand of this binary expression. An alias of `getLeftOperand`.
*/
```
```rust
pub fn getLeft(self: LeftShiftAssignmentExpression) -> Expression;
```
## LeftShiftAssignmentExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: LeftShiftAssignmentExpression) -> *Node;
```
## LeftShiftAssignmentExpression::getOperator

```java
/**
* Get the operator of this binary expression.
*/
```
```rust
pub fn getOperator(self: LeftShiftAssignmentExpression) -> BinaryOperator;
```
## LeftShiftAssignmentExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: LeftShiftAssignmentExpression) -> Location;
```
## LeftShiftAssignmentExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: LeftShiftAssignmentExpression) -> string;
```
## LeftShiftAssignmentExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: LeftShiftAssignmentExpression) -> int;
```
## LeftShiftAssignmentExpression::getAnOperand

```rust
pub fn getAnOperand(self: LeftShiftAssignmentExpression) -> *Expression;
```
## LeftShiftAssignmentExpression::getRightOperand

```java
/**
* Get the right operand of this binary expression.
*/
```
```rust
pub fn getRightOperand(self: LeftShiftAssignmentExpression) -> Expression;
```
## LeftShiftAssignmentExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: LeftShiftAssignmentExpression, i: int) -> Modifier;
```
## LeftShiftAssignmentExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: LeftShiftAssignmentExpression) -> string;
```
## LeftShiftAssignmentExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: LeftShiftAssignmentExpression) -> File;
```
## LeftShiftAssignmentExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: LeftShiftAssignmentExpression, level: int) -> Node;
```
## LeftShiftAssignmentExpression::getLeftOperand

```java
/**
* Get the left operand of this binary expression.
*/
```
```rust
pub fn getLeftOperand(self: LeftShiftAssignmentExpression) -> Expression;
```
## LeftShiftAssignmentExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: LeftShiftAssignmentExpression, level: int) -> *Node;
```
## LeftShiftAssignmentExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: LeftShiftAssignmentExpression) -> *FunctionLikeDeclaration;
```
## LeftShiftAssignmentExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: LeftShiftAssignmentExpression) -> int;
```
## LeftShiftAssignmentExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: LeftShiftAssignmentExpression, i: int) -> Node;
```
## LeftShiftAssignmentExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: LeftShiftAssignmentExpression) -> TopLevelDO;
```
## LeftShiftAssignmentExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: LeftShiftAssignmentExpression, i: int) -> Decorator;
```
## LeftShiftAssignmentExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: LeftShiftAssignmentExpression) -> *Node;
```
## LeftShiftAssignmentExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: LeftShiftAssignmentExpression) -> *Comment;
```
## LeftShiftAssignmentExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: LeftShiftAssignmentExpression) -> Node;
```
## LeftShiftAssignmentExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: LeftShiftAssignmentExpression) -> *Node;
```
## LeftShiftAssignmentExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: LeftShiftAssignmentExpression) -> *Comment;
```
## LeftShiftAssignmentExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: LeftShiftAssignmentExpression) -> *Comment;
```
## LeftShiftAssignmentExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: LeftShiftAssignmentExpression) -> int;
```
## LeftShiftAssignmentExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: LeftShiftAssignmentExpression) -> *Decorator;
```
## LeftShiftAssignmentExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: LeftShiftAssignmentExpression) -> Symbol;
```
## LeftShiftAssignmentExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *LeftShiftAssignmentExpression;
```
