# UndefinedKeyword

Inherit from [Token](./Token.md)

Primary key: `id: int`

```rust
schema UndefinedKeyword extends Token {
  @primary id: int
}
```
## UndefinedKeyword::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: UndefinedKeyword) -> Location;
```
## UndefinedKeyword::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: UndefinedKeyword) -> Symbol;
```
## UndefinedKeyword::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: UndefinedKeyword) -> *Decorator;
```
## UndefinedKeyword::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: UndefinedKeyword) -> string;
```
## UndefinedKeyword::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: UndefinedKeyword, i: int) -> Modifier;
```
## UndefinedKeyword::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: UndefinedKeyword) -> *Comment;
```
## UndefinedKeyword::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: UndefinedKeyword) -> *Node;
```
## UndefinedKeyword::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: UndefinedKeyword) -> *Node;
```
## UndefinedKeyword::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: UndefinedKeyword) -> Node;
```
## UndefinedKeyword::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: UndefinedKeyword) -> int;
```
## UndefinedKeyword::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: UndefinedKeyword) -> TopLevelDO;
```
## UndefinedKeyword::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: UndefinedKeyword, i: int) -> Decorator;
```
## UndefinedKeyword::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: UndefinedKeyword) -> int;
```
## UndefinedKeyword::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: UndefinedKeyword) -> *Modifier;
```
## UndefinedKeyword::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: UndefinedKeyword) -> int;
```
## UndefinedKeyword::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: UndefinedKeyword, i: int) -> Node;
```
## UndefinedKeyword::getStartLineNumber

```rust
pub fn getStartLineNumber(self: UndefinedKeyword) -> int;
```
## UndefinedKeyword::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: UndefinedKeyword) -> *FunctionLikeDeclaration;
```
## UndefinedKeyword::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: UndefinedKeyword, level: int) -> *Node;
```
## UndefinedKeyword::getEndLineNumber

```rust
pub fn getEndLineNumber(self: UndefinedKeyword) -> int;
```
## UndefinedKeyword::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: UndefinedKeyword) -> string;
```
## UndefinedKeyword::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: UndefinedKeyword, level: int) -> Node;
```
## UndefinedKeyword::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: UndefinedKeyword) -> File;
```
## UndefinedKeyword::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: UndefinedKeyword) -> *Comment;
```
## UndefinedKeyword::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: UndefinedKeyword) -> *Comment;
```
## UndefinedKeyword::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: UndefinedKeyword) -> Node;
```
## UndefinedKeyword::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: UndefinedKeyword) -> FunctionLikeDeclaration;
```
## UndefinedKeyword::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: UndefinedKeyword) -> int;
```
## UndefinedKeyword::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: UndefinedKeyword) -> int;
```
## UndefinedKeyword::getIndex

```rust
pub fn getIndex(self: UndefinedKeyword) -> int;
```
## UndefinedKeyword::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: UndefinedKeyword) -> *Node;
```
## UndefinedKeyword::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *UndefinedKeyword;
```
