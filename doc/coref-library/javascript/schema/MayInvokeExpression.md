# MayInvokeExpression

Inherit from [Expression](./Expression.md)

Primary key: `id: int`

```rust
schema MayInvokeExpression extends Expression {
  @primary id: int,
}
```
## MayInvokeExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: MayInvokeExpression) -> Location;
```
## MayInvokeExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: MayInvokeExpression) -> Symbol;
```
## MayInvokeExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: MayInvokeExpression) -> *Decorator;
```
## MayInvokeExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: MayInvokeExpression) -> string;
```
## MayInvokeExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: MayInvokeExpression, i: int) -> Modifier;
```
## MayInvokeExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: MayInvokeExpression) -> *Comment;
```
## MayInvokeExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: MayInvokeExpression) -> *Node;
```
## MayInvokeExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: MayInvokeExpression) -> *Comment;
```
## MayInvokeExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: MayInvokeExpression) -> *Comment;
```
## MayInvokeExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: MayInvokeExpression) -> int;
```
## MayInvokeExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: MayInvokeExpression) -> TopLevelDO;
```
## MayInvokeExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: MayInvokeExpression, i: int) -> Decorator;
```
## MayInvokeExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: MayInvokeExpression) -> int;
```
## MayInvokeExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: MayInvokeExpression) -> *Modifier;
```
## MayInvokeExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: MayInvokeExpression) -> int;
```
## MayInvokeExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: MayInvokeExpression, i: int) -> Node;
```
## MayInvokeExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: MayInvokeExpression) -> int;
```
## MayInvokeExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: MayInvokeExpression) -> *FunctionLikeDeclaration;
```
## MayInvokeExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: MayInvokeExpression, level: int) -> *Node;
```
## MayInvokeExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: MayInvokeExpression) -> int;
```
## MayInvokeExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: MayInvokeExpression) -> string;
```
## MayInvokeExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: MayInvokeExpression, level: int) -> Node;
```
## MayInvokeExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: MayInvokeExpression) -> File;
```
## MayInvokeExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: MayInvokeExpression) -> Node;
```
## MayInvokeExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: MayInvokeExpression) -> FunctionLikeDeclaration;
```
## MayInvokeExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: MayInvokeExpression) -> int;
```
## MayInvokeExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: MayInvokeExpression) -> int;
```
## MayInvokeExpression::getIndex

```rust
pub fn getIndex(self: MayInvokeExpression) -> int;
```
## MayInvokeExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: MayInvokeExpression) -> *Node;
```
## MayInvokeExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: MayInvokeExpression) -> Node;
```
## MayInvokeExpression::hasCallee

```java
/**
* Determine whether this MayInvokeExpression has a callee.
*/
```
```rust
pub fn hasCallee(self: MayInvokeExpression) -> bool;
```
## MayInvokeExpression::getCallee

```java
/**
* Gets the callee of this MayInvokeExpression.
*/
```
```rust
pub fn getCallee(self: MayInvokeExpression) -> FunctionLikeDeclaration;
```
## MayInvokeExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: MayInvokeExpression) -> *Node;
```
## MayInvokeExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *MayInvokeExpression;
```
