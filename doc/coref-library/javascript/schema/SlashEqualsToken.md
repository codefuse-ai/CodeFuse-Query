# SlashEqualsToken

Inherit from [Token](./Token.md)

Primary key: `id: int`

```rust
schema SlashEqualsToken extends Token {
  @primary id: int,
}
```
## SlashEqualsToken::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: SlashEqualsToken) -> Location;
```
## SlashEqualsToken::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: SlashEqualsToken) -> Symbol;
```
## SlashEqualsToken::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: SlashEqualsToken) -> *Decorator;
```
## SlashEqualsToken::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: SlashEqualsToken) -> string;
```
## SlashEqualsToken::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: SlashEqualsToken, i: int) -> Modifier;
```
## SlashEqualsToken::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: SlashEqualsToken) -> *Comment;
```
## SlashEqualsToken::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: SlashEqualsToken) -> *Node;
```
## SlashEqualsToken::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: SlashEqualsToken) -> *Node;
```
## SlashEqualsToken::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: SlashEqualsToken) -> Node;
```
## SlashEqualsToken::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: SlashEqualsToken) -> int;
```
## SlashEqualsToken::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: SlashEqualsToken) -> TopLevelDO;
```
## SlashEqualsToken::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: SlashEqualsToken, i: int) -> Decorator;
```
## SlashEqualsToken::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: SlashEqualsToken) -> int;
```
## SlashEqualsToken::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: SlashEqualsToken) -> *Modifier;
```
## SlashEqualsToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: SlashEqualsToken) -> int;
```
## SlashEqualsToken::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: SlashEqualsToken, i: int) -> Node;
```
## SlashEqualsToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: SlashEqualsToken) -> int;
```
## SlashEqualsToken::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: SlashEqualsToken) -> *FunctionLikeDeclaration;
```
## SlashEqualsToken::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: SlashEqualsToken, level: int) -> *Node;
```
## SlashEqualsToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: SlashEqualsToken) -> int;
```
## SlashEqualsToken::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: SlashEqualsToken) -> string;
```
## SlashEqualsToken::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: SlashEqualsToken, level: int) -> Node;
```
## SlashEqualsToken::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: SlashEqualsToken) -> File;
```
## SlashEqualsToken::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: SlashEqualsToken) -> *Comment;
```
## SlashEqualsToken::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: SlashEqualsToken) -> *Comment;
```
## SlashEqualsToken::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: SlashEqualsToken) -> Node;
```
## SlashEqualsToken::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: SlashEqualsToken) -> FunctionLikeDeclaration;
```
## SlashEqualsToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: SlashEqualsToken) -> int;
```
## SlashEqualsToken::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: SlashEqualsToken) -> int;
```
## SlashEqualsToken::getIndex

```rust
pub fn getIndex(self: SlashEqualsToken) -> int;
```
## SlashEqualsToken::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: SlashEqualsToken) -> *Node;
```
## SlashEqualsToken::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *SlashEqualsToken;
```
