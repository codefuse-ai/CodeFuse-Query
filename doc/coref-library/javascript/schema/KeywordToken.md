# KeywordToken

Primary key: `id: int`

```rust
schema KeywordToken {
  @primary id: int,
}
```
## KeywordToken::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: KeywordToken) -> Location;
```
## KeywordToken::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: KeywordToken) -> Symbol;
```
## KeywordToken::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: KeywordToken) -> *Decorator;
```
## KeywordToken::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: KeywordToken) -> string;
```
## KeywordToken::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: KeywordToken, i: int) -> Modifier;
```
## KeywordToken::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: KeywordToken) -> *Comment;
```
## KeywordToken::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: KeywordToken) -> *Node;
```
## KeywordToken::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: KeywordToken) -> *Node;
```
## KeywordToken::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: KeywordToken) -> Node;
```
## KeywordToken::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: KeywordToken) -> int;
```
## KeywordToken::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: KeywordToken) -> TopLevelDO;
```
## KeywordToken::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: KeywordToken, i: int) -> Decorator;
```
## KeywordToken::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: KeywordToken) -> int;
```
## KeywordToken::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: KeywordToken) -> *Modifier;
```
## KeywordToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: KeywordToken) -> int;
```
## KeywordToken::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: KeywordToken, i: int) -> Node;
```
## KeywordToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: KeywordToken) -> int;
```
## KeywordToken::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: KeywordToken) -> *FunctionLikeDeclaration;
```
## KeywordToken::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: KeywordToken, level: int) -> *Node;
```
## KeywordToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: KeywordToken) -> int;
```
## KeywordToken::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: KeywordToken) -> string;
```
## KeywordToken::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: KeywordToken, level: int) -> Node;
```
## KeywordToken::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: KeywordToken) -> File;
```
## KeywordToken::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: KeywordToken) -> *Comment;
```
## KeywordToken::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: KeywordToken) -> *Comment;
```
## KeywordToken::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: KeywordToken) -> Node;
```
## KeywordToken::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: KeywordToken) -> FunctionLikeDeclaration;
```
## KeywordToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: KeywordToken) -> int;
```
## KeywordToken::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: KeywordToken) -> int;
```
## KeywordToken::getIndex

```rust
pub fn getIndex(self: KeywordToken) -> int;
```
## KeywordToken::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: KeywordToken) -> *Node;
```
## KeywordToken::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *KeywordToken;
```
