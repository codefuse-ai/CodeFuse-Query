# AccessorElement

Primary key: `id: int`

```rust
schema AccessorElement {
  @primary id: int,
}
```
## AccessorElement::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: AccessorElement) -> Location;
```
## AccessorElement::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: AccessorElement) -> Symbol;
```
## AccessorElement::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: AccessorElement) -> *Decorator;
```
## AccessorElement::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: AccessorElement) -> string;
```
## AccessorElement::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: AccessorElement, i: int) -> Modifier;
```
## AccessorElement::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: AccessorElement) -> *Comment;
```
## AccessorElement::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: AccessorElement) -> *Node;
```
## AccessorElement::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: AccessorElement) -> *Node;
```
## AccessorElement::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: AccessorElement) -> Node;
```
## AccessorElement::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: AccessorElement) -> int;
```
## AccessorElement::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: AccessorElement) -> TopLevelDO;
```
## AccessorElement::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: AccessorElement, i: int) -> Decorator;
```
## AccessorElement::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: AccessorElement) -> int;
```
## AccessorElement::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: AccessorElement) -> *Modifier;
```
## AccessorElement::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: AccessorElement) -> int;
```
## AccessorElement::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: AccessorElement, i: int) -> Node;
```
## AccessorElement::getStartLineNumber

```rust
pub fn getStartLineNumber(self: AccessorElement) -> int;
```
## AccessorElement::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: AccessorElement) -> *FunctionLikeDeclaration;
```
## AccessorElement::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: AccessorElement, level: int) -> *Node;
```
## AccessorElement::getEndLineNumber

```rust
pub fn getEndLineNumber(self: AccessorElement) -> int;
```
## AccessorElement::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: AccessorElement) -> string;
```
## AccessorElement::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: AccessorElement, level: int) -> Node;
```
## AccessorElement::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: AccessorElement) -> File;
```
## AccessorElement::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: AccessorElement) -> *Comment;
```
## AccessorElement::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: AccessorElement) -> *Comment;
```
## AccessorElement::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: AccessorElement) -> Node;
```
## AccessorElement::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: AccessorElement) -> FunctionLikeDeclaration;
```
## AccessorElement::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: AccessorElement) -> int;
```
## AccessorElement::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: AccessorElement) -> int;
```
## AccessorElement::getIndex

```rust
pub fn getIndex(self: AccessorElement) -> int;
```
## AccessorElement::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: AccessorElement) -> *Node;
```
## AccessorElement::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *AccessorElement;
```
## AccessorElement::is\<T\>

```rust
pub fn is<T>(self: AccessorElement) -> bool;
```
## AccessorElement::to\<T\>

```rust
pub fn to<T>(self: AccessorElement) -> <any>;
```
## AccessorElement::key\_neq

```rust
pub fn key_neq(self: AccessorElement, object: <any>) -> bool;
```
## AccessorElement::key\_eq

```rust
pub fn key_eq(self: AccessorElement, object: <any>) -> bool;
```
## AccessorElement::to\_set

```rust
pub fn to_set(self: AccessorElement) -> *AccessorElement;
```
