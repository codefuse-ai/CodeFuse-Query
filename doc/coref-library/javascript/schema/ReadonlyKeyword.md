# ReadonlyKeyword

Primary key: `id: int`

```rust
schema ReadonlyKeyword {
  @primary id: int,
}
```
## ReadonlyKeyword::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: ReadonlyKeyword) -> *Node;
```
## ReadonlyKeyword::getIndex

```rust
pub fn getIndex(self: ReadonlyKeyword) -> int;
```
## ReadonlyKeyword::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: ReadonlyKeyword) -> int;
```
## ReadonlyKeyword::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ReadonlyKeyword) -> int;
```
## ReadonlyKeyword::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: ReadonlyKeyword) -> FunctionLikeDeclaration;
```
## ReadonlyKeyword::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: ReadonlyKeyword) -> Node;
```
## ReadonlyKeyword::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: ReadonlyKeyword) -> *Comment;
```
## ReadonlyKeyword::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: ReadonlyKeyword) -> *Comment;
```
## ReadonlyKeyword::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: ReadonlyKeyword) -> File;
```
## ReadonlyKeyword::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: ReadonlyKeyword, level: int) -> Node;
```
## ReadonlyKeyword::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ReadonlyKeyword) -> int;
```
## ReadonlyKeyword::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: ReadonlyKeyword) -> string;
```
## ReadonlyKeyword::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ReadonlyKeyword) -> *FunctionLikeDeclaration;
```
## ReadonlyKeyword::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: ReadonlyKeyword, level: int) -> *Node;
```
## ReadonlyKeyword::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: ReadonlyKeyword) -> int;
```
## ReadonlyKeyword::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: ReadonlyKeyword) -> *Modifier;
```
## ReadonlyKeyword::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ReadonlyKeyword) -> int;
```
## ReadonlyKeyword::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ReadonlyKeyword) -> int;
```
## ReadonlyKeyword::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: ReadonlyKeyword, i: int) -> Node;
```
## ReadonlyKeyword::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: ReadonlyKeyword, i: int) -> Decorator;
```
## ReadonlyKeyword::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: ReadonlyKeyword) -> TopLevelDO;
```
## ReadonlyKeyword::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: ReadonlyKeyword) -> int;
```
## ReadonlyKeyword::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: ReadonlyKeyword) -> Node;
```
## ReadonlyKeyword::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: ReadonlyKeyword) -> *Node;
```
## ReadonlyKeyword::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: ReadonlyKeyword) -> *Node;
```
## ReadonlyKeyword::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: ReadonlyKeyword) -> *Comment;
```
## ReadonlyKeyword::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: ReadonlyKeyword) -> Symbol;
```
## ReadonlyKeyword::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: ReadonlyKeyword) -> *Decorator;
```
## ReadonlyKeyword::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: ReadonlyKeyword, i: int) -> Modifier;
```
## ReadonlyKeyword::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: ReadonlyKeyword) -> string;
```
## ReadonlyKeyword::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *ReadonlyKeyword;
```
## ReadonlyKeyword::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: ReadonlyKeyword) -> Location;
```
