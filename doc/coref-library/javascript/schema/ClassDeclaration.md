# ClassDeclaration

Inherit from [ClassLikeDeclaration](./ClassLikeDeclaration.md)

Primary key: `id: int`

```rust
schema ClassDeclaration extends ClassLikeDeclaration {
  @primary id: int
}
```
## ClassDeclaration::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: ClassDeclaration) -> Location;
```
## ClassDeclaration::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: ClassDeclaration) -> Symbol;
```
## ClassDeclaration::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: ClassDeclaration) -> *Decorator;
```
## ClassDeclaration::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: ClassDeclaration) -> string;
```
## ClassDeclaration::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: ClassDeclaration, i: int) -> Modifier;
```
## ClassDeclaration::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: ClassDeclaration) -> *Comment;
```
## ClassDeclaration::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: ClassDeclaration) -> *Node;
```
## ClassDeclaration::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: ClassDeclaration) -> *Node;
```
## ClassDeclaration::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: ClassDeclaration) -> Node;
```
## ClassDeclaration::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: ClassDeclaration) -> int;
```
## ClassDeclaration::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: ClassDeclaration) -> TopLevelDO;
```
## ClassDeclaration::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: ClassDeclaration, i: int) -> Decorator;
```
## ClassDeclaration::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: ClassDeclaration) -> int;
```
## ClassDeclaration::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: ClassDeclaration) -> *Modifier;
```
## ClassDeclaration::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ClassDeclaration) -> int;
```
## ClassDeclaration::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: ClassDeclaration, i: int) -> Node;
```
## ClassDeclaration::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ClassDeclaration) -> int;
```
## ClassDeclaration::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ClassDeclaration) -> *FunctionLikeDeclaration;
```
## ClassDeclaration::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: ClassDeclaration, level: int) -> *Node;
```
## ClassDeclaration::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ClassDeclaration) -> int;
```
## ClassDeclaration::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: ClassDeclaration) -> string;
```
## ClassDeclaration::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: ClassDeclaration, level: int) -> Node;
```
## ClassDeclaration::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: ClassDeclaration) -> File;
```
## ClassDeclaration::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: ClassDeclaration) -> *Comment;
```
## ClassDeclaration::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: ClassDeclaration) -> *Comment;
```
## ClassDeclaration::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: ClassDeclaration) -> Node;
```
## ClassDeclaration::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: ClassDeclaration) -> FunctionLikeDeclaration;
```
## ClassDeclaration::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ClassDeclaration) -> int;
```
## ClassDeclaration::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: ClassDeclaration) -> int;
```
## ClassDeclaration::getIndex

```rust
pub fn getIndex(self: ClassDeclaration) -> int;
```
## ClassDeclaration::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: ClassDeclaration) -> *Node;
```
## ClassDeclaration::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *ClassDeclaration;
```
