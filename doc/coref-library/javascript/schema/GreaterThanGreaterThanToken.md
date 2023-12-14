# GreaterThanGreaterThanToken

Inherit from [Token](./Token.md)

Primary key: `id: int`

```rust
schema GreaterThanGreaterThanToken extends Token {
  @primary id: int,
}
```
## GreaterThanGreaterThanToken::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: GreaterThanGreaterThanToken) -> Location;
```
## GreaterThanGreaterThanToken::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: GreaterThanGreaterThanToken) -> Symbol;
```
## GreaterThanGreaterThanToken::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: GreaterThanGreaterThanToken) -> *Decorator;
```
## GreaterThanGreaterThanToken::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: GreaterThanGreaterThanToken) -> string;
```
## GreaterThanGreaterThanToken::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: GreaterThanGreaterThanToken, i: int) -> Modifier;
```
## GreaterThanGreaterThanToken::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: GreaterThanGreaterThanToken) -> *Comment;
```
## GreaterThanGreaterThanToken::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: GreaterThanGreaterThanToken) -> *Node;
```
## GreaterThanGreaterThanToken::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: GreaterThanGreaterThanToken) -> *Node;
```
## GreaterThanGreaterThanToken::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: GreaterThanGreaterThanToken) -> Node;
```
## GreaterThanGreaterThanToken::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: GreaterThanGreaterThanToken) -> int;
```
## GreaterThanGreaterThanToken::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: GreaterThanGreaterThanToken) -> TopLevelDO;
```
## GreaterThanGreaterThanToken::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: GreaterThanGreaterThanToken, i: int) -> Decorator;
```
## GreaterThanGreaterThanToken::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: GreaterThanGreaterThanToken) -> int;
```
## GreaterThanGreaterThanToken::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: GreaterThanGreaterThanToken) -> *Modifier;
```
## GreaterThanGreaterThanToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: GreaterThanGreaterThanToken) -> int;
```
## GreaterThanGreaterThanToken::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: GreaterThanGreaterThanToken, i: int) -> Node;
```
## GreaterThanGreaterThanToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: GreaterThanGreaterThanToken) -> int;
```
## GreaterThanGreaterThanToken::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: GreaterThanGreaterThanToken) -> *FunctionLikeDeclaration;
```
## GreaterThanGreaterThanToken::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: GreaterThanGreaterThanToken, level: int) -> *Node;
```
## GreaterThanGreaterThanToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: GreaterThanGreaterThanToken) -> int;
```
## GreaterThanGreaterThanToken::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: GreaterThanGreaterThanToken) -> string;
```
## GreaterThanGreaterThanToken::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: GreaterThanGreaterThanToken, level: int) -> Node;
```
## GreaterThanGreaterThanToken::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: GreaterThanGreaterThanToken) -> File;
```
## GreaterThanGreaterThanToken::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: GreaterThanGreaterThanToken) -> *Comment;
```
## GreaterThanGreaterThanToken::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: GreaterThanGreaterThanToken) -> *Comment;
```
## GreaterThanGreaterThanToken::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: GreaterThanGreaterThanToken) -> Node;
```
## GreaterThanGreaterThanToken::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: GreaterThanGreaterThanToken) -> FunctionLikeDeclaration;
```
## GreaterThanGreaterThanToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: GreaterThanGreaterThanToken) -> int;
```
## GreaterThanGreaterThanToken::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: GreaterThanGreaterThanToken) -> int;
```
## GreaterThanGreaterThanToken::getIndex

```rust
pub fn getIndex(self: GreaterThanGreaterThanToken) -> int;
```
## GreaterThanGreaterThanToken::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: GreaterThanGreaterThanToken) -> *Node;
```
## GreaterThanGreaterThanToken::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *GreaterThanGreaterThanToken;
```
