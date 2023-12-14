# UpdateOperator

Inherit from [Token](./Token.md)

Primary key: `id: int`

```rust
schema UpdateOperator extends Token {
  @primary id: int,
}
```
## UpdateOperator::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: UpdateOperator) -> Location;
```
## UpdateOperator::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: UpdateOperator) -> Symbol;
```
## UpdateOperator::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: UpdateOperator) -> *Decorator;
```
## UpdateOperator::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: UpdateOperator) -> string;
```
## UpdateOperator::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: UpdateOperator, i: int) -> Modifier;
```
## UpdateOperator::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: UpdateOperator) -> *Comment;
```
## UpdateOperator::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: UpdateOperator) -> *Node;
```
## UpdateOperator::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: UpdateOperator) -> *Node;
```
## UpdateOperator::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: UpdateOperator) -> Node;
```
## UpdateOperator::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: UpdateOperator) -> int;
```
## UpdateOperator::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: UpdateOperator) -> TopLevelDO;
```
## UpdateOperator::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: UpdateOperator, i: int) -> Decorator;
```
## UpdateOperator::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: UpdateOperator) -> int;
```
## UpdateOperator::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: UpdateOperator) -> *Modifier;
```
## UpdateOperator::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: UpdateOperator) -> int;
```
## UpdateOperator::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: UpdateOperator, i: int) -> Node;
```
## UpdateOperator::getStartLineNumber

```rust
pub fn getStartLineNumber(self: UpdateOperator) -> int;
```
## UpdateOperator::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: UpdateOperator) -> *FunctionLikeDeclaration;
```
## UpdateOperator::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: UpdateOperator, level: int) -> *Node;
```
## UpdateOperator::getEndLineNumber

```rust
pub fn getEndLineNumber(self: UpdateOperator) -> int;
```
## UpdateOperator::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: UpdateOperator) -> string;
```
## UpdateOperator::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: UpdateOperator, level: int) -> Node;
```
## UpdateOperator::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: UpdateOperator) -> File;
```
## UpdateOperator::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: UpdateOperator) -> *Comment;
```
## UpdateOperator::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: UpdateOperator) -> *Comment;
```
## UpdateOperator::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: UpdateOperator) -> Node;
```
## UpdateOperator::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: UpdateOperator) -> FunctionLikeDeclaration;
```
## UpdateOperator::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: UpdateOperator) -> int;
```
## UpdateOperator::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: UpdateOperator) -> int;
```
## UpdateOperator::getIndex

```rust
pub fn getIndex(self: UpdateOperator) -> int;
```
## UpdateOperator::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: UpdateOperator) -> *Node;
```
## UpdateOperator::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *UpdateOperator;
```
