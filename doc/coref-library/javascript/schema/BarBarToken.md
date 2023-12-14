# BarBarToken

Inherit from [Token](./Token.md)

Primary key: `id: int`

```rust
schema BarBarToken extends Token {
  @primary id: int,
}
```
## BarBarToken::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: BarBarToken) -> Location;
```
## BarBarToken::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: BarBarToken) -> Symbol;
```
## BarBarToken::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: BarBarToken) -> *Decorator;
```
## BarBarToken::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: BarBarToken) -> string;
```
## BarBarToken::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: BarBarToken, i: int) -> Modifier;
```
## BarBarToken::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: BarBarToken) -> *Comment;
```
## BarBarToken::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: BarBarToken) -> *Node;
```
## BarBarToken::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: BarBarToken) -> *Node;
```
## BarBarToken::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: BarBarToken) -> Node;
```
## BarBarToken::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: BarBarToken) -> int;
```
## BarBarToken::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: BarBarToken) -> TopLevelDO;
```
## BarBarToken::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: BarBarToken, i: int) -> Decorator;
```
## BarBarToken::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: BarBarToken) -> int;
```
## BarBarToken::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: BarBarToken) -> *Modifier;
```
## BarBarToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: BarBarToken) -> int;
```
## BarBarToken::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: BarBarToken, i: int) -> Node;
```
## BarBarToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: BarBarToken) -> int;
```
## BarBarToken::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: BarBarToken) -> *FunctionLikeDeclaration;
```
## BarBarToken::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: BarBarToken, level: int) -> *Node;
```
## BarBarToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: BarBarToken) -> int;
```
## BarBarToken::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: BarBarToken) -> string;
```
## BarBarToken::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: BarBarToken, level: int) -> Node;
```
## BarBarToken::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: BarBarToken) -> File;
```
## BarBarToken::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: BarBarToken) -> *Comment;
```
## BarBarToken::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: BarBarToken) -> *Comment;
```
## BarBarToken::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: BarBarToken) -> Node;
```
## BarBarToken::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: BarBarToken) -> FunctionLikeDeclaration;
```
## BarBarToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: BarBarToken) -> int;
```
## BarBarToken::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: BarBarToken) -> int;
```
## BarBarToken::getIndex

```rust
pub fn getIndex(self: BarBarToken) -> int;
```
## BarBarToken::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: BarBarToken) -> *Node;
```
## BarBarToken::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *BarBarToken;
```
