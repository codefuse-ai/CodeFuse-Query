# IterationStatement

Inherit from [Statement](./Statement.md)

Primary key: `id: int`

```rust
schema IterationStatement extends Statement {
  @primary id: int,
}
```
## IterationStatement::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: IterationStatement) -> Location;
```
## IterationStatement::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: IterationStatement) -> Symbol;
```
## IterationStatement::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: IterationStatement) -> *Decorator;
```
## IterationStatement::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: IterationStatement) -> string;
```
## IterationStatement::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: IterationStatement, i: int) -> Modifier;
```
## IterationStatement::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: IterationStatement) -> *Comment;
```
## IterationStatement::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: IterationStatement) -> *Node;
```
## IterationStatement::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: IterationStatement) -> *Node;
```
## IterationStatement::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: IterationStatement) -> Node;
```
## IterationStatement::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: IterationStatement) -> *Comment;
```
## IterationStatement::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: IterationStatement) -> *Comment;
```
## IterationStatement::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: IterationStatement) -> int;
```
## IterationStatement::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: IterationStatement) -> TopLevelDO;
```
## IterationStatement::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: IterationStatement, i: int) -> Decorator;
```
## IterationStatement::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: IterationStatement) -> int;
```
## IterationStatement::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: IterationStatement) -> *Modifier;
```
## IterationStatement::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: IterationStatement) -> int;
```
## IterationStatement::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: IterationStatement, i: int) -> Node;
```
## IterationStatement::getCondition

```java
/**
* Gets the condition expression of this iteration statement.
* Only a `while`, `do`-`while` and `for` statement has a condition.
*/
```
```rust
pub fn getCondition(self: IterationStatement) -> Expression;
```
## IterationStatement::getStartLineNumber

```rust
pub fn getStartLineNumber(self: IterationStatement) -> int;
```
## IterationStatement::getBody

```java
/**
* Gets the body statement of this iteration statement.
*/
```
```rust
pub fn getBody(self: IterationStatement) -> Statement;
```
## IterationStatement::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: IterationStatement) -> *FunctionLikeDeclaration;
```
## IterationStatement::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: IterationStatement, level: int) -> *Node;
```
## IterationStatement::getEndLineNumber

```rust
pub fn getEndLineNumber(self: IterationStatement) -> int;
```
## IterationStatement::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: IterationStatement) -> string;
```
## IterationStatement::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: IterationStatement, level: int) -> Node;
```
## IterationStatement::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: IterationStatement) -> File;
```
## IterationStatement::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: IterationStatement) -> int;
```
## IterationStatement::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: IterationStatement) -> FunctionLikeDeclaration;
```
## IterationStatement::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: IterationStatement) -> Node;
```
## IterationStatement::getIndex

```rust
pub fn getIndex(self: IterationStatement) -> int;
```
## IterationStatement::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: IterationStatement) -> int;
```
## IterationStatement::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: IterationStatement) -> *Node;
```
## IterationStatement::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *IterationStatement;
```
