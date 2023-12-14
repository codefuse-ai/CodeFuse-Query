# AccessExpression

Primary key: `id: int`

```rust
schema AccessExpression {
  @primary id: int,
}
```
## AccessExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: AccessExpression) -> string;
```
## AccessExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: AccessExpression, i: int) -> Modifier;
```
## AccessExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: AccessExpression) -> Location;
```
## AccessExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: AccessExpression) -> *Decorator;
```
## AccessExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: AccessExpression) -> Symbol;
```
## AccessExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: AccessExpression) -> *Comment;
```
## AccessExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: AccessExpression) -> *Node;
```
## AccessExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: AccessExpression) -> *Node;
```
## AccessExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: AccessExpression) -> Node;
```
## AccessExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: AccessExpression) -> Node;
```
## AccessExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: AccessExpression) -> int;
```
## AccessExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: AccessExpression) -> TopLevelDO;
```
## AccessExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: AccessExpression, i: int) -> Decorator;
```
## AccessExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: AccessExpression, i: int) -> Node;
```
## AccessExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: AccessExpression) -> int;
```
## AccessExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: AccessExpression) -> int;
```
## AccessExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: AccessExpression) -> int;
```
## AccessExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: AccessExpression) -> *Modifier;
```
## AccessExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: AccessExpression, level: int) -> *Node;
```
## AccessExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: AccessExpression) -> *FunctionLikeDeclaration;
```
## AccessExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: AccessExpression) -> *Comment;
```
## AccessExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: AccessExpression) -> *Comment;
```
## AccessExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: AccessExpression) -> FunctionLikeDeclaration;
```
## AccessExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: AccessExpression) -> int;
```
## AccessExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: AccessExpression) -> File;
```
## AccessExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: AccessExpression, level: int) -> Node;
```
## AccessExpression::getIndex

```rust
pub fn getIndex(self: AccessExpression) -> int;
```
## AccessExpression::getPropertyExpression

```rust
/**
     * Gets the property expression of this AccessExpression.
     */
```
```rust
pub fn getPropertyExpression(self: AccessExpression) -> Expression;
```
## AccessExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: AccessExpression) -> int;
```
## AccessExpression::getExpression

```rust
/**
     * Gets the expression on which the property is accessed.
     */
```
```rust
pub fn getExpression(self: AccessExpression) -> LeftHandSideExpression;
```
## AccessExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: AccessExpression) -> string;
```
## AccessExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: AccessExpression) -> int;
```
## AccessExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: AccessExpression) -> *Node;
```
## AccessExpression::getCallee

```rust
/**
     * Gets the callee (GetAccessorDeclaration or SetAccessorDeclaration) of this access expression.
     */
```
```rust
pub fn getCallee(self: AccessExpression) -> FunctionLikeDeclaration;
```
## AccessExpression::getPropertyName

```rust
// For PropertyAccessExpression
```
```rust
pub fn getPropertyName(self: AccessExpression) -> string;
```
## AccessExpression::isOptionalChaining

```rust
/**
     * Determines whether this access expression is optional chaining.
     */
```
```rust
pub fn isOptionalChaining(self: AccessExpression) -> bool;
```
## AccessExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *AccessExpression;
```
## AccessExpression::is\<T\>

```rust
pub fn is<T>(self: AccessExpression) -> bool;
```
## AccessExpression::to\<T\>

```rust
pub fn to<T>(self: AccessExpression) -> <any>;
```
## AccessExpression::key\_neq

```rust
pub fn key_neq(self: AccessExpression, object: <any>) -> bool;
```
## AccessExpression::key\_eq

```rust
pub fn key_eq(self: AccessExpression, object: <any>) -> bool;
```
## AccessExpression::to\_set

```rust
pub fn to_set(self: AccessExpression) -> *AccessExpression;
```
