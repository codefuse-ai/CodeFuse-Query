# AccessExpression

Inherit from [MemberExpression](./MemberExpression.md)

Primary key: `id: int`

```rust
schema AccessExpression extends MemberExpression {
  @primary id: int
}
```
## AccessExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: AccessExpression) -> string;
```
## AccessExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: AccessExpression, i: int) -> Modifier;
```
## AccessExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: AccessExpression) -> Location;
```
## AccessExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: AccessExpression) -> *Decorator;
```
## AccessExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: AccessExpression) -> Symbol;
```
## AccessExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: AccessExpression) -> *Comment;
```
## AccessExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: AccessExpression) -> *Node;
```
## AccessExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: AccessExpression) -> *Node;
```
## AccessExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: AccessExpression) -> Node;
```
## AccessExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: AccessExpression) -> Node;
```
## AccessExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: AccessExpression) -> int;
```
## AccessExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: AccessExpression) -> TopLevelDO;
```
## AccessExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: AccessExpression, i: int) -> Decorator;
```
## AccessExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: AccessExpression, i: int) -> Node;
```
## AccessExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: AccessExpression) -> int;
```
## AccessExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: AccessExpression) -> int;
```
## AccessExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: AccessExpression) -> int;
```
## AccessExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: AccessExpression) -> *Modifier;
```
## AccessExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: AccessExpression, level: int) -> *Node;
```
## AccessExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: AccessExpression) -> *FunctionLikeDeclaration;
```
## AccessExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: AccessExpression) -> *Comment;
```
## AccessExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: AccessExpression) -> *Comment;
```
## AccessExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: AccessExpression) -> FunctionLikeDeclaration;
```
## AccessExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: AccessExpression) -> int;
```
## AccessExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: AccessExpression) -> File;
```
## AccessExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: AccessExpression, level: int) -> Node;
```
## AccessExpression::getIndex

```rust
pub fn getIndex(self: AccessExpression) -> int;
```
## AccessExpression::getPropertyExpression

```java
/**
* Gets the property expression of this AccessExpression.
*/
```
```rust
pub fn getPropertyExpression(self: AccessExpression) -> Expression;
```
## AccessExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: AccessExpression) -> int;
```
## AccessExpression::getExpression

```java
/**
* Gets the expression on which the property is accessed.
*/
```
```rust
pub fn getExpression(self: AccessExpression) -> LeftHandSideExpression;
```
## AccessExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: AccessExpression) -> string;
```
## AccessExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: AccessExpression) -> int;
```
## AccessExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: AccessExpression) -> *Node;
```
## AccessExpression::getCallee

```java
/**
* Gets the callee (GetAccessorDeclaration or SetAccessorDeclaration) of this access expression.
*/
```
```rust
pub fn getCallee(self: AccessExpression) -> FunctionLikeDeclaration;
```
## AccessExpression::getPropertyName

```rust
pub fn getPropertyName(self: AccessExpression) -> string;
```
## AccessExpression::isOptionalChaining

```java
/**
* Determines whether this access expression is optional chaining.
*/
```
```rust
pub fn isOptionalChaining(self: AccessExpression) -> bool;
```
## AccessExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *AccessExpression;
```
