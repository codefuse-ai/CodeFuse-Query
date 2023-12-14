# CaretToken

Primary key: `id: int`

```rust
schema CaretToken {
  @primary id: int,
}
```
## CaretToken::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: CaretToken) -> Location;
```
## CaretToken::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: CaretToken) -> Symbol;
```
## CaretToken::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: CaretToken) -> *Decorator;
```
## CaretToken::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: CaretToken) -> string;
```
## CaretToken::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: CaretToken, i: int) -> Modifier;
```
## CaretToken::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: CaretToken) -> *Comment;
```
## CaretToken::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: CaretToken) -> *Node;
```
## CaretToken::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: CaretToken) -> *Node;
```
## CaretToken::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: CaretToken) -> Node;
```
## CaretToken::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: CaretToken) -> int;
```
## CaretToken::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: CaretToken) -> TopLevelDO;
```
## CaretToken::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: CaretToken, i: int) -> Decorator;
```
## CaretToken::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: CaretToken) -> int;
```
## CaretToken::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: CaretToken) -> *Modifier;
```
## CaretToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: CaretToken) -> int;
```
## CaretToken::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: CaretToken, i: int) -> Node;
```
## CaretToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: CaretToken) -> int;
```
## CaretToken::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: CaretToken) -> *FunctionLikeDeclaration;
```
## CaretToken::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: CaretToken, level: int) -> *Node;
```
## CaretToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: CaretToken) -> int;
```
## CaretToken::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: CaretToken) -> string;
```
## CaretToken::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: CaretToken, level: int) -> Node;
```
## CaretToken::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: CaretToken) -> File;
```
## CaretToken::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: CaretToken) -> *Comment;
```
## CaretToken::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: CaretToken) -> *Comment;
```
## CaretToken::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: CaretToken) -> Node;
```
## CaretToken::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: CaretToken) -> FunctionLikeDeclaration;
```
## CaretToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: CaretToken) -> int;
```
## CaretToken::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: CaretToken) -> int;
```
## CaretToken::getIndex

```rust
pub fn getIndex(self: CaretToken) -> int;
```
## CaretToken::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: CaretToken) -> *Node;
```
## CaretToken::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *CaretToken;
```
