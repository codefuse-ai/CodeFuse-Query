# StatementButNotDeclaration

Inherit from [Statement](./Statement.md)

Primary key: `id: int`

```rust
schema StatementButNotDeclaration extends Statement {
  @primary id: int
}
```
## StatementButNotDeclaration::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: StatementButNotDeclaration) -> Location;
```
## StatementButNotDeclaration::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: StatementButNotDeclaration) -> Symbol;
```
## StatementButNotDeclaration::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: StatementButNotDeclaration) -> *Decorator;
```
## StatementButNotDeclaration::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: StatementButNotDeclaration) -> string;
```
## StatementButNotDeclaration::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: StatementButNotDeclaration, i: int) -> Modifier;
```
## StatementButNotDeclaration::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: StatementButNotDeclaration) -> *Comment;
```
## StatementButNotDeclaration::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: StatementButNotDeclaration) -> *Node;
```
## StatementButNotDeclaration::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: StatementButNotDeclaration) -> *Node;
```
## StatementButNotDeclaration::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: StatementButNotDeclaration) -> Node;
```
## StatementButNotDeclaration::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: StatementButNotDeclaration) -> int;
```
## StatementButNotDeclaration::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: StatementButNotDeclaration) -> TopLevelDO;
```
## StatementButNotDeclaration::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: StatementButNotDeclaration, i: int) -> Decorator;
```
## StatementButNotDeclaration::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: StatementButNotDeclaration) -> int;
```
## StatementButNotDeclaration::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: StatementButNotDeclaration) -> *Modifier;
```
## StatementButNotDeclaration::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: StatementButNotDeclaration) -> int;
```
## StatementButNotDeclaration::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: StatementButNotDeclaration, i: int) -> Node;
```
## StatementButNotDeclaration::getStartLineNumber

```rust
pub fn getStartLineNumber(self: StatementButNotDeclaration) -> int;
```
## StatementButNotDeclaration::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: StatementButNotDeclaration) -> *FunctionLikeDeclaration;
```
## StatementButNotDeclaration::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: StatementButNotDeclaration, level: int) -> *Node;
```
## StatementButNotDeclaration::getEndLineNumber

```rust
pub fn getEndLineNumber(self: StatementButNotDeclaration) -> int;
```
## StatementButNotDeclaration::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: StatementButNotDeclaration) -> string;
```
## StatementButNotDeclaration::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: StatementButNotDeclaration, level: int) -> Node;
```
## StatementButNotDeclaration::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: StatementButNotDeclaration) -> File;
```
## StatementButNotDeclaration::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: StatementButNotDeclaration) -> *Comment;
```
## StatementButNotDeclaration::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: StatementButNotDeclaration) -> *Comment;
```
## StatementButNotDeclaration::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: StatementButNotDeclaration) -> Node;
```
## StatementButNotDeclaration::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: StatementButNotDeclaration) -> FunctionLikeDeclaration;
```
## StatementButNotDeclaration::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: StatementButNotDeclaration) -> int;
```
## StatementButNotDeclaration::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: StatementButNotDeclaration) -> int;
```
## StatementButNotDeclaration::getIndex

```rust
pub fn getIndex(self: StatementButNotDeclaration) -> int;
```
## StatementButNotDeclaration::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: StatementButNotDeclaration) -> *Node;
```
## StatementButNotDeclaration::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *StatementButNotDeclaration;
```
