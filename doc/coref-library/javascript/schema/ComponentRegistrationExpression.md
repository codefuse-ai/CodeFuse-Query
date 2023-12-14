# ComponentRegistrationExpression

Primary key: `id: int`

```rust
schema ComponentRegistrationExpression {
  @primary id: int,
}
```
## ComponentRegistrationExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: ComponentRegistrationExpression) -> Node;
```
## ComponentRegistrationExpression::getExpression

```rust
pub fn getExpression(self: ComponentRegistrationExpression) -> LeftHandSideExpression;
```
## ComponentRegistrationExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: ComponentRegistrationExpression) -> string;
```
## ComponentRegistrationExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ComponentRegistrationExpression) -> int;
```
## ComponentRegistrationExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: ComponentRegistrationExpression) -> Location;
```
## ComponentRegistrationExpression::getQuestionDotToken

```rust
/**
     * Gets the `?.` token of this call expression.
     */
```
```rust
pub fn getQuestionDotToken(self: ComponentRegistrationExpression) -> QuestionDotToken;
```
## ComponentRegistrationExpression::getATypeArgument

```rust
/**
     * Gets a type argument of this call expression.
     */
```
```rust
pub fn getATypeArgument(self: ComponentRegistrationExpression) -> *TypeNode;
```
## ComponentRegistrationExpression::getTypeArgumentCount

```rust
/**
     * Gets the count of the type arguments.
     */
```
```rust
pub fn getTypeArgumentCount(self: ComponentRegistrationExpression) -> int;
```
## ComponentRegistrationExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: ComponentRegistrationExpression, level: int) -> *Node;
```
## ComponentRegistrationExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ComponentRegistrationExpression) -> *FunctionLikeDeclaration;
```
## ComponentRegistrationExpression::getArgument

```rust
/**
     * Gets the `i`th argument of this call expression.
     * index from 0
     */
```
```rust
pub fn getArgument(self: ComponentRegistrationExpression, i: int) -> Expression;
```
## ComponentRegistrationExpression::getAnArgument

```rust
/**
     * Gets an argument of this call expression.
     */
```
```rust
pub fn getAnArgument(self: ComponentRegistrationExpression) -> *Expression;
```
## ComponentRegistrationExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: ComponentRegistrationExpression, i: int) -> Node;
```
## ComponentRegistrationExpression::getCallee

```rust
/**
     * Gets the callee of this call expression.
     */
```
```rust
pub fn getCallee(self: ComponentRegistrationExpression) -> FunctionLikeDeclaration;
```
## ComponentRegistrationExpression::getArgumentCount

```rust
/**
     * Gets the count of the arguments.
     */
```
```rust
pub fn getArgumentCount(self: ComponentRegistrationExpression) -> int;
```
## ComponentRegistrationExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: ComponentRegistrationExpression) -> string;
```
## ComponentRegistrationExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: ComponentRegistrationExpression, i: int) -> Modifier;
```
## ComponentRegistrationExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: ComponentRegistrationExpression) -> *Decorator;
```
## ComponentRegistrationExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: ComponentRegistrationExpression) -> Symbol;
```
## ComponentRegistrationExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: ComponentRegistrationExpression) -> *Node;
```
## ComponentRegistrationExpression::getTypeArgument

```rust
/**
     * Gets the `i`th type argument of this call expression.
     */
```
```rust
pub fn getTypeArgument(self: ComponentRegistrationExpression, i: int) -> TypeNode;
```
## ComponentRegistrationExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: ComponentRegistrationExpression) -> *Comment;
```
## ComponentRegistrationExpression::hasCallee

```rust
/**
     * Determine whether this CallExpression has a callee.
     */
```
```rust
pub fn hasCallee(self: ComponentRegistrationExpression) -> bool;
```
## ComponentRegistrationExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: ComponentRegistrationExpression) -> Node;
```
## ComponentRegistrationExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: ComponentRegistrationExpression) -> *Node;
```
## ComponentRegistrationExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: ComponentRegistrationExpression) -> int;
```
## ComponentRegistrationExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: ComponentRegistrationExpression) -> TopLevelDO;
```
## ComponentRegistrationExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: ComponentRegistrationExpression, i: int) -> Decorator;
```
## ComponentRegistrationExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: ComponentRegistrationExpression) -> *Modifier;
```
## ComponentRegistrationExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ComponentRegistrationExpression) -> int;
```
## ComponentRegistrationExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: ComponentRegistrationExpression) -> int;
```
## ComponentRegistrationExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ComponentRegistrationExpression) -> int;
```
## ComponentRegistrationExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: ComponentRegistrationExpression) -> FunctionLikeDeclaration;
```
## ComponentRegistrationExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: ComponentRegistrationExpression) -> *Comment;
```
## ComponentRegistrationExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: ComponentRegistrationExpression) -> *Comment;
```
## ComponentRegistrationExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ComponentRegistrationExpression) -> int;
```
## ComponentRegistrationExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: ComponentRegistrationExpression, level: int) -> Node;
```
## ComponentRegistrationExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: ComponentRegistrationExpression) -> File;
```
## ComponentRegistrationExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: ComponentRegistrationExpression) -> int;
```
## ComponentRegistrationExpression::getIndex

```rust
pub fn getIndex(self: ComponentRegistrationExpression) -> int;
```
## ComponentRegistrationExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: ComponentRegistrationExpression) -> *Node;
```
## ComponentRegistrationExpression::isOptionalChaining

```rust
/**
     * Determines whether this call expression is optional chaining, which means it has a `?.` token.
     */
```
```rust
pub fn isOptionalChaining(self: ComponentRegistrationExpression) -> bool;
```
## ComponentRegistrationExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *ComponentRegistrationExpression;
```
## ComponentRegistrationExpression::is\<T\>

```rust
pub fn is<T>(self: ComponentRegistrationExpression) -> bool;
```
## ComponentRegistrationExpression::to\<T\>

```rust
pub fn to<T>(self: ComponentRegistrationExpression) -> <any>;
```
## ComponentRegistrationExpression::key\_neq

```rust
pub fn key_neq(self: ComponentRegistrationExpression, object: <any>) -> bool;
```
## ComponentRegistrationExpression::key\_eq

```rust
pub fn key_eq(self: ComponentRegistrationExpression, object: <any>) -> bool;
```
## ComponentRegistrationExpression::to\_set

```rust
pub fn to_set(self: ComponentRegistrationExpression) -> *ComponentRegistrationExpression;
```
