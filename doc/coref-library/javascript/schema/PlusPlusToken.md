# PlusPlusToken

Primary key: `id: int`

```rust
schema PlusPlusToken {
  @primary id: int,
}
```
## PlusPlusToken::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: PlusPlusToken) -> Location;
```
## PlusPlusToken::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: PlusPlusToken) -> Symbol;
```
## PlusPlusToken::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: PlusPlusToken) -> *Decorator;
```
## PlusPlusToken::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: PlusPlusToken) -> string;
```
## PlusPlusToken::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: PlusPlusToken, i: int) -> Modifier;
```
## PlusPlusToken::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: PlusPlusToken) -> *Comment;
```
## PlusPlusToken::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: PlusPlusToken) -> *Node;
```
## PlusPlusToken::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: PlusPlusToken) -> *Node;
```
## PlusPlusToken::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: PlusPlusToken) -> Node;
```
## PlusPlusToken::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: PlusPlusToken) -> int;
```
## PlusPlusToken::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: PlusPlusToken) -> TopLevelDO;
```
## PlusPlusToken::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: PlusPlusToken, i: int) -> Decorator;
```
## PlusPlusToken::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: PlusPlusToken) -> int;
```
## PlusPlusToken::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: PlusPlusToken) -> *Modifier;
```
## PlusPlusToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: PlusPlusToken) -> int;
```
## PlusPlusToken::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: PlusPlusToken, i: int) -> Node;
```
## PlusPlusToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: PlusPlusToken) -> int;
```
## PlusPlusToken::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: PlusPlusToken) -> *FunctionLikeDeclaration;
```
## PlusPlusToken::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: PlusPlusToken, level: int) -> *Node;
```
## PlusPlusToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: PlusPlusToken) -> int;
```
## PlusPlusToken::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: PlusPlusToken) -> string;
```
## PlusPlusToken::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: PlusPlusToken, level: int) -> Node;
```
## PlusPlusToken::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: PlusPlusToken) -> File;
```
## PlusPlusToken::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: PlusPlusToken) -> *Comment;
```
## PlusPlusToken::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: PlusPlusToken) -> *Comment;
```
## PlusPlusToken::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: PlusPlusToken) -> Node;
```
## PlusPlusToken::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: PlusPlusToken) -> FunctionLikeDeclaration;
```
## PlusPlusToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: PlusPlusToken) -> int;
```
## PlusPlusToken::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: PlusPlusToken) -> int;
```
## PlusPlusToken::getIndex

```rust
pub fn getIndex(self: PlusPlusToken) -> int;
```
## PlusPlusToken::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: PlusPlusToken) -> *Node;
```
## PlusPlusToken::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *PlusPlusToken;
```
