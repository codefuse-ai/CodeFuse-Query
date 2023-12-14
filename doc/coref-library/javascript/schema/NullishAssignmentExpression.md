# NullishAssignmentExpression

Primary key: `id: int`

```rust
schema NullishAssignmentExpression {
  @primary id: int,
}
```
## NullishAssignmentExpression::getRight

```java
/**
* Get the right operand of this binary expression. An alias of `getRightOperand`
*/
```
```rust
pub fn getRight(self: NullishAssignmentExpression) -> Expression;
```
## NullishAssignmentExpression::getIndex

```rust
pub fn getIndex(self: NullishAssignmentExpression) -> int;
```
## NullishAssignmentExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: NullishAssignmentExpression) -> int;
```
## NullishAssignmentExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: NullishAssignmentExpression) -> int;
```
## NullishAssignmentExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: NullishAssignmentExpression) -> FunctionLikeDeclaration;
```
## NullishAssignmentExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: NullishAssignmentExpression) -> Node;
```
## NullishAssignmentExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: NullishAssignmentExpression) -> int;
```
## NullishAssignmentExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: NullishAssignmentExpression) -> *Modifier;
```
## NullishAssignmentExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: NullishAssignmentExpression) -> int;
```
## NullishAssignmentExpression::getLeft

```java
/**
* Get the left operand of this binary expression. An alias of `getLeftOperand`.
*/
```
```rust
pub fn getLeft(self: NullishAssignmentExpression) -> Expression;
```
## NullishAssignmentExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: NullishAssignmentExpression) -> *Node;
```
## NullishAssignmentExpression::getOperator

```java
/**
* Get the operator of this binary expression.
*/
```
```rust
pub fn getOperator(self: NullishAssignmentExpression) -> BinaryOperator;
```
## NullishAssignmentExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: NullishAssignmentExpression) -> Location;
```
## NullishAssignmentExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: NullishAssignmentExpression) -> string;
```
## NullishAssignmentExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: NullishAssignmentExpression) -> int;
```
## NullishAssignmentExpression::getAnOperand

```rust
pub fn getAnOperand(self: NullishAssignmentExpression) -> *Expression;
```
## NullishAssignmentExpression::getRightOperand

```java
/**
* Get the right operand of this binary expression.
*/
```
```rust
pub fn getRightOperand(self: NullishAssignmentExpression) -> Expression;
```
## NullishAssignmentExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: NullishAssignmentExpression, i: int) -> Modifier;
```
## NullishAssignmentExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: NullishAssignmentExpression) -> string;
```
## NullishAssignmentExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: NullishAssignmentExpression) -> File;
```
## NullishAssignmentExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: NullishAssignmentExpression, level: int) -> Node;
```
## NullishAssignmentExpression::getLeftOperand

```java
/**
* Get the left operand of this binary expression.
*/
```
```rust
pub fn getLeftOperand(self: NullishAssignmentExpression) -> Expression;
```
## NullishAssignmentExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: NullishAssignmentExpression, level: int) -> *Node;
```
## NullishAssignmentExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: NullishAssignmentExpression) -> *FunctionLikeDeclaration;
```
## NullishAssignmentExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: NullishAssignmentExpression) -> int;
```
## NullishAssignmentExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: NullishAssignmentExpression, i: int) -> Node;
```
## NullishAssignmentExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: NullishAssignmentExpression) -> TopLevelDO;
```
## NullishAssignmentExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: NullishAssignmentExpression, i: int) -> Decorator;
```
## NullishAssignmentExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: NullishAssignmentExpression) -> *Node;
```
## NullishAssignmentExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: NullishAssignmentExpression) -> *Comment;
```
## NullishAssignmentExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: NullishAssignmentExpression) -> Node;
```
## NullishAssignmentExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: NullishAssignmentExpression) -> *Node;
```
## NullishAssignmentExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: NullishAssignmentExpression) -> *Comment;
```
## NullishAssignmentExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: NullishAssignmentExpression) -> *Comment;
```
## NullishAssignmentExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: NullishAssignmentExpression) -> int;
```
## NullishAssignmentExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: NullishAssignmentExpression) -> *Decorator;
```
## NullishAssignmentExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: NullishAssignmentExpression) -> Symbol;
```
## NullishAssignmentExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *NullishAssignmentExpression;
```
