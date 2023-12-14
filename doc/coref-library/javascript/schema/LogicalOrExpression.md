# LogicalOrExpression

Primary key: `id: int`

```rust
schema LogicalOrExpression {
  @primary id: int,
}
```
## LogicalOrExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: LogicalOrExpression) -> Symbol;
```
## LogicalOrExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: LogicalOrExpression) -> *Decorator;
```
## LogicalOrExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: LogicalOrExpression) -> *Comment;
```
## LogicalOrExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: LogicalOrExpression) -> *Node;
```
## LogicalOrExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: LogicalOrExpression) -> int;
```
## LogicalOrExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: LogicalOrExpression) -> *Comment;
```
## LogicalOrExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: LogicalOrExpression) -> *Comment;
```
## LogicalOrExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: LogicalOrExpression) -> Node;
```
## LogicalOrExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: LogicalOrExpression) -> *Node;
```
## LogicalOrExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: LogicalOrExpression, i: int) -> Decorator;
```
## LogicalOrExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: LogicalOrExpression) -> TopLevelDO;
```
## LogicalOrExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: LogicalOrExpression, i: int) -> Node;
```
## LogicalOrExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: LogicalOrExpression) -> int;
```
## LogicalOrExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: LogicalOrExpression, level: int) -> *Node;
```
## LogicalOrExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: LogicalOrExpression) -> *FunctionLikeDeclaration;
```
## LogicalOrExpression::getLeftOperand

```java
/**
* Get the left operand of this binary expression.
*/
```
```rust
pub fn getLeftOperand(self: LogicalOrExpression) -> Expression;
```
## LogicalOrExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: LogicalOrExpression, level: int) -> Node;
```
## LogicalOrExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: LogicalOrExpression) -> File;
```
## LogicalOrExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: LogicalOrExpression) -> string;
```
## LogicalOrExpression::getAnOperand

```rust
pub fn getAnOperand(self: LogicalOrExpression) -> *Expression;
```
## LogicalOrExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: LogicalOrExpression, i: int) -> Modifier;
```
## LogicalOrExpression::getRightOperand

```java
/**
* Get the right operand of this binary expression.
*/
```
```rust
pub fn getRightOperand(self: LogicalOrExpression) -> Expression;
```
## LogicalOrExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: LogicalOrExpression) -> int;
```
## LogicalOrExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: LogicalOrExpression) -> string;
```
## LogicalOrExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *LogicalOrExpression;
```
## LogicalOrExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: LogicalOrExpression) -> Location;
```
## LogicalOrExpression::getOperator

```java
/**
* Get the operator of this binary expression.
*/
```
```rust
pub fn getOperator(self: LogicalOrExpression) -> BinaryOperator;
```
## LogicalOrExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: LogicalOrExpression) -> *Node;
```
## LogicalOrExpression::getLeft

```java
/**
* Get the left operand of this binary expression. An alias of `getLeftOperand`.
*/
```
```rust
pub fn getLeft(self: LogicalOrExpression) -> Expression;
```
## LogicalOrExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: LogicalOrExpression) -> int;
```
## LogicalOrExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: LogicalOrExpression) -> *Modifier;
```
## LogicalOrExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: LogicalOrExpression) -> int;
```
## LogicalOrExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: LogicalOrExpression) -> Node;
```
## LogicalOrExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: LogicalOrExpression) -> FunctionLikeDeclaration;
```
## LogicalOrExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: LogicalOrExpression) -> int;
```
## LogicalOrExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: LogicalOrExpression) -> int;
```
## LogicalOrExpression::getIndex

```rust
pub fn getIndex(self: LogicalOrExpression) -> int;
```
## LogicalOrExpression::getRight

```java
/**
* Get the right operand of this binary expression. An alias of `getRightOperand`
*/
```
```rust
pub fn getRight(self: LogicalOrExpression) -> Expression;
```
