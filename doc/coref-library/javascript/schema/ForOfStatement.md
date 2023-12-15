# ForOfStatement

Inherit from [EnhancedForStatement](./EnhancedForStatement.md)

Primary key: `id: int`

```rust
schema ForOfStatement extends EnhancedForStatement {
  @primary id: int
}
```
## ForOfStatement::getInitializerIndex

```java
/**
* Gets the iterator index of this loop.
*
* In a `for`-`in` loop, the index is always 0.
* In a `for`-`of` loop, the index is 1 if it is a `for`-`await`-`of`, otherwise, the index is 0.
*/
```
```rust
pub fn getInitializerIndex(self: ForOfStatement) -> int;
```
## ForOfStatement::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: ForOfStatement) -> int;
```
## ForOfStatement::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: ForOfStatement) -> *Node;
```
## ForOfStatement::getIndex

```rust
pub fn getIndex(self: ForOfStatement) -> int;
```
## ForOfStatement::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: ForOfStatement) -> Node;
```
## ForOfStatement::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: ForOfStatement) -> FunctionLikeDeclaration;
```
## ForOfStatement::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ForOfStatement) -> int;
```
## ForOfStatement::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: ForOfStatement) -> File;
```
## ForOfStatement::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: ForOfStatement, level: int) -> Node;
```
## ForOfStatement::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: ForOfStatement) -> string;
```
## ForOfStatement::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ForOfStatement) -> int;
```
## ForOfStatement::getInitializer

```java
/**
* Gets the iterator of this `for`-`in` or `for`-`of` loop.
*/
```
```rust
pub fn getInitializer(self: ForOfStatement) -> ForInitializer;
```
## ForOfStatement::getExpression

```java
/**
* Gets the expression over which this `for`-`in` or `for`-`of` loop iterates.
*/
```
```rust
pub fn getExpression(self: ForOfStatement) -> Expression;
```
## ForOfStatement::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: ForOfStatement) -> int;
```
## ForOfStatement::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: ForOfStatement) -> *Modifier;
```
## ForOfStatement::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ForOfStatement) -> int;
```
## ForOfStatement::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: ForOfStatement, level: int) -> *Node;
```
## ForOfStatement::getBody

```java
/**
* Gets the body of this `for`-`in` or `for`-`of` loop.
*/
```
```rust
pub fn getBody(self: ForOfStatement) -> Statement;
```
## ForOfStatement::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ForOfStatement) -> *FunctionLikeDeclaration;
```
## ForOfStatement::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ForOfStatement) -> int;
```
## ForOfStatement::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: ForOfStatement, i: int) -> Node;
```
## ForOfStatement::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: ForOfStatement, i: int) -> Decorator;
```
## ForOfStatement::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: ForOfStatement) -> TopLevelDO;
```
## ForOfStatement::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: ForOfStatement) -> int;
```
## ForOfStatement::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: ForOfStatement) -> *Comment;
```
## ForOfStatement::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: ForOfStatement) -> *Comment;
```
## ForOfStatement::isAwait

```java
/**
* Determines whether the `for`-`of` loop is a `for`-`await`-`of` loop
*/
```
```rust
pub fn isAwait(self: ForOfStatement) -> bool;
```
## ForOfStatement::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: ForOfStatement) -> Node;
```
## ForOfStatement::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: ForOfStatement) -> *Node;
```
## ForOfStatement::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: ForOfStatement) -> *Node;
```
## ForOfStatement::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: ForOfStatement) -> *Comment;
```
## ForOfStatement::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: ForOfStatement) -> Symbol;
```
## ForOfStatement::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: ForOfStatement) -> *Decorator;
```
## ForOfStatement::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *ForOfStatement;
```
## ForOfStatement::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: ForOfStatement) -> Location;
```
## ForOfStatement::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: ForOfStatement) -> string;
```
## ForOfStatement::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: ForOfStatement, i: int) -> Modifier;
```
