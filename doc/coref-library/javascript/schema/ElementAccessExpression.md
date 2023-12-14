# ElementAccessExpression

Primary key: `id: int`

```rust
schema ElementAccessExpression {
  @primary id: int,
}
```
## ElementAccessExpression::getCallee

```rust
/**
     * Gets the callee (GetAccessorDeclaration or SetAccessorDeclaration) of this access expression.
     */
```
```rust
pub fn getCallee(self: ElementAccessExpression) -> FunctionLikeDeclaration;
```
## ElementAccessExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: ElementAccessExpression) -> *Node;
```
## ElementAccessExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ElementAccessExpression) -> int;
```
## ElementAccessExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: ElementAccessExpression) -> string;
```
## ElementAccessExpression::getExpression

```rust
/**
     * Gets the expression on which the property is accessed.
     */
```
```rust
pub fn getExpression(self: ElementAccessExpression) -> LeftHandSideExpression;
```
## ElementAccessExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: ElementAccessExpression) -> int;
```
## ElementAccessExpression::getPropertyExpression

```rust
/**
     * Gets the property expression of this AccessExpression.
     */
```
```rust
pub fn getPropertyExpression(self: ElementAccessExpression) -> Expression;
```
## ElementAccessExpression::getIndex

```rust
pub fn getIndex(self: ElementAccessExpression) -> int;
```
## ElementAccessExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: ElementAccessExpression, level: int) -> Node;
```
## ElementAccessExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: ElementAccessExpression) -> File;
```
## ElementAccessExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ElementAccessExpression) -> int;
```
## ElementAccessExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: ElementAccessExpression) -> FunctionLikeDeclaration;
```
## ElementAccessExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: ElementAccessExpression) -> *Comment;
```
## ElementAccessExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: ElementAccessExpression) -> *Comment;
```
## ElementAccessExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ElementAccessExpression) -> *FunctionLikeDeclaration;
```
## ElementAccessExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: ElementAccessExpression, level: int) -> *Node;
```
## ElementAccessExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: ElementAccessExpression) -> int;
```
## ElementAccessExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ElementAccessExpression) -> int;
```
## ElementAccessExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: ElementAccessExpression) -> *Modifier;
```
## ElementAccessExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ElementAccessExpression) -> int;
```
## ElementAccessExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: ElementAccessExpression, i: int) -> Node;
```
## ElementAccessExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: ElementAccessExpression) -> TopLevelDO;
```
## ElementAccessExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: ElementAccessExpression, i: int) -> Decorator;
```
## ElementAccessExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: ElementAccessExpression) -> Node;
```
## ElementAccessExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: ElementAccessExpression) -> *Node;
```
## ElementAccessExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: ElementAccessExpression) -> Node;
```
## ElementAccessExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: ElementAccessExpression) -> *Node;
```
## ElementAccessExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: ElementAccessExpression) -> *Comment;
```
## ElementAccessExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: ElementAccessExpression) -> Symbol;
```
## ElementAccessExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: ElementAccessExpression) -> *Decorator;
```
## ElementAccessExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: ElementAccessExpression) -> Location;
```
## ElementAccessExpression::isOptionalChaining

```rust
/**
     * Determines whether this access expression is optional chaining.
     */
```
```rust
pub fn isOptionalChaining(self: ElementAccessExpression) -> bool;
```
## ElementAccessExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *ElementAccessExpression;
```
## ElementAccessExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: ElementAccessExpression) -> string;
```
## ElementAccessExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: ElementAccessExpression, i: int) -> Modifier;
```
## ElementAccessExpression::getPropertyName

```rust
pub fn getPropertyName(self: ElementAccessExpression) -> string;
```
## ElementAccessExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: ElementAccessExpression) -> int;
```
## ElementAccessExpression::getArgumentExpression

```rust
pub fn getArgumentExpression(self: ElementAccessExpression) -> Expression;
```
## ElementAccessExpression::is\<T\>

```rust
pub fn is<T>(self: ElementAccessExpression) -> bool;
```
## ElementAccessExpression::to\<T\>

```rust
pub fn to<T>(self: ElementAccessExpression) -> <any>;
```
## ElementAccessExpression::key\_neq

```rust
pub fn key_neq(self: ElementAccessExpression, object: <any>) -> bool;
```
## ElementAccessExpression::key\_eq

```rust
pub fn key_eq(self: ElementAccessExpression, object: <any>) -> bool;
```
## ElementAccessExpression::to\_set

```rust
pub fn to_set(self: ElementAccessExpression) -> *ElementAccessExpression;
```
