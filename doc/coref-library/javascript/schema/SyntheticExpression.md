# SyntheticExpression

Inherit from [Expression](./Expression.md)

Primary key: `id: int`

```rust
schema SyntheticExpression extends Expression {
  @primary id: int
}
```
## SyntheticExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: SyntheticExpression) -> Location;
```
## SyntheticExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: SyntheticExpression) -> Symbol;
```
## SyntheticExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: SyntheticExpression) -> *Decorator;
```
## SyntheticExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: SyntheticExpression) -> string;
```
## SyntheticExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: SyntheticExpression, i: int) -> Modifier;
```
## SyntheticExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: SyntheticExpression) -> *Comment;
```
## SyntheticExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: SyntheticExpression) -> *Node;
```
## SyntheticExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: SyntheticExpression) -> *Node;
```
## SyntheticExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: SyntheticExpression) -> Node;
```
## SyntheticExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: SyntheticExpression) -> int;
```
## SyntheticExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: SyntheticExpression) -> TopLevelDO;
```
## SyntheticExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: SyntheticExpression, i: int) -> Decorator;
```
## SyntheticExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: SyntheticExpression) -> int;
```
## SyntheticExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: SyntheticExpression) -> *Modifier;
```
## SyntheticExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: SyntheticExpression) -> int;
```
## SyntheticExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: SyntheticExpression, i: int) -> Node;
```
## SyntheticExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: SyntheticExpression) -> int;
```
## SyntheticExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: SyntheticExpression) -> *FunctionLikeDeclaration;
```
## SyntheticExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: SyntheticExpression, level: int) -> *Node;
```
## SyntheticExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: SyntheticExpression) -> int;
```
## SyntheticExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: SyntheticExpression) -> string;
```
## SyntheticExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: SyntheticExpression, level: int) -> Node;
```
## SyntheticExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: SyntheticExpression) -> File;
```
## SyntheticExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: SyntheticExpression) -> *Comment;
```
## SyntheticExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: SyntheticExpression) -> *Comment;
```
## SyntheticExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: SyntheticExpression) -> Node;
```
## SyntheticExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: SyntheticExpression) -> FunctionLikeDeclaration;
```
## SyntheticExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: SyntheticExpression) -> int;
```
## SyntheticExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: SyntheticExpression) -> int;
```
## SyntheticExpression::getIndex

```rust
pub fn getIndex(self: SyntheticExpression) -> int;
```
## SyntheticExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: SyntheticExpression) -> *Node;
```
## SyntheticExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *SyntheticExpression;
```
