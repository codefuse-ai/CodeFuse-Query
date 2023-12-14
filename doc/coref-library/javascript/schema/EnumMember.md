# EnumMember

Primary key: `id: int`

```rust
schema EnumMember {
  @primary id: int,
}
```
## EnumMember::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: EnumMember) -> *Node;
```
## EnumMember::getIndex

```rust
pub fn getIndex(self: EnumMember) -> int;
```
## EnumMember::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: EnumMember) -> int;
```
## EnumMember::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: EnumMember) -> int;
```
## EnumMember::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: EnumMember) -> Node;
```
## EnumMember::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: EnumMember) -> FunctionLikeDeclaration;
```
## EnumMember::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: EnumMember) -> File;
```
## EnumMember::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: EnumMember, level: int) -> Node;
```
## EnumMember::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: EnumMember) -> Location;
```
## EnumMember::getStartLineNumber

```rust
pub fn getStartLineNumber(self: EnumMember) -> int;
```
## EnumMember::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: EnumMember) -> *FunctionLikeDeclaration;
```
## EnumMember::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: EnumMember, level: int) -> *Node;
```
## EnumMember::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: EnumMember) -> int;
```
## EnumMember::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: EnumMember) -> *Modifier;
```
## EnumMember::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: EnumMember) -> int;
```
## EnumMember::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: EnumMember, i: int) -> Node;
```
## EnumMember::getName

```java
/**
* Gets the name of the current EnumMember.
*/
```
```rust
pub fn getName(self: EnumMember) -> PropertyName;
```
## EnumMember::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: EnumMember) -> int;
```
## EnumMember::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: EnumMember) -> TopLevelDO;
```
## EnumMember::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: EnumMember, i: int) -> Decorator;
```
## EnumMember::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: EnumMember) -> *Comment;
```
## EnumMember::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: EnumMember) -> *Comment;
```
## EnumMember::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: EnumMember) -> *Node;
```
## EnumMember::getParent

```rust
pub fn getParent(self: EnumMember) -> EnumDeclaration;
```
## EnumMember::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: EnumMember) -> Symbol;
```
## EnumMember::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: EnumMember) -> *Decorator;
```
## EnumMember::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: EnumMember) -> string;
```
## EnumMember::getEndLineNumber

```rust
pub fn getEndLineNumber(self: EnumMember) -> int;
```
## EnumMember::getInitializer

```java
/**
* Gets the initializer of the current EnumMember.
*/
```
```rust
pub fn getInitializer(self: EnumMember) -> Expression;
```
## EnumMember::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: EnumMember, i: int) -> Modifier;
```
## EnumMember::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: EnumMember) -> string;
```
## EnumMember::hasInitializer

```java
/**
* Determine whether this EnumMember has an initializer.
*/
```
```rust
pub fn hasInitializer(self: EnumMember) -> bool;
```
## EnumMember::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: EnumMember) -> *Node;
```
## EnumMember::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: EnumMember) -> *Comment;
```
## EnumMember::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *EnumMember;
```
