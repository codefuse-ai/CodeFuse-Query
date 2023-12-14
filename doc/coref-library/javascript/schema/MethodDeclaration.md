# MethodDeclaration

Primary key: `id: int`

```rust
schema MethodDeclaration {
  @primary id: int,
}
```
## MethodDeclaration::getModifier

```rust
/**
     * Gets the `i`th modifier of this FunctionLikeDeclaration.
     */
```
```rust
pub fn getModifier(self: MethodDeclaration, i: int) -> Modifier;
```
## MethodDeclaration::getKind

```rust
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

```rust
/**
     * Gets the `i`th type parameter.
     */
```
```rust
pub fn getTypeParameter(self: MethodDeclaration, i: int) -> TypeParameter;
```
## MethodDeclaration::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: MethodDeclaration) -> *Comment;
```
## MethodDeclaration::getBody

```rust
/**
     * Gets the body of this function-like declaration
     */
```
```rust
pub fn getBody(self: MethodDeclaration) -> BlockStatement;
```
## MethodDeclaration::getDecoratorCount

```rust
/**
     * Gets the number of decorators of this FunctionLikeDeclaration.
     */
```
```rust
pub fn getDecoratorCount(self: MethodDeclaration) -> int;
```
## MethodDeclaration::getAModifier

```rust
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

```rust
/**
     * Gets the `i`th decorator of this FunctionLikeDeclaration.
     */
```
```rust
pub fn getDecorator(self: MethodDeclaration, i: int) -> Decorator;
```
## MethodDeclaration::getADecorator

```rust
/**
     * Gets a decorator of this FunctionLikeDeclaration.
     */
```
```rust
pub fn getADecorator(self: MethodDeclaration) -> *Decorator;
```
## MethodDeclaration::getCyclomaticComplexity

```rust
/**
     * Gets the cyclomatic complexity of this function-like declaration
     */
```
```rust
pub fn getCyclomaticComplexity(self: MethodDeclaration) -> int;
```
## MethodDeclaration::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: MethodDeclaration) -> TopLevelDO;
```
## MethodDeclaration::getAReturnedExpression

```rust
// TODO: the body of an ArrowFunction is the returned expression if it is an expression
```
```rust
pub fn getAReturnedExpression(self: MethodDeclaration) -> *Expression;
```
## MethodDeclaration::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: MethodDeclaration, i: int) -> Node;
```
## MethodDeclaration::isGenerator

```rust
/**
     * Determines whether this FunctionLikeDeclaration is a generator.
     */
```
```rust
pub fn isGenerator(self: MethodDeclaration) -> bool;
```
## MethodDeclaration::getParameterCount

```rust
/**
     * Gets the count of parameters.
     */
```
```rust
pub fn getParameterCount(self: MethodDeclaration) -> int;
```
## MethodDeclaration::getAParameter

```rust
/**
     * Gets a parameter.
     */
```
```rust
pub fn getAParameter(self: MethodDeclaration) -> *Parameter;
```
## MethodDeclaration::getNameNode

```rust
/**
     * Gets the name node, which is a PropertyName.
     */
```
```rust
pub fn getNameNode(self: MethodDeclaration) -> PropertyName;
```
## MethodDeclaration::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: MethodDeclaration) -> File;
```
## MethodDeclaration::hasParameter

```rust
/**
     * Determine this FunctionLikeDeclaration contains any parameter.
     */
```
```rust
pub fn hasParameter(self: MethodDeclaration) -> bool;
```
## MethodDeclaration::getTypeParameterCount

```rust
/**
     * Gets the count of type parameters.
     */
```
```rust
pub fn getTypeParameterCount(self: MethodDeclaration) -> int;
```
## MethodDeclaration::getACallSite

```rust
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

```rust
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

```rust
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

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: MethodDeclaration) -> string;
```
## MethodDeclaration::getParameter

```rust
/**
     * Gets the `i`th parameter.
     */
```
```rust
pub fn getParameter(self: MethodDeclaration, i: int) -> Parameter;
```
## MethodDeclaration::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: MethodDeclaration) -> Node;
```
## MethodDeclaration::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: MethodDeclaration) -> int;
```
## MethodDeclaration::getATypeParameter

```rust
/**
     * Gets a type parameter.
     */
```
```rust
pub fn getATypeParameter(self: MethodDeclaration) -> *TypeParameter;
```
## MethodDeclaration::getAnAncestorByLevel

```rust
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

```rust
/**
     * Gets the type node.
     */
```
```rust
pub fn getTypeNode(self: MethodDeclaration) -> TypeNode;
```
## MethodDeclaration::getADescendantByLevel

```rust
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

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: MethodDeclaration) -> string;
```
## MethodDeclaration::getAnAncestorEnclosingFunction

```rust
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

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: MethodDeclaration) -> *Comment;
```
## MethodDeclaration::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: MethodDeclaration) -> FunctionLikeDeclaration;
```
## MethodDeclaration::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: MethodDeclaration) -> Symbol;
```
## MethodDeclaration::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: MethodDeclaration) -> *Node;
```
## MethodDeclaration::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: MethodDeclaration) -> Node;
```
## MethodDeclaration::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: MethodDeclaration) -> *Node;
```
## MethodDeclaration::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: MethodDeclaration) -> *Comment;
```
## MethodDeclaration::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: MethodDeclaration) -> *Node;
```
## MethodDeclaration::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: MethodDeclaration) -> Location;
```
## MethodDeclaration::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *MethodDeclaration;
```
## MethodDeclaration::is\<T\>

```rust
pub fn is<T>(self: MethodDeclaration) -> bool;
```
## MethodDeclaration::to\<T\>

```rust
pub fn to<T>(self: MethodDeclaration) -> <any>;
```
## MethodDeclaration::key\_neq

```rust
pub fn key_neq(self: MethodDeclaration, object: <any>) -> bool;
```
## MethodDeclaration::key\_eq

```rust
pub fn key_eq(self: MethodDeclaration, object: <any>) -> bool;
```
## MethodDeclaration::to\_set

```rust
pub fn to_set(self: MethodDeclaration) -> *MethodDeclaration;
```
