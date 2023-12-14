# BooleanLiteral

Inherit from [PrimaryExpression](./PrimaryExpression.md)

Primary key: `id: int`

```rust
schema BooleanLiteral extends PrimaryExpression {
  @primary id: int,
}
```
## BooleanLiteral::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: BooleanLiteral) -> *Node;
```
## BooleanLiteral::getEndLineNumber

```rust
pub fn getEndLineNumber(self: BooleanLiteral) -> int;
```
## BooleanLiteral::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: BooleanLiteral) -> string;
```
## BooleanLiteral::getExpression

```rust
pub fn getExpression(self: BooleanLiteral) -> Expression;
```
## BooleanLiteral::getIndex

```rust
pub fn getIndex(self: BooleanLiteral) -> int;
```
## BooleanLiteral::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: BooleanLiteral) -> int;
```
## BooleanLiteral::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: BooleanLiteral, level: int) -> Node;
```
## BooleanLiteral::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: BooleanLiteral) -> File;
```
## BooleanLiteral::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: BooleanLiteral) -> int;
```
## BooleanLiteral::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: BooleanLiteral) -> FunctionLikeDeclaration;
```
## BooleanLiteral::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: BooleanLiteral) -> *Comment;
```
## BooleanLiteral::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: BooleanLiteral) -> *Comment;
```
## BooleanLiteral::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: BooleanLiteral) -> *FunctionLikeDeclaration;
```
## BooleanLiteral::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: BooleanLiteral, level: int) -> *Node;
```
## BooleanLiteral::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: BooleanLiteral) -> int;
```
## BooleanLiteral::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: BooleanLiteral) -> *Modifier;
```
## BooleanLiteral::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: BooleanLiteral) -> int;
```
## BooleanLiteral::getStartLineNumber

```rust
pub fn getStartLineNumber(self: BooleanLiteral) -> int;
```
## BooleanLiteral::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: BooleanLiteral, i: int) -> Node;
```
## BooleanLiteral::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: BooleanLiteral, i: int) -> Decorator;
```
## BooleanLiteral::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: BooleanLiteral) -> TopLevelDO;
```
## BooleanLiteral::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: BooleanLiteral) -> int;
```
## BooleanLiteral::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: BooleanLiteral) -> Node;
```
## BooleanLiteral::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: BooleanLiteral) -> Node;
```
## BooleanLiteral::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: BooleanLiteral) -> *Node;
```
## BooleanLiteral::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: BooleanLiteral) -> *Node;
```
## BooleanLiteral::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: BooleanLiteral) -> *Comment;
```
## BooleanLiteral::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *BooleanLiteral;
```
## BooleanLiteral::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: BooleanLiteral) -> Location;
```
## BooleanLiteral::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: BooleanLiteral) -> Symbol;
```
## BooleanLiteral::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: BooleanLiteral) -> *Decorator;
```
## BooleanLiteral::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: BooleanLiteral, i: int) -> Modifier;
```
## BooleanLiteral::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: BooleanLiteral) -> string;
```
