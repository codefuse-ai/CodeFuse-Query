# DeleteExpression

Inherit from [UnaryExpression](./UnaryExpression.md)

Primary key: `id: int`

```rust
schema DeleteExpression extends UnaryExpression {
  @primary id: int,
}
```
## DeleteExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: DeleteExpression) -> *Node;
```
## DeleteExpression::getIndex

```rust
pub fn getIndex(self: DeleteExpression) -> int;
```
## DeleteExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: DeleteExpression) -> int;
```
## DeleteExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: DeleteExpression, level: int) -> Node;
```
## DeleteExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: DeleteExpression) -> File;
```
## DeleteExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: DeleteExpression) -> FunctionLikeDeclaration;
```
## DeleteExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: DeleteExpression) -> int;
```
## DeleteExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: DeleteExpression) -> Node;
```
## DeleteExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: DeleteExpression) -> *Comment;
```
## DeleteExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: DeleteExpression) -> *Comment;
```
## DeleteExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: DeleteExpression) -> *FunctionLikeDeclaration;
```
## DeleteExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: DeleteExpression, level: int) -> *Node;
```
## DeleteExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: DeleteExpression) -> int;
```
## DeleteExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: DeleteExpression) -> *Modifier;
```
## DeleteExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: DeleteExpression) -> int;
```
## DeleteExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: DeleteExpression) -> int;
```
## DeleteExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: DeleteExpression, i: int) -> Node;
```
## DeleteExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: DeleteExpression, i: int) -> Decorator;
```
## DeleteExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: DeleteExpression) -> TopLevelDO;
```
## DeleteExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: DeleteExpression) -> int;
```
## DeleteExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: DeleteExpression) -> Node;
```
## DeleteExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: DeleteExpression) -> *Node;
```
## DeleteExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: DeleteExpression) -> *Node;
```
## DeleteExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: DeleteExpression) -> *Comment;
```
## DeleteExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: DeleteExpression) -> Symbol;
```
## DeleteExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: DeleteExpression) -> *Decorator;
```
## DeleteExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: DeleteExpression, i: int) -> Modifier;
```
## DeleteExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: DeleteExpression) -> string;
```
## DeleteExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *DeleteExpression;
```
## DeleteExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: DeleteExpression) -> int;
```
## DeleteExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: DeleteExpression) -> string;
```
## DeleteExpression::getExpression

```rust
pub fn getExpression(self: DeleteExpression) -> UnaryExpression;
```
## DeleteExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: DeleteExpression) -> Location;
```
