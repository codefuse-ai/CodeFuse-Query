# TryStatement

Primary key: `id: int`

```rust
schema TryStatement {
  @primary id: int,
}
```
## TryStatement::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: TryStatement) -> Location;
```
## TryStatement::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: TryStatement) -> Symbol;
```
## TryStatement::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: TryStatement) -> *Decorator;
```
## TryStatement::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: TryStatement) -> string;
```
## TryStatement::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: TryStatement, i: int) -> Modifier;
```
## TryStatement::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: TryStatement) -> *Comment;
```
## TryStatement::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: TryStatement) -> *Node;
```
## TryStatement::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: TryStatement) -> *Comment;
```
## TryStatement::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: TryStatement) -> *Comment;
```
## TryStatement::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: TryStatement) -> int;
```
## TryStatement::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: TryStatement) -> TopLevelDO;
```
## TryStatement::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: TryStatement, i: int) -> Decorator;
```
## TryStatement::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: TryStatement) -> int;
```
## TryStatement::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: TryStatement) -> *Modifier;
```
## TryStatement::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: TryStatement) -> int;
```
## TryStatement::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: TryStatement, i: int) -> Node;
```
## TryStatement::getStartLineNumber

```rust
pub fn getStartLineNumber(self: TryStatement) -> int;
```
## TryStatement::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: TryStatement) -> *FunctionLikeDeclaration;
```
## TryStatement::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: TryStatement, level: int) -> *Node;
```
## TryStatement::getTryBlock

```java
/** 
* Gets the body of this `try` statement. 
*/
```
```rust
pub fn getTryBlock(self: TryStatement) -> BlockStatement;
```
## TryStatement::getEndLineNumber

```rust
pub fn getEndLineNumber(self: TryStatement) -> int;
```
## TryStatement::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: TryStatement) -> string;
```
## TryStatement::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: TryStatement, level: int) -> Node;
```
## TryStatement::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: TryStatement) -> File;
```
## TryStatement::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: TryStatement) -> int;
```
## TryStatement::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: TryStatement) -> Node;
```
## TryStatement::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: TryStatement) -> FunctionLikeDeclaration;
```
## TryStatement::haveFinallyBlock

```java
/**
* Determine whether this TryStatement has finally block or not.
*/
```
```rust
pub fn haveFinallyBlock(self: TryStatement) -> bool;
```
## TryStatement::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: TryStatement) -> *Node;
```
## TryStatement::getCatchClause

```java
/** 
* Gets the `catch` clause of this `try` statement, if any. 
*/
```
```rust
pub fn getCatchClause(self: TryStatement) -> CatchClause;
```
## TryStatement::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: TryStatement) -> *Node;
```
## TryStatement::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: TryStatement) -> Node;
```
## TryStatement::getFinallyBlock

```java
/** 
* Gets the `finally` block of this `try` statement, if any. 
*/
```
```rust
pub fn getFinallyBlock(self: TryStatement) -> BlockStatement;
```
## TryStatement::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *TryStatement;
```
## TryStatement::getIndex

```rust
pub fn getIndex(self: TryStatement) -> int;
```
## TryStatement::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: TryStatement) -> int;
```
