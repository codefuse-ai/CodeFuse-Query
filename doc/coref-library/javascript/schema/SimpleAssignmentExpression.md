# SimpleAssignmentExpression

Inherit from [AssignmentExpression](./AssignmentExpression.md)

Primary key: `id: int`

```rust
schema SimpleAssignmentExpression extends AssignmentExpression {
  @primary id: int,
}
```
## SimpleAssignmentExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: SimpleAssignmentExpression) -> Symbol;
```
## SimpleAssignmentExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: SimpleAssignmentExpression) -> *Decorator;
```
## SimpleAssignmentExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: SimpleAssignmentExpression) -> *Comment;
```
## SimpleAssignmentExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: SimpleAssignmentExpression) -> *Node;
```
## SimpleAssignmentExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: SimpleAssignmentExpression) -> int;
```
## SimpleAssignmentExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: SimpleAssignmentExpression) -> *Comment;
```
## SimpleAssignmentExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: SimpleAssignmentExpression) -> *Comment;
```
## SimpleAssignmentExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: SimpleAssignmentExpression) -> Node;
```
## SimpleAssignmentExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: SimpleAssignmentExpression) -> *Node;
```
## SimpleAssignmentExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: SimpleAssignmentExpression, i: int) -> Decorator;
```
## SimpleAssignmentExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: SimpleAssignmentExpression) -> TopLevelDO;
```
## SimpleAssignmentExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: SimpleAssignmentExpression, i: int) -> Node;
```
## SimpleAssignmentExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: SimpleAssignmentExpression) -> int;
```
## SimpleAssignmentExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: SimpleAssignmentExpression, level: int) -> *Node;
```
## SimpleAssignmentExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: SimpleAssignmentExpression) -> *FunctionLikeDeclaration;
```
## SimpleAssignmentExpression::getLeftOperand

```java
/**
* Get the left operand of this binary expression.
*/
```
```rust
pub fn getLeftOperand(self: SimpleAssignmentExpression) -> Expression;
```
## SimpleAssignmentExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: SimpleAssignmentExpression, level: int) -> Node;
```
## SimpleAssignmentExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: SimpleAssignmentExpression) -> File;
```
## SimpleAssignmentExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: SimpleAssignmentExpression) -> string;
```
## SimpleAssignmentExpression::getAnOperand

```rust
pub fn getAnOperand(self: SimpleAssignmentExpression) -> *Expression;
```
## SimpleAssignmentExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: SimpleAssignmentExpression, i: int) -> Modifier;
```
## SimpleAssignmentExpression::getRightOperand

```java
/**
* Get the right operand of this binary expression.
*/
```
```rust
pub fn getRightOperand(self: SimpleAssignmentExpression) -> Expression;
```
## SimpleAssignmentExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: SimpleAssignmentExpression) -> int;
```
## SimpleAssignmentExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: SimpleAssignmentExpression) -> string;
```
## SimpleAssignmentExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *SimpleAssignmentExpression;
```
## SimpleAssignmentExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: SimpleAssignmentExpression) -> Location;
```
## SimpleAssignmentExpression::getOperator

```java
/**
* Get the operator of this binary expression.
*/
```
```rust
pub fn getOperator(self: SimpleAssignmentExpression) -> BinaryOperator;
```
## SimpleAssignmentExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: SimpleAssignmentExpression) -> *Node;
```
## SimpleAssignmentExpression::getLeft

```java
/**
* Get the left operand of this binary expression. An alias of `getLeftOperand`.
*/
```
```rust
pub fn getLeft(self: SimpleAssignmentExpression) -> Expression;
```
## SimpleAssignmentExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: SimpleAssignmentExpression) -> int;
```
## SimpleAssignmentExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: SimpleAssignmentExpression) -> *Modifier;
```
## SimpleAssignmentExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: SimpleAssignmentExpression) -> int;
```
## SimpleAssignmentExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: SimpleAssignmentExpression) -> Node;
```
## SimpleAssignmentExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: SimpleAssignmentExpression) -> FunctionLikeDeclaration;
```
## SimpleAssignmentExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: SimpleAssignmentExpression) -> int;
```
## SimpleAssignmentExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: SimpleAssignmentExpression) -> int;
```
## SimpleAssignmentExpression::getIndex

```rust
pub fn getIndex(self: SimpleAssignmentExpression) -> int;
```
## SimpleAssignmentExpression::getRight

```java
/**
* Get the right operand of this binary expression. An alias of `getRightOperand`
*/
```
```rust
pub fn getRight(self: SimpleAssignmentExpression) -> Expression;
```
