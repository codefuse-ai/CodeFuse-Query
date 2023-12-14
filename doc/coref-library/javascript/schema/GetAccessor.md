# GetAccessor

Primary key: `id: int`

```rust
schema GetAccessor {
  @primary id: int,
}
```
## GetAccessor::getModifier

```rust
/**
     * Gets the `i`th modifier of this FunctionLikeDeclaration.
     */
```
```rust
pub fn getModifier(self: GetAccessor, i: int) -> Modifier;
```
## GetAccessor::getKind

```rust
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

```rust
/**
     * Gets the `i`th type parameter.
     */
```
```rust
pub fn getTypeParameter(self: GetAccessor, i: int) -> TypeParameter;
```
## GetAccessor::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: GetAccessor) -> *Comment;
```
## GetAccessor::getBody

```rust
/**
     * Gets the body of this function-like declaration
     */
```
```rust
pub fn getBody(self: GetAccessor) -> BlockStatement;
```
## GetAccessor::getDecoratorCount

```rust
/**
     * Gets the number of decorators of this FunctionLikeDeclaration.
     */
```
```rust
pub fn getDecoratorCount(self: GetAccessor) -> int;
```
## GetAccessor::getAModifier

```rust
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

```rust
/**
     * Gets the `i`th decorator of this FunctionLikeDeclaration.
     */
```
```rust
pub fn getDecorator(self: GetAccessor, i: int) -> Decorator;
```
## GetAccessor::getADecorator

```rust
/**
     * Gets a decorator of this FunctionLikeDeclaration.
     */
```
```rust
pub fn getADecorator(self: GetAccessor) -> *Decorator;
```
## GetAccessor::getCyclomaticComplexity

```rust
/**
     * Gets the cyclomatic complexity of this function-like declaration
     */
```
```rust
pub fn getCyclomaticComplexity(self: GetAccessor) -> int;
```
## GetAccessor::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: GetAccessor) -> TopLevelDO;
```
## GetAccessor::getAReturnedExpression

```rust
// TODO: the body of an ArrowFunction is the returned expression if it is an expression
```
```rust
pub fn getAReturnedExpression(self: GetAccessor) -> *Expression;
```
## GetAccessor::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: GetAccessor, i: int) -> Node;
```
## GetAccessor::isGenerator

```rust
/**
     * Determines whether this FunctionLikeDeclaration is a generator.
     */
```
```rust
pub fn isGenerator(self: GetAccessor) -> bool;
```
## GetAccessor::getParameterCount

```rust
/**
     * Gets the count of parameters.
     */
```
```rust
pub fn getParameterCount(self: GetAccessor) -> int;
```
## GetAccessor::getAParameter

```rust
/**
     * Gets a parameter.
     */
```
```rust
pub fn getAParameter(self: GetAccessor) -> *Parameter;
```
## GetAccessor::getNameNode

```rust
/**
     * Gets the name node, which is a PropertyName.
     */
```
```rust
pub fn getNameNode(self: GetAccessor) -> PropertyName;
```
## GetAccessor::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: GetAccessor) -> File;
```
## GetAccessor::hasParameter

```rust
/**
     * Determine this FunctionLikeDeclaration contains any parameter.
     */
```
```rust
pub fn hasParameter(self: GetAccessor) -> bool;
```
## GetAccessor::getTypeParameterCount

```rust
/**
     * Gets the count of type parameters.
     */
```
```rust
pub fn getTypeParameterCount(self: GetAccessor) -> int;
```
## GetAccessor::getACallSite

```rust
/**
     * Gets a call site of this function-like declaration
     */
```
```rust
pub fn getACallSite(self: GetAccessor) -> *MayInvokeExpression;
```
## GetAccessor::getName

```rust
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

```rust
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

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: GetAccessor) -> string;
```
## GetAccessor::getParameter

```rust
/**
     * Gets the `i`th parameter.
     */
```
```rust
pub fn getParameter(self: GetAccessor, i: int) -> Parameter;
```
## GetAccessor::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: GetAccessor) -> Node;
```
## GetAccessor::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: GetAccessor) -> int;
```
## GetAccessor::getATypeParameter

```rust
/**
     * Gets a type parameter.
     */
```
```rust
pub fn getATypeParameter(self: GetAccessor) -> *TypeParameter;
```
## GetAccessor::getAnAncestorByLevel

```rust
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

```rust
/**
     * Gets the type node.
     */
```
```rust
pub fn getTypeNode(self: GetAccessor) -> TypeNode;
```
## GetAccessor::getADescendantByLevel

```rust
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

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: GetAccessor) -> string;
```
## GetAccessor::getAnAncestorEnclosingFunction

```rust
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

```rust
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

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: GetAccessor) -> *Comment;
```
## GetAccessor::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: GetAccessor) -> FunctionLikeDeclaration;
```
## GetAccessor::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: GetAccessor) -> Symbol;
```
## GetAccessor::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: GetAccessor) -> *Node;
```
## GetAccessor::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: GetAccessor) -> Node;
```
## GetAccessor::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: GetAccessor) -> *Node;
```
## GetAccessor::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: GetAccessor) -> *Comment;
```
## GetAccessor::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *GetAccessor;
```
## GetAccessor::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: GetAccessor) -> Location;
```
## GetAccessor::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: GetAccessor) -> *Node;
```
## GetAccessor::is\<T\>

```rust
pub fn is<T>(self: GetAccessor) -> bool;
```
## GetAccessor::to\<T\>

```rust
pub fn to<T>(self: GetAccessor) -> <any>;
```
## GetAccessor::key\_neq

```rust
pub fn key_neq(self: GetAccessor, object: <any>) -> bool;
```
## GetAccessor::key\_eq

```rust
pub fn key_eq(self: GetAccessor, object: <any>) -> bool;
```
## GetAccessor::to\_set

```rust
pub fn to_set(self: GetAccessor) -> *GetAccessor;
```
