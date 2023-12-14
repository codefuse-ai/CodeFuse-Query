# TemplateLiteralTypeSpan

Inherit from [TypeNode](./TypeNode.md)

Primary key: `id: int`

```rust
schema TemplateLiteralTypeSpan extends TypeNode {
  @primary id: int,
}
```
## TemplateLiteralTypeSpan::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: TemplateLiteralTypeSpan) -> Location;
```
## TemplateLiteralTypeSpan::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: TemplateLiteralTypeSpan) -> Symbol;
```
## TemplateLiteralTypeSpan::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: TemplateLiteralTypeSpan) -> *Decorator;
```
## TemplateLiteralTypeSpan::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: TemplateLiteralTypeSpan) -> string;
```
## TemplateLiteralTypeSpan::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: TemplateLiteralTypeSpan, i: int) -> Modifier;
```
## TemplateLiteralTypeSpan::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: TemplateLiteralTypeSpan) -> *Comment;
```
## TemplateLiteralTypeSpan::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: TemplateLiteralTypeSpan) -> *Node;
```
## TemplateLiteralTypeSpan::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: TemplateLiteralTypeSpan) -> *Node;
```
## TemplateLiteralTypeSpan::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: TemplateLiteralTypeSpan) -> Node;
```
## TemplateLiteralTypeSpan::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: TemplateLiteralTypeSpan) -> int;
```
## TemplateLiteralTypeSpan::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: TemplateLiteralTypeSpan) -> TopLevelDO;
```
## TemplateLiteralTypeSpan::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: TemplateLiteralTypeSpan, i: int) -> Decorator;
```
## TemplateLiteralTypeSpan::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: TemplateLiteralTypeSpan) -> int;
```
## TemplateLiteralTypeSpan::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: TemplateLiteralTypeSpan) -> *Modifier;
```
## TemplateLiteralTypeSpan::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: TemplateLiteralTypeSpan) -> int;
```
## TemplateLiteralTypeSpan::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: TemplateLiteralTypeSpan, i: int) -> Node;
```
## TemplateLiteralTypeSpan::getStartLineNumber

```rust
pub fn getStartLineNumber(self: TemplateLiteralTypeSpan) -> int;
```
## TemplateLiteralTypeSpan::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: TemplateLiteralTypeSpan) -> *FunctionLikeDeclaration;
```
## TemplateLiteralTypeSpan::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: TemplateLiteralTypeSpan, level: int) -> *Node;
```
## TemplateLiteralTypeSpan::getEndLineNumber

```rust
pub fn getEndLineNumber(self: TemplateLiteralTypeSpan) -> int;
```
## TemplateLiteralTypeSpan::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: TemplateLiteralTypeSpan) -> string;
```
## TemplateLiteralTypeSpan::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: TemplateLiteralTypeSpan, level: int) -> Node;
```
## TemplateLiteralTypeSpan::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: TemplateLiteralTypeSpan) -> File;
```
## TemplateLiteralTypeSpan::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: TemplateLiteralTypeSpan) -> *Comment;
```
## TemplateLiteralTypeSpan::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: TemplateLiteralTypeSpan) -> *Comment;
```
## TemplateLiteralTypeSpan::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: TemplateLiteralTypeSpan) -> Node;
```
## TemplateLiteralTypeSpan::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: TemplateLiteralTypeSpan) -> FunctionLikeDeclaration;
```
## TemplateLiteralTypeSpan::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: TemplateLiteralTypeSpan) -> int;
```
## TemplateLiteralTypeSpan::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: TemplateLiteralTypeSpan) -> int;
```
## TemplateLiteralTypeSpan::getIndex

```rust
pub fn getIndex(self: TemplateLiteralTypeSpan) -> int;
```
## TemplateLiteralTypeSpan::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: TemplateLiteralTypeSpan) -> *Node;
```
## TemplateLiteralTypeSpan::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *TemplateLiteralTypeSpan;
```
