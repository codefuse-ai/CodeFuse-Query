# SpreadElement

Inherit from [Expression](./Expression.md)

Primary key: `id: int`

```rust
schema SpreadElement extends Expression {
  @primary id: int,
}
```
## SpreadElement::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: SpreadElement) -> Location;
```
## SpreadElement::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: SpreadElement) -> Symbol;
```
## SpreadElement::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: SpreadElement) -> *Decorator;
```
## SpreadElement::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: SpreadElement) -> string;
```
## SpreadElement::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: SpreadElement, i: int) -> Modifier;
```
## SpreadElement::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: SpreadElement) -> *Comment;
```
## SpreadElement::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: SpreadElement) -> *Node;
```
## SpreadElement::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: SpreadElement) -> *Node;
```
## SpreadElement::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: SpreadElement) -> Node;
```
## SpreadElement::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: SpreadElement) -> int;
```
## SpreadElement::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: SpreadElement) -> TopLevelDO;
```
## SpreadElement::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: SpreadElement, i: int) -> Decorator;
```
## SpreadElement::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: SpreadElement) -> int;
```
## SpreadElement::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: SpreadElement) -> *Modifier;
```
## SpreadElement::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: SpreadElement) -> int;
```
## SpreadElement::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: SpreadElement, i: int) -> Node;
```
## SpreadElement::getStartLineNumber

```rust
pub fn getStartLineNumber(self: SpreadElement) -> int;
```
## SpreadElement::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: SpreadElement, level: int) -> *Node;
```
## SpreadElement::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: SpreadElement) -> *FunctionLikeDeclaration;
```
## SpreadElement::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: SpreadElement) -> *Comment;
```
## SpreadElement::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: SpreadElement) -> *Comment;
```
## SpreadElement::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: SpreadElement) -> Node;
```
## SpreadElement::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: SpreadElement) -> int;
```
## SpreadElement::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: SpreadElement) -> FunctionLikeDeclaration;
```
## SpreadElement::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: SpreadElement) -> File;
```
## SpreadElement::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: SpreadElement, level: int) -> Node;
```
## SpreadElement::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: SpreadElement) -> int;
```
## SpreadElement::getIndex

```rust
pub fn getIndex(self: SpreadElement) -> int;
```
## SpreadElement::getExpression

```rust
pub fn getExpression(self: SpreadElement) -> Expression;
```
## SpreadElement::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: SpreadElement) -> string;
```
## SpreadElement::getEndLineNumber

```rust
pub fn getEndLineNumber(self: SpreadElement) -> int;
```
## SpreadElement::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: SpreadElement) -> *Node;
```
## SpreadElement::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *SpreadElement;
```
