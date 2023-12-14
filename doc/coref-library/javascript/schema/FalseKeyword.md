# FalseKeyword

Inherit from [Token](./Token.md)

Primary key: `id: int`

```rust
schema FalseKeyword extends Token {
  @primary id: int,
}
```
## FalseKeyword::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: FalseKeyword) -> Location;
```
## FalseKeyword::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: FalseKeyword) -> Symbol;
```
## FalseKeyword::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: FalseKeyword) -> *Decorator;
```
## FalseKeyword::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: FalseKeyword) -> string;
```
## FalseKeyword::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: FalseKeyword, i: int) -> Modifier;
```
## FalseKeyword::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: FalseKeyword) -> *Comment;
```
## FalseKeyword::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: FalseKeyword) -> *Node;
```
## FalseKeyword::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: FalseKeyword) -> *Node;
```
## FalseKeyword::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: FalseKeyword) -> Node;
```
## FalseKeyword::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: FalseKeyword) -> int;
```
## FalseKeyword::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: FalseKeyword) -> TopLevelDO;
```
## FalseKeyword::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: FalseKeyword, i: int) -> Decorator;
```
## FalseKeyword::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: FalseKeyword) -> int;
```
## FalseKeyword::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: FalseKeyword) -> *Modifier;
```
## FalseKeyword::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: FalseKeyword) -> int;
```
## FalseKeyword::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: FalseKeyword, i: int) -> Node;
```
## FalseKeyword::getStartLineNumber

```rust
pub fn getStartLineNumber(self: FalseKeyword) -> int;
```
## FalseKeyword::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: FalseKeyword) -> *FunctionLikeDeclaration;
```
## FalseKeyword::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: FalseKeyword, level: int) -> *Node;
```
## FalseKeyword::getEndLineNumber

```rust
pub fn getEndLineNumber(self: FalseKeyword) -> int;
```
## FalseKeyword::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: FalseKeyword) -> string;
```
## FalseKeyword::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: FalseKeyword, level: int) -> Node;
```
## FalseKeyword::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: FalseKeyword) -> File;
```
## FalseKeyword::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: FalseKeyword) -> *Comment;
```
## FalseKeyword::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: FalseKeyword) -> *Comment;
```
## FalseKeyword::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: FalseKeyword) -> Node;
```
## FalseKeyword::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: FalseKeyword) -> FunctionLikeDeclaration;
```
## FalseKeyword::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: FalseKeyword) -> int;
```
## FalseKeyword::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: FalseKeyword) -> int;
```
## FalseKeyword::getIndex

```rust
pub fn getIndex(self: FalseKeyword) -> int;
```
## FalseKeyword::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: FalseKeyword) -> *Node;
```
## FalseKeyword::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *FalseKeyword;
```
