# MethodElement

Inherit from [ClassElement](./ClassElement.md)

Primary key: `id: int`

```rust
schema MethodElement extends ClassElement {
  @primary id: int
}
```
## MethodElement::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: MethodElement) -> Location;
```
## MethodElement::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: MethodElement) -> Symbol;
```
## MethodElement::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: MethodElement) -> *Decorator;
```
## MethodElement::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: MethodElement) -> string;
```
## MethodElement::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: MethodElement, i: int) -> Modifier;
```
## MethodElement::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: MethodElement) -> *Comment;
```
## MethodElement::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: MethodElement) -> *Node;
```
## MethodElement::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: MethodElement) -> *Node;
```
## MethodElement::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: MethodElement) -> Node;
```
## MethodElement::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: MethodElement) -> int;
```
## MethodElement::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: MethodElement) -> TopLevelDO;
```
## MethodElement::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: MethodElement, i: int) -> Decorator;
```
## MethodElement::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: MethodElement) -> int;
```
## MethodElement::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: MethodElement) -> *Modifier;
```
## MethodElement::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: MethodElement) -> int;
```
## MethodElement::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: MethodElement, i: int) -> Node;
```
## MethodElement::getStartLineNumber

```rust
pub fn getStartLineNumber(self: MethodElement) -> int;
```
## MethodElement::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: MethodElement) -> *FunctionLikeDeclaration;
```
## MethodElement::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: MethodElement, level: int) -> *Node;
```
## MethodElement::getEndLineNumber

```rust
pub fn getEndLineNumber(self: MethodElement) -> int;
```
## MethodElement::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: MethodElement) -> string;
```
## MethodElement::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: MethodElement, level: int) -> Node;
```
## MethodElement::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: MethodElement) -> File;
```
## MethodElement::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: MethodElement) -> *Comment;
```
## MethodElement::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: MethodElement) -> *Comment;
```
## MethodElement::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: MethodElement) -> Node;
```
## MethodElement::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: MethodElement) -> FunctionLikeDeclaration;
```
## MethodElement::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: MethodElement) -> int;
```
## MethodElement::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: MethodElement) -> int;
```
## MethodElement::getIndex

```rust
pub fn getIndex(self: MethodElement) -> int;
```
## MethodElement::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: MethodElement) -> *Node;
```
## MethodElement::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *MethodElement;
```
