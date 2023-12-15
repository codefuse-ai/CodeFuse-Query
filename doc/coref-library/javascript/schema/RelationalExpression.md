# RelationalExpression

Inherit from [BinaryExpression](./BinaryExpression.md)

Primary key: `id: int`

```rust
schema RelationalExpression extends BinaryExpression {
  @primary id: int
}
```
## RelationalExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: RelationalExpression) -> int;
```
## RelationalExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: RelationalExpression) -> int;
```
## RelationalExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: RelationalExpression) -> Node;
```
## RelationalExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: RelationalExpression) -> FunctionLikeDeclaration;
```
## RelationalExpression::getLeft

```java
/**
* Get the left operand of this binary expression. An alias of `getLeftOperand`.
*/
```
```rust
pub fn getLeft(self: RelationalExpression) -> Expression;
```
## RelationalExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: RelationalExpression) -> *Node;
```
## RelationalExpression::getOperator

```java
/**
* Get the operator of this binary expression.
*/
```
```rust
pub fn getOperator(self: RelationalExpression) -> BinaryOperator;
```
## RelationalExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: RelationalExpression) -> Location;
```
## RelationalExpression::getRight

```java
/**
* Get the right operand of this binary expression. An alias of `getRightOperand`
*/
```
```rust
pub fn getRight(self: RelationalExpression) -> Expression;
```
## RelationalExpression::getIndex

```rust
pub fn getIndex(self: RelationalExpression) -> int;
```
## RelationalExpression::getAnOperand

```rust
pub fn getAnOperand(self: RelationalExpression) -> *Expression;
```
## RelationalExpression::getRightOperand

```java
/**
* Get the right operand of this binary expression.
*/
```
```rust
pub fn getRightOperand(self: RelationalExpression) -> Expression;
```
## RelationalExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: RelationalExpression, i: int) -> Modifier;
```
## RelationalExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: RelationalExpression) -> string;
```
## RelationalExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: RelationalExpression) -> string;
```
## RelationalExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: RelationalExpression) -> int;
```
## RelationalExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: RelationalExpression) -> File;
```
## RelationalExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: RelationalExpression, level: int) -> Node;
```
## RelationalExpression::getLeftOperand

```java
/**
* Get the left operand of this binary expression.
*/
```
```rust
pub fn getLeftOperand(self: RelationalExpression) -> Expression;
```
## RelationalExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: RelationalExpression) -> *FunctionLikeDeclaration;
```
## RelationalExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: RelationalExpression, level: int) -> *Node;
```
## RelationalExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: RelationalExpression) -> int;
```
## RelationalExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: RelationalExpression) -> *Modifier;
```
## RelationalExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: RelationalExpression) -> int;
```
## RelationalExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: RelationalExpression) -> int;
```
## RelationalExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: RelationalExpression, i: int) -> Node;
```
## RelationalExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: RelationalExpression) -> TopLevelDO;
```
## RelationalExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: RelationalExpression, i: int) -> Decorator;
```
## RelationalExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: RelationalExpression) -> *Node;
```
## RelationalExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: RelationalExpression) -> Node;
```
## RelationalExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: RelationalExpression) -> *Comment;
```
## RelationalExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: RelationalExpression) -> *Comment;
```
## RelationalExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: RelationalExpression) -> int;
```
## RelationalExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: RelationalExpression) -> *Node;
```
## RelationalExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: RelationalExpression) -> *Comment;
```
## RelationalExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: RelationalExpression) -> *Decorator;
```
## RelationalExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: RelationalExpression) -> Symbol;
```
## RelationalExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *RelationalExpression;
```
