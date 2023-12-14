# BitwiseXorExpression

Primary key: `id: int`

```rust
schema BitwiseXorExpression {
  @primary id: int,
}
```
## BitwiseXorExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: BitwiseXorExpression) -> Symbol;
```
## BitwiseXorExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: BitwiseXorExpression) -> *Decorator;
```
## BitwiseXorExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: BitwiseXorExpression) -> *Comment;
```
## BitwiseXorExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: BitwiseXorExpression) -> *Node;
```
## BitwiseXorExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: BitwiseXorExpression) -> int;
```
## BitwiseXorExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: BitwiseXorExpression) -> *Comment;
```
## BitwiseXorExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: BitwiseXorExpression) -> *Comment;
```
## BitwiseXorExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: BitwiseXorExpression) -> Node;
```
## BitwiseXorExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: BitwiseXorExpression) -> *Node;
```
## BitwiseXorExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: BitwiseXorExpression, i: int) -> Decorator;
```
## BitwiseXorExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: BitwiseXorExpression) -> TopLevelDO;
```
## BitwiseXorExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: BitwiseXorExpression, i: int) -> Node;
```
## BitwiseXorExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: BitwiseXorExpression) -> int;
```
## BitwiseXorExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: BitwiseXorExpression, level: int) -> *Node;
```
## BitwiseXorExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: BitwiseXorExpression) -> *FunctionLikeDeclaration;
```
## BitwiseXorExpression::getLeftOperand

```java
/**
* Get the left operand of this binary expression.
*/
```
```rust
pub fn getLeftOperand(self: BitwiseXorExpression) -> Expression;
```
## BitwiseXorExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: BitwiseXorExpression, level: int) -> Node;
```
## BitwiseXorExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: BitwiseXorExpression) -> File;
```
## BitwiseXorExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: BitwiseXorExpression) -> string;
```
## BitwiseXorExpression::getAnOperand

```rust
pub fn getAnOperand(self: BitwiseXorExpression) -> *Expression;
```
## BitwiseXorExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: BitwiseXorExpression, i: int) -> Modifier;
```
## BitwiseXorExpression::getRightOperand

```java
/**
* Get the right operand of this binary expression.
*/
```
```rust
pub fn getRightOperand(self: BitwiseXorExpression) -> Expression;
```
## BitwiseXorExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: BitwiseXorExpression) -> int;
```
## BitwiseXorExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: BitwiseXorExpression) -> string;
```
## BitwiseXorExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *BitwiseXorExpression;
```
## BitwiseXorExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: BitwiseXorExpression) -> Location;
```
## BitwiseXorExpression::getOperator

```java
/**
* Get the operator of this binary expression.
*/
```
```rust
pub fn getOperator(self: BitwiseXorExpression) -> BinaryOperator;
```
## BitwiseXorExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: BitwiseXorExpression) -> *Node;
```
## BitwiseXorExpression::getLeft

```java
/**
* Get the left operand of this binary expression. An alias of `getLeftOperand`.
*/
```
```rust
pub fn getLeft(self: BitwiseXorExpression) -> Expression;
```
## BitwiseXorExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: BitwiseXorExpression) -> int;
```
## BitwiseXorExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: BitwiseXorExpression) -> *Modifier;
```
## BitwiseXorExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: BitwiseXorExpression) -> int;
```
## BitwiseXorExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: BitwiseXorExpression) -> Node;
```
## BitwiseXorExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: BitwiseXorExpression) -> FunctionLikeDeclaration;
```
## BitwiseXorExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: BitwiseXorExpression) -> int;
```
## BitwiseXorExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: BitwiseXorExpression) -> int;
```
## BitwiseXorExpression::getIndex

```rust
pub fn getIndex(self: BitwiseXorExpression) -> int;
```
## BitwiseXorExpression::getRight

```java
/**
* Get the right operand of this binary expression. An alias of `getRightOperand`
*/
```
```rust
pub fn getRight(self: BitwiseXorExpression) -> Expression;
```
