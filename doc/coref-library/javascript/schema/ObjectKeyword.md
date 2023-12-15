# ObjectKeyword

Inherit from [Token](./Token.md)

Primary key: `id: int`

```rust
schema ObjectKeyword extends Token {
  @primary id: int
}
```
## ObjectKeyword::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: ObjectKeyword) -> Location;
```
## ObjectKeyword::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: ObjectKeyword) -> Symbol;
```
## ObjectKeyword::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: ObjectKeyword) -> *Decorator;
```
## ObjectKeyword::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: ObjectKeyword) -> string;
```
## ObjectKeyword::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: ObjectKeyword, i: int) -> Modifier;
```
## ObjectKeyword::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: ObjectKeyword) -> *Comment;
```
## ObjectKeyword::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: ObjectKeyword) -> *Node;
```
## ObjectKeyword::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: ObjectKeyword) -> *Node;
```
## ObjectKeyword::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: ObjectKeyword) -> Node;
```
## ObjectKeyword::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: ObjectKeyword) -> int;
```
## ObjectKeyword::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: ObjectKeyword) -> TopLevelDO;
```
## ObjectKeyword::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: ObjectKeyword, i: int) -> Decorator;
```
## ObjectKeyword::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: ObjectKeyword) -> int;
```
## ObjectKeyword::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: ObjectKeyword) -> *Modifier;
```
## ObjectKeyword::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ObjectKeyword) -> int;
```
## ObjectKeyword::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: ObjectKeyword, i: int) -> Node;
```
## ObjectKeyword::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ObjectKeyword) -> int;
```
## ObjectKeyword::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ObjectKeyword) -> *FunctionLikeDeclaration;
```
## ObjectKeyword::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: ObjectKeyword, level: int) -> *Node;
```
## ObjectKeyword::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ObjectKeyword) -> int;
```
## ObjectKeyword::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: ObjectKeyword) -> string;
```
## ObjectKeyword::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: ObjectKeyword, level: int) -> Node;
```
## ObjectKeyword::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: ObjectKeyword) -> File;
```
## ObjectKeyword::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: ObjectKeyword) -> *Comment;
```
## ObjectKeyword::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: ObjectKeyword) -> *Comment;
```
## ObjectKeyword::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: ObjectKeyword) -> Node;
```
## ObjectKeyword::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: ObjectKeyword) -> FunctionLikeDeclaration;
```
## ObjectKeyword::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ObjectKeyword) -> int;
```
## ObjectKeyword::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: ObjectKeyword) -> int;
```
## ObjectKeyword::getIndex

```rust
pub fn getIndex(self: ObjectKeyword) -> int;
```
## ObjectKeyword::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: ObjectKeyword) -> *Node;
```
## ObjectKeyword::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *ObjectKeyword;
```
