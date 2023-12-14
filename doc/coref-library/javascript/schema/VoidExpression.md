# VoidExpression

Primary key: `id: int`

```rust
schema VoidExpression {
  @primary id: int,
}
```
## VoidExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: VoidExpression) -> *Node;
```
## VoidExpression::getIndex

```rust
pub fn getIndex(self: VoidExpression) -> int;
```
## VoidExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: VoidExpression) -> int;
```
## VoidExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: VoidExpression, level: int) -> Node;
```
## VoidExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: VoidExpression) -> File;
```
## VoidExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: VoidExpression) -> FunctionLikeDeclaration;
```
## VoidExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: VoidExpression) -> int;
```
## VoidExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: VoidExpression) -> Node;
```
## VoidExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: VoidExpression) -> *Comment;
```
## VoidExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: VoidExpression) -> *Comment;
```
## VoidExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: VoidExpression) -> *FunctionLikeDeclaration;
```
## VoidExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: VoidExpression, level: int) -> *Node;
```
## VoidExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: VoidExpression) -> int;
```
## VoidExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: VoidExpression) -> *Modifier;
```
## VoidExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: VoidExpression) -> int;
```
## VoidExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: VoidExpression) -> int;
```
## VoidExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: VoidExpression, i: int) -> Node;
```
## VoidExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: VoidExpression, i: int) -> Decorator;
```
## VoidExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: VoidExpression) -> TopLevelDO;
```
## VoidExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: VoidExpression) -> int;
```
## VoidExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: VoidExpression) -> Node;
```
## VoidExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: VoidExpression) -> *Node;
```
## VoidExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: VoidExpression) -> *Node;
```
## VoidExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: VoidExpression) -> *Comment;
```
## VoidExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: VoidExpression) -> Symbol;
```
## VoidExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: VoidExpression) -> *Decorator;
```
## VoidExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: VoidExpression, i: int) -> Modifier;
```
## VoidExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: VoidExpression) -> string;
```
## VoidExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *VoidExpression;
```
## VoidExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: VoidExpression) -> int;
```
## VoidExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: VoidExpression) -> string;
```
## VoidExpression::getExpression

```rust
pub fn getExpression(self: VoidExpression) -> UnaryExpression;
```
## VoidExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: VoidExpression) -> Location;
```
