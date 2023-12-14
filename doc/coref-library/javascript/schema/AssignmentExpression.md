# AssignmentExpression

Primary key: `id: int`

```rust
schema AssignmentExpression {
  @primary id: int,
}
```
## AssignmentExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: AssignmentExpression) -> int;
```
## AssignmentExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: AssignmentExpression) -> int;
```
## AssignmentExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: AssignmentExpression) -> Node;
```
## AssignmentExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: AssignmentExpression) -> FunctionLikeDeclaration;
```
## AssignmentExpression::getLeft

```java
/**
* Get the left operand of this binary expression. An alias of `getLeftOperand`.
*/
```
```rust
pub fn getLeft(self: AssignmentExpression) -> Expression;
```
## AssignmentExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: AssignmentExpression) -> *Node;
```
## AssignmentExpression::getOperator

```java
/**
* Get the operator of this binary expression.
*/
```
```rust
pub fn getOperator(self: AssignmentExpression) -> BinaryOperator;
```
## AssignmentExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: AssignmentExpression) -> Location;
```
## AssignmentExpression::getRight

```java
/**
* Get the right operand of this binary expression. An alias of `getRightOperand`
*/
```
```rust
pub fn getRight(self: AssignmentExpression) -> Expression;
```
## AssignmentExpression::getIndex

```rust
pub fn getIndex(self: AssignmentExpression) -> int;
```
## AssignmentExpression::getAnOperand

```rust
pub fn getAnOperand(self: AssignmentExpression) -> *Expression;
```
## AssignmentExpression::getRightOperand

```java
/**
* Get the right operand of this binary expression.
*/
```
```rust
pub fn getRightOperand(self: AssignmentExpression) -> Expression;
```
## AssignmentExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: AssignmentExpression, i: int) -> Modifier;
```
## AssignmentExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: AssignmentExpression) -> string;
```
## AssignmentExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: AssignmentExpression) -> string;
```
## AssignmentExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: AssignmentExpression) -> int;
```
## AssignmentExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: AssignmentExpression) -> File;
```
## AssignmentExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: AssignmentExpression, level: int) -> Node;
```
## AssignmentExpression::getLeftOperand

```java
/**
* Get the left operand of this binary expression.
*/
```
```rust
pub fn getLeftOperand(self: AssignmentExpression) -> Expression;
```
## AssignmentExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: AssignmentExpression) -> *FunctionLikeDeclaration;
```
## AssignmentExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: AssignmentExpression, level: int) -> *Node;
```
## AssignmentExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: AssignmentExpression) -> int;
```
## AssignmentExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: AssignmentExpression) -> *Modifier;
```
## AssignmentExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: AssignmentExpression) -> int;
```
## AssignmentExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: AssignmentExpression) -> int;
```
## AssignmentExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: AssignmentExpression, i: int) -> Node;
```
## AssignmentExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: AssignmentExpression) -> TopLevelDO;
```
## AssignmentExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: AssignmentExpression, i: int) -> Decorator;
```
## AssignmentExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: AssignmentExpression) -> *Node;
```
## AssignmentExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: AssignmentExpression) -> Node;
```
## AssignmentExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: AssignmentExpression) -> *Comment;
```
## AssignmentExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: AssignmentExpression) -> *Comment;
```
## AssignmentExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: AssignmentExpression) -> int;
```
## AssignmentExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: AssignmentExpression) -> *Node;
```
## AssignmentExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: AssignmentExpression) -> *Comment;
```
## AssignmentExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: AssignmentExpression) -> *Decorator;
```
## AssignmentExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: AssignmentExpression) -> Symbol;
```
## AssignmentExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *AssignmentExpression;
```
