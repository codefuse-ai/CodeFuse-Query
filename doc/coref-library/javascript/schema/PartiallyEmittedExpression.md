# PartiallyEmittedExpression

Primary key: `id: int`

```rust
schema PartiallyEmittedExpression {
  @primary id: int,
}
```
## PartiallyEmittedExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: PartiallyEmittedExpression) -> *Node;
```
## PartiallyEmittedExpression::getIndex

```rust
pub fn getIndex(self: PartiallyEmittedExpression) -> int;
```
## PartiallyEmittedExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: PartiallyEmittedExpression) -> int;
```
## PartiallyEmittedExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: PartiallyEmittedExpression, level: int) -> Node;
```
## PartiallyEmittedExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: PartiallyEmittedExpression) -> File;
```
## PartiallyEmittedExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: PartiallyEmittedExpression) -> int;
```
## PartiallyEmittedExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: PartiallyEmittedExpression) -> FunctionLikeDeclaration;
```
## PartiallyEmittedExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: PartiallyEmittedExpression) -> *Comment;
```
## PartiallyEmittedExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: PartiallyEmittedExpression) -> *Comment;
```
## PartiallyEmittedExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: PartiallyEmittedExpression) -> *FunctionLikeDeclaration;
```
## PartiallyEmittedExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: PartiallyEmittedExpression, level: int) -> *Node;
```
## PartiallyEmittedExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: PartiallyEmittedExpression) -> int;
```
## PartiallyEmittedExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: PartiallyEmittedExpression) -> *Modifier;
```
## PartiallyEmittedExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: PartiallyEmittedExpression) -> int;
```
## PartiallyEmittedExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: PartiallyEmittedExpression) -> int;
```
## PartiallyEmittedExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: PartiallyEmittedExpression, i: int) -> Node;
```
## PartiallyEmittedExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: PartiallyEmittedExpression, i: int) -> Decorator;
```
## PartiallyEmittedExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: PartiallyEmittedExpression) -> TopLevelDO;
```
## PartiallyEmittedExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: PartiallyEmittedExpression) -> int;
```
## PartiallyEmittedExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: PartiallyEmittedExpression) -> Node;
```
## PartiallyEmittedExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: PartiallyEmittedExpression) -> *Node;
```
## PartiallyEmittedExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: PartiallyEmittedExpression) -> *Node;
```
## PartiallyEmittedExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: PartiallyEmittedExpression) -> *Comment;
```
## PartiallyEmittedExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: PartiallyEmittedExpression) -> Symbol;
```
## PartiallyEmittedExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: PartiallyEmittedExpression) -> *Decorator;
```
## PartiallyEmittedExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: PartiallyEmittedExpression) -> int;
```
## PartiallyEmittedExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: PartiallyEmittedExpression) -> string;
```
## PartiallyEmittedExpression::getExpression

```rust
pub fn getExpression(self: PartiallyEmittedExpression) -> Expression;
```
## PartiallyEmittedExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: PartiallyEmittedExpression) -> Location;
```
## PartiallyEmittedExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *PartiallyEmittedExpression;
```
## PartiallyEmittedExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: PartiallyEmittedExpression, i: int) -> Modifier;
```
## PartiallyEmittedExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: PartiallyEmittedExpression) -> string;
```
## PartiallyEmittedExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: PartiallyEmittedExpression) -> Node;
```
