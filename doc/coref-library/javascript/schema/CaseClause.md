# CaseClause

Inherit from [Statement](./Statement.md)

Primary key: `id: int`

```rust
schema CaseClause extends Statement {
  @primary id: int,
}
```
## CaseClause::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: CaseClause) -> Location;
```
## CaseClause::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: CaseClause) -> Symbol;
```
## CaseClause::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: CaseClause) -> *Decorator;
```
## CaseClause::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: CaseClause) -> string;
```
## CaseClause::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: CaseClause, i: int) -> Modifier;
```
## CaseClause::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: CaseClause) -> *Comment;
```
## CaseClause::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: CaseClause) -> *Node;
```
## CaseClause::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: CaseClause) -> Node;
```
## CaseClause::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: CaseClause) -> *Comment;
```
## CaseClause::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: CaseClause) -> *Comment;
```
## CaseClause::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: CaseClause) -> int;
```
## CaseClause::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: CaseClause) -> TopLevelDO;
```
## CaseClause::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: CaseClause, i: int) -> Decorator;
```
## CaseClause::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: CaseClause, i: int) -> Node;
```
## CaseClause::getStartLineNumber

```rust
pub fn getStartLineNumber(self: CaseClause) -> int;
```
## CaseClause::getStatementCount

```java
/**
* Gets the statement count of this CaseClause.
*/
```
```rust
pub fn getStatementCount(self: CaseClause) -> int;
```
## CaseClause::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: CaseClause) -> int;
```
## CaseClause::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: CaseClause) -> int;
```
## CaseClause::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: CaseClause) -> *Modifier;
```
## CaseClause::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: CaseClause) -> *FunctionLikeDeclaration;
```
## CaseClause::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: CaseClause, level: int) -> *Node;
```
## CaseClause::getExpression

```java
/**
* Gets the expression of this CaseClause.
*/
```
```rust
pub fn getExpression(self: CaseClause) -> Expression;
```
## CaseClause::getEndLineNumber

```rust
pub fn getEndLineNumber(self: CaseClause) -> int;
```
## CaseClause::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: CaseClause) -> string;
```
## CaseClause::getStatement

```java
/**
* Gets the statement of this CaseClause with index,
* starts from 0.
*/
```
```rust
pub fn getStatement(self: CaseClause, index: int) -> Statement;
```
## CaseClause::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: CaseClause, level: int) -> Node;
```
## CaseClause::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: CaseClause) -> File;
```
## CaseClause::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: CaseClause) -> FunctionLikeDeclaration;
```
## CaseClause::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: CaseClause) -> Node;
```
## CaseClause::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: CaseClause) -> int;
```
## CaseClause::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: CaseClause) -> int;
```
## CaseClause::getIndex

```rust
pub fn getIndex(self: CaseClause) -> int;
```
## CaseClause::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: CaseClause) -> *Node;
```
## CaseClause::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *CaseClause;
```
## CaseClause::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: CaseClause) -> *Node;
```
## CaseClause::getAStatement

```java
/**
* Gets a statement of this CaseClause.
*/
```
```rust
pub fn getAStatement(self: CaseClause) -> *Statement;
```
