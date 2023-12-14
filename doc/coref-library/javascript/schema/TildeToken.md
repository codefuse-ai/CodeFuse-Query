# TildeToken

Primary key: `id: int`

```rust
schema TildeToken {
  @primary id: int,
}
```
## TildeToken::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: TildeToken) -> Location;
```
## TildeToken::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: TildeToken) -> Symbol;
```
## TildeToken::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: TildeToken) -> *Decorator;
```
## TildeToken::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: TildeToken) -> string;
```
## TildeToken::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: TildeToken, i: int) -> Modifier;
```
## TildeToken::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: TildeToken) -> *Comment;
```
## TildeToken::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: TildeToken) -> *Node;
```
## TildeToken::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: TildeToken) -> *Node;
```
## TildeToken::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: TildeToken) -> Node;
```
## TildeToken::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: TildeToken) -> int;
```
## TildeToken::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: TildeToken) -> TopLevelDO;
```
## TildeToken::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: TildeToken, i: int) -> Decorator;
```
## TildeToken::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: TildeToken) -> int;
```
## TildeToken::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: TildeToken) -> *Modifier;
```
## TildeToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: TildeToken) -> int;
```
## TildeToken::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: TildeToken, i: int) -> Node;
```
## TildeToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: TildeToken) -> int;
```
## TildeToken::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: TildeToken) -> *FunctionLikeDeclaration;
```
## TildeToken::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: TildeToken, level: int) -> *Node;
```
## TildeToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: TildeToken) -> int;
```
## TildeToken::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: TildeToken) -> string;
```
## TildeToken::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: TildeToken, level: int) -> Node;
```
## TildeToken::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: TildeToken) -> File;
```
## TildeToken::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: TildeToken) -> *Comment;
```
## TildeToken::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: TildeToken) -> *Comment;
```
## TildeToken::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: TildeToken) -> Node;
```
## TildeToken::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: TildeToken) -> FunctionLikeDeclaration;
```
## TildeToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: TildeToken) -> int;
```
## TildeToken::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: TildeToken) -> int;
```
## TildeToken::getIndex

```rust
pub fn getIndex(self: TildeToken) -> int;
```
## TildeToken::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: TildeToken) -> *Node;
```
## TildeToken::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *TildeToken;
```
