# EndOfDeclarationMarker

Primary key: `id: int`

```rust
schema EndOfDeclarationMarker {
  @primary id: int,
}
```
## EndOfDeclarationMarker::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: EndOfDeclarationMarker) -> Location;
```
## EndOfDeclarationMarker::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: EndOfDeclarationMarker) -> Symbol;
```
## EndOfDeclarationMarker::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: EndOfDeclarationMarker) -> *Decorator;
```
## EndOfDeclarationMarker::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: EndOfDeclarationMarker) -> string;
```
## EndOfDeclarationMarker::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: EndOfDeclarationMarker, i: int) -> Modifier;
```
## EndOfDeclarationMarker::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: EndOfDeclarationMarker) -> *Comment;
```
## EndOfDeclarationMarker::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: EndOfDeclarationMarker) -> *Node;
```
## EndOfDeclarationMarker::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: EndOfDeclarationMarker) -> *Node;
```
## EndOfDeclarationMarker::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: EndOfDeclarationMarker) -> Node;
```
## EndOfDeclarationMarker::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: EndOfDeclarationMarker) -> int;
```
## EndOfDeclarationMarker::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: EndOfDeclarationMarker) -> TopLevelDO;
```
## EndOfDeclarationMarker::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: EndOfDeclarationMarker, i: int) -> Decorator;
```
## EndOfDeclarationMarker::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: EndOfDeclarationMarker) -> int;
```
## EndOfDeclarationMarker::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: EndOfDeclarationMarker) -> *Modifier;
```
## EndOfDeclarationMarker::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: EndOfDeclarationMarker) -> int;
```
## EndOfDeclarationMarker::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: EndOfDeclarationMarker, i: int) -> Node;
```
## EndOfDeclarationMarker::getStartLineNumber

```rust
pub fn getStartLineNumber(self: EndOfDeclarationMarker) -> int;
```
## EndOfDeclarationMarker::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: EndOfDeclarationMarker) -> *FunctionLikeDeclaration;
```
## EndOfDeclarationMarker::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: EndOfDeclarationMarker, level: int) -> *Node;
```
## EndOfDeclarationMarker::getEndLineNumber

```rust
pub fn getEndLineNumber(self: EndOfDeclarationMarker) -> int;
```
## EndOfDeclarationMarker::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: EndOfDeclarationMarker) -> string;
```
## EndOfDeclarationMarker::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: EndOfDeclarationMarker, level: int) -> Node;
```
## EndOfDeclarationMarker::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: EndOfDeclarationMarker) -> File;
```
## EndOfDeclarationMarker::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: EndOfDeclarationMarker) -> *Comment;
```
## EndOfDeclarationMarker::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: EndOfDeclarationMarker) -> *Comment;
```
## EndOfDeclarationMarker::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: EndOfDeclarationMarker) -> Node;
```
## EndOfDeclarationMarker::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: EndOfDeclarationMarker) -> FunctionLikeDeclaration;
```
## EndOfDeclarationMarker::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: EndOfDeclarationMarker) -> int;
```
## EndOfDeclarationMarker::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: EndOfDeclarationMarker) -> int;
```
## EndOfDeclarationMarker::getIndex

```rust
pub fn getIndex(self: EndOfDeclarationMarker) -> int;
```
## EndOfDeclarationMarker::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: EndOfDeclarationMarker) -> *Node;
```
## EndOfDeclarationMarker::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *EndOfDeclarationMarker;
```
