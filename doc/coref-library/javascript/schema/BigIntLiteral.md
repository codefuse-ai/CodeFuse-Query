# BigIntLiteral

Inherit from [LiteralExpression](./LiteralExpression.md)

Primary key: `id: int`

```rust
schema BigIntLiteral extends LiteralExpression {
  @primary id: int,
}
```
## BigIntLiteral::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: BigIntLiteral) -> Node;
```
## BigIntLiteral::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: BigIntLiteral) -> string;
```
## BigIntLiteral::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: BigIntLiteral, i: int) -> Modifier;
```
## BigIntLiteral::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: BigIntLiteral) -> Location;
```
## BigIntLiteral::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: BigIntLiteral) -> *Decorator;
```
## BigIntLiteral::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: BigIntLiteral) -> Symbol;
```
## BigIntLiteral::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: BigIntLiteral) -> *Comment;
```
## BigIntLiteral::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: BigIntLiteral) -> *Node;
```
## BigIntLiteral::getValue

```java
/**
* Gets the value of this literal, as a string.
*/
```
```rust
pub fn getValue(self: BigIntLiteral) -> string;
```
## BigIntLiteral::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: BigIntLiteral) -> *Node;
```
## BigIntLiteral::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: BigIntLiteral) -> Node;
```
## BigIntLiteral::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: BigIntLiteral) -> int;
```
## BigIntLiteral::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: BigIntLiteral) -> TopLevelDO;
```
## BigIntLiteral::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: BigIntLiteral, i: int) -> Decorator;
```
## BigIntLiteral::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: BigIntLiteral) -> int;
```
## BigIntLiteral::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: BigIntLiteral) -> int;
```
## BigIntLiteral::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: BigIntLiteral) -> *Modifier;
```
## BigIntLiteral::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: BigIntLiteral, i: int) -> Node;
```
## BigIntLiteral::getStartLineNumber

```rust
pub fn getStartLineNumber(self: BigIntLiteral) -> int;
```
## BigIntLiteral::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: BigIntLiteral, level: int) -> *Node;
```
## BigIntLiteral::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: BigIntLiteral) -> *FunctionLikeDeclaration;
```
## BigIntLiteral::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: BigIntLiteral) -> *Comment;
```
## BigIntLiteral::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: BigIntLiteral) -> *Comment;
```
## BigIntLiteral::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: BigIntLiteral) -> FunctionLikeDeclaration;
```
## BigIntLiteral::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: BigIntLiteral) -> int;
```
## BigIntLiteral::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: BigIntLiteral) -> File;
```
## BigIntLiteral::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: BigIntLiteral, level: int) -> Node;
```
## BigIntLiteral::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: BigIntLiteral) -> int;
```
## BigIntLiteral::getIndex

```rust
pub fn getIndex(self: BigIntLiteral) -> int;
```
## BigIntLiteral::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *BigIntLiteral;
```
## BigIntLiteral::getExpression

```rust
pub fn getExpression(self: BigIntLiteral) -> Expression;
```
## BigIntLiteral::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: BigIntLiteral) -> string;
```
## BigIntLiteral::getEndLineNumber

```rust
pub fn getEndLineNumber(self: BigIntLiteral) -> int;
```
## BigIntLiteral::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: BigIntLiteral) -> *Node;
```
