# VoidKeyword

Primary key: `id: int`

```rust
schema VoidKeyword {
  @primary id: int,
}
```
## VoidKeyword::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: VoidKeyword) -> Location;
```
## VoidKeyword::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: VoidKeyword) -> Symbol;
```
## VoidKeyword::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: VoidKeyword) -> *Decorator;
```
## VoidKeyword::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: VoidKeyword) -> string;
```
## VoidKeyword::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: VoidKeyword, i: int) -> Modifier;
```
## VoidKeyword::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: VoidKeyword) -> *Comment;
```
## VoidKeyword::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: VoidKeyword) -> *Node;
```
## VoidKeyword::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: VoidKeyword) -> *Node;
```
## VoidKeyword::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: VoidKeyword) -> Node;
```
## VoidKeyword::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: VoidKeyword) -> int;
```
## VoidKeyword::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: VoidKeyword) -> TopLevelDO;
```
## VoidKeyword::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: VoidKeyword, i: int) -> Decorator;
```
## VoidKeyword::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: VoidKeyword) -> int;
```
## VoidKeyword::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: VoidKeyword) -> *Modifier;
```
## VoidKeyword::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: VoidKeyword) -> int;
```
## VoidKeyword::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: VoidKeyword, i: int) -> Node;
```
## VoidKeyword::getStartLineNumber

```rust
pub fn getStartLineNumber(self: VoidKeyword) -> int;
```
## VoidKeyword::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: VoidKeyword) -> *FunctionLikeDeclaration;
```
## VoidKeyword::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: VoidKeyword, level: int) -> *Node;
```
## VoidKeyword::getEndLineNumber

```rust
pub fn getEndLineNumber(self: VoidKeyword) -> int;
```
## VoidKeyword::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: VoidKeyword) -> string;
```
## VoidKeyword::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: VoidKeyword, level: int) -> Node;
```
## VoidKeyword::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: VoidKeyword) -> File;
```
## VoidKeyword::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: VoidKeyword) -> *Comment;
```
## VoidKeyword::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: VoidKeyword) -> *Comment;
```
## VoidKeyword::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: VoidKeyword) -> Node;
```
## VoidKeyword::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: VoidKeyword) -> FunctionLikeDeclaration;
```
## VoidKeyword::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: VoidKeyword) -> int;
```
## VoidKeyword::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: VoidKeyword) -> int;
```
## VoidKeyword::getIndex

```rust
pub fn getIndex(self: VoidKeyword) -> int;
```
## VoidKeyword::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: VoidKeyword) -> *Node;
```
## VoidKeyword::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *VoidKeyword;
```
