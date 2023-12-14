# NodeWithTypeArguments

Primary key: `id: int`

```rust
schema NodeWithTypeArguments {
  @primary id: int,
}
```
## NodeWithTypeArguments::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: NodeWithTypeArguments) -> Location;
```
## NodeWithTypeArguments::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: NodeWithTypeArguments) -> Symbol;
```
## NodeWithTypeArguments::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: NodeWithTypeArguments) -> *Decorator;
```
## NodeWithTypeArguments::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: NodeWithTypeArguments) -> string;
```
## NodeWithTypeArguments::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: NodeWithTypeArguments, i: int) -> Modifier;
```
## NodeWithTypeArguments::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: NodeWithTypeArguments) -> *Comment;
```
## NodeWithTypeArguments::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: NodeWithTypeArguments) -> *Node;
```
## NodeWithTypeArguments::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: NodeWithTypeArguments) -> *Node;
```
## NodeWithTypeArguments::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: NodeWithTypeArguments) -> Node;
```
## NodeWithTypeArguments::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: NodeWithTypeArguments) -> int;
```
## NodeWithTypeArguments::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: NodeWithTypeArguments) -> TopLevelDO;
```
## NodeWithTypeArguments::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: NodeWithTypeArguments, i: int) -> Decorator;
```
## NodeWithTypeArguments::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: NodeWithTypeArguments) -> int;
```
## NodeWithTypeArguments::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: NodeWithTypeArguments) -> *Modifier;
```
## NodeWithTypeArguments::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: NodeWithTypeArguments) -> int;
```
## NodeWithTypeArguments::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: NodeWithTypeArguments, i: int) -> Node;
```
## NodeWithTypeArguments::getStartLineNumber

```rust
pub fn getStartLineNumber(self: NodeWithTypeArguments) -> int;
```
## NodeWithTypeArguments::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: NodeWithTypeArguments) -> *FunctionLikeDeclaration;
```
## NodeWithTypeArguments::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: NodeWithTypeArguments, level: int) -> *Node;
```
## NodeWithTypeArguments::getEndLineNumber

```rust
pub fn getEndLineNumber(self: NodeWithTypeArguments) -> int;
```
## NodeWithTypeArguments::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: NodeWithTypeArguments) -> string;
```
## NodeWithTypeArguments::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: NodeWithTypeArguments, level: int) -> Node;
```
## NodeWithTypeArguments::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: NodeWithTypeArguments) -> File;
```
## NodeWithTypeArguments::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: NodeWithTypeArguments) -> *Comment;
```
## NodeWithTypeArguments::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: NodeWithTypeArguments) -> *Comment;
```
## NodeWithTypeArguments::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: NodeWithTypeArguments) -> Node;
```
## NodeWithTypeArguments::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: NodeWithTypeArguments) -> FunctionLikeDeclaration;
```
## NodeWithTypeArguments::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: NodeWithTypeArguments) -> int;
```
## NodeWithTypeArguments::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: NodeWithTypeArguments) -> int;
```
## NodeWithTypeArguments::getIndex

```rust
pub fn getIndex(self: NodeWithTypeArguments) -> int;
```
## NodeWithTypeArguments::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: NodeWithTypeArguments) -> *Node;
```
## NodeWithTypeArguments::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *NodeWithTypeArguments;
```
## NodeWithTypeArguments::is\<T\>

```rust
pub fn is<T>(self: NodeWithTypeArguments) -> bool;
```
## NodeWithTypeArguments::to\<T\>

```rust
pub fn to<T>(self: NodeWithTypeArguments) -> <any>;
```
## NodeWithTypeArguments::key\_neq

```rust
pub fn key_neq(self: NodeWithTypeArguments, object: <any>) -> bool;
```
## NodeWithTypeArguments::key\_eq

```rust
pub fn key_eq(self: NodeWithTypeArguments, object: <any>) -> bool;
```
## NodeWithTypeArguments::to\_set

```rust
pub fn to_set(self: NodeWithTypeArguments) -> *NodeWithTypeArguments;
```
