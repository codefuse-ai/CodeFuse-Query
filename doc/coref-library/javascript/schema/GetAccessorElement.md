# GetAccessorElement

Primary key: `id: int`

```rust
schema GetAccessorElement {
  @primary id: int,
}
```
## GetAccessorElement::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: GetAccessorElement) -> *Node;
```
## GetAccessorElement::getIndex

```rust
pub fn getIndex(self: GetAccessorElement) -> int;
```
## GetAccessorElement::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: GetAccessorElement) -> int;
```
## GetAccessorElement::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: GetAccessorElement) -> int;
```
## GetAccessorElement::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: GetAccessorElement) -> FunctionLikeDeclaration;
```
## GetAccessorElement::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: GetAccessorElement) -> Node;
```
## GetAccessorElement::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: GetAccessorElement) -> *Comment;
```
## GetAccessorElement::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: GetAccessorElement) -> *Comment;
```
## GetAccessorElement::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: GetAccessorElement) -> File;
```
## GetAccessorElement::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: GetAccessorElement, level: int) -> Node;
```
## GetAccessorElement::getEndLineNumber

```rust
pub fn getEndLineNumber(self: GetAccessorElement) -> int;
```
## GetAccessorElement::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: GetAccessorElement) -> string;
```
## GetAccessorElement::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: GetAccessorElement) -> *FunctionLikeDeclaration;
```
## GetAccessorElement::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: GetAccessorElement, level: int) -> *Node;
```
## GetAccessorElement::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: GetAccessorElement) -> int;
```
## GetAccessorElement::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: GetAccessorElement) -> *Modifier;
```
## GetAccessorElement::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: GetAccessorElement) -> int;
```
## GetAccessorElement::getStartLineNumber

```rust
pub fn getStartLineNumber(self: GetAccessorElement) -> int;
```
## GetAccessorElement::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: GetAccessorElement, i: int) -> Node;
```
## GetAccessorElement::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: GetAccessorElement, i: int) -> Decorator;
```
## GetAccessorElement::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: GetAccessorElement) -> TopLevelDO;
```
## GetAccessorElement::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: GetAccessorElement) -> int;
```
## GetAccessorElement::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: GetAccessorElement) -> Node;
```
## GetAccessorElement::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: GetAccessorElement) -> *Node;
```
## GetAccessorElement::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: GetAccessorElement) -> *Node;
```
## GetAccessorElement::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: GetAccessorElement) -> *Comment;
```
## GetAccessorElement::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: GetAccessorElement) -> Symbol;
```
## GetAccessorElement::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: GetAccessorElement) -> *Decorator;
```
## GetAccessorElement::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: GetAccessorElement, i: int) -> Modifier;
```
## GetAccessorElement::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: GetAccessorElement) -> string;
```
## GetAccessorElement::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *GetAccessorElement;
```
## GetAccessorElement::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: GetAccessorElement) -> Location;
```
## GetAccessorElement::is\<T\>

```rust
pub fn is<T>(self: GetAccessorElement) -> bool;
```
## GetAccessorElement::to\<T\>

```rust
pub fn to<T>(self: GetAccessorElement) -> <any>;
```
## GetAccessorElement::key\_neq

```rust
pub fn key_neq(self: GetAccessorElement, object: <any>) -> bool;
```
## GetAccessorElement::key\_eq

```rust
pub fn key_eq(self: GetAccessorElement, object: <any>) -> bool;
```
## GetAccessorElement::to\_set

```rust
pub fn to_set(self: GetAccessorElement) -> *GetAccessorElement;
```
