# FunctionDeclaration

Primary key: `id: int`

```rust
schema FunctionDeclaration {
  @primary id: int,
}
```
## FunctionDeclaration::getModifier

```java
/**
* Gets the `i`th modifier of this FunctionLikeDeclaration.
*/
```
```rust
pub fn getModifier(self: FunctionDeclaration, i: int) -> Modifier;
```
## FunctionDeclaration::getKind

```java
/**
* Get the syntax kind of this node
*/
```
```rust
pub fn getKind(self: FunctionDeclaration) -> int;
```
## FunctionDeclaration::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: FunctionDeclaration) -> int;
```
## FunctionDeclaration::getTypeParameter

```java
/**
* Gets the `i`th type parameter.
*/
```
```rust
pub fn getTypeParameter(self: FunctionDeclaration, i: int) -> TypeParameter;
```
## FunctionDeclaration::getATrailingComment

```java
/**
* Gets the trailing comments of it
*/
```
```rust
pub fn getATrailingComment(self: FunctionDeclaration) -> *Comment;
```
## FunctionDeclaration::getBody

```java
/**
* Gets the body of this function-like declaration
*/
```
```rust
pub fn getBody(self: FunctionDeclaration) -> BlockStatement;
```
## FunctionDeclaration::getDecoratorCount

```java
/**
* Gets the number of decorators of this FunctionLikeDeclaration.
*/
```
```rust
pub fn getDecoratorCount(self: FunctionDeclaration) -> int;
```
## FunctionDeclaration::getAModifier

```java
/**
* Gets a modifier of this FunctionLikeDeclaration.
*/
```
```rust
pub fn getAModifier(self: FunctionDeclaration) -> *Modifier;
```
## FunctionDeclaration::getAReturnStatement

```rust
pub fn getAReturnStatement(self: FunctionDeclaration) -> *ReturnStatement;
```
## FunctionDeclaration::getDecorator

```java
/**
* Gets the `i`th decorator of this FunctionLikeDeclaration.
*/
```
```rust
pub fn getDecorator(self: FunctionDeclaration, i: int) -> Decorator;
```
## FunctionDeclaration::getADecorator

```java
/**
* Gets a decorator of this FunctionLikeDeclaration.
*/
```
```rust
pub fn getADecorator(self: FunctionDeclaration) -> *Decorator;
```
## FunctionDeclaration::getCyclomaticComplexity

```java
/**
* Gets the cyclomatic complexity of this function-like declaration
*/
```
```rust
pub fn getCyclomaticComplexity(self: FunctionDeclaration) -> int;
```
## FunctionDeclaration::getRoot

```java
/**
* Gets the root top-level of this node. 
*/
```
```rust
pub fn getRoot(self: FunctionDeclaration) -> TopLevelDO;
```
## FunctionDeclaration::getAReturnedExpression

```rust
pub fn getAReturnedExpression(self: FunctionDeclaration) -> *Expression;
```
## FunctionDeclaration::getChild

```java
/**
* Gets the `i`th child of this node.
*/
```
```rust
pub fn getChild(self: FunctionDeclaration, i: int) -> Node;
```
## FunctionDeclaration::isGenerator

```java
/**
* Determines whether this FunctionLikeDeclaration is a generator.
*/
```
```rust
pub fn isGenerator(self: FunctionDeclaration) -> bool;
```
## FunctionDeclaration::getParameterCount

```java
/**
* Gets the count of parameters.
*/
```
```rust
pub fn getParameterCount(self: FunctionDeclaration) -> int;
```
## FunctionDeclaration::getAParameter

```java
/**
* Gets a parameter.
*/
```
```rust
pub fn getAParameter(self: FunctionDeclaration) -> *Parameter;
```
## FunctionDeclaration::getNameNode

```java
/**
* Gets the name node, which is a PropertyName.
*/
```
```rust
pub fn getNameNode(self: FunctionDeclaration) -> PropertyName;
```
## FunctionDeclaration::getFile

```java
/**
* Gets the file of this node.
*/
```
```rust
pub fn getFile(self: FunctionDeclaration) -> File;
```
## FunctionDeclaration::hasParameter

```java
/**
* Determine this FunctionLikeDeclaration contains any parameter.
*/
```
```rust
pub fn hasParameter(self: FunctionDeclaration) -> bool;
```
## FunctionDeclaration::getTypeParameterCount

```java
/**
* Gets the count of type parameters.
*/
```
```rust
pub fn getTypeParameterCount(self: FunctionDeclaration) -> int;
```
## FunctionDeclaration::getACallSite

```java
/**
* Gets a call site of this function-like declaration
*/
```
```rust
pub fn getACallSite(self: FunctionDeclaration) -> *MayInvokeExpression;
```
## FunctionDeclaration::getName

```java
/**
* Gets the name of this function-like declaration
*/
```
```rust
pub fn getName(self: FunctionDeclaration) -> string;
```
## FunctionDeclaration::getTypeParameterFirstIndex

```rust
pub fn getTypeParameterFirstIndex(self: FunctionDeclaration) -> int;
```
## FunctionDeclaration::getParameterFirstIndex

```rust
pub fn getParameterFirstIndex(self: FunctionDeclaration) -> int;
```
## FunctionDeclaration::getParentOid

```java
/**
* Gets the parent oid of this node.
*/
```
```rust
pub fn getParentOid(self: FunctionDeclaration) -> int;
```
## FunctionDeclaration::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: FunctionDeclaration) -> int;
```
## FunctionDeclaration::getText

