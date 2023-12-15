# ForInStatement

Inherit from [EnhancedForStatement](./EnhancedForStatement.md)

Primary key: `id: int`

```rust
schema ForInStatement extends EnhancedForStatement {
  @primary id: int
}
```
## ForInStatement::getInitializerIndex

```java
/**
* Gets the iterator index of this loop.
*
* In a `for`-`in` loop, the index is always 0.
* In a `for`-`of` loop, the index is 1 if it is a `for`-`await`-`of`, otherwise, the index is 0.
*/
```
```rust
pub fn getInitializerIndex(self: ForInStatement) -> int;
```
## ForInStatement::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: ForInStatement) -> int;
```
## ForInStatement::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: ForInStatement) -> *Node;
```
## ForInStatement::getIndex

```rust
pub fn getIndex(self: ForInStatement) -> int;
```
## ForInStatement::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: ForInStatement) -> Node;
```
## ForInStatement::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: ForInStatement) -> FunctionLikeDeclaration;
```
## ForInStatement::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ForInStatement) -> int;
```
## ForInStatement::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: ForInStatement) -> File;
```
## ForInStatement::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: ForInStatement, level: int) -> Node;
```
## ForInStatement::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: ForInStatement) -> string;
```
## ForInStatement::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ForInStatement) -> int;
```
## ForInStatement::getInitializer

```java
/**
* Gets the iterator of this `for`-`in` or `for`-`of` loop.
*/
```
```rust
pub fn getInitializer(self: ForInStatement) -> ForInitializer;
```
## ForInStatement::getExpression

```java
/**
* Gets the expression over which this `for`-`in` or `for`-`of` loop iterates.
*/
```
```rust
pub fn getExpression(self: ForInStatement) -> Expression;
```
## ForInStatement::getBody

```java
/**
* Gets the body of this `for`-`in` or `for`-`of` loop.
*/
```
```rust
pub fn getBody(self: ForInStatement) -> Statement;
```
## ForInStatement::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ForInStatement) -> *FunctionLikeDeclaration;
```
## ForInStatement::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: ForInStatement, level: int) -> *Node;
```
## ForInStatement::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: ForInStatement) -> int;
```
## ForInStatement::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: ForInStatement) -> *Modifier;
```
## ForInStatement::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ForInStatement) -> int;
```
## ForInStatement::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ForInStatement) -> int;
```
## ForInStatement::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: ForInStatement, i: int) -> Node;
```
## ForInStatement::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: ForInStatement, i: int) -> Decorator;
```
## ForInStatement::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: ForInStatement) -> TopLevelDO;
```
## ForInStatement::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: ForInStatement) -> int;
```
## ForInStatement::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: ForInStatement) -> *Comment;
```
## ForInStatement::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: ForInStatement) -> *Comment;
```
## ForInStatement::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: ForInStatement) -> Node;
```
## ForInStatement::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: ForInStatement) -> *Node;
```
## ForInStatement::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: ForInStatement) -> *Node;
```
## ForInStatement::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: ForInStatement) -> *Comment;
```
## ForInStatement::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: ForInStatement) -> Symbol;
```
## ForInStatement::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: ForInStatement) -> *Decorator;
```
## ForInStatement::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: ForInStatement, i: int) -> Modifier;
```
## ForInStatement::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: ForInStatement) -> string;
```
## ForInStatement::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *ForInStatement;
```
## ForInStatement::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: ForInStatement) -> Location;
```
