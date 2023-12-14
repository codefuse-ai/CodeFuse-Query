# ArrayBindingElement

Primary key: `id: int`

```rust
schema ArrayBindingElement {
  @primary id: int,
}
```
## ArrayBindingElement::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: ArrayBindingElement) -> *Node;
```
## ArrayBindingElement::getIndex

```rust
pub fn getIndex(self: ArrayBindingElement) -> int;
```
## ArrayBindingElement::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: ArrayBindingElement) -> int;
```
## ArrayBindingElement::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ArrayBindingElement) -> int;
```
## ArrayBindingElement::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: ArrayBindingElement) -> Node;
```
## ArrayBindingElement::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: ArrayBindingElement) -> FunctionLikeDeclaration;
```
## ArrayBindingElement::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: ArrayBindingElement) -> File;
```
## ArrayBindingElement::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: ArrayBindingElement, level: int) -> Node;
```
## ArrayBindingElement::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: ArrayBindingElement) -> string;
```
## ArrayBindingElement::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ArrayBindingElement) -> int;
```
## ArrayBindingElement::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ArrayBindingElement) -> *FunctionLikeDeclaration;
```
## ArrayBindingElement::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: ArrayBindingElement, level: int) -> *Node;
```
## ArrayBindingElement::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: ArrayBindingElement) -> int;
```
## ArrayBindingElement::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: ArrayBindingElement) -> *Modifier;
```
## ArrayBindingElement::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ArrayBindingElement) -> int;
```
## ArrayBindingElement::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ArrayBindingElement) -> int;
```
## ArrayBindingElement::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: ArrayBindingElement, i: int) -> Node;
```
## ArrayBindingElement::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: ArrayBindingElement, i: int) -> Decorator;
```
## ArrayBindingElement::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: ArrayBindingElement) -> TopLevelDO;
```
## ArrayBindingElement::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: ArrayBindingElement) -> int;
```
## ArrayBindingElement::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: ArrayBindingElement) -> *Comment;
```
## ArrayBindingElement::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: ArrayBindingElement) -> *Comment;
```
## ArrayBindingElement::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: ArrayBindingElement) -> Node;
```
## ArrayBindingElement::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: ArrayBindingElement) -> *Node;
```
## ArrayBindingElement::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: ArrayBindingElement) -> *Node;
```
## ArrayBindingElement::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: ArrayBindingElement) -> *Comment;
```
## ArrayBindingElement::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: ArrayBindingElement, i: int) -> Modifier;
```
## ArrayBindingElement::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: ArrayBindingElement) -> string;
```
## ArrayBindingElement::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: ArrayBindingElement) -> *Decorator;
```
## ArrayBindingElement::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: ArrayBindingElement) -> Symbol;
```
## ArrayBindingElement::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: ArrayBindingElement) -> Location;
```
## ArrayBindingElement::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *ArrayBindingElement;
```
## ArrayBindingElement::is\<T\>

```rust
pub fn is<T>(self: ArrayBindingElement) -> bool;
```
## ArrayBindingElement::to\<T\>

```rust
pub fn to<T>(self: ArrayBindingElement) -> <any>;
```
## ArrayBindingElement::key\_neq

```rust
pub fn key_neq(self: ArrayBindingElement, object: <any>) -> bool;
```
## ArrayBindingElement::key\_eq

```rust
pub fn key_eq(self: ArrayBindingElement, object: <any>) -> bool;
```
## ArrayBindingElement::to\_set

```rust
pub fn to_set(self: ArrayBindingElement) -> *ArrayBindingElement;
```
