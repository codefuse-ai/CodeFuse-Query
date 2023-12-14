# UpdateExpression

Primary key: `id: int`

```rust
schema UpdateExpression {
  @primary id: int,
}
```
## UpdateExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: UpdateExpression) -> *Node;
```
## UpdateExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: UpdateExpression) -> int;
```
## UpdateExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: UpdateExpression) -> string;
```
## UpdateExpression::getExpression

```rust
pub fn getExpression(self: UpdateExpression) -> Expression;
```
## UpdateExpression::getIndex

```rust
pub fn getIndex(self: UpdateExpression) -> int;
```
## UpdateExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: UpdateExpression) -> int;
```
## UpdateExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: UpdateExpression, level: int) -> Node;
```
## UpdateExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: UpdateExpression) -> File;
```
## UpdateExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: UpdateExpression) -> FunctionLikeDeclaration;
```
## UpdateExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: UpdateExpression) -> int;
```
## UpdateExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: UpdateExpression) -> *Comment;
```
## UpdateExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: UpdateExpression) -> *Comment;
```
## UpdateExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: UpdateExpression) -> *FunctionLikeDeclaration;
```
## UpdateExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: UpdateExpression, level: int) -> *Node;
```
## UpdateExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: UpdateExpression) -> int;
```
## UpdateExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: UpdateExpression) -> *Modifier;
```
## UpdateExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: UpdateExpression) -> int;
```
## UpdateExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: UpdateExpression) -> int;
```
## UpdateExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: UpdateExpression, i: int) -> Node;
```
## UpdateExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: UpdateExpression, i: int) -> Decorator;
```
## UpdateExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: UpdateExpression) -> TopLevelDO;
```
## UpdateExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: UpdateExpression) -> int;
```
## UpdateExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: UpdateExpression) -> Node;
```
## UpdateExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: UpdateExpression) -> Node;
```
## UpdateExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: UpdateExpression) -> *Node;
```
## UpdateExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: UpdateExpression) -> *Node;
```
## UpdateExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: UpdateExpression) -> *Comment;
```
## UpdateExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: UpdateExpression) -> Symbol;
```
## UpdateExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: UpdateExpression) -> *Decorator;
```
## UpdateExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: UpdateExpression, i: int) -> Modifier;
```
## UpdateExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: UpdateExpression) -> string;
```
## UpdateExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *UpdateExpression;
```
## UpdateExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: UpdateExpression) -> Location;
```
