# SuperKeyword

Inherit from [Token](./Token.md)

Primary key: `id: int`

```rust
schema SuperKeyword extends Token {
  @primary id: int
}
```
## SuperKeyword::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: SuperKeyword) -> Location;
```
## SuperKeyword::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: SuperKeyword) -> Symbol;
```
## SuperKeyword::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: SuperKeyword) -> *Decorator;
```
## SuperKeyword::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: SuperKeyword) -> string;
```
## SuperKeyword::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: SuperKeyword, i: int) -> Modifier;
```
## SuperKeyword::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: SuperKeyword) -> *Comment;
```
## SuperKeyword::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: SuperKeyword) -> *Node;
```
## SuperKeyword::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: SuperKeyword) -> *Node;
```
## SuperKeyword::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: SuperKeyword) -> Node;
```
## SuperKeyword::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: SuperKeyword) -> int;
```
## SuperKeyword::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: SuperKeyword) -> TopLevelDO;
```
## SuperKeyword::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: SuperKeyword, i: int) -> Decorator;
```
## SuperKeyword::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: SuperKeyword) -> int;
```
## SuperKeyword::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: SuperKeyword) -> *Modifier;
```
## SuperKeyword::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: SuperKeyword) -> int;
```
## SuperKeyword::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: SuperKeyword, i: int) -> Node;
```
## SuperKeyword::getStartLineNumber

```rust
pub fn getStartLineNumber(self: SuperKeyword) -> int;
```
## SuperKeyword::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: SuperKeyword) -> *FunctionLikeDeclaration;
```
## SuperKeyword::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: SuperKeyword, level: int) -> *Node;
```
## SuperKeyword::getEndLineNumber

```rust
pub fn getEndLineNumber(self: SuperKeyword) -> int;
```
## SuperKeyword::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: SuperKeyword) -> string;
```
## SuperKeyword::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: SuperKeyword, level: int) -> Node;
```
## SuperKeyword::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: SuperKeyword) -> File;
```
## SuperKeyword::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: SuperKeyword) -> *Comment;
```
## SuperKeyword::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: SuperKeyword) -> *Comment;
```
## SuperKeyword::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: SuperKeyword) -> Node;
```
## SuperKeyword::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: SuperKeyword) -> FunctionLikeDeclaration;
```
## SuperKeyword::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: SuperKeyword) -> int;
```
## SuperKeyword::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: SuperKeyword) -> int;
```
## SuperKeyword::getIndex

```rust
pub fn getIndex(self: SuperKeyword) -> int;
```
## SuperKeyword::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: SuperKeyword) -> *Node;
```
## SuperKeyword::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *SuperKeyword;
```
