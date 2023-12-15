# QualifiedName

Inherit from [Node](./Node.md)

Primary key: `id: int`

```rust
schema QualifiedName extends Node {
  @primary id: int
}
```
## QualifiedName::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: QualifiedName) -> *Node;
```
## QualifiedName::getIndex

```rust
pub fn getIndex(self: QualifiedName) -> int;
```
## QualifiedName::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: QualifiedName) -> int;
```
## QualifiedName::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: QualifiedName) -> int;
```
## QualifiedName::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: QualifiedName) -> Node;
```
## QualifiedName::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: QualifiedName) -> FunctionLikeDeclaration;
```
## QualifiedName::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: QualifiedName) -> File;
```
## QualifiedName::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: QualifiedName, level: int) -> Node;
```
## QualifiedName::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: QualifiedName) -> string;
```
## QualifiedName::getEndLineNumber

```rust
pub fn getEndLineNumber(self: QualifiedName) -> int;
```
## QualifiedName::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: QualifiedName) -> *FunctionLikeDeclaration;
```
## QualifiedName::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: QualifiedName, level: int) -> *Node;
```
## QualifiedName::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: QualifiedName) -> int;
```
## QualifiedName::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: QualifiedName) -> *Modifier;
```
## QualifiedName::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: QualifiedName) -> int;
```
## QualifiedName::getStartLineNumber

```rust
pub fn getStartLineNumber(self: QualifiedName) -> int;
```
## QualifiedName::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: QualifiedName, i: int) -> Node;
```
## QualifiedName::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: QualifiedName, i: int) -> Decorator;
```
## QualifiedName::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: QualifiedName) -> TopLevelDO;
```
## QualifiedName::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: QualifiedName) -> int;
```
## QualifiedName::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: QualifiedName) -> *Comment;
```
## QualifiedName::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: QualifiedName) -> *Comment;
```
## QualifiedName::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: QualifiedName) -> Node;
```
## QualifiedName::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: QualifiedName) -> *Node;
```
## QualifiedName::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: QualifiedName) -> *Node;
```
## QualifiedName::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: QualifiedName) -> *Comment;
```
## QualifiedName::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: QualifiedName, i: int) -> Modifier;
```
## QualifiedName::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: QualifiedName) -> string;
```
## QualifiedName::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: QualifiedName) -> *Decorator;
```
## QualifiedName::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: QualifiedName) -> Symbol;
```
## QualifiedName::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: QualifiedName) -> Location;
```
## QualifiedName::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *QualifiedName;
```
