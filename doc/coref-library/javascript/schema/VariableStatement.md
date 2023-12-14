# VariableStatement

Inherit from [Statement](./Statement.md)

Primary key: `id: int`

```rust
schema VariableStatement extends Statement {
  @primary id: int,
}
```
## VariableStatement::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: VariableStatement) -> Location;
```
## VariableStatement::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: VariableStatement) -> Symbol;
```
## VariableStatement::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: VariableStatement) -> *Decorator;
```
## VariableStatement::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: VariableStatement) -> string;
```
## VariableStatement::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: VariableStatement, i: int) -> Modifier;
```
## VariableStatement::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: VariableStatement) -> *Comment;
```
## VariableStatement::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: VariableStatement) -> *Node;
```
## VariableStatement::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: VariableStatement) -> *Node;
```
## VariableStatement::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: VariableStatement) -> Node;
```
## VariableStatement::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: VariableStatement) -> int;
```
## VariableStatement::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: VariableStatement) -> TopLevelDO;
```
## VariableStatement::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: VariableStatement, i: int) -> Decorator;
```
## VariableStatement::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: VariableStatement) -> int;
```
## VariableStatement::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: VariableStatement) -> *Modifier;
```
## VariableStatement::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: VariableStatement) -> int;
```
## VariableStatement::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: VariableStatement, i: int) -> Node;
```
## VariableStatement::getStartLineNumber

```rust
pub fn getStartLineNumber(self: VariableStatement) -> int;
```
## VariableStatement::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: VariableStatement) -> *FunctionLikeDeclaration;
```
## VariableStatement::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: VariableStatement, level: int) -> *Node;
```
## VariableStatement::getEndLineNumber

```rust
pub fn getEndLineNumber(self: VariableStatement) -> int;
```
## VariableStatement::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: VariableStatement) -> string;
```
## VariableStatement::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: VariableStatement, level: int) -> Node;
```
## VariableStatement::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: VariableStatement) -> File;
```
## VariableStatement::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: VariableStatement) -> *Comment;
```
## VariableStatement::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: VariableStatement) -> *Comment;
```
## VariableStatement::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: VariableStatement) -> Node;
```
## VariableStatement::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: VariableStatement) -> FunctionLikeDeclaration;
```
## VariableStatement::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: VariableStatement) -> int;
```
## VariableStatement::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: VariableStatement) -> int;
```
## VariableStatement::getIndex

```rust
pub fn getIndex(self: VariableStatement) -> int;
```
## VariableStatement::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *VariableStatement;
```
## VariableStatement::getVariableDeclarationList

```java
/**
* VariableStatement contains a VariableDeclarationList, get that list
*/
```
```rust
pub fn getVariableDeclarationList(self: VariableStatement) -> VariableDeclarationList;
```
## VariableStatement::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: VariableStatement) -> *Node;
```
