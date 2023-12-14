# GetAccessor

Inherit from [FunctionLikeDeclaration](./FunctionLikeDeclaration.md)

Primary key: `id: int`

```rust
schema GetAccessor extends FunctionLikeDeclaration {
  @primary id: int,
}
```
## GetAccessor::getModifier

```java
/**
* Gets the `i`th modifier of this FunctionLikeDeclaration.
*/
```
```rust
pub fn getModifier(self: GetAccessor, i: int) -> Modifier;
```
## GetAccessor::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: GetAccessor) -> int;
```
## GetAccessor::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: GetAccessor) -> int;
```
## GetAccessor::getTypeParameter

```java
/**
* Gets the `i`th type parameter.
*/
```
```rust
pub fn getTypeParameter(self: GetAccessor, i: int) -> TypeParameter;
```
## GetAccessor::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: GetAccessor) -> *Comment;
```
## GetAccessor::getBody

```java
/**
* Gets the body of this function-like declaration
*/
```
```rust
pub fn getBody(self: GetAccessor) -> BlockStatement;
```
## GetAccessor::getDecoratorCount

```java
/**
* Gets the number of decorators of this FunctionLikeDeclaration.
*/
```
```rust
pub fn getDecoratorCount(self: GetAccessor) -> int;
```
## GetAccessor::getAModifier

```java
/**
* Gets a modifier of this FunctionLikeDeclaration.
*/
```
```rust
pub fn getAModifier(self: GetAccessor) -> *Modifier;
```
## GetAccessor::getAReturnStatement

```rust
pub fn getAReturnStatement(self: GetAccessor) -> *ReturnStatement;
```
## GetAccessor::getDecorator

```java
/**
* Gets the `i`th decorator of this FunctionLikeDeclaration.
*/
```
```rust
pub fn getDecorator(self: GetAccessor, i: int) -> Decorator;
```
## GetAccessor::getADecorator

```java
/**
* Gets a decorator of this FunctionLikeDeclaration.
*/
```
```rust
pub fn getADecorator(self: GetAccessor) -> *Decorator;
```
## GetAccessor::getCyclomaticComplexity

```java
/**
* Gets the cyclomatic complexity of this function-like declaration
*/
```
```rust
pub fn getCyclomaticComplexity(self: GetAccessor) -> int;
```
## GetAccessor::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: GetAccessor) -> TopLevelDO;
```
## GetAccessor::getAReturnedExpression

```rust
pub fn getAReturnedExpression(self: GetAccessor) -> *Expression;
```
## GetAccessor::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: GetAccessor, i: int) -> Node;
```
## GetAccessor::isGenerator

```java
/**
* Determines whether this FunctionLikeDeclaration is a generator.
*/
```
```rust
pub fn isGenerator(self: GetAccessor) -> bool;
```
## GetAccessor::getParameterCount

```java
/**
* Gets the count of parameters.
*/
```
```rust
pub fn getParameterCount(self: GetAccessor) -> int;
```
## GetAccessor::getAParameter

```java
/**
* Gets a parameter.
*/
```
```rust
pub fn getAParameter(self: GetAccessor) -> *Parameter;
```
## GetAccessor::getNameNode

```java
/**
* Gets the name node, which is a PropertyName.
*/
```
```rust
pub fn getNameNode(self: GetAccessor) -> PropertyName;
```
## GetAccessor::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: GetAccessor) -> File;
```
## GetAccessor::hasParameter

```java
/**
* Determine this FunctionLikeDeclaration contains any parameter.
*/
```
```rust
pub fn hasParameter(self: GetAccessor) -> bool;
```
## GetAccessor::getTypeParameterCount

```java
/**
* Gets the count of type parameters.
*/
```
```rust
pub fn getTypeParameterCount(self: GetAccessor) -> int;
```
## GetAccessor::getACallSite

```java
/**
* Gets a call site of this function-like declaration
*/
```
```rust
pub fn getACallSite(self: GetAccessor) -> *MayInvokeExpression;
```
## GetAccessor::getName

```java
/**
* Gets the name of this function-like declaration
*/
```
```rust
pub fn getName(self: GetAccessor) -> string;
```
## GetAccessor::getTypeParameterFirstIndex

```rust
pub fn getTypeParameterFirstIndex(self: GetAccessor) -> int;
```
## GetAccessor::getParameterFirstIndex

```rust
pub fn getParameterFirstIndex(self: GetAccessor) -> int;
```
## GetAccessor::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: GetAccessor) -> int;
```
## GetAccessor::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: GetAccessor) -> int;
```
## GetAccessor::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: GetAccessor) -> string;
```
## GetAccessor::getParameter

```java
/**
* Gets the `i`th parameter.
*/
```
```rust
pub fn getParameter(self: GetAccessor, i: int) -> Parameter;
```
## GetAccessor::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: GetAccessor) -> Node;
```
## GetAccessor::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: GetAccessor) -> int;
```
## GetAccessor::getATypeParameter

```java
/**
* Gets a type parameter.
*/
```
```rust
pub fn getATypeParameter(self: GetAccessor) -> *TypeParameter;
```
## GetAccessor::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: GetAccessor, level: int) -> Node;
```
## GetAccessor::getTypeNode

```java
/**
* Gets the type node.
*/
```
```rust
pub fn getTypeNode(self: GetAccessor) -> TypeNode;
```
## GetAccessor::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: GetAccessor, level: int) -> *Node;
```
## GetAccessor::getEndLineNumber

```rust
pub fn getEndLineNumber(self: GetAccessor) -> int;
```
## GetAccessor::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: GetAccessor) -> string;
```
## GetAccessor::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: GetAccessor) -> *FunctionLikeDeclaration;
```
## GetAccessor::getStartLineNumber

```rust
pub fn getStartLineNumber(self: GetAccessor) -> int;
```
## GetAccessor::getModifierCount

```java
/**
* Gets the number of modifiers of this FunctionLikeDeclaration.
*/
```
```rust
pub fn getModifierCount(self: GetAccessor) -> int;
```
## GetAccessor::getIndex

```rust
pub fn getIndex(self: GetAccessor) -> int;
```
## GetAccessor::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: GetAccessor) -> *Comment;
```
## GetAccessor::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: GetAccessor) -> FunctionLikeDeclaration;
```
## GetAccessor::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: GetAccessor) -> Symbol;
```
## GetAccessor::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: GetAccessor) -> *Node;
```
## GetAccessor::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: GetAccessor) -> Node;
```
## GetAccessor::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: GetAccessor) -> *Node;
```
## GetAccessor::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: GetAccessor) -> *Comment;
```
## GetAccessor::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *GetAccessor;
```
## GetAccessor::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: GetAccessor) -> Location;
```
## GetAccessor::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: GetAccessor) -> *Node;
```
