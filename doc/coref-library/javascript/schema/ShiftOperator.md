# ShiftOperator

Inherit from [Token](./Token.md)

Primary key: `id: int`

```rust
schema ShiftOperator extends Token {
  @primary id: int
}
```
## ShiftOperator::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: ShiftOperator) -> Location;
```
## ShiftOperator::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: ShiftOperator) -> Symbol;
```
## ShiftOperator::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: ShiftOperator) -> *Decorator;
```
## ShiftOperator::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: ShiftOperator) -> string;
```
## ShiftOperator::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: ShiftOperator, i: int) -> Modifier;
```
## ShiftOperator::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: ShiftOperator) -> *Comment;
```
## ShiftOperator::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: ShiftOperator) -> *Node;
```
## ShiftOperator::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: ShiftOperator) -> *Node;
```
## ShiftOperator::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: ShiftOperator) -> Node;
```
## ShiftOperator::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: ShiftOperator) -> int;
```
## ShiftOperator::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: ShiftOperator) -> TopLevelDO;
```
## ShiftOperator::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: ShiftOperator, i: int) -> Decorator;
```
## ShiftOperator::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: ShiftOperator) -> int;
```
## ShiftOperator::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: ShiftOperator) -> *Modifier;
```
## ShiftOperator::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ShiftOperator) -> int;
```
## ShiftOperator::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: ShiftOperator, i: int) -> Node;
```
## ShiftOperator::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ShiftOperator) -> int;
```
## ShiftOperator::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ShiftOperator) -> *FunctionLikeDeclaration;
```
## ShiftOperator::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: ShiftOperator, level: int) -> *Node;
```
## ShiftOperator::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ShiftOperator) -> int;
```
## ShiftOperator::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: ShiftOperator) -> string;
```
## ShiftOperator::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: ShiftOperator, level: int) -> Node;
```
## ShiftOperator::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: ShiftOperator) -> File;
```
## ShiftOperator::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: ShiftOperator) -> *Comment;
```
## ShiftOperator::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: ShiftOperator) -> *Comment;
```
## ShiftOperator::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: ShiftOperator) -> Node;
```
## ShiftOperator::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: ShiftOperator) -> FunctionLikeDeclaration;
```
## ShiftOperator::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ShiftOperator) -> int;
```
## ShiftOperator::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: ShiftOperator) -> int;
```
## ShiftOperator::getIndex

```rust
pub fn getIndex(self: ShiftOperator) -> int;
```
## ShiftOperator::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: ShiftOperator) -> *Node;
```
## ShiftOperator::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *ShiftOperator;
```
