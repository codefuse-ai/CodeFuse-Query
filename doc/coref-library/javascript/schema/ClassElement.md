# ClassElement

Primary key: `id: int`

```rust
schema ClassElement {
  @primary id: int,
}
```
## ClassElement::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: ClassElement) -> *Node;
```
## ClassElement::getIndex

```rust
pub fn getIndex(self: ClassElement) -> int;
```
## ClassElement::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: ClassElement) -> int;
```
## ClassElement::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ClassElement) -> int;
```
## ClassElement::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: ClassElement) -> Node;
```
## ClassElement::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: ClassElement) -> FunctionLikeDeclaration;
```
## ClassElement::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: ClassElement) -> File;
```
## ClassElement::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: ClassElement, level: int) -> Node;
```
## ClassElement::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: ClassElement) -> string;
```
## ClassElement::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ClassElement) -> int;
```
## ClassElement::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ClassElement) -> *FunctionLikeDeclaration;
```
## ClassElement::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: ClassElement, level: int) -> *Node;
```
## ClassElement::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: ClassElement) -> int;
```
## ClassElement::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: ClassElement) -> *Modifier;
```
## ClassElement::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ClassElement) -> int;
```
## ClassElement::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ClassElement) -> int;
```
## ClassElement::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: ClassElement, i: int) -> Node;
```
## ClassElement::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: ClassElement, i: int) -> Decorator;
```
## ClassElement::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: ClassElement) -> TopLevelDO;
```
## ClassElement::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: ClassElement) -> int;
```
## ClassElement::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: ClassElement) -> *Comment;
```
## ClassElement::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: ClassElement) -> *Comment;
```
## ClassElement::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: ClassElement) -> Node;
```
## ClassElement::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: ClassElement) -> *Node;
```
## ClassElement::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: ClassElement) -> *Node;
```
## ClassElement::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: ClassElement) -> *Comment;
```
## ClassElement::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: ClassElement, i: int) -> Modifier;
```
## ClassElement::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: ClassElement) -> string;
```
## ClassElement::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: ClassElement) -> *Decorator;
```
## ClassElement::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: ClassElement) -> Symbol;
```
## ClassElement::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: ClassElement) -> Location;
```
## ClassElement::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *ClassElement;
```
## ClassElement::is\<T\>

```rust
pub fn is<T>(self: ClassElement) -> bool;
```
## ClassElement::to\<T\>

```rust
pub fn to<T>(self: ClassElement) -> <any>;
```
## ClassElement::key\_neq

```rust
pub fn key_neq(self: ClassElement, object: <any>) -> bool;
```
## ClassElement::key\_eq

```rust
pub fn key_eq(self: ClassElement, object: <any>) -> bool;
```
## ClassElement::to\_set

```rust
pub fn to_set(self: ClassElement) -> *ClassElement;
```
