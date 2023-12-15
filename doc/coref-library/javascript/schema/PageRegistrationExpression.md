# PageRegistrationExpression

Inherit from [CallExpression](./CallExpression.md)

Primary key: `id: int`

```rust
schema PageRegistrationExpression extends CallExpression {
  @primary id: int
}
```
## PageRegistrationExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: PageRegistrationExpression) -> Node;
```
## PageRegistrationExpression::getExpression

```rust
pub fn getExpression(self: PageRegistrationExpression) -> LeftHandSideExpression;
```
## PageRegistrationExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: PageRegistrationExpression) -> string;
```
## PageRegistrationExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: PageRegistrationExpression) -> int;
```
## PageRegistrationExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: PageRegistrationExpression) -> Location;
```
## PageRegistrationExpression::getQuestionDotToken

```java
/**
* Gets the `?.` token of this call expression.
*/
```
```rust
pub fn getQuestionDotToken(self: PageRegistrationExpression) -> QuestionDotToken;
```
## PageRegistrationExpression::getATypeArgument

```java
/**
* Gets a type argument of this call expression.
*/
```
```rust
pub fn getATypeArgument(self: PageRegistrationExpression) -> *TypeNode;
```
## PageRegistrationExpression::getTypeArgumentCount

```java
/**
* Gets the count of the type arguments.
*/
```
```rust
pub fn getTypeArgumentCount(self: PageRegistrationExpression) -> int;
```
## PageRegistrationExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: PageRegistrationExpression, level: int) -> *Node;
```
## PageRegistrationExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: PageRegistrationExpression) -> *FunctionLikeDeclaration;
```
## PageRegistrationExpression::getArgument

```java
/**
* Gets the `i`th argument of this call expression.
* index from 0
*/
```
```rust
pub fn getArgument(self: PageRegistrationExpression, i: int) -> Expression;
```
## PageRegistrationExpression::getAnArgument

```java
/**
* Gets an argument of this call expression.
*/
```
```rust
pub fn getAnArgument(self: PageRegistrationExpression) -> *Expression;
```
## PageRegistrationExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: PageRegistrationExpression, i: int) -> Node;
```
## PageRegistrationExpression::getCallee

```java
/**
* Gets the callee of this call expression.
*/
```
```rust
pub fn getCallee(self: PageRegistrationExpression) -> FunctionLikeDeclaration;
```
## PageRegistrationExpression::getArgumentCount

```java
/**
* Gets the count of the arguments.
*/
```
```rust
pub fn getArgumentCount(self: PageRegistrationExpression) -> int;
```
## PageRegistrationExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: PageRegistrationExpression) -> string;
```
## PageRegistrationExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: PageRegistrationExpression, i: int) -> Modifier;
```
## PageRegistrationExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: PageRegistrationExpression) -> *Decorator;
```
## PageRegistrationExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: PageRegistrationExpression) -> Symbol;
```
## PageRegistrationExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: PageRegistrationExpression) -> *Node;
```
## PageRegistrationExpression::getTypeArgument

```java
/**
* Gets the `i`th type argument of this call expression.
*/
```
```rust
pub fn getTypeArgument(self: PageRegistrationExpression, i: int) -> TypeNode;
```
## PageRegistrationExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: PageRegistrationExpression) -> *Comment;
```
## PageRegistrationExpression::hasCallee

```java
/**
* Determine whether this CallExpression has a callee.
*/
```
```rust
pub fn hasCallee(self: PageRegistrationExpression) -> bool;
```
## PageRegistrationExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: PageRegistrationExpression) -> Node;
```
## PageRegistrationExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: PageRegistrationExpression) -> *Node;
```
## PageRegistrationExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: PageRegistrationExpression) -> int;
```
## PageRegistrationExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: PageRegistrationExpression) -> TopLevelDO;
```
## PageRegistrationExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: PageRegistrationExpression, i: int) -> Decorator;
```
## PageRegistrationExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: PageRegistrationExpression) -> *Modifier;
```
## PageRegistrationExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: PageRegistrationExpression) -> int;
```
## PageRegistrationExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: PageRegistrationExpression) -> int;
```
## PageRegistrationExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: PageRegistrationExpression) -> int;
```
## PageRegistrationExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: PageRegistrationExpression) -> FunctionLikeDeclaration;
```
## PageRegistrationExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: PageRegistrationExpression) -> *Comment;
```
## PageRegistrationExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: PageRegistrationExpression) -> *Comment;
```
## PageRegistrationExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: PageRegistrationExpression) -> int;
```
## PageRegistrationExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: PageRegistrationExpression, level: int) -> Node;
```
## PageRegistrationExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: PageRegistrationExpression) -> File;
```
## PageRegistrationExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: PageRegistrationExpression) -> int;
```
## PageRegistrationExpression::getIndex

```rust
pub fn getIndex(self: PageRegistrationExpression) -> int;
```
## PageRegistrationExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: PageRegistrationExpression) -> *Node;
```
## PageRegistrationExpression::isOptionalChaining

```java
/**
* Determines whether this call expression is optional chaining, which means it has a `?.` token.
*/
```
```rust
pub fn isOptionalChaining(self: PageRegistrationExpression) -> bool;
```
## PageRegistrationExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *PageRegistrationExpression;
```
