# TypeElement

Inherit from [Node](./Node.md)

Primary key: `id: int`

```rust
schema TypeElement extends Node {
  @primary id: int
}
```
## TypeElement::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: TypeElement) -> *Node;
```
## TypeElement::getIndex

```rust
pub fn getIndex(self: TypeElement) -> int;
```
## TypeElement::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: TypeElement) -> int;
```
## TypeElement::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: TypeElement) -> int;
```
## TypeElement::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: TypeElement) -> Node;
```
## TypeElement::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: TypeElement) -> FunctionLikeDeclaration;
```
## TypeElement::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: TypeElement) -> File;
```
## TypeElement::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: TypeElement, level: int) -> Node;
```
## TypeElement::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: TypeElement) -> string;
```
## TypeElement::getEndLineNumber

```rust
pub fn getEndLineNumber(self: TypeElement) -> int;
```
## TypeElement::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: TypeElement) -> *FunctionLikeDeclaration;
```
## TypeElement::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: TypeElement, level: int) -> *Node;
```
## TypeElement::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: TypeElement) -> int;
```
## TypeElement::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: TypeElement) -> *Modifier;
```
## TypeElement::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: TypeElement) -> int;
```
## TypeElement::getStartLineNumber

```rust
pub fn getStartLineNumber(self: TypeElement) -> int;
```
## TypeElement::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: TypeElement, i: int) -> Node;
```
## TypeElement::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: TypeElement, i: int) -> Decorator;
```
## TypeElement::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: TypeElement) -> TopLevelDO;
```
## TypeElement::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: TypeElement) -> int;
```
## TypeElement::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: TypeElement) -> *Comment;
```
## TypeElement::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: TypeElement) -> *Comment;
```
## TypeElement::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: TypeElement) -> Node;
```
## TypeElement::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: TypeElement) -> *Node;
```
## TypeElement::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: TypeElement) -> *Node;
```
## TypeElement::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: TypeElement) -> *Comment;
```
## TypeElement::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: TypeElement, i: int) -> Modifier;
```
## TypeElement::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: TypeElement) -> string;
```
## TypeElement::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: TypeElement) -> *Decorator;
```
## TypeElement::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: TypeElement) -> Symbol;
```
## TypeElement::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: TypeElement) -> Location;
```
## TypeElement::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *TypeElement;
```
