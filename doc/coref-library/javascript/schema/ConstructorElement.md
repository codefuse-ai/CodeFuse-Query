# ConstructorElement

Primary key: `id: int`

```rust
schema ConstructorElement {
  @primary id: int,
}
```
## ConstructorElement::getLocation

```rust
/**
     * Gets the location of this node.
     */
```
```rust
pub fn getLocation(self: ConstructorElement) -> Location;
```
## ConstructorElement::getSymbol

```rust
/**
     * Gets the symbol associated with this node.
     */
```
```rust
pub fn getSymbol(self: ConstructorElement) -> Symbol;
```
## ConstructorElement::getADecorator

```rust
/**
     * Gets a decorator.
     */
```
```rust
pub fn getADecorator(self: ConstructorElement) -> *Decorator;
```
## ConstructorElement::getText

```rust
/**
     * Gets the text of this node.
     */
```
```rust
pub fn getText(self: ConstructorElement) -> string;
```
## ConstructorElement::getModifier

```rust
/**
     * Gets the `i`th modifier.
     */
```
```rust
pub fn getModifier(self: ConstructorElement, i: int) -> Modifier;
```
## ConstructorElement::getAComment

```rust
/**
     * Gets the comments related to it
     */
```
```rust
pub fn getAComment(self: ConstructorElement) -> *Comment;
```
## ConstructorElement::getAnAncestor

```rust
/**
     * Gets an ancestor of this node. 
     */
```
```rust
pub fn getAnAncestor(self: ConstructorElement) -> *Node;
```
## ConstructorElement::getAChild

```rust
/**
     * Gets a child node of this node.
     */
```
```rust
pub fn getAChild(self: ConstructorElement) -> *Node;
```
## ConstructorElement::getParent

```rust
/**
     * Gets the parent node of this node.
     */
```
```rust
pub fn getParent(self: ConstructorElement) -> Node;
```
## ConstructorElement::getChildCount

```rust
/**
     * Gets the number of child nodes.
     */
```
```rust
pub fn getChildCount(self: ConstructorElement) -> int;
```
## ConstructorElement::getRoot

```rust
/**
     * Gets the root top-level of this node. 
     */
```
```rust
pub fn getRoot(self: ConstructorElement) -> TopLevelDO;
```
## ConstructorElement::getDecorator

```rust
/**
     * Gets the `i`th decorator.
     */
```
```rust
pub fn getDecorator(self: ConstructorElement, i: int) -> Decorator;
```
## ConstructorElement::getKind

```rust
/**
     * Get the syntax kind of this node
     */
```
```rust
pub fn getKind(self: ConstructorElement) -> int;
```
## ConstructorElement::getAModifier

```rust
/**
     * Gets a modifier.
     */
```
```rust
pub fn getAModifier(self: ConstructorElement) -> *Modifier;
```
## ConstructorElement::getStartColumnNumber

```rust
pub fn getStartColumnNumber(self: ConstructorElement) -> int;
```
## ConstructorElement::getChild

```rust
/**
     * Gets the `i`th child of this node.
     */
```
```rust
pub fn getChild(self: ConstructorElement, i: int) -> Node;
```
## ConstructorElement::getStartLineNumber

```rust
pub fn getStartLineNumber(self: ConstructorElement) -> int;
```
## ConstructorElement::getAnAncestorEnclosingFunction

```rust
/**
     * Gets an ancestor enclosing function of it
     */
```
```rust
pub fn getAnAncestorEnclosingFunction(self: ConstructorElement) -> *FunctionLikeDeclaration;
```
## ConstructorElement::getADescendantByLevel

```rust
/**
     * Gets a descendant of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getADescendantByLevel(self: ConstructorElement, level: int) -> *Node;
```
## ConstructorElement::getEndLineNumber

```rust
pub fn getEndLineNumber(self: ConstructorElement) -> int;
```
## ConstructorElement::getRelativePath

```rust
/**
     * Gets the relative path of this node.
     */
```
```rust
pub fn getRelativePath(self: ConstructorElement) -> string;
```
## ConstructorElement::getAnAncestorByLevel

```rust
/**
     * Gets an ancestor of this node by the level of the hierarchy.
     *
     * @param level: the number of levels to go up in the hierarchy.
     */
```
```rust
pub fn getAnAncestorByLevel(self: ConstructorElement, level: int) -> Node;
```
## ConstructorElement::getFile

```rust
/**
     * Gets the file of this node.
     */
```
```rust
pub fn getFile(self: ConstructorElement) -> File;
```
## ConstructorElement::getALeadingComment

```rust
/**
     * Gets the leading comments of it
     */
```
```rust
pub fn getALeadingComment(self: ConstructorElement) -> *Comment;
```
## ConstructorElement::getATrailingComment

```rust
/**
     * Gets the trailing comments of it
     */
```
```rust
pub fn getATrailingComment(self: ConstructorElement) -> *Comment;
```
## ConstructorElement::getLastChild

```rust
/**
     * Gets the last child of this node parent.
     */
```
```rust
pub fn getLastChild(self: ConstructorElement) -> Node;
```
## ConstructorElement::getEnclosingFunction

```rust
/**
     * Gets the enclosing function of it
     */
```
```rust
pub fn getEnclosingFunction(self: ConstructorElement) -> FunctionLikeDeclaration;
```
## ConstructorElement::getEndColumnNumber

```rust
pub fn getEndColumnNumber(self: ConstructorElement) -> int;
```
## ConstructorElement::getParentOid

```rust
/**
     * Gets the parent oid of this node.
     */
```
```rust
pub fn getParentOid(self: ConstructorElement) -> int;
```
## ConstructorElement::getIndex

```rust
pub fn getIndex(self: ConstructorElement) -> int;
```
## ConstructorElement::getADescendant

```rust
/**
     * Gets a descendant of this node. 
     */
```
```rust
pub fn getADescendant(self: ConstructorElement) -> *Node;
```
## ConstructorElement::\_\_all\_\_

```rust
pub fn __all__(db: JavascriptDB) -> *ConstructorElement;
```
## ConstructorElement::is\<T\>

```rust
pub fn is<T>(self: ConstructorElement) -> bool;
```
## ConstructorElement::to\<T\>

```rust
pub fn to<T>(self: ConstructorElement) -> <any>;
```
## ConstructorElement::key\_neq

```rust
pub fn key_neq(self: ConstructorElement, object: <any>) -> bool;
```
## ConstructorElement::key\_eq

```rust
pub fn key_eq(self: ConstructorElement, object: <any>) -> bool;
```
## ConstructorElement::to\_set

```rust
pub fn to_set(self: ConstructorElement) -> *ConstructorElement;
```
