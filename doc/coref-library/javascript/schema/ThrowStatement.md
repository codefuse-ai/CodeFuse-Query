# ThrowStatement

Inherit from [Statement](./Statement.md)

Primary key: `id: int`

```rust
schema ThrowStatement extends Statement {
  @primary id: int
}
```
## ThrowStatement::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: ThrowStatement) -> Location;
```
## ThrowStatement::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: ThrowStatement) -> Symbol;
```
## ThrowStatement::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: ThrowStatement) -> *Decorator;
```
## ThrowStatement::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: ThrowStatement) -> string;
```
## ThrowStatement::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: ThrowStatement, i: int) -> Modifier;
```
## ThrowStatement::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: ThrowStatement) -> *Comment;
```
## ThrowStatement::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: ThrowStatement) -> *Node;
```
## ThrowStatement::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: ThrowStatement) -> *Node;
```
## ThrowStatement::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: ThrowStatement) -> Node;
```
## ThrowStatement::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: ThrowStatement) -> int;
```
## ThrowStatement::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: ThrowStatement) -> TopLevelDO;
```
## ThrowStatement::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: ThrowStatement, i: int) -> Decorator;
```
## ThrowStatement::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: ThrowStatement) -> int;
```
## ThrowStatement::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: ThrowStatement) -> *Modifier;
```
## ThrowStatement::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ThrowStatement) -> int;
```
## ThrowStatement::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: ThrowStatement, i: int) -> Node;
```
## ThrowStatement::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ThrowStatement) -> int;
```
## ThrowStatement::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: ThrowStatement, level: int) -> *Node;
```
## ThrowStatement::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ThrowStatement) -> *FunctionLikeDeclaration;
```
## ThrowStatement::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: ThrowStatement) -> *Comment;
```
## ThrowStatement::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: ThrowStatement) -> *Comment;
```
## ThrowStatement::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: ThrowStatement) -> Node;
```
## ThrowStatement::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ThrowStatement) -> int;
```
## ThrowStatement::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: ThrowStatement) -> FunctionLikeDeclaration;
```
## ThrowStatement::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: ThrowStatement) -> File;
```
## ThrowStatement::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: ThrowStatement, level: int) -> Node;
```
## ThrowStatement::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: ThrowStatement) -> int;
```
## ThrowStatement::getIndex

```rust
pub fn getIndex(self: ThrowStatement) -> int;
```
## ThrowStatement::getExpression

```java
/**
* Gets the expression throwed by this ThrowStatement.
*/
```
```rust
pub fn getExpression(self: ThrowStatement) -> Expression;
```
## ThrowStatement::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: ThrowStatement) -> string;
```
## ThrowStatement::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ThrowStatement) -> int;
```
## ThrowStatement::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: ThrowStatement) -> *Node;
```
## ThrowStatement::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *ThrowStatement;
```
