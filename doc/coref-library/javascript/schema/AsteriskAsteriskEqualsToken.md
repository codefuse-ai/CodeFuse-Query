# AsteriskAsteriskEqualsToken

Inherit from [Token](./Token.md)

Primary key: `id: int`

```rust
schema AsteriskAsteriskEqualsToken extends Token {
  @primary id: int
}
```
## AsteriskAsteriskEqualsToken::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: AsteriskAsteriskEqualsToken) -> Location;
```
## AsteriskAsteriskEqualsToken::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: AsteriskAsteriskEqualsToken) -> Symbol;
```
## AsteriskAsteriskEqualsToken::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: AsteriskAsteriskEqualsToken) -> *Decorator;
```
## AsteriskAsteriskEqualsToken::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: AsteriskAsteriskEqualsToken) -> string;
```
## AsteriskAsteriskEqualsToken::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: AsteriskAsteriskEqualsToken, i: int) -> Modifier;
```
## AsteriskAsteriskEqualsToken::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: AsteriskAsteriskEqualsToken) -> *Comment;
```
## AsteriskAsteriskEqualsToken::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: AsteriskAsteriskEqualsToken) -> *Node;
```
## AsteriskAsteriskEqualsToken::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: AsteriskAsteriskEqualsToken) -> *Node;
```
## AsteriskAsteriskEqualsToken::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: AsteriskAsteriskEqualsToken) -> Node;
```
## AsteriskAsteriskEqualsToken::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: AsteriskAsteriskEqualsToken) -> int;
```
## AsteriskAsteriskEqualsToken::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: AsteriskAsteriskEqualsToken) -> TopLevelDO;
```
## AsteriskAsteriskEqualsToken::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: AsteriskAsteriskEqualsToken, i: int) -> Decorator;
```
## AsteriskAsteriskEqualsToken::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: AsteriskAsteriskEqualsToken) -> int;
```
## AsteriskAsteriskEqualsToken::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: AsteriskAsteriskEqualsToken) -> *Modifier;
```
## AsteriskAsteriskEqualsToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: AsteriskAsteriskEqualsToken) -> int;
```
## AsteriskAsteriskEqualsToken::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: AsteriskAsteriskEqualsToken, i: int) -> Node;
```
## AsteriskAsteriskEqualsToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: AsteriskAsteriskEqualsToken) -> int;
```
## AsteriskAsteriskEqualsToken::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: AsteriskAsteriskEqualsToken) -> *FunctionLikeDeclaration;
```
## AsteriskAsteriskEqualsToken::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: AsteriskAsteriskEqualsToken, level: int) -> *Node;
```
## AsteriskAsteriskEqualsToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: AsteriskAsteriskEqualsToken) -> int;
```
## AsteriskAsteriskEqualsToken::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: AsteriskAsteriskEqualsToken) -> string;
```
## AsteriskAsteriskEqualsToken::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: AsteriskAsteriskEqualsToken, level: int) -> Node;
```
## AsteriskAsteriskEqualsToken::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: AsteriskAsteriskEqualsToken) -> File;
```
## AsteriskAsteriskEqualsToken::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: AsteriskAsteriskEqualsToken) -> *Comment;
```
## AsteriskAsteriskEqualsToken::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: AsteriskAsteriskEqualsToken) -> *Comment;
```
## AsteriskAsteriskEqualsToken::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: AsteriskAsteriskEqualsToken) -> Node;
```
## AsteriskAsteriskEqualsToken::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: AsteriskAsteriskEqualsToken) -> FunctionLikeDeclaration;
```
## AsteriskAsteriskEqualsToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: AsteriskAsteriskEqualsToken) -> int;
```
## AsteriskAsteriskEqualsToken::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: AsteriskAsteriskEqualsToken) -> int;
```
## AsteriskAsteriskEqualsToken::getIndex

```rust
pub fn getIndex(self: AsteriskAsteriskEqualsToken) -> int;
```
## AsteriskAsteriskEqualsToken::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: AsteriskAsteriskEqualsToken) -> *Node;
```
## AsteriskAsteriskEqualsToken::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *AsteriskAsteriskEqualsToken;
```
