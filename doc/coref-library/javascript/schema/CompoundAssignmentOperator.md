# CompoundAssignmentOperator

Inherit from [Token](./Token.md)

Primary key: `id: int`

```rust
schema CompoundAssignmentOperator extends Token {
  @primary id: int,
}
```
## CompoundAssignmentOperator::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: CompoundAssignmentOperator) -> Location;
```
## CompoundAssignmentOperator::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: CompoundAssignmentOperator) -> Symbol;
```
## CompoundAssignmentOperator::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: CompoundAssignmentOperator) -> *Decorator;
```
## CompoundAssignmentOperator::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: CompoundAssignmentOperator) -> string;
```
## CompoundAssignmentOperator::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: CompoundAssignmentOperator, i: int) -> Modifier;
```
## CompoundAssignmentOperator::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: CompoundAssignmentOperator) -> *Comment;
```
## CompoundAssignmentOperator::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: CompoundAssignmentOperator) -> *Node;
```
## CompoundAssignmentOperator::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: CompoundAssignmentOperator) -> *Node;
```
## CompoundAssignmentOperator::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: CompoundAssignmentOperator) -> Node;
```
## CompoundAssignmentOperator::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: CompoundAssignmentOperator) -> int;
```
## CompoundAssignmentOperator::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: CompoundAssignmentOperator) -> TopLevelDO;
```
## CompoundAssignmentOperator::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: CompoundAssignmentOperator, i: int) -> Decorator;
```
## CompoundAssignmentOperator::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: CompoundAssignmentOperator) -> int;
```
## CompoundAssignmentOperator::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: CompoundAssignmentOperator) -> *Modifier;
```
## CompoundAssignmentOperator::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: CompoundAssignmentOperator) -> int;
```
## CompoundAssignmentOperator::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: CompoundAssignmentOperator, i: int) -> Node;
```
## CompoundAssignmentOperator::getStartLineNumber

```rust
pub fn getStartLineNumber(self: CompoundAssignmentOperator) -> int;
```
## CompoundAssignmentOperator::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: CompoundAssignmentOperator) -> *FunctionLikeDeclaration;
```
## CompoundAssignmentOperator::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: CompoundAssignmentOperator, level: int) -> *Node;
```
## CompoundAssignmentOperator::getEndLineNumber

```rust
pub fn getEndLineNumber(self: CompoundAssignmentOperator) -> int;
```
## CompoundAssignmentOperator::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: CompoundAssignmentOperator) -> string;
```
## CompoundAssignmentOperator::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: CompoundAssignmentOperator, level: int) -> Node;
```
## CompoundAssignmentOperator::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: CompoundAssignmentOperator) -> File;
```
## CompoundAssignmentOperator::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: CompoundAssignmentOperator) -> *Comment;
```
## CompoundAssignmentOperator::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: CompoundAssignmentOperator) -> *Comment;
```
## CompoundAssignmentOperator::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: CompoundAssignmentOperator) -> Node;
```
## CompoundAssignmentOperator::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: CompoundAssignmentOperator) -> FunctionLikeDeclaration;
```
## CompoundAssignmentOperator::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: CompoundAssignmentOperator) -> int;
```
## CompoundAssignmentOperator::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: CompoundAssignmentOperator) -> int;
```
## CompoundAssignmentOperator::getIndex

```rust
pub fn getIndex(self: CompoundAssignmentOperator) -> int;
```
## CompoundAssignmentOperator::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: CompoundAssignmentOperator) -> *Node;
```
## CompoundAssignmentOperator::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *CompoundAssignmentOperator;
```
