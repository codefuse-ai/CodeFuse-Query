# DeclareKeyword

Inherit from [Modifier](./Modifier.md)

Primary key: `id: int`

```rust
schema DeclareKeyword extends Modifier {
  @primary id: int,
}
```
## DeclareKeyword::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: DeclareKeyword) -> *Node;
```
## DeclareKeyword::getIndex

```rust
pub fn getIndex(self: DeclareKeyword) -> int;
```
## DeclareKeyword::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: DeclareKeyword) -> int;
```
## DeclareKeyword::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: DeclareKeyword) -> int;
```
## DeclareKeyword::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: DeclareKeyword) -> FunctionLikeDeclaration;
```
## DeclareKeyword::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: DeclareKeyword) -> Node;
```
## DeclareKeyword::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: DeclareKeyword) -> *Comment;
```
## DeclareKeyword::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: DeclareKeyword) -> *Comment;
```
## DeclareKeyword::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: DeclareKeyword) -> File;
```
## DeclareKeyword::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: DeclareKeyword, level: int) -> Node;
```
## DeclareKeyword::getEndLineNumber

```rust
pub fn getEndLineNumber(self: DeclareKeyword) -> int;
```
## DeclareKeyword::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: DeclareKeyword) -> string;
```
## DeclareKeyword::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: DeclareKeyword) -> *FunctionLikeDeclaration;
```
## DeclareKeyword::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: DeclareKeyword, level: int) -> *Node;
```
## DeclareKeyword::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: DeclareKeyword) -> int;
```
## DeclareKeyword::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: DeclareKeyword) -> *Modifier;
```
## DeclareKeyword::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: DeclareKeyword) -> int;
```
## DeclareKeyword::getStartLineNumber

```rust
pub fn getStartLineNumber(self: DeclareKeyword) -> int;
```
## DeclareKeyword::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: DeclareKeyword, i: int) -> Node;
```
## DeclareKeyword::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: DeclareKeyword, i: int) -> Decorator;
```
## DeclareKeyword::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: DeclareKeyword) -> TopLevelDO;
```
## DeclareKeyword::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: DeclareKeyword) -> int;
```
## DeclareKeyword::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: DeclareKeyword) -> Node;
```
## DeclareKeyword::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: DeclareKeyword) -> *Node;
```
## DeclareKeyword::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: DeclareKeyword) -> *Node;
```
## DeclareKeyword::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: DeclareKeyword) -> *Comment;
```
## DeclareKeyword::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: DeclareKeyword) -> Symbol;
```
## DeclareKeyword::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: DeclareKeyword) -> *Decorator;
```
## DeclareKeyword::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: DeclareKeyword, i: int) -> Modifier;
```
## DeclareKeyword::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: DeclareKeyword) -> string;
```
## DeclareKeyword::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *DeclareKeyword;
```
## DeclareKeyword::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: DeclareKeyword) -> Location;
```
