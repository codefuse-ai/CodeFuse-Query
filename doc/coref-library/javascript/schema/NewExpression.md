# NewExpression

Primary key: `id: int`

```rust
schema NewExpression {
  @primary id: int,
}
```
## NewExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: NewExpression) -> *Node;
```
## NewExpression::getIndex

```rust
pub fn getIndex(self: NewExpression) -> int;
```
## NewExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: NewExpression) -> int;
```
## NewExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: NewExpression, level: int) -> Node;
```
## NewExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: NewExpression) -> File;
```
## NewExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: NewExpression) -> int;
```
## NewExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: NewExpression) -> FunctionLikeDeclaration;
```
## NewExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: NewExpression) -> *Comment;
```
## NewExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: NewExpression) -> *Comment;
```
## NewExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: NewExpression) -> int;
```
## NewExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: NewExpression, i: int) -> Decorator;
```
## NewExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: NewExpression) -> TopLevelDO;
```
## NewExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: NewExpression) -> int;
```
## NewExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: NewExpression) -> Node;
```
## NewExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: NewExpression) -> *Node;
```
## NewExpression::getTypeArgument

```rust
/**
     * Gets the `i`th type argument of this new expression.
     */
```
```rust
pub fn getTypeArgument(self: NewExpression, i: int) -> TypeNode;
```
## NewExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: NewExpression) -> *Node;
```
## NewExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: NewExpression) -> *Comment;
```
## NewExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: NewExpression) -> Symbol;
```
## NewExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: NewExpression) -> *Decorator;
```
## NewExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: NewExpression, i: int) -> Modifier;
```
## NewExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: NewExpression) -> string;
```
## NewExpression::getArgumentCount

```rust
/**
     * Gets the count of the arguments.
     */
```
```rust
pub fn getArgumentCount(self: NewExpression) -> int;
```
## NewExpression::getATypeArgument

```rust
/**
     * Gets a type argument of this new expression.
     */
```
```rust
pub fn getATypeArgument(self: NewExpression) -> *TypeNode;
```
## NewExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: NewExpression) -> *FunctionLikeDeclaration;
```
## NewExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: NewExpression, level: int) -> *Node;
```
## NewExpression::getTypeArgumentCount

```rust
/**
     * Gets the count of the type arguments.
     */
```
```rust
pub fn getTypeArgumentCount(self: NewExpression) -> int;
```
## NewExpression::getCallee

```rust
/**
     * Gets the callee of this new expression.
     */
```
```rust
pub fn getCallee(self: NewExpression) -> FunctionLikeDeclaration;
```
## NewExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: NewExpression, i: int) -> Node;
```
## NewExpression::getAnArgument

```rust
/**
     * Gets an argument of this new expression.
     */
```
```rust
pub fn getAnArgument(self: NewExpression) -> *Expression;
```
## NewExpression::getArgument

```rust
/**
     * Gets the `i`th argument of this new expression.
     * index starts from 0
     */
```
```rust
pub fn getArgument(self: NewExpression, i: int) -> Expression;
```
## NewExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: NewExpression) -> Location;
```
## NewExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: NewExpression) -> int;
```
## NewExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: NewExpression) -> string;
```
## NewExpression::getExpression

```rust
pub fn getExpression(self: NewExpression) -> LeftHandSideExpression;
```
## NewExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *NewExpression;
```
## NewExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: NewExpression) -> int;
```
## NewExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: NewExpression) -> *Modifier;
```
## NewExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: NewExpression) -> int;
```
## NewExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: NewExpression) -> Node;
```
## NewExpression::is\<T\>

```rust
pub fn is<T>(self: NewExpression) -> bool;
```
## NewExpression::to\<T\>

```rust
pub fn to<T>(self: NewExpression) -> <any>;
```
## NewExpression::key\_neq

```rust
pub fn key_neq(self: NewExpression, object: <any>) -> bool;
```
## NewExpression::key\_eq

```rust
pub fn key_eq(self: NewExpression, object: <any>) -> bool;
```
## NewExpression::to\_set

```rust
pub fn to_set(self: NewExpression) -> *NewExpression;
```
