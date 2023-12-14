# NamespaceImport

Inherit from [Node](./Node.md)

Primary key: `id: int`

```rust
schema NamespaceImport extends Node {
  @primary id: int,
}
```
## NamespaceImport::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: NamespaceImport) -> *Node;
```
## NamespaceImport::getIndex

```rust
pub fn getIndex(self: NamespaceImport) -> int;
```
## NamespaceImport::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: NamespaceImport) -> int;
```
## NamespaceImport::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: NamespaceImport) -> int;
```
## NamespaceImport::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: NamespaceImport) -> Node;
```
## NamespaceImport::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: NamespaceImport) -> FunctionLikeDeclaration;
```
## NamespaceImport::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: NamespaceImport) -> File;
```
## NamespaceImport::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: NamespaceImport, level: int) -> Node;
```
## NamespaceImport::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: NamespaceImport) -> string;
```
## NamespaceImport::getEndLineNumber

```rust
pub fn getEndLineNumber(self: NamespaceImport) -> int;
```
## NamespaceImport::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: NamespaceImport) -> *FunctionLikeDeclaration;
```
## NamespaceImport::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: NamespaceImport, level: int) -> *Node;
```
## NamespaceImport::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: NamespaceImport) -> int;
```
## NamespaceImport::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: NamespaceImport) -> *Modifier;
```
## NamespaceImport::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: NamespaceImport) -> int;
```
## NamespaceImport::getStartLineNumber

```rust
pub fn getStartLineNumber(self: NamespaceImport) -> int;
```
## NamespaceImport::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: NamespaceImport, i: int) -> Node;
```
## NamespaceImport::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: NamespaceImport, i: int) -> Decorator;
```
## NamespaceImport::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: NamespaceImport) -> TopLevelDO;
```
## NamespaceImport::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: NamespaceImport) -> int;
```
## NamespaceImport::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: NamespaceImport) -> *Comment;
```
## NamespaceImport::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: NamespaceImport) -> *Comment;
```
## NamespaceImport::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: NamespaceImport) -> Node;
```
## NamespaceImport::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: NamespaceImport) -> *Node;
```
## NamespaceImport::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: NamespaceImport) -> *Node;
```
## NamespaceImport::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: NamespaceImport) -> *Comment;
```
## NamespaceImport::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: NamespaceImport, i: int) -> Modifier;
```
## NamespaceImport::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: NamespaceImport) -> string;
```
## NamespaceImport::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: NamespaceImport) -> *Decorator;
```
## NamespaceImport::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: NamespaceImport) -> Symbol;
```
## NamespaceImport::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: NamespaceImport) -> Location;
```
## NamespaceImport::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *NamespaceImport;
```
