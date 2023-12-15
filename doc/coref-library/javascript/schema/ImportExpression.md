# ImportExpression

Inherit from [PrimaryExpression](./PrimaryExpression.md)

Primary key: `id: int`

```rust
schema ImportExpression extends PrimaryExpression {
  @primary id: int
}
```
## ImportExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: ImportExpression) -> *Node;
```
## ImportExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ImportExpression) -> int;
```
## ImportExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: ImportExpression) -> string;
```
## ImportExpression::getExpression

```rust
pub fn getExpression(self: ImportExpression) -> Expression;
```
## ImportExpression::getIndex

```rust
pub fn getIndex(self: ImportExpression) -> int;
```
## ImportExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: ImportExpression) -> int;
```
## ImportExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: ImportExpression, level: int) -> Node;
```
## ImportExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: ImportExpression) -> File;
```
## ImportExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ImportExpression) -> int;
```
## ImportExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: ImportExpression) -> FunctionLikeDeclaration;
```
## ImportExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: ImportExpression) -> *Comment;
```
## ImportExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: ImportExpression) -> *Comment;
```
## ImportExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ImportExpression) -> *FunctionLikeDeclaration;
```
## ImportExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: ImportExpression, level: int) -> *Node;
```
## ImportExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: ImportExpression) -> int;
```
## ImportExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: ImportExpression) -> *Modifier;
```
## ImportExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ImportExpression) -> int;
```
## ImportExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ImportExpression) -> int;
```
## ImportExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: ImportExpression, i: int) -> Node;
```
## ImportExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: ImportExpression, i: int) -> Decorator;
```
## ImportExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: ImportExpression) -> TopLevelDO;
```
## ImportExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: ImportExpression) -> int;
```
## ImportExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: ImportExpression) -> Node;
```
## ImportExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: ImportExpression) -> Node;
```
## ImportExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: ImportExpression) -> *Node;
```
## ImportExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: ImportExpression) -> *Node;
```
## ImportExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: ImportExpression) -> *Comment;
```
## ImportExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *ImportExpression;
```
## ImportExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: ImportExpression) -> Location;
```
## ImportExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: ImportExpression) -> Symbol;
```
## ImportExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: ImportExpression) -> *Decorator;
```
## ImportExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: ImportExpression, i: int) -> Modifier;
```
## ImportExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: ImportExpression) -> string;
```
