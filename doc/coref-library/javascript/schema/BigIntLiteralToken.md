# BigIntLiteralToken

Inherit from [Token](./Token.md)

Primary key: `id: int`

```rust
schema BigIntLiteralToken extends Token {
  @primary id: int,
}
```
## BigIntLiteralToken::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: BigIntLiteralToken) -> Location;
```
## BigIntLiteralToken::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: BigIntLiteralToken) -> Symbol;
```
## BigIntLiteralToken::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: BigIntLiteralToken) -> *Decorator;
```
## BigIntLiteralToken::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: BigIntLiteralToken) -> string;
```
## BigIntLiteralToken::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: BigIntLiteralToken, i: int) -> Modifier;
```
## BigIntLiteralToken::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: BigIntLiteralToken) -> *Comment;
```
## BigIntLiteralToken::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: BigIntLiteralToken) -> *Node;
```
## BigIntLiteralToken::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: BigIntLiteralToken) -> *Node;
```
## BigIntLiteralToken::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: BigIntLiteralToken) -> Node;
```
## BigIntLiteralToken::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: BigIntLiteralToken) -> int;
```
## BigIntLiteralToken::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: BigIntLiteralToken) -> TopLevelDO;
```
## BigIntLiteralToken::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: BigIntLiteralToken, i: int) -> Decorator;
```
## BigIntLiteralToken::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: BigIntLiteralToken) -> int;
```
## BigIntLiteralToken::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: BigIntLiteralToken) -> *Modifier;
```
## BigIntLiteralToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: BigIntLiteralToken) -> int;
```
## BigIntLiteralToken::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: BigIntLiteralToken, i: int) -> Node;
```
## BigIntLiteralToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: BigIntLiteralToken) -> int;
```
## BigIntLiteralToken::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: BigIntLiteralToken) -> *FunctionLikeDeclaration;
```
## BigIntLiteralToken::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: BigIntLiteralToken, level: int) -> *Node;
```
## BigIntLiteralToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: BigIntLiteralToken) -> int;
```
## BigIntLiteralToken::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: BigIntLiteralToken) -> string;
```
## BigIntLiteralToken::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: BigIntLiteralToken, level: int) -> Node;
```
## BigIntLiteralToken::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: BigIntLiteralToken) -> File;
```
## BigIntLiteralToken::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: BigIntLiteralToken) -> *Comment;
```
## BigIntLiteralToken::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: BigIntLiteralToken) -> *Comment;
```
## BigIntLiteralToken::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: BigIntLiteralToken) -> Node;
```
## BigIntLiteralToken::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: BigIntLiteralToken) -> FunctionLikeDeclaration;
```
## BigIntLiteralToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: BigIntLiteralToken) -> int;
```
## BigIntLiteralToken::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: BigIntLiteralToken) -> int;
```
## BigIntLiteralToken::getIndex

```rust
pub fn getIndex(self: BigIntLiteralToken) -> int;
```
## BigIntLiteralToken::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: BigIntLiteralToken) -> *Node;
```
## BigIntLiteralToken::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *BigIntLiteralToken;
```
