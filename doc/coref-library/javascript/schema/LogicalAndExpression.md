# LogicalAndExpression

Inherit from [BinaryLogicalExpression](./BinaryLogicalExpression.md)

Primary key: `id: int`

```rust
schema LogicalAndExpression extends BinaryLogicalExpression {
  @primary id: int
}
```
## LogicalAndExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: LogicalAndExpression) -> Symbol;
```
## LogicalAndExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: LogicalAndExpression) -> *Decorator;
```
## LogicalAndExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: LogicalAndExpression) -> *Comment;
```
## LogicalAndExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: LogicalAndExpression) -> *Node;
```
## LogicalAndExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: LogicalAndExpression) -> int;
```
## LogicalAndExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: LogicalAndExpression) -> *Comment;
```
## LogicalAndExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: LogicalAndExpression) -> *Comment;
```
## LogicalAndExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: LogicalAndExpression) -> Node;
```
## LogicalAndExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: LogicalAndExpression) -> *Node;
```
## LogicalAndExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: LogicalAndExpression, i: int) -> Decorator;
```
## LogicalAndExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: LogicalAndExpression) -> TopLevelDO;
```
## LogicalAndExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: LogicalAndExpression, i: int) -> Node;
```
## LogicalAndExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: LogicalAndExpression) -> int;
```
## LogicalAndExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: LogicalAndExpression, level: int) -> *Node;
```
## LogicalAndExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: LogicalAndExpression) -> *FunctionLikeDeclaration;
```
## LogicalAndExpression::getLeftOperand

```java
/**
* Get the left operand of this binary expression.
*/
```
```rust
pub fn getLeftOperand(self: LogicalAndExpression) -> Expression;
```
## LogicalAndExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: LogicalAndExpression, level: int) -> Node;
```
## LogicalAndExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: LogicalAndExpression) -> File;
```
## LogicalAndExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: LogicalAndExpression) -> string;
```
## LogicalAndExpression::getAnOperand

```rust
pub fn getAnOperand(self: LogicalAndExpression) -> *Expression;
```
## LogicalAndExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: LogicalAndExpression, i: int) -> Modifier;
```
## LogicalAndExpression::getRightOperand

```java
/**
* Get the right operand of this binary expression.
*/
```
```rust
pub fn getRightOperand(self: LogicalAndExpression) -> Expression;
```
## LogicalAndExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: LogicalAndExpression) -> int;
```
## LogicalAndExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: LogicalAndExpression) -> string;
```
## LogicalAndExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *LogicalAndExpression;
```
## LogicalAndExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: LogicalAndExpression) -> Location;
```
## LogicalAndExpression::getOperator

```java
/**
* Get the operator of this binary expression.
*/
```
```rust
pub fn getOperator(self: LogicalAndExpression) -> BinaryOperator;
```
## LogicalAndExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: LogicalAndExpression) -> *Node;
```
## LogicalAndExpression::getLeft

```java
/**
* Get the left operand of this binary expression. An alias of `getLeftOperand`.
*/
```
```rust
pub fn getLeft(self: LogicalAndExpression) -> Expression;
```
## LogicalAndExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: LogicalAndExpression) -> int;
```
## LogicalAndExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: LogicalAndExpression) -> *Modifier;
```
## LogicalAndExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: LogicalAndExpression) -> int;
```
## LogicalAndExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: LogicalAndExpression) -> Node;
```
## LogicalAndExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: LogicalAndExpression) -> FunctionLikeDeclaration;
```
## LogicalAndExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: LogicalAndExpression) -> int;
```
## LogicalAndExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: LogicalAndExpression) -> int;
```
## LogicalAndExpression::getIndex

```rust
pub fn getIndex(self: LogicalAndExpression) -> int;
```
## LogicalAndExpression::getRight

```java
/**
* Get the right operand of this binary expression. An alias of `getRightOperand`
*/
```
```rust
pub fn getRight(self: LogicalAndExpression) -> Expression;
```
