# AssignmentOperator

Inherit from [Token](./Token.md)

Primary key: `id: int`

```rust
schema AssignmentOperator extends Token {
  @primary id: int,
}
```
## AssignmentOperator::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: AssignmentOperator) -> Location;
```
## AssignmentOperator::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: AssignmentOperator) -> Symbol;
```
## AssignmentOperator::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: AssignmentOperator) -> *Decorator;
```
## AssignmentOperator::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: AssignmentOperator) -> string;
```
## AssignmentOperator::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: AssignmentOperator, i: int) -> Modifier;
```
## AssignmentOperator::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: AssignmentOperator) -> *Comment;
```
## AssignmentOperator::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: AssignmentOperator) -> *Node;
```
## AssignmentOperator::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: AssignmentOperator) -> *Node;
```
## AssignmentOperator::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: AssignmentOperator) -> Node;
```
## AssignmentOperator::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: AssignmentOperator) -> int;
```
## AssignmentOperator::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: AssignmentOperator) -> TopLevelDO;
```
## AssignmentOperator::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: AssignmentOperator, i: int) -> Decorator;
```
## AssignmentOperator::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: AssignmentOperator) -> int;
```
## AssignmentOperator::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: AssignmentOperator) -> *Modifier;
```
## AssignmentOperator::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: AssignmentOperator) -> int;
```
## AssignmentOperator::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: AssignmentOperator, i: int) -> Node;
```
## AssignmentOperator::getStartLineNumber

```rust
pub fn getStartLineNumber(self: AssignmentOperator) -> int;
```
## AssignmentOperator::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: AssignmentOperator) -> *FunctionLikeDeclaration;
```
## AssignmentOperator::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: AssignmentOperator, level: int) -> *Node;
```
## AssignmentOperator::getEndLineNumber

```rust
pub fn getEndLineNumber(self: AssignmentOperator) -> int;
```
## AssignmentOperator::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: AssignmentOperator) -> string;
```
## AssignmentOperator::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: AssignmentOperator, level: int) -> Node;
```
## AssignmentOperator::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: AssignmentOperator) -> File;
```
## AssignmentOperator::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: AssignmentOperator) -> *Comment;
```
## AssignmentOperator::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: AssignmentOperator) -> *Comment;
```
## AssignmentOperator::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: AssignmentOperator) -> Node;
```
## AssignmentOperator::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: AssignmentOperator) -> FunctionLikeDeclaration;
```
## AssignmentOperator::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: AssignmentOperator) -> int;
```
## AssignmentOperator::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: AssignmentOperator) -> int;
```
## AssignmentOperator::getIndex

```rust
pub fn getIndex(self: AssignmentOperator) -> int;
```
## AssignmentOperator::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: AssignmentOperator) -> *Node;
```
## AssignmentOperator::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *AssignmentOperator;
```
