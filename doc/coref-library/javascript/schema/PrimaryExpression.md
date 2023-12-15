# PrimaryExpression

Inherit from [MemberExpression](./MemberExpression.md)

Primary key: `id: int`

```rust
schema PrimaryExpression extends MemberExpression {
  @primary id: int
}
```
## PrimaryExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: PrimaryExpression) -> string;
```
## PrimaryExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: PrimaryExpression, i: int) -> Modifier;
```
## PrimaryExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: PrimaryExpression) -> Location;
```
## PrimaryExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: PrimaryExpression) -> *Decorator;
```
## PrimaryExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: PrimaryExpression) -> Symbol;
```
## PrimaryExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: PrimaryExpression) -> *Comment;
```
## PrimaryExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: PrimaryExpression) -> *Node;
```
## PrimaryExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: PrimaryExpression) -> *Node;
```
## PrimaryExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: PrimaryExpression) -> Node;
```
## PrimaryExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: PrimaryExpression) -> Node;
```
## PrimaryExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: PrimaryExpression) -> int;
```
## PrimaryExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: PrimaryExpression) -> TopLevelDO;
```
## PrimaryExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: PrimaryExpression, i: int) -> Decorator;
```
## PrimaryExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: PrimaryExpression) -> int;
```
## PrimaryExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: PrimaryExpression) -> *Modifier;
```
## PrimaryExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: PrimaryExpression) -> int;
```
## PrimaryExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: PrimaryExpression, i: int) -> Node;
```
## PrimaryExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: PrimaryExpression) -> int;
```
## PrimaryExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: PrimaryExpression, level: int) -> *Node;
```
## PrimaryExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: PrimaryExpression) -> *FunctionLikeDeclaration;
```
## PrimaryExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: PrimaryExpression) -> *Comment;
```
## PrimaryExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: PrimaryExpression) -> *Comment;
```
## PrimaryExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: PrimaryExpression) -> FunctionLikeDeclaration;
```
## PrimaryExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: PrimaryExpression) -> int;
```
## PrimaryExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: PrimaryExpression) -> File;
```
## PrimaryExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: PrimaryExpression, level: int) -> Node;
```
## PrimaryExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: PrimaryExpression) -> int;
```
## PrimaryExpression::getIndex

```rust
pub fn getIndex(self: PrimaryExpression) -> int;
```
## PrimaryExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *PrimaryExpression;
```
## PrimaryExpression::getExpression

```rust
pub fn getExpression(self: PrimaryExpression) -> Expression;
```
## PrimaryExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: PrimaryExpression) -> string;
```
## PrimaryExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: PrimaryExpression) -> int;
```
## PrimaryExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: PrimaryExpression) -> *Node;
```
