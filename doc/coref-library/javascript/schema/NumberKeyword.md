# NumberKeyword

Primary key: `id: int`

```rust
schema NumberKeyword {
  @primary id: int,
}
```
## NumberKeyword::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: NumberKeyword) -> Location;
```
## NumberKeyword::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: NumberKeyword) -> Symbol;
```
## NumberKeyword::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: NumberKeyword) -> *Decorator;
```
## NumberKeyword::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: NumberKeyword) -> string;
```
## NumberKeyword::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: NumberKeyword, i: int) -> Modifier;
```
## NumberKeyword::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: NumberKeyword) -> *Comment;
```
## NumberKeyword::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: NumberKeyword) -> *Node;
```
## NumberKeyword::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: NumberKeyword) -> *Node;
```
## NumberKeyword::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: NumberKeyword) -> Node;
```
## NumberKeyword::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: NumberKeyword) -> int;
```
## NumberKeyword::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: NumberKeyword) -> TopLevelDO;
```
## NumberKeyword::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: NumberKeyword, i: int) -> Decorator;
```
## NumberKeyword::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: NumberKeyword) -> int;
```
## NumberKeyword::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: NumberKeyword) -> *Modifier;
```
## NumberKeyword::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: NumberKeyword) -> int;
```
## NumberKeyword::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: NumberKeyword, i: int) -> Node;
```
## NumberKeyword::getStartLineNumber

```rust
pub fn getStartLineNumber(self: NumberKeyword) -> int;
```
## NumberKeyword::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: NumberKeyword) -> *FunctionLikeDeclaration;
```
## NumberKeyword::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: NumberKeyword, level: int) -> *Node;
```
## NumberKeyword::getEndLineNumber

```rust
pub fn getEndLineNumber(self: NumberKeyword) -> int;
```
## NumberKeyword::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: NumberKeyword) -> string;
```
## NumberKeyword::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: NumberKeyword, level: int) -> Node;
```
## NumberKeyword::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: NumberKeyword) -> File;
```
## NumberKeyword::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: NumberKeyword) -> *Comment;
```
## NumberKeyword::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: NumberKeyword) -> *Comment;
```
## NumberKeyword::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: NumberKeyword) -> Node;
```
## NumberKeyword::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: NumberKeyword) -> FunctionLikeDeclaration;
```
## NumberKeyword::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: NumberKeyword) -> int;
```
## NumberKeyword::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: NumberKeyword) -> int;
```
## NumberKeyword::getIndex

```rust
pub fn getIndex(self: NumberKeyword) -> int;
```
## NumberKeyword::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: NumberKeyword) -> *Node;
```
## NumberKeyword::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *NumberKeyword;
```
