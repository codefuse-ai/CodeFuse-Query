# DecrementExpression

Inherit from [UpdateExpression](./UpdateExpression.md)

Primary key: `id: int`

```rust
schema DecrementExpression extends UpdateExpression {
  @primary id: int
}
```
## DecrementExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: DecrementExpression) -> Location;
```
## DecrementExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: DecrementExpression) -> string;
```
## DecrementExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: DecrementExpression, i: int) -> Modifier;
```
## DecrementExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: DecrementExpression) -> *Decorator;
```
## DecrementExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: DecrementExpression) -> Symbol;
```
## DecrementExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: DecrementExpression) -> *Comment;
```
## DecrementExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: DecrementExpression) -> *Node;
```
## DecrementExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: DecrementExpression) -> *Node;
```
## DecrementExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: DecrementExpression) -> Node;
```
## DecrementExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: DecrementExpression) -> Node;
```
## DecrementExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: DecrementExpression) -> int;
```
## DecrementExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: DecrementExpression) -> TopLevelDO;
```
## DecrementExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: DecrementExpression, i: int) -> Decorator;
```
## DecrementExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: DecrementExpression) -> int;
```
## DecrementExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: DecrementExpression) -> *Modifier;
```
## DecrementExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: DecrementExpression) -> int;
```
## DecrementExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: DecrementExpression, i: int) -> Node;
```
## DecrementExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: DecrementExpression) -> int;
```
## DecrementExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: DecrementExpression, level: int) -> *Node;
```
## DecrementExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: DecrementExpression) -> *FunctionLikeDeclaration;
```
## DecrementExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: DecrementExpression) -> *Comment;
```
## DecrementExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: DecrementExpression) -> *Comment;
```
## DecrementExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: DecrementExpression) -> FunctionLikeDeclaration;
```
## DecrementExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: DecrementExpression) -> int;
```
## DecrementExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: DecrementExpression) -> File;
```
## DecrementExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: DecrementExpression, level: int) -> Node;
```
## DecrementExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: DecrementExpression) -> int;
```
## DecrementExpression::getIndex

```rust
pub fn getIndex(self: DecrementExpression) -> int;
```
## DecrementExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *DecrementExpression;
```
## DecrementExpression::getExpression

```rust
pub fn getExpression(self: DecrementExpression) -> Expression;
```
## DecrementExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: DecrementExpression) -> string;
```
## DecrementExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: DecrementExpression) -> int;
```
## DecrementExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: DecrementExpression) -> *Node;
```
