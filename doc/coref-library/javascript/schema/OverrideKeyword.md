# OverrideKeyword

Inherit from [Modifier](./Modifier.md)

Primary key: `id: int`

```rust
schema OverrideKeyword extends Modifier {
  @primary id: int,
}
```
## OverrideKeyword::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: OverrideKeyword) -> *Node;
```
## OverrideKeyword::getIndex

```rust
pub fn getIndex(self: OverrideKeyword) -> int;
```
## OverrideKeyword::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: OverrideKeyword) -> int;
```
## OverrideKeyword::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: OverrideKeyword) -> int;
```
## OverrideKeyword::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: OverrideKeyword) -> FunctionLikeDeclaration;
```
## OverrideKeyword::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: OverrideKeyword) -> Node;
```
## OverrideKeyword::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: OverrideKeyword) -> *Comment;
```
## OverrideKeyword::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: OverrideKeyword) -> *Comment;
```
## OverrideKeyword::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: OverrideKeyword) -> File;
```
## OverrideKeyword::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: OverrideKeyword, level: int) -> Node;
```
## OverrideKeyword::getEndLineNumber

```rust
pub fn getEndLineNumber(self: OverrideKeyword) -> int;
```
## OverrideKeyword::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: OverrideKeyword) -> string;
```
## OverrideKeyword::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: OverrideKeyword) -> *FunctionLikeDeclaration;
```
## OverrideKeyword::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: OverrideKeyword, level: int) -> *Node;
```
## OverrideKeyword::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: OverrideKeyword) -> int;
```
## OverrideKeyword::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: OverrideKeyword) -> *Modifier;
```
## OverrideKeyword::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: OverrideKeyword) -> int;
```
## OverrideKeyword::getStartLineNumber

```rust
pub fn getStartLineNumber(self: OverrideKeyword) -> int;
```
## OverrideKeyword::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: OverrideKeyword, i: int) -> Node;
```
## OverrideKeyword::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: OverrideKeyword, i: int) -> Decorator;
```
## OverrideKeyword::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: OverrideKeyword) -> TopLevelDO;
```
## OverrideKeyword::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: OverrideKeyword) -> int;
```
## OverrideKeyword::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: OverrideKeyword) -> Node;
```
## OverrideKeyword::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: OverrideKeyword) -> *Node;
```
## OverrideKeyword::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: OverrideKeyword) -> *Node;
```
## OverrideKeyword::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: OverrideKeyword) -> *Comment;
```
## OverrideKeyword::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: OverrideKeyword) -> Symbol;
```
## OverrideKeyword::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: OverrideKeyword) -> *Decorator;
```
## OverrideKeyword::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: OverrideKeyword, i: int) -> Modifier;
```
## OverrideKeyword::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: OverrideKeyword) -> string;
```
## OverrideKeyword::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *OverrideKeyword;
```
## OverrideKeyword::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: OverrideKeyword) -> Location;
```
