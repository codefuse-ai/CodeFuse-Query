# AppRegistrationExpression

Primary key: `id: int`

```rust
schema AppRegistrationExpression {
  @primary id: int,
}
```
## AppRegistrationExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: AppRegistrationExpression) -> Node;
```
## AppRegistrationExpression::getExpression

```rust
pub fn getExpression(self: AppRegistrationExpression) -> LeftHandSideExpression;
```
## AppRegistrationExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: AppRegistrationExpression) -> string;
```
## AppRegistrationExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: AppRegistrationExpression) -> int;
```
## AppRegistrationExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: AppRegistrationExpression) -> Location;
```
## AppRegistrationExpression::getQuestionDotToken

```java
/**
* Gets the `?.` token of this call expression.
*/
```
```rust
pub fn getQuestionDotToken(self: AppRegistrationExpression) -> QuestionDotToken;
```
## AppRegistrationExpression::getATypeArgument

```java
/**
* Gets a type argument of this call expression.
*/
```
```rust
pub fn getATypeArgument(self: AppRegistrationExpression) -> *TypeNode;
```
## AppRegistrationExpression::getTypeArgumentCount

```java
/**
* Gets the count of the type arguments.
*/
```
```rust
pub fn getTypeArgumentCount(self: AppRegistrationExpression) -> int;
```
## AppRegistrationExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: AppRegistrationExpression, level: int) -> *Node;
```
## AppRegistrationExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: AppRegistrationExpression) -> *FunctionLikeDeclaration;
```
## AppRegistrationExpression::getArgument

```java
/**
* Gets the `i`th argument of this call expression.
* index from 0
*/
```
```rust
pub fn getArgument(self: AppRegistrationExpression, i: int) -> Expression;
```
## AppRegistrationExpression::getAnArgument

```java
/**
* Gets an argument of this call expression.
*/
```
```rust
pub fn getAnArgument(self: AppRegistrationExpression) -> *Expression;
```
## AppRegistrationExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: AppRegistrationExpression, i: int) -> Node;
```
## AppRegistrationExpression::getCallee

```java
/**
* Gets the callee of this call expression.
*/
```
```rust
pub fn getCallee(self: AppRegistrationExpression) -> FunctionLikeDeclaration;
```
## AppRegistrationExpression::getArgumentCount

```java
/**
* Gets the count of the arguments.
*/
```
```rust
pub fn getArgumentCount(self: AppRegistrationExpression) -> int;
```
## AppRegistrationExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: AppRegistrationExpression) -> string;
```
## AppRegistrationExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: AppRegistrationExpression, i: int) -> Modifier;
```
## AppRegistrationExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: AppRegistrationExpression) -> *Decorator;
```
## AppRegistrationExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: AppRegistrationExpression) -> Symbol;
```
## AppRegistrationExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: AppRegistrationExpression) -> *Node;
```
## AppRegistrationExpression::getTypeArgument

```java
/**
* Gets the `i`th type argument of this call expression.
*/
```
```rust
pub fn getTypeArgument(self: AppRegistrationExpression, i: int) -> TypeNode;
```
## AppRegistrationExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: AppRegistrationExpression) -> *Comment;
```
## AppRegistrationExpression::hasCallee

```java
/**
* Determine whether this CallExpression has a callee.
*/
```
```rust
pub fn hasCallee(self: AppRegistrationExpression) -> bool;
```
## AppRegistrationExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: AppRegistrationExpression) -> Node;
```
## AppRegistrationExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: AppRegistrationExpression) -> *Node;
```
## AppRegistrationExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: AppRegistrationExpression) -> int;
```
## AppRegistrationExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: AppRegistrationExpression) -> TopLevelDO;
```
## AppRegistrationExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: AppRegistrationExpression, i: int) -> Decorator;
```
## AppRegistrationExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: AppRegistrationExpression) -> *Modifier;
```
## AppRegistrationExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: AppRegistrationExpression) -> int;
```
## AppRegistrationExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: AppRegistrationExpression) -> int;
```
## AppRegistrationExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: AppRegistrationExpression) -> int;
```
## AppRegistrationExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: AppRegistrationExpression) -> FunctionLikeDeclaration;
```
## AppRegistrationExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: AppRegistrationExpression) -> *Comment;
```
## AppRegistrationExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: AppRegistrationExpression) -> *Comment;
```
## AppRegistrationExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: AppRegistrationExpression) -> int;
```
## AppRegistrationExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: AppRegistrationExpression, level: int) -> Node;
```
## AppRegistrationExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: AppRegistrationExpression) -> File;
```
## AppRegistrationExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: AppRegistrationExpression) -> int;
```
## AppRegistrationExpression::getIndex

```rust
pub fn getIndex(self: AppRegistrationExpression) -> int;
```
## AppRegistrationExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: AppRegistrationExpression) -> *Node;
```
## AppRegistrationExpression::isOptionalChaining

```java
/**
* Determines whether this call expression is optional chaining, which means it has a `?.` token.
*/
```
```rust
pub fn isOptionalChaining(self: AppRegistrationExpression) -> bool;
```
## AppRegistrationExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *AppRegistrationExpression;
```
