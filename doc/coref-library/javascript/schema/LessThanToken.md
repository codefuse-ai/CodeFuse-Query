# LessThanToken

Inherit from [Token](./Token.md)

Primary key: `id: int`

```rust
schema LessThanToken extends Token {
  @primary id: int,
}
```
## LessThanToken::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: LessThanToken) -> Location;
```
## LessThanToken::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: LessThanToken) -> Symbol;
```
## LessThanToken::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: LessThanToken) -> *Decorator;
```
## LessThanToken::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: LessThanToken) -> string;
```
## LessThanToken::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: LessThanToken, i: int) -> Modifier;
```
## LessThanToken::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: LessThanToken) -> *Comment;
```
## LessThanToken::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: LessThanToken) -> *Node;
```
## LessThanToken::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: LessThanToken) -> *Node;
```
## LessThanToken::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: LessThanToken) -> Node;
```
## LessThanToken::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: LessThanToken) -> int;
```
## LessThanToken::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: LessThanToken) -> TopLevelDO;
```
## LessThanToken::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: LessThanToken, i: int) -> Decorator;
```
## LessThanToken::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: LessThanToken) -> int;
```
## LessThanToken::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: LessThanToken) -> *Modifier;
```
## LessThanToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: LessThanToken) -> int;
```
## LessThanToken::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: LessThanToken, i: int) -> Node;
```
## LessThanToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: LessThanToken) -> int;
```
## LessThanToken::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: LessThanToken) -> *FunctionLikeDeclaration;
```
## LessThanToken::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: LessThanToken, level: int) -> *Node;
```
## LessThanToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: LessThanToken) -> int;
```
## LessThanToken::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: LessThanToken) -> string;
```
## LessThanToken::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: LessThanToken, level: int) -> Node;
```
## LessThanToken::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: LessThanToken) -> File;
```
## LessThanToken::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: LessThanToken) -> *Comment;
```
## LessThanToken::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: LessThanToken) -> *Comment;
```
## LessThanToken::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: LessThanToken) -> Node;
```
## LessThanToken::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: LessThanToken) -> FunctionLikeDeclaration;
```
## LessThanToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: LessThanToken) -> int;
```
## LessThanToken::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: LessThanToken) -> int;
```
## LessThanToken::getIndex

```rust
pub fn getIndex(self: LessThanToken) -> int;
```
## LessThanToken::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: LessThanToken) -> *Node;
```
## LessThanToken::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *LessThanToken;
```
