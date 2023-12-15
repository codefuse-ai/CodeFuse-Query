# Modifier

Inherit from [Token](./Token.md)

Primary key: `id: int`

```rust
schema Modifier extends Token {
  @primary id: int
}
```
## Modifier::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: Modifier) -> Location;
```
## Modifier::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: Modifier) -> Symbol;
```
## Modifier::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: Modifier) -> *Decorator;
```
## Modifier::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: Modifier) -> string;
```
## Modifier::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: Modifier, i: int) -> Modifier;
```
## Modifier::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: Modifier) -> *Comment;
```
## Modifier::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: Modifier) -> *Node;
```
## Modifier::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: Modifier) -> *Node;
```
## Modifier::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: Modifier) -> Node;
```
## Modifier::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: Modifier) -> int;
```
## Modifier::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: Modifier) -> TopLevelDO;
```
## Modifier::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: Modifier, i: int) -> Decorator;
```
## Modifier::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: Modifier) -> int;
```
## Modifier::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: Modifier) -> *Modifier;
```
## Modifier::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: Modifier) -> int;
```
## Modifier::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: Modifier, i: int) -> Node;
```
## Modifier::getStartLineNumber

```rust
pub fn getStartLineNumber(self: Modifier) -> int;
```
## Modifier::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: Modifier) -> *FunctionLikeDeclaration;
```
## Modifier::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: Modifier, level: int) -> *Node;
```
## Modifier::getEndLineNumber

```rust
pub fn getEndLineNumber(self: Modifier) -> int;
```
## Modifier::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: Modifier) -> string;
```
## Modifier::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: Modifier, level: int) -> Node;
```
## Modifier::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: Modifier) -> File;
```
## Modifier::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: Modifier) -> *Comment;
```
## Modifier::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: Modifier) -> *Comment;
```
## Modifier::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: Modifier) -> Node;
```
## Modifier::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: Modifier) -> FunctionLikeDeclaration;
```
## Modifier::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: Modifier) -> int;
```
## Modifier::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: Modifier) -> int;
```
## Modifier::getIndex

```rust
pub fn getIndex(self: Modifier) -> int;
```
## Modifier::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: Modifier) -> *Node;
```
## Modifier::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *Modifier;
```
