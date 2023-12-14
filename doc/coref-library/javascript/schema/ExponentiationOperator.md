# ExponentiationOperator

Primary key: `id: int`

```rust
schema ExponentiationOperator {
  @primary id: int,
}
```
## ExponentiationOperator::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: ExponentiationOperator) -> Location;
```
## ExponentiationOperator::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: ExponentiationOperator) -> Symbol;
```
## ExponentiationOperator::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: ExponentiationOperator) -> *Decorator;
```
## ExponentiationOperator::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: ExponentiationOperator) -> string;
```
## ExponentiationOperator::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: ExponentiationOperator, i: int) -> Modifier;
```
## ExponentiationOperator::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: ExponentiationOperator) -> *Comment;
```
## ExponentiationOperator::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: ExponentiationOperator) -> *Node;
```
## ExponentiationOperator::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: ExponentiationOperator) -> *Node;
```
## ExponentiationOperator::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: ExponentiationOperator) -> Node;
```
## ExponentiationOperator::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: ExponentiationOperator) -> int;
```
## ExponentiationOperator::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: ExponentiationOperator) -> TopLevelDO;
```
## ExponentiationOperator::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: ExponentiationOperator, i: int) -> Decorator;
```
## ExponentiationOperator::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: ExponentiationOperator) -> int;
```
## ExponentiationOperator::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: ExponentiationOperator) -> *Modifier;
```
## ExponentiationOperator::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ExponentiationOperator) -> int;
```
## ExponentiationOperator::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: ExponentiationOperator, i: int) -> Node;
```
## ExponentiationOperator::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ExponentiationOperator) -> int;
```
## ExponentiationOperator::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ExponentiationOperator) -> *FunctionLikeDeclaration;
```
## ExponentiationOperator::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: ExponentiationOperator, level: int) -> *Node;
```
## ExponentiationOperator::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ExponentiationOperator) -> int;
```
## ExponentiationOperator::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: ExponentiationOperator) -> string;
```
## ExponentiationOperator::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: ExponentiationOperator, level: int) -> Node;
```
## ExponentiationOperator::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: ExponentiationOperator) -> File;
```
## ExponentiationOperator::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: ExponentiationOperator) -> *Comment;
```
## ExponentiationOperator::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: ExponentiationOperator) -> *Comment;
```
## ExponentiationOperator::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: ExponentiationOperator) -> Node;
```
## ExponentiationOperator::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: ExponentiationOperator) -> FunctionLikeDeclaration;
```
## ExponentiationOperator::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ExponentiationOperator) -> int;
```
## ExponentiationOperator::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: ExponentiationOperator) -> int;
```
## ExponentiationOperator::getIndex

```rust
pub fn getIndex(self: ExponentiationOperator) -> int;
```
## ExponentiationOperator::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: ExponentiationOperator) -> *Node;
```
## ExponentiationOperator::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *ExponentiationOperator;
```
