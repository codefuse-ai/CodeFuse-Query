# PercentToken

Inherit from [Token](./Token.md)

Primary key: `id: int`

```rust
schema PercentToken extends Token {
  @primary id: int,
}
```
## PercentToken::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: PercentToken) -> Location;
```
## PercentToken::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: PercentToken) -> Symbol;
```
## PercentToken::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: PercentToken) -> *Decorator;
```
## PercentToken::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: PercentToken) -> string;
```
## PercentToken::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: PercentToken, i: int) -> Modifier;
```
## PercentToken::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: PercentToken) -> *Comment;
```
## PercentToken::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: PercentToken) -> *Node;
```
## PercentToken::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: PercentToken) -> *Node;
```
## PercentToken::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: PercentToken) -> Node;
```
## PercentToken::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: PercentToken) -> int;
```
## PercentToken::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: PercentToken) -> TopLevelDO;
```
## PercentToken::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: PercentToken, i: int) -> Decorator;
```
## PercentToken::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: PercentToken) -> int;
```
## PercentToken::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: PercentToken) -> *Modifier;
```
## PercentToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: PercentToken) -> int;
```
## PercentToken::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: PercentToken, i: int) -> Node;
```
## PercentToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: PercentToken) -> int;
```
## PercentToken::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: PercentToken) -> *FunctionLikeDeclaration;
```
## PercentToken::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: PercentToken, level: int) -> *Node;
```
## PercentToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: PercentToken) -> int;
```
## PercentToken::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: PercentToken) -> string;
```
## PercentToken::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: PercentToken, level: int) -> Node;
```
## PercentToken::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: PercentToken) -> File;
```
## PercentToken::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: PercentToken) -> *Comment;
```
## PercentToken::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: PercentToken) -> *Comment;
```
## PercentToken::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: PercentToken) -> Node;
```
## PercentToken::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: PercentToken) -> FunctionLikeDeclaration;
```
## PercentToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: PercentToken) -> int;
```
## PercentToken::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: PercentToken) -> int;
```
## PercentToken::getIndex

```rust
pub fn getIndex(self: PercentToken) -> int;
```
## PercentToken::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: PercentToken) -> *Node;
```
## PercentToken::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *PercentToken;
```
