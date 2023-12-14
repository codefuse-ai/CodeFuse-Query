# ClassExpressionDeclaration

Inherit from [ClassLikeDeclaration](./ClassLikeDeclaration.md)

Primary key: `id: int`

```rust
schema ClassExpressionDeclaration extends ClassLikeDeclaration {
  @primary id: int,
}
```
## ClassExpressionDeclaration::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: ClassExpressionDeclaration) -> Location;
```
## ClassExpressionDeclaration::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: ClassExpressionDeclaration) -> Symbol;
```
## ClassExpressionDeclaration::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: ClassExpressionDeclaration) -> *Decorator;
```
## ClassExpressionDeclaration::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: ClassExpressionDeclaration) -> string;
```
## ClassExpressionDeclaration::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: ClassExpressionDeclaration, i: int) -> Modifier;
```
## ClassExpressionDeclaration::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: ClassExpressionDeclaration) -> *Comment;
```
## ClassExpressionDeclaration::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: ClassExpressionDeclaration) -> *Node;
```
## ClassExpressionDeclaration::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: ClassExpressionDeclaration) -> *Node;
```
## ClassExpressionDeclaration::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: ClassExpressionDeclaration) -> Node;
```
## ClassExpressionDeclaration::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: ClassExpressionDeclaration) -> int;
```
## ClassExpressionDeclaration::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: ClassExpressionDeclaration) -> TopLevelDO;
```
## ClassExpressionDeclaration::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: ClassExpressionDeclaration, i: int) -> Decorator;
```
## ClassExpressionDeclaration::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: ClassExpressionDeclaration) -> int;
```
## ClassExpressionDeclaration::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: ClassExpressionDeclaration) -> *Modifier;
```
## ClassExpressionDeclaration::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ClassExpressionDeclaration) -> int;
```
## ClassExpressionDeclaration::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: ClassExpressionDeclaration, i: int) -> Node;
```
## ClassExpressionDeclaration::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ClassExpressionDeclaration) -> int;
```
## ClassExpressionDeclaration::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ClassExpressionDeclaration) -> *FunctionLikeDeclaration;
```
## ClassExpressionDeclaration::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: ClassExpressionDeclaration, level: int) -> *Node;
```
## ClassExpressionDeclaration::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ClassExpressionDeclaration) -> int;
```
## ClassExpressionDeclaration::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: ClassExpressionDeclaration) -> string;
```
## ClassExpressionDeclaration::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: ClassExpressionDeclaration, level: int) -> Node;
```
## ClassExpressionDeclaration::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: ClassExpressionDeclaration) -> File;
```
## ClassExpressionDeclaration::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: ClassExpressionDeclaration) -> *Comment;
```
## ClassExpressionDeclaration::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: ClassExpressionDeclaration) -> *Comment;
```
## ClassExpressionDeclaration::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: ClassExpressionDeclaration) -> Node;
```
## ClassExpressionDeclaration::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: ClassExpressionDeclaration) -> FunctionLikeDeclaration;
```
## ClassExpressionDeclaration::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ClassExpressionDeclaration) -> int;
```
## ClassExpressionDeclaration::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: ClassExpressionDeclaration) -> int;
```
## ClassExpressionDeclaration::getIndex

```rust
pub fn getIndex(self: ClassExpressionDeclaration) -> int;
```
## ClassExpressionDeclaration::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: ClassExpressionDeclaration) -> *Node;
```
## ClassExpressionDeclaration::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *ClassExpressionDeclaration;
```
