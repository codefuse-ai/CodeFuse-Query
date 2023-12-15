# PlusEqualsToken

Inherit from [Token](./Token.md)

Primary key: `id: int`

```rust
schema PlusEqualsToken extends Token {
  @primary id: int
}
```
## PlusEqualsToken::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: PlusEqualsToken) -> Location;
```
## PlusEqualsToken::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: PlusEqualsToken) -> Symbol;
```
## PlusEqualsToken::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: PlusEqualsToken) -> *Decorator;
```
## PlusEqualsToken::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: PlusEqualsToken) -> string;
```
## PlusEqualsToken::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: PlusEqualsToken, i: int) -> Modifier;
```
## PlusEqualsToken::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: PlusEqualsToken) -> *Comment;
```
## PlusEqualsToken::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: PlusEqualsToken) -> *Node;
```
## PlusEqualsToken::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: PlusEqualsToken) -> *Node;
```
## PlusEqualsToken::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: PlusEqualsToken) -> Node;
```
## PlusEqualsToken::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: PlusEqualsToken) -> int;
```
## PlusEqualsToken::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: PlusEqualsToken) -> TopLevelDO;
```
## PlusEqualsToken::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: PlusEqualsToken, i: int) -> Decorator;
```
## PlusEqualsToken::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: PlusEqualsToken) -> int;
```
## PlusEqualsToken::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: PlusEqualsToken) -> *Modifier;
```
## PlusEqualsToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: PlusEqualsToken) -> int;
```
## PlusEqualsToken::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: PlusEqualsToken, i: int) -> Node;
```
## PlusEqualsToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: PlusEqualsToken) -> int;
```
## PlusEqualsToken::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: PlusEqualsToken) -> *FunctionLikeDeclaration;
```
## PlusEqualsToken::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: PlusEqualsToken, level: int) -> *Node;
```
## PlusEqualsToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: PlusEqualsToken) -> int;
```
## PlusEqualsToken::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: PlusEqualsToken) -> string;
```
## PlusEqualsToken::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: PlusEqualsToken, level: int) -> Node;
```
## PlusEqualsToken::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: PlusEqualsToken) -> File;
```
## PlusEqualsToken::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: PlusEqualsToken) -> *Comment;
```
## PlusEqualsToken::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: PlusEqualsToken) -> *Comment;
```
## PlusEqualsToken::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: PlusEqualsToken) -> Node;
```
## PlusEqualsToken::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: PlusEqualsToken) -> FunctionLikeDeclaration;
```
## PlusEqualsToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: PlusEqualsToken) -> int;
```
## PlusEqualsToken::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: PlusEqualsToken) -> int;
```
## PlusEqualsToken::getIndex

```rust
pub fn getIndex(self: PlusEqualsToken) -> int;
```
## PlusEqualsToken::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: PlusEqualsToken) -> *Node;
```
## PlusEqualsToken::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *PlusEqualsToken;
```
