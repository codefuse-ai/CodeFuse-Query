# PrefixUnaryOperator

Inherit from [Token](./Token.md)

Primary key: `id: int`

```rust
schema PrefixUnaryOperator extends Token {
  @primary id: int
}
```
## PrefixUnaryOperator::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: PrefixUnaryOperator) -> Location;
```
## PrefixUnaryOperator::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: PrefixUnaryOperator) -> Symbol;
```
## PrefixUnaryOperator::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: PrefixUnaryOperator) -> *Decorator;
```
## PrefixUnaryOperator::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: PrefixUnaryOperator) -> string;
```
## PrefixUnaryOperator::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: PrefixUnaryOperator, i: int) -> Modifier;
```
## PrefixUnaryOperator::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: PrefixUnaryOperator) -> *Comment;
```
## PrefixUnaryOperator::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: PrefixUnaryOperator) -> *Node;
```
## PrefixUnaryOperator::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: PrefixUnaryOperator) -> *Node;
```
## PrefixUnaryOperator::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: PrefixUnaryOperator) -> Node;
```
## PrefixUnaryOperator::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: PrefixUnaryOperator) -> int;
```
## PrefixUnaryOperator::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: PrefixUnaryOperator) -> TopLevelDO;
```
## PrefixUnaryOperator::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: PrefixUnaryOperator, i: int) -> Decorator;
```
## PrefixUnaryOperator::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: PrefixUnaryOperator) -> int;
```
## PrefixUnaryOperator::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: PrefixUnaryOperator) -> *Modifier;
```
## PrefixUnaryOperator::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: PrefixUnaryOperator) -> int;
```
## PrefixUnaryOperator::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: PrefixUnaryOperator, i: int) -> Node;
```
## PrefixUnaryOperator::getStartLineNumber

```rust
pub fn getStartLineNumber(self: PrefixUnaryOperator) -> int;
```
## PrefixUnaryOperator::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: PrefixUnaryOperator) -> *FunctionLikeDeclaration;
```
## PrefixUnaryOperator::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: PrefixUnaryOperator, level: int) -> *Node;
```
## PrefixUnaryOperator::getEndLineNumber

```rust
pub fn getEndLineNumber(self: PrefixUnaryOperator) -> int;
```
## PrefixUnaryOperator::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: PrefixUnaryOperator) -> string;
```
## PrefixUnaryOperator::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: PrefixUnaryOperator, level: int) -> Node;
```
## PrefixUnaryOperator::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: PrefixUnaryOperator) -> File;
```
## PrefixUnaryOperator::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: PrefixUnaryOperator) -> *Comment;
```
## PrefixUnaryOperator::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: PrefixUnaryOperator) -> *Comment;
```
## PrefixUnaryOperator::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: PrefixUnaryOperator) -> Node;
```
## PrefixUnaryOperator::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: PrefixUnaryOperator) -> FunctionLikeDeclaration;
```
## PrefixUnaryOperator::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: PrefixUnaryOperator) -> int;
```
## PrefixUnaryOperator::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: PrefixUnaryOperator) -> int;
```
## PrefixUnaryOperator::getIndex

```rust
pub fn getIndex(self: PrefixUnaryOperator) -> int;
```
## PrefixUnaryOperator::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: PrefixUnaryOperator) -> *Node;
```
## PrefixUnaryOperator::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *PrefixUnaryOperator;
```
