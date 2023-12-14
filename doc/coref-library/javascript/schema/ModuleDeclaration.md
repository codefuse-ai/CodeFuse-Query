# ModuleDeclaration

Primary key: `id: int`

```rust
schema ModuleDeclaration {
  @primary id: int,
}
```
## ModuleDeclaration::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: ModuleDeclaration) -> *Node;
```
## ModuleDeclaration::getIndex

```rust
pub fn getIndex(self: ModuleDeclaration) -> int;
```
## ModuleDeclaration::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: ModuleDeclaration) -> int;
```
## ModuleDeclaration::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ModuleDeclaration) -> int;
```
## ModuleDeclaration::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: ModuleDeclaration) -> FunctionLikeDeclaration;
```
## ModuleDeclaration::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: ModuleDeclaration) -> Node;
```
## ModuleDeclaration::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: ModuleDeclaration) -> *Comment;
```
## ModuleDeclaration::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: ModuleDeclaration) -> *Comment;
```
## ModuleDeclaration::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: ModuleDeclaration) -> File;
```
## ModuleDeclaration::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: ModuleDeclaration, level: int) -> Node;
```
## ModuleDeclaration::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ModuleDeclaration) -> int;
```
## ModuleDeclaration::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: ModuleDeclaration) -> string;
```
## ModuleDeclaration::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ModuleDeclaration) -> *FunctionLikeDeclaration;
```
## ModuleDeclaration::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: ModuleDeclaration, level: int) -> *Node;
```
## ModuleDeclaration::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: ModuleDeclaration) -> int;
```
## ModuleDeclaration::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: ModuleDeclaration) -> *Modifier;
```
## ModuleDeclaration::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ModuleDeclaration) -> int;
```
## ModuleDeclaration::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ModuleDeclaration) -> int;
```
## ModuleDeclaration::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: ModuleDeclaration, i: int) -> Node;
```
## ModuleDeclaration::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: ModuleDeclaration, i: int) -> Decorator;
```
## ModuleDeclaration::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: ModuleDeclaration) -> TopLevelDO;
```
## ModuleDeclaration::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: ModuleDeclaration) -> int;
```
## ModuleDeclaration::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: ModuleDeclaration) -> Node;
```
## ModuleDeclaration::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: ModuleDeclaration) -> *Node;
```
## ModuleDeclaration::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: ModuleDeclaration) -> *Node;
```
## ModuleDeclaration::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: ModuleDeclaration) -> *Comment;
```
## ModuleDeclaration::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: ModuleDeclaration) -> Symbol;
```
## ModuleDeclaration::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: ModuleDeclaration) -> *Decorator;
```
## ModuleDeclaration::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: ModuleDeclaration, i: int) -> Modifier;
```
## ModuleDeclaration::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: ModuleDeclaration) -> string;
```
## ModuleDeclaration::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *ModuleDeclaration;
```
## ModuleDeclaration::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: ModuleDeclaration) -> Location;
```
