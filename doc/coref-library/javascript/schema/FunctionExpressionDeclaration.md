# FunctionExpressionDeclaration

Primary key: `id: int`

```rust
schema FunctionExpressionDeclaration {
  @primary id: int,
}
```
## FunctionExpressionDeclaration::getModifier

```java
/**
* Gets the `i`th modifier of this FunctionLikeDeclaration.
*/
```
```rust
pub fn getModifier(self: FunctionExpressionDeclaration, i: int) -> Modifier;
```
## FunctionExpressionDeclaration::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: FunctionExpressionDeclaration) -> int;
```
## FunctionExpressionDeclaration::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: FunctionExpressionDeclaration) -> int;
```
## FunctionExpressionDeclaration::getTypeParameter

```java
/**
* Gets the `i`th type parameter.
*/
```
```rust
pub fn getTypeParameter(self: FunctionExpressionDeclaration, i: int) -> TypeParameter;
```
## FunctionExpressionDeclaration::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: FunctionExpressionDeclaration) -> *Comment;
```
## FunctionExpressionDeclaration::getBody

```java
/**
* Gets the body of this function-like declaration
*/
```
```rust
pub fn getBody(self: FunctionExpressionDeclaration) -> BlockStatement;
```
## FunctionExpressionDeclaration::getDecoratorCount

```java
/**
* Gets the number of decorators of this FunctionLikeDeclaration.
*/
```
```rust
pub fn getDecoratorCount(self: FunctionExpressionDeclaration) -> int;
```
## FunctionExpressionDeclaration::getAModifier

```java
/**
* Gets a modifier of this FunctionLikeDeclaration.
*/
```
```rust
pub fn getAModifier(self: FunctionExpressionDeclaration) -> *Modifier;
```
## FunctionExpressionDeclaration::getAReturnStatement

```rust
pub fn getAReturnStatement(self: FunctionExpressionDeclaration) -> *ReturnStatement;
```
## FunctionExpressionDeclaration::getDecorator

```java
/**
* Gets the `i`th decorator of this FunctionLikeDeclaration.
*/
```
```rust
pub fn getDecorator(self: FunctionExpressionDeclaration, i: int) -> Decorator;
```
## FunctionExpressionDeclaration::getADecorator

```java
/**
* Gets a decorator of this FunctionLikeDeclaration.
*/
```
```rust
pub fn getADecorator(self: FunctionExpressionDeclaration) -> *Decorator;
```
## FunctionExpressionDeclaration::getCyclomaticComplexity

```java
/**
* Gets the cyclomatic complexity of this function-like declaration
*/
```
```rust
pub fn getCyclomaticComplexity(self: FunctionExpressionDeclaration) -> int;
```
## FunctionExpressionDeclaration::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: FunctionExpressionDeclaration) -> TopLevelDO;
```
## FunctionExpressionDeclaration::getAReturnedExpression

```rust
pub fn getAReturnedExpression(self: FunctionExpressionDeclaration) -> *Expression;
```
## FunctionExpressionDeclaration::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: FunctionExpressionDeclaration, i: int) -> Node;
```
## FunctionExpressionDeclaration::isGenerator

```java
/**
* Determines whether this FunctionLikeDeclaration is a generator.
*/
```
```rust
pub fn isGenerator(self: FunctionExpressionDeclaration) -> bool;
```
## FunctionExpressionDeclaration::getParameterCount

```java
/**
* Gets the count of parameters.
*/
```
```rust
pub fn getParameterCount(self: FunctionExpressionDeclaration) -> int;
```
## FunctionExpressionDeclaration::getAParameter

```java
/**
* Gets a parameter.
*/
```
```rust
pub fn getAParameter(self: FunctionExpressionDeclaration) -> *Parameter;
```
## FunctionExpressionDeclaration::getNameNode

```java
/**
* Gets the name node, which is a PropertyName.
*/
```
```rust
pub fn getNameNode(self: FunctionExpressionDeclaration) -> PropertyName;
```
## FunctionExpressionDeclaration::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: FunctionExpressionDeclaration) -> File;
```
## FunctionExpressionDeclaration::hasParameter

```java
/**
* Determine this FunctionLikeDeclaration contains any parameter.
*/
```
```rust
pub fn hasParameter(self: FunctionExpressionDeclaration) -> bool;
```
## FunctionExpressionDeclaration::getTypeParameterCount

