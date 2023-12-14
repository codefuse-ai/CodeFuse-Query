# StringLiteral

Primary key: `id: int`

```rust
schema StringLiteral {
  @primary id: int,
}
```
## StringLiteral::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: StringLiteral) -> Node;
```
## StringLiteral::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: StringLiteral) -> Location;
```
## StringLiteral::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: StringLiteral) -> *Decorator;
```
## StringLiteral::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: StringLiteral) -> Symbol;
```
## StringLiteral::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: StringLiteral) -> *Comment;
```
## StringLiteral::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: StringLiteral) -> *Node;
```
## StringLiteral::getValue

```java
/**
* Gets the value of this literal, as a string.
*/
```
```rust
pub fn getValue(self: StringLiteral) -> string;
```
## StringLiteral::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: StringLiteral) -> *Node;
```
## StringLiteral::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: StringLiteral) -> Node;
```
## StringLiteral::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: StringLiteral) -> int;
```
## StringLiteral::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: StringLiteral) -> TopLevelDO;
```
## StringLiteral::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: StringLiteral, i: int) -> Decorator;
```
## StringLiteral::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: StringLiteral) -> int;
```
## StringLiteral::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: StringLiteral) -> int;
```
## StringLiteral::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: StringLiteral) -> *Modifier;
```
## StringLiteral::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: StringLiteral, i: int) -> Node;
```
## StringLiteral::getStartLineNumber

```rust
pub fn getStartLineNumber(self: StringLiteral) -> int;
```
## StringLiteral::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: StringLiteral, level: int) -> *Node;
```
## StringLiteral::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: StringLiteral) -> *FunctionLikeDeclaration;
```
## StringLiteral::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: StringLiteral) -> *Comment;
```
## StringLiteral::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: StringLiteral) -> *Comment;
```
## StringLiteral::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: StringLiteral) -> FunctionLikeDeclaration;
```
## StringLiteral::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: StringLiteral) -> int;
```
## StringLiteral::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: StringLiteral) -> File;
```
## StringLiteral::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: StringLiteral, level: int) -> Node;
```
## StringLiteral::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: StringLiteral) -> int;
```
## StringLiteral::getIndex

```rust
pub fn getIndex(self: StringLiteral) -> int;
```
## StringLiteral::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *StringLiteral;
```
## StringLiteral::getEndLineNumber

```rust
pub fn getEndLineNumber(self: StringLiteral) -> int;
```
## StringLiteral::getExpression

```rust
pub fn getExpression(self: StringLiteral) -> Expression;
```
## StringLiteral::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: StringLiteral) -> string;
```
## StringLiteral::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: StringLiteral) -> *Node;
```
## StringLiteral::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: StringLiteral) -> string;
```
## StringLiteral::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: StringLiteral, i: int) -> Modifier;
```
## StringLiteral::getString

```rust
pub fn getString(self: StringLiteral) -> string;
```
