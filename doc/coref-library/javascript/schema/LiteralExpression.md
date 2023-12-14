# LiteralExpression

Inherit from [PrimaryExpression](./PrimaryExpression.md)

Primary key: `id: int`

```rust
schema LiteralExpression extends PrimaryExpression {
  @primary id: int,
}
```
## LiteralExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: LiteralExpression) -> *Node;
```
## LiteralExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: LiteralExpression) -> int;
```
## LiteralExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: LiteralExpression) -> string;
```
## LiteralExpression::getExpression

```rust
pub fn getExpression(self: LiteralExpression) -> Expression;
```
## LiteralExpression::getIndex

```rust
pub fn getIndex(self: LiteralExpression) -> int;
```
## LiteralExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: LiteralExpression) -> int;
```
## LiteralExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: LiteralExpression, level: int) -> Node;
```
## LiteralExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: LiteralExpression) -> File;
```
## LiteralExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: LiteralExpression) -> int;
```
## LiteralExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: LiteralExpression) -> FunctionLikeDeclaration;
```
## LiteralExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: LiteralExpression) -> *Comment;
```
## LiteralExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: LiteralExpression) -> *Comment;
```
## LiteralExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: LiteralExpression, level: int) -> *Node;
```
## LiteralExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: LiteralExpression) -> *FunctionLikeDeclaration;
```
## LiteralExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: LiteralExpression) -> int;
```
## LiteralExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: LiteralExpression, i: int) -> Node;
```
## LiteralExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: LiteralExpression) -> int;
```
## LiteralExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: LiteralExpression) -> int;
```
## LiteralExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: LiteralExpression) -> *Modifier;
```
## LiteralExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: LiteralExpression, i: int) -> Decorator;
```
## LiteralExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: LiteralExpression) -> TopLevelDO;
```
## LiteralExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: LiteralExpression) -> int;
```
## LiteralExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: LiteralExpression) -> Node;
```
## LiteralExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: LiteralExpression) -> *Node;
```
## LiteralExpression::getValue

```java
/**
* Gets the value of this literal, as a string.
*/
```
```rust
pub fn getValue(self: LiteralExpression) -> string;
```
## LiteralExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: LiteralExpression) -> *Node;
```
## LiteralExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: LiteralExpression) -> *Comment;
```
## LiteralExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: LiteralExpression) -> Symbol;
```
## LiteralExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: LiteralExpression) -> *Decorator;
```
## LiteralExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: LiteralExpression) -> Location;
```
## LiteralExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *LiteralExpression;
```
## LiteralExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: LiteralExpression, i: int) -> Modifier;
```
## LiteralExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: LiteralExpression) -> string;
```
## LiteralExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: LiteralExpression) -> Node;
```
