# ClassElement

Inherit from [Node](./Node.md)

Primary key: `id: int`

```rust
schema ClassElement extends Node {
  @primary id: int
}
```
## ClassElement::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: ClassElement) -> *Node;
```
## ClassElement::getIndex

```rust
pub fn getIndex(self: ClassElement) -> int;
```
## ClassElement::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: ClassElement) -> int;
```
## ClassElement::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ClassElement) -> int;
```
## ClassElement::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: ClassElement) -> Node;
```
## ClassElement::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: ClassElement) -> FunctionLikeDeclaration;
```
## ClassElement::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: ClassElement) -> File;
```
## ClassElement::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: ClassElement, level: int) -> Node;
```
## ClassElement::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: ClassElement) -> string;
```
## ClassElement::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ClassElement) -> int;
```
## ClassElement::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ClassElement) -> *FunctionLikeDeclaration;
```
## ClassElement::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: ClassElement, level: int) -> *Node;
```
## ClassElement::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: ClassElement) -> int;
```
## ClassElement::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: ClassElement) -> *Modifier;
```
## ClassElement::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ClassElement) -> int;
```
## ClassElement::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ClassElement) -> int;
```
## ClassElement::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: ClassElement, i: int) -> Node;
```
## ClassElement::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: ClassElement, i: int) -> Decorator;
```
## ClassElement::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: ClassElement) -> TopLevelDO;
```
## ClassElement::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: ClassElement) -> int;
```
## ClassElement::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: ClassElement) -> *Comment;
```
## ClassElement::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: ClassElement) -> *Comment;
```
## ClassElement::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: ClassElement) -> Node;
```
## ClassElement::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: ClassElement) -> *Node;
```
## ClassElement::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: ClassElement) -> *Node;
```
## ClassElement::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: ClassElement) -> *Comment;
```
## ClassElement::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: ClassElement, i: int) -> Modifier;
```
## ClassElement::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: ClassElement) -> string;
```
## ClassElement::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: ClassElement) -> *Decorator;
```
## ClassElement::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: ClassElement) -> Symbol;
```
## ClassElement::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: ClassElement) -> Location;
```
## ClassElement::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *ClassElement;
```
