# ExpressionStatement

Inherit from [Statement](./Statement.md)

Primary key: `id: int`

```rust
schema ExpressionStatement extends Statement {
  @primary id: int
}
```
## ExpressionStatement::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: ExpressionStatement) -> Location;
```
## ExpressionStatement::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: ExpressionStatement) -> Symbol;
```
## ExpressionStatement::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: ExpressionStatement) -> *Decorator;
```
## ExpressionStatement::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: ExpressionStatement) -> string;
```
## ExpressionStatement::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: ExpressionStatement, i: int) -> Modifier;
```
## ExpressionStatement::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: ExpressionStatement) -> *Comment;
```
## ExpressionStatement::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: ExpressionStatement) -> *Node;
```
## ExpressionStatement::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: ExpressionStatement) -> *Node;
```
## ExpressionStatement::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: ExpressionStatement) -> Node;
```
## ExpressionStatement::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: ExpressionStatement) -> int;
```
## ExpressionStatement::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: ExpressionStatement) -> TopLevelDO;
```
## ExpressionStatement::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: ExpressionStatement, i: int) -> Decorator;
```
## ExpressionStatement::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: ExpressionStatement) -> int;
```
## ExpressionStatement::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: ExpressionStatement) -> *Modifier;
```
## ExpressionStatement::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ExpressionStatement) -> int;
```
## ExpressionStatement::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: ExpressionStatement, i: int) -> Node;
```
## ExpressionStatement::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ExpressionStatement) -> int;
```
## ExpressionStatement::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: ExpressionStatement, level: int) -> *Node;
```
## ExpressionStatement::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ExpressionStatement) -> *FunctionLikeDeclaration;
```
## ExpressionStatement::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: ExpressionStatement) -> *Comment;
```
## ExpressionStatement::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: ExpressionStatement) -> *Comment;
```
## ExpressionStatement::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: ExpressionStatement) -> Node;
```
## ExpressionStatement::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ExpressionStatement) -> int;
```
## ExpressionStatement::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: ExpressionStatement) -> FunctionLikeDeclaration;
```
## ExpressionStatement::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: ExpressionStatement) -> File;
```
## ExpressionStatement::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: ExpressionStatement, level: int) -> Node;
```
## ExpressionStatement::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: ExpressionStatement) -> int;
```
## ExpressionStatement::getIndex

```rust
pub fn getIndex(self: ExpressionStatement) -> int;
```
## ExpressionStatement::getExpression

```rust
pub fn getExpression(self: ExpressionStatement) -> Expression;
```
## ExpressionStatement::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: ExpressionStatement) -> string;
```
## ExpressionStatement::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ExpressionStatement) -> int;
```
## ExpressionStatement::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: ExpressionStatement) -> *Node;
```
## ExpressionStatement::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *ExpressionStatement;
```
