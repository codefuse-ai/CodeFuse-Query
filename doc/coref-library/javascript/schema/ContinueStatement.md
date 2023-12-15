# ContinueStatement

Inherit from [Statement](./Statement.md)

Primary key: `id: int`

```rust
schema ContinueStatement extends Statement {
  @primary id: int
}
```
## ContinueStatement::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: ContinueStatement) -> Location;
```
## ContinueStatement::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: ContinueStatement) -> Symbol;
```
## ContinueStatement::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: ContinueStatement) -> *Decorator;
```
## ContinueStatement::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: ContinueStatement) -> string;
```
## ContinueStatement::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: ContinueStatement, i: int) -> Modifier;
```
## ContinueStatement::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: ContinueStatement) -> *Comment;
```
## ContinueStatement::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: ContinueStatement) -> *Node;
```
## ContinueStatement::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: ContinueStatement) -> *Node;
```
## ContinueStatement::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: ContinueStatement) -> Node;
```
## ContinueStatement::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: ContinueStatement) -> int;
```
## ContinueStatement::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: ContinueStatement) -> TopLevelDO;
```
## ContinueStatement::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: ContinueStatement, i: int) -> Decorator;
```
## ContinueStatement::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: ContinueStatement) -> int;
```
## ContinueStatement::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: ContinueStatement) -> *Modifier;
```
## ContinueStatement::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ContinueStatement) -> int;
```
## ContinueStatement::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: ContinueStatement, i: int) -> Node;
```
## ContinueStatement::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ContinueStatement) -> int;
```
## ContinueStatement::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ContinueStatement) -> *FunctionLikeDeclaration;
```
## ContinueStatement::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: ContinueStatement, level: int) -> *Node;
```
## ContinueStatement::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ContinueStatement) -> int;
```
## ContinueStatement::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: ContinueStatement) -> string;
```
## ContinueStatement::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: ContinueStatement, level: int) -> Node;
```
## ContinueStatement::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: ContinueStatement) -> File;
```
## ContinueStatement::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: ContinueStatement) -> *Comment;
```
## ContinueStatement::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: ContinueStatement) -> *Comment;
```
## ContinueStatement::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: ContinueStatement) -> Node;
```
## ContinueStatement::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: ContinueStatement) -> FunctionLikeDeclaration;
```
## ContinueStatement::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ContinueStatement) -> int;
```
## ContinueStatement::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: ContinueStatement) -> int;
```
## ContinueStatement::getIndex

```rust
pub fn getIndex(self: ContinueStatement) -> int;
```
## ContinueStatement::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: ContinueStatement) -> *Node;
```
## ContinueStatement::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *ContinueStatement;
```
