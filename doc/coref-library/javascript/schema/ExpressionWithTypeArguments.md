# ExpressionWithTypeArguments

Primary key: `id: int`

```rust
schema ExpressionWithTypeArguments {
  @primary id: int,
}
```
## ExpressionWithTypeArguments::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: ExpressionWithTypeArguments) -> *Node;
```
## ExpressionWithTypeArguments::getIndex

```rust
pub fn getIndex(self: ExpressionWithTypeArguments) -> int;
```
## ExpressionWithTypeArguments::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: ExpressionWithTypeArguments) -> int;
```
## ExpressionWithTypeArguments::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ExpressionWithTypeArguments) -> int;
```
## ExpressionWithTypeArguments::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: ExpressionWithTypeArguments) -> FunctionLikeDeclaration;
```
## ExpressionWithTypeArguments::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: ExpressionWithTypeArguments) -> Node;
```
## ExpressionWithTypeArguments::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: ExpressionWithTypeArguments) -> *Comment;
```
## ExpressionWithTypeArguments::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: ExpressionWithTypeArguments) -> *Comment;
```
## ExpressionWithTypeArguments::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: ExpressionWithTypeArguments) -> File;
```
## ExpressionWithTypeArguments::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: ExpressionWithTypeArguments, level: int) -> Node;
```
## ExpressionWithTypeArguments::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ExpressionWithTypeArguments) -> int;
```
## ExpressionWithTypeArguments::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: ExpressionWithTypeArguments) -> string;
```
## ExpressionWithTypeArguments::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ExpressionWithTypeArguments) -> *FunctionLikeDeclaration;
```
## ExpressionWithTypeArguments::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: ExpressionWithTypeArguments, level: int) -> *Node;
```
## ExpressionWithTypeArguments::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: ExpressionWithTypeArguments) -> int;
```
## ExpressionWithTypeArguments::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: ExpressionWithTypeArguments) -> *Modifier;
```
## ExpressionWithTypeArguments::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ExpressionWithTypeArguments) -> int;
```
## ExpressionWithTypeArguments::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ExpressionWithTypeArguments) -> int;
```
## ExpressionWithTypeArguments::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: ExpressionWithTypeArguments, i: int) -> Node;
```
## ExpressionWithTypeArguments::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: ExpressionWithTypeArguments, i: int) -> Decorator;
```
## ExpressionWithTypeArguments::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: ExpressionWithTypeArguments) -> TopLevelDO;
```
## ExpressionWithTypeArguments::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: ExpressionWithTypeArguments) -> int;
```
## ExpressionWithTypeArguments::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: ExpressionWithTypeArguments) -> Node;
```
## ExpressionWithTypeArguments::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: ExpressionWithTypeArguments) -> *Node;
```
## ExpressionWithTypeArguments::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: ExpressionWithTypeArguments) -> *Node;
```
## ExpressionWithTypeArguments::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: ExpressionWithTypeArguments) -> *Comment;
```
## ExpressionWithTypeArguments::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: ExpressionWithTypeArguments) -> Symbol;
```
## ExpressionWithTypeArguments::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: ExpressionWithTypeArguments) -> *Decorator;
```
## ExpressionWithTypeArguments::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: ExpressionWithTypeArguments, i: int) -> Modifier;
```
## ExpressionWithTypeArguments::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: ExpressionWithTypeArguments) -> string;
```
## ExpressionWithTypeArguments::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *ExpressionWithTypeArguments;
```
## ExpressionWithTypeArguments::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: ExpressionWithTypeArguments) -> Location;
```
## ExpressionWithTypeArguments::is\<T\>

```rust
pub fn is<T>(self: ExpressionWithTypeArguments) -> bool;
```
## ExpressionWithTypeArguments::to\<T\>

```rust
pub fn to<T>(self: ExpressionWithTypeArguments) -> <any>;
```
## ExpressionWithTypeArguments::key\_neq

```rust
pub fn key_neq(self: ExpressionWithTypeArguments, object: <any>) -> bool;
```
## ExpressionWithTypeArguments::key\_eq

```rust
pub fn key_eq(self: ExpressionWithTypeArguments, object: <any>) -> bool;
```
## ExpressionWithTypeArguments::to\_set

```rust
pub fn to_set(self: ExpressionWithTypeArguments) -> *ExpressionWithTypeArguments;
```
