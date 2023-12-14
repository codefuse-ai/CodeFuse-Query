# LessThanEqualsToken

Primary key: `id: int`

```rust
schema LessThanEqualsToken {
  @primary id: int,
}
```
## LessThanEqualsToken::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: LessThanEqualsToken) -> Location;
```
## LessThanEqualsToken::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: LessThanEqualsToken) -> Symbol;
```
## LessThanEqualsToken::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: LessThanEqualsToken) -> *Decorator;
```
## LessThanEqualsToken::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: LessThanEqualsToken) -> string;
```
## LessThanEqualsToken::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: LessThanEqualsToken, i: int) -> Modifier;
```
## LessThanEqualsToken::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: LessThanEqualsToken) -> *Comment;
```
## LessThanEqualsToken::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: LessThanEqualsToken) -> *Node;
```
## LessThanEqualsToken::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: LessThanEqualsToken) -> *Node;
```
## LessThanEqualsToken::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: LessThanEqualsToken) -> Node;
```
## LessThanEqualsToken::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: LessThanEqualsToken) -> int;
```
## LessThanEqualsToken::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: LessThanEqualsToken) -> TopLevelDO;
```
## LessThanEqualsToken::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: LessThanEqualsToken, i: int) -> Decorator;
```
## LessThanEqualsToken::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: LessThanEqualsToken) -> int;
```
## LessThanEqualsToken::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: LessThanEqualsToken) -> *Modifier;
```
## LessThanEqualsToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: LessThanEqualsToken) -> int;
```
## LessThanEqualsToken::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: LessThanEqualsToken, i: int) -> Node;
```
## LessThanEqualsToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: LessThanEqualsToken) -> int;
```
## LessThanEqualsToken::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: LessThanEqualsToken) -> *FunctionLikeDeclaration;
```
## LessThanEqualsToken::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: LessThanEqualsToken, level: int) -> *Node;
```
## LessThanEqualsToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: LessThanEqualsToken) -> int;
```
## LessThanEqualsToken::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: LessThanEqualsToken) -> string;
```
## LessThanEqualsToken::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: LessThanEqualsToken, level: int) -> Node;
```
## LessThanEqualsToken::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: LessThanEqualsToken) -> File;
```
## LessThanEqualsToken::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: LessThanEqualsToken) -> *Comment;
```
## LessThanEqualsToken::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: LessThanEqualsToken) -> *Comment;
```
## LessThanEqualsToken::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: LessThanEqualsToken) -> Node;
```
## LessThanEqualsToken::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: LessThanEqualsToken) -> FunctionLikeDeclaration;
```
## LessThanEqualsToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: LessThanEqualsToken) -> int;
```
## LessThanEqualsToken::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: LessThanEqualsToken) -> int;
```
## LessThanEqualsToken::getIndex

```rust
pub fn getIndex(self: LessThanEqualsToken) -> int;
```
## LessThanEqualsToken::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: LessThanEqualsToken) -> *Node;
```
## LessThanEqualsToken::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *LessThanEqualsToken;
```
