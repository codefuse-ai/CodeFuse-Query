# CaretEqualsToken

Inherit from [Token](./Token.md)

Primary key: `id: int`

```rust
schema CaretEqualsToken extends Token {
  @primary id: int
}
```
## CaretEqualsToken::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: CaretEqualsToken) -> Location;
```
## CaretEqualsToken::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: CaretEqualsToken) -> Symbol;
```
## CaretEqualsToken::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: CaretEqualsToken) -> *Decorator;
```
## CaretEqualsToken::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: CaretEqualsToken) -> string;
```
## CaretEqualsToken::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: CaretEqualsToken, i: int) -> Modifier;
```
## CaretEqualsToken::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: CaretEqualsToken) -> *Comment;
```
## CaretEqualsToken::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: CaretEqualsToken) -> *Node;
```
## CaretEqualsToken::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: CaretEqualsToken) -> *Node;
```
## CaretEqualsToken::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: CaretEqualsToken) -> Node;
```
## CaretEqualsToken::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: CaretEqualsToken) -> int;
```
## CaretEqualsToken::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: CaretEqualsToken) -> TopLevelDO;
```
## CaretEqualsToken::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: CaretEqualsToken, i: int) -> Decorator;
```
## CaretEqualsToken::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: CaretEqualsToken) -> int;
```
## CaretEqualsToken::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: CaretEqualsToken) -> *Modifier;
```
## CaretEqualsToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: CaretEqualsToken) -> int;
```
## CaretEqualsToken::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: CaretEqualsToken, i: int) -> Node;
```
## CaretEqualsToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: CaretEqualsToken) -> int;
```
## CaretEqualsToken::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: CaretEqualsToken) -> *FunctionLikeDeclaration;
```
## CaretEqualsToken::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: CaretEqualsToken, level: int) -> *Node;
```
## CaretEqualsToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: CaretEqualsToken) -> int;
```
## CaretEqualsToken::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: CaretEqualsToken) -> string;
```
## CaretEqualsToken::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: CaretEqualsToken, level: int) -> Node;
```
## CaretEqualsToken::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: CaretEqualsToken) -> File;
```
## CaretEqualsToken::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: CaretEqualsToken) -> *Comment;
```
## CaretEqualsToken::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: CaretEqualsToken) -> *Comment;
```
## CaretEqualsToken::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: CaretEqualsToken) -> Node;
```
## CaretEqualsToken::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: CaretEqualsToken) -> FunctionLikeDeclaration;
```
## CaretEqualsToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: CaretEqualsToken) -> int;
```
## CaretEqualsToken::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: CaretEqualsToken) -> int;
```
## CaretEqualsToken::getIndex

```rust
pub fn getIndex(self: CaretEqualsToken) -> int;
```
## CaretEqualsToken::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: CaretEqualsToken) -> *Node;
```
## CaretEqualsToken::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *CaretEqualsToken;
```
