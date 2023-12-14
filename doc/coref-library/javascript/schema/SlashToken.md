# SlashToken

Inherit from [Token](./Token.md)

Primary key: `id: int`

```rust
schema SlashToken extends Token {
  @primary id: int,
}
```
## SlashToken::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: SlashToken) -> Location;
```
## SlashToken::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: SlashToken) -> Symbol;
```
## SlashToken::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: SlashToken) -> *Decorator;
```
## SlashToken::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: SlashToken) -> string;
```
## SlashToken::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: SlashToken, i: int) -> Modifier;
```
## SlashToken::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: SlashToken) -> *Comment;
```
## SlashToken::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: SlashToken) -> *Node;
```
## SlashToken::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: SlashToken) -> *Node;
```
## SlashToken::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: SlashToken) -> Node;
```
## SlashToken::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: SlashToken) -> int;
```
## SlashToken::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: SlashToken) -> TopLevelDO;
```
## SlashToken::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: SlashToken, i: int) -> Decorator;
```
## SlashToken::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: SlashToken) -> int;
```
## SlashToken::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: SlashToken) -> *Modifier;
```
## SlashToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: SlashToken) -> int;
```
## SlashToken::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: SlashToken, i: int) -> Node;
```
## SlashToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: SlashToken) -> int;
```
## SlashToken::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: SlashToken) -> *FunctionLikeDeclaration;
```
## SlashToken::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: SlashToken, level: int) -> *Node;
```
## SlashToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: SlashToken) -> int;
```
## SlashToken::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: SlashToken) -> string;
```
## SlashToken::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: SlashToken, level: int) -> Node;
```
## SlashToken::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: SlashToken) -> File;
```
## SlashToken::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: SlashToken) -> *Comment;
```
## SlashToken::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: SlashToken) -> *Comment;
```
## SlashToken::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: SlashToken) -> Node;
```
## SlashToken::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: SlashToken) -> FunctionLikeDeclaration;
```
## SlashToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: SlashToken) -> int;
```
## SlashToken::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: SlashToken) -> int;
```
## SlashToken::getIndex

```rust
pub fn getIndex(self: SlashToken) -> int;
```
## SlashToken::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: SlashToken) -> *Node;
```
## SlashToken::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *SlashToken;
```
