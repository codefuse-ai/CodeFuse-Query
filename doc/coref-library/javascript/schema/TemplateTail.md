# TemplateTail

Inherit from [TemplateLiteralLikeNode](./TemplateLiteralLikeNode.md)

Primary key: `id: int`

```rust
schema TemplateTail extends TemplateLiteralLikeNode {
  @primary id: int,
}
```
## TemplateTail::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: TemplateTail) -> Location;
```
## TemplateTail::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: TemplateTail) -> Symbol;
```
## TemplateTail::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: TemplateTail) -> *Decorator;
```
## TemplateTail::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: TemplateTail) -> string;
```
## TemplateTail::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: TemplateTail, i: int) -> Modifier;
```
## TemplateTail::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: TemplateTail) -> *Comment;
```
## TemplateTail::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: TemplateTail) -> *Node;
```
## TemplateTail::getValue

```java
/**
* Gets the value of this literal-like node, as a string.
*/
```
```rust
pub fn getValue(self: TemplateTail) -> string;
```
## TemplateTail::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: TemplateTail) -> *Node;
```
## TemplateTail::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: TemplateTail) -> Node;
```
## TemplateTail::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: TemplateTail) -> TopLevelDO;
```
## TemplateTail::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: TemplateTail, i: int) -> Decorator;
```
## TemplateTail::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: TemplateTail) -> int;
```
## TemplateTail::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: TemplateTail) -> int;
```
## TemplateTail::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: TemplateTail) -> int;
```
## TemplateTail::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: TemplateTail) -> *Modifier;
```
## TemplateTail::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: TemplateTail, i: int) -> Node;
```
## TemplateTail::getStartLineNumber

```rust
pub fn getStartLineNumber(self: TemplateTail) -> int;
```
## TemplateTail::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: TemplateTail) -> *FunctionLikeDeclaration;
```
## TemplateTail::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: TemplateTail, level: int) -> *Node;
```
## TemplateTail::getEndLineNumber

```rust
pub fn getEndLineNumber(self: TemplateTail) -> int;
```
## TemplateTail::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: TemplateTail) -> string;
```
## TemplateTail::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: TemplateTail, level: int) -> Node;
```
## TemplateTail::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: TemplateTail) -> File;
```
## TemplateTail::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: TemplateTail) -> *Comment;
```
## TemplateTail::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: TemplateTail) -> *Comment;
```
## TemplateTail::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: TemplateTail) -> Node;
```
## TemplateTail::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: TemplateTail) -> FunctionLikeDeclaration;
```
## TemplateTail::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: TemplateTail) -> int;
```
## TemplateTail::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: TemplateTail) -> int;
```
## TemplateTail::getIndex

```rust
pub fn getIndex(self: TemplateTail) -> int;
```
## TemplateTail::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: TemplateTail) -> *Node;
```
## TemplateTail::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *TemplateTail;
```
