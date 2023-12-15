# CallLikeExpression

Inherit from [Expression](./Expression.md)

Primary key: `id: int`

```rust
schema CallLikeExpression extends Expression {
  @primary id: int
}
```
## CallLikeExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: CallLikeExpression) -> Location;
```
## CallLikeExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: CallLikeExpression) -> Symbol;
```
## CallLikeExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: CallLikeExpression) -> *Decorator;
```
## CallLikeExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: CallLikeExpression) -> string;
```
## CallLikeExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: CallLikeExpression, i: int) -> Modifier;
```
## CallLikeExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: CallLikeExpression) -> *Comment;
```
## CallLikeExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: CallLikeExpression) -> *Node;
```
## CallLikeExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: CallLikeExpression) -> *Comment;
```
## CallLikeExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: CallLikeExpression) -> *Comment;
```
## CallLikeExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: CallLikeExpression) -> int;
```
## CallLikeExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: CallLikeExpression) -> TopLevelDO;
```
## CallLikeExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: CallLikeExpression, i: int) -> Decorator;
```
## CallLikeExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: CallLikeExpression) -> int;
```
## CallLikeExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: CallLikeExpression) -> *Modifier;
```
## CallLikeExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: CallLikeExpression) -> int;
```
## CallLikeExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: CallLikeExpression, i: int) -> Node;
```
## CallLikeExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: CallLikeExpression) -> int;
```
## CallLikeExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: CallLikeExpression) -> *FunctionLikeDeclaration;
```
## CallLikeExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: CallLikeExpression, level: int) -> *Node;
```
## CallLikeExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: CallLikeExpression) -> int;
```
## CallLikeExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: CallLikeExpression) -> string;
```
## CallLikeExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: CallLikeExpression, level: int) -> Node;
```
## CallLikeExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: CallLikeExpression) -> File;
```
## CallLikeExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: CallLikeExpression) -> Node;
```
## CallLikeExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: CallLikeExpression) -> FunctionLikeDeclaration;
```
## CallLikeExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: CallLikeExpression) -> int;
```
## CallLikeExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: CallLikeExpression) -> int;
```
## CallLikeExpression::getIndex

```rust
pub fn getIndex(self: CallLikeExpression) -> int;
```
## CallLikeExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: CallLikeExpression) -> *Node;
```
## CallLikeExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: CallLikeExpression) -> Node;
```
## CallLikeExpression::hasCallee

```java
/**
* Determine whether this CallLikeExpression has a callee.
*/
```
```rust
pub fn hasCallee(self: CallLikeExpression) -> bool;
```
## CallLikeExpression::getCallee

```java
/**
* Gets the callee of this call-like expression.
*/
```
```rust
pub fn getCallee(self: CallLikeExpression) -> FunctionLikeDeclaration;
```
## CallLikeExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: CallLikeExpression) -> *Node;
```
## CallLikeExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *CallLikeExpression;
```
