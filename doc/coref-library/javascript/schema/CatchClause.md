# CatchClause

Inherit from [Statement](./Statement.md)

Primary key: `id: int`

```rust
schema CatchClause extends Statement {
  @primary id: int
}
```
## CatchClause::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: CatchClause) -> Location;
```
## CatchClause::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: CatchClause) -> Symbol;
```
## CatchClause::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: CatchClause) -> *Decorator;
```
## CatchClause::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: CatchClause) -> string;
```
## CatchClause::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: CatchClause, i: int) -> Modifier;
```
## CatchClause::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: CatchClause) -> *Comment;
```
## CatchClause::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: CatchClause) -> *Node;
```
## CatchClause::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: CatchClause) -> *Comment;
```
## CatchClause::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: CatchClause) -> *Comment;
```
## CatchClause::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: CatchClause) -> int;
```
## CatchClause::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: CatchClause, i: int) -> Decorator;
```
## CatchClause::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: CatchClause) -> TopLevelDO;
```
## CatchClause::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: CatchClause) -> int;
```
## CatchClause::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: CatchClause) -> *Modifier;
```
## CatchClause::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: CatchClause) -> int;
```
## CatchClause::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: CatchClause, i: int) -> Node;
```
## CatchClause::getVariableDeclaration

```java
/**
* Gets the variable declaration of this CatchClause.
*/
```
```rust
pub fn getVariableDeclaration(self: CatchClause) -> VariableDeclaration;
```
## CatchClause::getStartLineNumber

```rust
pub fn getStartLineNumber(self: CatchClause) -> int;
```
## CatchClause::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: CatchClause) -> *FunctionLikeDeclaration;
```
## CatchClause::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: CatchClause, level: int) -> *Node;
```
## CatchClause::getEndLineNumber

```rust
pub fn getEndLineNumber(self: CatchClause) -> int;
```
## CatchClause::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: CatchClause) -> string;
```
## CatchClause::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: CatchClause, level: int) -> Node;
```
## CatchClause::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: CatchClause) -> *Node;
```
## CatchClause::getBlock

```java
/**
* Gets the catch block of this CatchClause.
*/
```
```rust
pub fn getBlock(self: CatchClause) -> BlockStatement;
```
## CatchClause::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: CatchClause) -> File;
```
## CatchClause::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: CatchClause) -> Node;
```
## CatchClause::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: CatchClause) -> FunctionLikeDeclaration;
```
## CatchClause::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: CatchClause) -> int;
```
## CatchClause::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: CatchClause) -> int;
```
## CatchClause::getIndex

```rust
pub fn getIndex(self: CatchClause) -> int;
```
## CatchClause::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: CatchClause) -> *Node;
```
## CatchClause::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: CatchClause) -> Node;
```
## CatchClause::haveVariableDeclaration

```java
/**
* Determine this CatchClause has variable declaration or not.
*/
```
```rust
pub fn haveVariableDeclaration(self: CatchClause) -> bool;
```
## CatchClause::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *CatchClause;
```
