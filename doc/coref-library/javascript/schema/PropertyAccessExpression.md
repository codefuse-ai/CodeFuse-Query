# PropertyAccessExpression

Inherit from [AccessExpression](./AccessExpression.md)

Primary key: `id: int`

```rust
schema PropertyAccessExpression extends AccessExpression {
  @primary id: int
}
```
## PropertyAccessExpression::getCallee

```java
/**
* Gets the callee (GetAccessorDeclaration or SetAccessorDeclaration) of this access expression.
*/
```
```rust
pub fn getCallee(self: PropertyAccessExpression) -> FunctionLikeDeclaration;
```
## PropertyAccessExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: PropertyAccessExpression) -> *Node;
```
## PropertyAccessExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: PropertyAccessExpression) -> int;
```
## PropertyAccessExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: PropertyAccessExpression) -> string;
```
## PropertyAccessExpression::getExpression

```java
/**
* Gets the expression on which the property is accessed.
*/
```
```rust
pub fn getExpression(self: PropertyAccessExpression) -> LeftHandSideExpression;
```
## PropertyAccessExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: PropertyAccessExpression) -> int;
```
## PropertyAccessExpression::getPropertyExpression

```java
/**
* Gets the property expression of this AccessExpression.
*/
```
```rust
pub fn getPropertyExpression(self: PropertyAccessExpression) -> Expression;
```
## PropertyAccessExpression::getIndex

```rust
pub fn getIndex(self: PropertyAccessExpression) -> int;
```
## PropertyAccessExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: PropertyAccessExpression, level: int) -> Node;
```
## PropertyAccessExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: PropertyAccessExpression) -> File;
```
## PropertyAccessExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: PropertyAccessExpression) -> int;
```
## PropertyAccessExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: PropertyAccessExpression) -> FunctionLikeDeclaration;
```
## PropertyAccessExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: PropertyAccessExpression) -> *Comment;
```
## PropertyAccessExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: PropertyAccessExpression) -> *Comment;
```
## PropertyAccessExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: PropertyAccessExpression) -> *FunctionLikeDeclaration;
```
## PropertyAccessExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: PropertyAccessExpression, level: int) -> *Node;
```
## PropertyAccessExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: PropertyAccessExpression) -> int;
```
## PropertyAccessExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: PropertyAccessExpression) -> int;
```
## PropertyAccessExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: PropertyAccessExpression) -> *Modifier;
```
## PropertyAccessExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: PropertyAccessExpression) -> int;
```
## PropertyAccessExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: PropertyAccessExpression, i: int) -> Node;
```
## PropertyAccessExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: PropertyAccessExpression) -> TopLevelDO;
```
## PropertyAccessExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: PropertyAccessExpression, i: int) -> Decorator;
```
## PropertyAccessExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: PropertyAccessExpression) -> Node;
```
## PropertyAccessExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: PropertyAccessExpression) -> *Node;
```
## PropertyAccessExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: PropertyAccessExpression) -> Node;
```
## PropertyAccessExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: PropertyAccessExpression) -> *Comment;
```
## PropertyAccessExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: PropertyAccessExpression) -> *Node;
```
## PropertyAccessExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: PropertyAccessExpression) -> Symbol;
```
## PropertyAccessExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: PropertyAccessExpression) -> *Decorator;
```
## PropertyAccessExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: PropertyAccessExpression) -> Location;
```
## PropertyAccessExpression::isOptionalChaining

```java
/**
* Determines whether this access expression is optional chaining.
*/
```
```rust
pub fn isOptionalChaining(self: PropertyAccessExpression) -> bool;
```
## PropertyAccessExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *PropertyAccessExpression;
```
## PropertyAccessExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: PropertyAccessExpression) -> string;
```
## PropertyAccessExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: PropertyAccessExpression, i: int) -> Modifier;
```
## PropertyAccessExpression::getPropertyName

```rust
pub fn getPropertyName(self: PropertyAccessExpression) -> string;
```
## PropertyAccessExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: PropertyAccessExpression) -> int;
```
## PropertyAccessExpression::getProperty

```rust
pub fn getProperty(self: PropertyAccessExpression) -> MemberName;
```
