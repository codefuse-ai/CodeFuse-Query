# Token

Inherit from [Node](./Node.md)

Primary key: `id: int`

```rust
schema Token extends Node {
  @primary id: int
}
```
## Token::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: Token) -> *Node;
```
## Token::getIndex

```rust
pub fn getIndex(self: Token) -> int;
```
## Token::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: Token) -> int;
```
## Token::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: Token) -> int;
```
## Token::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: Token) -> Node;
```
## Token::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: Token) -> FunctionLikeDeclaration;
```
## Token::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: Token) -> File;
```
## Token::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: Token, level: int) -> Node;
```
## Token::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: Token) -> string;
```
## Token::getEndLineNumber

```rust
pub fn getEndLineNumber(self: Token) -> int;
```
## Token::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: Token) -> *FunctionLikeDeclaration;
```
## Token::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: Token, level: int) -> *Node;
```
## Token::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: Token) -> int;
```
## Token::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: Token) -> *Modifier;
```
## Token::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: Token) -> int;
```
## Token::getStartLineNumber

```rust
pub fn getStartLineNumber(self: Token) -> int;
```
## Token::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: Token, i: int) -> Node;
```
## Token::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: Token, i: int) -> Decorator;
```
## Token::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: Token) -> TopLevelDO;
```
## Token::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: Token) -> int;
```
## Token::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: Token) -> *Comment;
```
## Token::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: Token) -> *Comment;
```
## Token::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: Token) -> Node;
```
## Token::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: Token) -> *Node;
```
## Token::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: Token) -> *Node;
```
## Token::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: Token) -> *Comment;
```
## Token::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: Token, i: int) -> Modifier;
```
## Token::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: Token) -> string;
```
## Token::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: Token) -> *Decorator;
```
## Token::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: Token) -> Symbol;
```
## Token::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: Token) -> Location;
```
## Token::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *Token;
```
