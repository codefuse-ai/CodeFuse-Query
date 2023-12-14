# GetAccessorElement

Inherit from [AccessorElement](./AccessorElement.md)

Primary key: `id: int`

```rust
schema GetAccessorElement extends AccessorElement {
  @primary id: int,
}
```
## GetAccessorElement::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: GetAccessorElement) -> *Node;
```
## GetAccessorElement::getIndex

```rust
pub fn getIndex(self: GetAccessorElement) -> int;
```
## GetAccessorElement::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: GetAccessorElement) -> int;
```
## GetAccessorElement::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: GetAccessorElement) -> int;
```
## GetAccessorElement::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: GetAccessorElement) -> FunctionLikeDeclaration;
```
## GetAccessorElement::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: GetAccessorElement) -> Node;
```
## GetAccessorElement::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: GetAccessorElement) -> *Comment;
```
## GetAccessorElement::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: GetAccessorElement) -> *Comment;
```
## GetAccessorElement::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: GetAccessorElement) -> File;
```
## GetAccessorElement::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: GetAccessorElement, level: int) -> Node;
```
## GetAccessorElement::getEndLineNumber

```rust
pub fn getEndLineNumber(self: GetAccessorElement) -> int;
```
## GetAccessorElement::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: GetAccessorElement) -> string;
```
## GetAccessorElement::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: GetAccessorElement) -> *FunctionLikeDeclaration;
```
## GetAccessorElement::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: GetAccessorElement, level: int) -> *Node;
```
## GetAccessorElement::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: GetAccessorElement) -> int;
```
## GetAccessorElement::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: GetAccessorElement) -> *Modifier;
```
## GetAccessorElement::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: GetAccessorElement) -> int;
```
## GetAccessorElement::getStartLineNumber

```rust
pub fn getStartLineNumber(self: GetAccessorElement) -> int;
```
## GetAccessorElement::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: GetAccessorElement, i: int) -> Node;
```
## GetAccessorElement::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: GetAccessorElement, i: int) -> Decorator;
```
## GetAccessorElement::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: GetAccessorElement) -> TopLevelDO;
```
## GetAccessorElement::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: GetAccessorElement) -> int;
```
## GetAccessorElement::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: GetAccessorElement) -> Node;
```
## GetAccessorElement::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: GetAccessorElement) -> *Node;
```
## GetAccessorElement::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: GetAccessorElement) -> *Node;
```
## GetAccessorElement::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: GetAccessorElement) -> *Comment;
```
## GetAccessorElement::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: GetAccessorElement) -> Symbol;
```
## GetAccessorElement::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: GetAccessorElement) -> *Decorator;
```
## GetAccessorElement::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: GetAccessorElement, i: int) -> Modifier;
```
## GetAccessorElement::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: GetAccessorElement) -> string;
```
## GetAccessorElement::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *GetAccessorElement;
```
## GetAccessorElement::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: GetAccessorElement) -> Location;
```
