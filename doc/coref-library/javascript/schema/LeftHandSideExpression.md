# LeftHandSideExpression

Inherit from [UpdateExpression](./UpdateExpression.md)

Primary key: `id: int`

```rust
schema LeftHandSideExpression extends UpdateExpression {
  @primary id: int,
}
```
## LeftHandSideExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: LeftHandSideExpression) -> Location;
```
## LeftHandSideExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: LeftHandSideExpression) -> string;
```
## LeftHandSideExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: LeftHandSideExpression, i: int) -> Modifier;
```
## LeftHandSideExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: LeftHandSideExpression) -> *Decorator;
```
## LeftHandSideExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: LeftHandSideExpression) -> Symbol;
```
## LeftHandSideExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: LeftHandSideExpression) -> *Comment;
```
## LeftHandSideExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: LeftHandSideExpression) -> *Node;
```
## LeftHandSideExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: LeftHandSideExpression) -> *Node;
```
## LeftHandSideExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: LeftHandSideExpression) -> Node;
```
## LeftHandSideExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: LeftHandSideExpression) -> Node;
```
## LeftHandSideExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: LeftHandSideExpression) -> int;
```
## LeftHandSideExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: LeftHandSideExpression) -> TopLevelDO;
```
## LeftHandSideExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: LeftHandSideExpression, i: int) -> Decorator;
```
## LeftHandSideExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: LeftHandSideExpression) -> int;
```
## LeftHandSideExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: LeftHandSideExpression) -> *Modifier;
```
## LeftHandSideExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: LeftHandSideExpression) -> int;
```
## LeftHandSideExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: LeftHandSideExpression, i: int) -> Node;
```
## LeftHandSideExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: LeftHandSideExpression) -> int;
```
## LeftHandSideExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: LeftHandSideExpression, level: int) -> *Node;
```
## LeftHandSideExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: LeftHandSideExpression) -> *FunctionLikeDeclaration;
```
## LeftHandSideExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: LeftHandSideExpression) -> *Comment;
```
## LeftHandSideExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: LeftHandSideExpression) -> *Comment;
```
## LeftHandSideExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: LeftHandSideExpression) -> FunctionLikeDeclaration;
```
## LeftHandSideExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: LeftHandSideExpression) -> int;
```
## LeftHandSideExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: LeftHandSideExpression) -> File;
```
## LeftHandSideExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: LeftHandSideExpression, level: int) -> Node;
```
## LeftHandSideExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: LeftHandSideExpression) -> int;
```
## LeftHandSideExpression::getIndex

```rust
pub fn getIndex(self: LeftHandSideExpression) -> int;
```
## LeftHandSideExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *LeftHandSideExpression;
```
## LeftHandSideExpression::getExpression

```rust
pub fn getExpression(self: LeftHandSideExpression) -> Expression;
```
## LeftHandSideExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: LeftHandSideExpression) -> string;
```
## LeftHandSideExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: LeftHandSideExpression) -> int;
```
## LeftHandSideExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: LeftHandSideExpression) -> *Node;
```
