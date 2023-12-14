# ExponentiationExpression

Inherit from [BinaryExpression](./BinaryExpression.md)

Primary key: `id: int`

```rust
schema ExponentiationExpression extends BinaryExpression {
  @primary id: int,
}
```
## ExponentiationExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: ExponentiationExpression) -> int;
```
## ExponentiationExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ExponentiationExpression) -> int;
```
## ExponentiationExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: ExponentiationExpression) -> Node;
```
## ExponentiationExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: ExponentiationExpression) -> FunctionLikeDeclaration;
```
## ExponentiationExpression::getLeft

```java
/**
* Get the left operand of this binary expression. An alias of `getLeftOperand`.
*/
```
```rust
pub fn getLeft(self: ExponentiationExpression) -> Expression;
```
## ExponentiationExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: ExponentiationExpression) -> *Node;
```
## ExponentiationExpression::getOperator

```java
/**
* Get the operator of this binary expression.
*/
```
```rust
pub fn getOperator(self: ExponentiationExpression) -> BinaryOperator;
```
## ExponentiationExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: ExponentiationExpression) -> Location;
```
## ExponentiationExpression::getRight

```java
/**
* Get the right operand of this binary expression. An alias of `getRightOperand`
*/
```
```rust
pub fn getRight(self: ExponentiationExpression) -> Expression;
```
## ExponentiationExpression::getIndex

```rust
pub fn getIndex(self: ExponentiationExpression) -> int;
```
## ExponentiationExpression::getAnOperand

```rust
pub fn getAnOperand(self: ExponentiationExpression) -> *Expression;
```
## ExponentiationExpression::getRightOperand

```java
/**
* Get the right operand of this binary expression.
*/
```
```rust
pub fn getRightOperand(self: ExponentiationExpression) -> Expression;
```
## ExponentiationExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: ExponentiationExpression, i: int) -> Modifier;
```
## ExponentiationExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: ExponentiationExpression) -> string;
```
## ExponentiationExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: ExponentiationExpression) -> string;
```
## ExponentiationExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ExponentiationExpression) -> int;
```
## ExponentiationExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: ExponentiationExpression) -> File;
```
## ExponentiationExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: ExponentiationExpression, level: int) -> Node;
```
## ExponentiationExpression::getLeftOperand

```java
/**
* Get the left operand of this binary expression.
*/
```
```rust
pub fn getLeftOperand(self: ExponentiationExpression) -> Expression;
```
## ExponentiationExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ExponentiationExpression) -> *FunctionLikeDeclaration;
```
## ExponentiationExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: ExponentiationExpression, level: int) -> *Node;
```
## ExponentiationExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: ExponentiationExpression) -> int;
```
## ExponentiationExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: ExponentiationExpression) -> *Modifier;
```
## ExponentiationExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ExponentiationExpression) -> int;
```
## ExponentiationExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ExponentiationExpression) -> int;
```
## ExponentiationExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: ExponentiationExpression, i: int) -> Node;
```
## ExponentiationExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: ExponentiationExpression) -> TopLevelDO;
```
## ExponentiationExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: ExponentiationExpression, i: int) -> Decorator;
```
## ExponentiationExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: ExponentiationExpression) -> *Node;
```
## ExponentiationExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: ExponentiationExpression) -> Node;
```
## ExponentiationExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: ExponentiationExpression) -> *Comment;
```
## ExponentiationExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: ExponentiationExpression) -> *Comment;
```
## ExponentiationExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: ExponentiationExpression) -> int;
```
## ExponentiationExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: ExponentiationExpression) -> *Node;
```
## ExponentiationExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: ExponentiationExpression) -> *Comment;
```
## ExponentiationExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: ExponentiationExpression) -> *Decorator;
```
## ExponentiationExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: ExponentiationExpression) -> Symbol;
```
## ExponentiationExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *ExponentiationExpression;
```
