# IndexSignature

Inherit from [ClassElement](./ClassElement.md)

Primary key: `id: int`

```rust
schema IndexSignature extends ClassElement {
  @primary id: int,
}
```
## IndexSignature::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: IndexSignature) -> Location;
```
## IndexSignature::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: IndexSignature) -> Symbol;
```
## IndexSignature::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: IndexSignature) -> *Decorator;
```
## IndexSignature::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: IndexSignature) -> string;
```
## IndexSignature::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: IndexSignature, i: int) -> Modifier;
```
## IndexSignature::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: IndexSignature) -> *Comment;
```
## IndexSignature::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: IndexSignature) -> *Node;
```
## IndexSignature::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: IndexSignature) -> *Node;
```
## IndexSignature::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: IndexSignature) -> Node;
```
## IndexSignature::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: IndexSignature) -> int;
```
## IndexSignature::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: IndexSignature) -> TopLevelDO;
```
## IndexSignature::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: IndexSignature, i: int) -> Decorator;
```
## IndexSignature::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: IndexSignature) -> int;
```
## IndexSignature::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: IndexSignature) -> *Modifier;
```
## IndexSignature::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: IndexSignature) -> int;
```
## IndexSignature::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: IndexSignature, i: int) -> Node;
```
## IndexSignature::getStartLineNumber

```rust
pub fn getStartLineNumber(self: IndexSignature) -> int;
```
## IndexSignature::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: IndexSignature) -> *FunctionLikeDeclaration;
```
## IndexSignature::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: IndexSignature, level: int) -> *Node;
```
## IndexSignature::getEndLineNumber

```rust
pub fn getEndLineNumber(self: IndexSignature) -> int;
```
## IndexSignature::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: IndexSignature) -> string;
```
## IndexSignature::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: IndexSignature, level: int) -> Node;
```
## IndexSignature::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: IndexSignature) -> File;
```
## IndexSignature::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: IndexSignature) -> *Comment;
```
## IndexSignature::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: IndexSignature) -> *Comment;
```
## IndexSignature::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: IndexSignature) -> Node;
```
## IndexSignature::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: IndexSignature) -> FunctionLikeDeclaration;
```
## IndexSignature::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: IndexSignature) -> int;
```
## IndexSignature::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: IndexSignature) -> int;
```
## IndexSignature::getIndex

```rust
pub fn getIndex(self: IndexSignature) -> int;
```
## IndexSignature::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: IndexSignature) -> *Node;
```
## IndexSignature::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *IndexSignature;
```
