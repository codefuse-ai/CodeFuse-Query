# ConstructorDeclaration

Primary key: `id: int`

```rust
schema ConstructorDeclaration {
  @primary id: int,
}
```
## ConstructorDeclaration::getModifier

```rust
/**
     * Gets the `i`th modifier of this FunctionLikeDeclaration.
     */
```
```rust
pub fn getModifier(self: ConstructorDeclaration, i: int) -> Modifier;
```
## ConstructorDeclaration::getKind

```rust
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

```rust
/**
     * Gets the `i`th type parameter.
     */
```
```rust
pub fn getTypeParameter(self: ConstructorDeclaration, i: int) -> TypeParameter;
```
## ConstructorDeclaration::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: ConstructorDeclaration) -> *Comment;
```
## ConstructorDeclaration::getBody

```rust
/**
     * Gets the body of this function-like declaration
     */
```
```rust
pub fn getBody(self: ConstructorDeclaration) -> BlockStatement;
```
## ConstructorDeclaration::getDecoratorCount

```rust
/**
     * Gets the number of decorators of this FunctionLikeDeclaration.
     */
```
```rust
pub fn getDecoratorCount(self: ConstructorDeclaration) -> int;
```
## ConstructorDeclaration::getAModifier

```rust
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

```rust
/**
     * Gets the `i`th decorator of this FunctionLikeDeclaration.
     */
```
```rust
pub fn getDecorator(self: ConstructorDeclaration, i: int) -> Decorator;
```
## ConstructorDeclaration::getADecorator

```rust
/**
     * Gets a decorator of this FunctionLikeDeclaration.
     */
```
```rust
pub fn getADecorator(self: ConstructorDeclaration) -> *Decorator;
```
## ConstructorDeclaration::getCyclomaticComplexity

```rust
/**
     * Gets the cyclomatic complexity of this function-like declaration
     */
```
```rust
pub fn getCyclomaticComplexity(self: ConstructorDeclaration) -> int;
```
## ConstructorDeclaration::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: ConstructorDeclaration) -> TopLevelDO;
```
## ConstructorDeclaration::getAReturnedExpression

```rust
// TODO: the body of an ArrowFunction is the returned expression if it is an expression
```
```rust
pub fn getAReturnedExpression(self: ConstructorDeclaration) -> *Expression;
```
## ConstructorDeclaration::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: ConstructorDeclaration, i: int) -> Node;
```
## ConstructorDeclaration::isGenerator

```rust
/**
     * Determines whether this FunctionLikeDeclaration is a generator.
     */
```
```rust
pub fn isGenerator(self: ConstructorDeclaration) -> bool;
```
## ConstructorDeclaration::getParameterCount

```rust
/**
     * Gets the count of parameters.
     */
```
```rust
pub fn getParameterCount(self: ConstructorDeclaration) -> int;
```
## ConstructorDeclaration::getAParameter

```rust
/**
     * Gets a parameter.
     */
```
```rust
pub fn getAParameter(self: ConstructorDeclaration) -> *Parameter;
```
## ConstructorDeclaration::getNameNode

```rust
/**
     * Gets the name node, which is a PropertyName.
     */
```
```rust
pub fn getNameNode(self: ConstructorDeclaration) -> PropertyName;
```
## ConstructorDeclaration::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: ConstructorDeclaration) -> File;
```
## ConstructorDeclaration::hasParameter

```rust
/**
     * Determine this FunctionLikeDeclaration contains any parameter.
     */
```
```rust
pub fn hasParameter(self: ConstructorDeclaration) -> bool;
```
## ConstructorDeclaration::getTypeParameterCount

```rust
/**
     * Gets the count of type parameters.
     */
```
```rust
pub fn getTypeParameterCount(self: ConstructorDeclaration) -> int;
```
## ConstructorDeclaration::getACallSite

```rust
/**
     * Gets a call site of this function-like declaration
     */
```
```rust
pub fn getACallSite(self: ConstructorDeclaration) -> *MayInvokeExpression;
```
## ConstructorDeclaration::getName

```rust
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

```rust
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

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: ConstructorDeclaration) -> string;
```
## ConstructorDeclaration::getParameter

```rust
/**
     * Gets the `i`th parameter.
     */
```
```rust
pub fn getParameter(self: ConstructorDeclaration, i: int) -> Parameter;
```
## ConstructorDeclaration::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: ConstructorDeclaration) -> Node;
```
## ConstructorDeclaration::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: ConstructorDeclaration) -> int;
```
## ConstructorDeclaration::getATypeParameter

```rust
/**
     * Gets a type parameter.
     */
```
```rust
pub fn getATypeParameter(self: ConstructorDeclaration) -> *TypeParameter;
```
## ConstructorDeclaration::getAnAncestorByLevel

```rust
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

```rust
/**
     * Gets the type node.
     */
```
```rust
pub fn getTypeNode(self: ConstructorDeclaration) -> TypeNode;
```
## ConstructorDeclaration::getADescendantByLevel

```rust
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

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: ConstructorDeclaration) -> string;
```
## ConstructorDeclaration::getAnAncestorEnclosingFunction

```rust
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

```rust
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

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: ConstructorDeclaration) -> *Comment;
```
## ConstructorDeclaration::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: ConstructorDeclaration) -> FunctionLikeDeclaration;
```
## ConstructorDeclaration::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: ConstructorDeclaration) -> Symbol;
```
## ConstructorDeclaration::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: ConstructorDeclaration) -> *Node;
```
## ConstructorDeclaration::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: ConstructorDeclaration) -> Node;
```
## ConstructorDeclaration::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: ConstructorDeclaration) -> *Node;
```
## ConstructorDeclaration::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: ConstructorDeclaration) -> *Comment;
```
## ConstructorDeclaration::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *ConstructorDeclaration;
```
## ConstructorDeclaration::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: ConstructorDeclaration) -> Location;
```
## ConstructorDeclaration::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: ConstructorDeclaration) -> *Node;
```
## ConstructorDeclaration::is\<T\>

```rust
pub fn is<T>(self: ConstructorDeclaration) -> bool;
```
## ConstructorDeclaration::to\<T\>

```rust
pub fn to<T>(self: ConstructorDeclaration) -> <any>;
```
## ConstructorDeclaration::key\_neq

```rust
pub fn key_neq(self: ConstructorDeclaration, object: <any>) -> bool;
```
## ConstructorDeclaration::key\_eq

```rust
pub fn key_eq(self: ConstructorDeclaration, object: <any>) -> bool;
```
## ConstructorDeclaration::to\_set

```rust
pub fn to_set(self: ConstructorDeclaration) -> *ConstructorDeclaration;
```
