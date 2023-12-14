# BreakStatement

Inherit from [Statement](./Statement.md)

Primary key: `id: int`

```rust
schema BreakStatement extends Statement {
  @primary id: int,
}
```
## BreakStatement::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: BreakStatement) -> Location;
```
## BreakStatement::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: BreakStatement) -> Symbol;
```
## BreakStatement::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: BreakStatement) -> *Decorator;
```
## BreakStatement::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: BreakStatement) -> string;
```
## BreakStatement::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: BreakStatement, i: int) -> Modifier;
```
## BreakStatement::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: BreakStatement) -> *Comment;
```
## BreakStatement::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: BreakStatement) -> *Node;
```
## BreakStatement::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: BreakStatement) -> *Node;
```
## BreakStatement::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: BreakStatement) -> Node;
```
## BreakStatement::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: BreakStatement) -> int;
```
## BreakStatement::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: BreakStatement) -> TopLevelDO;
```
## BreakStatement::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: BreakStatement, i: int) -> Decorator;
```
## BreakStatement::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: BreakStatement) -> int;
```
## BreakStatement::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: BreakStatement) -> *Modifier;
```
## BreakStatement::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: BreakStatement) -> int;
```
## BreakStatement::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: BreakStatement, i: int) -> Node;
```
## BreakStatement::getStartLineNumber

```rust
pub fn getStartLineNumber(self: BreakStatement) -> int;
```
## BreakStatement::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: BreakStatement) -> *FunctionLikeDeclaration;
```
## BreakStatement::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: BreakStatement, level: int) -> *Node;
```
## BreakStatement::getEndLineNumber

```rust
pub fn getEndLineNumber(self: BreakStatement) -> int;
```
## BreakStatement::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: BreakStatement) -> string;
```
## BreakStatement::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: BreakStatement, level: int) -> Node;
```
## BreakStatement::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: BreakStatement) -> File;
```
## BreakStatement::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: BreakStatement) -> *Comment;
```
## BreakStatement::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: BreakStatement) -> *Comment;
```
## BreakStatement::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: BreakStatement) -> Node;
```
## BreakStatement::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: BreakStatement) -> FunctionLikeDeclaration;
```
## BreakStatement::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: BreakStatement) -> int;
```
## BreakStatement::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: BreakStatement) -> int;
```
## BreakStatement::getIndex

```rust
pub fn getIndex(self: BreakStatement) -> int;
```
## BreakStatement::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: BreakStatement) -> *Node;
```
## BreakStatement::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *BreakStatement;
```
