# TrueLiteral

Inherit from [PrimaryExpression](./PrimaryExpression.md)

Primary key: `id: int`

```rust
schema TrueLiteral extends PrimaryExpression {
  @primary id: int
}
```
## TrueLiteral::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: TrueLiteral) -> *Node;
```
## TrueLiteral::getEndLineNumber

```rust
pub fn getEndLineNumber(self: TrueLiteral) -> int;
```
## TrueLiteral::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: TrueLiteral) -> string;
```
## TrueLiteral::getExpression

```rust
pub fn getExpression(self: TrueLiteral) -> Expression;
```
## TrueLiteral::getIndex

```rust
pub fn getIndex(self: TrueLiteral) -> int;
```
## TrueLiteral::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: TrueLiteral) -> int;
```
## TrueLiteral::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: TrueLiteral, level: int) -> Node;
```
## TrueLiteral::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: TrueLiteral) -> File;
```
## TrueLiteral::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: TrueLiteral) -> int;
```
## TrueLiteral::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: TrueLiteral) -> FunctionLikeDeclaration;
```
## TrueLiteral::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: TrueLiteral) -> *Comment;
```
## TrueLiteral::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: TrueLiteral) -> *Comment;
```
## TrueLiteral::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: TrueLiteral) -> *FunctionLikeDeclaration;
```
## TrueLiteral::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: TrueLiteral, level: int) -> *Node;
```
## TrueLiteral::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: TrueLiteral) -> int;
```
## TrueLiteral::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: TrueLiteral) -> *Modifier;
```
## TrueLiteral::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: TrueLiteral) -> int;
```
## TrueLiteral::getStartLineNumber

```rust
pub fn getStartLineNumber(self: TrueLiteral) -> int;
```
## TrueLiteral::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: TrueLiteral, i: int) -> Node;
```
## TrueLiteral::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: TrueLiteral, i: int) -> Decorator;
```
## TrueLiteral::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: TrueLiteral) -> TopLevelDO;
```
## TrueLiteral::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: TrueLiteral) -> int;
```
## TrueLiteral::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: TrueLiteral) -> Node;
```
## TrueLiteral::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: TrueLiteral) -> Node;
```
## TrueLiteral::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: TrueLiteral) -> *Node;
```
## TrueLiteral::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: TrueLiteral) -> *Node;
```
## TrueLiteral::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: TrueLiteral) -> *Comment;
```
## TrueLiteral::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *TrueLiteral;
```
## TrueLiteral::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: TrueLiteral) -> Location;
```
## TrueLiteral::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: TrueLiteral) -> Symbol;
```
## TrueLiteral::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: TrueLiteral) -> *Decorator;
```
## TrueLiteral::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: TrueLiteral, i: int) -> Modifier;
```
## TrueLiteral::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: TrueLiteral) -> string;
```
