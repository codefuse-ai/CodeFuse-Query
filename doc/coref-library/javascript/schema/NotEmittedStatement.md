# NotEmittedStatement

Inherit from [Statement](./Statement.md)

Primary key: `id: int`

```rust
schema NotEmittedStatement extends Statement {
  @primary id: int,
}
```
## NotEmittedStatement::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: NotEmittedStatement) -> Location;
```
## NotEmittedStatement::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: NotEmittedStatement) -> Symbol;
```
## NotEmittedStatement::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: NotEmittedStatement) -> *Decorator;
```
## NotEmittedStatement::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: NotEmittedStatement) -> string;
```
## NotEmittedStatement::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: NotEmittedStatement, i: int) -> Modifier;
```
## NotEmittedStatement::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: NotEmittedStatement) -> *Comment;
```
## NotEmittedStatement::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: NotEmittedStatement) -> *Node;
```
## NotEmittedStatement::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: NotEmittedStatement) -> *Node;
```
## NotEmittedStatement::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: NotEmittedStatement) -> Node;
```
## NotEmittedStatement::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: NotEmittedStatement) -> int;
```
## NotEmittedStatement::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: NotEmittedStatement) -> TopLevelDO;
```
## NotEmittedStatement::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: NotEmittedStatement, i: int) -> Decorator;
```
## NotEmittedStatement::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: NotEmittedStatement) -> int;
```
## NotEmittedStatement::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: NotEmittedStatement) -> *Modifier;
```
## NotEmittedStatement::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: NotEmittedStatement) -> int;
```
## NotEmittedStatement::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: NotEmittedStatement, i: int) -> Node;
```
## NotEmittedStatement::getStartLineNumber

```rust
pub fn getStartLineNumber(self: NotEmittedStatement) -> int;
```
## NotEmittedStatement::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: NotEmittedStatement) -> *FunctionLikeDeclaration;
```
## NotEmittedStatement::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: NotEmittedStatement, level: int) -> *Node;
```
## NotEmittedStatement::getEndLineNumber

```rust
pub fn getEndLineNumber(self: NotEmittedStatement) -> int;
```
## NotEmittedStatement::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: NotEmittedStatement) -> string;
```
## NotEmittedStatement::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: NotEmittedStatement, level: int) -> Node;
```
## NotEmittedStatement::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: NotEmittedStatement) -> File;
```
## NotEmittedStatement::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: NotEmittedStatement) -> *Comment;
```
## NotEmittedStatement::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: NotEmittedStatement) -> *Comment;
```
## NotEmittedStatement::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: NotEmittedStatement) -> Node;
```
## NotEmittedStatement::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: NotEmittedStatement) -> FunctionLikeDeclaration;
```
## NotEmittedStatement::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: NotEmittedStatement) -> int;
```
## NotEmittedStatement::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: NotEmittedStatement) -> int;
```
## NotEmittedStatement::getIndex

```rust
pub fn getIndex(self: NotEmittedStatement) -> int;
```
## NotEmittedStatement::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: NotEmittedStatement) -> *Node;
```
## NotEmittedStatement::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *NotEmittedStatement;
```
