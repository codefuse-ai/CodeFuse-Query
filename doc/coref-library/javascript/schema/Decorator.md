# Decorator

Primary key: `id: int`

```rust
schema Decorator {
  @primary id: int,
}
```
## Decorator::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: Decorator) -> *Node;
```
## Decorator::getIndex

```rust
pub fn getIndex(self: Decorator) -> int;
```
## Decorator::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: Decorator) -> int;
```
## Decorator::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: Decorator) -> int;
```
## Decorator::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: Decorator) -> Node;
```
## Decorator::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: Decorator) -> FunctionLikeDeclaration;
```
## Decorator::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: Decorator) -> File;
```
## Decorator::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: Decorator, level: int) -> Node;
```
## Decorator::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: Decorator) -> Location;
```
## Decorator::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: Decorator) -> *FunctionLikeDeclaration;
```
## Decorator::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: Decorator, level: int) -> *Node;
```
## Decorator::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: Decorator) -> int;
```
## Decorator::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: Decorator) -> *Modifier;
```
## Decorator::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: Decorator) -> int;
```
## Decorator::getStartLineNumber

```rust
pub fn getStartLineNumber(self: Decorator) -> int;
```
## Decorator::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: Decorator, i: int) -> Node;
```
## Decorator::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: Decorator) -> int;
```
## Decorator::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: Decorator) -> TopLevelDO;
```
## Decorator::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: Decorator, i: int) -> Decorator;
```
## Decorator::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: Decorator) -> *Comment;
```
## Decorator::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: Decorator) -> *Comment;
```
## Decorator::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: Decorator) -> *Node;
```
## Decorator::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: Decorator) -> Node;
```
## Decorator::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: Decorator, i: int) -> Modifier;
```
## Decorator::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: Decorator) -> string;
```
## Decorator::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: Decorator) -> Symbol;
```
## Decorator::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: Decorator) -> *Decorator;
```
## Decorator::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: Decorator) -> *Node;
```
## Decorator::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: Decorator) -> *Comment;
```
## Decorator::getCallee

```java
/**
* Gets the callee of this decorator.
*/
```
```rust
pub fn getCallee(self: Decorator) -> FunctionLikeDeclaration;
```
## Decorator::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *Decorator;
```
## Decorator::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: Decorator) -> string;
```
## Decorator::getEndLineNumber

```rust
pub fn getEndLineNumber(self: Decorator) -> int;
```
## Decorator::getExpression

```java
/**
* Gets the expression.
*/
```
```rust
pub fn getExpression(self: Decorator) -> LeftHandSideExpression;
```
