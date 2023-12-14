# ExclamationEqualsToken

Primary key: `id: int`

```rust
schema ExclamationEqualsToken {
  @primary id: int,
}
```
## ExclamationEqualsToken::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: ExclamationEqualsToken) -> Location;
```
## ExclamationEqualsToken::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: ExclamationEqualsToken) -> Symbol;
```
## ExclamationEqualsToken::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: ExclamationEqualsToken) -> *Decorator;
```
## ExclamationEqualsToken::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: ExclamationEqualsToken) -> string;
```
## ExclamationEqualsToken::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: ExclamationEqualsToken, i: int) -> Modifier;
```
## ExclamationEqualsToken::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: ExclamationEqualsToken) -> *Comment;
```
## ExclamationEqualsToken::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: ExclamationEqualsToken) -> *Node;
```
## ExclamationEqualsToken::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: ExclamationEqualsToken) -> *Node;
```
## ExclamationEqualsToken::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: ExclamationEqualsToken) -> Node;
```
## ExclamationEqualsToken::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: ExclamationEqualsToken) -> int;
```
## ExclamationEqualsToken::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: ExclamationEqualsToken) -> TopLevelDO;
```
## ExclamationEqualsToken::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: ExclamationEqualsToken, i: int) -> Decorator;
```
## ExclamationEqualsToken::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: ExclamationEqualsToken) -> int;
```
## ExclamationEqualsToken::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: ExclamationEqualsToken) -> *Modifier;
```
## ExclamationEqualsToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ExclamationEqualsToken) -> int;
```
## ExclamationEqualsToken::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: ExclamationEqualsToken, i: int) -> Node;
```
## ExclamationEqualsToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ExclamationEqualsToken) -> int;
```
## ExclamationEqualsToken::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ExclamationEqualsToken) -> *FunctionLikeDeclaration;
```
## ExclamationEqualsToken::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: ExclamationEqualsToken, level: int) -> *Node;
```
## ExclamationEqualsToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ExclamationEqualsToken) -> int;
```
## ExclamationEqualsToken::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: ExclamationEqualsToken) -> string;
```
## ExclamationEqualsToken::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: ExclamationEqualsToken, level: int) -> Node;
```
## ExclamationEqualsToken::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: ExclamationEqualsToken) -> File;
```
## ExclamationEqualsToken::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: ExclamationEqualsToken) -> *Comment;
```
## ExclamationEqualsToken::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: ExclamationEqualsToken) -> *Comment;
```
## ExclamationEqualsToken::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: ExclamationEqualsToken) -> Node;
```
## ExclamationEqualsToken::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: ExclamationEqualsToken) -> FunctionLikeDeclaration;
```
## ExclamationEqualsToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ExclamationEqualsToken) -> int;
```
## ExclamationEqualsToken::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: ExclamationEqualsToken) -> int;
```
## ExclamationEqualsToken::getIndex

```rust
pub fn getIndex(self: ExclamationEqualsToken) -> int;
```
## ExclamationEqualsToken::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: ExclamationEqualsToken) -> *Node;
```
## ExclamationEqualsToken::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *ExclamationEqualsToken;
```
