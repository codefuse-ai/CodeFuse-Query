# InExpression

Inherit from [RelationalExpression](./RelationalExpression.md)

Primary key: `id: int`

```rust
schema InExpression extends RelationalExpression {
  @primary id: int,
}
```
## InExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: InExpression) -> Symbol;
```
## InExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: InExpression) -> *Decorator;
```
## InExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: InExpression) -> *Comment;
```
## InExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: InExpression) -> *Node;
```
## InExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: InExpression) -> int;
```
## InExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: InExpression) -> *Comment;
```
## InExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: InExpression) -> *Comment;
```
## InExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: InExpression) -> Node;
```
## InExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: InExpression) -> *Node;
```
## InExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: InExpression, i: int) -> Decorator;
```
## InExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: InExpression) -> TopLevelDO;
```
## InExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: InExpression, i: int) -> Node;
```
## InExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: InExpression) -> int;
```
## InExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: InExpression, level: int) -> *Node;
```
## InExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: InExpression) -> *FunctionLikeDeclaration;
```
## InExpression::getLeftOperand

```java
/**
* Get the left operand of this binary expression.
*/
```
```rust
pub fn getLeftOperand(self: InExpression) -> Expression;
```
## InExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: InExpression, level: int) -> Node;
```
## InExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: InExpression) -> File;
```
## InExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: InExpression) -> string;
```
## InExpression::getAnOperand

```rust
pub fn getAnOperand(self: InExpression) -> *Expression;
```
## InExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: InExpression, i: int) -> Modifier;
```
## InExpression::getRightOperand

```java
/**
* Get the right operand of this binary expression.
*/
```
```rust
pub fn getRightOperand(self: InExpression) -> Expression;
```
## InExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: InExpression) -> int;
```
## InExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: InExpression) -> string;
```
## InExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *InExpression;
```
## InExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: InExpression) -> Location;
```
## InExpression::getOperator

```java
/**
* Get the operator of this binary expression.
*/
```
```rust
pub fn getOperator(self: InExpression) -> BinaryOperator;
```
## InExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: InExpression) -> *Node;
```
## InExpression::getLeft

```java
/**
* Get the left operand of this binary expression. An alias of `getLeftOperand`.
*/
```
```rust
pub fn getLeft(self: InExpression) -> Expression;
```
## InExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: InExpression) -> int;
```
## InExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: InExpression) -> *Modifier;
```
## InExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: InExpression) -> int;
```
## InExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: InExpression) -> Node;
```
## InExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: InExpression) -> FunctionLikeDeclaration;
```
## InExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: InExpression) -> int;
```
## InExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: InExpression) -> int;
```
## InExpression::getIndex

```rust
pub fn getIndex(self: InExpression) -> int;
```
## InExpression::getRight

```java
/**
* Get the right operand of this binary expression. An alias of `getRightOperand`
*/
```
```rust
pub fn getRight(self: InExpression) -> Expression;
```
