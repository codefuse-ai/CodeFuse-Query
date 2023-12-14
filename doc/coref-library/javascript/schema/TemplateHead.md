# TemplateHead

Inherit from [TemplateLiteralLikeNode](./TemplateLiteralLikeNode.md)

Primary key: `id: int`

```rust
schema TemplateHead extends TemplateLiteralLikeNode {
  @primary id: int,
}
```
## TemplateHead::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: TemplateHead) -> Location;
```
## TemplateHead::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: TemplateHead) -> Symbol;
```
## TemplateHead::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: TemplateHead) -> *Decorator;
```
## TemplateHead::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: TemplateHead) -> string;
```
## TemplateHead::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: TemplateHead, i: int) -> Modifier;
```
## TemplateHead::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: TemplateHead) -> *Comment;
```
## TemplateHead::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: TemplateHead) -> *Node;
```
## TemplateHead::getValue

```java
/**
* Gets the value of this literal-like node, as a string.
*/
```
```rust
pub fn getValue(self: TemplateHead) -> string;
```
## TemplateHead::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: TemplateHead) -> *Node;
```
## TemplateHead::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: TemplateHead) -> Node;
```
## TemplateHead::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: TemplateHead) -> TopLevelDO;
```
## TemplateHead::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: TemplateHead, i: int) -> Decorator;
```
## TemplateHead::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: TemplateHead) -> int;
```
## TemplateHead::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: TemplateHead) -> int;
```
## TemplateHead::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: TemplateHead) -> int;
```
## TemplateHead::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: TemplateHead) -> *Modifier;
```
## TemplateHead::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: TemplateHead, i: int) -> Node;
```
## TemplateHead::getStartLineNumber

```rust
pub fn getStartLineNumber(self: TemplateHead) -> int;
```
## TemplateHead::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: TemplateHead) -> *FunctionLikeDeclaration;
```
## TemplateHead::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: TemplateHead, level: int) -> *Node;
```
## TemplateHead::getEndLineNumber

```rust
pub fn getEndLineNumber(self: TemplateHead) -> int;
```
## TemplateHead::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: TemplateHead) -> string;
```
## TemplateHead::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: TemplateHead, level: int) -> Node;
```
## TemplateHead::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: TemplateHead) -> File;
```
## TemplateHead::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: TemplateHead) -> *Comment;
```
## TemplateHead::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: TemplateHead) -> *Comment;
```
## TemplateHead::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: TemplateHead) -> Node;
```
## TemplateHead::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: TemplateHead) -> FunctionLikeDeclaration;
```
## TemplateHead::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: TemplateHead) -> int;
```
## TemplateHead::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: TemplateHead) -> int;
```
## TemplateHead::getIndex

```rust
pub fn getIndex(self: TemplateHead) -> int;
```
## TemplateHead::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: TemplateHead) -> *Node;
```
## TemplateHead::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *TemplateHead;
```
