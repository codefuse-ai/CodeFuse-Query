# BinaryBitwiseOperator

Inherit from [Token](./Token.md)

Primary key: `id: int`

```rust
schema BinaryBitwiseOperator extends Token {
  @primary id: int,
}
```
## BinaryBitwiseOperator::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: BinaryBitwiseOperator) -> Location;
```
## BinaryBitwiseOperator::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: BinaryBitwiseOperator) -> Symbol;
```
## BinaryBitwiseOperator::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: BinaryBitwiseOperator) -> *Decorator;
```
## BinaryBitwiseOperator::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: BinaryBitwiseOperator) -> string;
```
## BinaryBitwiseOperator::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: BinaryBitwiseOperator, i: int) -> Modifier;
```
## BinaryBitwiseOperator::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: BinaryBitwiseOperator) -> *Comment;
```
## BinaryBitwiseOperator::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: BinaryBitwiseOperator) -> *Node;
```
## BinaryBitwiseOperator::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: BinaryBitwiseOperator) -> *Node;
```
## BinaryBitwiseOperator::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: BinaryBitwiseOperator) -> Node;
```
## BinaryBitwiseOperator::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: BinaryBitwiseOperator) -> int;
```
## BinaryBitwiseOperator::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: BinaryBitwiseOperator) -> TopLevelDO;
```
## BinaryBitwiseOperator::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: BinaryBitwiseOperator, i: int) -> Decorator;
```
## BinaryBitwiseOperator::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: BinaryBitwiseOperator) -> int;
```
## BinaryBitwiseOperator::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: BinaryBitwiseOperator) -> *Modifier;
```
## BinaryBitwiseOperator::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: BinaryBitwiseOperator) -> int;
```
## BinaryBitwiseOperator::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: BinaryBitwiseOperator, i: int) -> Node;
```
## BinaryBitwiseOperator::getStartLineNumber

```rust
pub fn getStartLineNumber(self: BinaryBitwiseOperator) -> int;
```
## BinaryBitwiseOperator::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: BinaryBitwiseOperator) -> *FunctionLikeDeclaration;
```
## BinaryBitwiseOperator::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: BinaryBitwiseOperator, level: int) -> *Node;
```
## BinaryBitwiseOperator::getEndLineNumber

```rust
pub fn getEndLineNumber(self: BinaryBitwiseOperator) -> int;
```
## BinaryBitwiseOperator::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: BinaryBitwiseOperator) -> string;
```
## BinaryBitwiseOperator::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: BinaryBitwiseOperator, level: int) -> Node;
```
## BinaryBitwiseOperator::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: BinaryBitwiseOperator) -> File;
```
## BinaryBitwiseOperator::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: BinaryBitwiseOperator) -> *Comment;
```
## BinaryBitwiseOperator::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: BinaryBitwiseOperator) -> *Comment;
```
## BinaryBitwiseOperator::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: BinaryBitwiseOperator) -> Node;
```
## BinaryBitwiseOperator::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: BinaryBitwiseOperator) -> FunctionLikeDeclaration;
```
## BinaryBitwiseOperator::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: BinaryBitwiseOperator) -> int;
```
## BinaryBitwiseOperator::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: BinaryBitwiseOperator) -> int;
```
## BinaryBitwiseOperator::getIndex

```rust
pub fn getIndex(self: BinaryBitwiseOperator) -> int;
```
## BinaryBitwiseOperator::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: BinaryBitwiseOperator) -> *Node;
```
## BinaryBitwiseOperator::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *BinaryBitwiseOperator;
```
