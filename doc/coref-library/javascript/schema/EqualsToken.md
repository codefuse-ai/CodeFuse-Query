# EqualsToken

Primary key: `id: int`

```rust
schema EqualsToken {
  @primary id: int,
}
```
## EqualsToken::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: EqualsToken) -> Location;
```
## EqualsToken::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: EqualsToken) -> Symbol;
```
## EqualsToken::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: EqualsToken) -> *Decorator;
```
## EqualsToken::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: EqualsToken) -> string;
```
## EqualsToken::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: EqualsToken, i: int) -> Modifier;
```
## EqualsToken::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: EqualsToken) -> *Comment;
```
## EqualsToken::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: EqualsToken) -> *Node;
```
## EqualsToken::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: EqualsToken) -> *Node;
```
## EqualsToken::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: EqualsToken) -> Node;
```
## EqualsToken::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: EqualsToken) -> int;
```
## EqualsToken::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: EqualsToken) -> TopLevelDO;
```
## EqualsToken::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: EqualsToken, i: int) -> Decorator;
```
## EqualsToken::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: EqualsToken) -> int;
```
## EqualsToken::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: EqualsToken) -> *Modifier;
```
## EqualsToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: EqualsToken) -> int;
```
## EqualsToken::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: EqualsToken, i: int) -> Node;
```
## EqualsToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: EqualsToken) -> int;
```
## EqualsToken::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: EqualsToken) -> *FunctionLikeDeclaration;
```
## EqualsToken::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: EqualsToken, level: int) -> *Node;
```
## EqualsToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: EqualsToken) -> int;
```
## EqualsToken::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: EqualsToken) -> string;
```
## EqualsToken::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: EqualsToken, level: int) -> Node;
```
## EqualsToken::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: EqualsToken) -> File;
```
## EqualsToken::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: EqualsToken) -> *Comment;
```
## EqualsToken::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: EqualsToken) -> *Comment;
```
## EqualsToken::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: EqualsToken) -> Node;
```
## EqualsToken::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: EqualsToken) -> FunctionLikeDeclaration;
```
## EqualsToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: EqualsToken) -> int;
```
## EqualsToken::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: EqualsToken) -> int;
```
## EqualsToken::getIndex

```rust
pub fn getIndex(self: EqualsToken) -> int;
```
## EqualsToken::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: EqualsToken) -> *Node;
```
## EqualsToken::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *EqualsToken;
```
