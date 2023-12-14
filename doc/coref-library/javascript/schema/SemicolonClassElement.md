# SemicolonClassElement

Primary key: `id: int`

```rust
schema SemicolonClassElement {
  @primary id: int,
}
```
## SemicolonClassElement::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: SemicolonClassElement) -> Location;
```
## SemicolonClassElement::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: SemicolonClassElement) -> Symbol;
```
## SemicolonClassElement::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: SemicolonClassElement) -> *Decorator;
```
## SemicolonClassElement::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: SemicolonClassElement) -> string;
```
## SemicolonClassElement::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: SemicolonClassElement, i: int) -> Modifier;
```
## SemicolonClassElement::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: SemicolonClassElement) -> *Comment;
```
## SemicolonClassElement::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: SemicolonClassElement) -> *Node;
```
## SemicolonClassElement::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: SemicolonClassElement) -> *Node;
```
## SemicolonClassElement::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: SemicolonClassElement) -> Node;
```
## SemicolonClassElement::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: SemicolonClassElement) -> int;
```
## SemicolonClassElement::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: SemicolonClassElement) -> TopLevelDO;
```
## SemicolonClassElement::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: SemicolonClassElement, i: int) -> Decorator;
```
## SemicolonClassElement::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: SemicolonClassElement) -> int;
```
## SemicolonClassElement::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: SemicolonClassElement) -> *Modifier;
```
## SemicolonClassElement::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: SemicolonClassElement) -> int;
```
## SemicolonClassElement::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: SemicolonClassElement, i: int) -> Node;
```
## SemicolonClassElement::getStartLineNumber

```rust
pub fn getStartLineNumber(self: SemicolonClassElement) -> int;
```
## SemicolonClassElement::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: SemicolonClassElement) -> *FunctionLikeDeclaration;
```
## SemicolonClassElement::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: SemicolonClassElement, level: int) -> *Node;
```
## SemicolonClassElement::getEndLineNumber

```rust
pub fn getEndLineNumber(self: SemicolonClassElement) -> int;
```
## SemicolonClassElement::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: SemicolonClassElement) -> string;
```
## SemicolonClassElement::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: SemicolonClassElement, level: int) -> Node;
```
## SemicolonClassElement::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: SemicolonClassElement) -> File;
```
## SemicolonClassElement::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: SemicolonClassElement) -> *Comment;
```
## SemicolonClassElement::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: SemicolonClassElement) -> *Comment;
```
## SemicolonClassElement::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: SemicolonClassElement) -> Node;
```
## SemicolonClassElement::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: SemicolonClassElement) -> FunctionLikeDeclaration;
```
## SemicolonClassElement::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: SemicolonClassElement) -> int;
```
## SemicolonClassElement::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: SemicolonClassElement) -> int;
```
## SemicolonClassElement::getIndex

```rust
pub fn getIndex(self: SemicolonClassElement) -> int;
```
## SemicolonClassElement::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: SemicolonClassElement) -> *Node;
```
## SemicolonClassElement::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *SemicolonClassElement;
```
## SemicolonClassElement::is\<T\>

```rust
pub fn is<T>(self: SemicolonClassElement) -> bool;
```
## SemicolonClassElement::to\<T\>

```rust
pub fn to<T>(self: SemicolonClassElement) -> <any>;
```
## SemicolonClassElement::key\_neq

```rust
pub fn key_neq(self: SemicolonClassElement, object: <any>) -> bool;
```
## SemicolonClassElement::key\_eq

```rust
pub fn key_eq(self: SemicolonClassElement, object: <any>) -> bool;
```
## SemicolonClassElement::to\_set

```rust
pub fn to_set(self: SemicolonClassElement) -> *SemicolonClassElement;
```
