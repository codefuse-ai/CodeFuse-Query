# ForStatement

Inherit from [Statement](./Statement.md)

Primary key: `id: int`

```rust
schema ForStatement extends Statement {
  @primary id: int,
}
```
## ForStatement::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: ForStatement) -> Location;
```
## ForStatement::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: ForStatement) -> Symbol;
```
## ForStatement::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: ForStatement) -> *Decorator;
```
## ForStatement::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: ForStatement) -> string;
```
## ForStatement::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: ForStatement, i: int) -> Modifier;
```
## ForStatement::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: ForStatement) -> *Comment;
```
## ForStatement::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: ForStatement) -> *Node;
```
## ForStatement::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: ForStatement) -> *Node;
```
## ForStatement::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: ForStatement) -> Node;
```
## ForStatement::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: ForStatement) -> *Comment;
```
## ForStatement::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: ForStatement) -> *Comment;
```
## ForStatement::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: ForStatement) -> int;
```
## ForStatement::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: ForStatement) -> TopLevelDO;
```
## ForStatement::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: ForStatement, i: int) -> Decorator;
```
## ForStatement::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: ForStatement, i: int) -> Node;
```
## ForStatement::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ForStatement) -> int;
```
## ForStatement::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: ForStatement) -> int;
```
## ForStatement::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: ForStatement) -> *Modifier;
```
## ForStatement::getBody

```java
/** 
* Gets the body of this `for` loop.
*/
```
```rust
pub fn getBody(self: ForStatement) -> Statement;
```
## ForStatement::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ForStatement) -> *FunctionLikeDeclaration;
```
## ForStatement::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: ForStatement, level: int) -> *Node;
```
## ForStatement::getInitializer

```java
/** 
* Gets the Initializer of this `for` loop.
*/
```
```rust
pub fn getInitializer(self: ForStatement) -> ForInitializer;
```
## ForStatement::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ForStatement) -> int;
```
## ForStatement::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: ForStatement) -> string;
```
## ForStatement::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: ForStatement, level: int) -> Node;
```
## ForStatement::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: ForStatement) -> File;
```
## ForStatement::hasCondition

```java
/**
* Determine this ForStatement has condition expr.
*/
```
```rust
pub fn hasCondition(self: ForStatement) -> bool;
```
## ForStatement::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: ForStatement) -> FunctionLikeDeclaration;
```
## ForStatement::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: ForStatement) -> Node;
```
## ForStatement::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ForStatement) -> int;
```
## ForStatement::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: ForStatement) -> int;
```
## ForStatement::getIndex

```rust
pub fn getIndex(self: ForStatement) -> int;
```
## ForStatement::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: ForStatement) -> *Node;
```
## ForStatement::hasIncrementor

```java
/**
* Determine this ForStatement has incrementor expr.
*/
```
```rust
pub fn hasIncrementor(self: ForStatement) -> bool;
```
## ForStatement::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ForStatement) -> int;
```
## ForStatement::getCondition

```java
/** 
* Gets the boolean condition of this `for` loop.
*/
```
```rust
pub fn getCondition(self: ForStatement) -> Expression;
```
## ForStatement::getIncrementor

```java
/** 
* Gets the incrementor of this `for` loop.
*/
```
```rust
pub fn getIncrementor(self: ForStatement) -> Expression;
```
## ForStatement::hasInitializer

```java
/**
* Determine this ForStatement has initializer expr.
*/
```
```rust
pub fn hasInitializer(self: ForStatement) -> bool;
```
## ForStatement::getInitializerIndex

```java
/**
* Gets the initializer index of this for loop.
*/
```
```rust
pub fn getInitializerIndex(self: ForStatement) -> int;
```
## ForStatement::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *ForStatement;
```
