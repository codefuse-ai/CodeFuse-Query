# ArrowFunctionExpression

Inherit from [Expression](./Expression.md)

Primary key: `id: int`

```rust
schema ArrowFunctionExpression extends Expression {
  @primary id: int,
}
```
## ArrowFunctionExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: ArrowFunctionExpression) -> Location;
```
## ArrowFunctionExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: ArrowFunctionExpression) -> Symbol;
```
## ArrowFunctionExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: ArrowFunctionExpression) -> *Decorator;
```
## ArrowFunctionExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: ArrowFunctionExpression) -> string;
```
## ArrowFunctionExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: ArrowFunctionExpression, i: int) -> Modifier;
```
## ArrowFunctionExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: ArrowFunctionExpression) -> *Comment;
```
## ArrowFunctionExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: ArrowFunctionExpression) -> *Node;
```
## ArrowFunctionExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: ArrowFunctionExpression) -> *Node;
```
## ArrowFunctionExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: ArrowFunctionExpression) -> Node;
```
## ArrowFunctionExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: ArrowFunctionExpression) -> int;
```
## ArrowFunctionExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: ArrowFunctionExpression) -> TopLevelDO;
```
## ArrowFunctionExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: ArrowFunctionExpression, i: int) -> Decorator;
```
## ArrowFunctionExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: ArrowFunctionExpression) -> int;
```
## ArrowFunctionExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: ArrowFunctionExpression) -> *Modifier;
```
## ArrowFunctionExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ArrowFunctionExpression) -> int;
```
## ArrowFunctionExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: ArrowFunctionExpression, i: int) -> Node;
```
## ArrowFunctionExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ArrowFunctionExpression) -> int;
```
## ArrowFunctionExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ArrowFunctionExpression) -> *FunctionLikeDeclaration;
```
## ArrowFunctionExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: ArrowFunctionExpression, level: int) -> *Node;
```
## ArrowFunctionExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ArrowFunctionExpression) -> int;
```
## ArrowFunctionExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: ArrowFunctionExpression) -> string;
```
## ArrowFunctionExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: ArrowFunctionExpression, level: int) -> Node;
```
## ArrowFunctionExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: ArrowFunctionExpression) -> File;
```
## ArrowFunctionExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: ArrowFunctionExpression) -> *Comment;
```
## ArrowFunctionExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: ArrowFunctionExpression) -> *Comment;
```
## ArrowFunctionExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: ArrowFunctionExpression) -> Node;
```
## ArrowFunctionExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: ArrowFunctionExpression) -> FunctionLikeDeclaration;
```
## ArrowFunctionExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ArrowFunctionExpression) -> int;
```
## ArrowFunctionExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: ArrowFunctionExpression) -> int;
```
## ArrowFunctionExpression::getIndex

```rust
pub fn getIndex(self: ArrowFunctionExpression) -> int;
```
## ArrowFunctionExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: ArrowFunctionExpression) -> *Node;
```
## ArrowFunctionExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *ArrowFunctionExpression;
```
