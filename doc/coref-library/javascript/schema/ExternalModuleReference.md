# ExternalModuleReference

Inherit from [Node](./Node.md)

Primary key: `id: int`

```rust
schema ExternalModuleReference extends Node {
  @primary id: int,
}
```
## ExternalModuleReference::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: ExternalModuleReference) -> *Node;
```
## ExternalModuleReference::getIndex

```rust
pub fn getIndex(self: ExternalModuleReference) -> int;
```
## ExternalModuleReference::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: ExternalModuleReference) -> int;
```
## ExternalModuleReference::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ExternalModuleReference) -> int;
```
## ExternalModuleReference::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: ExternalModuleReference) -> Node;
```
## ExternalModuleReference::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: ExternalModuleReference) -> FunctionLikeDeclaration;
```
## ExternalModuleReference::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: ExternalModuleReference) -> File;
```
## ExternalModuleReference::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: ExternalModuleReference, level: int) -> Node;
```
## ExternalModuleReference::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: ExternalModuleReference) -> string;
```
## ExternalModuleReference::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ExternalModuleReference) -> int;
```
## ExternalModuleReference::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ExternalModuleReference) -> *FunctionLikeDeclaration;
```
## ExternalModuleReference::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: ExternalModuleReference, level: int) -> *Node;
```
## ExternalModuleReference::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: ExternalModuleReference) -> int;
```
## ExternalModuleReference::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: ExternalModuleReference) -> *Modifier;
```
## ExternalModuleReference::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ExternalModuleReference) -> int;
```
## ExternalModuleReference::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ExternalModuleReference) -> int;
```
## ExternalModuleReference::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: ExternalModuleReference, i: int) -> Node;
```
## ExternalModuleReference::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: ExternalModuleReference, i: int) -> Decorator;
```
## ExternalModuleReference::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: ExternalModuleReference) -> TopLevelDO;
```
## ExternalModuleReference::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: ExternalModuleReference) -> int;
```
## ExternalModuleReference::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: ExternalModuleReference) -> *Comment;
```
## ExternalModuleReference::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: ExternalModuleReference) -> *Comment;
```
## ExternalModuleReference::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: ExternalModuleReference) -> Node;
```
## ExternalModuleReference::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: ExternalModuleReference) -> *Node;
```
## ExternalModuleReference::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: ExternalModuleReference) -> *Node;
```
## ExternalModuleReference::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: ExternalModuleReference) -> *Comment;
```
## ExternalModuleReference::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: ExternalModuleReference, i: int) -> Modifier;
```
## ExternalModuleReference::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: ExternalModuleReference) -> string;
```
## ExternalModuleReference::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: ExternalModuleReference) -> *Decorator;
```
## ExternalModuleReference::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: ExternalModuleReference) -> Symbol;
```
## ExternalModuleReference::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: ExternalModuleReference) -> Location;
```
## ExternalModuleReference::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *ExternalModuleReference;
```
