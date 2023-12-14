# CommaListExpression

Inherit from [Expression](./Expression.md)

Primary key: `id: int`

```rust
schema CommaListExpression extends Expression {
  @primary id: int,
}
```
## CommaListExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: CommaListExpression) -> Location;
```
## CommaListExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: CommaListExpression) -> Symbol;
```
## CommaListExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: CommaListExpression) -> *Decorator;
```
## CommaListExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: CommaListExpression) -> string;
```
## CommaListExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: CommaListExpression, i: int) -> Modifier;
```
## CommaListExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: CommaListExpression) -> *Comment;
```
## CommaListExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: CommaListExpression) -> *Node;
```
## CommaListExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: CommaListExpression) -> *Node;
```
## CommaListExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: CommaListExpression) -> Node;
```
## CommaListExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: CommaListExpression) -> *Comment;
```
## CommaListExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: CommaListExpression) -> *Comment;
```
## CommaListExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: CommaListExpression) -> int;
```
## CommaListExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: CommaListExpression) -> TopLevelDO;
```
## CommaListExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: CommaListExpression, i: int) -> Decorator;
```
## CommaListExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: CommaListExpression) -> int;
```
## CommaListExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: CommaListExpression) -> *Modifier;
```
## CommaListExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: CommaListExpression) -> int;
```
## CommaListExpression::getAExpression

```java
/**
* Get a child expression of the CommaListExpression.
*/
```
```rust
pub fn getAExpression(self: CommaListExpression) -> *Expression;
```
## CommaListExpression::getExpressionCount

```java
/**
* Get the count of the child expressions.
*/
```
```rust
pub fn getExpressionCount(self: CommaListExpression) -> int;
```
## CommaListExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: CommaListExpression, i: int) -> Node;
```
## CommaListExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: CommaListExpression) -> int;
```
## CommaListExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: CommaListExpression) -> *FunctionLikeDeclaration;
```
## CommaListExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: CommaListExpression, level: int) -> *Node;
```
## CommaListExpression::getExpression

```java
/**
* Gets the `i`th child expression of CommaListExpression.
*/
```
```rust
pub fn getExpression(self: CommaListExpression, i: int) -> Expression;
```
## CommaListExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: CommaListExpression) -> int;
```
## CommaListExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: CommaListExpression) -> string;
```
## CommaListExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: CommaListExpression) -> Node;
```
## CommaListExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: CommaListExpression) -> FunctionLikeDeclaration;
```
## CommaListExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: CommaListExpression) -> int;
```
## CommaListExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: CommaListExpression) -> int;
```
## CommaListExpression::getIndex

```rust
pub fn getIndex(self: CommaListExpression) -> int;
```
## CommaListExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: CommaListExpression) -> *Node;
```
## CommaListExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: CommaListExpression, level: int) -> Node;
```
## CommaListExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: CommaListExpression) -> File;
```
## CommaListExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *CommaListExpression;
```
