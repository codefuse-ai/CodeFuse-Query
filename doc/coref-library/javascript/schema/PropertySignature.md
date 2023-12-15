# PropertySignature

Inherit from [TypeElement](./TypeElement.md)

Primary key: `id: int`

```rust
schema PropertySignature extends TypeElement {
  @primary id: int
}
```
## PropertySignature::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: PropertySignature) -> Location;
```
## PropertySignature::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: PropertySignature) -> Symbol;
```
## PropertySignature::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: PropertySignature) -> *Decorator;
```
## PropertySignature::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: PropertySignature) -> string;
```
## PropertySignature::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: PropertySignature, i: int) -> Modifier;
```
## PropertySignature::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: PropertySignature) -> *Comment;
```
## PropertySignature::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: PropertySignature) -> *Node;
```
## PropertySignature::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: PropertySignature) -> *Node;
```
## PropertySignature::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: PropertySignature) -> Node;
```
## PropertySignature::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: PropertySignature) -> int;
```
## PropertySignature::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: PropertySignature) -> TopLevelDO;
```
## PropertySignature::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: PropertySignature, i: int) -> Decorator;
```
## PropertySignature::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: PropertySignature) -> int;
```
## PropertySignature::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: PropertySignature) -> *Modifier;
```
## PropertySignature::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: PropertySignature) -> int;
```
## PropertySignature::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: PropertySignature, i: int) -> Node;
```
## PropertySignature::getStartLineNumber

```rust
pub fn getStartLineNumber(self: PropertySignature) -> int;
```
## PropertySignature::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: PropertySignature) -> *FunctionLikeDeclaration;
```
## PropertySignature::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: PropertySignature, level: int) -> *Node;
```
## PropertySignature::getEndLineNumber

```rust
pub fn getEndLineNumber(self: PropertySignature) -> int;
```
## PropertySignature::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: PropertySignature) -> string;
```
## PropertySignature::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: PropertySignature, level: int) -> Node;
```
## PropertySignature::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: PropertySignature) -> File;
```
## PropertySignature::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: PropertySignature) -> *Comment;
```
## PropertySignature::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: PropertySignature) -> *Comment;
```
## PropertySignature::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: PropertySignature) -> Node;
```
## PropertySignature::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: PropertySignature) -> FunctionLikeDeclaration;
```
## PropertySignature::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: PropertySignature) -> int;
```
## PropertySignature::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: PropertySignature) -> int;
```
## PropertySignature::getIndex

```rust
pub fn getIndex(self: PropertySignature) -> int;
```
## PropertySignature::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: PropertySignature) -> *Node;
```
## PropertySignature::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *PropertySignature;
```
