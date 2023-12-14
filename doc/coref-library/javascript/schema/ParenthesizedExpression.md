# ParenthesizedExpression

Inherit from [PrimaryExpression](./PrimaryExpression.md)

Primary key: `id: int`

```rust
schema ParenthesizedExpression extends PrimaryExpression {
  @primary id: int,
}
```
## ParenthesizedExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: ParenthesizedExpression) -> *Node;
```
## ParenthesizedExpression::getIndex

```rust
pub fn getIndex(self: ParenthesizedExpression) -> int;
```
## ParenthesizedExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: ParenthesizedExpression) -> int;
```
## ParenthesizedExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: ParenthesizedExpression, level: int) -> Node;
```
## ParenthesizedExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: ParenthesizedExpression) -> File;
```
## ParenthesizedExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ParenthesizedExpression) -> int;
```
## ParenthesizedExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: ParenthesizedExpression) -> FunctionLikeDeclaration;
```
## ParenthesizedExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: ParenthesizedExpression) -> *Comment;
```
## ParenthesizedExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: ParenthesizedExpression) -> *Comment;
```
## ParenthesizedExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ParenthesizedExpression) -> *FunctionLikeDeclaration;
```
## ParenthesizedExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: ParenthesizedExpression, level: int) -> *Node;
```
## ParenthesizedExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: ParenthesizedExpression) -> int;
```
## ParenthesizedExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: ParenthesizedExpression) -> *Modifier;
```
## ParenthesizedExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ParenthesizedExpression) -> int;
```
## ParenthesizedExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ParenthesizedExpression) -> int;
```
## ParenthesizedExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: ParenthesizedExpression, i: int) -> Node;
```
## ParenthesizedExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: ParenthesizedExpression, i: int) -> Decorator;
```
## ParenthesizedExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: ParenthesizedExpression) -> TopLevelDO;
```
## ParenthesizedExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: ParenthesizedExpression) -> int;
```
## ParenthesizedExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: ParenthesizedExpression) -> Node;
```
## ParenthesizedExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: ParenthesizedExpression) -> *Node;
```
## ParenthesizedExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: ParenthesizedExpression) -> *Node;
```
## ParenthesizedExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: ParenthesizedExpression) -> *Comment;
```
## ParenthesizedExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: ParenthesizedExpression) -> Symbol;
```
## ParenthesizedExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: ParenthesizedExpression) -> *Decorator;
```
## ParenthesizedExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ParenthesizedExpression) -> int;
```
## ParenthesizedExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: ParenthesizedExpression) -> string;
```
## ParenthesizedExpression::getExpression

```rust
pub fn getExpression(self: ParenthesizedExpression) -> Expression;
```
## ParenthesizedExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: ParenthesizedExpression) -> Location;
```
## ParenthesizedExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *ParenthesizedExpression;
```
## ParenthesizedExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: ParenthesizedExpression, i: int) -> Modifier;
```
## ParenthesizedExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: ParenthesizedExpression) -> string;
```
## ParenthesizedExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: ParenthesizedExpression) -> Node;
```
