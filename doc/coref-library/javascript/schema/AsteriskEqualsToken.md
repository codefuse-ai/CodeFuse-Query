# AsteriskEqualsToken

Primary key: `id: int`

```rust
schema AsteriskEqualsToken {
  @primary id: int,
}
```
## AsteriskEqualsToken::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: AsteriskEqualsToken) -> Location;
```
## AsteriskEqualsToken::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: AsteriskEqualsToken) -> Symbol;
```
## AsteriskEqualsToken::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: AsteriskEqualsToken) -> *Decorator;
```
## AsteriskEqualsToken::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: AsteriskEqualsToken) -> string;
```
## AsteriskEqualsToken::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: AsteriskEqualsToken, i: int) -> Modifier;
```
## AsteriskEqualsToken::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: AsteriskEqualsToken) -> *Comment;
```
## AsteriskEqualsToken::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: AsteriskEqualsToken) -> *Node;
```
## AsteriskEqualsToken::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: AsteriskEqualsToken) -> *Node;
```
## AsteriskEqualsToken::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: AsteriskEqualsToken) -> Node;
```
## AsteriskEqualsToken::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: AsteriskEqualsToken) -> int;
```
## AsteriskEqualsToken::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: AsteriskEqualsToken) -> TopLevelDO;
```
## AsteriskEqualsToken::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: AsteriskEqualsToken, i: int) -> Decorator;
```
## AsteriskEqualsToken::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: AsteriskEqualsToken) -> int;
```
## AsteriskEqualsToken::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: AsteriskEqualsToken) -> *Modifier;
```
## AsteriskEqualsToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: AsteriskEqualsToken) -> int;
```
## AsteriskEqualsToken::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: AsteriskEqualsToken, i: int) -> Node;
```
## AsteriskEqualsToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: AsteriskEqualsToken) -> int;
```
## AsteriskEqualsToken::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: AsteriskEqualsToken) -> *FunctionLikeDeclaration;
```
## AsteriskEqualsToken::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: AsteriskEqualsToken, level: int) -> *Node;
```
## AsteriskEqualsToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: AsteriskEqualsToken) -> int;
```
## AsteriskEqualsToken::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: AsteriskEqualsToken) -> string;
```
## AsteriskEqualsToken::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: AsteriskEqualsToken, level: int) -> Node;
```
## AsteriskEqualsToken::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: AsteriskEqualsToken) -> File;
```
## AsteriskEqualsToken::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: AsteriskEqualsToken) -> *Comment;
```
## AsteriskEqualsToken::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: AsteriskEqualsToken) -> *Comment;
```
## AsteriskEqualsToken::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: AsteriskEqualsToken) -> Node;
```
## AsteriskEqualsToken::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: AsteriskEqualsToken) -> FunctionLikeDeclaration;
```
## AsteriskEqualsToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: AsteriskEqualsToken) -> int;
```
## AsteriskEqualsToken::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: AsteriskEqualsToken) -> int;
```
## AsteriskEqualsToken::getIndex

```rust
pub fn getIndex(self: AsteriskEqualsToken) -> int;
```
## AsteriskEqualsToken::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: AsteriskEqualsToken) -> *Node;
```
## AsteriskEqualsToken::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *AsteriskEqualsToken;
```
