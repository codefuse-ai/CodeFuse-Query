# ExclamationToken

Inherit from [Token](./Token.md)

Primary key: `id: int`

```rust
schema ExclamationToken extends Token {
  @primary id: int,
}
```
## ExclamationToken::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: ExclamationToken) -> Location;
```
## ExclamationToken::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: ExclamationToken) -> Symbol;
```
## ExclamationToken::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: ExclamationToken) -> *Decorator;
```
## ExclamationToken::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: ExclamationToken) -> string;
```
## ExclamationToken::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: ExclamationToken, i: int) -> Modifier;
```
## ExclamationToken::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: ExclamationToken) -> *Comment;
```
## ExclamationToken::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: ExclamationToken) -> *Node;
```
## ExclamationToken::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: ExclamationToken) -> *Node;
```
## ExclamationToken::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: ExclamationToken) -> Node;
```
## ExclamationToken::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: ExclamationToken) -> int;
```
## ExclamationToken::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: ExclamationToken) -> TopLevelDO;
```
## ExclamationToken::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: ExclamationToken, i: int) -> Decorator;
```
## ExclamationToken::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: ExclamationToken) -> int;
```
## ExclamationToken::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: ExclamationToken) -> *Modifier;
```
## ExclamationToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ExclamationToken) -> int;
```
## ExclamationToken::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: ExclamationToken, i: int) -> Node;
```
## ExclamationToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ExclamationToken) -> int;
```
## ExclamationToken::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ExclamationToken) -> *FunctionLikeDeclaration;
```
## ExclamationToken::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: ExclamationToken, level: int) -> *Node;
```
## ExclamationToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ExclamationToken) -> int;
```
## ExclamationToken::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: ExclamationToken) -> string;
```
## ExclamationToken::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: ExclamationToken, level: int) -> Node;
```
## ExclamationToken::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: ExclamationToken) -> File;
```
## ExclamationToken::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: ExclamationToken) -> *Comment;
```
## ExclamationToken::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: ExclamationToken) -> *Comment;
```
## ExclamationToken::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: ExclamationToken) -> Node;
```
## ExclamationToken::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: ExclamationToken) -> FunctionLikeDeclaration;
```
## ExclamationToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ExclamationToken) -> int;
```
## ExclamationToken::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: ExclamationToken) -> int;
```
## ExclamationToken::getIndex

```rust
pub fn getIndex(self: ExclamationToken) -> int;
```
## ExclamationToken::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: ExclamationToken) -> *Node;
```
## ExclamationToken::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *ExclamationToken;
```
