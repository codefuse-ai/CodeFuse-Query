# ClassStaticBlockElement

Primary key: `id: int`

```rust
schema ClassStaticBlockElement {
  @primary id: int,
}
```
## ClassStaticBlockElement::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: ClassStaticBlockElement) -> Location;
```
## ClassStaticBlockElement::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: ClassStaticBlockElement) -> Symbol;
```
## ClassStaticBlockElement::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: ClassStaticBlockElement) -> *Decorator;
```
## ClassStaticBlockElement::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: ClassStaticBlockElement) -> string;
```
## ClassStaticBlockElement::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: ClassStaticBlockElement, i: int) -> Modifier;
```
## ClassStaticBlockElement::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: ClassStaticBlockElement) -> *Comment;
```
## ClassStaticBlockElement::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: ClassStaticBlockElement) -> *Node;
```
## ClassStaticBlockElement::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: ClassStaticBlockElement) -> *Node;
```
## ClassStaticBlockElement::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: ClassStaticBlockElement) -> Node;
```
## ClassStaticBlockElement::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: ClassStaticBlockElement) -> int;
```
## ClassStaticBlockElement::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: ClassStaticBlockElement) -> TopLevelDO;
```
## ClassStaticBlockElement::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: ClassStaticBlockElement, i: int) -> Decorator;
```
## ClassStaticBlockElement::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: ClassStaticBlockElement) -> int;
```
## ClassStaticBlockElement::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: ClassStaticBlockElement) -> *Modifier;
```
## ClassStaticBlockElement::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ClassStaticBlockElement) -> int;
```
## ClassStaticBlockElement::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: ClassStaticBlockElement, i: int) -> Node;
```
## ClassStaticBlockElement::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ClassStaticBlockElement) -> int;
```
## ClassStaticBlockElement::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ClassStaticBlockElement) -> *FunctionLikeDeclaration;
```
## ClassStaticBlockElement::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: ClassStaticBlockElement, level: int) -> *Node;
```
## ClassStaticBlockElement::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ClassStaticBlockElement) -> int;
```
## ClassStaticBlockElement::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: ClassStaticBlockElement) -> string;
```
## ClassStaticBlockElement::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: ClassStaticBlockElement, level: int) -> Node;
```
## ClassStaticBlockElement::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: ClassStaticBlockElement) -> File;
```
## ClassStaticBlockElement::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: ClassStaticBlockElement) -> *Comment;
```
## ClassStaticBlockElement::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: ClassStaticBlockElement) -> *Comment;
```
## ClassStaticBlockElement::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: ClassStaticBlockElement) -> Node;
```
## ClassStaticBlockElement::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: ClassStaticBlockElement) -> FunctionLikeDeclaration;
```
## ClassStaticBlockElement::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ClassStaticBlockElement) -> int;
```
## ClassStaticBlockElement::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: ClassStaticBlockElement) -> int;
```
## ClassStaticBlockElement::getIndex

```rust
pub fn getIndex(self: ClassStaticBlockElement) -> int;
```
## ClassStaticBlockElement::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: ClassStaticBlockElement) -> *Node;
```
## ClassStaticBlockElement::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *ClassStaticBlockElement;
```
