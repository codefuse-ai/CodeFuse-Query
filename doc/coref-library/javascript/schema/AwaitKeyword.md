# AwaitKeyword

Inherit from [Token](./Token.md)

Primary key: `id: int`

```rust
schema AwaitKeyword extends Token {
  @primary id: int
}
```
## AwaitKeyword::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: AwaitKeyword) -> Location;
```
## AwaitKeyword::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: AwaitKeyword) -> Symbol;
```
## AwaitKeyword::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: AwaitKeyword) -> *Decorator;
```
## AwaitKeyword::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: AwaitKeyword) -> string;
```
## AwaitKeyword::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: AwaitKeyword, i: int) -> Modifier;
```
## AwaitKeyword::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: AwaitKeyword) -> *Comment;
```
## AwaitKeyword::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: AwaitKeyword) -> *Node;
```
## AwaitKeyword::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: AwaitKeyword) -> *Node;
```
## AwaitKeyword::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: AwaitKeyword) -> Node;
```
## AwaitKeyword::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: AwaitKeyword) -> int;
```
## AwaitKeyword::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: AwaitKeyword) -> TopLevelDO;
```
## AwaitKeyword::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: AwaitKeyword, i: int) -> Decorator;
```
## AwaitKeyword::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: AwaitKeyword) -> int;
```
## AwaitKeyword::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: AwaitKeyword) -> *Modifier;
```
## AwaitKeyword::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: AwaitKeyword) -> int;
```
## AwaitKeyword::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: AwaitKeyword, i: int) -> Node;
```
## AwaitKeyword::getStartLineNumber

```rust
pub fn getStartLineNumber(self: AwaitKeyword) -> int;
```
## AwaitKeyword::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: AwaitKeyword) -> *FunctionLikeDeclaration;
```
## AwaitKeyword::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: AwaitKeyword, level: int) -> *Node;
```
## AwaitKeyword::getEndLineNumber

```rust
pub fn getEndLineNumber(self: AwaitKeyword) -> int;
```
## AwaitKeyword::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: AwaitKeyword) -> string;
```
## AwaitKeyword::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: AwaitKeyword, level: int) -> Node;
```
## AwaitKeyword::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: AwaitKeyword) -> File;
```
## AwaitKeyword::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: AwaitKeyword) -> *Comment;
```
## AwaitKeyword::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: AwaitKeyword) -> *Comment;
```
## AwaitKeyword::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: AwaitKeyword) -> Node;
```
## AwaitKeyword::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: AwaitKeyword) -> FunctionLikeDeclaration;
```
## AwaitKeyword::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: AwaitKeyword) -> int;
```
## AwaitKeyword::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: AwaitKeyword) -> int;
```
## AwaitKeyword::getIndex

```rust
pub fn getIndex(self: AwaitKeyword) -> int;
```
## AwaitKeyword::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: AwaitKeyword) -> *Node;
```
## AwaitKeyword::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *AwaitKeyword;
```
