# FalseLiteral

Inherit from [PrimaryExpression](./PrimaryExpression.md)

Primary key: `id: int`

```rust
schema FalseLiteral extends PrimaryExpression {
  @primary id: int,
}
```
## FalseLiteral::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: FalseLiteral) -> *Node;
```
## FalseLiteral::getEndLineNumber

```rust
pub fn getEndLineNumber(self: FalseLiteral) -> int;
```
## FalseLiteral::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: FalseLiteral) -> string;
```
## FalseLiteral::getExpression

```rust
pub fn getExpression(self: FalseLiteral) -> Expression;
```
## FalseLiteral::getIndex

```rust
pub fn getIndex(self: FalseLiteral) -> int;
```
## FalseLiteral::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: FalseLiteral) -> int;
```
## FalseLiteral::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: FalseLiteral, level: int) -> Node;
```
## FalseLiteral::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: FalseLiteral) -> File;
```
## FalseLiteral::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: FalseLiteral) -> int;
```
## FalseLiteral::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: FalseLiteral) -> FunctionLikeDeclaration;
```
## FalseLiteral::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: FalseLiteral) -> *Comment;
```
## FalseLiteral::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: FalseLiteral) -> *Comment;
```
## FalseLiteral::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: FalseLiteral) -> *FunctionLikeDeclaration;
```
## FalseLiteral::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: FalseLiteral, level: int) -> *Node;
```
## FalseLiteral::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: FalseLiteral) -> int;
```
## FalseLiteral::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: FalseLiteral) -> *Modifier;
```
## FalseLiteral::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: FalseLiteral) -> int;
```
## FalseLiteral::getStartLineNumber

```rust
pub fn getStartLineNumber(self: FalseLiteral) -> int;
```
## FalseLiteral::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: FalseLiteral, i: int) -> Node;
```
## FalseLiteral::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: FalseLiteral, i: int) -> Decorator;
```
## FalseLiteral::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: FalseLiteral) -> TopLevelDO;
```
## FalseLiteral::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: FalseLiteral) -> int;
```
## FalseLiteral::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: FalseLiteral) -> Node;
```
## FalseLiteral::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: FalseLiteral) -> Node;
```
## FalseLiteral::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: FalseLiteral) -> *Node;
```
## FalseLiteral::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: FalseLiteral) -> *Node;
```
## FalseLiteral::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: FalseLiteral) -> *Comment;
```
## FalseLiteral::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *FalseLiteral;
```
## FalseLiteral::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: FalseLiteral) -> Location;
```
## FalseLiteral::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: FalseLiteral) -> Symbol;
```
## FalseLiteral::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: FalseLiteral) -> *Decorator;
```
## FalseLiteral::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: FalseLiteral, i: int) -> Modifier;
```
## FalseLiteral::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: FalseLiteral) -> string;
```
