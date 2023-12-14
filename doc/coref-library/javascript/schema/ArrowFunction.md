# ArrowFunction

Inherit from [FunctionLikeDeclaration](./FunctionLikeDeclaration.md)

Primary key: `id: int`

```rust
schema ArrowFunction extends FunctionLikeDeclaration {
  @primary id: int,
}
```
## ArrowFunction::getModifier

```java
/**
* Gets the `i`th modifier of this FunctionLikeDeclaration.
*/
```
```rust
pub fn getModifier(self: ArrowFunction, i: int) -> Modifier;
```
## ArrowFunction::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: ArrowFunction) -> int;
```
## ArrowFunction::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ArrowFunction) -> int;
```
## ArrowFunction::getTypeParameter

```java
/**
* Gets the `i`th type parameter.
*/
```
```rust
pub fn getTypeParameter(self: ArrowFunction, i: int) -> TypeParameter;
```
## ArrowFunction::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: ArrowFunction) -> *Comment;
```
## ArrowFunction::getBody

```java
/**
* Gets the body of this function-like declaration
*/
```
```rust
pub fn getBody(self: ArrowFunction) -> BlockStatement;
```
## ArrowFunction::getDecoratorCount

```java
/**
* Gets the number of decorators of this FunctionLikeDeclaration.
*/
```
```rust
pub fn getDecoratorCount(self: ArrowFunction) -> int;
```
## ArrowFunction::getAModifier

```java
/**
* Gets a modifier of this FunctionLikeDeclaration.
*/
```
```rust
pub fn getAModifier(self: ArrowFunction) -> *Modifier;
```
## ArrowFunction::getAReturnStatement

```rust
pub fn getAReturnStatement(self: ArrowFunction) -> *ReturnStatement;
```
## ArrowFunction::getDecorator

```java
/**
* Gets the `i`th decorator of this FunctionLikeDeclaration.
*/
```
```rust
pub fn getDecorator(self: ArrowFunction, i: int) -> Decorator;
```
## ArrowFunction::getADecorator

```java
/**
* Gets a decorator of this FunctionLikeDeclaration.
*/
```
```rust
pub fn getADecorator(self: ArrowFunction) -> *Decorator;
```
## ArrowFunction::getCyclomaticComplexity

```java
/**
* Gets the cyclomatic complexity of this function-like declaration
*/
```
```rust
pub fn getCyclomaticComplexity(self: ArrowFunction) -> int;
```
## ArrowFunction::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: ArrowFunction) -> TopLevelDO;
```
## ArrowFunction::getAReturnedExpression

```rust
pub fn getAReturnedExpression(self: ArrowFunction) -> *Expression;
```
## ArrowFunction::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: ArrowFunction, i: int) -> Node;
```
## ArrowFunction::isGenerator

```java
/**
* Determines whether this FunctionLikeDeclaration is a generator.
*/
```
```rust
pub fn isGenerator(self: ArrowFunction) -> bool;
```
## ArrowFunction::getParameterCount

```java
/**
* Gets the count of parameters.
*/
```
```rust
pub fn getParameterCount(self: ArrowFunction) -> int;
```
## ArrowFunction::getAParameter

```java
/**
* Gets a parameter.
*/
```
```rust
pub fn getAParameter(self: ArrowFunction) -> *Parameter;
```
## ArrowFunction::getNameNode

```java
/**
* Gets the name node, which is a PropertyName.
*/
```
```rust
pub fn getNameNode(self: ArrowFunction) -> PropertyName;
```
## ArrowFunction::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: ArrowFunction) -> File;
```
## ArrowFunction::hasParameter

```java
/**
* Determine this FunctionLikeDeclaration contains any parameter.
*/
```
```rust
pub fn hasParameter(self: ArrowFunction) -> bool;
```
## ArrowFunction::getTypeParameterCount

```java
/**
* Gets the count of type parameters.
*/
```
```rust
pub fn getTypeParameterCount(self: ArrowFunction) -> int;
```
## ArrowFunction::getACallSite

```java
/**
* Gets a call site of this function-like declaration
*/
```
```rust
pub fn getACallSite(self: ArrowFunction) -> *MayInvokeExpression;
```
## ArrowFunction::getName

```java
/**
* Gets the name of this function-like declaration
*/
```
```rust
pub fn getName(self: ArrowFunction) -> string;
```
## ArrowFunction::getTypeParameterFirstIndex

```rust
pub fn getTypeParameterFirstIndex(self: ArrowFunction) -> int;
```
## ArrowFunction::getParameterFirstIndex

```rust
pub fn getParameterFirstIndex(self: ArrowFunction) -> int;
```
## ArrowFunction::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: ArrowFunction) -> int;
```
## ArrowFunction::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ArrowFunction) -> int;
```
## ArrowFunction::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: ArrowFunction) -> string;
```
## ArrowFunction::getParameter

```java
/**
* Gets the `i`th parameter.
*/
```
```rust
pub fn getParameter(self: ArrowFunction, i: int) -> Parameter;
```
## ArrowFunction::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: ArrowFunction) -> Node;
```
## ArrowFunction::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: ArrowFunction) -> int;
```
## ArrowFunction::getATypeParameter

```java
/**
* Gets a type parameter.
*/
```
```rust
pub fn getATypeParameter(self: ArrowFunction) -> *TypeParameter;
```
## ArrowFunction::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: ArrowFunction, level: int) -> Node;
```
## ArrowFunction::getTypeNode

```java
/**
* Gets the type node.
*/
```
```rust
pub fn getTypeNode(self: ArrowFunction) -> TypeNode;
```
## ArrowFunction::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: ArrowFunction, level: int) -> *Node;
```
## ArrowFunction::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ArrowFunction) -> int;
```
## ArrowFunction::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: ArrowFunction) -> string;
```
## ArrowFunction::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ArrowFunction) -> *FunctionLikeDeclaration;
```
## ArrowFunction::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ArrowFunction) -> int;
```
## ArrowFunction::getModifierCount

```java
/**
* Gets the number of modifiers of this FunctionLikeDeclaration.
*/
```
```rust
pub fn getModifierCount(self: ArrowFunction) -> int;
```
## ArrowFunction::getIndex

```rust
pub fn getIndex(self: ArrowFunction) -> int;
```
## ArrowFunction::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: ArrowFunction) -> *Comment;
```
## ArrowFunction::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: ArrowFunction) -> FunctionLikeDeclaration;
```
## ArrowFunction::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: ArrowFunction) -> Symbol;
```
## ArrowFunction::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: ArrowFunction) -> *Node;
```
## ArrowFunction::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: ArrowFunction) -> Node;
```
## ArrowFunction::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: ArrowFunction) -> *Node;
```
## ArrowFunction::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: ArrowFunction) -> *Comment;
```
## ArrowFunction::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *ArrowFunction;
```
## ArrowFunction::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: ArrowFunction) -> Location;
```
## ArrowFunction::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: ArrowFunction) -> *Node;
```
