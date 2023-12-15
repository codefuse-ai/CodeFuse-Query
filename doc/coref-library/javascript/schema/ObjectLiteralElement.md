# ObjectLiteralElement

Inherit from [Node](./Node.md)

Primary key: `id: int`

```rust
schema ObjectLiteralElement extends Node {
  @primary id: int
}
```
## ObjectLiteralElement::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: ObjectLiteralElement) -> *Node;
```
## ObjectLiteralElement::getIndex

```rust
pub fn getIndex(self: ObjectLiteralElement) -> int;
```
## ObjectLiteralElement::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: ObjectLiteralElement) -> int;
```
## ObjectLiteralElement::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ObjectLiteralElement) -> int;
```
## ObjectLiteralElement::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: ObjectLiteralElement) -> Node;
```
## ObjectLiteralElement::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: ObjectLiteralElement) -> FunctionLikeDeclaration;
```
## ObjectLiteralElement::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: ObjectLiteralElement) -> File;
```
## ObjectLiteralElement::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: ObjectLiteralElement, level: int) -> Node;
```
## ObjectLiteralElement::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: ObjectLiteralElement) -> string;
```
## ObjectLiteralElement::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ObjectLiteralElement) -> int;
```
## ObjectLiteralElement::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ObjectLiteralElement) -> *FunctionLikeDeclaration;
```
## ObjectLiteralElement::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: ObjectLiteralElement, level: int) -> *Node;
```
## ObjectLiteralElement::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: ObjectLiteralElement) -> int;
```
## ObjectLiteralElement::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: ObjectLiteralElement) -> *Modifier;
```
## ObjectLiteralElement::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ObjectLiteralElement) -> int;
```
## ObjectLiteralElement::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ObjectLiteralElement) -> int;
```
## ObjectLiteralElement::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: ObjectLiteralElement, i: int) -> Node;
```
## ObjectLiteralElement::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: ObjectLiteralElement) -> TopLevelDO;
```
## ObjectLiteralElement::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: ObjectLiteralElement, i: int) -> Decorator;
```
## ObjectLiteralElement::getName

```java
/**
* Gets the name of this ObjectLiteralElement.
*
* A SpreadAssignment doesn't have a name.
* TODO: add handling for Accessors.
*/
```
```rust
pub fn getName(self: ObjectLiteralElement) -> string;
```
## ObjectLiteralElement::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: ObjectLiteralElement) -> int;
```
## ObjectLiteralElement::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: ObjectLiteralElement) -> *Comment;
```
## ObjectLiteralElement::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: ObjectLiteralElement) -> *Comment;
```
## ObjectLiteralElement::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: ObjectLiteralElement) -> *Node;
```
## ObjectLiteralElement::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: ObjectLiteralElement) -> Node;
```
## ObjectLiteralElement::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: ObjectLiteralElement, i: int) -> Modifier;
```
## ObjectLiteralElement::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: ObjectLiteralElement) -> string;
```
## ObjectLiteralElement::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: ObjectLiteralElement) -> *Decorator;
```
## ObjectLiteralElement::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: ObjectLiteralElement) -> Symbol;
```
## ObjectLiteralElement::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: ObjectLiteralElement) -> Location;
```
## ObjectLiteralElement::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *ObjectLiteralElement;
```
## ObjectLiteralElement::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: ObjectLiteralElement) -> *Node;
```
## ObjectLiteralElement::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: ObjectLiteralElement) -> *Comment;
```
