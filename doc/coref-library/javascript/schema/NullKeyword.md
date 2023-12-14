# NullKeyword

Inherit from [Token](./Token.md)

Primary key: `id: int`

```rust
schema NullKeyword extends Token {
  @primary id: int,
}
```
## NullKeyword::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: NullKeyword) -> Location;
```
## NullKeyword::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: NullKeyword) -> Symbol;
```
## NullKeyword::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: NullKeyword) -> *Decorator;
```
## NullKeyword::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: NullKeyword) -> string;
```
## NullKeyword::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: NullKeyword, i: int) -> Modifier;
```
## NullKeyword::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: NullKeyword) -> *Comment;
```
## NullKeyword::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: NullKeyword) -> *Node;
```
## NullKeyword::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: NullKeyword) -> *Node;
```
## NullKeyword::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: NullKeyword) -> Node;
```
## NullKeyword::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: NullKeyword) -> int;
```
## NullKeyword::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: NullKeyword) -> TopLevelDO;
```
## NullKeyword::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: NullKeyword, i: int) -> Decorator;
```
## NullKeyword::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: NullKeyword) -> int;
```
## NullKeyword::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: NullKeyword) -> *Modifier;
```
## NullKeyword::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: NullKeyword) -> int;
```
## NullKeyword::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: NullKeyword, i: int) -> Node;
```
## NullKeyword::getStartLineNumber

```rust
pub fn getStartLineNumber(self: NullKeyword) -> int;
```
## NullKeyword::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: NullKeyword) -> *FunctionLikeDeclaration;
```
## NullKeyword::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: NullKeyword, level: int) -> *Node;
```
## NullKeyword::getEndLineNumber

```rust
pub fn getEndLineNumber(self: NullKeyword) -> int;
```
## NullKeyword::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: NullKeyword) -> string;
```
## NullKeyword::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: NullKeyword, level: int) -> Node;
```
## NullKeyword::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: NullKeyword) -> File;
```
## NullKeyword::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: NullKeyword) -> *Comment;
```
## NullKeyword::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: NullKeyword) -> *Comment;
```
## NullKeyword::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: NullKeyword) -> Node;
```
## NullKeyword::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: NullKeyword) -> FunctionLikeDeclaration;
```
## NullKeyword::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: NullKeyword) -> int;
```
## NullKeyword::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: NullKeyword) -> int;
```
## NullKeyword::getIndex

```rust
pub fn getIndex(self: NullKeyword) -> int;
```
## NullKeyword::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: NullKeyword) -> *Node;
```
## NullKeyword::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *NullKeyword;
```
