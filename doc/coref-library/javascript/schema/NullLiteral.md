# NullLiteral

Primary key: `id: int`

```rust
schema NullLiteral {
  @primary id: int,
}
```
## NullLiteral::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: NullLiteral) -> *Node;
```
## NullLiteral::getEndLineNumber

```rust
pub fn getEndLineNumber(self: NullLiteral) -> int;
```
## NullLiteral::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: NullLiteral) -> string;
```
## NullLiteral::getExpression

```rust
pub fn getExpression(self: NullLiteral) -> Expression;
```
## NullLiteral::getIndex

```rust
pub fn getIndex(self: NullLiteral) -> int;
```
## NullLiteral::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: NullLiteral) -> int;
```
## NullLiteral::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: NullLiteral, level: int) -> Node;
```
## NullLiteral::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: NullLiteral) -> File;
```
## NullLiteral::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: NullLiteral) -> int;
```
## NullLiteral::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: NullLiteral) -> FunctionLikeDeclaration;
```
## NullLiteral::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: NullLiteral) -> *Comment;
```
## NullLiteral::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: NullLiteral) -> *Comment;
```
## NullLiteral::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: NullLiteral) -> *FunctionLikeDeclaration;
```
## NullLiteral::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: NullLiteral, level: int) -> *Node;
```
## NullLiteral::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: NullLiteral) -> int;
```
## NullLiteral::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: NullLiteral) -> *Modifier;
```
## NullLiteral::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: NullLiteral) -> int;
```
## NullLiteral::getStartLineNumber

```rust
pub fn getStartLineNumber(self: NullLiteral) -> int;
```
## NullLiteral::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: NullLiteral, i: int) -> Node;
```
## NullLiteral::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: NullLiteral, i: int) -> Decorator;
```
## NullLiteral::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: NullLiteral) -> TopLevelDO;
```
## NullLiteral::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: NullLiteral) -> int;
```
## NullLiteral::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: NullLiteral) -> Node;
```
## NullLiteral::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: NullLiteral) -> Node;
```
## NullLiteral::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: NullLiteral) -> *Node;
```
## NullLiteral::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: NullLiteral) -> *Node;
```
## NullLiteral::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: NullLiteral) -> *Comment;
```
## NullLiteral::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *NullLiteral;
```
## NullLiteral::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: NullLiteral) -> Location;
```
## NullLiteral::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: NullLiteral) -> Symbol;
```
## NullLiteral::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: NullLiteral) -> *Decorator;
```
## NullLiteral::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: NullLiteral, i: int) -> Modifier;
```
## NullLiteral::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: NullLiteral) -> string;
```
