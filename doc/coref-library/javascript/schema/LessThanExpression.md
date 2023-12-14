# LessThanExpression

Primary key: `id: int`

```rust
schema LessThanExpression {
  @primary id: int,
}
```
## LessThanExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: LessThanExpression) -> Symbol;
```
## LessThanExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: LessThanExpression) -> *Decorator;
```
## LessThanExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: LessThanExpression) -> *Comment;
```
## LessThanExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: LessThanExpression) -> *Node;
```
## LessThanExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: LessThanExpression) -> int;
```
## LessThanExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: LessThanExpression) -> *Comment;
```
## LessThanExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: LessThanExpression) -> *Comment;
```
## LessThanExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: LessThanExpression) -> Node;
```
## LessThanExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: LessThanExpression) -> *Node;
```
## LessThanExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: LessThanExpression, i: int) -> Decorator;
```
## LessThanExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: LessThanExpression) -> TopLevelDO;
```
## LessThanExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: LessThanExpression, i: int) -> Node;
```
## LessThanExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: LessThanExpression) -> int;
```
## LessThanExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: LessThanExpression, level: int) -> *Node;
```
## LessThanExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: LessThanExpression) -> *FunctionLikeDeclaration;
```
## LessThanExpression::getLeftOperand

```java
/**
* Get the left operand of this binary expression.
*/
```
```rust
pub fn getLeftOperand(self: LessThanExpression) -> Expression;
```
## LessThanExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: LessThanExpression, level: int) -> Node;
```
## LessThanExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: LessThanExpression) -> File;
```
## LessThanExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: LessThanExpression) -> string;
```
## LessThanExpression::getAnOperand

```rust
pub fn getAnOperand(self: LessThanExpression) -> *Expression;
```
## LessThanExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: LessThanExpression, i: int) -> Modifier;
```
## LessThanExpression::getRightOperand

```java
/**
* Get the right operand of this binary expression.
*/
```
```rust
pub fn getRightOperand(self: LessThanExpression) -> Expression;
```
## LessThanExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: LessThanExpression) -> int;
```
## LessThanExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: LessThanExpression) -> string;
```
## LessThanExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *LessThanExpression;
```
## LessThanExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: LessThanExpression) -> Location;
```
## LessThanExpression::getOperator

```java
/**
* Get the operator of this binary expression.
*/
```
```rust
pub fn getOperator(self: LessThanExpression) -> BinaryOperator;
```
## LessThanExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: LessThanExpression) -> *Node;
```
## LessThanExpression::getLeft

```java
/**
* Get the left operand of this binary expression. An alias of `getLeftOperand`.
*/
```
```rust
pub fn getLeft(self: LessThanExpression) -> Expression;
```
## LessThanExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: LessThanExpression) -> int;
```
## LessThanExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: LessThanExpression) -> *Modifier;
```
## LessThanExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: LessThanExpression) -> int;
```
## LessThanExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: LessThanExpression) -> Node;
```
## LessThanExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: LessThanExpression) -> FunctionLikeDeclaration;
```
## LessThanExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: LessThanExpression) -> int;
```
## LessThanExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: LessThanExpression) -> int;
```
## LessThanExpression::getIndex

```rust
pub fn getIndex(self: LessThanExpression) -> int;
```
## LessThanExpression::getRight

```java
/**
* Get the right operand of this binary expression. An alias of `getRightOperand`
*/
```
```rust
pub fn getRight(self: LessThanExpression) -> Expression;
```
