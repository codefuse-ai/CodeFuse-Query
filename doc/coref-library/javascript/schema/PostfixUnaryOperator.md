# PostfixUnaryOperator

Primary key: `id: int`

```rust
schema PostfixUnaryOperator {
  @primary id: int,
}
```
## PostfixUnaryOperator::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: PostfixUnaryOperator) -> Location;
```
## PostfixUnaryOperator::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: PostfixUnaryOperator) -> Symbol;
```
## PostfixUnaryOperator::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: PostfixUnaryOperator) -> *Decorator;
```
## PostfixUnaryOperator::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: PostfixUnaryOperator) -> string;
```
## PostfixUnaryOperator::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: PostfixUnaryOperator, i: int) -> Modifier;
```
## PostfixUnaryOperator::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: PostfixUnaryOperator) -> *Comment;
```
## PostfixUnaryOperator::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: PostfixUnaryOperator) -> *Node;
```
## PostfixUnaryOperator::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: PostfixUnaryOperator) -> *Node;
```
## PostfixUnaryOperator::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: PostfixUnaryOperator) -> Node;
```
## PostfixUnaryOperator::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: PostfixUnaryOperator) -> int;
```
## PostfixUnaryOperator::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: PostfixUnaryOperator) -> TopLevelDO;
```
## PostfixUnaryOperator::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: PostfixUnaryOperator, i: int) -> Decorator;
```
## PostfixUnaryOperator::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: PostfixUnaryOperator) -> int;
```
## PostfixUnaryOperator::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: PostfixUnaryOperator) -> *Modifier;
```
## PostfixUnaryOperator::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: PostfixUnaryOperator) -> int;
```
## PostfixUnaryOperator::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: PostfixUnaryOperator, i: int) -> Node;
```
## PostfixUnaryOperator::getStartLineNumber

```rust
pub fn getStartLineNumber(self: PostfixUnaryOperator) -> int;
```
## PostfixUnaryOperator::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: PostfixUnaryOperator) -> *FunctionLikeDeclaration;
```
## PostfixUnaryOperator::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: PostfixUnaryOperator, level: int) -> *Node;
```
## PostfixUnaryOperator::getEndLineNumber

```rust
pub fn getEndLineNumber(self: PostfixUnaryOperator) -> int;
```
## PostfixUnaryOperator::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: PostfixUnaryOperator) -> string;
```
## PostfixUnaryOperator::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: PostfixUnaryOperator, level: int) -> Node;
```
## PostfixUnaryOperator::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: PostfixUnaryOperator) -> File;
```
## PostfixUnaryOperator::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: PostfixUnaryOperator) -> *Comment;
```
## PostfixUnaryOperator::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: PostfixUnaryOperator) -> *Comment;
```
## PostfixUnaryOperator::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: PostfixUnaryOperator) -> Node;
```
## PostfixUnaryOperator::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: PostfixUnaryOperator) -> FunctionLikeDeclaration;
```
## PostfixUnaryOperator::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: PostfixUnaryOperator) -> int;
```
## PostfixUnaryOperator::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: PostfixUnaryOperator) -> int;
```
## PostfixUnaryOperator::getIndex

```rust
pub fn getIndex(self: PostfixUnaryOperator) -> int;
```
## PostfixUnaryOperator::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: PostfixUnaryOperator) -> *Node;
```
## PostfixUnaryOperator::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *PostfixUnaryOperator;
```
