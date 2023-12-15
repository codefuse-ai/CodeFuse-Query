# MinusMinusToken

Inherit from [Token](./Token.md)

Primary key: `id: int`

```rust
schema MinusMinusToken extends Token {
  @primary id: int
}
```
## MinusMinusToken::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: MinusMinusToken) -> Location;
```
## MinusMinusToken::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: MinusMinusToken) -> Symbol;
```
## MinusMinusToken::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: MinusMinusToken) -> *Decorator;
```
## MinusMinusToken::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: MinusMinusToken) -> string;
```
## MinusMinusToken::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: MinusMinusToken, i: int) -> Modifier;
```
## MinusMinusToken::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: MinusMinusToken) -> *Comment;
```
## MinusMinusToken::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: MinusMinusToken) -> *Node;
```
## MinusMinusToken::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: MinusMinusToken) -> *Node;
```
## MinusMinusToken::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: MinusMinusToken) -> Node;
```
## MinusMinusToken::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: MinusMinusToken) -> int;
```
## MinusMinusToken::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: MinusMinusToken) -> TopLevelDO;
```
## MinusMinusToken::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: MinusMinusToken, i: int) -> Decorator;
```
## MinusMinusToken::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: MinusMinusToken) -> int;
```
## MinusMinusToken::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: MinusMinusToken) -> *Modifier;
```
## MinusMinusToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: MinusMinusToken) -> int;
```
## MinusMinusToken::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: MinusMinusToken, i: int) -> Node;
```
## MinusMinusToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: MinusMinusToken) -> int;
```
## MinusMinusToken::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: MinusMinusToken) -> *FunctionLikeDeclaration;
```
## MinusMinusToken::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: MinusMinusToken, level: int) -> *Node;
```
## MinusMinusToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: MinusMinusToken) -> int;
```
## MinusMinusToken::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: MinusMinusToken) -> string;
```
## MinusMinusToken::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: MinusMinusToken, level: int) -> Node;
```
## MinusMinusToken::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: MinusMinusToken) -> File;
```
## MinusMinusToken::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: MinusMinusToken) -> *Comment;
```
## MinusMinusToken::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: MinusMinusToken) -> *Comment;
```
## MinusMinusToken::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: MinusMinusToken) -> Node;
```
## MinusMinusToken::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: MinusMinusToken) -> FunctionLikeDeclaration;
```
## MinusMinusToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: MinusMinusToken) -> int;
```
## MinusMinusToken::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: MinusMinusToken) -> int;
```
## MinusMinusToken::getIndex

```rust
pub fn getIndex(self: MinusMinusToken) -> int;
```
## MinusMinusToken::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: MinusMinusToken) -> *Node;
```
## MinusMinusToken::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *MinusMinusToken;
```
