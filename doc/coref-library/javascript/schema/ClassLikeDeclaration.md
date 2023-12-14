# ClassLikeDeclaration

Primary key: `id: int`

```rust
schema ClassLikeDeclaration {
  @primary id: int,
}
```
## ClassLikeDeclaration::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: ClassLikeDeclaration) -> *Node;
```
## ClassLikeDeclaration::getIndex

```rust
pub fn getIndex(self: ClassLikeDeclaration) -> int;
```
## ClassLikeDeclaration::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: ClassLikeDeclaration) -> int;
```
## ClassLikeDeclaration::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ClassLikeDeclaration) -> int;
```
## ClassLikeDeclaration::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: ClassLikeDeclaration) -> Node;
```
## ClassLikeDeclaration::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: ClassLikeDeclaration) -> FunctionLikeDeclaration;
```
## ClassLikeDeclaration::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: ClassLikeDeclaration) -> File;
```
## ClassLikeDeclaration::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: ClassLikeDeclaration, level: int) -> Node;
```
## ClassLikeDeclaration::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: ClassLikeDeclaration) -> string;
```
## ClassLikeDeclaration::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ClassLikeDeclaration) -> int;
```
## ClassLikeDeclaration::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ClassLikeDeclaration) -> *FunctionLikeDeclaration;
```
## ClassLikeDeclaration::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: ClassLikeDeclaration, level: int) -> *Node;
```
## ClassLikeDeclaration::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: ClassLikeDeclaration) -> int;
```
## ClassLikeDeclaration::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: ClassLikeDeclaration) -> *Modifier;
```
## ClassLikeDeclaration::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ClassLikeDeclaration) -> int;
```
## ClassLikeDeclaration::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ClassLikeDeclaration) -> int;
```
## ClassLikeDeclaration::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: ClassLikeDeclaration, i: int) -> Node;
```
## ClassLikeDeclaration::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: ClassLikeDeclaration, i: int) -> Decorator;
```
## ClassLikeDeclaration::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: ClassLikeDeclaration) -> TopLevelDO;
```
## ClassLikeDeclaration::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: ClassLikeDeclaration) -> int;
```
## ClassLikeDeclaration::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: ClassLikeDeclaration) -> *Comment;
```
## ClassLikeDeclaration::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: ClassLikeDeclaration) -> *Comment;
```
## ClassLikeDeclaration::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: ClassLikeDeclaration) -> Node;
```
## ClassLikeDeclaration::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: ClassLikeDeclaration) -> *Node;
```
## ClassLikeDeclaration::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: ClassLikeDeclaration) -> *Node;
```
## ClassLikeDeclaration::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: ClassLikeDeclaration) -> *Comment;
```
## ClassLikeDeclaration::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: ClassLikeDeclaration, i: int) -> Modifier;
```
## ClassLikeDeclaration::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: ClassLikeDeclaration) -> string;
```
## ClassLikeDeclaration::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: ClassLikeDeclaration) -> *Decorator;
```
## ClassLikeDeclaration::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: ClassLikeDeclaration) -> Symbol;
```
## ClassLikeDeclaration::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: ClassLikeDeclaration) -> Location;
```
## ClassLikeDeclaration::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *ClassLikeDeclaration;
```
