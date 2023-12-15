# AccessorElement

Inherit from [ClassElement](./ClassElement.md)

Primary key: `id: int`

```rust
schema AccessorElement extends ClassElement {
  @primary id: int
}
```
## AccessorElement::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: AccessorElement) -> Location;
```
## AccessorElement::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: AccessorElement) -> Symbol;
```
## AccessorElement::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: AccessorElement) -> *Decorator;
```
## AccessorElement::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: AccessorElement) -> string;
```
## AccessorElement::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: AccessorElement, i: int) -> Modifier;
```
## AccessorElement::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: AccessorElement) -> *Comment;
```
## AccessorElement::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: AccessorElement) -> *Node;
```
## AccessorElement::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: AccessorElement) -> *Node;
```
## AccessorElement::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: AccessorElement) -> Node;
```
## AccessorElement::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: AccessorElement) -> int;
```
## AccessorElement::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: AccessorElement) -> TopLevelDO;
```
## AccessorElement::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: AccessorElement, i: int) -> Decorator;
```
## AccessorElement::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: AccessorElement) -> int;
```
## AccessorElement::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: AccessorElement) -> *Modifier;
```
## AccessorElement::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: AccessorElement) -> int;
```
## AccessorElement::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: AccessorElement, i: int) -> Node;
```
## AccessorElement::getStartLineNumber

```rust
pub fn getStartLineNumber(self: AccessorElement) -> int;
```
## AccessorElement::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: AccessorElement) -> *FunctionLikeDeclaration;
```
## AccessorElement::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: AccessorElement, level: int) -> *Node;
```
## AccessorElement::getEndLineNumber

```rust
pub fn getEndLineNumber(self: AccessorElement) -> int;
```
## AccessorElement::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: AccessorElement) -> string;
```
## AccessorElement::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: AccessorElement, level: int) -> Node;
```
## AccessorElement::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: AccessorElement) -> File;
```
## AccessorElement::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: AccessorElement) -> *Comment;
```
## AccessorElement::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: AccessorElement) -> *Comment;
```
## AccessorElement::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: AccessorElement) -> Node;
```
## AccessorElement::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: AccessorElement) -> FunctionLikeDeclaration;
```
## AccessorElement::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: AccessorElement) -> int;
```
## AccessorElement::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: AccessorElement) -> int;
```
## AccessorElement::getIndex

```rust
pub fn getIndex(self: AccessorElement) -> int;
```
## AccessorElement::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: AccessorElement) -> *Node;
```
## AccessorElement::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *AccessorElement;
```
