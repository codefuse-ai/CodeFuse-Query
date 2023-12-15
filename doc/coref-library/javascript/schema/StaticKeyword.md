# StaticKeyword

Inherit from [Modifier](./Modifier.md)

Primary key: `id: int`

```rust
schema StaticKeyword extends Modifier {
  @primary id: int
}
```
## StaticKeyword::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: StaticKeyword) -> *Node;
```
## StaticKeyword::getIndex

```rust
pub fn getIndex(self: StaticKeyword) -> int;
```
## StaticKeyword::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: StaticKeyword) -> int;
```
## StaticKeyword::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: StaticKeyword) -> int;
```
## StaticKeyword::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: StaticKeyword) -> FunctionLikeDeclaration;
```
## StaticKeyword::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: StaticKeyword) -> Node;
```
## StaticKeyword::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: StaticKeyword) -> *Comment;
```
## StaticKeyword::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: StaticKeyword) -> *Comment;
```
## StaticKeyword::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: StaticKeyword) -> File;
```
## StaticKeyword::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: StaticKeyword, level: int) -> Node;
```
## StaticKeyword::getEndLineNumber

```rust
pub fn getEndLineNumber(self: StaticKeyword) -> int;
```
## StaticKeyword::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: StaticKeyword) -> string;
```
## StaticKeyword::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: StaticKeyword) -> *FunctionLikeDeclaration;
```
## StaticKeyword::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: StaticKeyword, level: int) -> *Node;
```
## StaticKeyword::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: StaticKeyword) -> int;
```
## StaticKeyword::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: StaticKeyword) -> *Modifier;
```
## StaticKeyword::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: StaticKeyword) -> int;
```
## StaticKeyword::getStartLineNumber

```rust
pub fn getStartLineNumber(self: StaticKeyword) -> int;
```
## StaticKeyword::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: StaticKeyword, i: int) -> Node;
```
## StaticKeyword::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: StaticKeyword, i: int) -> Decorator;
```
## StaticKeyword::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: StaticKeyword) -> TopLevelDO;
```
## StaticKeyword::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: StaticKeyword) -> int;
```
## StaticKeyword::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: StaticKeyword) -> Node;
```
## StaticKeyword::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: StaticKeyword) -> *Node;
```
## StaticKeyword::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: StaticKeyword) -> *Node;
```
## StaticKeyword::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: StaticKeyword) -> *Comment;
```
## StaticKeyword::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: StaticKeyword) -> Symbol;
```
## StaticKeyword::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: StaticKeyword) -> *Decorator;
```
## StaticKeyword::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: StaticKeyword, i: int) -> Modifier;
```
## StaticKeyword::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: StaticKeyword) -> string;
```
## StaticKeyword::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *StaticKeyword;
```
## StaticKeyword::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: StaticKeyword) -> Location;
```
