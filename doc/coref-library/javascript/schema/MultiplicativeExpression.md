# MultiplicativeExpression

Primary key: `id: int`

```rust
schema MultiplicativeExpression {
  @primary id: int,
}
```
## MultiplicativeExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: MultiplicativeExpression) -> int;
```
## MultiplicativeExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: MultiplicativeExpression) -> int;
```
## MultiplicativeExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: MultiplicativeExpression) -> Node;
```
## MultiplicativeExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: MultiplicativeExpression) -> FunctionLikeDeclaration;
```
## MultiplicativeExpression::getLeft

```java
/**
* Get the left operand of this binary expression. An alias of `getLeftOperand`.
*/
```
```rust
pub fn getLeft(self: MultiplicativeExpression) -> Expression;
```
## MultiplicativeExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: MultiplicativeExpression) -> *Node;
```
## MultiplicativeExpression::getOperator

```java
/**
* Get the operator of this binary expression.
*/
```
```rust
pub fn getOperator(self: MultiplicativeExpression) -> BinaryOperator;
```
## MultiplicativeExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: MultiplicativeExpression) -> Location;
```
## MultiplicativeExpression::getRight

```java
/**
* Get the right operand of this binary expression. An alias of `getRightOperand`
*/
```
```rust
pub fn getRight(self: MultiplicativeExpression) -> Expression;
```
## MultiplicativeExpression::getIndex

```rust
pub fn getIndex(self: MultiplicativeExpression) -> int;
```
## MultiplicativeExpression::getAnOperand

```rust
pub fn getAnOperand(self: MultiplicativeExpression) -> *Expression;
```
## MultiplicativeExpression::getRightOperand

```java
/**
* Get the right operand of this binary expression.
*/
```
```rust
pub fn getRightOperand(self: MultiplicativeExpression) -> Expression;
```
## MultiplicativeExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: MultiplicativeExpression, i: int) -> Modifier;
```
## MultiplicativeExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: MultiplicativeExpression) -> string;
```
## MultiplicativeExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: MultiplicativeExpression) -> string;
```
## MultiplicativeExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: MultiplicativeExpression) -> int;
```
## MultiplicativeExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: MultiplicativeExpression) -> File;
```
## MultiplicativeExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: MultiplicativeExpression, level: int) -> Node;
```
## MultiplicativeExpression::getLeftOperand

```java
/**
* Get the left operand of this binary expression.
*/
```
```rust
pub fn getLeftOperand(self: MultiplicativeExpression) -> Expression;
```
## MultiplicativeExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: MultiplicativeExpression) -> *FunctionLikeDeclaration;
```
## MultiplicativeExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: MultiplicativeExpression, level: int) -> *Node;
```
## MultiplicativeExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: MultiplicativeExpression) -> int;
```
## MultiplicativeExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: MultiplicativeExpression) -> *Modifier;
```
## MultiplicativeExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: MultiplicativeExpression) -> int;
```
## MultiplicativeExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: MultiplicativeExpression) -> int;
```
## MultiplicativeExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: MultiplicativeExpression, i: int) -> Node;
```
## MultiplicativeExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: MultiplicativeExpression) -> TopLevelDO;
```
## MultiplicativeExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: MultiplicativeExpression, i: int) -> Decorator;
```
## MultiplicativeExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: MultiplicativeExpression) -> *Node;
```
## MultiplicativeExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: MultiplicativeExpression) -> Node;
```
## MultiplicativeExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: MultiplicativeExpression) -> *Comment;
```
## MultiplicativeExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: MultiplicativeExpression) -> *Comment;
```
## MultiplicativeExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: MultiplicativeExpression) -> int;
```
## MultiplicativeExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: MultiplicativeExpression) -> *Node;
```
## MultiplicativeExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: MultiplicativeExpression) -> *Comment;
```
## MultiplicativeExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: MultiplicativeExpression) -> *Decorator;
```
## MultiplicativeExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: MultiplicativeExpression) -> Symbol;
```
## MultiplicativeExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *MultiplicativeExpression;
```
