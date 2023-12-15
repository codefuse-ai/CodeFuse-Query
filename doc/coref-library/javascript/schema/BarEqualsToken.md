# BarEqualsToken

Inherit from [Token](./Token.md)

Primary key: `id: int`

```rust
schema BarEqualsToken extends Token {
  @primary id: int
}
```
## BarEqualsToken::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: BarEqualsToken) -> Location;
```
## BarEqualsToken::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: BarEqualsToken) -> Symbol;
```
## BarEqualsToken::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: BarEqualsToken) -> *Decorator;
```
## BarEqualsToken::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: BarEqualsToken) -> string;
```
## BarEqualsToken::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: BarEqualsToken, i: int) -> Modifier;
```
## BarEqualsToken::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: BarEqualsToken) -> *Comment;
```
## BarEqualsToken::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: BarEqualsToken) -> *Node;
```
## BarEqualsToken::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: BarEqualsToken) -> *Node;
```
## BarEqualsToken::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: BarEqualsToken) -> Node;
```
## BarEqualsToken::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: BarEqualsToken) -> int;
```
## BarEqualsToken::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: BarEqualsToken) -> TopLevelDO;
```
## BarEqualsToken::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: BarEqualsToken, i: int) -> Decorator;
```
## BarEqualsToken::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: BarEqualsToken) -> int;
```
## BarEqualsToken::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: BarEqualsToken) -> *Modifier;
```
## BarEqualsToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: BarEqualsToken) -> int;
```
## BarEqualsToken::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: BarEqualsToken, i: int) -> Node;
```
## BarEqualsToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: BarEqualsToken) -> int;
```
## BarEqualsToken::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: BarEqualsToken) -> *FunctionLikeDeclaration;
```
## BarEqualsToken::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: BarEqualsToken, level: int) -> *Node;
```
## BarEqualsToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: BarEqualsToken) -> int;
```
## BarEqualsToken::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: BarEqualsToken) -> string;
```
## BarEqualsToken::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: BarEqualsToken, level: int) -> Node;
```
## BarEqualsToken::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: BarEqualsToken) -> File;
```
## BarEqualsToken::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: BarEqualsToken) -> *Comment;
```
## BarEqualsToken::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: BarEqualsToken) -> *Comment;
```
## BarEqualsToken::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: BarEqualsToken) -> Node;
```
## BarEqualsToken::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: BarEqualsToken) -> FunctionLikeDeclaration;
```
## BarEqualsToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: BarEqualsToken) -> int;
```
## BarEqualsToken::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: BarEqualsToken) -> int;
```
## BarEqualsToken::getIndex

```rust
pub fn getIndex(self: BarEqualsToken) -> int;
```
## BarEqualsToken::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: BarEqualsToken) -> *Node;
```
## BarEqualsToken::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *BarEqualsToken;
```
