# UnaryMinusExpression

Inherit from [PrefixUnaryExpression](./PrefixUnaryExpression.md)

Primary key: `id: int`

```rust
schema UnaryMinusExpression extends PrefixUnaryExpression {
  @primary id: int,
}
```
## UnaryMinusExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: UnaryMinusExpression) -> int;
```
## UnaryMinusExpression::getOperand

```rust
pub fn getOperand(self: UnaryMinusExpression) -> UnaryExpression;
```
## UnaryMinusExpression::getIndex

```rust
pub fn getIndex(self: UnaryMinusExpression) -> int;
```
## UnaryMinusExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: UnaryMinusExpression) -> *Node;
```
## UnaryMinusExpression::getOperator

```rust
pub fn getOperator(self: UnaryMinusExpression) -> PrefixUnaryOperator;
```
## UnaryMinusExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: UnaryMinusExpression) -> Location;
```
## UnaryMinusExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: UnaryMinusExpression) -> string;
```
## UnaryMinusExpression::getExpression

```rust
pub fn getExpression(self: UnaryMinusExpression) -> Expression;
```
## UnaryMinusExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: UnaryMinusExpression) -> int;
```
## UnaryMinusExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: UnaryMinusExpression) -> File;
```
## UnaryMinusExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: UnaryMinusExpression, level: int) -> Node;
```
## UnaryMinusExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: UnaryMinusExpression) -> FunctionLikeDeclaration;
```
## UnaryMinusExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: UnaryMinusExpression) -> *Comment;
```
## UnaryMinusExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: UnaryMinusExpression) -> *Comment;
```
## UnaryMinusExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: UnaryMinusExpression) -> *FunctionLikeDeclaration;
```
## UnaryMinusExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: UnaryMinusExpression, level: int) -> *Node;
```
## UnaryMinusExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: UnaryMinusExpression) -> int;
```
## UnaryMinusExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: UnaryMinusExpression) -> *Modifier;
```
## UnaryMinusExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: UnaryMinusExpression) -> int;
```
## UnaryMinusExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: UnaryMinusExpression) -> int;
```
## UnaryMinusExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: UnaryMinusExpression, i: int) -> Node;
```
## UnaryMinusExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: UnaryMinusExpression) -> TopLevelDO;
```
## UnaryMinusExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: UnaryMinusExpression, i: int) -> Decorator;
```
## UnaryMinusExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: UnaryMinusExpression) -> int;
```
## UnaryMinusExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: UnaryMinusExpression) -> *Node;
```
## UnaryMinusExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: UnaryMinusExpression) -> Node;
```
## UnaryMinusExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: UnaryMinusExpression) -> Node;
```
## UnaryMinusExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: UnaryMinusExpression) -> int;
```
## UnaryMinusExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: UnaryMinusExpression) -> *Node;
```
## UnaryMinusExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: UnaryMinusExpression) -> *Comment;
```
## UnaryMinusExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: UnaryMinusExpression) -> Symbol;
```
## UnaryMinusExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: UnaryMinusExpression) -> *Decorator;
```
## UnaryMinusExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *UnaryMinusExpression;
```
## UnaryMinusExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: UnaryMinusExpression, i: int) -> Modifier;
```
## UnaryMinusExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: UnaryMinusExpression) -> string;
```
