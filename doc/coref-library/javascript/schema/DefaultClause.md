# DefaultClause

Inherit from [Statement](./Statement.md)

Primary key: `id: int`

```rust
schema DefaultClause extends Statement {
  @primary id: int
}
```
## DefaultClause::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: DefaultClause) -> Location;
```
## DefaultClause::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: DefaultClause) -> Symbol;
```
## DefaultClause::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: DefaultClause) -> *Decorator;
```
## DefaultClause::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: DefaultClause) -> string;
```
## DefaultClause::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: DefaultClause, i: int) -> Modifier;
```
## DefaultClause::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: DefaultClause) -> *Comment;
```
## DefaultClause::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: DefaultClause) -> *Node;
```
## DefaultClause::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: DefaultClause) -> Node;
```
## DefaultClause::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: DefaultClause) -> *Comment;
```
## DefaultClause::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: DefaultClause) -> *Comment;
```
## DefaultClause::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: DefaultClause) -> int;
```
## DefaultClause::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: DefaultClause) -> TopLevelDO;
```
## DefaultClause::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: DefaultClause, i: int) -> Decorator;
```
## DefaultClause::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: DefaultClause, i: int) -> Node;
```
## DefaultClause::getStartLineNumber

```rust
pub fn getStartLineNumber(self: DefaultClause) -> int;
```
## DefaultClause::getStatementCount

```java
/**
* Gets the statement count of this DefaultClause.
*/
```
```rust
pub fn getStatementCount(self: DefaultClause) -> int;
```
## DefaultClause::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: DefaultClause) -> int;
```
## DefaultClause::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: DefaultClause) -> int;
```
## DefaultClause::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: DefaultClause) -> *Modifier;
```
## DefaultClause::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: DefaultClause) -> *FunctionLikeDeclaration;
```
## DefaultClause::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: DefaultClause, level: int) -> *Node;
```
## DefaultClause::getEndLineNumber

```rust
pub fn getEndLineNumber(self: DefaultClause) -> int;
```
## DefaultClause::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: DefaultClause) -> string;
```
## DefaultClause::getStatement

```java
/**
* Gets the statement of this DefaultClause with index,
* starts from 0.
*/
```
```rust
pub fn getStatement(self: DefaultClause, index: int) -> Statement;
```
## DefaultClause::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: DefaultClause, level: int) -> Node;
```
## DefaultClause::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: DefaultClause) -> File;
```
## DefaultClause::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: DefaultClause) -> FunctionLikeDeclaration;
```
## DefaultClause::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: DefaultClause) -> Node;
```
## DefaultClause::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: DefaultClause) -> int;
```
## DefaultClause::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: DefaultClause) -> int;
```
## DefaultClause::getIndex

```rust
pub fn getIndex(self: DefaultClause) -> int;
```
## DefaultClause::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *DefaultClause;
```
## DefaultClause::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: DefaultClause) -> *Node;
```
## DefaultClause::getAStatement

```java
/**
* Gets a statement of this DefaultClause.
*/
```
```rust
pub fn getAStatement(self: DefaultClause) -> *Statement;
```
## DefaultClause::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: DefaultClause) -> *Node;
```
