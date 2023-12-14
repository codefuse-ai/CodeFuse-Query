# IntrinsicKeyword

Inherit from [Token](./Token.md)

Primary key: `id: int`

```rust
schema IntrinsicKeyword extends Token {
  @primary id: int,
}
```
## IntrinsicKeyword::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: IntrinsicKeyword) -> Location;
```
## IntrinsicKeyword::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: IntrinsicKeyword) -> Symbol;
```
## IntrinsicKeyword::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: IntrinsicKeyword) -> *Decorator;
```
## IntrinsicKeyword::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: IntrinsicKeyword) -> string;
```
## IntrinsicKeyword::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: IntrinsicKeyword, i: int) -> Modifier;
```
## IntrinsicKeyword::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: IntrinsicKeyword) -> *Comment;
```
## IntrinsicKeyword::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: IntrinsicKeyword) -> *Node;
```
## IntrinsicKeyword::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: IntrinsicKeyword) -> *Node;
```
## IntrinsicKeyword::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: IntrinsicKeyword) -> Node;
```
## IntrinsicKeyword::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: IntrinsicKeyword) -> int;
```
## IntrinsicKeyword::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: IntrinsicKeyword) -> TopLevelDO;
```
## IntrinsicKeyword::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: IntrinsicKeyword, i: int) -> Decorator;
```
## IntrinsicKeyword::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: IntrinsicKeyword) -> int;
```
## IntrinsicKeyword::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: IntrinsicKeyword) -> *Modifier;
```
## IntrinsicKeyword::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: IntrinsicKeyword) -> int;
```
## IntrinsicKeyword::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: IntrinsicKeyword, i: int) -> Node;
```
## IntrinsicKeyword::getStartLineNumber

```rust
pub fn getStartLineNumber(self: IntrinsicKeyword) -> int;
```
## IntrinsicKeyword::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: IntrinsicKeyword) -> *FunctionLikeDeclaration;
```
## IntrinsicKeyword::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: IntrinsicKeyword, level: int) -> *Node;
```
## IntrinsicKeyword::getEndLineNumber

```rust
pub fn getEndLineNumber(self: IntrinsicKeyword) -> int;
```
## IntrinsicKeyword::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: IntrinsicKeyword) -> string;
```
## IntrinsicKeyword::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: IntrinsicKeyword, level: int) -> Node;
```
## IntrinsicKeyword::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: IntrinsicKeyword) -> File;
```
## IntrinsicKeyword::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: IntrinsicKeyword) -> *Comment;
```
## IntrinsicKeyword::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: IntrinsicKeyword) -> *Comment;
```
## IntrinsicKeyword::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: IntrinsicKeyword) -> Node;
```
## IntrinsicKeyword::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: IntrinsicKeyword) -> FunctionLikeDeclaration;
```
## IntrinsicKeyword::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: IntrinsicKeyword) -> int;
```
## IntrinsicKeyword::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: IntrinsicKeyword) -> int;
```
## IntrinsicKeyword::getIndex

```rust
pub fn getIndex(self: IntrinsicKeyword) -> int;
```
## IntrinsicKeyword::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: IntrinsicKeyword) -> *Node;
```
## IntrinsicKeyword::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *IntrinsicKeyword;
```
