# ImportDeclaration

Inherit from [DeclarationStatement](./DeclarationStatement.md)

Primary key: `id: int`

```rust
schema ImportDeclaration extends DeclarationStatement {
  @primary id: int
}
```
## ImportDeclaration::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: ImportDeclaration) -> *Node;
```
## ImportDeclaration::getIndex

```rust
pub fn getIndex(self: ImportDeclaration) -> int;
```
## ImportDeclaration::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: ImportDeclaration) -> int;
```
## ImportDeclaration::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ImportDeclaration) -> int;
```
## ImportDeclaration::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: ImportDeclaration) -> FunctionLikeDeclaration;
```
## ImportDeclaration::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: ImportDeclaration) -> Node;
```
## ImportDeclaration::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: ImportDeclaration) -> *Comment;
```
## ImportDeclaration::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: ImportDeclaration) -> *Comment;
```
## ImportDeclaration::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: ImportDeclaration) -> File;
```
## ImportDeclaration::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: ImportDeclaration, level: int) -> Node;
```
## ImportDeclaration::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ImportDeclaration) -> int;
```
## ImportDeclaration::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: ImportDeclaration) -> string;
```
## ImportDeclaration::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ImportDeclaration) -> *FunctionLikeDeclaration;
```
## ImportDeclaration::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: ImportDeclaration, level: int) -> *Node;
```
## ImportDeclaration::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: ImportDeclaration) -> int;
```
## ImportDeclaration::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: ImportDeclaration) -> *Modifier;
```
## ImportDeclaration::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ImportDeclaration) -> int;
```
## ImportDeclaration::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ImportDeclaration) -> int;
```
## ImportDeclaration::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: ImportDeclaration, i: int) -> Node;
```
## ImportDeclaration::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: ImportDeclaration, i: int) -> Decorator;
```
## ImportDeclaration::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: ImportDeclaration) -> TopLevelDO;
```
## ImportDeclaration::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: ImportDeclaration) -> int;
```
## ImportDeclaration::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: ImportDeclaration) -> Node;
```
## ImportDeclaration::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: ImportDeclaration) -> *Node;
```
## ImportDeclaration::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: ImportDeclaration) -> *Node;
```
## ImportDeclaration::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: ImportDeclaration) -> *Comment;
```
## ImportDeclaration::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: ImportDeclaration) -> Symbol;
```
## ImportDeclaration::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: ImportDeclaration) -> *Decorator;
```
## ImportDeclaration::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: ImportDeclaration, i: int) -> Modifier;
```
## ImportDeclaration::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: ImportDeclaration) -> string;
```
## ImportDeclaration::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *ImportDeclaration;
```
## ImportDeclaration::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: ImportDeclaration) -> Location;
```