```java
/**
* Gets the count of type parameters.
*/
```
```rust
pub fn getTypeParameterCount(self: FunctionExpressionDeclaration) -> int;
```
## FunctionExpressionDeclaration::getACallSite

```java
/**
* Gets a call site of this function-like declaration
*/
```
```rust
pub fn getACallSite(self: FunctionExpressionDeclaration) -> *MayInvokeExpression;
```
## FunctionExpressionDeclaration::getName

```java
/**
* Gets the name of this function-like declaration
*/
```
```rust
pub fn getName(self: FunctionExpressionDeclaration) -> string;
```
## FunctionExpressionDeclaration::getTypeParameterFirstIndex

```rust
pub fn getTypeParameterFirstIndex(self: FunctionExpressionDeclaration) -> int;
```
## FunctionExpressionDeclaration::getParameterFirstIndex

```rust
pub fn getParameterFirstIndex(self: FunctionExpressionDeclaration) -> int;
```
## FunctionExpressionDeclaration::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: FunctionExpressionDeclaration) -> int;
```
## FunctionExpressionDeclaration::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: FunctionExpressionDeclaration) -> int;
```
## FunctionExpressionDeclaration::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: FunctionExpressionDeclaration) -> string;
```
## FunctionExpressionDeclaration::getParameter

```java
/**
* Gets the `i`th parameter.
*/
```
```rust
pub fn getParameter(self: FunctionExpressionDeclaration, i: int) -> Parameter;
```
## FunctionExpressionDeclaration::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: FunctionExpressionDeclaration) -> Node;
```
## FunctionExpressionDeclaration::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: FunctionExpressionDeclaration) -> int;
```
## FunctionExpressionDeclaration::getATypeParameter

```java
/**
* Gets a type parameter.
*/
```
```rust
pub fn getATypeParameter(self: FunctionExpressionDeclaration) -> *TypeParameter;
```
## FunctionExpressionDeclaration::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: FunctionExpressionDeclaration, level: int) -> Node;
```
## FunctionExpressionDeclaration::getTypeNode

```java
/**
* Gets the type node.
*/
```
```rust
pub fn getTypeNode(self: FunctionExpressionDeclaration) -> TypeNode;
```
## FunctionExpressionDeclaration::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: FunctionExpressionDeclaration, level: int) -> *Node;
```
## FunctionExpressionDeclaration::getEndLineNumber

```rust
pub fn getEndLineNumber(self: FunctionExpressionDeclaration) -> int;
```
## FunctionExpressionDeclaration::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: FunctionExpressionDeclaration) -> string;
```
## FunctionExpressionDeclaration::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: FunctionExpressionDeclaration) -> *FunctionLikeDeclaration;
```
## FunctionExpressionDeclaration::getStartLineNumber

```rust
pub fn getStartLineNumber(self: FunctionExpressionDeclaration) -> int;
```
## FunctionExpressionDeclaration::getModifierCount

```java
/**
* Gets the number of modifiers of this FunctionLikeDeclaration.
*/
```
```rust
pub fn getModifierCount(self: FunctionExpressionDeclaration) -> int;
```
## FunctionExpressionDeclaration::getIndex

```rust
pub fn getIndex(self: FunctionExpressionDeclaration) -> int;
```
## FunctionExpressionDeclaration::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: FunctionExpressionDeclaration) -> *Comment;
```
## FunctionExpressionDeclaration::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: FunctionExpressionDeclaration) -> FunctionLikeDeclaration;
```
## FunctionExpressionDeclaration::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: FunctionExpressionDeclaration) -> Symbol;
```
## FunctionExpressionDeclaration::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: FunctionExpressionDeclaration) -> *Node;
```
## FunctionExpressionDeclaration::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: FunctionExpressionDeclaration) -> Node;
```
## FunctionExpressionDeclaration::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: FunctionExpressionDeclaration) -> *Node;
```
## FunctionExpressionDeclaration::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: FunctionExpressionDeclaration) -> *Comment;
```
## FunctionExpressionDeclaration::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *FunctionExpressionDeclaration;
```
## FunctionExpressionDeclaration::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: FunctionExpressionDeclaration) -> Location;
```
## FunctionExpressionDeclaration::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: FunctionExpressionDeclaration) -> *Node;
```
