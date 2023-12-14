# SetAccessorElement

Primary key: `id: int`

```rust
schema SetAccessorElement {
  @primary id: int,
}
```
## SetAccessorElement::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: SetAccessorElement) -> *Node;
```
## SetAccessorElement::getIndex

```rust
pub fn getIndex(self: SetAccessorElement) -> int;
```
## SetAccessorElement::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: SetAccessorElement) -> int;
```
## SetAccessorElement::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: SetAccessorElement) -> int;
```
## SetAccessorElement::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: SetAccessorElement) -> FunctionLikeDeclaration;
```
## SetAccessorElement::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: SetAccessorElement) -> Node;
```
## SetAccessorElement::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: SetAccessorElement) -> *Comment;
```
## SetAccessorElement::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: SetAccessorElement) -> *Comment;
```
## SetAccessorElement::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: SetAccessorElement) -> File;
```
## SetAccessorElement::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: SetAccessorElement, level: int) -> Node;
```
## SetAccessorElement::getEndLineNumber

```rust
pub fn getEndLineNumber(self: SetAccessorElement) -> int;
```
## SetAccessorElement::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: SetAccessorElement) -> string;
```
## SetAccessorElement::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: SetAccessorElement) -> *FunctionLikeDeclaration;
```
## SetAccessorElement::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: SetAccessorElement, level: int) -> *Node;
```
## SetAccessorElement::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: SetAccessorElement) -> int;
```
## SetAccessorElement::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: SetAccessorElement) -> *Modifier;
```
## SetAccessorElement::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: SetAccessorElement) -> int;
```
## SetAccessorElement::getStartLineNumber

```rust
pub fn getStartLineNumber(self: SetAccessorElement) -> int;
```
## SetAccessorElement::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: SetAccessorElement, i: int) -> Node;
```
## SetAccessorElement::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: SetAccessorElement, i: int) -> Decorator;
```
## SetAccessorElement::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: SetAccessorElement) -> TopLevelDO;
```
## SetAccessorElement::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: SetAccessorElement) -> int;
```
## SetAccessorElement::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: SetAccessorElement) -> Node;
```
## SetAccessorElement::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: SetAccessorElement) -> *Node;
```
## SetAccessorElement::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: SetAccessorElement) -> *Node;
```
## SetAccessorElement::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: SetAccessorElement) -> *Comment;
```
## SetAccessorElement::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: SetAccessorElement) -> Symbol;
```
## SetAccessorElement::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: SetAccessorElement) -> *Decorator;
```
## SetAccessorElement::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: SetAccessorElement, i: int) -> Modifier;
```
## SetAccessorElement::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: SetAccessorElement) -> string;
```
## SetAccessorElement::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *SetAccessorElement;
```
## SetAccessorElement::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: SetAccessorElement) -> Location;
```
## SetAccessorElement::is\<T\>

```rust
pub fn is<T>(self: SetAccessorElement) -> bool;
```
## SetAccessorElement::to\<T\>

```rust
pub fn to<T>(self: SetAccessorElement) -> <any>;
```
## SetAccessorElement::key\_neq

```rust
pub fn key_neq(self: SetAccessorElement, object: <any>) -> bool;
```
## SetAccessorElement::key\_eq

```rust
pub fn key_eq(self: SetAccessorElement, object: <any>) -> bool;
```
## SetAccessorElement::to\_set

```rust
pub fn to_set(self: SetAccessorElement) -> *SetAccessorElement;
```
