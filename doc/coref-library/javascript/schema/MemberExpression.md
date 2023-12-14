# MemberExpression

Primary key: `id: int`

```rust
schema MemberExpression {
  @primary id: int,
}
```
## MemberExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: MemberExpression) -> *Node;
```
## MemberExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: MemberExpression) -> int;
```
## MemberExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: MemberExpression) -> string;
```
## MemberExpression::getExpression

```rust
pub fn getExpression(self: MemberExpression) -> Expression;
```
## MemberExpression::getIndex

```rust
pub fn getIndex(self: MemberExpression) -> int;
```
## MemberExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: MemberExpression) -> int;
```
## MemberExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: MemberExpression, level: int) -> Node;
```
## MemberExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: MemberExpression) -> File;
```
## MemberExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: MemberExpression) -> int;
```
## MemberExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: MemberExpression) -> FunctionLikeDeclaration;
```
## MemberExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: MemberExpression) -> *Comment;
```
## MemberExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: MemberExpression) -> *Comment;
```
## MemberExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: MemberExpression) -> *FunctionLikeDeclaration;
```
## MemberExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: MemberExpression, level: int) -> *Node;
```
## MemberExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: MemberExpression) -> int;
```
## MemberExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: MemberExpression) -> *Modifier;
```
## MemberExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: MemberExpression) -> int;
```
## MemberExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: MemberExpression) -> int;
```
## MemberExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: MemberExpression, i: int) -> Node;
```
## MemberExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: MemberExpression, i: int) -> Decorator;
```
## MemberExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: MemberExpression) -> TopLevelDO;
```
## MemberExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: MemberExpression) -> int;
```
## MemberExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: MemberExpression) -> Node;
```
## MemberExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: MemberExpression) -> Node;
```
## MemberExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: MemberExpression) -> *Node;
```
## MemberExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: MemberExpression) -> *Node;
```
## MemberExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: MemberExpression) -> *Comment;
```
## MemberExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: MemberExpression) -> Symbol;
```
## MemberExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: MemberExpression) -> *Decorator;
```
## MemberExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: MemberExpression) -> Location;
```
## MemberExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *MemberExpression;
```
## MemberExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: MemberExpression, i: int) -> Modifier;
```
## MemberExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: MemberExpression) -> string;
```
