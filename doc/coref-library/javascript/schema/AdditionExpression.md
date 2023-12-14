# AdditionExpression

Primary key: `id: int`

```rust
schema AdditionExpression {
  @primary id: int,
}
```
## AdditionExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: AdditionExpression) -> Symbol;
```
## AdditionExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: AdditionExpression) -> *Decorator;
```
## AdditionExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: AdditionExpression) -> *Comment;
```
## AdditionExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: AdditionExpression) -> *Node;
```
## AdditionExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: AdditionExpression) -> int;
```
## AdditionExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: AdditionExpression) -> *Comment;
```
## AdditionExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: AdditionExpression) -> *Comment;
```
## AdditionExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: AdditionExpression) -> Node;
```
## AdditionExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: AdditionExpression) -> *Node;
```
## AdditionExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: AdditionExpression, i: int) -> Decorator;
```
## AdditionExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: AdditionExpression) -> TopLevelDO;
```
## AdditionExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: AdditionExpression, i: int) -> Node;
```
## AdditionExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: AdditionExpression) -> int;
```
## AdditionExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: AdditionExpression, level: int) -> *Node;
```
## AdditionExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: AdditionExpression) -> *FunctionLikeDeclaration;
```
## AdditionExpression::getLeftOperand

```java
/**
* Get the left operand of this binary expression.
*/
```
```rust
pub fn getLeftOperand(self: AdditionExpression) -> Expression;
```
## AdditionExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: AdditionExpression, level: int) -> Node;
```
## AdditionExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: AdditionExpression) -> File;
```
## AdditionExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: AdditionExpression) -> string;
```
## AdditionExpression::getAnOperand

```rust
pub fn getAnOperand(self: AdditionExpression) -> *Expression;
```
## AdditionExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: AdditionExpression, i: int) -> Modifier;
```
## AdditionExpression::getRightOperand

```java
/**
* Get the right operand of this binary expression.
*/
```
```rust
pub fn getRightOperand(self: AdditionExpression) -> Expression;
```
## AdditionExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: AdditionExpression) -> int;
```
## AdditionExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: AdditionExpression) -> string;
```
## AdditionExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *AdditionExpression;
```
## AdditionExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: AdditionExpression) -> Location;
```
## AdditionExpression::getOperator

```java
/**
* Get the operator of this binary expression.
*/
```
```rust
pub fn getOperator(self: AdditionExpression) -> BinaryOperator;
```
## AdditionExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: AdditionExpression) -> *Node;
```
## AdditionExpression::getLeft

```java
/**
* Get the left operand of this binary expression. An alias of `getLeftOperand`.
*/
```
```rust
pub fn getLeft(self: AdditionExpression) -> Expression;
```
## AdditionExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: AdditionExpression) -> int;
```
## AdditionExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: AdditionExpression) -> *Modifier;
```
## AdditionExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: AdditionExpression) -> int;
```
## AdditionExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: AdditionExpression) -> Node;
```
## AdditionExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: AdditionExpression) -> FunctionLikeDeclaration;
```
## AdditionExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: AdditionExpression) -> int;
```
## AdditionExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: AdditionExpression) -> int;
```
## AdditionExpression::getIndex

```rust
pub fn getIndex(self: AdditionExpression) -> int;
```
## AdditionExpression::getRight

```java
/**
* Get the right operand of this binary expression. An alias of `getRightOperand`
*/
```
```rust
pub fn getRight(self: AdditionExpression) -> Expression;
```
