# TemplateMiddle

Inherit from [TemplateLiteralLikeNode](./TemplateLiteralLikeNode.md)

Primary key: `id: int`

```rust
schema TemplateMiddle extends TemplateLiteralLikeNode {
  @primary id: int,
}
```
## TemplateMiddle::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: TemplateMiddle) -> Location;
```
## TemplateMiddle::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: TemplateMiddle) -> Symbol;
```
## TemplateMiddle::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: TemplateMiddle) -> *Decorator;
```
## TemplateMiddle::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: TemplateMiddle) -> string;
```
## TemplateMiddle::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: TemplateMiddle, i: int) -> Modifier;
```
## TemplateMiddle::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: TemplateMiddle) -> *Comment;
```
## TemplateMiddle::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: TemplateMiddle) -> *Node;
```
## TemplateMiddle::getValue

```java
/**
* Gets the value of this literal-like node, as a string.
*/
```
```rust
pub fn getValue(self: TemplateMiddle) -> string;
```
## TemplateMiddle::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: TemplateMiddle) -> *Node;
```
## TemplateMiddle::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: TemplateMiddle) -> Node;
```
## TemplateMiddle::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: TemplateMiddle) -> TopLevelDO;
```
## TemplateMiddle::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: TemplateMiddle, i: int) -> Decorator;
```
## TemplateMiddle::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: TemplateMiddle) -> int;
```
## TemplateMiddle::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: TemplateMiddle) -> int;
```
## TemplateMiddle::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: TemplateMiddle) -> int;
```
## TemplateMiddle::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: TemplateMiddle) -> *Modifier;
```
## TemplateMiddle::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: TemplateMiddle, i: int) -> Node;
```
## TemplateMiddle::getStartLineNumber

```rust
pub fn getStartLineNumber(self: TemplateMiddle) -> int;
```
## TemplateMiddle::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: TemplateMiddle) -> *FunctionLikeDeclaration;
```
## TemplateMiddle::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: TemplateMiddle, level: int) -> *Node;
```
## TemplateMiddle::getEndLineNumber

```rust
pub fn getEndLineNumber(self: TemplateMiddle) -> int;
```
## TemplateMiddle::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: TemplateMiddle) -> string;
```
## TemplateMiddle::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: TemplateMiddle, level: int) -> Node;
```
## TemplateMiddle::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: TemplateMiddle) -> File;
```
## TemplateMiddle::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: TemplateMiddle) -> *Comment;
```
## TemplateMiddle::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: TemplateMiddle) -> *Comment;
```
## TemplateMiddle::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: TemplateMiddle) -> Node;
```
## TemplateMiddle::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: TemplateMiddle) -> FunctionLikeDeclaration;
```
## TemplateMiddle::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: TemplateMiddle) -> int;
```
## TemplateMiddle::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: TemplateMiddle) -> int;
```
## TemplateMiddle::getIndex

```rust
pub fn getIndex(self: TemplateMiddle) -> int;
```
## TemplateMiddle::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: TemplateMiddle) -> *Node;
```
## TemplateMiddle::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *TemplateMiddle;
```
