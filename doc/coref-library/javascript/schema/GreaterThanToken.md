# GreaterThanToken

Inherit from [Token](./Token.md)

Primary key: `id: int`

```rust
schema GreaterThanToken extends Token {
  @primary id: int,
}
```
## GreaterThanToken::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: GreaterThanToken) -> Location;
```
## GreaterThanToken::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: GreaterThanToken) -> Symbol;
```
## GreaterThanToken::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: GreaterThanToken) -> *Decorator;
```
## GreaterThanToken::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: GreaterThanToken) -> string;
```
## GreaterThanToken::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: GreaterThanToken, i: int) -> Modifier;
```
## GreaterThanToken::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: GreaterThanToken) -> *Comment;
```
## GreaterThanToken::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: GreaterThanToken) -> *Node;
```
## GreaterThanToken::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: GreaterThanToken) -> *Node;
```
## GreaterThanToken::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: GreaterThanToken) -> Node;
```
## GreaterThanToken::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: GreaterThanToken) -> int;
```
## GreaterThanToken::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: GreaterThanToken) -> TopLevelDO;
```
## GreaterThanToken::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: GreaterThanToken, i: int) -> Decorator;
```
## GreaterThanToken::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: GreaterThanToken) -> int;
```
## GreaterThanToken::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: GreaterThanToken) -> *Modifier;
```
## GreaterThanToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: GreaterThanToken) -> int;
```
## GreaterThanToken::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: GreaterThanToken, i: int) -> Node;
```
## GreaterThanToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: GreaterThanToken) -> int;
```
## GreaterThanToken::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: GreaterThanToken) -> *FunctionLikeDeclaration;
```
## GreaterThanToken::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: GreaterThanToken, level: int) -> *Node;
```
## GreaterThanToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: GreaterThanToken) -> int;
```
## GreaterThanToken::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: GreaterThanToken) -> string;
```
## GreaterThanToken::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: GreaterThanToken, level: int) -> Node;
```
## GreaterThanToken::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: GreaterThanToken) -> File;
```
## GreaterThanToken::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: GreaterThanToken) -> *Comment;
```
## GreaterThanToken::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: GreaterThanToken) -> *Comment;
```
## GreaterThanToken::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: GreaterThanToken) -> Node;
```
## GreaterThanToken::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: GreaterThanToken) -> FunctionLikeDeclaration;
```
## GreaterThanToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: GreaterThanToken) -> int;
```
## GreaterThanToken::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: GreaterThanToken) -> int;
```
## GreaterThanToken::getIndex

```rust
pub fn getIndex(self: GreaterThanToken) -> int;
```
## GreaterThanToken::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: GreaterThanToken) -> *Node;
```
## GreaterThanToken::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *GreaterThanToken;
```
