# EmptyStatement

Primary key: `id: int`

```rust
schema EmptyStatement {
  @primary id: int,
}
```
## EmptyStatement::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: EmptyStatement) -> Location;
```
## EmptyStatement::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: EmptyStatement) -> Symbol;
```
## EmptyStatement::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: EmptyStatement) -> *Decorator;
```
## EmptyStatement::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: EmptyStatement) -> string;
```
## EmptyStatement::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: EmptyStatement, i: int) -> Modifier;
```
## EmptyStatement::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: EmptyStatement) -> *Comment;
```
## EmptyStatement::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: EmptyStatement) -> *Node;
```
## EmptyStatement::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: EmptyStatement) -> *Node;
```
## EmptyStatement::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: EmptyStatement) -> Node;
```
## EmptyStatement::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: EmptyStatement) -> int;
```
## EmptyStatement::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: EmptyStatement) -> TopLevelDO;
```
## EmptyStatement::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: EmptyStatement, i: int) -> Decorator;
```
## EmptyStatement::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: EmptyStatement) -> int;
```
## EmptyStatement::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: EmptyStatement) -> *Modifier;
```
## EmptyStatement::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: EmptyStatement) -> int;
```
## EmptyStatement::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: EmptyStatement, i: int) -> Node;
```
## EmptyStatement::getStartLineNumber

```rust
pub fn getStartLineNumber(self: EmptyStatement) -> int;
```
## EmptyStatement::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: EmptyStatement) -> *FunctionLikeDeclaration;
```
## EmptyStatement::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: EmptyStatement, level: int) -> *Node;
```
## EmptyStatement::getEndLineNumber

```rust
pub fn getEndLineNumber(self: EmptyStatement) -> int;
```
## EmptyStatement::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: EmptyStatement) -> string;
```
## EmptyStatement::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: EmptyStatement, level: int) -> Node;
```
## EmptyStatement::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: EmptyStatement) -> File;
```
## EmptyStatement::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: EmptyStatement) -> *Comment;
```
## EmptyStatement::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: EmptyStatement) -> *Comment;
```
## EmptyStatement::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: EmptyStatement) -> Node;
```
## EmptyStatement::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: EmptyStatement) -> FunctionLikeDeclaration;
```
## EmptyStatement::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: EmptyStatement) -> int;
```
## EmptyStatement::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: EmptyStatement) -> int;
```
## EmptyStatement::getIndex

```rust
pub fn getIndex(self: EmptyStatement) -> int;
```
## EmptyStatement::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: EmptyStatement) -> *Node;
```
## EmptyStatement::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *EmptyStatement;
```
