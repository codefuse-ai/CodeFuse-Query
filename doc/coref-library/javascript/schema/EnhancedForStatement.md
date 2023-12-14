# EnhancedForStatement

Primary key: `id: int`

```rust
schema EnhancedForStatement {
  @primary id: int,
}
```
## EnhancedForStatement::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: EnhancedForStatement) -> Location;
```
## EnhancedForStatement::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: EnhancedForStatement) -> Symbol;
```
## EnhancedForStatement::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: EnhancedForStatement) -> *Decorator;
```
## EnhancedForStatement::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: EnhancedForStatement) -> string;
```
## EnhancedForStatement::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: EnhancedForStatement, i: int) -> Modifier;
```
## EnhancedForStatement::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: EnhancedForStatement) -> *Comment;
```
## EnhancedForStatement::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: EnhancedForStatement) -> *Node;
```
## EnhancedForStatement::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: EnhancedForStatement) -> *Node;
```
## EnhancedForStatement::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: EnhancedForStatement) -> Node;
```
## EnhancedForStatement::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: EnhancedForStatement) -> *Comment;
```
## EnhancedForStatement::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: EnhancedForStatement) -> *Comment;
```
## EnhancedForStatement::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: EnhancedForStatement) -> int;
```
## EnhancedForStatement::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: EnhancedForStatement) -> TopLevelDO;
```
## EnhancedForStatement::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: EnhancedForStatement, i: int) -> Decorator;
```
## EnhancedForStatement::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: EnhancedForStatement) -> int;
```
## EnhancedForStatement::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: EnhancedForStatement) -> *Modifier;
```
## EnhancedForStatement::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: EnhancedForStatement) -> int;
```
## EnhancedForStatement::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: EnhancedForStatement, i: int) -> Node;
```
## EnhancedForStatement::getStartLineNumber

```rust
pub fn getStartLineNumber(self: EnhancedForStatement) -> int;
```
## EnhancedForStatement::getBody

```java
/**
* Gets the body of this `for`-`in` or `for`-`of` loop.
*/
```
```rust
pub fn getBody(self: EnhancedForStatement) -> Statement;
```
## EnhancedForStatement::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: EnhancedForStatement) -> *FunctionLikeDeclaration;
```
## EnhancedForStatement::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: EnhancedForStatement, level: int) -> *Node;
```
## EnhancedForStatement::getExpression

```java
/**
* Gets the expression over which this `for`-`in` or `for`-`of` loop iterates.
*/
```
```rust
pub fn getExpression(self: EnhancedForStatement) -> Expression;
```
## EnhancedForStatement::getInitializer

```java
/**
* Gets the iterator of this `for`-`in` or `for`-`of` loop.
*/
```
```rust
pub fn getInitializer(self: EnhancedForStatement) -> ForInitializer;
```
## EnhancedForStatement::getEndLineNumber

```rust
pub fn getEndLineNumber(self: EnhancedForStatement) -> int;
```
## EnhancedForStatement::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: EnhancedForStatement) -> string;
```
## EnhancedForStatement::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: EnhancedForStatement, level: int) -> Node;
```
## EnhancedForStatement::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: EnhancedForStatement) -> File;
```
## EnhancedForStatement::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: EnhancedForStatement) -> int;
```
## EnhancedForStatement::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: EnhancedForStatement) -> FunctionLikeDeclaration;
```
## EnhancedForStatement::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: EnhancedForStatement) -> Node;
```
## EnhancedForStatement::getIndex

```rust
pub fn getIndex(self: EnhancedForStatement) -> int;
```
## EnhancedForStatement::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: EnhancedForStatement) -> *Node;
```
## EnhancedForStatement::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: EnhancedForStatement) -> int;
```
## EnhancedForStatement::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *EnhancedForStatement;
```
## EnhancedForStatement::getInitializerIndex

```java
/**
* Gets the iterator index of this loop.
*
* In a `for`-`in` loop, the index is always 0.
* In a `for`-`of` loop, the index is 1 if it is a `for`-`await`-`of`, otherwise, the index is 0.
*/
```
```rust
pub fn getInitializerIndex(self: EnhancedForStatement) -> int;
```
