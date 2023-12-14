# MiniCallExpression

Inherit from [CallExpression](./CallExpression.md)

Primary key: `id: int`

```rust
schema MiniCallExpression extends CallExpression {
  @primary id: int,
}
```
## MiniCallExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: MiniCallExpression) -> Node;
```
## MiniCallExpression::getExpression

```rust
pub fn getExpression(self: MiniCallExpression) -> LeftHandSideExpression;
```
## MiniCallExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: MiniCallExpression) -> string;
```
## MiniCallExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: MiniCallExpression) -> int;
```
## MiniCallExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: MiniCallExpression) -> Location;
```
## MiniCallExpression::getQuestionDotToken

```java
/**
* Gets the `?.` token of this call expression.
*/
```
```rust
pub fn getQuestionDotToken(self: MiniCallExpression) -> QuestionDotToken;
```
## MiniCallExpression::getATypeArgument

```java
/**
* Gets a type argument of this call expression.
*/
```
```rust
pub fn getATypeArgument(self: MiniCallExpression) -> *TypeNode;
```
## MiniCallExpression::getTypeArgumentCount

```java
/**
* Gets the count of the type arguments.
*/
```
```rust
pub fn getTypeArgumentCount(self: MiniCallExpression) -> int;
```
## MiniCallExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: MiniCallExpression, level: int) -> *Node;
```
## MiniCallExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: MiniCallExpression) -> *FunctionLikeDeclaration;
```
## MiniCallExpression::getArgument

```java
/**
* Gets the `i`th argument of this call expression.
* index from 0
*/
```
```rust
pub fn getArgument(self: MiniCallExpression, i: int) -> Expression;
```
## MiniCallExpression::getAnArgument

```java
/**
* Gets an argument of this call expression.
*/
```
```rust
pub fn getAnArgument(self: MiniCallExpression) -> *Expression;
```
## MiniCallExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: MiniCallExpression, i: int) -> Node;
```
## MiniCallExpression::getArgumentCount

```java
/**
* Gets the count of the arguments.
*/
```
```rust
pub fn getArgumentCount(self: MiniCallExpression) -> int;
```
## MiniCallExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: MiniCallExpression) -> string;
```
## MiniCallExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: MiniCallExpression, i: int) -> Modifier;
```
## MiniCallExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: MiniCallExpression) -> *Decorator;
```
## MiniCallExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: MiniCallExpression) -> Symbol;
```
## MiniCallExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: MiniCallExpression) -> *Comment;
```
## MiniCallExpression::getTypeArgument

```java
/**
* Gets the `i`th type argument of this call expression.
*/
```
```rust
pub fn getTypeArgument(self: MiniCallExpression, i: int) -> TypeNode;
```
## MiniCallExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: MiniCallExpression) -> *Node;
```
## MiniCallExpression::hasCallee

```java
/**
* Determine whether this CallExpression has a callee.
*/
```
```rust
pub fn hasCallee(self: MiniCallExpression) -> bool;
```
## MiniCallExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: MiniCallExpression) -> Node;
```
## MiniCallExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: MiniCallExpression) -> *Node;
```
## MiniCallExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: MiniCallExpression) -> int;
```
## MiniCallExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: MiniCallExpression) -> TopLevelDO;
```
## MiniCallExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: MiniCallExpression, i: int) -> Decorator;
```
## MiniCallExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: MiniCallExpression) -> int;
```
## MiniCallExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: MiniCallExpression) -> int;
```
## MiniCallExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: MiniCallExpression) -> *Modifier;
```
## MiniCallExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: MiniCallExpression) -> int;
```
## MiniCallExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: MiniCallExpression) -> int;
```
## MiniCallExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: MiniCallExpression) -> *Comment;
```
## MiniCallExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: MiniCallExpression) -> *Comment;
```
## MiniCallExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: MiniCallExpression) -> FunctionLikeDeclaration;
```
## MiniCallExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: MiniCallExpression, level: int) -> Node;
```
## MiniCallExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: MiniCallExpression) -> File;
```
## MiniCallExpression::getIndex

```rust
pub fn getIndex(self: MiniCallExpression) -> int;
```
## MiniCallExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: MiniCallExpression) -> int;
```
## MiniCallExpression::getCallee

```java
/**
* Gets the callee of this MiniCallExpression.
*
* In addition to the results of CallExpression.getCallee(),
* this method add some callees according to Alipay mini program framework.
*/
```
```rust
pub fn getCallee(self: MiniCallExpression) -> FunctionLikeDeclaration;
```
## MiniCallExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: MiniCallExpression) -> *Node;
```
## MiniCallExpression::isOptionalChaining

```java
/**
* Determines whether this call expression is optional chaining, which means it has a `?.` token.
*/
```
```rust
pub fn isOptionalChaining(self: MiniCallExpression) -> bool;
```
## MiniCallExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *MiniCallExpression;
```
