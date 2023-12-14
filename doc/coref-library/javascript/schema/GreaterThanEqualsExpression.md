# GreaterThanEqualsExpression

Primary key: `id: int`

```rust
schema GreaterThanEqualsExpression {
  @primary id: int,
}
```
## GreaterThanEqualsExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: GreaterThanEqualsExpression) -> Symbol;
```
## GreaterThanEqualsExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: GreaterThanEqualsExpression) -> *Decorator;
```
## GreaterThanEqualsExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: GreaterThanEqualsExpression) -> *Comment;
```
## GreaterThanEqualsExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: GreaterThanEqualsExpression) -> *Node;
```
## GreaterThanEqualsExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: GreaterThanEqualsExpression) -> int;
```
## GreaterThanEqualsExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: GreaterThanEqualsExpression) -> *Comment;
```
## GreaterThanEqualsExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: GreaterThanEqualsExpression) -> *Comment;
```
## GreaterThanEqualsExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: GreaterThanEqualsExpression) -> Node;
```
## GreaterThanEqualsExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: GreaterThanEqualsExpression) -> *Node;
```
## GreaterThanEqualsExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: GreaterThanEqualsExpression, i: int) -> Decorator;
```
## GreaterThanEqualsExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: GreaterThanEqualsExpression) -> TopLevelDO;
```
## GreaterThanEqualsExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: GreaterThanEqualsExpression, i: int) -> Node;
```
## GreaterThanEqualsExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: GreaterThanEqualsExpression) -> int;
```
## GreaterThanEqualsExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: GreaterThanEqualsExpression, level: int) -> *Node;
```
## GreaterThanEqualsExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: GreaterThanEqualsExpression) -> *FunctionLikeDeclaration;
```
## GreaterThanEqualsExpression::getLeftOperand

```java
/**
* Get the left operand of this binary expression.
*/
```
```rust
pub fn getLeftOperand(self: GreaterThanEqualsExpression) -> Expression;
```
## GreaterThanEqualsExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: GreaterThanEqualsExpression, level: int) -> Node;
```
## GreaterThanEqualsExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: GreaterThanEqualsExpression) -> File;
```
## GreaterThanEqualsExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: GreaterThanEqualsExpression) -> string;
```
## GreaterThanEqualsExpression::getAnOperand

```rust
pub fn getAnOperand(self: GreaterThanEqualsExpression) -> *Expression;
```
## GreaterThanEqualsExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: GreaterThanEqualsExpression, i: int) -> Modifier;
```
## GreaterThanEqualsExpression::getRightOperand

```java
/**
* Get the right operand of this binary expression.
*/
```
```rust
pub fn getRightOperand(self: GreaterThanEqualsExpression) -> Expression;
```
## GreaterThanEqualsExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: GreaterThanEqualsExpression) -> int;
```
## GreaterThanEqualsExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: GreaterThanEqualsExpression) -> string;
```
## GreaterThanEqualsExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *GreaterThanEqualsExpression;
```
## GreaterThanEqualsExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: GreaterThanEqualsExpression) -> Location;
```
## GreaterThanEqualsExpression::getOperator

```java
/**
* Get the operator of this binary expression.
*/
```
```rust
pub fn getOperator(self: GreaterThanEqualsExpression) -> BinaryOperator;
```
## GreaterThanEqualsExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: GreaterThanEqualsExpression) -> *Node;
```
## GreaterThanEqualsExpression::getLeft

```java
/**
* Get the left operand of this binary expression. An alias of `getLeftOperand`.
*/
```
```rust
pub fn getLeft(self: GreaterThanEqualsExpression) -> Expression;
```
## GreaterThanEqualsExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: GreaterThanEqualsExpression) -> int;
```
## GreaterThanEqualsExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: GreaterThanEqualsExpression) -> *Modifier;
```
## GreaterThanEqualsExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: GreaterThanEqualsExpression) -> int;
```
## GreaterThanEqualsExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: GreaterThanEqualsExpression) -> Node;
```
## GreaterThanEqualsExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: GreaterThanEqualsExpression) -> FunctionLikeDeclaration;
```
## GreaterThanEqualsExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: GreaterThanEqualsExpression) -> int;
```
## GreaterThanEqualsExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: GreaterThanEqualsExpression) -> int;
```
## GreaterThanEqualsExpression::getIndex

```rust
pub fn getIndex(self: GreaterThanEqualsExpression) -> int;
```
## GreaterThanEqualsExpression::getRight

```java
/**
* Get the right operand of this binary expression. An alias of `getRightOperand`
*/
```
```rust
pub fn getRight(self: GreaterThanEqualsExpression) -> Expression;
```
