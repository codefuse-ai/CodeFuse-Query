# BigIntKeyword

Inherit from [Token](./Token.md)

Primary key: `id: int`

```rust
schema BigIntKeyword extends Token {
  @primary id: int,
}
```
## BigIntKeyword::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: BigIntKeyword) -> Location;
```
## BigIntKeyword::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: BigIntKeyword) -> Symbol;
```
## BigIntKeyword::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: BigIntKeyword) -> *Decorator;
```
## BigIntKeyword::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: BigIntKeyword) -> string;
```
## BigIntKeyword::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: BigIntKeyword, i: int) -> Modifier;
```
## BigIntKeyword::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: BigIntKeyword) -> *Comment;
```
## BigIntKeyword::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: BigIntKeyword) -> *Node;
```
## BigIntKeyword::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: BigIntKeyword) -> *Node;
```
## BigIntKeyword::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: BigIntKeyword) -> Node;
```
## BigIntKeyword::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: BigIntKeyword) -> int;
```
## BigIntKeyword::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: BigIntKeyword) -> TopLevelDO;
```
## BigIntKeyword::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: BigIntKeyword, i: int) -> Decorator;
```
## BigIntKeyword::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: BigIntKeyword) -> int;
```
## BigIntKeyword::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: BigIntKeyword) -> *Modifier;
```
## BigIntKeyword::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: BigIntKeyword) -> int;
```
## BigIntKeyword::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: BigIntKeyword, i: int) -> Node;
```
## BigIntKeyword::getStartLineNumber

```rust
pub fn getStartLineNumber(self: BigIntKeyword) -> int;
```
## BigIntKeyword::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: BigIntKeyword) -> *FunctionLikeDeclaration;
```
## BigIntKeyword::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: BigIntKeyword, level: int) -> *Node;
```
## BigIntKeyword::getEndLineNumber

```rust
pub fn getEndLineNumber(self: BigIntKeyword) -> int;
```
## BigIntKeyword::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: BigIntKeyword) -> string;
```
## BigIntKeyword::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: BigIntKeyword, level: int) -> Node;
```
## BigIntKeyword::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: BigIntKeyword) -> File;
```
## BigIntKeyword::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: BigIntKeyword) -> *Comment;
```
## BigIntKeyword::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: BigIntKeyword) -> *Comment;
```
## BigIntKeyword::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: BigIntKeyword) -> Node;
```
## BigIntKeyword::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: BigIntKeyword) -> FunctionLikeDeclaration;
```
## BigIntKeyword::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: BigIntKeyword) -> int;
```
## BigIntKeyword::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: BigIntKeyword) -> int;
```
## BigIntKeyword::getIndex

```rust
pub fn getIndex(self: BigIntKeyword) -> int;
```
## BigIntKeyword::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: BigIntKeyword) -> *Node;
```
## BigIntKeyword::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *BigIntKeyword;
```
