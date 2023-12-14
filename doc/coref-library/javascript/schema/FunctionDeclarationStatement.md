# FunctionDeclarationStatement

Inherit from [DeclarationStatement](./DeclarationStatement.md)

Primary key: `id: int`

```rust
schema FunctionDeclarationStatement extends DeclarationStatement {
  @primary id: int,
}
```
## FunctionDeclarationStatement::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: FunctionDeclarationStatement) -> *Node;
```
## FunctionDeclarationStatement::getIndex

```rust
pub fn getIndex(self: FunctionDeclarationStatement) -> int;
```
## FunctionDeclarationStatement::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: FunctionDeclarationStatement) -> int;
```
## FunctionDeclarationStatement::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: FunctionDeclarationStatement) -> int;
```
## FunctionDeclarationStatement::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: FunctionDeclarationStatement) -> FunctionLikeDeclaration;
```
## FunctionDeclarationStatement::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: FunctionDeclarationStatement) -> Node;
```
## FunctionDeclarationStatement::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: FunctionDeclarationStatement) -> *Comment;
```
## FunctionDeclarationStatement::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: FunctionDeclarationStatement) -> *Comment;
```
## FunctionDeclarationStatement::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: FunctionDeclarationStatement) -> File;
```
## FunctionDeclarationStatement::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: FunctionDeclarationStatement, level: int) -> Node;
```
## FunctionDeclarationStatement::getEndLineNumber

```rust
pub fn getEndLineNumber(self: FunctionDeclarationStatement) -> int;
```
## FunctionDeclarationStatement::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: FunctionDeclarationStatement) -> string;
```
## FunctionDeclarationStatement::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: FunctionDeclarationStatement) -> *FunctionLikeDeclaration;
```
## FunctionDeclarationStatement::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: FunctionDeclarationStatement, level: int) -> *Node;
```
## FunctionDeclarationStatement::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: FunctionDeclarationStatement) -> int;
```
## FunctionDeclarationStatement::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: FunctionDeclarationStatement) -> *Modifier;
```
## FunctionDeclarationStatement::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: FunctionDeclarationStatement) -> int;
```
## FunctionDeclarationStatement::getStartLineNumber

```rust
pub fn getStartLineNumber(self: FunctionDeclarationStatement) -> int;
```
## FunctionDeclarationStatement::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: FunctionDeclarationStatement, i: int) -> Node;
```
## FunctionDeclarationStatement::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: FunctionDeclarationStatement, i: int) -> Decorator;
```
## FunctionDeclarationStatement::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: FunctionDeclarationStatement) -> TopLevelDO;
```
## FunctionDeclarationStatement::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: FunctionDeclarationStatement) -> int;
```
## FunctionDeclarationStatement::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: FunctionDeclarationStatement) -> Node;
```
## FunctionDeclarationStatement::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: FunctionDeclarationStatement) -> *Node;
```
## FunctionDeclarationStatement::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: FunctionDeclarationStatement) -> *Node;
```
## FunctionDeclarationStatement::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: FunctionDeclarationStatement) -> *Comment;
```
## FunctionDeclarationStatement::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: FunctionDeclarationStatement) -> Symbol;
```
## FunctionDeclarationStatement::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: FunctionDeclarationStatement) -> *Decorator;
```
## FunctionDeclarationStatement::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: FunctionDeclarationStatement, i: int) -> Modifier;
```
## FunctionDeclarationStatement::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: FunctionDeclarationStatement) -> string;
```
## FunctionDeclarationStatement::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *FunctionDeclarationStatement;
```
## FunctionDeclarationStatement::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: FunctionDeclarationStatement) -> Location;
```
