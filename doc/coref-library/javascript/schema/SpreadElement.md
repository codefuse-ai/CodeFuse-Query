# SpreadElement

Primary key: `id: int`

```rust
schema SpreadElement {
  @primary id: int,
}
```
## SpreadElement::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: SpreadElement) -> Location;
```
## SpreadElement::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: SpreadElement) -> Symbol;
```
## SpreadElement::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: SpreadElement) -> *Decorator;
```
## SpreadElement::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: SpreadElement) -> string;
```
## SpreadElement::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: SpreadElement, i: int) -> Modifier;
```
## SpreadElement::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: SpreadElement) -> *Comment;
```
## SpreadElement::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: SpreadElement) -> *Node;
```
## SpreadElement::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: SpreadElement) -> *Node;
```
## SpreadElement::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: SpreadElement) -> Node;
```
## SpreadElement::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: SpreadElement) -> int;
```
## SpreadElement::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: SpreadElement) -> TopLevelDO;
```
## SpreadElement::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: SpreadElement, i: int) -> Decorator;
```
## SpreadElement::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: SpreadElement) -> int;
```
## SpreadElement::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: SpreadElement) -> *Modifier;
```
## SpreadElement::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: SpreadElement) -> int;
```
## SpreadElement::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: SpreadElement, i: int) -> Node;
```
## SpreadElement::getStartLineNumber

```rust
pub fn getStartLineNumber(self: SpreadElement) -> int;
```
## SpreadElement::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: SpreadElement, level: int) -> *Node;
```
## SpreadElement::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: SpreadElement) -> *FunctionLikeDeclaration;
```
## SpreadElement::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: SpreadElement) -> *Comment;
```
## SpreadElement::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: SpreadElement) -> *Comment;
```
## SpreadElement::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: SpreadElement) -> Node;
```
## SpreadElement::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: SpreadElement) -> int;
```
## SpreadElement::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: SpreadElement) -> FunctionLikeDeclaration;
```
## SpreadElement::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: SpreadElement) -> File;
```
## SpreadElement::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: SpreadElement, level: int) -> Node;
```
## SpreadElement::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: SpreadElement) -> int;
```
## SpreadElement::getIndex

```rust
pub fn getIndex(self: SpreadElement) -> int;
```
## SpreadElement::getExpression

```rust
pub fn getExpression(self: SpreadElement) -> Expression;
```
## SpreadElement::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: SpreadElement) -> string;
```
## SpreadElement::getEndLineNumber

```rust
pub fn getEndLineNumber(self: SpreadElement) -> int;
```
## SpreadElement::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: SpreadElement) -> *Node;
```
## SpreadElement::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *SpreadElement;
```
## SpreadElement::is\<T\>

```rust
pub fn is<T>(self: SpreadElement) -> bool;
```
## SpreadElement::to\<T\>

```rust
pub fn to<T>(self: SpreadElement) -> <any>;
```
## SpreadElement::key\_neq

```rust
pub fn key_neq(self: SpreadElement, object: <any>) -> bool;
```
## SpreadElement::key\_eq

```rust
pub fn key_eq(self: SpreadElement, object: <any>) -> bool;
```
## SpreadElement::to\_set

```rust
pub fn to_set(self: SpreadElement) -> *SpreadElement;
```
