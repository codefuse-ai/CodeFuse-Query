# ConstructSignatureDeclaration

Inherit from [TypeElement](./TypeElement.md)

Primary key: `id: int`

```rust
schema ConstructSignatureDeclaration extends TypeElement {
  @primary id: int
}
```
## ConstructSignatureDeclaration::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: ConstructSignatureDeclaration) -> Location;
```
## ConstructSignatureDeclaration::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: ConstructSignatureDeclaration) -> Symbol;
```
## ConstructSignatureDeclaration::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: ConstructSignatureDeclaration) -> *Decorator;
```
## ConstructSignatureDeclaration::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: ConstructSignatureDeclaration) -> string;
```
## ConstructSignatureDeclaration::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: ConstructSignatureDeclaration, i: int) -> Modifier;
```
## ConstructSignatureDeclaration::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: ConstructSignatureDeclaration) -> *Comment;
```
## ConstructSignatureDeclaration::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: ConstructSignatureDeclaration) -> *Node;
```
## ConstructSignatureDeclaration::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: ConstructSignatureDeclaration) -> *Node;
```
## ConstructSignatureDeclaration::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: ConstructSignatureDeclaration) -> Node;
```
## ConstructSignatureDeclaration::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: ConstructSignatureDeclaration) -> int;
```
## ConstructSignatureDeclaration::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: ConstructSignatureDeclaration) -> TopLevelDO;
```
## ConstructSignatureDeclaration::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: ConstructSignatureDeclaration, i: int) -> Decorator;
```
## ConstructSignatureDeclaration::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: ConstructSignatureDeclaration) -> int;
```
## ConstructSignatureDeclaration::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: ConstructSignatureDeclaration) -> *Modifier;
```
## ConstructSignatureDeclaration::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ConstructSignatureDeclaration) -> int;
```
## ConstructSignatureDeclaration::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: ConstructSignatureDeclaration, i: int) -> Node;
```
## ConstructSignatureDeclaration::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ConstructSignatureDeclaration) -> int;
```
## ConstructSignatureDeclaration::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ConstructSignatureDeclaration) -> *FunctionLikeDeclaration;
```
## ConstructSignatureDeclaration::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: ConstructSignatureDeclaration, level: int) -> *Node;
```
## ConstructSignatureDeclaration::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ConstructSignatureDeclaration) -> int;
```
## ConstructSignatureDeclaration::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: ConstructSignatureDeclaration) -> string;
```
## ConstructSignatureDeclaration::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: ConstructSignatureDeclaration, level: int) -> Node;
```
## ConstructSignatureDeclaration::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: ConstructSignatureDeclaration) -> File;
```
## ConstructSignatureDeclaration::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: ConstructSignatureDeclaration) -> *Comment;
```
## ConstructSignatureDeclaration::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: ConstructSignatureDeclaration) -> *Comment;
```
## ConstructSignatureDeclaration::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: ConstructSignatureDeclaration) -> Node;
```
## ConstructSignatureDeclaration::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: ConstructSignatureDeclaration) -> FunctionLikeDeclaration;
```
## ConstructSignatureDeclaration::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ConstructSignatureDeclaration) -> int;
```
## ConstructSignatureDeclaration::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: ConstructSignatureDeclaration) -> int;
```
## ConstructSignatureDeclaration::getIndex

```rust
pub fn getIndex(self: ConstructSignatureDeclaration) -> int;
```
## ConstructSignatureDeclaration::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: ConstructSignatureDeclaration) -> *Node;
```
## ConstructSignatureDeclaration::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *ConstructSignatureDeclaration;
```
