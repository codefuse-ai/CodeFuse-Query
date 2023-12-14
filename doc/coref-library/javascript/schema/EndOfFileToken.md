# EndOfFileToken

Primary key: `id: int`

```rust
schema EndOfFileToken {
  @primary id: int,
}
```
## EndOfFileToken::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: EndOfFileToken) -> Location;
```
## EndOfFileToken::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: EndOfFileToken) -> Symbol;
```
## EndOfFileToken::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: EndOfFileToken) -> *Decorator;
```
## EndOfFileToken::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: EndOfFileToken) -> string;
```
## EndOfFileToken::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: EndOfFileToken, i: int) -> Modifier;
```
## EndOfFileToken::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: EndOfFileToken) -> *Comment;
```
## EndOfFileToken::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: EndOfFileToken) -> *Node;
```
## EndOfFileToken::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: EndOfFileToken) -> *Node;
```
## EndOfFileToken::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: EndOfFileToken) -> Node;
```
## EndOfFileToken::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: EndOfFileToken) -> int;
```
## EndOfFileToken::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: EndOfFileToken) -> TopLevelDO;
```
## EndOfFileToken::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: EndOfFileToken, i: int) -> Decorator;
```
## EndOfFileToken::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: EndOfFileToken) -> int;
```
## EndOfFileToken::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: EndOfFileToken) -> *Modifier;
```
## EndOfFileToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: EndOfFileToken) -> int;
```
## EndOfFileToken::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: EndOfFileToken, i: int) -> Node;
```
## EndOfFileToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: EndOfFileToken) -> int;
```
## EndOfFileToken::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: EndOfFileToken) -> *FunctionLikeDeclaration;
```
## EndOfFileToken::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: EndOfFileToken, level: int) -> *Node;
```
## EndOfFileToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: EndOfFileToken) -> int;
```
## EndOfFileToken::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: EndOfFileToken) -> string;
```
## EndOfFileToken::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: EndOfFileToken, level: int) -> Node;
```
## EndOfFileToken::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: EndOfFileToken) -> File;
```
## EndOfFileToken::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: EndOfFileToken) -> *Comment;
```
## EndOfFileToken::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: EndOfFileToken) -> *Comment;
```
## EndOfFileToken::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: EndOfFileToken) -> Node;
```
## EndOfFileToken::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: EndOfFileToken) -> FunctionLikeDeclaration;
```
## EndOfFileToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: EndOfFileToken) -> int;
```
## EndOfFileToken::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: EndOfFileToken) -> int;
```
## EndOfFileToken::getIndex

```rust
pub fn getIndex(self: EndOfFileToken) -> int;
```
## EndOfFileToken::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: EndOfFileToken) -> *Node;
```
## EndOfFileToken::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *EndOfFileToken;
```
