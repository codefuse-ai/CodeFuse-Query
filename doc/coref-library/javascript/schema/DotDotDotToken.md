# DotDotDotToken

Inherit from [Token](./Token.md)

Primary key: `id: int`

```rust
schema DotDotDotToken extends Token {
  @primary id: int
}
```
## DotDotDotToken::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: DotDotDotToken) -> Location;
```
## DotDotDotToken::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: DotDotDotToken) -> Symbol;
```
## DotDotDotToken::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: DotDotDotToken) -> *Decorator;
```
## DotDotDotToken::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: DotDotDotToken) -> string;
```
## DotDotDotToken::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: DotDotDotToken, i: int) -> Modifier;
```
## DotDotDotToken::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: DotDotDotToken) -> *Comment;
```
## DotDotDotToken::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: DotDotDotToken) -> *Node;
```
## DotDotDotToken::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: DotDotDotToken) -> *Node;
```
## DotDotDotToken::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: DotDotDotToken) -> Node;
```
## DotDotDotToken::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: DotDotDotToken) -> int;
```
## DotDotDotToken::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: DotDotDotToken) -> TopLevelDO;
```
## DotDotDotToken::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: DotDotDotToken, i: int) -> Decorator;
```
## DotDotDotToken::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: DotDotDotToken) -> int;
```
## DotDotDotToken::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: DotDotDotToken) -> *Modifier;
```
## DotDotDotToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: DotDotDotToken) -> int;
```
## DotDotDotToken::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: DotDotDotToken, i: int) -> Node;
```
## DotDotDotToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: DotDotDotToken) -> int;
```
## DotDotDotToken::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: DotDotDotToken) -> *FunctionLikeDeclaration;
```
## DotDotDotToken::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: DotDotDotToken, level: int) -> *Node;
```
## DotDotDotToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: DotDotDotToken) -> int;
```
## DotDotDotToken::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: DotDotDotToken) -> string;
```
## DotDotDotToken::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: DotDotDotToken, level: int) -> Node;
```
## DotDotDotToken::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: DotDotDotToken) -> File;
```
## DotDotDotToken::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: DotDotDotToken) -> *Comment;
```
## DotDotDotToken::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: DotDotDotToken) -> *Comment;
```
## DotDotDotToken::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: DotDotDotToken) -> Node;
```
## DotDotDotToken::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: DotDotDotToken) -> FunctionLikeDeclaration;
```
## DotDotDotToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: DotDotDotToken) -> int;
```
## DotDotDotToken::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: DotDotDotToken) -> int;
```
## DotDotDotToken::getIndex

```rust
pub fn getIndex(self: DotDotDotToken) -> int;
```
## DotDotDotToken::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: DotDotDotToken) -> *Node;
```
## DotDotDotToken::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *DotDotDotToken;
```
