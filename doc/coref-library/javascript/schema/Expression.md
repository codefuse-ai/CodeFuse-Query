# Expression

Primary key: `id: int`

```rust
schema Expression {
  @primary id: int,
}
```
## Expression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: Expression) -> *Node;
```
## Expression::getIndex

```rust
pub fn getIndex(self: Expression) -> int;
```
## Expression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: Expression) -> int;
```
## Expression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: Expression) -> int;
```
## Expression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: Expression) -> Node;
```
## Expression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: Expression) -> FunctionLikeDeclaration;
```
## Expression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: Expression) -> File;
```
## Expression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: Expression, level: int) -> Node;
```
## Expression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: Expression) -> string;
```
## Expression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: Expression) -> int;
```
## Expression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: Expression) -> *FunctionLikeDeclaration;
```
## Expression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: Expression, level: int) -> *Node;
```
## Expression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: Expression) -> int;
```
## Expression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: Expression) -> *Modifier;
```
## Expression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: Expression) -> int;
```
## Expression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: Expression) -> int;
```
## Expression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: Expression, i: int) -> Node;
```
## Expression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: Expression, i: int) -> Decorator;
```
## Expression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: Expression) -> TopLevelDO;
```
## Expression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: Expression) -> int;
```
## Expression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: Expression) -> *Comment;
```
## Expression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: Expression) -> *Comment;
```
## Expression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: Expression) -> Node;
```
## Expression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: Expression) -> *Node;
```
## Expression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: Expression) -> *Node;
```
## Expression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: Expression) -> *Comment;
```
## Expression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: Expression, i: int) -> Modifier;
```
## Expression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: Expression) -> string;
```
## Expression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: Expression) -> *Decorator;
```
## Expression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: Expression) -> Symbol;
```
## Expression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: Expression) -> Location;
```
## Expression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *Expression;
```
