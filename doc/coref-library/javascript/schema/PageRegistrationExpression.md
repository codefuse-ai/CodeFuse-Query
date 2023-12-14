# PageRegistrationExpression

Primary key: `id: int`

```rust
schema PageRegistrationExpression {
  @primary id: int,
}
```
## PageRegistrationExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: PageRegistrationExpression) -> Node;
```
## PageRegistrationExpression::getExpression

```rust
pub fn getExpression(self: PageRegistrationExpression) -> LeftHandSideExpression;
```
## PageRegistrationExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: PageRegistrationExpression) -> string;
```
## PageRegistrationExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: PageRegistrationExpression) -> int;
```
## PageRegistrationExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: PageRegistrationExpression) -> Location;
```
## PageRegistrationExpression::getQuestionDotToken

```rust
/**
     * Gets the `?.` token of this call expression.
     */
```
```rust
pub fn getQuestionDotToken(self: PageRegistrationExpression) -> QuestionDotToken;
```
## PageRegistrationExpression::getATypeArgument

```rust
/**
     * Gets a type argument of this call expression.
     */
```
```rust
pub fn getATypeArgument(self: PageRegistrationExpression) -> *TypeNode;
```
## PageRegistrationExpression::getTypeArgumentCount

```rust
/**
     * Gets the count of the type arguments.
     */
```
```rust
pub fn getTypeArgumentCount(self: PageRegistrationExpression) -> int;
```
## PageRegistrationExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: PageRegistrationExpression, level: int) -> *Node;
```
## PageRegistrationExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: PageRegistrationExpression) -> *FunctionLikeDeclaration;
```
## PageRegistrationExpression::getArgument

```rust
/**
     * Gets the `i`th argument of this call expression.
     * index from 0
     */
```
```rust
pub fn getArgument(self: PageRegistrationExpression, i: int) -> Expression;
```
## PageRegistrationExpression::getAnArgument

```rust
/**
     * Gets an argument of this call expression.
     */
```
```rust
pub fn getAnArgument(self: PageRegistrationExpression) -> *Expression;
```
## PageRegistrationExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: PageRegistrationExpression, i: int) -> Node;
```
## PageRegistrationExpression::getCallee

```rust
/**
     * Gets the callee of this call expression.
     */
```
```rust
pub fn getCallee(self: PageRegistrationExpression) -> FunctionLikeDeclaration;
```
## PageRegistrationExpression::getArgumentCount

```rust
/**
     * Gets the count of the arguments.
     */
```
```rust
pub fn getArgumentCount(self: PageRegistrationExpression) -> int;
```
## PageRegistrationExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: PageRegistrationExpression) -> string;
```
## PageRegistrationExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: PageRegistrationExpression, i: int) -> Modifier;
```
## PageRegistrationExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: PageRegistrationExpression) -> *Decorator;
```
## PageRegistrationExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: PageRegistrationExpression) -> Symbol;
```
## PageRegistrationExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: PageRegistrationExpression) -> *Node;
```
## PageRegistrationExpression::getTypeArgument

```rust
/**
     * Gets the `i`th type argument of this call expression.
     */
```
```rust
pub fn getTypeArgument(self: PageRegistrationExpression, i: int) -> TypeNode;
```
## PageRegistrationExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: PageRegistrationExpression) -> *Comment;
```
## PageRegistrationExpression::hasCallee

```rust
/**
     * Determine whether this CallExpression has a callee.
     */
```
```rust
pub fn hasCallee(self: PageRegistrationExpression) -> bool;
```
## PageRegistrationExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: PageRegistrationExpression) -> Node;
```
## PageRegistrationExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: PageRegistrationExpression) -> *Node;
```
## PageRegistrationExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: PageRegistrationExpression) -> int;
```
## PageRegistrationExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: PageRegistrationExpression) -> TopLevelDO;
```
## PageRegistrationExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: PageRegistrationExpression, i: int) -> Decorator;
```
## PageRegistrationExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: PageRegistrationExpression) -> *Modifier;
```
## PageRegistrationExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: PageRegistrationExpression) -> int;
```
## PageRegistrationExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: PageRegistrationExpression) -> int;
```
## PageRegistrationExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: PageRegistrationExpression) -> int;
```
## PageRegistrationExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: PageRegistrationExpression) -> FunctionLikeDeclaration;
```
## PageRegistrationExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: PageRegistrationExpression) -> *Comment;
```
## PageRegistrationExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: PageRegistrationExpression) -> *Comment;
```
## PageRegistrationExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: PageRegistrationExpression) -> int;
```
## PageRegistrationExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: PageRegistrationExpression, level: int) -> Node;
```
## PageRegistrationExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: PageRegistrationExpression) -> File;
```
## PageRegistrationExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: PageRegistrationExpression) -> int;
```
## PageRegistrationExpression::getIndex

```rust
pub fn getIndex(self: PageRegistrationExpression) -> int;
```
## PageRegistrationExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: PageRegistrationExpression) -> *Node;
```
## PageRegistrationExpression::isOptionalChaining

```rust
/**
     * Determines whether this call expression is optional chaining, which means it has a `?.` token.
     */
```
```rust
pub fn isOptionalChaining(self: PageRegistrationExpression) -> bool;
```
## PageRegistrationExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *PageRegistrationExpression;
```
## PageRegistrationExpression::is\<T\>

```rust
pub fn is<T>(self: PageRegistrationExpression) -> bool;
```
## PageRegistrationExpression::to\<T\>

```rust
pub fn to<T>(self: PageRegistrationExpression) -> <any>;
```
## PageRegistrationExpression::key\_neq

```rust
pub fn key_neq(self: PageRegistrationExpression, object: <any>) -> bool;
```
## PageRegistrationExpression::key\_eq

```rust
pub fn key_eq(self: PageRegistrationExpression, object: <any>) -> bool;
```
## PageRegistrationExpression::to\_set

```rust
pub fn to_set(self: PageRegistrationExpression) -> *PageRegistrationExpression;
```
