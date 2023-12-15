# MergeDeclarationMarker

Inherit from [Statement](./Statement.md)

Primary key: `id: int`

```rust
schema MergeDeclarationMarker extends Statement {
  @primary id: int
}
```
## MergeDeclarationMarker::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: MergeDeclarationMarker) -> Location;
```
## MergeDeclarationMarker::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: MergeDeclarationMarker) -> Symbol;
```
## MergeDeclarationMarker::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: MergeDeclarationMarker) -> *Decorator;
```
## MergeDeclarationMarker::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: MergeDeclarationMarker) -> string;
```
## MergeDeclarationMarker::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: MergeDeclarationMarker, i: int) -> Modifier;
```
## MergeDeclarationMarker::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: MergeDeclarationMarker) -> *Comment;
```
## MergeDeclarationMarker::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: MergeDeclarationMarker) -> *Node;
```
## MergeDeclarationMarker::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: MergeDeclarationMarker) -> *Node;
```
## MergeDeclarationMarker::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: MergeDeclarationMarker) -> Node;
```
## MergeDeclarationMarker::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: MergeDeclarationMarker) -> int;
```
## MergeDeclarationMarker::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: MergeDeclarationMarker) -> TopLevelDO;
```
## MergeDeclarationMarker::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: MergeDeclarationMarker, i: int) -> Decorator;
```
## MergeDeclarationMarker::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: MergeDeclarationMarker) -> int;
```
## MergeDeclarationMarker::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: MergeDeclarationMarker) -> *Modifier;
```
## MergeDeclarationMarker::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: MergeDeclarationMarker) -> int;
```
## MergeDeclarationMarker::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: MergeDeclarationMarker, i: int) -> Node;
```
## MergeDeclarationMarker::getStartLineNumber

```rust
pub fn getStartLineNumber(self: MergeDeclarationMarker) -> int;
```
## MergeDeclarationMarker::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: MergeDeclarationMarker) -> *FunctionLikeDeclaration;
```
## MergeDeclarationMarker::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: MergeDeclarationMarker, level: int) -> *Node;
```
## MergeDeclarationMarker::getEndLineNumber

```rust
pub fn getEndLineNumber(self: MergeDeclarationMarker) -> int;
```
## MergeDeclarationMarker::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: MergeDeclarationMarker) -> string;
```
## MergeDeclarationMarker::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: MergeDeclarationMarker, level: int) -> Node;
```
## MergeDeclarationMarker::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: MergeDeclarationMarker) -> File;
```
## MergeDeclarationMarker::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: MergeDeclarationMarker) -> *Comment;
```
## MergeDeclarationMarker::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: MergeDeclarationMarker) -> *Comment;
```
## MergeDeclarationMarker::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: MergeDeclarationMarker) -> Node;
```
## MergeDeclarationMarker::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: MergeDeclarationMarker) -> FunctionLikeDeclaration;
```
## MergeDeclarationMarker::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: MergeDeclarationMarker) -> int;
```
## MergeDeclarationMarker::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: MergeDeclarationMarker) -> int;
```
## MergeDeclarationMarker::getIndex

```rust
pub fn getIndex(self: MergeDeclarationMarker) -> int;
```
## MergeDeclarationMarker::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: MergeDeclarationMarker) -> *Node;
```
## MergeDeclarationMarker::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *MergeDeclarationMarker;
```
