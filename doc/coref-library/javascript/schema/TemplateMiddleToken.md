# TemplateMiddleToken

Primary key: `id: int`

```rust
schema TemplateMiddleToken {
  @primary id: int,
}
```
## TemplateMiddleToken::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: TemplateMiddleToken) -> Location;
```
## TemplateMiddleToken::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: TemplateMiddleToken) -> Symbol;
```
## TemplateMiddleToken::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: TemplateMiddleToken) -> *Decorator;
```
## TemplateMiddleToken::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: TemplateMiddleToken) -> string;
```
## TemplateMiddleToken::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: TemplateMiddleToken, i: int) -> Modifier;
```
## TemplateMiddleToken::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: TemplateMiddleToken) -> *Comment;
```
## TemplateMiddleToken::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: TemplateMiddleToken) -> *Node;
```
## TemplateMiddleToken::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: TemplateMiddleToken) -> *Node;
```
## TemplateMiddleToken::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: TemplateMiddleToken) -> Node;
```
## TemplateMiddleToken::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: TemplateMiddleToken) -> int;
```
## TemplateMiddleToken::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: TemplateMiddleToken) -> TopLevelDO;
```
## TemplateMiddleToken::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: TemplateMiddleToken, i: int) -> Decorator;
```
## TemplateMiddleToken::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: TemplateMiddleToken) -> int;
```
## TemplateMiddleToken::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: TemplateMiddleToken) -> *Modifier;
```
## TemplateMiddleToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: TemplateMiddleToken) -> int;
```
## TemplateMiddleToken::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: TemplateMiddleToken, i: int) -> Node;
```
## TemplateMiddleToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: TemplateMiddleToken) -> int;
```
## TemplateMiddleToken::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: TemplateMiddleToken) -> *FunctionLikeDeclaration;
```
## TemplateMiddleToken::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: TemplateMiddleToken, level: int) -> *Node;
```
## TemplateMiddleToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: TemplateMiddleToken) -> int;
```
## TemplateMiddleToken::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: TemplateMiddleToken) -> string;
```
## TemplateMiddleToken::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: TemplateMiddleToken, level: int) -> Node;
```
## TemplateMiddleToken::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: TemplateMiddleToken) -> File;
```
## TemplateMiddleToken::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: TemplateMiddleToken) -> *Comment;
```
## TemplateMiddleToken::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: TemplateMiddleToken) -> *Comment;
```
## TemplateMiddleToken::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: TemplateMiddleToken) -> Node;
```
## TemplateMiddleToken::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: TemplateMiddleToken) -> FunctionLikeDeclaration;
```
## TemplateMiddleToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: TemplateMiddleToken) -> int;
```
## TemplateMiddleToken::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: TemplateMiddleToken) -> int;
```
## TemplateMiddleToken::getIndex

```rust
pub fn getIndex(self: TemplateMiddleToken) -> int;
```
## TemplateMiddleToken::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: TemplateMiddleToken) -> *Node;
```
## TemplateMiddleToken::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *TemplateMiddleToken;
```
