# BinaryOperator

Inherit from [Token](./Token.md)

Primary key: `id: int`

```rust
schema BinaryOperator extends Token {
  @primary id: int
}
```
## BinaryOperator::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: BinaryOperator) -> Location;
```
## BinaryOperator::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: BinaryOperator) -> Symbol;
```
## BinaryOperator::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: BinaryOperator) -> *Decorator;
```
## BinaryOperator::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: BinaryOperator) -> string;
```
## BinaryOperator::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: BinaryOperator, i: int) -> Modifier;
```
## BinaryOperator::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: BinaryOperator) -> *Comment;
```
## BinaryOperator::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: BinaryOperator) -> *Node;
```
## BinaryOperator::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: BinaryOperator) -> *Node;
```
## BinaryOperator::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: BinaryOperator) -> Node;
```
## BinaryOperator::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: BinaryOperator) -> int;
```
## BinaryOperator::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: BinaryOperator) -> TopLevelDO;
```
## BinaryOperator::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: BinaryOperator, i: int) -> Decorator;
```
## BinaryOperator::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: BinaryOperator) -> int;
```
## BinaryOperator::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: BinaryOperator) -> *Modifier;
```
## BinaryOperator::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: BinaryOperator) -> int;
```
## BinaryOperator::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: BinaryOperator, i: int) -> Node;
```
## BinaryOperator::getStartLineNumber

```rust
pub fn getStartLineNumber(self: BinaryOperator) -> int;
```
## BinaryOperator::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: BinaryOperator) -> *FunctionLikeDeclaration;
```
## BinaryOperator::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: BinaryOperator, level: int) -> *Node;
```
## BinaryOperator::getEndLineNumber

```rust
pub fn getEndLineNumber(self: BinaryOperator) -> int;
```
## BinaryOperator::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: BinaryOperator) -> string;
```
## BinaryOperator::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: BinaryOperator, level: int) -> Node;
```
## BinaryOperator::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: BinaryOperator) -> File;
```
## BinaryOperator::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: BinaryOperator) -> *Comment;
```
## BinaryOperator::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: BinaryOperator) -> *Comment;
```
## BinaryOperator::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: BinaryOperator) -> Node;
```
## BinaryOperator::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: BinaryOperator) -> FunctionLikeDeclaration;
```
## BinaryOperator::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: BinaryOperator) -> int;
```
## BinaryOperator::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: BinaryOperator) -> int;
```
## BinaryOperator::getIndex

```rust
pub fn getIndex(self: BinaryOperator) -> int;
```
## BinaryOperator::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: BinaryOperator) -> *Node;
```
## BinaryOperator::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *BinaryOperator;
```
