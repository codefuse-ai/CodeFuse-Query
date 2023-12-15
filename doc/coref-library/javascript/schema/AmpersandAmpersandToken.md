# AmpersandAmpersandToken

Inherit from [Token](./Token.md)

Primary key: `id: int`

```rust
schema AmpersandAmpersandToken extends Token {
  @primary id: int
}
```
## AmpersandAmpersandToken::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: AmpersandAmpersandToken) -> Location;
```
## AmpersandAmpersandToken::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: AmpersandAmpersandToken) -> Symbol;
```
## AmpersandAmpersandToken::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: AmpersandAmpersandToken) -> *Decorator;
```
## AmpersandAmpersandToken::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: AmpersandAmpersandToken) -> string;
```
## AmpersandAmpersandToken::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: AmpersandAmpersandToken, i: int) -> Modifier;
```
## AmpersandAmpersandToken::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: AmpersandAmpersandToken) -> *Comment;
```
## AmpersandAmpersandToken::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: AmpersandAmpersandToken) -> *Node;
```
## AmpersandAmpersandToken::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: AmpersandAmpersandToken) -> *Node;
```
## AmpersandAmpersandToken::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: AmpersandAmpersandToken) -> Node;
```
## AmpersandAmpersandToken::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: AmpersandAmpersandToken) -> int;
```
## AmpersandAmpersandToken::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: AmpersandAmpersandToken) -> TopLevelDO;
```
## AmpersandAmpersandToken::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: AmpersandAmpersandToken, i: int) -> Decorator;
```
## AmpersandAmpersandToken::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: AmpersandAmpersandToken) -> int;
```
## AmpersandAmpersandToken::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: AmpersandAmpersandToken) -> *Modifier;
```
## AmpersandAmpersandToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: AmpersandAmpersandToken) -> int;
```
## AmpersandAmpersandToken::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: AmpersandAmpersandToken, i: int) -> Node;
```
## AmpersandAmpersandToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: AmpersandAmpersandToken) -> int;
```
## AmpersandAmpersandToken::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: AmpersandAmpersandToken) -> *FunctionLikeDeclaration;
```
## AmpersandAmpersandToken::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: AmpersandAmpersandToken, level: int) -> *Node;
```
## AmpersandAmpersandToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: AmpersandAmpersandToken) -> int;
```
## AmpersandAmpersandToken::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: AmpersandAmpersandToken) -> string;
```
## AmpersandAmpersandToken::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: AmpersandAmpersandToken, level: int) -> Node;
```
## AmpersandAmpersandToken::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: AmpersandAmpersandToken) -> File;
```
## AmpersandAmpersandToken::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: AmpersandAmpersandToken) -> *Comment;
```
## AmpersandAmpersandToken::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: AmpersandAmpersandToken) -> *Comment;
```
## AmpersandAmpersandToken::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: AmpersandAmpersandToken) -> Node;
```
## AmpersandAmpersandToken::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: AmpersandAmpersandToken) -> FunctionLikeDeclaration;
```
## AmpersandAmpersandToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: AmpersandAmpersandToken) -> int;
```
## AmpersandAmpersandToken::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: AmpersandAmpersandToken) -> int;
```
## AmpersandAmpersandToken::getIndex

```rust
pub fn getIndex(self: AmpersandAmpersandToken) -> int;
```
## AmpersandAmpersandToken::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: AmpersandAmpersandToken) -> *Node;
```
## AmpersandAmpersandToken::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *AmpersandAmpersandToken;
```
