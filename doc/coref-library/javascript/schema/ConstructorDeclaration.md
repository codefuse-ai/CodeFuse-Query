# ConstructorDeclaration

Primary key: `id: int`

```rust
schema ConstructorDeclaration {
  @primary id: int,
}
```
## ConstructorDeclaration::getModifier

```java
/**
* Gets the `i`th modifier of this FunctionLikeDeclaration.
*/
```
```rust
pub fn getModifier(self: ConstructorDeclaration, i: int) -> Modifier;
```
## ConstructorDeclaration::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: ConstructorDeclaration) -> int;
```
## ConstructorDeclaration::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ConstructorDeclaration) -> int;
```
## ConstructorDeclaration::getTypeParameter

```java
/**
* Gets the `i`th type parameter.
*/
```
```rust
pub fn getTypeParameter(self: ConstructorDeclaration, i: int) -> TypeParameter;
```
## ConstructorDeclaration::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: ConstructorDeclaration) -> *Comment;
```
## ConstructorDeclaration::getBody

```java
/**
* Gets the body of this function-like declaration
*/
```
```rust
pub fn getBody(self: ConstructorDeclaration) -> BlockStatement;
```
## ConstructorDeclaration::getDecoratorCount

```java
/**
* Gets the number of decorators of this FunctionLikeDeclaration.
*/
```
```rust
pub fn getDecoratorCount(self: ConstructorDeclaration) -> int;
```
## ConstructorDeclaration::getAModifier

```java
/**
* Gets a modifier of this FunctionLikeDeclaration.
*/
```
```rust
pub fn getAModifier(self: ConstructorDeclaration) -> *Modifier;
```
## ConstructorDeclaration::getAReturnStatement

```rust
pub fn getAReturnStatement(self: ConstructorDeclaration) -> *ReturnStatement;
```
## ConstructorDeclaration::getDecorator

```java
/**
* Gets the `i`th decorator of this FunctionLikeDeclaration.
*/
```
```rust
pub fn getDecorator(self: ConstructorDeclaration, i: int) -> Decorator;
```
## ConstructorDeclaration::getADecorator

```java
/**
* Gets a decorator of this FunctionLikeDeclaration.
*/
```
```rust
pub fn getADecorator(self: ConstructorDeclaration) -> *Decorator;
```
## ConstructorDeclaration::getCyclomaticComplexity

```java
/**
* Gets the cyclomatic complexity of this function-like declaration
*/
```
```rust
pub fn getCyclomaticComplexity(self: ConstructorDeclaration) -> int;
```
## ConstructorDeclaration::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: ConstructorDeclaration) -> TopLevelDO;
```
## ConstructorDeclaration::getAReturnedExpression

```rust
pub fn getAReturnedExpression(self: ConstructorDeclaration) -> *Expression;
```
## ConstructorDeclaration::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: ConstructorDeclaration, i: int) -> Node;
```
## ConstructorDeclaration::isGenerator

```java
/**
* Determines whether this FunctionLikeDeclaration is a generator.
*/
```
```rust
pub fn isGenerator(self: ConstructorDeclaration) -> bool;
```
## ConstructorDeclaration::getParameterCount

```java
/**
* Gets the count of parameters.
*/
```
```rust
pub fn getParameterCount(self: ConstructorDeclaration) -> int;
```
## ConstructorDeclaration::getAParameter

```java
/**
* Gets a parameter.
*/
```
```rust
pub fn getAParameter(self: ConstructorDeclaration) -> *Parameter;
```
## ConstructorDeclaration::getNameNode

```java
/**
* Gets the name node, which is a PropertyName.
*/
```
```rust
pub fn getNameNode(self: ConstructorDeclaration) -> PropertyName;
```
## ConstructorDeclaration::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: ConstructorDeclaration) -> File;
```
## ConstructorDeclaration::hasParameter

```java
/**
* Determine this FunctionLikeDeclaration contains any parameter.
*/
```
```rust
pub fn hasParameter(self: ConstructorDeclaration) -> bool;
```
## ConstructorDeclaration::getTypeParameterCount

```java
/**
* Gets the count of type parameters.
*/
```
```rust
pub fn getTypeParameterCount(self: ConstructorDeclaration) -> int;
```
## ConstructorDeclaration::getACallSite

```java
/**
* Gets a call site of this function-like declaration
*/
```
```rust
pub fn getACallSite(self: ConstructorDeclaration) -> *MayInvokeExpression;
```
## ConstructorDeclaration::getName

```java
/**
* Gets the name of this function-like declaration
*/
```
```rust
pub fn getName(self: ConstructorDeclaration) -> string;
```
## ConstructorDeclaration::getTypeParameterFirstIndex

```rust
pub fn getTypeParameterFirstIndex(self: ConstructorDeclaration) -> int;
```
## ConstructorDeclaration::getParameterFirstIndex

```rust
pub fn getParameterFirstIndex(self: ConstructorDeclaration) -> int;
```
## ConstructorDeclaration::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: ConstructorDeclaration) -> int;
```
## ConstructorDeclaration::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ConstructorDeclaration) -> int;
```
## ConstructorDeclaration::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: ConstructorDeclaration) -> string;
```
## ConstructorDeclaration::getParameter

```java
/**
* Gets the `i`th parameter.
*/
```
```rust
pub fn getParameter(self: ConstructorDeclaration, i: int) -> Parameter;
```
## ConstructorDeclaration::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: ConstructorDeclaration) -> Node;
```
## ConstructorDeclaration::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: ConstructorDeclaration) -> int;
```
## ConstructorDeclaration::getATypeParameter

```java
/**
* Gets a type parameter.
*/
```
```rust
pub fn getATypeParameter(self: ConstructorDeclaration) -> *TypeParameter;
```
## ConstructorDeclaration::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: ConstructorDeclaration, level: int) -> Node;
```
## ConstructorDeclaration::getTypeNode

```java
/**
* Gets the type node.
*/
```
```rust
pub fn getTypeNode(self: ConstructorDeclaration) -> TypeNode;
```
## ConstructorDeclaration::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: ConstructorDeclaration, level: int) -> *Node;
```
## ConstructorDeclaration::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ConstructorDeclaration) -> int;
```
## ConstructorDeclaration::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: ConstructorDeclaration) -> string;
```
## ConstructorDeclaration::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ConstructorDeclaration) -> *FunctionLikeDeclaration;
```
## ConstructorDeclaration::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ConstructorDeclaration) -> int;
```
## ConstructorDeclaration::getModifierCount

```java
/**
* Gets the number of modifiers of this FunctionLikeDeclaration.
*/
```
```rust
pub fn getModifierCount(self: ConstructorDeclaration) -> int;
```
## ConstructorDeclaration::getIndex

```rust
pub fn getIndex(self: ConstructorDeclaration) -> int;
```
## ConstructorDeclaration::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: ConstructorDeclaration) -> *Comment;
```
## ConstructorDeclaration::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: ConstructorDeclaration) -> FunctionLikeDeclaration;
```
## ConstructorDeclaration::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: ConstructorDeclaration) -> Symbol;
```
## ConstructorDeclaration::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: ConstructorDeclaration) -> *Node;
```
## ConstructorDeclaration::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: ConstructorDeclaration) -> Node;
```
## ConstructorDeclaration::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: ConstructorDeclaration) -> *Node;
```
## ConstructorDeclaration::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: ConstructorDeclaration) -> *Comment;
```
## ConstructorDeclaration::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *ConstructorDeclaration;
```
## ConstructorDeclaration::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: ConstructorDeclaration) -> Location;
```
## ConstructorDeclaration::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: ConstructorDeclaration) -> *Node;
```
