# TypeParameter

Inherit from [Node](./Node.md)

Primary key: `id: int`

```rust
schema TypeParameter extends Node {
  @primary id: int,
}
```
## TypeParameter::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: TypeParameter) -> *Node;
```
## TypeParameter::getIndex

```rust
pub fn getIndex(self: TypeParameter) -> int;
```
## TypeParameter::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: TypeParameter) -> int;
```
## TypeParameter::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: TypeParameter) -> int;
```
## TypeParameter::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: TypeParameter) -> Node;
```
## TypeParameter::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: TypeParameter) -> FunctionLikeDeclaration;
```
## TypeParameter::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: TypeParameter) -> File;
```
## TypeParameter::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: TypeParameter, level: int) -> Node;
```
## TypeParameter::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: TypeParameter) -> string;
```
## TypeParameter::getEndLineNumber

```rust
pub fn getEndLineNumber(self: TypeParameter) -> int;
```
## TypeParameter::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: TypeParameter) -> *FunctionLikeDeclaration;
```
## TypeParameter::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: TypeParameter, level: int) -> *Node;
```
## TypeParameter::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: TypeParameter) -> int;
```
## TypeParameter::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: TypeParameter) -> *Modifier;
```
## TypeParameter::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: TypeParameter) -> int;
```
## TypeParameter::getStartLineNumber

```rust
pub fn getStartLineNumber(self: TypeParameter) -> int;
```
## TypeParameter::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: TypeParameter, i: int) -> Node;
```
## TypeParameter::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: TypeParameter, i: int) -> Decorator;
```
## TypeParameter::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: TypeParameter) -> TopLevelDO;
```
## TypeParameter::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: TypeParameter) -> int;
```
## TypeParameter::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: TypeParameter) -> *Comment;
```
## TypeParameter::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: TypeParameter) -> *Comment;
```
## TypeParameter::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: TypeParameter) -> Node;
```
## TypeParameter::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: TypeParameter) -> *Node;
```
## TypeParameter::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: TypeParameter) -> *Node;
```
## TypeParameter::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: TypeParameter) -> *Comment;
```
## TypeParameter::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: TypeParameter, i: int) -> Modifier;
```
## TypeParameter::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: TypeParameter) -> string;
```
## TypeParameter::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: TypeParameter) -> *Decorator;
```
## TypeParameter::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: TypeParameter) -> Symbol;
```
## TypeParameter::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: TypeParameter) -> Location;
```
## TypeParameter::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *TypeParameter;
```
