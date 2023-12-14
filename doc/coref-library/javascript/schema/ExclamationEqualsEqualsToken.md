# ExclamationEqualsEqualsToken

Inherit from [Token](./Token.md)

Primary key: `id: int`

```rust
schema ExclamationEqualsEqualsToken extends Token {
  @primary id: int,
}
```
## ExclamationEqualsEqualsToken::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: ExclamationEqualsEqualsToken) -> Location;
```
## ExclamationEqualsEqualsToken::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: ExclamationEqualsEqualsToken) -> Symbol;
```
## ExclamationEqualsEqualsToken::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: ExclamationEqualsEqualsToken) -> *Decorator;
```
## ExclamationEqualsEqualsToken::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: ExclamationEqualsEqualsToken) -> string;
```
## ExclamationEqualsEqualsToken::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: ExclamationEqualsEqualsToken, i: int) -> Modifier;
```
## ExclamationEqualsEqualsToken::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: ExclamationEqualsEqualsToken) -> *Comment;
```
## ExclamationEqualsEqualsToken::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: ExclamationEqualsEqualsToken) -> *Node;
```
## ExclamationEqualsEqualsToken::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: ExclamationEqualsEqualsToken) -> *Node;
```
## ExclamationEqualsEqualsToken::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: ExclamationEqualsEqualsToken) -> Node;
```
## ExclamationEqualsEqualsToken::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: ExclamationEqualsEqualsToken) -> int;
```
## ExclamationEqualsEqualsToken::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: ExclamationEqualsEqualsToken) -> TopLevelDO;
```
## ExclamationEqualsEqualsToken::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: ExclamationEqualsEqualsToken, i: int) -> Decorator;
```
## ExclamationEqualsEqualsToken::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: ExclamationEqualsEqualsToken) -> int;
```
## ExclamationEqualsEqualsToken::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: ExclamationEqualsEqualsToken) -> *Modifier;
```
## ExclamationEqualsEqualsToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ExclamationEqualsEqualsToken) -> int;
```
## ExclamationEqualsEqualsToken::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: ExclamationEqualsEqualsToken, i: int) -> Node;
```
## ExclamationEqualsEqualsToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ExclamationEqualsEqualsToken) -> int;
```
## ExclamationEqualsEqualsToken::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ExclamationEqualsEqualsToken) -> *FunctionLikeDeclaration;
```
## ExclamationEqualsEqualsToken::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: ExclamationEqualsEqualsToken, level: int) -> *Node;
```
## ExclamationEqualsEqualsToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ExclamationEqualsEqualsToken) -> int;
```
## ExclamationEqualsEqualsToken::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: ExclamationEqualsEqualsToken) -> string;
```
## ExclamationEqualsEqualsToken::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: ExclamationEqualsEqualsToken, level: int) -> Node;
```
## ExclamationEqualsEqualsToken::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: ExclamationEqualsEqualsToken) -> File;
```
## ExclamationEqualsEqualsToken::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: ExclamationEqualsEqualsToken) -> *Comment;
```
## ExclamationEqualsEqualsToken::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: ExclamationEqualsEqualsToken) -> *Comment;
```
## ExclamationEqualsEqualsToken::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: ExclamationEqualsEqualsToken) -> Node;
```
## ExclamationEqualsEqualsToken::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: ExclamationEqualsEqualsToken) -> FunctionLikeDeclaration;
```
## ExclamationEqualsEqualsToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ExclamationEqualsEqualsToken) -> int;
```
## ExclamationEqualsEqualsToken::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: ExclamationEqualsEqualsToken) -> int;
```
## ExclamationEqualsEqualsToken::getIndex

```rust
pub fn getIndex(self: ExclamationEqualsEqualsToken) -> int;
```
## ExclamationEqualsEqualsToken::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: ExclamationEqualsEqualsToken) -> *Node;
```
## ExclamationEqualsEqualsToken::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *ExclamationEqualsEqualsToken;
```
