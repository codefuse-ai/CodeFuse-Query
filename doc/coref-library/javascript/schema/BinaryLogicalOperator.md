# BinaryLogicalOperator

Inherit from [Token](./Token.md)

Primary key: `id: int`

```rust
schema BinaryLogicalOperator extends Token {
  @primary id: int
}
```
## BinaryLogicalOperator::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: BinaryLogicalOperator) -> Location;
```
## BinaryLogicalOperator::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: BinaryLogicalOperator) -> Symbol;
```
## BinaryLogicalOperator::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: BinaryLogicalOperator) -> *Decorator;
```
## BinaryLogicalOperator::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: BinaryLogicalOperator) -> string;
```
## BinaryLogicalOperator::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: BinaryLogicalOperator, i: int) -> Modifier;
```
## BinaryLogicalOperator::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: BinaryLogicalOperator) -> *Comment;
```
## BinaryLogicalOperator::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: BinaryLogicalOperator) -> *Node;
```
## BinaryLogicalOperator::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: BinaryLogicalOperator) -> *Node;
```
## BinaryLogicalOperator::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: BinaryLogicalOperator) -> Node;
```
## BinaryLogicalOperator::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: BinaryLogicalOperator) -> int;
```
## BinaryLogicalOperator::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: BinaryLogicalOperator) -> TopLevelDO;
```
## BinaryLogicalOperator::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: BinaryLogicalOperator, i: int) -> Decorator;
```
## BinaryLogicalOperator::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: BinaryLogicalOperator) -> int;
```
## BinaryLogicalOperator::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: BinaryLogicalOperator) -> *Modifier;
```
## BinaryLogicalOperator::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: BinaryLogicalOperator) -> int;
```
## BinaryLogicalOperator::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: BinaryLogicalOperator, i: int) -> Node;
```
## BinaryLogicalOperator::getStartLineNumber

```rust
pub fn getStartLineNumber(self: BinaryLogicalOperator) -> int;
```
## BinaryLogicalOperator::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: BinaryLogicalOperator) -> *FunctionLikeDeclaration;
```
## BinaryLogicalOperator::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: BinaryLogicalOperator, level: int) -> *Node;
```
## BinaryLogicalOperator::getEndLineNumber

```rust
pub fn getEndLineNumber(self: BinaryLogicalOperator) -> int;
```
## BinaryLogicalOperator::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: BinaryLogicalOperator) -> string;
```
## BinaryLogicalOperator::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: BinaryLogicalOperator, level: int) -> Node;
```
## BinaryLogicalOperator::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: BinaryLogicalOperator) -> File;
```
## BinaryLogicalOperator::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: BinaryLogicalOperator) -> *Comment;
```
## BinaryLogicalOperator::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: BinaryLogicalOperator) -> *Comment;
```
## BinaryLogicalOperator::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: BinaryLogicalOperator) -> Node;
```
## BinaryLogicalOperator::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: BinaryLogicalOperator) -> FunctionLikeDeclaration;
```
## BinaryLogicalOperator::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: BinaryLogicalOperator) -> int;
```
## BinaryLogicalOperator::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: BinaryLogicalOperator) -> int;
```
## BinaryLogicalOperator::getIndex

```rust
pub fn getIndex(self: BinaryLogicalOperator) -> int;
```
## BinaryLogicalOperator::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: BinaryLogicalOperator) -> *Node;
```
## BinaryLogicalOperator::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *BinaryLogicalOperator;
```
