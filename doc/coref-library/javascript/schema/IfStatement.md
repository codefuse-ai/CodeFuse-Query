# IfStatement

Inherit from [Statement](./Statement.md)

Primary key: `id: int`

```rust
schema IfStatement extends Statement {
  @primary id: int,
}
```
## IfStatement::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: IfStatement) -> Location;
```
## IfStatement::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: IfStatement) -> Symbol;
```
## IfStatement::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: IfStatement) -> *Decorator;
```
## IfStatement::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: IfStatement) -> string;
```
## IfStatement::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: IfStatement, i: int) -> Modifier;
```
## IfStatement::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: IfStatement) -> *Comment;
```
## IfStatement::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: IfStatement) -> *Node;
```
## IfStatement::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: IfStatement) -> *Node;
```
## IfStatement::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: IfStatement) -> Node;
```
## IfStatement::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: IfStatement) -> *Comment;
```
## IfStatement::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: IfStatement) -> *Comment;
```
## IfStatement::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: IfStatement) -> int;
```
## IfStatement::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: IfStatement) -> TopLevelDO;
```
## IfStatement::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: IfStatement, i: int) -> Decorator;
```
## IfStatement::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: IfStatement) -> int;
```
## IfStatement::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: IfStatement) -> *Modifier;
```
## IfStatement::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: IfStatement) -> int;
```
## IfStatement::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: IfStatement, i: int) -> Node;
```
## IfStatement::getCondition

```java
/**
* Gets the condition of this `if` statement.
*/
```
```rust
pub fn getCondition(self: IfStatement) -> Expression;
```
## IfStatement::getStartLineNumber

```rust
pub fn getStartLineNumber(self: IfStatement) -> int;
```
## IfStatement::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: IfStatement) -> *FunctionLikeDeclaration;
```
## IfStatement::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: IfStatement, level: int) -> *Node;
```
## IfStatement::getElse

```java
/**
* Gets the "else" branch of this `if` statement, if any.
*/
```
```rust
pub fn getElse(self: IfStatement) -> Statement;
```
## IfStatement::getEndLineNumber

```rust
pub fn getEndLineNumber(self: IfStatement) -> int;
```
## IfStatement::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: IfStatement) -> string;
```
## IfStatement::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: IfStatement) -> int;
```
## IfStatement::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: IfStatement) -> FunctionLikeDeclaration;
```
## IfStatement::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: IfStatement) -> Node;
```
## IfStatement::getIndex

```rust
pub fn getIndex(self: IfStatement) -> int;
```
## IfStatement::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: IfStatement) -> *Node;
```
## IfStatement::hasElse

```java
/**
* Determine this IfStatement has else expr.
*/
```
```rust
pub fn hasElse(self: IfStatement) -> bool;
```
## IfStatement::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: IfStatement, level: int) -> Node;
```
## IfStatement::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: IfStatement) -> File;
```
## IfStatement::getThen

```java
/**
* Gets the "then" branch of this `if` statement.
*/
```
```rust
pub fn getThen(self: IfStatement) -> Statement;
```
## IfStatement::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: IfStatement) -> int;
```
## IfStatement::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *IfStatement;
```
