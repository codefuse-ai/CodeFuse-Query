# ConstKeyword

Inherit from [Modifier](./Modifier.md)

Primary key: `id: int`

```rust
schema ConstKeyword extends Modifier {
  @primary id: int
}
```
## ConstKeyword::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: ConstKeyword) -> *Node;
```
## ConstKeyword::getIndex

```rust
pub fn getIndex(self: ConstKeyword) -> int;
```
## ConstKeyword::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: ConstKeyword) -> int;
```
## ConstKeyword::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ConstKeyword) -> int;
```
## ConstKeyword::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: ConstKeyword) -> FunctionLikeDeclaration;
```
## ConstKeyword::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: ConstKeyword) -> Node;
```
## ConstKeyword::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: ConstKeyword) -> *Comment;
```
## ConstKeyword::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: ConstKeyword) -> *Comment;
```
## ConstKeyword::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: ConstKeyword) -> File;
```
## ConstKeyword::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: ConstKeyword, level: int) -> Node;
```
## ConstKeyword::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ConstKeyword) -> int;
```
## ConstKeyword::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: ConstKeyword) -> string;
```
## ConstKeyword::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ConstKeyword) -> *FunctionLikeDeclaration;
```
## ConstKeyword::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: ConstKeyword, level: int) -> *Node;
```
## ConstKeyword::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: ConstKeyword) -> int;
```
## ConstKeyword::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: ConstKeyword) -> *Modifier;
```
## ConstKeyword::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ConstKeyword) -> int;
```
## ConstKeyword::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ConstKeyword) -> int;
```
## ConstKeyword::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: ConstKeyword, i: int) -> Node;
```
## ConstKeyword::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: ConstKeyword, i: int) -> Decorator;
```
## ConstKeyword::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: ConstKeyword) -> TopLevelDO;
```
## ConstKeyword::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: ConstKeyword) -> int;
```
## ConstKeyword::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: ConstKeyword) -> Node;
```
## ConstKeyword::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: ConstKeyword) -> *Node;
```
## ConstKeyword::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: ConstKeyword) -> *Node;
```
## ConstKeyword::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: ConstKeyword) -> *Comment;
```
## ConstKeyword::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: ConstKeyword) -> Symbol;
```
## ConstKeyword::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: ConstKeyword) -> *Decorator;
```
## ConstKeyword::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: ConstKeyword, i: int) -> Modifier;
```
## ConstKeyword::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: ConstKeyword) -> string;
```
## ConstKeyword::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *ConstKeyword;
```
## ConstKeyword::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: ConstKeyword) -> Location;
```
