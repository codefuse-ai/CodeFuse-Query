# SubtractionAssignmentExpression

Inherit from [CompoundAssignmentExpression](./CompoundAssignmentExpression.md)

Primary key: `id: int`

```rust
schema SubtractionAssignmentExpression extends CompoundAssignmentExpression {
  @primary id: int
}
```
## SubtractionAssignmentExpression::getRight

```java
/**
* Get the right operand of this binary expression. An alias of `getRightOperand`
*/
```
```rust
pub fn getRight(self: SubtractionAssignmentExpression) -> Expression;
```
## SubtractionAssignmentExpression::getIndex

```rust
pub fn getIndex(self: SubtractionAssignmentExpression) -> int;
```
## SubtractionAssignmentExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: SubtractionAssignmentExpression) -> int;
```
## SubtractionAssignmentExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: SubtractionAssignmentExpression) -> int;
```
## SubtractionAssignmentExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: SubtractionAssignmentExpression) -> FunctionLikeDeclaration;
```
## SubtractionAssignmentExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: SubtractionAssignmentExpression) -> Node;
```
## SubtractionAssignmentExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: SubtractionAssignmentExpression) -> int;
```
## SubtractionAssignmentExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: SubtractionAssignmentExpression) -> *Modifier;
```
## SubtractionAssignmentExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: SubtractionAssignmentExpression) -> int;
```
## SubtractionAssignmentExpression::getLeft

```java
/**
* Get the left operand of this binary expression. An alias of `getLeftOperand`.
*/
```
```rust
pub fn getLeft(self: SubtractionAssignmentExpression) -> Expression;
```
## SubtractionAssignmentExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: SubtractionAssignmentExpression) -> *Node;
```
## SubtractionAssignmentExpression::getOperator

```java
/**
* Get the operator of this binary expression.
*/
```
```rust
pub fn getOperator(self: SubtractionAssignmentExpression) -> BinaryOperator;
```
## SubtractionAssignmentExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: SubtractionAssignmentExpression) -> Location;
```
## SubtractionAssignmentExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: SubtractionAssignmentExpression) -> string;
```
## SubtractionAssignmentExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: SubtractionAssignmentExpression) -> int;
```
## SubtractionAssignmentExpression::getAnOperand

```rust
pub fn getAnOperand(self: SubtractionAssignmentExpression) -> *Expression;
```
## SubtractionAssignmentExpression::getRightOperand

```java
/**
* Get the right operand of this binary expression.
*/
```
```rust
pub fn getRightOperand(self: SubtractionAssignmentExpression) -> Expression;
```
## SubtractionAssignmentExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: SubtractionAssignmentExpression, i: int) -> Modifier;
```
## SubtractionAssignmentExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: SubtractionAssignmentExpression) -> string;
```
## SubtractionAssignmentExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: SubtractionAssignmentExpression) -> File;
```
## SubtractionAssignmentExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: SubtractionAssignmentExpression, level: int) -> Node;
```
## SubtractionAssignmentExpression::getLeftOperand

```java
/**
* Get the left operand of this binary expression.
*/
```
```rust
pub fn getLeftOperand(self: SubtractionAssignmentExpression) -> Expression;
```
## SubtractionAssignmentExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: SubtractionAssignmentExpression, level: int) -> *Node;
```
## SubtractionAssignmentExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: SubtractionAssignmentExpression) -> *FunctionLikeDeclaration;
```
## SubtractionAssignmentExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: SubtractionAssignmentExpression) -> int;
```
## SubtractionAssignmentExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: SubtractionAssignmentExpression, i: int) -> Node;
```
## SubtractionAssignmentExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: SubtractionAssignmentExpression) -> TopLevelDO;
```
## SubtractionAssignmentExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: SubtractionAssignmentExpression, i: int) -> Decorator;
```
## SubtractionAssignmentExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: SubtractionAssignmentExpression) -> *Node;
```
## SubtractionAssignmentExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: SubtractionAssignmentExpression) -> *Comment;
```
## SubtractionAssignmentExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: SubtractionAssignmentExpression) -> Node;
```
## SubtractionAssignmentExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: SubtractionAssignmentExpression) -> *Node;
```
## SubtractionAssignmentExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: SubtractionAssignmentExpression) -> *Comment;
```
## SubtractionAssignmentExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: SubtractionAssignmentExpression) -> *Comment;
```
## SubtractionAssignmentExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: SubtractionAssignmentExpression) -> int;
```
## SubtractionAssignmentExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: SubtractionAssignmentExpression) -> *Decorator;
```
## SubtractionAssignmentExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: SubtractionAssignmentExpression) -> Symbol;
```
## SubtractionAssignmentExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *SubtractionAssignmentExpression;
```
