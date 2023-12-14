# BitwiseOrAssignmentExpression

Primary key: `id: int`

```rust
schema BitwiseOrAssignmentExpression {
  @primary id: int,
}
```
## BitwiseOrAssignmentExpression::getRight

```java
/**
* Get the right operand of this binary expression. An alias of `getRightOperand`
*/
```
```rust
pub fn getRight(self: BitwiseOrAssignmentExpression) -> Expression;
```
## BitwiseOrAssignmentExpression::getIndex

```rust
pub fn getIndex(self: BitwiseOrAssignmentExpression) -> int;
```
## BitwiseOrAssignmentExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: BitwiseOrAssignmentExpression) -> int;
```
## BitwiseOrAssignmentExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: BitwiseOrAssignmentExpression) -> int;
```
## BitwiseOrAssignmentExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: BitwiseOrAssignmentExpression) -> FunctionLikeDeclaration;
```
## BitwiseOrAssignmentExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: BitwiseOrAssignmentExpression) -> Node;
```
## BitwiseOrAssignmentExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: BitwiseOrAssignmentExpression) -> int;
```
## BitwiseOrAssignmentExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: BitwiseOrAssignmentExpression) -> *Modifier;
```
## BitwiseOrAssignmentExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: BitwiseOrAssignmentExpression) -> int;
```
## BitwiseOrAssignmentExpression::getLeft

```java
/**
* Get the left operand of this binary expression. An alias of `getLeftOperand`.
*/
```
```rust
pub fn getLeft(self: BitwiseOrAssignmentExpression) -> Expression;
```
## BitwiseOrAssignmentExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: BitwiseOrAssignmentExpression) -> *Node;
```
## BitwiseOrAssignmentExpression::getOperator

```java
/**
* Get the operator of this binary expression.
*/
```
```rust
pub fn getOperator(self: BitwiseOrAssignmentExpression) -> BinaryOperator;
```
## BitwiseOrAssignmentExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: BitwiseOrAssignmentExpression) -> Location;
```
## BitwiseOrAssignmentExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: BitwiseOrAssignmentExpression) -> string;
```
## BitwiseOrAssignmentExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: BitwiseOrAssignmentExpression) -> int;
```
## BitwiseOrAssignmentExpression::getAnOperand

```rust
pub fn getAnOperand(self: BitwiseOrAssignmentExpression) -> *Expression;
```
## BitwiseOrAssignmentExpression::getRightOperand

```java
/**
* Get the right operand of this binary expression.
*/
```
```rust
pub fn getRightOperand(self: BitwiseOrAssignmentExpression) -> Expression;
```
## BitwiseOrAssignmentExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: BitwiseOrAssignmentExpression, i: int) -> Modifier;
```
## BitwiseOrAssignmentExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: BitwiseOrAssignmentExpression) -> string;
```
## BitwiseOrAssignmentExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: BitwiseOrAssignmentExpression) -> File;
```
## BitwiseOrAssignmentExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: BitwiseOrAssignmentExpression, level: int) -> Node;
```
## BitwiseOrAssignmentExpression::getLeftOperand

```java
/**
* Get the left operand of this binary expression.
*/
```
```rust
pub fn getLeftOperand(self: BitwiseOrAssignmentExpression) -> Expression;
```
## BitwiseOrAssignmentExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: BitwiseOrAssignmentExpression, level: int) -> *Node;
```
## BitwiseOrAssignmentExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: BitwiseOrAssignmentExpression) -> *FunctionLikeDeclaration;
```
## BitwiseOrAssignmentExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: BitwiseOrAssignmentExpression) -> int;
```
## BitwiseOrAssignmentExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: BitwiseOrAssignmentExpression, i: int) -> Node;
```
## BitwiseOrAssignmentExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: BitwiseOrAssignmentExpression) -> TopLevelDO;
```
## BitwiseOrAssignmentExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: BitwiseOrAssignmentExpression, i: int) -> Decorator;
```
## BitwiseOrAssignmentExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: BitwiseOrAssignmentExpression) -> *Node;
```
## BitwiseOrAssignmentExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: BitwiseOrAssignmentExpression) -> *Comment;
```
## BitwiseOrAssignmentExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: BitwiseOrAssignmentExpression) -> Node;
```
## BitwiseOrAssignmentExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: BitwiseOrAssignmentExpression) -> *Node;
```
## BitwiseOrAssignmentExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: BitwiseOrAssignmentExpression) -> *Comment;
```
## BitwiseOrAssignmentExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: BitwiseOrAssignmentExpression) -> *Comment;
```
## BitwiseOrAssignmentExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: BitwiseOrAssignmentExpression) -> int;
```
## BitwiseOrAssignmentExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: BitwiseOrAssignmentExpression) -> *Decorator;
```
## BitwiseOrAssignmentExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: BitwiseOrAssignmentExpression) -> Symbol;
```
## BitwiseOrAssignmentExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *BitwiseOrAssignmentExpression;
```
