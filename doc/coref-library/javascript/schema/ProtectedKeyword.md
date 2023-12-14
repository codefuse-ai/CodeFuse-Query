# ProtectedKeyword

Primary key: `id: int`

```rust
schema ProtectedKeyword {
  @primary id: int,
}
```
## ProtectedKeyword::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: ProtectedKeyword) -> *Node;
```
## ProtectedKeyword::getIndex

```rust
pub fn getIndex(self: ProtectedKeyword) -> int;
```
## ProtectedKeyword::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: ProtectedKeyword) -> int;
```
## ProtectedKeyword::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ProtectedKeyword) -> int;
```
## ProtectedKeyword::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: ProtectedKeyword) -> FunctionLikeDeclaration;
```
## ProtectedKeyword::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: ProtectedKeyword) -> Node;
```
## ProtectedKeyword::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: ProtectedKeyword) -> *Comment;
```
## ProtectedKeyword::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: ProtectedKeyword) -> *Comment;
```
## ProtectedKeyword::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: ProtectedKeyword) -> File;
```
## ProtectedKeyword::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: ProtectedKeyword, level: int) -> Node;
```
## ProtectedKeyword::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ProtectedKeyword) -> int;
```
## ProtectedKeyword::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: ProtectedKeyword) -> string;
```
## ProtectedKeyword::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ProtectedKeyword) -> *FunctionLikeDeclaration;
```
## ProtectedKeyword::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: ProtectedKeyword, level: int) -> *Node;
```
## ProtectedKeyword::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: ProtectedKeyword) -> int;
```
## ProtectedKeyword::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: ProtectedKeyword) -> *Modifier;
```
## ProtectedKeyword::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ProtectedKeyword) -> int;
```
## ProtectedKeyword::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ProtectedKeyword) -> int;
```
## ProtectedKeyword::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: ProtectedKeyword, i: int) -> Node;
```
## ProtectedKeyword::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: ProtectedKeyword, i: int) -> Decorator;
```
## ProtectedKeyword::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: ProtectedKeyword) -> TopLevelDO;
```
## ProtectedKeyword::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: ProtectedKeyword) -> int;
```
## ProtectedKeyword::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: ProtectedKeyword) -> Node;
```
## ProtectedKeyword::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: ProtectedKeyword) -> *Node;
```
## ProtectedKeyword::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: ProtectedKeyword) -> *Node;
```
## ProtectedKeyword::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: ProtectedKeyword) -> *Comment;
```
## ProtectedKeyword::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: ProtectedKeyword) -> Symbol;
```
## ProtectedKeyword::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: ProtectedKeyword) -> *Decorator;
```
## ProtectedKeyword::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: ProtectedKeyword, i: int) -> Modifier;
```
## ProtectedKeyword::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: ProtectedKeyword) -> string;
```
## ProtectedKeyword::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *ProtectedKeyword;
```
## ProtectedKeyword::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: ProtectedKeyword) -> Location;
```
