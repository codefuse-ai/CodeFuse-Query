# ExportDeclaration

Inherit from [DeclarationStatement](./DeclarationStatement.md)

Primary key: `id: int`

```rust
schema ExportDeclaration extends DeclarationStatement {
  @primary id: int,
}
```
## ExportDeclaration::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: ExportDeclaration) -> *Node;
```
## ExportDeclaration::getIndex

```rust
pub fn getIndex(self: ExportDeclaration) -> int;
```
## ExportDeclaration::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: ExportDeclaration) -> int;
```
## ExportDeclaration::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ExportDeclaration) -> int;
```
## ExportDeclaration::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: ExportDeclaration) -> FunctionLikeDeclaration;
```
## ExportDeclaration::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: ExportDeclaration) -> Node;
```
## ExportDeclaration::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: ExportDeclaration) -> *Comment;
```
## ExportDeclaration::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: ExportDeclaration) -> *Comment;
```
## ExportDeclaration::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: ExportDeclaration) -> File;
```
## ExportDeclaration::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: ExportDeclaration, level: int) -> Node;
```
## ExportDeclaration::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ExportDeclaration) -> int;
```
## ExportDeclaration::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: ExportDeclaration) -> string;
```
## ExportDeclaration::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ExportDeclaration) -> *FunctionLikeDeclaration;
```
## ExportDeclaration::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: ExportDeclaration, level: int) -> *Node;
```
## ExportDeclaration::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: ExportDeclaration) -> int;
```
## ExportDeclaration::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: ExportDeclaration) -> *Modifier;
```
## ExportDeclaration::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ExportDeclaration) -> int;
```
## ExportDeclaration::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ExportDeclaration) -> int;
```
## ExportDeclaration::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: ExportDeclaration, i: int) -> Node;
```
## ExportDeclaration::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: ExportDeclaration, i: int) -> Decorator;
```
## ExportDeclaration::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: ExportDeclaration) -> TopLevelDO;
```
## ExportDeclaration::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: ExportDeclaration) -> int;
```
## ExportDeclaration::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: ExportDeclaration) -> Node;
```
## ExportDeclaration::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: ExportDeclaration) -> *Node;
```
## ExportDeclaration::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: ExportDeclaration) -> *Node;
```
## ExportDeclaration::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: ExportDeclaration) -> *Comment;
```
## ExportDeclaration::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: ExportDeclaration) -> Symbol;
```
## ExportDeclaration::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: ExportDeclaration) -> *Decorator;
```
## ExportDeclaration::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: ExportDeclaration, i: int) -> Modifier;
```
## ExportDeclaration::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: ExportDeclaration) -> string;
```
## ExportDeclaration::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *ExportDeclaration;
```
## ExportDeclaration::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: ExportDeclaration) -> Location;
```
