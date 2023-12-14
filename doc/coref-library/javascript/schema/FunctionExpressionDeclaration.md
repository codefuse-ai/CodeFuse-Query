# FunctionExpressionDeclaration

Primary key: `id: int`

```rust
schema FunctionExpressionDeclaration {
  @primary id: int,
}
```
## FunctionExpressionDeclaration::getModifier

```rust
/**
     * Gets the `i`th modifier of this FunctionLikeDeclaration.
     */
```
```rust
pub fn getModifier(self: FunctionExpressionDeclaration, i: int) -> Modifier;
```
## FunctionExpressionDeclaration::getKind

```rust
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

```rust
/**
     * Gets the `i`th type parameter.
     */
```
```rust
pub fn getTypeParameter(self: FunctionExpressionDeclaration, i: int) -> TypeParameter;
```
## FunctionExpressionDeclaration::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: FunctionExpressionDeclaration) -> *Comment;
```
## FunctionExpressionDeclaration::getBody

```rust
/**
     * Gets the body of this function-like declaration
     */
```
```rust
pub fn getBody(self: FunctionExpressionDeclaration) -> BlockStatement;
```
## FunctionExpressionDeclaration::getDecoratorCount

```rust
/**
     * Gets the number of decorators of this FunctionLikeDeclaration.
     */
```
```rust
pub fn getDecoratorCount(self: FunctionExpressionDeclaration) -> int;
```
## FunctionExpressionDeclaration::getAModifier

```rust
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

```rust
/**
     * Gets the `i`th decorator of this FunctionLikeDeclaration.
     */
```
```rust
pub fn getDecorator(self: FunctionExpressionDeclaration, i: int) -> Decorator;
```
## FunctionExpressionDeclaration::getADecorator

```rust
/**
     * Gets a decorator of this FunctionLikeDeclaration.
     */
```
```rust
pub fn getADecorator(self: FunctionExpressionDeclaration) -> *Decorator;
```
## FunctionExpressionDeclaration::getCyclomaticComplexity

```rust
/**
     * Gets the cyclomatic complexity of this function-like declaration
     */
```
```rust
pub fn getCyclomaticComplexity(self: FunctionExpressionDeclaration) -> int;
```
## FunctionExpressionDeclaration::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: FunctionExpressionDeclaration) -> TopLevelDO;
```
## FunctionExpressionDeclaration::getAReturnedExpression

```rust
// TODO: the body of an ArrowFunction is the returned expression if it is an expression
```
```rust
pub fn getAReturnedExpression(self: FunctionExpressionDeclaration) -> *Expression;
```
## FunctionExpressionDeclaration::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: FunctionExpressionDeclaration, i: int) -> Node;
```
## FunctionExpressionDeclaration::isGenerator

```rust
/**
     * Determines whether this FunctionLikeDeclaration is a generator.
     */
```
```rust
pub fn isGenerator(self: FunctionExpressionDeclaration) -> bool;
```
## FunctionExpressionDeclaration::getParameterCount

```rust
/**
     * Gets the count of parameters.
     */
```
```rust
pub fn getParameterCount(self: FunctionExpressionDeclaration) -> int;
```
## FunctionExpressionDeclaration::getAParameter

```rust
/**
     * Gets a parameter.
     */
```
```rust
pub fn getAParameter(self: FunctionExpressionDeclaration) -> *Parameter;
```
## FunctionExpressionDeclaration::getNameNode

```rust
/**
     * Gets the name node, which is a PropertyName.
     */
```
```rust
pub fn getNameNode(self: FunctionExpressionDeclaration) -> PropertyName;
```
## FunctionExpressionDeclaration::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: FunctionExpressionDeclaration) -> File;
```
## FunctionExpressionDeclaration::hasParameter

```rust
/**
     * Determine this FunctionLikeDeclaration contains any parameter.
     */
```
```rust
pub fn hasParameter(self: FunctionExpressionDeclaration) -> bool;
```
## FunctionExpressionDeclaration::getTypeParameterCount

```rust
/**
     * Gets the count of type parameters.
     */
```
```rust
pub fn getTypeParameterCount(self: FunctionExpressionDeclaration) -> int;
```
## FunctionExpressionDeclaration::getACallSite

```rust
/**
     * Gets a call site of this function-like declaration
     */
```
```rust
pub fn getACallSite(self: FunctionExpressionDeclaration) -> *MayInvokeExpression;
```
## FunctionExpressionDeclaration::getName

```rust
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

```rust
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

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: FunctionExpressionDeclaration) -> string;
```
## FunctionExpressionDeclaration::getParameter

```rust
/**
     * Gets the `i`th parameter.
     */
```
```rust
pub fn getParameter(self: FunctionExpressionDeclaration, i: int) -> Parameter;
```
## FunctionExpressionDeclaration::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: FunctionExpressionDeclaration) -> Node;
```
## FunctionExpressionDeclaration::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: FunctionExpressionDeclaration) -> int;
```
## FunctionExpressionDeclaration::getATypeParameter

```rust
/**
     * Gets a type parameter.
     */
```
```rust
pub fn getATypeParameter(self: FunctionExpressionDeclaration) -> *TypeParameter;
```
## FunctionExpressionDeclaration::getAnAncestorByLevel

```rust
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

```rust
/**
     * Gets the type node.
     */
```
```rust
pub fn getTypeNode(self: FunctionExpressionDeclaration) -> TypeNode;
```
## FunctionExpressionDeclaration::getADescendantByLevel

```rust
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

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: FunctionExpressionDeclaration) -> string;
```
## FunctionExpressionDeclaration::getAnAncestorEnclosingFunction

```rust
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

```rust
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

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: FunctionExpressionDeclaration) -> *Comment;
```
## FunctionExpressionDeclaration::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: FunctionExpressionDeclaration) -> FunctionLikeDeclaration;
```
## FunctionExpressionDeclaration::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: FunctionExpressionDeclaration) -> Symbol;
```
## FunctionExpressionDeclaration::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: FunctionExpressionDeclaration) -> *Node;
```
## FunctionExpressionDeclaration::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: FunctionExpressionDeclaration) -> Node;
```
## FunctionExpressionDeclaration::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: FunctionExpressionDeclaration) -> *Node;
```
## FunctionExpressionDeclaration::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: FunctionExpressionDeclaration) -> *Comment;
```
## FunctionExpressionDeclaration::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *FunctionExpressionDeclaration;
```
## FunctionExpressionDeclaration::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: FunctionExpressionDeclaration) -> Location;
```
## FunctionExpressionDeclaration::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: FunctionExpressionDeclaration) -> *Node;
```
## FunctionExpressionDeclaration::is\<T\>

```rust
pub fn is<T>(self: FunctionExpressionDeclaration) -> bool;
```
## FunctionExpressionDeclaration::to\<T\>

```rust
pub fn to<T>(self: FunctionExpressionDeclaration) -> <any>;
```
## FunctionExpressionDeclaration::key\_neq

```rust
pub fn key_neq(self: FunctionExpressionDeclaration, object: <any>) -> bool;
```
## FunctionExpressionDeclaration::key\_eq

```rust
pub fn key_eq(self: FunctionExpressionDeclaration, object: <any>) -> bool;
```
## FunctionExpressionDeclaration::to\_set

```rust
pub fn to_set(self: FunctionExpressionDeclaration) -> *FunctionExpressionDeclaration;
```
