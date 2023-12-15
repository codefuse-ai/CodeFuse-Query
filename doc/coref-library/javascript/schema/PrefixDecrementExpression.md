# PrefixDecrementExpression

Inherit from [PrefixUnaryExpression](./PrefixUnaryExpression.md)

Primary key: `id: int`

```rust
schema PrefixDecrementExpression extends PrefixUnaryExpression {
  @primary id: int
}
```
## PrefixDecrementExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: PrefixDecrementExpression) -> int;
```
## PrefixDecrementExpression::getOperand

```rust
pub fn getOperand(self: PrefixDecrementExpression) -> UnaryExpression;
```
## PrefixDecrementExpression::getIndex

```rust
pub fn getIndex(self: PrefixDecrementExpression) -> int;
```
## PrefixDecrementExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: PrefixDecrementExpression) -> *Node;
```
## PrefixDecrementExpression::getOperator

```rust
pub fn getOperator(self: PrefixDecrementExpression) -> PrefixUnaryOperator;
```
## PrefixDecrementExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: PrefixDecrementExpression) -> Location;
```
## PrefixDecrementExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: PrefixDecrementExpression) -> string;
```
## PrefixDecrementExpression::getExpression

```rust
pub fn getExpression(self: PrefixDecrementExpression) -> Expression;
```
## PrefixDecrementExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: PrefixDecrementExpression) -> int;
```
## PrefixDecrementExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: PrefixDecrementExpression) -> File;
```
## PrefixDecrementExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: PrefixDecrementExpression, level: int) -> Node;
```
## PrefixDecrementExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: PrefixDecrementExpression) -> FunctionLikeDeclaration;
```
## PrefixDecrementExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: PrefixDecrementExpression) -> *Comment;
```
## PrefixDecrementExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: PrefixDecrementExpression) -> *Comment;
```
## PrefixDecrementExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: PrefixDecrementExpression) -> *FunctionLikeDeclaration;
```
## PrefixDecrementExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: PrefixDecrementExpression, level: int) -> *Node;
```
## PrefixDecrementExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: PrefixDecrementExpression) -> int;
```
## PrefixDecrementExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: PrefixDecrementExpression) -> *Modifier;
```
## PrefixDecrementExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: PrefixDecrementExpression) -> int;
```
## PrefixDecrementExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: PrefixDecrementExpression) -> int;
```
## PrefixDecrementExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: PrefixDecrementExpression, i: int) -> Node;
```
## PrefixDecrementExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: PrefixDecrementExpression) -> TopLevelDO;
```
## PrefixDecrementExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: PrefixDecrementExpression, i: int) -> Decorator;
```
## PrefixDecrementExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: PrefixDecrementExpression) -> int;
```
## PrefixDecrementExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: PrefixDecrementExpression) -> *Node;
```
## PrefixDecrementExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: PrefixDecrementExpression) -> Node;
```
## PrefixDecrementExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: PrefixDecrementExpression) -> Node;
```
## PrefixDecrementExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: PrefixDecrementExpression) -> int;
```
## PrefixDecrementExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: PrefixDecrementExpression) -> *Node;
```
## PrefixDecrementExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: PrefixDecrementExpression) -> *Comment;
```
## PrefixDecrementExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: PrefixDecrementExpression) -> Symbol;
```
## PrefixDecrementExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: PrefixDecrementExpression) -> *Decorator;
```
## PrefixDecrementExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *PrefixDecrementExpression;
```
## PrefixDecrementExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: PrefixDecrementExpression, i: int) -> Modifier;
```
## PrefixDecrementExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: PrefixDecrementExpression) -> string;
```
