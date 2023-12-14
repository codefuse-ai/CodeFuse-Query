# ImportClause

Inherit from [Node](./Node.md)

Primary key: `id: int`

```rust
schema ImportClause extends Node {
  @primary id: int,
}
```
## ImportClause::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: ImportClause) -> *Node;
```
## ImportClause::getIndex

```rust
pub fn getIndex(self: ImportClause) -> int;
```
## ImportClause::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: ImportClause) -> int;
```
## ImportClause::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ImportClause) -> int;
```
## ImportClause::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: ImportClause) -> Node;
```
## ImportClause::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: ImportClause) -> FunctionLikeDeclaration;
```
## ImportClause::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: ImportClause) -> File;
```
## ImportClause::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: ImportClause, level: int) -> Node;
```
## ImportClause::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: ImportClause) -> string;
```
## ImportClause::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ImportClause) -> int;
```
## ImportClause::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ImportClause) -> *FunctionLikeDeclaration;
```
## ImportClause::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: ImportClause, level: int) -> *Node;
```
## ImportClause::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: ImportClause) -> int;
```
## ImportClause::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: ImportClause) -> *Modifier;
```
## ImportClause::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ImportClause) -> int;
```
## ImportClause::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ImportClause) -> int;
```
## ImportClause::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: ImportClause, i: int) -> Node;
```
## ImportClause::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: ImportClause, i: int) -> Decorator;
```
## ImportClause::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: ImportClause) -> TopLevelDO;
```
## ImportClause::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: ImportClause) -> int;
```
## ImportClause::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: ImportClause) -> *Comment;
```
## ImportClause::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: ImportClause) -> *Comment;
```
## ImportClause::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: ImportClause) -> Node;
```
## ImportClause::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: ImportClause) -> *Node;
```
## ImportClause::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: ImportClause) -> *Node;
```
## ImportClause::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: ImportClause) -> *Comment;
```
## ImportClause::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: ImportClause, i: int) -> Modifier;
```
## ImportClause::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: ImportClause) -> string;
```
## ImportClause::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: ImportClause) -> *Decorator;
```
## ImportClause::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: ImportClause) -> Symbol;
```
## ImportClause::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: ImportClause) -> Location;
```
## ImportClause::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *ImportClause;
```
