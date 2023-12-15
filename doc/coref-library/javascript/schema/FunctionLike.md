# FunctionLike

Inherit from [Node](./Node.md)

Primary key: `id: int`

```rust
schema FunctionLike extends Node {
  @primary id: int
}
```
## FunctionLike::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: FunctionLike) -> *Node;
```
## FunctionLike::getIndex

```rust
pub fn getIndex(self: FunctionLike) -> int;
```
## FunctionLike::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: FunctionLike) -> int;
```
## FunctionLike::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: FunctionLike) -> int;
```
## FunctionLike::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: FunctionLike) -> Node;
```
## FunctionLike::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: FunctionLike) -> FunctionLikeDeclaration;
```
## FunctionLike::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: FunctionLike) -> File;
```
## FunctionLike::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: FunctionLike, level: int) -> Node;
```
## FunctionLike::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: FunctionLike) -> string;
```
## FunctionLike::getEndLineNumber

```rust
pub fn getEndLineNumber(self: FunctionLike) -> int;
```
## FunctionLike::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: FunctionLike) -> *FunctionLikeDeclaration;
```
## FunctionLike::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: FunctionLike, level: int) -> *Node;
```
## FunctionLike::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: FunctionLike) -> int;
```
## FunctionLike::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: FunctionLike) -> *Modifier;
```
## FunctionLike::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: FunctionLike) -> int;
```
## FunctionLike::getStartLineNumber

```rust
pub fn getStartLineNumber(self: FunctionLike) -> int;
```
## FunctionLike::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: FunctionLike, i: int) -> Node;
```
## FunctionLike::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: FunctionLike, i: int) -> Decorator;
```
## FunctionLike::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: FunctionLike) -> TopLevelDO;
```
## FunctionLike::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: FunctionLike) -> int;
```
## FunctionLike::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: FunctionLike) -> *Comment;
```
## FunctionLike::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: FunctionLike) -> *Comment;
```
## FunctionLike::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: FunctionLike) -> Node;
```
## FunctionLike::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: FunctionLike) -> *Node;
```
## FunctionLike::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: FunctionLike) -> *Node;
```
## FunctionLike::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: FunctionLike) -> *Comment;
```
## FunctionLike::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: FunctionLike, i: int) -> Modifier;
```
## FunctionLike::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: FunctionLike) -> string;
```
## FunctionLike::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: FunctionLike) -> *Decorator;
```
## FunctionLike::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: FunctionLike) -> Symbol;
```
## FunctionLike::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: FunctionLike) -> Location;
```
## FunctionLike::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *FunctionLike;
```
