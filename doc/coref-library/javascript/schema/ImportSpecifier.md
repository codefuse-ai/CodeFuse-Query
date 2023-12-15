# ImportSpecifier

Inherit from [Node](./Node.md)

Primary key: `id: int`

```rust
schema ImportSpecifier extends Node {
  @primary id: int
}
```
## ImportSpecifier::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: ImportSpecifier) -> *Node;
```
## ImportSpecifier::getIndex

```rust
pub fn getIndex(self: ImportSpecifier) -> int;
```
## ImportSpecifier::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: ImportSpecifier) -> int;
```
## ImportSpecifier::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ImportSpecifier) -> int;
```
## ImportSpecifier::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: ImportSpecifier) -> Node;
```
## ImportSpecifier::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: ImportSpecifier) -> FunctionLikeDeclaration;
```
## ImportSpecifier::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: ImportSpecifier) -> File;
```
## ImportSpecifier::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: ImportSpecifier, level: int) -> Node;
```
## ImportSpecifier::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: ImportSpecifier) -> string;
```
## ImportSpecifier::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ImportSpecifier) -> int;
```
## ImportSpecifier::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ImportSpecifier) -> *FunctionLikeDeclaration;
```
## ImportSpecifier::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: ImportSpecifier, level: int) -> *Node;
```
## ImportSpecifier::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: ImportSpecifier) -> int;
```
## ImportSpecifier::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: ImportSpecifier) -> *Modifier;
```
## ImportSpecifier::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ImportSpecifier) -> int;
```
## ImportSpecifier::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ImportSpecifier) -> int;
```
## ImportSpecifier::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: ImportSpecifier, i: int) -> Node;
```
## ImportSpecifier::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: ImportSpecifier, i: int) -> Decorator;
```
## ImportSpecifier::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: ImportSpecifier) -> TopLevelDO;
```
## ImportSpecifier::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: ImportSpecifier) -> int;
```
## ImportSpecifier::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: ImportSpecifier) -> *Comment;
```
## ImportSpecifier::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: ImportSpecifier) -> *Comment;
```
## ImportSpecifier::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: ImportSpecifier) -> Node;
```
## ImportSpecifier::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: ImportSpecifier) -> *Node;
```
## ImportSpecifier::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: ImportSpecifier) -> *Node;
```
## ImportSpecifier::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: ImportSpecifier) -> *Comment;
```
## ImportSpecifier::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: ImportSpecifier, i: int) -> Modifier;
```
## ImportSpecifier::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: ImportSpecifier) -> string;
```
## ImportSpecifier::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: ImportSpecifier) -> *Decorator;
```
## ImportSpecifier::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: ImportSpecifier) -> Symbol;
```
## ImportSpecifier::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: ImportSpecifier) -> Location;
```
## ImportSpecifier::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *ImportSpecifier;
```
