# ApiCallExpression

Primary key: `id: int`

```rust
schema ApiCallExpression {
  @primary id: int,
}
```
## ApiCallExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: ApiCallExpression) -> Node;
```
## ApiCallExpression::getExpression

```rust
pub fn getExpression(self: ApiCallExpression) -> LeftHandSideExpression;
```
## ApiCallExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: ApiCallExpression) -> string;
```
## ApiCallExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ApiCallExpression) -> int;
```
## ApiCallExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: ApiCallExpression) -> Location;
```
## ApiCallExpression::getQuestionDotToken

```rust
/**
     * Gets the `?.` token of this call expression.
     */
```
```rust
pub fn getQuestionDotToken(self: ApiCallExpression) -> QuestionDotToken;
```
## ApiCallExpression::getATypeArgument

```rust
/**
     * Gets a type argument of this call expression.
     */
```
```rust
pub fn getATypeArgument(self: ApiCallExpression) -> *TypeNode;
```
## ApiCallExpression::getTypeArgumentCount

```rust
/**
     * Gets the count of the type arguments.
     */
```
```rust
pub fn getTypeArgumentCount(self: ApiCallExpression) -> int;
```
## ApiCallExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: ApiCallExpression, level: int) -> *Node;
```
## ApiCallExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ApiCallExpression) -> *FunctionLikeDeclaration;
```
## ApiCallExpression::getArgument

```rust
/**
     * Gets the `i`th argument of this call expression.
     * index from 0
     */
```
```rust
pub fn getArgument(self: ApiCallExpression, i: int) -> Expression;
```
## ApiCallExpression::getAnArgument

```rust
/**
     * Gets an argument of this call expression.
     */
```
```rust
pub fn getAnArgument(self: ApiCallExpression) -> *Expression;
```
## ApiCallExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: ApiCallExpression, i: int) -> Node;
```
## ApiCallExpression::getCallee

```rust
/**
     * Gets the callee of this call expression.
     */
```
```rust
pub fn getCallee(self: ApiCallExpression) -> FunctionLikeDeclaration;
```
## ApiCallExpression::getArgumentCount

```rust
/**
     * Gets the count of the arguments.
     */
```
```rust
pub fn getArgumentCount(self: ApiCallExpression) -> int;
```
## ApiCallExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: ApiCallExpression) -> string;
```
## ApiCallExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: ApiCallExpression, i: int) -> Modifier;
```
## ApiCallExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: ApiCallExpression) -> *Decorator;
```
## ApiCallExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: ApiCallExpression) -> Symbol;
```
## ApiCallExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: ApiCallExpression) -> *Node;
```
## ApiCallExpression::getTypeArgument

```rust
/**
     * Gets the `i`th type argument of this call expression.
     */
```
```rust
pub fn getTypeArgument(self: ApiCallExpression, i: int) -> TypeNode;
```
## ApiCallExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: ApiCallExpression) -> *Comment;
```
## ApiCallExpression::hasCallee

```rust
/**
     * Determine whether this CallExpression has a callee.
     */
```
```rust
pub fn hasCallee(self: ApiCallExpression) -> bool;
```
## ApiCallExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: ApiCallExpression) -> Node;
```
## ApiCallExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: ApiCallExpression) -> *Node;
```
## ApiCallExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: ApiCallExpression) -> int;
```
## ApiCallExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: ApiCallExpression) -> TopLevelDO;
```
## ApiCallExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: ApiCallExpression, i: int) -> Decorator;
```
## ApiCallExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: ApiCallExpression) -> *Modifier;
```
## ApiCallExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ApiCallExpression) -> int;
```
## ApiCallExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: ApiCallExpression) -> int;
```
## ApiCallExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ApiCallExpression) -> int;
```
## ApiCallExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: ApiCallExpression) -> FunctionLikeDeclaration;
```
## ApiCallExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: ApiCallExpression) -> *Comment;
```
## ApiCallExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: ApiCallExpression) -> *Comment;
```
## ApiCallExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ApiCallExpression) -> int;
```
## ApiCallExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: ApiCallExpression, level: int) -> Node;
```
## ApiCallExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: ApiCallExpression) -> File;
```
## ApiCallExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: ApiCallExpression) -> int;
```
## ApiCallExpression::getIndex

```rust
pub fn getIndex(self: ApiCallExpression) -> int;
```
## ApiCallExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: ApiCallExpression) -> *Node;
```
## ApiCallExpression::isOptionalChaining

```rust
/**
     * Determines whether this call expression is optional chaining, which means it has a `?.` token.
     */
```
```rust
pub fn isOptionalChaining(self: ApiCallExpression) -> bool;
```
## ApiCallExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *ApiCallExpression;
```
## ApiCallExpression::is\<T\>

```rust
pub fn is<T>(self: ApiCallExpression) -> bool;
```
## ApiCallExpression::to\<T\>

```rust
pub fn to<T>(self: ApiCallExpression) -> <any>;
```
## ApiCallExpression::key\_neq

```rust
pub fn key_neq(self: ApiCallExpression, object: <any>) -> bool;
```
## ApiCallExpression::key\_eq

```rust
pub fn key_eq(self: ApiCallExpression, object: <any>) -> bool;
```
## ApiCallExpression::to\_set

```rust
pub fn to_set(self: ApiCallExpression) -> *ApiCallExpression;
```
