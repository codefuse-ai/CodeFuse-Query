# TypeElement

Primary key: `id: int`

```rust
schema TypeElement {
  @primary id: int,
}
```
## TypeElement::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: TypeElement) -> *Node;
```
## TypeElement::getIndex

```rust
pub fn getIndex(self: TypeElement) -> int;
```
## TypeElement::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: TypeElement) -> int;
```
## TypeElement::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: TypeElement) -> int;
```
## TypeElement::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: TypeElement) -> Node;
```
## TypeElement::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: TypeElement) -> FunctionLikeDeclaration;
```
## TypeElement::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: TypeElement) -> File;
```
## TypeElement::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: TypeElement, level: int) -> Node;
```
## TypeElement::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: TypeElement) -> string;
```
## TypeElement::getEndLineNumber

```rust
pub fn getEndLineNumber(self: TypeElement) -> int;
```
## TypeElement::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: TypeElement) -> *FunctionLikeDeclaration;
```
## TypeElement::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: TypeElement, level: int) -> *Node;
```
## TypeElement::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: TypeElement) -> int;
```
## TypeElement::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: TypeElement) -> *Modifier;
```
## TypeElement::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: TypeElement) -> int;
```
## TypeElement::getStartLineNumber

```rust
pub fn getStartLineNumber(self: TypeElement) -> int;
```
## TypeElement::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: TypeElement, i: int) -> Node;
```
## TypeElement::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: TypeElement, i: int) -> Decorator;
```
## TypeElement::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: TypeElement) -> TopLevelDO;
```
## TypeElement::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: TypeElement) -> int;
```
## TypeElement::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: TypeElement) -> *Comment;
```
## TypeElement::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: TypeElement) -> *Comment;
```
## TypeElement::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: TypeElement) -> Node;
```
## TypeElement::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: TypeElement) -> *Node;
```
## TypeElement::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: TypeElement) -> *Node;
```
## TypeElement::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: TypeElement) -> *Comment;
```
## TypeElement::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: TypeElement, i: int) -> Modifier;
```
## TypeElement::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: TypeElement) -> string;
```
## TypeElement::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: TypeElement) -> *Decorator;
```
## TypeElement::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: TypeElement) -> Symbol;
```
## TypeElement::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: TypeElement) -> Location;
```
## TypeElement::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *TypeElement;
```
## TypeElement::is\<T\>

```rust
pub fn is<T>(self: TypeElement) -> bool;
```
## TypeElement::to\<T\>

```rust
pub fn to<T>(self: TypeElement) -> <any>;
```
## TypeElement::key\_neq

```rust
pub fn key_neq(self: TypeElement, object: <any>) -> bool;
```
## TypeElement::key\_eq

```rust
pub fn key_eq(self: TypeElement, object: <any>) -> bool;
```
## TypeElement::to\_set

```rust
pub fn to_set(self: TypeElement) -> *TypeElement;
```
