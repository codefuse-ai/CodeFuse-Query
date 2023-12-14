# LogicalOrAssignmentExpression

Inherit from [CompoundAssignmentExpression](./CompoundAssignmentExpression.md)

Primary key: `id: int`

```rust
schema LogicalOrAssignmentExpression extends CompoundAssignmentExpression {
  @primary id: int,
}
```
## LogicalOrAssignmentExpression::getRight

```java
/**
* Get the right operand of this binary expression. An alias of `getRightOperand`
*/
```
```rust
pub fn getRight(self: LogicalOrAssignmentExpression) -> Expression;
```
## LogicalOrAssignmentExpression::getIndex

```rust
pub fn getIndex(self: LogicalOrAssignmentExpression) -> int;
```
## LogicalOrAssignmentExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: LogicalOrAssignmentExpression) -> int;
```
## LogicalOrAssignmentExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: LogicalOrAssignmentExpression) -> int;
```
## LogicalOrAssignmentExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: LogicalOrAssignmentExpression) -> FunctionLikeDeclaration;
```
## LogicalOrAssignmentExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: LogicalOrAssignmentExpression) -> Node;
```
## LogicalOrAssignmentExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: LogicalOrAssignmentExpression) -> int;
```
## LogicalOrAssignmentExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: LogicalOrAssignmentExpression) -> *Modifier;
```
## LogicalOrAssignmentExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: LogicalOrAssignmentExpression) -> int;
```
## LogicalOrAssignmentExpression::getLeft

```java
/**
* Get the left operand of this binary expression. An alias of `getLeftOperand`.
*/
```
```rust
pub fn getLeft(self: LogicalOrAssignmentExpression) -> Expression;
```
## LogicalOrAssignmentExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: LogicalOrAssignmentExpression) -> *Node;
```
## LogicalOrAssignmentExpression::getOperator

```java
/**
* Get the operator of this binary expression.
*/
```
```rust
pub fn getOperator(self: LogicalOrAssignmentExpression) -> BinaryOperator;
```
## LogicalOrAssignmentExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: LogicalOrAssignmentExpression) -> Location;
```
## LogicalOrAssignmentExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: LogicalOrAssignmentExpression) -> string;
```
## LogicalOrAssignmentExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: LogicalOrAssignmentExpression) -> int;
```
## LogicalOrAssignmentExpression::getAnOperand

```rust
pub fn getAnOperand(self: LogicalOrAssignmentExpression) -> *Expression;
```
## LogicalOrAssignmentExpression::getRightOperand

```java
/**
* Get the right operand of this binary expression.
*/
```
```rust
pub fn getRightOperand(self: LogicalOrAssignmentExpression) -> Expression;
```
## LogicalOrAssignmentExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: LogicalOrAssignmentExpression, i: int) -> Modifier;
```
## LogicalOrAssignmentExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: LogicalOrAssignmentExpression) -> string;
```
## LogicalOrAssignmentExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: LogicalOrAssignmentExpression) -> File;
```
## LogicalOrAssignmentExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: LogicalOrAssignmentExpression, level: int) -> Node;
```
## LogicalOrAssignmentExpression::getLeftOperand

```java
/**
* Get the left operand of this binary expression.
*/
```
```rust
pub fn getLeftOperand(self: LogicalOrAssignmentExpression) -> Expression;
```
## LogicalOrAssignmentExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: LogicalOrAssignmentExpression, level: int) -> *Node;
```
## LogicalOrAssignmentExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: LogicalOrAssignmentExpression) -> *FunctionLikeDeclaration;
```
## LogicalOrAssignmentExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: LogicalOrAssignmentExpression) -> int;
```
## LogicalOrAssignmentExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: LogicalOrAssignmentExpression, i: int) -> Node;
```
## LogicalOrAssignmentExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: LogicalOrAssignmentExpression) -> TopLevelDO;
```
## LogicalOrAssignmentExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: LogicalOrAssignmentExpression, i: int) -> Decorator;
```
## LogicalOrAssignmentExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: LogicalOrAssignmentExpression) -> *Node;
```
## LogicalOrAssignmentExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: LogicalOrAssignmentExpression) -> *Comment;
```
## LogicalOrAssignmentExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: LogicalOrAssignmentExpression) -> Node;
```
## LogicalOrAssignmentExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: LogicalOrAssignmentExpression) -> *Node;
```
## LogicalOrAssignmentExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: LogicalOrAssignmentExpression) -> *Comment;
```
## LogicalOrAssignmentExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: LogicalOrAssignmentExpression) -> *Comment;
```
## LogicalOrAssignmentExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: LogicalOrAssignmentExpression) -> int;
```
## LogicalOrAssignmentExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: LogicalOrAssignmentExpression) -> *Decorator;
```
## LogicalOrAssignmentExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: LogicalOrAssignmentExpression) -> Symbol;
```
## LogicalOrAssignmentExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *LogicalOrAssignmentExpression;
```
