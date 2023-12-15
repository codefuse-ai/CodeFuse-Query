# AmpersandEqualsToken

Inherit from [Token](./Token.md)

Primary key: `id: int`

```rust
schema AmpersandEqualsToken extends Token {
  @primary id: int
}
```
## AmpersandEqualsToken::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: AmpersandEqualsToken) -> Location;
```
## AmpersandEqualsToken::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: AmpersandEqualsToken) -> Symbol;
```
## AmpersandEqualsToken::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: AmpersandEqualsToken) -> *Decorator;
```
## AmpersandEqualsToken::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: AmpersandEqualsToken) -> string;
```
## AmpersandEqualsToken::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: AmpersandEqualsToken, i: int) -> Modifier;
```
## AmpersandEqualsToken::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: AmpersandEqualsToken) -> *Comment;
```
## AmpersandEqualsToken::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: AmpersandEqualsToken) -> *Node;
```
## AmpersandEqualsToken::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: AmpersandEqualsToken) -> *Node;
```
## AmpersandEqualsToken::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: AmpersandEqualsToken) -> Node;
```
## AmpersandEqualsToken::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: AmpersandEqualsToken) -> int;
```
## AmpersandEqualsToken::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: AmpersandEqualsToken) -> TopLevelDO;
```
## AmpersandEqualsToken::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: AmpersandEqualsToken, i: int) -> Decorator;
```
## AmpersandEqualsToken::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: AmpersandEqualsToken) -> int;
```
## AmpersandEqualsToken::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: AmpersandEqualsToken) -> *Modifier;
```
## AmpersandEqualsToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: AmpersandEqualsToken) -> int;
```
## AmpersandEqualsToken::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: AmpersandEqualsToken, i: int) -> Node;
```
## AmpersandEqualsToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: AmpersandEqualsToken) -> int;
```
## AmpersandEqualsToken::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: AmpersandEqualsToken) -> *FunctionLikeDeclaration;
```
## AmpersandEqualsToken::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: AmpersandEqualsToken, level: int) -> *Node;
```
## AmpersandEqualsToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: AmpersandEqualsToken) -> int;
```
## AmpersandEqualsToken::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: AmpersandEqualsToken) -> string;
```
## AmpersandEqualsToken::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: AmpersandEqualsToken, level: int) -> Node;
```
## AmpersandEqualsToken::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: AmpersandEqualsToken) -> File;
```
## AmpersandEqualsToken::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: AmpersandEqualsToken) -> *Comment;
```
## AmpersandEqualsToken::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: AmpersandEqualsToken) -> *Comment;
```
## AmpersandEqualsToken::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: AmpersandEqualsToken) -> Node;
```
## AmpersandEqualsToken::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: AmpersandEqualsToken) -> FunctionLikeDeclaration;
```
## AmpersandEqualsToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: AmpersandEqualsToken) -> int;
```
## AmpersandEqualsToken::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: AmpersandEqualsToken) -> int;
```
## AmpersandEqualsToken::getIndex

```rust
pub fn getIndex(self: AmpersandEqualsToken) -> int;
```
## AmpersandEqualsToken::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: AmpersandEqualsToken) -> *Node;
```
## AmpersandEqualsToken::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *AmpersandEqualsToken;
```
