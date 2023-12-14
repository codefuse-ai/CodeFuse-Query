# TemplateHeadToken

Inherit from [Token](./Token.md)

Primary key: `id: int`

```rust
schema TemplateHeadToken extends Token {
  @primary id: int,
}
```
## TemplateHeadToken::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: TemplateHeadToken) -> Location;
```
## TemplateHeadToken::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: TemplateHeadToken) -> Symbol;
```
## TemplateHeadToken::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: TemplateHeadToken) -> *Decorator;
```
## TemplateHeadToken::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: TemplateHeadToken) -> string;
```
## TemplateHeadToken::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: TemplateHeadToken, i: int) -> Modifier;
```
## TemplateHeadToken::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: TemplateHeadToken) -> *Comment;
```
## TemplateHeadToken::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: TemplateHeadToken) -> *Node;
```
## TemplateHeadToken::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: TemplateHeadToken) -> *Node;
```
## TemplateHeadToken::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: TemplateHeadToken) -> Node;
```
## TemplateHeadToken::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: TemplateHeadToken) -> int;
```
## TemplateHeadToken::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: TemplateHeadToken) -> TopLevelDO;
```
## TemplateHeadToken::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: TemplateHeadToken, i: int) -> Decorator;
```
## TemplateHeadToken::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: TemplateHeadToken) -> int;
```
## TemplateHeadToken::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: TemplateHeadToken) -> *Modifier;
```
## TemplateHeadToken::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: TemplateHeadToken) -> int;
```
## TemplateHeadToken::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: TemplateHeadToken, i: int) -> Node;
```
## TemplateHeadToken::getStartLineNumber

```rust
pub fn getStartLineNumber(self: TemplateHeadToken) -> int;
```
## TemplateHeadToken::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: TemplateHeadToken) -> *FunctionLikeDeclaration;
```
## TemplateHeadToken::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: TemplateHeadToken, level: int) -> *Node;
```
## TemplateHeadToken::getEndLineNumber

```rust
pub fn getEndLineNumber(self: TemplateHeadToken) -> int;
```
## TemplateHeadToken::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: TemplateHeadToken) -> string;
```
## TemplateHeadToken::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: TemplateHeadToken, level: int) -> Node;
```
## TemplateHeadToken::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: TemplateHeadToken) -> File;
```
## TemplateHeadToken::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: TemplateHeadToken) -> *Comment;
```
## TemplateHeadToken::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: TemplateHeadToken) -> *Comment;
```
## TemplateHeadToken::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: TemplateHeadToken) -> Node;
```
## TemplateHeadToken::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: TemplateHeadToken) -> FunctionLikeDeclaration;
```
## TemplateHeadToken::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: TemplateHeadToken) -> int;
```
## TemplateHeadToken::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: TemplateHeadToken) -> int;
```
## TemplateHeadToken::getIndex

```rust
pub fn getIndex(self: TemplateHeadToken) -> int;
```
## TemplateHeadToken::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: TemplateHeadToken) -> *Node;
```
## TemplateHeadToken::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *TemplateHeadToken;
```
