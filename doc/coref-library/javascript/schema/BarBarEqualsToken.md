# BarBarEqualsToken

Inherit from [Token](./Token.md)

Primary key: `id: int`

```rust
schema BarBarEqualsToken extends Token {
  @primary id: int,
}
```
## BarBarEqualsToken::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: BarBarEqualsToken) -> Location;
```
## BarBarEqualsToken::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: BarBarEqualsToken) -> Symbol;
```
## BarBarEqualsToken::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: BarBarEqualsToken) -> *Decorator;
```
## BarBarEqualsToken::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: BarBarEqualsToken) -> string;
```
## BarBarEqualsToken::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: BarBarEqualsToken, i: int) -> Modifier;
```
## BarBarEqualsToken::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: BarBarEqualsToken) -> *Comment;
```
## BarBarEqualsToken::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: BarBarEqualsToken) -> *Node;
```
## BarBarEqualsToken::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: BarBarEqualsToken) -> *Node;
```
## BarBarEqualsToken::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: BarBarEqualsToken) -> Node;
```
## BarBarEqualsToken::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: BarBarEqualsToken) -> int;
```
## BarBarEqualsToken::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: BarBarEqualsToken) -> TopLevelDO;
```
## BarBarEqualsToken::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: BarBarEqualsToken, i: int) -> Decorator;
```
## BarBarEqualsToken::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: BarBarEqualsToken) -> int;
```
## BarBarEqualsToken::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: BarBarEqualsToken) -> *Modifier;
```
## BarBarEqualsToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: BarBarEqualsToken) -> int;
```
## BarBarEqualsToken::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: BarBarEqualsToken, i: int) -> Node;
```
## BarBarEqualsToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: BarBarEqualsToken) -> int;
```
## BarBarEqualsToken::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: BarBarEqualsToken) -> *FunctionLikeDeclaration;
```
## BarBarEqualsToken::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: BarBarEqualsToken, level: int) -> *Node;
```
## BarBarEqualsToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: BarBarEqualsToken) -> int;
```
## BarBarEqualsToken::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: BarBarEqualsToken) -> string;
```
## BarBarEqualsToken::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: BarBarEqualsToken, level: int) -> Node;
```
## BarBarEqualsToken::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: BarBarEqualsToken) -> File;
```
## BarBarEqualsToken::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: BarBarEqualsToken) -> *Comment;
```
## BarBarEqualsToken::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: BarBarEqualsToken) -> *Comment;
```
## BarBarEqualsToken::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: BarBarEqualsToken) -> Node;
```
## BarBarEqualsToken::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: BarBarEqualsToken) -> FunctionLikeDeclaration;
```
## BarBarEqualsToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: BarBarEqualsToken) -> int;
```
## BarBarEqualsToken::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: BarBarEqualsToken) -> int;
```
## BarBarEqualsToken::getIndex

```rust
pub fn getIndex(self: BarBarEqualsToken) -> int;
```
## BarBarEqualsToken::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: BarBarEqualsToken) -> *Node;
```
## BarBarEqualsToken::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *BarBarEqualsToken;
```
