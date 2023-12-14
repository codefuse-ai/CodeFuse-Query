# ClassDeclarationStatement

Inherit from [DeclarationStatement](./DeclarationStatement.md)

Primary key: `id: int`

```rust
schema ClassDeclarationStatement extends DeclarationStatement {
  @primary id: int,
}
```
## ClassDeclarationStatement::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: ClassDeclarationStatement) -> *Node;
```
## ClassDeclarationStatement::getIndex

```rust
pub fn getIndex(self: ClassDeclarationStatement) -> int;
```
## ClassDeclarationStatement::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: ClassDeclarationStatement) -> int;
```
## ClassDeclarationStatement::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ClassDeclarationStatement) -> int;
```
## ClassDeclarationStatement::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: ClassDeclarationStatement) -> FunctionLikeDeclaration;
```
## ClassDeclarationStatement::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: ClassDeclarationStatement) -> Node;
```
## ClassDeclarationStatement::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: ClassDeclarationStatement) -> *Comment;
```
## ClassDeclarationStatement::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: ClassDeclarationStatement) -> *Comment;
```
## ClassDeclarationStatement::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: ClassDeclarationStatement) -> File;
```
## ClassDeclarationStatement::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: ClassDeclarationStatement, level: int) -> Node;
```
## ClassDeclarationStatement::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ClassDeclarationStatement) -> int;
```
## ClassDeclarationStatement::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: ClassDeclarationStatement) -> string;
```
## ClassDeclarationStatement::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ClassDeclarationStatement) -> *FunctionLikeDeclaration;
```
## ClassDeclarationStatement::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: ClassDeclarationStatement, level: int) -> *Node;
```
## ClassDeclarationStatement::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: ClassDeclarationStatement) -> int;
```
## ClassDeclarationStatement::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: ClassDeclarationStatement) -> *Modifier;
```
## ClassDeclarationStatement::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ClassDeclarationStatement) -> int;
```
## ClassDeclarationStatement::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ClassDeclarationStatement) -> int;
```
## ClassDeclarationStatement::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: ClassDeclarationStatement, i: int) -> Node;
```
## ClassDeclarationStatement::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: ClassDeclarationStatement, i: int) -> Decorator;
```
## ClassDeclarationStatement::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: ClassDeclarationStatement) -> TopLevelDO;
```
## ClassDeclarationStatement::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: ClassDeclarationStatement) -> int;
```
## ClassDeclarationStatement::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: ClassDeclarationStatement) -> Node;
```
## ClassDeclarationStatement::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: ClassDeclarationStatement) -> *Node;
```
## ClassDeclarationStatement::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: ClassDeclarationStatement) -> *Node;
```
## ClassDeclarationStatement::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: ClassDeclarationStatement) -> *Comment;
```
## ClassDeclarationStatement::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: ClassDeclarationStatement) -> Symbol;
```
## ClassDeclarationStatement::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: ClassDeclarationStatement) -> *Decorator;
```
## ClassDeclarationStatement::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: ClassDeclarationStatement, i: int) -> Modifier;
```
## ClassDeclarationStatement::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: ClassDeclarationStatement) -> string;
```
## ClassDeclarationStatement::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *ClassDeclarationStatement;
```
## ClassDeclarationStatement::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: ClassDeclarationStatement) -> Location;
```
