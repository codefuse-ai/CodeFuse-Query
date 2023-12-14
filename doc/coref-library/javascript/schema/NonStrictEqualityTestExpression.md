# NonStrictEqualityTestExpression

Inherit from [EqualityTestExpression](./EqualityTestExpression.md)

Primary key: `id: int`

```rust
schema NonStrictEqualityTestExpression extends EqualityTestExpression {
  @primary id: int,
}
```
## NonStrictEqualityTestExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: NonStrictEqualityTestExpression) -> Symbol;
```
## NonStrictEqualityTestExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: NonStrictEqualityTestExpression) -> *Decorator;
```
## NonStrictEqualityTestExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: NonStrictEqualityTestExpression) -> *Comment;
```
## NonStrictEqualityTestExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: NonStrictEqualityTestExpression) -> *Node;
```
## NonStrictEqualityTestExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: NonStrictEqualityTestExpression) -> int;
```
## NonStrictEqualityTestExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: NonStrictEqualityTestExpression) -> *Comment;
```
## NonStrictEqualityTestExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: NonStrictEqualityTestExpression) -> *Comment;
```
## NonStrictEqualityTestExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: NonStrictEqualityTestExpression) -> Node;
```
## NonStrictEqualityTestExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: NonStrictEqualityTestExpression) -> *Node;
```
## NonStrictEqualityTestExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: NonStrictEqualityTestExpression, i: int) -> Decorator;
```
## NonStrictEqualityTestExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: NonStrictEqualityTestExpression) -> TopLevelDO;
```
## NonStrictEqualityTestExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: NonStrictEqualityTestExpression, i: int) -> Node;
```
## NonStrictEqualityTestExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: NonStrictEqualityTestExpression) -> int;
```
## NonStrictEqualityTestExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: NonStrictEqualityTestExpression, level: int) -> *Node;
```
## NonStrictEqualityTestExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: NonStrictEqualityTestExpression) -> *FunctionLikeDeclaration;
```
## NonStrictEqualityTestExpression::getLeftOperand

```java
/**
* Get the left operand of this binary expression.
*/
```
```rust
pub fn getLeftOperand(self: NonStrictEqualityTestExpression) -> Expression;
```
## NonStrictEqualityTestExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: NonStrictEqualityTestExpression, level: int) -> Node;
```
## NonStrictEqualityTestExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: NonStrictEqualityTestExpression) -> File;
```
## NonStrictEqualityTestExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: NonStrictEqualityTestExpression) -> string;
```
## NonStrictEqualityTestExpression::getAnOperand

```rust
pub fn getAnOperand(self: NonStrictEqualityTestExpression) -> *Expression;
```
## NonStrictEqualityTestExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: NonStrictEqualityTestExpression, i: int) -> Modifier;
```
## NonStrictEqualityTestExpression::getRightOperand

```java
/**
* Get the right operand of this binary expression.
*/
```
```rust
pub fn getRightOperand(self: NonStrictEqualityTestExpression) -> Expression;
```
## NonStrictEqualityTestExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: NonStrictEqualityTestExpression) -> int;
```
## NonStrictEqualityTestExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: NonStrictEqualityTestExpression) -> string;
```
## NonStrictEqualityTestExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *NonStrictEqualityTestExpression;
```
## NonStrictEqualityTestExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: NonStrictEqualityTestExpression) -> Location;
```
## NonStrictEqualityTestExpression::getOperator

```java
/**
* Get the operator of this binary expression.
*/
```
```rust
pub fn getOperator(self: NonStrictEqualityTestExpression) -> BinaryOperator;
```
## NonStrictEqualityTestExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: NonStrictEqualityTestExpression) -> *Node;
```
## NonStrictEqualityTestExpression::getLeft

```java
/**
* Get the left operand of this binary expression. An alias of `getLeftOperand`.
*/
```
```rust
pub fn getLeft(self: NonStrictEqualityTestExpression) -> Expression;
```
## NonStrictEqualityTestExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: NonStrictEqualityTestExpression) -> int;
```
## NonStrictEqualityTestExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: NonStrictEqualityTestExpression) -> *Modifier;
```
## NonStrictEqualityTestExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: NonStrictEqualityTestExpression) -> int;
```
## NonStrictEqualityTestExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: NonStrictEqualityTestExpression) -> Node;
```
## NonStrictEqualityTestExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: NonStrictEqualityTestExpression) -> FunctionLikeDeclaration;
```
## NonStrictEqualityTestExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: NonStrictEqualityTestExpression) -> int;
```
## NonStrictEqualityTestExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: NonStrictEqualityTestExpression) -> int;
```
## NonStrictEqualityTestExpression::getIndex

```rust
pub fn getIndex(self: NonStrictEqualityTestExpression) -> int;
```
## NonStrictEqualityTestExpression::getRight

```java
/**
* Get the right operand of this binary expression. An alias of `getRightOperand`
*/
```
```rust
pub fn getRight(self: NonStrictEqualityTestExpression) -> Expression;
```
