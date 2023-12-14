# SwitchStatement

Primary key: `id: int`

```rust
schema SwitchStatement {
  @primary id: int,
}
```
## SwitchStatement::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: SwitchStatement) -> Location;
```
## SwitchStatement::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: SwitchStatement) -> Symbol;
```
## SwitchStatement::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: SwitchStatement) -> *Decorator;
```
## SwitchStatement::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: SwitchStatement) -> string;
```
## SwitchStatement::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: SwitchStatement, i: int) -> Modifier;
```
## SwitchStatement::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: SwitchStatement) -> *Comment;
```
## SwitchStatement::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: SwitchStatement) -> *Node;
```
## SwitchStatement::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: SwitchStatement) -> *Node;
```
## SwitchStatement::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: SwitchStatement) -> Node;
```
## SwitchStatement::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: SwitchStatement) -> *Comment;
```
## SwitchStatement::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: SwitchStatement) -> *Comment;
```
## SwitchStatement::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: SwitchStatement) -> int;
```
## SwitchStatement::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: SwitchStatement) -> TopLevelDO;
```
## SwitchStatement::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: SwitchStatement, i: int) -> Decorator;
```
## SwitchStatement::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: SwitchStatement, i: int) -> Node;
```
## SwitchStatement::getStartLineNumber

```rust
pub fn getStartLineNumber(self: SwitchStatement) -> int;
```
## SwitchStatement::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: SwitchStatement) -> int;
```
## SwitchStatement::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: SwitchStatement) -> int;
```
## SwitchStatement::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: SwitchStatement) -> *Modifier;
```
## SwitchStatement::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: SwitchStatement) -> *FunctionLikeDeclaration;
```
## SwitchStatement::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: SwitchStatement, level: int) -> *Node;
```
## SwitchStatement::getExpression

```rust
pub fn getExpression(self: SwitchStatement) -> Expression;
```
## SwitchStatement::getEndLineNumber

```rust
pub fn getEndLineNumber(self: SwitchStatement) -> int;
```
## SwitchStatement::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: SwitchStatement) -> string;
```
## SwitchStatement::getCaseBlock

```rust
pub fn getCaseBlock(self: SwitchStatement) -> CaseBlock;
```
## SwitchStatement::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: SwitchStatement) -> File;
```
## SwitchStatement::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: SwitchStatement, level: int) -> Node;
```
## SwitchStatement::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: SwitchStatement) -> FunctionLikeDeclaration;
```
## SwitchStatement::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: SwitchStatement) -> Node;
```
## SwitchStatement::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: SwitchStatement) -> int;
```
## SwitchStatement::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: SwitchStatement) -> int;
```
## SwitchStatement::getIndex

```rust
pub fn getIndex(self: SwitchStatement) -> int;
```
## SwitchStatement::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: SwitchStatement) -> *Node;
```
## SwitchStatement::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *SwitchStatement;
```
