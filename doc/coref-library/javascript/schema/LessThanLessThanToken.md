# LessThanLessThanToken

Primary key: `id: int`

```rust
schema LessThanLessThanToken {
  @primary id: int,
}
```
## LessThanLessThanToken::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: LessThanLessThanToken) -> Location;
```
## LessThanLessThanToken::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: LessThanLessThanToken) -> Symbol;
```
## LessThanLessThanToken::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: LessThanLessThanToken) -> *Decorator;
```
## LessThanLessThanToken::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: LessThanLessThanToken) -> string;
```
## LessThanLessThanToken::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: LessThanLessThanToken, i: int) -> Modifier;
```
## LessThanLessThanToken::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: LessThanLessThanToken) -> *Comment;
```
## LessThanLessThanToken::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: LessThanLessThanToken) -> *Node;
```
## LessThanLessThanToken::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: LessThanLessThanToken) -> *Node;
```
## LessThanLessThanToken::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: LessThanLessThanToken) -> Node;
```
## LessThanLessThanToken::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: LessThanLessThanToken) -> int;
```
## LessThanLessThanToken::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: LessThanLessThanToken) -> TopLevelDO;
```
## LessThanLessThanToken::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: LessThanLessThanToken, i: int) -> Decorator;
```
## LessThanLessThanToken::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: LessThanLessThanToken) -> int;
```
## LessThanLessThanToken::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: LessThanLessThanToken) -> *Modifier;
```
## LessThanLessThanToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: LessThanLessThanToken) -> int;
```
## LessThanLessThanToken::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: LessThanLessThanToken, i: int) -> Node;
```
## LessThanLessThanToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: LessThanLessThanToken) -> int;
```
## LessThanLessThanToken::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: LessThanLessThanToken) -> *FunctionLikeDeclaration;
```
## LessThanLessThanToken::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: LessThanLessThanToken, level: int) -> *Node;
```
## LessThanLessThanToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: LessThanLessThanToken) -> int;
```
## LessThanLessThanToken::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: LessThanLessThanToken) -> string;
```
## LessThanLessThanToken::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: LessThanLessThanToken, level: int) -> Node;
```
## LessThanLessThanToken::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: LessThanLessThanToken) -> File;
```
## LessThanLessThanToken::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: LessThanLessThanToken) -> *Comment;
```
## LessThanLessThanToken::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: LessThanLessThanToken) -> *Comment;
```
## LessThanLessThanToken::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: LessThanLessThanToken) -> Node;
```
## LessThanLessThanToken::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: LessThanLessThanToken) -> FunctionLikeDeclaration;
```
## LessThanLessThanToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: LessThanLessThanToken) -> int;
```
## LessThanLessThanToken::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: LessThanLessThanToken) -> int;
```
## LessThanLessThanToken::getIndex

```rust
pub fn getIndex(self: LessThanLessThanToken) -> int;
```
## LessThanLessThanToken::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: LessThanLessThanToken) -> *Node;
```
## LessThanLessThanToken::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *LessThanLessThanToken;
```
