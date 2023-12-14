# WhileStatement

Inherit from [Statement](./Statement.md)

Primary key: `id: int`

```rust
schema WhileStatement extends Statement {
  @primary id: int,
}
```
## WhileStatement::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: WhileStatement) -> Location;
```
## WhileStatement::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: WhileStatement) -> Symbol;
```
## WhileStatement::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: WhileStatement) -> *Decorator;
```
## WhileStatement::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: WhileStatement) -> string;
```
## WhileStatement::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: WhileStatement, i: int) -> Modifier;
```
## WhileStatement::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: WhileStatement) -> *Comment;
```
## WhileStatement::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: WhileStatement) -> *Node;
```
## WhileStatement::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: WhileStatement) -> *Node;
```
## WhileStatement::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: WhileStatement) -> Node;
```
## WhileStatement::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: WhileStatement) -> *Comment;
```
## WhileStatement::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: WhileStatement) -> *Comment;
```
## WhileStatement::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: WhileStatement) -> int;
```
## WhileStatement::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: WhileStatement) -> TopLevelDO;
```
## WhileStatement::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: WhileStatement, i: int) -> Decorator;
```
## WhileStatement::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: WhileStatement) -> int;
```
## WhileStatement::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: WhileStatement) -> *Modifier;
```
## WhileStatement::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: WhileStatement) -> int;
```
## WhileStatement::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: WhileStatement, i: int) -> Node;
```
## WhileStatement::getCondition

```java
/** 
* Gets the loop condition of this `while` loop. 
*/
```
```rust
pub fn getCondition(self: WhileStatement) -> Expression;
```
## WhileStatement::getStartLineNumber

```rust
pub fn getStartLineNumber(self: WhileStatement) -> int;
```
## WhileStatement::getBody

```java
/** 
* Gets the body of this `while` loop. 
*/
```
```rust
pub fn getBody(self: WhileStatement) -> Statement;
```
## WhileStatement::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: WhileStatement) -> *FunctionLikeDeclaration;
```
## WhileStatement::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: WhileStatement, level: int) -> *Node;
```
## WhileStatement::getEndLineNumber

```rust
pub fn getEndLineNumber(self: WhileStatement) -> int;
```
## WhileStatement::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: WhileStatement) -> string;
```
## WhileStatement::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: WhileStatement, level: int) -> Node;
```
## WhileStatement::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: WhileStatement) -> File;
```
## WhileStatement::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: WhileStatement) -> int;
```
## WhileStatement::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: WhileStatement) -> Node;
```
## WhileStatement::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: WhileStatement) -> FunctionLikeDeclaration;
```
## WhileStatement::getIndex

```rust
pub fn getIndex(self: WhileStatement) -> int;
```
## WhileStatement::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: WhileStatement) -> int;
```
## WhileStatement::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: WhileStatement) -> *Node;
```
## WhileStatement::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *WhileStatement;
```
