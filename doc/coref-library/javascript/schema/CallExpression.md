# CallExpression

Primary key: `id: int`

```rust
schema CallExpression {
  @primary id: int,
}
```
## CallExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: CallExpression) -> *Node;
```
## CallExpression::getIndex

```rust
pub fn getIndex(self: CallExpression) -> int;
```
## CallExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: CallExpression) -> int;
```
## CallExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: CallExpression, level: int) -> Node;
```
## CallExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: CallExpression) -> File;
```
## CallExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: CallExpression) -> int;
```
## CallExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: CallExpression) -> FunctionLikeDeclaration;
```
## CallExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: CallExpression) -> *Comment;
```
## CallExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: CallExpression) -> *Comment;
```
## CallExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: CallExpression) -> int;
```
## CallExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: CallExpression) -> int;
```
## CallExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: CallExpression) -> *Modifier;
```
## CallExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: CallExpression) -> int;
```
## CallExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: CallExpression, i: int) -> Decorator;
```
## CallExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: CallExpression) -> TopLevelDO;
```
## CallExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: CallExpression) -> int;
```
## CallExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: CallExpression) -> Node;
```
## CallExpression::hasCallee

```java
/**
* Determine whether this CallExpression has a callee.
*/
```
```rust
pub fn hasCallee(self: CallExpression) -> bool;
```
## CallExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: CallExpression) -> *Node;
```
## CallExpression::getTypeArgument

```java
/**
* Gets the `i`th type argument of this call expression.
*/
```
```rust
pub fn getTypeArgument(self: CallExpression, i: int) -> TypeNode;
```
## CallExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: CallExpression) -> *Node;
```
## CallExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: CallExpression) -> *Comment;
```
## CallExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: CallExpression) -> Symbol;
```
## CallExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: CallExpression) -> *Decorator;
```
## CallExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: CallExpression, i: int) -> Modifier;
```
## CallExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: CallExpression) -> string;
```
## CallExpression::getArgumentCount

```java
/**
* Gets the count of the arguments.
*/
```
```rust
pub fn getArgumentCount(self: CallExpression) -> int;
```
## CallExpression::getCallee

```java
/**
* Gets the callee of this call expression.
*/
```
```rust
pub fn getCallee(self: CallExpression) -> FunctionLikeDeclaration;
```
## CallExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: CallExpression, i: int) -> Node;
```
## CallExpression::getAnArgument

```java
/**
* Gets an argument of this call expression.
*/
```
```rust
pub fn getAnArgument(self: CallExpression) -> *Expression;
```
## CallExpression::getArgument

```java
/**
* Gets the `i`th argument of this call expression.
* index from 0
*/
```
```rust
pub fn getArgument(self: CallExpression, i: int) -> Expression;
```
## CallExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: CallExpression) -> *FunctionLikeDeclaration;
```
## CallExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: CallExpression, level: int) -> *Node;
```
## CallExpression::getTypeArgumentCount

```java
/**
* Gets the count of the type arguments.
*/
```
```rust
pub fn getTypeArgumentCount(self: CallExpression) -> int;
```
## CallExpression::getATypeArgument

```java
/**
* Gets a type argument of this call expression.
*/
```
```rust
pub fn getATypeArgument(self: CallExpression) -> *TypeNode;
```
## CallExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *CallExpression;
```
## CallExpression::isOptionalChaining

```java
/**
* Determines whether this call expression is optional chaining, which means it has a `?.` token.
*/
```
```rust
pub fn isOptionalChaining(self: CallExpression) -> bool;
```
## CallExpression::getQuestionDotToken

```java
/**
* Gets the `?.` token of this call expression.
*/
```
```rust
pub fn getQuestionDotToken(self: CallExpression) -> QuestionDotToken;
```
## CallExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: CallExpression) -> Location;
```
## CallExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: CallExpression) -> int;
```
## CallExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: CallExpression) -> string;
```
## CallExpression::getExpression

```rust
pub fn getExpression(self: CallExpression) -> LeftHandSideExpression;
```
## CallExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: CallExpression) -> Node;
```
