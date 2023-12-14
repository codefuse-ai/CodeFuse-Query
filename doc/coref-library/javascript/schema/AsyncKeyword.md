# AsyncKeyword

Primary key: `id: int`

```rust
schema AsyncKeyword {
  @primary id: int,
}
```
## AsyncKeyword::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: AsyncKeyword) -> *Node;
```
## AsyncKeyword::getIndex

```rust
pub fn getIndex(self: AsyncKeyword) -> int;
```
## AsyncKeyword::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: AsyncKeyword) -> int;
```
## AsyncKeyword::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: AsyncKeyword) -> int;
```
## AsyncKeyword::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: AsyncKeyword) -> FunctionLikeDeclaration;
```
## AsyncKeyword::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: AsyncKeyword) -> Node;
```
## AsyncKeyword::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: AsyncKeyword) -> *Comment;
```
## AsyncKeyword::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: AsyncKeyword) -> *Comment;
```
## AsyncKeyword::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: AsyncKeyword) -> File;
```
## AsyncKeyword::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: AsyncKeyword, level: int) -> Node;
```
## AsyncKeyword::getEndLineNumber

```rust
pub fn getEndLineNumber(self: AsyncKeyword) -> int;
```
## AsyncKeyword::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: AsyncKeyword) -> string;
```
## AsyncKeyword::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: AsyncKeyword) -> *FunctionLikeDeclaration;
```
## AsyncKeyword::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: AsyncKeyword, level: int) -> *Node;
```
## AsyncKeyword::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: AsyncKeyword) -> int;
```
## AsyncKeyword::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: AsyncKeyword) -> *Modifier;
```
## AsyncKeyword::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: AsyncKeyword) -> int;
```
## AsyncKeyword::getStartLineNumber

```rust
pub fn getStartLineNumber(self: AsyncKeyword) -> int;
```
## AsyncKeyword::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: AsyncKeyword, i: int) -> Node;
```
## AsyncKeyword::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: AsyncKeyword, i: int) -> Decorator;
```
## AsyncKeyword::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: AsyncKeyword) -> TopLevelDO;
```
## AsyncKeyword::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: AsyncKeyword) -> int;
```
## AsyncKeyword::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: AsyncKeyword) -> Node;
```
## AsyncKeyword::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: AsyncKeyword) -> *Node;
```
## AsyncKeyword::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: AsyncKeyword) -> *Node;
```
## AsyncKeyword::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: AsyncKeyword) -> *Comment;
```
## AsyncKeyword::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: AsyncKeyword) -> Symbol;
```
## AsyncKeyword::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: AsyncKeyword) -> *Decorator;
```
## AsyncKeyword::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: AsyncKeyword, i: int) -> Modifier;
```
## AsyncKeyword::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: AsyncKeyword) -> string;
```
## AsyncKeyword::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *AsyncKeyword;
```
## AsyncKeyword::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: AsyncKeyword) -> Location;
```
