# TemplateSpan

Inherit from [Node](./Node.md)

Primary key: `id: int`

```rust
schema TemplateSpan extends Node {
  @primary id: int,
}
```
## TemplateSpan::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: TemplateSpan) -> *Node;
```
## TemplateSpan::getIndex

```rust
pub fn getIndex(self: TemplateSpan) -> int;
```
## TemplateSpan::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: TemplateSpan) -> int;
```
## TemplateSpan::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: TemplateSpan) -> int;
```
## TemplateSpan::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: TemplateSpan) -> Node;
```
## TemplateSpan::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: TemplateSpan) -> FunctionLikeDeclaration;
```
## TemplateSpan::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: TemplateSpan) -> File;
```
## TemplateSpan::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: TemplateSpan, level: int) -> Node;
```
## TemplateSpan::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: TemplateSpan) -> Location;
```
## TemplateSpan::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: TemplateSpan) -> *FunctionLikeDeclaration;
```
## TemplateSpan::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: TemplateSpan, level: int) -> *Node;
```
## TemplateSpan::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: TemplateSpan) -> int;
```
## TemplateSpan::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: TemplateSpan) -> *Modifier;
```
## TemplateSpan::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: TemplateSpan) -> int;
```
## TemplateSpan::getStartLineNumber

```rust
pub fn getStartLineNumber(self: TemplateSpan) -> int;
```
## TemplateSpan::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: TemplateSpan, i: int) -> Node;
```
## TemplateSpan::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: TemplateSpan) -> int;
```
## TemplateSpan::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: TemplateSpan) -> TopLevelDO;
```
## TemplateSpan::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: TemplateSpan, i: int) -> Decorator;
```
## TemplateSpan::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: TemplateSpan) -> *Comment;
```
## TemplateSpan::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: TemplateSpan) -> *Comment;
```
## TemplateSpan::getParent

```rust
pub fn getParent(self: TemplateSpan) -> TemplateExpression;
```
## TemplateSpan::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: TemplateSpan) -> *Node;
```
## TemplateSpan::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: TemplateSpan) -> *Node;
```
## TemplateSpan::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: TemplateSpan) -> *Comment;
```
## TemplateSpan::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: TemplateSpan, i: int) -> Modifier;
```
## TemplateSpan::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: TemplateSpan) -> string;
```
## TemplateSpan::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: TemplateSpan) -> *Decorator;
```
## TemplateSpan::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: TemplateSpan) -> Symbol;
```
## TemplateSpan::getLiteral

```rust
pub fn getLiteral(self: TemplateSpan) -> Token;
```
## TemplateSpan::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *TemplateSpan;
```
## TemplateSpan::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: TemplateSpan) -> string;
```
## TemplateSpan::getEndLineNumber

```rust
pub fn getEndLineNumber(self: TemplateSpan) -> int;
```
## TemplateSpan::getExpression

```rust
pub fn getExpression(self: TemplateSpan) -> Expression;
```
