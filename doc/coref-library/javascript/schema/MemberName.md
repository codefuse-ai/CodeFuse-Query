# MemberName

Inherit from [Node](./Node.md)

Primary key: `id: int`

```rust
schema MemberName extends Node {
  @primary id: int,
}
```
## MemberName::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: MemberName) -> *Node;
```
## MemberName::getIndex

```rust
pub fn getIndex(self: MemberName) -> int;
```
## MemberName::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: MemberName) -> int;
```
## MemberName::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: MemberName) -> int;
```
## MemberName::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: MemberName) -> Node;
```
## MemberName::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: MemberName) -> FunctionLikeDeclaration;
```
## MemberName::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: MemberName) -> File;
```
## MemberName::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: MemberName, level: int) -> Node;
```
## MemberName::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: MemberName) -> string;
```
## MemberName::getEndLineNumber

```rust
pub fn getEndLineNumber(self: MemberName) -> int;
```
## MemberName::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: MemberName) -> *FunctionLikeDeclaration;
```
## MemberName::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: MemberName, level: int) -> *Node;
```
## MemberName::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: MemberName) -> int;
```
## MemberName::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: MemberName) -> *Modifier;
```
## MemberName::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: MemberName) -> int;
```
## MemberName::getStartLineNumber

```rust
pub fn getStartLineNumber(self: MemberName) -> int;
```
## MemberName::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: MemberName, i: int) -> Node;
```
## MemberName::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: MemberName) -> TopLevelDO;
```
## MemberName::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: MemberName, i: int) -> Decorator;
```
## MemberName::getName

```java
/**
* Gets the name of this MemberName.
*/
```
```rust
pub fn getName(self: MemberName) -> string;
```
## MemberName::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: MemberName) -> int;
```
## MemberName::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: MemberName) -> *Comment;
```
## MemberName::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: MemberName) -> *Comment;
```
## MemberName::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: MemberName) -> *Node;
```
## MemberName::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: MemberName) -> Node;
```
## MemberName::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: MemberName, i: int) -> Modifier;
```
## MemberName::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: MemberName) -> string;
```
## MemberName::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: MemberName) -> *Decorator;
```
## MemberName::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: MemberName) -> Symbol;
```
## MemberName::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: MemberName) -> Location;
```
## MemberName::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *MemberName;
```
## MemberName::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: MemberName) -> *Node;
```
## MemberName::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: MemberName) -> *Comment;
```
