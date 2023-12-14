# FunctionLikeDeclaration

Inherit from [FunctionLike](./FunctionLike.md)

Primary key: `id: int`

```rust
schema FunctionLikeDeclaration extends FunctionLike {
  @primary id: int,
}
```
## FunctionLikeDeclaration::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: FunctionLikeDeclaration) -> Location;
```
## FunctionLikeDeclaration::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: FunctionLikeDeclaration) -> *Comment;
```
## FunctionLikeDeclaration::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: FunctionLikeDeclaration) -> *Node;
```
## FunctionLikeDeclaration::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: FunctionLikeDeclaration) -> Symbol;
```
## FunctionLikeDeclaration::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: FunctionLikeDeclaration) -> *Node;
```
## FunctionLikeDeclaration::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: FunctionLikeDeclaration) -> Node;
```
## FunctionLikeDeclaration::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: FunctionLikeDeclaration) -> *Comment;
```
## FunctionLikeDeclaration::getStartLineNumber

```rust
pub fn getStartLineNumber(self: FunctionLikeDeclaration) -> int;
```
## FunctionLikeDeclaration::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: FunctionLikeDeclaration, level: int) -> *Node;
```
## FunctionLikeDeclaration::getEndLineNumber

```rust
pub fn getEndLineNumber(self: FunctionLikeDeclaration) -> int;
```
## FunctionLikeDeclaration::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: FunctionLikeDeclaration) -> string;
```
## FunctionLikeDeclaration::getTypeNode

```java
/**
* Gets the type node.
*/
```
```rust
pub fn getTypeNode(self: FunctionLikeDeclaration) -> TypeNode;
```
## FunctionLikeDeclaration::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: FunctionLikeDeclaration, level: int) -> Node;
```
## FunctionLikeDeclaration::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: FunctionLikeDeclaration) -> FunctionLikeDeclaration;
```
## FunctionLikeDeclaration::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: FunctionLikeDeclaration) -> int;
```
## FunctionLikeDeclaration::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: FunctionLikeDeclaration) -> Node;
```
## FunctionLikeDeclaration::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: FunctionLikeDeclaration) -> string;
```
## FunctionLikeDeclaration::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: FunctionLikeDeclaration) -> int;
```
## FunctionLikeDeclaration::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: FunctionLikeDeclaration) -> int;
```
## FunctionLikeDeclaration::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: FunctionLikeDeclaration) -> *Node;
```
## FunctionLikeDeclaration::getIndex

```rust
pub fn getIndex(self: FunctionLikeDeclaration) -> int;
```
## FunctionLikeDeclaration::getModifierCount

```java
/**
* Gets the number of modifiers of this FunctionLikeDeclaration.
*/
```
```rust
pub fn getModifierCount(self: FunctionLikeDeclaration) -> int;
```
## FunctionLikeDeclaration::getParameterFirstIndex

```rust
pub fn getParameterFirstIndex(self: FunctionLikeDeclaration) -> int;
```
## FunctionLikeDeclaration::getName

```java
/**
* Gets the name of this function-like declaration
*/
```
```rust
pub fn getName(self: FunctionLikeDeclaration) -> string;
```
## FunctionLikeDeclaration::getTypeParameterFirstIndex

```rust
pub fn getTypeParameterFirstIndex(self: FunctionLikeDeclaration) -> int;
```
## FunctionLikeDeclaration::getACallSite

```java
/**
* Gets a call site of this function-like declaration
*/
```
```rust
pub fn getACallSite(self: FunctionLikeDeclaration) -> *MayInvokeExpression;
```
## FunctionLikeDeclaration::getParameter

```java
/**
* Gets the `i`th parameter.
*/
```
```rust
pub fn getParameter(self: FunctionLikeDeclaration, i: int) -> Parameter;
```
## FunctionLikeDeclaration::getTypeParameterCount

```java
/**
* Gets the count of type parameters.
*/
```
```rust
pub fn getTypeParameterCount(self: FunctionLikeDeclaration) -> int;
```
## FunctionLikeDeclaration::hasParameter

```java
/**
* Determine this FunctionLikeDeclaration contains any parameter.
*/
```
```rust
pub fn hasParameter(self: FunctionLikeDeclaration) -> bool;
```
## FunctionLikeDeclaration::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: FunctionLikeDeclaration) -> File;
```
## FunctionLikeDeclaration::getNameNode

