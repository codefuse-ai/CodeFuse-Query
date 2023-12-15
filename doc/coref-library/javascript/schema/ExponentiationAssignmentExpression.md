# ExponentiationAssignmentExpression

Inherit from [CompoundAssignmentExpression](./CompoundAssignmentExpression.md)

Primary key: `id: int`

```rust
schema ExponentiationAssignmentExpression extends CompoundAssignmentExpression {
  @primary id: int
}
```
## ExponentiationAssignmentExpression::getRight

```java
/**
* Get the right operand of this binary expression. An alias of `getRightOperand`
*/
```
```rust
pub fn getRight(self: ExponentiationAssignmentExpression) -> Expression;
```
## ExponentiationAssignmentExpression::getIndex

```rust
pub fn getIndex(self: ExponentiationAssignmentExpression) -> int;
```
## ExponentiationAssignmentExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: ExponentiationAssignmentExpression) -> int;
```
## ExponentiationAssignmentExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ExponentiationAssignmentExpression) -> int;
```
## ExponentiationAssignmentExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: ExponentiationAssignmentExpression) -> FunctionLikeDeclaration;
```
## ExponentiationAssignmentExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: ExponentiationAssignmentExpression) -> Node;
```
## ExponentiationAssignmentExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: ExponentiationAssignmentExpression) -> int;
```
## ExponentiationAssignmentExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: ExponentiationAssignmentExpression) -> *Modifier;
```
## ExponentiationAssignmentExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ExponentiationAssignmentExpression) -> int;
```
## ExponentiationAssignmentExpression::getLeft

```java
/**
* Get the left operand of this binary expression. An alias of `getLeftOperand`.
*/
```
```rust
pub fn getLeft(self: ExponentiationAssignmentExpression) -> Expression;
```
## ExponentiationAssignmentExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: ExponentiationAssignmentExpression) -> *Node;
```
## ExponentiationAssignmentExpression::getOperator

```java
/**
* Get the operator of this binary expression.
*/
```
```rust
pub fn getOperator(self: ExponentiationAssignmentExpression) -> BinaryOperator;
```
## ExponentiationAssignmentExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: ExponentiationAssignmentExpression) -> Location;
```
## ExponentiationAssignmentExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: ExponentiationAssignmentExpression) -> string;
```
## ExponentiationAssignmentExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ExponentiationAssignmentExpression) -> int;
```
## ExponentiationAssignmentExpression::getAnOperand

```rust
pub fn getAnOperand(self: ExponentiationAssignmentExpression) -> *Expression;
```
## ExponentiationAssignmentExpression::getRightOperand

```java
/**
* Get the right operand of this binary expression.
*/
```
```rust
pub fn getRightOperand(self: ExponentiationAssignmentExpression) -> Expression;
```
## ExponentiationAssignmentExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: ExponentiationAssignmentExpression, i: int) -> Modifier;
```
## ExponentiationAssignmentExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: ExponentiationAssignmentExpression) -> string;
```
## ExponentiationAssignmentExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: ExponentiationAssignmentExpression) -> File;
```
## ExponentiationAssignmentExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: ExponentiationAssignmentExpression, level: int) -> Node;
```
## ExponentiationAssignmentExpression::getLeftOperand

```java
/**
* Get the left operand of this binary expression.
*/
```
```rust
pub fn getLeftOperand(self: ExponentiationAssignmentExpression) -> Expression;
```
## ExponentiationAssignmentExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: ExponentiationAssignmentExpression, level: int) -> *Node;
```
## ExponentiationAssignmentExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ExponentiationAssignmentExpression) -> *FunctionLikeDeclaration;
```
## ExponentiationAssignmentExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ExponentiationAssignmentExpression) -> int;
```
## ExponentiationAssignmentExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: ExponentiationAssignmentExpression, i: int) -> Node;
```
## ExponentiationAssignmentExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: ExponentiationAssignmentExpression) -> TopLevelDO;
```
## ExponentiationAssignmentExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: ExponentiationAssignmentExpression, i: int) -> Decorator;
```
## ExponentiationAssignmentExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: ExponentiationAssignmentExpression) -> *Node;
```
## ExponentiationAssignmentExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: ExponentiationAssignmentExpression) -> *Comment;
```
## ExponentiationAssignmentExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: ExponentiationAssignmentExpression) -> Node;
```
## ExponentiationAssignmentExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: ExponentiationAssignmentExpression) -> *Node;
```
## ExponentiationAssignmentExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: ExponentiationAssignmentExpression) -> *Comment;
```
## ExponentiationAssignmentExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: ExponentiationAssignmentExpression) -> *Comment;
```
## ExponentiationAssignmentExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: ExponentiationAssignmentExpression) -> int;
```
## ExponentiationAssignmentExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: ExponentiationAssignmentExpression) -> *Decorator;
```
## ExponentiationAssignmentExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: ExponentiationAssignmentExpression) -> Symbol;
```
## ExponentiationAssignmentExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *ExponentiationAssignmentExpression;
```
