# NamespaceExport

Inherit from [Node](./Node.md)

Primary key: `id: int`

```rust
schema NamespaceExport extends Node {
  @primary id: int,
}
```
## NamespaceExport::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: NamespaceExport) -> *Node;
```
## NamespaceExport::getIndex

```rust
pub fn getIndex(self: NamespaceExport) -> int;
```
## NamespaceExport::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: NamespaceExport) -> int;
```
## NamespaceExport::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: NamespaceExport) -> int;
```
## NamespaceExport::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: NamespaceExport) -> Node;
```
## NamespaceExport::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: NamespaceExport) -> FunctionLikeDeclaration;
```
## NamespaceExport::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: NamespaceExport) -> File;
```
## NamespaceExport::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: NamespaceExport, level: int) -> Node;
```
## NamespaceExport::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: NamespaceExport) -> string;
```
## NamespaceExport::getEndLineNumber

```rust
pub fn getEndLineNumber(self: NamespaceExport) -> int;
```
## NamespaceExport::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: NamespaceExport) -> *FunctionLikeDeclaration;
```
## NamespaceExport::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: NamespaceExport, level: int) -> *Node;
```
## NamespaceExport::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: NamespaceExport) -> int;
```
## NamespaceExport::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: NamespaceExport) -> *Modifier;
```
## NamespaceExport::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: NamespaceExport) -> int;
```
## NamespaceExport::getStartLineNumber

```rust
pub fn getStartLineNumber(self: NamespaceExport) -> int;
```
## NamespaceExport::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: NamespaceExport, i: int) -> Node;
```
## NamespaceExport::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: NamespaceExport, i: int) -> Decorator;
```
## NamespaceExport::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: NamespaceExport) -> TopLevelDO;
```
## NamespaceExport::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: NamespaceExport) -> int;
```
## NamespaceExport::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: NamespaceExport) -> *Comment;
```
## NamespaceExport::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: NamespaceExport) -> *Comment;
```
## NamespaceExport::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: NamespaceExport) -> Node;
```
## NamespaceExport::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: NamespaceExport) -> *Node;
```
## NamespaceExport::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: NamespaceExport) -> *Node;
```
## NamespaceExport::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: NamespaceExport) -> *Comment;
```
## NamespaceExport::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: NamespaceExport, i: int) -> Modifier;
```
## NamespaceExport::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: NamespaceExport) -> string;
```
## NamespaceExport::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: NamespaceExport) -> *Decorator;
```
## NamespaceExport::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: NamespaceExport) -> Symbol;
```
## NamespaceExport::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: NamespaceExport) -> Location;
```
## NamespaceExport::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *NamespaceExport;
```
