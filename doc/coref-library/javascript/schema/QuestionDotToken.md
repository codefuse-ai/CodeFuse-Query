# QuestionDotToken

Inherit from [Token](./Token.md)

Primary key: `id: int`

```rust
schema QuestionDotToken extends Token {
  @primary id: int,
}
```
## QuestionDotToken::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: QuestionDotToken) -> Location;
```
## QuestionDotToken::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: QuestionDotToken) -> Symbol;
```
## QuestionDotToken::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: QuestionDotToken) -> *Decorator;
```
## QuestionDotToken::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: QuestionDotToken) -> string;
```
## QuestionDotToken::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: QuestionDotToken, i: int) -> Modifier;
```
## QuestionDotToken::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: QuestionDotToken) -> *Comment;
```
## QuestionDotToken::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: QuestionDotToken) -> *Node;
```
## QuestionDotToken::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: QuestionDotToken) -> *Node;
```
## QuestionDotToken::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: QuestionDotToken) -> Node;
```
## QuestionDotToken::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: QuestionDotToken) -> int;
```
## QuestionDotToken::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: QuestionDotToken) -> TopLevelDO;
```
## QuestionDotToken::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: QuestionDotToken, i: int) -> Decorator;
```
## QuestionDotToken::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: QuestionDotToken) -> int;
```
## QuestionDotToken::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: QuestionDotToken) -> *Modifier;
```
## QuestionDotToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: QuestionDotToken) -> int;
```
## QuestionDotToken::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: QuestionDotToken, i: int) -> Node;
```
## QuestionDotToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: QuestionDotToken) -> int;
```
## QuestionDotToken::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: QuestionDotToken) -> *FunctionLikeDeclaration;
```
## QuestionDotToken::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: QuestionDotToken, level: int) -> *Node;
```
## QuestionDotToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: QuestionDotToken) -> int;
```
## QuestionDotToken::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: QuestionDotToken) -> string;
```
## QuestionDotToken::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: QuestionDotToken, level: int) -> Node;
```
## QuestionDotToken::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: QuestionDotToken) -> File;
```
## QuestionDotToken::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: QuestionDotToken) -> *Comment;
```
## QuestionDotToken::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: QuestionDotToken) -> *Comment;
```
## QuestionDotToken::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: QuestionDotToken) -> Node;
```
## QuestionDotToken::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: QuestionDotToken) -> FunctionLikeDeclaration;
```
## QuestionDotToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: QuestionDotToken) -> int;
```
## QuestionDotToken::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: QuestionDotToken) -> int;
```
## QuestionDotToken::getIndex

```rust
pub fn getIndex(self: QuestionDotToken) -> int;
```
## QuestionDotToken::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: QuestionDotToken) -> *Node;
```
## QuestionDotToken::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *QuestionDotToken;
```
