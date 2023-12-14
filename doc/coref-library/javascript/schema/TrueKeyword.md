# TrueKeyword

Primary key: `id: int`

```rust
schema TrueKeyword {
  @primary id: int,
}
```
## TrueKeyword::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: TrueKeyword) -> Location;
```
## TrueKeyword::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: TrueKeyword) -> Symbol;
```
## TrueKeyword::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: TrueKeyword) -> *Decorator;
```
## TrueKeyword::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: TrueKeyword) -> string;
```
## TrueKeyword::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: TrueKeyword, i: int) -> Modifier;
```
## TrueKeyword::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: TrueKeyword) -> *Comment;
```
## TrueKeyword::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: TrueKeyword) -> *Node;
```
## TrueKeyword::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: TrueKeyword) -> *Node;
```
## TrueKeyword::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: TrueKeyword) -> Node;
```
## TrueKeyword::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: TrueKeyword) -> int;
```
## TrueKeyword::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: TrueKeyword) -> TopLevelDO;
```
## TrueKeyword::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: TrueKeyword, i: int) -> Decorator;
```
## TrueKeyword::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: TrueKeyword) -> int;
```
## TrueKeyword::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: TrueKeyword) -> *Modifier;
```
## TrueKeyword::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: TrueKeyword) -> int;
```
## TrueKeyword::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: TrueKeyword, i: int) -> Node;
```
## TrueKeyword::getStartLineNumber

```rust
pub fn getStartLineNumber(self: TrueKeyword) -> int;
```
## TrueKeyword::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: TrueKeyword) -> *FunctionLikeDeclaration;
```
## TrueKeyword::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: TrueKeyword, level: int) -> *Node;
```
## TrueKeyword::getEndLineNumber

```rust
pub fn getEndLineNumber(self: TrueKeyword) -> int;
```
## TrueKeyword::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: TrueKeyword) -> string;
```
## TrueKeyword::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: TrueKeyword, level: int) -> Node;
```
## TrueKeyword::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: TrueKeyword) -> File;
```
## TrueKeyword::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: TrueKeyword) -> *Comment;
```
## TrueKeyword::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: TrueKeyword) -> *Comment;
```
## TrueKeyword::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: TrueKeyword) -> Node;
```
## TrueKeyword::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: TrueKeyword) -> FunctionLikeDeclaration;
```
## TrueKeyword::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: TrueKeyword) -> int;
```
## TrueKeyword::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: TrueKeyword) -> int;
```
## TrueKeyword::getIndex

```rust
pub fn getIndex(self: TrueKeyword) -> int;
```
## TrueKeyword::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: TrueKeyword) -> *Node;
```
## TrueKeyword::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *TrueKeyword;
```
