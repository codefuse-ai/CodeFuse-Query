# SetAccessor

Primary key: `id: int`

```rust
schema SetAccessor {
  @primary id: int,
}
```
## SetAccessor::getModifier

```rust
/**
     * Gets the `i`th modifier of this FunctionLikeDeclaration.
     */
```
```rust
pub fn getModifier(self: SetAccessor, i: int) -> Modifier;
```
## SetAccessor::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: SetAccessor) -> int;
```
## SetAccessor::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: SetAccessor) -> int;
```
## SetAccessor::getTypeParameter

```rust
/**
     * Gets the `i`th type parameter.
     */
```
```rust
pub fn getTypeParameter(self: SetAccessor, i: int) -> TypeParameter;
```
## SetAccessor::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: SetAccessor) -> *Comment;
```
## SetAccessor::getBody

```rust
/**
     * Gets the body of this function-like declaration
     */
```
```rust
pub fn getBody(self: SetAccessor) -> BlockStatement;
```
## SetAccessor::getDecoratorCount

```rust
/**
     * Gets the number of decorators of this FunctionLikeDeclaration.
     */
```
```rust
pub fn getDecoratorCount(self: SetAccessor) -> int;
```
## SetAccessor::getAModifier

```rust
/**
     * Gets a modifier of this FunctionLikeDeclaration.
     */
```
```rust
pub fn getAModifier(self: SetAccessor) -> *Modifier;
```
## SetAccessor::getAReturnStatement

```rust
pub fn getAReturnStatement(self: SetAccessor) -> *ReturnStatement;
```
## SetAccessor::getDecorator

```rust
/**
     * Gets the `i`th decorator of this FunctionLikeDeclaration.
     */
```
```rust
pub fn getDecorator(self: SetAccessor, i: int) -> Decorator;
```
## SetAccessor::getADecorator

```rust
/**
     * Gets a decorator of this FunctionLikeDeclaration.
     */
```
```rust
pub fn getADecorator(self: SetAccessor) -> *Decorator;
```
## SetAccessor::getCyclomaticComplexity

```rust
/**
     * Gets the cyclomatic complexity of this function-like declaration
     */
```
```rust
pub fn getCyclomaticComplexity(self: SetAccessor) -> int;
```
## SetAccessor::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: SetAccessor) -> TopLevelDO;
```
## SetAccessor::getAReturnedExpression

```rust
// TODO: the body of an ArrowFunction is the returned expression if it is an expression
```
```rust
pub fn getAReturnedExpression(self: SetAccessor) -> *Expression;
```
## SetAccessor::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: SetAccessor, i: int) -> Node;
```
## SetAccessor::isGenerator

```rust
/**
     * Determines whether this FunctionLikeDeclaration is a generator.
     */
```
```rust
pub fn isGenerator(self: SetAccessor) -> bool;
```
## SetAccessor::getParameterCount

```rust
/**
     * Gets the count of parameters.
     */
```
```rust
pub fn getParameterCount(self: SetAccessor) -> int;
```
## SetAccessor::getAParameter

```rust
/**
     * Gets a parameter.
     */
```
```rust
pub fn getAParameter(self: SetAccessor) -> *Parameter;
```
## SetAccessor::getNameNode

```rust
/**
     * Gets the name node, which is a PropertyName.
     */
```
```rust
pub fn getNameNode(self: SetAccessor) -> PropertyName;
```
## SetAccessor::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: SetAccessor) -> File;
```
## SetAccessor::hasParameter

```rust
/**
     * Determine this FunctionLikeDeclaration contains any parameter.
     */
```
```rust
pub fn hasParameter(self: SetAccessor) -> bool;
```
## SetAccessor::getTypeParameterCount

```rust
/**
     * Gets the count of type parameters.
     */
```
```rust
pub fn getTypeParameterCount(self: SetAccessor) -> int;
```
## SetAccessor::getACallSite

```rust
/**
     * Gets a call site of this function-like declaration
     */
```
```rust
pub fn getACallSite(self: SetAccessor) -> *MayInvokeExpression;
```
## SetAccessor::getName

```rust
/**
     * Gets the name of this function-like declaration
     */
```
```rust
pub fn getName(self: SetAccessor) -> string;
```
## SetAccessor::getTypeParameterFirstIndex

```rust
pub fn getTypeParameterFirstIndex(self: SetAccessor) -> int;
```
## SetAccessor::getParameterFirstIndex

```rust
pub fn getParameterFirstIndex(self: SetAccessor) -> int;
```
## SetAccessor::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: SetAccessor) -> int;
```
## SetAccessor::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: SetAccessor) -> int;
```
## SetAccessor::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: SetAccessor) -> string;
```
## SetAccessor::getParameter

```rust
/**
     * Gets the `i`th parameter.
     */
```
```rust
pub fn getParameter(self: SetAccessor, i: int) -> Parameter;
```
## SetAccessor::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: SetAccessor) -> Node;
```
## SetAccessor::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: SetAccessor) -> int;
```
## SetAccessor::getATypeParameter

```rust
/**
     * Gets a type parameter.
     */
```
```rust
pub fn getATypeParameter(self: SetAccessor) -> *TypeParameter;
```
## SetAccessor::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: SetAccessor, level: int) -> Node;
```
## SetAccessor::getTypeNode

```rust
/**
     * Gets the type node.
     */
```
```rust
pub fn getTypeNode(self: SetAccessor) -> TypeNode;
```
## SetAccessor::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: SetAccessor, level: int) -> *Node;
```
## SetAccessor::getEndLineNumber

```rust
pub fn getEndLineNumber(self: SetAccessor) -> int;
```
## SetAccessor::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: SetAccessor) -> string;
```
## SetAccessor::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: SetAccessor) -> *FunctionLikeDeclaration;
```
## SetAccessor::getStartLineNumber

```rust
pub fn getStartLineNumber(self: SetAccessor) -> int;
```
## SetAccessor::getModifierCount

```rust
/**
     * Gets the number of modifiers of this FunctionLikeDeclaration.
     */
```
```rust
pub fn getModifierCount(self: SetAccessor) -> int;
```
## SetAccessor::getIndex

```rust
pub fn getIndex(self: SetAccessor) -> int;
```
## SetAccessor::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: SetAccessor) -> *Comment;
```
## SetAccessor::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: SetAccessor) -> FunctionLikeDeclaration;
```
## SetAccessor::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: SetAccessor) -> Symbol;
```
## SetAccessor::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: SetAccessor) -> *Node;
```
## SetAccessor::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: SetAccessor) -> Node;
```
## SetAccessor::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: SetAccessor) -> *Node;
```
## SetAccessor::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: SetAccessor) -> *Comment;
```
## SetAccessor::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *SetAccessor;
```
## SetAccessor::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: SetAccessor) -> Location;
```
## SetAccessor::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: SetAccessor) -> *Node;
```
## SetAccessor::is\<T\>

```rust
pub fn is<T>(self: SetAccessor) -> bool;
```
## SetAccessor::to\<T\>

```rust
pub fn to<T>(self: SetAccessor) -> <any>;
```
## SetAccessor::key\_neq

```rust
pub fn key_neq(self: SetAccessor, object: <any>) -> bool;
```
## SetAccessor::key\_eq

```rust
pub fn key_eq(self: SetAccessor, object: <any>) -> bool;
```
## SetAccessor::to\_set

```rust
pub fn to_set(self: SetAccessor) -> *SetAccessor;
```
