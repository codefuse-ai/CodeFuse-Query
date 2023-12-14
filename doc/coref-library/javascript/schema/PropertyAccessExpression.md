# PropertyAccessExpression

Primary key: `id: int`

```rust
schema PropertyAccessExpression {
  @primary id: int,
}
```
## PropertyAccessExpression::getCallee

```rust
/**
     * Gets the callee (GetAccessorDeclaration or SetAccessorDeclaration) of this access expression.
     */
```
```rust
pub fn getCallee(self: PropertyAccessExpression) -> FunctionLikeDeclaration;
```
## PropertyAccessExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: PropertyAccessExpression) -> *Node;
```
## PropertyAccessExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: PropertyAccessExpression) -> int;
```
## PropertyAccessExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: PropertyAccessExpression) -> string;
```
## PropertyAccessExpression::getExpression

```rust
/**
     * Gets the expression on which the property is accessed.
     */
```
```rust
pub fn getExpression(self: PropertyAccessExpression) -> LeftHandSideExpression;
```
## PropertyAccessExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: PropertyAccessExpression) -> int;
```
## PropertyAccessExpression::getPropertyExpression

```rust
/**
     * Gets the property expression of this AccessExpression.
     */
```
```rust
pub fn getPropertyExpression(self: PropertyAccessExpression) -> Expression;
```
## PropertyAccessExpression::getIndex

```rust
pub fn getIndex(self: PropertyAccessExpression) -> int;
```
## PropertyAccessExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: PropertyAccessExpression, level: int) -> Node;
```
## PropertyAccessExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: PropertyAccessExpression) -> File;
```
## PropertyAccessExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: PropertyAccessExpression) -> int;
```
## PropertyAccessExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: PropertyAccessExpression) -> FunctionLikeDeclaration;
```
## PropertyAccessExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: PropertyAccessExpression) -> *Comment;
```
## PropertyAccessExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: PropertyAccessExpression) -> *Comment;
```
## PropertyAccessExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: PropertyAccessExpression) -> *FunctionLikeDeclaration;
```
## PropertyAccessExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: PropertyAccessExpression, level: int) -> *Node;
```
## PropertyAccessExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: PropertyAccessExpression) -> int;
```
## PropertyAccessExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: PropertyAccessExpression) -> int;
```
## PropertyAccessExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: PropertyAccessExpression) -> *Modifier;
```
## PropertyAccessExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: PropertyAccessExpression) -> int;
```
## PropertyAccessExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: PropertyAccessExpression, i: int) -> Node;
```
## PropertyAccessExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: PropertyAccessExpression) -> TopLevelDO;
```
## PropertyAccessExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: PropertyAccessExpression, i: int) -> Decorator;
```
## PropertyAccessExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: PropertyAccessExpression) -> Node;
```
## PropertyAccessExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: PropertyAccessExpression) -> *Node;
```
## PropertyAccessExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: PropertyAccessExpression) -> Node;
```
## PropertyAccessExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: PropertyAccessExpression) -> *Comment;
```
## PropertyAccessExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: PropertyAccessExpression) -> *Node;
```
## PropertyAccessExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: PropertyAccessExpression) -> Symbol;
```
## PropertyAccessExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: PropertyAccessExpression) -> *Decorator;
```
## PropertyAccessExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: PropertyAccessExpression) -> Location;
```
## PropertyAccessExpression::isOptionalChaining

```rust
/**
     * Determines whether this access expression is optional chaining.
     */
```
```rust
pub fn isOptionalChaining(self: PropertyAccessExpression) -> bool;
```
## PropertyAccessExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *PropertyAccessExpression;
```
## PropertyAccessExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: PropertyAccessExpression) -> string;
```
## PropertyAccessExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: PropertyAccessExpression, i: int) -> Modifier;
```
## PropertyAccessExpression::getPropertyName

```rust
pub fn getPropertyName(self: PropertyAccessExpression) -> string;
```
## PropertyAccessExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: PropertyAccessExpression) -> int;
```
## PropertyAccessExpression::getProperty

```rust
pub fn getProperty(self: PropertyAccessExpression) -> MemberName;
```
## PropertyAccessExpression::is\<T\>

```rust
pub fn is<T>(self: PropertyAccessExpression) -> bool;
```
## PropertyAccessExpression::to\<T\>

```rust
pub fn to<T>(self: PropertyAccessExpression) -> <any>;
```
## PropertyAccessExpression::key\_neq

```rust
pub fn key_neq(self: PropertyAccessExpression, object: <any>) -> bool;
```
## PropertyAccessExpression::key\_eq

```rust
pub fn key_eq(self: PropertyAccessExpression, object: <any>) -> bool;
```
## PropertyAccessExpression::to\_set

```rust
pub fn to_set(self: PropertyAccessExpression) -> *PropertyAccessExpression;
```
