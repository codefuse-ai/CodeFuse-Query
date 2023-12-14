# ThisKeyword

Primary key: `id: int`

```rust
schema ThisKeyword {
  @primary id: int,
}
```
## ThisKeyword::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: ThisKeyword) -> Location;
```
## ThisKeyword::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: ThisKeyword) -> Symbol;
```
## ThisKeyword::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: ThisKeyword) -> *Decorator;
```
## ThisKeyword::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: ThisKeyword) -> string;
```
## ThisKeyword::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: ThisKeyword, i: int) -> Modifier;
```
## ThisKeyword::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: ThisKeyword) -> *Comment;
```
## ThisKeyword::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: ThisKeyword) -> *Node;
```
## ThisKeyword::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: ThisKeyword) -> *Node;
```
## ThisKeyword::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: ThisKeyword) -> Node;
```
## ThisKeyword::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: ThisKeyword) -> int;
```
## ThisKeyword::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: ThisKeyword) -> TopLevelDO;
```
## ThisKeyword::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: ThisKeyword, i: int) -> Decorator;
```
## ThisKeyword::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: ThisKeyword) -> int;
```
## ThisKeyword::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: ThisKeyword) -> *Modifier;
```
## ThisKeyword::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ThisKeyword) -> int;
```
## ThisKeyword::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: ThisKeyword, i: int) -> Node;
```
## ThisKeyword::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ThisKeyword) -> int;
```
## ThisKeyword::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ThisKeyword) -> *FunctionLikeDeclaration;
```
## ThisKeyword::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: ThisKeyword, level: int) -> *Node;
```
## ThisKeyword::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ThisKeyword) -> int;
```
## ThisKeyword::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: ThisKeyword) -> string;
```
## ThisKeyword::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: ThisKeyword, level: int) -> Node;
```
## ThisKeyword::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: ThisKeyword) -> File;
```
## ThisKeyword::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: ThisKeyword) -> *Comment;
```
## ThisKeyword::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: ThisKeyword) -> *Comment;
```
## ThisKeyword::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: ThisKeyword) -> Node;
```
## ThisKeyword::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: ThisKeyword) -> FunctionLikeDeclaration;
```
## ThisKeyword::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ThisKeyword) -> int;
```
## ThisKeyword::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: ThisKeyword) -> int;
```
## ThisKeyword::getIndex

```rust
pub fn getIndex(self: ThisKeyword) -> int;
```
## ThisKeyword::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: ThisKeyword) -> *Node;
```
## ThisKeyword::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *ThisKeyword;
```
