# ExtendsKeyword

Inherit from [Token](./Token.md)

Primary key: `id: int`

```rust
schema ExtendsKeyword extends Token {
  @primary id: int,
}
```
## ExtendsKeyword::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: ExtendsKeyword) -> Location;
```
## ExtendsKeyword::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: ExtendsKeyword) -> Symbol;
```
## ExtendsKeyword::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: ExtendsKeyword) -> *Decorator;
```
## ExtendsKeyword::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: ExtendsKeyword) -> string;
```
## ExtendsKeyword::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: ExtendsKeyword, i: int) -> Modifier;
```
## ExtendsKeyword::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: ExtendsKeyword) -> *Comment;
```
## ExtendsKeyword::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: ExtendsKeyword) -> *Node;
```
## ExtendsKeyword::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: ExtendsKeyword) -> *Node;
```
## ExtendsKeyword::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: ExtendsKeyword) -> Node;
```
## ExtendsKeyword::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: ExtendsKeyword) -> int;
```
## ExtendsKeyword::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: ExtendsKeyword) -> TopLevelDO;
```
## ExtendsKeyword::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: ExtendsKeyword, i: int) -> Decorator;
```
## ExtendsKeyword::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: ExtendsKeyword) -> int;
```
## ExtendsKeyword::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: ExtendsKeyword) -> *Modifier;
```
## ExtendsKeyword::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ExtendsKeyword) -> int;
```
## ExtendsKeyword::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: ExtendsKeyword, i: int) -> Node;
```
## ExtendsKeyword::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ExtendsKeyword) -> int;
```
## ExtendsKeyword::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ExtendsKeyword) -> *FunctionLikeDeclaration;
```
## ExtendsKeyword::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: ExtendsKeyword, level: int) -> *Node;
```
## ExtendsKeyword::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ExtendsKeyword) -> int;
```
## ExtendsKeyword::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: ExtendsKeyword) -> string;
```
## ExtendsKeyword::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: ExtendsKeyword, level: int) -> Node;
```
## ExtendsKeyword::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: ExtendsKeyword) -> File;
```
## ExtendsKeyword::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: ExtendsKeyword) -> *Comment;
```
## ExtendsKeyword::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: ExtendsKeyword) -> *Comment;
```
## ExtendsKeyword::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: ExtendsKeyword) -> Node;
```
## ExtendsKeyword::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: ExtendsKeyword) -> FunctionLikeDeclaration;
```
## ExtendsKeyword::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ExtendsKeyword) -> int;
```
## ExtendsKeyword::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: ExtendsKeyword) -> int;
```
## ExtendsKeyword::getIndex

```rust
pub fn getIndex(self: ExtendsKeyword) -> int;
```
## ExtendsKeyword::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: ExtendsKeyword) -> *Node;
```
## ExtendsKeyword::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *ExtendsKeyword;
```
