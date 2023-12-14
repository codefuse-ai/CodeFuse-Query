# ComponentRegistrationExpression

Primary key: `id: int`

```rust
schema ComponentRegistrationExpression {
  @primary id: int,
}
```
## ComponentRegistrationExpression::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: ComponentRegistrationExpression) -> Node;
```
## ComponentRegistrationExpression::getExpression

```rust
pub fn getExpression(self: ComponentRegistrationExpression) -> LeftHandSideExpression;
```
## ComponentRegistrationExpression::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: ComponentRegistrationExpression) -> string;
```
## ComponentRegistrationExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ComponentRegistrationExpression) -> int;
```
## ComponentRegistrationExpression::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: ComponentRegistrationExpression) -> Location;
```
## ComponentRegistrationExpression::getQuestionDotToken

```java
/**
* Gets the `?.` token of this call expression.
*/
```
```rust
pub fn getQuestionDotToken(self: ComponentRegistrationExpression) -> QuestionDotToken;
```
## ComponentRegistrationExpression::getATypeArgument

```java
/**
* Gets a type argument of this call expression.
*/
```
```rust
pub fn getATypeArgument(self: ComponentRegistrationExpression) -> *TypeNode;
```
## ComponentRegistrationExpression::getTypeArgumentCount

```java
/**
* Gets the count of the type arguments.
*/
```
```rust
pub fn getTypeArgumentCount(self: ComponentRegistrationExpression) -> int;
```
## ComponentRegistrationExpression::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: ComponentRegistrationExpression, level: int) -> *Node;
```
## ComponentRegistrationExpression::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ComponentRegistrationExpression) -> *FunctionLikeDeclaration;
```
## ComponentRegistrationExpression::getArgument

```java
/**
* Gets the `i`th argument of this call expression.
* index from 0
*/
```
```rust
pub fn getArgument(self: ComponentRegistrationExpression, i: int) -> Expression;
```
## ComponentRegistrationExpression::getAnArgument

```java
/**
* Gets an argument of this call expression.
*/
```
```rust
pub fn getAnArgument(self: ComponentRegistrationExpression) -> *Expression;
```
## ComponentRegistrationExpression::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: ComponentRegistrationExpression, i: int) -> Node;
```
## ComponentRegistrationExpression::getCallee

```java
/**
* Gets the callee of this call expression.
*/
```
```rust
pub fn getCallee(self: ComponentRegistrationExpression) -> FunctionLikeDeclaration;
```
## ComponentRegistrationExpression::getArgumentCount

```java
/**
* Gets the count of the arguments.
*/
```
```rust
pub fn getArgumentCount(self: ComponentRegistrationExpression) -> int;
```
## ComponentRegistrationExpression::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: ComponentRegistrationExpression) -> string;
```
## ComponentRegistrationExpression::getModifier

```java
/**
* Gets the `i`th modifier.
*/
```
```rust
pub fn getModifier(self: ComponentRegistrationExpression, i: int) -> Modifier;
```
## ComponentRegistrationExpression::getADecorator

```java
/**
* Gets a decorator.
*/
```
```rust
pub fn getADecorator(self: ComponentRegistrationExpression) -> *Decorator;
```
## ComponentRegistrationExpression::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: ComponentRegistrationExpression) -> Symbol;
```
## ComponentRegistrationExpression::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: ComponentRegistrationExpression) -> *Node;
```
## ComponentRegistrationExpression::getTypeArgument

```java
/**
* Gets the `i`th type argument of this call expression.
*/
```
```rust
pub fn getTypeArgument(self: ComponentRegistrationExpression, i: int) -> TypeNode;
```
## ComponentRegistrationExpression::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: ComponentRegistrationExpression) -> *Comment;
```
## ComponentRegistrationExpression::hasCallee

```java
/**
* Determine whether this CallExpression has a callee.
*/
```
```rust
pub fn hasCallee(self: ComponentRegistrationExpression) -> bool;
```
## ComponentRegistrationExpression::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: ComponentRegistrationExpression) -> Node;
```
## ComponentRegistrationExpression::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: ComponentRegistrationExpression) -> *Node;
```
## ComponentRegistrationExpression::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: ComponentRegistrationExpression) -> int;
```
## ComponentRegistrationExpression::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: ComponentRegistrationExpression) -> TopLevelDO;
```
## ComponentRegistrationExpression::getDecorator

```java
/**
* Gets the `i`th decorator.
*/
```
```rust
pub fn getDecorator(self: ComponentRegistrationExpression, i: int) -> Decorator;
```
## ComponentRegistrationExpression::getAModifier

```java
/**
* Gets a modifier.
*/
```
```rust
pub fn getAModifier(self: ComponentRegistrationExpression) -> *Modifier;
```
## ComponentRegistrationExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ComponentRegistrationExpression) -> int;
```
## ComponentRegistrationExpression::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: ComponentRegistrationExpression) -> int;
```
## ComponentRegistrationExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ComponentRegistrationExpression) -> int;
```
## ComponentRegistrationExpression::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: ComponentRegistrationExpression) -> FunctionLikeDeclaration;
```
## ComponentRegistrationExpression::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: ComponentRegistrationExpression) -> *Comment;
```
## ComponentRegistrationExpression::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: ComponentRegistrationExpression) -> *Comment;
```
## ComponentRegistrationExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ComponentRegistrationExpression) -> int;
```
## ComponentRegistrationExpression::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: ComponentRegistrationExpression, level: int) -> Node;
```
## ComponentRegistrationExpression::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: ComponentRegistrationExpression) -> File;
```
## ComponentRegistrationExpression::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: ComponentRegistrationExpression) -> int;
```
## ComponentRegistrationExpression::getIndex

```rust
pub fn getIndex(self: ComponentRegistrationExpression) -> int;
```
## ComponentRegistrationExpression::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: ComponentRegistrationExpression) -> *Node;
```
## ComponentRegistrationExpression::isOptionalChaining

```java
/**
* Determines whether this call expression is optional chaining, which means it has a `?.` token.
*/
```
```rust
pub fn isOptionalChaining(self: ComponentRegistrationExpression) -> bool;
```
## ComponentRegistrationExpression::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *ComponentRegistrationExpression;
```
