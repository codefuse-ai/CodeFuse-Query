# GreaterThanGreaterThanEqualsToken

Inherit from [Token](./Token.md)

Primary key: `id: int`

```rust
schema GreaterThanGreaterThanEqualsToken extends Token {
  @primary id: int
}
```
## GreaterThanGreaterThanEqualsToken::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: GreaterThanGreaterThanEqualsToken) -> Location;
```
## GreaterThanGreaterThanEqualsToken::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: GreaterThanGreaterThanEqualsToken) -> Symbol;
```
## GreaterThanGreaterThanEqualsToken::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: GreaterThanGreaterThanEqualsToken) -> *Decorator;
```
## GreaterThanGreaterThanEqualsToken::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: GreaterThanGreaterThanEqualsToken) -> string;
```
## GreaterThanGreaterThanEqualsToken::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: GreaterThanGreaterThanEqualsToken, i: int) -> Modifier;
```
## GreaterThanGreaterThanEqualsToken::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: GreaterThanGreaterThanEqualsToken) -> *Comment;
```
## GreaterThanGreaterThanEqualsToken::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: GreaterThanGreaterThanEqualsToken) -> *Node;
```
## GreaterThanGreaterThanEqualsToken::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: GreaterThanGreaterThanEqualsToken) -> *Node;
```
## GreaterThanGreaterThanEqualsToken::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: GreaterThanGreaterThanEqualsToken) -> Node;
```
## GreaterThanGreaterThanEqualsToken::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: GreaterThanGreaterThanEqualsToken) -> int;
```
## GreaterThanGreaterThanEqualsToken::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: GreaterThanGreaterThanEqualsToken) -> TopLevelDO;
```
## GreaterThanGreaterThanEqualsToken::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: GreaterThanGreaterThanEqualsToken, i: int) -> Decorator;
```
## GreaterThanGreaterThanEqualsToken::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: GreaterThanGreaterThanEqualsToken) -> int;
```
## GreaterThanGreaterThanEqualsToken::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: GreaterThanGreaterThanEqualsToken) -> *Modifier;
```
## GreaterThanGreaterThanEqualsToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: GreaterThanGreaterThanEqualsToken) -> int;
```
## GreaterThanGreaterThanEqualsToken::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: GreaterThanGreaterThanEqualsToken, i: int) -> Node;
```
## GreaterThanGreaterThanEqualsToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: GreaterThanGreaterThanEqualsToken) -> int;
```
## GreaterThanGreaterThanEqualsToken::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: GreaterThanGreaterThanEqualsToken) -> *FunctionLikeDeclaration;
```
## GreaterThanGreaterThanEqualsToken::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: GreaterThanGreaterThanEqualsToken, level: int) -> *Node;
```
## GreaterThanGreaterThanEqualsToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: GreaterThanGreaterThanEqualsToken) -> int;
```
## GreaterThanGreaterThanEqualsToken::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: GreaterThanGreaterThanEqualsToken) -> string;
```
## GreaterThanGreaterThanEqualsToken::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: GreaterThanGreaterThanEqualsToken, level: int) -> Node;
```
## GreaterThanGreaterThanEqualsToken::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: GreaterThanGreaterThanEqualsToken) -> File;
```
## GreaterThanGreaterThanEqualsToken::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: GreaterThanGreaterThanEqualsToken) -> *Comment;
```
## GreaterThanGreaterThanEqualsToken::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: GreaterThanGreaterThanEqualsToken) -> *Comment;
```
## GreaterThanGreaterThanEqualsToken::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: GreaterThanGreaterThanEqualsToken) -> Node;
```
## GreaterThanGreaterThanEqualsToken::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: GreaterThanGreaterThanEqualsToken) -> FunctionLikeDeclaration;
```
## GreaterThanGreaterThanEqualsToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: GreaterThanGreaterThanEqualsToken) -> int;
```
## GreaterThanGreaterThanEqualsToken::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: GreaterThanGreaterThanEqualsToken) -> int;
```
## GreaterThanGreaterThanEqualsToken::getIndex

```rust
pub fn getIndex(self: GreaterThanGreaterThanEqualsToken) -> int;
```
## GreaterThanGreaterThanEqualsToken::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: GreaterThanGreaterThanEqualsToken) -> *Node;
```
## GreaterThanGreaterThanEqualsToken::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *GreaterThanGreaterThanEqualsToken;
```
