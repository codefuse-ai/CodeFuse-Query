# MinusToken

Inherit from [Token](./Token.md)

Primary key: `id: int`

```rust
schema MinusToken extends Token {
  @primary id: int,
}
```
## MinusToken::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: MinusToken) -> Location;
```
## MinusToken::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: MinusToken) -> Symbol;
```
## MinusToken::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: MinusToken) -> *Decorator;
```
## MinusToken::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: MinusToken) -> string;
```
## MinusToken::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: MinusToken, i: int) -> Modifier;
```
## MinusToken::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: MinusToken) -> *Comment;
```
## MinusToken::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: MinusToken) -> *Node;
```
## MinusToken::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: MinusToken) -> *Node;
```
## MinusToken::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: MinusToken) -> Node;
```
## MinusToken::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: MinusToken) -> int;
```
## MinusToken::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: MinusToken) -> TopLevelDO;
```
## MinusToken::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: MinusToken, i: int) -> Decorator;
```
## MinusToken::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: MinusToken) -> int;
```
## MinusToken::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: MinusToken) -> *Modifier;
```
## MinusToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: MinusToken) -> int;
```
## MinusToken::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: MinusToken, i: int) -> Node;
```
## MinusToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: MinusToken) -> int;
```
## MinusToken::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: MinusToken) -> *FunctionLikeDeclaration;
```
## MinusToken::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: MinusToken, level: int) -> *Node;
```
## MinusToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: MinusToken) -> int;
```
## MinusToken::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: MinusToken) -> string;
```
## MinusToken::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: MinusToken, level: int) -> Node;
```
## MinusToken::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: MinusToken) -> File;
```
## MinusToken::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: MinusToken) -> *Comment;
```
## MinusToken::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: MinusToken) -> *Comment;
```
## MinusToken::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: MinusToken) -> Node;
```
## MinusToken::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: MinusToken) -> FunctionLikeDeclaration;
```
## MinusToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: MinusToken) -> int;
```
## MinusToken::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: MinusToken) -> int;
```
## MinusToken::getIndex

```rust
pub fn getIndex(self: MinusToken) -> int;
```
## MinusToken::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: MinusToken) -> *Node;
```
## MinusToken::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *MinusToken;
```
