# CompoundAssignmentExpression

Inherit from [AssignmentExpression](./AssignmentExpression.md)

Primary key: `id: int`

```rust
schema CompoundAssignmentExpression extends AssignmentExpression {
  @primary id: int,
}
```
## CompoundAssignmentExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: CompoundAssignmentExpression) -> Symbol;
```
## CompoundAssignmentExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: CompoundAssignmentExpression) -> *Decorator;
```
## CompoundAssignmentExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: CompoundAssignmentExpression) -> *Comment;
```
## CompoundAssignmentExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: CompoundAssignmentExpression) -> *Node;
```
## CompoundAssignmentExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: CompoundAssignmentExpression) -> int;
```
## CompoundAssignmentExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: CompoundAssignmentExpression) -> *Comment;
```
## CompoundAssignmentExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: CompoundAssignmentExpression) -> *Comment;
```
## CompoundAssignmentExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: CompoundAssignmentExpression) -> Node;
```
## CompoundAssignmentExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: CompoundAssignmentExpression) -> *Node;
```
## CompoundAssignmentExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: CompoundAssignmentExpression, i: int) -> Decorator;
```
## CompoundAssignmentExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: CompoundAssignmentExpression) -> TopLevelDO;
```
## CompoundAssignmentExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: CompoundAssignmentExpression, i: int) -> Node;
```
## CompoundAssignmentExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: CompoundAssignmentExpression) -> int;
```
## CompoundAssignmentExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: CompoundAssignmentExpression, level: int) -> *Node;
```
## CompoundAssignmentExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: CompoundAssignmentExpression) -> *FunctionLikeDeclaration;
```
## CompoundAssignmentExpression::getLeftOperand

```java
/**
* Get the left operand of this binary expression.
*/
```
```rust
pub fn getLeftOperand(self: CompoundAssignmentExpression) -> Expression;
```
## CompoundAssignmentExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: CompoundAssignmentExpression, level: int) -> Node;
```
## CompoundAssignmentExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: CompoundAssignmentExpression) -> File;
```
## CompoundAssignmentExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: CompoundAssignmentExpression) -> string;
```
## CompoundAssignmentExpression::getAnOperand

```rust
pub fn getAnOperand(self: CompoundAssignmentExpression) -> *Expression;
```
## CompoundAssignmentExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: CompoundAssignmentExpression, i: int) -> Modifier;
```
## CompoundAssignmentExpression::getRightOperand

```java
/**
* Get the right operand of this binary expression.
*/
```
```rust
pub fn getRightOperand(self: CompoundAssignmentExpression) -> Expression;
```
## CompoundAssignmentExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: CompoundAssignmentExpression) -> int;
```
## CompoundAssignmentExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: CompoundAssignmentExpression) -> string;
```
## CompoundAssignmentExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *CompoundAssignmentExpression;
```
## CompoundAssignmentExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: CompoundAssignmentExpression) -> Location;
```
## CompoundAssignmentExpression::getOperator

```java
/**
* Get the operator of this binary expression.
*/
```
```rust
pub fn getOperator(self: CompoundAssignmentExpression) -> BinaryOperator;
```
## CompoundAssignmentExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: CompoundAssignmentExpression) -> *Node;
```
## CompoundAssignmentExpression::getLeft

```java
/**
* Get the left operand of this binary expression. An alias of `getLeftOperand`.
*/
```
```rust
pub fn getLeft(self: CompoundAssignmentExpression) -> Expression;
```
## CompoundAssignmentExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: CompoundAssignmentExpression) -> int;
```
## CompoundAssignmentExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: CompoundAssignmentExpression) -> *Modifier;
```
## CompoundAssignmentExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: CompoundAssignmentExpression) -> int;
```
## CompoundAssignmentExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: CompoundAssignmentExpression) -> Node;
```
## CompoundAssignmentExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: CompoundAssignmentExpression) -> FunctionLikeDeclaration;
```
## CompoundAssignmentExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: CompoundAssignmentExpression) -> int;
```
## CompoundAssignmentExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: CompoundAssignmentExpression) -> int;
```
## CompoundAssignmentExpression::getIndex

```rust
pub fn getIndex(self: CompoundAssignmentExpression) -> int;
```
## CompoundAssignmentExpression::getRight

```java
/**
* Get the right operand of this binary expression. An alias of `getRightOperand`
*/
```
```rust
pub fn getRight(self: CompoundAssignmentExpression) -> Expression;
```
