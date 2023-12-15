# MethodDeclaration

Inherit from [FunctionLikeDeclaration](./FunctionLikeDeclaration.md)

Primary key: `id: int`

```rust
schema MethodDeclaration extends FunctionLikeDeclaration {
  @primary id: int
}
```
## MethodDeclaration::getModifier

```java
/**
* Gets the `i`th modifier of this FunctionLikeDeclaration.
*/
```
```rust
pub fn getModifier(self: MethodDeclaration, i: int) -> Modifier;
```
## MethodDeclaration::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: MethodDeclaration) -> int;
```
## MethodDeclaration::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: MethodDeclaration) -> int;
```
## MethodDeclaration::getTypeParameter

```java
/**
* Gets the `i`th type parameter.
*/
```
```rust
pub fn getTypeParameter(self: MethodDeclaration, i: int) -> TypeParameter;
```
## MethodDeclaration::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: MethodDeclaration) -> *Comment;
```
## MethodDeclaration::getBody

```java
/**
* Gets the body of this function-like declaration
*/
```
```rust
pub fn getBody(self: MethodDeclaration) -> BlockStatement;
```
## MethodDeclaration::getDecoratorCount

```java
/**
* Gets the number of decorators of this FunctionLikeDeclaration.
*/
```
```rust
pub fn getDecoratorCount(self: MethodDeclaration) -> int;
```
## MethodDeclaration::getAModifier

```java
/**
* Gets a modifier of this FunctionLikeDeclaration.
*/
```
```rust
pub fn getAModifier(self: MethodDeclaration) -> *Modifier;
```
## MethodDeclaration::getAReturnStatement

```rust
pub fn getAReturnStatement(self: MethodDeclaration) -> *ReturnStatement;
```
## MethodDeclaration::getDecorator

```java
/**
* Gets the `i`th decorator of this FunctionLikeDeclaration.
*/
```
```rust
pub fn getDecorator(self: MethodDeclaration, i: int) -> Decorator;
```
## MethodDeclaration::getADecorator

```java
/**
* Gets a decorator of this FunctionLikeDeclaration.
*/
```
```rust
pub fn getADecorator(self: MethodDeclaration) -> *Decorator;
```
## MethodDeclaration::getCyclomaticComplexity

```java
/**
* Gets the cyclomatic complexity of this function-like declaration
*/
```
```rust
pub fn getCyclomaticComplexity(self: MethodDeclaration) -> int;
```
## MethodDeclaration::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: MethodDeclaration) -> TopLevelDO;
```
## MethodDeclaration::getAReturnedExpression

```rust
pub fn getAReturnedExpression(self: MethodDeclaration) -> *Expression;
```
## MethodDeclaration::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: MethodDeclaration, i: int) -> Node;
```
## MethodDeclaration::isGenerator

```java
/**
* Determines whether this FunctionLikeDeclaration is a generator.
*/
```
```rust
pub fn isGenerator(self: MethodDeclaration) -> bool;
```
## MethodDeclaration::getParameterCount

```java
/**
* Gets the count of parameters.
*/
```
```rust
pub fn getParameterCount(self: MethodDeclaration) -> int;
```
## MethodDeclaration::getAParameter

```java
/**
* Gets a parameter.
*/
```
```rust
pub fn getAParameter(self: MethodDeclaration) -> *Parameter;
```
## MethodDeclaration::getNameNode

```java
/**
* Gets the name node, which is a PropertyName.
*/
```
```rust
pub fn getNameNode(self: MethodDeclaration) -> PropertyName;
```
## MethodDeclaration::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: MethodDeclaration) -> File;
```
## MethodDeclaration::hasParameter

```java
/**
* Determine this FunctionLikeDeclaration contains any parameter.
*/
```
```rust
pub fn hasParameter(self: MethodDeclaration) -> bool;
```
## MethodDeclaration::getTypeParameterCount

```java
/**
* Gets the count of type parameters.
*/
```
```rust
pub fn getTypeParameterCount(self: MethodDeclaration) -> int;
```
## MethodDeclaration::getACallSite

```java
/**
* Gets a call site of this function-like declaration
*/
```
```rust
pub fn getACallSite(self: MethodDeclaration) -> *MayInvokeExpression;
```
## MethodDeclaration::getName

```rust
pub fn getName(self: MethodDeclaration) -> string;
```
## MethodDeclaration::getTypeParameterFirstIndex

```rust
pub fn getTypeParameterFirstIndex(self: MethodDeclaration) -> int;
```
## MethodDeclaration::getParameterFirstIndex

```rust
pub fn getParameterFirstIndex(self: MethodDeclaration) -> int;
```
## MethodDeclaration::getModifierCount

```java
/**
* Gets the number of modifiers of this FunctionLikeDeclaration.
*/
```
```rust
pub fn getModifierCount(self: MethodDeclaration) -> int;
```
## MethodDeclaration::getIndex

```rust
pub fn getIndex(self: MethodDeclaration) -> int;
```
## MethodDeclaration::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: MethodDeclaration) -> int;
```
## MethodDeclaration::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: MethodDeclaration) -> int;
```
## MethodDeclaration::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: MethodDeclaration) -> string;
```
## MethodDeclaration::getParameter

```java
/**
* Gets the `i`th parameter.
*/
```
```rust
pub fn getParameter(self: MethodDeclaration, i: int) -> Parameter;
```
## MethodDeclaration::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: MethodDeclaration) -> Node;
```
## MethodDeclaration::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: MethodDeclaration) -> int;
```
## MethodDeclaration::getATypeParameter

```java
/**
* Gets a type parameter.
*/
```
```rust
pub fn getATypeParameter(self: MethodDeclaration) -> *TypeParameter;
```
## MethodDeclaration::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: MethodDeclaration, level: int) -> Node;
```
## MethodDeclaration::getTypeNode

```java
/**
* Gets the type node.
*/
```
```rust
pub fn getTypeNode(self: MethodDeclaration) -> TypeNode;
```
## MethodDeclaration::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: MethodDeclaration, level: int) -> *Node;
```
## MethodDeclaration::getEndLineNumber

```rust
pub fn getEndLineNumber(self: MethodDeclaration) -> int;
```
## MethodDeclaration::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: MethodDeclaration) -> string;
```
## MethodDeclaration::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: MethodDeclaration) -> *FunctionLikeDeclaration;
```
## MethodDeclaration::getStartLineNumber

```rust
pub fn getStartLineNumber(self: MethodDeclaration) -> int;
```
## MethodDeclaration::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: MethodDeclaration) -> *Comment;
```
## MethodDeclaration::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: MethodDeclaration) -> FunctionLikeDeclaration;
```
## MethodDeclaration::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: MethodDeclaration) -> Symbol;
```
## MethodDeclaration::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: MethodDeclaration) -> *Node;
```
## MethodDeclaration::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: MethodDeclaration) -> Node;
```
## MethodDeclaration::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: MethodDeclaration) -> *Node;
```
## MethodDeclaration::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: MethodDeclaration) -> *Comment;
```
## MethodDeclaration::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: MethodDeclaration) -> *Node;
```
## MethodDeclaration::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: MethodDeclaration) -> Location;
```
## MethodDeclaration::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *MethodDeclaration;
```
