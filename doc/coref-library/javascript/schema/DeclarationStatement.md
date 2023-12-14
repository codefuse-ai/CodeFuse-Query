# DeclarationStatement

Inherit from [Statement](./Statement.md)

Primary key: `id: int`

```rust
schema DeclarationStatement extends Statement {
  @primary id: int,
}
```
## DeclarationStatement::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: DeclarationStatement) -> Location;
```
## DeclarationStatement::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: DeclarationStatement) -> Symbol;
```
## DeclarationStatement::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: DeclarationStatement) -> *Decorator;
```
## DeclarationStatement::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: DeclarationStatement) -> string;
```
## DeclarationStatement::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: DeclarationStatement, i: int) -> Modifier;
```
## DeclarationStatement::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: DeclarationStatement) -> *Comment;
```
## DeclarationStatement::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: DeclarationStatement) -> *Node;
```
## DeclarationStatement::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: DeclarationStatement) -> *Node;
```
## DeclarationStatement::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: DeclarationStatement) -> Node;
```
## DeclarationStatement::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: DeclarationStatement) -> int;
```
## DeclarationStatement::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: DeclarationStatement) -> TopLevelDO;
```
## DeclarationStatement::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: DeclarationStatement, i: int) -> Decorator;
```
## DeclarationStatement::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: DeclarationStatement) -> int;
```
## DeclarationStatement::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: DeclarationStatement) -> *Modifier;
```
## DeclarationStatement::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: DeclarationStatement) -> int;
```
## DeclarationStatement::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: DeclarationStatement, i: int) -> Node;
```
## DeclarationStatement::getStartLineNumber

```rust
pub fn getStartLineNumber(self: DeclarationStatement) -> int;
```
## DeclarationStatement::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: DeclarationStatement) -> *FunctionLikeDeclaration;
```
## DeclarationStatement::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: DeclarationStatement, level: int) -> *Node;
```
## DeclarationStatement::getEndLineNumber

```rust
pub fn getEndLineNumber(self: DeclarationStatement) -> int;
```
## DeclarationStatement::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: DeclarationStatement) -> string;
```
## DeclarationStatement::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: DeclarationStatement, level: int) -> Node;
```
## DeclarationStatement::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: DeclarationStatement) -> File;
```
## DeclarationStatement::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: DeclarationStatement) -> *Comment;
```
## DeclarationStatement::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: DeclarationStatement) -> *Comment;
```
## DeclarationStatement::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: DeclarationStatement) -> Node;
```
## DeclarationStatement::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: DeclarationStatement) -> FunctionLikeDeclaration;
```
## DeclarationStatement::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: DeclarationStatement) -> int;
```
## DeclarationStatement::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: DeclarationStatement) -> int;
```
## DeclarationStatement::getIndex

```rust
pub fn getIndex(self: DeclarationStatement) -> int;
```
## DeclarationStatement::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: DeclarationStatement) -> *Node;
```
## DeclarationStatement::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *DeclarationStatement;
```
