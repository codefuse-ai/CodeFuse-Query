# MissingDeclaration

Inherit from [DeclarationStatement](./DeclarationStatement.md)

Primary key: `id: int`

```rust
schema MissingDeclaration extends DeclarationStatement {
  @primary id: int,
}
```
## MissingDeclaration::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: MissingDeclaration) -> *Node;
```
## MissingDeclaration::getIndex

```rust
pub fn getIndex(self: MissingDeclaration) -> int;
```
## MissingDeclaration::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: MissingDeclaration) -> int;
```
## MissingDeclaration::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: MissingDeclaration) -> int;
```
## MissingDeclaration::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: MissingDeclaration) -> FunctionLikeDeclaration;
```
## MissingDeclaration::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: MissingDeclaration) -> Node;
```
## MissingDeclaration::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: MissingDeclaration) -> *Comment;
```
## MissingDeclaration::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: MissingDeclaration) -> *Comment;
```
## MissingDeclaration::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: MissingDeclaration) -> File;
```
## MissingDeclaration::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: MissingDeclaration, level: int) -> Node;
```
## MissingDeclaration::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: MissingDeclaration) -> *FunctionLikeDeclaration;
```
## MissingDeclaration::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: MissingDeclaration, level: int) -> *Node;
```
## MissingDeclaration::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: MissingDeclaration) -> int;
```
## MissingDeclaration::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: MissingDeclaration) -> *Modifier;
```
## MissingDeclaration::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: MissingDeclaration) -> int;
```
## MissingDeclaration::getStartLineNumber

```rust
pub fn getStartLineNumber(self: MissingDeclaration) -> int;
```
## MissingDeclaration::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: MissingDeclaration, i: int) -> Node;
```
## MissingDeclaration::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: MissingDeclaration, i: int) -> Decorator;
```
## MissingDeclaration::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: MissingDeclaration) -> TopLevelDO;
```
## MissingDeclaration::getName

```rust
pub fn getName(self: MissingDeclaration) -> Identifier;
```
## MissingDeclaration::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: MissingDeclaration) -> int;
```
## MissingDeclaration::haveName

```rust
pub fn haveName(self: MissingDeclaration) -> bool;
```
## MissingDeclaration::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: MissingDeclaration) -> *Node;
```
## MissingDeclaration::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: MissingDeclaration) -> Node;
```
## MissingDeclaration::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: MissingDeclaration) -> *Comment;
```
## MissingDeclaration::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: MissingDeclaration) -> *Node;
```
## MissingDeclaration::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: MissingDeclaration) -> Symbol;
```
## MissingDeclaration::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: MissingDeclaration) -> *Decorator;
```
## MissingDeclaration::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: MissingDeclaration, i: int) -> Modifier;
```
## MissingDeclaration::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: MissingDeclaration) -> string;
```
## MissingDeclaration::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *MissingDeclaration;
```
## MissingDeclaration::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: MissingDeclaration) -> Location;
```
## MissingDeclaration::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: MissingDeclaration) -> string;
```
## MissingDeclaration::getEndLineNumber

```rust
pub fn getEndLineNumber(self: MissingDeclaration) -> int;
```
