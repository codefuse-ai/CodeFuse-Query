# RemainderExpression

Inherit from [MultiplicativeExpression](./MultiplicativeExpression.md)

Primary key: `id: int`

```rust
schema RemainderExpression extends MultiplicativeExpression {
  @primary id: int
}
```
## RemainderExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: RemainderExpression) -> Symbol;
```
## RemainderExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: RemainderExpression) -> *Decorator;
```
## RemainderExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: RemainderExpression) -> *Comment;
```
## RemainderExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: RemainderExpression) -> *Node;
```
## RemainderExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: RemainderExpression) -> int;
```
## RemainderExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: RemainderExpression) -> *Comment;
```
## RemainderExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: RemainderExpression) -> *Comment;
```
## RemainderExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: RemainderExpression) -> Node;
```
## RemainderExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: RemainderExpression) -> *Node;
```
## RemainderExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: RemainderExpression, i: int) -> Decorator;
```
## RemainderExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: RemainderExpression) -> TopLevelDO;
```
## RemainderExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: RemainderExpression, i: int) -> Node;
```
## RemainderExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: RemainderExpression) -> int;
```
## RemainderExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: RemainderExpression, level: int) -> *Node;
```
## RemainderExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: RemainderExpression) -> *FunctionLikeDeclaration;
```
## RemainderExpression::getLeftOperand

```java
/**
* Get the left operand of this binary expression.
*/
```
```rust
pub fn getLeftOperand(self: RemainderExpression) -> Expression;
```
## RemainderExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: RemainderExpression, level: int) -> Node;
```
## RemainderExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: RemainderExpression) -> File;
```
## RemainderExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: RemainderExpression) -> string;
```
## RemainderExpression::getAnOperand

```rust
pub fn getAnOperand(self: RemainderExpression) -> *Expression;
```
## RemainderExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: RemainderExpression, i: int) -> Modifier;
```
## RemainderExpression::getRightOperand

```java
/**
* Get the right operand of this binary expression.
*/
```
```rust
pub fn getRightOperand(self: RemainderExpression) -> Expression;
```
## RemainderExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: RemainderExpression) -> int;
```
## RemainderExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: RemainderExpression) -> string;
```
## RemainderExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *RemainderExpression;
```
## RemainderExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: RemainderExpression) -> Location;
```
## RemainderExpression::getOperator

```java
/**
* Get the operator of this binary expression.
*/
```
```rust
pub fn getOperator(self: RemainderExpression) -> BinaryOperator;
```
## RemainderExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: RemainderExpression) -> *Node;
```
## RemainderExpression::getLeft

```java
/**
* Get the left operand of this binary expression. An alias of `getLeftOperand`.
*/
```
```rust
pub fn getLeft(self: RemainderExpression) -> Expression;
```
## RemainderExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: RemainderExpression) -> int;
```
## RemainderExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: RemainderExpression) -> *Modifier;
```
## RemainderExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: RemainderExpression) -> int;
```
## RemainderExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: RemainderExpression) -> Node;
```
## RemainderExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: RemainderExpression) -> FunctionLikeDeclaration;
```
## RemainderExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: RemainderExpression) -> int;
```
## RemainderExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: RemainderExpression) -> int;
```
## RemainderExpression::getIndex

```rust
pub fn getIndex(self: RemainderExpression) -> int;
```
## RemainderExpression::getRight

```java
/**
* Get the right operand of this binary expression. An alias of `getRightOperand`
*/
```
```rust
pub fn getRight(self: RemainderExpression) -> Expression;
```
