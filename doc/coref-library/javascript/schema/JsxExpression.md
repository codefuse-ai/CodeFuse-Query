# JsxExpression

Inherit from [Expression](./Expression.md)

Primary key: `id: int`

```rust
schema JsxExpression extends Expression {
  @primary id: int
}
```
## JsxExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: JsxExpression) -> Location;
```
## JsxExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: JsxExpression) -> Symbol;
```
## JsxExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: JsxExpression) -> *Decorator;
```
## JsxExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: JsxExpression) -> string;
```
## JsxExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: JsxExpression, i: int) -> Modifier;
```
## JsxExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: JsxExpression) -> *Comment;
```
## JsxExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: JsxExpression) -> *Node;
```
## JsxExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: JsxExpression) -> *Node;
```
## JsxExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: JsxExpression) -> Node;
```
## JsxExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: JsxExpression) -> int;
```
## JsxExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: JsxExpression) -> TopLevelDO;
```
## JsxExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: JsxExpression, i: int) -> Decorator;
```
## JsxExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: JsxExpression) -> int;
```
## JsxExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: JsxExpression) -> *Modifier;
```
## JsxExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: JsxExpression) -> int;
```
## JsxExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: JsxExpression, i: int) -> Node;
```
## JsxExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: JsxExpression) -> int;
```
## JsxExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: JsxExpression) -> *FunctionLikeDeclaration;
```
## JsxExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: JsxExpression, level: int) -> *Node;
```
## JsxExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: JsxExpression) -> int;
```
## JsxExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: JsxExpression) -> string;
```
## JsxExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: JsxExpression, level: int) -> Node;
```
## JsxExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: JsxExpression) -> File;
```
## JsxExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: JsxExpression) -> *Comment;
```
## JsxExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: JsxExpression) -> *Comment;
```
## JsxExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: JsxExpression) -> Node;
```
## JsxExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: JsxExpression) -> FunctionLikeDeclaration;
```
## JsxExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: JsxExpression) -> int;
```
## JsxExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: JsxExpression) -> int;
```
## JsxExpression::getIndex

```rust
pub fn getIndex(self: JsxExpression) -> int;
```
## JsxExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: JsxExpression) -> *Node;
```
## JsxExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *JsxExpression;
```
