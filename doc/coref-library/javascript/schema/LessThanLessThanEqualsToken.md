# LessThanLessThanEqualsToken

Inherit from [Token](./Token.md)

Primary key: `id: int`

```rust
schema LessThanLessThanEqualsToken extends Token {
  @primary id: int,
}
```
## LessThanLessThanEqualsToken::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: LessThanLessThanEqualsToken) -> Location;
```
## LessThanLessThanEqualsToken::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: LessThanLessThanEqualsToken) -> Symbol;
```
## LessThanLessThanEqualsToken::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: LessThanLessThanEqualsToken) -> *Decorator;
```
## LessThanLessThanEqualsToken::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: LessThanLessThanEqualsToken) -> string;
```
## LessThanLessThanEqualsToken::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: LessThanLessThanEqualsToken, i: int) -> Modifier;
```
## LessThanLessThanEqualsToken::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: LessThanLessThanEqualsToken) -> *Comment;
```
## LessThanLessThanEqualsToken::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: LessThanLessThanEqualsToken) -> *Node;
```
## LessThanLessThanEqualsToken::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: LessThanLessThanEqualsToken) -> *Node;
```
## LessThanLessThanEqualsToken::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: LessThanLessThanEqualsToken) -> Node;
```
## LessThanLessThanEqualsToken::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: LessThanLessThanEqualsToken) -> int;
```
## LessThanLessThanEqualsToken::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: LessThanLessThanEqualsToken) -> TopLevelDO;
```
## LessThanLessThanEqualsToken::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: LessThanLessThanEqualsToken, i: int) -> Decorator;
```
## LessThanLessThanEqualsToken::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: LessThanLessThanEqualsToken) -> int;
```
## LessThanLessThanEqualsToken::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: LessThanLessThanEqualsToken) -> *Modifier;
```
## LessThanLessThanEqualsToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: LessThanLessThanEqualsToken) -> int;
```
## LessThanLessThanEqualsToken::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: LessThanLessThanEqualsToken, i: int) -> Node;
```
## LessThanLessThanEqualsToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: LessThanLessThanEqualsToken) -> int;
```
## LessThanLessThanEqualsToken::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: LessThanLessThanEqualsToken) -> *FunctionLikeDeclaration;
```
## LessThanLessThanEqualsToken::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: LessThanLessThanEqualsToken, level: int) -> *Node;
```
## LessThanLessThanEqualsToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: LessThanLessThanEqualsToken) -> int;
```
## LessThanLessThanEqualsToken::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: LessThanLessThanEqualsToken) -> string;
```
## LessThanLessThanEqualsToken::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: LessThanLessThanEqualsToken, level: int) -> Node;
```
## LessThanLessThanEqualsToken::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: LessThanLessThanEqualsToken) -> File;
```
## LessThanLessThanEqualsToken::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: LessThanLessThanEqualsToken) -> *Comment;
```
## LessThanLessThanEqualsToken::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: LessThanLessThanEqualsToken) -> *Comment;
```
## LessThanLessThanEqualsToken::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: LessThanLessThanEqualsToken) -> Node;
```
## LessThanLessThanEqualsToken::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: LessThanLessThanEqualsToken) -> FunctionLikeDeclaration;
```
## LessThanLessThanEqualsToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: LessThanLessThanEqualsToken) -> int;
```
## LessThanLessThanEqualsToken::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: LessThanLessThanEqualsToken) -> int;
```
## LessThanLessThanEqualsToken::getIndex

```rust
pub fn getIndex(self: LessThanLessThanEqualsToken) -> int;
```
## LessThanLessThanEqualsToken::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: LessThanLessThanEqualsToken) -> *Node;
```
## LessThanLessThanEqualsToken::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *LessThanLessThanEqualsToken;
```
