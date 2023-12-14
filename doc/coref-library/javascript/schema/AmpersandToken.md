# AmpersandToken

Primary key: `id: int`

```rust
schema AmpersandToken {
  @primary id: int,
}
```
## AmpersandToken::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: AmpersandToken) -> Location;
```
## AmpersandToken::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: AmpersandToken) -> Symbol;
```
## AmpersandToken::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: AmpersandToken) -> *Decorator;
```
## AmpersandToken::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: AmpersandToken) -> string;
```
## AmpersandToken::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: AmpersandToken, i: int) -> Modifier;
```
## AmpersandToken::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: AmpersandToken) -> *Comment;
```
## AmpersandToken::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: AmpersandToken) -> *Node;
```
## AmpersandToken::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: AmpersandToken) -> *Node;
```
## AmpersandToken::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: AmpersandToken) -> Node;
```
## AmpersandToken::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: AmpersandToken) -> int;
```
## AmpersandToken::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: AmpersandToken) -> TopLevelDO;
```
## AmpersandToken::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: AmpersandToken, i: int) -> Decorator;
```
## AmpersandToken::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: AmpersandToken) -> int;
```
## AmpersandToken::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: AmpersandToken) -> *Modifier;
```
## AmpersandToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: AmpersandToken) -> int;
```
## AmpersandToken::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: AmpersandToken, i: int) -> Node;
```
## AmpersandToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: AmpersandToken) -> int;
```
## AmpersandToken::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: AmpersandToken) -> *FunctionLikeDeclaration;
```
## AmpersandToken::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: AmpersandToken, level: int) -> *Node;
```
## AmpersandToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: AmpersandToken) -> int;
```
## AmpersandToken::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: AmpersandToken) -> string;
```
## AmpersandToken::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: AmpersandToken, level: int) -> Node;
```
## AmpersandToken::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: AmpersandToken) -> File;
```
## AmpersandToken::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: AmpersandToken) -> *Comment;
```
## AmpersandToken::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: AmpersandToken) -> *Comment;
```
## AmpersandToken::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: AmpersandToken) -> Node;
```
## AmpersandToken::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: AmpersandToken) -> FunctionLikeDeclaration;
```
## AmpersandToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: AmpersandToken) -> int;
```
## AmpersandToken::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: AmpersandToken) -> int;
```
## AmpersandToken::getIndex

```rust
pub fn getIndex(self: AmpersandToken) -> int;
```
## AmpersandToken::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: AmpersandToken) -> *Node;
```
## AmpersandToken::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *AmpersandToken;
```
