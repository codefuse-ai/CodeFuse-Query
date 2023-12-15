# GreaterThanEqualsToken

Inherit from [Token](./Token.md)

Primary key: `id: int`

```rust
schema GreaterThanEqualsToken extends Token {
  @primary id: int
}
```
## GreaterThanEqualsToken::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: GreaterThanEqualsToken) -> Location;
```
## GreaterThanEqualsToken::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: GreaterThanEqualsToken) -> Symbol;
```
## GreaterThanEqualsToken::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: GreaterThanEqualsToken) -> *Decorator;
```
## GreaterThanEqualsToken::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: GreaterThanEqualsToken) -> string;
```
## GreaterThanEqualsToken::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: GreaterThanEqualsToken, i: int) -> Modifier;
```
## GreaterThanEqualsToken::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: GreaterThanEqualsToken) -> *Comment;
```
## GreaterThanEqualsToken::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: GreaterThanEqualsToken) -> *Node;
```
## GreaterThanEqualsToken::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: GreaterThanEqualsToken) -> *Node;
```
## GreaterThanEqualsToken::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: GreaterThanEqualsToken) -> Node;
```
## GreaterThanEqualsToken::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: GreaterThanEqualsToken) -> int;
```
## GreaterThanEqualsToken::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: GreaterThanEqualsToken) -> TopLevelDO;
```
## GreaterThanEqualsToken::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: GreaterThanEqualsToken, i: int) -> Decorator;
```
## GreaterThanEqualsToken::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: GreaterThanEqualsToken) -> int;
```
## GreaterThanEqualsToken::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: GreaterThanEqualsToken) -> *Modifier;
```
## GreaterThanEqualsToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: GreaterThanEqualsToken) -> int;
```
## GreaterThanEqualsToken::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: GreaterThanEqualsToken, i: int) -> Node;
```
## GreaterThanEqualsToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: GreaterThanEqualsToken) -> int;
```
## GreaterThanEqualsToken::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: GreaterThanEqualsToken) -> *FunctionLikeDeclaration;
```
## GreaterThanEqualsToken::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: GreaterThanEqualsToken, level: int) -> *Node;
```
## GreaterThanEqualsToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: GreaterThanEqualsToken) -> int;
```
## GreaterThanEqualsToken::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: GreaterThanEqualsToken) -> string;
```
## GreaterThanEqualsToken::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: GreaterThanEqualsToken, level: int) -> Node;
```
## GreaterThanEqualsToken::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: GreaterThanEqualsToken) -> File;
```
## GreaterThanEqualsToken::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: GreaterThanEqualsToken) -> *Comment;
```
## GreaterThanEqualsToken::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: GreaterThanEqualsToken) -> *Comment;
```
## GreaterThanEqualsToken::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: GreaterThanEqualsToken) -> Node;
```
## GreaterThanEqualsToken::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: GreaterThanEqualsToken) -> FunctionLikeDeclaration;
```
## GreaterThanEqualsToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: GreaterThanEqualsToken) -> int;
```
## GreaterThanEqualsToken::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: GreaterThanEqualsToken) -> int;
```
## GreaterThanEqualsToken::getIndex

```rust
pub fn getIndex(self: GreaterThanEqualsToken) -> int;
```
## GreaterThanEqualsToken::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: GreaterThanEqualsToken) -> *Node;
```
## GreaterThanEqualsToken::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *GreaterThanEqualsToken;
```
