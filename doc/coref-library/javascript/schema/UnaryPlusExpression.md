# UnaryPlusExpression

Inherit from [PrefixUnaryExpression](./PrefixUnaryExpression.md)

Primary key: `id: int`

```rust
schema UnaryPlusExpression extends PrefixUnaryExpression {
  @primary id: int
}
```
## UnaryPlusExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: UnaryPlusExpression) -> int;
```
## UnaryPlusExpression::getOperand

```rust
pub fn getOperand(self: UnaryPlusExpression) -> UnaryExpression;
```
## UnaryPlusExpression::getIndex

```rust
pub fn getIndex(self: UnaryPlusExpression) -> int;
```
## UnaryPlusExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: UnaryPlusExpression) -> *Node;
```
## UnaryPlusExpression::getOperator

```rust
pub fn getOperator(self: UnaryPlusExpression) -> PrefixUnaryOperator;
```
## UnaryPlusExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: UnaryPlusExpression) -> Location;
```
## UnaryPlusExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: UnaryPlusExpression) -> string;
```
## UnaryPlusExpression::getExpression

```rust
pub fn getExpression(self: UnaryPlusExpression) -> Expression;
```
## UnaryPlusExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: UnaryPlusExpression) -> int;
```
## UnaryPlusExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: UnaryPlusExpression) -> File;
```
## UnaryPlusExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: UnaryPlusExpression, level: int) -> Node;
```
## UnaryPlusExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: UnaryPlusExpression) -> FunctionLikeDeclaration;
```
## UnaryPlusExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: UnaryPlusExpression) -> *Comment;
```
## UnaryPlusExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: UnaryPlusExpression) -> *Comment;
```
## UnaryPlusExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: UnaryPlusExpression) -> *FunctionLikeDeclaration;
```
## UnaryPlusExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: UnaryPlusExpression, level: int) -> *Node;
```
## UnaryPlusExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: UnaryPlusExpression) -> int;
```
## UnaryPlusExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: UnaryPlusExpression) -> *Modifier;
```
## UnaryPlusExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: UnaryPlusExpression) -> int;
```
## UnaryPlusExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: UnaryPlusExpression) -> int;
```
## UnaryPlusExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: UnaryPlusExpression, i: int) -> Node;
```
## UnaryPlusExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: UnaryPlusExpression) -> TopLevelDO;
```
## UnaryPlusExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: UnaryPlusExpression, i: int) -> Decorator;
```
## UnaryPlusExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: UnaryPlusExpression) -> int;
```
## UnaryPlusExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: UnaryPlusExpression) -> *Node;
```
## UnaryPlusExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: UnaryPlusExpression) -> Node;
```
## UnaryPlusExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: UnaryPlusExpression) -> Node;
```
## UnaryPlusExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: UnaryPlusExpression) -> int;
```
## UnaryPlusExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: UnaryPlusExpression) -> *Node;
```
## UnaryPlusExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: UnaryPlusExpression) -> *Comment;
```
## UnaryPlusExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: UnaryPlusExpression) -> Symbol;
```
## UnaryPlusExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: UnaryPlusExpression) -> *Decorator;
```
## UnaryPlusExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *UnaryPlusExpression;
```
## UnaryPlusExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: UnaryPlusExpression, i: int) -> Modifier;
```
## UnaryPlusExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: UnaryPlusExpression) -> string;
```
