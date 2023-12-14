# AnyKeyword

Inherit from [Token](./Token.md)

Primary key: `id: int`

```rust
schema AnyKeyword extends Token {
  @primary id: int,
}
```
## AnyKeyword::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: AnyKeyword) -> Location;
```
## AnyKeyword::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: AnyKeyword) -> Symbol;
```
## AnyKeyword::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: AnyKeyword) -> *Decorator;
```
## AnyKeyword::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: AnyKeyword) -> string;
```
## AnyKeyword::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: AnyKeyword, i: int) -> Modifier;
```
## AnyKeyword::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: AnyKeyword) -> *Comment;
```
## AnyKeyword::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: AnyKeyword) -> *Node;
```
## AnyKeyword::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: AnyKeyword) -> *Node;
```
## AnyKeyword::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: AnyKeyword) -> Node;
```
## AnyKeyword::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: AnyKeyword) -> int;
```
## AnyKeyword::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: AnyKeyword) -> TopLevelDO;
```
## AnyKeyword::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: AnyKeyword, i: int) -> Decorator;
```
## AnyKeyword::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: AnyKeyword) -> int;
```
## AnyKeyword::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: AnyKeyword) -> *Modifier;
```
## AnyKeyword::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: AnyKeyword) -> int;
```
## AnyKeyword::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: AnyKeyword, i: int) -> Node;
```
## AnyKeyword::getStartLineNumber

```rust
pub fn getStartLineNumber(self: AnyKeyword) -> int;
```
## AnyKeyword::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: AnyKeyword) -> *FunctionLikeDeclaration;
```
## AnyKeyword::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: AnyKeyword, level: int) -> *Node;
```
## AnyKeyword::getEndLineNumber

```rust
pub fn getEndLineNumber(self: AnyKeyword) -> int;
```
## AnyKeyword::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: AnyKeyword) -> string;
```
## AnyKeyword::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: AnyKeyword, level: int) -> Node;
```
## AnyKeyword::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: AnyKeyword) -> File;
```
## AnyKeyword::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: AnyKeyword) -> *Comment;
```
## AnyKeyword::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: AnyKeyword) -> *Comment;
```
## AnyKeyword::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: AnyKeyword) -> Node;
```
## AnyKeyword::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: AnyKeyword) -> FunctionLikeDeclaration;
```
## AnyKeyword::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: AnyKeyword) -> int;
```
## AnyKeyword::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: AnyKeyword) -> int;
```
## AnyKeyword::getIndex

```rust
pub fn getIndex(self: AnyKeyword) -> int;
```
## AnyKeyword::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: AnyKeyword) -> *Node;
```
## AnyKeyword::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *AnyKeyword;
```
