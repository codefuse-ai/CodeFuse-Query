# InterfaceDeclaration

Inherit from [DeclarationStatement](./DeclarationStatement.md)

Primary key: `id: int`

```rust
schema InterfaceDeclaration extends DeclarationStatement {
  @primary id: int,
}
```
## InterfaceDeclaration::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: InterfaceDeclaration) -> *Node;
```
## InterfaceDeclaration::getIndex

```rust
pub fn getIndex(self: InterfaceDeclaration) -> int;
```
## InterfaceDeclaration::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: InterfaceDeclaration) -> int;
```
## InterfaceDeclaration::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: InterfaceDeclaration) -> int;
```
## InterfaceDeclaration::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: InterfaceDeclaration) -> FunctionLikeDeclaration;
```
## InterfaceDeclaration::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: InterfaceDeclaration) -> Node;
```
## InterfaceDeclaration::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: InterfaceDeclaration) -> *Comment;
```
## InterfaceDeclaration::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: InterfaceDeclaration) -> *Comment;
```
## InterfaceDeclaration::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: InterfaceDeclaration) -> File;
```
## InterfaceDeclaration::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: InterfaceDeclaration, level: int) -> Node;
```
## InterfaceDeclaration::getEndLineNumber

```rust
pub fn getEndLineNumber(self: InterfaceDeclaration) -> int;
```
## InterfaceDeclaration::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: InterfaceDeclaration) -> string;
```
## InterfaceDeclaration::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: InterfaceDeclaration) -> *FunctionLikeDeclaration;
```
## InterfaceDeclaration::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: InterfaceDeclaration, level: int) -> *Node;
```
## InterfaceDeclaration::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: InterfaceDeclaration) -> int;
```
## InterfaceDeclaration::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: InterfaceDeclaration) -> *Modifier;
```
## InterfaceDeclaration::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: InterfaceDeclaration) -> int;
```
## InterfaceDeclaration::getStartLineNumber

```rust
pub fn getStartLineNumber(self: InterfaceDeclaration) -> int;
```
## InterfaceDeclaration::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: InterfaceDeclaration, i: int) -> Node;
```
## InterfaceDeclaration::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: InterfaceDeclaration, i: int) -> Decorator;
```
## InterfaceDeclaration::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: InterfaceDeclaration) -> TopLevelDO;
```
## InterfaceDeclaration::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: InterfaceDeclaration) -> int;
```
## InterfaceDeclaration::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: InterfaceDeclaration) -> Node;
```
## InterfaceDeclaration::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: InterfaceDeclaration) -> *Node;
```
## InterfaceDeclaration::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: InterfaceDeclaration) -> *Node;
```
## InterfaceDeclaration::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: InterfaceDeclaration) -> *Comment;
```
## InterfaceDeclaration::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: InterfaceDeclaration) -> Symbol;
```
## InterfaceDeclaration::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: InterfaceDeclaration) -> *Decorator;
```
## InterfaceDeclaration::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: InterfaceDeclaration, i: int) -> Modifier;
```
## InterfaceDeclaration::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: InterfaceDeclaration) -> string;
```
## InterfaceDeclaration::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *InterfaceDeclaration;
```
## InterfaceDeclaration::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: InterfaceDeclaration) -> Location;
```
