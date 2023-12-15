# ExportSpecifier

Inherit from [Node](./Node.md)

Primary key: `id: int`

```rust
schema ExportSpecifier extends Node {
  @primary id: int
}
```
## ExportSpecifier::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: ExportSpecifier) -> *Node;
```
## ExportSpecifier::getIndex

```rust
pub fn getIndex(self: ExportSpecifier) -> int;
```
## ExportSpecifier::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: ExportSpecifier) -> int;
```
## ExportSpecifier::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ExportSpecifier) -> int;
```
## ExportSpecifier::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: ExportSpecifier) -> Node;
```
## ExportSpecifier::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: ExportSpecifier) -> FunctionLikeDeclaration;
```
## ExportSpecifier::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: ExportSpecifier) -> File;
```
## ExportSpecifier::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: ExportSpecifier, level: int) -> Node;
```
## ExportSpecifier::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: ExportSpecifier) -> string;
```
## ExportSpecifier::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ExportSpecifier) -> int;
```
## ExportSpecifier::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ExportSpecifier) -> *FunctionLikeDeclaration;
```
## ExportSpecifier::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: ExportSpecifier, level: int) -> *Node;
```
## ExportSpecifier::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: ExportSpecifier) -> int;
```
## ExportSpecifier::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: ExportSpecifier) -> *Modifier;
```
## ExportSpecifier::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ExportSpecifier) -> int;
```
## ExportSpecifier::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ExportSpecifier) -> int;
```
## ExportSpecifier::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: ExportSpecifier, i: int) -> Node;
```
## ExportSpecifier::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: ExportSpecifier, i: int) -> Decorator;
```
## ExportSpecifier::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: ExportSpecifier) -> TopLevelDO;
```
## ExportSpecifier::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: ExportSpecifier) -> int;
```
## ExportSpecifier::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: ExportSpecifier) -> *Comment;
```
## ExportSpecifier::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: ExportSpecifier) -> *Comment;
```
## ExportSpecifier::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: ExportSpecifier) -> Node;
```
## ExportSpecifier::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: ExportSpecifier) -> *Node;
```
## ExportSpecifier::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: ExportSpecifier) -> *Node;
```
## ExportSpecifier::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: ExportSpecifier) -> *Comment;
```
## ExportSpecifier::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: ExportSpecifier, i: int) -> Modifier;
```
## ExportSpecifier::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: ExportSpecifier) -> string;
```
## ExportSpecifier::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: ExportSpecifier) -> *Decorator;
```
## ExportSpecifier::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: ExportSpecifier) -> Symbol;
```
## ExportSpecifier::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: ExportSpecifier) -> Location;
```
## ExportSpecifier::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *ExportSpecifier;
```
