# NamedImports

Inherit from [Node](./Node.md)

Primary key: `id: int`

```rust
schema NamedImports extends Node {
  @primary id: int
}
```
## NamedImports::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: NamedImports) -> *Node;
```
## NamedImports::getIndex

```rust
pub fn getIndex(self: NamedImports) -> int;
```
## NamedImports::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: NamedImports) -> int;
```
## NamedImports::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: NamedImports) -> int;
```
## NamedImports::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: NamedImports) -> Node;
```
## NamedImports::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: NamedImports) -> FunctionLikeDeclaration;
```
## NamedImports::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: NamedImports) -> File;
```
## NamedImports::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: NamedImports, level: int) -> Node;
```
## NamedImports::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: NamedImports) -> string;
```
## NamedImports::getEndLineNumber

```rust
pub fn getEndLineNumber(self: NamedImports) -> int;
```
## NamedImports::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: NamedImports) -> *FunctionLikeDeclaration;
```
## NamedImports::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: NamedImports, level: int) -> *Node;
```
## NamedImports::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: NamedImports) -> int;
```
## NamedImports::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: NamedImports) -> *Modifier;
```
## NamedImports::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: NamedImports) -> int;
```
## NamedImports::getStartLineNumber

```rust
pub fn getStartLineNumber(self: NamedImports) -> int;
```
## NamedImports::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: NamedImports, i: int) -> Node;
```
## NamedImports::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: NamedImports, i: int) -> Decorator;
```
## NamedImports::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: NamedImports) -> TopLevelDO;
```
## NamedImports::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: NamedImports) -> int;
```
## NamedImports::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: NamedImports) -> *Comment;
```
## NamedImports::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: NamedImports) -> *Comment;
```
## NamedImports::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: NamedImports) -> Node;
```
## NamedImports::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: NamedImports) -> *Node;
```
## NamedImports::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: NamedImports) -> *Node;
```
## NamedImports::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: NamedImports) -> *Comment;
```
## NamedImports::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: NamedImports, i: int) -> Modifier;
```
## NamedImports::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: NamedImports) -> string;
```
## NamedImports::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: NamedImports) -> *Decorator;
```
## NamedImports::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: NamedImports) -> Symbol;
```
## NamedImports::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: NamedImports) -> Location;
```
## NamedImports::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *NamedImports;
```
