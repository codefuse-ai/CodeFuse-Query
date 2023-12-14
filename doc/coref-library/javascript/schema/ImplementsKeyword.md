# ImplementsKeyword

Primary key: `id: int`

```rust
schema ImplementsKeyword {
  @primary id: int,
}
```
## ImplementsKeyword::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: ImplementsKeyword) -> Location;
```
## ImplementsKeyword::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: ImplementsKeyword) -> Symbol;
```
## ImplementsKeyword::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: ImplementsKeyword) -> *Decorator;
```
## ImplementsKeyword::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: ImplementsKeyword) -> string;
```
## ImplementsKeyword::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: ImplementsKeyword, i: int) -> Modifier;
```
## ImplementsKeyword::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: ImplementsKeyword) -> *Comment;
```
## ImplementsKeyword::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: ImplementsKeyword) -> *Node;
```
## ImplementsKeyword::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: ImplementsKeyword) -> *Node;
```
## ImplementsKeyword::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: ImplementsKeyword) -> Node;
```
## ImplementsKeyword::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: ImplementsKeyword) -> int;
```
## ImplementsKeyword::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: ImplementsKeyword) -> TopLevelDO;
```
## ImplementsKeyword::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: ImplementsKeyword, i: int) -> Decorator;
```
## ImplementsKeyword::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: ImplementsKeyword) -> int;
```
## ImplementsKeyword::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: ImplementsKeyword) -> *Modifier;
```
## ImplementsKeyword::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ImplementsKeyword) -> int;
```
## ImplementsKeyword::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: ImplementsKeyword, i: int) -> Node;
```
## ImplementsKeyword::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ImplementsKeyword) -> int;
```
## ImplementsKeyword::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ImplementsKeyword) -> *FunctionLikeDeclaration;
```
## ImplementsKeyword::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: ImplementsKeyword, level: int) -> *Node;
```
## ImplementsKeyword::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ImplementsKeyword) -> int;
```
## ImplementsKeyword::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: ImplementsKeyword) -> string;
```
## ImplementsKeyword::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: ImplementsKeyword, level: int) -> Node;
```
## ImplementsKeyword::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: ImplementsKeyword) -> File;
```
## ImplementsKeyword::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: ImplementsKeyword) -> *Comment;
```
## ImplementsKeyword::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: ImplementsKeyword) -> *Comment;
```
## ImplementsKeyword::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: ImplementsKeyword) -> Node;
```
## ImplementsKeyword::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: ImplementsKeyword) -> FunctionLikeDeclaration;
```
## ImplementsKeyword::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ImplementsKeyword) -> int;
```
## ImplementsKeyword::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: ImplementsKeyword) -> int;
```
## ImplementsKeyword::getIndex

```rust
pub fn getIndex(self: ImplementsKeyword) -> int;
```
## ImplementsKeyword::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: ImplementsKeyword) -> *Node;
```
## ImplementsKeyword::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *ImplementsKeyword;
```
