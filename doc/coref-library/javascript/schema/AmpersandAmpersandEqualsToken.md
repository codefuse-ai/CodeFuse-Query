# AmpersandAmpersandEqualsToken

Inherit from [Token](./Token.md)

Primary key: `id: int`

```rust
schema AmpersandAmpersandEqualsToken extends Token {
  @primary id: int,
}
```
## AmpersandAmpersandEqualsToken::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: AmpersandAmpersandEqualsToken) -> Location;
```
## AmpersandAmpersandEqualsToken::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: AmpersandAmpersandEqualsToken) -> Symbol;
```
## AmpersandAmpersandEqualsToken::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: AmpersandAmpersandEqualsToken) -> *Decorator;
```
## AmpersandAmpersandEqualsToken::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: AmpersandAmpersandEqualsToken) -> string;
```
## AmpersandAmpersandEqualsToken::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: AmpersandAmpersandEqualsToken, i: int) -> Modifier;
```
## AmpersandAmpersandEqualsToken::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: AmpersandAmpersandEqualsToken) -> *Comment;
```
## AmpersandAmpersandEqualsToken::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: AmpersandAmpersandEqualsToken) -> *Node;
```
## AmpersandAmpersandEqualsToken::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: AmpersandAmpersandEqualsToken) -> *Node;
```
## AmpersandAmpersandEqualsToken::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: AmpersandAmpersandEqualsToken) -> Node;
```
## AmpersandAmpersandEqualsToken::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: AmpersandAmpersandEqualsToken) -> int;
```
## AmpersandAmpersandEqualsToken::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: AmpersandAmpersandEqualsToken) -> TopLevelDO;
```
## AmpersandAmpersandEqualsToken::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: AmpersandAmpersandEqualsToken, i: int) -> Decorator;
```
## AmpersandAmpersandEqualsToken::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: AmpersandAmpersandEqualsToken) -> int;
```
## AmpersandAmpersandEqualsToken::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: AmpersandAmpersandEqualsToken) -> *Modifier;
```
## AmpersandAmpersandEqualsToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: AmpersandAmpersandEqualsToken) -> int;
```
## AmpersandAmpersandEqualsToken::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: AmpersandAmpersandEqualsToken, i: int) -> Node;
```
## AmpersandAmpersandEqualsToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: AmpersandAmpersandEqualsToken) -> int;
```
## AmpersandAmpersandEqualsToken::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: AmpersandAmpersandEqualsToken) -> *FunctionLikeDeclaration;
```
## AmpersandAmpersandEqualsToken::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: AmpersandAmpersandEqualsToken, level: int) -> *Node;
```
## AmpersandAmpersandEqualsToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: AmpersandAmpersandEqualsToken) -> int;
```
## AmpersandAmpersandEqualsToken::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: AmpersandAmpersandEqualsToken) -> string;
```
## AmpersandAmpersandEqualsToken::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: AmpersandAmpersandEqualsToken, level: int) -> Node;
```
## AmpersandAmpersandEqualsToken::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: AmpersandAmpersandEqualsToken) -> File;
```
## AmpersandAmpersandEqualsToken::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: AmpersandAmpersandEqualsToken) -> *Comment;
```
## AmpersandAmpersandEqualsToken::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: AmpersandAmpersandEqualsToken) -> *Comment;
```
## AmpersandAmpersandEqualsToken::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: AmpersandAmpersandEqualsToken) -> Node;
```
## AmpersandAmpersandEqualsToken::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: AmpersandAmpersandEqualsToken) -> FunctionLikeDeclaration;
```
## AmpersandAmpersandEqualsToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: AmpersandAmpersandEqualsToken) -> int;
```
## AmpersandAmpersandEqualsToken::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: AmpersandAmpersandEqualsToken) -> int;
```
## AmpersandAmpersandEqualsToken::getIndex

```rust
pub fn getIndex(self: AmpersandAmpersandEqualsToken) -> int;
```
## AmpersandAmpersandEqualsToken::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: AmpersandAmpersandEqualsToken) -> *Node;
```
## AmpersandAmpersandEqualsToken::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *AmpersandAmpersandEqualsToken;
```
