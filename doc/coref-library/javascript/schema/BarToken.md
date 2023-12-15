# BarToken

Inherit from [Token](./Token.md)

Primary key: `id: int`

```rust
schema BarToken extends Token {
  @primary id: int
}
```
## BarToken::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: BarToken) -> Location;
```
## BarToken::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: BarToken) -> Symbol;
```
## BarToken::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: BarToken) -> *Decorator;
```
## BarToken::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: BarToken) -> string;
```
## BarToken::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: BarToken, i: int) -> Modifier;
```
## BarToken::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: BarToken) -> *Comment;
```
## BarToken::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: BarToken) -> *Node;
```
## BarToken::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: BarToken) -> *Node;
```
## BarToken::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: BarToken) -> Node;
```
## BarToken::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: BarToken) -> int;
```
## BarToken::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: BarToken) -> TopLevelDO;
```
## BarToken::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: BarToken, i: int) -> Decorator;
```
## BarToken::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: BarToken) -> int;
```
## BarToken::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: BarToken) -> *Modifier;
```
## BarToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: BarToken) -> int;
```
## BarToken::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: BarToken, i: int) -> Node;
```
## BarToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: BarToken) -> int;
```
## BarToken::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: BarToken) -> *FunctionLikeDeclaration;
```
## BarToken::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: BarToken, level: int) -> *Node;
```
## BarToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: BarToken) -> int;
```
## BarToken::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: BarToken) -> string;
```
## BarToken::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: BarToken, level: int) -> Node;
```
## BarToken::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: BarToken) -> File;
```
## BarToken::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: BarToken) -> *Comment;
```
## BarToken::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: BarToken) -> *Comment;
```
## BarToken::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: BarToken) -> Node;
```
## BarToken::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: BarToken) -> FunctionLikeDeclaration;
```
## BarToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: BarToken) -> int;
```
## BarToken::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: BarToken) -> int;
```
## BarToken::getIndex

```rust
pub fn getIndex(self: BarToken) -> int;
```
## BarToken::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: BarToken) -> *Node;
```
## BarToken::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *BarToken;
```
