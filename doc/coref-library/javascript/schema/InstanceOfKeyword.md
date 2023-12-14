# InstanceOfKeyword

Inherit from [Token](./Token.md)

Primary key: `id: int`

```rust
schema InstanceOfKeyword extends Token {
  @primary id: int,
}
```
## InstanceOfKeyword::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: InstanceOfKeyword) -> Location;
```
## InstanceOfKeyword::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: InstanceOfKeyword) -> Symbol;
```
## InstanceOfKeyword::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: InstanceOfKeyword) -> *Decorator;
```
## InstanceOfKeyword::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: InstanceOfKeyword) -> string;
```
## InstanceOfKeyword::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: InstanceOfKeyword, i: int) -> Modifier;
```
## InstanceOfKeyword::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: InstanceOfKeyword) -> *Comment;
```
## InstanceOfKeyword::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: InstanceOfKeyword) -> *Node;
```
## InstanceOfKeyword::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: InstanceOfKeyword) -> *Node;
```
## InstanceOfKeyword::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: InstanceOfKeyword) -> Node;
```
## InstanceOfKeyword::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: InstanceOfKeyword) -> int;
```
## InstanceOfKeyword::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: InstanceOfKeyword) -> TopLevelDO;
```
## InstanceOfKeyword::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: InstanceOfKeyword, i: int) -> Decorator;
```
## InstanceOfKeyword::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: InstanceOfKeyword) -> int;
```
## InstanceOfKeyword::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: InstanceOfKeyword) -> *Modifier;
```
## InstanceOfKeyword::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: InstanceOfKeyword) -> int;
```
## InstanceOfKeyword::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: InstanceOfKeyword, i: int) -> Node;
```
## InstanceOfKeyword::getStartLineNumber

```rust
pub fn getStartLineNumber(self: InstanceOfKeyword) -> int;
```
## InstanceOfKeyword::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: InstanceOfKeyword) -> *FunctionLikeDeclaration;
```
## InstanceOfKeyword::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: InstanceOfKeyword, level: int) -> *Node;
```
## InstanceOfKeyword::getEndLineNumber

```rust
pub fn getEndLineNumber(self: InstanceOfKeyword) -> int;
```
## InstanceOfKeyword::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: InstanceOfKeyword) -> string;
```
## InstanceOfKeyword::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: InstanceOfKeyword, level: int) -> Node;
```
## InstanceOfKeyword::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: InstanceOfKeyword) -> File;
```
## InstanceOfKeyword::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: InstanceOfKeyword) -> *Comment;
```
## InstanceOfKeyword::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: InstanceOfKeyword) -> *Comment;
```
## InstanceOfKeyword::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: InstanceOfKeyword) -> Node;
```
## InstanceOfKeyword::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: InstanceOfKeyword) -> FunctionLikeDeclaration;
```
## InstanceOfKeyword::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: InstanceOfKeyword) -> int;
```
## InstanceOfKeyword::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: InstanceOfKeyword) -> int;
```
## InstanceOfKeyword::getIndex

```rust
pub fn getIndex(self: InstanceOfKeyword) -> int;
```
## InstanceOfKeyword::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: InstanceOfKeyword) -> *Node;
```
## InstanceOfKeyword::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *InstanceOfKeyword;
```
