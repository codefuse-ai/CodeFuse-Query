# GreaterThanExpression

Inherit from [RelationalExpression](./RelationalExpression.md)

Primary key: `id: int`

```rust
schema GreaterThanExpression extends RelationalExpression {
  @primary id: int,
}
```
## GreaterThanExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: GreaterThanExpression) -> Symbol;
```
## GreaterThanExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: GreaterThanExpression) -> *Decorator;
```
## GreaterThanExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: GreaterThanExpression) -> *Comment;
```
## GreaterThanExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: GreaterThanExpression) -> *Node;
```
## GreaterThanExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: GreaterThanExpression) -> int;
```
## GreaterThanExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: GreaterThanExpression) -> *Comment;
```
## GreaterThanExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: GreaterThanExpression) -> *Comment;
```
## GreaterThanExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: GreaterThanExpression) -> Node;
```
## GreaterThanExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: GreaterThanExpression) -> *Node;
```
## GreaterThanExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: GreaterThanExpression, i: int) -> Decorator;
```
## GreaterThanExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: GreaterThanExpression) -> TopLevelDO;
```
## GreaterThanExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: GreaterThanExpression, i: int) -> Node;
```
## GreaterThanExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: GreaterThanExpression) -> int;
```
## GreaterThanExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: GreaterThanExpression, level: int) -> *Node;
```
## GreaterThanExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: GreaterThanExpression) -> *FunctionLikeDeclaration;
```
## GreaterThanExpression::getLeftOperand

```java
/**
* Get the left operand of this binary expression.
*/
```
```rust
pub fn getLeftOperand(self: GreaterThanExpression) -> Expression;
```
## GreaterThanExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: GreaterThanExpression, level: int) -> Node;
```
## GreaterThanExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: GreaterThanExpression) -> File;
```
## GreaterThanExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: GreaterThanExpression) -> string;
```
## GreaterThanExpression::getAnOperand

```rust
pub fn getAnOperand(self: GreaterThanExpression) -> *Expression;
```
## GreaterThanExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: GreaterThanExpression, i: int) -> Modifier;
```
## GreaterThanExpression::getRightOperand

```java
/**
* Get the right operand of this binary expression.
*/
```
```rust
pub fn getRightOperand(self: GreaterThanExpression) -> Expression;
```
## GreaterThanExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: GreaterThanExpression) -> int;
```
## GreaterThanExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: GreaterThanExpression) -> string;
```
## GreaterThanExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *GreaterThanExpression;
```
## GreaterThanExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: GreaterThanExpression) -> Location;
```
## GreaterThanExpression::getOperator

```java
/**
* Get the operator of this binary expression.
*/
```
```rust
pub fn getOperator(self: GreaterThanExpression) -> BinaryOperator;
```
## GreaterThanExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: GreaterThanExpression) -> *Node;
```
## GreaterThanExpression::getLeft

```java
/**
* Get the left operand of this binary expression. An alias of `getLeftOperand`.
*/
```
```rust
pub fn getLeft(self: GreaterThanExpression) -> Expression;
```
## GreaterThanExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: GreaterThanExpression) -> int;
```
## GreaterThanExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: GreaterThanExpression) -> *Modifier;
```
## GreaterThanExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: GreaterThanExpression) -> int;
```
## GreaterThanExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: GreaterThanExpression) -> Node;
```
## GreaterThanExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: GreaterThanExpression) -> FunctionLikeDeclaration;
```
## GreaterThanExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: GreaterThanExpression) -> int;
```
## GreaterThanExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: GreaterThanExpression) -> int;
```
## GreaterThanExpression::getIndex

```rust
pub fn getIndex(self: GreaterThanExpression) -> int;
```
## GreaterThanExpression::getRight

```java
/**
* Get the right operand of this binary expression. An alias of `getRightOperand`
*/
```
```rust
pub fn getRight(self: GreaterThanExpression) -> Expression;
```
