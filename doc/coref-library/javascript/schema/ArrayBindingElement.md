# ArrayBindingElement

Inherit from [Node](./Node.md)

Primary key: `id: int`

```rust
schema ArrayBindingElement extends Node {
  @primary id: int,
}
```
## ArrayBindingElement::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: ArrayBindingElement) -> *Node;
```
## ArrayBindingElement::getIndex

```rust
pub fn getIndex(self: ArrayBindingElement) -> int;
```
## ArrayBindingElement::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: ArrayBindingElement) -> int;
```
## ArrayBindingElement::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ArrayBindingElement) -> int;
```
## ArrayBindingElement::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: ArrayBindingElement) -> Node;
```
## ArrayBindingElement::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: ArrayBindingElement) -> FunctionLikeDeclaration;
```
## ArrayBindingElement::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: ArrayBindingElement) -> File;
```
## ArrayBindingElement::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: ArrayBindingElement, level: int) -> Node;
```
## ArrayBindingElement::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: ArrayBindingElement) -> string;
```
## ArrayBindingElement::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ArrayBindingElement) -> int;
```
## ArrayBindingElement::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ArrayBindingElement) -> *FunctionLikeDeclaration;
```
## ArrayBindingElement::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: ArrayBindingElement, level: int) -> *Node;
```
## ArrayBindingElement::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: ArrayBindingElement) -> int;
```
## ArrayBindingElement::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: ArrayBindingElement) -> *Modifier;
```
## ArrayBindingElement::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ArrayBindingElement) -> int;
```
## ArrayBindingElement::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ArrayBindingElement) -> int;
```
## ArrayBindingElement::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: ArrayBindingElement, i: int) -> Node;
```
## ArrayBindingElement::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: ArrayBindingElement, i: int) -> Decorator;
```
## ArrayBindingElement::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: ArrayBindingElement) -> TopLevelDO;
```
## ArrayBindingElement::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: ArrayBindingElement) -> int;
```
## ArrayBindingElement::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: ArrayBindingElement) -> *Comment;
```
## ArrayBindingElement::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: ArrayBindingElement) -> *Comment;
```
## ArrayBindingElement::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: ArrayBindingElement) -> Node;
```
## ArrayBindingElement::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: ArrayBindingElement) -> *Node;
```
## ArrayBindingElement::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: ArrayBindingElement) -> *Node;
```
## ArrayBindingElement::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: ArrayBindingElement) -> *Comment;
```
## ArrayBindingElement::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: ArrayBindingElement, i: int) -> Modifier;
```
## ArrayBindingElement::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: ArrayBindingElement) -> string;
```
## ArrayBindingElement::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: ArrayBindingElement) -> *Decorator;
```
## ArrayBindingElement::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: ArrayBindingElement) -> Symbol;
```
## ArrayBindingElement::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: ArrayBindingElement) -> Location;
```
## ArrayBindingElement::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *ArrayBindingElement;
```
