# SemicolonClassElement

Inherit from [ClassElement](./ClassElement.md)

Primary key: `id: int`

```rust
schema SemicolonClassElement extends ClassElement {
  @primary id: int
}
```
## SemicolonClassElement::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: SemicolonClassElement) -> Location;
```
## SemicolonClassElement::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: SemicolonClassElement) -> Symbol;
```
## SemicolonClassElement::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: SemicolonClassElement) -> *Decorator;
```
## SemicolonClassElement::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: SemicolonClassElement) -> string;
```
## SemicolonClassElement::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: SemicolonClassElement, i: int) -> Modifier;
```
## SemicolonClassElement::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: SemicolonClassElement) -> *Comment;
```
## SemicolonClassElement::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: SemicolonClassElement) -> *Node;
```
## SemicolonClassElement::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: SemicolonClassElement) -> *Node;
```
## SemicolonClassElement::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: SemicolonClassElement) -> Node;
```
## SemicolonClassElement::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: SemicolonClassElement) -> int;
```
## SemicolonClassElement::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: SemicolonClassElement) -> TopLevelDO;
```
## SemicolonClassElement::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: SemicolonClassElement, i: int) -> Decorator;
```
## SemicolonClassElement::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: SemicolonClassElement) -> int;
```
## SemicolonClassElement::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: SemicolonClassElement) -> *Modifier;
```
## SemicolonClassElement::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: SemicolonClassElement) -> int;
```
## SemicolonClassElement::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: SemicolonClassElement, i: int) -> Node;
```
## SemicolonClassElement::getStartLineNumber

```rust
pub fn getStartLineNumber(self: SemicolonClassElement) -> int;
```
## SemicolonClassElement::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: SemicolonClassElement) -> *FunctionLikeDeclaration;
```
## SemicolonClassElement::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: SemicolonClassElement, level: int) -> *Node;
```
## SemicolonClassElement::getEndLineNumber

```rust
pub fn getEndLineNumber(self: SemicolonClassElement) -> int;
```
## SemicolonClassElement::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: SemicolonClassElement) -> string;
```
## SemicolonClassElement::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: SemicolonClassElement, level: int) -> Node;
```
## SemicolonClassElement::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: SemicolonClassElement) -> File;
```
## SemicolonClassElement::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: SemicolonClassElement) -> *Comment;
```
## SemicolonClassElement::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: SemicolonClassElement) -> *Comment;
```
## SemicolonClassElement::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: SemicolonClassElement) -> Node;
```
## SemicolonClassElement::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: SemicolonClassElement) -> FunctionLikeDeclaration;
```
## SemicolonClassElement::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: SemicolonClassElement) -> int;
```
## SemicolonClassElement::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: SemicolonClassElement) -> int;
```
## SemicolonClassElement::getIndex

```rust
pub fn getIndex(self: SemicolonClassElement) -> int;
```
## SemicolonClassElement::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: SemicolonClassElement) -> *Node;
```
## SemicolonClassElement::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *SemicolonClassElement;
```
