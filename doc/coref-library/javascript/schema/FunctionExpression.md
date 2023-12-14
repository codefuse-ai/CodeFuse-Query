# FunctionExpression

Inherit from [PrimaryExpression](./PrimaryExpression.md)

Primary key: `id: int`

```rust
schema FunctionExpression extends PrimaryExpression {
  @primary id: int,
}
```
## FunctionExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: FunctionExpression) -> *Node;
```
## FunctionExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: FunctionExpression) -> int;
```
## FunctionExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: FunctionExpression) -> string;
```
## FunctionExpression::getExpression

```rust
pub fn getExpression(self: FunctionExpression) -> Expression;
```
## FunctionExpression::getIndex

```rust
pub fn getIndex(self: FunctionExpression) -> int;
```
## FunctionExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: FunctionExpression) -> int;
```
## FunctionExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: FunctionExpression, level: int) -> Node;
```
## FunctionExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: FunctionExpression) -> int;
```
## FunctionExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: FunctionExpression) -> FunctionLikeDeclaration;
```
## FunctionExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: FunctionExpression) -> *Comment;
```
## FunctionExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: FunctionExpression) -> *Comment;
```
## FunctionExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: FunctionExpression) -> int;
```
## FunctionExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: FunctionExpression) -> *Modifier;
```
## FunctionExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: FunctionExpression) -> int;
```
## FunctionExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: FunctionExpression) -> int;
```
## FunctionExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: FunctionExpression, i: int) -> Node;
```
## FunctionExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: FunctionExpression, i: int) -> Decorator;
```
## FunctionExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: FunctionExpression) -> TopLevelDO;
```
## FunctionExpression::getName

```rust
pub fn getName(self: FunctionExpression) -> Identifier;
```
## FunctionExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: FunctionExpression) -> int;
```
## FunctionExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: FunctionExpression) -> Node;
```
## FunctionExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: FunctionExpression) -> Node;
```
## FunctionExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: FunctionExpression) -> *Node;
```
## FunctionExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: FunctionExpression) -> *Comment;
```
## FunctionExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: FunctionExpression) -> *Node;
```
## FunctionExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: FunctionExpression) -> *FunctionLikeDeclaration;
```
## FunctionExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: FunctionExpression, level: int) -> *Node;
```
## FunctionExpression::getBody

```rust
pub fn getBody(self: FunctionExpression) -> BlockStatement;
```
## FunctionExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: FunctionExpression) -> Symbol;
```
## FunctionExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: FunctionExpression) -> *Decorator;
```
## FunctionExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *FunctionExpression;
```
## FunctionExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: FunctionExpression) -> Location;
```
## FunctionExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: FunctionExpression, i: int) -> Modifier;
```
## FunctionExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: FunctionExpression) -> string;
```
## FunctionExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: FunctionExpression) -> File;
```
## FunctionExpression::getAParameter

```rust
pub fn getAParameter(self: FunctionExpression) -> *Parameter;
```
