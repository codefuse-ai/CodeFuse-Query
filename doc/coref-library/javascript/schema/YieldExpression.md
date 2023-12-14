# YieldExpression

Primary key: `id: int`

```rust
schema YieldExpression {
  @primary id: int,
}
```
## YieldExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: YieldExpression) -> Location;
```
## YieldExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: YieldExpression) -> Symbol;
```
## YieldExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: YieldExpression) -> *Decorator;
```
## YieldExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: YieldExpression) -> string;
```
## YieldExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: YieldExpression, i: int) -> Modifier;
```
## YieldExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: YieldExpression) -> *Comment;
```
## YieldExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: YieldExpression) -> *Node;
```
## YieldExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: YieldExpression) -> *Node;
```
## YieldExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: YieldExpression) -> Node;
```
## YieldExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: YieldExpression) -> *Comment;
```
## YieldExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: YieldExpression) -> *Comment;
```
## YieldExpression::isDelegating

```rust
pub fn isDelegating(self: YieldExpression) -> bool;
```
## YieldExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: YieldExpression) -> int;
```
## YieldExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: YieldExpression) -> TopLevelDO;
```
## YieldExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: YieldExpression, i: int) -> Decorator;
```
## YieldExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: YieldExpression) -> int;
```
## YieldExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: YieldExpression) -> *Modifier;
```
## YieldExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: YieldExpression) -> int;
```
## YieldExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: YieldExpression, i: int) -> Node;
```
## YieldExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: YieldExpression) -> int;
```
## YieldExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: YieldExpression) -> *FunctionLikeDeclaration;
```
## YieldExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: YieldExpression, level: int) -> *Node;
```
## YieldExpression::getExpression

```rust
pub fn getExpression(self: YieldExpression) -> Expression;
```
## YieldExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: YieldExpression) -> int;
```
## YieldExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: YieldExpression) -> string;
```
## YieldExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: YieldExpression) -> Node;
```
## YieldExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: YieldExpression) -> int;
```
## YieldExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: YieldExpression) -> FunctionLikeDeclaration;
```
## YieldExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: YieldExpression) -> File;
```
## YieldExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: YieldExpression, level: int) -> Node;
```
## YieldExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: YieldExpression) -> int;
```
## YieldExpression::getIndex

```rust
pub fn getIndex(self: YieldExpression) -> int;
```
## YieldExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: YieldExpression) -> *Node;
```
## YieldExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *YieldExpression;
```
