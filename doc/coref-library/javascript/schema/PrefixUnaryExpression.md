# PrefixUnaryExpression

Primary key: `id: int`

```rust
schema PrefixUnaryExpression {
  @primary id: int,
}
```
## PrefixUnaryExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: PrefixUnaryExpression) -> string;
```
## PrefixUnaryExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: PrefixUnaryExpression, i: int) -> Modifier;
```
## PrefixUnaryExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: PrefixUnaryExpression) -> *Decorator;
```
## PrefixUnaryExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: PrefixUnaryExpression) -> Symbol;
```
## PrefixUnaryExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: PrefixUnaryExpression) -> *Comment;
```
## PrefixUnaryExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: PrefixUnaryExpression) -> *Node;
```
## PrefixUnaryExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: PrefixUnaryExpression) -> *Node;
```
## PrefixUnaryExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: PrefixUnaryExpression) -> Node;
```
## PrefixUnaryExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: PrefixUnaryExpression) -> Node;
```
## PrefixUnaryExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: PrefixUnaryExpression) -> int;
```
## PrefixUnaryExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: PrefixUnaryExpression) -> TopLevelDO;
```
## PrefixUnaryExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: PrefixUnaryExpression, i: int) -> Decorator;
```
## PrefixUnaryExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: PrefixUnaryExpression) -> int;
```
## PrefixUnaryExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: PrefixUnaryExpression) -> *Modifier;
```
## PrefixUnaryExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: PrefixUnaryExpression) -> int;
```
## PrefixUnaryExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: PrefixUnaryExpression, i: int) -> Node;
```
## PrefixUnaryExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: PrefixUnaryExpression) -> int;
```
## PrefixUnaryExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: PrefixUnaryExpression, level: int) -> *Node;
```
## PrefixUnaryExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: PrefixUnaryExpression) -> *FunctionLikeDeclaration;
```
## PrefixUnaryExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: PrefixUnaryExpression) -> *Comment;
```
## PrefixUnaryExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: PrefixUnaryExpression) -> *Comment;
```
## PrefixUnaryExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: PrefixUnaryExpression) -> int;
```
## PrefixUnaryExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: PrefixUnaryExpression) -> FunctionLikeDeclaration;
```
## PrefixUnaryExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: PrefixUnaryExpression, level: int) -> Node;
```
## PrefixUnaryExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: PrefixUnaryExpression) -> File;
```
## PrefixUnaryExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *PrefixUnaryExpression;
```
## PrefixUnaryExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: PrefixUnaryExpression) -> int;
```
## PrefixUnaryExpression::getExpression

```rust
pub fn getExpression(self: PrefixUnaryExpression) -> Expression;
```
## PrefixUnaryExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: PrefixUnaryExpression) -> string;
```
## PrefixUnaryExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: PrefixUnaryExpression) -> Location;
```
## PrefixUnaryExpression::getOperator

```rust
pub fn getOperator(self: PrefixUnaryExpression) -> PrefixUnaryOperator;
```
## PrefixUnaryExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: PrefixUnaryExpression) -> *Node;
```
## PrefixUnaryExpression::getIndex

```rust
pub fn getIndex(self: PrefixUnaryExpression) -> int;
```
## PrefixUnaryExpression::getOperand

```rust
pub fn getOperand(self: PrefixUnaryExpression) -> UnaryExpression;
```
## PrefixUnaryExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: PrefixUnaryExpression) -> int;
```
