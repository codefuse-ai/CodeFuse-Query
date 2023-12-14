# ConstructorElement

Inherit from [ClassElement](./ClassElement.md)

Primary key: `id: int`

```rust
schema ConstructorElement extends ClassElement {
  @primary id: int,
}
```
## ConstructorElement::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: ConstructorElement) -> Location;
```
## ConstructorElement::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: ConstructorElement) -> Symbol;
```
## ConstructorElement::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: ConstructorElement) -> *Decorator;
```
## ConstructorElement::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: ConstructorElement) -> string;
```
## ConstructorElement::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: ConstructorElement, i: int) -> Modifier;
```
## ConstructorElement::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: ConstructorElement) -> *Comment;
```
## ConstructorElement::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: ConstructorElement) -> *Node;
```
## ConstructorElement::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: ConstructorElement) -> *Node;
```
## ConstructorElement::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: ConstructorElement) -> Node;
```
## ConstructorElement::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: ConstructorElement) -> int;
```
## ConstructorElement::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: ConstructorElement) -> TopLevelDO;
```
## ConstructorElement::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: ConstructorElement, i: int) -> Decorator;
```
## ConstructorElement::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: ConstructorElement) -> int;
```
## ConstructorElement::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: ConstructorElement) -> *Modifier;
```
## ConstructorElement::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ConstructorElement) -> int;
```
## ConstructorElement::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: ConstructorElement, i: int) -> Node;
```
## ConstructorElement::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ConstructorElement) -> int;
```
## ConstructorElement::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ConstructorElement) -> *FunctionLikeDeclaration;
```
## ConstructorElement::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: ConstructorElement, level: int) -> *Node;
```
## ConstructorElement::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ConstructorElement) -> int;
```
## ConstructorElement::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: ConstructorElement) -> string;
```
## ConstructorElement::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: ConstructorElement, level: int) -> Node;
```
## ConstructorElement::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: ConstructorElement) -> File;
```
## ConstructorElement::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: ConstructorElement) -> *Comment;
```
## ConstructorElement::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: ConstructorElement) -> *Comment;
```
## ConstructorElement::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: ConstructorElement) -> Node;
```
## ConstructorElement::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: ConstructorElement) -> FunctionLikeDeclaration;
```
## ConstructorElement::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ConstructorElement) -> int;
```
## ConstructorElement::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: ConstructorElement) -> int;
```
## ConstructorElement::getIndex

```rust
pub fn getIndex(self: ConstructorElement) -> int;
```
## ConstructorElement::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: ConstructorElement) -> *Node;
```
## ConstructorElement::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *ConstructorElement;
```
