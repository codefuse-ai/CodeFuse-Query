# NeverKeyword

Inherit from [Token](./Token.md)

Primary key: `id: int`

```rust
schema NeverKeyword extends Token {
  @primary id: int,
}
```
## NeverKeyword::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: NeverKeyword) -> Location;
```
## NeverKeyword::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: NeverKeyword) -> Symbol;
```
## NeverKeyword::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: NeverKeyword) -> *Decorator;
```
## NeverKeyword::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: NeverKeyword) -> string;
```
## NeverKeyword::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: NeverKeyword, i: int) -> Modifier;
```
## NeverKeyword::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: NeverKeyword) -> *Comment;
```
## NeverKeyword::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: NeverKeyword) -> *Node;
```
## NeverKeyword::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: NeverKeyword) -> *Node;
```
## NeverKeyword::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: NeverKeyword) -> Node;
```
## NeverKeyword::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: NeverKeyword) -> int;
```
## NeverKeyword::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: NeverKeyword) -> TopLevelDO;
```
## NeverKeyword::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: NeverKeyword, i: int) -> Decorator;
```
## NeverKeyword::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: NeverKeyword) -> int;
```
## NeverKeyword::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: NeverKeyword) -> *Modifier;
```
## NeverKeyword::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: NeverKeyword) -> int;
```
## NeverKeyword::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: NeverKeyword, i: int) -> Node;
```
## NeverKeyword::getStartLineNumber

```rust
pub fn getStartLineNumber(self: NeverKeyword) -> int;
```
## NeverKeyword::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: NeverKeyword) -> *FunctionLikeDeclaration;
```
## NeverKeyword::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: NeverKeyword, level: int) -> *Node;
```
## NeverKeyword::getEndLineNumber

```rust
pub fn getEndLineNumber(self: NeverKeyword) -> int;
```
## NeverKeyword::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: NeverKeyword) -> string;
```
## NeverKeyword::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: NeverKeyword, level: int) -> Node;
```
## NeverKeyword::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: NeverKeyword) -> File;
```
## NeverKeyword::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: NeverKeyword) -> *Comment;
```
## NeverKeyword::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: NeverKeyword) -> *Comment;
```
## NeverKeyword::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: NeverKeyword) -> Node;
```
## NeverKeyword::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: NeverKeyword) -> FunctionLikeDeclaration;
```
## NeverKeyword::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: NeverKeyword) -> int;
```
## NeverKeyword::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: NeverKeyword) -> int;
```
## NeverKeyword::getIndex

```rust
pub fn getIndex(self: NeverKeyword) -> int;
```
## NeverKeyword::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: NeverKeyword) -> *Node;
```
## NeverKeyword::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *NeverKeyword;
```
