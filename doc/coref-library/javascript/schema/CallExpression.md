# CallExpression

Primary key: `id: int`

```rust
schema CallExpression {
  @primary id: int,
}
```
## CallExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: CallExpression) -> *Node;
```
## CallExpression::getIndex

```rust
pub fn getIndex(self: CallExpression) -> int;
```
## CallExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: CallExpression) -> int;
```
## CallExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: CallExpression, level: int) -> Node;
```
## CallExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: CallExpression) -> File;
```
## CallExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: CallExpression) -> int;
```
## CallExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: CallExpression) -> FunctionLikeDeclaration;
```
## CallExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: CallExpression) -> *Comment;
```
## CallExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: CallExpression) -> *Comment;
```
## CallExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: CallExpression) -> int;
```
## CallExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: CallExpression) -> int;
```
## CallExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: CallExpression) -> *Modifier;
```
## CallExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: CallExpression) -> int;
```
## CallExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: CallExpression, i: int) -> Decorator;
```
## CallExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: CallExpression) -> TopLevelDO;
```
## CallExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: CallExpression) -> int;
```
## CallExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: CallExpression) -> Node;
```
## CallExpression::hasCallee

```rust
/**
     * Determine whether this CallExpression has a callee.
     */
```
```rust
pub fn hasCallee(self: CallExpression) -> bool;
```
## CallExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: CallExpression) -> *Node;
```
## CallExpression::getTypeArgument

```rust
/**
     * Gets the `i`th type argument of this call expression.
     */
```
```rust
pub fn getTypeArgument(self: CallExpression, i: int) -> TypeNode;
```
## CallExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: CallExpression) -> *Node;
```
## CallExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: CallExpression) -> *Comment;
```
## CallExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: CallExpression) -> Symbol;
```
## CallExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: CallExpression) -> *Decorator;
```
## CallExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: CallExpression, i: int) -> Modifier;
```
## CallExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: CallExpression) -> string;
```
## CallExpression::getArgumentCount

```rust
/**
     * Gets the count of the arguments.
     */
```
```rust
pub fn getArgumentCount(self: CallExpression) -> int;
```
## CallExpression::getCallee

```rust
/**
     * Gets the callee of this call expression.
     */
```
```rust
pub fn getCallee(self: CallExpression) -> FunctionLikeDeclaration;
```
## CallExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: CallExpression, i: int) -> Node;
```
## CallExpression::getAnArgument

```rust
/**
     * Gets an argument of this call expression.
     */
```
```rust
pub fn getAnArgument(self: CallExpression) -> *Expression;
```
## CallExpression::getArgument

```rust
/**
     * Gets the `i`th argument of this call expression.
     * index from 0
     */
```
```rust
pub fn getArgument(self: CallExpression, i: int) -> Expression;
```
## CallExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: CallExpression) -> *FunctionLikeDeclaration;
```
## CallExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: CallExpression, level: int) -> *Node;
```
## CallExpression::getTypeArgumentCount

```rust
/**
     * Gets the count of the type arguments.
     */
```
```rust
pub fn getTypeArgumentCount(self: CallExpression) -> int;
```
## CallExpression::getATypeArgument

```rust
/**
     * Gets a type argument of this call expression.
     */
```
```rust
pub fn getATypeArgument(self: CallExpression) -> *TypeNode;
```
## CallExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *CallExpression;
```
## CallExpression::isOptionalChaining

```rust
/**
     * Determines whether this call expression is optional chaining, which means it has a `?.` token.
     */
```
```rust
pub fn isOptionalChaining(self: CallExpression) -> bool;
```
## CallExpression::getQuestionDotToken

```rust
/**
     * Gets the `?.` token of this call expression.
     */
```
```rust
pub fn getQuestionDotToken(self: CallExpression) -> QuestionDotToken;
```
## CallExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: CallExpression) -> Location;
```
## CallExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: CallExpression) -> int;
```
## CallExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: CallExpression) -> string;
```
## CallExpression::getExpression

```rust
pub fn getExpression(self: CallExpression) -> LeftHandSideExpression;
```
## CallExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: CallExpression) -> Node;
```
## CallExpression::is\<T\>

```rust
pub fn is<T>(self: CallExpression) -> bool;
```
## CallExpression::to\<T\>

```rust
pub fn to<T>(self: CallExpression) -> <any>;
```
## CallExpression::key\_neq

```rust
pub fn key_neq(self: CallExpression, object: <any>) -> bool;
```
## CallExpression::key\_eq

```rust
pub fn key_eq(self: CallExpression, object: <any>) -> bool;
```
## CallExpression::to\_set

```rust
pub fn to_set(self: CallExpression) -> *CallExpression;
```
