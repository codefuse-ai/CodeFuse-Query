# SuperExpression

Primary key: `id: int`

```rust
schema SuperExpression {
  @primary id: int,
}
```
## SuperExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: SuperExpression) -> *Node;
```
## SuperExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: SuperExpression) -> int;
```
## SuperExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: SuperExpression) -> string;
```
## SuperExpression::getExpression

```rust
pub fn getExpression(self: SuperExpression) -> Expression;
```
## SuperExpression::getIndex

```rust
pub fn getIndex(self: SuperExpression) -> int;
```
## SuperExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: SuperExpression) -> int;
```
## SuperExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: SuperExpression, level: int) -> Node;
```
## SuperExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: SuperExpression) -> File;
```
## SuperExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: SuperExpression) -> int;
```
## SuperExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: SuperExpression) -> FunctionLikeDeclaration;
```
## SuperExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: SuperExpression) -> *Comment;
```
## SuperExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: SuperExpression) -> *Comment;
```
## SuperExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: SuperExpression) -> *FunctionLikeDeclaration;
```
## SuperExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: SuperExpression, level: int) -> *Node;
```
## SuperExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: SuperExpression) -> int;
```
## SuperExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: SuperExpression) -> *Modifier;
```
## SuperExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: SuperExpression) -> int;
```
## SuperExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: SuperExpression) -> int;
```
## SuperExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: SuperExpression, i: int) -> Node;
```
## SuperExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: SuperExpression, i: int) -> Decorator;
```
## SuperExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: SuperExpression) -> TopLevelDO;
```
## SuperExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: SuperExpression) -> int;
```
## SuperExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: SuperExpression) -> Node;
```
## SuperExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: SuperExpression) -> Node;
```
## SuperExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: SuperExpression) -> *Node;
```
## SuperExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: SuperExpression) -> *Node;
```
## SuperExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: SuperExpression) -> *Comment;
```
## SuperExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *SuperExpression;
```
## SuperExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: SuperExpression) -> Location;
```
## SuperExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: SuperExpression) -> Symbol;
```
## SuperExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: SuperExpression) -> *Decorator;
```
## SuperExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: SuperExpression, i: int) -> Modifier;
```
## SuperExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: SuperExpression) -> string;
```
