# CommaExpression

Primary key: `id: int`

```rust
schema CommaExpression {
  @primary id: int,
}
```
## CommaExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: CommaExpression) -> int;
```
## CommaExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: CommaExpression) -> int;
```
## CommaExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: CommaExpression) -> Node;
```
## CommaExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: CommaExpression) -> FunctionLikeDeclaration;
```
## CommaExpression::getLeft

```java
/**
* Get the left operand of this binary expression. An alias of `getLeftOperand`.
*/
```
```rust
pub fn getLeft(self: CommaExpression) -> Expression;
```
## CommaExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: CommaExpression) -> *Node;
```
## CommaExpression::getOperator

```java
/**
* Get the operator of this binary expression.
*/
```
```rust
pub fn getOperator(self: CommaExpression) -> BinaryOperator;
```
## CommaExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: CommaExpression) -> Location;
```
## CommaExpression::getRight

```java
/**
* Get the right operand of this binary expression. An alias of `getRightOperand`
*/
```
```rust
pub fn getRight(self: CommaExpression) -> Expression;
```
## CommaExpression::getIndex

```rust
pub fn getIndex(self: CommaExpression) -> int;
```
## CommaExpression::getAnOperand

```rust
pub fn getAnOperand(self: CommaExpression) -> *Expression;
```
## CommaExpression::getRightOperand

```java
/**
* Get the right operand of this binary expression.
*/
```
```rust
pub fn getRightOperand(self: CommaExpression) -> Expression;
```
## CommaExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: CommaExpression, i: int) -> Modifier;
```
## CommaExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: CommaExpression) -> string;
```
## CommaExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: CommaExpression) -> string;
```
## CommaExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: CommaExpression) -> int;
```
## CommaExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: CommaExpression) -> File;
```
## CommaExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: CommaExpression, level: int) -> Node;
```
## CommaExpression::getLeftOperand

```java
/**
* Get the left operand of this binary expression.
*/
```
```rust
pub fn getLeftOperand(self: CommaExpression) -> Expression;
```
## CommaExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: CommaExpression) -> *FunctionLikeDeclaration;
```
## CommaExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: CommaExpression, level: int) -> *Node;
```
## CommaExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: CommaExpression) -> int;
```
## CommaExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: CommaExpression) -> *Modifier;
```
## CommaExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: CommaExpression) -> int;
```
## CommaExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: CommaExpression) -> int;
```
## CommaExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: CommaExpression, i: int) -> Node;
```
## CommaExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: CommaExpression) -> TopLevelDO;
```
## CommaExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: CommaExpression, i: int) -> Decorator;
```
## CommaExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: CommaExpression) -> *Node;
```
## CommaExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: CommaExpression) -> Node;
```
## CommaExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: CommaExpression) -> *Comment;
```
## CommaExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: CommaExpression) -> *Comment;
```
## CommaExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: CommaExpression) -> int;
```
## CommaExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: CommaExpression) -> *Node;
```
## CommaExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: CommaExpression) -> *Comment;
```
## CommaExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: CommaExpression) -> *Decorator;
```
## CommaExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: CommaExpression) -> Symbol;
```
## CommaExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *CommaExpression;
```
