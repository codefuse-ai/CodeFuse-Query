# StringKeyword

Inherit from [Token](./Token.md)

Primary key: `id: int`

```rust
schema StringKeyword extends Token {
  @primary id: int
}
```
## StringKeyword::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: StringKeyword) -> Location;
```
## StringKeyword::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: StringKeyword) -> Symbol;
```
## StringKeyword::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: StringKeyword) -> *Decorator;
```
## StringKeyword::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: StringKeyword) -> string;
```
## StringKeyword::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: StringKeyword, i: int) -> Modifier;
```
## StringKeyword::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: StringKeyword) -> *Comment;
```
## StringKeyword::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: StringKeyword) -> *Node;
```
## StringKeyword::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: StringKeyword) -> *Node;
```
## StringKeyword::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: StringKeyword) -> Node;
```
## StringKeyword::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: StringKeyword) -> int;
```
## StringKeyword::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: StringKeyword) -> TopLevelDO;
```
## StringKeyword::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: StringKeyword, i: int) -> Decorator;
```
## StringKeyword::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: StringKeyword) -> int;
```
## StringKeyword::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: StringKeyword) -> *Modifier;
```
## StringKeyword::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: StringKeyword) -> int;
```
## StringKeyword::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: StringKeyword, i: int) -> Node;
```
## StringKeyword::getStartLineNumber

```rust
pub fn getStartLineNumber(self: StringKeyword) -> int;
```
## StringKeyword::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: StringKeyword) -> *FunctionLikeDeclaration;
```
## StringKeyword::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: StringKeyword, level: int) -> *Node;
```
## StringKeyword::getEndLineNumber

```rust
pub fn getEndLineNumber(self: StringKeyword) -> int;
```
## StringKeyword::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: StringKeyword) -> string;
```
## StringKeyword::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: StringKeyword, level: int) -> Node;
```
## StringKeyword::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: StringKeyword) -> File;
```
## StringKeyword::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: StringKeyword) -> *Comment;
```
## StringKeyword::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: StringKeyword) -> *Comment;
```
## StringKeyword::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: StringKeyword) -> Node;
```
## StringKeyword::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: StringKeyword) -> FunctionLikeDeclaration;
```
## StringKeyword::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: StringKeyword) -> int;
```
## StringKeyword::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: StringKeyword) -> int;
```
## StringKeyword::getIndex

```rust
pub fn getIndex(self: StringKeyword) -> int;
```
## StringKeyword::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: StringKeyword) -> *Node;
```
## StringKeyword::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *StringKeyword;
```
