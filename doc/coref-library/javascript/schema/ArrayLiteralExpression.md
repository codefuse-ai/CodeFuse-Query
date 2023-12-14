# ArrayLiteralExpression

Primary key: `id: int`

```rust
schema ArrayLiteralExpression {
  @primary id: int,
}
```
## ArrayLiteralExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: ArrayLiteralExpression) -> *Node;
```
## ArrayLiteralExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ArrayLiteralExpression) -> int;
```
## ArrayLiteralExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: ArrayLiteralExpression) -> string;
```
## ArrayLiteralExpression::getExpression

```rust
pub fn getExpression(self: ArrayLiteralExpression) -> Expression;
```
## ArrayLiteralExpression::getIndex

```rust
pub fn getIndex(self: ArrayLiteralExpression) -> int;
```
## ArrayLiteralExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: ArrayLiteralExpression) -> int;
```
## ArrayLiteralExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: ArrayLiteralExpression, level: int) -> Node;
```
## ArrayLiteralExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: ArrayLiteralExpression) -> File;
```
## ArrayLiteralExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ArrayLiteralExpression) -> int;
```
## ArrayLiteralExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: ArrayLiteralExpression) -> FunctionLikeDeclaration;
```
## ArrayLiteralExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: ArrayLiteralExpression) -> *Comment;
```
## ArrayLiteralExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: ArrayLiteralExpression) -> *Comment;
```
## ArrayLiteralExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ArrayLiteralExpression) -> *FunctionLikeDeclaration;
```
## ArrayLiteralExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: ArrayLiteralExpression, level: int) -> *Node;
```
## ArrayLiteralExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: ArrayLiteralExpression) -> int;
```
## ArrayLiteralExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: ArrayLiteralExpression) -> *Modifier;
```
## ArrayLiteralExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ArrayLiteralExpression) -> int;
```
## ArrayLiteralExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ArrayLiteralExpression) -> int;
```
## ArrayLiteralExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: ArrayLiteralExpression, i: int) -> Node;
```
## ArrayLiteralExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: ArrayLiteralExpression, i: int) -> Decorator;
```
## ArrayLiteralExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: ArrayLiteralExpression) -> TopLevelDO;
```
## ArrayLiteralExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: ArrayLiteralExpression) -> int;
```
## ArrayLiteralExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: ArrayLiteralExpression) -> Node;
```
## ArrayLiteralExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: ArrayLiteralExpression) -> Node;
```
## ArrayLiteralExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: ArrayLiteralExpression) -> *Node;
```
## ArrayLiteralExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: ArrayLiteralExpression) -> *Node;
```
## ArrayLiteralExpression::getAElement

```rust
pub fn getAElement(self: ArrayLiteralExpression) -> *Expression;
```
## ArrayLiteralExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: ArrayLiteralExpression) -> *Comment;
```
## ArrayLiteralExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: ArrayLiteralExpression) -> Symbol;
```
## ArrayLiteralExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: ArrayLiteralExpression) -> *Decorator;
```
## ArrayLiteralExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: ArrayLiteralExpression) -> Location;
```
## ArrayLiteralExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *ArrayLiteralExpression;
```
## ArrayLiteralExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: ArrayLiteralExpression) -> string;
```
## ArrayLiteralExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: ArrayLiteralExpression, i: int) -> Modifier;
```
## ArrayLiteralExpression::getElement

```rust
pub fn getElement(self: ArrayLiteralExpression, i: int) -> Expression;
```
