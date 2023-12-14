# MiniCallExpression

Primary key: `id: int`

```rust
schema MiniCallExpression {
  @primary id: int,
}
```
## MiniCallExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: MiniCallExpression) -> Node;
```
## MiniCallExpression::getExpression

```rust
pub fn getExpression(self: MiniCallExpression) -> LeftHandSideExpression;
```
## MiniCallExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: MiniCallExpression) -> string;
```
## MiniCallExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: MiniCallExpression) -> int;
```
## MiniCallExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: MiniCallExpression) -> Location;
```
## MiniCallExpression::getQuestionDotToken

```rust
/**
     * Gets the `?.` token of this call expression.
     */
```
```rust
pub fn getQuestionDotToken(self: MiniCallExpression) -> QuestionDotToken;
```
## MiniCallExpression::getATypeArgument

```rust
/**
     * Gets a type argument of this call expression.
     */
```
```rust
pub fn getATypeArgument(self: MiniCallExpression) -> *TypeNode;
```
## MiniCallExpression::getTypeArgumentCount

```rust
/**
     * Gets the count of the type arguments.
     */
```
```rust
pub fn getTypeArgumentCount(self: MiniCallExpression) -> int;
```
## MiniCallExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: MiniCallExpression, level: int) -> *Node;
```
## MiniCallExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: MiniCallExpression) -> *FunctionLikeDeclaration;
```
## MiniCallExpression::getArgument

```rust
/**
     * Gets the `i`th argument of this call expression.
     * index from 0
     */
```
```rust
pub fn getArgument(self: MiniCallExpression, i: int) -> Expression;
```
## MiniCallExpression::getAnArgument

```rust
/**
     * Gets an argument of this call expression.
     */
```
```rust
pub fn getAnArgument(self: MiniCallExpression) -> *Expression;
```
## MiniCallExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: MiniCallExpression, i: int) -> Node;
```
## MiniCallExpression::getArgumentCount

```rust
/**
     * Gets the count of the arguments.
     */
```
```rust
pub fn getArgumentCount(self: MiniCallExpression) -> int;
```
## MiniCallExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: MiniCallExpression) -> string;
```
## MiniCallExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: MiniCallExpression, i: int) -> Modifier;
```
## MiniCallExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: MiniCallExpression) -> *Decorator;
```
## MiniCallExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: MiniCallExpression) -> Symbol;
```
## MiniCallExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: MiniCallExpression) -> *Comment;
```
## MiniCallExpression::getTypeArgument

```rust
/**
     * Gets the `i`th type argument of this call expression.
     */
```
```rust
pub fn getTypeArgument(self: MiniCallExpression, i: int) -> TypeNode;
```
## MiniCallExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: MiniCallExpression) -> *Node;
```
## MiniCallExpression::hasCallee

```rust
/**
     * Determine whether this CallExpression has a callee.
     */
```
```rust
pub fn hasCallee(self: MiniCallExpression) -> bool;
```
## MiniCallExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: MiniCallExpression) -> Node;
```
## MiniCallExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: MiniCallExpression) -> *Node;
```
## MiniCallExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: MiniCallExpression) -> int;
```
## MiniCallExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: MiniCallExpression) -> TopLevelDO;
```
## MiniCallExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: MiniCallExpression, i: int) -> Decorator;
```
## MiniCallExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: MiniCallExpression) -> int;
```
## MiniCallExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: MiniCallExpression) -> int;
```
## MiniCallExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: MiniCallExpression) -> *Modifier;
```
## MiniCallExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: MiniCallExpression) -> int;
```
## MiniCallExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: MiniCallExpression) -> int;
```
## MiniCallExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: MiniCallExpression) -> *Comment;
```
## MiniCallExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: MiniCallExpression) -> *Comment;
```
## MiniCallExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: MiniCallExpression) -> FunctionLikeDeclaration;
```
## MiniCallExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: MiniCallExpression, level: int) -> Node;
```
## MiniCallExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: MiniCallExpression) -> File;
```
## MiniCallExpression::getIndex

```rust
pub fn getIndex(self: MiniCallExpression) -> int;
```
## MiniCallExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: MiniCallExpression) -> int;
```
## MiniCallExpression::getCallee

```rust
/**
     * Gets the callee of this MiniCallExpression.
     *
     * In addition to the results of CallExpression.getCallee(),
     * this method add some callees according to Alipay mini program framework.
     */
```
```rust
pub fn getCallee(self: MiniCallExpression) -> FunctionLikeDeclaration;
```
## MiniCallExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: MiniCallExpression) -> *Node;
```
## MiniCallExpression::isOptionalChaining

```rust
/**
     * Determines whether this call expression is optional chaining, which means it has a `?.` token.
     */
```
```rust
pub fn isOptionalChaining(self: MiniCallExpression) -> bool;
```
## MiniCallExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *MiniCallExpression;
```
## MiniCallExpression::is\<T\>

```rust
pub fn is<T>(self: MiniCallExpression) -> bool;
```
## MiniCallExpression::to\<T\>

```rust
pub fn to<T>(self: MiniCallExpression) -> <any>;
```
## MiniCallExpression::key\_neq

```rust
pub fn key_neq(self: MiniCallExpression, object: <any>) -> bool;
```
## MiniCallExpression::key\_eq

```rust
pub fn key_eq(self: MiniCallExpression, object: <any>) -> bool;
```
## MiniCallExpression::to\_set

```rust
pub fn to_set(self: MiniCallExpression) -> *MiniCallExpression;
```
