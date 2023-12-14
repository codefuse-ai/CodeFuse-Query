# SuperExpression

Primary key: `id: int`

```rust
schema SuperExpression {
  @primary id: int,
}
```
## SuperExpression::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: SuperExpression) -> *Node;
```
## SuperExpression::getEndLineNumber

```rust
pub fn getEndLineNumber(self: SuperExpression) -> int;
```
## SuperExpression::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: SuperExpression) -> string;
```
## SuperExpression::getExpression

```rust
pub fn getExpression(self: SuperExpression) -> Expression;
```
## SuperExpression::getIndex

```rust
pub fn getIndex(self: SuperExpression) -> int;
```
## SuperExpression::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: SuperExpression) -> int;
```
## SuperExpression::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: SuperExpression, level: int) -> Node;
```
## SuperExpression::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: SuperExpression) -> File;
```
## SuperExpression::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: SuperExpression) -> int;
```
## SuperExpression::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: SuperExpression) -> FunctionLikeDeclaration;
```
## SuperExpression::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: SuperExpression) -> *Comment;
```
## SuperExpression::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: SuperExpression) -> *Comment;
```
## SuperExpression::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: SuperExpression) -> *FunctionLikeDeclaration;
```
## SuperExpression::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: SuperExpression, level: int) -> *Node;
```
## SuperExpression::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: SuperExpression) -> int;
```
## SuperExpression::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: SuperExpression) -> *Modifier;
```
## SuperExpression::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: SuperExpression) -> int;
```
## SuperExpression::getStartLineNumber

```rust
pub fn getStartLineNumber(self: SuperExpression) -> int;
```
## SuperExpression::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: SuperExpression, i: int) -> Node;
```
## SuperExpression::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: SuperExpression, i: int) -> Decorator;
```
## SuperExpression::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: SuperExpression) -> TopLevelDO;
```
## SuperExpression::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: SuperExpression) -> int;
```
## SuperExpression::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: SuperExpression) -> Node;
```
## SuperExpression::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: SuperExpression) -> Node;
```
## SuperExpression::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: SuperExpression) -> *Node;
```
## SuperExpression::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: SuperExpression) -> *Node;
```
## SuperExpression::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: SuperExpression) -> *Comment;
```
## SuperExpression::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *SuperExpression;
```
## SuperExpression::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: SuperExpression) -> Location;
```
## SuperExpression::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: SuperExpression) -> Symbol;
```
## SuperExpression::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: SuperExpression) -> *Decorator;
```
## SuperExpression::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: SuperExpression, i: int) -> Modifier;
```
## SuperExpression::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: SuperExpression) -> string;
```
## SuperExpression::is\<T\>

```rust
pub fn is<T>(self: SuperExpression) -> bool;
```
## SuperExpression::to\<T\>

```rust
pub fn to<T>(self: SuperExpression) -> <any>;
```
## SuperExpression::key\_neq

```rust
pub fn key_neq(self: SuperExpression, object: <any>) -> bool;
```
## SuperExpression::key\_eq

```rust
pub fn key_eq(self: SuperExpression, object: <any>) -> bool;
```
## SuperExpression::to\_set

```rust
pub fn to_set(self: SuperExpression) -> *SuperExpression;
```
