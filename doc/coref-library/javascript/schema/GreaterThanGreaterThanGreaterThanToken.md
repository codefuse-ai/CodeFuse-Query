# GreaterThanGreaterThanGreaterThanToken

Inherit from [Token](./Token.md)

Primary key: `id: int`

```rust
schema GreaterThanGreaterThanGreaterThanToken extends Token {
  @primary id: int
}
```
## GreaterThanGreaterThanGreaterThanToken::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: GreaterThanGreaterThanGreaterThanToken) -> Location;
```
## GreaterThanGreaterThanGreaterThanToken::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: GreaterThanGreaterThanGreaterThanToken) -> Symbol;
```
## GreaterThanGreaterThanGreaterThanToken::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: GreaterThanGreaterThanGreaterThanToken) -> *Decorator;
```
## GreaterThanGreaterThanGreaterThanToken::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: GreaterThanGreaterThanGreaterThanToken) -> string;
```
## GreaterThanGreaterThanGreaterThanToken::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: GreaterThanGreaterThanGreaterThanToken, i: int) -> Modifier;
```
## GreaterThanGreaterThanGreaterThanToken::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: GreaterThanGreaterThanGreaterThanToken) -> *Comment;
```
## GreaterThanGreaterThanGreaterThanToken::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: GreaterThanGreaterThanGreaterThanToken) -> *Node;
```
## GreaterThanGreaterThanGreaterThanToken::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: GreaterThanGreaterThanGreaterThanToken) -> *Node;
```
## GreaterThanGreaterThanGreaterThanToken::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: GreaterThanGreaterThanGreaterThanToken) -> Node;
```
## GreaterThanGreaterThanGreaterThanToken::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: GreaterThanGreaterThanGreaterThanToken) -> int;
```
## GreaterThanGreaterThanGreaterThanToken::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: GreaterThanGreaterThanGreaterThanToken) -> TopLevelDO;
```
## GreaterThanGreaterThanGreaterThanToken::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: GreaterThanGreaterThanGreaterThanToken, i: int) -> Decorator;
```
## GreaterThanGreaterThanGreaterThanToken::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: GreaterThanGreaterThanGreaterThanToken) -> int;
```
## GreaterThanGreaterThanGreaterThanToken::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: GreaterThanGreaterThanGreaterThanToken) -> *Modifier;
```
## GreaterThanGreaterThanGreaterThanToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: GreaterThanGreaterThanGreaterThanToken) -> int;
```
## GreaterThanGreaterThanGreaterThanToken::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: GreaterThanGreaterThanGreaterThanToken, i: int) -> Node;
```
## GreaterThanGreaterThanGreaterThanToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: GreaterThanGreaterThanGreaterThanToken) -> int;
```
## GreaterThanGreaterThanGreaterThanToken::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: GreaterThanGreaterThanGreaterThanToken) -> *FunctionLikeDeclaration;
```
## GreaterThanGreaterThanGreaterThanToken::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: GreaterThanGreaterThanGreaterThanToken, level: int) -> *Node;
```
## GreaterThanGreaterThanGreaterThanToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: GreaterThanGreaterThanGreaterThanToken) -> int;
```
## GreaterThanGreaterThanGreaterThanToken::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: GreaterThanGreaterThanGreaterThanToken) -> string;
```
## GreaterThanGreaterThanGreaterThanToken::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: GreaterThanGreaterThanGreaterThanToken, level: int) -> Node;
```
## GreaterThanGreaterThanGreaterThanToken::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: GreaterThanGreaterThanGreaterThanToken) -> File;
```
## GreaterThanGreaterThanGreaterThanToken::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: GreaterThanGreaterThanGreaterThanToken) -> *Comment;
```
## GreaterThanGreaterThanGreaterThanToken::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: GreaterThanGreaterThanGreaterThanToken) -> *Comment;
```
## GreaterThanGreaterThanGreaterThanToken::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: GreaterThanGreaterThanGreaterThanToken) -> Node;
```
## GreaterThanGreaterThanGreaterThanToken::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: GreaterThanGreaterThanGreaterThanToken) -> FunctionLikeDeclaration;
```
## GreaterThanGreaterThanGreaterThanToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: GreaterThanGreaterThanGreaterThanToken) -> int;
```
## GreaterThanGreaterThanGreaterThanToken::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: GreaterThanGreaterThanGreaterThanToken) -> int;
```
## GreaterThanGreaterThanGreaterThanToken::getIndex

```rust
pub fn getIndex(self: GreaterThanGreaterThanGreaterThanToken) -> int;
```
## GreaterThanGreaterThanGreaterThanToken::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: GreaterThanGreaterThanGreaterThanToken) -> *Node;
```
## GreaterThanGreaterThanGreaterThanToken::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *GreaterThanGreaterThanGreaterThanToken;
```
