# BitwiseNotExpression

Inherit from [PrefixUnaryExpression](./PrefixUnaryExpression.md)

Primary key: `id: int`

```rust
schema BitwiseNotExpression extends PrefixUnaryExpression {
  @primary id: int
}
```
## BitwiseNotExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: BitwiseNotExpression) -> int;
```
## BitwiseNotExpression::getOperand

```rust
pub fn getOperand(self: BitwiseNotExpression) -> UnaryExpression;
```
## BitwiseNotExpression::getIndex

```rust
pub fn getIndex(self: BitwiseNotExpression) -> int;
```
## BitwiseNotExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: BitwiseNotExpression) -> *Node;
```
## BitwiseNotExpression::getOperator

```rust
pub fn getOperator(self: BitwiseNotExpression) -> PrefixUnaryOperator;
```
## BitwiseNotExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: BitwiseNotExpression) -> Location;
```
## BitwiseNotExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: BitwiseNotExpression) -> string;
```
## BitwiseNotExpression::getExpression

```rust
pub fn getExpression(self: BitwiseNotExpression) -> Expression;
```
## BitwiseNotExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: BitwiseNotExpression) -> int;
```
## BitwiseNotExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: BitwiseNotExpression) -> File;
```
## BitwiseNotExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: BitwiseNotExpression, level: int) -> Node;
```
## BitwiseNotExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: BitwiseNotExpression) -> FunctionLikeDeclaration;
```
## BitwiseNotExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: BitwiseNotExpression) -> *Comment;
```
## BitwiseNotExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: BitwiseNotExpression) -> *Comment;
```
## BitwiseNotExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: BitwiseNotExpression) -> *FunctionLikeDeclaration;
```
## BitwiseNotExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: BitwiseNotExpression, level: int) -> *Node;
```
## BitwiseNotExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: BitwiseNotExpression) -> int;
```
## BitwiseNotExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: BitwiseNotExpression) -> *Modifier;
```
## BitwiseNotExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: BitwiseNotExpression) -> int;
```
## BitwiseNotExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: BitwiseNotExpression) -> int;
```
## BitwiseNotExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: BitwiseNotExpression, i: int) -> Node;
```
## BitwiseNotExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: BitwiseNotExpression) -> TopLevelDO;
```
## BitwiseNotExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: BitwiseNotExpression, i: int) -> Decorator;
```
## BitwiseNotExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: BitwiseNotExpression) -> int;
```
## BitwiseNotExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: BitwiseNotExpression) -> *Node;
```
## BitwiseNotExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: BitwiseNotExpression) -> Node;
```
## BitwiseNotExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: BitwiseNotExpression) -> Node;
```
## BitwiseNotExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: BitwiseNotExpression) -> int;
```
## BitwiseNotExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: BitwiseNotExpression) -> *Node;
```
## BitwiseNotExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: BitwiseNotExpression) -> *Comment;
```
## BitwiseNotExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: BitwiseNotExpression) -> Symbol;
```
## BitwiseNotExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: BitwiseNotExpression) -> *Decorator;
```
## BitwiseNotExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *BitwiseNotExpression;
```
## BitwiseNotExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: BitwiseNotExpression, i: int) -> Modifier;
```
## BitwiseNotExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: BitwiseNotExpression) -> string;
```
