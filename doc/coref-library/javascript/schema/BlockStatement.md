# BlockStatement

Inherit from [Statement](./Statement.md)

Primary key: `id: int`

```rust
schema BlockStatement extends Statement {
  @primary id: int
}
```
## BlockStatement::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: BlockStatement) -> Location;
```
## BlockStatement::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: BlockStatement) -> Symbol;
```
## BlockStatement::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: BlockStatement) -> *Decorator;
```
## BlockStatement::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: BlockStatement) -> string;
```
## BlockStatement::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: BlockStatement, i: int) -> Modifier;
```
## BlockStatement::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: BlockStatement) -> *Comment;
```
## BlockStatement::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: BlockStatement) -> *Node;
```
## BlockStatement::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: BlockStatement) -> Node;
```
## BlockStatement::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: BlockStatement) -> *Comment;
```
## BlockStatement::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: BlockStatement) -> *Comment;
```
## BlockStatement::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: BlockStatement) -> int;
```
## BlockStatement::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: BlockStatement) -> TopLevelDO;
```
## BlockStatement::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: BlockStatement, i: int) -> Decorator;
```
## BlockStatement::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: BlockStatement, i: int) -> Node;
```
## BlockStatement::getStartLineNumber

```rust
pub fn getStartLineNumber(self: BlockStatement) -> int;
```
## BlockStatement::getStatementCount

```java
/**
* Gets the number of statements in this block.
*/
```
```rust
pub fn getStatementCount(self: BlockStatement) -> int;
```
## BlockStatement::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: BlockStatement) -> int;
```
## BlockStatement::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: BlockStatement) -> int;
```
## BlockStatement::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: BlockStatement) -> *Modifier;
```
## BlockStatement::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: BlockStatement) -> *FunctionLikeDeclaration;
```
## BlockStatement::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: BlockStatement, level: int) -> *Node;
```
## BlockStatement::getEndLineNumber

```rust
pub fn getEndLineNumber(self: BlockStatement) -> int;
```
## BlockStatement::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: BlockStatement) -> string;
```
## BlockStatement::getStatement

```java
/**
* Gets the `i`th statement in this block.
*/
```
```rust
pub fn getStatement(self: BlockStatement, i: int) -> Statement;
```
## BlockStatement::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: BlockStatement, level: int) -> Node;
```
## BlockStatement::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: BlockStatement) -> File;
```
## BlockStatement::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: BlockStatement) -> FunctionLikeDeclaration;
```
## BlockStatement::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: BlockStatement) -> Node;
```
## BlockStatement::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: BlockStatement) -> int;
```
## BlockStatement::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: BlockStatement) -> int;
```
## BlockStatement::getIndex

```rust
pub fn getIndex(self: BlockStatement) -> int;
```
## BlockStatement::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *BlockStatement;
```
## BlockStatement::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: BlockStatement) -> *Node;
```
## BlockStatement::getAStatement

```java
/** 
* Gets a statement in this block.
*/
```
```rust
pub fn getAStatement(self: BlockStatement) -> *Statement;
```
## BlockStatement::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: BlockStatement) -> *Node;
```
