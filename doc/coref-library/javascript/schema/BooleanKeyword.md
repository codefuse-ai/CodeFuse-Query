# BooleanKeyword

Inherit from [Token](./Token.md)

Primary key: `id: int`

```rust
schema BooleanKeyword extends Token {
  @primary id: int,
}
```
## BooleanKeyword::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: BooleanKeyword) -> Location;
```
## BooleanKeyword::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: BooleanKeyword) -> Symbol;
```
## BooleanKeyword::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: BooleanKeyword) -> *Decorator;
```
## BooleanKeyword::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: BooleanKeyword) -> string;
```
## BooleanKeyword::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: BooleanKeyword, i: int) -> Modifier;
```
## BooleanKeyword::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: BooleanKeyword) -> *Comment;
```
## BooleanKeyword::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: BooleanKeyword) -> *Node;
```
## BooleanKeyword::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: BooleanKeyword) -> *Node;
```
## BooleanKeyword::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: BooleanKeyword) -> Node;
```
## BooleanKeyword::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: BooleanKeyword) -> int;
```
## BooleanKeyword::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: BooleanKeyword) -> TopLevelDO;
```
## BooleanKeyword::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: BooleanKeyword, i: int) -> Decorator;
```
## BooleanKeyword::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: BooleanKeyword) -> int;
```
## BooleanKeyword::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: BooleanKeyword) -> *Modifier;
```
## BooleanKeyword::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: BooleanKeyword) -> int;
```
## BooleanKeyword::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: BooleanKeyword, i: int) -> Node;
```
## BooleanKeyword::getStartLineNumber

```rust
pub fn getStartLineNumber(self: BooleanKeyword) -> int;
```
## BooleanKeyword::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: BooleanKeyword) -> *FunctionLikeDeclaration;
```
## BooleanKeyword::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: BooleanKeyword, level: int) -> *Node;
```
## BooleanKeyword::getEndLineNumber

```rust
pub fn getEndLineNumber(self: BooleanKeyword) -> int;
```
## BooleanKeyword::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: BooleanKeyword) -> string;
```
## BooleanKeyword::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: BooleanKeyword, level: int) -> Node;
```
## BooleanKeyword::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: BooleanKeyword) -> File;
```
## BooleanKeyword::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: BooleanKeyword) -> *Comment;
```
## BooleanKeyword::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: BooleanKeyword) -> *Comment;
```
## BooleanKeyword::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: BooleanKeyword) -> Node;
```
## BooleanKeyword::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: BooleanKeyword) -> FunctionLikeDeclaration;
```
## BooleanKeyword::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: BooleanKeyword) -> int;
```
## BooleanKeyword::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: BooleanKeyword) -> int;
```
## BooleanKeyword::getIndex

```rust
pub fn getIndex(self: BooleanKeyword) -> int;
```
## BooleanKeyword::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: BooleanKeyword) -> *Node;
```
## BooleanKeyword::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *BooleanKeyword;
```
