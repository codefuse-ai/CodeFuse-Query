# AdditiveOperator

Inherit from [Token](./Token.md)

Primary key: `id: int`

```rust
schema AdditiveOperator extends Token {
  @primary id: int,
}
```
## AdditiveOperator::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: AdditiveOperator) -> Location;
```
## AdditiveOperator::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: AdditiveOperator) -> Symbol;
```
## AdditiveOperator::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: AdditiveOperator) -> *Decorator;
```
## AdditiveOperator::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: AdditiveOperator) -> string;
```
## AdditiveOperator::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: AdditiveOperator, i: int) -> Modifier;
```
## AdditiveOperator::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: AdditiveOperator) -> *Comment;
```
## AdditiveOperator::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: AdditiveOperator) -> *Node;
```
## AdditiveOperator::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: AdditiveOperator) -> *Node;
```
## AdditiveOperator::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: AdditiveOperator) -> Node;
```
## AdditiveOperator::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: AdditiveOperator) -> int;
```
## AdditiveOperator::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: AdditiveOperator) -> TopLevelDO;
```
## AdditiveOperator::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: AdditiveOperator, i: int) -> Decorator;
```
## AdditiveOperator::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: AdditiveOperator) -> int;
```
## AdditiveOperator::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: AdditiveOperator) -> *Modifier;
```
## AdditiveOperator::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: AdditiveOperator) -> int;
```
## AdditiveOperator::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: AdditiveOperator, i: int) -> Node;
```
## AdditiveOperator::getStartLineNumber

```rust
pub fn getStartLineNumber(self: AdditiveOperator) -> int;
```
## AdditiveOperator::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: AdditiveOperator) -> *FunctionLikeDeclaration;
```
## AdditiveOperator::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: AdditiveOperator, level: int) -> *Node;
```
## AdditiveOperator::getEndLineNumber

```rust
pub fn getEndLineNumber(self: AdditiveOperator) -> int;
```
## AdditiveOperator::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: AdditiveOperator) -> string;
```
## AdditiveOperator::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: AdditiveOperator, level: int) -> Node;
```
## AdditiveOperator::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: AdditiveOperator) -> File;
```
## AdditiveOperator::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: AdditiveOperator) -> *Comment;
```
## AdditiveOperator::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: AdditiveOperator) -> *Comment;
```
## AdditiveOperator::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: AdditiveOperator) -> Node;
```
## AdditiveOperator::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: AdditiveOperator) -> FunctionLikeDeclaration;
```
## AdditiveOperator::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: AdditiveOperator) -> int;
```
## AdditiveOperator::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: AdditiveOperator) -> int;
```
## AdditiveOperator::getIndex

```rust
pub fn getIndex(self: AdditiveOperator) -> int;
```
## AdditiveOperator::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: AdditiveOperator) -> *Node;
```
## AdditiveOperator::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *AdditiveOperator;
```
