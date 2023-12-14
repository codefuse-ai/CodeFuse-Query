# CommaToken

Primary key: `id: int`

```rust
schema CommaToken {
  @primary id: int,
}
```
## CommaToken::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: CommaToken) -> Location;
```
## CommaToken::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: CommaToken) -> Symbol;
```
## CommaToken::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: CommaToken) -> *Decorator;
```
## CommaToken::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: CommaToken) -> string;
```
## CommaToken::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: CommaToken, i: int) -> Modifier;
```
## CommaToken::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: CommaToken) -> *Comment;
```
## CommaToken::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: CommaToken) -> *Node;
```
## CommaToken::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: CommaToken) -> *Node;
```
## CommaToken::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: CommaToken) -> Node;
```
## CommaToken::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: CommaToken) -> int;
```
## CommaToken::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: CommaToken) -> TopLevelDO;
```
## CommaToken::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: CommaToken, i: int) -> Decorator;
```
## CommaToken::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: CommaToken) -> int;
```
## CommaToken::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: CommaToken) -> *Modifier;
```
## CommaToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: CommaToken) -> int;
```
## CommaToken::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: CommaToken, i: int) -> Node;
```
## CommaToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: CommaToken) -> int;
```
## CommaToken::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: CommaToken) -> *FunctionLikeDeclaration;
```
## CommaToken::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: CommaToken, level: int) -> *Node;
```
## CommaToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: CommaToken) -> int;
```
## CommaToken::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: CommaToken) -> string;
```
## CommaToken::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: CommaToken, level: int) -> Node;
```
## CommaToken::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: CommaToken) -> File;
```
## CommaToken::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: CommaToken) -> *Comment;
```
## CommaToken::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: CommaToken) -> *Comment;
```
## CommaToken::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: CommaToken) -> Node;
```
## CommaToken::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: CommaToken) -> FunctionLikeDeclaration;
```
## CommaToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: CommaToken) -> int;
```
## CommaToken::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: CommaToken) -> int;
```
## CommaToken::getIndex

```rust
pub fn getIndex(self: CommaToken) -> int;
```
## CommaToken::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: CommaToken) -> *Node;
```
## CommaToken::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *CommaToken;
```
