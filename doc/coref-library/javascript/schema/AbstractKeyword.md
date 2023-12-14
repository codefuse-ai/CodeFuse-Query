# AbstractKeyword

Primary key: `id: int`

```rust
schema AbstractKeyword {
  @primary id: int,
}
```
## AbstractKeyword::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: AbstractKeyword) -> *Node;
```
## AbstractKeyword::getIndex

```rust
pub fn getIndex(self: AbstractKeyword) -> int;
```
## AbstractKeyword::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: AbstractKeyword) -> int;
```
## AbstractKeyword::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: AbstractKeyword) -> int;
```
## AbstractKeyword::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: AbstractKeyword) -> FunctionLikeDeclaration;
```
## AbstractKeyword::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: AbstractKeyword) -> Node;
```
## AbstractKeyword::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: AbstractKeyword) -> *Comment;
```
## AbstractKeyword::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: AbstractKeyword) -> *Comment;
```
## AbstractKeyword::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: AbstractKeyword) -> File;
```
## AbstractKeyword::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: AbstractKeyword, level: int) -> Node;
```
## AbstractKeyword::getEndLineNumber

```rust
pub fn getEndLineNumber(self: AbstractKeyword) -> int;
```
## AbstractKeyword::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: AbstractKeyword) -> string;
```
## AbstractKeyword::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: AbstractKeyword) -> *FunctionLikeDeclaration;
```
## AbstractKeyword::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: AbstractKeyword, level: int) -> *Node;
```
## AbstractKeyword::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: AbstractKeyword) -> int;
```
## AbstractKeyword::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: AbstractKeyword) -> *Modifier;
```
## AbstractKeyword::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: AbstractKeyword) -> int;
```
## AbstractKeyword::getStartLineNumber

```rust
pub fn getStartLineNumber(self: AbstractKeyword) -> int;
```
## AbstractKeyword::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: AbstractKeyword, i: int) -> Node;
```
## AbstractKeyword::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: AbstractKeyword, i: int) -> Decorator;
```
## AbstractKeyword::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: AbstractKeyword) -> TopLevelDO;
```
## AbstractKeyword::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: AbstractKeyword) -> int;
```
## AbstractKeyword::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: AbstractKeyword) -> Node;
```
## AbstractKeyword::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: AbstractKeyword) -> *Node;
```
## AbstractKeyword::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: AbstractKeyword) -> *Node;
```
## AbstractKeyword::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: AbstractKeyword) -> *Comment;
```
## AbstractKeyword::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: AbstractKeyword) -> Symbol;
```
## AbstractKeyword::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: AbstractKeyword) -> *Decorator;
```
## AbstractKeyword::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: AbstractKeyword, i: int) -> Modifier;
```
## AbstractKeyword::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: AbstractKeyword) -> string;
```
## AbstractKeyword::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *AbstractKeyword;
```
## AbstractKeyword::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: AbstractKeyword) -> Location;
```
