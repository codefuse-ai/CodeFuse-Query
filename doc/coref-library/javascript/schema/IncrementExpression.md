# IncrementExpression

Inherit from [UpdateExpression](./UpdateExpression.md)

Primary key: `id: int`

```rust
schema IncrementExpression extends UpdateExpression {
  @primary id: int,
}
```
## IncrementExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: IncrementExpression) -> Location;
```
## IncrementExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: IncrementExpression) -> string;
```
## IncrementExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: IncrementExpression, i: int) -> Modifier;
```
## IncrementExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: IncrementExpression) -> *Decorator;
```
## IncrementExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: IncrementExpression) -> Symbol;
```
## IncrementExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: IncrementExpression) -> *Comment;
```
## IncrementExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: IncrementExpression) -> *Node;
```
## IncrementExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: IncrementExpression) -> *Node;
```
## IncrementExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: IncrementExpression) -> Node;
```
## IncrementExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: IncrementExpression) -> Node;
```
## IncrementExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: IncrementExpression) -> int;
```
## IncrementExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: IncrementExpression) -> TopLevelDO;
```
## IncrementExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: IncrementExpression, i: int) -> Decorator;
```
## IncrementExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: IncrementExpression) -> int;
```
## IncrementExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: IncrementExpression) -> *Modifier;
```
## IncrementExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: IncrementExpression) -> int;
```
## IncrementExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: IncrementExpression, i: int) -> Node;
```
## IncrementExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: IncrementExpression) -> int;
```
## IncrementExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: IncrementExpression, level: int) -> *Node;
```
## IncrementExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: IncrementExpression) -> *FunctionLikeDeclaration;
```
## IncrementExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: IncrementExpression) -> *Comment;
```
## IncrementExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: IncrementExpression) -> *Comment;
```
## IncrementExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: IncrementExpression) -> FunctionLikeDeclaration;
```
## IncrementExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: IncrementExpression) -> int;
```
## IncrementExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: IncrementExpression) -> File;
```
## IncrementExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: IncrementExpression, level: int) -> Node;
```
## IncrementExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: IncrementExpression) -> int;
```
## IncrementExpression::getIndex

```rust
pub fn getIndex(self: IncrementExpression) -> int;
```
## IncrementExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *IncrementExpression;
```
## IncrementExpression::getExpression

```rust
pub fn getExpression(self: IncrementExpression) -> Expression;
```
## IncrementExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: IncrementExpression) -> string;
```
## IncrementExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: IncrementExpression) -> int;
```
## IncrementExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: IncrementExpression) -> *Node;
```
