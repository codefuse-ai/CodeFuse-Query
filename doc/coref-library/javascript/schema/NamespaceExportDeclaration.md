# NamespaceExportDeclaration

Inherit from [DeclarationStatement](./DeclarationStatement.md)

Primary key: `id: int`

```rust
schema NamespaceExportDeclaration extends DeclarationStatement {
  @primary id: int
}
```
## NamespaceExportDeclaration::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: NamespaceExportDeclaration) -> *Node;
```
## NamespaceExportDeclaration::getIndex

```rust
pub fn getIndex(self: NamespaceExportDeclaration) -> int;
```
## NamespaceExportDeclaration::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: NamespaceExportDeclaration) -> int;
```
## NamespaceExportDeclaration::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: NamespaceExportDeclaration) -> int;
```
## NamespaceExportDeclaration::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: NamespaceExportDeclaration) -> FunctionLikeDeclaration;
```
## NamespaceExportDeclaration::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: NamespaceExportDeclaration) -> Node;
```
## NamespaceExportDeclaration::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: NamespaceExportDeclaration) -> *Comment;
```
## NamespaceExportDeclaration::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: NamespaceExportDeclaration) -> *Comment;
```
## NamespaceExportDeclaration::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: NamespaceExportDeclaration) -> File;
```
## NamespaceExportDeclaration::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: NamespaceExportDeclaration, level: int) -> Node;
```
## NamespaceExportDeclaration::getEndLineNumber

```rust
pub fn getEndLineNumber(self: NamespaceExportDeclaration) -> int;
```
## NamespaceExportDeclaration::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: NamespaceExportDeclaration) -> string;
```
## NamespaceExportDeclaration::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: NamespaceExportDeclaration) -> *FunctionLikeDeclaration;
```
## NamespaceExportDeclaration::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: NamespaceExportDeclaration, level: int) -> *Node;
```
## NamespaceExportDeclaration::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: NamespaceExportDeclaration) -> int;
```
## NamespaceExportDeclaration::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: NamespaceExportDeclaration) -> *Modifier;
```
## NamespaceExportDeclaration::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: NamespaceExportDeclaration) -> int;
```
## NamespaceExportDeclaration::getStartLineNumber

```rust
pub fn getStartLineNumber(self: NamespaceExportDeclaration) -> int;
```
## NamespaceExportDeclaration::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: NamespaceExportDeclaration, i: int) -> Node;
```
## NamespaceExportDeclaration::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: NamespaceExportDeclaration, i: int) -> Decorator;
```
## NamespaceExportDeclaration::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: NamespaceExportDeclaration) -> TopLevelDO;
```
## NamespaceExportDeclaration::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: NamespaceExportDeclaration) -> int;
```
## NamespaceExportDeclaration::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: NamespaceExportDeclaration) -> Node;
```
## NamespaceExportDeclaration::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: NamespaceExportDeclaration) -> *Node;
```
## NamespaceExportDeclaration::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: NamespaceExportDeclaration) -> *Node;
```
## NamespaceExportDeclaration::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: NamespaceExportDeclaration) -> *Comment;
```
## NamespaceExportDeclaration::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: NamespaceExportDeclaration) -> Symbol;
```
## NamespaceExportDeclaration::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: NamespaceExportDeclaration) -> *Decorator;
```
## NamespaceExportDeclaration::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: NamespaceExportDeclaration, i: int) -> Modifier;
```
## NamespaceExportDeclaration::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: NamespaceExportDeclaration) -> string;
```
## NamespaceExportDeclaration::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *NamespaceExportDeclaration;
```
## NamespaceExportDeclaration::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: NamespaceExportDeclaration) -> Location;
```
