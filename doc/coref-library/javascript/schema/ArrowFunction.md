# ArrowFunction

Primary key: `id: int`

```rust
schema ArrowFunction {
  @primary id: int,
}
```
## ArrowFunction::getModifier

```rust
/**
     * Gets the `i`th modifier of this FunctionLikeDeclaration.
     */
```
```rust
pub fn getModifier(self: ArrowFunction, i: int) -> Modifier;
```
## ArrowFunction::getKind

```rust
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

```rust
/**
     * Gets the `i`th type parameter.
     */
```
```rust
pub fn getTypeParameter(self: ArrowFunction, i: int) -> TypeParameter;
```
## ArrowFunction::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: ArrowFunction) -> *Comment;
```
## ArrowFunction::getBody

```rust
/**
     * Gets the body of this function-like declaration
     */
```
```rust
pub fn getBody(self: ArrowFunction) -> BlockStatement;
```
## ArrowFunction::getDecoratorCount

```rust
/**
     * Gets the number of decorators of this FunctionLikeDeclaration.
     */
```
```rust
pub fn getDecoratorCount(self: ArrowFunction) -> int;
```
## ArrowFunction::getAModifier

```rust
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

```rust
/**
     * Gets the `i`th decorator of this FunctionLikeDeclaration.
     */
```
```rust
pub fn getDecorator(self: ArrowFunction, i: int) -> Decorator;
```
## ArrowFunction::getADecorator

```rust
/**
     * Gets a decorator of this FunctionLikeDeclaration.
     */
```
```rust
pub fn getADecorator(self: ArrowFunction) -> *Decorator;
```
## ArrowFunction::getCyclomaticComplexity

```rust
/**
     * Gets the cyclomatic complexity of this function-like declaration
     */
```
```rust
pub fn getCyclomaticComplexity(self: ArrowFunction) -> int;
```
## ArrowFunction::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: ArrowFunction) -> TopLevelDO;
```
## ArrowFunction::getAReturnedExpression

```rust
// TODO: the body of an ArrowFunction is the returned expression if it is an expression
```
```rust
pub fn getAReturnedExpression(self: ArrowFunction) -> *Expression;
```
## ArrowFunction::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: ArrowFunction, i: int) -> Node;
```
## ArrowFunction::isGenerator

```rust
/**
     * Determines whether this FunctionLikeDeclaration is a generator.
     */
```
```rust
pub fn isGenerator(self: ArrowFunction) -> bool;
```
## ArrowFunction::getParameterCount

```rust
/**
     * Gets the count of parameters.
     */
```
```rust
pub fn getParameterCount(self: ArrowFunction) -> int;
```
## ArrowFunction::getAParameter

```rust
/**
     * Gets a parameter.
     */
```
```rust
pub fn getAParameter(self: ArrowFunction) -> *Parameter;
```
## ArrowFunction::getNameNode

```rust
/**
     * Gets the name node, which is a PropertyName.
     */
```
```rust
pub fn getNameNode(self: ArrowFunction) -> PropertyName;
```
## ArrowFunction::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: ArrowFunction) -> File;
```
## ArrowFunction::hasParameter

```rust
/**
     * Determine this FunctionLikeDeclaration contains any parameter.
     */
```
```rust
pub fn hasParameter(self: ArrowFunction) -> bool;
```
## ArrowFunction::getTypeParameterCount

```rust
/**
     * Gets the count of type parameters.
     */
```
```rust
pub fn getTypeParameterCount(self: ArrowFunction) -> int;
```
## ArrowFunction::getACallSite

```rust
/**
     * Gets a call site of this function-like declaration
     */
```
```rust
pub fn getACallSite(self: ArrowFunction) -> *MayInvokeExpression;
```
## ArrowFunction::getName

```rust
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

```rust
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

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: ArrowFunction) -> string;
```
## ArrowFunction::getParameter

```rust
/**
     * Gets the `i`th parameter.
     */
```
```rust
pub fn getParameter(self: ArrowFunction, i: int) -> Parameter;
```
## ArrowFunction::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: ArrowFunction) -> Node;
```
## ArrowFunction::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: ArrowFunction) -> int;
```
## ArrowFunction::getATypeParameter

```rust
/**
     * Gets a type parameter.
     */
```
```rust
pub fn getATypeParameter(self: ArrowFunction) -> *TypeParameter;
```
## ArrowFunction::getAnAncestorByLevel

```rust
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

```rust
/**
     * Gets the type node.
     */
```
```rust
pub fn getTypeNode(self: ArrowFunction) -> TypeNode;
```
## ArrowFunction::getADescendantByLevel

```rust
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

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: ArrowFunction) -> string;
```
## ArrowFunction::getAnAncestorEnclosingFunction

```rust
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

```rust
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

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: ArrowFunction) -> *Comment;
```
## ArrowFunction::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: ArrowFunction) -> FunctionLikeDeclaration;
```
## ArrowFunction::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: ArrowFunction) -> Symbol;
```
## ArrowFunction::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: ArrowFunction) -> *Node;
```
## ArrowFunction::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: ArrowFunction) -> Node;
```
## ArrowFunction::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: ArrowFunction) -> *Node;
```
## ArrowFunction::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: ArrowFunction) -> *Comment;
```
## ArrowFunction::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *ArrowFunction;
```
## ArrowFunction::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: ArrowFunction) -> Location;
```
## ArrowFunction::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: ArrowFunction) -> *Node;
```
## ArrowFunction::is\<T\>

```rust
pub fn is<T>(self: ArrowFunction) -> bool;
```
## ArrowFunction::to\<T\>

```rust
pub fn to<T>(self: ArrowFunction) -> <any>;
```
## ArrowFunction::key\_neq

```rust
pub fn key_neq(self: ArrowFunction, object: <any>) -> bool;
```
## ArrowFunction::key\_eq

```rust
pub fn key_eq(self: ArrowFunction, object: <any>) -> bool;
```
## ArrowFunction::to\_set

```rust
pub fn to_set(self: ArrowFunction) -> *ArrowFunction;
```
