# NonNullExpression

Primary key: `id: int`

```rust
schema NonNullExpression {
  @primary id: int,
}
```
## NonNullExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: NonNullExpression) -> *Node;
```
## NonNullExpression::getIndex

```rust
pub fn getIndex(self: NonNullExpression) -> int;
```
## NonNullExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: NonNullExpression) -> int;
```
## NonNullExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: NonNullExpression, level: int) -> Node;
```
## NonNullExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: NonNullExpression) -> File;
```
## NonNullExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: NonNullExpression) -> int;
```
## NonNullExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: NonNullExpression) -> FunctionLikeDeclaration;
```
## NonNullExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: NonNullExpression) -> *Comment;
```
## NonNullExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: NonNullExpression) -> *Comment;
```
## NonNullExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: NonNullExpression) -> *FunctionLikeDeclaration;
```
## NonNullExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: NonNullExpression, level: int) -> *Node;
```
## NonNullExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: NonNullExpression) -> int;
```
## NonNullExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: NonNullExpression) -> *Modifier;
```
## NonNullExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: NonNullExpression) -> int;
```
## NonNullExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: NonNullExpression) -> int;
```
## NonNullExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: NonNullExpression, i: int) -> Node;
```
## NonNullExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: NonNullExpression, i: int) -> Decorator;
```
## NonNullExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: NonNullExpression) -> TopLevelDO;
```
## NonNullExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: NonNullExpression) -> int;
```
## NonNullExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: NonNullExpression) -> Node;
```
## NonNullExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: NonNullExpression) -> *Node;
```
## NonNullExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: NonNullExpression) -> *Node;
```
## NonNullExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: NonNullExpression) -> *Comment;
```
## NonNullExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: NonNullExpression) -> Symbol;
```
## NonNullExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: NonNullExpression) -> *Decorator;
```
## NonNullExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: NonNullExpression) -> int;
```
## NonNullExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: NonNullExpression) -> string;
```
## NonNullExpression::getExpression

```rust
pub fn getExpression(self: NonNullExpression) -> Expression;
```
## NonNullExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: NonNullExpression) -> Location;
```
## NonNullExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *NonNullExpression;
```
## NonNullExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: NonNullExpression, i: int) -> Modifier;
```
## NonNullExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: NonNullExpression) -> string;
```
## NonNullExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: NonNullExpression) -> Node;
```
