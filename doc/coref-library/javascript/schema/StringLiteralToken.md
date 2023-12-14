# StringLiteralToken

Primary key: `id: int`

```rust
schema StringLiteralToken {
  @primary id: int,
}
```
## StringLiteralToken::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: StringLiteralToken) -> Location;
```
## StringLiteralToken::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: StringLiteralToken) -> Symbol;
```
## StringLiteralToken::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: StringLiteralToken) -> *Decorator;
```
## StringLiteralToken::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: StringLiteralToken) -> string;
```
## StringLiteralToken::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: StringLiteralToken, i: int) -> Modifier;
```
## StringLiteralToken::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: StringLiteralToken) -> *Comment;
```
## StringLiteralToken::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: StringLiteralToken) -> *Node;
```
## StringLiteralToken::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: StringLiteralToken) -> *Node;
```
## StringLiteralToken::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: StringLiteralToken) -> Node;
```
## StringLiteralToken::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: StringLiteralToken) -> int;
```
## StringLiteralToken::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: StringLiteralToken) -> TopLevelDO;
```
## StringLiteralToken::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: StringLiteralToken, i: int) -> Decorator;
```
## StringLiteralToken::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: StringLiteralToken) -> int;
```
## StringLiteralToken::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: StringLiteralToken) -> *Modifier;
```
## StringLiteralToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: StringLiteralToken) -> int;
```
## StringLiteralToken::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: StringLiteralToken, i: int) -> Node;
```
## StringLiteralToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: StringLiteralToken) -> int;
```
## StringLiteralToken::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: StringLiteralToken) -> *FunctionLikeDeclaration;
```
## StringLiteralToken::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: StringLiteralToken, level: int) -> *Node;
```
## StringLiteralToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: StringLiteralToken) -> int;
```
## StringLiteralToken::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: StringLiteralToken) -> string;
```
## StringLiteralToken::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: StringLiteralToken, level: int) -> Node;
```
## StringLiteralToken::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: StringLiteralToken) -> File;
```
## StringLiteralToken::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: StringLiteralToken) -> *Comment;
```
## StringLiteralToken::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: StringLiteralToken) -> *Comment;
```
## StringLiteralToken::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: StringLiteralToken) -> Node;
```
## StringLiteralToken::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: StringLiteralToken) -> FunctionLikeDeclaration;
```
## StringLiteralToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: StringLiteralToken) -> int;
```
## StringLiteralToken::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: StringLiteralToken) -> int;
```
## StringLiteralToken::getIndex

```rust
pub fn getIndex(self: StringLiteralToken) -> int;
```
## StringLiteralToken::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: StringLiteralToken) -> *Node;
```
## StringLiteralToken::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *StringLiteralToken;
```
