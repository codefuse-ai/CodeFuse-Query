# InKeyword

Inherit from [Token](./Token.md)

Primary key: `id: int`

```rust
schema InKeyword extends Token {
  @primary id: int,
}
```
## InKeyword::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: InKeyword) -> Location;
```
## InKeyword::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: InKeyword) -> Symbol;
```
## InKeyword::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: InKeyword) -> *Decorator;
```
## InKeyword::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: InKeyword) -> string;
```
## InKeyword::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: InKeyword, i: int) -> Modifier;
```
## InKeyword::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: InKeyword) -> *Comment;
```
## InKeyword::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: InKeyword) -> *Node;
```
## InKeyword::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: InKeyword) -> *Node;
```
## InKeyword::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: InKeyword) -> Node;
```
## InKeyword::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: InKeyword) -> int;
```
## InKeyword::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: InKeyword) -> TopLevelDO;
```
## InKeyword::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: InKeyword, i: int) -> Decorator;
```
## InKeyword::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: InKeyword) -> int;
```
## InKeyword::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: InKeyword) -> *Modifier;
```
## InKeyword::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: InKeyword) -> int;
```
## InKeyword::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: InKeyword, i: int) -> Node;
```
## InKeyword::getStartLineNumber

```rust
pub fn getStartLineNumber(self: InKeyword) -> int;
```
## InKeyword::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: InKeyword) -> *FunctionLikeDeclaration;
```
## InKeyword::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: InKeyword, level: int) -> *Node;
```
## InKeyword::getEndLineNumber

```rust
pub fn getEndLineNumber(self: InKeyword) -> int;
```
## InKeyword::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: InKeyword) -> string;
```
## InKeyword::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: InKeyword, level: int) -> Node;
```
## InKeyword::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: InKeyword) -> File;
```
## InKeyword::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: InKeyword) -> *Comment;
```
## InKeyword::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: InKeyword) -> *Comment;
```
## InKeyword::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: InKeyword) -> Node;
```
## InKeyword::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: InKeyword) -> FunctionLikeDeclaration;
```
## InKeyword::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: InKeyword) -> int;
```
## InKeyword::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: InKeyword) -> int;
```
## InKeyword::getIndex

```rust
pub fn getIndex(self: InKeyword) -> int;
```
## InKeyword::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: InKeyword) -> *Node;
```
## InKeyword::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *InKeyword;
```
