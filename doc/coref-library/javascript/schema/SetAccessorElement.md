# SetAccessorElement

Inherit from [AccessorElement](./AccessorElement.md)

Primary key: `id: int`

```rust
schema SetAccessorElement extends AccessorElement {
  @primary id: int
}
```
## SetAccessorElement::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: SetAccessorElement) -> *Node;
```
## SetAccessorElement::getIndex

```rust
pub fn getIndex(self: SetAccessorElement) -> int;
```
## SetAccessorElement::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: SetAccessorElement) -> int;
```
## SetAccessorElement::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: SetAccessorElement) -> int;
```
## SetAccessorElement::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: SetAccessorElement) -> FunctionLikeDeclaration;
```
## SetAccessorElement::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: SetAccessorElement) -> Node;
```
## SetAccessorElement::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: SetAccessorElement) -> *Comment;
```
## SetAccessorElement::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: SetAccessorElement) -> *Comment;
```
## SetAccessorElement::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: SetAccessorElement) -> File;
```
## SetAccessorElement::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: SetAccessorElement, level: int) -> Node;
```
## SetAccessorElement::getEndLineNumber

```rust
pub fn getEndLineNumber(self: SetAccessorElement) -> int;
```
## SetAccessorElement::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: SetAccessorElement) -> string;
```
## SetAccessorElement::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: SetAccessorElement) -> *FunctionLikeDeclaration;
```
## SetAccessorElement::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: SetAccessorElement, level: int) -> *Node;
```
## SetAccessorElement::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: SetAccessorElement) -> int;
```
## SetAccessorElement::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: SetAccessorElement) -> *Modifier;
```
## SetAccessorElement::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: SetAccessorElement) -> int;
```
## SetAccessorElement::getStartLineNumber

```rust
pub fn getStartLineNumber(self: SetAccessorElement) -> int;
```
## SetAccessorElement::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: SetAccessorElement, i: int) -> Node;
```
## SetAccessorElement::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: SetAccessorElement, i: int) -> Decorator;
```
## SetAccessorElement::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: SetAccessorElement) -> TopLevelDO;
```
## SetAccessorElement::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: SetAccessorElement) -> int;
```
## SetAccessorElement::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: SetAccessorElement) -> Node;
```
## SetAccessorElement::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: SetAccessorElement) -> *Node;
```
## SetAccessorElement::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: SetAccessorElement) -> *Node;
```
## SetAccessorElement::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: SetAccessorElement) -> *Comment;
```
## SetAccessorElement::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: SetAccessorElement) -> Symbol;
```
## SetAccessorElement::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: SetAccessorElement) -> *Decorator;
```
## SetAccessorElement::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: SetAccessorElement, i: int) -> Modifier;
```
## SetAccessorElement::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: SetAccessorElement) -> string;
```
## SetAccessorElement::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *SetAccessorElement;
```
## SetAccessorElement::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: SetAccessorElement) -> Location;
```
