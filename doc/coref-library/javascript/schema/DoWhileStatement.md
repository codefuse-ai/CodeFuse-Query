# DoWhileStatement

Inherit from [Statement](./Statement.md)

Primary key: `id: int`

```rust
schema DoWhileStatement extends Statement {
  @primary id: int,
}
```
## DoWhileStatement::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: DoWhileStatement) -> Location;
```
## DoWhileStatement::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: DoWhileStatement) -> Symbol;
```
## DoWhileStatement::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: DoWhileStatement) -> *Decorator;
```
## DoWhileStatement::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: DoWhileStatement) -> string;
```
## DoWhileStatement::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: DoWhileStatement, i: int) -> Modifier;
```
## DoWhileStatement::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: DoWhileStatement) -> *Comment;
```
## DoWhileStatement::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: DoWhileStatement) -> *Node;
```
## DoWhileStatement::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: DoWhileStatement) -> *Node;
```
## DoWhileStatement::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: DoWhileStatement) -> Node;
```
## DoWhileStatement::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: DoWhileStatement) -> *Comment;
```
## DoWhileStatement::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: DoWhileStatement) -> *Comment;
```
## DoWhileStatement::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: DoWhileStatement) -> int;
```
## DoWhileStatement::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: DoWhileStatement) -> TopLevelDO;
```
## DoWhileStatement::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: DoWhileStatement, i: int) -> Decorator;
```
## DoWhileStatement::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: DoWhileStatement) -> int;
```
## DoWhileStatement::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: DoWhileStatement) -> *Modifier;
```
## DoWhileStatement::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: DoWhileStatement) -> int;
```
## DoWhileStatement::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: DoWhileStatement, i: int) -> Node;
```
## DoWhileStatement::getCondition

```java
/** 
* Gets the loop condition of this `do`-`while` loop. 
*/
```
```rust
pub fn getCondition(self: DoWhileStatement) -> Expression;
```
## DoWhileStatement::getStartLineNumber

```rust
pub fn getStartLineNumber(self: DoWhileStatement) -> int;
```
## DoWhileStatement::getBody

```java
/** 
* Gets the body of this `do`-`while` loop. 
*/
```
```rust
pub fn getBody(self: DoWhileStatement) -> Statement;
```
## DoWhileStatement::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: DoWhileStatement) -> *FunctionLikeDeclaration;
```
## DoWhileStatement::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: DoWhileStatement, level: int) -> *Node;
```
## DoWhileStatement::getEndLineNumber

```rust
pub fn getEndLineNumber(self: DoWhileStatement) -> int;
```
## DoWhileStatement::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: DoWhileStatement) -> string;
```
## DoWhileStatement::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: DoWhileStatement, level: int) -> Node;
```
## DoWhileStatement::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: DoWhileStatement) -> File;
```
## DoWhileStatement::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: DoWhileStatement) -> int;
```
## DoWhileStatement::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: DoWhileStatement) -> Node;
```
## DoWhileStatement::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: DoWhileStatement) -> FunctionLikeDeclaration;
```
## DoWhileStatement::getIndex

```rust
pub fn getIndex(self: DoWhileStatement) -> int;
```
## DoWhileStatement::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: DoWhileStatement) -> int;
```
## DoWhileStatement::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: DoWhileStatement) -> *Node;
```
## DoWhileStatement::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *DoWhileStatement;
```
