# AdditionAssignmentExpression

Inherit from [CompoundAssignmentExpression](./CompoundAssignmentExpression.md)

Primary key: `id: int`

```rust
schema AdditionAssignmentExpression extends CompoundAssignmentExpression {
  @primary id: int
}
```
## AdditionAssignmentExpression::getRight

```java
/**
* Get the right operand of this binary expression. An alias of `getRightOperand`
*/
```
```rust
pub fn getRight(self: AdditionAssignmentExpression) -> Expression;
```
## AdditionAssignmentExpression::getIndex

```rust
pub fn getIndex(self: AdditionAssignmentExpression) -> int;
```
## AdditionAssignmentExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: AdditionAssignmentExpression) -> int;
```
## AdditionAssignmentExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: AdditionAssignmentExpression) -> int;
```
## AdditionAssignmentExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: AdditionAssignmentExpression) -> FunctionLikeDeclaration;
```
## AdditionAssignmentExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: AdditionAssignmentExpression) -> Node;
```
## AdditionAssignmentExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: AdditionAssignmentExpression) -> int;
```
## AdditionAssignmentExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: AdditionAssignmentExpression) -> *Modifier;
```
## AdditionAssignmentExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: AdditionAssignmentExpression) -> int;
```
## AdditionAssignmentExpression::getLeft

```java
/**
* Get the left operand of this binary expression. An alias of `getLeftOperand`.
*/
```
```rust
pub fn getLeft(self: AdditionAssignmentExpression) -> Expression;
```
## AdditionAssignmentExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: AdditionAssignmentExpression) -> *Node;
```
## AdditionAssignmentExpression::getOperator

```java
/**
* Get the operator of this binary expression.
*/
```
```rust
pub fn getOperator(self: AdditionAssignmentExpression) -> BinaryOperator;
```
## AdditionAssignmentExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: AdditionAssignmentExpression) -> Location;
```
## AdditionAssignmentExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: AdditionAssignmentExpression) -> string;
```
## AdditionAssignmentExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: AdditionAssignmentExpression) -> int;
```
## AdditionAssignmentExpression::getAnOperand

```rust
pub fn getAnOperand(self: AdditionAssignmentExpression) -> *Expression;
```
## AdditionAssignmentExpression::getRightOperand

```java
/**
* Get the right operand of this binary expression.
*/
```
```rust
pub fn getRightOperand(self: AdditionAssignmentExpression) -> Expression;
```
## AdditionAssignmentExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: AdditionAssignmentExpression, i: int) -> Modifier;
```
## AdditionAssignmentExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: AdditionAssignmentExpression) -> string;
```
## AdditionAssignmentExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: AdditionAssignmentExpression) -> File;
```
## AdditionAssignmentExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: AdditionAssignmentExpression, level: int) -> Node;
```
## AdditionAssignmentExpression::getLeftOperand

```java
/**
* Get the left operand of this binary expression.
*/
```
```rust
pub fn getLeftOperand(self: AdditionAssignmentExpression) -> Expression;
```
## AdditionAssignmentExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: AdditionAssignmentExpression, level: int) -> *Node;
```
## AdditionAssignmentExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: AdditionAssignmentExpression) -> *FunctionLikeDeclaration;
```
## AdditionAssignmentExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: AdditionAssignmentExpression) -> int;
```
## AdditionAssignmentExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: AdditionAssignmentExpression, i: int) -> Node;
```
## AdditionAssignmentExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: AdditionAssignmentExpression) -> TopLevelDO;
```
## AdditionAssignmentExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: AdditionAssignmentExpression, i: int) -> Decorator;
```
## AdditionAssignmentExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: AdditionAssignmentExpression) -> *Node;
```
## AdditionAssignmentExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: AdditionAssignmentExpression) -> *Comment;
```
## AdditionAssignmentExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: AdditionAssignmentExpression) -> Node;
```
## AdditionAssignmentExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: AdditionAssignmentExpression) -> *Node;
```
## AdditionAssignmentExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: AdditionAssignmentExpression) -> *Comment;
```
## AdditionAssignmentExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: AdditionAssignmentExpression) -> *Comment;
```
## AdditionAssignmentExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: AdditionAssignmentExpression) -> int;
```
## AdditionAssignmentExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: AdditionAssignmentExpression) -> *Decorator;
```
## AdditionAssignmentExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: AdditionAssignmentExpression) -> Symbol;
```
## AdditionAssignmentExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *AdditionAssignmentExpression;
```
