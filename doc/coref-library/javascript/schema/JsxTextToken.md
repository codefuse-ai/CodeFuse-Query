# JsxTextToken

Inherit from [Token](./Token.md)

Primary key: `id: int`

```rust
schema JsxTextToken extends Token {
  @primary id: int
}
```
## JsxTextToken::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: JsxTextToken) -> Location;
```
## JsxTextToken::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: JsxTextToken) -> Symbol;
```
## JsxTextToken::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: JsxTextToken) -> *Decorator;
```
## JsxTextToken::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: JsxTextToken) -> string;
```
## JsxTextToken::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: JsxTextToken, i: int) -> Modifier;
```
## JsxTextToken::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: JsxTextToken) -> *Comment;
```
## JsxTextToken::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: JsxTextToken) -> *Node;
```
## JsxTextToken::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: JsxTextToken) -> *Node;
```
## JsxTextToken::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: JsxTextToken) -> Node;
```
## JsxTextToken::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: JsxTextToken) -> int;
```
## JsxTextToken::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: JsxTextToken) -> TopLevelDO;
```
## JsxTextToken::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: JsxTextToken, i: int) -> Decorator;
```
## JsxTextToken::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: JsxTextToken) -> int;
```
## JsxTextToken::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: JsxTextToken) -> *Modifier;
```
## JsxTextToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: JsxTextToken) -> int;
```
## JsxTextToken::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: JsxTextToken, i: int) -> Node;
```
## JsxTextToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: JsxTextToken) -> int;
```
## JsxTextToken::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: JsxTextToken) -> *FunctionLikeDeclaration;
```
## JsxTextToken::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: JsxTextToken, level: int) -> *Node;
```
## JsxTextToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: JsxTextToken) -> int;
```
## JsxTextToken::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: JsxTextToken) -> string;
```
## JsxTextToken::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: JsxTextToken, level: int) -> Node;
```
## JsxTextToken::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: JsxTextToken) -> File;
```
## JsxTextToken::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: JsxTextToken) -> *Comment;
```
## JsxTextToken::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: JsxTextToken) -> *Comment;
```
## JsxTextToken::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: JsxTextToken) -> Node;
```
## JsxTextToken::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: JsxTextToken) -> FunctionLikeDeclaration;
```
## JsxTextToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: JsxTextToken) -> int;
```
## JsxTextToken::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: JsxTextToken) -> int;
```
## JsxTextToken::getIndex

```rust
pub fn getIndex(self: JsxTextToken) -> int;
```
## JsxTextToken::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: JsxTextToken) -> *Node;
```
## JsxTextToken::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *JsxTextToken;
```
