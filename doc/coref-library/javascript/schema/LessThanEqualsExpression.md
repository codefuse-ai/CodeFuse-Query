# LessThanEqualsExpression

Inherit from [RelationalExpression](./RelationalExpression.md)

Primary key: `id: int`

```rust
schema LessThanEqualsExpression extends RelationalExpression {
  @primary id: int
}
```
## LessThanEqualsExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: LessThanEqualsExpression) -> Symbol;
```
## LessThanEqualsExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: LessThanEqualsExpression) -> *Decorator;
```
## LessThanEqualsExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: LessThanEqualsExpression) -> *Comment;
```
## LessThanEqualsExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: LessThanEqualsExpression) -> *Node;
```
## LessThanEqualsExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: LessThanEqualsExpression) -> int;
```
## LessThanEqualsExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: LessThanEqualsExpression) -> *Comment;
```
## LessThanEqualsExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: LessThanEqualsExpression) -> *Comment;
```
## LessThanEqualsExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: LessThanEqualsExpression) -> Node;
```
## LessThanEqualsExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: LessThanEqualsExpression) -> *Node;
```
## LessThanEqualsExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: LessThanEqualsExpression, i: int) -> Decorator;
```
## LessThanEqualsExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: LessThanEqualsExpression) -> TopLevelDO;
```
## LessThanEqualsExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: LessThanEqualsExpression, i: int) -> Node;
```
## LessThanEqualsExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: LessThanEqualsExpression) -> int;
```
## LessThanEqualsExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: LessThanEqualsExpression, level: int) -> *Node;
```
## LessThanEqualsExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: LessThanEqualsExpression) -> *FunctionLikeDeclaration;
```
## LessThanEqualsExpression::getLeftOperand

```java
/**
* Get the left operand of this binary expression.
*/
```
```rust
pub fn getLeftOperand(self: LessThanEqualsExpression) -> Expression;
```
## LessThanEqualsExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: LessThanEqualsExpression, level: int) -> Node;
```
## LessThanEqualsExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: LessThanEqualsExpression) -> File;
```
## LessThanEqualsExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: LessThanEqualsExpression) -> string;
```
## LessThanEqualsExpression::getAnOperand

```rust
pub fn getAnOperand(self: LessThanEqualsExpression) -> *Expression;
```
## LessThanEqualsExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: LessThanEqualsExpression, i: int) -> Modifier;
```
## LessThanEqualsExpression::getRightOperand

```java
/**
* Get the right operand of this binary expression.
*/
```
```rust
pub fn getRightOperand(self: LessThanEqualsExpression) -> Expression;
```
## LessThanEqualsExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: LessThanEqualsExpression) -> int;
```
## LessThanEqualsExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: LessThanEqualsExpression) -> string;
```
## LessThanEqualsExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *LessThanEqualsExpression;
```
## LessThanEqualsExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: LessThanEqualsExpression) -> Location;
```
## LessThanEqualsExpression::getOperator

```java
/**
* Get the operator of this binary expression.
*/
```
```rust
pub fn getOperator(self: LessThanEqualsExpression) -> BinaryOperator;
```
## LessThanEqualsExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: LessThanEqualsExpression) -> *Node;
```
## LessThanEqualsExpression::getLeft

```java
/**
* Get the left operand of this binary expression. An alias of `getLeftOperand`.
*/
```
```rust
pub fn getLeft(self: LessThanEqualsExpression) -> Expression;
```
## LessThanEqualsExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: LessThanEqualsExpression) -> int;
```
## LessThanEqualsExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: LessThanEqualsExpression) -> *Modifier;
```
## LessThanEqualsExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: LessThanEqualsExpression) -> int;
```
## LessThanEqualsExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: LessThanEqualsExpression) -> Node;
```
## LessThanEqualsExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: LessThanEqualsExpression) -> FunctionLikeDeclaration;
```
## LessThanEqualsExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: LessThanEqualsExpression) -> int;
```
## LessThanEqualsExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: LessThanEqualsExpression) -> int;
```
## LessThanEqualsExpression::getIndex

```rust
pub fn getIndex(self: LessThanEqualsExpression) -> int;
```
## LessThanEqualsExpression::getRight

```java
/**
* Get the right operand of this binary expression. An alias of `getRightOperand`
*/
```
```rust
pub fn getRight(self: LessThanEqualsExpression) -> Expression;
```
