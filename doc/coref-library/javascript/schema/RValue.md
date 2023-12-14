# RValue

Inherit from [RefExpr](./RefExpr.md)

Primary key: `id: int`

```rust
schema RValue extends RefExpr {
  @primary id: int,
}
```
## RValue::getRefName

```java
/**
* Get the name of this RefExpr.
*/
```
```rust
pub fn getRefName(self: RValue) -> string;
```
## RValue::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: RValue, level: int) -> Node;
```
## RValue::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: RValue) -> string;
```
## RValue::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: RValue, i: int) -> Modifier;
```
## RValue::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: RValue) -> *Decorator;
```
## RValue::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: RValue) -> Symbol;
```
## RValue::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: RValue) -> *Comment;
```
## RValue::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: RValue) -> *Node;
```
## RValue::hasSymbol

```java
/**
* Determine whether this RefExpr has symbol.
*/
```
```rust
pub fn hasSymbol(self: RValue) -> bool;
```
## RValue::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: RValue) -> File;
```
## RValue::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: RValue) -> Node;
```
## RValue::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: RValue) -> *Node;
```
## RValue::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: RValue, i: int) -> Decorator;
```
## RValue::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: RValue) -> TopLevelDO;
```
## RValue::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: RValue) -> int;
```
## RValue::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: RValue) -> int;
```
## RValue::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: RValue) -> *Modifier;
```
## RValue::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: RValue) -> int;
```
## RValue::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: RValue, i: int) -> Node;
```
## RValue::getStartLineNumber

```rust
pub fn getStartLineNumber(self: RValue) -> int;
```
## RValue::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: RValue, level: int) -> *Node;
```
## RValue::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: RValue) -> *FunctionLikeDeclaration;
```
## RValue::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *RValue;
```
## RValue::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: RValue) -> Location;
```
## RValue::getEndLineNumber

```rust
pub fn getEndLineNumber(self: RValue) -> int;
```
## RValue::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: RValue) -> string;
```
## RValue::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: RValue) -> *Comment;
```
## RValue::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: RValue) -> *Comment;
```
## RValue::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: RValue) -> Node;
```
## RValue::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: RValue) -> FunctionLikeDeclaration;
```
## RValue::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: RValue) -> int;
```
## RValue::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: RValue) -> int;
```
## RValue::getIndex

```rust
pub fn getIndex(self: RValue) -> int;
```
## RValue::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: RValue) -> *Node;
```
