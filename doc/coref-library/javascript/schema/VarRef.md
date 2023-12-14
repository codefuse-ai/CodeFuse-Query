# VarRef

Inherit from [BindingName](./BindingName.md)

Primary key: `id: int`

```rust
schema VarRef extends BindingName {
  @primary id: int,
}
```
## VarRef::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: VarRef) -> *Comment;
```
## VarRef::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: VarRef) -> *Node;
```
## VarRef::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: VarRef) -> Location;
```
## VarRef::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: VarRef) -> Symbol;
```
## VarRef::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: VarRef) -> *Decorator;
```
## VarRef::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: VarRef) -> string;
```
## VarRef::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: VarRef, i: int) -> Modifier;
```
## VarRef::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: VarRef) -> Node;
```
## VarRef::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: VarRef) -> *Node;
```
## VarRef::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: VarRef) -> TopLevelDO;
```
## VarRef::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: VarRef, i: int) -> Decorator;
```
## VarRef::getName

```rust
pub fn getName(self: VarRef) -> string;
```
## VarRef::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: VarRef) -> int;
```
## VarRef::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: VarRef) -> int;
```
## VarRef::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: VarRef) -> *Modifier;
```
## VarRef::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: VarRef) -> int;
```
## VarRef::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: VarRef, i: int) -> Node;
```
## VarRef::getStartLineNumber

```rust
pub fn getStartLineNumber(self: VarRef) -> int;
```
## VarRef::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: VarRef) -> *FunctionLikeDeclaration;
```
## VarRef::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: VarRef, level: int) -> *Node;
```
## VarRef::getEndLineNumber

```rust
pub fn getEndLineNumber(self: VarRef) -> int;
```
## VarRef::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: VarRef) -> string;
```
## VarRef::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: VarRef, level: int) -> Node;
```
## VarRef::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: VarRef) -> File;
```
## VarRef::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: VarRef) -> *Comment;
```
## VarRef::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: VarRef) -> *Comment;
```
## VarRef::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: VarRef) -> Node;
```
## VarRef::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: VarRef) -> FunctionLikeDeclaration;
```
## VarRef::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: VarRef) -> int;
```
## VarRef::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: VarRef) -> int;
```
## VarRef::getIndex

```rust
pub fn getIndex(self: VarRef) -> int;
```
## VarRef::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: VarRef) -> *Node;
```
## VarRef::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *VarRef;
```
