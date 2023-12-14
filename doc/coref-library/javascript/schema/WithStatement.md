# WithStatement

Inherit from [Statement](./Statement.md)

Primary key: `id: int`

```rust
schema WithStatement extends Statement {
  @primary id: int,
}
```
## WithStatement::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: WithStatement) -> Location;
```
## WithStatement::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: WithStatement) -> Symbol;
```
## WithStatement::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: WithStatement) -> *Decorator;
```
## WithStatement::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: WithStatement) -> string;
```
## WithStatement::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: WithStatement, i: int) -> Modifier;
```
## WithStatement::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: WithStatement) -> *Comment;
```
## WithStatement::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: WithStatement) -> *Node;
```
## WithStatement::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: WithStatement) -> *Node;
```
## WithStatement::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: WithStatement) -> Node;
```
## WithStatement::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: WithStatement) -> *Comment;
```
## WithStatement::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: WithStatement) -> *Comment;
```
## WithStatement::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: WithStatement) -> int;
```
## WithStatement::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: WithStatement) -> TopLevelDO;
```
## WithStatement::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: WithStatement, i: int) -> Decorator;
```
## WithStatement::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: WithStatement) -> int;
```
## WithStatement::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: WithStatement) -> *Modifier;
```
## WithStatement::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: WithStatement) -> int;
```
## WithStatement::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: WithStatement, i: int) -> Node;
```
## WithStatement::getStartLineNumber

```rust
pub fn getStartLineNumber(self: WithStatement) -> int;
```
## WithStatement::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: WithStatement) -> *FunctionLikeDeclaration;
```
## WithStatement::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: WithStatement, level: int) -> *Node;
```
## WithStatement::getExpression

```java
/**
* Gets the expression belong to the WithStatement.
* Each WithStatement contains one and only one expression.
*/
```
```rust
pub fn getExpression(self: WithStatement) -> Expression;
```
## WithStatement::getEndLineNumber

```rust
pub fn getEndLineNumber(self: WithStatement) -> int;
```
## WithStatement::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: WithStatement) -> string;
```
## WithStatement::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: WithStatement) -> File;
```
## WithStatement::getStatement

```java
/**
* Gets the statement belong to the WithStatement.
* Each WithStatement contains one and only one statement,
* Multiple statements should be grounded by a BlockStatement.
*/
```
```rust
pub fn getStatement(self: WithStatement) -> Statement;
```
## WithStatement::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: WithStatement, level: int) -> Node;
```
## WithStatement::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: WithStatement) -> FunctionLikeDeclaration;
```
## WithStatement::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: WithStatement) -> Node;
```
## WithStatement::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: WithStatement) -> int;
```
## WithStatement::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: WithStatement) -> int;
```
## WithStatement::getIndex

```rust
pub fn getIndex(self: WithStatement) -> int;
```
## WithStatement::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: WithStatement) -> *Node;
```
## WithStatement::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *WithStatement;
```
