# ElementAccessExpression

Primary key: `id: int`

```rust
schema ElementAccessExpression {
  @primary id: int,
}
```
## ElementAccessExpression::getCallee

```java
/**
* Gets the callee (GetAccessorDeclaration or SetAccessorDeclaration) of this access expression.
*/
```
```rust
pub fn getCallee(self: ElementAccessExpression) -> FunctionLikeDeclaration;
```
## ElementAccessExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: ElementAccessExpression) -> *Node;
```
## ElementAccessExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ElementAccessExpression) -> int;
```
## ElementAccessExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: ElementAccessExpression) -> string;
```
## ElementAccessExpression::getExpression

```java
/**
* Gets the expression on which the property is accessed.
*/
```
```rust
pub fn getExpression(self: ElementAccessExpression) -> LeftHandSideExpression;
```
## ElementAccessExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: ElementAccessExpression) -> int;
```
## ElementAccessExpression::getPropertyExpression

```java
/**
* Gets the property expression of this AccessExpression.
*/
```
```rust
pub fn getPropertyExpression(self: ElementAccessExpression) -> Expression;
```
## ElementAccessExpression::getIndex

```rust
pub fn getIndex(self: ElementAccessExpression) -> int;
```
## ElementAccessExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: ElementAccessExpression, level: int) -> Node;
```
## ElementAccessExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: ElementAccessExpression) -> File;
```
## ElementAccessExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ElementAccessExpression) -> int;
```
## ElementAccessExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: ElementAccessExpression) -> FunctionLikeDeclaration;
```
## ElementAccessExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: ElementAccessExpression) -> *Comment;
```
## ElementAccessExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: ElementAccessExpression) -> *Comment;
```
## ElementAccessExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ElementAccessExpression) -> *FunctionLikeDeclaration;
```
## ElementAccessExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: ElementAccessExpression, level: int) -> *Node;
```
## ElementAccessExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: ElementAccessExpression) -> int;
```
## ElementAccessExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ElementAccessExpression) -> int;
```
## ElementAccessExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: ElementAccessExpression) -> *Modifier;
```
## ElementAccessExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ElementAccessExpression) -> int;
```
## ElementAccessExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: ElementAccessExpression, i: int) -> Node;
```
## ElementAccessExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: ElementAccessExpression) -> TopLevelDO;
```
## ElementAccessExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: ElementAccessExpression, i: int) -> Decorator;
```
## ElementAccessExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: ElementAccessExpression) -> Node;
```
## ElementAccessExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: ElementAccessExpression) -> *Node;
```
## ElementAccessExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: ElementAccessExpression) -> Node;
```
## ElementAccessExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: ElementAccessExpression) -> *Node;
```
## ElementAccessExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: ElementAccessExpression) -> *Comment;
```
## ElementAccessExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: ElementAccessExpression) -> Symbol;
```
## ElementAccessExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: ElementAccessExpression) -> *Decorator;
```
## ElementAccessExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: ElementAccessExpression) -> Location;
```
## ElementAccessExpression::isOptionalChaining

```java
/**
* Determines whether this access expression is optional chaining.
*/
```
```rust
pub fn isOptionalChaining(self: ElementAccessExpression) -> bool;
```
## ElementAccessExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *ElementAccessExpression;
```
## ElementAccessExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: ElementAccessExpression) -> string;
```
## ElementAccessExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: ElementAccessExpression, i: int) -> Modifier;
```
## ElementAccessExpression::getPropertyName

```rust
pub fn getPropertyName(self: ElementAccessExpression) -> string;
```
## ElementAccessExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: ElementAccessExpression) -> int;
```
## ElementAccessExpression::getArgumentExpression

```rust
pub fn getArgumentExpression(self: ElementAccessExpression) -> Expression;
```
