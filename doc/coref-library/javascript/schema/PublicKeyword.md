# PublicKeyword

Primary key: `id: int`

```rust
schema PublicKeyword {
  @primary id: int,
}
```
## PublicKeyword::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: PublicKeyword) -> *Node;
```
## PublicKeyword::getIndex

```rust
pub fn getIndex(self: PublicKeyword) -> int;
```
## PublicKeyword::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: PublicKeyword) -> int;
```
## PublicKeyword::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: PublicKeyword) -> int;
```
## PublicKeyword::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: PublicKeyword) -> FunctionLikeDeclaration;
```
## PublicKeyword::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: PublicKeyword) -> Node;
```
## PublicKeyword::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: PublicKeyword) -> *Comment;
```
## PublicKeyword::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: PublicKeyword) -> *Comment;
```
## PublicKeyword::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: PublicKeyword) -> File;
```
## PublicKeyword::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: PublicKeyword, level: int) -> Node;
```
## PublicKeyword::getEndLineNumber

```rust
pub fn getEndLineNumber(self: PublicKeyword) -> int;
```
## PublicKeyword::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: PublicKeyword) -> string;
```
## PublicKeyword::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: PublicKeyword) -> *FunctionLikeDeclaration;
```
## PublicKeyword::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: PublicKeyword, level: int) -> *Node;
```
## PublicKeyword::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: PublicKeyword) -> int;
```
## PublicKeyword::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: PublicKeyword) -> *Modifier;
```
## PublicKeyword::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: PublicKeyword) -> int;
```
## PublicKeyword::getStartLineNumber

```rust
pub fn getStartLineNumber(self: PublicKeyword) -> int;
```
## PublicKeyword::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: PublicKeyword, i: int) -> Node;
```
## PublicKeyword::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: PublicKeyword, i: int) -> Decorator;
```
## PublicKeyword::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: PublicKeyword) -> TopLevelDO;
```
## PublicKeyword::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: PublicKeyword) -> int;
```
## PublicKeyword::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: PublicKeyword) -> Node;
```
## PublicKeyword::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: PublicKeyword) -> *Node;
```
## PublicKeyword::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: PublicKeyword) -> *Node;
```
## PublicKeyword::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: PublicKeyword) -> *Comment;
```
## PublicKeyword::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: PublicKeyword) -> Symbol;
```
## PublicKeyword::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: PublicKeyword) -> *Decorator;
```
## PublicKeyword::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: PublicKeyword, i: int) -> Modifier;
```
## PublicKeyword::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: PublicKeyword) -> string;
```
## PublicKeyword::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *PublicKeyword;
```
## PublicKeyword::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: PublicKeyword) -> Location;
```
