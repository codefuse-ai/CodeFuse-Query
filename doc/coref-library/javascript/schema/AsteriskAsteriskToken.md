# AsteriskAsteriskToken

Inherit from [Token](./Token.md)

Primary key: `id: int`

```rust
schema AsteriskAsteriskToken extends Token {
  @primary id: int
}
```
## AsteriskAsteriskToken::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: AsteriskAsteriskToken) -> Location;
```
## AsteriskAsteriskToken::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: AsteriskAsteriskToken) -> Symbol;
```
## AsteriskAsteriskToken::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: AsteriskAsteriskToken) -> *Decorator;
```
## AsteriskAsteriskToken::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: AsteriskAsteriskToken) -> string;
```
## AsteriskAsteriskToken::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: AsteriskAsteriskToken, i: int) -> Modifier;
```
## AsteriskAsteriskToken::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: AsteriskAsteriskToken) -> *Comment;
```
## AsteriskAsteriskToken::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: AsteriskAsteriskToken) -> *Node;
```
## AsteriskAsteriskToken::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: AsteriskAsteriskToken) -> *Node;
```
## AsteriskAsteriskToken::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: AsteriskAsteriskToken) -> Node;
```
## AsteriskAsteriskToken::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: AsteriskAsteriskToken) -> int;
```
## AsteriskAsteriskToken::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: AsteriskAsteriskToken) -> TopLevelDO;
```
## AsteriskAsteriskToken::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: AsteriskAsteriskToken, i: int) -> Decorator;
```
## AsteriskAsteriskToken::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: AsteriskAsteriskToken) -> int;
```
## AsteriskAsteriskToken::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: AsteriskAsteriskToken) -> *Modifier;
```
## AsteriskAsteriskToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: AsteriskAsteriskToken) -> int;
```
## AsteriskAsteriskToken::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: AsteriskAsteriskToken, i: int) -> Node;
```
## AsteriskAsteriskToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: AsteriskAsteriskToken) -> int;
```
## AsteriskAsteriskToken::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: AsteriskAsteriskToken) -> *FunctionLikeDeclaration;
```
## AsteriskAsteriskToken::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: AsteriskAsteriskToken, level: int) -> *Node;
```
## AsteriskAsteriskToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: AsteriskAsteriskToken) -> int;
```
## AsteriskAsteriskToken::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: AsteriskAsteriskToken) -> string;
```
## AsteriskAsteriskToken::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: AsteriskAsteriskToken, level: int) -> Node;
```
## AsteriskAsteriskToken::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: AsteriskAsteriskToken) -> File;
```
## AsteriskAsteriskToken::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: AsteriskAsteriskToken) -> *Comment;
```
## AsteriskAsteriskToken::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: AsteriskAsteriskToken) -> *Comment;
```
## AsteriskAsteriskToken::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: AsteriskAsteriskToken) -> Node;
```
## AsteriskAsteriskToken::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: AsteriskAsteriskToken) -> FunctionLikeDeclaration;
```
## AsteriskAsteriskToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: AsteriskAsteriskToken) -> int;
```
## AsteriskAsteriskToken::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: AsteriskAsteriskToken) -> int;
```
## AsteriskAsteriskToken::getIndex

```rust
pub fn getIndex(self: AsteriskAsteriskToken) -> int;
```
## AsteriskAsteriskToken::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: AsteriskAsteriskToken) -> *Node;
```
## AsteriskAsteriskToken::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *AsteriskAsteriskToken;
```