```java
/**
* Gets the name node, which is a PropertyName.
*/
```
```rust
pub fn getNameNode(self: FunctionLikeDeclaration) -> PropertyName;
```
## FunctionLikeDeclaration::getAParameter

```java
/**
* Gets a parameter.
*/
```
```rust
pub fn getAParameter(self: FunctionLikeDeclaration) -> *Parameter;
```
## FunctionLikeDeclaration::getParameterCount

```java
/**
* Gets the count of parameters.
*/
```
```rust
pub fn getParameterCount(self: FunctionLikeDeclaration) -> int;
```
## FunctionLikeDeclaration::getATypeParameter

```java
/**
* Gets a type parameter.
*/
```
```rust
pub fn getATypeParameter(self: FunctionLikeDeclaration) -> *TypeParameter;
```
## FunctionLikeDeclaration::isGenerator

```java
/**
* Determines whether this FunctionLikeDeclaration is a generator.
*/
```
```rust
pub fn isGenerator(self: FunctionLikeDeclaration) -> bool;
```
## FunctionLikeDeclaration::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: FunctionLikeDeclaration, i: int) -> Node;
```
## FunctionLikeDeclaration::getAReturnedExpression

```rust
pub fn getAReturnedExpression(self: FunctionLikeDeclaration) -> *Expression;
```
## FunctionLikeDeclaration::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: FunctionLikeDeclaration) -> TopLevelDO;
```
## FunctionLikeDeclaration::getADecorator

```java
/**
* Gets a decorator of this FunctionLikeDeclaration.
*/
```
```rust
pub fn getADecorator(self: FunctionLikeDeclaration) -> *Decorator;
```
## FunctionLikeDeclaration::getCyclomaticComplexity

```java
/**
* Gets the cyclomatic complexity of this function-like declaration
*/
```
```rust
pub fn getCyclomaticComplexity(self: FunctionLikeDeclaration) -> int;
```
## FunctionLikeDeclaration::getDecorator

```java
/**
* Gets the `i`th decorator of this FunctionLikeDeclaration.
*/
```
```rust
pub fn getDecorator(self: FunctionLikeDeclaration, i: int) -> Decorator;
```
## FunctionLikeDeclaration::getAReturnStatement

```rust
pub fn getAReturnStatement(self: FunctionLikeDeclaration) -> *ReturnStatement;
```
## FunctionLikeDeclaration::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: FunctionLikeDeclaration) -> *FunctionLikeDeclaration;
```
## FunctionLikeDeclaration::getAModifier

```java
/**
* Gets a modifier of this FunctionLikeDeclaration.
*/
```
```rust
pub fn getAModifier(self: FunctionLikeDeclaration) -> *Modifier;
```
## FunctionLikeDeclaration::getDecoratorCount

```java
/**
* Gets the number of decorators of this FunctionLikeDeclaration.
*/
```
```rust
pub fn getDecoratorCount(self: FunctionLikeDeclaration) -> int;
```
## FunctionLikeDeclaration::getBody

```java
/**
* Gets the body of this function-like declaration
*/
```
```rust
pub fn getBody(self: FunctionLikeDeclaration) -> BlockStatement;
```
## FunctionLikeDeclaration::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: FunctionLikeDeclaration) -> *Comment;
```
## FunctionLikeDeclaration::getTypeParameter

```java
/**
* Gets the `i`th type parameter.
*/
```
```rust
pub fn getTypeParameter(self: FunctionLikeDeclaration, i: int) -> TypeParameter;
```
## FunctionLikeDeclaration::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: FunctionLikeDeclaration) -> int;
```
## FunctionLikeDeclaration::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: FunctionLikeDeclaration) -> int;
```
## FunctionLikeDeclaration::getModifier

```java
/**
* Gets the `i`th modifier of this FunctionLikeDeclaration.
*/
```
```rust
pub fn getModifier(self: FunctionLikeDeclaration, i: int) -> Modifier;
```
## FunctionLikeDeclaration::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *FunctionLikeDeclaration;
```