```java
/**
* Gets the text of this node.
*/
```
```rust
pub fn getText(self: FunctionDeclaration) -> string;
```
## FunctionDeclaration::getParameter

```java
/**
* Gets the `i`th parameter.
*/
```
```rust
pub fn getParameter(self: FunctionDeclaration, i: int) -> Parameter;
```
## FunctionDeclaration::getLastChild

```java
/**
* Gets the last child of this node parent.
*/
```
```rust
pub fn getLastChild(self: FunctionDeclaration) -> Node;
```
## FunctionDeclaration::getChildCount

```java
/**
* Gets the number of child nodes.
*/
```
```rust
pub fn getChildCount(self: FunctionDeclaration) -> int;
```
## FunctionDeclaration::getATypeParameter

```java
/**
* Gets a type parameter.
*/
```
```rust
pub fn getATypeParameter(self: FunctionDeclaration) -> *TypeParameter;
```
## FunctionDeclaration::getAnAncestorByLevel

```java
/**
* Gets an ancestor of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getAnAncestorByLevel(self: FunctionDeclaration, level: int) -> Node;
```
## FunctionDeclaration::getTypeNode

```java
/**
* Gets the type node.
*/
```
```rust
pub fn getTypeNode(self: FunctionDeclaration) -> TypeNode;
```
## FunctionDeclaration::getADescendantByLevel

```java
/**
* Gets a descendant of this node by the level of the hierarchy.
*
* @param level: the number of levels to go up in the hierarchy.
*/
```
```rust
pub fn getADescendantByLevel(self: FunctionDeclaration, level: int) -> *Node;
```
## FunctionDeclaration::getEndLineNumber

```rust
pub fn getEndLineNumber(self: FunctionDeclaration) -> int;
```
## FunctionDeclaration::getRelativePath

```java
/**
* Gets the relative path of this node.
*/
```
```rust
pub fn getRelativePath(self: FunctionDeclaration) -> string;
```
## FunctionDeclaration::getAnAncestorEnclosingFunction

```java
/**
* Gets an ancestor enclosing function of it
*/
```
```rust
pub fn getAnAncestorEnclosingFunction(self: FunctionDeclaration) -> *FunctionLikeDeclaration;
```
## FunctionDeclaration::getStartLineNumber

```rust
pub fn getStartLineNumber(self: FunctionDeclaration) -> int;
```
## FunctionDeclaration::getModifierCount

```java
/**
* Gets the number of modifiers of this FunctionLikeDeclaration.
*/
```
```rust
pub fn getModifierCount(self: FunctionDeclaration) -> int;
```
## FunctionDeclaration::getIndex

```rust
pub fn getIndex(self: FunctionDeclaration) -> int;
```
## FunctionDeclaration::getALeadingComment

```java
/**
* Gets the leading comments of it
*/
```
```rust
pub fn getALeadingComment(self: FunctionDeclaration) -> *Comment;
```
## FunctionDeclaration::getEnclosingFunction

```java
/**
* Gets the enclosing function of it
*/
```
```rust
pub fn getEnclosingFunction(self: FunctionDeclaration) -> FunctionLikeDeclaration;
```
## FunctionDeclaration::getSymbol

```java
/**
* Gets the symbol associated with this node.
*/
```
```rust
pub fn getSymbol(self: FunctionDeclaration) -> Symbol;
```
## FunctionDeclaration::getAChild

```java
/**
* Gets a child node of this node.
*/
```
```rust
pub fn getAChild(self: FunctionDeclaration) -> *Node;
```
## FunctionDeclaration::getParent

```java
/**
* Gets the parent node of this node.
*/
```
```rust
pub fn getParent(self: FunctionDeclaration) -> Node;
```
## FunctionDeclaration::getAnAncestor

```java
/**
* Gets an ancestor of this node. 
*/
```
```rust
pub fn getAnAncestor(self: FunctionDeclaration) -> *Node;
```
## FunctionDeclaration::getAComment

```java
/**
* Gets the comments related to it
*/
```
```rust
pub fn getAComment(self: FunctionDeclaration) -> *Comment;
```
## FunctionDeclaration::\_\_all\_\_

Data constraint method.

```rust
pub fn __all__(db: JavascriptDB) -> *FunctionDeclaration;
```
## FunctionDeclaration::getLocation

```java
/**
* Gets the location of this node.
*/
```
```rust
pub fn getLocation(self: FunctionDeclaration) -> Location;
```
## FunctionDeclaration::getADescendant

```java
/**
* Gets a descendant of this node. 
*/
```
```rust
pub fn getADescendant(self: FunctionDeclaration) -> *Node;
```
