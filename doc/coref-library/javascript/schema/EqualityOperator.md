# EqualityOperator

Primary key: `id: int`

```rust
schema EqualityOperator {
  @primary id: int,
}
```
## EqualityOperator::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: EqualityOperator) -> Location;
```
## EqualityOperator::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: EqualityOperator) -> Symbol;
```
## EqualityOperator::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: EqualityOperator) -> *Decorator;
```
## EqualityOperator::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: EqualityOperator) -> string;
```
## EqualityOperator::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: EqualityOperator, i: int) -> Modifier;
```
## EqualityOperator::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: EqualityOperator) -> *Comment;
```
## EqualityOperator::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: EqualityOperator) -> *Node;
```
## EqualityOperator::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: EqualityOperator) -> *Node;
```
## EqualityOperator::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: EqualityOperator) -> Node;
```
## EqualityOperator::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: EqualityOperator) -> int;
```
## EqualityOperator::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: EqualityOperator) -> TopLevelDO;
```
## EqualityOperator::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: EqualityOperator, i: int) -> Decorator;
```
## EqualityOperator::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: EqualityOperator) -> int;
```
## EqualityOperator::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: EqualityOperator) -> *Modifier;
```
## EqualityOperator::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: EqualityOperator) -> int;
```
## EqualityOperator::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: EqualityOperator, i: int) -> Node;
```
## EqualityOperator::getStartLineNumber

```rust
pub fn getStartLineNumber(self: EqualityOperator) -> int;
```
## EqualityOperator::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: EqualityOperator) -> *FunctionLikeDeclaration;
```
## EqualityOperator::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: EqualityOperator, level: int) -> *Node;
```
## EqualityOperator::getEndLineNumber

```rust
pub fn getEndLineNumber(self: EqualityOperator) -> int;
```
## EqualityOperator::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: EqualityOperator) -> string;
```
## EqualityOperator::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: EqualityOperator, level: int) -> Node;
```
## EqualityOperator::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: EqualityOperator) -> File;
```
## EqualityOperator::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: EqualityOperator) -> *Comment;
```
## EqualityOperator::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: EqualityOperator) -> *Comment;
```
## EqualityOperator::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: EqualityOperator) -> Node;
```
## EqualityOperator::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: EqualityOperator) -> FunctionLikeDeclaration;
```
## EqualityOperator::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: EqualityOperator) -> int;
```
## EqualityOperator::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: EqualityOperator) -> int;
```
## EqualityOperator::getIndex

```rust
pub fn getIndex(self: EqualityOperator) -> int;
```
## EqualityOperator::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: EqualityOperator) -> *Node;
```
## EqualityOperator::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *EqualityOperator;
```
