# MethodSignature

Inherit from [TypeElement](./TypeElement.md)

Primary key: `id: int`

```rust
schema MethodSignature extends TypeElement {
  @primary id: int,
}
```
## MethodSignature::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: MethodSignature) -> Location;
```
## MethodSignature::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: MethodSignature) -> Symbol;
```
## MethodSignature::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: MethodSignature) -> *Decorator;
```
## MethodSignature::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: MethodSignature) -> string;
```
## MethodSignature::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: MethodSignature, i: int) -> Modifier;
```
## MethodSignature::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: MethodSignature) -> *Comment;
```
## MethodSignature::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: MethodSignature) -> *Node;
```
## MethodSignature::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: MethodSignature) -> *Node;
```
## MethodSignature::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: MethodSignature) -> Node;
```
## MethodSignature::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: MethodSignature) -> int;
```
## MethodSignature::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: MethodSignature) -> TopLevelDO;
```
## MethodSignature::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: MethodSignature, i: int) -> Decorator;
```
## MethodSignature::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: MethodSignature) -> int;
```
## MethodSignature::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: MethodSignature) -> *Modifier;
```
## MethodSignature::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: MethodSignature) -> int;
```
## MethodSignature::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: MethodSignature, i: int) -> Node;
```
## MethodSignature::getStartLineNumber

```rust
pub fn getStartLineNumber(self: MethodSignature) -> int;
```
## MethodSignature::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: MethodSignature) -> *FunctionLikeDeclaration;
```
## MethodSignature::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: MethodSignature, level: int) -> *Node;
```
## MethodSignature::getEndLineNumber

```rust
pub fn getEndLineNumber(self: MethodSignature) -> int;
```
## MethodSignature::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: MethodSignature) -> string;
```
## MethodSignature::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: MethodSignature, level: int) -> Node;
```
## MethodSignature::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: MethodSignature) -> File;
```
## MethodSignature::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: MethodSignature) -> *Comment;
```
## MethodSignature::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: MethodSignature) -> *Comment;
```
## MethodSignature::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: MethodSignature) -> Node;
```
## MethodSignature::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: MethodSignature) -> FunctionLikeDeclaration;
```
## MethodSignature::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: MethodSignature) -> int;
```
## MethodSignature::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: MethodSignature) -> int;
```
## MethodSignature::getIndex

```rust
pub fn getIndex(self: MethodSignature) -> int;
```
## MethodSignature::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: MethodSignature) -> *Node;
```
## MethodSignature::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *MethodSignature;
```
