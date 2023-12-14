# PercentEqualsToken

Primary key: `id: int`

```rust
schema PercentEqualsToken {
  @primary id: int,
}
```
## PercentEqualsToken::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: PercentEqualsToken) -> Location;
```
## PercentEqualsToken::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: PercentEqualsToken) -> Symbol;
```
## PercentEqualsToken::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: PercentEqualsToken) -> *Decorator;
```
## PercentEqualsToken::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: PercentEqualsToken) -> string;
```
## PercentEqualsToken::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: PercentEqualsToken, i: int) -> Modifier;
```
## PercentEqualsToken::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: PercentEqualsToken) -> *Comment;
```
## PercentEqualsToken::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: PercentEqualsToken) -> *Node;
```
## PercentEqualsToken::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: PercentEqualsToken) -> *Node;
```
## PercentEqualsToken::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: PercentEqualsToken) -> Node;
```
## PercentEqualsToken::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: PercentEqualsToken) -> int;
```
## PercentEqualsToken::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: PercentEqualsToken) -> TopLevelDO;
```
## PercentEqualsToken::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: PercentEqualsToken, i: int) -> Decorator;
```
## PercentEqualsToken::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: PercentEqualsToken) -> int;
```
## PercentEqualsToken::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: PercentEqualsToken) -> *Modifier;
```
## PercentEqualsToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: PercentEqualsToken) -> int;
```
## PercentEqualsToken::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: PercentEqualsToken, i: int) -> Node;
```
## PercentEqualsToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: PercentEqualsToken) -> int;
```
## PercentEqualsToken::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: PercentEqualsToken) -> *FunctionLikeDeclaration;
```
## PercentEqualsToken::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: PercentEqualsToken, level: int) -> *Node;
```
## PercentEqualsToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: PercentEqualsToken) -> int;
```
## PercentEqualsToken::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: PercentEqualsToken) -> string;
```
## PercentEqualsToken::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: PercentEqualsToken, level: int) -> Node;
```
## PercentEqualsToken::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: PercentEqualsToken) -> File;
```
## PercentEqualsToken::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: PercentEqualsToken) -> *Comment;
```
## PercentEqualsToken::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: PercentEqualsToken) -> *Comment;
```
## PercentEqualsToken::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: PercentEqualsToken) -> Node;
```
## PercentEqualsToken::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: PercentEqualsToken) -> FunctionLikeDeclaration;
```
## PercentEqualsToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: PercentEqualsToken) -> int;
```
## PercentEqualsToken::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: PercentEqualsToken) -> int;
```
## PercentEqualsToken::getIndex

```rust
pub fn getIndex(self: PercentEqualsToken) -> int;
```
## PercentEqualsToken::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: PercentEqualsToken) -> *Node;
```
## PercentEqualsToken::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *PercentEqualsToken;
```
