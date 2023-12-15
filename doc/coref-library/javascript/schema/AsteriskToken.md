# AsteriskToken

Inherit from [Token](./Token.md)

Primary key: `id: int`

```rust
schema AsteriskToken extends Token {
  @primary id: int
}
```
## AsteriskToken::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: AsteriskToken) -> Location;
```
## AsteriskToken::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: AsteriskToken) -> Symbol;
```
## AsteriskToken::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: AsteriskToken) -> *Decorator;
```
## AsteriskToken::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: AsteriskToken) -> string;
```
## AsteriskToken::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: AsteriskToken, i: int) -> Modifier;
```
## AsteriskToken::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: AsteriskToken) -> *Comment;
```
## AsteriskToken::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: AsteriskToken) -> *Node;
```
## AsteriskToken::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: AsteriskToken) -> *Node;
```
## AsteriskToken::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: AsteriskToken) -> Node;
```
## AsteriskToken::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: AsteriskToken) -> int;
```
## AsteriskToken::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: AsteriskToken) -> TopLevelDO;
```
## AsteriskToken::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: AsteriskToken, i: int) -> Decorator;
```
## AsteriskToken::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: AsteriskToken) -> int;
```
## AsteriskToken::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: AsteriskToken) -> *Modifier;
```
## AsteriskToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: AsteriskToken) -> int;
```
## AsteriskToken::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: AsteriskToken, i: int) -> Node;
```
## AsteriskToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: AsteriskToken) -> int;
```
## AsteriskToken::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: AsteriskToken) -> *FunctionLikeDeclaration;
```
## AsteriskToken::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: AsteriskToken, level: int) -> *Node;
```
## AsteriskToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: AsteriskToken) -> int;
```
## AsteriskToken::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: AsteriskToken) -> string;
```
## AsteriskToken::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: AsteriskToken, level: int) -> Node;
```
## AsteriskToken::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: AsteriskToken) -> File;
```
## AsteriskToken::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: AsteriskToken) -> *Comment;
```
## AsteriskToken::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: AsteriskToken) -> *Comment;
```
## AsteriskToken::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: AsteriskToken) -> Node;
```
## AsteriskToken::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: AsteriskToken) -> FunctionLikeDeclaration;
```
## AsteriskToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: AsteriskToken) -> int;
```
## AsteriskToken::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: AsteriskToken) -> int;
```
## AsteriskToken::getIndex

```rust
pub fn getIndex(self: AsteriskToken) -> int;
```
## AsteriskToken::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: AsteriskToken) -> *Node;
```
## AsteriskToken::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *AsteriskToken;
```
