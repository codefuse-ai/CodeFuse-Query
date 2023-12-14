# TemplateTailToken

Primary key: `id: int`

```rust
schema TemplateTailToken {
  @primary id: int,
}
```
## TemplateTailToken::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: TemplateTailToken) -> Location;
```
## TemplateTailToken::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: TemplateTailToken) -> Symbol;
```
## TemplateTailToken::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: TemplateTailToken) -> *Decorator;
```
## TemplateTailToken::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: TemplateTailToken) -> string;
```
## TemplateTailToken::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: TemplateTailToken, i: int) -> Modifier;
```
## TemplateTailToken::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: TemplateTailToken) -> *Comment;
```
## TemplateTailToken::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: TemplateTailToken) -> *Node;
```
## TemplateTailToken::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: TemplateTailToken) -> *Node;
```
## TemplateTailToken::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: TemplateTailToken) -> Node;
```
## TemplateTailToken::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: TemplateTailToken) -> int;
```
## TemplateTailToken::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: TemplateTailToken) -> TopLevelDO;
```
## TemplateTailToken::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: TemplateTailToken, i: int) -> Decorator;
```
## TemplateTailToken::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: TemplateTailToken) -> int;
```
## TemplateTailToken::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: TemplateTailToken) -> *Modifier;
```
## TemplateTailToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: TemplateTailToken) -> int;
```
## TemplateTailToken::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: TemplateTailToken, i: int) -> Node;
```
## TemplateTailToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: TemplateTailToken) -> int;
```
## TemplateTailToken::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: TemplateTailToken) -> *FunctionLikeDeclaration;
```
## TemplateTailToken::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: TemplateTailToken, level: int) -> *Node;
```
## TemplateTailToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: TemplateTailToken) -> int;
```
## TemplateTailToken::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: TemplateTailToken) -> string;
```
## TemplateTailToken::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: TemplateTailToken, level: int) -> Node;
```
## TemplateTailToken::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: TemplateTailToken) -> File;
```
## TemplateTailToken::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: TemplateTailToken) -> *Comment;
```
## TemplateTailToken::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: TemplateTailToken) -> *Comment;
```
## TemplateTailToken::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: TemplateTailToken) -> Node;
```
## TemplateTailToken::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: TemplateTailToken) -> FunctionLikeDeclaration;
```
## TemplateTailToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: TemplateTailToken) -> int;
```
## TemplateTailToken::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: TemplateTailToken) -> int;
```
## TemplateTailToken::getIndex

```rust
pub fn getIndex(self: TemplateTailToken) -> int;
```
## TemplateTailToken::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: TemplateTailToken) -> *Node;
```
## TemplateTailToken::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *TemplateTailToken;
```
