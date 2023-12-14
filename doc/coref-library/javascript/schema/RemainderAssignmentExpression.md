# RemainderAssignmentExpression

Primary key: `id: int`

```rust
schema RemainderAssignmentExpression {
  @primary id: int,
}
```
## RemainderAssignmentExpression::getRight

```java
/**
* Get the right operand of this binary expression. An alias of `getRightOperand`
*/
```
```rust
pub fn getRight(self: RemainderAssignmentExpression) -> Expression;
```
## RemainderAssignmentExpression::getIndex

```rust
pub fn getIndex(self: RemainderAssignmentExpression) -> int;
```
## RemainderAssignmentExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: RemainderAssignmentExpression) -> int;
```
## RemainderAssignmentExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: RemainderAssignmentExpression) -> int;
```
## RemainderAssignmentExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: RemainderAssignmentExpression) -> FunctionLikeDeclaration;
```
## RemainderAssignmentExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: RemainderAssignmentExpression) -> Node;
```
## RemainderAssignmentExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: RemainderAssignmentExpression) -> int;
```
## RemainderAssignmentExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: RemainderAssignmentExpression) -> *Modifier;
```
## RemainderAssignmentExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: RemainderAssignmentExpression) -> int;
```
## RemainderAssignmentExpression::getLeft

```java
/**
* Get the left operand of this binary expression. An alias of `getLeftOperand`.
*/
```
```rust
pub fn getLeft(self: RemainderAssignmentExpression) -> Expression;
```
## RemainderAssignmentExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: RemainderAssignmentExpression) -> *Node;
```
## RemainderAssignmentExpression::getOperator

```java
/**
* Get the operator of this binary expression.
*/
```
```rust
pub fn getOperator(self: RemainderAssignmentExpression) -> BinaryOperator;
```
## RemainderAssignmentExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: RemainderAssignmentExpression) -> Location;
```
## RemainderAssignmentExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: RemainderAssignmentExpression) -> string;
```
## RemainderAssignmentExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: RemainderAssignmentExpression) -> int;
```
## RemainderAssignmentExpression::getAnOperand

```rust
pub fn getAnOperand(self: RemainderAssignmentExpression) -> *Expression;
```
## RemainderAssignmentExpression::getRightOperand

```java
/**
* Get the right operand of this binary expression.
*/
```
```rust
pub fn getRightOperand(self: RemainderAssignmentExpression) -> Expression;
```
## RemainderAssignmentExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: RemainderAssignmentExpression, i: int) -> Modifier;
```
## RemainderAssignmentExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: RemainderAssignmentExpression) -> string;
```
## RemainderAssignmentExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: RemainderAssignmentExpression) -> File;
```
## RemainderAssignmentExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: RemainderAssignmentExpression, level: int) -> Node;
```
## RemainderAssignmentExpression::getLeftOperand

```java
/**
* Get the left operand of this binary expression.
*/
```
```rust
pub fn getLeftOperand(self: RemainderAssignmentExpression) -> Expression;
```
## RemainderAssignmentExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: RemainderAssignmentExpression, level: int) -> *Node;
```
## RemainderAssignmentExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: RemainderAssignmentExpression) -> *FunctionLikeDeclaration;
```
## RemainderAssignmentExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: RemainderAssignmentExpression) -> int;
```
## RemainderAssignmentExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: RemainderAssignmentExpression, i: int) -> Node;
```
## RemainderAssignmentExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: RemainderAssignmentExpression) -> TopLevelDO;
```
## RemainderAssignmentExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: RemainderAssignmentExpression, i: int) -> Decorator;
```
## RemainderAssignmentExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: RemainderAssignmentExpression) -> *Node;
```
## RemainderAssignmentExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: RemainderAssignmentExpression) -> *Comment;
```
## RemainderAssignmentExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: RemainderAssignmentExpression) -> Node;
```
## RemainderAssignmentExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: RemainderAssignmentExpression) -> *Node;
```
## RemainderAssignmentExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: RemainderAssignmentExpression) -> *Comment;
```
## RemainderAssignmentExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: RemainderAssignmentExpression) -> *Comment;
```
## RemainderAssignmentExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: RemainderAssignmentExpression) -> int;
```
## RemainderAssignmentExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: RemainderAssignmentExpression) -> *Decorator;
```
## RemainderAssignmentExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: RemainderAssignmentExpression) -> Symbol;
```
## RemainderAssignmentExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *RemainderAssignmentExpression;
```
