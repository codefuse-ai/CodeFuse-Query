# PlusToken

Primary key: `id: int`

```rust
schema PlusToken {
  @primary id: int,
}
```
## PlusToken::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: PlusToken) -> Location;
```
## PlusToken::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: PlusToken) -> Symbol;
```
## PlusToken::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: PlusToken) -> *Decorator;
```
## PlusToken::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: PlusToken) -> string;
```
## PlusToken::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: PlusToken, i: int) -> Modifier;
```
## PlusToken::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: PlusToken) -> *Comment;
```
## PlusToken::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: PlusToken) -> *Node;
```
## PlusToken::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: PlusToken) -> *Node;
```
## PlusToken::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: PlusToken) -> Node;
```
## PlusToken::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: PlusToken) -> int;
```
## PlusToken::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: PlusToken) -> TopLevelDO;
```
## PlusToken::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: PlusToken, i: int) -> Decorator;
```
## PlusToken::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: PlusToken) -> int;
```
## PlusToken::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: PlusToken) -> *Modifier;
```
## PlusToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: PlusToken) -> int;
```
## PlusToken::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: PlusToken, i: int) -> Node;
```
## PlusToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: PlusToken) -> int;
```
## PlusToken::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: PlusToken) -> *FunctionLikeDeclaration;
```
## PlusToken::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: PlusToken, level: int) -> *Node;
```
## PlusToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: PlusToken) -> int;
```
## PlusToken::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: PlusToken) -> string;
```
## PlusToken::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: PlusToken, level: int) -> Node;
```
## PlusToken::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: PlusToken) -> File;
```
## PlusToken::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: PlusToken) -> *Comment;
```
## PlusToken::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: PlusToken) -> *Comment;
```
## PlusToken::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: PlusToken) -> Node;
```
## PlusToken::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: PlusToken) -> FunctionLikeDeclaration;
```
## PlusToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: PlusToken) -> int;
```
## PlusToken::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: PlusToken) -> int;
```
## PlusToken::getIndex

```rust
pub fn getIndex(self: PlusToken) -> int;
```
## PlusToken::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: PlusToken) -> *Node;
```
## PlusToken::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *PlusToken;
```
