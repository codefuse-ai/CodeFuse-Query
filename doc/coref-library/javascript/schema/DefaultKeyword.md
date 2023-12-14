# DefaultKeyword

Inherit from [Modifier](./Modifier.md)

Primary key: `id: int`

```rust
schema DefaultKeyword extends Modifier {
  @primary id: int,
}
```
## DefaultKeyword::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: DefaultKeyword) -> *Node;
```
## DefaultKeyword::getIndex

```rust
pub fn getIndex(self: DefaultKeyword) -> int;
```
## DefaultKeyword::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: DefaultKeyword) -> int;
```
## DefaultKeyword::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: DefaultKeyword) -> int;
```
## DefaultKeyword::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: DefaultKeyword) -> FunctionLikeDeclaration;
```
## DefaultKeyword::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: DefaultKeyword) -> Node;
```
## DefaultKeyword::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: DefaultKeyword) -> *Comment;
```
## DefaultKeyword::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: DefaultKeyword) -> *Comment;
```
## DefaultKeyword::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: DefaultKeyword) -> File;
```
## DefaultKeyword::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: DefaultKeyword, level: int) -> Node;
```
## DefaultKeyword::getEndLineNumber

```rust
pub fn getEndLineNumber(self: DefaultKeyword) -> int;
```
## DefaultKeyword::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: DefaultKeyword) -> string;
```
## DefaultKeyword::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: DefaultKeyword) -> *FunctionLikeDeclaration;
```
## DefaultKeyword::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: DefaultKeyword, level: int) -> *Node;
```
## DefaultKeyword::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: DefaultKeyword) -> int;
```
## DefaultKeyword::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: DefaultKeyword) -> *Modifier;
```
## DefaultKeyword::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: DefaultKeyword) -> int;
```
## DefaultKeyword::getStartLineNumber

```rust
pub fn getStartLineNumber(self: DefaultKeyword) -> int;
```
## DefaultKeyword::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: DefaultKeyword, i: int) -> Node;
```
## DefaultKeyword::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: DefaultKeyword, i: int) -> Decorator;
```
## DefaultKeyword::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: DefaultKeyword) -> TopLevelDO;
```
## DefaultKeyword::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: DefaultKeyword) -> int;
```
## DefaultKeyword::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: DefaultKeyword) -> Node;
```
## DefaultKeyword::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: DefaultKeyword) -> *Node;
```
## DefaultKeyword::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: DefaultKeyword) -> *Node;
```
## DefaultKeyword::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: DefaultKeyword) -> *Comment;
```
## DefaultKeyword::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: DefaultKeyword) -> Symbol;
```
## DefaultKeyword::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: DefaultKeyword) -> *Decorator;
```
## DefaultKeyword::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: DefaultKeyword, i: int) -> Modifier;
```
## DefaultKeyword::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: DefaultKeyword) -> string;
```
## DefaultKeyword::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *DefaultKeyword;
```
## DefaultKeyword::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: DefaultKeyword) -> Location;
```
