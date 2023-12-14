# NumericLiteral

Primary key: `id: int`

```rust
schema NumericLiteral {
  @primary id: int,
}
```
## NumericLiteral::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: NumericLiteral) -> Node;
```
## NumericLiteral::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: NumericLiteral) -> string;
```
## NumericLiteral::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: NumericLiteral, i: int) -> Modifier;
```
## NumericLiteral::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: NumericLiteral) -> Location;
```
## NumericLiteral::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: NumericLiteral) -> *Decorator;
```
## NumericLiteral::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: NumericLiteral) -> Symbol;
```
## NumericLiteral::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: NumericLiteral) -> *Comment;
```
## NumericLiteral::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: NumericLiteral) -> *Node;
```
## NumericLiteral::getValue

```java
/**
* Gets the value of this literal, as a string.
*/
```
```rust
pub fn getValue(self: NumericLiteral) -> string;
```
## NumericLiteral::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: NumericLiteral) -> *Node;
```
## NumericLiteral::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: NumericLiteral) -> Node;
```
## NumericLiteral::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: NumericLiteral) -> int;
```
## NumericLiteral::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: NumericLiteral) -> TopLevelDO;
```
## NumericLiteral::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: NumericLiteral, i: int) -> Decorator;
```
## NumericLiteral::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: NumericLiteral) -> int;
```
## NumericLiteral::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: NumericLiteral) -> int;
```
## NumericLiteral::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: NumericLiteral) -> *Modifier;
```
## NumericLiteral::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: NumericLiteral, i: int) -> Node;
```
## NumericLiteral::getStartLineNumber

```rust
pub fn getStartLineNumber(self: NumericLiteral) -> int;
```
## NumericLiteral::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: NumericLiteral, level: int) -> *Node;
```
## NumericLiteral::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: NumericLiteral) -> *FunctionLikeDeclaration;
```
## NumericLiteral::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: NumericLiteral) -> *Comment;
```
## NumericLiteral::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: NumericLiteral) -> *Comment;
```
## NumericLiteral::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: NumericLiteral) -> FunctionLikeDeclaration;
```
## NumericLiteral::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: NumericLiteral) -> int;
```
## NumericLiteral::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: NumericLiteral) -> File;
```
## NumericLiteral::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: NumericLiteral, level: int) -> Node;
```
## NumericLiteral::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: NumericLiteral) -> int;
```
## NumericLiteral::getIndex

```rust
pub fn getIndex(self: NumericLiteral) -> int;
```
## NumericLiteral::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *NumericLiteral;
```
## NumericLiteral::getExpression

```rust
pub fn getExpression(self: NumericLiteral) -> Expression;
```
## NumericLiteral::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: NumericLiteral) -> string;
```
## NumericLiteral::getEndLineNumber

```rust
pub fn getEndLineNumber(self: NumericLiteral) -> int;
```
## NumericLiteral::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: NumericLiteral) -> *Node;
```
