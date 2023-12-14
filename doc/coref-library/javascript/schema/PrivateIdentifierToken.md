# PrivateIdentifierToken

Inherit from [Token](./Token.md)

Primary key: `id: int`

```rust
schema PrivateIdentifierToken extends Token {
  @primary id: int,
}
```
## PrivateIdentifierToken::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: PrivateIdentifierToken) -> Location;
```
## PrivateIdentifierToken::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: PrivateIdentifierToken) -> Symbol;
```
## PrivateIdentifierToken::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: PrivateIdentifierToken) -> *Decorator;
```
## PrivateIdentifierToken::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: PrivateIdentifierToken) -> string;
```
## PrivateIdentifierToken::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: PrivateIdentifierToken, i: int) -> Modifier;
```
## PrivateIdentifierToken::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: PrivateIdentifierToken) -> *Comment;
```
## PrivateIdentifierToken::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: PrivateIdentifierToken) -> *Node;
```
## PrivateIdentifierToken::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: PrivateIdentifierToken) -> *Node;
```
## PrivateIdentifierToken::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: PrivateIdentifierToken) -> Node;
```
## PrivateIdentifierToken::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: PrivateIdentifierToken) -> int;
```
## PrivateIdentifierToken::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: PrivateIdentifierToken) -> TopLevelDO;
```
## PrivateIdentifierToken::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: PrivateIdentifierToken, i: int) -> Decorator;
```
## PrivateIdentifierToken::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: PrivateIdentifierToken) -> int;
```
## PrivateIdentifierToken::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: PrivateIdentifierToken) -> *Modifier;
```
## PrivateIdentifierToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: PrivateIdentifierToken) -> int;
```
## PrivateIdentifierToken::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: PrivateIdentifierToken, i: int) -> Node;
```
## PrivateIdentifierToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: PrivateIdentifierToken) -> int;
```
## PrivateIdentifierToken::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: PrivateIdentifierToken) -> *FunctionLikeDeclaration;
```
## PrivateIdentifierToken::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: PrivateIdentifierToken, level: int) -> *Node;
```
## PrivateIdentifierToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: PrivateIdentifierToken) -> int;
```
## PrivateIdentifierToken::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: PrivateIdentifierToken) -> string;
```
## PrivateIdentifierToken::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: PrivateIdentifierToken, level: int) -> Node;
```
## PrivateIdentifierToken::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: PrivateIdentifierToken) -> File;
```
## PrivateIdentifierToken::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: PrivateIdentifierToken) -> *Comment;
```
## PrivateIdentifierToken::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: PrivateIdentifierToken) -> *Comment;
```
## PrivateIdentifierToken::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: PrivateIdentifierToken) -> Node;
```
## PrivateIdentifierToken::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: PrivateIdentifierToken) -> FunctionLikeDeclaration;
```
## PrivateIdentifierToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: PrivateIdentifierToken) -> int;
```
## PrivateIdentifierToken::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: PrivateIdentifierToken) -> int;
```
## PrivateIdentifierToken::getIndex

```rust
pub fn getIndex(self: PrivateIdentifierToken) -> int;
```
## PrivateIdentifierToken::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: PrivateIdentifierToken) -> *Node;
```
## PrivateIdentifierToken::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *PrivateIdentifierToken;
```
