# OmittedExpression

Inherit from [Expression](./Expression.md)

Primary key: `id: int`

```rust
schema OmittedExpression extends Expression {
  @primary id: int,
}
```
## OmittedExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: OmittedExpression) -> Location;
```
## OmittedExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: OmittedExpression) -> Symbol;
```
## OmittedExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: OmittedExpression) -> *Decorator;
```
## OmittedExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: OmittedExpression) -> string;
```
## OmittedExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: OmittedExpression, i: int) -> Modifier;
```
## OmittedExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: OmittedExpression) -> *Comment;
```
## OmittedExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: OmittedExpression) -> *Node;
```
## OmittedExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: OmittedExpression) -> *Node;
```
## OmittedExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: OmittedExpression) -> Node;
```
## OmittedExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: OmittedExpression) -> int;
```
## OmittedExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: OmittedExpression) -> TopLevelDO;
```
## OmittedExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: OmittedExpression, i: int) -> Decorator;
```
## OmittedExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: OmittedExpression) -> int;
```
## OmittedExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: OmittedExpression) -> *Modifier;
```
## OmittedExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: OmittedExpression) -> int;
```
## OmittedExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: OmittedExpression, i: int) -> Node;
```
## OmittedExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: OmittedExpression) -> int;
```
## OmittedExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: OmittedExpression) -> *FunctionLikeDeclaration;
```
## OmittedExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: OmittedExpression, level: int) -> *Node;
```
## OmittedExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: OmittedExpression) -> int;
```
## OmittedExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: OmittedExpression) -> string;
```
## OmittedExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: OmittedExpression, level: int) -> Node;
```
## OmittedExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: OmittedExpression) -> File;
```
## OmittedExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: OmittedExpression) -> *Comment;
```
## OmittedExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: OmittedExpression) -> *Comment;
```
## OmittedExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: OmittedExpression) -> Node;
```
## OmittedExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: OmittedExpression) -> FunctionLikeDeclaration;
```
## OmittedExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: OmittedExpression) -> int;
```
## OmittedExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: OmittedExpression) -> int;
```
## OmittedExpression::getIndex

```rust
pub fn getIndex(self: OmittedExpression) -> int;
```
## OmittedExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: OmittedExpression) -> *Node;
```
## OmittedExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *OmittedExpression;
```
