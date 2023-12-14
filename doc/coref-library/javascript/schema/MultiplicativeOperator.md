# MultiplicativeOperator

Primary key: `id: int`

```rust
schema MultiplicativeOperator {
  @primary id: int,
}
```
## MultiplicativeOperator::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: MultiplicativeOperator) -> Location;
```
## MultiplicativeOperator::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: MultiplicativeOperator) -> Symbol;
```
## MultiplicativeOperator::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: MultiplicativeOperator) -> *Decorator;
```
## MultiplicativeOperator::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: MultiplicativeOperator) -> string;
```
## MultiplicativeOperator::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: MultiplicativeOperator, i: int) -> Modifier;
```
## MultiplicativeOperator::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: MultiplicativeOperator) -> *Comment;
```
## MultiplicativeOperator::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: MultiplicativeOperator) -> *Node;
```
## MultiplicativeOperator::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: MultiplicativeOperator) -> *Node;
```
## MultiplicativeOperator::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: MultiplicativeOperator) -> Node;
```
## MultiplicativeOperator::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: MultiplicativeOperator) -> int;
```
## MultiplicativeOperator::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: MultiplicativeOperator) -> TopLevelDO;
```
## MultiplicativeOperator::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: MultiplicativeOperator, i: int) -> Decorator;
```
## MultiplicativeOperator::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: MultiplicativeOperator) -> int;
```
## MultiplicativeOperator::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: MultiplicativeOperator) -> *Modifier;
```
## MultiplicativeOperator::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: MultiplicativeOperator) -> int;
```
## MultiplicativeOperator::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: MultiplicativeOperator, i: int) -> Node;
```
## MultiplicativeOperator::getStartLineNumber

```rust
pub fn getStartLineNumber(self: MultiplicativeOperator) -> int;
```
## MultiplicativeOperator::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: MultiplicativeOperator) -> *FunctionLikeDeclaration;
```
## MultiplicativeOperator::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: MultiplicativeOperator, level: int) -> *Node;
```
## MultiplicativeOperator::getEndLineNumber

```rust
pub fn getEndLineNumber(self: MultiplicativeOperator) -> int;
```
## MultiplicativeOperator::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: MultiplicativeOperator) -> string;
```
## MultiplicativeOperator::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: MultiplicativeOperator, level: int) -> Node;
```
## MultiplicativeOperator::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: MultiplicativeOperator) -> File;
```
## MultiplicativeOperator::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: MultiplicativeOperator) -> *Comment;
```
## MultiplicativeOperator::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: MultiplicativeOperator) -> *Comment;
```
## MultiplicativeOperator::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: MultiplicativeOperator) -> Node;
```
## MultiplicativeOperator::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: MultiplicativeOperator) -> FunctionLikeDeclaration;
```
## MultiplicativeOperator::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: MultiplicativeOperator) -> int;
```
## MultiplicativeOperator::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: MultiplicativeOperator) -> int;
```
## MultiplicativeOperator::getIndex

```rust
pub fn getIndex(self: MultiplicativeOperator) -> int;
```
## MultiplicativeOperator::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: MultiplicativeOperator) -> *Node;
```
## MultiplicativeOperator::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *MultiplicativeOperator;
```
