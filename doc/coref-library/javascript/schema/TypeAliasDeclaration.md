# TypeAliasDeclaration

Inherit from [DeclarationStatement](./DeclarationStatement.md)

Primary key: `id: int`

```rust
schema TypeAliasDeclaration extends DeclarationStatement {
  @primary id: int
}
```
## TypeAliasDeclaration::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: TypeAliasDeclaration) -> *Node;
```
## TypeAliasDeclaration::getIndex

```rust
pub fn getIndex(self: TypeAliasDeclaration) -> int;
```
## TypeAliasDeclaration::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: TypeAliasDeclaration) -> int;
```
## TypeAliasDeclaration::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: TypeAliasDeclaration) -> int;
```
## TypeAliasDeclaration::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: TypeAliasDeclaration) -> FunctionLikeDeclaration;
```
## TypeAliasDeclaration::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: TypeAliasDeclaration) -> Node;
```
## TypeAliasDeclaration::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: TypeAliasDeclaration) -> *Comment;
```
## TypeAliasDeclaration::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: TypeAliasDeclaration) -> *Comment;
```
## TypeAliasDeclaration::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: TypeAliasDeclaration) -> File;
```
## TypeAliasDeclaration::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: TypeAliasDeclaration, level: int) -> Node;
```
## TypeAliasDeclaration::getEndLineNumber

```rust
pub fn getEndLineNumber(self: TypeAliasDeclaration) -> int;
```
## TypeAliasDeclaration::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: TypeAliasDeclaration) -> string;
```
## TypeAliasDeclaration::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: TypeAliasDeclaration) -> *FunctionLikeDeclaration;
```
## TypeAliasDeclaration::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: TypeAliasDeclaration, level: int) -> *Node;
```
## TypeAliasDeclaration::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: TypeAliasDeclaration) -> int;
```
## TypeAliasDeclaration::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: TypeAliasDeclaration) -> *Modifier;
```
## TypeAliasDeclaration::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: TypeAliasDeclaration) -> int;
```
## TypeAliasDeclaration::getStartLineNumber

```rust
pub fn getStartLineNumber(self: TypeAliasDeclaration) -> int;
```
## TypeAliasDeclaration::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: TypeAliasDeclaration, i: int) -> Node;
```
## TypeAliasDeclaration::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: TypeAliasDeclaration, i: int) -> Decorator;
```
## TypeAliasDeclaration::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: TypeAliasDeclaration) -> TopLevelDO;
```
## TypeAliasDeclaration::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: TypeAliasDeclaration) -> int;
```
## TypeAliasDeclaration::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: TypeAliasDeclaration) -> Node;
```
## TypeAliasDeclaration::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: TypeAliasDeclaration) -> *Node;
```
## TypeAliasDeclaration::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: TypeAliasDeclaration) -> *Node;
```
## TypeAliasDeclaration::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: TypeAliasDeclaration) -> *Comment;
```
## TypeAliasDeclaration::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: TypeAliasDeclaration) -> Symbol;
```
## TypeAliasDeclaration::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: TypeAliasDeclaration) -> *Decorator;
```
## TypeAliasDeclaration::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: TypeAliasDeclaration, i: int) -> Modifier;
```
## TypeAliasDeclaration::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: TypeAliasDeclaration) -> string;
```
## TypeAliasDeclaration::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *TypeAliasDeclaration;
```
## TypeAliasDeclaration::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: TypeAliasDeclaration) -> Location;
```
