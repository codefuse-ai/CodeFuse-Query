# LogicalNotExpression

Primary key: `id: int`

```rust
schema LogicalNotExpression {
  @primary id: int,
}
```
## LogicalNotExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: LogicalNotExpression) -> int;
```
## LogicalNotExpression::getOperand

```rust
pub fn getOperand(self: LogicalNotExpression) -> UnaryExpression;
```
## LogicalNotExpression::getIndex

```rust
pub fn getIndex(self: LogicalNotExpression) -> int;
```
## LogicalNotExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: LogicalNotExpression) -> *Node;
```
## LogicalNotExpression::getOperator

```rust
pub fn getOperator(self: LogicalNotExpression) -> PrefixUnaryOperator;
```
## LogicalNotExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: LogicalNotExpression) -> Location;
```
## LogicalNotExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: LogicalNotExpression) -> string;
```
## LogicalNotExpression::getExpression

```rust
pub fn getExpression(self: LogicalNotExpression) -> Expression;
```
## LogicalNotExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: LogicalNotExpression) -> int;
```
## LogicalNotExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: LogicalNotExpression) -> File;
```
## LogicalNotExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: LogicalNotExpression, level: int) -> Node;
```
## LogicalNotExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: LogicalNotExpression) -> FunctionLikeDeclaration;
```
## LogicalNotExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: LogicalNotExpression) -> *Comment;
```
## LogicalNotExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: LogicalNotExpression) -> *Comment;
```
## LogicalNotExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: LogicalNotExpression) -> *FunctionLikeDeclaration;
```
## LogicalNotExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: LogicalNotExpression, level: int) -> *Node;
```
## LogicalNotExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: LogicalNotExpression) -> int;
```
## LogicalNotExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: LogicalNotExpression) -> *Modifier;
```
## LogicalNotExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: LogicalNotExpression) -> int;
```
## LogicalNotExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: LogicalNotExpression) -> int;
```
## LogicalNotExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: LogicalNotExpression, i: int) -> Node;
```
## LogicalNotExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: LogicalNotExpression) -> TopLevelDO;
```
## LogicalNotExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: LogicalNotExpression, i: int) -> Decorator;
```
## LogicalNotExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: LogicalNotExpression) -> int;
```
## LogicalNotExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: LogicalNotExpression) -> *Node;
```
## LogicalNotExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: LogicalNotExpression) -> Node;
```
## LogicalNotExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: LogicalNotExpression) -> Node;
```
## LogicalNotExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: LogicalNotExpression) -> int;
```
## LogicalNotExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: LogicalNotExpression) -> *Node;
```
## LogicalNotExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: LogicalNotExpression) -> *Comment;
```
## LogicalNotExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: LogicalNotExpression) -> Symbol;
```
## LogicalNotExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: LogicalNotExpression) -> *Decorator;
```
## LogicalNotExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *LogicalNotExpression;
```
## LogicalNotExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: LogicalNotExpression, i: int) -> Modifier;
```
## LogicalNotExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: LogicalNotExpression) -> string;
```
