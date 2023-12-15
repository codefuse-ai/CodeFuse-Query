# HeritageToken

Inherit from [Node](./Node.md)

Primary key: `id: int`

```rust
schema HeritageToken extends Node {
  @primary id: int
}
```
## HeritageToken::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: HeritageToken) -> *Node;
```
## HeritageToken::getIndex

```rust
pub fn getIndex(self: HeritageToken) -> int;
```
## HeritageToken::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: HeritageToken) -> int;
```
## HeritageToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: HeritageToken) -> int;
```
## HeritageToken::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: HeritageToken) -> Node;
```
## HeritageToken::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: HeritageToken) -> FunctionLikeDeclaration;
```
## HeritageToken::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: HeritageToken) -> File;
```
## HeritageToken::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: HeritageToken, level: int) -> Node;
```
## HeritageToken::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: HeritageToken) -> string;
```
## HeritageToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: HeritageToken) -> int;
```
## HeritageToken::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: HeritageToken) -> *FunctionLikeDeclaration;
```
## HeritageToken::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: HeritageToken, level: int) -> *Node;
```
## HeritageToken::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: HeritageToken) -> int;
```
## HeritageToken::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: HeritageToken) -> *Modifier;
```
## HeritageToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: HeritageToken) -> int;
```
## HeritageToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: HeritageToken) -> int;
```
## HeritageToken::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: HeritageToken, i: int) -> Node;
```
## HeritageToken::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: HeritageToken, i: int) -> Decorator;
```
## HeritageToken::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: HeritageToken) -> TopLevelDO;
```
## HeritageToken::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: HeritageToken) -> int;
```
## HeritageToken::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: HeritageToken) -> *Comment;
```
## HeritageToken::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: HeritageToken) -> *Comment;
```
## HeritageToken::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: HeritageToken) -> Node;
```
## HeritageToken::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: HeritageToken) -> *Node;
```
## HeritageToken::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: HeritageToken) -> *Node;
```
## HeritageToken::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: HeritageToken) -> *Comment;
```
## HeritageToken::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: HeritageToken, i: int) -> Modifier;
```
## HeritageToken::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: HeritageToken) -> string;
```
## HeritageToken::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: HeritageToken) -> *Decorator;
```
## HeritageToken::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: HeritageToken) -> Symbol;
```
## HeritageToken::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: HeritageToken) -> Location;
```
## HeritageToken::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *HeritageToken;
```
