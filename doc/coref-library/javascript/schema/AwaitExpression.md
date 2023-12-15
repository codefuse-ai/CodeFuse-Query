# AwaitExpression

Inherit from [UnaryExpression](./UnaryExpression.md)

Primary key: `id: int`

```rust
schema AwaitExpression extends UnaryExpression {
  @primary id: int
}
```
## AwaitExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: AwaitExpression) -> *Node;
```
## AwaitExpression::getIndex

```rust
pub fn getIndex(self: AwaitExpression) -> int;
```
## AwaitExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: AwaitExpression) -> int;
```
## AwaitExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: AwaitExpression, level: int) -> Node;
```
## AwaitExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: AwaitExpression) -> File;
```
## AwaitExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: AwaitExpression) -> FunctionLikeDeclaration;
```
## AwaitExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: AwaitExpression) -> int;
```
## AwaitExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: AwaitExpression) -> Node;
```
## AwaitExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: AwaitExpression) -> *Comment;
```
## AwaitExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: AwaitExpression) -> *Comment;
```
## AwaitExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: AwaitExpression) -> *FunctionLikeDeclaration;
```
## AwaitExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: AwaitExpression, level: int) -> *Node;
```
## AwaitExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: AwaitExpression) -> int;
```
## AwaitExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: AwaitExpression) -> *Modifier;
```
## AwaitExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: AwaitExpression) -> int;
```
## AwaitExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: AwaitExpression) -> int;
```
## AwaitExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: AwaitExpression, i: int) -> Node;
```
## AwaitExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: AwaitExpression, i: int) -> Decorator;
```
## AwaitExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: AwaitExpression) -> TopLevelDO;
```
## AwaitExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: AwaitExpression) -> int;
```
## AwaitExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: AwaitExpression) -> Node;
```
## AwaitExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: AwaitExpression) -> *Node;
```
## AwaitExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: AwaitExpression) -> *Node;
```
## AwaitExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: AwaitExpression) -> *Comment;
```
## AwaitExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: AwaitExpression) -> Symbol;
```
## AwaitExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: AwaitExpression) -> *Decorator;
```
## AwaitExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: AwaitExpression, i: int) -> Modifier;
```
## AwaitExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: AwaitExpression) -> string;
```
## AwaitExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *AwaitExpression;
```
## AwaitExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: AwaitExpression) -> int;
```
## AwaitExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: AwaitExpression) -> string;
```
## AwaitExpression::getExpression

```rust
pub fn getExpression(self: AwaitExpression) -> UnaryExpression;
```
## AwaitExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: AwaitExpression) -> Location;
```
