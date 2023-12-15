# AsExpression

Inherit from [Expression](./Expression.md)

Primary key: `id: int`

```rust
schema AsExpression extends Expression {
  @primary id: int
}
```
## AsExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: AsExpression) -> Location;
```
## AsExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: AsExpression) -> Symbol;
```
## AsExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: AsExpression) -> *Decorator;
```
## AsExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: AsExpression) -> string;
```
## AsExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: AsExpression, i: int) -> Modifier;
```
## AsExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: AsExpression) -> *Comment;
```
## AsExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: AsExpression) -> *Node;
```
## AsExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: AsExpression) -> *Node;
```
## AsExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: AsExpression) -> Node;
```
## AsExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: AsExpression) -> *Comment;
```
## AsExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: AsExpression) -> *Comment;
```
## AsExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: AsExpression) -> int;
```
## AsExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: AsExpression) -> TopLevelDO;
```
## AsExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: AsExpression, i: int) -> Decorator;
```
## AsExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: AsExpression) -> int;
```
## AsExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: AsExpression) -> *Modifier;
```
## AsExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: AsExpression) -> int;
```
## AsExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: AsExpression, i: int) -> Node;
```
## AsExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: AsExpression) -> int;
```
## AsExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: AsExpression) -> *FunctionLikeDeclaration;
```
## AsExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: AsExpression, level: int) -> *Node;
```
## AsExpression::getExpression

```rust
pub fn getExpression(self: AsExpression) -> Expression;
```
## AsExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: AsExpression) -> int;
```
## AsExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: AsExpression) -> string;
```
## AsExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: AsExpression) -> File;
```
## AsExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: AsExpression, level: int) -> Node;
```
## AsExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: AsExpression) -> FunctionLikeDeclaration;
```
## AsExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: AsExpression) -> Node;
```
## AsExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: AsExpression) -> int;
```
## AsExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: AsExpression) -> int;
```
## AsExpression::getIndex

```rust
pub fn getIndex(self: AsExpression) -> int;
```
## AsExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: AsExpression) -> *Node;
```
## AsExpression::getType

```rust
pub fn getType(self: AsExpression) -> TypeNode;
```
## AsExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *AsExpression;
```
