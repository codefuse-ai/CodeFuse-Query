# ExportKeyword

Primary key: `id: int`

```rust
schema ExportKeyword {
  @primary id: int,
}
```
## ExportKeyword::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: ExportKeyword) -> *Node;
```
## ExportKeyword::getIndex

```rust
pub fn getIndex(self: ExportKeyword) -> int;
```
## ExportKeyword::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: ExportKeyword) -> int;
```
## ExportKeyword::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ExportKeyword) -> int;
```
## ExportKeyword::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: ExportKeyword) -> FunctionLikeDeclaration;
```
## ExportKeyword::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: ExportKeyword) -> Node;
```
## ExportKeyword::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: ExportKeyword) -> *Comment;
```
## ExportKeyword::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: ExportKeyword) -> *Comment;
```
## ExportKeyword::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: ExportKeyword) -> File;
```
## ExportKeyword::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: ExportKeyword, level: int) -> Node;
```
## ExportKeyword::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ExportKeyword) -> int;
```
## ExportKeyword::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: ExportKeyword) -> string;
```
## ExportKeyword::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ExportKeyword) -> *FunctionLikeDeclaration;
```
## ExportKeyword::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: ExportKeyword, level: int) -> *Node;
```
## ExportKeyword::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: ExportKeyword) -> int;
```
## ExportKeyword::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: ExportKeyword) -> *Modifier;
```
## ExportKeyword::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ExportKeyword) -> int;
```
## ExportKeyword::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ExportKeyword) -> int;
```
## ExportKeyword::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: ExportKeyword, i: int) -> Node;
```
## ExportKeyword::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: ExportKeyword, i: int) -> Decorator;
```
## ExportKeyword::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: ExportKeyword) -> TopLevelDO;
```
## ExportKeyword::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: ExportKeyword) -> int;
```
## ExportKeyword::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: ExportKeyword) -> Node;
```
## ExportKeyword::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: ExportKeyword) -> *Node;
```
## ExportKeyword::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: ExportKeyword) -> *Node;
```
## ExportKeyword::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: ExportKeyword) -> *Comment;
```
## ExportKeyword::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: ExportKeyword) -> Symbol;
```
## ExportKeyword::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: ExportKeyword) -> *Decorator;
```
## ExportKeyword::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: ExportKeyword, i: int) -> Modifier;
```
## ExportKeyword::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: ExportKeyword) -> string;
```
## ExportKeyword::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *ExportKeyword;
```
## ExportKeyword::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: ExportKeyword) -> Location;
```
