# IdentifierToken

Inherit from [Token](./Token.md)

Primary key: `id: int`

```rust
schema IdentifierToken extends Token {
  @primary id: int
}
```
## IdentifierToken::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: IdentifierToken) -> Location;
```
## IdentifierToken::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: IdentifierToken) -> Symbol;
```
## IdentifierToken::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: IdentifierToken) -> *Decorator;
```
## IdentifierToken::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: IdentifierToken) -> string;
```
## IdentifierToken::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: IdentifierToken, i: int) -> Modifier;
```
## IdentifierToken::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: IdentifierToken) -> *Comment;
```
## IdentifierToken::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: IdentifierToken) -> *Node;
```
## IdentifierToken::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: IdentifierToken) -> *Node;
```
## IdentifierToken::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: IdentifierToken) -> Node;
```
## IdentifierToken::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: IdentifierToken) -> int;
```
## IdentifierToken::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: IdentifierToken) -> TopLevelDO;
```
## IdentifierToken::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: IdentifierToken, i: int) -> Decorator;
```
## IdentifierToken::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: IdentifierToken) -> int;
```
## IdentifierToken::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: IdentifierToken) -> *Modifier;
```
## IdentifierToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: IdentifierToken) -> int;
```
## IdentifierToken::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: IdentifierToken, i: int) -> Node;
```
## IdentifierToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: IdentifierToken) -> int;
```
## IdentifierToken::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: IdentifierToken) -> *FunctionLikeDeclaration;
```
## IdentifierToken::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: IdentifierToken, level: int) -> *Node;
```
## IdentifierToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: IdentifierToken) -> int;
```
## IdentifierToken::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: IdentifierToken) -> string;
```
## IdentifierToken::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: IdentifierToken, level: int) -> Node;
```
## IdentifierToken::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: IdentifierToken) -> File;
```
## IdentifierToken::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: IdentifierToken) -> *Comment;
```
## IdentifierToken::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: IdentifierToken) -> *Comment;
```
## IdentifierToken::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: IdentifierToken) -> Node;
```
## IdentifierToken::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: IdentifierToken) -> FunctionLikeDeclaration;
```
## IdentifierToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: IdentifierToken) -> int;
```
## IdentifierToken::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: IdentifierToken) -> int;
```
## IdentifierToken::getIndex

```rust
pub fn getIndex(self: IdentifierToken) -> int;
```
## IdentifierToken::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: IdentifierToken) -> *Node;
```
## IdentifierToken::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *IdentifierToken;
```
