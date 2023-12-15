# ShiftExpression

Inherit from [BinaryExpression](./BinaryExpression.md)

Primary key: `id: int`

```rust
schema ShiftExpression extends BinaryExpression {
  @primary id: int
}
```
## ShiftExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: ShiftExpression) -> int;
```
## ShiftExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ShiftExpression) -> int;
```
## ShiftExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: ShiftExpression) -> Node;
```
## ShiftExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: ShiftExpression) -> FunctionLikeDeclaration;
```
## ShiftExpression::getLeft

```java
/**
* Get the left operand of this binary expression. An alias of `getLeftOperand`.
*/
```
```rust
pub fn getLeft(self: ShiftExpression) -> Expression;
```
## ShiftExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: ShiftExpression) -> *Node;
```
## ShiftExpression::getOperator

```java
/**
* Get the operator of this binary expression.
*/
```
```rust
pub fn getOperator(self: ShiftExpression) -> BinaryOperator;
```
## ShiftExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: ShiftExpression) -> Location;
```
## ShiftExpression::getRight

```java
/**
* Get the right operand of this binary expression. An alias of `getRightOperand`
*/
```
```rust
pub fn getRight(self: ShiftExpression) -> Expression;
```
## ShiftExpression::getIndex

```rust
pub fn getIndex(self: ShiftExpression) -> int;
```
## ShiftExpression::getAnOperand

```rust
pub fn getAnOperand(self: ShiftExpression) -> *Expression;
```
## ShiftExpression::getRightOperand

```java
/**
* Get the right operand of this binary expression.
*/
```
```rust
pub fn getRightOperand(self: ShiftExpression) -> Expression;
```
## ShiftExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: ShiftExpression, i: int) -> Modifier;
```
## ShiftExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: ShiftExpression) -> string;
```
## ShiftExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: ShiftExpression) -> string;
```
## ShiftExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ShiftExpression) -> int;
```
## ShiftExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: ShiftExpression) -> File;
```
## ShiftExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: ShiftExpression, level: int) -> Node;
```
## ShiftExpression::getLeftOperand

```java
/**
* Get the left operand of this binary expression.
*/
```
```rust
pub fn getLeftOperand(self: ShiftExpression) -> Expression;
```
## ShiftExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ShiftExpression) -> *FunctionLikeDeclaration;
```
## ShiftExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: ShiftExpression, level: int) -> *Node;
```
## ShiftExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: ShiftExpression) -> int;
```
## ShiftExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: ShiftExpression) -> *Modifier;
```
## ShiftExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ShiftExpression) -> int;
```
## ShiftExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ShiftExpression) -> int;
```
## ShiftExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: ShiftExpression, i: int) -> Node;
```
## ShiftExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: ShiftExpression) -> TopLevelDO;
```
## ShiftExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: ShiftExpression, i: int) -> Decorator;
```
## ShiftExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: ShiftExpression) -> *Node;
```
## ShiftExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: ShiftExpression) -> Node;
```
## ShiftExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: ShiftExpression) -> *Comment;
```
## ShiftExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: ShiftExpression) -> *Comment;
```
## ShiftExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: ShiftExpression) -> int;
```
## ShiftExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: ShiftExpression) -> *Node;
```
## ShiftExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: ShiftExpression) -> *Comment;
```
## ShiftExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: ShiftExpression) -> *Decorator;
```
## ShiftExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: ShiftExpression) -> Symbol;
```
## ShiftExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *ShiftExpression;
```
